package com.facebook.login;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResultLauncher;
import com.facebook.AccessToken;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookCallback;
import com.facebook.FacebookSdk;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.ServerProtocol;
import com.facebook.internal.Utility;
import com.vungle.ads.internal.persistence.mP.RHIpdOnfgiYkEj;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.collections.o0;
import org.json.JSONObject;
import wc.g0;

/* JADX INFO: compiled from: FBLoginSSOLauncher.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class FBLoginSSOLauncher {
    public static final Companion Companion = new Companion(null);
    private static final String SSO_DISMISSED_EXTRA = "sso_dismissed";
    private static final String TAG = "FBLoginSSOLauncher";
    private static String pendingSsoContext;
    private final ComponentActivity activity;
    private InternalAppEventsLogger appEventsLogger;
    private final FacebookCallback<LoginResult> callback;
    private final ActivityResultLauncher<Intent> launcher;
    private String pendingNonce;
    private Collection<String> pendingPermissions;
    private LoginClient.Request pendingRequest;
    private final boolean showWithoutFBApp;

    /* JADX INFO: renamed from: com.facebook.login.FBLoginSSOLauncher$launch$1, reason: invalid class name */
    /* JADX INFO: compiled from: FBLoginSSOLauncher.kt */
    static final class AnonymousClass1 extends kotlin.jvm.internal.u implements id.a<g0> {
        final /* synthetic */ LoginClient.Request $request;
        final /* synthetic */ String $ssoContext;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(LoginClient.Request request, String str) {
            super(0);
            this.$request = request;
            this.$ssoContext = str;
        }

        @Override // id.a
        public /* bridge */ /* synthetic */ g0 invoke() {
            invoke2();
            return g0.f27756a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            FBLoginSSOLauncher.logSsoEvent$default(FBLoginSSOLauncher.this, LoginLogger.EVENT_NAME_SSO_CONTINUE_CLICKED, this.$request.getAuthId(), new JSONObject().put("reason", this.$ssoContext), null, 8, null);
            LoginManager.Companion.getInstance().startLoginWithForceConfirmation$facebook_common_release(FBLoginSSOLauncher.this.activity, FBLoginSSOLauncher.this.pendingPermissions, this.$ssoContext, this.$request.getAuthId());
        }
    }

    /* JADX INFO: renamed from: com.facebook.login.FBLoginSSOLauncher$launch$2, reason: invalid class name */
    /* JADX INFO: compiled from: FBLoginSSOLauncher.kt */
    static final class AnonymousClass2 extends kotlin.jvm.internal.u implements id.a<g0> {
        final /* synthetic */ LoginClient.Request $request;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(LoginClient.Request request) {
            super(0);
            this.$request = request;
        }

        @Override // id.a
        public /* bridge */ /* synthetic */ g0 invoke() {
            invoke2();
            return g0.f27756a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            FBLoginSSOLauncher.logSsoEvent$default(FBLoginSSOLauncher.this, LoginLogger.EVENT_NAME_SSO_DISMISSED, this.$request.getAuthId(), null, LoginClient.Result.Code.CANCEL.getLoggingValue(), 4, null);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FBLoginSSOLauncher(ComponentActivity componentActivity) {
        this(componentActivity, null, false, 6, null);
        kotlin.jvm.internal.t.f(componentActivity, RHIpdOnfgiYkEj.CaSxhLFYKb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(FBLoginSSOLauncher this$0, androidx.activity.result.a aVar) {
        kotlin.jvm.internal.t.f(this$0, "this$0");
        this$0.handleActivityResult(aVar.b(), aVar.a());
    }

    public static /* synthetic */ void getAppEventsLogger$facebook_common_release$annotations() {
    }

    public static final String getPendingSsoContext() {
        return Companion.getPendingSsoContext();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0011  */
    private final void handleActivityResult(int i10, Intent intent) {
        boolean z10;
        LoginClient.Request request = this.pendingRequest;
        String str = this.pendingNonce;
        if (intent != null) {
            z10 = intent.getBooleanExtra(SSO_DISMISSED_EXTRA, false);
        }
        Utility.logd(TAG, "handleActivityResult: resultCode=" + i10 + ", sso_dismissed=" + z10);
        if (z10) {
            Utility.logd(TAG, "SSO popup dismissed by user (not a login cancellation)");
            logSsoEvent$default(this, LoginLogger.EVENT_NAME_SSO_DISMISSED, request != null ? request.getAuthId() : null, null, LoginClient.Result.Code.CANCEL.getLoggingValue(), 4, null);
            FacebookCallback<LoginResult> facebookCallback = this.callback;
            if (facebookCallback != null) {
                facebookCallback.onCancel();
            }
            this.pendingNonce = null;
            this.pendingRequest = null;
            return;
        }
        Intent intent2 = new Intent();
        if (i10 != -1 || intent == null) {
            Utility.logd(TAG, "Login cancelled (not SSO dismiss — OAuth dialog was shown)");
            LoginClient.Result resultCreateCancelResult = LoginClient.Result.Companion.createCancelResult(request, "Operation canceled");
            markFromSso(resultCreateCancelResult);
            intent2.putExtra(LoginFragment.RESULT_KEY, resultCreateCancelResult);
            LoginManager.Companion.getInstance().onActivityResult(0, intent2, this.callback);
        } else {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                String string = extras.getString("error");
                if (string == null) {
                    string = extras.getString("error_type");
                }
                Object obj = extras.get("error_code");
                String string2 = obj != null ? obj.toString() : null;
                String string3 = extras.getString("error_message");
                if (string3 == null) {
                    string3 = extras.getString(NativeProtocol.BRIDGE_ARG_ERROR_DESCRIPTION);
                }
                if (string == null && string2 == null && string3 == null) {
                    try {
                        LoginMethodHandler.Companion companion = LoginMethodHandler.Companion;
                        LoginClient.Result resultCreateCompositeTokenResult = LoginClient.Result.Companion.createCompositeTokenResult(request, companion.createAccessTokenFromWebBundle(request != null ? request.getPermissions() : null, extras, AccessTokenSource.FACEBOOK_APPLICATION_WEB, FacebookSdk.getApplicationId()), companion.createAuthenticationTokenFromWebBundle(extras, str));
                        markFromSso(resultCreateCompositeTokenResult);
                        intent2.putExtra(LoginFragment.RESULT_KEY, resultCreateCompositeTokenResult);
                        LoginManager.Companion.getInstance().onActivityResult(-1, intent2, this.callback);
                    } catch (Exception e10) {
                        LoginClient.Result resultCreateErrorResult$default = LoginClient.Result.Companion.createErrorResult$default(LoginClient.Result.Companion, request, null, e10.getMessage(), null, 8, null);
                        markFromSso(resultCreateErrorResult$default);
                        intent2.putExtra(LoginFragment.RESULT_KEY, resultCreateErrorResult$default);
                        LoginManager.Companion.getInstance().onActivityResult(-1, intent2, this.callback);
                    }
                } else {
                    LoginClient.Result resultCreateErrorResult = LoginClient.Result.Companion.createErrorResult(request, string, string3, string2);
                    markFromSso(resultCreateErrorResult);
                    intent2.putExtra(LoginFragment.RESULT_KEY, resultCreateErrorResult);
                    LoginManager.Companion.getInstance().onActivityResult(-1, intent2, this.callback);
                }
            } else {
                LoginClient.Result resultCreateErrorResult$default2 = LoginClient.Result.Companion.createErrorResult$default(LoginClient.Result.Companion, request, null, "Unexpected null extras from SSO activity.", null, 8, null);
                markFromSso(resultCreateErrorResult$default2);
                intent2.putExtra(LoginFragment.RESULT_KEY, resultCreateErrorResult$default2);
                LoginManager.Companion.getInstance().onActivityResult(-1, intent2, this.callback);
            }
        }
        this.pendingNonce = null;
        this.pendingRequest = null;
    }

    private final boolean isFb4aInstalled() {
        try {
            this.activity.getPackageManager().getPackageInfo("com.facebook.katana", 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean launch$default(FBLoginSSOLauncher fBLoginSSOLauncher, Collection collection, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            collection = kotlin.collections.t.k();
        }
        return fBLoginSSOLauncher.launch(collection);
    }

    private final void logSsoEvent(String str, String str2, JSONObject jSONObject, String str3) {
        String string;
        String string2;
        Bundle bundle = new Bundle();
        bundle.putLong(LoginLogger.EVENT_PARAM_TIMESTAMP, System.currentTimeMillis());
        String str4 = "";
        bundle.putString(LoginLogger.EVENT_PARAM_AUTH_LOGGER_ID, str2 == null ? "" : str2);
        bundle.putString(LoginLogger.EVENT_PARAM_LOGIN_RESULT, str3 == null ? "" : str3);
        bundle.putString(LoginLogger.EVENT_PARAM_METHOD, "");
        bundle.putString(LoginLogger.EVENT_PARAM_ERROR_CODE, "");
        bundle.putString(LoginLogger.EVENT_PARAM_ERROR_MESSAGE, "");
        if (jSONObject == null || (string = jSONObject.toString()) == null) {
            string = "";
        }
        bundle.putString(LoginLogger.EVENT_PARAM_EXTRAS, string);
        bundle.putString(LoginLogger.EVENT_PARAM_CHALLENGE, "");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Event: ");
        sb2.append(str);
        sb2.append(" | auth_logger_id=");
        if (str2 == null) {
            str2 = "";
        }
        sb2.append(str2);
        sb2.append(" | result=");
        if (str3 == null) {
            str3 = "";
        }
        sb2.append(str3);
        sb2.append(" | extras=");
        if (jSONObject != null && (string2 = jSONObject.toString()) != null) {
            str4 = string2;
        }
        sb2.append(str4);
        Utility.logd(TAG, sb2.toString());
        InternalAppEventsLogger appEventsLogger$facebook_common_release = getAppEventsLogger$facebook_common_release();
        if (appEventsLogger$facebook_common_release != null) {
            appEventsLogger$facebook_common_release.logEventImplicitly(str, bundle);
        }
    }

    static /* synthetic */ void logSsoEvent$default(FBLoginSSOLauncher fBLoginSSOLauncher, String str, String str2, JSONObject jSONObject, String str3, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            jSONObject = null;
        }
        if ((i10 & 8) != 0) {
            str3 = null;
        }
        fBLoginSSOLauncher.logSsoEvent(str, str2, jSONObject, str3);
    }

    private final void markFromSso(LoginClient.Result result) {
        Map<String, String> map;
        Map<String, String> map2 = result.loggingExtras;
        if (map2 == null || (map = o0.u(map2)) == null) {
            map = new HashMap<>();
        }
        map.put(LoginLogger.EVENT_EXTRAS_FROM_SSO, ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
        result.loggingExtras = map;
    }

    public final InternalAppEventsLogger getAppEventsLogger$facebook_common_release() {
        if (this.appEventsLogger == null) {
            this.appEventsLogger = new InternalAppEventsLogger(this.activity, FacebookSdk.getApplicationId());
        }
        return this.appEventsLogger;
    }

    public final boolean launch() {
        return launch$default(this, null, 1, null);
    }

    public final void setAppEventsLogger$facebook_common_release(InternalAppEventsLogger internalAppEventsLogger) {
        this.appEventsLogger = internalAppEventsLogger;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FBLoginSSOLauncher(ComponentActivity activity, FacebookCallback<LoginResult> facebookCallback) {
        this(activity, facebookCallback, false, 4, null);
        kotlin.jvm.internal.t.f(activity, "activity");
    }

    public final boolean launch(Collection<String> permissions) {
        kotlin.jvm.internal.t.f(permissions, "permissions");
        this.pendingPermissions = permissions;
        if (AccessToken.Companion.getCurrentAccessToken() != null) {
            return false;
        }
        String string = UUID.randomUUID().toString();
        kotlin.jvm.internal.t.e(string, "randomUUID().toString()");
        Utility.logd(TAG, "auth_logger_id: " + string);
        logSsoEvent$default(this, LoginLogger.EVENT_NAME_SSO_LAUNCH_ATTEMPTED, string, new JSONObject().put("permissions", TextUtils.join(",", permissions)), null, 8, null);
        if (!FeatureManager.isEnabled(FeatureManager.Feature.LoginSSO)) {
            pendingSsoContext = "non_sso_login_sso_not_shown";
            logSsoEvent$default(this, LoginLogger.EVENT_NAME_SSO_NOT_SHOWN, string, new JSONObject().put("reason", "gk_disabled"), null, 8, null);
            return false;
        }
        LoginConfiguration loginConfiguration = new LoginConfiguration(permissions, null, 2, null);
        LoginManager companion = LoginManager.Companion.getInstance();
        LoginClient.Request request = new LoginClient.Request(companion.getLoginBehavior(), loginConfiguration.getPermissions(), companion.getDefaultAudience(), companion.getAuthType(), FacebookSdk.getApplicationId(), string, companion.getLoginTargetApp(), loginConfiguration.getNonce(), null, null, null, FacebookSdk.getRedirectURI(), FacebookSdk.getIntentUriPackageTarget(), 1792, null);
        request.setFamilyLogin(companion.isFamilyLogin());
        request.setShouldSkipAccountDeduplication(companion.getShouldSkipAccountDeduplication());
        this.pendingNonce = loginConfiguration.getNonce();
        this.pendingRequest = request;
        for (Intent intent : NativeProtocol.createFBLoginSSOIntents(this.activity, FacebookSdk.getApplicationId(), loginConfiguration.getPermissions(), LoginClient.Companion.getE2E(), false, false, companion.getDefaultAudience(), "{\"0_auth_logger_id\":\"" + string + "\"}", companion.getAuthType(), false, null, false, companion.isFamilyLogin(), companion.getShouldSkipAccountDeduplication(), loginConfiguration.getNonce(), null, null, FacebookSdk.getRedirectURI(), FacebookSdk.getIntentUriPackageTarget())) {
            if (this.activity.getPackageManager().resolveActivity(intent, 0) != null) {
                pendingSsoContext = "non_sso_login_sso_shown";
                logSsoEvent$default(this, LoginLogger.EVENT_NAME_SSO_DELEGATED_TO_FB4A, request.getAuthId(), null, null, 12, null);
                this.launcher.b(intent);
                return true;
            }
        }
        String str = isFb4aInstalled() ? "fb4a_outdated" : "fb4a_not_installed";
        if (!this.showWithoutFBApp) {
            logSsoEvent$default(this, LoginLogger.EVENT_NAME_SSO_NOT_SHOWN, request.getAuthId(), new JSONObject().put("reason", str), null, 8, null);
            pendingSsoContext = "non_sso_login_sso_not_shown";
            return false;
        }
        ComponentActivity componentActivity = this.activity;
        androidx.fragment.app.e eVar = componentActivity instanceof androidx.fragment.app.e ? (androidx.fragment.app.e) componentActivity : null;
        if (eVar == null) {
            return false;
        }
        FBLoginSSONoAppDialog fBLoginSSONoAppDialogNewInstance$default = FBLoginSSONoAppDialog.Companion.newInstance$default(FBLoginSSONoAppDialog.Companion, false, 1, null);
        fBLoginSSONoAppDialogNewInstance$default.setOnContinueListener(new AnonymousClass1(request, str));
        fBLoginSSONoAppDialogNewInstance$default.setOnDismissListener(new AnonymousClass2(request));
        fBLoginSSONoAppDialogNewInstance$default.show(eVar.getSupportFragmentManager(), FBLoginSSONoAppDialog.TAG);
        logSsoEvent$default(this, LoginLogger.EVENT_NAME_SSO_SHOWN, request.getAuthId(), new JSONObject().put("reason", str).put("permissions", TextUtils.join(",", permissions)), null, 8, null);
        return true;
    }

    public FBLoginSSOLauncher(ComponentActivity activity, FacebookCallback<LoginResult> facebookCallback, boolean z10) {
        kotlin.jvm.internal.t.f(activity, "activity");
        this.activity = activity;
        this.callback = facebookCallback;
        this.showWithoutFBApp = z10;
        this.pendingPermissions = kotlin.collections.t.k();
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult = activity.registerForActivityResult(new f.c(), new androidx.activity.result.b() { // from class: com.facebook.login.i
            @Override // androidx.activity.result.b
            public final void onActivityResult(Object obj) {
                FBLoginSSOLauncher._init_$lambda$0(this.f11140a, (androidx.activity.result.a) obj);
            }
        });
        kotlin.jvm.internal.t.e(activityResultLauncherRegisterForActivityResult, "activity.registerForActi…e, result.data)\n        }");
        this.launcher = activityResultLauncherRegisterForActivityResult;
    }

    public /* synthetic */ FBLoginSSOLauncher(ComponentActivity componentActivity, FacebookCallback facebookCallback, boolean z10, int i10, kotlin.jvm.internal.k kVar) {
        this(componentActivity, (i10 & 2) != 0 ? null : facebookCallback, (i10 & 4) != 0 ? true : z10);
    }

    /* JADX INFO: compiled from: FBLoginSSOLauncher.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final String getPendingSsoContext() {
            return FBLoginSSOLauncher.pendingSsoContext;
        }

        public final void setPendingSsoContext$facebook_common_release(String str) {
            FBLoginSSOLauncher.pendingSsoContext = str;
        }

        public static /* synthetic */ void getPendingSsoContext$annotations() {
        }
    }
}
