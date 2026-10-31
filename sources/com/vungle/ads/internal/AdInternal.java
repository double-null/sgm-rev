package com.vungle.ads.internal;

import android.content.Context;
import com.google.android.gms.common.util.cS.EFLCCdIRcb;
import com.vungle.ads.AdExpiredError;
import com.vungle.ads.AdExpiredOnPlayError;
import com.vungle.ads.AdMarkupInvalidError;
import com.vungle.ads.AdMarkupJsonError;
import com.vungle.ads.AdNotLoadedCantPlay;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.EmptyBidPayloadError;
import com.vungle.ads.InvalidAdStateError;
import com.vungle.ads.InvalidBannerSizeError;
import com.vungle.ads.InvalidCSBDataError;
import com.vungle.ads.OneShotTimeIntervalMetric;
import com.vungle.ads.PlacementAdTypeMismatchError;
import com.vungle.ads.PlacementNotFoundError;
import com.vungle.ads.SdkNotInitialized;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.TimeIntervalMetric;
import com.vungle.ads.VungleAdSize;
import com.vungle.ads.VungleAds;
import com.vungle.ads.VungleCSBData;
import com.vungle.ads.VungleError;
import com.vungle.ads.internal.downloader.Downloader;
import com.vungle.ads.internal.executor.SDKExecutors;
import com.vungle.ads.internal.load.AdLoaderCallback;
import com.vungle.ads.internal.load.AdRequest;
import com.vungle.ads.internal.load.BaseAdLoader;
import com.vungle.ads.internal.load.CSBAdLoader;
import com.vungle.ads.internal.load.DefaultAdLoader;
import com.vungle.ads.internal.load.RealtimeAdLoader;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.BidPayload;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.network.TpatRequest;
import com.vungle.ads.internal.network.TpatSender;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.omsdk.OMInjector;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.task.CleanupJob;
import com.vungle.ads.internal.task.JobRunner;
import com.vungle.ads.internal.util.FileUtility;
import com.vungle.ads.internal.util.LogEntry;
import com.vungle.ads.internal.util.Logger;
import com.vungle.ads.internal.util.PathProvider;
import fe.u;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.i0;
import kotlin.jvm.internal.t;
import kotlinx.serialization.json.v;
import wc.k;
import wc.m;
import wc.o;
import wc.p;

/* JADX INFO: compiled from: AdInternal.kt */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AdInternal implements AdLoaderCallback {
    private static final long AD_LOAD_BIDDING = 2;
    public static final long AD_LOAD_POST_BID = 3;
    public static final long AD_LOAD_PRIORITY_ACCESS = 4;
    private static final long AD_LOAD_WATERFALL = 1;
    private static final int CSB_DATA_PHASE_PREBID = 2;
    private static final int MAX_CSB_STRING_LENGTH = 500;
    private static final int MAX_EXTRAS_ENTRIES = 50;
    private static final int MAX_EXTRAS_KEY_LENGTH = 100;
    private static final String TAG = "AdInternal";
    private static final boolean THROW_ON_ILLEGAL_TRANSITION = false;
    private AdLoaderCallback adLoaderCallback;
    private volatile AdState adState;
    private AdPayload advertisement;
    private BaseAdLoader baseAdLoader;
    private BidPayload bidPayload;
    private final Context context;
    private TimeIntervalMetric loadMetric;
    private LogEntry logEntry;
    private final AtomicBoolean lossUrlSent;
    private Placement placement;
    private TimeIntervalMetric requestMetric;
    private final OneShotTimeIntervalMetric showToValidationMetric;
    private final OneShotTimeIntervalMetric validationToPresentMetric;
    private final k vungleApiClient$delegate;
    private final AtomicBoolean winUrlSent;
    public static final Companion Companion = new Companion(null);
    private static final kotlinx.serialization.json.b json = v.b(null, AdInternal$Companion$json$1.INSTANCE, 1, null);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: AdInternal.kt */
    public static final class AdState {
        public static final AdState NEW = new NEW("NEW", 0);
        public static final AdState LOADING = new LOADING("LOADING", 1);
        public static final AdState READY = new READY("READY", 2);
        public static final AdState PLAYING = new PLAYING("PLAYING", 3);
        public static final AdState IMPRESSION_LOGGED = new IMPRESSION_LOGGED("IMPRESSION_LOGGED", 4);
        public static final AdState FINISHED = new FINISHED("FINISHED", 5);
        public static final AdState ERROR = new ERROR("ERROR", 6);
        private static final /* synthetic */ AdState[] $VALUES = $values();

        /* JADX INFO: compiled from: AdInternal.kt */
        static final class ERROR extends AdState {
            ERROR(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.vungle.ads.internal.AdInternal.AdState
            public boolean canTransitionTo(AdState adState) {
                t.f(adState, "adState");
                return adState == AdState.FINISHED;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "failed";
            }
        }

        /* JADX INFO: compiled from: AdInternal.kt */
        static final class FINISHED extends AdState {
            FINISHED(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.vungle.ads.internal.AdInternal.AdState
            public boolean canTransitionTo(AdState adState) {
                t.f(adState, "adState");
                return false;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "completed";
            }
        }

        /* JADX INFO: compiled from: AdInternal.kt */
        static final class IMPRESSION_LOGGED extends AdState {
            IMPRESSION_LOGGED(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.vungle.ads.internal.AdInternal.AdState
            public boolean canTransitionTo(AdState adState) {
                t.f(adState, "adState");
                return adState == AdState.FINISHED || adState == AdState.ERROR || adState == AdState.READY;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "impressionLogged";
            }
        }

        /* JADX INFO: compiled from: AdInternal.kt */
        static final class LOADING extends AdState {
            LOADING(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.vungle.ads.internal.AdInternal.AdState
            public boolean canTransitionTo(AdState adState) {
                t.f(adState, "adState");
                return adState == AdState.READY || adState == AdState.ERROR;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "loading";
            }
        }

        /* JADX INFO: compiled from: AdInternal.kt */
        static final class NEW extends AdState {
            NEW(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.vungle.ads.internal.AdInternal.AdState
            public boolean canTransitionTo(AdState adState) {
                t.f(adState, "adState");
                return adState == AdState.LOADING || adState == AdState.READY || adState == AdState.ERROR;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "idle";
            }
        }

        /* JADX INFO: compiled from: AdInternal.kt */
        static final class PLAYING extends AdState {
            PLAYING(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.vungle.ads.internal.AdInternal.AdState
            public boolean canTransitionTo(AdState adState) {
                t.f(adState, "adState");
                return adState == AdState.IMPRESSION_LOGGED || adState == AdState.FINISHED || adState == AdState.ERROR || adState == AdState.READY;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "playing";
            }
        }

        /* JADX INFO: compiled from: AdInternal.kt */
        static final class READY extends AdState {
            READY(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.vungle.ads.internal.AdInternal.AdState
            public boolean canTransitionTo(AdState adState) {
                t.f(adState, "adState");
                return adState == AdState.PLAYING || adState == AdState.FINISHED || adState == AdState.ERROR;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "ready";
            }
        }

        private static final /* synthetic */ AdState[] $values() {
            return new AdState[]{NEW, LOADING, READY, PLAYING, IMPRESSION_LOGGED, FINISHED, ERROR};
        }

        public /* synthetic */ AdState(String str, int i10, kotlin.jvm.internal.k kVar) {
            this(str, i10);
        }

        public static AdState valueOf(String str) {
            return (AdState) Enum.valueOf(AdState.class, str);
        }

        public static AdState[] values() {
            return (AdState[]) $VALUES.clone();
        }

        public abstract boolean canTransitionTo(AdState adState);

        public final boolean isTerminalState() {
            return kotlin.collections.t.n(FINISHED, ERROR).contains(this);
        }

        public final AdState transitionTo(AdState adState) {
            t.f(adState, "adState");
            if (this != adState && !canTransitionTo(adState)) {
                String str = "Cannot transition from " + name() + " to " + adState.name();
                if (AdInternal.THROW_ON_ILLEGAL_TRANSITION) {
                    throw new IllegalStateException(str);
                }
                Logger.Companion.e(AdInternal.TAG, "Illegal state transition", new IllegalStateException(str));
            }
            return adState;
        }

        private AdState(String str, int i10) {
            super(str, i10);
        }
    }

    /* JADX INFO: compiled from: AdInternal.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AdState.values().length];
            iArr[AdState.NEW.ordinal()] = 1;
            iArr[AdState.LOADING.ordinal()] = 2;
            iArr[AdState.READY.ordinal()] = 3;
            iArr[AdState.PLAYING.ordinal()] = 4;
            iArr[AdState.IMPRESSION_LOGGED.ordinal()] = 5;
            iArr[AdState.FINISHED.ordinal()] = 6;
            iArr[AdState.ERROR.ordinal()] = 7;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AdInternal(Context context) {
        t.f(context, "context");
        this.context = context;
        this.adState = AdState.NEW;
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        this.vungleApiClient$delegate = m.b(o.SYNCHRONIZED, new AdInternal$special$$inlined$inject$1(context));
        this.showToValidationMetric = new OneShotTimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS);
        this.validationToPresentMetric = new OneShotTimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.AD_VALIDATION_TO_PRESENT_DURATION_MS);
        this.winUrlSent = new AtomicBoolean(false);
        this.lossUrlSent = new AtomicBoolean(false);
    }

    /* JADX INFO: renamed from: _set_adState_$lambda-1$lambda-0, reason: not valid java name */
    private static final JobRunner m226_set_adState_$lambda1$lambda0(k<? extends JobRunner> kVar) {
        return kVar.getValue();
    }

    public static /* synthetic */ VungleError canPlayAd$default(AdInternal adInternal, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: canPlayAd");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return adInternal.canPlayAd(z10);
    }

    private final VungleApiClient getVungleApiClient() {
        return (VungleApiClient) this.vungleApiClient$delegate.getValue();
    }

    public static /* synthetic */ void loadAd$default(AdInternal adInternal, String str, String str2, VungleCSBData vungleCSBData, AdLoaderCallback adLoaderCallback, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadAd");
        }
        if ((i10 & 4) != 0) {
            vungleCSBData = null;
        }
        adInternal.loadAd(str, str2, vungleCSBData, adLoaderCallback);
    }

    /* JADX INFO: renamed from: loadAd$lambda-2, reason: not valid java name */
    private static final OMInjector m227loadAd$lambda2(k<OMInjector> kVar) {
        return kVar.getValue();
    }

    /* JADX INFO: renamed from: loadAd$lambda-3, reason: not valid java name */
    private static final SDKExecutors m228loadAd$lambda3(k<SDKExecutors> kVar) {
        return kVar.getValue();
    }

    /* JADX INFO: renamed from: loadAd$lambda-4, reason: not valid java name */
    private static final PathProvider m229loadAd$lambda4(k<PathProvider> kVar) {
        return kVar.getValue();
    }

    /* JADX INFO: renamed from: loadAd$lambda-5, reason: not valid java name */
    private static final Downloader m230loadAd$lambda5(k<? extends Downloader> kVar) {
        return kVar.getValue();
    }

    /* JADX INFO: renamed from: onSuccess$lambda-9$lambda-7, reason: not valid java name */
    private static final TpatSender m231onSuccess$lambda9$lambda7(k<TpatSender> kVar) {
        return kVar.getValue();
    }

    /* JADX INFO: renamed from: sendLossURL$lambda-13, reason: not valid java name */
    private static final TpatSender m232sendLossURL$lambda13(k<TpatSender> kVar) {
        return kVar.getValue();
    }

    /* JADX INFO: renamed from: sendWinURL$lambda-11, reason: not valid java name */
    private static final TpatSender m233sendWinURL$lambda11(k<TpatSender> kVar) {
        return kVar.getValue();
    }

    private final VungleError validateBidFloor(double d10) {
        if (d10 >= 0.0d) {
            return null;
        }
        return new InvalidCSBDataError("bidFloor must be >= 0, got: " + d10);
    }

    private final VungleError validateCSBData(VungleCSBData vungleCSBData) {
        VungleError vungleErrorValidateBidFloor = validateBidFloor(vungleCSBData.getBidFloor());
        if (vungleErrorValidateBidFloor != null) {
            return vungleErrorValidateBidFloor;
        }
        VungleError vungleErrorValidatePhase = validatePhase(vungleCSBData.getPhase());
        if (vungleErrorValidatePhase != null) {
            return vungleErrorValidatePhase;
        }
        VungleError vungleErrorValidateStringFields = validateStringFields(vungleCSBData);
        return vungleErrorValidateStringFields == null ? validateExtras(vungleCSBData.getExtras()) : vungleErrorValidateStringFields;
    }

    private final VungleError validateExtras(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        if (map.size() <= 50) {
            return validateExtrasEntries(map);
        }
        return new InvalidCSBDataError("extras map exceeds maximum of 50 entries, got: " + map.size());
    }

    private final VungleError validateExtrasEntries(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key.length() == 0) {
                return new InvalidCSBDataError("extras contains empty key");
            }
            if (key.length() > 100) {
                return new InvalidCSBDataError("extras key exceeds maximum length of 100: " + key);
            }
            if (value.length() > 500) {
                return new InvalidCSBDataError("extras value for key '" + key + "' exceeds maximum length of 500");
            }
        }
        return null;
    }

    private final VungleError validatePhase(int i10) {
        boolean z10 = false;
        if (1 <= i10 && i10 < 3) {
            z10 = true;
        }
        if (z10) {
            return null;
        }
        return new InvalidCSBDataError("phase must be 1 or 2, got: " + i10);
    }

    private final VungleError validateStringFields(VungleCSBData vungleCSBData) {
        VungleError vungleErrorValidateStringLength = validateStringLength(vungleCSBData.getAuctionId(), 500, "auctionId");
        if (vungleErrorValidateStringLength != null) {
            return vungleErrorValidateStringLength;
        }
        VungleError vungleErrorValidateStringLength2 = validateStringLength(vungleCSBData.getCreativeId(), 500, "creativeId");
        return vungleErrorValidateStringLength2 == null ? validateStringLength(vungleCSBData.getAdUnitId(), 500, "adUnitId") : vungleErrorValidateStringLength2;
    }

    private final VungleError validateStringLength(String str, int i10, String str2) {
        if (str.length() <= i10) {
            return null;
        }
        return new InvalidCSBDataError(str2 + " exceeds maximum length of " + i10);
    }

    public void adLoadedAndUpdateConfigure$vungle_ads_release(AdPayload advertisement) {
        t.f(advertisement, "advertisement");
    }

    public final void cancelDownload$vungle_ads_release() {
        AdPayload adPayload = this.advertisement;
        boolean z10 = false;
        if (adPayload != null && adPayload.isPartialDownloadEnabled()) {
            z10 = true;
        }
        if (z10) {
            Logger.Companion.d(TAG, "Skip cancelling download for ads with partial download enabled.");
            return;
        }
        BaseAdLoader baseAdLoader = this.baseAdLoader;
        if (baseAdLoader != null) {
            baseAdLoader.cancel();
        }
    }

    public abstract VungleAdSize getAdSizeForAdRequest();

    public final AdState getAdState() {
        return this.adState;
    }

    public final AdPayload getAdvertisement() {
        return this.advertisement;
    }

    public final Context getContext() {
        return this.context;
    }

    public final LogEntry getLogEntry$vungle_ads_release() {
        return this.logEntry;
    }

    public final Placement getPlacement() {
        return this.placement;
    }

    public final OneShotTimeIntervalMetric getShowToValidationMetric$vungle_ads_release() {
        return this.showToValidationMetric;
    }

    public final OneShotTimeIntervalMetric getValidationToPresentMetric$vungle_ads_release() {
        return this.validationToPresentMetric;
    }

    public final boolean isAdPlaying$vungle_ads_release() {
        return this.adState == AdState.PLAYING || this.adState == AdState.IMPRESSION_LOGGED;
    }

    public VungleError isAdStateValidOnCanPlay() {
        if (this.adState == AdState.PLAYING) {
            return new InvalidAdStateError(Sdk.SDKError.Reason.AD_IS_PLAYING, "Current ad is playing");
        }
        if (this.adState == AdState.IMPRESSION_LOGGED) {
            return new InvalidAdStateError(Sdk.SDKError.Reason.AD_IS_PLAYING, "Current ad is playing, impression logged");
        }
        if (this.adState == AdState.READY) {
            return null;
        }
        return new InvalidAdStateError(Sdk.SDKError.Reason.AD_NOT_LOADED, this.adState + " is not READY");
    }

    public final boolean isErrorTerminal$vungle_ads_release(int i10) {
        return this.adState == AdState.READY && i10 == 304;
    }

    public abstract boolean isValidAdSize(VungleAdSize vungleAdSize);

    public abstract boolean isValidAdTypeForPlacement(Placement placement);

    /* JADX WARN: Multi-variable type inference failed */
    public final void loadAd(String placementId, String str, VungleCSBData vungleCSBData, AdLoaderCallback adLoaderCallback) {
        Sdk.SDKError.Reason reason;
        t.f(placementId, "placementId");
        t.f(adLoaderCallback, "adLoaderCallback");
        LogEntry logEntry = this.logEntry;
        if (logEntry != null) {
            logEntry.setAdState$vungle_ads_release(this.adState);
        }
        AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, Sdk.SDKMetric.SDKMetricType.LOAD_AD_API, 0L, this.logEntry, null, 10, null);
        TimeIntervalMetric timeIntervalMetric = new TimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.AD_LOAD_TO_CALLBACK_ADO_DURATION_MS);
        this.loadMetric = timeIntervalMetric;
        timeIntervalMetric.markStart();
        this.adLoaderCallback = adLoaderCallback;
        if (!VungleAds.Companion.isInitialized()) {
            adLoaderCallback.onFailure(new SdkNotInitialized("SDK not initialized").setLogEntry$vungle_ads_release(this.logEntry).logError$vungle_ads_release());
            return;
        }
        ConfigManager configManager = ConfigManager.INSTANCE;
        Placement placement = configManager.getPlacement(placementId);
        int i10 = 1;
        if (placement != null) {
            this.placement = placement;
            if (!isValidAdTypeForPlacement(placement)) {
                adLoaderCallback.onFailure(new PlacementAdTypeMismatchError(placement.getReferenceId()).setLogEntry$vungle_ads_release(this.logEntry).logError$vungle_ads_release());
                return;
            } else if (placement.getHeaderBidding()) {
                if ((str == null || str.length() == 0) != false) {
                    adLoaderCallback.onFailure(new EmptyBidPayloadError(placementId).setLogEntry$vungle_ads_release(this.logEntry).logError$vungle_ads_release());
                    return;
                }
            }
        } else if (configManager.configLastValidatedTimestamp() != -1) {
            adLoaderCallback.onFailure(new PlacementNotFoundError(placementId).setLogEntry$vungle_ads_release(this.logEntry).logError$vungle_ads_release());
            return;
        } else {
            Placement placement2 = new Placement(placementId, false, (String) null, 6, (kotlin.jvm.internal.k) null);
            this.placement = placement2;
            placement = placement2;
        }
        VungleAdSize adSizeForAdRequest = getAdSizeForAdRequest();
        if (!isValidAdSize(adSizeForAdRequest)) {
            adLoaderCallback.onFailure(new InvalidBannerSizeError(adSizeForAdRequest != null ? adSizeForAdRequest.toString() : null).setLogEntry$vungle_ads_release(this.logEntry).logError$vungle_ads_release());
            return;
        }
        if (this.adState != AdState.NEW) {
            switch (WhenMappings.$EnumSwitchMapping$0[this.adState.ordinal()]) {
                case 1:
                    throw new p(null == true ? 1 : 0, i10, null == true ? 1 : 0);
                case 2:
                    reason = Sdk.SDKError.Reason.AD_IS_LOADING;
                    break;
                case 3:
                    reason = Sdk.SDKError.Reason.AD_ALREADY_LOADED;
                    break;
                case 4:
                    reason = Sdk.SDKError.Reason.AD_IS_PLAYING;
                    break;
                case 5:
                    reason = Sdk.SDKError.Reason.AD_IS_PLAYING;
                    break;
                case 6:
                    reason = Sdk.SDKError.Reason.AD_CONSUMED;
                    break;
                case 7:
                    reason = Sdk.SDKError.Reason.AD_ALREADY_FAILED;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            adLoaderCallback.onFailure(new InvalidAdStateError(reason, this.adState + " state is incorrect for load").setLogEntry$vungle_ads_release(this.logEntry).logError$vungle_ads_release());
            return;
        }
        TimeIntervalMetric timeIntervalMetric2 = new TimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.AD_REQUEST_TO_CALLBACK_ADO_DURATION_MS);
        this.requestMetric = timeIntervalMetric2;
        timeIntervalMetric2.markStart();
        if ((str == null || str.length() == 0) == false) {
            try {
                kotlinx.serialization.json.b bVar = json;
                fe.d<Object> dVarB = u.b(bVar.a(), i0.j(BidPayload.class));
                t.d(dVarB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                this.bidPayload = (BidPayload) bVar.c(dVarB, str);
            } catch (IllegalArgumentException e10) {
                adLoaderCallback.onFailure(new AdMarkupInvalidError("Unable to decode payload into BidPayload object. Error: " + e10.getLocalizedMessage()).setLogEntry$vungle_ads_release(this.logEntry).logError$vungle_ads_release());
                return;
            } catch (Throwable th) {
                adLoaderCallback.onFailure(new AdMarkupJsonError(th.getLocalizedMessage()).setLogEntry$vungle_ads_release(this.logEntry).logError$vungle_ads_release());
                return;
            }
        }
        setAdState(AdState.LOADING);
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        Context context = this.context;
        o oVar = o.SYNCHRONIZED;
        k kVarB = m.b(oVar, new AdInternal$loadAd$$inlined$inject$1(context));
        k kVarB2 = m.b(oVar, new AdInternal$loadAd$$inlined$inject$2(this.context));
        k kVarB3 = m.b(oVar, new AdInternal$loadAd$$inlined$inject$3(this.context));
        k kVarB4 = m.b(oVar, new AdInternal$loadAd$$inlined$inject$4(this.context));
        if (vungleCSBData != null) {
            VungleError vungleErrorValidateCSBData = validateCSBData(vungleCSBData);
            if (vungleErrorValidateCSBData != null) {
                adLoaderCallback.onFailure(vungleErrorValidateCSBData.setLogEntry$vungle_ads_release(this.logEntry).logError$vungle_ads_release());
                return;
            }
            LogEntry logEntry2 = this.logEntry;
            if (logEntry2 != null) {
                logEntry2.setAdLoadType$vungle_ads_release(vungleCSBData.getPhase() == 2 ? 4L : 3L);
            }
            this.baseAdLoader = new CSBAdLoader(this.context, getVungleApiClient(), m228loadAd$lambda3(kVarB2), m227loadAd$lambda2(kVarB), m230loadAd$lambda5(kVarB4), m229loadAd$lambda4(kVarB3), new AdRequest(placement, null, adSizeForAdRequest, vungleCSBData));
        } else {
            if (str == null || str.length() == 0) {
                LogEntry logEntry3 = this.logEntry;
                if (logEntry3 != null) {
                    logEntry3.setAdLoadType$vungle_ads_release(1L);
                }
                this.baseAdLoader = new DefaultAdLoader(this.context, getVungleApiClient(), m228loadAd$lambda3(kVarB2), m227loadAd$lambda2(kVarB), m230loadAd$lambda5(kVarB4), m229loadAd$lambda4(kVarB3), new AdRequest(placement, null, adSizeForAdRequest, null));
            } else {
                LogEntry logEntry4 = this.logEntry;
                if (logEntry4 != null) {
                    logEntry4.setAdLoadType$vungle_ads_release(2L);
                }
                this.baseAdLoader = new RealtimeAdLoader(this.context, getVungleApiClient(), m228loadAd$lambda3(kVarB2), m227loadAd$lambda2(kVarB), m230loadAd$lambda5(kVarB4), m229loadAd$lambda4(kVarB3), new AdRequest(placement, this.bidPayload, adSizeForAdRequest, null));
            }
        }
        BaseAdLoader baseAdLoader = this.baseAdLoader;
        if (baseAdLoader != null) {
            baseAdLoader.setLogEntry$vungle_ads_release(this.logEntry);
        }
        BaseAdLoader baseAdLoader2 = this.baseAdLoader;
        if (baseAdLoader2 != null) {
            baseAdLoader2.loadAd(this);
        }
    }

    public void onAdLoaded$vungle_ads_release(AdPayload advertisement) {
        t.f(advertisement, "advertisement");
    }

    @Override // com.vungle.ads.internal.load.AdLoaderCallback
    public void onFailure(VungleError error) {
        t.f(error, "error");
        setAdState(AdState.ERROR);
        TimeIntervalMetric timeIntervalMetric = this.loadMetric;
        if (timeIntervalMetric != null) {
            timeIntervalMetric.setMetricType(Sdk.SDKMetric.SDKMetricType.AD_LOAD_TO_FAIL_CALLBACK_DURATION_MS);
            timeIntervalMetric.markEnd();
            AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(timeIntervalMetric, this.logEntry, error.getCode() + '-' + error.getErrorMessage());
        }
        AdLoaderCallback adLoaderCallback = this.adLoaderCallback;
        if (adLoaderCallback != null) {
            adLoaderCallback.onFailure(error);
        }
    }

    @Override // com.vungle.ads.internal.load.AdLoaderCallback
    public void onSuccess(AdPayload advertisement) {
        t.f(advertisement, "advertisement");
        this.advertisement = advertisement;
        setAdState(AdState.READY);
        adLoadedAndUpdateConfigure$vungle_ads_release(advertisement);
        onAdLoaded$vungle_ads_release(advertisement);
        AdLoaderCallback adLoaderCallback = this.adLoaderCallback;
        if (adLoaderCallback != null) {
            adLoaderCallback.onSuccess(advertisement);
        }
        TimeIntervalMetric timeIntervalMetric = this.loadMetric;
        if (timeIntervalMetric != null) {
            if (!advertisement.adLoadOptimizationEnabled()) {
                timeIntervalMetric.setMetricType(Sdk.SDKMetric.SDKMetricType.AD_LOAD_TO_CALLBACK_DURATION_MS);
            }
            timeIntervalMetric.markEnd();
            AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, timeIntervalMetric, this.logEntry, (String) null, 4, (Object) null);
        }
        TimeIntervalMetric timeIntervalMetric2 = this.requestMetric;
        if (timeIntervalMetric2 != null) {
            if (!advertisement.adLoadOptimizationEnabled()) {
                timeIntervalMetric2.setMetricType(Sdk.SDKMetric.SDKMetricType.AD_REQUEST_TO_CALLBACK_DURATION_MS);
            }
            timeIntervalMetric2.markEnd();
            AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, timeIntervalMetric2, this.logEntry, (String) null, 4, (Object) null);
            ServiceLocator.Companion companion = ServiceLocator.Companion;
            k kVarB = m.b(o.SYNCHRONIZED, new AdInternal$onSuccess$lambda9$$inlined$inject$1(this.context));
            List tpatUrls$default = AdPayload.getTpatUrls$default(advertisement, Constants.AD_LOAD_DURATION, String.valueOf(timeIntervalMetric2.getValue()), null, 4, null);
            if (tpatUrls$default != null) {
                Iterator it = tpatUrls$default.iterator();
                while (it.hasNext()) {
                    TpatSender.sendTpat$default(m231onSuccess$lambda9$lambda7(kVarB), new TpatRequest.Builder((String) it.next()).tpatKey(Constants.AD_LOAD_DURATION).withLogEntry(this.logEntry).build(), false, 2, null);
                }
            }
        }
    }

    public final void sendLossURL() {
        List<String> lossUrls;
        if (!this.lossUrlSent.compareAndSet(false, true)) {
            Logger.Companion.d(TAG, "Loss URL already sent, skipping");
            return;
        }
        AdPayload adPayload = this.advertisement;
        if (adPayload == null || (lossUrls = adPayload.getLossUrls()) == null) {
            return;
        }
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        k kVarB = m.b(o.SYNCHRONIZED, new AdInternal$sendLossURL$$inlined$inject$1(this.context));
        for (String str : lossUrls) {
            if (FileUtility.INSTANCE.isValidUrl(str)) {
                TpatSender.sendTpat$default(m232sendLossURL$lambda13(kVarB), new TpatRequest.Builder(str).priorityRetry(true).build(), false, 2, null);
            } else {
                Logger.Companion.w(TAG, "Invalid loss URL skipped: " + str);
            }
        }
    }

    public final void sendWinURL() {
        List<String> winUrls;
        if (!this.winUrlSent.compareAndSet(false, true)) {
            Logger.Companion.d(TAG, "Win URL already sent, skipping");
            return;
        }
        AdPayload adPayload = this.advertisement;
        if (adPayload == null || (winUrls = adPayload.getWinUrls()) == null) {
            return;
        }
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        k kVarB = m.b(o.SYNCHRONIZED, new AdInternal$sendWinURL$$inlined$inject$1(this.context));
        for (String str : winUrls) {
            if (FileUtility.INSTANCE.isValidUrl(str)) {
                TpatSender.sendTpat$default(m233sendWinURL$lambda11(kVarB), new TpatRequest.Builder(str).priorityRetry(true).build(), false, 2, null);
            } else {
                Logger.Companion.w(TAG, "Invalid win URL skipped: " + str);
            }
        }
    }

    public final void setAdState(AdState value) {
        AdPayload adPayload;
        String strEventId;
        t.f(value, "value");
        if (value.isTerminalState() && (adPayload = this.advertisement) != null && (strEventId = adPayload.eventId()) != null) {
            ServiceLocator.Companion companion = ServiceLocator.Companion;
            m226_set_adState_$lambda1$lambda0(m.b(o.SYNCHRONIZED, new AdInternal$_set_adState_$lambda1$$inlined$inject$1(this.context))).execute(CleanupJob.Companion.makeJobInfo(strEventId));
        }
        this.adState = this.adState.transitionTo(value);
        LogEntry logEntry = this.logEntry;
        if (logEntry == null) {
            return;
        }
        logEntry.setAdState$vungle_ads_release(this.adState);
    }

    public final void setAdvertisement(AdPayload adPayload) {
        this.advertisement = adPayload;
    }

    public final void setLogEntry$vungle_ads_release(LogEntry logEntry) {
        this.logEntry = logEntry;
    }

    public final void setPlacement(Placement placement) {
        this.placement = placement;
    }

    public final VungleError canPlayAd(boolean z10) {
        VungleError adExpiredError;
        AdPayload.AdUnit adUnit;
        VungleError vungleErrorIsAdStateValidOnCanPlay = isAdStateValidOnCanPlay();
        AdPayload adPayload = this.advertisement;
        if (adPayload == null) {
            vungleErrorIsAdStateValidOnCanPlay = new AdNotLoadedCantPlay(EFLCCdIRcb.OFeGriNLlRYQ + z10);
        } else if (vungleErrorIsAdStateValidOnCanPlay == null) {
            boolean z11 = false;
            if (adPayload != null && adPayload.hasExpired()) {
                z11 = true;
            }
            Integer expiry = null;
            if (!z11) {
                return null;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Ad expiry: ");
            AdPayload adPayload2 = this.advertisement;
            if (adPayload2 != null && (adUnit = adPayload2.adUnit()) != null) {
                expiry = adUnit.getExpiry();
            }
            sb2.append(expiry);
            sb2.append(", device: ");
            sb2.append(System.currentTimeMillis());
            String string = sb2.toString();
            if (z10) {
                adExpiredError = new AdExpiredOnPlayError(string);
            } else {
                adExpiredError = new AdExpiredError(string);
            }
            vungleErrorIsAdStateValidOnCanPlay = adExpiredError;
        }
        if (z10) {
            vungleErrorIsAdStateValidOnCanPlay.setLogEntry$vungle_ads_release(this.logEntry).logErrorNoReturnValue$vungle_ads_release();
        }
        return vungleErrorIsAdStateValidOnCanPlay;
    }

    /* JADX INFO: compiled from: AdInternal.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }

        private static /* synthetic */ void getJson$annotations() {
        }
    }
}
