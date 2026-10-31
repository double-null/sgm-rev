package com.facebook;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.AsyncTask;
import android.util.Base64;
import android.util.Log;
import com.applovin.impl.communicator.ZREl.sRGQSqxgxlS;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.AppEventsLoggerImpl;
import com.facebook.appevents.AppEventsManager;
import com.facebook.appevents.iap.InAppPurchaseLoggerManager;
import com.facebook.appevents.internal.ActivityLifecycleTracker;
import com.facebook.appevents.internal.AppEventsLoggerUtility;
import com.facebook.appevents.internal.AppLinkManager;
import com.facebook.appevents.ondeviceprocessing.OnDeviceProcessingManager;
import com.facebook.internal.AttributionIdentifiers;
import com.facebook.internal.BoltsMeasurementEventListener;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.FetchedAppGateKeepersManager;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.LockOnGetVariable;
import com.facebook.internal.Logger;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.ServerProtocol;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import com.facebook.internal.instrument.InstrumentManager;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.vungle.ads.internal.persistence.mP.RHIpdOnfgiYkEj;
import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.u0;
import kotlin.jvm.internal.l0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import rd.c0;
import wc.g0;

/* JADX INFO: compiled from: FacebookSdk.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class FacebookSdk {
    public static final String ADVERTISER_ID_COLLECTION_ENABLED_PROPERTY = "com.facebook.sdk.AdvertiserIDCollectionEnabled";
    public static final String APPLICATION_ID_PROPERTY = "com.facebook.sdk.ApplicationId";
    public static final String APPLICATION_INTENT_URI_PACKAGE_TARGET = "com.facebook.sdk.IntentUriPackageTarget";
    public static final String APPLICATION_NAME_PROPERTY = "com.facebook.sdk.ApplicationName";
    public static final String APPLICATION_REDIRECT_URI = "com.facebook.sdk.RedirectURI";
    public static final String APP_EVENT_PREFERENCES = "com.facebook.sdk.appEventPreferences";
    private static final String ATTRIBUTION_PREFERENCES = "com.facebook.sdk.attributionTracking";
    public static final String AUTO_INIT_ENABLED_PROPERTY = "com.facebook.sdk.AutoInitEnabled";
    public static final String AUTO_LOG_APP_EVENTS_ENABLED_PROPERTY = "com.facebook.sdk.AutoLogAppEventsEnabled";
    public static final String CALLBACK_OFFSET_CHANGED_AFTER_INIT = "The callback request code offset can't be updated once the SDK is initialized. Call FacebookSdk.setCallbackRequestCodeOffset inside your Application.onCreate method";
    public static final String CALLBACK_OFFSET_NEGATIVE = "The callback request code offset can't be negative.";
    public static final String CALLBACK_OFFSET_PROPERTY = "com.facebook.sdk.CallbackOffset";
    public static final String CLIENT_TOKEN_PROPERTY = "com.facebook.sdk.ClientToken";
    public static final String CLOUDBRIDGE_SAVED_CREDENTIALS = "com.facebook.sdk.CloudBridgeSavedCredentials";
    public static final String CODELESS_DEBUG_LOG_ENABLED_PROPERTY = "com.facebook.sdk.CodelessDebugLogEnabled";
    public static final String DATA_PROCESSING_OPTIONS = "data_processing_options";
    public static final String DATA_PROCESSING_OPTIONS_COUNTRY = "data_processing_options_country";
    public static final String DATA_PROCESSING_OPTIONS_PREFERENCES = "com.facebook.sdk.DataProcessingOptions";
    public static final String DATA_PROCESSING_OPTIONS_STATE = "data_processing_options_state";
    public static final String FB_GG = "fb.gg";
    public static final String GAMING = "gaming";
    public static final String INSTAGRAM = "instagram";
    private static final int MAX_REQUEST_CODE_RANGE = 100;
    public static final String MONITOR_ENABLED_PROPERTY = "com.facebook.sdk.MonitorEnabled";
    private static final String PUBLISH_ACTIVITY_PATH = "%s/activities";
    public static final String WEB_DIALOG_THEME = "com.facebook.sdk.WebDialogTheme";
    private static volatile String appClientToken;
    private static Context applicationContext;
    private static volatile String applicationId;
    private static volatile String applicationName;
    public static boolean bypassAppSwitch;
    private static LockOnGetVariable<File> cacheDir;
    private static volatile Boolean codelessDebugLogEnabled;
    private static Executor executor;
    public static boolean hasCustomTabsPrefetching;
    public static boolean ignoreAppSwitchToLoggedOut;
    private static String intentUriPackageTarget;
    private static volatile boolean isDebugEnabledField;
    private static boolean isFullyInitialized;
    private static boolean isLegacyTokenUpgradeSupported;
    private static String redirectURI;
    public static final FacebookSdk INSTANCE = new FacebookSdk();
    private static final String TAG = FacebookSdk.class.getCanonicalName();
    private static final HashSet<LoggingBehavior> loggingBehaviors = u0.f(LoggingBehavior.DEVELOPER_ERRORS);
    private static AtomicLong onProgressThreshold = new AtomicLong(65536);
    private static final int DEFAULT_CALLBACK_REQUEST_CODE_OFFSET = 64206;
    private static int callbackRequestCodeOffset = DEFAULT_CALLBACK_REQUEST_CODE_OFFSET;
    private static final ReentrantLock LOCK = new ReentrantLock();
    private static String graphApiVersion = ServerProtocol.getDefaultAPIVersion();
    private static final AtomicBoolean sdkInitialized = new AtomicBoolean(false);
    public static final String INSTAGRAM_COM = "instagram.com";
    private static volatile String instagramDomain = INSTAGRAM_COM;
    public static final String FACEBOOK_COM = "facebook.com";
    private static volatile String facebookDomain = FACEBOOK_COM;
    private static GraphRequestCreator graphRequestCreator = new GraphRequestCreator() { // from class: com.facebook.s
        @Override // com.facebook.FacebookSdk.GraphRequestCreator
        public final GraphRequest createPostRequest(AccessToken accessToken, String str, JSONObject jSONObject, GraphRequest.Callback callback) {
            return FacebookSdk.graphRequestCreator$lambda$0(accessToken, str, jSONObject, callback);
        }
    };

    /* JADX INFO: compiled from: FacebookSdk.kt */
    /* JADX INFO: loaded from: classes.dex */
    public interface GraphRequestCreator {
        GraphRequest createPostRequest(AccessToken accessToken, String str, JSONObject jSONObject, GraphRequest.Callback callback);
    }

    /* JADX INFO: compiled from: FacebookSdk.kt */
    /* JADX INFO: loaded from: classes.dex */
    public interface InitializeCallback {
        void onInitialized();
    }

    private FacebookSdk() {
    }

    public static final void addLoggingBehavior(LoggingBehavior behavior) {
        kotlin.jvm.internal.t.f(behavior, "behavior");
        HashSet<LoggingBehavior> hashSet = loggingBehaviors;
        synchronized (hashSet) {
            hashSet.add(behavior);
            INSTANCE.updateGraphDebugBehavior();
            g0 g0Var = g0.f27756a;
        }
    }

    public static final void clearLoggingBehaviors() {
        HashSet<LoggingBehavior> hashSet = loggingBehaviors;
        synchronized (hashSet) {
            hashSet.clear();
            g0 g0Var = g0.f27756a;
        }
    }

    public static final void fullyInitialize() {
        isFullyInitialized = true;
    }

    public static final Boolean getAddToMessagingCustomerBaseForWhatsApp() {
        return UserSettingsManager.getAddToMessagingCustomerBaseForWhatsApp();
    }

    public static final boolean getAdvertiserIDCollectionEnabled() {
        return UserSettingsManager.getAdvertiserIDCollectionEnabled();
    }

    public static final Context getApplicationContext() {
        Validate.sdkInitialized();
        Context context = applicationContext;
        if (context != null) {
            return context;
        }
        kotlin.jvm.internal.t.u("applicationContext");
        return null;
    }

    public static final String getApplicationId() {
        Validate.sdkInitialized();
        String str = applicationId;
        if (str != null) {
            return str;
        }
        throw new FacebookException("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
    }

    public static final String getApplicationName() {
        Validate.sdkInitialized();
        return applicationName;
    }

    public static final String getApplicationSignature(Context context) {
        PackageManager packageManager;
        if (CrashShieldHandler.isObjectCrashing(FacebookSdk.class)) {
            return null;
        }
        try {
            Validate.sdkInitialized();
            if (context == null || (packageManager = context.getPackageManager()) == null) {
                return null;
            }
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 64);
                Signature[] signatureArr = packageInfo.signatures;
                if (signatureArr != null) {
                    if (!(signatureArr.length == 0)) {
                        MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
                        messageDigest.update(packageInfo.signatures[0].toByteArray());
                        return Base64.encodeToString(messageDigest.digest(), 9);
                    }
                }
            } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException unused) {
            }
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, FacebookSdk.class);
            return null;
        }
    }

    public static final boolean getAutoInitEnabled() {
        return UserSettingsManager.getAutoInitEnabled();
    }

    public static final boolean getAutoLogAppEventsEnabled() {
        return UserSettingsManager.getAutoLogAppEventsEnabled();
    }

    public static final File getCacheDir() {
        Validate.sdkInitialized();
        LockOnGetVariable<File> lockOnGetVariable = cacheDir;
        if (lockOnGetVariable == null) {
            kotlin.jvm.internal.t.u("cacheDir");
            lockOnGetVariable = null;
        }
        return lockOnGetVariable.getValue();
    }

    public static final int getCallbackRequestCodeOffset() {
        Validate.sdkInitialized();
        return callbackRequestCodeOffset;
    }

    public static final String getClientToken() {
        Validate.sdkInitialized();
        String str = appClientToken;
        if (str != null) {
            return str;
        }
        throw new FacebookException("A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information.");
    }

    public static final boolean getCodelessDebugLogEnabled() {
        Validate.sdkInitialized();
        Boolean bool = codelessDebugLogEnabled;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean getCodelessSetupEnabled() {
        return UserSettingsManager.getCodelessSetupEnabled();
    }

    public static final Executor getExecutor() {
        ReentrantLock reentrantLock = LOCK;
        reentrantLock.lock();
        try {
            if (executor == null) {
                executor = AsyncTask.THREAD_POOL_EXECUTOR;
            }
            g0 g0Var = g0.f27756a;
            reentrantLock.unlock();
            Executor executor2 = executor;
            if (executor2 != null) {
                return executor2;
            }
            throw new IllegalStateException("Required value was null.".toString());
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final String getFacebookDomain() {
        return facebookDomain;
    }

    public static final String getFacebookGamingDomain() {
        return "fb.gg";
    }

    public static final String getGraphApiVersion() {
        String str = TAG;
        l0 l0Var = l0.f21527a;
        String str2 = String.format("getGraphApiVersion: %s", Arrays.copyOf(new Object[]{graphApiVersion}, 1));
        kotlin.jvm.internal.t.e(str2, "format(format, *args)");
        Utility.logd(str, str2);
        return graphApiVersion;
    }

    public static final String getGraphDomain() {
        AccessToken currentAccessToken = AccessToken.Companion.getCurrentAccessToken();
        return Utility.getGraphDomainFromTokenDomain(currentAccessToken != null ? currentAccessToken.getGraphDomain() : null);
    }

    public static final String getInstagramDomain() {
        return instagramDomain;
    }

    public static final String getIntentUriPackageTarget() {
        Validate.sdkInitialized();
        String str = intentUriPackageTarget;
        return str == null ? "" : str;
    }

    public static final boolean getLimitEventAndDataUsage(Context context) {
        kotlin.jvm.internal.t.f(context, "context");
        Validate.sdkInitialized();
        return context.getSharedPreferences(APP_EVENT_PREFERENCES, 0).getBoolean("limitEventUsage", false);
    }

    public static final Set<LoggingBehavior> getLoggingBehaviors() {
        Set<LoggingBehavior> setUnmodifiableSet;
        HashSet<LoggingBehavior> hashSet = loggingBehaviors;
        synchronized (hashSet) {
            setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(hashSet));
            kotlin.jvm.internal.t.e(setUnmodifiableSet, "unmodifiableSet(HashSet(loggingBehaviors))");
        }
        return setUnmodifiableSet;
    }

    public static final boolean getMonitorEnabled() {
        return UserSettingsManager.getMonitorEnabled();
    }

    public static final long getOnProgressThreshold() {
        Validate.sdkInitialized();
        return onProgressThreshold.get();
    }

    public static final String getRedirectURI() {
        Validate.sdkInitialized();
        String str = redirectURI;
        return str == null ? "" : str;
    }

    public static final String getSdkVersion() {
        return FacebookSdkVersion.BUILD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GraphRequest graphRequestCreator$lambda$0(AccessToken accessToken, String str, JSONObject jSONObject, GraphRequest.Callback callback) {
        return GraphRequest.Companion.newPostRequest(accessToken, str, jSONObject, callback);
    }

    public static final boolean isDebugEnabled() {
        return isDebugEnabledField;
    }

    public static final boolean isFacebookRequestCode(int i10) {
        int i11 = callbackRequestCodeOffset;
        return i10 >= i11 && i10 < i11 + 100;
    }

    public static final synchronized boolean isFullyInitialized() {
        return isFullyInitialized;
    }

    public static final boolean isInitialized() {
        return sdkInitialized.get();
    }

    public static final boolean isLegacyTokenUpgradeSupported() {
        return isLegacyTokenUpgradeSupported;
    }

    public static final boolean isLoggingBehaviorEnabled(LoggingBehavior behavior) {
        boolean z10;
        kotlin.jvm.internal.t.f(behavior, "behavior");
        HashSet<LoggingBehavior> hashSet = loggingBehaviors;
        synchronized (hashSet) {
            z10 = isDebugEnabled() && hashSet.contains(behavior);
        }
        return z10;
    }

    public static final void loadDefaultsFromMetadata$facebook_core_release(Context context) {
        if (context == null) {
            return;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            kotlin.jvm.internal.t.e(applicationInfo, "try {\n                co…     return\n            }");
            if (applicationInfo.metaData == null) {
                return;
            }
            if (applicationId == null) {
                Object obj = applicationInfo.metaData.get(APPLICATION_ID_PROPERTY);
                if (obj instanceof String) {
                    String str = (String) obj;
                    Locale ROOT = Locale.ROOT;
                    kotlin.jvm.internal.t.e(ROOT, "ROOT");
                    String lowerCase = str.toLowerCase(ROOT);
                    kotlin.jvm.internal.t.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    if (c0.O(lowerCase, "fb", false, 2, null)) {
                        String strSubstring = str.substring(2);
                        kotlin.jvm.internal.t.e(strSubstring, "this as java.lang.String).substring(startIndex)");
                        applicationId = strSubstring;
                    } else {
                        applicationId = str;
                    }
                } else if (obj instanceof Number) {
                    throw new FacebookException("App Ids cannot be directly placed in the manifest.They must be prefixed by 'fb' or be placed in the string resource file.");
                }
            }
            redirectURI = applicationInfo.metaData.getString(APPLICATION_REDIRECT_URI);
            intentUriPackageTarget = applicationInfo.metaData.getString(APPLICATION_INTENT_URI_PACKAGE_TARGET);
            if (applicationName == null) {
                applicationName = applicationInfo.metaData.getString(APPLICATION_NAME_PROPERTY);
            }
            if (appClientToken == null) {
                appClientToken = applicationInfo.metaData.getString(CLIENT_TOKEN_PROPERTY);
            }
            if (callbackRequestCodeOffset == DEFAULT_CALLBACK_REQUEST_CODE_OFFSET) {
                callbackRequestCodeOffset = applicationInfo.metaData.getInt(CALLBACK_OFFSET_PROPERTY, DEFAULT_CALLBACK_REQUEST_CODE_OFFSET);
            }
            if (codelessDebugLogEnabled == null) {
                codelessDebugLogEnabled = Boolean.valueOf(applicationInfo.metaData.getBoolean(CODELESS_DEBUG_LOG_ENABLED_PROPERTY, false));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static final void publishInstallAsync(Context context, final String applicationId2) {
        if (CrashShieldHandler.isObjectCrashing(FacebookSdk.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.t.f(context, "context");
            kotlin.jvm.internal.t.f(applicationId2, "applicationId");
            final Context applicationContext2 = context.getApplicationContext();
            if (applicationContext2 == null) {
                return;
            }
            if (!FetchedAppGateKeepersManager.getGateKeeperForKey(AppEventsLoggerImpl.APP_EVENTS_KILLSWITCH, getApplicationId(), false)) {
                getExecutor().execute(new Runnable() { // from class: com.facebook.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        FacebookSdk.publishInstallAsync$lambda$15(applicationContext2, applicationId2);
                    }
                });
            }
            if (FeatureManager.isEnabled(FeatureManager.Feature.OnDeviceEventProcessing) && OnDeviceProcessingManager.isOnDeviceProcessingEnabled()) {
                OnDeviceProcessingManager.sendInstallEventAsync(applicationId2, ATTRIBUTION_PREFERENCES);
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, FacebookSdk.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void publishInstallAsync$lambda$15(Context applicationContext2, String applicationId2) {
        kotlin.jvm.internal.t.f(applicationContext2, "$applicationContext");
        kotlin.jvm.internal.t.f(applicationId2, "$applicationId");
        INSTANCE.publishInstallAndWaitForResponse(applicationContext2, applicationId2);
    }

    public static final void removeLoggingBehavior(LoggingBehavior behavior) {
        kotlin.jvm.internal.t.f(behavior, "behavior");
        HashSet<LoggingBehavior> hashSet = loggingBehaviors;
        synchronized (hashSet) {
            hashSet.remove(behavior);
        }
    }

    public static final synchronized void sdkInitialize(Context applicationContext2, int i10) {
        kotlin.jvm.internal.t.f(applicationContext2, "applicationContext");
        sdkInitialize(applicationContext2, i10, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final File sdkInitialize$lambda$3() {
        Context context = applicationContext;
        if (context == null) {
            kotlin.jvm.internal.t.u("applicationContext");
            context = null;
        }
        return context.getCacheDir();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sdkInitialize$lambda$4(boolean z10) {
        if (z10) {
            InstrumentManager.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sdkInitialize$lambda$5(boolean z10) {
        if (z10) {
            AppEventsManager.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sdkInitialize$lambda$6(boolean z10) {
        if (z10) {
            hasCustomTabsPrefetching = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sdkInitialize$lambda$7(boolean z10) {
        if (z10) {
            ignoreAppSwitchToLoggedOut = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sdkInitialize$lambda$8(boolean z10) {
        if (z10) {
            bypassAppSwitch = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void sdkInitialize$lambda$9(InitializeCallback initializeCallback) {
        AccessTokenManager.Companion.getInstance().loadCurrentAccessToken();
        ProfileManager.Companion.getInstance().loadCurrentProfile();
        if (AccessToken.Companion.isCurrentAccessTokenActive()) {
            Profile.Companion companion = Profile.Companion;
            if (companion.getCurrentProfile() == null) {
                companion.fetchProfileForCurrentAccessToken();
            }
        }
        if (initializeCallback != null) {
            initializeCallback.onInitialized();
        }
        AppEventsLogger.Companion companion2 = AppEventsLogger.Companion;
        companion2.initializeLib(getApplicationContext(), applicationId);
        UserSettingsManager.logIfAutoAppLinkEnabled();
        Context applicationContext2 = getApplicationContext().getApplicationContext();
        kotlin.jvm.internal.t.e(applicationContext2, "getApplicationContext().applicationContext");
        companion2.newLogger(applicationContext2).flush();
        return null;
    }

    public static final void setAddToMessagingCustomerBaseForWhatsApp(Boolean bool) {
        UserSettingsManager.setAddToMessagingCustomerBaseForWhatsApp(bool);
    }

    public static final void setAdvertiserIDCollectionEnabled(boolean z10) {
        UserSettingsManager.setAdvertiserIDCollectionEnabled(z10);
    }

    public static final void setApplicationId(String applicationId2) {
        kotlin.jvm.internal.t.f(applicationId2, "applicationId");
        Validate.notEmpty(applicationId2, "applicationId");
        applicationId = applicationId2;
    }

    public static final void setApplicationName(String str) {
        applicationName = str;
    }

    public static final void setAutoInitEnabled(boolean z10) {
        UserSettingsManager.setAutoInitEnabled(z10);
        if (z10) {
            fullyInitialize();
        }
    }

    public static final void setAutoLogAppEventsEnabled(boolean z10) {
        UserSettingsManager.setAutoLogAppEventsEnabled(z10);
        if (z10) {
            Context applicationContext2 = getApplicationContext();
            kotlin.jvm.internal.t.d(applicationContext2, "null cannot be cast to non-null type android.app.Application");
            ActivityLifecycleTracker.startTracking((Application) applicationContext2, getApplicationId());
        }
    }

    public static final void setCacheDir(File cacheDir2) {
        kotlin.jvm.internal.t.f(cacheDir2, "cacheDir");
        cacheDir = new LockOnGetVariable<>(cacheDir2);
    }

    public static final void setClientToken(String str) {
        appClientToken = str;
    }

    public static final void setCodelessDebugLogEnabled(boolean z10) {
        codelessDebugLogEnabled = Boolean.valueOf(z10);
    }

    public static final void setDataProcessingOptions(String[] strArr) {
        if (CrashShieldHandler.isObjectCrashing(FacebookSdk.class)) {
            return;
        }
        try {
            setDataProcessingOptions(strArr, 0, 0);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, FacebookSdk.class);
        }
    }

    public static final void setExecutor(Executor executor2) {
        kotlin.jvm.internal.t.f(executor2, "executor");
        ReentrantLock reentrantLock = LOCK;
        reentrantLock.lock();
        try {
            executor = executor2;
            g0 g0Var = g0.f27756a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final void setFacebookDomain(String facebookDomain2) {
        kotlin.jvm.internal.t.f(facebookDomain2, "facebookDomain");
        Log.w(TAG, "WARNING: Calling setFacebookDomain from non-DEBUG code.");
        facebookDomain = facebookDomain2;
    }

    public static final void setGraphApiVersion(String graphApiVersion2) {
        kotlin.jvm.internal.t.f(graphApiVersion2, "graphApiVersion");
        Log.w(TAG, "WARNING: Calling setGraphApiVersion from non-DEBUG code.");
        if (Utility.isNullOrEmpty(graphApiVersion2) || kotlin.jvm.internal.t.a(graphApiVersion, graphApiVersion2)) {
            return;
        }
        graphApiVersion = graphApiVersion2;
    }

    public static final void setGraphRequestCreator$facebook_core_release(GraphRequestCreator graphRequestCreator2) {
        kotlin.jvm.internal.t.f(graphRequestCreator2, "graphRequestCreator");
        graphRequestCreator = graphRequestCreator2;
    }

    public static final void setIsDebugEnabled(boolean z10) {
        isDebugEnabledField = z10;
    }

    public static final void setLegacyTokenUpgradeSupported(boolean z10) {
        isLegacyTokenUpgradeSupported = z10;
    }

    public static final void setMonitorEnabled(boolean z10) {
        UserSettingsManager.setMonitorEnabled(z10);
    }

    public static final void setOnProgressThreshold(long j10) {
        onProgressThreshold.set(j10);
    }

    private final void updateGraphDebugBehavior() {
        HashSet<LoggingBehavior> hashSet = loggingBehaviors;
        if (hashSet.contains(LoggingBehavior.GRAPH_API_DEBUG_INFO)) {
            LoggingBehavior loggingBehavior = LoggingBehavior.GRAPH_API_DEBUG_WARNING;
            if (hashSet.contains(loggingBehavior)) {
                return;
            }
            hashSet.add(loggingBehavior);
        }
    }

    public static final void setLimitEventAndDataUsage(Context context, boolean z10) {
        kotlin.jvm.internal.t.f(context, RHIpdOnfgiYkEj.QcpsO);
        context.getSharedPreferences(APP_EVENT_PREFERENCES, 0).edit().putBoolean("limitEventUsage", z10).apply();
    }

    private final void publishInstallAndWaitForResponse(Context context, String str) {
        try {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                AttributionIdentifiers attributionIdentifiers = AttributionIdentifiers.Companion.getAttributionIdentifiers(context);
                SharedPreferences sharedPreferences = context.getSharedPreferences(ATTRIBUTION_PREFERENCES, 0);
                String str2 = str + "ping";
                long j10 = sharedPreferences.getLong(str2, 0L);
                try {
                    JSONObject jSONObjectForGraphAPICall = AppEventsLoggerUtility.getJSONObjectForGraphAPICall(AppEventsLoggerUtility.GraphAPIActivityType.MOBILE_INSTALL_EVENT, attributionIdentifiers, AppEventsLogger.Companion.getAnonymousAppDeviceGUID(context), getLimitEventAndDataUsage(context), context);
                    String installReferrer = AppEventsLoggerImpl.Companion.getInstallReferrer();
                    if (installReferrer != null) {
                        jSONObjectForGraphAPICall.put(sRGQSqxgxlS.VYUBCBvaPsclkK, installReferrer);
                    }
                    l0 l0Var = l0.f21527a;
                    String str3 = String.format(PUBLISH_ACTIVITY_PATH, Arrays.copyOf(new Object[]{str}, 1));
                    kotlin.jvm.internal.t.e(str3, "format(format, *args)");
                    GraphRequest graphRequestCreatePostRequest = graphRequestCreator.createPostRequest(null, str3, jSONObjectForGraphAPICall, null);
                    if (j10 == 0 && graphRequestCreatePostRequest.executeAndWait().getError() == null) {
                        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                        editorEdit.putLong(str2, System.currentTimeMillis());
                        editorEdit.apply();
                        Logger.Companion companion = Logger.Companion;
                        LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
                        String TAG2 = TAG;
                        kotlin.jvm.internal.t.e(TAG2, "TAG");
                        companion.log(loggingBehavior, TAG2, "MOBILE_APP_INSTALL has been logged");
                    }
                } catch (JSONException e10) {
                    throw new FacebookException("An error occurred while publishing install.", e10);
                }
            } catch (Exception e11) {
                Utility.logd("Facebook-publish", e11);
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public static final synchronized void sdkInitialize(Context applicationContext2, int i10, InitializeCallback initializeCallback) {
        kotlin.jvm.internal.t.f(applicationContext2, "applicationContext");
        if (sdkInitialized.get() && i10 != callbackRequestCodeOffset) {
            throw new FacebookException(CALLBACK_OFFSET_CHANGED_AFTER_INIT);
        }
        if (i10 >= 0) {
            callbackRequestCodeOffset = i10;
            sdkInitialize(applicationContext2, initializeCallback);
        } else {
            throw new FacebookException(CALLBACK_OFFSET_NEGATIVE);
        }
    }

    public static final void setDataProcessingOptions(String[] strArr, int i10, int i11) {
        if (CrashShieldHandler.isObjectCrashing(FacebookSdk.class)) {
            return;
        }
        if (strArr == null) {
            try {
                strArr = new String[0];
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, FacebookSdk.class);
                return;
            }
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(DATA_PROCESSING_OPTIONS, new JSONArray((Collection) kotlin.collections.o.W(strArr)));
            jSONObject.put(DATA_PROCESSING_OPTIONS_COUNTRY, i10);
            jSONObject.put(DATA_PROCESSING_OPTIONS_STATE, i11);
            Context context = applicationContext;
            if (context == null) {
                kotlin.jvm.internal.t.u("applicationContext");
                context = null;
            }
            context.getSharedPreferences(DATA_PROCESSING_OPTIONS_PREFERENCES, 0).edit().putString(DATA_PROCESSING_OPTIONS, jSONObject.toString()).apply();
        } catch (JSONException unused) {
        }
    }

    public static final synchronized void sdkInitialize(Context applicationContext2) {
        kotlin.jvm.internal.t.f(applicationContext2, "applicationContext");
        sdkInitialize(applicationContext2, (InitializeCallback) null);
    }

    public static final synchronized void sdkInitialize(Context applicationContext2, final InitializeCallback initializeCallback) {
        kotlin.jvm.internal.t.f(applicationContext2, "applicationContext");
        if (sdkInitialized.get()) {
            if (initializeCallback != null) {
                initializeCallback.onInitialized();
            }
            return;
        }
        try {
            FacebookActivity.Companion companion = FacebookActivity.Companion;
            Validate.hasFacebookActivity(applicationContext2, false);
        } catch (ClassNotFoundException unused) {
        }
        Validate.hasInternetPermissions(applicationContext2, false);
        Context applicationContext3 = applicationContext2.getApplicationContext();
        kotlin.jvm.internal.t.e(applicationContext3, "applicationContext.applicationContext");
        applicationContext = applicationContext3;
        AppEventsLogger.Companion.getAnonymousAppDeviceGUID(applicationContext2);
        Context context = applicationContext;
        Context context2 = null;
        if (context == null) {
            kotlin.jvm.internal.t.u("applicationContext");
            context = null;
        }
        loadDefaultsFromMetadata$facebook_core_release(context);
        String str = applicationId;
        if (!(str == null || str.length() == 0)) {
            String str2 = appClientToken;
            if (!(str2 == null || str2.length() == 0)) {
                sdkInitialized.set(true);
                if (getAutoInitEnabled()) {
                    fullyInitialize();
                }
                Context context3 = applicationContext;
                if (context3 == null) {
                    kotlin.jvm.internal.t.u("applicationContext");
                    context3 = null;
                }
                if ((context3 instanceof Application) && UserSettingsManager.getAutoLogAppEventsEnabled()) {
                    Context context4 = applicationContext;
                    if (context4 == null) {
                        kotlin.jvm.internal.t.u("applicationContext");
                        context4 = null;
                    }
                    ActivityLifecycleTracker.startTracking((Application) context4, applicationId);
                } else {
                    InAppPurchaseLoggerManager.updateLatestPossiblePurchaseTime();
                }
                AppLinkManager companion2 = AppLinkManager.Companion.getInstance();
                if (companion2 != null) {
                    Context context5 = applicationContext;
                    if (context5 == null) {
                        kotlin.jvm.internal.t.u("applicationContext");
                        context5 = null;
                    }
                    companion2.setupLifecycleListener((Application) context5);
                }
                FetchedAppSettingsManager.loadAppSettingsAsync();
                NativeProtocol.updateAllAvailableProtocolVersionsAsync();
                BoltsMeasurementEventListener.Companion companion3 = BoltsMeasurementEventListener.Companion;
                Context context6 = applicationContext;
                if (context6 == null) {
                    kotlin.jvm.internal.t.u("applicationContext");
                } else {
                    context2 = context6;
                }
                companion3.getInstance(context2);
                cacheDir = new LockOnGetVariable<>(new Callable() { // from class: com.facebook.l
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return FacebookSdk.sdkInitialize$lambda$3();
                    }
                });
                FeatureManager.checkFeature(FeatureManager.Feature.Instrument, new FeatureManager.Callback() { // from class: com.facebook.m
                    @Override // com.facebook.internal.FeatureManager.Callback
                    public final void onCompleted(boolean z10) {
                        FacebookSdk.sdkInitialize$lambda$4(z10);
                    }
                });
                FeatureManager.checkFeature(FeatureManager.Feature.AppEvents, new FeatureManager.Callback() { // from class: com.facebook.n
                    @Override // com.facebook.internal.FeatureManager.Callback
                    public final void onCompleted(boolean z10) {
                        FacebookSdk.sdkInitialize$lambda$5(z10);
                    }
                });
                FeatureManager.checkFeature(FeatureManager.Feature.ChromeCustomTabsPrefetching, new FeatureManager.Callback() { // from class: com.facebook.o
                    @Override // com.facebook.internal.FeatureManager.Callback
                    public final void onCompleted(boolean z10) {
                        FacebookSdk.sdkInitialize$lambda$6(z10);
                    }
                });
                FeatureManager.checkFeature(FeatureManager.Feature.IgnoreAppSwitchToLoggedOut, new FeatureManager.Callback() { // from class: com.facebook.p
                    @Override // com.facebook.internal.FeatureManager.Callback
                    public final void onCompleted(boolean z10) {
                        FacebookSdk.sdkInitialize$lambda$7(z10);
                    }
                });
                FeatureManager.checkFeature(FeatureManager.Feature.BypassAppSwitch, new FeatureManager.Callback() { // from class: com.facebook.q
                    @Override // com.facebook.internal.FeatureManager.Callback
                    public final void onCompleted(boolean z10) {
                        FacebookSdk.sdkInitialize$lambda$8(z10);
                    }
                });
                getExecutor().execute(new FutureTask(new Callable() { // from class: com.facebook.r
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return FacebookSdk.sdkInitialize$lambda$9(initializeCallback);
                    }
                }));
                return;
            }
            throw new FacebookException("A valid Facebook app client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk.");
        }
        throw new FacebookException("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
    }
}
