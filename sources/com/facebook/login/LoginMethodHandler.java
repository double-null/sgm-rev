package com.facebook.login;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.AccessTokenSource;
import com.facebook.AuthenticationToken;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.FacebookServiceException;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.Utility;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import kotlin.collections.o0;
import org.json.JSONException;
import org.json.JSONObject;
import rd.f0;

/* JADX INFO: compiled from: LoginMethodHandler.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class LoginMethodHandler implements Parcelable {
    public static final Companion Companion = new Companion(null);
    public static final String NO_SIGNED_REQUEST_ERROR_MESSAGE = "Authorization response does not contain the signed_request";
    public static final String NO_USER_ID_ERROR_MESSAGE = "Failed to retrieve user_id from signed_request";
    public static final String USER_CANCELED_LOG_IN_ERROR_MESSAGE = "User canceled log in.";
    public LoginClient loginClient;
    private Map<String, String> methodLoggingExtras;

    /* JADX INFO: compiled from: LoginMethodHandler.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final AccessToken createAccessTokenFromNativeLogin(Bundle bundle, AccessTokenSource accessTokenSource, String applicationId) {
            String string;
            kotlin.jvm.internal.t.f(bundle, "bundle");
            kotlin.jvm.internal.t.f(applicationId, "applicationId");
            Date bundleLongAsDate = Utility.getBundleLongAsDate(bundle, NativeProtocol.EXTRA_EXPIRES_SECONDS_SINCE_EPOCH, new Date(0L));
            ArrayList<String> stringArrayList = bundle.getStringArrayList(NativeProtocol.EXTRA_PERMISSIONS);
            String string2 = bundle.getString(NativeProtocol.EXTRA_ACCESS_TOKEN);
            Date bundleLongAsDate2 = Utility.getBundleLongAsDate(bundle, NativeProtocol.EXTRA_DATA_ACCESS_EXPIRATION_TIME, new Date(0L));
            if (string2 != null) {
                if (!(string2.length() == 0) && (string = bundle.getString(NativeProtocol.EXTRA_USER_ID)) != null) {
                    if (!(string.length() == 0)) {
                        return new AccessToken(string2, applicationId, string, stringArrayList, null, null, accessTokenSource, bundleLongAsDate, new Date(), bundleLongAsDate2, bundle.getString("graph_domain"));
                    }
                }
            }
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0068  */
        /* JADX WARN: Code duplicated, block: B:22:0x009e  */
        /* JADX WARN: Code duplicated, block: B:31:0x00d3  */
        public final AccessToken createAccessTokenFromWebBundle(Collection<String> collection, Bundle bundle, AccessTokenSource accessTokenSource, String applicationId) throws FacebookException {
            Collection<String> collectionG;
            ArrayList arrayListG;
            ArrayList arrayListG2;
            kotlin.jvm.internal.t.f(bundle, "bundle");
            kotlin.jvm.internal.t.f(applicationId, "applicationId");
            Date bundleLongAsDate = Utility.getBundleLongAsDate(bundle, AccessToken.EXPIRES_IN_KEY, new Date());
            String string = bundle.getString("access_token");
            if (string == null) {
                return null;
            }
            Date bundleLongAsDate2 = Utility.getBundleLongAsDate(bundle, AccessToken.DATA_ACCESS_EXPIRATION_TIME, new Date(0L));
            String string2 = bundle.getString("granted_scopes");
            if (string2 == null) {
                collectionG = collection;
            } else {
                if (string2.length() > 0) {
                    String[] strArr = (String[]) f0.K0(string2, new String[]{","}, false, 0, 6, null).toArray(new String[0]);
                    collectionG = kotlin.collections.t.g(Arrays.copyOf(strArr, strArr.length));
                } else {
                    collectionG = collection;
                }
            }
            String string3 = bundle.getString("denied_scopes");
            if (string3 == null) {
                arrayListG = null;
            } else {
                if (string3.length() > 0) {
                    String[] strArr2 = (String[]) f0.K0(string3, new String[]{","}, false, 0, 6, null).toArray(new String[0]);
                    arrayListG = kotlin.collections.t.g(Arrays.copyOf(strArr2, strArr2.length));
                } else {
                    arrayListG = null;
                }
            }
            String string4 = bundle.getString("expired_scopes");
            if (string4 == null) {
                arrayListG2 = null;
            } else {
                if (string4.length() > 0) {
                    String[] strArr3 = (String[]) f0.K0(string4, new String[]{","}, false, 0, 6, null).toArray(new String[0]);
                    arrayListG2 = kotlin.collections.t.g(Arrays.copyOf(strArr3, strArr3.length));
                } else {
                    arrayListG2 = null;
                }
            }
            if (Utility.isNullOrEmpty(string)) {
                return null;
            }
            return new AccessToken(string, applicationId, getUserIDFromSignedRequest(bundle.getString("signed_request")), collectionG, arrayListG, arrayListG2, accessTokenSource, bundleLongAsDate, new Date(), bundleLongAsDate2, bundle.getString("graph_domain"));
        }

        public final AuthenticationToken createAuthenticationTokenFromNativeLogin(Bundle bundle, String str) throws FacebookException {
            kotlin.jvm.internal.t.f(bundle, "bundle");
            String string = bundle.getString(NativeProtocol.EXTRA_AUTHENTICATION_TOKEN);
            if (string != null) {
                if (!(string.length() == 0) && str != null) {
                    if (!(str.length() == 0)) {
                        try {
                            return new AuthenticationToken(string, str);
                        } catch (Exception e10) {
                            throw new FacebookException(e10.getMessage());
                        }
                    }
                }
            }
            return null;
        }

        public final AuthenticationToken createAuthenticationTokenFromWebBundle(Bundle bundle, String str) throws FacebookException {
            kotlin.jvm.internal.t.f(bundle, "bundle");
            String string = bundle.getString("id_token");
            if (string != null) {
                if (!(string.length() == 0) && str != null) {
                    if (!(str.length() == 0)) {
                        try {
                            return new AuthenticationToken(string, str);
                        } catch (Exception e10) {
                            throw new FacebookException(e10.getMessage(), e10);
                        }
                    }
                }
            }
            return null;
        }

        public final String getUserIDFromSignedRequest(String str) throws FacebookException {
            if (str != null) {
                if (!(str.length() == 0)) {
                    try {
                        String[] strArr = (String[]) f0.K0(str, new String[]{"."}, false, 0, 6, null).toArray(new String[0]);
                        if (strArr.length == 2) {
                            byte[] data = Base64.decode(strArr[1], 0);
                            kotlin.jvm.internal.t.e(data, "data");
                            String string = new JSONObject(new String(data, rd.d.f24999b)).getString("user_id");
                            kotlin.jvm.internal.t.e(string, "jsonObject.getString(\"user_id\")");
                            return string;
                        }
                    } catch (UnsupportedEncodingException | JSONException unused) {
                    }
                    throw new FacebookException(LoginMethodHandler.NO_USER_ID_ERROR_MESSAGE);
                }
            }
            throw new FacebookException(LoginMethodHandler.NO_SIGNED_REQUEST_ERROR_MESSAGE);
        }
    }

    public LoginMethodHandler(LoginClient loginClient) {
        kotlin.jvm.internal.t.f(loginClient, "loginClient");
        setLoginClient(loginClient);
    }

    public static final AccessToken createAccessTokenFromNativeLogin(Bundle bundle, AccessTokenSource accessTokenSource, String str) {
        return Companion.createAccessTokenFromNativeLogin(bundle, accessTokenSource, str);
    }

    public static final AccessToken createAccessTokenFromWebBundle(Collection<String> collection, Bundle bundle, AccessTokenSource accessTokenSource, String str) throws FacebookException {
        return Companion.createAccessTokenFromWebBundle(collection, bundle, accessTokenSource, str);
    }

    public static final AuthenticationToken createAuthenticationTokenFromNativeLogin(Bundle bundle, String str) throws FacebookException {
        return Companion.createAuthenticationTokenFromNativeLogin(bundle, str);
    }

    public static final AuthenticationToken createAuthenticationTokenFromWebBundle(Bundle bundle, String str) throws FacebookException {
        return Companion.createAuthenticationTokenFromWebBundle(bundle, str);
    }

    public static final String getUserIDFromSignedRequest(String str) throws FacebookException {
        return Companion.getUserIDFromSignedRequest(str);
    }

    protected void addLoggingExtra(String str, Object obj) {
        if (this.methodLoggingExtras == null) {
            this.methodLoggingExtras = new HashMap();
        }
        Map<String, String> map = this.methodLoggingExtras;
        if (map != null) {
            map.put(str, obj != null ? obj.toString() : null);
        }
    }

    protected String getClientState(String authId) {
        kotlin.jvm.internal.t.f(authId, "authId");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(LoginLogger.EVENT_PARAM_AUTH_LOGGER_ID, authId);
            jSONObject.put(LoginLogger.EVENT_PARAM_METHOD, getNameForLogging());
            putChallengeParam(jSONObject);
        } catch (JSONException e10) {
            Log.w("LoginMethodHandler", "Error creating client state json: " + e10.getMessage());
        }
        String string = jSONObject.toString();
        kotlin.jvm.internal.t.e(string, "param.toString()");
        return string;
    }

    public final LoginClient getLoginClient() {
        LoginClient loginClient = this.loginClient;
        if (loginClient != null) {
            return loginClient;
        }
        kotlin.jvm.internal.t.u("loginClient");
        return null;
    }

    public final Map<String, String> getMethodLoggingExtras() {
        return this.methodLoggingExtras;
    }

    public abstract String getNameForLogging();

    protected String getRedirectUrl() {
        return "fb" + FacebookSdk.getApplicationId() + "://authorize/";
    }

    protected void logWebLoginCompleted(String str) {
        String applicationId;
        LoginClient.Request pendingRequest = getLoginClient().getPendingRequest();
        if (pendingRequest == null || (applicationId = pendingRequest.getApplicationId()) == null) {
            applicationId = FacebookSdk.getApplicationId();
        }
        InternalAppEventsLogger internalAppEventsLogger = new InternalAppEventsLogger(getLoginClient().getActivity(), applicationId);
        Bundle bundle = new Bundle();
        bundle.putString(AnalyticsEvents.PARAMETER_WEB_LOGIN_E2E, str);
        bundle.putLong(AnalyticsEvents.PARAMETER_WEB_LOGIN_SWITCHBACK_TIME, System.currentTimeMillis());
        bundle.putString("app_id", applicationId);
        internalAppEventsLogger.logEventImplicitly(AnalyticsEvents.EVENT_WEB_LOGIN_COMPLETE, null, bundle);
    }

    public boolean needsInternetPermission() {
        return false;
    }

    public boolean onActivityResult(int i10, int i11, Intent intent) {
        return false;
    }

    protected Bundle processCodeExchange(LoginClient.Request request, Bundle values) throws FacebookException {
        kotlin.jvm.internal.t.f(request, "request");
        kotlin.jvm.internal.t.f(values, "values");
        String string = values.getString("code");
        if (Utility.isNullOrEmpty(string)) {
            throw new FacebookException("No code param found from the request");
        }
        if (string != null) {
            String redirectUrl = getRedirectUrl();
            String codeVerifier = request.getCodeVerifier();
            if (codeVerifier == null) {
                codeVerifier = "";
            }
            GraphRequest graphRequestCreateCodeExchangeRequest = PKCEUtil.createCodeExchangeRequest(string, redirectUrl, codeVerifier);
            if (graphRequestCreateCodeExchangeRequest != null) {
                GraphResponse graphResponseExecuteAndWait = graphRequestCreateCodeExchangeRequest.executeAndWait();
                FacebookRequestError error = graphResponseExecuteAndWait.getError();
                if (error != null) {
                    throw new FacebookServiceException(error, error.getErrorMessage());
                }
                try {
                    JSONObject jSONObject = graphResponseExecuteAndWait.getJSONObject();
                    String string2 = jSONObject != null ? jSONObject.getString("access_token") : null;
                    if (jSONObject == null || Utility.isNullOrEmpty(string2)) {
                        throw new FacebookException("No access token found from result");
                    }
                    values.putString("access_token", string2);
                    if (jSONObject.has("id_token")) {
                        values.putString("id_token", jSONObject.getString("id_token"));
                    }
                    return values;
                } catch (JSONException e10) {
                    throw new FacebookException("Fail to process code exchange response: " + e10.getMessage());
                }
            }
        }
        throw new FacebookException("Failed to create code exchange request");
    }

    public void putChallengeParam(JSONObject param) throws JSONException {
        kotlin.jvm.internal.t.f(param, "param");
    }

    public final void setLoginClient(LoginClient loginClient) {
        kotlin.jvm.internal.t.f(loginClient, "<set-?>");
        this.loginClient = loginClient;
    }

    public final void setMethodLoggingExtras(Map<String, String> map) {
        this.methodLoggingExtras = map;
    }

    public boolean shouldKeepTrackOfMultipleIntents() {
        return false;
    }

    public abstract int tryAuthorize(LoginClient.Request request);

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.t.f(dest, "dest");
        Utility.writeStringMapToParcel(dest, this.methodLoggingExtras);
    }

    protected LoginMethodHandler(Parcel source) {
        kotlin.jvm.internal.t.f(source, "source");
        Map<String, String> stringMapFromParcel = Utility.readStringMapFromParcel(source);
        this.methodLoggingExtras = stringMapFromParcel != null ? o0.u(stringMapFromParcel) : null;
    }

    public void cancel() {
    }
}
