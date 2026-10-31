package com.applovin.mediation.unity;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdExpirationListener;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxAdViewConfiguration;
import com.applovin.mediation.MaxAdWaterfallInfo;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxNetworkResponseInfo;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.mediation.ads.MaxAppOpenAd;
import com.applovin.mediation.ads.MaxInterstitialAd;
import com.applovin.mediation.ads.MaxRewardedAd;
import com.applovin.sdk.AppLovinCmpError;
import com.applovin.sdk.AppLovinCmpService;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkInitializationConfiguration;
import com.applovin.sdk.AppLovinSdkUtils;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.ServerProtocol;
import d5.LXP.wcAlQCOdREZdI;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import k9.dW.xjwcmjDeOXR;
import org.json.JSONArray;
import org.json.JSONObject;
import rd.PSo.cNMUz;

/* JADX INFO: loaded from: classes2.dex */
public class MaxUnityAdManager implements MaxAdListener, MaxAdViewAdListener, MaxRewardedAdListener, MaxAdRevenueListener, MaxAdReviewListener, MaxAdExpirationListener, AppLovinCmpService.OnCompletedListener, MaxUnityApplicationStateChangeTracker.MaxUnityApplicationStateCallback {
    private static final String DEFAULT_AD_VIEW_POSITION = "top_left";
    private static final String KEY_RENDER_OUTSIDE_SAFE_AREA = "render_outside_safe_area";
    private static final String SDK_TAG = "AppLovinSdk";
    private static final String TAG = "MaxUnityAdManager";
    private static BackgroundCallback backgroundCallback;
    private static WeakReference<Activity> currentActivity;
    private View safeAreaBackground;
    private AppLovinSdk sdk;
    private static final Point DEFAULT_AD_VIEW_OFFSET = new Point(0, 0);
    private static final ScheduledThreadPoolExecutor threadPoolExecutor = new ScheduledThreadPoolExecutor(3, new SdkThreadFactory());
    private Integer publisherBannerBackgroundColor = null;
    private final Map<String, MaxInterstitialAd> interstitials = new HashMap(2);
    private final Map<String, MaxAppOpenAd> appOpenAds = new HashMap(2);
    private final Map<String, MaxRewardedAd> rewardedAds = new HashMap(2);
    private final Map<String, MaxAdView> adViews = new HashMap(2);
    private final Map<String, MaxAdFormat> adViewFormats = new HashMap(2);
    private final Map<String, String> adViewPositions = new HashMap(2);
    private final Map<String, Point> adViewOffsets = new HashMap(2);
    private final Map<String, Integer> adViewWidths = new HashMap(2);
    private final Map<String, MaxAd> adInfoMap = new HashMap();
    private final Object adInfoMapLock = new Object();
    private final Map<String, Map<String, String>> adViewExtraParametersToSetAfterCreate = new HashMap(1);
    private final Map<String, Map<String, Object>> adViewLocalExtraParametersToSetAfterCreate = new HashMap(1);
    private final Map<String, String> AdViewCustomDataToSetAfterCreate = new HashMap(1);
    private final List<String> AdUnitsToShowAfterCreate = new ArrayList(2);
    private final Set<String> disabledAdaptiveBannerAdUnitIds = new HashSet(2);
    private final Set<String> disabledAutoRefreshAdViewAdUnitIds = new HashSet(2);
    private final MaxUnityApplicationStateChangeTracker applicationStateChangeTracker = new MaxUnityApplicationStateChangeTracker(this);

    /* JADX INFO: loaded from: classes.dex */
    public interface BackgroundCallback {
        void onEvent(String str);
    }

    /* JADX INFO: loaded from: classes.dex */
    protected static class Insets {
        int bottom;
        int left;
        int right;
        int top;

        protected Insets() {
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public interface Listener {
        void onSdkInitializationComplete(AppLovinSdkConfiguration appLovinSdkConfiguration);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: loaded from: classes.dex */
    static class SdkThreadFactory implements ThreadFactory {
        private SdkThreadFactory() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "AppLovinSdk:Max-Unity-Plugin:shared");
            thread.setDaemon(true);
            thread.setPriority(5);
            thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: com.applovin.mediation.unity.k0
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public final void uncaughtException(Thread thread2, Throwable th) {
                    MaxUnityAdManager.access$100("Caught unhandled exceptions", th);
                }
            });
            return thread;
        }
    }

    public MaxUnityAdManager() {
        AppLovinSdkUtils.runOnUiThread(true, new Runnable() { // from class: com.applovin.mediation.unity.f0
            @Override // java.lang.Runnable
            public final void run() {
                this.f9579a.lambda$new$2();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void access$100(String str, Throwable th) {
        e(str, th);
    }

    private void createAdView(final String str, final MaxAdFormat maxAdFormat, final String str2, final Point point, final boolean z10) {
        Utils.runSafelyOnUiThread(getCurrentActivity(), new Runnable() { // from class: com.applovin.mediation.unity.l
            @Override // java.lang.Runnable
            public final void run() {
                this.f9606a.lambda$createAdView$19(maxAdFormat, str, str2, point, z10);
            }
        });
    }

    private JSONObject createAdWaterfallInfo(MaxAdWaterfallInfo maxAdWaterfallInfo) {
        JSONObject jSONObject = new JSONObject();
        if (maxAdWaterfallInfo == null) {
            return jSONObject;
        }
        JsonUtils.putString(jSONObject, "name", maxAdWaterfallInfo.getName());
        JsonUtils.putString(jSONObject, "testName", maxAdWaterfallInfo.getTestName());
        JSONArray jSONArray = new JSONArray();
        Iterator<MaxNetworkResponseInfo> it = maxAdWaterfallInfo.getNetworkResponses().iterator();
        while (it.hasNext()) {
            jSONArray.put(createNetworkResponseInfo(it.next()));
        }
        JsonUtils.putJsonArray(jSONObject, "networkResponses", jSONArray);
        JsonUtils.putString(jSONObject, "latencyMillis", String.valueOf(maxAdWaterfallInfo.getLatencyMillis()));
        return jSONObject;
    }

    private JSONObject createNetworkResponseInfo(MaxNetworkResponseInfo maxNetworkResponseInfo) {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "adLoadState", Integer.toString(maxNetworkResponseInfo.getAdLoadState().ordinal()));
        if (maxNetworkResponseInfo.getMediatedNetwork() != null) {
            JSONObject jSONObject2 = new JSONObject();
            JsonUtils.putString(jSONObject2, "name", maxNetworkResponseInfo.getMediatedNetwork().getName());
            JsonUtils.putString(jSONObject2, "adapterClassName", maxNetworkResponseInfo.getMediatedNetwork().getAdapterClassName());
            JsonUtils.putString(jSONObject2, "adapterVersion", maxNetworkResponseInfo.getMediatedNetwork().getAdapterVersion());
            JsonUtils.putString(jSONObject2, "sdkVersion", maxNetworkResponseInfo.getMediatedNetwork().getSdkVersion());
            JsonUtils.putInt(jSONObject2, "initializationStatus", maxNetworkResponseInfo.getMediatedNetwork().getInitializationStatus().getCode());
            JsonUtils.putJSONObject(jSONObject, "mediatedNetwork", jSONObject2);
        }
        JsonUtils.putJSONObject(jSONObject, "credentials", BundleUtils.toJSONObject(maxNetworkResponseInfo.getCredentials()));
        JsonUtils.putBoolean(jSONObject, "isBidding", maxNetworkResponseInfo.isBidding());
        MaxError error = maxNetworkResponseInfo.getError();
        if (error != null) {
            JSONObject jSONObject3 = new JSONObject();
            JsonUtils.putString(jSONObject3, "errorMessage", error.getMessage());
            JsonUtils.putString(jSONObject3, "adLoadFailureInfo", error.getAdLoadFailureInfo());
            JsonUtils.putString(jSONObject3, "errorCode", Integer.toString(error.getCode()));
            JsonUtils.putString(jSONObject3, "latencyMillis", String.valueOf(error.getRequestLatencyMillis()));
            JsonUtils.putJSONObject(jSONObject, "error", jSONObject3);
        }
        JsonUtils.putString(jSONObject, "latencyMillis", String.valueOf(maxNetworkResponseInfo.getLatencyMillis()));
        return jSONObject;
    }

    protected static Map<String, String> deserializeParameters(String str) {
        if (TextUtils.isEmpty(str)) {
            return Collections.emptyMap();
        }
        try {
            return JsonUtils.toStringMap(JsonUtils.jsonObjectFromJsonString(str, new JSONObject()));
        } catch (Throwable th) {
            e("Failed to deserialize: (" + str + ") with exception: " + th);
            return Collections.emptyMap();
        }
    }

    private void destroyAdView(final String str, final MaxAdFormat maxAdFormat) {
        Utils.runSafelyOnUiThread(getCurrentActivity(), new Runnable() { // from class: com.applovin.mediation.unity.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f9571a.lambda$destroyAdView$28(maxAdFormat, str);
            }
        });
    }

    private static void forwardUnityEvent(final JSONObject jSONObject) {
        Runnable runnable = new Runnable() { // from class: com.applovin.mediation.unity.t
            @Override // java.lang.Runnable
            public final void run() {
                MaxUnityAdManager.lambda$forwardUnityEvent$34(jSONObject);
            }
        };
        if (Utils.isMainThread()) {
            threadPoolExecutor.execute(runnable);
        } else {
            runnable.run();
        }
    }

    private MaxAd getAd(String str) {
        MaxAd maxAd;
        synchronized (this.adInfoMapLock) {
            maxAd = this.adInfoMap.get(str);
        }
        return maxAd;
    }

    private JSONObject getAdInfo(MaxAd maxAd) {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "adUnitId", maxAd.getAdUnitId());
        JsonUtils.putString(jSONObject, "adFormat", maxAd.getFormat().getLabel());
        JsonUtils.putString(jSONObject, "networkName", maxAd.getNetworkName());
        JsonUtils.putString(jSONObject, "networkPlacement", maxAd.getNetworkPlacement());
        JsonUtils.putString(jSONObject, "creativeId", !TextUtils.isEmpty(maxAd.getCreativeId()) ? maxAd.getCreativeId() : "");
        JsonUtils.putString(jSONObject, "placement", !TextUtils.isEmpty(maxAd.getPlacement()) ? maxAd.getPlacement() : "");
        JsonUtils.putString(jSONObject, "revenue", String.valueOf(maxAd.getRevenue()));
        JsonUtils.putString(jSONObject, "revenuePrecision", maxAd.getRevenuePrecision());
        JsonUtils.putJSONObject(jSONObject, "waterfallInfo", createAdWaterfallInfo(maxAd.getWaterfall()));
        JsonUtils.putString(jSONObject, "latencyMillis", String.valueOf(maxAd.getRequestLatencyMillis()));
        JsonUtils.putString(jSONObject, "dspName", TextUtils.isEmpty(maxAd.getDspName()) ? "" : maxAd.getDspName());
        return jSONObject;
    }

    private MaxAdFormat getAdViewAdFormat(String str) {
        return this.adViewFormats.containsKey(str) ? this.adViewFormats.get(str) : getDeviceSpecificAdViewAdFormat();
    }

    private String getAdViewLayout(String str, MaxAdFormat maxAdFormat) {
        d("Getting " + maxAdFormat.getLabel() + " absolute position with ad unit id \"" + str + "\"");
        MaxAdView maxAdViewRetrieveAdView = retrieveAdView(str, maxAdFormat);
        if (maxAdViewRetrieveAdView == null) {
            e(maxAdFormat.getLabel() + " does not exist");
            return "";
        }
        int[] iArr = new int[2];
        maxAdViewRetrieveAdView.getLocationOnScreen(iArr);
        int iPxToDp = AppLovinSdkUtils.pxToDp(getCurrentActivity(), iArr[0]);
        int iPxToDp2 = AppLovinSdkUtils.pxToDp(getCurrentActivity(), iArr[1]);
        int iPxToDp3 = AppLovinSdkUtils.pxToDp(getCurrentActivity(), maxAdViewRetrieveAdView.getWidth());
        int iPxToDp4 = AppLovinSdkUtils.pxToDp(getCurrentActivity(), maxAdViewRetrieveAdView.getHeight());
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "origin_x", String.valueOf(iPxToDp));
        JsonUtils.putString(jSONObject, "origin_y", String.valueOf(iPxToDp2));
        JsonUtils.putString(jSONObject, ViewHierarchyConstants.DIMENSION_WIDTH_KEY, String.valueOf(iPxToDp3));
        JsonUtils.putString(jSONObject, ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, String.valueOf(iPxToDp4));
        return jSONObject.toString();
    }

    public static float getAdaptiveBannerHeight(float f10) {
        return getDeviceSpecificAdViewAdFormat().getAdaptiveSize((int) f10, getCurrentActivity()).getHeight();
    }

    private static Activity getCurrentActivity() {
        return Utils.getCurrentActivity();
    }

    private JSONObject getDefaultAdEventParameters(String str, MaxAd maxAd) {
        JSONObject adInfo = getAdInfo(maxAd);
        JsonUtils.putString(adInfo, "name", str);
        return adInfo;
    }

    private static MaxAdFormat getDeviceSpecificAdViewAdFormat() {
        return AppLovinSdkUtils.isTablet(getCurrentActivity()) ? MaxAdFormat.LEADER : MaxAdFormat.BANNER;
    }

    private static Point getOffsetPixels(float f10, float f11, Context context) {
        return new Point(AppLovinSdkUtils.dpToPx(context, (int) f10), AppLovinSdkUtils.dpToPx(context, (int) f11));
    }

    private boolean getRenderOutsideSafeArea() {
        return Boolean.parseBoolean(this.sdk.getSettings().getExtraParameters().get(KEY_RENDER_OUTSIDE_SAFE_AREA));
    }

    private void hideAdView(final String str, final MaxAdFormat maxAdFormat) {
        Utils.runSafelyOnUiThread(getCurrentActivity(), new Runnable() { // from class: com.applovin.mediation.unity.p
            @Override // java.lang.Runnable
            public final void run() {
                this.f9617a.lambda$hideAdView$27(maxAdFormat, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createAdView$19(MaxAdFormat maxAdFormat, String str, String str2, Point point, boolean z10) {
        Map<String, Object> map;
        d("Creating " + maxAdFormat.getLabel() + " with ad unit id \"" + str + "\" and position: \"" + str2 + "\"");
        if (this.adViews.get(str) != null) {
            w("Trying to create a " + maxAdFormat.getLabel() + " that was already created. This will cause the current ad to be hidden.");
        }
        MaxAdView maxAdViewRetrieveAdView = retrieveAdView(str, maxAdFormat, str2, point, z10);
        if (maxAdViewRetrieveAdView == null) {
            e(maxAdFormat.getLabel() + " does not exist");
            return;
        }
        this.safeAreaBackground.setVisibility(8);
        maxAdViewRetrieveAdView.setVisibility(8);
        if (maxAdViewRetrieveAdView.getParent() == null) {
            Activity currentActivity2 = getCurrentActivity();
            RelativeLayout relativeLayout = new RelativeLayout(currentActivity2);
            currentActivity2.addContentView(relativeLayout, new LinearLayout.LayoutParams(-1, -1));
            relativeLayout.addView(maxAdViewRetrieveAdView);
            this.adViewFormats.put(str, maxAdFormat);
            positionAdView(str, maxAdFormat);
        }
        Map<String, String> map2 = this.adViewExtraParametersToSetAfterCreate.get(str);
        if (map2 != null) {
            for (Map.Entry<String, String> entry : map2.entrySet()) {
                maxAdViewRetrieveAdView.setExtraParameter(entry.getKey(), entry.getValue());
                maybeHandleExtraParameterChanges(str, maxAdFormat, entry.getKey(), entry.getValue());
            }
            this.adViewExtraParametersToSetAfterCreate.remove(str);
        }
        if (this.adViewLocalExtraParametersToSetAfterCreate.containsKey(str) && (map = this.adViewLocalExtraParametersToSetAfterCreate.get(str)) != null) {
            for (Map.Entry<String, Object> entry2 : map.entrySet()) {
                maxAdViewRetrieveAdView.setLocalExtraParameter(entry2.getKey(), entry2.getValue());
            }
            this.adViewLocalExtraParametersToSetAfterCreate.remove(str);
        }
        if (this.AdViewCustomDataToSetAfterCreate.containsKey(str)) {
            maxAdViewRetrieveAdView.setCustomData(this.AdViewCustomDataToSetAfterCreate.get(str));
            this.AdViewCustomDataToSetAfterCreate.remove(str);
        }
        maxAdViewRetrieveAdView.loadAd();
        if (this.disabledAutoRefreshAdViewAdUnitIds.contains(str)) {
            maxAdViewRetrieveAdView.stopAutoRefresh();
        }
        if (this.AdUnitsToShowAfterCreate.contains(str)) {
            showAdView(str, maxAdFormat);
            this.AdUnitsToShowAfterCreate.remove(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$destroyAdView$28(MaxAdFormat maxAdFormat, String str) {
        d("Destroying " + maxAdFormat.getLabel() + " with ad unit id \"" + str + "\"");
        MaxAdView maxAdViewRetrieveAdView = retrieveAdView(str, maxAdFormat);
        if (maxAdViewRetrieveAdView == null) {
            e(maxAdFormat.getLabel() + " does not exist");
            return;
        }
        ViewParent parent = maxAdViewRetrieveAdView.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(maxAdViewRetrieveAdView);
        }
        maxAdViewRetrieveAdView.setListener(null);
        maxAdViewRetrieveAdView.setRevenueListener(null);
        maxAdViewRetrieveAdView.setAdReviewListener(null);
        maxAdViewRetrieveAdView.destroy();
        this.adViews.remove(str);
        this.adViewFormats.remove(str);
        this.adViewPositions.remove(str);
        this.adViewOffsets.remove(str);
        this.adViewWidths.remove(str);
        this.disabledAdaptiveBannerAdUnitIds.remove(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$forwardUnityEvent$34(JSONObject jSONObject) {
        backgroundCallback.onEvent(jSONObject.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$hideAdView$27(MaxAdFormat maxAdFormat, String str) {
        d("Hiding " + maxAdFormat.getLabel() + " with ad unit id \"" + str + "\"");
        this.AdUnitsToShowAfterCreate.remove(str);
        MaxAdView maxAdViewRetrieveAdView = retrieveAdView(str, maxAdFormat);
        if (maxAdViewRetrieveAdView != null) {
            this.safeAreaBackground.setVisibility(8);
            maxAdViewRetrieveAdView.setVisibility(8);
            maxAdViewRetrieveAdView.stopAutoRefresh();
        } else {
            e(maxAdFormat.getLabel() + " does not exist");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initializeSdkWithCompletionHandler$3(Listener listener, AppLovinSdkConfiguration appLovinSdkConfiguration) {
        listener.onSdkInitializationComplete(appLovinSdkConfiguration);
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "name", "OnSdkInitializedEvent");
        JsonUtils.putString(jSONObject, "consentFlowUserGeography", Integer.toString(appLovinSdkConfiguration.getConsentFlowUserGeography().ordinal()));
        JsonUtils.putString(jSONObject, "consentDialogState", Integer.toString(appLovinSdkConfiguration.getConsentDialogState().ordinal()));
        JsonUtils.putString(jSONObject, "countryCode", appLovinSdkConfiguration.getCountryCode());
        JsonUtils.putString(jSONObject, "isSuccessfullyInitialized", String.valueOf(this.sdk.isInitialized()));
        JsonUtils.putBoolean(jSONObject, "isTestModeEnabled", appLovinSdkConfiguration.isTestModeEnabled());
        forwardUnityEvent(jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initializeSdkWithCompletionHandler$4(final Listener listener, final AppLovinSdkConfiguration appLovinSdkConfiguration) {
        threadPoolExecutor.execute(new Runnable() { // from class: com.applovin.mediation.unity.w
            @Override // java.lang.Runnable
            public final void run() {
                this.f9632a.lambda$initializeSdkWithCompletionHandler$3(listener, appLovinSdkConfiguration);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadAdView$20(String str, MaxAdFormat maxAdFormat) {
        MaxAdView maxAdViewRetrieveAdView = retrieveAdView(str, maxAdFormat);
        if (maxAdViewRetrieveAdView == null) {
            e(maxAdFormat.getLabel() + " does not exist");
            return;
        }
        if (this.disabledAutoRefreshAdViewAdUnitIds.contains(str)) {
            maxAdViewRetrieveAdView.loadAd();
            return;
        }
        if (maxAdViewRetrieveAdView.getVisibility() != 0) {
            e("Auto-refresh will resume when the " + maxAdFormat.getLabel() + " ad is shown. You should only call LoadBanner() or LoadMRec() if you explicitly pause auto-refresh and want to manually load an ad.");
            return;
        }
        e("You must stop auto-refresh if you want to manually load " + maxAdFormat.getLabel() + " ads.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        Iterator<MaxAdView> it = this.adViews.values().iterator();
        while (it.hasNext()) {
            Object parent = it.next().getParent();
            if (parent instanceof View) {
                ((View) parent).bringToFront();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        if ((i10 == i14 && i12 == i16 && i13 == i17 && i11 == i15) ? false : true) {
            for (Map.Entry<String, MaxAdFormat> entry : this.adViewFormats.entrySet()) {
                positionAdView(entry.getKey(), entry.getValue());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$2() {
        View view = new View(getCurrentActivity());
        this.safeAreaBackground = view;
        view.setVisibility(8);
        this.safeAreaBackground.setBackgroundColor(0);
        this.safeAreaBackground.setClickable(false);
        FrameLayout frameLayout = new FrameLayout(getCurrentActivity());
        frameLayout.addView(this.safeAreaBackground, new FrameLayout.LayoutParams(0, 0));
        getCurrentActivity().addContentView(frameLayout, new LinearLayout.LayoutParams(-1, -1));
        Object parent = frameLayout.getParent();
        if (parent instanceof View) {
            ((View) parent).addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.applovin.mediation.unity.k
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view2, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                    this.f9605a.lambda$new$0(view2, i10, i11, i12, i13, i14, i15, i16, i17);
                }
            });
        }
        getCurrentActivity().getWindow().getDecorView().getRootView().addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.applovin.mediation.unity.m
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                this.f9612a.lambda$new$1(view2, i10, i11, i12, i13, i14, i15, i16, i17);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onAdClicked$9(MaxAd maxAd) {
        String str;
        MaxAdFormat format = maxAd.getFormat();
        if (MaxAdFormat.BANNER == format || MaxAdFormat.LEADER == format) {
            str = "OnBannerAdClickedEvent";
        } else if (MaxAdFormat.MREC == format) {
            str = "OnMRecAdClickedEvent";
        } else if (MaxAdFormat.INTERSTITIAL == format) {
            str = "OnInterstitialClickedEvent";
        } else if (MaxAdFormat.APP_OPEN == format) {
            str = "OnAppOpenAdClickedEvent";
        } else {
            if (MaxAdFormat.REWARDED != format) {
                logInvalidAdFormat(format);
                return;
            }
            str = "OnRewardedAdClickedEvent";
        }
        forwardUnityEvent(getDefaultAdEventParameters(str, maxAd));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onAdCollapsed$13(MaxAd maxAd) {
        MaxAdFormat format = maxAd.getFormat();
        if (format.isAdViewAd()) {
            forwardUnityEvent(getDefaultAdEventParameters(MaxAdFormat.MREC == format ? "OnMRecAdCollapsedEvent" : "OnBannerAdCollapsedEvent", maxAd));
        } else {
            logInvalidAdFormat(format);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onAdDisplayFailed$11(MaxAd maxAd, MaxError maxError) {
        String str;
        MaxAdFormat format = maxAd.getFormat();
        if (format.isFullscreenAd()) {
            if (MaxAdFormat.INTERSTITIAL == format) {
                str = "OnInterstitialAdFailedToDisplayEvent";
            } else {
                str = MaxAdFormat.APP_OPEN == format ? "OnAppOpenAdFailedToDisplayEvent" : "OnRewardedAdFailedToDisplayEvent";
            }
            JSONObject defaultAdEventParameters = getDefaultAdEventParameters(str, maxAd);
            JsonUtils.putString(defaultAdEventParameters, "errorCode", Integer.toString(maxError.getCode()));
            JsonUtils.putString(defaultAdEventParameters, "errorMessage", maxError.getMessage());
            JsonUtils.putString(defaultAdEventParameters, "mediatedNetworkErrorCode", Integer.toString(maxError.getMediatedNetworkErrorCode()));
            JsonUtils.putString(defaultAdEventParameters, "mediatedNetworkErrorMessage", maxError.getMediatedNetworkErrorMessage());
            JsonUtils.putJSONObject(defaultAdEventParameters, "waterfallInfo", createAdWaterfallInfo(maxError.getWaterfall()));
            JsonUtils.putString(defaultAdEventParameters, "latencyMillis", String.valueOf(maxError.getRequestLatencyMillis()));
            forwardUnityEvent(defaultAdEventParameters);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onAdDisplayed$10(MaxAd maxAd) {
        String str;
        MaxAdFormat format = maxAd.getFormat();
        if (format.isFullscreenAd()) {
            if (MaxAdFormat.INTERSTITIAL == format) {
                str = "OnInterstitialDisplayedEvent";
            } else {
                str = MaxAdFormat.APP_OPEN == format ? "OnAppOpenAdDisplayedEvent" : "OnRewardedAdDisplayedEvent";
            }
            forwardUnityEvent(getDefaultAdEventParameters(str, maxAd));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onAdExpanded$14(MaxAd maxAd) {
        MaxAdFormat format = maxAd.getFormat();
        if (format.isAdViewAd()) {
            forwardUnityEvent(getDefaultAdEventParameters(MaxAdFormat.MREC == format ? "OnMRecAdExpandedEvent" : "OnBannerAdExpandedEvent", maxAd));
        } else {
            logInvalidAdFormat(format);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onAdHidden$12(MaxAd maxAd) {
        String str;
        MaxAdFormat format = maxAd.getFormat();
        if (format.isFullscreenAd()) {
            if (MaxAdFormat.INTERSTITIAL == format) {
                str = "OnInterstitialHiddenEvent";
            } else {
                str = MaxAdFormat.APP_OPEN == format ? "OnAppOpenAdHiddenEvent" : "OnRewardedAdHiddenEvent";
            }
            forwardUnityEvent(getDefaultAdEventParameters(str, maxAd));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onAdLoaded$7(MaxAd maxAd) {
        String str;
        MaxAdFormat format = maxAd.getFormat();
        if (format.isAdViewAd()) {
            str = MaxAdFormat.MREC == format ? "OnMRecAdLoadedEvent" : "OnBannerAdLoadedEvent";
            positionAdView(maxAd);
            MaxAdView maxAdViewRetrieveAdView = retrieveAdView(maxAd.getAdUnitId(), format);
            if (maxAdViewRetrieveAdView != null && maxAdViewRetrieveAdView.getVisibility() != 0) {
                maxAdViewRetrieveAdView.stopAutoRefresh();
            }
        } else if (MaxAdFormat.INTERSTITIAL == format) {
            str = "OnInterstitialLoadedEvent";
        } else if (MaxAdFormat.APP_OPEN == format) {
            str = "OnAppOpenAdLoadedEvent";
        } else {
            if (MaxAdFormat.REWARDED != format) {
                logInvalidAdFormat(format);
                return;
            }
            str = "OnRewardedAdLoadedEvent";
        }
        synchronized (this.adInfoMapLock) {
            this.adInfoMap.put(maxAd.getAdUnitId(), maxAd);
        }
        forwardUnityEvent(getDefaultAdEventParameters(str, maxAd));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onAdRevenuePaid$16(MaxAd maxAd) {
        String str;
        MaxAdFormat format = maxAd.getFormat();
        if (MaxAdFormat.BANNER == format || MaxAdFormat.LEADER == format) {
            str = "OnBannerAdRevenuePaidEvent";
        } else if (MaxAdFormat.MREC == format) {
            str = "OnMRecAdRevenuePaidEvent";
        } else if (MaxAdFormat.INTERSTITIAL == format) {
            str = "OnInterstitialAdRevenuePaidEvent";
        } else if (MaxAdFormat.APP_OPEN == format) {
            str = "OnAppOpenAdRevenuePaidEvent";
        } else {
            if (MaxAdFormat.REWARDED != format) {
                logInvalidAdFormat(format);
                return;
            }
            str = "OnRewardedAdRevenuePaidEvent";
        }
        JSONObject defaultAdEventParameters = getDefaultAdEventParameters(str, maxAd);
        JsonUtils.putBoolean(defaultAdEventParameters, "keepInBackground", format.isFullscreenAd());
        forwardUnityEvent(defaultAdEventParameters);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onApplicationStateChanged$6(boolean z10) {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "name", "OnApplicationStateChanged");
        JsonUtils.putBoolean(jSONObject, "isPaused", z10);
        forwardUnityEvent(jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onCompleted$5(AppLovinCmpError appLovinCmpError) {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "name", "OnCmpCompletedEvent");
        JsonUtils.putBoolean(jSONObject, "keepInBackground", true);
        if (appLovinCmpError != null) {
            JSONObject jSONObject2 = new JSONObject();
            JsonUtils.putInt(jSONObject2, "code", appLovinCmpError.getCode().getValue());
            JsonUtils.putString(jSONObject2, "message", appLovinCmpError.getMessage());
            JsonUtils.putInt(jSONObject2, "cmpCode", appLovinCmpError.getCmpCode());
            JsonUtils.putString(jSONObject2, "cmpMessage", appLovinCmpError.getCmpMessage());
            JsonUtils.putJSONObject(jSONObject, "error", jSONObject2);
        }
        forwardUnityEvent(jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreativeIdGenerated$18(MaxAd maxAd, String str) {
        String str2;
        MaxAdFormat format = maxAd.getFormat();
        if (MaxAdFormat.BANNER == format || MaxAdFormat.LEADER == format) {
            str2 = "OnBannerAdReviewCreativeIdGeneratedEvent";
        } else if (MaxAdFormat.MREC == format) {
            str2 = "OnMRecAdReviewCreativeIdGeneratedEvent";
        } else if (MaxAdFormat.INTERSTITIAL == format) {
            str2 = "OnInterstitialAdReviewCreativeIdGeneratedEvent";
        } else {
            if (MaxAdFormat.REWARDED != format) {
                logInvalidAdFormat(format);
                return;
            }
            str2 = "OnRewardedAdReviewCreativeIdGeneratedEvent";
        }
        JSONObject defaultAdEventParameters = getDefaultAdEventParameters(str2, maxAd);
        JsonUtils.putString(defaultAdEventParameters, "adReviewCreativeId", str);
        JsonUtils.putBoolean(defaultAdEventParameters, "keepInBackground", format.isFullscreenAd());
        forwardUnityEvent(defaultAdEventParameters);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onExpiredAdReloaded$17(MaxAd maxAd, MaxAd maxAd2) {
        String str;
        MaxAdFormat format = maxAd.getFormat();
        if (MaxAdFormat.INTERSTITIAL == format) {
            str = "OnExpiredInterstitialAdReloadedEvent";
        } else if (MaxAdFormat.APP_OPEN == format) {
            str = "OnExpiredAppOpenAdReloadedEvent";
        } else {
            if (MaxAdFormat.REWARDED != format) {
                logInvalidAdFormat(format);
                return;
            }
            str = "OnExpiredRewardedAdReloadedEvent";
        }
        synchronized (this.adInfoMapLock) {
            this.adInfoMap.put(maxAd.getAdUnitId(), maxAd);
        }
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putJSONObject(jSONObject, "expiredAdInfo", getAdInfo(maxAd2));
        JsonUtils.putJSONObject(jSONObject, "newAdInfo", getAdInfo(maxAd));
        JsonUtils.putString(jSONObject, "name", str);
        forwardUnityEvent(jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onUserRewarded$15(MaxAd maxAd, MaxReward maxReward) {
        MaxAdFormat format = maxAd.getFormat();
        if (format != MaxAdFormat.REWARDED) {
            logInvalidAdFormat(format);
            return;
        }
        String label = maxReward.getLabel();
        String string = Integer.toString(maxReward.getAmount());
        JSONObject defaultAdEventParameters = getDefaultAdEventParameters("OnRewardedAdReceivedRewardEvent", maxAd);
        JsonUtils.putString(defaultAdEventParameters, "rewardLabel", label);
        JsonUtils.putString(defaultAdEventParameters, "rewardAmount", string);
        forwardUnityEvent(defaultAdEventParameters);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:77:0x01bd A[PHI: r11
      0x01bd: PHI (r11v14 int) = (r11v13 int), (r11v15 int) binds: [B:75:0x01b8, B:53:0x0158] A[DONT_GENERATE, DONT_INLINE]] */
    public /* synthetic */ void lambda$positionAdView$33(String str, MaxAdFormat maxAdFormat) {
        int iPxToDp;
        int i10;
        int i11;
        MaxAdFormat maxAdFormat2;
        MaxAdView maxAdViewRetrieveAdView = retrieveAdView(str, maxAdFormat);
        if (maxAdViewRetrieveAdView == null) {
            e(maxAdFormat.getLabel() + " does not exist");
            return;
        }
        RelativeLayout relativeLayout = (RelativeLayout) maxAdViewRetrieveAdView.getParent();
        if (relativeLayout == null) {
            e(maxAdFormat.getLabel() + "'s parent does not exist");
            return;
        }
        Rect rect = new Rect();
        relativeLayout.getWindowVisibleDisplayFrame(rect);
        String str2 = this.adViewPositions.get(str);
        Point point = this.adViewOffsets.get(str);
        Insets safeInsets = getSafeInsets();
        boolean zContains = this.disabledAdaptiveBannerAdUnitIds.contains(str);
        boolean zContainsKey = this.adViewWidths.containsKey(str);
        if (zContainsKey) {
            iPxToDp = this.adViewWidths.get(str).intValue();
        } else if ("top_center".equalsIgnoreCase(str2) || "bottom_center".equalsIgnoreCase(str2)) {
            iPxToDp = AppLovinSdkUtils.pxToDp(getCurrentActivity(), rect.width());
        } else {
            iPxToDp = maxAdFormat.getSize().getWidth();
        }
        MaxAdFormat maxAdFormat3 = MaxAdFormat.BANNER;
        int height = ((maxAdFormat == maxAdFormat3 || maxAdFormat == MaxAdFormat.LEADER) && !zContains) ? maxAdFormat.getAdaptiveSize(iPxToDp, getCurrentActivity()).getHeight() : maxAdFormat.getSize().getHeight();
        int iDpToPx = AppLovinSdkUtils.dpToPx(getCurrentActivity(), iPxToDp);
        int iDpToPx2 = AppLovinSdkUtils.dpToPx(getCurrentActivity(), height);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) maxAdViewRetrieveAdView.getLayoutParams();
        layoutParams.height = iDpToPx2;
        maxAdViewRetrieveAdView.setLayoutParams(layoutParams);
        maxAdViewRetrieveAdView.setRotation(0.0f);
        maxAdViewRetrieveAdView.setTranslationX(0.0f);
        layoutParams.setMargins(0, 0, 0, 0);
        int i12 = safeInsets.left + point.x;
        int i13 = safeInsets.top + point.y;
        int i14 = safeInsets.right;
        int i15 = safeInsets.bottom;
        int i16 = 1;
        if ("centered".equalsIgnoreCase(str2)) {
            if (MaxAdFormat.MREC == maxAdFormat || zContainsKey) {
                layoutParams.width = iDpToPx;
            } else {
                layoutParams.width = -1;
            }
            i11 = 17;
            maxAdFormat2 = maxAdFormat3;
        } else {
            if (str2.contains(ViewHierarchyConstants.DIMENSION_TOP_KEY)) {
                i10 = 48;
            } else {
                i10 = str2.contains("bottom") ? 80 : 0;
            }
            if (str2.contains("center")) {
                i10 |= 1;
                MaxAdFormat maxAdFormat4 = MaxAdFormat.MREC;
                if (maxAdFormat4 == maxAdFormat || zContainsKey) {
                    layoutParams.width = iDpToPx;
                } else {
                    layoutParams.width = -1;
                }
                boolean zContains2 = str2.contains(ViewHierarchyConstants.DIMENSION_LEFT_KEY);
                boolean zContains3 = str2.contains("right");
                if (zContains2 || zContains3) {
                    int i17 = i10 | 16;
                    if (maxAdFormat4 == maxAdFormat) {
                        i17 |= str2.contains(ViewHierarchyConstants.DIMENSION_LEFT_KEY) ? 3 : 5;
                    } else {
                        int iWidth = (rect.width() - safeInsets.left) - safeInsets.right;
                        int iHeight = (rect.height() - safeInsets.top) - safeInsets.bottom;
                        int iMax = ((iHeight > iWidth ? -1 : 1) * (Math.max(iWidth, iHeight) - Math.min(iWidth, iHeight))) / 2;
                        i12 += iMax;
                        i14 += iMax;
                        int i18 = (iWidth / 2) - (iDpToPx2 / 2);
                        if (zContains2) {
                            i18 = -i18;
                        }
                        maxAdViewRetrieveAdView.setTranslationX(i18);
                        maxAdViewRetrieveAdView.setRotation(90.0f);
                    }
                    relativeLayout.setBackgroundColor(0);
                    i11 = i17;
                } else {
                    i11 = i10;
                }
            } else {
                layoutParams.width = iDpToPx;
                if (str2.contains(ViewHierarchyConstants.DIMENSION_LEFT_KEY)) {
                    i11 = i10 | 3;
                } else if (str2.contains("right")) {
                    i11 = i10 | 5;
                } else {
                    i11 = i10;
                }
            }
            maxAdFormat2 = maxAdFormat3;
        }
        if (maxAdFormat2 == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) {
            if (this.publisherBannerBackgroundColor != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.safeAreaBackground.getLayoutParams();
                if ("top_center".equals(str2)) {
                    layoutParams2.height = safeInsets.top;
                    layoutParams2.width = -1;
                    this.safeAreaBackground.setVisibility(maxAdViewRetrieveAdView.getVisibility());
                    i12 -= safeInsets.left;
                    i14 -= safeInsets.right;
                    i16 = 49;
                } else if ("bottom_center".equals(str2)) {
                    layoutParams2.height = safeInsets.bottom;
                    layoutParams2.width = -1;
                    this.safeAreaBackground.setVisibility(maxAdViewRetrieveAdView.getVisibility());
                    i12 -= safeInsets.left;
                    i14 -= safeInsets.right;
                    i16 = 81;
                } else {
                    this.safeAreaBackground.setVisibility(8);
                }
                layoutParams2.gravity = i16;
                this.safeAreaBackground.requestLayout();
            } else {
                this.safeAreaBackground.setVisibility(8);
            }
        }
        layoutParams.setMargins(i12, i13, i14, i15);
        relativeLayout.setGravity(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setAdViewBackgroundColor$29(MaxAdFormat maxAdFormat, String str, String str2) {
        d("Setting " + maxAdFormat.getLabel() + " with ad unit id \"" + str + "\" to color: " + str2);
        MaxAdView maxAdViewRetrieveAdView = retrieveAdView(str, maxAdFormat);
        if (maxAdViewRetrieveAdView == null) {
            e(maxAdFormat.getLabel() + " does not exist");
            return;
        }
        int color = Color.parseColor(str2);
        this.publisherBannerBackgroundColor = Integer.valueOf(color);
        this.safeAreaBackground.setBackgroundColor(color);
        maxAdViewRetrieveAdView.setBackgroundColor(color);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setAdViewCustomData$32(String str, MaxAdFormat maxAdFormat, String str2) {
        MaxAdView maxAdViewRetrieveAdView = retrieveAdView(str, maxAdFormat);
        if (maxAdViewRetrieveAdView != null) {
            maxAdViewRetrieveAdView.setCustomData(str2);
            return;
        }
        d(maxAdFormat.getLabel() + " does not exist for ad unit ID \"" + str + "\". Saving custom data to be set when it is created.");
        this.AdViewCustomDataToSetAfterCreate.put(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setAdViewLocalExtraParameter$31(MaxAdFormat maxAdFormat, String str, Object obj, String str2) {
        d("Setting " + maxAdFormat.getLabel() + " local extra with key: \"" + str + "\" value: " + obj);
        MaxAdView maxAdViewRetrieveAdView = retrieveAdView(str2, maxAdFormat);
        if (maxAdViewRetrieveAdView != null) {
            maxAdViewRetrieveAdView.setLocalExtraParameter(str, obj);
            return;
        }
        d(maxAdFormat.getLabel() + " does not exist for ad unit ID \"" + str2 + "\". Saving local extra parameter to be set when it is created.");
        Map<String, Object> map = this.adViewLocalExtraParametersToSetAfterCreate.get(str2);
        if (map == null) {
            map = new HashMap<>(1);
            this.adViewLocalExtraParametersToSetAfterCreate.put(str2, map);
        }
        map.put(str, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setAdViewPlacement$21(String str, MaxAdFormat maxAdFormat, String str2) {
        d("Setting placement \"" + str + "\" for " + maxAdFormat.getLabel() + " with ad unit id \"" + str2 + "\"");
        MaxAdView maxAdViewRetrieveAdView = retrieveAdView(str2, maxAdFormat);
        if (maxAdViewRetrieveAdView != null) {
            maxAdViewRetrieveAdView.setPlacement(str);
            return;
        }
        e(maxAdFormat.getLabel() + " does not exist");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setAdViewWidth$24(int i10, MaxAdFormat maxAdFormat, String str) {
        d("Setting width " + i10 + " for \"" + maxAdFormat + "\" with ad unit identifier \"" + str + "\"");
        int width = (maxAdFormat.isBannerOrLeaderAd() ? MaxAdFormat.BANNER.getSize() : maxAdFormat.getSize()).getWidth();
        if (i10 < width) {
            e("The provided width: " + i10 + "dp is smaller than the minimum required width: " + width + "dp for ad format: " + maxAdFormat + ". Automatically setting width to " + width + ".");
        }
        this.adViewWidths.put(str, Integer.valueOf(Math.max(width, i10)));
        positionAdView(str, maxAdFormat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showAdView$26(MaxAdFormat maxAdFormat, String str) {
        d("Showing " + maxAdFormat.getLabel() + " with ad unit id \"" + str + "\"");
        MaxAdView maxAdViewRetrieveAdView = retrieveAdView(str, maxAdFormat);
        if (maxAdViewRetrieveAdView != null) {
            this.safeAreaBackground.setVisibility(0);
            maxAdViewRetrieveAdView.setVisibility(0);
            if (this.disabledAutoRefreshAdViewAdUnitIds.contains(str)) {
                return;
            }
            maxAdViewRetrieveAdView.startAutoRefresh();
            return;
        }
        e(maxAdFormat.getLabel() + " does not exist for ad unit id \"" + str + "\"");
        this.AdUnitsToShowAfterCreate.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startAdViewAutoRefresh$22(MaxAdFormat maxAdFormat, String str) {
        d("Starting " + maxAdFormat.getLabel() + " auto refresh for ad unit identifier \"" + str + "\"");
        this.disabledAutoRefreshAdViewAdUnitIds.remove(str);
        MaxAdView maxAdViewRetrieveAdView = retrieveAdView(str, maxAdFormat);
        if (maxAdViewRetrieveAdView != null) {
            maxAdViewRetrieveAdView.startAutoRefresh();
            return;
        }
        e(maxAdFormat.getLabel() + " does not exist for ad unit identifier \"" + str + "\"");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$stopAdViewAutoRefresh$23(MaxAdFormat maxAdFormat, String str) {
        d("Stopping " + maxAdFormat.getLabel() + " auto refresh for ad unit identifier \"" + str + "\"");
        this.disabledAutoRefreshAdViewAdUnitIds.add(str);
        MaxAdView maxAdViewRetrieveAdView = retrieveAdView(str, maxAdFormat);
        if (maxAdViewRetrieveAdView != null) {
            maxAdViewRetrieveAdView.stopAutoRefresh();
            return;
        }
        e(maxAdFormat.getLabel() + " does not exist for ad unit identifier \"" + str + "\"");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateAdViewPosition$25(MaxAdFormat maxAdFormat, String str, String str2, Point point) {
        d("Updating " + maxAdFormat.getLabel() + " position to \"" + str + "\" for ad unit id \"" + str2 + "\"");
        if (retrieveAdView(str2, maxAdFormat) != null) {
            this.adViewPositions.put(str2, str);
            this.adViewOffsets.put(str2, point);
            positionAdView(str2, maxAdFormat);
        } else {
            e(maxAdFormat.getLabel() + " does not exist");
        }
    }

    private void loadAdView(final String str, final MaxAdFormat maxAdFormat) {
        Utils.runSafelyOnUiThread(getCurrentActivity(), new Runnable() { // from class: com.applovin.mediation.unity.h
            @Override // java.lang.Runnable
            public final void run() {
                this.f9586a.lambda$loadAdView$20(str, maxAdFormat);
            }
        });
    }

    private void logInvalidAdFormat(MaxAdFormat maxAdFormat) {
        logStackTrace(new IllegalStateException("invalid ad format: " + maxAdFormat));
    }

    private void logStackTrace(Exception exc) {
        e(Log.getStackTraceString(exc));
    }

    private void maybeHandleExtraParameterChanges(String str, MaxAdFormat maxAdFormat, String str2, String str3) {
        if (MaxAdFormat.MREC != maxAdFormat) {
            if ("force_banner".equalsIgnoreCase(str2)) {
                MaxAdFormat deviceSpecificAdViewAdFormat = Boolean.parseBoolean(str3) ? MaxAdFormat.BANNER : getDeviceSpecificAdViewAdFormat();
                this.adViewFormats.put(str, deviceSpecificAdViewAdFormat);
                positionAdView(str, deviceSpecificAdViewAdFormat);
            } else if ("adaptive_banner".equalsIgnoreCase(str2)) {
                Log.e(TAG, "Setting adaptive banners via extra parameters is deprecated and will be removed in a future plugin version. Use the CreateBanner(adUnitIdentifier, AdViewConfiguration) API to properly configure adaptive banners.");
                if (Boolean.parseBoolean(str3)) {
                    this.disabledAdaptiveBannerAdUnitIds.remove(str);
                } else {
                    this.disabledAdaptiveBannerAdUnitIds.add(str);
                }
                positionAdView(str, maxAdFormat);
            }
        }
    }

    private void positionAdView(MaxAd maxAd) {
        positionAdView(maxAd.getAdUnitId(), maxAd.getFormat());
    }

    private MaxAdView retrieveAdView(String str, MaxAdFormat maxAdFormat) {
        return retrieveAdView(str, maxAdFormat, null, null, true);
    }

    private MaxAppOpenAd retrieveAppOpenAd(String str) {
        MaxAppOpenAd maxAppOpenAd = this.appOpenAds.get(str);
        if (maxAppOpenAd != null) {
            return maxAppOpenAd;
        }
        MaxAppOpenAd maxAppOpenAd2 = new MaxAppOpenAd(str);
        maxAppOpenAd2.setListener(this);
        maxAppOpenAd2.setRevenueListener(this);
        maxAppOpenAd2.setExpirationListener(this);
        this.appOpenAds.put(str, maxAppOpenAd2);
        return maxAppOpenAd2;
    }

    private MaxInterstitialAd retrieveInterstitial(String str) {
        MaxInterstitialAd maxInterstitialAd = this.interstitials.get(str);
        if (maxInterstitialAd != null) {
            return maxInterstitialAd;
        }
        MaxInterstitialAd maxInterstitialAd2 = new MaxInterstitialAd(str);
        maxInterstitialAd2.setListener(this);
        maxInterstitialAd2.setRevenueListener(this);
        maxInterstitialAd2.setAdReviewListener(this);
        maxInterstitialAd2.setExpirationListener(this);
        this.interstitials.put(str, maxInterstitialAd2);
        return maxInterstitialAd2;
    }

    private MaxRewardedAd retrieveRewardedAd(String str) {
        MaxRewardedAd maxRewardedAd = this.rewardedAds.get(str);
        if (maxRewardedAd != null) {
            return maxRewardedAd;
        }
        MaxRewardedAd maxRewardedAd2 = MaxRewardedAd.getInstance(str);
        maxRewardedAd2.setListener(this);
        maxRewardedAd2.setRevenueListener(this);
        maxRewardedAd2.setAdReviewListener(this);
        maxRewardedAd2.setExpirationListener(this);
        this.rewardedAds.put(str, maxRewardedAd2);
        return maxRewardedAd2;
    }

    private void setAdViewBackgroundColor(final String str, final MaxAdFormat maxAdFormat, final String str2) {
        Utils.runSafelyOnUiThread(getCurrentActivity(), new Runnable() { // from class: com.applovin.mediation.unity.y
            @Override // java.lang.Runnable
            public final void run() {
                this.f9640a.lambda$setAdViewBackgroundColor$29(maxAdFormat, str, str2);
            }
        });
    }

    private void setAdViewCustomData(final String str, final MaxAdFormat maxAdFormat, final String str2) {
        Utils.runSafelyOnUiThread(getCurrentActivity(), new Runnable() { // from class: com.applovin.mediation.unity.q
            @Override // java.lang.Runnable
            public final void run() {
                this.f9620a.lambda$setAdViewCustomData$32(str, maxAdFormat, str2);
            }
        });
    }

    private void setAdViewExtraParameter(final String str, final MaxAdFormat maxAdFormat, final String str2, final String str3) {
        Utils.runSafelyOnUiThread(getCurrentActivity(), new Runnable() { // from class: com.applovin.mediation.unity.x
            @Override // java.lang.Runnable
            public final void run() {
                this.f9635a.lambda$setAdViewExtraParameter$30(maxAdFormat, str2, str3, str);
            }
        });
    }

    private void setAdViewLocalExtraParameter(final String str, final MaxAdFormat maxAdFormat, final String str2, final Object obj) {
        Utils.runSafelyOnUiThread(getCurrentActivity(), new Runnable() { // from class: com.applovin.mediation.unity.z
            @Override // java.lang.Runnable
            public final void run() {
                this.f9644a.lambda$setAdViewLocalExtraParameter$31(maxAdFormat, str2, obj, str);
            }
        });
    }

    private void setAdViewPlacement(final String str, final MaxAdFormat maxAdFormat, final String str2) {
        Utils.runSafelyOnUiThread(getCurrentActivity(), new Runnable() { // from class: com.applovin.mediation.unity.u
            @Override // java.lang.Runnable
            public final void run() {
                this.f9627a.lambda$setAdViewPlacement$21(str2, maxAdFormat, str);
            }
        });
    }

    private void setAdViewWidth(final String str, final int i10, final MaxAdFormat maxAdFormat) {
        Utils.runSafelyOnUiThread(getCurrentActivity(), new Runnable() { // from class: com.applovin.mediation.unity.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f9565a.lambda$setAdViewWidth$24(i10, maxAdFormat, str);
            }
        });
    }

    public static void setBackgroundCallback(BackgroundCallback backgroundCallback2) {
        backgroundCallback = backgroundCallback2;
    }

    public static void setCurrentActivity(Activity activity) {
    }

    private void showAdView(final String str, final MaxAdFormat maxAdFormat) {
        Utils.runSafelyOnUiThread(getCurrentActivity(), new Runnable() { // from class: com.applovin.mediation.unity.i
            @Override // java.lang.Runnable
            public final void run() {
                this.f9591a.lambda$showAdView$26(maxAdFormat, str);
            }
        });
    }

    private void startAdViewAutoRefresh(final String str, final MaxAdFormat maxAdFormat) {
        Utils.runSafelyOnUiThread(getCurrentActivity(), new Runnable() { // from class: com.applovin.mediation.unity.j
            @Override // java.lang.Runnable
            public final void run() {
                this.f9599a.lambda$startAdViewAutoRefresh$22(maxAdFormat, str);
            }
        });
    }

    private void stopAdViewAutoRefresh(final String str, final MaxAdFormat maxAdFormat) {
        Utils.runSafelyOnUiThread(getCurrentActivity(), new Runnable() { // from class: com.applovin.mediation.unity.a0
            @Override // java.lang.Runnable
            public final void run() {
                this.f9552a.lambda$stopAdViewAutoRefresh$23(maxAdFormat, str);
            }
        });
    }

    private void updateAdViewPosition(final String str, final String str2, final Point point, final MaxAdFormat maxAdFormat) {
        Utils.runSafelyOnUiThread(getCurrentActivity(), new Runnable() { // from class: com.applovin.mediation.unity.i0
            @Override // java.lang.Runnable
            public final void run() {
                this.f9594a.lambda$updateAdViewPosition$25(maxAdFormat, str2, str, point);
            }
        });
    }

    public void createBanner(String str, String str2, boolean z10) {
        createAdView(str, getAdViewAdFormat(str), str2, DEFAULT_AD_VIEW_OFFSET, z10);
    }

    public void createMRec(String str, String str2) {
        createAdView(str, MaxAdFormat.MREC, str2, DEFAULT_AD_VIEW_OFFSET, false);
    }

    public void destroyBanner(String str) {
        destroyAdView(str, getAdViewAdFormat(str));
    }

    public void destroyMRec(String str) {
        destroyAdView(str, MaxAdFormat.MREC);
    }

    public String getAdValue(String str, String str2) {
        MaxAd ad2;
        return (TextUtils.isEmpty(str) || (ad2 = getAd(str)) == null) ? "" : ad2.getAdValue(str2);
    }

    public String getBannerLayout(String str) {
        return getAdViewLayout(str, getAdViewAdFormat(str));
    }

    public String getMRecLayout(String str) {
        return getAdViewLayout(str, MaxAdFormat.MREC);
    }

    protected Insets getSafeInsets() {
        Window window;
        WindowInsets rootWindowInsets;
        DisplayCutout displayCutout;
        DisplayCutout displayCutout2;
        Insets insets = new Insets();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 28 || (window = getCurrentActivity().getWindow()) == null || (rootWindowInsets = window.getDecorView().getRootWindowInsets()) == null) {
            return insets;
        }
        if (MaxUnityPlugin.shouldUseLegacySafeArea()) {
            if (!getRenderOutsideSafeArea() || (displayCutout2 = rootWindowInsets.getDisplayCutout()) == null) {
                return insets;
            }
            insets.left = displayCutout2.getSafeInsetLeft();
            insets.top = displayCutout2.getSafeInsetTop();
            insets.right = displayCutout2.getSafeInsetRight();
            insets.bottom = displayCutout2.getSafeInsetBottom();
            return insets;
        }
        if (i10 >= 30) {
            android.graphics.Insets insets2 = rootWindowInsets.getInsets(WindowInsets.Type.navigationBars());
            insets.left = insets2.left;
            insets.top = insets2.top;
            insets.right = insets2.right;
            insets.bottom = insets2.bottom;
        }
        if ((!getRenderOutsideSafeArea() && i10 < 30) || (displayCutout = rootWindowInsets.getDisplayCutout()) == null) {
            return insets;
        }
        insets.left = Math.max(insets.left, displayCutout.getSafeInsetLeft());
        insets.top = Math.max(insets.top, displayCutout.getSafeInsetTop());
        insets.right = Math.max(insets.right, displayCutout.getSafeInsetRight());
        insets.bottom = Math.max(insets.bottom, displayCutout.getSafeInsetBottom());
        return insets;
    }

    public void hideBanner(String str) {
        hideAdView(str, getAdViewAdFormat(str));
    }

    public void hideMRec(String str) {
        hideAdView(str, MaxAdFormat.MREC);
    }

    public void initializeSdkWithCompletionHandler(AppLovinSdkInitializationConfiguration appLovinSdkInitializationConfiguration, final Listener listener) {
        AppLovinSdk appLovinSdk = AppLovinSdk.getInstance(getCurrentActivity());
        this.sdk = appLovinSdk;
        appLovinSdk.initialize(appLovinSdkInitializationConfiguration, new AppLovinSdk.SdkInitializationListener() { // from class: com.applovin.mediation.unity.b0
            @Override // com.applovin.sdk.AppLovinSdk.SdkInitializationListener
            public final void onSdkInitialized(AppLovinSdkConfiguration appLovinSdkConfiguration) {
                this.f9558a.lambda$initializeSdkWithCompletionHandler$4(listener, appLovinSdkConfiguration);
            }
        });
    }

    public boolean isAppOpenAdReady(String str) {
        return retrieveAppOpenAd(str).isReady();
    }

    public boolean isInterstitialReady(String str) {
        return retrieveInterstitial(str).isReady();
    }

    public boolean isRewardedAdReady(String str) {
        return retrieveRewardedAd(str).isReady();
    }

    public void loadAppOpenAd(String str) {
        retrieveAppOpenAd(str).loadAd();
    }

    public void loadBanner(String str) {
        loadAdView(str, getAdViewAdFormat(str));
    }

    public void loadInterstitial(String str) {
        retrieveInterstitial(str).loadAd();
    }

    public void loadMRec(String str) {
        loadAdView(str, MaxAdFormat.MREC);
    }

    public void loadRewardedAd(String str) {
        retrieveRewardedAd(str).loadAd();
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdClicked(final MaxAd maxAd) {
        threadPoolExecutor.execute(new Runnable() { // from class: com.applovin.mediation.unity.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f9550a.lambda$onAdClicked$9(maxAd);
            }
        });
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdCollapsed(final MaxAd maxAd) {
        threadPoolExecutor.execute(new Runnable() { // from class: com.applovin.mediation.unity.o
            @Override // java.lang.Runnable
            public final void run() {
                this.f9615a.lambda$onAdCollapsed$13(maxAd);
            }
        });
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayFailed(final MaxAd maxAd, final MaxError maxError) {
        threadPoolExecutor.execute(new Runnable() { // from class: com.applovin.mediation.unity.j0
            @Override // java.lang.Runnable
            public final void run() {
                this.f9602a.lambda$onAdDisplayFailed$11(maxAd, maxError);
            }
        });
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayed(final MaxAd maxAd) {
        threadPoolExecutor.execute(new Runnable() { // from class: com.applovin.mediation.unity.c0
            @Override // java.lang.Runnable
            public final void run() {
                this.f9563a.lambda$onAdDisplayed$10(maxAd);
            }
        });
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdExpanded(final MaxAd maxAd) {
        threadPoolExecutor.execute(new Runnable() { // from class: com.applovin.mediation.unity.e0
            @Override // java.lang.Runnable
            public final void run() {
                this.f9574a.lambda$onAdExpanded$14(maxAd);
            }
        });
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdHidden(final MaxAd maxAd) {
        threadPoolExecutor.execute(new Runnable() { // from class: com.applovin.mediation.unity.s
            @Override // java.lang.Runnable
            public final void run() {
                this.f9624a.lambda$onAdHidden$12(maxAd);
            }
        });
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoadFailed(final String str, final MaxError maxError) {
        threadPoolExecutor.execute(new Runnable() { // from class: com.applovin.mediation.unity.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f9580a.lambda$onAdLoadFailed$8(str, maxError);
            }
        });
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoaded(final MaxAd maxAd) {
        threadPoolExecutor.execute(new Runnable() { // from class: com.applovin.mediation.unity.d0
            @Override // java.lang.Runnable
            public final void run() {
                this.f9569a.lambda$onAdLoaded$7(maxAd);
            }
        });
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(final MaxAd maxAd) {
        threadPoolExecutor.execute(new Runnable() { // from class: com.applovin.mediation.unity.h0
            @Override // java.lang.Runnable
            public final void run() {
                this.f9589a.lambda$onAdRevenuePaid$16(maxAd);
            }
        });
    }

    @Override // com.applovin.mediation.unity.MaxUnityApplicationStateChangeTracker.MaxUnityApplicationStateCallback
    public void onApplicationStateChanged(final boolean z10) {
        threadPoolExecutor.execute(new Runnable() { // from class: com.applovin.mediation.unity.v
            @Override // java.lang.Runnable
            public final void run() {
                MaxUnityAdManager.lambda$onApplicationStateChanged$6(z10);
            }
        });
    }

    @Override // com.applovin.sdk.AppLovinCmpService.OnCompletedListener
    public void onCompleted(final AppLovinCmpError appLovinCmpError) {
        threadPoolExecutor.execute(new Runnable() { // from class: com.applovin.mediation.unity.n
            @Override // java.lang.Runnable
            public final void run() {
                MaxUnityAdManager.lambda$onCompleted$5(appLovinCmpError);
            }
        });
    }

    @Override // com.applovin.mediation.MaxAdReviewListener
    public void onCreativeIdGenerated(final String str, final MaxAd maxAd) {
        threadPoolExecutor.execute(new Runnable() { // from class: com.applovin.mediation.unity.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f9555a.lambda$onCreativeIdGenerated$18(maxAd, str);
            }
        });
    }

    @Override // com.applovin.mediation.MaxAdExpirationListener
    public void onExpiredAdReloaded(final MaxAd maxAd, final MaxAd maxAd2) {
        threadPoolExecutor.execute(new Runnable() { // from class: com.applovin.mediation.unity.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f9560a.lambda$onExpiredAdReloaded$17(maxAd2, maxAd);
            }
        });
    }

    @Override // com.applovin.mediation.MaxRewardedAdListener
    public void onUserRewarded(final MaxAd maxAd, final MaxReward maxReward) {
        threadPoolExecutor.execute(new Runnable() { // from class: com.applovin.mediation.unity.g0
            @Override // java.lang.Runnable
            public final void run() {
                this.f9583a.lambda$onUserRewarded$15(maxAd, maxReward);
            }
        });
    }

    public void setAppOpenAdExtraParameter(String str, String str2, String str3) {
        retrieveAppOpenAd(str).setExtraParameter(str2, str3);
    }

    public void setAppOpenAdLocalExtraParameter(String str, String str2, Object obj) {
        if (str2 == null) {
            e("Failed to set local extra parameter: No key specified");
        } else {
            retrieveAppOpenAd(str).setLocalExtraParameter(str2, obj);
        }
    }

    public void setBannerBackgroundColor(String str, String str2) {
        setAdViewBackgroundColor(str, getAdViewAdFormat(str), str2);
    }

    public void setBannerCustomData(String str, String str2) {
        setAdViewCustomData(str, getAdViewAdFormat(str), str2);
    }

    public void setBannerExtraParameter(String str, String str2, String str3) {
        setAdViewExtraParameter(str, getAdViewAdFormat(str), str2, str3);
    }

    public void setBannerLocalExtraParameter(String str, String str2, Object obj) {
        if (str2 == null) {
            e("Failed to set local extra parameter: No key specified");
        } else {
            setAdViewLocalExtraParameter(str, getAdViewAdFormat(str), str2, obj);
        }
    }

    public void setBannerPlacement(String str, String str2) {
        setAdViewPlacement(str, getAdViewAdFormat(str), str2);
    }

    public void setBannerWidth(String str, int i10) {
        setAdViewWidth(str, i10, getAdViewAdFormat(str));
    }

    public void setInterstitialExtraParameter(String str, String str2, String str3) {
        retrieveInterstitial(str).setExtraParameter(str2, str3);
    }

    public void setInterstitialLocalExtraParameter(String str, String str2, Object obj) {
        if (str2 == null) {
            e("Failed to set local extra parameter: No key specified");
        } else {
            retrieveInterstitial(str).setLocalExtraParameter(str2, obj);
        }
    }

    public void setMRecCustomData(String str, String str2) {
        setAdViewCustomData(str, MaxAdFormat.MREC, str2);
    }

    public void setMRecExtraParameter(String str, String str2, String str3) {
        setAdViewExtraParameter(str, MaxAdFormat.MREC, str2, str3);
    }

    public void setMRecLocalExtraParameter(String str, String str2, Object obj) {
        if (str2 == null) {
            e("Failed to set local extra parameter: No key specified");
        } else {
            setAdViewLocalExtraParameter(str, MaxAdFormat.MREC, str2, obj);
        }
    }

    public void setMRecPlacement(String str, String str2) {
        setAdViewPlacement(str, MaxAdFormat.MREC, str2);
    }

    public void setRewardedAdExtraParameter(String str, String str2, String str3) {
        retrieveRewardedAd(str).setExtraParameter(str2, str3);
    }

    public void setRewardedAdLocalExtraParameter(String str, String str2, Object obj) {
        if (str2 == null) {
            e("Failed to set local extra parameter: No key specified");
        } else {
            retrieveRewardedAd(str).setLocalExtraParameter(str2, obj);
        }
    }

    public void showAppOpenAd(String str, String str2, String str3) {
        retrieveAppOpenAd(str).showAd(str2, str3);
    }

    public void showBanner(String str) {
        showAdView(str, getAdViewAdFormat(str));
    }

    public void showCmpForExistingUser() {
        this.sdk.getCmpService().showCmpForExistingUser(getCurrentActivity(), this);
    }

    public void showInterstitial(String str, String str2, String str3) {
        retrieveInterstitial(str).showAd(str2, str3, getCurrentActivity());
    }

    public void showMRec(String str) {
        showAdView(str, MaxAdFormat.MREC);
    }

    public void showRewardedAd(String str, String str2, String str3) {
        retrieveRewardedAd(str).showAd(str2, str3, getCurrentActivity());
    }

    public void startBannerAutoRefresh(String str) {
        startAdViewAutoRefresh(str, getAdViewAdFormat(str));
    }

    public void startMRecAutoRefresh(String str) {
        startAdViewAutoRefresh(str, MaxAdFormat.MREC);
    }

    public void stopBannerAutoRefresh(String str) {
        stopAdViewAutoRefresh(str, getAdViewAdFormat(str));
    }

    public void stopMRecAutoRefresh(String str) {
        stopAdViewAutoRefresh(str, MaxAdFormat.MREC);
    }

    public void trackEvent(String str, String str2) {
        if (this.sdk == null) {
            return;
        }
        this.sdk.getEventService().trackEvent(str, deserializeParameters(str2));
    }

    public void updateBannerPosition(String str, String str2) {
        updateAdViewPosition(str, str2, DEFAULT_AD_VIEW_OFFSET, getAdViewAdFormat(str));
    }

    public void updateMRecPosition(String str, String str2) {
        updateAdViewPosition(str, str2, DEFAULT_AD_VIEW_OFFSET, MaxAdFormat.MREC);
    }

    private static void d(String str) {
        if (MaxUnityPlugin.isDisableAllLogs()) {
            return;
        }
        Log.d(SDK_TAG, "[MaxUnityAdManager] " + str);
    }

    private static void e(String str) {
        if (MaxUnityPlugin.isDisableAllLogs()) {
            return;
        }
        Log.e(SDK_TAG, wcAlQCOdREZdI.wjdPx + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setAdViewExtraParameter$30(MaxAdFormat maxAdFormat, String str, String str2, String str3) {
        d("Setting " + maxAdFormat.getLabel() + " extra with key: \"" + str + cNMUz.xsFSvVR + str2);
        MaxAdView maxAdViewRetrieveAdView = retrieveAdView(str3, maxAdFormat);
        if (maxAdViewRetrieveAdView != null) {
            maxAdViewRetrieveAdView.setExtraParameter(str, str2);
        } else {
            d(maxAdFormat.getLabel() + " does not exist for ad unit ID \"" + str3 + "\". Saving extra parameter to be set when it is created.");
            Map<String, String> map = this.adViewExtraParametersToSetAfterCreate.get(str3);
            if (map == null) {
                map = new HashMap<>(1);
                this.adViewExtraParametersToSetAfterCreate.put(str3, map);
            }
            map.put(str, str2);
        }
        maybeHandleExtraParameterChanges(str3, maxAdFormat, str, str2);
    }

    private void positionAdView(final String str, final MaxAdFormat maxAdFormat) {
        getCurrentActivity().runOnUiThread(new Runnable() { // from class: com.applovin.mediation.unity.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f9576a.lambda$positionAdView$33(str, maxAdFormat);
            }
        });
    }

    private MaxAdView retrieveAdView(String str, MaxAdFormat maxAdFormat, String str2, Point point, boolean z10) {
        MaxAdView maxAdView = this.adViews.get(str);
        if (maxAdView != null || str2 == null || point == null) {
            return maxAdView;
        }
        MaxAdViewConfiguration.Builder builder = MaxAdViewConfiguration.builder();
        if (maxAdFormat.isBannerOrLeaderAd()) {
            if (z10) {
                builder.setAdaptiveType(MaxAdViewConfiguration.AdaptiveType.ANCHORED);
            } else {
                builder.setAdaptiveType(MaxAdViewConfiguration.AdaptiveType.NONE);
                this.disabledAdaptiveBannerAdUnitIds.add(str);
            }
        }
        MaxAdView maxAdView2 = new MaxAdView(str, maxAdFormat, builder.build());
        maxAdView2.setListener(this);
        maxAdView2.setRevenueListener(this);
        maxAdView2.setAdReviewListener(this);
        this.adViews.put(str, maxAdView2);
        this.adViewPositions.put(str, str2);
        this.adViewOffsets.put(str, point);
        maxAdView2.setExtraParameter("allow_pause_auto_refresh_immediately", ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
        return maxAdView2;
    }

    private static void w(String str) {
        if (MaxUnityPlugin.isDisableAllLogs()) {
            return;
        }
        Log.w(SDK_TAG, "[MaxUnityAdManager] " + str);
    }

    public void createBanner(String str, float f10, float f11, boolean z10) {
        createAdView(str, getAdViewAdFormat(str), DEFAULT_AD_VIEW_POSITION, getOffsetPixels(f10, f11, getCurrentActivity()), z10);
    }

    public void createMRec(String str, float f10, float f11) {
        createAdView(str, MaxAdFormat.MREC, DEFAULT_AD_VIEW_POSITION, getOffsetPixels(f10, f11, getCurrentActivity()), false);
    }

    public void updateBannerPosition(String str, float f10, float f11) {
        updateAdViewPosition(str, DEFAULT_AD_VIEW_POSITION, getOffsetPixels(f10, f11, getCurrentActivity()), getAdViewAdFormat(str));
    }

    public void updateMRecPosition(String str, float f10, float f11) {
        updateAdViewPosition(str, DEFAULT_AD_VIEW_POSITION, getOffsetPixels(f10, f11, getCurrentActivity()), MaxAdFormat.MREC);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onAdLoadFailed$8(String str, MaxError maxError) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            logStackTrace(new IllegalArgumentException(xjwcmjDeOXR.sFzqRBPFaczdR));
            return;
        }
        if (this.adViews.containsKey(str)) {
            if (MaxAdFormat.MREC == this.adViewFormats.get(str)) {
                str2 = "OnMRecAdLoadFailedEvent";
            } else {
                str2 = "OnBannerAdLoadFailedEvent";
            }
        } else if (this.interstitials.containsKey(str)) {
            str2 = "OnInterstitialLoadFailedEvent";
        } else if (this.appOpenAds.containsKey(str)) {
            str2 = "OnAppOpenAdLoadFailedEvent";
        } else if (this.rewardedAds.containsKey(str)) {
            str2 = "OnRewardedAdLoadFailedEvent";
        } else {
            logStackTrace(new IllegalStateException("invalid adUnitId: " + str));
            return;
        }
        synchronized (this.adInfoMapLock) {
            this.adInfoMap.remove(str);
        }
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "name", str2);
        JsonUtils.putString(jSONObject, "adUnitId", str);
        JsonUtils.putString(jSONObject, "errorCode", Integer.toString(maxError.getCode()));
        JsonUtils.putString(jSONObject, "errorMessage", maxError.getMessage());
        JsonUtils.putJSONObject(jSONObject, "waterfallInfo", createAdWaterfallInfo(maxError.getWaterfall()));
        String adLoadFailureInfo = maxError.getAdLoadFailureInfo();
        if (TextUtils.isEmpty(adLoadFailureInfo)) {
            adLoadFailureInfo = "";
        }
        JsonUtils.putString(jSONObject, "adLoadFailureInfo", adLoadFailureInfo);
        JsonUtils.putString(jSONObject, "latencyMillis", String.valueOf(maxError.getRequestLatencyMillis()));
        forwardUnityEvent(jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(String str, Throwable th) {
        if (MaxUnityPlugin.isDisableAllLogs()) {
            return;
        }
        Log.e(SDK_TAG, "[MaxUnityAdManager] " + str, th);
    }
}
