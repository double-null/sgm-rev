package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.internal.AttributionIdentifiers;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: UserSettingsManager.kt */
/* JADX INFO: loaded from: classes.dex */
public final class UserSettingsManager {
    private static final String ADD_TO_MESSAGING_CUSTOMER_BASE_FOR_WHATSAPP_KEY = "com.facebook.sdk.AddToMessagingCustomerBaseForWhatsApp";
    private static final String ADVERTISERID_COLLECTION_FALSE_WARNING = "The value for AdvertiserIDCollectionEnabled is currently set to FALSE so you're sending app events without collecting Advertiser ID. This can affect the quality of your advertising and analytics results.";
    private static final String ADVERTISERID_COLLECTION_NOT_SET_WARNING = "You haven't set a value for AdvertiserIDCollectionEnabled. Set the flag to TRUE if you want to collect Advertiser ID for better advertising and analytics results. To request user consent before collecting data, set the flag value to FALSE, then change to TRUE once user consent is received. Learn more: https://developers.facebook.com/docs/app-events/getting-started-app-events-android#disable-auto-events.";
    private static final String ADVERTISER_ID_KEY = "advertiser_id";
    private static final String APPLICATION_FIELDS = "fields";
    private static final String AUTO_APP_LINK_WARNING = "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest";
    private static final String LAST_TIMESTAMP = "last_timestamp";
    private static final long TIMEOUT_7D = 604800000;
    private static final String USER_SETTINGS = "com.facebook.sdk.USER_SETTINGS";
    private static final String USER_SETTINGS_BITMASK = "com.facebook.sdk.USER_SETTINGS_BITMASK";
    private static final String VALUE = "value";
    private static SharedPreferences userSettingPref;
    public static final UserSettingsManager INSTANCE = new UserSettingsManager();
    private static final String TAG = UserSettingsManager.class.getName();
    private static final AtomicBoolean isInitialized = new AtomicBoolean(false);
    private static final AtomicBoolean isFetchingCodelessStatus = new AtomicBoolean(false);
    private static final UserSetting autoInitEnabled = new UserSetting(true, FacebookSdk.AUTO_INIT_ENABLED_PROPERTY);
    private static final UserSetting autoLogAppEventsEnabledLocally = new UserSetting(true, FacebookSdk.AUTO_LOG_APP_EVENTS_ENABLED_PROPERTY);
    private static final UserSetting advertiserIDCollectionEnabled = new UserSetting(true, FacebookSdk.ADVERTISER_ID_COLLECTION_ENABLED_PROPERTY);
    private static final String EVENTS_CODELESS_SETUP_ENABLED = "auto_event_setup_enabled";
    private static final UserSetting codelessSetupEnabled = new UserSetting(false, EVENTS_CODELESS_SETUP_ENABLED);
    private static final UserSetting monitorEnabled = new UserSetting(true, FacebookSdk.MONITOR_ENABLED_PROPERTY);

    /* JADX INFO: compiled from: UserSettingsManager.kt */
    private static final class UserSetting {
        private boolean defaultVal;
        private String key;
        private long lastTS;
        private Boolean value;

        public UserSetting(boolean z10, String key) {
            kotlin.jvm.internal.t.f(key, "key");
            this.defaultVal = z10;
            this.key = key;
        }

        public final boolean getDefaultVal() {
            return this.defaultVal;
        }

        public final String getKey() {
            return this.key;
        }

        public final long getLastTS() {
            return this.lastTS;
        }

        public final Boolean getValue() {
            return this.value;
        }

        public final void setDefaultVal(boolean z10) {
            this.defaultVal = z10;
        }

        public final void setKey(String str) {
            kotlin.jvm.internal.t.f(str, "<set-?>");
            this.key = str;
        }

        public final void setLastTS(long j10) {
            this.lastTS = j10;
        }

        public final void setValue(Boolean bool) {
            this.value = bool;
        }

        /* JADX INFO: renamed from: getValue, reason: collision with other method in class */
        public final boolean m197getValue() {
            Boolean bool = this.value;
            return bool != null ? bool.booleanValue() : this.defaultVal;
        }
    }

    private UserSettingsManager() {
    }

    private final boolean checkAutoLogAppEventsEnabled() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            Map<String, Boolean> cachedMigratedAutoLogValuesInAppSettings = FetchedAppSettingsManager.getCachedMigratedAutoLogValuesInAppSettings();
            if (cachedMigratedAutoLogValuesInAppSettings == null || cachedMigratedAutoLogValuesInAppSettings.isEmpty()) {
                return autoLogAppEventsEnabledLocally.m197getValue();
            }
            Boolean bool = cachedMigratedAutoLogValuesInAppSettings.get(FetchedAppSettingsManager.AUTO_LOG_APP_EVENT_ENABLED_FIELD);
            Boolean bool2 = cachedMigratedAutoLogValuesInAppSettings.get(FetchedAppSettingsManager.AUTO_LOG_APP_EVENTS_DEFAULT_FIELD);
            if (bool != null) {
                return bool.booleanValue();
            }
            Boolean boolCheckClientSideConfiguration = checkClientSideConfiguration();
            if (boolCheckClientSideConfiguration != null) {
                return boolCheckClientSideConfiguration.booleanValue();
            }
            if (bool2 != null) {
                return bool2.booleanValue();
            }
            return true;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    private final Boolean checkClientSideConfiguration() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            Boolean autoLogAppEventsSettingFromCache = readAutoLogAppEventsSettingFromCache();
            if (autoLogAppEventsSettingFromCache != null) {
                return Boolean.valueOf(autoLogAppEventsSettingFromCache.booleanValue());
            }
            Boolean boolLoadAutoLogAppEventsSettingFromManifest = loadAutoLogAppEventsSettingFromManifest();
            if (boolLoadAutoLogAppEventsSettingFromManifest != null) {
                return Boolean.valueOf(boolLoadAutoLogAppEventsSettingFromManifest.booleanValue());
            }
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public static final Boolean getAddToMessagingCustomerBaseForWhatsApp() {
        if (CrashShieldHandler.isObjectCrashing(UserSettingsManager.class)) {
            return null;
        }
        try {
            INSTANCE.initializeIfNotInitialized();
            SharedPreferences sharedPreferences = userSettingPref;
            if (sharedPreferences == null) {
                kotlin.jvm.internal.t.u("userSettingPref");
                sharedPreferences = null;
            }
            if (!sharedPreferences.contains(ADD_TO_MESSAGING_CUSTOMER_BASE_FOR_WHATSAPP_KEY)) {
                return null;
            }
            SharedPreferences sharedPreferences2 = userSettingPref;
            if (sharedPreferences2 == null) {
                kotlin.jvm.internal.t.u("userSettingPref");
                sharedPreferences2 = null;
            }
            return Boolean.valueOf(sharedPreferences2.getBoolean(ADD_TO_MESSAGING_CUSTOMER_BASE_FOR_WHATSAPP_KEY, false));
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, UserSettingsManager.class);
            return null;
        }
    }

    public static final boolean getAdvertiserIDCollectionEnabled() {
        if (CrashShieldHandler.isObjectCrashing(UserSettingsManager.class)) {
            return false;
        }
        try {
            INSTANCE.initializeIfNotInitialized();
            return advertiserIDCollectionEnabled.m197getValue();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, UserSettingsManager.class);
            return false;
        }
    }

    public static final boolean getAutoInitEnabled() {
        if (CrashShieldHandler.isObjectCrashing(UserSettingsManager.class)) {
            return false;
        }
        try {
            INSTANCE.initializeIfNotInitialized();
            return autoInitEnabled.m197getValue();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, UserSettingsManager.class);
            return false;
        }
    }

    public static final boolean getAutoLogAppEventsEnabled() {
        if (CrashShieldHandler.isObjectCrashing(UserSettingsManager.class)) {
            return false;
        }
        try {
            UserSettingsManager userSettingsManager = INSTANCE;
            userSettingsManager.initializeIfNotInitialized();
            return userSettingsManager.checkAutoLogAppEventsEnabled();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, UserSettingsManager.class);
            return false;
        }
    }

    public static final boolean getCodelessSetupEnabled() {
        if (CrashShieldHandler.isObjectCrashing(UserSettingsManager.class)) {
            return false;
        }
        try {
            INSTANCE.initializeIfNotInitialized();
            return codelessSetupEnabled.m197getValue();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, UserSettingsManager.class);
            return false;
        }
    }

    public static final boolean getMonitorEnabled() {
        if (CrashShieldHandler.isObjectCrashing(UserSettingsManager.class)) {
            return false;
        }
        try {
            INSTANCE.initializeIfNotInitialized();
            return monitorEnabled.m197getValue();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, UserSettingsManager.class);
            return false;
        }
    }

    private final void initializeCodelessSetupEnabledAsync() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            UserSetting userSetting = codelessSetupEnabled;
            readSettingFromCache(userSetting);
            final long jCurrentTimeMillis = System.currentTimeMillis();
            if (userSetting.getValue() == null || jCurrentTimeMillis - userSetting.getLastTS() >= TIMEOUT_7D) {
                userSetting.setValue(null);
                userSetting.setLastTS(0L);
                if (isFetchingCodelessStatus.compareAndSet(false, true)) {
                    FacebookSdk.getExecutor().execute(new Runnable() { // from class: com.facebook.z
                        @Override // java.lang.Runnable
                        public final void run() {
                            UserSettingsManager.initializeCodelessSetupEnabledAsync$lambda$0(jCurrentTimeMillis);
                        }
                    });
                }
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initializeCodelessSetupEnabledAsync$lambda$0(long j10) {
        FetchedAppSettings fetchedAppSettingsQueryAppSettings;
        if (CrashShieldHandler.isObjectCrashing(UserSettingsManager.class)) {
            return;
        }
        try {
            if (advertiserIDCollectionEnabled.m197getValue() && (fetchedAppSettingsQueryAppSettings = FetchedAppSettingsManager.queryAppSettings(FacebookSdk.getApplicationId(), false)) != null && fetchedAppSettingsQueryAppSettings.getCodelessEventsEnabled()) {
                AttributionIdentifiers attributionIdentifiers = AttributionIdentifiers.Companion.getAttributionIdentifiers(FacebookSdk.getApplicationContext());
                String androidAdvertiserId = (attributionIdentifiers == null || attributionIdentifiers.getAndroidAdvertiserId() == null) ? null : attributionIdentifiers.getAndroidAdvertiserId();
                if (androidAdvertiserId != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString(ADVERTISER_ID_KEY, androidAdvertiserId);
                    bundle.putString("fields", EVENTS_CODELESS_SETUP_ENABLED);
                    GraphRequest graphRequestNewGraphPathRequest = GraphRequest.Companion.newGraphPathRequest(null, "app", null);
                    graphRequestNewGraphPathRequest.setParameters(bundle);
                    JSONObject jSONObject = graphRequestNewGraphPathRequest.executeAndWait().getJSONObject();
                    if (jSONObject != null) {
                        UserSetting userSetting = codelessSetupEnabled;
                        userSetting.setValue(Boolean.valueOf(jSONObject.optBoolean(EVENTS_CODELESS_SETUP_ENABLED, false)));
                        userSetting.setLastTS(j10);
                        INSTANCE.writeSettingToCache(userSetting);
                    }
                }
            }
            isFetchingCodelessStatus.set(false);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, UserSettingsManager.class);
        }
    }

    private final void initializeIfNotInitialized() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            if (FacebookSdk.isInitialized() && isInitialized.compareAndSet(false, true)) {
                SharedPreferences sharedPreferences = FacebookSdk.getApplicationContext().getSharedPreferences(USER_SETTINGS, 0);
                kotlin.jvm.internal.t.e(sharedPreferences, "getApplicationContext()\n…GS, Context.MODE_PRIVATE)");
                userSettingPref = sharedPreferences;
                initializeUserSetting(autoLogAppEventsEnabledLocally, advertiserIDCollectionEnabled, autoInitEnabled);
                initializeCodelessSetupEnabledAsync();
                logWarnings();
                logIfSDKSettingsChanged();
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private final void initializeUserSetting(UserSetting... userSettingArr) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            for (UserSetting userSetting : userSettingArr) {
                if (userSetting == codelessSetupEnabled) {
                    initializeCodelessSetupEnabledAsync();
                } else if (userSetting.getValue() == null) {
                    readSettingFromCache(userSetting);
                    if (userSetting.getValue() == null) {
                        loadSettingFromManifest(userSetting);
                    }
                } else {
                    writeSettingToCache(userSetting);
                }
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private final Boolean loadAutoLogAppEventsSettingFromManifest() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            validateInitialized();
            try {
                Context applicationContext = FacebookSdk.getApplicationContext();
                ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
                kotlin.jvm.internal.t.e(applicationInfo, "ctx.packageManager.getAp…ageManager.GET_META_DATA)");
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    UserSetting userSetting = autoLogAppEventsEnabledLocally;
                    if (bundle.containsKey(userSetting.getKey())) {
                        return Boolean.valueOf(applicationInfo.metaData.getBoolean(userSetting.getKey()));
                    }
                }
            } catch (PackageManager.NameNotFoundException e10) {
                Utility.logd(TAG, e10);
            }
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    private final void loadSettingFromManifest(UserSetting userSetting) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            validateInitialized();
            try {
                Context applicationContext = FacebookSdk.getApplicationContext();
                ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
                kotlin.jvm.internal.t.e(applicationInfo, "ctx.packageManager.getAp…ageManager.GET_META_DATA)");
                Bundle bundle = applicationInfo.metaData;
                if (bundle == null || !bundle.containsKey(userSetting.getKey())) {
                    return;
                }
                userSetting.setValue(Boolean.valueOf(applicationInfo.metaData.getBoolean(userSetting.getKey(), userSetting.getDefaultVal())));
                return;
            } catch (PackageManager.NameNotFoundException e10) {
                Utility.logd(TAG, e10);
                return;
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
        CrashShieldHandler.handleThrowable(th, this);
    }

    public static final void logIfAutoAppLinkEnabled() {
        if (CrashShieldHandler.isObjectCrashing(UserSettingsManager.class)) {
            return;
        }
        try {
            Context applicationContext = FacebookSdk.getApplicationContext();
            ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
            kotlin.jvm.internal.t.e(applicationInfo, "ctx.packageManager.getAp…ageManager.GET_META_DATA)");
            Bundle bundle = applicationInfo.metaData;
            if (bundle == null || !bundle.getBoolean("com.facebook.sdk.AutoAppLinkEnabled", false)) {
                return;
            }
            InternalAppEventsLogger internalAppEventsLogger = new InternalAppEventsLogger(applicationContext);
            Bundle bundle2 = new Bundle();
            if (!Utility.isAutoAppLinkSetup()) {
                bundle2.putString("SchemeWarning", AUTO_APP_LINK_WARNING);
                Log.w(TAG, AUTO_APP_LINK_WARNING);
            }
            internalAppEventsLogger.logEvent("fb_auto_applink", bundle2);
        } catch (PackageManager.NameNotFoundException unused) {
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, UserSettingsManager.class);
        }
    }

    private final void logIfSDKSettingsChanged() {
        int i10;
        int i11;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            if (isInitialized.get() && FacebookSdk.isInitialized()) {
                Context applicationContext = FacebookSdk.getApplicationContext();
                int i12 = 0;
                int i13 = ((autoInitEnabled.m197getValue() ? 1 : 0) << 0) | 0 | ((autoLogAppEventsEnabledLocally.m197getValue() ? 1 : 0) << 1) | ((advertiserIDCollectionEnabled.m197getValue() ? 1 : 0) << 2) | ((monitorEnabled.m197getValue() ? 1 : 0) << 3);
                SharedPreferences sharedPreferences = userSettingPref;
                SharedPreferences sharedPreferences2 = null;
                if (sharedPreferences == null) {
                    kotlin.jvm.internal.t.u("userSettingPref");
                    sharedPreferences = null;
                }
                int i14 = sharedPreferences.getInt(USER_SETTINGS_BITMASK, 0);
                if (i14 != i13) {
                    SharedPreferences sharedPreferences3 = userSettingPref;
                    if (sharedPreferences3 == null) {
                        kotlin.jvm.internal.t.u("userSettingPref");
                    } else {
                        sharedPreferences2 = sharedPreferences3;
                    }
                    sharedPreferences2.edit().putInt(USER_SETTINGS_BITMASK, i13).apply();
                    try {
                        ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
                        kotlin.jvm.internal.t.e(applicationInfo, "ctx.packageManager.getAp…ageManager.GET_META_DATA)");
                        if (applicationInfo.metaData != null) {
                            String[] strArr = {FacebookSdk.AUTO_INIT_ENABLED_PROPERTY, FacebookSdk.AUTO_LOG_APP_EVENTS_ENABLED_PROPERTY, FacebookSdk.ADVERTISER_ID_COLLECTION_ENABLED_PROPERTY, FacebookSdk.MONITOR_ENABLED_PROPERTY};
                            boolean[] zArr = {true, true, true, true};
                            i11 = 0;
                            i10 = 0;
                            for (int i15 = 0; i15 < 4; i15++) {
                                try {
                                    i10 |= (applicationInfo.metaData.containsKey(strArr[i15]) ? 1 : 0) << i15;
                                    i11 |= (applicationInfo.metaData.getBoolean(strArr[i15], zArr[i15]) ? 1 : 0) << i15;
                                } catch (PackageManager.NameNotFoundException unused) {
                                    i12 = i11;
                                    i11 = i12;
                                    i12 = i10;
                                    InternalAppEventsLogger internalAppEventsLogger = new InternalAppEventsLogger(applicationContext);
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("usage", i12);
                                    bundle.putInt("initial", i11);
                                    bundle.putInt("previous", i14);
                                    bundle.putInt("current", i13);
                                    internalAppEventsLogger.logChangedSettingsEvent(bundle);
                                }
                            }
                            i12 = i10;
                        } else {
                            i11 = 0;
                        }
                    } catch (PackageManager.NameNotFoundException unused2) {
                        i10 = 0;
                    }
                    InternalAppEventsLogger internalAppEventsLogger2 = new InternalAppEventsLogger(applicationContext);
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("usage", i12);
                    bundle2.putInt("initial", i11);
                    bundle2.putInt("previous", i14);
                    bundle2.putInt("current", i13);
                    internalAppEventsLogger2.logChangedSettingsEvent(bundle2);
                }
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private final void logWarnings() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            Context applicationContext = FacebookSdk.getApplicationContext();
            ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
            kotlin.jvm.internal.t.e(applicationInfo, "ctx.packageManager.getAp…ageManager.GET_META_DATA)");
            Bundle bundle = applicationInfo.metaData;
            if (bundle != null) {
                if (!bundle.containsKey(FacebookSdk.ADVERTISER_ID_COLLECTION_ENABLED_PROPERTY)) {
                    Log.w(TAG, ADVERTISERID_COLLECTION_NOT_SET_WARNING);
                }
                if (getAdvertiserIDCollectionEnabled()) {
                    return;
                }
                Log.w(TAG, ADVERTISERID_COLLECTION_FALSE_WARNING);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private static final Boolean readAutoLogAppEventsSettingFromCache() {
        String str = "";
        if (CrashShieldHandler.isObjectCrashing(UserSettingsManager.class)) {
            return null;
        }
        try {
            INSTANCE.validateInitialized();
            try {
                SharedPreferences sharedPreferences = userSettingPref;
                if (sharedPreferences == null) {
                    kotlin.jvm.internal.t.u("userSettingPref");
                    sharedPreferences = null;
                }
                String string = sharedPreferences.getString(autoLogAppEventsEnabledLocally.getKey(), "");
                if (string != null) {
                    str = string;
                }
                if (str.length() > 0) {
                    return Boolean.valueOf(new JSONObject(str).getBoolean("value"));
                }
            } catch (JSONException e10) {
                Utility.logd(TAG, e10);
            }
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, UserSettingsManager.class);
            return null;
        }
    }

    private final void readSettingFromCache(UserSetting userSetting) {
        String str = "";
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            validateInitialized();
            try {
                SharedPreferences sharedPreferences = userSettingPref;
                if (sharedPreferences == null) {
                    kotlin.jvm.internal.t.u("userSettingPref");
                    sharedPreferences = null;
                }
                String string = sharedPreferences.getString(userSetting.getKey(), "");
                if (string != null) {
                    str = string;
                }
                if (str.length() > 0) {
                    JSONObject jSONObject = new JSONObject(str);
                    userSetting.setValue(Boolean.valueOf(jSONObject.getBoolean("value")));
                    userSetting.setLastTS(jSONObject.getLong(LAST_TIMESTAMP));
                }
            } catch (JSONException e10) {
                Utility.logd(TAG, e10);
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public static final void setAddToMessagingCustomerBaseForWhatsApp(Boolean bool) {
        if (CrashShieldHandler.isObjectCrashing(UserSettingsManager.class)) {
            return;
        }
        try {
            INSTANCE.initializeIfNotInitialized();
            SharedPreferences sharedPreferences = null;
            if (bool != null) {
                SharedPreferences sharedPreferences2 = userSettingPref;
                if (sharedPreferences2 == null) {
                    kotlin.jvm.internal.t.u("userSettingPref");
                } else {
                    sharedPreferences = sharedPreferences2;
                }
                sharedPreferences.edit().putBoolean(ADD_TO_MESSAGING_CUSTOMER_BASE_FOR_WHATSAPP_KEY, bool.booleanValue()).apply();
                return;
            }
            SharedPreferences sharedPreferences3 = userSettingPref;
            if (sharedPreferences3 == null) {
                kotlin.jvm.internal.t.u("userSettingPref");
            } else {
                sharedPreferences = sharedPreferences3;
            }
            sharedPreferences.edit().remove(ADD_TO_MESSAGING_CUSTOMER_BASE_FOR_WHATSAPP_KEY).apply();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, UserSettingsManager.class);
        }
    }

    public static final void setAdvertiserIDCollectionEnabled(boolean z10) {
        if (CrashShieldHandler.isObjectCrashing(UserSettingsManager.class)) {
            return;
        }
        try {
            UserSetting userSetting = advertiserIDCollectionEnabled;
            userSetting.setValue(Boolean.valueOf(z10));
            userSetting.setLastTS(System.currentTimeMillis());
            if (isInitialized.get()) {
                INSTANCE.writeSettingToCache(userSetting);
            } else {
                INSTANCE.initializeIfNotInitialized();
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, UserSettingsManager.class);
        }
    }

    public static final void setAutoInitEnabled(boolean z10) {
        if (CrashShieldHandler.isObjectCrashing(UserSettingsManager.class)) {
            return;
        }
        try {
            UserSetting userSetting = autoInitEnabled;
            userSetting.setValue(Boolean.valueOf(z10));
            userSetting.setLastTS(System.currentTimeMillis());
            if (isInitialized.get()) {
                INSTANCE.writeSettingToCache(userSetting);
            } else {
                INSTANCE.initializeIfNotInitialized();
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, UserSettingsManager.class);
        }
    }

    public static final void setAutoLogAppEventsEnabled(boolean z10) {
        if (CrashShieldHandler.isObjectCrashing(UserSettingsManager.class)) {
            return;
        }
        try {
            UserSetting userSetting = autoLogAppEventsEnabledLocally;
            userSetting.setValue(Boolean.valueOf(z10));
            userSetting.setLastTS(System.currentTimeMillis());
            if (isInitialized.get()) {
                INSTANCE.writeSettingToCache(userSetting);
            } else {
                INSTANCE.initializeIfNotInitialized();
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, UserSettingsManager.class);
        }
    }

    public static final void setMonitorEnabled(boolean z10) {
        if (CrashShieldHandler.isObjectCrashing(UserSettingsManager.class)) {
            return;
        }
        try {
            UserSetting userSetting = monitorEnabled;
            userSetting.setValue(Boolean.valueOf(z10));
            userSetting.setLastTS(System.currentTimeMillis());
            if (isInitialized.get()) {
                INSTANCE.writeSettingToCache(userSetting);
            } else {
                INSTANCE.initializeIfNotInitialized();
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, UserSettingsManager.class);
        }
    }

    private final void validateInitialized() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            if (isInitialized.get()) {
            } else {
                throw new FacebookSdkNotInitializedException("The UserSettingManager has not been initialized successfully");
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private final void writeSettingToCache(UserSetting userSetting) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            validateInitialized();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("value", userSetting.getValue());
                jSONObject.put(LAST_TIMESTAMP, userSetting.getLastTS());
                SharedPreferences sharedPreferences = userSettingPref;
                if (sharedPreferences == null) {
                    kotlin.jvm.internal.t.u("userSettingPref");
                    sharedPreferences = null;
                }
                sharedPreferences.edit().putString(userSetting.getKey(), jSONObject.toString()).apply();
                logIfSDKSettingsChanged();
            } catch (Exception e10) {
                Utility.logd(TAG, e10);
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }
}
