package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import com.facebook.AccessToken;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.FacebookServiceException;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.internal.ServerProtocol;
import com.facebook.internal.Utility;
import kotlinx.coroutines.channels.eY.oqHAiWkeGzWld;

/* JADX INFO: compiled from: WebLoginMethodHandler.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class WebLoginMethodHandler extends LoginMethodHandler {
    public static final Companion Companion = new Companion(null);
    private static final String WEB_VIEW_AUTH_HANDLER_STORE = "com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY";
    private static final String WEB_VIEW_AUTH_HANDLER_TOKEN_KEY = "TOKEN";
    private String e2e;

    /* JADX INFO: compiled from: WebLoginMethodHandler.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        kotlin.jvm.internal.t.f(loginClient, "loginClient");
    }

    private final String loadCookieToken() {
        Context activity = getLoginClient().getActivity();
        if (activity == null) {
            activity = FacebookSdk.getApplicationContext();
        }
        return activity.getSharedPreferences(WEB_VIEW_AUTH_HANDLER_STORE, 0).getString(WEB_VIEW_AUTH_HANDLER_TOKEN_KEY, "");
    }

    private final void saveCookieToken(String str) {
        Context activity = getLoginClient().getActivity();
        if (activity == null) {
            activity = FacebookSdk.getApplicationContext();
        }
        activity.getSharedPreferences(WEB_VIEW_AUTH_HANDLER_STORE, 0).edit().putString(WEB_VIEW_AUTH_HANDLER_TOKEN_KEY, str).apply();
    }

    protected Bundle addExtraParameters(Bundle parameters, LoginClient.Request request) {
        kotlin.jvm.internal.t.f(parameters, "parameters");
        kotlin.jvm.internal.t.f(request, "request");
        String redirectURI = request.getRedirectURI();
        parameters.putString(ServerProtocol.DIALOG_PARAM_REDIRECT_URI, !(redirectURI == null || redirectURI.length() == 0) ? request.getRedirectURI() : getRedirectUrl());
        if (request.isInstagramLogin()) {
            parameters.putString("app_id", request.getApplicationId());
        } else {
            parameters.putString("client_id", request.getApplicationId());
        }
        parameters.putString("e2e", LoginClient.Companion.getE2E());
        if (request.isInstagramLogin()) {
            parameters.putString(ServerProtocol.DIALOG_PARAM_RESPONSE_TYPE, ServerProtocol.DIALOG_RESPONSE_TYPE_TOKEN_AND_SCOPES);
        } else {
            if (request.getPermissions().contains("openid")) {
                parameters.putString("nonce", request.getNonce());
            }
            parameters.putString(ServerProtocol.DIALOG_PARAM_RESPONSE_TYPE, ServerProtocol.DIALOG_RESPONSE_TYPE_ID_TOKEN_AND_SIGNED_REQUEST);
        }
        parameters.putString(ServerProtocol.DIALOG_PARAM_CODE_CHALLENGE, request.getCodeChallenge());
        CodeChallengeMethod codeChallengeMethod = request.getCodeChallengeMethod();
        parameters.putString(ServerProtocol.DIALOG_PARAM_CODE_CHALLENGE_METHOD, codeChallengeMethod != null ? codeChallengeMethod.name() : null);
        parameters.putString(ServerProtocol.DIALOG_PARAM_RETURN_SCOPES, ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
        parameters.putString(ServerProtocol.DIALOG_PARAM_AUTH_TYPE, request.getAuthType());
        parameters.putString("login_behavior", request.getLoginBehavior().name());
        parameters.putString(ServerProtocol.DIALOG_PARAM_SDK_VERSION, "android-" + FacebookSdk.getSdkVersion());
        if (getSSODevice() != null) {
            parameters.putString(ServerProtocol.DIALOG_PARAM_SSO_DEVICE, getSSODevice());
        }
        boolean z10 = FacebookSdk.hasCustomTabsPrefetching;
        String str = AppEventsConstants.EVENT_PARAM_VALUE_YES;
        parameters.putString(ServerProtocol.DIALOG_PARAM_CUSTOM_TABS_PREFETCHING, z10 ? AppEventsConstants.EVENT_PARAM_VALUE_YES : AppEventsConstants.EVENT_PARAM_VALUE_NO);
        if (request.isFamilyLogin()) {
            parameters.putString(ServerProtocol.DIALOG_PARAM_FX_APP, request.getLoginTargetApp().toString());
        }
        if (request.shouldSkipAccountDeduplication()) {
            parameters.putString(ServerProtocol.DIALOG_PARAM_SKIP_DEDUPE, ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
        }
        if (request.getForceConfirmation()) {
            parameters.putString(ServerProtocol.DIALOG_PARAM_FORCE_CONFIRMATION, ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
        }
        String androidSsoContext = request.getAndroidSsoContext();
        if (!(androidSsoContext == null || androidSsoContext.length() == 0)) {
            parameters.putString(ServerProtocol.DIALOG_PARAM_ANDROID_SSO_CONTEXT, request.getAndroidSsoContext());
        }
        if (request.getMessengerPageId() != null) {
            parameters.putString(ServerProtocol.DIALOG_PARAM_MESSENGER_PAGE_ID, request.getMessengerPageId());
            if (!request.getResetMessengerState()) {
                str = AppEventsConstants.EVENT_PARAM_VALUE_NO;
            }
            parameters.putString(ServerProtocol.DIALOG_PARAM_RESET_MESSENGER_STATE, str);
        }
        return parameters;
    }

    protected String getSSODevice() {
        return null;
    }

    public abstract AccessTokenSource getTokenSource();

    public void onComplete(LoginClient.Request request, Bundle bundle, FacebookException facebookException) {
        String strValueOf;
        LoginClient.Result resultCreateErrorResult;
        String strValueOf2;
        kotlin.jvm.internal.t.f(request, "request");
        LoginClient loginClient = getLoginClient();
        this.e2e = null;
        String redirectURI = request.getRedirectURI();
        if (!(redirectURI == null || redirectURI.length() == 0) && !kotlin.jvm.internal.t.a(request.getRedirectURI(), getRedirectUrl())) {
            if (facebookException instanceof FacebookOperationCanceledException) {
                loginClient.completeAndValidate(LoginClient.Result.Companion.createCancelResult(loginClient.getPendingRequest(), LoginMethodHandler.USER_CANCELED_LOG_IN_ERROR_MESSAGE));
                return;
            }
            if (facebookException != null) {
                this.e2e = null;
                String message = facebookException.getMessage();
                if (facebookException instanceof FacebookServiceException) {
                    FacebookRequestError requestError = ((FacebookServiceException) facebookException).getRequestError();
                    strValueOf2 = String.valueOf(requestError.getErrorCode());
                    message = requestError.toString();
                } else {
                    strValueOf2 = null;
                }
                loginClient.completeAndValidate(LoginClient.Result.Companion.createErrorResult(loginClient.getPendingRequest(), null, message, strValueOf2));
                return;
            }
            return;
        }
        if (bundle != null) {
            if (bundle.containsKey("e2e")) {
                this.e2e = bundle.getString("e2e");
            }
            try {
                LoginMethodHandler.Companion companion = LoginMethodHandler.Companion;
                AccessToken accessTokenCreateAccessTokenFromWebBundle = companion.createAccessTokenFromWebBundle(request.getPermissions(), bundle, getTokenSource(), request.getApplicationId());
                resultCreateErrorResult = LoginClient.Result.Companion.createCompositeTokenResult(loginClient.getPendingRequest(), accessTokenCreateAccessTokenFromWebBundle, companion.createAuthenticationTokenFromWebBundle(bundle, request.getNonce()));
                if (loginClient.getActivity() != null) {
                    try {
                        CookieSyncManager.createInstance(loginClient.getActivity()).sync();
                    } catch (Exception unused) {
                    }
                    if (accessTokenCreateAccessTokenFromWebBundle != null) {
                        saveCookieToken(accessTokenCreateAccessTokenFromWebBundle.getToken());
                    }
                }
            } catch (FacebookException e10) {
                resultCreateErrorResult = LoginClient.Result.Companion.createErrorResult$default(LoginClient.Result.Companion, loginClient.getPendingRequest(), null, e10.getMessage(), null, 8, null);
            }
        } else if (facebookException instanceof FacebookOperationCanceledException) {
            resultCreateErrorResult = LoginClient.Result.Companion.createCancelResult(loginClient.getPendingRequest(), LoginMethodHandler.USER_CANCELED_LOG_IN_ERROR_MESSAGE);
        } else {
            this.e2e = null;
            String message2 = facebookException != null ? facebookException.getMessage() : null;
            if (facebookException instanceof FacebookServiceException) {
                FacebookRequestError requestError2 = ((FacebookServiceException) facebookException).getRequestError();
                strValueOf = String.valueOf(requestError2.getErrorCode());
                message2 = requestError2.toString();
            } else {
                strValueOf = null;
            }
            resultCreateErrorResult = LoginClient.Result.Companion.createErrorResult(loginClient.getPendingRequest(), null, message2, strValueOf);
        }
        if (!Utility.isNullOrEmpty(this.e2e)) {
            logWebLoginCompleted(this.e2e);
        }
        loginClient.completeAndValidate(resultCreateErrorResult);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebLoginMethodHandler(Parcel source) {
        super(source);
        kotlin.jvm.internal.t.f(source, "source");
    }

    protected Bundle getParameters(LoginClient.Request request) {
        kotlin.jvm.internal.t.f(request, "request");
        Bundle bundle = new Bundle();
        if (!Utility.isNullOrEmpty(request.getPermissions())) {
            String strJoin = TextUtils.join(",", request.getPermissions());
            bundle.putString("scope", strJoin);
            addLoggingExtra("scope", strJoin);
        }
        DefaultAudience defaultAudience = request.getDefaultAudience();
        if (defaultAudience == null) {
            defaultAudience = DefaultAudience.NONE;
        }
        bundle.putString("default_audience", defaultAudience.getNativeProtocolAudience());
        bundle.putString(oqHAiWkeGzWld.swndYlZdlos, getClientState(request.getAuthId()));
        AccessToken currentAccessToken = AccessToken.Companion.getCurrentAccessToken();
        String token = currentAccessToken != null ? currentAccessToken.getToken() : null;
        String str = AppEventsConstants.EVENT_PARAM_VALUE_NO;
        if (token == null || !kotlin.jvm.internal.t.a(token, loadCookieToken())) {
            androidx.fragment.app.e activity = getLoginClient().getActivity();
            if (activity != null) {
                Utility.clearFacebookCookies(activity);
            }
            addLoggingExtra("access_token", AppEventsConstants.EVENT_PARAM_VALUE_NO);
        } else {
            bundle.putString("access_token", token);
            addLoggingExtra("access_token", AppEventsConstants.EVENT_PARAM_VALUE_YES);
        }
        bundle.putString(ServerProtocol.DIALOG_PARAM_CBT, String.valueOf(System.currentTimeMillis()));
        if (FacebookSdk.getAutoLogAppEventsEnabled()) {
            str = AppEventsConstants.EVENT_PARAM_VALUE_YES;
        }
        bundle.putString(ServerProtocol.DIALOG_PARAM_IES, str);
        return bundle;
    }
}
