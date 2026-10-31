package com.vungle.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.vungle.ads.internal.AdInternal;
import com.vungle.ads.internal.NativeAdInternal;
import com.vungle.ads.internal.presenter.AdPlayCallback;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.ui.view.MediaView;
import com.vungle.ads.internal.ui.view.NativeAdOptionsView;
import com.vungle.ads.internal.util.Logger;
import com.vungle.ads.internal.util.ThreadUtil;
import com.vungle.ads.nativead.NativeVideoOptions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.s;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: NativeAd.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class NativeAd extends BaseAd {
    public static final int BOTTOM_LEFT = 2;
    public static final int BOTTOM_RIGHT = 3;
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "NativeAd";
    public static final int TOP_LEFT = 0;
    public static final int TOP_RIGHT = 1;
    private MediaView adContentView;
    private ImageView adIconView;
    private int adOptionsPosition;
    private NativeAdOptionsView adOptionsView;
    private final NativeAd$adPlayCallback$1 adPlayCallback;
    private FrameLayout adRootView;
    private Collection<? extends View> clickableViews;
    private final AtomicBoolean destroyed;
    private int displayCount;
    private final NativeAdInternal nativeAdInternal;
    private final TimeIntervalMetric nativeDisplayDurationMetric;

    /* JADX INFO: compiled from: NativeAd.kt */
    @Retention(RetentionPolicy.RUNTIME)
    public @interface AdOptionsPosition {
    }

    /* JADX INFO: compiled from: NativeAd.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [com.vungle.ads.NativeAd$adPlayCallback$1] */
    private NativeAd(Context context, String str, AdConfig adConfig) {
        super(context, str, adConfig);
        this.adOptionsPosition = 1;
        AdInternal adInternal$vungle_ads_release = getAdInternal$vungle_ads_release();
        t.d(adInternal$vungle_ads_release, "null cannot be cast to non-null type com.vungle.ads.internal.NativeAdInternal");
        this.nativeAdInternal = (NativeAdInternal) adInternal$vungle_ads_release;
        this.nativeDisplayDurationMetric = new TimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.NATIVE_AD_DISPLAY_DURATION);
        this.destroyed = new AtomicBoolean(false);
        this.adPlayCallback = new AdPlayCallback() { // from class: com.vungle.ads.NativeAd$adPlayCallback$1
            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdClick(String str2) {
                ThreadUtil.INSTANCE.runOnUiThread(new NativeAd$adPlayCallback$1$onAdClick$1(this.this$0));
                this.this$0.getDisplayToClickMetric$vungle_ads_release().markEnd();
                AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.this$0.getDisplayToClickMetric$vungle_ads_release(), this.this$0.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdEnd(String str2) {
                if (this.this$0.getAdInternal$vungle_ads_release().isAdPlaying$vungle_ads_release()) {
                    this.this$0.getAdInternal$vungle_ads_release().setAdState(AdInternal.AdState.READY);
                }
                ThreadUtil.INSTANCE.runOnUiThread(new NativeAd$adPlayCallback$1$onAdEnd$1(this.this$0));
                this.this$0.getShowToCloseMetric$vungle_ads_release().markEnd();
                AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.this$0.getShowToCloseMetric$vungle_ads_release(), this.this$0.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdImpression(String str2) {
                this.this$0.getAdInternal$vungle_ads_release().setAdState(AdInternal.AdState.IMPRESSION_LOGGED);
                ThreadUtil.INSTANCE.runOnUiThread(new NativeAd$adPlayCallback$1$onAdImpression$1(this.this$0));
                this.this$0.getPresentToDisplayMetric$vungle_ads_release().markEnd();
                AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.this$0.getPresentToDisplayMetric$vungle_ads_release(), this.this$0.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
                this.this$0.getDisplayToClickMetric$vungle_ads_release().markStart();
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdLeftApplication(String str2) {
                ThreadUtil.INSTANCE.runOnUiThread(new NativeAd$adPlayCallback$1$onAdLeftApplication$1(this.this$0));
                AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.this$0.getLeaveApplicationMetric$vungle_ads_release(), this.this$0.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdStart(String str2) {
                this.this$0.getAdInternal$vungle_ads_release().setAdState(AdInternal.AdState.PLAYING);
                this.this$0.getSignalManager$vungle_ads_release().increaseSessionDepthCounter();
                this.this$0.getAdInternal$vungle_ads_release().getValidationToPresentMetric$vungle_ads_release().markEnd();
                AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.this$0.getAdInternal$vungle_ads_release().getValidationToPresentMetric$vungle_ads_release(), this.this$0.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
                this.this$0.getPresentToDisplayMetric$vungle_ads_release().markStart();
                ThreadUtil.INSTANCE.runOnUiThread(new NativeAd$adPlayCallback$1$onAdStart$1(this.this$0));
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onFailure(VungleError error) {
                t.f(error, "error");
                this.this$0.getAdInternal$vungle_ads_release().setAdState(AdInternal.AdState.ERROR);
                ThreadUtil.INSTANCE.runOnUiThread(new NativeAd$adPlayCallback$1$onFailure$1(this.this$0, error));
                this.this$0.getShowToFailMetric$vungle_ads_release().markEnd();
                AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(this.this$0.getShowToFailMetric$vungle_ads_release(), this.this$0.getLogEntry$vungle_ads_release(), error.getCode() + '-' + error.getErrorMessage());
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdRewarded(String str2) {
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: registerViewForInteraction$lambda-1, reason: not valid java name */
    public static final void m220registerViewForInteraction$lambda1(NativeAd this$0, View view) {
        t.f(this$0, "this$0");
        this$0.nativeAdInternal.onPrivacyIconClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: registerViewForInteraction$lambda-3$lambda-2, reason: not valid java name */
    public static final void m221registerViewForInteraction$lambda3$lambda2(NativeAd this$0, View view) {
        t.f(this$0, "this$0");
        this$0.nativeAdInternal.openCallToActionUrlByUser();
    }

    public final String getAdBodyText() {
        return this.nativeAdInternal.getAdBodyText();
    }

    public final String getAdCallToActionText() {
        return this.nativeAdInternal.getAdCallToActionText();
    }

    public final int getAdOptionsPosition() {
        return this.adOptionsPosition;
    }

    public final String getAdSponsoredText() {
        return this.nativeAdInternal.getAdSponsoredText();
    }

    public final Double getAdStarRating() {
        return this.nativeAdInternal.getAdStarRating();
    }

    public final String getAdTitle() {
        return this.nativeAdInternal.getAdTitle();
    }

    public final String getAppIcon() {
        return this.nativeAdInternal.getAppIcon();
    }

    public final float getMediaAspectRatio() {
        return this.nativeAdInternal.getMediaAspectRatio();
    }

    public final MediaView getMediaView() {
        return this.adContentView;
    }

    public final TimeIntervalMetric getNativeDisplayDurationMetric$vungle_ads_release() {
        return this.nativeDisplayDurationMetric;
    }

    public final NativeVideoOptions getVideoOptions() {
        return this.nativeAdInternal.getVideoOptions$vungle_ads_release();
    }

    public final boolean hasCallToAction() {
        return this.nativeAdInternal.hasCallToAction();
    }

    public final boolean hasVideoContent() {
        return this.nativeAdInternal.hasVideoContent();
    }

    public final void performCTA() {
        this.nativeAdInternal.openCallToActionUrl();
    }

    public final void registerViewForInteraction(FrameLayout rootView, MediaView mediaView, ImageView imageView, Collection<? extends View> collection) {
        t.f(rootView, "rootView");
        t.f(mediaView, "mediaView");
        Logger.Companion companion = Logger.Companion;
        companion.w(TAG, "registerViewForInteraction " + hashCode());
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.PLAY_AD_API), getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
        this.displayCount = this.displayCount + 1;
        this.nativeDisplayDurationMetric.markStart();
        getResponseToShowMetric$vungle_ads_release().markEnd();
        AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, getResponseToShowMetric$vungle_ads_release(), getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
        getAdInternal$vungle_ads_release().getShowToValidationMetric$vungle_ads_release().markStart();
        getShowToFailMetric$vungle_ads_release().markStart();
        getShowToCloseMetric$vungle_ads_release().markStart();
        if (getAdInternal$vungle_ads_release().isAdPlaying$vungle_ads_release()) {
            if (t.a(this.adRootView, rootView)) {
                companion.d(TAG, "no-op when re-play it on the same root view");
                return;
            }
            unregisterView();
        }
        this.destroyed.set(false);
        VungleError vungleErrorCanPlayAd = getAdInternal$vungle_ads_release().canPlayAd(true);
        if (vungleErrorCanPlayAd != null) {
            companion.w(TAG, "registerViewForInteraction can NOT play. " + hashCode() + ' ' + vungleErrorCanPlayAd);
            if (getAdInternal$vungle_ads_release().isErrorTerminal$vungle_ads_release(vungleErrorCanPlayAd.getCode())) {
                getAdInternal$vungle_ads_release().setAdState(AdInternal.AdState.ERROR);
            }
            BaseAdListener adListener = getAdListener();
            if (adListener != null) {
                adListener.onAdFailedToPlay(this, vungleErrorCanPlayAd);
                return;
            }
            return;
        }
        this.adRootView = rootView;
        this.adContentView = mediaView;
        this.adIconView = imageView;
        this.clickableViews = collection;
        this.nativeAdInternal.initPresenter(rootView, this.adPlayCallback);
        if (this.adOptionsView == null) {
            this.adOptionsView = new NativeAdOptionsView(getContext());
        }
        NativeAdOptionsView nativeAdOptionsView = this.adOptionsView;
        if (nativeAdOptionsView != null) {
            nativeAdOptionsView.setOnClickListener(new View.OnClickListener() { // from class: com.vungle.ads.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    NativeAd.m220registerViewForInteraction$lambda1(this.f13033a, view);
                }
            });
        }
        if (collection == null) {
            collection = s.e(mediaView);
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setOnClickListener(new View.OnClickListener() { // from class: com.vungle.ads.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    NativeAd.m221registerViewForInteraction$lambda3$lambda2(this.f13034a, view);
                }
            });
        }
        NativeAdOptionsView nativeAdOptionsView2 = this.adOptionsView;
        if (nativeAdOptionsView2 != null) {
            nativeAdOptionsView2.renderTo(rootView, this.adOptionsPosition);
        }
        this.nativeAdInternal.trySetTouchListener(mediaView);
        mediaView.present$vungle_ads_release(this.nativeAdInternal);
        this.nativeAdInternal.displayAppIcon(imageView);
        NativeAdInternal nativeAdInternal = this.nativeAdInternal;
        NativeAdOptionsView nativeAdOptionsView3 = this.adOptionsView;
        nativeAdInternal.displayPrivacyIcon(nativeAdOptionsView3 != null ? nativeAdOptionsView3.getPrivacyIcon$vungle_ads_release() : null);
        this.nativeAdInternal.showWatermark(rootView, getAdConfig().getWatermark$vungle_ads_release());
        getAdInternal$vungle_ads_release().getShowToValidationMetric$vungle_ads_release().markEnd();
        AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, getAdInternal$vungle_ads_release().getShowToValidationMetric$vungle_ads_release(), getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
        getAdInternal$vungle_ads_release().getValidationToPresentMetric$vungle_ads_release().markStart();
    }

    public final void setAdOptionsPosition(int i10) {
        this.adOptionsPosition = i10;
    }

    public final void unregisterView() {
        Logger.Companion.w(TAG, "unregisterView  " + hashCode());
        if (this.destroyed.getAndSet(true)) {
            return;
        }
        this.nativeDisplayDurationMetric.markEnd();
        this.nativeDisplayDurationMetric.setMeta(String.valueOf(this.displayCount));
        AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.nativeDisplayDurationMetric, getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
        Collection<? extends View> collection = this.clickableViews;
        if (collection != null) {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                ((View) it.next()).setOnClickListener(null);
            }
        }
        this.clickableViews = null;
        this.adRootView = null;
        MediaView mediaView = this.adContentView;
        if (mediaView != null) {
            mediaView.destroy$vungle_ads_release();
        }
        this.adContentView = null;
        NativeAdOptionsView nativeAdOptionsView = this.adOptionsView;
        if (nativeAdOptionsView != null) {
            nativeAdOptionsView.destroy();
        }
        this.adOptionsView = null;
        this.nativeAdInternal.destroy();
        try {
            ImageView imageView = this.adIconView;
            Drawable drawable = imageView != null ? imageView.getDrawable() : null;
            if (drawable instanceof BitmapDrawable) {
                Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                if (!bitmap.isRecycled()) {
                    bitmap.recycle();
                }
            }
        } catch (Exception e10) {
            Logger.Companion.w(TAG, "error msg: " + e10.getLocalizedMessage());
        }
        ImageView imageView2 = this.adIconView;
        if (imageView2 != null) {
            imageView2.setImageDrawable(null);
        }
        this.adIconView = null;
    }

    @Override // com.vungle.ads.BaseAd
    public NativeAdInternal constructAdInternal$vungle_ads_release(Context context) {
        t.f(context, "context");
        return new NativeAdInternal(context);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NativeAd(Context context, String placementId) {
        this(context, placementId, new AdConfig());
        t.f(context, "context");
        t.f(placementId, "placementId");
    }

    @AdOptionsPosition
    public static /* synthetic */ void getAdOptionsPosition$annotations() {
    }
}
