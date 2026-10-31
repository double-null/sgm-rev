package com.vungle.ads.internal.load;

import android.content.Context;
import com.vungle.ads.AdExpiredError;
import com.vungle.ads.AdPayloadError;
import com.vungle.ads.AdResponseEmptyError;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.AssetWriteError;
import com.vungle.ads.InvalidAssetUrlError;
import com.vungle.ads.InvalidEventIdError;
import com.vungle.ads.InvalidTemplateURLError;
import com.vungle.ads.NativeAssetError;
import com.vungle.ads.OmSdkJsError;
import com.vungle.ads.PlacementMismatchError;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.SingleValueMetric;
import com.vungle.ads.TimeIntervalMetric;
import com.vungle.ads.VungleError;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.Constants;
import com.vungle.ads.internal.NativeAdInternal;
import com.vungle.ads.internal.downloader.AssetDownloadListener;
import com.vungle.ads.internal.downloader.DownloadRequest;
import com.vungle.ads.internal.downloader.Downloader;
import com.vungle.ads.internal.executor.Executors;
import com.vungle.ads.internal.model.AdAsset;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.ConfigPayload;
import com.vungle.ads.internal.network.TpatRequest;
import com.vungle.ads.internal.network.TpatSender;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.omsdk.OMInjector;
import com.vungle.ads.internal.presenter.PreloadDelegate;
import com.vungle.ads.internal.presenter.WebViewManager;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.task.JobRunner;
import com.vungle.ads.internal.task.ResendTpatJob;
import com.vungle.ads.internal.util.FileUtility;
import com.vungle.ads.internal.util.LogEntry;
import com.vungle.ads.internal.util.Logger;
import com.vungle.ads.internal.util.PathProvider;
import com.vungle.ads.internal.util.Utils;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import wc.m;
import wc.o;
import wc.q;

/* JADX INFO: compiled from: BaseAdLoader.kt */
/* JADX INFO: loaded from: classes4.dex */
public abstract class BaseAdLoader {
    public static final Companion Companion = new Companion(null);
    private static final String DOWNLOADED_FILE_NOT_FOUND = "Downloaded file not found!";
    private static final String TAG = "BaseAdLoader";
    private final List<AdAsset> adAssets;
    private AdLoaderCallback adLoaderCallback;
    private TimeIntervalMetric adOptionalDownloadDurationMetric;
    private TimeIntervalMetric adPreloadToReadyDurationMetric;
    private final AdRequest adRequest;
    private TimeIntervalMetric adRequiredDownloadDurationMetric;
    private AdPayload advertisement;
    private TimeIntervalMetric assetDownloadDurationMetric;
    private final Context context;
    private final AtomicLong downloadCount;
    private final Set<String> downloadRequiredAssets;
    private final Downloader downloader;
    private AtomicBoolean fullyDownloaded;
    private long loadStart;
    private LogEntry logEntry;
    private SingleValueMetric mainVideoSizeMetric;
    private AtomicBoolean notifyFailed;
    private AtomicBoolean notifySuccess;
    private final OMInjector omInjector;
    private final PathProvider pathProvider;
    private final TimeIntervalMetric requestToResponseMetric;
    private AtomicBoolean requiredAssetDownloaded;
    private final Executors sdkExecutors;
    private SingleValueMetric templateHtmlSizeMetric;
    private final VungleApiClient vungleApiClient;

    /* JADX INFO: compiled from: BaseAdLoader.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public BaseAdLoader(Context context, VungleApiClient vungleApiClient, Executors sdkExecutors, OMInjector omInjector, Downloader downloader, PathProvider pathProvider, AdRequest adRequest) {
        t.f(context, "context");
        t.f(vungleApiClient, "vungleApiClient");
        t.f(sdkExecutors, "sdkExecutors");
        t.f(omInjector, "omInjector");
        t.f(downloader, "downloader");
        t.f(pathProvider, "pathProvider");
        t.f(adRequest, "adRequest");
        this.context = context;
        this.vungleApiClient = vungleApiClient;
        this.sdkExecutors = sdkExecutors;
        this.omInjector = omInjector;
        this.downloader = downloader;
        this.pathProvider = pathProvider;
        this.adRequest = adRequest;
        this.downloadCount = new AtomicLong(0L);
        this.downloadRequiredAssets = new LinkedHashSet();
        this.notifySuccess = new AtomicBoolean(false);
        this.notifyFailed = new AtomicBoolean(false);
        this.adAssets = new ArrayList();
        this.fullyDownloaded = new AtomicBoolean(true);
        this.requiredAssetDownloaded = new AtomicBoolean(true);
        this.requestToResponseMetric = new TimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.AD_REQUEST_TO_RESPONSE_DURATION_MS);
        this.mainVideoSizeMetric = new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.ASSET_FILE_SIZE);
        this.templateHtmlSizeMetric = new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.TEMPLATE_HTML_SIZE);
        this.assetDownloadDurationMetric = new TimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.ASSET_DOWNLOAD_DURATION_MS);
        this.adRequiredDownloadDurationMetric = new TimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.AD_REQUIRED_DOWNLOAD_DURATION_MS);
        this.adOptionalDownloadDurationMetric = new TimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.AD_OPTIONAL_DOWNLOAD_DURATION_MS);
        this.adPreloadToReadyDurationMetric = new TimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.AD_PRELOAD_TO_READY_DURATION_MS);
    }

    private final void downloadAssets() {
        AdPayload.AdUnit adUnit;
        Integer maxDownloadRetryAttempts;
        this.assetDownloadDurationMetric.markStart();
        this.adRequiredDownloadDurationMetric.markStart();
        this.adOptionalDownloadDurationMetric.markStart();
        this.downloadCount.set(this.adAssets.size());
        AdPayload adPayload = this.advertisement;
        int iF = od.k.f((adPayload == null || (adUnit = adPayload.adUnit()) == null || (maxDownloadRetryAttempts = adUnit.getMaxDownloadRetryAttempts()) == null) ? 0 : maxDownloadRetryAttempts.intValue(), 5);
        for (AdAsset adAsset : this.adAssets) {
            DownloadRequest downloadRequest = new DownloadRequest(getAssetPriority(adAsset), adAsset, this.logEntry, iF);
            if (adAsset.isHtmlTemplate()) {
                downloadRequest.startTemplateRecord();
            }
            if (adAsset.isRequired()) {
                this.downloadRequiredAssets.add(adAsset.getServerPath());
            }
            this.downloader.download(downloadRequest, getAssetDownloadListener());
        }
    }

    private final boolean fileIsValid(File file, AdAsset adAsset) {
        return file.exists() && file.length() == adAsset.getFileSize();
    }

    private final AssetDownloadListener getAssetDownloadListener() {
        return new BaseAdLoader$assetDownloadListener$1(this);
    }

    private final DownloadRequest.Priority getAssetPriority(AdAsset adAsset) {
        return adAsset.isRequired() ? DownloadRequest.Priority.CRITICAL : DownloadRequest.Priority.HIGHEST;
    }

    private final File getDestinationDir(AdPayload adPayload) {
        return this.pathProvider.getDownloadsDirForAd(adPayload.eventId());
    }

    private final VungleError getErrorInfo(AdPayload adPayload) {
        AdPayload.AdUnit adUnit = adPayload.adUnit();
        Integer errorCode = adUnit != null ? adUnit.getErrorCode() : null;
        AdPayload.AdUnit adUnit2 = adPayload.adUnit();
        Integer sleep = adUnit2 != null ? adUnit2.getSleep() : null;
        AdPayload.AdUnit adUnit3 = adPayload.adUnit();
        String str = "Response error: " + sleep + ", Request failed with error: " + errorCode + ", " + (adUnit3 != null ? adUnit3.getInfo() : null);
        boolean z10 = false;
        if (((((errorCode != null && errorCode.intValue() == 10001) || (errorCode != null && errorCode.intValue() == 10002)) || (errorCode != null && errorCode.intValue() == 20001)) || (errorCode != null && errorCode.intValue() == 30001)) || (errorCode != null && errorCode.intValue() == 30002)) {
            z10 = true;
        }
        if (!z10) {
            return new AdPayloadError(Sdk.SDKError.Reason.PLACEMENT_SLEEP, str);
        }
        Sdk.SDKError.Reason reasonForNumber = Sdk.SDKError.Reason.forNumber(errorCode.intValue());
        t.e(reasonForNumber, "forNumber(errorCode)");
        return new AdPayloadError(reasonForNumber, str);
    }

    private final VungleError getTemplateError(AdPayload adPayload) {
        AdPayload.CacheableReplacement cacheableReplacement;
        AdPayload.CacheableReplacement cacheableReplacement2;
        AdPayload.AdUnit adUnit = adPayload.adUnit();
        AdPayload.TemplateSettings templateSettings = adUnit != null ? adUnit.getTemplateSettings() : null;
        if (templateSettings == null) {
            return new AdResponseEmptyError("Missing template settings");
        }
        Map<String, AdPayload.CacheableReplacement> cacheableReplacements = templateSettings.getCacheableReplacements();
        if (adPayload.isNativeTemplateType()) {
            if (((cacheableReplacements == null || (cacheableReplacement2 = cacheableReplacements.get(NativeAdInternal.TOKEN_MAIN_IMAGE)) == null) ? null : cacheableReplacement2.getUrl()) == null) {
                if (((cacheableReplacements == null || (cacheableReplacement = cacheableReplacements.get("MAIN_VIDEO")) == null) ? null : cacheableReplacement.getUrl()) == null) {
                    return new NativeAssetError("Unable to load null main asset.");
                }
            }
            AdPayload.CacheableReplacement cacheableReplacement3 = cacheableReplacements.get("VUNGLE_PRIVACY_ICON_URL");
            if ((cacheableReplacement3 != null ? cacheableReplacement3.getUrl() : null) == null) {
                return new NativeAssetError("Unable to load null privacy image.");
            }
        } else {
            AdPayload.AdUnit adUnit2 = adPayload.adUnit();
            String vmURL = adUnit2 != null ? adUnit2.getVmURL() : null;
            if (vmURL == null || vmURL.length() == 0) {
                return new InvalidTemplateURLError("Failed to prepare null vmURL for downloading.");
            }
            if (!Utils.INSTANCE.isUrlValid(vmURL)) {
                return new InvalidTemplateURLError("Failed to load vm url: " + vmURL);
            }
        }
        if (cacheableReplacements != null) {
            for (Map.Entry<String, AdPayload.CacheableReplacement> entry : cacheableReplacements.entrySet()) {
                String url = entry.getValue().getUrl();
                if (url == null || url.length() == 0) {
                    return new InvalidAssetUrlError("None asset URL for " + entry.getKey());
                }
                if (!Utils.INSTANCE.isUrlValid(url)) {
                    return new InvalidAssetUrlError("Invalid asset URL " + url);
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: handleAdMetaData$lambda-7, reason: not valid java name */
    private static final TpatSender m258handleAdMetaData$lambda7(wc.k<TpatSender> kVar) {
        return kVar.getValue();
    }

    public static /* synthetic */ void handleAdMetaData$vungle_ads_release$default(BaseAdLoader baseAdLoader, AdPayload adPayload, SingleValueMetric singleValueMetric, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleAdMetaData");
        }
        if ((i10 & 2) != 0) {
            singleValueMetric = null;
        }
        baseAdLoader.handleAdMetaData$vungle_ads_release(adPayload, singleValueMetric);
    }

    private final void injectOMSDKIfNeeded() {
        AdPayload adPayload = this.advertisement;
        boolean z10 = false;
        if (adPayload != null && adPayload.omEnabled()) {
            z10 = true;
        }
        if (z10) {
            try {
                this.omInjector.init();
                this.omInjector.injectJsFiles$vungle_ads_release(this.pathProvider.getVmDir());
            } catch (Exception e10) {
                Logger.Companion.e(TAG, "Failed to inject OMSDK: " + e10.getMessage());
                new OmSdkJsError(Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED, "Failed to inject OMSDK: " + e10.getMessage()).setLogEntry$vungle_ads_release(this.logEntry).logErrorNoReturnValue$vungle_ads_release();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: loadAd$lambda-0, reason: not valid java name */
    public static final void m259loadAd$lambda0(BaseAdLoader this$0) {
        t.f(this$0, "this$0");
        this$0.requestToResponseMetric.markStart();
        this$0.requestAd();
    }

    private final void onAdReady() {
        final AdPayload adPayload = this.advertisement;
        if (adPayload == null || this.notifyFailed.get() || !this.notifySuccess.compareAndSet(false, true)) {
            return;
        }
        if (adPayload.usePreloading()) {
            this.adPreloadToReadyDurationMetric.markStart();
            String strValueOf = String.valueOf(adPayload.getIndexFilePath());
            Logger.Companion.w(TAG, "start preloading");
            WebViewManager.INSTANCE.preloadWebView$vungle_ads_release(this.context, adPayload, this.adRequest.getPlacement(), strValueOf, adPayload.getWebViewSettings(), new PreloadDelegate() { // from class: com.vungle.ads.internal.load.BaseAdLoader$onAdReady$1$1
                @Override // com.vungle.ads.internal.presenter.PreloadDelegate
                public void onAdFailedToPlay() {
                    this.this$0.adPreloadToReadyDurationMetric.markEnd();
                    AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.this$0.adPreloadToReadyDurationMetric, this.this$0.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
                    Logger.Companion.e("BaseAdLoader", "fail to load ad");
                    this.this$0.onAdLoadReady();
                    AdLoaderCallback adLoaderCallback = this.this$0.adLoaderCallback;
                    if (adLoaderCallback != null) {
                        adLoaderCallback.onSuccess(adPayload);
                    }
                }

                @Override // com.vungle.ads.internal.presenter.PreloadDelegate
                public void onAdReadyToPlay() {
                    this.this$0.adPreloadToReadyDurationMetric.markEnd();
                    AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.this$0.adPreloadToReadyDurationMetric, this.this$0.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
                    this.this$0.onAdLoadReady();
                    AdLoaderCallback adLoaderCallback = this.this$0.adLoaderCallback;
                    if (adLoaderCallback != null) {
                        adLoaderCallback.onSuccess(adPayload);
                    }
                }
            }, Long.valueOf(System.currentTimeMillis() - this.loadStart));
        } else {
            onAdLoadReady();
            AdLoaderCallback adLoaderCallback = this.adLoaderCallback;
            if (adLoaderCallback != null) {
                adLoaderCallback.onSuccess(adPayload);
            }
        }
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        m260onAdReady$lambda5$lambda4(m.b(o.SYNCHRONIZED, new BaseAdLoader$onAdReady$lambda5$$inlined$inject$1(this.context))).execute(ResendTpatJob.Companion.makeJobInfo());
    }

    /* JADX INFO: renamed from: onAdReady$lambda-5$lambda-4, reason: not valid java name */
    private static final JobRunner m260onAdReady$lambda5$lambda4(wc.k<? extends JobRunner> kVar) {
        return kVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onDownloadCompleted(AdRequest adRequest) {
        Logger.Companion.d(TAG, "All download completed " + adRequest);
        AdPayload adPayload = this.advertisement;
        if (adPayload != null) {
            adPayload.setAssetFullyDownloaded();
        }
        onAdReady();
        this.assetDownloadDurationMetric.markEnd();
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, this.assetDownloadDurationMetric, this.logEntry, (String) null, 4, (Object) null);
        this.adOptionalDownloadDurationMetric.markEnd();
        AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, this.adOptionalDownloadDurationMetric, this.logEntry, (String) null, 4, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onRequiredDownloadCompleted() {
        this.adRequiredDownloadDurationMetric.markEnd();
        AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.adRequiredDownloadDurationMetric, this.logEntry, (String) null, 4, (Object) null);
        onAdReady();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean processVmTemplate(AdAsset adAsset, AdPayload adPayload) {
        if (adPayload == null || !adAsset.isDownloaded()) {
            return false;
        }
        if ((adAsset.getLocalPath().length() == 0) || !fileIsValid(new File(adAsset.getLocalPath()), adAsset)) {
            return false;
        }
        File destinationDir = getDestinationDir(adPayload);
        if (destinationDir == null || !destinationDir.isDirectory()) {
            Logger.Companion.e(TAG, "Unable to access Destination Directory");
            return false;
        }
        FileUtility.printDirectoryTree(destinationDir);
        return true;
    }

    public final void cancel() {
        this.downloader.cancelAll();
    }

    public final AdRequest getAdRequest() {
        return this.adRequest;
    }

    public final AdPayload getAdvertisement$vungle_ads_release() {
        return this.advertisement;
    }

    public final Context getContext() {
        return this.context;
    }

    public final LogEntry getLogEntry$vungle_ads_release() {
        return this.logEntry;
    }

    public final PathProvider getPathProvider() {
        return this.pathProvider;
    }

    public final Executors getSdkExecutors() {
        return this.sdkExecutors;
    }

    public final VungleApiClient getVungleApiClient() {
        return this.vungleApiClient;
    }

    public final void handleAdMetaData$vungle_ads_release(AdPayload advertisement, SingleValueMetric singleValueMetric) {
        List<String> loadAdUrls;
        t.f(advertisement, "advertisement");
        this.advertisement = advertisement;
        if (advertisement != null) {
            advertisement.recordExpiryWindowStart();
        }
        advertisement.setLogEntry$vungle_ads_release(this.logEntry);
        LogEntry logEntry = this.logEntry;
        if (logEntry != null) {
            logEntry.setEventId$vungle_ads_release(advertisement.eventId());
        }
        LogEntry logEntry2 = this.logEntry;
        if (logEntry2 != null) {
            logEntry2.setCreativeId$vungle_ads_release(advertisement.getCreativeId());
        }
        LogEntry logEntry3 = this.logEntry;
        if (logEntry3 != null) {
            logEntry3.setAdSource$vungle_ads_release(advertisement.getAdSource());
        }
        LogEntry logEntry4 = this.logEntry;
        if (logEntry4 != null) {
            logEntry4.setMediationName$vungle_ads_release(advertisement.getMediationName());
        }
        LogEntry logEntry5 = this.logEntry;
        if (logEntry5 != null) {
            logEntry5.setVmVersion$vungle_ads_release(advertisement.getViewMasterVersion());
        }
        LogEntry logEntry6 = this.logEntry;
        if (logEntry6 != null) {
            logEntry6.setPartialDownloadEnabled$vungle_ads_release(Boolean.valueOf(advertisement.isPartialDownloadEnabled()));
        }
        LogEntry logEntry7 = this.logEntry;
        if (logEntry7 != null) {
            logEntry7.setAdoEnabled$vungle_ads_release(Boolean.valueOf(advertisement.adLoadOptimizationEnabled()));
        }
        LogEntry logEntry8 = this.logEntry;
        if (logEntry8 != null) {
            logEntry8.setAdPoddingEnabled$vungle_ads_release(Boolean.valueOf(advertisement.isAdPoddingEnabled()));
        }
        LogEntry logEntry9 = this.logEntry;
        if (logEntry9 != null) {
            logEntry9.setExperiments$vungle_ads_release(advertisement.getExperiments());
        }
        this.requestToResponseMetric.markEnd();
        AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.requestToResponseMetric, this.logEntry, (String) null, 4, (Object) null);
        ConfigPayload configPayloadConfig = advertisement.config();
        if (configPayloadConfig != null) {
            ConfigManager.INSTANCE.initWithConfig$vungle_ads_release(this.context, configPayloadConfig, false, singleValueMetric);
        }
        VungleError vungleErrorValidateAdMetadata = validateAdMetadata(advertisement);
        if (vungleErrorValidateAdMetadata != null) {
            onAdLoadFailed(vungleErrorValidateAdMetadata.setLogEntry$vungle_ads_release(this.logEntry).logError$vungle_ads_release());
            return;
        }
        File destinationDir = getDestinationDir(advertisement);
        if (destinationDir == null || !destinationDir.isDirectory() || !destinationDir.exists()) {
            onAdLoadFailed(new AssetWriteError("Invalid directory. " + destinationDir).setLogEntry$vungle_ads_release(this.logEntry).logError$vungle_ads_release());
            return;
        }
        injectOMSDKIfNeeded();
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        wc.k kVarB = m.b(o.SYNCHRONIZED, new BaseAdLoader$handleAdMetaData$$inlined$inject$1(this.context));
        AdPayload.AdUnit adUnit = advertisement.adUnit();
        if (adUnit != null && (loadAdUrls = adUnit.getLoadAdUrls()) != null) {
            Iterator<T> it = loadAdUrls.iterator();
            while (it.hasNext()) {
                TpatSender.sendTpat$default(m258handleAdMetaData$lambda7(kVarB), new TpatRequest.Builder((String) it.next()).tpatKey(Constants.LOAD_AD).withLogEntry(this.logEntry).build(), false, 2, null);
            }
        }
        if (!this.adAssets.isEmpty()) {
            this.adAssets.clear();
        }
        this.adAssets.addAll(advertisement.getDownloadableAssets(destinationDir));
        if (this.adAssets.isEmpty()) {
            onAdReady();
        } else {
            downloadAssets();
        }
    }

    public final void loadAd(AdLoaderCallback adLoaderCallback) {
        t.f(adLoaderCallback, "adLoaderCallback");
        this.adLoaderCallback = adLoaderCallback;
        this.loadStart = System.currentTimeMillis();
        this.sdkExecutors.getBackgroundExecutor().execute(new Runnable() { // from class: com.vungle.ads.internal.load.a
            @Override // java.lang.Runnable
            public final void run() {
                BaseAdLoader.m259loadAd$lambda0(this.f13055a);
            }
        });
    }

    public final void onAdLoadFailed(VungleError error) {
        boolean z10;
        t.f(error, "error");
        if (this.notifySuccess.get()) {
            return;
        }
        boolean z11 = true;
        if (this.notifyFailed.compareAndSet(false, true)) {
            AdPayload adPayload = this.advertisement;
            if (adPayload != null && adPayload.isNativeTemplateType()) {
                List<AdAsset> list = this.adAssets;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list) {
                    if (((AdAsset) obj).isMainAssets()) {
                        arrayList.add(obj);
                    } else {
                        arrayList2.add(obj);
                    }
                }
                q qVar = new q(arrayList, arrayList2);
                List list2 = (List) qVar.b();
                List list3 = (List) qVar.c();
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((AdAsset) it.next()).isDownloaded()) {
                                z10 = true;
                                break;
                            }
                        } else {
                            z10 = false;
                            break;
                        }
                    }
                } else {
                    z10 = false;
                    break;
                }
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    Iterator it2 = list3.iterator();
                    while (it2.hasNext()) {
                        if (!((AdAsset) it2.next()).isDownloaded()) {
                            z11 = false;
                            break;
                        }
                    }
                }
                if (z10 && z11) {
                    this.notifyFailed.set(false);
                    onAdReady();
                    return;
                }
            }
            AdLoaderCallback adLoaderCallback = this.adLoaderCallback;
            if (adLoaderCallback != null) {
                adLoaderCallback.onFailure(error);
            }
        }
    }

    public abstract void onAdLoadReady();

    protected abstract void requestAd();

    public final void setAdvertisement$vungle_ads_release(AdPayload adPayload) {
        this.advertisement = adPayload;
    }

    public final void setLogEntry$vungle_ads_release(LogEntry logEntry) {
        this.logEntry = logEntry;
    }

    public VungleError validateAdMetadata(AdPayload adPayload) {
        Integer sleep;
        t.f(adPayload, "adPayload");
        AdPayload.AdUnit adUnit = adPayload.adUnit();
        if (adUnit != null && (sleep = adUnit.getSleep()) != null) {
            sleep.intValue();
            return getErrorInfo(adPayload);
        }
        String referenceId = this.adRequest.getPlacement().getReferenceId();
        AdPayload adPayload2 = this.advertisement;
        if (!t.a(referenceId, adPayload2 != null ? adPayload2.placementId() : null)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Waterfall request and responses placement don't match ");
            AdPayload adPayload3 = this.advertisement;
            sb2.append(adPayload3 != null ? adPayload3.placementId() : null);
            sb2.append('.');
            return new PlacementMismatchError(sb2.toString());
        }
        VungleError templateError = getTemplateError(adPayload);
        if (templateError != null) {
            return templateError;
        }
        if (!adPayload.hasExpired()) {
            String strEventId = adPayload.eventId();
            if (strEventId == null || strEventId.length() == 0) {
                return new InvalidEventIdError("Event id is invalid.");
            }
            return null;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("The ad markup has expired for playback. Ad expiry: ");
        AdPayload.AdUnit adUnit2 = adPayload.adUnit();
        sb3.append(adUnit2 != null ? adUnit2.getExpiry() : null);
        sb3.append(", device: ");
        sb3.append(System.currentTimeMillis());
        return new AdExpiredError(sb3.toString());
    }
}
