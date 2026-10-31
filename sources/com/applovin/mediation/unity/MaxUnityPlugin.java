package com.applovin.mediation.unity;

import android.text.TextUtils;
import android.util.Log;
import com.applovin.impl.sdk.AppLovinSdkInitializationConfigurationImpl;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxMediatedNetworkInfo;
import com.applovin.mediation.MaxSegment;
import com.applovin.mediation.MaxSegmentCollection;
import com.applovin.mediation.adapters.google.NK.ykDFMuXDQMaR;
import com.applovin.sdk.AppLovinMediationProvider;
import com.applovin.sdk.AppLovinPrivacySettings;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkInitializationConfiguration;
import com.applovin.sdk.AppLovinSdkUtils;
import com.facebook.appevents.cloudbridge.Gjw.yhXxbqGRMeI;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class MaxUnityPlugin {
    private static final String KEY_SDK_KEY = "sdk_key";
    protected static final String SDK_TAG = "AppLovinSdk";
    private static final String TAG = "MaxUnityPlugin";
    private static final String VERSION = "8.6.2";
    private static boolean disableAllLogs;
    private static boolean initializeSdkCalled;
    private static boolean isSdkInitialized;
    private static boolean shouldUseLegacySafeArea;
    private static final AtomicReference<Object> initConfigurationBuilder = new AtomicReference<>();
    private static final AtomicReference<Object> sdk = new AtomicReference<>();
    private static final AtomicReference<Object> adManager = new AtomicReference<>();

    public static void createBanner(String str, String str2, boolean z10) {
        if (initializeSdkCalled) {
            getAdManager().createBanner(str.trim(), str2, z10);
        } else {
            logUninitializedAccessError("CreateBanner");
        }
    }

    private static AppLovinSdkInitializationConfiguration.Builder createInitConfigurationBuilder() {
        return AppLovinSdkInitializationConfiguration.builder(getSdk().getSettings().getExtraParameters().get("sdk_key"));
    }

    public static void createMRec(String str, String str2) {
        if (initializeSdkCalled) {
            getAdManager().createMRec(str.trim(), str2);
        } else {
            logUninitializedAccessError("CreateMRec");
        }
    }

    public static void destroyBanner(String str) {
        if (initializeSdkCalled) {
            getAdManager().destroyBanner(str.trim());
        } else {
            logUninitializedAccessError("DestroyBanner");
        }
    }

    public static void destroyMRec(String str) {
        if (initializeSdkCalled) {
            getAdManager().destroyMRec(str.trim());
        } else {
            logUninitializedAccessError("DestroyMRec");
        }
    }

    private static void e(String str) {
        if (isDisableAllLogs()) {
            return;
        }
        Log.e(SDK_TAG, "[MaxUnityPlugin] " + str);
    }

    public static MaxUnityAdManager getAdManager() {
        AtomicReference<Object> atomicReference = adManager;
        Object maxUnityAdManager = atomicReference.get();
        if (maxUnityAdManager == null) {
            synchronized (atomicReference) {
                maxUnityAdManager = atomicReference.get();
                if (maxUnityAdManager == null) {
                    maxUnityAdManager = new MaxUnityAdManager();
                    atomicReference.set(maxUnityAdManager);
                }
            }
        }
        if (maxUnityAdManager == atomicReference) {
            maxUnityAdManager = null;
        }
        return (MaxUnityAdManager) maxUnityAdManager;
    }

    public static String getAdValue(String str, String str2) {
        return getAdManager().getAdValue(str.trim(), str2);
    }

    public static float getAdaptiveBannerHeight(float f10) {
        return MaxUnityAdManager.getAdaptiveBannerHeight(f10);
    }

    public static int getAdditionalConsentStatus(int i10) {
        return getConsentStatusValue(AppLovinPrivacySettings.getAdditionalConsentStatus(i10));
    }

    public static String getAvailableMediatedNetworks() {
        List<MaxMediatedNetworkInfo> availableMediatedNetworks = getSdk().getAvailableMediatedNetworks();
        JSONArray jSONArray = new JSONArray();
        for (MaxMediatedNetworkInfo maxMediatedNetworkInfo : availableMediatedNetworks) {
            JSONObject jSONObject = new JSONObject();
            JsonUtils.putString(jSONObject, "name", maxMediatedNetworkInfo.getName());
            JsonUtils.putString(jSONObject, "adapterClassName", maxMediatedNetworkInfo.getAdapterClassName());
            JsonUtils.putString(jSONObject, "adapterVersion", maxMediatedNetworkInfo.getAdapterVersion());
            JsonUtils.putString(jSONObject, "sdkVersion", maxMediatedNetworkInfo.getSdkVersion());
            JsonUtils.putInt(jSONObject, "initializationStatus", maxMediatedNetworkInfo.getInitializationStatus().getCode());
            jSONArray.put(jSONObject);
        }
        return jSONArray.toString();
    }

    public static String getBannerLayout(String str) {
        if (initializeSdkCalled) {
            return getAdManager().getBannerLayout(str.trim());
        }
        logUninitializedAccessError("GetBannerLayout");
        return "";
    }

    private static int getConsentStatusValue(Boolean bool) {
        if (bool != null) {
            return bool.booleanValue() ? 1 : 0;
        }
        return -1;
    }

    public static AppLovinSdkInitializationConfiguration.Builder getInitConfigurationBuilder() {
        AtomicReference<Object> atomicReference = initConfigurationBuilder;
        Object objCreateInitConfigurationBuilder = atomicReference.get();
        if (objCreateInitConfigurationBuilder == null) {
            synchronized (atomicReference) {
                objCreateInitConfigurationBuilder = atomicReference.get();
                if (objCreateInitConfigurationBuilder == null) {
                    objCreateInitConfigurationBuilder = createInitConfigurationBuilder();
                    if (objCreateInitConfigurationBuilder == null) {
                        objCreateInitConfigurationBuilder = atomicReference;
                    }
                    atomicReference.set(objCreateInitConfigurationBuilder);
                }
            }
        }
        if (objCreateInitConfigurationBuilder == atomicReference) {
            objCreateInitConfigurationBuilder = null;
        }
        return (AppLovinSdkInitializationConfiguration.Builder) objCreateInitConfigurationBuilder;
    }

    public static String getMRecLayout(String str) {
        if (initializeSdkCalled) {
            return getAdManager().getMRecLayout(str.trim());
        }
        logUninitializedAccessError("GetMRecLayout");
        return "";
    }

    private static MaxSegmentCollection getMaxSegmentCollection(String str) {
        MaxSegmentCollection.Builder builder = MaxSegmentCollection.builder();
        JSONArray jSONArray = JsonUtils.getJSONArray(JsonUtils.deserialize(str), "segments", null);
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null);
            builder.addSegment(new MaxSegment(JsonUtils.getInt(jSONObject, SDKConstants.PARAM_KEY, -1), JsonUtils.toIntegerList(JsonUtils.getJSONArray(jSONObject, "values", null))));
        }
        return builder.build();
    }

    public static int getPurposeConsentStatus(int i10) {
        return getConsentStatusValue(AppLovinPrivacySettings.getPurposeConsentStatus(i10));
    }

    public static int[] getSafeAreaInsets() {
        MaxUnityAdManager.Insets safeInsets = getAdManager().getSafeInsets();
        return new int[]{safeInsets.left, safeInsets.top, safeInsets.right, safeInsets.bottom};
    }

    public static float getScreenDensity() {
        return Utils.getCurrentActivity().getResources().getDisplayMetrics().density;
    }

    public static AppLovinSdk getSdk() {
        AtomicReference<Object> atomicReference = sdk;
        Object appLovinSdk = atomicReference.get();
        if (appLovinSdk == null) {
            synchronized (atomicReference) {
                appLovinSdk = atomicReference.get();
                if (appLovinSdk == null) {
                    appLovinSdk = AppLovinSdk.getInstance(Utils.getCurrentActivity());
                    if (appLovinSdk == null) {
                        appLovinSdk = atomicReference;
                    }
                    atomicReference.set(appLovinSdk);
                }
            }
        }
        if (appLovinSdk == atomicReference) {
            appLovinSdk = null;
        }
        return (AppLovinSdk) appLovinSdk;
    }

    public static String getSdkConfiguration() {
        if (!initializeSdkCalled) {
            e("Failed to get SDK configuration - please ensure the AppLovin MAX Unity Plugin has been initialized by calling 'MaxSdk.InitializeSdk();'!");
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        AppLovinSdkConfiguration configuration = getSdk().getConfiguration();
        JsonUtils.putString(jSONObject, "consentFlowUserGeography", Integer.toString(configuration.getConsentFlowUserGeography().ordinal()));
        JsonUtils.putString(jSONObject, "consentDialogState", Integer.toString(configuration.getConsentDialogState().ordinal()));
        JsonUtils.putString(jSONObject, "countryCode", configuration.getCountryCode());
        JsonUtils.putString(jSONObject, "isSuccessfullyInitialized", String.valueOf(getSdk().isInitialized()));
        JsonUtils.putBoolean(jSONObject, "isTestModeEnabled", configuration.isTestModeEnabled());
        return jSONObject.toString();
    }

    public static int getSpecialFeatureOptInStatus(int i10) {
        return getConsentStatusValue(AppLovinPrivacySettings.getSpecialFeatureOptInStatus(i10));
    }

    public static int getTcfVendorConsentStatus(int i10) {
        return getConsentStatusValue(AppLovinPrivacySettings.getTcfVendorConsentStatus(i10));
    }

    public static boolean hasSupportedCmp() {
        if (initializeSdkCalled) {
            return getSdk().getCmpService().hasSupportedCmp();
        }
        logUninitializedAccessError("hasSupportedCmp");
        return false;
    }

    public static boolean hasUserConsent() {
        return AppLovinPrivacySettings.hasUserConsent();
    }

    public static void hideBanner(String str) {
        if (initializeSdkCalled) {
            getAdManager().hideBanner(str.trim());
        } else {
            logUninitializedAccessError("HideBanner");
        }
    }

    public static void hideMRec(String str) {
        if (initializeSdkCalled) {
            getAdManager().hideMRec(str.trim());
        } else {
            logUninitializedAccessError("HideMRec");
        }
    }

    public static void initializeSdk(String str, String str2) {
        AppLovinSdkInitializationConfiguration.Builder initConfigurationBuilder2 = getInitConfigurationBuilder();
        initConfigurationBuilder2.setPluginVersion("Max-Unity-8.6.2");
        initConfigurationBuilder2.setMediationProvider(AppLovinMediationProvider.MAX);
        initConfigurationBuilder2.setAdUnitIds(Arrays.asList(str.split(",")));
        getSdk().getSettings().setExtraParameter("applovin_unity_metadata", str2);
        getAdManager().initializeSdkWithCompletionHandler(getInitConfigurationBuilder().build(), new MaxUnityAdManager.Listener() { // from class: com.applovin.mediation.unity.l0
            @Override // com.applovin.mediation.unity.MaxUnityAdManager.Listener
            public final void onSdkInitializationComplete(AppLovinSdkConfiguration appLovinSdkConfiguration) {
                MaxUnityPlugin.isSdkInitialized = true;
            }
        });
        initializeSdkCalled = true;
    }

    public static boolean isAppOpenAdReady(String str) {
        if (initializeSdkCalled) {
            return getAdManager().isAppOpenAdReady(str.trim());
        }
        logUninitializedAccessError("IsAppOpenAdReady");
        return false;
    }

    public static boolean isDisableAllLogs() {
        return disableAllLogs;
    }

    public static boolean isDoNotSell() {
        return AppLovinPrivacySettings.isDoNotSell();
    }

    public static boolean isDoNotSellSet() {
        return AppLovinPrivacySettings.isDoNotSellSet();
    }

    public static boolean isInitialized() {
        return isSdkInitialized;
    }

    public static boolean isInterstitialReady(String str) {
        if (initializeSdkCalled) {
            return getAdManager().isInterstitialReady(str.trim());
        }
        logUninitializedAccessError("IsInterstitialReady");
        return false;
    }

    public static boolean isMuted() {
        return getSdk().getSettings().isMuted();
    }

    public static boolean isPhysicalDevice() {
        return !AppLovinSdkUtils.isEmulator();
    }

    public static boolean isRewardedAdReady(String str) {
        if (initializeSdkCalled) {
            return getAdManager().isRewardedAdReady(str.trim());
        }
        logUninitializedAccessError("IsRewardedAdReady");
        return false;
    }

    public static boolean isTablet() {
        return AppLovinSdkUtils.isTablet(Utils.getCurrentActivity());
    }

    public static boolean isUserConsentSet() {
        return AppLovinPrivacySettings.isUserConsentSet();
    }

    public static boolean isVerboseLoggingEnabled() {
        return getSdk().getSettings().isVerboseLoggingEnabled();
    }

    public static void loadAppOpenAd(String str) {
        if (initializeSdkCalled) {
            getAdManager().loadAppOpenAd(str.trim());
        } else {
            logUninitializedAccessError("LoadAppOpenAd");
        }
    }

    public static void loadBanner(String str) {
        if (initializeSdkCalled) {
            getAdManager().loadBanner(str.trim());
        } else {
            logUninitializedAccessError("LoadBanner");
        }
    }

    public static void loadInterstitial(String str) {
        if (initializeSdkCalled) {
            getAdManager().loadInterstitial(str.trim());
        } else {
            logUninitializedAccessError("LoadInterstitial");
        }
    }

    public static void loadMRec(String str) {
        if (initializeSdkCalled) {
            getAdManager().loadMRec(str.trim());
        } else {
            logUninitializedAccessError("LoadMRec");
        }
    }

    public static void loadRewardedAd(String str) {
        if (initializeSdkCalled) {
            getAdManager().loadRewardedAd(str.trim());
        } else {
            logUninitializedAccessError("LoadRewardedAd");
        }
    }

    private static void logUninitializedAccessError(String str) {
        e("[MaxUnityPlugin] ERROR: Failed to execute " + str + "() - please ensure the AppLovin MAX Unity Plugin has been initialized by calling 'MaxSdk.InitializeSdk();'!");
    }

    public static void setAppOpenAdExtraParameter(String str, String str2, String str3) {
        if (initializeSdkCalled) {
            getAdManager().setAppOpenAdExtraParameter(str.trim(), str2, str3);
        } else {
            logUninitializedAccessError("SetAppOpenAdExtraParameter");
        }
    }

    public static void setAppOpenAdLocalExtraParameter(String str, String str2, Object obj) {
        if (initializeSdkCalled) {
            getAdManager().setAppOpenAdLocalExtraParameter(str.trim(), str2, obj);
        } else {
            logUninitializedAccessError("SetAppOpenAdLocalExtraParameter");
        }
    }

    public static void setAppOpenAdLocalExtraParameterJson(String str, String str2, String str3) {
        if (!initializeSdkCalled) {
            logUninitializedAccessError("SetAppOpenAdLocalExtraParameter");
        } else {
            getAdManager().setAppOpenAdLocalExtraParameter(str.trim(), str2, getLocalExtraParameterValue(JsonUtils.deserialize(str3)));
        }
    }

    public static void setBackgroundCallback(MaxUnityAdManager.BackgroundCallback backgroundCallback) {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "name", "OnInitialCallbackEvent");
        backgroundCallback.onEvent(jSONObject.toString());
        MaxUnityAdManager.setBackgroundCallback(backgroundCallback);
    }

    public static void setBannerBackgroundColor(String str, String str2) {
        if (initializeSdkCalled) {
            getAdManager().setBannerBackgroundColor(str.trim(), str2);
        } else {
            logUninitializedAccessError("SetBannerBackgroundColor");
        }
    }

    public static void setBannerCustomData(String str, String str2) {
        if (initializeSdkCalled) {
            getAdManager().setBannerCustomData(str.trim(), str2);
        } else {
            logUninitializedAccessError("setBannerCustomData");
        }
    }

    public static void setBannerExtraParameter(String str, String str2, String str3) {
        if (initializeSdkCalled) {
            getAdManager().setBannerExtraParameter(str.trim(), str2, str3);
        } else {
            logUninitializedAccessError("SetBannerExtraParameter");
        }
    }

    public static void setBannerLocalExtraParameter(String str, String str2, Object obj) {
        if (initializeSdkCalled) {
            getAdManager().setBannerLocalExtraParameter(str.trim(), str2, obj);
        } else {
            logUninitializedAccessError("SetBannerLocalExtraParameter");
        }
    }

    public static void setBannerLocalExtraParameterJson(String str, String str2, String str3) {
        if (!initializeSdkCalled) {
            logUninitializedAccessError("SetBannerLocalExtraParameter");
        } else {
            getAdManager().setBannerLocalExtraParameter(str.trim(), str2, getLocalExtraParameterValue(JsonUtils.deserialize(str3)));
        }
    }

    public static void setBannerPlacement(String str, String str2) {
        if (initializeSdkCalled) {
            getAdManager().setBannerPlacement(str.trim(), str2);
        } else {
            logUninitializedAccessError("SetBannerPlacement");
        }
    }

    public static void setBannerWidth(String str, float f10) {
        if (initializeSdkCalled) {
            getAdManager().setBannerWidth(str.trim(), (int) f10);
        } else {
            logUninitializedAccessError("SetBannerWidth");
        }
    }

    public static void setCreativeDebuggerEnabled(boolean z10) {
        getSdk().getSettings().setCreativeDebuggerEnabled(z10);
    }

    public static void setDoNotSell(boolean z10) {
        AppLovinPrivacySettings.setDoNotSell(z10);
    }

    public static void setExceptionHandlerEnabled(boolean z10) {
        if (initializeSdkCalled) {
            e("Exception handler must be enabled/disabled before MAX SDK is initialized");
        } else {
            getInitConfigurationBuilder().setExceptionHandlerEnabled(z10);
        }
    }

    public static void setExtraParameter(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            e("ERROR: Failed to set extra parameter for null or empty key: \" + key");
            return;
        }
        if ("disable_all_logs".equals(str)) {
            disableAllLogs = Boolean.parseBoolean(str2);
        } else if ("use_legacy_safe_area".equals(str)) {
            shouldUseLegacySafeArea = Boolean.parseBoolean(str2);
        }
        getSdk().getSettings().setExtraParameter(str, str2);
    }

    public static void setHasUserConsent(boolean z10) {
        AppLovinPrivacySettings.setHasUserConsent(z10);
    }

    public static void setInterstitialExtraParameter(String str, String str2, String str3) {
        if (initializeSdkCalled) {
            getAdManager().setInterstitialExtraParameter(str.trim(), str2, str3);
        } else {
            logUninitializedAccessError("SetInterstitialExtraParameter");
        }
    }

    public static void setInterstitialLocalExtraParameter(String str, String str2, Object obj) {
        if (initializeSdkCalled) {
            getAdManager().setInterstitialLocalExtraParameter(str.trim(), str2, obj);
        } else {
            logUninitializedAccessError("SetInterstitialLocalExtraParameter");
        }
    }

    public static void setInterstitialLocalExtraParameterJson(String str, String str2, String str3) {
        if (!initializeSdkCalled) {
            logUninitializedAccessError("SetInterstitialLocalExtraParameter");
        } else {
            getAdManager().setInterstitialLocalExtraParameter(str.trim(), str2, getLocalExtraParameterValue(JsonUtils.deserialize(str3)));
        }
    }

    public static void setMRecCustomData(String str, String str2) {
        if (initializeSdkCalled) {
            getAdManager().setMRecCustomData(str.trim(), str2);
        } else {
            logUninitializedAccessError("setMRecCustomData");
        }
    }

    public static void setMRecExtraParameter(String str, String str2, String str3) {
        if (initializeSdkCalled) {
            getAdManager().setMRecExtraParameter(str.trim(), str2, str3);
        } else {
            logUninitializedAccessError("SetMRecExtraParameter");
        }
    }

    public static void setMRecLocalExtraParameter(String str, String str2, Object obj) {
        if (initializeSdkCalled) {
            getAdManager().setMRecLocalExtraParameter(str.trim(), str2, obj);
        } else {
            logUninitializedAccessError("SetMRecLocalExtraParameter");
        }
    }

    public static void setMRecLocalExtraParameterJson(String str, String str2, String str3) {
        if (!initializeSdkCalled) {
            logUninitializedAccessError("SetMRecLocalExtraParameter");
        } else {
            getAdManager().setMRecLocalExtraParameter(str.trim(), str2, getLocalExtraParameterValue(JsonUtils.deserialize(str3)));
        }
    }

    public static void setMRecPlacement(String str, String str2) {
        if (initializeSdkCalled) {
            getAdManager().setMRecPlacement(str.trim(), str2);
        } else {
            logUninitializedAccessError("SetMRecPlacement");
        }
    }

    public static void setMuted(boolean z10) {
        getSdk().getSettings().setMuted(z10);
    }

    public static void setRewardedAdExtraParameter(String str, String str2, String str3) {
        if (initializeSdkCalled) {
            getAdManager().setRewardedAdExtraParameter(str.trim(), str2, str3);
        } else {
            logUninitializedAccessError("SetRewardedAdExtraParameter");
        }
    }

    public static void setRewardedAdLocalExtraParameter(String str, String str2, Object obj) {
        if (initializeSdkCalled) {
            getAdManager().setRewardedAdLocalExtraParameter(str.trim(), str2, obj);
        } else {
            logUninitializedAccessError("SetRewardedAdLocalExtraParameter");
        }
    }

    public static void setRewardedAdLocalExtraParameterJson(String str, String str2, String str3) {
        if (!initializeSdkCalled) {
            logUninitializedAccessError("SetRewardedAdLocalExtraParameter");
        } else {
            getAdManager().setRewardedAdLocalExtraParameter(str.trim(), str2, getLocalExtraParameterValue(JsonUtils.deserialize(str3)));
        }
    }

    public static void setSdkKey(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ((AppLovinSdkInitializationConfigurationImpl.BuilderImpl) getInitConfigurationBuilder()).setSdkKey(str);
    }

    public static void setSegmentCollection(String str) {
        if (initializeSdkCalled) {
            e("Segment collection must be set before MAX SDK is initialized");
        } else {
            getInitConfigurationBuilder().setSegmentCollection(getMaxSegmentCollection(str));
        }
    }

    public static void setTestDeviceAdvertisingIds(String[] strArr) {
        if (initializeSdkCalled) {
            e("Test device advertising IDs must be set before MAX SDK is initialized");
        } else {
            getInitConfigurationBuilder().setTestDeviceAdvertisingIds(Arrays.asList(strArr));
        }
    }

    public static void setUserId(String str) {
        getSdk().getSettings().setUserIdentifier(str);
    }

    public static void setVerboseLogging(boolean z10) {
        getSdk().getSettings().setVerboseLogging(z10);
    }

    public static boolean shouldUseLegacySafeArea() {
        return shouldUseLegacySafeArea;
    }

    public static void showAppOpenAd(String str, String str2, String str3) {
        if (initializeSdkCalled) {
            getAdManager().showAppOpenAd(str.trim(), str2, str3);
        } else {
            logUninitializedAccessError("ShowAppOpenAd");
        }
    }

    public static void showBanner(String str) {
        if (initializeSdkCalled) {
            getAdManager().showBanner(str.trim());
        } else {
            logUninitializedAccessError("ShowBanner");
        }
    }

    public static void showCmpForExistingUser() {
        if (initializeSdkCalled) {
            getAdManager().showCmpForExistingUser();
        } else {
            logUninitializedAccessError("showCmpForExistingUser");
        }
    }

    public static void showCreativeDebugger() {
        if (initializeSdkCalled) {
            getSdk().showCreativeDebugger();
        } else {
            d("Failed to show creative debugger - please ensure the AppLovin MAX Unity Plugin has been initialized by calling 'MaxSdk.InitializeSdk();'!");
        }
    }

    public static void showInterstitial(String str, String str2, String str3) {
        if (initializeSdkCalled) {
            getAdManager().showInterstitial(str.trim(), str2, str3);
        } else {
            logUninitializedAccessError("ShowInterstitial");
        }
    }

    public static void showMRec(String str) {
        if (initializeSdkCalled) {
            getAdManager().showMRec(str.trim());
        } else {
            logUninitializedAccessError("ShowMRec");
        }
    }

    public static void showMediationDebugger() {
        if (initializeSdkCalled) {
            getSdk().showMediationDebugger();
        } else {
            d("Failed to show mediation debugger - please ensure the AppLovin MAX Unity Plugin has been initialized by calling 'MaxSdk.InitializeSdk();'!");
        }
    }

    public static void showRewardedAd(String str, String str2, String str3) {
        if (initializeSdkCalled) {
            getAdManager().showRewardedAd(str.trim(), str2, str3);
        } else {
            logUninitializedAccessError("ShowRewardedAd");
        }
    }

    public static void startBannerAutoRefresh(String str) {
        if (initializeSdkCalled) {
            getAdManager().startBannerAutoRefresh(str.trim());
        } else {
            logUninitializedAccessError("StartBannerAutoRefresh");
        }
    }

    public static void startMRecAutoRefresh(String str) {
        if (initializeSdkCalled) {
            getAdManager().startMRecAutoRefresh(str.trim());
        } else {
            logUninitializedAccessError("StartMRecAutoRefresh");
        }
    }

    public static void stopBannerAutoRefresh(String str) {
        if (initializeSdkCalled) {
            getAdManager().stopBannerAutoRefresh(str.trim());
        } else {
            logUninitializedAccessError("StopBannerAutoRefresh");
        }
    }

    public static void stopMRecAutoRefresh(String str) {
        if (initializeSdkCalled) {
            getAdManager().stopMRecAutoRefresh(str.trim());
        } else {
            logUninitializedAccessError("StopMRecAutoRefresh");
        }
    }

    public static void trackEvent(String str, String str2) {
        if (initializeSdkCalled) {
            getAdManager().trackEvent(str, str2);
        } else {
            logUninitializedAccessError("TrackEvent");
        }
    }

    public static void updateBannerPosition(String str, String str2) {
        if (initializeSdkCalled) {
            getAdManager().updateBannerPosition(str.trim(), str2);
        } else {
            logUninitializedAccessError("UpdateBannerPosition");
        }
    }

    public static void updateMRecPosition(String str, String str2) {
        if (initializeSdkCalled) {
            getAdManager().updateMRecPosition(str.trim(), str2);
        } else {
            logUninitializedAccessError("UpdateMRecPosition");
        }
    }

    private static Object getLocalExtraParameterValue(JSONObject jSONObject) {
        Object object = JsonUtils.getObject(jSONObject, ykDFMuXDQMaR.hJWbqWIFijlHR, null);
        if (object instanceof JSONArray) {
            return JsonUtils.optList((JSONArray) object, null);
        }
        if (!(object instanceof JSONObject)) {
            return object;
        }
        try {
            return JsonUtils.toStringObjectMap((JSONObject) object);
        } catch (JSONException e10) {
            e("Failed to create map from local extra parameter data: " + jSONObject + "Exception: " + e10);
            return null;
        }
    }

    private static void d(String str) {
        if (isDisableAllLogs()) {
            return;
        }
        Log.d(SDK_TAG, yhXxbqGRMeI.edhKvY + str);
    }

    public static void createBanner(String str, float f10, float f11, boolean z10) {
        if (!initializeSdkCalled) {
            logUninitializedAccessError("CreateBannerXY");
        } else {
            getAdManager().createBanner(str.trim(), f10, f11, z10);
        }
    }

    public static void createMRec(String str, float f10, float f11) {
        if (!initializeSdkCalled) {
            logUninitializedAccessError("CreateMRecXY");
        } else {
            getAdManager().createMRec(str.trim(), f10, f11);
        }
    }

    public static void updateBannerPosition(String str, float f10, float f11) {
        if (!initializeSdkCalled) {
            logUninitializedAccessError("UpdateBannerPositionXY");
        } else {
            getAdManager().updateBannerPosition(str.trim(), f10, f11);
        }
    }

    public static void updateMRecPosition(String str, float f10, float f11) {
        if (!initializeSdkCalled) {
            logUninitializedAccessError("UpdateMRecPositionXY");
        } else {
            getAdManager().updateMRecPosition(str.trim(), f10, f11);
        }
    }
}
