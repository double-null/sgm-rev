package com.facebook.login;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: LoginLogger.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class LoginLogger {
    public static final String EVENT_EXTRAS_DEFAULT_AUDIENCE = "default_audience";
    public static final String EVENT_EXTRAS_FACEBOOK_VERSION = "facebookVersion";
    public static final String EVENT_EXTRAS_FAILURE = "failure";
    public static final String EVENT_EXTRAS_FROM_SSO = "from_sso";
    public static final String EVENT_EXTRAS_IS_REAUTHORIZE = "isReauthorize";
    public static final String EVENT_EXTRAS_LOGIN_BEHAVIOR = "login_behavior";
    public static final String EVENT_EXTRAS_MISSING_INTERNET_PERMISSION = "no_internet_permission";
    public static final String EVENT_EXTRAS_NEW_PERMISSIONS = "new_permissions";
    public static final String EVENT_EXTRAS_NOT_TRIED = "not_tried";
    public static final String EVENT_EXTRAS_PERMISSIONS = "permissions";
    public static final String EVENT_EXTRAS_REQUEST_CODE = "request_code";
    public static final String EVENT_EXTRAS_TARGET_APP = "target_app";
    public static final String EVENT_EXTRAS_TRY_LOGIN_ACTIVITY = "try_login_activity";
    public static final String EVENT_NAME_FOA_LOGIN_COMPLETE = "foa_mobile_login_complete";
    public static final String EVENT_NAME_FOA_LOGIN_METHOD_COMPLETE = "foa_mobile_login_method_complete";
    public static final String EVENT_NAME_FOA_LOGIN_METHOD_NOT_TRIED = "foa_mobile_login_method_not_tried";
    public static final String EVENT_NAME_FOA_LOGIN_METHOD_START = "foa_mobile_login_method_start";
    public static final String EVENT_NAME_FOA_LOGIN_START = "foa_mobile_login_start";
    public static final String EVENT_NAME_LOGIN_COMPLETE = "fb_mobile_login_complete";
    public static final String EVENT_NAME_LOGIN_HEARTBEAT = "fb_mobile_login_heartbeat";
    public static final String EVENT_NAME_LOGIN_METHOD_COMPLETE = "fb_mobile_login_method_complete";
    public static final String EVENT_NAME_LOGIN_METHOD_NOT_TRIED = "fb_mobile_login_method_not_tried";
    public static final String EVENT_NAME_LOGIN_METHOD_START = "fb_mobile_login_method_start";
    public static final String EVENT_NAME_LOGIN_START = "fb_mobile_login_start";
    public static final String EVENT_NAME_LOGIN_STATUS_COMPLETE = "fb_mobile_login_status_complete";
    public static final String EVENT_NAME_LOGIN_STATUS_START = "fb_mobile_login_status_start";
    public static final String EVENT_NAME_SSO_CONTINUE_CLICKED = "fb_mobile_sso_continue_clicked";
    public static final String EVENT_NAME_SSO_DELEGATED_TO_FB4A = "fb_mobile_sso_delegated_to_fb4a";
    public static final String EVENT_NAME_SSO_DISMISSED = "fb_mobile_sso_dismissed";
    public static final String EVENT_NAME_SSO_LAUNCH_ATTEMPTED = "fb_mobile_sso_launch_attempted";
    public static final String EVENT_NAME_SSO_NOT_SHOWN = "fb_mobile_sso_not_shown";
    public static final String EVENT_NAME_SSO_SHOWN = "fb_mobile_sso_shown";
    public static final String EVENT_PARAM_AUTH_LOGGER_ID = "0_auth_logger_id";
    public static final String EVENT_PARAM_CHALLENGE = "7_challenge";
    public static final String EVENT_PARAM_ERROR_CODE = "4_error_code";
    public static final String EVENT_PARAM_ERROR_MESSAGE = "5_error_message";
    public static final String EVENT_PARAM_EXTRAS = "6_extras";
    public static final String EVENT_PARAM_FOA_METHOD_RESULT_SKIPPED = "foa_skipped";
    public static final String EVENT_PARAM_LOGIN_RESULT = "2_result";
    public static final String EVENT_PARAM_METHOD = "3_method";
    public static final String EVENT_PARAM_METHOD_RESULT_SKIPPED = "skipped";
    public static final String EVENT_PARAM_TIMESTAMP = "1_timestamp_ms";
    public static final String FACEBOOK_PACKAGE_NAME = "com.facebook.katana";
    private static final String TAG = "LoginLogger";
    private final String applicationId;
    private String facebookVersion;
    private final InternalAppEventsLogger logger;
    public static final Companion Companion = new Companion(null);
    private static final ScheduledExecutorService worker = Executors.newSingleThreadScheduledExecutor();

    /* JADX INFO: compiled from: LoginLogger.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Bundle newAuthorizationLoggingBundle(String str) {
            Bundle bundle = new Bundle();
            bundle.putLong(LoginLogger.EVENT_PARAM_TIMESTAMP, System.currentTimeMillis());
            bundle.putString(LoginLogger.EVENT_PARAM_AUTH_LOGGER_ID, str);
            bundle.putString(LoginLogger.EVENT_PARAM_METHOD, "");
            bundle.putString(LoginLogger.EVENT_PARAM_LOGIN_RESULT, "");
            bundle.putString(LoginLogger.EVENT_PARAM_ERROR_MESSAGE, "");
            bundle.putString(LoginLogger.EVENT_PARAM_ERROR_CODE, "");
            bundle.putString(LoginLogger.EVENT_PARAM_EXTRAS, "");
            return bundle;
        }
    }

    public LoginLogger(Context context, String applicationId) {
        PackageInfo packageInfo;
        kotlin.jvm.internal.t.f(context, "context");
        kotlin.jvm.internal.t.f(applicationId, "applicationId");
        this.applicationId = applicationId;
        this.logger = new InternalAppEventsLogger(context, applicationId);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (packageInfo = packageManager.getPackageInfo("com.facebook.katana", 0)) == null) {
                return;
            }
            this.facebookVersion = packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    private final void logAndEmit(String str, Bundle bundle) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            Utility.logd(TAG, "Event: " + str + " | auth_logger_id=" + bundle.getString(EVENT_PARAM_AUTH_LOGGER_ID) + " | result=" + bundle.getString(EVENT_PARAM_LOGIN_RESULT) + " | method=" + bundle.getString(EVENT_PARAM_METHOD) + " | extras=" + bundle.getString(EVENT_PARAM_EXTRAS));
            this.logger.logEventImplicitly(str, bundle);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public static /* synthetic */ void logAuthorizationMethodComplete$default(LoginLogger loginLogger, String str, String str2, String str3, String str4, String str5, Map map, String str6, int i10, Object obj) {
        if (CrashShieldHandler.isObjectCrashing(LoginLogger.class)) {
            return;
        }
        try {
            loginLogger.logAuthorizationMethodComplete(str, str2, str3, str4, str5, map, (i10 & 64) != 0 ? EVENT_NAME_LOGIN_METHOD_COMPLETE : str6);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, LoginLogger.class);
        }
    }

    public static /* synthetic */ void logAuthorizationMethodNotTried$default(LoginLogger loginLogger, String str, String str2, String str3, int i10, Object obj) {
        if (CrashShieldHandler.isObjectCrashing(LoginLogger.class)) {
            return;
        }
        if ((i10 & 4) != 0) {
            str3 = EVENT_NAME_LOGIN_METHOD_NOT_TRIED;
        }
        try {
            loginLogger.logAuthorizationMethodNotTried(str, str2, str3);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, LoginLogger.class);
        }
    }

    public static /* synthetic */ void logAuthorizationMethodStart$default(LoginLogger loginLogger, String str, String str2, String str3, int i10, Object obj) {
        if (CrashShieldHandler.isObjectCrashing(LoginLogger.class)) {
            return;
        }
        if ((i10 & 4) != 0) {
            str3 = EVENT_NAME_LOGIN_METHOD_START;
        }
        try {
            loginLogger.logAuthorizationMethodStart(str, str2, str3);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, LoginLogger.class);
        }
    }

    public static /* synthetic */ void logCompleteLogin$default(LoginLogger loginLogger, String str, Map map, LoginClient.Result.Code code, Map map2, Exception exc, String str2, int i10, Object obj) {
        if (CrashShieldHandler.isObjectCrashing(LoginLogger.class)) {
            return;
        }
        if ((i10 & 32) != 0) {
            str2 = EVENT_NAME_LOGIN_COMPLETE;
        }
        try {
            loginLogger.logCompleteLogin(str, map, code, map2, exc, str2);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, LoginLogger.class);
        }
    }

    private final void logHeartbeatEvent(String str) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            final Bundle bundleNewAuthorizationLoggingBundle = Companion.newAuthorizationLoggingBundle(str);
            worker.schedule(new Runnable() { // from class: com.facebook.login.p
                @Override // java.lang.Runnable
                public final void run() {
                    LoginLogger.logHeartbeatEvent$lambda$0(this.f11148a, bundleNewAuthorizationLoggingBundle);
                }
            }, 5L, TimeUnit.SECONDS);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void logHeartbeatEvent$lambda$0(LoginLogger this$0, Bundle bundle) {
        if (CrashShieldHandler.isObjectCrashing(LoginLogger.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.t.f(this$0, "this$0");
            kotlin.jvm.internal.t.f(bundle, "$bundle");
            this$0.logAndEmit(EVENT_NAME_LOGIN_HEARTBEAT, bundle);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, LoginLogger.class);
        }
    }

    public static /* synthetic */ void logStartLogin$default(LoginLogger loginLogger, LoginClient.Request request, String str, int i10, Object obj) {
        if (CrashShieldHandler.isObjectCrashing(LoginLogger.class)) {
            return;
        }
        if ((i10 & 2) != 0) {
            str = EVENT_NAME_LOGIN_START;
        }
        try {
            loginLogger.logStartLogin(request, str);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, LoginLogger.class);
        }
    }

    public static /* synthetic */ void logUnexpectedError$default(LoginLogger loginLogger, String str, String str2, String str3, int i10, Object obj) {
        if (CrashShieldHandler.isObjectCrashing(LoginLogger.class)) {
            return;
        }
        if ((i10 & 4) != 0) {
            str3 = "";
        }
        try {
            loginLogger.logUnexpectedError(str, str2, str3);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, LoginLogger.class);
        }
    }

    public final String getApplicationId() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            return this.applicationId;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public final void logAuthorizationMethodComplete(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            logAuthorizationMethodComplete$default(this, str, str2, str3, str4, str5, map, null, 64, null);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void logAuthorizationMethodNotTried(String str, String str2) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            logAuthorizationMethodNotTried$default(this, str, str2, null, 4, null);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void logAuthorizationMethodStart(String str, String str2) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            logAuthorizationMethodStart$default(this, str, str2, null, 4, null);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void logCompleteLogin(String str, Map<String, String> loggingExtras, LoginClient.Result.Code code, Map<String, String> map, Exception exc) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            kotlin.jvm.internal.t.f(loggingExtras, "loggingExtras");
            logCompleteLogin$default(this, str, loggingExtras, code, map, exc, null, 32, null);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void logLoginStatusError(String str, Exception exception) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            kotlin.jvm.internal.t.f(exception, "exception");
            Bundle bundleNewAuthorizationLoggingBundle = Companion.newAuthorizationLoggingBundle(str);
            bundleNewAuthorizationLoggingBundle.putString(EVENT_PARAM_LOGIN_RESULT, LoginClient.Result.Code.ERROR.getLoggingValue());
            bundleNewAuthorizationLoggingBundle.putString(EVENT_PARAM_ERROR_MESSAGE, exception.toString());
            logAndEmit(EVENT_NAME_LOGIN_STATUS_COMPLETE, bundleNewAuthorizationLoggingBundle);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void logLoginStatusFailure(String str) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            Bundle bundleNewAuthorizationLoggingBundle = Companion.newAuthorizationLoggingBundle(str);
            bundleNewAuthorizationLoggingBundle.putString(EVENT_PARAM_LOGIN_RESULT, EVENT_EXTRAS_FAILURE);
            logAndEmit(EVENT_NAME_LOGIN_STATUS_COMPLETE, bundleNewAuthorizationLoggingBundle);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void logLoginStatusStart(String str) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            logAndEmit(EVENT_NAME_LOGIN_STATUS_START, Companion.newAuthorizationLoggingBundle(str));
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void logLoginStatusSuccess(String str) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            Bundle bundleNewAuthorizationLoggingBundle = Companion.newAuthorizationLoggingBundle(str);
            bundleNewAuthorizationLoggingBundle.putString(EVENT_PARAM_LOGIN_RESULT, LoginClient.Result.Code.SUCCESS.getLoggingValue());
            logAndEmit(EVENT_NAME_LOGIN_STATUS_COMPLETE, bundleNewAuthorizationLoggingBundle);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void logStartLogin(LoginClient.Request pendingLoginRequest) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            kotlin.jvm.internal.t.f(pendingLoginRequest, "pendingLoginRequest");
            logStartLogin$default(this, pendingLoginRequest, null, 2, null);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void logUnexpectedError(String str, String str2) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            logUnexpectedError$default(this, str, str2, null, 4, null);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void logAuthorizationMethodComplete(String str, String str2, String str3, String str4, String str5, Map<String, String> map, String str6) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            Bundle bundleNewAuthorizationLoggingBundle = Companion.newAuthorizationLoggingBundle(str);
            if (str3 != null) {
                bundleNewAuthorizationLoggingBundle.putString(EVENT_PARAM_LOGIN_RESULT, str3);
            }
            if (str4 != null) {
                bundleNewAuthorizationLoggingBundle.putString(EVENT_PARAM_ERROR_MESSAGE, str4);
            }
            if (str5 != null) {
                bundleNewAuthorizationLoggingBundle.putString(EVENT_PARAM_ERROR_CODE, str5);
            }
            if (map != null && (!map.isEmpty())) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    if (entry.getKey() != null) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                bundleNewAuthorizationLoggingBundle.putString(EVENT_PARAM_EXTRAS, new JSONObject(linkedHashMap).toString());
            }
            bundleNewAuthorizationLoggingBundle.putString(EVENT_PARAM_METHOD, str2);
            logAndEmit(str6, bundleNewAuthorizationLoggingBundle);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void logAuthorizationMethodNotTried(String str, String str2, String str3) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            Bundle bundleNewAuthorizationLoggingBundle = Companion.newAuthorizationLoggingBundle(str);
            bundleNewAuthorizationLoggingBundle.putString(EVENT_PARAM_METHOD, str2);
            logAndEmit(str3, bundleNewAuthorizationLoggingBundle);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void logAuthorizationMethodStart(String str, String str2, String str3) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            Bundle bundleNewAuthorizationLoggingBundle = Companion.newAuthorizationLoggingBundle(str);
            bundleNewAuthorizationLoggingBundle.putString(EVENT_PARAM_METHOD, str2);
            logAndEmit(str3, bundleNewAuthorizationLoggingBundle);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void logCompleteLogin(String str, Map<String, String> loggingExtras, LoginClient.Result.Code code, Map<String, String> map, Exception exc, String str2) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            kotlin.jvm.internal.t.f(loggingExtras, "loggingExtras");
            Bundle bundleNewAuthorizationLoggingBundle = Companion.newAuthorizationLoggingBundle(str);
            if (code != null) {
                bundleNewAuthorizationLoggingBundle.putString(EVENT_PARAM_LOGIN_RESULT, code.getLoggingValue());
            }
            if ((exc != null ? exc.getMessage() : null) != null) {
                bundleNewAuthorizationLoggingBundle.putString(EVENT_PARAM_ERROR_MESSAGE, exc.getMessage());
            }
            JSONObject jSONObject = loggingExtras.isEmpty() ^ true ? new JSONObject(loggingExtras) : null;
            if (map != null) {
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                try {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        String key = entry.getKey();
                        String value = entry.getValue();
                        if (key != null) {
                            jSONObject.put(key, value);
                        }
                    }
                } catch (JSONException unused) {
                }
            }
            if (jSONObject != null) {
                bundleNewAuthorizationLoggingBundle.putString(EVENT_PARAM_EXTRAS, jSONObject.toString());
            }
            logAndEmit(str2, bundleNewAuthorizationLoggingBundle);
            if (code == LoginClient.Result.Code.SUCCESS) {
                logHeartbeatEvent(str);
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void logStartLogin(LoginClient.Request pendingLoginRequest, String str) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            kotlin.jvm.internal.t.f(pendingLoginRequest, "pendingLoginRequest");
            Bundle bundleNewAuthorizationLoggingBundle = Companion.newAuthorizationLoggingBundle(pendingLoginRequest.getAuthId());
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("login_behavior", pendingLoginRequest.getLoginBehavior().toString());
                jSONObject.put(EVENT_EXTRAS_REQUEST_CODE, LoginClient.Companion.getLoginRequestCode());
                jSONObject.put("permissions", TextUtils.join(",", pendingLoginRequest.getPermissions()));
                jSONObject.put("default_audience", pendingLoginRequest.getDefaultAudience().toString());
                jSONObject.put(EVENT_EXTRAS_IS_REAUTHORIZE, pendingLoginRequest.isRerequest());
                String str2 = this.facebookVersion;
                if (str2 != null) {
                    jSONObject.put(EVENT_EXTRAS_FACEBOOK_VERSION, str2);
                }
                if (pendingLoginRequest.getLoginTargetApp() != null) {
                    jSONObject.put(EVENT_EXTRAS_TARGET_APP, pendingLoginRequest.getLoginTargetApp().toString());
                }
                bundleNewAuthorizationLoggingBundle.putString(EVENT_PARAM_EXTRAS, jSONObject.toString());
            } catch (JSONException unused) {
            }
            logAndEmit(str, bundleNewAuthorizationLoggingBundle);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void logUnexpectedError(String str, String str2, String str3) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            Bundle bundleNewAuthorizationLoggingBundle = Companion.newAuthorizationLoggingBundle("");
            bundleNewAuthorizationLoggingBundle.putString(EVENT_PARAM_LOGIN_RESULT, LoginClient.Result.Code.ERROR.getLoggingValue());
            bundleNewAuthorizationLoggingBundle.putString(EVENT_PARAM_ERROR_MESSAGE, str2);
            bundleNewAuthorizationLoggingBundle.putString(EVENT_PARAM_METHOD, str3);
            logAndEmit(str, bundleNewAuthorizationLoggingBundle);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }
}
