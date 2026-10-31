package com.vungle.ads.internal.load;

import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.AssetRequestError;
import com.vungle.ads.PrivacyIconFallbackError;
import com.vungle.ads.internal.downloader.AssetDownloadListener;
import com.vungle.ads.internal.downloader.DefaultPrivacyIconInjector;
import com.vungle.ads.internal.downloader.DownloadRequest;
import com.vungle.ads.internal.executor.VungleThreadPoolExecutor;
import com.vungle.ads.internal.model.AdAsset;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.platform.DeviceCheckUtils;
import com.vungle.ads.internal.util.Logger;
import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.t;
import od.h;

/* JADX INFO: compiled from: BaseAdLoader.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class BaseAdLoader$assetDownloadListener$1 implements AssetDownloadListener {
    private boolean partialDownloadRecorded;
    final /* synthetic */ BaseAdLoader this$0;

    BaseAdLoader$assetDownloadListener$1(BaseAdLoader baseAdLoader) {
        this.this$0 = baseAdLoader;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onError$lambda-1, reason: not valid java name */
    public static final void m261onError$lambda1(DownloadRequest downloadRequest, BaseAdLoader this$0, BaseAdLoader$assetDownloadListener$1 this$1, AssetDownloadListener.DownloadError downloadError) {
        t.f(downloadRequest, "$downloadRequest");
        t.f(this$0, "this$0");
        t.f(this$1, "this$1");
        AdAsset asset = downloadRequest.getAsset();
        if (asset.isPrivacyIcon()) {
            File fileInjectPrivacyIcon = DefaultPrivacyIconInjector.INSTANCE.injectPrivacyIcon(this$0.getPathProvider().getVmDir());
            if (fileInjectPrivacyIcon != null && fileInjectPrivacyIcon.exists()) {
                this$1.onSuccess(fileInjectPrivacyIcon, downloadRequest);
                return;
            }
            new PrivacyIconFallbackError("Failed to inject default privacy icon").setLogEntry$vungle_ads_release(this$0.getLogEntry$vungle_ads_release()).logErrorNoReturnValue$vungle_ads_release();
        }
        asset.setStatus(AdAsset.Status.DOWNLOAD_FAILED);
        this$0.fullyDownloaded.set(false);
        if (asset.isRequired()) {
            this$0.requiredAssetDownloaded.set(false);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Failed to download assets ");
        sb2.append(asset.getServerPath());
        sb2.append(". error: ");
        sb2.append(downloadError);
        sb2.append(" errorType=");
        DeviceCheckUtils deviceCheckUtils = DeviceCheckUtils.INSTANCE;
        sb2.append(deviceCheckUtils.classifyNetworkError(downloadError != null ? downloadError.getCause() : null));
        sb2.append(" proxyEnabled=");
        sb2.append(deviceCheckUtils.isProxyEnabled(this$0.getContext()));
        sb2.append(" privateDns=");
        sb2.append(deviceCheckUtils.getPrivateDnsInfo(this$0.getContext()));
        sb2.append(" network=");
        sb2.append(deviceCheckUtils.getActiveNetworkType(this$0.getContext()));
        new AssetRequestError(sb2.toString()).setLogEntry$vungle_ads_release(this$0.getLogEntry$vungle_ads_release()).logErrorNoReturnValue$vungle_ads_release();
        if (asset.isRequired()) {
            this$0.downloadRequiredAssets.remove(downloadRequest.getAsset().getServerPath());
            if (this$0.downloadRequiredAssets.isEmpty()) {
                this$0.cancel();
                this$0.onAdLoadFailed(new AssetRequestError("Error: Failed to download required assets."));
                return;
            }
        }
        if (this$0.downloadCount.decrementAndGet() <= 0) {
            this$0.onAdLoadFailed(new AssetRequestError("Error: Failed to download assets."));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onProgress$lambda-0, reason: not valid java name */
    public static final void m262onProgress$lambda0(BaseAdLoader this$0, AdAsset adAsset) {
        t.f(this$0, "this$0");
        t.f(adAsset, "$adAsset");
        this$0.downloadRequiredAssets.remove(adAsset.getServerPath());
        if (this$0.downloadRequiredAssets.isEmpty()) {
            if (this$0.requiredAssetDownloaded.get()) {
                this$0.onRequiredDownloadCompleted();
            } else {
                this$0.cancel();
                this$0.onAdLoadFailed(new AssetRequestError("Failed to download required assets."));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onSuccess$lambda-2, reason: not valid java name */
    public static final void m263onSuccess$lambda2(File file, BaseAdLoader$assetDownloadListener$1 this$0, DownloadRequest downloadRequest, BaseAdLoader this$1) {
        t.f(file, "$file");
        t.f(this$0, "this$0");
        t.f(downloadRequest, "$downloadRequest");
        t.f(this$1, "this$1");
        if (!file.exists()) {
            this$0.onError(new AssetDownloadListener.DownloadError(-1, new IOException("Downloaded file not found!"), AssetDownloadListener.DownloadError.ErrorReason.Companion.getFILE_NOT_FOUND_ERROR()), downloadRequest);
            return;
        }
        AdAsset asset = downloadRequest.getAsset();
        asset.setFileSize(file.length());
        asset.setStatus(AdAsset.Status.DOWNLOAD_SUCCESS);
        Integer percentage = asset.getPercentage();
        if (percentage == null || percentage.intValue() == 0 || percentage.intValue() == 100) {
            downloadRequest.stopPartialDownloadRecord();
        }
        if (asset.isHtmlTemplate()) {
            downloadRequest.stopTemplateRecord();
            this$1.templateHtmlSizeMetric.setValue(Long.valueOf(file.length()));
            AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(this$1.templateHtmlSizeMetric, this$1.getLogEntry$vungle_ads_release(), asset.getServerPath());
        } else if (asset.isMainVideo()) {
            this$1.mainVideoSizeMetric.setValue(Long.valueOf(file.length()));
            AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(this$1.mainVideoSizeMetric, this$1.getLogEntry$vungle_ads_release(), asset.getServerPath());
        }
        AdPayload advertisement$vungle_ads_release = this$1.getAdvertisement$vungle_ads_release();
        if (advertisement$vungle_ads_release != null) {
            advertisement$vungle_ads_release.updateAdAssetPath(asset.getAdIdentifier(), file);
        }
        if (asset.isHtmlTemplate() && !this$1.processVmTemplate(asset, this$1.getAdvertisement$vungle_ads_release())) {
            this$1.fullyDownloaded.set(false);
            if (asset.isRequired()) {
                this$1.requiredAssetDownloaded.set(false);
            }
        }
        if (asset.isRequired()) {
            this$1.downloadRequiredAssets.remove(asset.getServerPath());
            if (this$1.downloadRequiredAssets.isEmpty()) {
                if (!this$1.requiredAssetDownloaded.get()) {
                    this$1.cancel();
                    this$1.onAdLoadFailed(new AssetRequestError("Failed to download required assets."));
                    return;
                }
                this$1.onRequiredDownloadCompleted();
            }
        }
        if (this$1.downloadCount.decrementAndGet() <= 0) {
            if (this$1.fullyDownloaded.get()) {
                this$1.onDownloadCompleted(this$1.getAdRequest());
            } else {
                this$1.onAdLoadFailed(new AssetRequestError("Failed to download assets."));
            }
        }
    }

    @Override // com.vungle.ads.internal.downloader.AssetDownloadListener
    public void onError(final AssetDownloadListener.DownloadError downloadError, final DownloadRequest downloadRequest) {
        t.f(downloadRequest, "downloadRequest");
        Logger.Companion.e("BaseAdLoader", "onError called: " + downloadError);
        VungleThreadPoolExecutor backgroundExecutor = this.this$0.getSdkExecutors().getBackgroundExecutor();
        final BaseAdLoader baseAdLoader = this.this$0;
        backgroundExecutor.execute(new Runnable() { // from class: com.vungle.ads.internal.load.c
            @Override // java.lang.Runnable
            public final void run() {
                BaseAdLoader$assetDownloadListener$1.m261onError$lambda1(downloadRequest, baseAdLoader, this, downloadError);
            }
        });
    }

    @Override // com.vungle.ads.internal.downloader.AssetDownloadListener
    public void onProgress(AssetDownloadListener.Progress progress, DownloadRequest downloadRequest) {
        t.f(progress, "progress");
        t.f(downloadRequest, "downloadRequest");
        final AdAsset asset = downloadRequest.getAsset();
        Integer percentage = asset.getPercentage();
        Logger.Companion companion = Logger.Companion;
        companion.d("BaseAdLoader", "Download progress: " + progress + " url: " + asset.getServerPath());
        if (this.partialDownloadRecorded || percentage == null || progress.getProgressPercent() < percentage.intValue()) {
            return;
        }
        this.partialDownloadRecorded = true;
        if (new h(1, 99).g(percentage.intValue())) {
            downloadRequest.stopPartialDownloadRecord();
        }
        companion.w("BaseAdLoader", "Download progress: hit chunk percentage=" + percentage + " for url: " + asset.getServerPath());
        if (asset.isRequired()) {
            VungleThreadPoolExecutor backgroundExecutor = this.this$0.getSdkExecutors().getBackgroundExecutor();
            final BaseAdLoader baseAdLoader = this.this$0;
            backgroundExecutor.execute(new Runnable() { // from class: com.vungle.ads.internal.load.b
                @Override // java.lang.Runnable
                public final void run() {
                    BaseAdLoader$assetDownloadListener$1.m262onProgress$lambda0(baseAdLoader, asset);
                }
            });
        }
    }

    @Override // com.vungle.ads.internal.downloader.AssetDownloadListener
    public void onStart(DownloadRequest downloadRequest) {
        t.f(downloadRequest, "downloadRequest");
        Logger.Companion.w("BaseAdLoader", "onStart called: " + downloadRequest.getAsset().getServerPath());
        downloadRequest.startPartialDownloadRecord();
    }

    @Override // com.vungle.ads.internal.downloader.AssetDownloadListener
    public void onSuccess(final File file, final DownloadRequest downloadRequest) {
        t.f(file, "file");
        t.f(downloadRequest, "downloadRequest");
        VungleThreadPoolExecutor backgroundExecutor = this.this$0.getSdkExecutors().getBackgroundExecutor();
        final BaseAdLoader baseAdLoader = this.this$0;
        backgroundExecutor.execute(new Runnable() { // from class: com.vungle.ads.internal.load.d
            @Override // java.lang.Runnable
            public final void run() {
                BaseAdLoader$assetDownloadListener$1.m263onSuccess$lambda2(file, this, downloadRequest, baseAdLoader);
            }
        });
    }
}
