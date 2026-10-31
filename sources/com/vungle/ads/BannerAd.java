package com.vungle.ads;

import android.content.Context;
import com.vungle.ads.internal.AdInternal;
import com.vungle.ads.internal.BannerAdInternal;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.presenter.AdPlayCallback;
import com.vungle.ads.internal.presenter.AdPlayCallbackWrapper;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.util.Logger;
import com.vungle.ads.internal.util.ThreadUtil;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import wc.g0;

/* JADX INFO: compiled from: BannerAd.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class BannerAd extends BaseAd {
    private final AdPlayCallbackWrapper adPlayCallback;
    private final VungleAdSize adSize;
    private BannerView bannerView;

    /* JADX INFO: compiled from: BannerAd.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BannerAdSize.values().length];
            iArr[BannerAdSize.BANNER.ordinal()] = 1;
            iArr[BannerAdSize.BANNER_SHORT.ordinal()] = 2;
            iArr[BannerAdSize.BANNER_LEADERBOARD.ordinal()] = 3;
            iArr[BannerAdSize.VUNGLE_MREC.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.vungle.ads.BannerAd$finishAd$1, reason: invalid class name */
    /* JADX INFO: compiled from: BannerAd.kt */
    static final class AnonymousClass1 extends u implements id.a<g0> {
        AnonymousClass1() {
            super(0);
        }

        @Override // id.a
        public /* bridge */ /* synthetic */ g0 invoke() {
            invoke2();
            return g0.f27756a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            BannerView bannerView = BannerAd.this.bannerView;
            if (bannerView != null) {
                bannerView.finishAdInternal(true);
            }
        }
    }

    /* JADX INFO: renamed from: com.vungle.ads.BannerAd$getBannerView$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: BannerAd.kt */
    static final class C24141 extends u implements id.a<g0> {
        final /* synthetic */ VungleError $error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C24141(VungleError vungleError) {
            super(0);
            this.$error = vungleError;
        }

        @Override // id.a
        public /* bridge */ /* synthetic */ g0 invoke() {
            invoke2();
            return g0.f27756a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            BaseAdListener adListener = BannerAd.this.getAdListener();
            if (adListener != null) {
                adListener.onAdFailedToPlay(BannerAd.this, this.$error);
            }
        }
    }

    private BannerAd(Context context, String str, VungleAdSize vungleAdSize, AdConfig adConfig) {
        super(context, str, adConfig);
        this.adSize = vungleAdSize;
        AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.DEPRECATED_API_USED), getLogEntry$vungle_ads_release(), "BannerAd is deprecated");
        AdInternal adInternal$vungle_ads_release = getAdInternal$vungle_ads_release();
        t.d(adInternal$vungle_ads_release, "null cannot be cast to non-null type com.vungle.ads.internal.BannerAdInternal");
        this.adPlayCallback = ((BannerAdInternal) adInternal$vungle_ads_release).wrapCallback$vungle_ads_release(new AdPlayCallback() { // from class: com.vungle.ads.BannerAd$adPlayCallback$1
            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdClick(String str2) {
                ThreadUtil.INSTANCE.runOnUiThread(new BannerAd$adPlayCallback$1$onAdClick$1(this.this$0));
                this.this$0.getDisplayToClickMetric$vungle_ads_release().markEnd();
                AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.this$0.getDisplayToClickMetric$vungle_ads_release(), this.this$0.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdEnd(String str2) {
                ThreadUtil.INSTANCE.runOnUiThread(new BannerAd$adPlayCallback$1$onAdEnd$1(this.this$0));
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdImpression(String str2) {
                ThreadUtil.INSTANCE.runOnUiThread(new BannerAd$adPlayCallback$1$onAdImpression$1(this.this$0));
                this.this$0.getPresentToDisplayMetric$vungle_ads_release().markEnd();
                AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.this$0.getPresentToDisplayMetric$vungle_ads_release(), this.this$0.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
                this.this$0.getDisplayToClickMetric$vungle_ads_release().markStart();
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdLeftApplication(String str2) {
                ThreadUtil.INSTANCE.runOnUiThread(new BannerAd$adPlayCallback$1$onAdLeftApplication$1(this.this$0));
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdStart(String str2) {
                this.this$0.getSignalManager$vungle_ads_release().increaseSessionDepthCounter();
                this.this$0.getAdInternal$vungle_ads_release().getValidationToPresentMetric$vungle_ads_release().markEnd();
                AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.this$0.getAdInternal$vungle_ads_release().getValidationToPresentMetric$vungle_ads_release(), this.this$0.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
                this.this$0.getPresentToDisplayMetric$vungle_ads_release().markStart();
                ThreadUtil.INSTANCE.runOnUiThread(new BannerAd$adPlayCallback$1$onAdStart$1(this.this$0));
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onFailure(VungleError error) {
                t.f(error, "error");
                this.this$0.getShowToFailMetric$vungle_ads_release().markEnd();
                AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(this.this$0.getShowToFailMetric$vungle_ads_release(), this.this$0.getLogEntry$vungle_ads_release(), String.valueOf(error.getCode()));
                ThreadUtil.INSTANCE.runOnUiThread(new BannerAd$adPlayCallback$1$onFailure$1(this.this$0, error));
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdRewarded(String str2) {
            }
        });
    }

    public final void finishAd() {
        ThreadUtil.INSTANCE.runOnUiThread(new AnonymousClass1());
    }

    public final VungleAdSize getAdViewSize() {
        AdInternal adInternal$vungle_ads_release = getAdInternal$vungle_ads_release();
        t.d(adInternal$vungle_ads_release, "null cannot be cast to non-null type com.vungle.ads.internal.BannerAdInternal");
        VungleAdSize updatedAdSize$vungle_ads_release = ((BannerAdInternal) adInternal$vungle_ads_release).getUpdatedAdSize$vungle_ads_release();
        return updatedAdSize$vungle_ads_release == null ? this.adSize : updatedAdSize$vungle_ads_release;
    }

    public final BannerView getBannerView() {
        Placement placement;
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.PLAY_AD_API), getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
        BannerView bannerView = this.bannerView;
        if (bannerView != null) {
            return bannerView;
        }
        getAdInternal$vungle_ads_release().getShowToValidationMetric$vungle_ads_release().markStart();
        VungleError vungleErrorCanPlayAd = getAdInternal$vungle_ads_release().canPlayAd(true);
        if (vungleErrorCanPlayAd != null) {
            if (getAdInternal$vungle_ads_release().isErrorTerminal$vungle_ads_release(vungleErrorCanPlayAd.getCode())) {
                getAdInternal$vungle_ads_release().setAdState(AdInternal.AdState.ERROR);
            }
            ThreadUtil.INSTANCE.runOnUiThread(new C24141(vungleErrorCanPlayAd));
            return null;
        }
        AdPayload advertisement = getAdInternal$vungle_ads_release().getAdvertisement();
        if (advertisement == null || (placement = getAdInternal$vungle_ads_release().getPlacement()) == null) {
            return null;
        }
        getAdInternal$vungle_ads_release().cancelDownload$vungle_ads_release();
        try {
            try {
                this.bannerView = new BannerView(getContext(), placement, advertisement, getAdViewSize(), getAdConfig(), this.adPlayCallback);
                getResponseToShowMetric$vungle_ads_release().markEnd();
                AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, getResponseToShowMetric$vungle_ads_release(), getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
                getAdInternal$vungle_ads_release().getShowToValidationMetric$vungle_ads_release().markEnd();
                AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, getAdInternal$vungle_ads_release().getShowToValidationMetric$vungle_ads_release(), getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
                getAdInternal$vungle_ads_release().getValidationToPresentMetric$vungle_ads_release().markStart();
                return this.bannerView;
            } catch (InstantiationException e10) {
                Logger.Companion.e("BannerAd", "Can not create banner view: " + e10.getMessage(), e10);
                getResponseToShowMetric$vungle_ads_release().markEnd();
                AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, getResponseToShowMetric$vungle_ads_release(), getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
                return null;
            }
        } catch (Throwable th) {
            getResponseToShowMetric$vungle_ads_release().markEnd();
            AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, getResponseToShowMetric$vungle_ads_release(), getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
            throw th;
        }
    }

    @Override // com.vungle.ads.BaseAd
    public BannerAdInternal constructAdInternal$vungle_ads_release(Context context) {
        t.f(context, "context");
        return new BannerAdInternal(context, this.adSize);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BannerAd(Context context, String placementId, VungleAdSize adSize) {
        this(context, placementId, adSize, new AdConfig());
        t.f(context, "context");
        t.f(placementId, "placementId");
        t.f(adSize, "adSize");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BannerAd(Context context, String placementId, BannerAdSize adSize) {
        VungleAdSize vungleAdSize;
        t.f(context, "context");
        t.f(placementId, "placementId");
        t.f(adSize, "adSize");
        VungleAdSize.Companion companion = VungleAdSize.Companion;
        int i10 = WhenMappings.$EnumSwitchMapping$0[adSize.ordinal()];
        if (i10 == 1) {
            vungleAdSize = VungleAdSize.BANNER;
        } else if (i10 == 2) {
            vungleAdSize = VungleAdSize.BANNER_SHORT;
        } else if (i10 == 3) {
            vungleAdSize = VungleAdSize.BANNER_LEADERBOARD;
        } else {
            if (i10 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            vungleAdSize = VungleAdSize.MREC;
        }
        this(context, placementId, vungleAdSize, new AdConfig());
    }
}
