package com.vungle.ads.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import com.vungle.ads.AdNotLoadedCantPlay;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.InvalidAdStateError;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.SingleValueMetric;
import com.vungle.ads.VungleAdSize;
import com.vungle.ads.VungleError;
import com.vungle.ads.internal.executor.Executors;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.platform.Platform;
import com.vungle.ads.internal.presenter.AdEventListener;
import com.vungle.ads.internal.presenter.AdPlayCallback;
import com.vungle.ads.internal.presenter.NativeAdPresenter;
import com.vungle.ads.internal.presenter.NativePresenterDelegate;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.ui.WatermarkView;
import com.vungle.ads.internal.util.ImageLoader;
import com.vungle.ads.internal.util.LogEntry;
import com.vungle.ads.internal.util.Logger;
import com.vungle.ads.internal.util.ThreadUtil;
import com.vungle.ads.nativead.NativeVideoOptions;
import id.l;
import id.p;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import rd.a0;
import rd.b0;
import rd.f0;
import wc.g0;
import wc.k;
import wc.m;
import wc.o;
import wc.r;
import wc.s;

/* JADX INFO: compiled from: NativeAdInternal.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class NativeAdInternal extends AdInternal implements NativePresenterDelegate {
    public static final Companion Companion = new Companion(null);
    public static final int PLAYBACK_EVENT_CLICK = 8;
    public static final int PLAYBACK_EVENT_COMPLETE = 3;
    public static final int PLAYBACK_EVENT_IMPRESSION = 11;
    public static final int PLAYBACK_EVENT_MUTE = 9;
    public static final int PLAYBACK_EVENT_PAUSE = 2;
    public static final int PLAYBACK_EVENT_PLAY = 1;
    public static final int PLAYBACK_EVENT_QUARTILE_FIRST = 5;
    public static final int PLAYBACK_EVENT_QUARTILE_SECOND = 6;
    public static final int PLAYBACK_EVENT_QUARTILE_START = 4;
    public static final int PLAYBACK_EVENT_QUARTILE_THIRD = 7;
    public static final int PLAYBACK_EVENT_UNMUTE = 10;
    public static final String QUARTILE_START_KEY_DURATION = "OM_KEY_DURATION";
    public static final String QUARTILE_START_KEY_VOLUME = "OM_KEY_VOLUME";
    private static final String TAG = "NativeAdInternal";
    private static final String TOKEN_APP_DESCRIPTION = "APP_DESCRIPTION";
    private static final String TOKEN_APP_ICON = "APP_ICON";
    private static final String TOKEN_APP_NAME = "APP_NAME";
    private static final String TOKEN_APP_RATING_VALUE = "APP_RATING_VALUE";
    private static final String TOKEN_CTA_BUTTON_TEXT = "CTA_BUTTON_TEXT";
    private static final String TOKEN_CTA_BUTTON_URL = "CTA_BUTTON_URL";
    public static final String TOKEN_MAIN_IMAGE = "MAIN_IMAGE";
    public static final String TOKEN_MAIN_VIDEO = "MAIN_VIDEO";
    private static final String TOKEN_OM_SDK_DATA = "OM_SDK_DATA";
    private static final String TOKEN_ORIGINAL_VIDEO_URL = "ORIGINAL_VIDEO_URL";
    private static final String TOKEN_SPONSORED_BY = "SPONSORED_BY";
    private static final String TOKEN_START_MUTED = "START_MUTED";
    public static final String TOKEN_VUNGLE_PRIVACY_ICON_URL = "VUNGLE_PRIVACY_ICON_URL";
    private static final String TOKEN_VUNGLE_PRIVACY_URL = "VUNGLE_PRIVACY_URL";
    private float aspectRatio;
    private final k executors$delegate;
    private final k imageLoader$delegate;
    private final k impressionTracker$delegate;
    private final AtomicBoolean isInvisibleLogged;
    private Map<String, String> nativeAdAssetMap;
    private final View.OnTouchListener onTouchListener;
    private final k platform$delegate;
    private NativeAdPresenter presenter;
    private final k videoOptions$delegate;
    private WatermarkView waterMarkView;

    /* JADX INFO: compiled from: NativeAdInternal.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.vungle.ads.internal.NativeAdInternal$displayImage$1, reason: invalid class name */
    /* JADX INFO: compiled from: NativeAdInternal.kt */
    static final class AnonymousClass1 extends u implements l<Bitmap, g0> {
        final /* synthetic */ ImageView $imageView;

        /* JADX INFO: renamed from: com.vungle.ads.internal.NativeAdInternal$displayImage$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: NativeAdInternal.kt */
        static final class C01681 extends u implements id.a<g0> {
            final /* synthetic */ ImageView $imageView;
            final /* synthetic */ Bitmap $it;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C01681(ImageView imageView, Bitmap bitmap) {
                super(0);
                this.$imageView = imageView;
                this.$it = bitmap;
            }

            @Override // id.a
            public /* bridge */ /* synthetic */ g0 invoke() {
                invoke2();
                return g0.f27756a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.$imageView.setImageBitmap(this.$it);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ImageView imageView) {
            super(1);
            this.$imageView = imageView;
        }

        @Override // id.l
        public /* bridge */ /* synthetic */ g0 invoke(Bitmap bitmap) {
            invoke2(bitmap);
            return g0.f27756a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Bitmap it) {
            t.f(it, "it");
            ImageView imageView = this.$imageView;
            if (imageView != null) {
                ThreadUtil.INSTANCE.runOnUiThread(new C01681(imageView, it));
            }
        }
    }

    /* JADX INFO: renamed from: com.vungle.ads.internal.NativeAdInternal$retrieveImageRatio$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: NativeAdInternal.kt */
    static final class C24201 extends u implements p<Integer, Integer, g0> {
        C24201() {
            super(2);
        }

        @Override // id.p
        public /* bridge */ /* synthetic */ g0 invoke(Integer num, Integer num2) {
            invoke(num.intValue(), num2.intValue());
            return g0.f27756a;
        }

        public final void invoke(int i10, int i11) {
            if (i10 <= 0 || i11 <= 0) {
                return;
            }
            NativeAdInternal.this.aspectRatio = i10 / i11;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeAdInternal(Context context) {
        super(context);
        t.f(context, "context");
        this.impressionTracker$delegate = m.a(new NativeAdInternal$impressionTracker$2(context));
        this.isInvisibleLogged = new AtomicBoolean(false);
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        o oVar = o.SYNCHRONIZED;
        this.platform$delegate = m.b(oVar, new NativeAdInternal$special$$inlined$inject$1(context));
        this.executors$delegate = m.b(oVar, new NativeAdInternal$special$$inlined$inject$2(context));
        this.imageLoader$delegate = m.a(new NativeAdInternal$imageLoader$2(this));
        this.videoOptions$delegate = m.a(NativeAdInternal$videoOptions$2.INSTANCE);
        this.onTouchListener = new View.OnTouchListener() { // from class: com.vungle.ads.internal.b
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return NativeAdInternal.m241onTouchListener$lambda0(this.f13039a, view, motionEvent);
            }
        };
    }

    private final void displayImage(String str, ImageView imageView) {
        getImageLoader().displayImage(str, new AnonymousClass1(imageView));
    }

    private final String getCtaUrl() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(TOKEN_CTA_BUTTON_URL)) == null) ? "" : str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Executors getExecutors() {
        return (Executors) this.executors$delegate.getValue();
    }

    private final ImageLoader getImageLoader() {
        return (ImageLoader) this.imageLoader$delegate.getValue();
    }

    private final ImpressionTracker getImpressionTracker() {
        return (ImpressionTracker) this.impressionTracker$delegate.getValue();
    }

    private final String getMainImagePath() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(TOKEN_MAIN_IMAGE)) == null) ? "" : str;
    }

    private final String getOMSDKData() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(TOKEN_OM_SDK_DATA)) == null) ? "" : str;
    }

    private final Platform getPlatform() {
        return (Platform) this.platform$delegate.getValue();
    }

    private final String getPrivacyIconUrl() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get("VUNGLE_PRIVACY_ICON_URL")) == null) ? "" : str;
    }

    private final String getPrivacyUrl() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(TOKEN_VUNGLE_PRIVACY_URL)) == null) ? "" : str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logViewVisibleOnPlay() {
        long j10 = this.isInvisibleLogged.get() ? 3L : 2L;
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        SingleValueMetric singleValueMetric = new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.AD_VISIBILITY);
        singleValueMetric.setValue(Long.valueOf(j10));
        AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, singleValueMetric, getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
        Logger.Companion.d(TAG, "Log metric AD_VISIBILITY: " + j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onTouchListener$lambda-0, reason: not valid java name */
    public static final boolean m241onTouchListener$lambda0(NativeAdInternal this$0, View view, MotionEvent motionEvent) {
        t.f(this$0, "this$0");
        NativeAdPresenter nativeAdPresenter = this$0.presenter;
        if (nativeAdPresenter == null) {
            return false;
        }
        nativeAdPresenter.onViewTouched(motionEvent);
        return false;
    }

    private final void retrieveImageRatio() {
        getImageLoader().getImageSize(getMainImagePath(), new C24201());
    }

    private final void retrieveVideoRatio() {
        Object objC;
        Object objC2;
        Throwable thG;
        Object objC3;
        Integer numP;
        Integer numP2;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            Context context = getContext();
            Uri uri = Uri.parse(getMainVideoPath$vungle_ads_release());
            t.e(uri, "parse(this)");
            mediaMetadataRetriever.setDataSource(context, uri);
            String strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
            int iIntValue = 0;
            int iIntValue2 = (strExtractMetadata == null || (numP2 = b0.p(strExtractMetadata)) == null) ? 0 : numP2.intValue();
            String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
            if (strExtractMetadata2 != null && (numP = b0.p(strExtractMetadata2)) != null) {
                iIntValue = numP.intValue();
            }
            if (iIntValue2 > 0 && iIntValue > 0) {
                this.aspectRatio = iIntValue2 / iIntValue;
            }
            try {
                r.a aVar = r.f27774b;
                mediaMetadataRetriever.release();
                objC3 = r.c(g0.f27756a);
            } catch (Throwable th) {
                r.a aVar2 = r.f27774b;
                objC3 = r.c(s.a(th));
            }
            thG = r.g(objC3);
            if (thG == null) {
                return;
            }
        } catch (Throwable th2) {
            try {
                Logger.Companion.e("NativeAd", "Failed to retrieve video metadata: " + th2.getLocalizedMessage());
                try {
                    r.a aVar3 = r.f27774b;
                    mediaMetadataRetriever.release();
                    objC2 = r.c(g0.f27756a);
                } catch (Throwable th3) {
                    r.a aVar4 = r.f27774b;
                    objC2 = r.c(s.a(th3));
                }
                thG = r.g(objC2);
                if (thG == null) {
                    return;
                }
            } catch (Throwable th4) {
                try {
                    r.a aVar5 = r.f27774b;
                    mediaMetadataRetriever.release();
                    objC = r.c(g0.f27756a);
                } catch (Throwable th5) {
                    r.a aVar6 = r.f27774b;
                    objC = r.c(s.a(th5));
                }
                Throwable thG2 = r.g(objC);
                if (thG2 == null) {
                    throw th4;
                }
                Logger.Companion.e(TAG, "Failed to release metadata retriever", thG2);
                throw th4;
            }
        }
        Logger.Companion.e(TAG, "Failed to release metadata retriever", thG);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void trackOMEvent$default(NativeAdInternal nativeAdInternal, int i10, Map map, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            map = null;
        }
        nativeAdInternal.trackOMEvent(i10, map);
    }

    public static /* synthetic */ void trackTpatEvent$default(NativeAdInternal nativeAdInternal, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        nativeAdInternal.trackTpatEvent(str, str2);
    }

    public final void destroy() {
        WatermarkView watermarkView = this.waterMarkView;
        if (watermarkView != null) {
            ViewParent parent = watermarkView.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(watermarkView);
            }
        }
        this.waterMarkView = null;
        getImpressionTracker().destroy();
        NativeAdPresenter nativeAdPresenter = this.presenter;
        if (nativeAdPresenter != null) {
            nativeAdPresenter.detach();
        }
    }

    public final void displayAppIcon(ImageView imageView) {
        displayImage(getAppIcon(), imageView);
    }

    public final void displayMainImage(ImageView imageView) {
        displayImage(getMainImagePath(), imageView);
    }

    public final void displayPrivacyIcon(ImageView imageView) {
        displayImage(getPrivacyIconUrl(), imageView);
    }

    public final String getAdBodyText() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(TOKEN_APP_DESCRIPTION)) == null) ? "" : str;
    }

    public final String getAdCallToActionText() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(TOKEN_CTA_BUTTON_TEXT)) == null) ? "" : str;
    }

    @Override // com.vungle.ads.internal.AdInternal
    public VungleAdSize getAdSizeForAdRequest() {
        return null;
    }

    public final String getAdSponsoredText() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(TOKEN_SPONSORED_BY)) == null) ? "" : str;
    }

    public final Double getAdStarRating() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        if (map == null || (str = map.get(TOKEN_APP_RATING_VALUE)) == null) {
            return null;
        }
        return a0.m(str);
    }

    public final String getAdTitle() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(TOKEN_APP_NAME)) == null) ? "" : str;
    }

    public final String getAppIcon() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(TOKEN_APP_ICON)) == null) ? "" : str;
    }

    public final String getMainVideoPath$vungle_ads_release() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get("MAIN_VIDEO")) == null) ? "" : str;
    }

    public final float getMediaAspectRatio() {
        return this.aspectRatio;
    }

    public final String getOriginalVideoUrl$vungle_ads_release() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(TOKEN_ORIGINAL_VIDEO_URL)) == null) ? "" : str;
    }

    @Override // com.vungle.ads.internal.presenter.NativePresenterDelegate
    public String getPlacementRefId() {
        Placement placement = getPlacement();
        if (placement != null) {
            return placement.getReferenceId();
        }
        return null;
    }

    public final NativeAdPresenter getPresenter$vungle_ads_release() {
        return this.presenter;
    }

    public final NativeVideoOptions getVideoOptions$vungle_ads_release() {
        return (NativeVideoOptions) this.videoOptions$delegate.getValue();
    }

    public final boolean hasCallToAction() {
        return getCtaUrl().length() > 0;
    }

    public final boolean hasVideoContent() {
        return getMainVideoPath$vungle_ads_release().length() > 0;
    }

    public final void initPresenter(View rootView, AdPlayCallback adPlayCallback) {
        t.f(rootView, "rootView");
        AdPayload advertisement = getAdvertisement();
        if (advertisement == null) {
            VungleError vungleErrorLogError$vungle_ads_release = new AdNotLoadedCantPlay("Ad is null").setLogEntry$vungle_ads_release(getLogEntry$vungle_ads_release()).logError$vungle_ads_release();
            if (adPlayCallback != null) {
                adPlayCallback.onFailure(vungleErrorLogError$vungle_ads_release);
                return;
            }
            return;
        }
        if (this.presenter == null) {
            NativeAdPresenter nativeAdPresenter = new NativeAdPresenter(getContext(), this, advertisement, getPlatform());
            this.presenter = nativeAdPresenter;
            nativeAdPresenter.setEventListener(new AdEventListener(adPlayCallback, getPlacement()));
        }
        NativeAdPresenter nativeAdPresenter2 = this.presenter;
        if (nativeAdPresenter2 != null) {
            nativeAdPresenter2.initAndStartOMTracker(rootView, getOMSDKData());
        }
        getImpressionTracker().addView(rootView, new ImpressionTracker.ImpressionListener() { // from class: com.vungle.ads.internal.NativeAdInternal.initPresenter.1
            @Override // com.vungle.ads.internal.ImpressionTracker.ImpressionListener
            public void onImpression(View view) {
                Logger.Companion.d(NativeAdInternal.TAG, "ImpressionTracker checked the native ad view become visible.");
                NativeAdInternal.this.onImpression$vungle_ads_release();
                NativeAdInternal.this.logViewVisibleOnPlay();
            }

            @Override // com.vungle.ads.internal.ImpressionTracker.ImpressionListener
            public void onViewInvisible(View view) {
                if (NativeAdInternal.this.isInvisibleLogged.getAndSet(true)) {
                    return;
                }
                Logger.Companion.d(NativeAdInternal.TAG, "ImpressionTracker checked the native ad view invisible on play, log AD_VISIBILITY_INVISIBLE.");
                AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
                SingleValueMetric singleValueMetric = new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.AD_VISIBILITY);
                singleValueMetric.setValue(1L);
                AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, singleValueMetric, NativeAdInternal.this.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
            }
        });
        NativeAdPresenter nativeAdPresenter3 = this.presenter;
        if (nativeAdPresenter3 != null) {
            nativeAdPresenter3.prepare();
        }
    }

    @Override // com.vungle.ads.internal.AdInternal
    public VungleError isAdStateValidOnCanPlay() {
        if (getAdState() == AdInternal.AdState.READY || isAdPlaying$vungle_ads_release()) {
            return null;
        }
        return new InvalidAdStateError(Sdk.SDKError.Reason.AD_NOT_LOADED, getAdState() + " can not play native ad.");
    }

    @Override // com.vungle.ads.internal.presenter.NativePresenterDelegate
    public boolean isNativeVideo() {
        return hasVideoContent();
    }

    public final boolean isStartMuted$vungle_ads_release() {
        if (!getPlatform().isSilentModeEnabled()) {
            Boolean startMuted = getVideoOptions$vungle_ads_release().getStartMuted();
            if (!(startMuted != null ? startMuted.booleanValue() : isStartMutedByServer$vungle_ads_release())) {
                return false;
            }
        }
        return true;
    }

    public final boolean isStartMutedByServer$vungle_ads_release() {
        String str;
        Boolean boolC1;
        Map<String, String> map = this.nativeAdAssetMap;
        if (map == null || (str = map.get(TOKEN_START_MUTED)) == null || (boolC1 = f0.c1(str)) == null) {
            return true;
        }
        return boolC1.booleanValue();
    }

    @Override // com.vungle.ads.internal.AdInternal
    public boolean isValidAdSize(VungleAdSize vungleAdSize) {
        return true;
    }

    @Override // com.vungle.ads.internal.AdInternal
    public boolean isValidAdTypeForPlacement(Placement placement) {
        t.f(placement, "placement");
        return placement.isNative();
    }

    @Override // com.vungle.ads.internal.AdInternal
    public void onAdLoaded$vungle_ads_release(AdPayload advertisement) {
        t.f(advertisement, "advertisement");
        this.nativeAdAssetMap = advertisement.getMRAIDArgsInMap();
        LogEntry logEntry$vungle_ads_release = getLogEntry$vungle_ads_release();
        Long adLoadType$vungle_ads_release = logEntry$vungle_ads_release != null ? logEntry$vungle_ads_release.getAdLoadType$vungle_ads_release() : null;
        if ((adLoadType$vungle_ads_release != null && adLoadType$vungle_ads_release.longValue() == 3) || (adLoadType$vungle_ads_release != null && adLoadType$vungle_ads_release.longValue() == 4)) {
            sendWinURL();
        }
        if (hasVideoContent()) {
            retrieveVideoRatio();
        } else {
            retrieveImageRatio();
        }
    }

    public final void onImpression$vungle_ads_release() {
        trackTpatEvent$default(this, Constants.CHECKPOINT_0, null, 2, null);
        trackOMEvent$default(this, 11, null, 2, null);
    }

    public final void onPrivacyIconClicked() {
        NativeAdPresenter nativeAdPresenter = this.presenter;
        if (nativeAdPresenter != null) {
            NativeAdPresenter.processCommand$default(nativeAdPresenter, "openPrivacy", null, getPrivacyUrl(), 2, null);
        }
    }

    public final void openCallToActionUrl() {
        NativeAdPresenter nativeAdPresenter = this.presenter;
        if (nativeAdPresenter != null) {
            NativeAdPresenter.processCommand$default(nativeAdPresenter, NativeAdPresenter.DOWNLOAD, null, getCtaUrl(), 2, null);
        }
    }

    public final void openCallToActionUrlByUser() {
        trackOMEvent$default(this, 8, null, 2, null);
        openCallToActionUrl();
    }

    public final void setPresenter$vungle_ads_release(NativeAdPresenter nativeAdPresenter) {
        this.presenter = nativeAdPresenter;
    }

    public final void showWatermark(ViewGroup rootView, String str) {
        t.f(rootView, "rootView");
        if (str == null) {
            return;
        }
        if (this.waterMarkView == null) {
            Context context = rootView.getContext();
            t.e(context, "rootView.context");
            this.waterMarkView = new WatermarkView(context, str);
        }
        WatermarkView watermarkView = this.waterMarkView;
        if (watermarkView == null || t.a(watermarkView.getParent(), rootView)) {
            return;
        }
        ViewParent parent = watermarkView.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(watermarkView);
        }
        rootView.addView(watermarkView);
        watermarkView.bringToFront();
    }

    public final void trackOMEvent(int i10, Map<String, ? extends Object> map) {
        NativeAdPresenter nativeAdPresenter = this.presenter;
        if (nativeAdPresenter != null) {
            nativeAdPresenter.onOMEvent(i10, map);
        }
    }

    public final void trackTpatEvent(String event, String str) {
        t.f(event, "event");
        NativeAdPresenter nativeAdPresenter = this.presenter;
        if (nativeAdPresenter != null) {
            nativeAdPresenter.processCommand("tpat", event, str);
        }
    }

    public final void trySetTouchListener(View view) {
        t.f(view, "view");
        AdPayload advertisement = getAdvertisement();
        boolean z10 = false;
        if (advertisement != null && advertisement.isClickCoordinatesTrackingEnabled()) {
            z10 = true;
        }
        if (z10) {
            view.setOnTouchListener(this.onTouchListener);
        }
    }

    public static /* synthetic */ void getPresenter$vungle_ads_release$annotations() {
    }
}
