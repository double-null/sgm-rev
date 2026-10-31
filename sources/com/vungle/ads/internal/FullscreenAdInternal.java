package com.vungle.ads.internal;

import android.content.Context;
import android.content.Intent;
import com.vungle.ads.AdNotLoadedCantPlay;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.SingleValueMetric;
import com.vungle.ads.VungleAdSize;
import com.vungle.ads.VungleError;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.presenter.AdEventListener;
import com.vungle.ads.internal.presenter.AdPlayCallback;
import com.vungle.ads.internal.presenter.AdPlayCallbackWrapper;
import com.vungle.ads.internal.presenter.PresenterDelegate;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.ui.AdActivity;
import com.vungle.ads.internal.util.ActivityManager;
import com.vungle.ads.internal.util.LogEntry;
import com.vungle.ads.internal.util.Logger;
import com.vungle.ads.internal.util.ThreadUtil;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import wc.g0;

/* JADX INFO: compiled from: FullscreenAdInternal.kt */
/* JADX INFO: loaded from: classes4.dex */
public abstract class FullscreenAdInternal extends AdInternal {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "FullscreenAdInternal";
    private WeakReference<Context> playContext;

    /* JADX INFO: compiled from: FullscreenAdInternal.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: FullscreenAdInternal.kt */
    public static final class PendingData {
        private final AdPayload adPayload;
        private final Placement placement;
        private final PresenterDelegate presenterDelegate;

        public PendingData(AdPayload adPayload, Placement placement, PresenterDelegate presenterDelegate) {
            t.f(adPayload, "adPayload");
            t.f(placement, "placement");
            this.adPayload = adPayload;
            this.placement = placement;
            this.presenterDelegate = presenterDelegate;
        }

        public static /* synthetic */ PendingData copy$default(PendingData pendingData, AdPayload adPayload, Placement placement, PresenterDelegate presenterDelegate, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                adPayload = pendingData.adPayload;
            }
            if ((i10 & 2) != 0) {
                placement = pendingData.placement;
            }
            if ((i10 & 4) != 0) {
                presenterDelegate = pendingData.presenterDelegate;
            }
            return pendingData.copy(adPayload, placement, presenterDelegate);
        }

        public final AdPayload component1() {
            return this.adPayload;
        }

        public final Placement component2() {
            return this.placement;
        }

        public final PresenterDelegate component3() {
            return this.presenterDelegate;
        }

        public final PendingData copy(AdPayload adPayload, Placement placement, PresenterDelegate presenterDelegate) {
            t.f(adPayload, "adPayload");
            t.f(placement, "placement");
            return new PendingData(adPayload, placement, presenterDelegate);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PendingData)) {
                return false;
            }
            PendingData pendingData = (PendingData) obj;
            return t.a(this.adPayload, pendingData.adPayload) && t.a(this.placement, pendingData.placement) && t.a(this.presenterDelegate, pendingData.presenterDelegate);
        }

        public final AdPayload getAdPayload() {
            return this.adPayload;
        }

        public final Placement getPlacement() {
            return this.placement;
        }

        public final PresenterDelegate getPresenterDelegate() {
            return this.presenterDelegate;
        }

        public int hashCode() {
            int iHashCode = ((this.adPayload.hashCode() * 31) + this.placement.hashCode()) * 31;
            PresenterDelegate presenterDelegate = this.presenterDelegate;
            return iHashCode + (presenterDelegate == null ? 0 : presenterDelegate.hashCode());
        }

        public String toString() {
            return "PendingData(adPayload=" + this.adPayload + ", placement=" + this.placement + ", presenterDelegate=" + this.presenterDelegate + ')';
        }
    }

    /* JADX INFO: renamed from: com.vungle.ads.internal.FullscreenAdInternal$play$1, reason: invalid class name */
    /* JADX INFO: compiled from: FullscreenAdInternal.kt */
    static final class AnonymousClass1 extends u implements id.a<g0> {
        final /* synthetic */ AdPayload $adv;
        final /* synthetic */ FullscreenAdInternal$play$callbackWrapper$1 $callbackWrapper;
        final /* synthetic */ Placement $pl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(FullscreenAdInternal$play$callbackWrapper$1 fullscreenAdInternal$play$callbackWrapper$1, AdPayload adPayload, Placement placement) {
            super(0);
            this.$callbackWrapper = fullscreenAdInternal$play$callbackWrapper$1;
            this.$adv = adPayload;
            this.$pl = placement;
        }

        @Override // id.a
        public /* bridge */ /* synthetic */ g0 invoke() {
            invoke2();
            return g0.f27756a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            FullscreenAdInternal.this.renderAd(this.$callbackWrapper, this.$adv, this.$pl);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullscreenAdInternal(Context context) {
        super(context);
        t.f(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderAd(AdPlayCallback adPlayCallback, AdPayload adPayload, Placement placement) {
        Context context;
        WeakReference<Context> weakReference = this.playContext;
        if (weakReference == null || (context = weakReference.get()) == null) {
            context = getContext();
        }
        t.e(context, "playContext?.get() ?: context");
        AdEventListener adEventListener = new AdEventListener(adPlayCallback, placement);
        PendingData pendingData = new PendingData(adPayload, placement, getPresenterDelegate());
        AdActivity.Companion companion = AdActivity.Companion;
        companion.setPendingData$vungle_ads_release(pendingData);
        companion.setEventListener$vungle_ads_release(adEventListener);
        Intent intentCreateIntent = companion.createIntent(context, placement.getReferenceId(), adPayload.eventId());
        ActivityManager.Companion companion2 = ActivityManager.Companion;
        if (!companion2.isForeground()) {
            Logger.Companion.d(TAG, "The ad activity is in background on play, log AD_VISIBILITY_INVISIBLE.");
            intentCreateIntent.putExtra(AdActivity.AD_INVISIBLE_LOGGED_KEY, true);
            AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
            SingleValueMetric singleValueMetric = new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.AD_VISIBILITY);
            singleValueMetric.setValue(1L);
            AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, singleValueMetric, getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
        }
        getShowToValidationMetric$vungle_ads_release().markEnd();
        AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, getShowToValidationMetric$vungle_ads_release(), getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
        getValidationToPresentMetric$vungle_ads_release().markStart();
        companion2.startWhenForeground(context, null, intentCreateIntent, null);
    }

    @Override // com.vungle.ads.internal.AdInternal
    public VungleAdSize getAdSizeForAdRequest() {
        return null;
    }

    public PresenterDelegate getPresenterDelegate() {
        return null;
    }

    @Override // com.vungle.ads.internal.AdInternal
    public boolean isValidAdSize(VungleAdSize vungleAdSize) {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003d  */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.vungle.ads.internal.FullscreenAdInternal$play$callbackWrapper$1] */
    public final void play(Context context, final AdPlayCallback adPlayCallback) {
        Long adLoadType$vungle_ads_release;
        Long adLoadType$vungle_ads_release2;
        t.f(adPlayCallback, "adPlayCallback");
        LogEntry logEntry$vungle_ads_release = getLogEntry$vungle_ads_release();
        boolean z10 = false;
        if ((logEntry$vungle_ads_release == null || (adLoadType$vungle_ads_release2 = logEntry$vungle_ads_release.getAdLoadType$vungle_ads_release()) == null || adLoadType$vungle_ads_release2.longValue() != 3) ? false : true) {
            sendWinURL();
        } else {
            LogEntry logEntry$vungle_ads_release2 = getLogEntry$vungle_ads_release();
            if (logEntry$vungle_ads_release2 != null && (adLoadType$vungle_ads_release = logEntry$vungle_ads_release2.getAdLoadType$vungle_ads_release()) != null && adLoadType$vungle_ads_release.longValue() == 4) {
                z10 = true;
            }
            if (z10) {
                sendWinURL();
            }
        }
        getShowToValidationMetric$vungle_ads_release().markStart();
        this.playContext = context != null ? new WeakReference<>(context) : null;
        VungleError vungleErrorCanPlayAd = canPlayAd(true);
        if (vungleErrorCanPlayAd != null) {
            adPlayCallback.onFailure(vungleErrorCanPlayAd);
            if (isErrorTerminal$vungle_ads_release(vungleErrorCanPlayAd.getCode())) {
                setAdState(AdInternal.AdState.ERROR);
                return;
            }
            return;
        }
        AdPayload advertisement = getAdvertisement();
        Placement placement = getPlacement();
        if (advertisement != null && placement != null) {
            ?? r10 = new AdPlayCallbackWrapper(adPlayCallback) { // from class: com.vungle.ads.internal.FullscreenAdInternal$play$callbackWrapper$1
                @Override // com.vungle.ads.internal.presenter.AdPlayCallbackWrapper, com.vungle.ads.internal.presenter.AdPlayCallback
                public void onAdEnd(String str) {
                    this.setAdState(AdInternal.AdState.FINISHED);
                    super.onAdEnd(str);
                }

                @Override // com.vungle.ads.internal.presenter.AdPlayCallbackWrapper, com.vungle.ads.internal.presenter.AdPlayCallback
                public void onAdImpression(String str) {
                    this.setAdState(AdInternal.AdState.IMPRESSION_LOGGED);
                    super.onAdImpression(str);
                }

                @Override // com.vungle.ads.internal.presenter.AdPlayCallbackWrapper, com.vungle.ads.internal.presenter.AdPlayCallback
                public void onAdStart(String str) {
                    this.setAdState(AdInternal.AdState.PLAYING);
                    this.getValidationToPresentMetric$vungle_ads_release().markEnd();
                    AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.getValidationToPresentMetric$vungle_ads_release(), this.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
                    super.onAdStart(str);
                }

                @Override // com.vungle.ads.internal.presenter.AdPlayCallbackWrapper, com.vungle.ads.internal.presenter.AdPlayCallback
                public void onFailure(VungleError error) {
                    t.f(error, "error");
                    this.setAdState(AdInternal.AdState.ERROR);
                    super.onFailure(error);
                }
            };
            cancelDownload$vungle_ads_release();
            ThreadUtil.INSTANCE.runOnUiThread(new AnonymousClass1(r10, advertisement, placement));
        } else {
            adPlayCallback.onFailure(new AdNotLoadedCantPlay("Ad or Placement is null: pl=" + placement + " adv=" + advertisement).setLogEntry$vungle_ads_release(getLogEntry$vungle_ads_release()).logError$vungle_ads_release());
        }
    }
}
