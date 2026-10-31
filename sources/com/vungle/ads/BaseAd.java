package com.vungle.ads;

import android.content.Context;
import com.vungle.ads.internal.AdInternal;
import com.vungle.ads.internal.load.AdLoaderCallback;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.signals.SignalManager;
import com.vungle.ads.internal.signals.SignaledAd;
import com.vungle.ads.internal.util.LogEntry;
import com.vungle.ads.internal.util.ThreadUtil;
import kotlin.jvm.internal.t;
import wc.k;
import wc.m;
import wc.o;

/* JADX INFO: compiled from: BaseAd.kt */
/* JADX INFO: loaded from: classes4.dex */
public abstract class BaseAd implements Ad, VungleAdType {
    private final AdConfig adConfig;
    private final k adInternal$delegate;
    private BaseAdListener adListener;
    private String adapterAdFormat;
    private final Context context;
    private String creativeId;
    private final OneShotTimeIntervalMetric displayToClickMetric;
    private String eventId;
    private final SingleValueMetric leaveApplicationMetric;
    private final LogEntry logEntry;
    private final String placementId;
    private final OneShotTimeIntervalMetric presentToDisplayMetric;
    private final OneShotTimeIntervalMetric responseToShowMetric;
    private final SingleValueMetric rewardedMetric;
    private final OneShotTimeIntervalMetric showToCloseMetric;
    private final OneShotTimeIntervalMetric showToFailMetric;
    private final k signalManager$delegate;
    private SignaledAd signaledAd;

    public BaseAd(Context context, String placementId, AdConfig adConfig) {
        t.f(context, "context");
        t.f(placementId, "placementId");
        t.f(adConfig, "adConfig");
        this.context = context;
        this.placementId = placementId;
        this.adConfig = adConfig;
        this.adInternal$delegate = m.a(new BaseAd$adInternal$2(this));
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        this.signalManager$delegate = m.b(o.SYNCHRONIZED, new BaseAd$special$$inlined$inject$1(context));
        LogEntry logEntry = new LogEntry();
        logEntry.setPlacementRefId$vungle_ads_release(placementId);
        this.logEntry = logEntry;
        this.responseToShowMetric = new OneShotTimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.AD_RESPONSE_TO_SHOW_DURATION_MS);
        this.presentToDisplayMetric = new OneShotTimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.AD_PRESENT_TO_DISPLAY_DURATION_MS);
        this.showToFailMetric = new OneShotTimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_FAIL_DURATION_MS);
        this.displayToClickMetric = new OneShotTimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.AD_DISPLAY_TO_CLICK_DURATION_MS);
        this.leaveApplicationMetric = new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.AD_LEAVE_APPLICATION);
        this.rewardedMetric = new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.AD_REWARD_USER);
        this.showToCloseMetric = new OneShotTimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_CLOSE_DURATION_MS);
    }

    private final void onLoadEnd() {
        this.responseToShowMetric.markStart();
    }

    @Override // com.vungle.ads.Ad
    public Boolean canPlayAd() {
        return Boolean.valueOf(AdInternal.canPlayAd$default(getAdInternal$vungle_ads_release(), false, 1, null) == null);
    }

    public abstract AdInternal constructAdInternal$vungle_ads_release(Context context);

    public final AdConfig getAdConfig() {
        return this.adConfig;
    }

    public final AdInternal getAdInternal$vungle_ads_release() {
        return (AdInternal) this.adInternal$delegate.getValue();
    }

    public final BaseAdListener getAdListener() {
        return this.adListener;
    }

    @Override // com.vungle.ads.VungleAdType
    public String getAdapterAdFormat() {
        return this.adapterAdFormat;
    }

    public final Context getContext() {
        return this.context;
    }

    public final String getCreativeId() {
        return this.creativeId;
    }

    public final OneShotTimeIntervalMetric getDisplayToClickMetric$vungle_ads_release() {
        return this.displayToClickMetric;
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final SingleValueMetric getLeaveApplicationMetric$vungle_ads_release() {
        return this.leaveApplicationMetric;
    }

    public final LogEntry getLogEntry$vungle_ads_release() {
        return this.logEntry;
    }

    public final String getPlacementId() {
        return this.placementId;
    }

    public final OneShotTimeIntervalMetric getPresentToDisplayMetric$vungle_ads_release() {
        return this.presentToDisplayMetric;
    }

    public final OneShotTimeIntervalMetric getResponseToShowMetric$vungle_ads_release() {
        return this.responseToShowMetric;
    }

    public final SingleValueMetric getRewardedMetric$vungle_ads_release() {
        return this.rewardedMetric;
    }

    public final OneShotTimeIntervalMetric getShowToCloseMetric$vungle_ads_release() {
        return this.showToCloseMetric;
    }

    public final OneShotTimeIntervalMetric getShowToFailMetric$vungle_ads_release() {
        return this.showToFailMetric;
    }

    public final SignalManager getSignalManager$vungle_ads_release() {
        return (SignalManager) this.signalManager$delegate.getValue();
    }

    public final SignaledAd getSignaledAd$vungle_ads_release() {
        return this.signaledAd;
    }

    public final Double getWinningPrice() {
        AdPayload advertisement = getAdInternal$vungle_ads_release().getAdvertisement();
        if (advertisement != null) {
            return advertisement.getWinningPrice();
        }
        return null;
    }

    @Override // com.vungle.ads.Ad
    public void load() {
        load((String) null);
    }

    public void onAdLoaded$vungle_ads_release(AdPayload advertisement) {
        t.f(advertisement, "advertisement");
        advertisement.setAdConfig(this.adConfig);
        this.creativeId = advertisement.getCreativeId();
        String strEventId = advertisement.eventId();
        this.eventId = strEventId;
        SignaledAd signaledAd = this.signaledAd;
        if (signaledAd == null) {
            return;
        }
        signaledAd.setEventId(strEventId);
    }

    public void onLoadFailure$vungle_ads_release(BaseAd baseAd, VungleError vungleError) {
        t.f(baseAd, "baseAd");
        t.f(vungleError, "vungleError");
        onLoadEnd();
        ThreadUtil.INSTANCE.runOnUiThread(new BaseAd$onLoadFailure$1(this, vungleError));
    }

    public void onLoadSuccess$vungle_ads_release(BaseAd baseAd, String str) {
        t.f(baseAd, "baseAd");
        onLoadEnd();
        ThreadUtil.INSTANCE.runOnUiThread(new BaseAd$onLoadSuccess$1(this));
    }

    public final void sendLossURL() {
        getAdInternal$vungle_ads_release().sendLossURL();
    }

    public final void sendWinURL() {
        getAdInternal$vungle_ads_release().sendWinURL();
    }

    public final void setAdListener(BaseAdListener baseAdListener) {
        this.adListener = baseAdListener;
    }

    @Override // com.vungle.ads.VungleAdType
    public void setAdapterAdFormat(String str) {
        this.adapterAdFormat = str;
        this.logEntry.setAdapterAdFormat$vungle_ads_release(str);
    }

    public final void setSignaledAd$vungle_ads_release(SignaledAd signaledAd) {
        this.signaledAd = signaledAd;
    }

    @Override // com.vungle.ads.Ad
    public void load(final String str) {
        getAdInternal$vungle_ads_release().loadAd(this.placementId, str, null, new AdLoaderCallback() { // from class: com.vungle.ads.BaseAd.load.1
            @Override // com.vungle.ads.internal.load.AdLoaderCallback
            public void onFailure(VungleError error) {
                t.f(error, "error");
                BaseAd baseAd = BaseAd.this;
                baseAd.onLoadFailure$vungle_ads_release(baseAd, error);
            }

            @Override // com.vungle.ads.internal.load.AdLoaderCallback
            public void onSuccess(AdPayload advertisement) {
                t.f(advertisement, "advertisement");
                BaseAd.this.onAdLoaded$vungle_ads_release(advertisement);
                BaseAd baseAd = BaseAd.this;
                baseAd.onLoadSuccess$vungle_ads_release(baseAd, str);
            }
        });
    }

    @Override // com.vungle.ads.Ad
    public void load(VungleCSBData csbData) {
        t.f(csbData, "csbData");
        getAdInternal$vungle_ads_release().loadAd(this.placementId, null, csbData, new AdLoaderCallback() { // from class: com.vungle.ads.BaseAd.load.2
            @Override // com.vungle.ads.internal.load.AdLoaderCallback
            public void onFailure(VungleError error) {
                t.f(error, "error");
                BaseAd baseAd = BaseAd.this;
                baseAd.onLoadFailure$vungle_ads_release(baseAd, error);
            }

            @Override // com.vungle.ads.internal.load.AdLoaderCallback
            public void onSuccess(AdPayload advertisement) {
                t.f(advertisement, "advertisement");
                BaseAd.this.onAdLoaded$vungle_ads_release(advertisement);
                BaseAd baseAd = BaseAd.this;
                baseAd.onLoadSuccess$vungle_ads_release(baseAd, null);
            }
        });
    }
}
