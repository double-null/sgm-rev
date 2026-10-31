package com.vungle.ads;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.vungle.ads.internal.ImpressionTracker;
import com.vungle.ads.internal.executor.Executors;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.omsdk.OMTracker;
import com.vungle.ads.internal.platform.Platform;
import com.vungle.ads.internal.presenter.AdEventListener;
import com.vungle.ads.internal.presenter.AdPlayCallback;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.ui.VungleWebClient;
import com.vungle.ads.internal.ui.WatermarkView;
import com.vungle.ads.internal.ui.view.MRAIDAdWidget;
import com.vungle.ads.internal.util.Logger;
import com.vungle.ads.internal.util.ViewUtility;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.t;
import wc.k;
import wc.m;
import wc.o;

/* JADX INFO: compiled from: BannerView.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class BannerView extends RelativeLayout {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "BannerView";
    private MRAIDAdWidget adWidget;
    private final AdPayload advertisement;
    private int calculatedPixelHeight;
    private int calculatedPixelWidth;
    private final AtomicBoolean destroyed;
    private WatermarkView imageView;
    private final k impressionTracker$delegate;
    private final AtomicBoolean isInvisibleLogged;
    private boolean isOnImpressionCalled;
    private final Placement placement;
    private MRAIDPresenter presenter;
    private final AtomicBoolean presenterStarted;

    /* JADX INFO: compiled from: BannerView.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BannerView(Context context, Placement placement, AdPayload advertisement, VungleAdSize adSize, AdConfig adConfig, AdPlayCallback adPlayCallback) throws InstantiationException {
        super(context);
        t.f(context, "context");
        t.f(placement, "placement");
        t.f(advertisement, "advertisement");
        t.f(adSize, "adSize");
        t.f(adConfig, "adConfig");
        t.f(adPlayCallback, "adPlayCallback");
        this.placement = placement;
        this.advertisement = advertisement;
        this.destroyed = new AtomicBoolean(false);
        this.presenterStarted = new AtomicBoolean(false);
        this.isInvisibleLogged = new AtomicBoolean(false);
        this.impressionTracker$delegate = m.a(new BannerView$impressionTracker$2(context));
        ViewUtility viewUtility = ViewUtility.INSTANCE;
        this.calculatedPixelHeight = viewUtility.dpToPixels(context, adSize.getHeight());
        this.calculatedPixelWidth = viewUtility.dpToPixels(context, adSize.getWidth());
        AdEventListener adEventListener = new AdEventListener(adPlayCallback, placement);
        try {
            MRAIDAdWidget mRAIDAdWidget = new MRAIDAdWidget(context, null, 2, 0 == true ? 1 : 0);
            this.adWidget = mRAIDAdWidget;
            mRAIDAdWidget.setCloseDelegate(new MRAIDAdWidget.CloseDelegate() { // from class: com.vungle.ads.BannerView.1
                @Override // com.vungle.ads.internal.ui.view.MRAIDAdWidget.CloseDelegate
                public void close() {
                    BannerView.this.finishAdInternal(false);
                }
            });
            mRAIDAdWidget.setOnViewTouchListener(new MRAIDAdWidget.OnViewTouchListener() { // from class: com.vungle.ads.BannerView.2
                @Override // com.vungle.ads.internal.ui.view.MRAIDAdWidget.OnViewTouchListener
                public boolean onTouch(MotionEvent motionEvent) {
                    MRAIDPresenter mRAIDPresenter = BannerView.this.presenter;
                    if (mRAIDPresenter == null) {
                        return false;
                    }
                    mRAIDPresenter.onViewTouched(motionEvent);
                    return false;
                }
            });
            ServiceLocator.Companion companion = ServiceLocator.Companion;
            o oVar = o.SYNCHRONIZED;
            k kVarB = m.b(oVar, new BannerView$special$$inlined$inject$1(context));
            OMTracker oMTrackerMake = m218_init_$lambda3(m.b(oVar, new BannerView$special$$inlined$inject$2(context))).make(advertisement.omEnabled());
            k kVarB2 = m.b(oVar, new BannerView$special$$inlined$inject$3(context));
            VungleWebClient vungleWebClient = new VungleWebClient(advertisement, placement, m217_init_$lambda2(kVarB).getOffloadExecutor(), m219_init_$lambda4(kVarB2), null, null, 48, null);
            vungleWebClient.setWebViewObserver(oMTrackerMake);
            MRAIDPresenter mRAIDPresenter = new MRAIDPresenter(mRAIDAdWidget, advertisement, placement, vungleWebClient, m217_init_$lambda2(kVarB).getJobExecutor(), oMTrackerMake, m219_init_$lambda4(kVarB2));
            mRAIDPresenter.setEventListener(adEventListener);
            this.presenter = mRAIDPresenter;
            String watermark$vungle_ads_release = adConfig.getWatermark$vungle_ads_release();
            if (watermark$vungle_ads_release != null) {
                this.imageView = new WatermarkView(context, watermark$vungle_ads_release);
            }
        } catch (InstantiationException e10) {
            adEventListener.onError(new AdCantPlayWithoutWebView(null, 1, null).setLogEntry$vungle_ads_release(this.advertisement.getLogEntry$vungle_ads_release()).logError$vungle_ads_release(), this.placement.getReferenceId());
            throw e10;
        }
    }

    /* JADX INFO: renamed from: _init_$lambda-2, reason: not valid java name */
    private static final Executors m217_init_$lambda2(k<? extends Executors> kVar) {
        return kVar.getValue();
    }

    /* JADX INFO: renamed from: _init_$lambda-3, reason: not valid java name */
    private static final OMTracker.Factory m218_init_$lambda3(k<OMTracker.Factory> kVar) {
        return kVar.getValue();
    }

    /* JADX INFO: renamed from: _init_$lambda-4, reason: not valid java name */
    private static final Platform m219_init_$lambda4(k<? extends Platform> kVar) {
        return kVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkHardwareAcceleration() {
        Logger.Companion.w(TAG, "hardwareAccelerated = " + isHardwareAccelerated());
        if (isHardwareAccelerated()) {
            return;
        }
        AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, Sdk.SDKMetric.SDKMetricType.HARDWARE_ACCELERATE_DISABLED, 0L, this.advertisement.getLogEntry$vungle_ads_release(), null, 10, null);
    }

    private final ImpressionTracker getImpressionTracker() {
        return (ImpressionTracker) this.impressionTracker$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logViewVisibleOnPlay() {
        long j10 = this.isInvisibleLogged.get() ? 3L : 2L;
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        SingleValueMetric singleValueMetric = new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.AD_VISIBILITY);
        singleValueMetric.setValue(Long.valueOf(j10));
        AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, singleValueMetric, this.advertisement.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
        Logger.Companion.d(TAG, "Log metric AD_VISIBILITY: " + j10);
    }

    private final void renderAd() {
        MRAIDAdWidget mRAIDAdWidget = this.adWidget;
        if (mRAIDAdWidget != null) {
            if (!t.a(mRAIDAdWidget != null ? mRAIDAdWidget.getParent() : null, this)) {
                addView(this.adWidget, this.calculatedPixelWidth, this.calculatedPixelHeight);
                WatermarkView watermarkView = this.imageView;
                if (watermarkView != null) {
                    addView(watermarkView, this.calculatedPixelWidth, this.calculatedPixelHeight);
                    WatermarkView watermarkView2 = this.imageView;
                    if (watermarkView2 != null) {
                        watermarkView2.bringToFront();
                    }
                }
            }
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

    public final AdPayload getAdvertisement() {
        return this.advertisement;
    }

    public final Placement getPlacement() {
        return this.placement;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Logger.Companion.d(TAG, "onAttachedToWindow()");
        if (!this.presenterStarted.getAndSet(true)) {
            MRAIDPresenter mRAIDPresenter = this.presenter;
            if (mRAIDPresenter != null) {
                mRAIDPresenter.prepare();
            }
            getImpressionTracker().addView(this, new ImpressionTracker.ImpressionListener() { // from class: com.vungle.ads.BannerView.onAttachedToWindow.1
                @Override // com.vungle.ads.internal.ImpressionTracker.ImpressionListener
                public void onImpression(View view) {
                    Logger.Companion.d(BannerView.TAG, "ImpressionTracker checked the banner view become visible.");
                    BannerView.this.isOnImpressionCalled = true;
                    BannerView.this.logViewVisibleOnPlay();
                    BannerView.this.checkHardwareAcceleration();
                    MRAIDPresenter mRAIDPresenter2 = BannerView.this.presenter;
                    if (mRAIDPresenter2 != null) {
                        mRAIDPresenter2.start();
                    }
                }

                @Override // com.vungle.ads.internal.ImpressionTracker.ImpressionListener
                public void onViewInvisible(View view) {
                    if (BannerView.this.isInvisibleLogged.getAndSet(true)) {
                        return;
                    }
                    Logger.Companion.d(BannerView.TAG, "ImpressionTracker checked the banner view invisible on play.");
                    AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
                    SingleValueMetric singleValueMetric = new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.AD_VISIBILITY);
                    singleValueMetric.setValue(1L);
                    AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, singleValueMetric, BannerView.this.getAdvertisement().getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
                }
            });
        }
        renderAd();
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        setAdVisibility(i10 == 0);
    }
}
