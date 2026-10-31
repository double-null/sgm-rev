package com.vungle.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import c0.IbU.elEbP;
import com.vungle.ads.internal.AdInternal;
import com.vungle.ads.internal.BannerAdImpl;
import com.vungle.ads.internal.ImpressionTracker;
import com.vungle.ads.internal.executor.Executors;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.omsdk.OMTracker;
import com.vungle.ads.internal.platform.Platform;
import com.vungle.ads.internal.presenter.AdEventListener;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import com.vungle.ads.internal.presenter.WebViewManager;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.ui.VungleWebClient;
import com.vungle.ads.internal.ui.WatermarkView;
import com.vungle.ads.internal.ui.view.MRAIDAdWidget;
import com.vungle.ads.internal.util.LogEntry;
import com.vungle.ads.internal.util.Logger;
import com.vungle.ads.internal.util.RingerModeReceiver;
import com.vungle.ads.internal.util.ThreadUtil;
import com.vungle.ads.internal.util.ViewUtility;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import wc.g0;
import wc.k;
import wc.m;
import wc.o;

/* JADX INFO: compiled from: VungleBannerView.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class VungleBannerView extends RelativeLayout implements VungleAdType {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "VungleBannerView";
    private BannerAdListener adListener;
    private final VungleAdSize adSize;
    private final BannerAdImpl adViewImpl;
    private MRAIDAdWidget adWidget;
    private int calculatedPixelHeight;
    private int calculatedPixelWidth;
    private final AtomicBoolean destroyed;
    private WatermarkView imageView;
    private final k impressionTracker$delegate;
    private final AtomicBoolean isAdAttachedToWindow;
    private final AtomicBoolean isAdDownloaded;
    private final AtomicBoolean isInvisibleLogged;
    private boolean isOnImpressionCalled;
    private boolean isReceiverRegistered;
    private final String placementId;
    private MRAIDPresenter presenter;
    private final AtomicBoolean presenterStarted;
    private final RingerModeReceiver ringerModeReceiver;

    /* JADX INFO: compiled from: VungleBannerView.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.vungle.ads.VungleBannerView$finishAd$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: VungleBannerView.kt */
    static final class C24161 extends u implements id.a<g0> {
        C24161() {
            super(0);
        }

        @Override // id.a
        public /* bridge */ /* synthetic */ g0 invoke() {
            invoke2();
            return g0.f27756a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            VungleBannerView.this.finishAdInternal(true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VungleBannerView(Context context, String placementId, VungleAdSize adSize) {
        super(context);
        t.f(context, "context");
        t.f(placementId, "placementId");
        t.f(adSize, "adSize");
        this.placementId = placementId;
        this.adSize = adSize;
        this.ringerModeReceiver = new RingerModeReceiver();
        BannerAdImpl bannerAdImpl = new BannerAdImpl(context, placementId, adSize, new AdConfig());
        this.adViewImpl = bannerAdImpl;
        this.destroyed = new AtomicBoolean(false);
        this.presenterStarted = new AtomicBoolean(false);
        this.isAdDownloaded = new AtomicBoolean(false);
        this.isAdAttachedToWindow = new AtomicBoolean(false);
        this.isInvisibleLogged = new AtomicBoolean(false);
        this.impressionTracker$delegate = m.a(new VungleBannerView$impressionTracker$2(context));
        bannerAdImpl.setAdListener(new BannerAdListener() { // from class: com.vungle.ads.VungleBannerView.1
            @Override // com.vungle.ads.BaseAdListener
            public void onAdClicked(BaseAd baseAd) {
                t.f(baseAd, "baseAd");
                BannerAdListener adListener = VungleBannerView.this.getAdListener();
                if (adListener != null) {
                    adListener.onAdClicked(baseAd);
                }
            }

            @Override // com.vungle.ads.BaseAdListener
            public void onAdEnd(BaseAd baseAd) {
                t.f(baseAd, "baseAd");
                BannerAdListener adListener = VungleBannerView.this.getAdListener();
                if (adListener != null) {
                    adListener.onAdEnd(baseAd);
                }
            }

            @Override // com.vungle.ads.BaseAdListener
            public void onAdFailedToLoad(BaseAd baseAd, VungleError adError) {
                t.f(baseAd, "baseAd");
                t.f(adError, "adError");
                BannerAdListener adListener = VungleBannerView.this.getAdListener();
                if (adListener != null) {
                    adListener.onAdFailedToLoad(baseAd, adError);
                }
            }

            @Override // com.vungle.ads.BaseAdListener
            public void onAdFailedToPlay(BaseAd baseAd, VungleError adError) {
                t.f(baseAd, "baseAd");
                t.f(adError, "adError");
                BannerAdListener adListener = VungleBannerView.this.getAdListener();
                if (adListener != null) {
                    adListener.onAdFailedToPlay(baseAd, adError);
                }
            }

            @Override // com.vungle.ads.BaseAdListener
            public void onAdImpression(BaseAd baseAd) {
                t.f(baseAd, "baseAd");
                BannerAdListener adListener = VungleBannerView.this.getAdListener();
                if (adListener != null) {
                    adListener.onAdImpression(baseAd);
                }
            }

            @Override // com.vungle.ads.BaseAdListener
            public void onAdLeftApplication(BaseAd baseAd) {
                t.f(baseAd, "baseAd");
                BannerAdListener adListener = VungleBannerView.this.getAdListener();
                if (adListener != null) {
                    adListener.onAdLeftApplication(baseAd);
                }
            }

            @Override // com.vungle.ads.BaseAdListener
            public void onAdLoaded(BaseAd baseAd) {
                t.f(baseAd, "baseAd");
                VungleBannerView.this.onBannerAdLoaded(baseAd);
            }

            @Override // com.vungle.ads.BaseAdListener
            public void onAdStart(BaseAd baseAd) {
                t.f(baseAd, "baseAd");
                BannerAdListener adListener = VungleBannerView.this.getAdListener();
                if (adListener != null) {
                    adListener.onAdStart(baseAd);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkHardwareAcceleration() {
        Logger.Companion.w(TAG, "hardwareAccelerated = " + isHardwareAccelerated());
        if (isHardwareAccelerated()) {
            return;
        }
        AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, Sdk.SDKMetric.SDKMetricType.HARDWARE_ACCELERATE_DISABLED, 0L, this.adViewImpl.getLogEntry$vungle_ads_release(), null, 10, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishAdInternal(boolean z10) {
        if (this.destroyed.get()) {
            return;
        }
        this.destroyed.set(true);
        int i10 = (z10 ? 4 : 0) | 2;
        MRAIDPresenter mRAIDPresenter = this.presenter;
        if (mRAIDPresenter != null) {
            mRAIDPresenter.stop();
        }
        MRAIDPresenter mRAIDPresenter2 = this.presenter;
        if (mRAIDPresenter2 != null) {
            mRAIDPresenter2.detach(i10);
        }
        getImpressionTracker().destroy();
        try {
            ViewParent parent = getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                ((ViewGroup) parent).removeView(this);
            }
            removeAllViews();
        } catch (Exception e10) {
            Logger.Companion.d(TAG, "Removing webView error: " + e10);
        }
    }

    private final ImpressionTracker getImpressionTracker() {
        return (ImpressionTracker) this.impressionTracker$delegate.getValue();
    }

    public static /* synthetic */ void load$default(VungleBannerView vungleBannerView, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        vungleBannerView.load(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logViewInvisibleOnPlay() {
        if (this.isInvisibleLogged.getAndSet(true)) {
            return;
        }
        Logger.Companion.d(TAG, "ImpressionTracker checked the banner view invisible on play, log AD_VISIBILITY_INVISIBLE. " + hashCode());
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        SingleValueMetric singleValueMetric = new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.AD_VISIBILITY);
        singleValueMetric.setValue(1L);
        AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, singleValueMetric, this.adViewImpl.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logViewVisibleOnPlay() {
        long j10 = this.isInvisibleLogged.get() ? 3L : 2L;
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        SingleValueMetric singleValueMetric = new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.AD_VISIBILITY);
        singleValueMetric.setValue(Long.valueOf(j10));
        AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, singleValueMetric, this.adViewImpl.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
        Logger.Companion.d(TAG, "Log metric AD_VISIBILITY: " + j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onBannerAdLoaded(BaseAd baseAd) {
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.PLAY_AD_API), this.adViewImpl.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
        this.adViewImpl.getResponseToShowMetric$vungle_ads_release().markEnd();
        AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, this.adViewImpl.getResponseToShowMetric$vungle_ads_release(), this.adViewImpl.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
        this.adViewImpl.getAdInternal$vungle_ads_release().getShowToValidationMetric$vungle_ads_release().markStart();
        this.adViewImpl.getShowToCloseMetric$vungle_ads_release().markStart();
        this.adViewImpl.getShowToFailMetric$vungle_ads_release().markStart();
        VungleError vungleErrorCanPlayAd = this.adViewImpl.getAdInternal$vungle_ads_release().canPlayAd(true);
        if (vungleErrorCanPlayAd != null) {
            if (this.adViewImpl.getAdInternal$vungle_ads_release().isErrorTerminal$vungle_ads_release(vungleErrorCanPlayAd.getCode())) {
                this.adViewImpl.getAdInternal$vungle_ads_release().setAdState(AdInternal.AdState.ERROR);
            }
            BannerAdListener bannerAdListener = this.adListener;
            if (bannerAdListener != null) {
                bannerAdListener.onAdFailedToPlay(baseAd, vungleErrorCanPlayAd);
                return;
            }
            return;
        }
        AdPayload advertisement = this.adViewImpl.getAdInternal$vungle_ads_release().getAdvertisement();
        Placement placement = this.adViewImpl.getAdInternal$vungle_ads_release().getPlacement();
        if (advertisement == null || placement == null) {
            BannerAdListener bannerAdListener2 = this.adListener;
            if (bannerAdListener2 != null) {
                bannerAdListener2.onAdFailedToPlay(baseAd, new AdNotLoadedCantPlay("Ad or Placement is null").setLogEntry$vungle_ads_release(this.adViewImpl.getLogEntry$vungle_ads_release()).logError$vungle_ads_release());
                return;
            }
            return;
        }
        this.adViewImpl.getAdInternal$vungle_ads_release().cancelDownload$vungle_ads_release();
        this.adViewImpl.getAdInternal$vungle_ads_release().getShowToValidationMetric$vungle_ads_release().markEnd();
        AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, this.adViewImpl.getAdInternal$vungle_ads_release().getShowToValidationMetric$vungle_ads_release(), this.adViewImpl.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
        this.adViewImpl.getAdInternal$vungle_ads_release().getValidationToPresentMetric$vungle_ads_release().markStart();
        try {
            willPresentAdView(advertisement, placement, getAdViewSize());
            this.isAdDownloaded.set(true);
            BannerAdListener bannerAdListener3 = this.adListener;
            if (bannerAdListener3 != null) {
                bannerAdListener3.onAdLoaded(baseAd);
            }
            renderAd();
        } catch (InstantiationException unused) {
        }
    }

    private final void renderAd() {
        if (this.destroyed.get()) {
            Logger.Companion.w(TAG, "renderAd() - destroyed");
            return;
        }
        if (!this.isAdDownloaded.get()) {
            Logger.Companion.d(TAG, "renderAd() - not ready: not downloaded.");
            return;
        }
        if (!this.isAdAttachedToWindow.get()) {
            Logger.Companion.d(TAG, "renderAd() - not ready: not attached.");
            return;
        }
        if (!this.presenterStarted.getAndSet(true)) {
            MRAIDPresenter mRAIDPresenter = this.presenter;
            if (mRAIDPresenter != null) {
                mRAIDPresenter.prepare();
            }
            getImpressionTracker().addView(this, new ImpressionTracker.ImpressionListener() { // from class: com.vungle.ads.VungleBannerView.renderAd.1
                @Override // com.vungle.ads.internal.ImpressionTracker.ImpressionListener
                public void onImpression(View view) {
                    Logger.Companion.d(VungleBannerView.TAG, "ImpressionTracker checked the banner view become visible.");
                    VungleBannerView.this.isOnImpressionCalled = true;
                    VungleBannerView.this.logViewVisibleOnPlay();
                    VungleBannerView.this.checkHardwareAcceleration();
                    MRAIDPresenter mRAIDPresenter2 = VungleBannerView.this.presenter;
                    if (mRAIDPresenter2 != null) {
                        mRAIDPresenter2.start();
                    }
                }

                @Override // com.vungle.ads.internal.ImpressionTracker.ImpressionListener
                public void onViewInvisible(View view) {
                    VungleBannerView.this.logViewInvisibleOnPlay();
                }
            });
        }
        MRAIDAdWidget mRAIDAdWidget = this.adWidget;
        if (mRAIDAdWidget != null && !t.a(mRAIDAdWidget.getParent(), this)) {
            ViewParent parent = mRAIDAdWidget.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(mRAIDAdWidget);
            }
            addView(mRAIDAdWidget, this.calculatedPixelWidth, this.calculatedPixelHeight);
        }
        WatermarkView watermarkView = this.imageView;
        if (watermarkView != null && !t.a(watermarkView.getParent(), this)) {
            ViewParent parent2 = watermarkView.getParent();
            ViewGroup viewGroup2 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
            if (viewGroup2 != null) {
                viewGroup2.removeView(watermarkView);
            }
            addView(watermarkView, this.calculatedPixelWidth, this.calculatedPixelHeight);
            watermarkView.bringToFront();
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = this.calculatedPixelHeight;
            layoutParams.width = this.calculatedPixelWidth;
            requestLayout();
        }
    }

    private final void setAdVisibility(boolean z10) {
        MRAIDPresenter mRAIDPresenter;
        if (!this.isOnImpressionCalled || this.destroyed.get() || (mRAIDPresenter = this.presenter) == null) {
            return;
        }
        mRAIDPresenter.setAdVisibility(z10);
    }

    private final void willPresentAdView(AdPayload adPayload, Placement placement, VungleAdSize vungleAdSize) throws InstantiationException {
        ViewUtility viewUtility = ViewUtility.INSTANCE;
        Context context = getContext();
        t.e(context, "context");
        this.calculatedPixelHeight = viewUtility.dpToPixels(context, vungleAdSize.getHeight());
        Context context2 = getContext();
        t.e(context2, "context");
        this.calculatedPixelWidth = viewUtility.dpToPixels(context2, vungleAdSize.getWidth());
        AdEventListener adEventListener = new AdEventListener(this.adViewImpl.getAdPlayCallback$vungle_ads_release(), this.adViewImpl.getAdInternal$vungle_ads_release().getPlacement());
        try {
            Context context3 = getContext();
            t.e(context3, "context");
            MRAIDAdWidget mRAIDAdWidget = new MRAIDAdWidget(context3, adPayload.eventId());
            this.adWidget = mRAIDAdWidget;
            mRAIDAdWidget.setCloseDelegate(new MRAIDAdWidget.CloseDelegate() { // from class: com.vungle.ads.VungleBannerView.willPresentAdView.1
                @Override // com.vungle.ads.internal.ui.view.MRAIDAdWidget.CloseDelegate
                public void close() {
                    VungleBannerView.this.finishAdInternal(false);
                }
            });
            mRAIDAdWidget.setOnViewTouchListener(new MRAIDAdWidget.OnViewTouchListener() { // from class: com.vungle.ads.VungleBannerView.willPresentAdView.2
                @Override // com.vungle.ads.internal.ui.view.MRAIDAdWidget.OnViewTouchListener
                public boolean onTouch(MotionEvent motionEvent) {
                    MRAIDPresenter mRAIDPresenter = VungleBannerView.this.presenter;
                    if (mRAIDPresenter == null) {
                        return false;
                    }
                    mRAIDPresenter.onViewTouched(motionEvent);
                    return false;
                }
            });
            ServiceLocator.Companion companion = ServiceLocator.Companion;
            Context context4 = getContext();
            t.e(context4, "context");
            o oVar = o.SYNCHRONIZED;
            k kVarB = m.b(oVar, new VungleBannerView$willPresentAdView$$inlined$inject$1(context4));
            Context context5 = getContext();
            t.e(context5, "context");
            OMTracker oMTrackerMake = m224willPresentAdView$lambda6(m.b(oVar, new VungleBannerView$willPresentAdView$$inlined$inject$2(context5))).make(adPayload.omEnabled());
            Context context6 = getContext();
            t.e(context6, "context");
            k kVarB2 = m.b(oVar, new VungleBannerView$willPresentAdView$$inlined$inject$3(context6));
            VungleWebClient orCreateWebViewClient = WebViewManager.INSTANCE.getOrCreateWebViewClient(adPayload, placement, m223willPresentAdView$lambda5(kVarB).getOffloadExecutor(), m225willPresentAdView$lambda7(kVarB2));
            this.ringerModeReceiver.setListener(orCreateWebViewClient);
            orCreateWebViewClient.setWebViewObserver(oMTrackerMake);
            MRAIDPresenter mRAIDPresenter = new MRAIDPresenter(mRAIDAdWidget, adPayload, placement, orCreateWebViewClient, m223willPresentAdView$lambda5(kVarB).getJobExecutor(), oMTrackerMake, m225willPresentAdView$lambda7(kVarB2));
            mRAIDPresenter.setEventListener(adEventListener);
            this.presenter = mRAIDPresenter;
            String watermark$vungle_ads_release = getAdConfig().getWatermark$vungle_ads_release();
            if (watermark$vungle_ads_release != null) {
                Context context7 = getContext();
                t.e(context7, "context");
                this.imageView = new WatermarkView(context7, watermark$vungle_ads_release);
            }
        } catch (InstantiationException e10) {
            adEventListener.onError(new AdCantPlayWithoutWebView(e10.getMessage()).setLogEntry$vungle_ads_release(this.adViewImpl.getLogEntry$vungle_ads_release()).logError$vungle_ads_release(), this.placementId);
            throw e10;
        }
    }

    /* JADX INFO: renamed from: willPresentAdView$lambda-5, reason: not valid java name */
    private static final Executors m223willPresentAdView$lambda5(k<? extends Executors> kVar) {
        return kVar.getValue();
    }

    /* JADX INFO: renamed from: willPresentAdView$lambda-6, reason: not valid java name */
    private static final OMTracker.Factory m224willPresentAdView$lambda6(k<OMTracker.Factory> kVar) {
        return kVar.getValue();
    }

    /* JADX INFO: renamed from: willPresentAdView$lambda-7, reason: not valid java name */
    private static final Platform m225willPresentAdView$lambda7(k<? extends Platform> kVar) {
        return kVar.getValue();
    }

    public final void finishAd() {
        ThreadUtil.INSTANCE.runOnUiThread(new C24161());
    }

    public final AdConfig getAdConfig() {
        return this.adViewImpl.getAdConfig();
    }

    public final BannerAdListener getAdListener() {
        return this.adListener;
    }

    public final VungleAdSize getAdSize() {
        return this.adSize;
    }

    public final VungleAdSize getAdViewSize() {
        return this.adViewImpl.getAdViewSize();
    }

    @Override // com.vungle.ads.VungleAdType
    public String getAdapterAdFormat() {
        return this.adViewImpl.getAdapterAdFormat();
    }

    public final String getCreativeId() {
        return this.adViewImpl.getCreativeId();
    }

    public final String getEventId() {
        return this.adViewImpl.getEventId();
    }

    public final LogEntry getLogEntry$vungle_ads_release() {
        return this.adViewImpl.getLogEntry$vungle_ads_release();
    }

    public final String getPlacementId() {
        return this.placementId;
    }

    public final void load() {
        this.adViewImpl.load();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Logger.Companion companion = Logger.Companion;
        companion.d(TAG, "onAttachedToWindow(): " + hashCode());
        this.isAdAttachedToWindow.set(true);
        if (this.adViewImpl.getAdInternal$vungle_ads_release().getPlacement() != null) {
            try {
                if (!this.isReceiverRegistered) {
                    getContext().registerReceiver(this.ringerModeReceiver, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
                    this.isReceiverRegistered = true;
                    companion.d(TAG, "registerReceiver(): " + this.ringerModeReceiver.hashCode());
                }
            } catch (Exception e10) {
                Logger.Companion.e(TAG, "registerReceiver error: " + e10.getLocalizedMessage());
            }
        }
        renderAd();
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        setAdVisibility(i10 == 0);
    }

    public final void setAdListener(BannerAdListener bannerAdListener) {
        this.adListener = bannerAdListener;
    }

    @Override // com.vungle.ads.VungleAdType
    public void setAdapterAdFormat(String str) {
        this.adViewImpl.setAdapterAdFormat(str);
    }

    public final void load(String str) {
        this.adViewImpl.load(str);
    }

    public final void load(VungleCSBData csbData) {
        t.f(csbData, "csbData");
        this.adViewImpl.load(csbData);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Logger.Companion.d(TAG, "onDetachedFromWindow(): " + hashCode());
        this.isAdAttachedToWindow.set(false);
        if (this.adViewImpl.getAdInternal$vungle_ads_release().getPlacement() != null) {
            try {
                if (this.isReceiverRegistered) {
                    getContext().unregisterReceiver(this.ringerModeReceiver);
                    this.isReceiverRegistered = false;
                }
            } catch (Exception e10) {
                Logger.Companion.e(TAG, elEbP.wuPaAFs + e10.getLocalizedMessage());
            }
        }
    }
}
