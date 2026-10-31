package com.facebook.appevents;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import com.applovin.shadow.okio.internal.MoA.edUJlCZxhVnO;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.LoggingBehavior;
import com.facebook.UserSettingsManager;
import com.facebook.appevents.gps.ara.GpsAraTriggersManager;
import com.facebook.appevents.gps.pa.PACustomAudienceClient;
import com.facebook.appevents.iap.InAppPurchase;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.appevents.iap.InAppPurchaseDedupeConfig;
import com.facebook.appevents.iap.InAppPurchaseManager;
import com.facebook.appevents.integrity.BannedParamManager;
import com.facebook.appevents.integrity.BlocklistEventsManager;
import com.facebook.appevents.integrity.MACARuleMatchingManager;
import com.facebook.appevents.integrity.ProtectedModeManager;
import com.facebook.appevents.integrity.SensitiveParamsManager;
import com.facebook.appevents.integrity.StdParamsEnforcementManager;
import com.facebook.appevents.integrity.VVPManager;
import com.facebook.appevents.internal.ActivityLifecycleTracker;
import com.facebook.appevents.internal.AutomaticAnalyticsLogger;
import com.facebook.appevents.internal.Constants;
import com.facebook.appevents.ondeviceprocessing.OnDeviceProcessingManager;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.FetchedAppGateKeepersManager;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.InstallReferrerUtil;
import com.facebook.internal.Logger;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import io.bidmachine.iab.vast.activity.IIj.KBBdKxoAiHo;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Currency;
import java.util.HashSet;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import rd.f0;
import s.sBoZ.TwDPD;
import wc.g0;

/* JADX INFO: compiled from: AppEventsLoggerImpl.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class AppEventsLoggerImpl {
    private static final String ACCOUNT_KIT_EVENT_NAME_PREFIX = "fb_ak";
    public static final String APP_EVENTS_KILLSWITCH = "app_events_killswitch";
    private static final String APP_EVENT_NAME_PUSH_OPENED = "fb_mobile_push_opened";
    private static final String APP_EVENT_PREFERENCES = "com.facebook.sdk.appEventPreferences";
    private static final String APP_EVENT_PUSH_PARAMETER_ACTION = "fb_push_action";
    private static final String APP_EVENT_PUSH_PARAMETER_CAMPAIGN = "fb_push_campaign";
    private static final int APP_SUPPORTS_ATTRIBUTION_ID_RECHECK_PERIOD_IN_SECONDS = 86400;
    public static final Companion Companion = new Companion(null);
    private static final String PUSH_PAYLOAD_CAMPAIGN_KEY = "campaign";
    private static final String PUSH_PAYLOAD_KEY = "fb_push_payload";
    private static final String TAG;
    private static volatile String anonymousAppDeviceGUID;
    private static ScheduledThreadPoolExecutor backgroundExecutor;
    private static AppEventsLogger.FlushBehavior flushBehaviorField;
    private static final InstallReferrerUtil.Callback installReferrerCallback;
    private static boolean isActivateAppEventRequested;
    private static String pushNotificationsRegistrationIdField;
    private static final Object staticLock;
    private AccessTokenAppIdPair accessTokenAppId;
    private final String contextName;

    static {
        String canonicalName = AppEventsLoggerImpl.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "com.facebook.appevents.AppEventsLoggerImpl";
        }
        TAG = canonicalName;
        flushBehaviorField = AppEventsLogger.FlushBehavior.AUTO;
        staticLock = new Object();
        installReferrerCallback = new InstallReferrerUtil.Callback() { // from class: com.facebook.appevents.i
            @Override // com.facebook.internal.InstallReferrerUtil.Callback
            public final void onReceiveReferrerUrl(String str) {
                AppEventsLoggerImpl.installReferrerCallback$lambda$0(str);
            }
        };
    }

    public AppEventsLoggerImpl(String activityName, String str, AccessToken accessToken) {
        kotlin.jvm.internal.t.f(activityName, "activityName");
        Validate.sdkInitialized();
        this.contextName = activityName;
        accessToken = accessToken == null ? AccessToken.Companion.getCurrentAccessToken() : accessToken;
        if (accessToken == null || accessToken.isExpired() || !(str == null || kotlin.jvm.internal.t.a(str, accessToken.getApplicationId()))) {
            str = str == null ? Utility.getMetadataApplicationId(FacebookSdk.getApplicationContext()) : str;
            if (str == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            this.accessTokenAppId = new AccessTokenAppIdPair(null, str);
        } else {
            this.accessTokenAppId = new AccessTokenAppIdPair(accessToken);
        }
        Companion.initializeTimersIfNeeded();
    }

    public static final /* synthetic */ String access$getAnonymousAppDeviceGUID$cp() {
        if (CrashShieldHandler.isObjectCrashing(AppEventsLoggerImpl.class)) {
            return null;
        }
        try {
            return anonymousAppDeviceGUID;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventsLoggerImpl.class);
            return null;
        }
    }

    public static final /* synthetic */ ScheduledThreadPoolExecutor access$getBackgroundExecutor$cp() {
        if (CrashShieldHandler.isObjectCrashing(AppEventsLoggerImpl.class)) {
            return null;
        }
        try {
            return backgroundExecutor;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventsLoggerImpl.class);
            return null;
        }
    }

    public static final /* synthetic */ AppEventsLogger.FlushBehavior access$getFlushBehaviorField$cp() {
        if (CrashShieldHandler.isObjectCrashing(AppEventsLoggerImpl.class)) {
            return null;
        }
        try {
            return flushBehaviorField;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventsLoggerImpl.class);
            return null;
        }
    }

    public static final /* synthetic */ InstallReferrerUtil.Callback access$getInstallReferrerCallback$cp() {
        if (CrashShieldHandler.isObjectCrashing(AppEventsLoggerImpl.class)) {
            return null;
        }
        try {
            return installReferrerCallback;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventsLoggerImpl.class);
            return null;
        }
    }

    public static final /* synthetic */ String access$getPushNotificationsRegistrationIdField$cp() {
        if (CrashShieldHandler.isObjectCrashing(AppEventsLoggerImpl.class)) {
            return null;
        }
        try {
            return pushNotificationsRegistrationIdField;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventsLoggerImpl.class);
            return null;
        }
    }

    public static final /* synthetic */ Object access$getStaticLock$cp() {
        if (CrashShieldHandler.isObjectCrashing(AppEventsLoggerImpl.class)) {
            return null;
        }
        try {
            return staticLock;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventsLoggerImpl.class);
            return null;
        }
    }

    public static final /* synthetic */ String access$getTAG$cp() {
        if (CrashShieldHandler.isObjectCrashing(AppEventsLoggerImpl.class)) {
            return null;
        }
        try {
            return TAG;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventsLoggerImpl.class);
            return null;
        }
    }

    public static final /* synthetic */ boolean access$isActivateAppEventRequested$cp() {
        if (CrashShieldHandler.isObjectCrashing(AppEventsLoggerImpl.class)) {
            return false;
        }
        try {
            return isActivateAppEventRequested;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventsLoggerImpl.class);
            return false;
        }
    }

    public static final /* synthetic */ void access$setActivateAppEventRequested$cp(boolean z10) {
        if (CrashShieldHandler.isObjectCrashing(AppEventsLoggerImpl.class)) {
            return;
        }
        try {
            isActivateAppEventRequested = z10;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventsLoggerImpl.class);
        }
    }

    public static final /* synthetic */ void access$setAnonymousAppDeviceGUID$cp(String str) {
        if (CrashShieldHandler.isObjectCrashing(AppEventsLoggerImpl.class)) {
            return;
        }
        try {
            anonymousAppDeviceGUID = str;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventsLoggerImpl.class);
        }
    }

    public static final /* synthetic */ void access$setBackgroundExecutor$cp(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        if (CrashShieldHandler.isObjectCrashing(AppEventsLoggerImpl.class)) {
            return;
        }
        try {
            backgroundExecutor = scheduledThreadPoolExecutor;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventsLoggerImpl.class);
        }
    }

    public static final /* synthetic */ void access$setFlushBehaviorField$cp(AppEventsLogger.FlushBehavior flushBehavior) {
        if (CrashShieldHandler.isObjectCrashing(AppEventsLoggerImpl.class)) {
            return;
        }
        try {
            flushBehaviorField = flushBehavior;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventsLoggerImpl.class);
        }
    }

    public static final /* synthetic */ void access$setPushNotificationsRegistrationIdField$cp(String str) {
        if (CrashShieldHandler.isObjectCrashing(AppEventsLoggerImpl.class)) {
            return;
        }
        try {
            pushNotificationsRegistrationIdField = str;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventsLoggerImpl.class);
        }
    }

    public static final void activateApp(Application application, String str) {
        if (CrashShieldHandler.isObjectCrashing(AppEventsLoggerImpl.class)) {
            return;
        }
        try {
            Companion.activateApp(application, str);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventsLoggerImpl.class);
        }
    }

    public static final wc.q<Bundle, OperationalData> addImplicitPurchaseParameters(Bundle bundle, OperationalData operationalData, boolean z10) {
        if (CrashShieldHandler.isObjectCrashing(AppEventsLoggerImpl.class)) {
            return null;
        }
        try {
            return Companion.addImplicitPurchaseParameters(bundle, operationalData, z10);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventsLoggerImpl.class);
            return null;
        }
    }

    public static final void augmentWebView(WebView webView, Context context) {
        if (CrashShieldHandler.isObjectCrashing(AppEventsLoggerImpl.class)) {
            return;
        }
        try {
            Companion.augmentWebView(webView, context);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventsLoggerImpl.class);
        }
    }

    public static final void functionDEPRECATED(String str) {
        if (CrashShieldHandler.isObjectCrashing(AppEventsLoggerImpl.class)) {
            return;
        }
        try {
            Companion.functionDEPRECATED(str);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventsLoggerImpl.class);
        }
    }

    public static final Executor getAnalyticsExecutor() {
        if (CrashShieldHandler.isObjectCrashing(AppEventsLoggerImpl.class)) {
            return null;
        }
        try {
            return Companion.getAnalyticsExecutor();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventsLoggerImpl.class);
            return null;
        }
    }

    public static final String getAnonymousAppDeviceGUID(Context context) {
        if (CrashShieldHandler.isObjectCrashing(AppEventsLoggerImpl.class)) {
            return null;
        }
        try {
            return Companion.getAnonymousAppDeviceGUID(context);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventsLoggerImpl.class);
            return null;
        }
    }

    public static final AppEventsLogger.FlushBehavior getFlushBehavior() {
        if (CrashShieldHandler.isObjectCrashing(AppEventsLoggerImpl.class)) {
            return null;
        }
        try {
            return Companion.getFlushBehavior();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventsLoggerImpl.class);
            return null;
        }
    }

    public static final String getInstallReferrer() {
        if (CrashShieldHandler.isObjectCrashing(AppEventsLoggerImpl.class)) {
            return null;
        }
        try {
            return Companion.getInstallReferrer();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventsLoggerImpl.class);
            return null;
        }
    }

    public static final String getInstallReferrerBlocking() {
        if (CrashShieldHandler.isObjectCrashing(AppEventsLoggerImpl.class)) {
            return null;
        }
        try {
            return Companion.getInstallReferrerBlocking();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventsLoggerImpl.class);
            return null;
        }
    }

    public static final String getPushNotificationsRegistrationId() {
        if (CrashShieldHandler.isObjectCrashing(AppEventsLoggerImpl.class)) {
            return null;
        }
        try {
            return Companion.getPushNotificationsRegistrationId();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventsLoggerImpl.class);
            return null;
        }
    }

    public static final void initializeLib(Context context, String str) {
        if (CrashShieldHandler.isObjectCrashing(AppEventsLoggerImpl.class)) {
            return;
        }
        try {
            Companion.initializeLib(context, str);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventsLoggerImpl.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void installReferrerCallback$lambda$0(String str) {
        if (CrashShieldHandler.isObjectCrashing(AppEventsLoggerImpl.class)) {
            return;
        }
        try {
            Companion.setInstallReferrer(str);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventsLoggerImpl.class);
        }
    }

    public static /* synthetic */ void logEvent$default(AppEventsLoggerImpl appEventsLoggerImpl, String str, Bundle bundle, int i10, Object obj) {
        if (CrashShieldHandler.isObjectCrashing(AppEventsLoggerImpl.class)) {
            return;
        }
        if ((i10 & 2) != 0) {
            bundle = null;
        }
        try {
            appEventsLoggerImpl.logEvent(str, bundle);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventsLoggerImpl.class);
        }
    }

    public static /* synthetic */ void logEventImplicitly$default(AppEventsLoggerImpl appEventsLoggerImpl, String str, BigDecimal bigDecimal, Currency currency, Bundle bundle, OperationalData operationalData, int i10, Object obj) {
        if (CrashShieldHandler.isObjectCrashing(AppEventsLoggerImpl.class)) {
            return;
        }
        if ((i10 & 16) != 0) {
            operationalData = null;
        }
        try {
            appEventsLoggerImpl.logEventImplicitly(str, bigDecimal, currency, bundle, operationalData);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventsLoggerImpl.class);
        }
    }

    public static /* synthetic */ void logPurchase$default(AppEventsLoggerImpl appEventsLoggerImpl, BigDecimal bigDecimal, Currency currency, Bundle bundle, int i10, Object obj) {
        if (CrashShieldHandler.isObjectCrashing(AppEventsLoggerImpl.class)) {
            return;
        }
        if ((i10 & 4) != 0) {
            bundle = null;
        }
        try {
            appEventsLoggerImpl.logPurchase(bigDecimal, currency, bundle);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventsLoggerImpl.class);
        }
    }

    public static /* synthetic */ void logPurchaseImplicitly$default(AppEventsLoggerImpl appEventsLoggerImpl, BigDecimal bigDecimal, Currency currency, Bundle bundle, OperationalData operationalData, int i10, Object obj) {
        if (CrashShieldHandler.isObjectCrashing(AppEventsLoggerImpl.class)) {
            return;
        }
        if ((i10 & 8) != 0) {
            operationalData = null;
        }
        try {
            appEventsLoggerImpl.logPurchaseImplicitly(bigDecimal, currency, bundle, operationalData);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventsLoggerImpl.class);
        }
    }

    public static final void onContextStop() {
        if (CrashShieldHandler.isObjectCrashing(AppEventsLoggerImpl.class)) {
            return;
        }
        try {
            Companion.onContextStop();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventsLoggerImpl.class);
        }
    }

    public static final void setFlushBehavior(AppEventsLogger.FlushBehavior flushBehavior) {
        if (CrashShieldHandler.isObjectCrashing(AppEventsLoggerImpl.class)) {
            return;
        }
        try {
            Companion.setFlushBehavior(flushBehavior);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventsLoggerImpl.class);
        }
    }

    public static final void setInstallReferrer(String str) {
        if (CrashShieldHandler.isObjectCrashing(AppEventsLoggerImpl.class)) {
            return;
        }
        try {
            Companion.setInstallReferrer(str);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventsLoggerImpl.class);
        }
    }

    public static final void setPushNotificationsRegistrationId(String str) {
        if (CrashShieldHandler.isObjectCrashing(AppEventsLoggerImpl.class)) {
            return;
        }
        try {
            Companion.setPushNotificationsRegistrationId(str);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventsLoggerImpl.class);
        }
    }

    public final void flush() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            AppEventQueue.flush(FlushReason.EXPLICIT);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final String getApplicationId() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            return this.accessTokenAppId.getApplicationId();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public final boolean isValidForAccessToken(AccessToken accessToken) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            kotlin.jvm.internal.t.f(accessToken, "accessToken");
            return kotlin.jvm.internal.t.a(this.accessTokenAppId, new AccessTokenAppIdPair(accessToken));
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    public final void logEvent(String str) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            logEvent(str, (Bundle) null);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void logEventFromSE(String str, String str2) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("_is_suggested_event", AppEventsConstants.EVENT_PARAM_VALUE_YES);
            bundle.putString("_button_text", str2);
            logEvent(str, bundle);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void logEventImplicitly(String str, Double d10, Bundle bundle) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            logEvent$default(this, str, d10, bundle, true, ActivityLifecycleTracker.getCurrentSessionGuid(), null, 32, null);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void logProductItem(String str, AppEventsLogger.ProductAvailability productAvailability, AppEventsLogger.ProductCondition productCondition, String str2, String str3, String str4, String str5, BigDecimal bigDecimal, Currency currency, String str6, String str7, String str8, Bundle bundle) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            if (str == null) {
                Companion.notifyDeveloperError("itemID cannot be null");
                return;
            }
            if (productAvailability == null) {
                Companion.notifyDeveloperError("availability cannot be null");
                return;
            }
            if (productCondition == null) {
                Companion.notifyDeveloperError("condition cannot be null");
                return;
            }
            if (str2 == null) {
                Companion.notifyDeveloperError("description cannot be null");
                return;
            }
            if (str3 == null) {
                Companion.notifyDeveloperError("imageLink cannot be null");
                return;
            }
            if (str4 == null) {
                Companion.notifyDeveloperError("link cannot be null");
                return;
            }
            if (str5 == null) {
                Companion.notifyDeveloperError("title cannot be null");
                return;
            }
            if (bigDecimal == null) {
                Companion.notifyDeveloperError("priceAmount cannot be null");
                return;
            }
            if (currency == null) {
                Companion.notifyDeveloperError("currency cannot be null");
                return;
            }
            if (str6 == null && str7 == null && str8 == null) {
                Companion.notifyDeveloperError("Either gtin, mpn or brand is required");
                return;
            }
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putString(Constants.EVENT_PARAM_PRODUCT_ITEM_ID, str);
            bundle.putString(Constants.EVENT_PARAM_PRODUCT_AVAILABILITY, productAvailability.name());
            bundle.putString(Constants.EVENT_PARAM_PRODUCT_CONDITION, productCondition.name());
            bundle.putString(Constants.EVENT_PARAM_PRODUCT_DESCRIPTION, str2);
            bundle.putString(Constants.EVENT_PARAM_PRODUCT_IMAGE_LINK, str3);
            bundle.putString(Constants.EVENT_PARAM_PRODUCT_LINK, str4);
            bundle.putString(Constants.EVENT_PARAM_PRODUCT_TITLE, str5);
            bundle.putString(Constants.EVENT_PARAM_PRODUCT_PRICE_AMOUNT, bigDecimal.setScale(3, RoundingMode.HALF_UP).toString());
            bundle.putString(Constants.EVENT_PARAM_PRODUCT_PRICE_CURRENCY, currency.getCurrencyCode());
            if (str6 != null) {
                bundle.putString(Constants.EVENT_PARAM_PRODUCT_GTIN, str6);
            }
            if (str7 != null) {
                bundle.putString(Constants.EVENT_PARAM_PRODUCT_MPN, str7);
            }
            if (str8 != null) {
                bundle.putString(Constants.EVENT_PARAM_PRODUCT_BRAND, str8);
            }
            logEvent(AppEventsConstants.EVENT_NAME_PRODUCT_CATALOG_UPDATE, bundle);
            Companion.eagerFlush();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void logPurchase(BigDecimal bigDecimal, Currency currency) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            logPurchase(bigDecimal, currency, null);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void logPurchaseImplicitly(BigDecimal bigDecimal, Currency currency, Bundle bundle, OperationalData operationalData) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            logPurchase(bigDecimal, currency, bundle, true, operationalData);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void logSdkEvent(String eventName, Double d10, Bundle bundle) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            kotlin.jvm.internal.t.f(eventName, "eventName");
            if (!rd.c0.O(eventName, ACCOUNT_KIT_EVENT_NAME_PREFIX, false, 2, null)) {
                Log.e(TAG, "logSdkEvent is deprecated and only supports account kit for legacy, please use logEvent instead");
            } else if (FacebookSdk.getAutoLogAppEventsEnabled()) {
                logEvent$default(this, eventName, d10, bundle, true, ActivityLifecycleTracker.getCurrentSessionGuid(), null, 32, null);
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    /* JADX INFO: compiled from: AppEventsLoggerImpl.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void initializeLib$lambda$4(Context context, AppEventsLoggerImpl logger) {
            kotlin.jvm.internal.t.f(context, "$context");
            kotlin.jvm.internal.t.f(logger, "$logger");
            Bundle bundle = new Bundle();
            String[] strArr = {"com.facebook.core.Core", "com.facebook.login.Login", "com.facebook.share.Share", "com.facebook.places.Places", "com.facebook.messenger.Messenger", "com.facebook.applinks.AppLinks", "com.facebook.marketing.Marketing", "com.facebook.gamingservices.GamingServices", "com.facebook.all.All", InAppPurchaseConstants.CLASSNAME_BILLING_CLIENT, "com.android.vending.billing.IInAppBillingService"};
            String[] strArr2 = {"core_lib_included", "login_lib_included", "share_lib_included", "places_lib_included", "messenger_lib_included", "applinks_lib_included", "marketing_lib_included", "gamingservices_lib_included", "all_lib_included", "billing_client_lib_included", "billing_service_lib_included"};
            int i10 = 0;
            for (int i11 = 0; i11 < 11; i11++) {
                String str = strArr[i11];
                String str2 = strArr2[i11];
                try {
                    Class.forName(str);
                    bundle.putInt(str2, 1);
                    i10 |= 1 << i11;
                } catch (ClassNotFoundException unused) {
                }
            }
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
            if (sharedPreferences.getInt("kitsBitmask", 0) != i10) {
                sharedPreferences.edit().putInt("kitsBitmask", i10).apply();
                logger.logEventImplicitly(AnalyticsEvents.EVENT_SDK_INITIALIZE, null, bundle);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void initializeTimersIfNeeded() {
            synchronized (AppEventsLoggerImpl.access$getStaticLock$cp()) {
                if (AppEventsLoggerImpl.access$getBackgroundExecutor$cp() != null) {
                    return;
                }
                AppEventsLoggerImpl.access$setBackgroundExecutor$cp(new ScheduledThreadPoolExecutor(1));
                g0 g0Var = g0.f27756a;
                Runnable runnable = new Runnable() { // from class: com.facebook.appevents.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        AppEventsLoggerImpl.Companion.initializeTimersIfNeeded$lambda$6();
                    }
                };
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutorAccess$getBackgroundExecutor$cp = AppEventsLoggerImpl.access$getBackgroundExecutor$cp();
                if (scheduledThreadPoolExecutorAccess$getBackgroundExecutor$cp == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                scheduledThreadPoolExecutorAccess$getBackgroundExecutor$cp.scheduleAtFixedRate(runnable, 0L, 86400L, TimeUnit.SECONDS);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void initializeTimersIfNeeded$lambda$6() {
            HashSet hashSet = new HashSet();
            Iterator<AccessTokenAppIdPair> it = AppEventQueue.getKeySet().iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().getApplicationId());
            }
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                FetchedAppSettingsManager.queryAppSettings((String) it2.next(), true);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void logEvent(AppEvent appEvent, AccessTokenAppIdPair accessTokenAppIdPair) {
            AppEventQueue.add(accessTokenAppIdPair, appEvent);
            if (FeatureManager.isEnabled(FeatureManager.Feature.OnDevicePostInstallEventProcessing) && OnDeviceProcessingManager.isOnDeviceProcessingEnabled()) {
                OnDeviceProcessingManager.sendCustomEventAsync(accessTokenAppIdPair.getApplicationId(), appEvent);
            }
            if (FeatureManager.isEnabled(FeatureManager.Feature.GPSARATriggers)) {
                GpsAraTriggersManager.INSTANCE.registerTriggerAsync(accessTokenAppIdPair.getApplicationId(), appEvent);
            }
            if (FeatureManager.isEnabled(FeatureManager.Feature.GPSPACAProcessing)) {
                PACustomAudienceClient.INSTANCE.joinCustomAudience(accessTokenAppIdPair.getApplicationId(), appEvent);
            }
            if (appEvent.getIsImplicit() || AppEventsLoggerImpl.access$isActivateAppEventRequested$cp()) {
                return;
            }
            if (kotlin.jvm.internal.t.a(appEvent.getName(), AppEventsConstants.EVENT_NAME_ACTIVATED_APP)) {
                AppEventsLoggerImpl.access$setActivateAppEventRequested$cp(true);
            } else {
                Logger.Companion.log(LoggingBehavior.APP_EVENTS, "AppEvents", "Warning: Please call AppEventsLogger.activateApp(...)from the long-lived activity's onResume() methodbefore logging other app events.");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void notifyDeveloperError(String str) {
            Logger.Companion.log(LoggingBehavior.DEVELOPER_ERRORS, "AppEvents", str);
        }

        public final void activateApp(Application application, String str) {
            kotlin.jvm.internal.t.f(application, "application");
            if (!FacebookSdk.isInitialized()) {
                throw new FacebookException("The Facebook sdk must be initialized before calling activateApp");
            }
            AnalyticsUserIDStore.initStore();
            UserDataStore.initStore();
            if (str == null) {
                str = FacebookSdk.getApplicationId();
            }
            FacebookSdk.publishInstallAsync(application, str);
            ActivityLifecycleTracker.startTracking(application, str);
            if (FeatureManager.isEnabled(FeatureManager.Feature.GPSPACAProcessing)) {
                PACustomAudienceClient.INSTANCE.joinCustomAudience(str, "fb_mobile_app_install");
            }
            if (FeatureManager.isEnabled(FeatureManager.Feature.GPSARATriggers)) {
                GpsAraTriggersManager.INSTANCE.registerTriggerAsync(str, new AppEvent("unknown", "MOBILE_INSTALL_EVENT", null, null, false, ActivityLifecycleTracker.isInBackground(), ActivityLifecycleTracker.getCurrentSessionGuid(), null));
            }
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0064  */
        public final wc.q<Bundle, OperationalData> addImplicitPurchaseParameters(Bundle bundle, OperationalData operationalData, boolean z10) {
            String str = AutomaticAnalyticsLogger.isImplicitPurchaseLoggingEnabled() ? AppEventsConstants.EVENT_PARAM_VALUE_YES : AppEventsConstants.EVENT_PARAM_VALUE_NO;
            OperationalData.Companion companion = OperationalData.Companion;
            OperationalDataEnum operationalDataEnum = OperationalDataEnum.IAPParameters;
            wc.q<Bundle, OperationalData> qVarAddParameterAndReturn = companion.addParameterAndReturn(operationalDataEnum, Constants.EVENT_PARAM_IS_IMPLICIT_PURCHASE_LOGGING_ENABLED, str, bundle, operationalData);
            Object parameter = companion.getParameter(operationalDataEnum, Constants.IAP_PRODUCT_ID, bundle, operationalData);
            String str2 = parameter instanceof String ? (String) parameter : null;
            if (!z10) {
                if ((bundle != null ? bundle.getString(AppEventsConstants.EVENT_PARAM_CONTENT_ID) : null) == null && str2 != null) {
                    wc.q<Bundle, OperationalData> qVarAddParameterAndReturn2 = companion.addParameterAndReturn(operationalDataEnum, AppEventsConstants.EVENT_PARAM_CONTENT_ID, str2, bundle, operationalData);
                    qVarAddParameterAndReturn = companion.addParameterAndReturn(operationalDataEnum, Constants.ANDROID_DYNAMIC_ADS_CONTENT_ID, "client_manual", qVarAddParameterAndReturn2.e(), qVarAddParameterAndReturn2.f());
                }
            }
            wc.q<Bundle, OperationalData> qVarAddParameterAndReturn3 = companion.addParameterAndReturn(operationalDataEnum, Constants.EVENT_PARAM_IS_AUTOLOG_APP_EVENTS_ENABLED, UserSettingsManager.getAutoLogAppEventsEnabled() ? AppEventsConstants.EVENT_PARAM_VALUE_YES : AppEventsConstants.EVENT_PARAM_VALUE_NO, qVarAddParameterAndReturn.e(), qVarAddParameterAndReturn.f());
            return new wc.q<>(qVarAddParameterAndReturn3.e(), qVarAddParameterAndReturn3.f());
        }

        public final void augmentWebView(WebView webView, Context context) {
            kotlin.jvm.internal.t.f(webView, "webView");
            String RELEASE = Build.VERSION.RELEASE;
            kotlin.jvm.internal.t.e(RELEASE, "RELEASE");
            String[] strArr = (String[]) f0.K0(RELEASE, new String[]{"."}, false, 0, 6, null).toArray(new String[0]);
            int i10 = (strArr.length == 0) ^ true ? Integer.parseInt(strArr[0]) : 0;
            int i11 = strArr.length > 1 ? Integer.parseInt(strArr[1]) : 0;
            if (i10 < 4 || (i10 == 4 && i11 <= 1)) {
                Logger.Companion.log(LoggingBehavior.DEVELOPER_ERRORS, AppEventsLoggerImpl.access$getTAG$cp(), "augmentWebView is only available for Android SDK version >= 17 on devices running Android >= 4.2");
                return;
            }
            webView.addJavascriptInterface(new FacebookSDKJSInterface(context), "fbmq_" + FacebookSdk.getApplicationId());
        }

        public final void eagerFlush() {
            if (getFlushBehavior() != AppEventsLogger.FlushBehavior.EXPLICIT_ONLY) {
                AppEventQueue.flush(FlushReason.EAGER_FLUSHING_EVENT);
            }
        }

        public final void functionDEPRECATED(String extraMsg) {
            kotlin.jvm.internal.t.f(extraMsg, "extraMsg");
            Log.w(AppEventsLoggerImpl.access$getTAG$cp(), "This function is deprecated. " + extraMsg);
        }

        public final Executor getAnalyticsExecutor() {
            if (AppEventsLoggerImpl.access$getBackgroundExecutor$cp() == null) {
                initializeTimersIfNeeded();
            }
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutorAccess$getBackgroundExecutor$cp = AppEventsLoggerImpl.access$getBackgroundExecutor$cp();
            if (scheduledThreadPoolExecutorAccess$getBackgroundExecutor$cp != null) {
                return scheduledThreadPoolExecutorAccess$getBackgroundExecutor$cp;
            }
            throw new IllegalStateException("Required value was null.".toString());
        }

        public final String getAnonymousAppDeviceGUID(Context context) {
            kotlin.jvm.internal.t.f(context, "context");
            if (AppEventsLoggerImpl.access$getAnonymousAppDeviceGUID$cp() == null) {
                synchronized (AppEventsLoggerImpl.access$getStaticLock$cp()) {
                    if (AppEventsLoggerImpl.access$getAnonymousAppDeviceGUID$cp() == null) {
                        AppEventsLoggerImpl.access$setAnonymousAppDeviceGUID$cp(context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("anonymousAppDeviceGUID", null));
                        if (AppEventsLoggerImpl.access$getAnonymousAppDeviceGUID$cp() == null) {
                            AppEventsLoggerImpl.access$setAnonymousAppDeviceGUID$cp("XZ" + UUID.randomUUID());
                            context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("anonymousAppDeviceGUID", AppEventsLoggerImpl.access$getAnonymousAppDeviceGUID$cp()).apply();
                        }
                    }
                    g0 g0Var = g0.f27756a;
                }
            }
            String strAccess$getAnonymousAppDeviceGUID$cp = AppEventsLoggerImpl.access$getAnonymousAppDeviceGUID$cp();
            if (strAccess$getAnonymousAppDeviceGUID$cp != null) {
                return strAccess$getAnonymousAppDeviceGUID$cp;
            }
            throw new IllegalStateException("Required value was null.".toString());
        }

        public final AppEventsLogger.FlushBehavior getFlushBehavior() {
            AppEventsLogger.FlushBehavior flushBehaviorAccess$getFlushBehaviorField$cp;
            synchronized (AppEventsLoggerImpl.access$getStaticLock$cp()) {
                flushBehaviorAccess$getFlushBehaviorField$cp = AppEventsLoggerImpl.access$getFlushBehaviorField$cp();
            }
            return flushBehaviorAccess$getFlushBehaviorField$cp;
        }

        public final String getInstallReferrer() {
            InstallReferrerUtil.tryUpdateReferrerInfo(AppEventsLoggerImpl.access$getInstallReferrerCallback$cp());
            return readInstallReferrerFromPrefs();
        }

        public final String getInstallReferrerBlocking() {
            InstallReferrerUtil.tryUpdateReferrerInfoBlocking(AppEventsLoggerImpl.access$getInstallReferrerCallback$cp());
            return readInstallReferrerFromPrefs();
        }

        public final String getPushNotificationsRegistrationId() {
            String strAccess$getPushNotificationsRegistrationIdField$cp;
            synchronized (AppEventsLoggerImpl.access$getStaticLock$cp()) {
                strAccess$getPushNotificationsRegistrationIdField$cp = AppEventsLoggerImpl.access$getPushNotificationsRegistrationIdField$cp();
            }
            return strAccess$getPushNotificationsRegistrationIdField$cp;
        }

        public final void initializeLib(final Context context, String str) {
            kotlin.jvm.internal.t.f(context, "context");
            if (FacebookSdk.getAutoLogAppEventsEnabled()) {
                final AppEventsLoggerImpl appEventsLoggerImpl = new AppEventsLoggerImpl(context, str, (AccessToken) null);
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutorAccess$getBackgroundExecutor$cp = AppEventsLoggerImpl.access$getBackgroundExecutor$cp();
                if (scheduledThreadPoolExecutorAccess$getBackgroundExecutor$cp == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                scheduledThreadPoolExecutorAccess$getBackgroundExecutor$cp.execute(new Runnable() { // from class: com.facebook.appevents.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        AppEventsLoggerImpl.Companion.initializeLib$lambda$4(context, appEventsLoggerImpl);
                    }
                });
            }
        }

        public final void onContextStop() {
            AppEventQueue.persistToDisk();
        }

        public final void setFlushBehavior(AppEventsLogger.FlushBehavior flushBehavior) {
            kotlin.jvm.internal.t.f(flushBehavior, "flushBehavior");
            synchronized (AppEventsLoggerImpl.access$getStaticLock$cp()) {
                AppEventsLoggerImpl.access$setFlushBehaviorField$cp(flushBehavior);
                g0 g0Var = g0.f27756a;
            }
        }

        public final void setInstallReferrer(String str) {
            SharedPreferences sharedPreferences = FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
            if (str != null) {
                sharedPreferences.edit().putString(com.adjust.sdk.Constants.INSTALL_REFERRER, str).apply();
            }
        }

        public final void setPushNotificationsRegistrationId(String str) {
            synchronized (AppEventsLoggerImpl.access$getStaticLock$cp()) {
                if (!Utility.stringsEqualOrEmpty(AppEventsLoggerImpl.access$getPushNotificationsRegistrationIdField$cp(), str)) {
                    AppEventsLoggerImpl.access$setPushNotificationsRegistrationIdField$cp(str);
                    AppEventsLoggerImpl appEventsLoggerImpl = new AppEventsLoggerImpl(FacebookSdk.getApplicationContext(), (String) null, (AccessToken) null);
                    appEventsLoggerImpl.logEvent(AppEventsConstants.EVENT_NAME_PUSH_TOKEN_OBTAINED);
                    if (AppEventsLoggerImpl.Companion.getFlushBehavior() != AppEventsLogger.FlushBehavior.EXPLICIT_ONLY) {
                        appEventsLoggerImpl.flush();
                    }
                }
                g0 g0Var = g0.f27756a;
            }
        }

        private final String readInstallReferrerFromPrefs() {
            return FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString(edUJlCZxhVnO.LerTuaIbnj, null);
        }
    }

    public static /* synthetic */ void logEvent$default(AppEventsLoggerImpl appEventsLoggerImpl, String str, Double d10, Bundle bundle, boolean z10, UUID uuid, OperationalData operationalData, int i10, Object obj) {
        if (CrashShieldHandler.isObjectCrashing(AppEventsLoggerImpl.class)) {
            return;
        }
        if ((i10 & 32) != 0) {
            operationalData = null;
        }
        try {
            appEventsLoggerImpl.logEvent(str, d10, bundle, z10, uuid, operationalData);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventsLoggerImpl.class);
        }
    }

    public static /* synthetic */ void logPurchase$default(AppEventsLoggerImpl appEventsLoggerImpl, BigDecimal bigDecimal, Currency currency, Bundle bundle, boolean z10, OperationalData operationalData, int i10, Object obj) {
        if (CrashShieldHandler.isObjectCrashing(AppEventsLoggerImpl.class)) {
            return;
        }
        if ((i10 & 16) != 0) {
            operationalData = null;
        }
        try {
            appEventsLoggerImpl.logPurchase(bigDecimal, currency, bundle, z10, operationalData);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventsLoggerImpl.class);
        }
    }

    public final void logEvent(String str, Bundle bundle) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            logEvent$default(this, str, null, bundle, false, ActivityLifecycleTracker.getCurrentSessionGuid(), null, 32, null);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void logEventImplicitly(String str, BigDecimal bigDecimal, Currency currency, Bundle bundle, OperationalData operationalData) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            if (bigDecimal != null && currency != null) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                Bundle bundle2 = bundle;
                bundle2.putString(AppEventsConstants.EVENT_PARAM_CURRENCY, currency.getCurrencyCode());
                logEvent(str, Double.valueOf(bigDecimal.doubleValue()), bundle2, true, ActivityLifecycleTracker.getCurrentSessionGuid(), operationalData);
                return;
            }
            Utility.logd(TAG, "purchaseAmount and currency cannot be null");
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void logPurchase(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            logPurchase$default(this, bigDecimal, currency, bundle, false, null, 16, null);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void logPushNotificationOpen(Bundle payload, String str) {
        String string;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            kotlin.jvm.internal.t.f(payload, "payload");
            try {
                String string2 = payload.getString(PUSH_PAYLOAD_KEY);
                if (Utility.isNullOrEmpty(string2)) {
                    return;
                } else {
                    string = new JSONObject(string2).getString(PUSH_PAYLOAD_CAMPAIGN_KEY);
                }
            } catch (JSONException unused) {
                string = null;
            }
            if (string == null) {
                Logger.Companion.log(LoggingBehavior.DEVELOPER_ERRORS, TAG, TwDPD.kuiihuvCWWcECJ);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString(APP_EVENT_PUSH_PARAMETER_CAMPAIGN, string);
            if (str != null) {
                bundle.putString(APP_EVENT_PUSH_PARAMETER_ACTION, str);
            }
            logEvent(APP_EVENT_NAME_PUSH_OPENED, bundle);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void logEvent(String str, double d10) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            logEvent(str, d10, null);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void logPurchase(BigDecimal bigDecimal, Currency currency, Bundle bundle, boolean z10, OperationalData operationalData) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            if (bigDecimal == null) {
                Companion.notifyDeveloperError("purchaseAmount cannot be null");
                return;
            }
            if (currency == null) {
                Companion.notifyDeveloperError("currency cannot be null");
                return;
            }
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = bundle;
            bundle2.putString(AppEventsConstants.EVENT_PARAM_CURRENCY, currency.getCurrencyCode());
            logEvent(AppEventsConstants.EVENT_NAME_PURCHASED, Double.valueOf(bigDecimal.doubleValue()), bundle2, z10, ActivityLifecycleTracker.getCurrentSessionGuid(), operationalData);
            Companion.eagerFlush();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void logEvent(String str, double d10, Bundle bundle) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            logEvent$default(this, str, Double.valueOf(d10), bundle, false, ActivityLifecycleTracker.getCurrentSessionGuid(), null, 32, null);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00b2  */
    public final void logEvent(String str, Double d10, Bundle bundle, boolean z10, UUID uuid, OperationalData operationalData) {
        boolean z11;
        Bundle bundle2 = bundle;
        OperationalData operationalDataC = operationalData;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        if (str != null) {
            try {
                z11 = str.length() == 0;
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
                return;
            }
        }
        if (z11) {
            return;
        }
        if (!z10 && AutomaticAnalyticsLogger.isImplicitPurchaseLoggingEnabled() && (kotlin.jvm.internal.t.a(str, AppEventsConstants.EVENT_NAME_PURCHASED) || kotlin.jvm.internal.t.a(str, AppEventsConstants.EVENT_NAME_SUBSCRIBE) || kotlin.jvm.internal.t.a(str, AppEventsConstants.EVENT_NAME_START_TRIAL))) {
            Log.w(TAG, "You are logging purchase events while auto-logging of in-app purchase is enabled in the SDK. Make sure you don't log duplicate events");
            if ((FeatureManager.isEnabled(FeatureManager.Feature.AndroidManualImplicitPurchaseDedupe) && kotlin.jvm.internal.t.a(str, AppEventsConstants.EVENT_NAME_PURCHASED)) || (FeatureManager.isEnabled(FeatureManager.Feature.AndroidManualImplicitSubsDedupe) && (kotlin.jvm.internal.t.a(str, AppEventsConstants.EVENT_NAME_SUBSCRIBE) || kotlin.jvm.internal.t.a(str, AppEventsConstants.EVENT_NAME_START_TRIAL)))) {
                InAppPurchaseDedupeConfig inAppPurchaseDedupeConfig = InAppPurchaseDedupeConfig.INSTANCE;
                Double valueOfManualEvent = inAppPurchaseDedupeConfig.getValueOfManualEvent(d10, bundle2);
                Currency currencyOfManualEvent = inAppPurchaseDedupeConfig.getCurrencyOfManualEvent(bundle2);
                if (valueOfManualEvent != null && currencyOfManualEvent != null) {
                    wc.q<Bundle, OperationalData> qVarAddDedupeParameters = inAppPurchaseDedupeConfig.addDedupeParameters(InAppPurchaseManager.performDedupe(kotlin.collections.s.e(new InAppPurchase(str, valueOfManualEvent.doubleValue(), currencyOfManualEvent)), System.currentTimeMillis(), false, kotlin.collections.s.e(new wc.q(bundle2, operationalDataC))), bundle2, operationalDataC);
                    Bundle bundleB = qVarAddDedupeParameters.b();
                    operationalDataC = qVarAddDedupeParameters.c();
                    bundle2 = bundleB;
                }
            }
        }
        if (FetchedAppGateKeepersManager.getGateKeeperForKey(KBBdKxoAiHo.YLCnBugBKUXZn, FacebookSdk.getApplicationId(), false)) {
            Logger.Companion.log(LoggingBehavior.APP_EVENTS, "AppEvents", "KillSwitch is enabled and fail to log app event: %s", str);
            return;
        }
        if (BlocklistEventsManager.isInBlocklist(str)) {
            return;
        }
        Companion companion = Companion;
        wc.q<Bundle, OperationalData> qVarAddImplicitPurchaseParameters = companion.addImplicitPurchaseParameters(bundle2, operationalDataC, z10);
        Bundle bundleB2 = qVarAddImplicitPurchaseParameters.b();
        OperationalData operationalDataC2 = qVarAddImplicitPurchaseParameters.c();
        try {
            try {
                if (!ProtectedModeManager.INSTANCE.protectedModeIsApplied(bundleB2)) {
                    SensitiveParamsManager.processFilterSensitiveParams(bundleB2, str);
                }
                BannedParamManager.processFilterBannedParams(bundleB2);
                MACARuleMatchingManager.processParameters(bundleB2, str);
                StdParamsEnforcementManager.processFilterParamSchemaBlocking(bundleB2);
                ProtectedModeManager.processParametersForProtectedMode(bundleB2);
                VVPManager.processParametersForVVP(str, bundleB2);
                companion.logEvent(new AppEvent(this.contextName, str, d10, bundleB2, z10, ActivityLifecycleTracker.isInBackground(), uuid, operationalDataC2), this.accessTokenAppId);
            } catch (JSONException e10) {
                Logger.Companion.log(LoggingBehavior.APP_EVENTS, "AppEvents", "JSON encoding for app event failed: '%s'", e10.toString());
            }
        } catch (FacebookException e11) {
            Logger.Companion.log(LoggingBehavior.APP_EVENTS, "AppEvents", "Invalid app event: %s", e11.toString());
        }
    }

    public AppEventsLoggerImpl(Context context, String str, AccessToken accessToken) {
        this(Utility.getActivityName(context), str, accessToken);
    }
}
