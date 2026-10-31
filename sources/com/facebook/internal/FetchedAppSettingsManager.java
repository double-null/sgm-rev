package com.facebook.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.impl.communicator.ZREl.sRGQSqxgxlS;
import com.applovin.impl.sdk.i0;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.codeless.internal.UnityReflection;
import com.facebook.appevents.internal.AutomaticAnalyticsLogger;
import com.facebook.appevents.internal.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.l0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: FetchedAppSettingsManager.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class FetchedAppSettingsManager {
    private static final String ANDROID_DEDUPE_KEY = "FBAndroidSDK";
    private static final String APPLICATION_FIELDS = "fields";
    private static final String APP_SETTINGS_PREFS_KEY_FORMAT = "com.facebook.internal.APP_SETTINGS.%s";
    private static final String APP_SETTINGS_PREFS_STORE = "com.facebook.internal.preferences.APP_SETTINGS";
    private static final String APP_SETTING_APP_EVENTS_CONFIG = "app_events_config";
    private static final int AUTOMATIC_LOGGING_ENABLED_BITMASK_FIELD = 8;
    private static final String BLOCKLIST_EVENTS_KEY = "blocklist_events";
    private static final int CODELESS_EVENTS_ENABLED_BITMASK_FIELD = 32;
    private static final String DEDUPE_KEY = "iap_manual_and_auto_log_dedup_keys";
    private static final String DEDUPE_WINDOW = "iap_manual_and_auto_log_dedup_window_millis";
    private static final int IAP_AUTOMATIC_LOGGING_ENABLED_BITMASK_FIELD = 16;
    private static final String KEY = "key";
    private static final String MACA_RULES_KEY = "maca_rules";
    private static final int MONITOR_ENABLED_BITMASK_FIELD = 16384;
    private static final String PROD_DEDUPE_KEY = "prod_keys";
    private static final String REDACTED_EVENTS_KEY = "redacted_events";
    private static final String SDK_UPDATE_MESSAGE = "sdk_update_message";
    private static final String SENSITIVE_PARAMS_KEY = "sensitive_params";
    private static final String STANDARD_PARAMS_KEY = "standard_params";
    private static final String STD_PARAMS_BLOCKED_KEY = "standard_params_blocked";
    private static final String STD_PARAMS_SCHEMA_KEY = "standard_params_schema";
    private static final String TEST_DEDUPE_KEY = "test_keys";
    private static final int TRACK_UNINSTALL_ENABLED_BITMASK_FIELD = 256;
    private static final String VALUE = "value";
    private static final String VVP_CONFIG_KEY = "vvp_config";
    private static volatile boolean isUnityInit;
    private static volatile boolean printedSDKUpdatedMessage;
    private static volatile JSONArray unityEventBindings;
    public static final FetchedAppSettingsManager INSTANCE = new FetchedAppSettingsManager();
    private static final String TAG = FetchedAppSettingsManager.class.getSimpleName();
    private static final String APP_SETTING_SUPPORTS_IMPLICIT_SDK_LOGGING = "supports_implicit_sdk_logging";
    private static final String APP_SETTING_NUX_CONTENT = "gdpv4_nux_content";
    private static final String APP_SETTING_NUX_ENABLED = "gdpv4_nux_enabled";
    private static final String APP_SETTING_DIALOG_CONFIGS = "android_dialog_configs";
    private static final String APP_SETTING_ANDROID_SDK_ERROR_CATEGORIES = "android_sdk_error_categories";
    private static final String APP_SETTING_APP_EVENTS_SESSION_TIMEOUT = "app_events_session_timeout";
    private static final String APP_SETTING_APP_EVENTS_FEATURE_BITMASK = "app_events_feature_bitmask";
    private static final String APP_SETTING_APP_EVENTS_EVENT_BINDINGS = "auto_event_mapping_android";
    private static final String APP_SETTING_SMART_LOGIN_OPTIONS = "seamless_login";
    private static final String SMART_LOGIN_BOOKMARK_ICON_URL = "smart_login_bookmark_icon_url";
    private static final String SMART_LOGIN_MENU_ICON_URL = "smart_login_menu_icon_url";
    private static final String APP_SETTING_RESTRICTIVE_EVENT_FILTER_FIELD = "restrictive_data_filter_params";
    private static final String APP_SETTING_APP_EVENTS_AAM_RULE = "aam_rules";
    private static final String SUGGESTED_EVENTS_SETTING = "suggested_events_setting";
    private static final String PROTECTED_MODE_RULES = "protected_mode_rules";
    public static final String AUTO_LOG_APP_EVENTS_DEFAULT_FIELD = "auto_log_app_events_default";
    public static final String AUTO_LOG_APP_EVENT_ENABLED_FIELD = "auto_log_app_events_enabled";
    private static final List<String> APP_SETTING_FIELDS = kotlin.collections.t.n(APP_SETTING_SUPPORTS_IMPLICIT_SDK_LOGGING, APP_SETTING_NUX_CONTENT, APP_SETTING_NUX_ENABLED, APP_SETTING_DIALOG_CONFIGS, APP_SETTING_ANDROID_SDK_ERROR_CATEGORIES, APP_SETTING_APP_EVENTS_SESSION_TIMEOUT, APP_SETTING_APP_EVENTS_FEATURE_BITMASK, APP_SETTING_APP_EVENTS_EVENT_BINDINGS, APP_SETTING_SMART_LOGIN_OPTIONS, SMART_LOGIN_BOOKMARK_ICON_URL, SMART_LOGIN_MENU_ICON_URL, APP_SETTING_RESTRICTIVE_EVENT_FILTER_FIELD, APP_SETTING_APP_EVENTS_AAM_RULE, SUGGESTED_EVENTS_SETTING, PROTECTED_MODE_RULES, AUTO_LOG_APP_EVENTS_DEFAULT_FIELD, AUTO_LOG_APP_EVENT_ENABLED_FIELD, "app_events_config.os_version(" + Build.VERSION.RELEASE + ')');
    private static final Map<String, FetchedAppSettings> fetchedAppSettings = new ConcurrentHashMap();
    private static final AtomicReference<FetchAppSettingState> loadingState = new AtomicReference<>(FetchAppSettingState.NOT_LOADED);
    private static final ConcurrentLinkedQueue<FetchedAppSettingsCallback> fetchedAppSettingsCallbacks = new ConcurrentLinkedQueue<>();

    /* JADX INFO: compiled from: FetchedAppSettingsManager.kt */
    /* JADX INFO: loaded from: classes.dex */
    public enum FetchAppSettingState {
        NOT_LOADED,
        LOADING,
        SUCCESS,
        ERROR
    }

    /* JADX INFO: compiled from: FetchedAppSettingsManager.kt */
    /* JADX INFO: loaded from: classes.dex */
    public interface FetchedAppSettingsCallback {
        void onError();

        void onSuccess(FetchedAppSettings fetchedAppSettings);
    }

    private FetchedAppSettingsManager() {
    }

    public static final void getAppSettingsAsync(FetchedAppSettingsCallback callback) {
        kotlin.jvm.internal.t.f(callback, "callback");
        fetchedAppSettingsCallbacks.add(callback);
        loadAppSettingsAsync();
    }

    private final JSONObject getAppSettingsQueryResponse(String str) {
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(APP_SETTING_FIELDS);
        bundle.putString("fields", TextUtils.join(",", arrayList));
        GraphRequest graphRequestNewGraphPathRequest = GraphRequest.Companion.newGraphPathRequest(null, "app", null);
        graphRequestNewGraphPathRequest.setForceApplicationRequest(true);
        graphRequestNewGraphPathRequest.setParameters(bundle);
        JSONObject jsonObject = graphRequestNewGraphPathRequest.executeAndWait().getJsonObject();
        return jsonObject == null ? new JSONObject() : jsonObject;
    }

    public static final FetchedAppSettings getAppSettingsWithoutQuery(String str) {
        if (str != null) {
            return fetchedAppSettings.get(str);
        }
        return null;
    }

    public static final Map<String, Boolean> getCachedMigratedAutoLogValuesInAppSettings() {
        JSONObject jSONObject;
        Context applicationContext = FacebookSdk.getApplicationContext();
        String applicationId = FacebookSdk.getApplicationId();
        l0 l0Var = l0.f21527a;
        String str = String.format(APP_SETTINGS_PREFS_KEY_FORMAT, Arrays.copyOf(new Object[]{applicationId}, 1));
        kotlin.jvm.internal.t.e(str, "format(format, *args)");
        String string = applicationContext.getSharedPreferences(APP_SETTINGS_PREFS_STORE, 0).getString(str, null);
        if (!Utility.isNullOrEmpty(string)) {
            if (string == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            try {
                jSONObject = new JSONObject(string);
            } catch (JSONException e10) {
                Utility.logd(Utility.LOG_TAG, e10);
                jSONObject = null;
            }
            if (jSONObject != null) {
                return INSTANCE.parseMigratedAutoLogValues(jSONObject);
            }
        }
        return null;
    }

    public static final void loadAppSettingsAsync() {
        final Context applicationContext = FacebookSdk.getApplicationContext();
        final String applicationId = FacebookSdk.getApplicationId();
        if (Utility.isNullOrEmpty(applicationId)) {
            loadingState.set(FetchAppSettingState.ERROR);
            INSTANCE.pollCallbacks();
            return;
        }
        if (fetchedAppSettings.containsKey(applicationId)) {
            loadingState.set(FetchAppSettingState.SUCCESS);
            INSTANCE.pollCallbacks();
            return;
        }
        AtomicReference<FetchAppSettingState> atomicReference = loadingState;
        FetchAppSettingState fetchAppSettingState = FetchAppSettingState.NOT_LOADED;
        FetchAppSettingState fetchAppSettingState2 = FetchAppSettingState.LOADING;
        if (!(i0.a(atomicReference, fetchAppSettingState, fetchAppSettingState2) || i0.a(atomicReference, FetchAppSettingState.ERROR, fetchAppSettingState2))) {
            INSTANCE.pollCallbacks();
            return;
        }
        l0 l0Var = l0.f21527a;
        final String str = String.format(APP_SETTINGS_PREFS_KEY_FORMAT, Arrays.copyOf(new Object[]{applicationId}, 1));
        kotlin.jvm.internal.t.e(str, "format(format, *args)");
        FacebookSdk.getExecutor().execute(new Runnable() { // from class: com.facebook.internal.g
            @Override // java.lang.Runnable
            public final void run() {
                FetchedAppSettingsManager.loadAppSettingsAsync$lambda$0(applicationContext, str, applicationId);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadAppSettingsAsync$lambda$0(Context context, String settingsKey, String applicationId) {
        JSONObject jSONObject;
        kotlin.jvm.internal.t.f(context, "$context");
        kotlin.jvm.internal.t.f(settingsKey, "$settingsKey");
        kotlin.jvm.internal.t.f(applicationId, "$applicationId");
        SharedPreferences sharedPreferences = context.getSharedPreferences(APP_SETTINGS_PREFS_STORE, 0);
        FetchedAppSettings appSettingsFromJSON$facebook_core_release = null;
        String string = sharedPreferences.getString(settingsKey, null);
        if (!Utility.isNullOrEmpty(string)) {
            if (string == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            try {
                jSONObject = new JSONObject(string);
            } catch (JSONException e10) {
                Utility.logd(Utility.LOG_TAG, e10);
                jSONObject = null;
            }
            if (jSONObject != null) {
                appSettingsFromJSON$facebook_core_release = INSTANCE.parseAppSettingsFromJSON$facebook_core_release(applicationId, jSONObject);
            }
        }
        FetchedAppSettingsManager fetchedAppSettingsManager = INSTANCE;
        JSONObject appSettingsQueryResponse = fetchedAppSettingsManager.getAppSettingsQueryResponse(applicationId);
        if (appSettingsQueryResponse != null) {
            fetchedAppSettingsManager.parseAppSettingsFromJSON$facebook_core_release(applicationId, appSettingsQueryResponse);
            sharedPreferences.edit().putString(settingsKey, appSettingsQueryResponse.toString()).apply();
        }
        if (appSettingsFromJSON$facebook_core_release != null) {
            String sdkUpdateMessage = appSettingsFromJSON$facebook_core_release.getSdkUpdateMessage();
            if (!printedSDKUpdatedMessage && sdkUpdateMessage != null && sdkUpdateMessage.length() > 0) {
                printedSDKUpdatedMessage = true;
                Log.w(TAG, sdkUpdateMessage);
            }
        }
        FetchedAppGateKeepersManager.queryAppGateKeepers(applicationId, true);
        AutomaticAnalyticsLogger.logActivateAppEvent();
        loadingState.set(fetchedAppSettings.containsKey(applicationId) ? FetchAppSettingState.SUCCESS : FetchAppSettingState.ERROR);
        fetchedAppSettingsManager.pollCallbacks();
    }

    private final List<String> parseCurrencyAndValueDedupeParameters(JSONObject jSONObject, String str) {
        JSONArray jSONArray;
        if (jSONObject != null) {
            try {
                jSONArray = jSONObject.getJSONArray(DEDUPE_KEY);
            } catch (Exception unused) {
            }
        } else {
            jSONArray = null;
        }
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
            if (kotlin.jvm.internal.t.a(jSONObject2.getString("key"), PROD_DEDUPE_KEY)) {
                JSONArray jSONArray2 = jSONObject2.getJSONArray("value");
                int length2 = jSONArray2.length();
                for (int i11 = 0; i11 < length2; i11++) {
                    JSONObject jSONObject3 = jSONArray2.getJSONObject(i11);
                    if (kotlin.jvm.internal.t.a(jSONObject3.getString("key"), str)) {
                        JSONArray jSONArray3 = jSONObject3.getJSONArray("value");
                        ArrayList arrayList = new ArrayList();
                        int length3 = jSONArray3.length();
                        for (int i12 = 0; i12 < length3; i12++) {
                            arrayList.add(jSONArray3.getJSONObject(i12).getString("value"));
                        }
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.addAll(arrayList);
                        return arrayList2;
                    }
                }
            }
        }
        return null;
    }

    private final ArrayList<wc.q<String, List<String>>> parseDedupeParameters(JSONObject jSONObject, boolean z10) {
        JSONArray jSONArray;
        if (jSONObject != null) {
            try {
                jSONArray = jSONObject.getJSONArray(DEDUPE_KEY);
            } catch (Exception unused) {
                return null;
            }
        } else {
            jSONArray = null;
        }
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        ArrayList<wc.q<String, List<String>>> arrayList = null;
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
            String string = jSONObject2.getString("key");
            if ((!kotlin.jvm.internal.t.a(string, PROD_DEDUPE_KEY) || !z10) && (!kotlin.jvm.internal.t.a(string, TEST_DEDUPE_KEY) || z10)) {
                JSONArray jSONArray2 = jSONObject2.getJSONArray("value");
                int length2 = jSONArray2.length();
                for (int i11 = 0; i11 < length2; i11++) {
                    JSONObject jSONObject3 = jSONArray2.getJSONObject(i11);
                    String string2 = jSONObject3.getString("key");
                    if (!kotlin.jvm.internal.t.a(string2, AppEventsConstants.EVENT_PARAM_VALUE_TO_SUM) && !kotlin.jvm.internal.t.a(string2, AppEventsConstants.EVENT_PARAM_CURRENCY)) {
                        JSONArray jSONArray3 = jSONObject3.getJSONArray("value");
                        ArrayList arrayList2 = new ArrayList();
                        int length3 = jSONArray3.length();
                        for (int i12 = 0; i12 < length3; i12++) {
                            arrayList2.add(jSONArray3.getJSONObject(i12).getString("value"));
                        }
                        if (arrayList == null) {
                            arrayList = new ArrayList<>();
                        }
                        arrayList.add(new wc.q<>(string2, arrayList2));
                    }
                }
            }
        }
        return arrayList;
    }

    static /* synthetic */ ArrayList parseDedupeParameters$default(FetchedAppSettingsManager fetchedAppSettingsManager, JSONObject jSONObject, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return fetchedAppSettingsManager.parseDedupeParameters(jSONObject, z10);
    }

    private final Long parseDedupeWindow(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return Long.valueOf(jSONObject.optLong(DEDUPE_WINDOW));
        } catch (Exception unused) {
            return null;
        }
    }

    private final Map<String, Map<String, FetchedAppSettings.DialogFeatureConfig>> parseDialogConfigurations(JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray;
        HashMap map = new HashMap();
        if (jSONObject != null && (jSONArrayOptJSONArray = jSONObject.optJSONArray("data")) != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                FetchedAppSettings.DialogFeatureConfig.Companion companion = FetchedAppSettings.DialogFeatureConfig.Companion;
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
                kotlin.jvm.internal.t.e(jSONObjectOptJSONObject, "dialogConfigData.optJSONObject(i)");
                FetchedAppSettings.DialogFeatureConfig dialogConfig = companion.parseDialogConfig(jSONObjectOptJSONObject);
                if (dialogConfig != null) {
                    String dialogName = dialogConfig.getDialogName();
                    Map map2 = (Map) map.get(dialogName);
                    if (map2 == null) {
                        map2 = new HashMap();
                        map.put(dialogName, map2);
                    }
                    map2.put(dialogConfig.getFeatureName(), dialogConfig);
                }
            }
        }
        return map;
    }

    private final Map<String, Boolean> parseMigratedAutoLogValues(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        HashMap map = new HashMap();
        if (!jSONObject.isNull(AUTO_LOG_APP_EVENTS_DEFAULT_FIELD)) {
            try {
                map.put(AUTO_LOG_APP_EVENTS_DEFAULT_FIELD, Boolean.valueOf(jSONObject.getBoolean(AUTO_LOG_APP_EVENTS_DEFAULT_FIELD)));
            } catch (JSONException e10) {
                Utility.logd(Utility.LOG_TAG, e10);
            }
        }
        if (!jSONObject.isNull(AUTO_LOG_APP_EVENT_ENABLED_FIELD)) {
            try {
                map.put(AUTO_LOG_APP_EVENT_ENABLED_FIELD, Boolean.valueOf(jSONObject.getBoolean(AUTO_LOG_APP_EVENT_ENABLED_FIELD)));
            } catch (JSONException e11) {
                Utility.logd(Utility.LOG_TAG, e11);
            }
        }
        if (map.isEmpty()) {
            return null;
        }
        return map;
    }

    private final JSONArray parseProtectedModeRules(JSONObject jSONObject, String str) {
        if (jSONObject != null) {
            return jSONObject.optJSONArray(str);
        }
        return null;
    }

    private final String parseVVPConfig(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.isNull(VVP_CONFIG_KEY)) {
            return null;
        }
        return jSONObject.optString(VVP_CONFIG_KEY, null);
    }

    private final synchronized void pollCallbacks() {
        FetchAppSettingState fetchAppSettingState = loadingState.get();
        if (FetchAppSettingState.NOT_LOADED != fetchAppSettingState && FetchAppSettingState.LOADING != fetchAppSettingState) {
            final FetchedAppSettings fetchedAppSettings2 = fetchedAppSettings.get(FacebookSdk.getApplicationId());
            Handler handler = new Handler(Looper.getMainLooper());
            if (FetchAppSettingState.ERROR == fetchAppSettingState) {
                while (true) {
                    ConcurrentLinkedQueue<FetchedAppSettingsCallback> concurrentLinkedQueue = fetchedAppSettingsCallbacks;
                    if (concurrentLinkedQueue.isEmpty()) {
                        return;
                    }
                    final FetchedAppSettingsCallback fetchedAppSettingsCallbackPoll = concurrentLinkedQueue.poll();
                    handler.post(new Runnable() { // from class: com.facebook.internal.h
                        @Override // java.lang.Runnable
                        public final void run() {
                            fetchedAppSettingsCallbackPoll.onError();
                        }
                    });
                }
            } else {
                while (true) {
                    ConcurrentLinkedQueue<FetchedAppSettingsCallback> concurrentLinkedQueue2 = fetchedAppSettingsCallbacks;
                    if (concurrentLinkedQueue2.isEmpty()) {
                        return;
                    }
                    final FetchedAppSettingsCallback fetchedAppSettingsCallbackPoll2 = concurrentLinkedQueue2.poll();
                    handler.post(new Runnable() { // from class: com.facebook.internal.i
                        @Override // java.lang.Runnable
                        public final void run() {
                            fetchedAppSettingsCallbackPoll2.onSuccess(fetchedAppSettings2);
                        }
                    });
                }
            }
        }
    }

    public static final FetchedAppSettings queryAppSettings(String applicationId, boolean z10) {
        kotlin.jvm.internal.t.f(applicationId, "applicationId");
        if (!z10) {
            Map<String, FetchedAppSettings> map = fetchedAppSettings;
            if (map.containsKey(applicationId)) {
                return map.get(applicationId);
            }
        }
        FetchedAppSettingsManager fetchedAppSettingsManager = INSTANCE;
        FetchedAppSettings appSettingsFromJSON$facebook_core_release = fetchedAppSettingsManager.parseAppSettingsFromJSON$facebook_core_release(applicationId, fetchedAppSettingsManager.getAppSettingsQueryResponse(applicationId));
        if (kotlin.jvm.internal.t.a(applicationId, FacebookSdk.getApplicationId())) {
            loadingState.set(FetchAppSettingState.SUCCESS);
            fetchedAppSettingsManager.pollCallbacks();
        }
        return appSettingsFromJSON$facebook_core_release;
    }

    public static final void setIsUnityInit(boolean z10) {
        isUnityInit = z10;
        if (unityEventBindings == null || !isUnityInit) {
            return;
        }
        UnityReflection.sendEventMapping(String.valueOf(unityEventBindings));
    }

    public final FetchedAppSettings parseAppSettingsFromJSON$facebook_core_release(String applicationId, JSONObject settingsJSON) {
        kotlin.jvm.internal.t.f(applicationId, "applicationId");
        kotlin.jvm.internal.t.f(settingsJSON, "settingsJSON");
        JSONArray jSONArrayOptJSONArray = settingsJSON.optJSONArray(APP_SETTING_ANDROID_SDK_ERROR_CATEGORIES);
        FacebookRequestErrorClassification.Companion companion = FacebookRequestErrorClassification.Companion;
        FacebookRequestErrorClassification facebookRequestErrorClassificationCreateFromJSON = companion.createFromJSON(jSONArrayOptJSONArray);
        if (facebookRequestErrorClassificationCreateFromJSON == null) {
            facebookRequestErrorClassificationCreateFromJSON = companion.getDefaultErrorClassification();
        }
        FacebookRequestErrorClassification facebookRequestErrorClassification = facebookRequestErrorClassificationCreateFromJSON;
        int iOptInt = settingsJSON.optInt(APP_SETTING_APP_EVENTS_FEATURE_BITMASK, 0);
        boolean z10 = (iOptInt & 8) != 0;
        boolean z11 = (iOptInt & 16) != 0;
        boolean z12 = (iOptInt & 32) != 0;
        boolean z13 = (iOptInt & 256) != 0;
        boolean z14 = (iOptInt & 16384) != 0;
        JSONArray jSONArrayOptJSONArray2 = settingsJSON.optJSONArray(APP_SETTING_APP_EVENTS_EVENT_BINDINGS);
        unityEventBindings = jSONArrayOptJSONArray2;
        if (unityEventBindings != null && InternalSettings.isUnityApp()) {
            UnityReflection.sendEventMapping(jSONArrayOptJSONArray2 != null ? jSONArrayOptJSONArray2.toString() : null);
        }
        JSONObject jSONObjectOptJSONObject = settingsJSON.optJSONObject(APP_SETTING_APP_EVENTS_CONFIG);
        boolean zOptBoolean = settingsJSON.optBoolean(APP_SETTING_SUPPORTS_IMPLICIT_SDK_LOGGING, false);
        String strOptString = settingsJSON.optString(APP_SETTING_NUX_CONTENT, "");
        kotlin.jvm.internal.t.e(strOptString, "settingsJSON.optString(A…_SETTING_NUX_CONTENT, \"\")");
        boolean zOptBoolean2 = settingsJSON.optBoolean(APP_SETTING_NUX_ENABLED, false);
        int iOptInt2 = settingsJSON.optInt(APP_SETTING_APP_EVENTS_SESSION_TIMEOUT, Constants.getDefaultAppEventsSessionTimeoutInSeconds());
        EnumSet<SmartLoginOption> options = SmartLoginOption.Companion.parseOptions(settingsJSON.optLong(APP_SETTING_SMART_LOGIN_OPTIONS));
        Map<String, Map<String, FetchedAppSettings.DialogFeatureConfig>> dialogConfigurations = parseDialogConfigurations(settingsJSON.optJSONObject(APP_SETTING_DIALOG_CONFIGS));
        String strOptString2 = settingsJSON.optString(SMART_LOGIN_BOOKMARK_ICON_URL);
        kotlin.jvm.internal.t.e(strOptString2, "settingsJSON.optString(S…_LOGIN_BOOKMARK_ICON_URL)");
        String strOptString3 = settingsJSON.optString(SMART_LOGIN_MENU_ICON_URL);
        kotlin.jvm.internal.t.e(strOptString3, "settingsJSON.optString(SMART_LOGIN_MENU_ICON_URL)");
        String strOptString4 = settingsJSON.optString(sRGQSqxgxlS.FaTIJB);
        kotlin.jvm.internal.t.e(strOptString4, "settingsJSON.optString(SDK_UPDATE_MESSAGE)");
        FetchedAppSettings fetchedAppSettings2 = new FetchedAppSettings(zOptBoolean, strOptString, zOptBoolean2, iOptInt2, options, dialogConfigurations, z10, facebookRequestErrorClassification, strOptString2, strOptString3, z11, z12, jSONArrayOptJSONArray2, strOptString4, z13, z14, settingsJSON.optString(APP_SETTING_APP_EVENTS_AAM_RULE), settingsJSON.optString(SUGGESTED_EVENTS_SETTING), settingsJSON.optString(APP_SETTING_RESTRICTIVE_EVENT_FILTER_FIELD), parseProtectedModeRules(settingsJSON.optJSONObject(PROTECTED_MODE_RULES), STANDARD_PARAMS_KEY), parseProtectedModeRules(settingsJSON.optJSONObject(PROTECTED_MODE_RULES), MACA_RULES_KEY), parseMigratedAutoLogValues(settingsJSON), parseProtectedModeRules(settingsJSON.optJSONObject(PROTECTED_MODE_RULES), BLOCKLIST_EVENTS_KEY), parseProtectedModeRules(settingsJSON.optJSONObject(PROTECTED_MODE_RULES), REDACTED_EVENTS_KEY), parseProtectedModeRules(settingsJSON.optJSONObject(PROTECTED_MODE_RULES), SENSITIVE_PARAMS_KEY), parseProtectedModeRules(settingsJSON.optJSONObject(PROTECTED_MODE_RULES), STD_PARAMS_SCHEMA_KEY), parseProtectedModeRules(settingsJSON.optJSONObject(PROTECTED_MODE_RULES), STD_PARAMS_BLOCKED_KEY), parseVVPConfig(settingsJSON.optJSONObject(PROTECTED_MODE_RULES)), parseCurrencyAndValueDedupeParameters(jSONObjectOptJSONObject, AppEventsConstants.EVENT_PARAM_CURRENCY), parseCurrencyAndValueDedupeParameters(jSONObjectOptJSONObject, AppEventsConstants.EVENT_PARAM_VALUE_TO_SUM), parseDedupeParameters$default(this, jSONObjectOptJSONObject, false, 2, null), parseDedupeParameters(jSONObjectOptJSONObject, true), parseDedupeWindow(settingsJSON.optJSONObject(APP_SETTING_APP_EVENTS_CONFIG)));
        fetchedAppSettings.put(applicationId, fetchedAppSettings2);
        return fetchedAppSettings2;
    }
}
