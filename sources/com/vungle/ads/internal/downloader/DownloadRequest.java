package com.vungle.ads.internal.downloader;

import com.facebook.internal.logging.dumpsys.Tj.ljglrLUdGZhMhQ;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.TimeIntervalMetric;
import com.vungle.ads.internal.model.AdAsset;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.util.LogEntry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.collections.b0;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: DownloadRequest.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class DownloadRequest {
    private final AdAsset asset;
    private final AtomicBoolean cancelled;
    private final AtomicInteger currentRetryAttempt;
    private TimeIntervalMetric downloadTemplateDuration;
    private final LogEntry logEntry;
    private final int maxRetries;
    private TimeIntervalMetric partialDownloadDurationMetric;
    private final Priority priority;
    private final List<String> retryReasons;

    /* JADX INFO: compiled from: DownloadRequest.kt */
    public enum Priority {
        CRITICAL(-2147483647),
        HIGHEST(0),
        HIGH(1),
        LOWEST(Integer.MAX_VALUE);

        private final int priority;

        Priority(int i10) {
            this.priority = i10;
        }

        public final int getPriority() {
            return this.priority;
        }
    }

    public DownloadRequest(Priority priority, AdAsset asset, LogEntry logEntry, int i10) {
        t.f(priority, "priority");
        t.f(asset, "asset");
        this.priority = priority;
        this.asset = asset;
        this.logEntry = logEntry;
        this.maxRetries = i10;
        this.cancelled = new AtomicBoolean(false);
        this.currentRetryAttempt = new AtomicInteger(0);
        this.retryReasons = Collections.synchronizedList(new ArrayList());
    }

    public final boolean canRetry$vungle_ads_release() {
        return this.currentRetryAttempt.get() < this.maxRetries;
    }

    public final void cancel() {
        this.cancelled.set(true);
    }

    public final AdAsset getAsset() {
        return this.asset;
    }

    public final int getCurrentRetryAttempt$vungle_ads_release() {
        return this.currentRetryAttempt.get();
    }

    public final LogEntry getLogEntry$vungle_ads_release() {
        return this.logEntry;
    }

    public final int getMaxRetries$vungle_ads_release() {
        return this.maxRetries;
    }

    /* JADX INFO: renamed from: getPriority, reason: collision with other method in class */
    public final Priority m253getPriority() {
        return this.priority;
    }

    public final List<String> getRetryReasons$vungle_ads_release() {
        List<String> retryReasons = this.retryReasons;
        t.e(retryReasons, "retryReasons");
        return b0.p0(retryReasons);
    }

    public final int incrementRetryAttempt$vungle_ads_release() {
        return this.currentRetryAttempt.incrementAndGet();
    }

    public final boolean isCancelled() {
        return this.cancelled.get();
    }

    public final void recordRetryReason$vungle_ads_release(String reason) {
        t.f(reason, "reason");
        this.retryReasons.add(reason);
    }

    public final void startPartialDownloadRecord() {
        if (this.partialDownloadDurationMetric != null) {
            return;
        }
        TimeIntervalMetric timeIntervalMetric = new TimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.ASSET_PARTIAL_DOWNLOAD_DURATION_MS);
        this.partialDownloadDurationMetric = timeIntervalMetric;
        timeIntervalMetric.markStart();
    }

    public final void startTemplateRecord() {
        TimeIntervalMetric timeIntervalMetric = new TimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.TEMPLATE_DOWNLOAD_DURATION_MS);
        this.downloadTemplateDuration = timeIntervalMetric;
        timeIntervalMetric.markStart();
    }

    public final void stopPartialDownloadRecord() {
        TimeIntervalMetric timeIntervalMetric = this.partialDownloadDurationMetric;
        if (timeIntervalMetric != null) {
            timeIntervalMetric.markEnd();
            AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(timeIntervalMetric, this.logEntry, "percentage=" + this.asset.getPercentage() + " url=" + this.asset.getServerPath());
        }
    }

    public final void stopTemplateRecord() {
        TimeIntervalMetric timeIntervalMetric = this.downloadTemplateDuration;
        if (timeIntervalMetric != null) {
            timeIntervalMetric.markEnd();
            AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(timeIntervalMetric, this.logEntry, this.asset.getServerPath());
        }
    }

    public final int getPriority() {
        return this.priority.getPriority();
    }

    public String toString() {
        return "DownloadRequest{priority=" + this.priority + ", url='" + this.asset.getServerPath() + "', path='" + this.asset.getLocalPath() + ljglrLUdGZhMhQ.hKZ + this.cancelled + ", retryAttempt=" + this.currentRetryAttempt.get() + ", maxRetries=" + this.maxRetries + ", logEntry=" + this.logEntry + '}';
    }

    public /* synthetic */ DownloadRequest(Priority priority, AdAsset adAsset, LogEntry logEntry, int i10, int i11, k kVar) {
        this(priority, adAsset, (i11 & 4) != 0 ? null : logEntry, (i11 & 8) != 0 ? 0 : i10);
    }
}
