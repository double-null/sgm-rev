package com.vungle.ads;

import android.os.Build;
import com.vungle.ads.internal.AdInternal;
import com.vungle.ads.internal.executor.VungleThreadPoolExecutor;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.network.VungleHeader;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.util.ActivityManager;
import com.vungle.ads.internal.util.LogEntry;
import com.vungle.ads.internal.util.Logger;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: AnalyticsClient.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class AnalyticsClient {
    private static final int MAX_BATCH_SIZE = 20;
    private static final long REFRESH_TIME_MILLIS = 5000;
    private static final String TAG = "AnalyticsClient";
    private static VungleThreadPoolExecutor executor;
    private static boolean metricsEnabled;
    private static VungleApiClient vungleApiClient;
    public static final AnalyticsClient INSTANCE = new AnalyticsClient();
    private static final BlockingQueue<Sdk.SDKError.Builder> errors = new LinkedBlockingQueue();
    private static final BlockingQueue<Sdk.SDKMetric.Builder> metrics = new LinkedBlockingQueue();
    private static final BlockingQueue<Sdk.SDKError.Builder> pendingErrors = new LinkedBlockingQueue();
    private static final BlockingQueue<Sdk.SDKMetric.Builder> pendingMetrics = new LinkedBlockingQueue();
    private static LogLevel logLevel = LogLevel.ERROR_LOG_LEVEL_ERROR;
    private static boolean refreshEnabled = true;
    private static final AtomicBoolean isInitialized = new AtomicBoolean(false);

    /* JADX INFO: compiled from: AnalyticsClient.kt */
    public enum LogLevel {
        ERROR_LOG_LEVEL_OFF(0),
        ERROR_LOG_LEVEL_ERROR(1),
        ERROR_LOG_LEVEL_DEBUG(2);

        public static final Companion Companion = new Companion(null);
        private final int level;

        /* JADX INFO: compiled from: AnalyticsClient.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final LogLevel fromValue(int i10) {
                LogLevel logLevel = LogLevel.ERROR_LOG_LEVEL_DEBUG;
                if (i10 == logLevel.getLevel()) {
                    return logLevel;
                }
                LogLevel logLevel2 = LogLevel.ERROR_LOG_LEVEL_ERROR;
                if (i10 == logLevel2.getLevel()) {
                    return logLevel2;
                }
                LogLevel logLevel3 = LogLevel.ERROR_LOG_LEVEL_OFF;
                return i10 == logLevel3.getLevel() ? logLevel3 : logLevel2;
            }
        }

        LogLevel(int i10) {
            this.level = i10;
        }

        public final int getLevel() {
            return this.level;
        }
    }

    /* JADX INFO: compiled from: AnalyticsClient.kt */
    public interface RequestListener {
        void onFailure();

        void onSuccess();
    }

    /* JADX INFO: renamed from: com.vungle.ads.AnalyticsClient$logErrorInSameThread$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AnalyticsClient.kt */
    static final class C24121 extends u implements id.a<String> {
        final /* synthetic */ Sdk.SDKError.Builder $error;
        final /* synthetic */ String $message;
        final /* synthetic */ Sdk.SDKError.Reason $reason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C24121(Sdk.SDKError.Reason reason, String str, Sdk.SDKError.Builder builder) {
            super(0);
            this.$reason = reason;
            this.$message = str;
            this.$error = builder;
        }

        @Override // id.a
        public final String invoke() {
            return "Logging error: " + this.$reason + " with message: " + this.$message + ", mediation: " + this.$error.getMediationName();
        }
    }

    /* JADX INFO: renamed from: com.vungle.ads.AnalyticsClient$logMetricInSameThread$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AnalyticsClient.kt */
    static final class C24131 extends u implements id.a<String> {
        final /* synthetic */ LogEntry $logEntry;
        final /* synthetic */ Sdk.SDKMetric.Builder $metric;
        final /* synthetic */ Sdk.SDKMetric.SDKMetricType $metricType;
        final /* synthetic */ long $metricValue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C24131(Sdk.SDKMetric.SDKMetricType sDKMetricType, long j10, LogEntry logEntry, Sdk.SDKMetric.Builder builder) {
            super(0);
            this.$metricType = sDKMetricType;
            this.$metricValue = j10;
            this.$logEntry = logEntry;
            this.$metric = builder;
        }

        @Override // id.a
        public final String invoke() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Logging Metric ");
            sb2.append(this.$metricType);
            sb2.append(" with value ");
            sb2.append(this.$metricValue);
            sb2.append(" for placement ");
            LogEntry logEntry = this.$logEntry;
            sb2.append(logEntry != null ? logEntry.getPlacementRefId$vungle_ads_release() : null);
            sb2.append(" mediation:");
            sb2.append(this.$metric.getMediationName());
            return sb2.toString();
        }
    }

    private AnalyticsClient() {
    }

    private final void flushErrors() {
        VungleApiClient vungleApiClient2;
        Logger.Companion companion = Logger.Companion;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Sending ");
        BlockingQueue<Sdk.SDKError.Builder> blockingQueue = errors;
        sb2.append(blockingQueue.size());
        sb2.append(" errors");
        companion.d(TAG, sb2.toString());
        final LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        blockingQueue.drainTo(linkedBlockingQueue);
        if (linkedBlockingQueue.isEmpty() || (vungleApiClient2 = vungleApiClient) == null) {
            return;
        }
        vungleApiClient2.reportErrors(linkedBlockingQueue, new RequestListener() { // from class: com.vungle.ads.AnalyticsClient.flushErrors.1
            @Override // com.vungle.ads.AnalyticsClient.RequestListener
            public void onFailure() {
                Logger.Companion.d(AnalyticsClient.TAG, "Failed to send " + linkedBlockingQueue.size() + " errors");
                AnalyticsClient.INSTANCE.getErrors$vungle_ads_release().addAll(linkedBlockingQueue);
            }

            @Override // com.vungle.ads.AnalyticsClient.RequestListener
            public void onSuccess() {
                Logger.Companion.d(AnalyticsClient.TAG, "Sent " + linkedBlockingQueue.size() + " errors");
            }
        });
    }

    private final void flushMetrics() {
        VungleApiClient vungleApiClient2;
        Logger.Companion companion = Logger.Companion;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Sending ");
        BlockingQueue<Sdk.SDKMetric.Builder> blockingQueue = metrics;
        sb2.append(blockingQueue.size());
        sb2.append(" metrics");
        companion.d(TAG, sb2.toString());
        final LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        blockingQueue.drainTo(linkedBlockingQueue);
        if (linkedBlockingQueue.isEmpty() || (vungleApiClient2 = vungleApiClient) == null) {
            return;
        }
        vungleApiClient2.reportMetrics(linkedBlockingQueue, new RequestListener() { // from class: com.vungle.ads.AnalyticsClient.flushMetrics.1
            @Override // com.vungle.ads.AnalyticsClient.RequestListener
            public void onFailure() {
                Logger.Companion.d(AnalyticsClient.TAG, "Failed to send " + linkedBlockingQueue.size() + " metrics");
                AnalyticsClient.INSTANCE.getMetrics$vungle_ads_release().addAll(linkedBlockingQueue);
            }

            @Override // com.vungle.ads.AnalyticsClient.RequestListener
            public void onSuccess() {
                Logger.Companion.d(AnalyticsClient.TAG, "Sent " + linkedBlockingQueue.size() + " metrics");
            }
        });
    }

    private final Sdk.SDKMetric.Builder genMetric(Sdk.SDKMetric.SDKMetricType sDKMetricType, long j10, LogEntry logEntry, String str) {
        String placementRefId$vungle_ads_release;
        String creativeId$vungle_ads_release;
        String eventId$vungle_ads_release;
        String headerUa;
        String adSource$vungle_ads_release;
        String vmVersion$vungle_ads_release;
        String string;
        String experiments$vungle_ads_release;
        Long adLoadType$vungle_ads_release;
        Boolean adPoddingEnabled$vungle_ads_release;
        Boolean adoEnabled$vungle_ads_release;
        Boolean partialDownloadEnabled$vungle_ads_release;
        String adapterAdFormat$vungle_ads_release;
        AdInternal.AdState adState$vungle_ads_release;
        Sdk.SDKMetric.Builder value = Sdk.SDKMetric.newBuilder().setType(sDKMetricType).setValue(j10);
        String str2 = Build.MANUFACTURER;
        Sdk.SDKMetric.Builder osVersion = value.setMake(str2).setModel(Build.MODEL).setOs(t.a("Amazon", str2) ? "amazon" : "android").setOsVersion(String.valueOf(Build.VERSION.SDK_INT));
        String str3 = "";
        if (logEntry == null || (placementRefId$vungle_ads_release = logEntry.getPlacementRefId$vungle_ads_release()) == null) {
            placementRefId$vungle_ads_release = "";
        }
        Sdk.SDKMetric.Builder placementReferenceId = osVersion.setPlacementReferenceId(placementRefId$vungle_ads_release);
        if (logEntry == null || (creativeId$vungle_ads_release = logEntry.getCreativeId$vungle_ads_release()) == null) {
            creativeId$vungle_ads_release = "";
        }
        Sdk.SDKMetric.Builder creativeId = placementReferenceId.setCreativeId(creativeId$vungle_ads_release);
        if (logEntry == null || (eventId$vungle_ads_release = logEntry.getEventId$vungle_ads_release()) == null) {
            eventId$vungle_ads_release = "";
        }
        Sdk.SDKMetric.Builder eventId = creativeId.setEventId(eventId$vungle_ads_release);
        if (str == null) {
            str = "";
        }
        Sdk.SDKMetric.Builder meta = eventId.setMeta(str);
        if (logEntry == null || (headerUa = logEntry.getMediationName$vungle_ads_release()) == null) {
            headerUa = VungleHeader.INSTANCE.getHeaderUa();
        }
        Sdk.SDKMetric.Builder mediationName = meta.setMediationName(headerUa);
        if (logEntry == null || (adSource$vungle_ads_release = logEntry.getAdSource$vungle_ads_release()) == null) {
            adSource$vungle_ads_release = "";
        }
        Sdk.SDKMetric.Builder adSource = mediationName.setAdSource(adSource$vungle_ads_release);
        if (logEntry == null || (vmVersion$vungle_ads_release = logEntry.getVmVersion$vungle_ads_release()) == null) {
            vmVersion$vungle_ads_release = "";
        }
        Sdk.SDKMetric.Builder appState = adSource.setVmVersion(vmVersion$vungle_ads_release).setAppState(ActivityManager.Companion.isForeground() ? 0L : 2L);
        if (logEntry == null || (adState$vungle_ads_release = logEntry.getAdState$vungle_ads_release()) == null || (string = adState$vungle_ads_release.toString()) == null) {
            string = "";
        }
        Sdk.SDKMetric.Builder adState = appState.setAdState(string);
        if (logEntry == null || (experiments$vungle_ads_release = logEntry.getExperiments$vungle_ads_release()) == null) {
            experiments$vungle_ads_release = "";
        }
        Sdk.SDKMetric.Builder experiments = adState.setExperiments(experiments$vungle_ads_release);
        if (logEntry != null && (adapterAdFormat$vungle_ads_release = logEntry.getAdapterAdFormat$vungle_ads_release()) != null) {
            str3 = adapterAdFormat$vungle_ads_release;
        }
        Sdk.SDKMetric.Builder adapterAdFormat = experiments.setAdapterAdFormat(str3);
        if (logEntry != null && (partialDownloadEnabled$vungle_ads_release = logEntry.getPartialDownloadEnabled$vungle_ads_release()) != null) {
            adapterAdFormat.setIsPartialDownloadEnabled(partialDownloadEnabled$vungle_ads_release.booleanValue());
        }
        if (logEntry != null && (adoEnabled$vungle_ads_release = logEntry.getAdoEnabled$vungle_ads_release()) != null) {
            adapterAdFormat.setIsAdoEnabled(adoEnabled$vungle_ads_release.booleanValue());
        }
        if (logEntry != null && (adPoddingEnabled$vungle_ads_release = logEntry.getAdPoddingEnabled$vungle_ads_release()) != null) {
            adapterAdFormat.setIsAdPodding(adPoddingEnabled$vungle_ads_release.booleanValue());
        }
        if (logEntry != null && (adLoadType$vungle_ads_release = logEntry.getAdLoadType$vungle_ads_release()) != null) {
            adapterAdFormat.setAdLoadType(adLoadType$vungle_ads_release.longValue());
        }
        t.e(adapterAdFormat, "newBuilder()\n           …dType(it) }\n            }");
        return adapterAdFormat;
    }

    static /* synthetic */ Sdk.SDKMetric.Builder genMetric$default(AnalyticsClient analyticsClient, Sdk.SDKMetric.SDKMetricType sDKMetricType, long j10, LogEntry logEntry, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        return analyticsClient.genMetric(sDKMetricType, j10, (i10 & 4) != 0 ? null : logEntry, (i10 & 8) != 0 ? null : str);
    }

    private final Sdk.SDKError.Builder genSDKError(Sdk.SDKError.Reason reason, String str, LogEntry logEntry) {
        String placementRefId$vungle_ads_release;
        String creativeId$vungle_ads_release;
        String eventId$vungle_ads_release;
        String adSource$vungle_ads_release;
        String vmVersion$vungle_ads_release;
        String headerUa;
        String string;
        String experiments$vungle_ads_release;
        Long adLoadType$vungle_ads_release;
        Boolean adPoddingEnabled$vungle_ads_release;
        Boolean adoEnabled$vungle_ads_release;
        Boolean partialDownloadEnabled$vungle_ads_release;
        String adapterAdFormat$vungle_ads_release;
        AdInternal.AdState adState$vungle_ads_release;
        Sdk.SDKError.Builder builderNewBuilder = Sdk.SDKError.newBuilder();
        String str2 = Build.MANUFACTURER;
        Sdk.SDKError.Builder at = builderNewBuilder.setOs(t.a("Amazon", str2) ? "amazon" : "android").setOsVersion(String.valueOf(Build.VERSION.SDK_INT)).setMake(str2).setModel(Build.MODEL).setReason(reason).setMessage(str).setAt(System.currentTimeMillis());
        String str3 = "";
        if (logEntry == null || (placementRefId$vungle_ads_release = logEntry.getPlacementRefId$vungle_ads_release()) == null) {
            placementRefId$vungle_ads_release = "";
        }
        Sdk.SDKError.Builder placementReferenceId = at.setPlacementReferenceId(placementRefId$vungle_ads_release);
        if (logEntry == null || (creativeId$vungle_ads_release = logEntry.getCreativeId$vungle_ads_release()) == null) {
            creativeId$vungle_ads_release = "";
        }
        Sdk.SDKError.Builder creativeId = placementReferenceId.setCreativeId(creativeId$vungle_ads_release);
        if (logEntry == null || (eventId$vungle_ads_release = logEntry.getEventId$vungle_ads_release()) == null) {
            eventId$vungle_ads_release = "";
        }
        Sdk.SDKError.Builder eventId = creativeId.setEventId(eventId$vungle_ads_release);
        if (logEntry == null || (adSource$vungle_ads_release = logEntry.getAdSource$vungle_ads_release()) == null) {
            adSource$vungle_ads_release = "";
        }
        Sdk.SDKError.Builder adSource = eventId.setAdSource(adSource$vungle_ads_release);
        if (logEntry == null || (vmVersion$vungle_ads_release = logEntry.getVmVersion$vungle_ads_release()) == null) {
            vmVersion$vungle_ads_release = "";
        }
        Sdk.SDKError.Builder vmVersion = adSource.setVmVersion(vmVersion$vungle_ads_release);
        if (logEntry == null || (headerUa = logEntry.getMediationName$vungle_ads_release()) == null) {
            headerUa = VungleHeader.INSTANCE.getHeaderUa();
        }
        Sdk.SDKError.Builder appState = vmVersion.setMediationName(headerUa).setAppState(ActivityManager.Companion.isForeground() ? 0L : 2L);
        if (logEntry == null || (adState$vungle_ads_release = logEntry.getAdState$vungle_ads_release()) == null || (string = adState$vungle_ads_release.toString()) == null) {
            string = "";
        }
        Sdk.SDKError.Builder adState = appState.setAdState(string);
        if (logEntry == null || (experiments$vungle_ads_release = logEntry.getExperiments$vungle_ads_release()) == null) {
            experiments$vungle_ads_release = "";
        }
        Sdk.SDKError.Builder experiments = adState.setExperiments(experiments$vungle_ads_release);
        if (logEntry != null && (adapterAdFormat$vungle_ads_release = logEntry.getAdapterAdFormat$vungle_ads_release()) != null) {
            str3 = adapterAdFormat$vungle_ads_release;
        }
        Sdk.SDKError.Builder adapterAdFormat = experiments.setAdapterAdFormat(str3);
        if (logEntry != null && (partialDownloadEnabled$vungle_ads_release = logEntry.getPartialDownloadEnabled$vungle_ads_release()) != null) {
            adapterAdFormat.setIsPartialDownloadEnabled(partialDownloadEnabled$vungle_ads_release.booleanValue());
        }
        if (logEntry != null && (adoEnabled$vungle_ads_release = logEntry.getAdoEnabled$vungle_ads_release()) != null) {
            adapterAdFormat.setIsAdoEnabled(adoEnabled$vungle_ads_release.booleanValue());
        }
        if (logEntry != null && (adPoddingEnabled$vungle_ads_release = logEntry.getAdPoddingEnabled$vungle_ads_release()) != null) {
            adapterAdFormat.setIsAdPodding(adPoddingEnabled$vungle_ads_release.booleanValue());
        }
        if (logEntry != null && (adLoadType$vungle_ads_release = logEntry.getAdLoadType$vungle_ads_release()) != null) {
            adapterAdFormat.setAdLoadType(adLoadType$vungle_ads_release.longValue());
        }
        t.e(adapterAdFormat, "newBuilder()\n           …dType(it) }\n            }");
        return adapterAdFormat;
    }

    static /* synthetic */ Sdk.SDKError.Builder genSDKError$default(AnalyticsClient analyticsClient, Sdk.SDKError.Reason reason, String str, LogEntry logEntry, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            logEntry = null;
        }
        return analyticsClient.genSDKError(reason, str, logEntry);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initOrUpdate$lambda-1, reason: not valid java name */
    public static final void m213initOrUpdate$lambda1(VungleThreadPoolExecutor executor2) {
        t.f(executor2, "$executor");
        executor2.execute(new Runnable() { // from class: com.vungle.ads.c
            @Override // java.lang.Runnable
            public final void run() {
                AnalyticsClient.m214initOrUpdate$lambda1$lambda0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initOrUpdate$lambda-1$lambda-0, reason: not valid java name */
    public static final void m214initOrUpdate$lambda1$lambda0() {
        INSTANCE.report();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: logError$lambda-2, reason: not valid java name */
    public static final void m215logError$lambda2(Sdk.SDKError.Reason reason, String message, LogEntry logEntry) {
        t.f(reason, "$reason");
        t.f(message, "$message");
        INSTANCE.logErrorInSameThread(reason, message, logEntry);
    }

    public static /* synthetic */ void logError$vungle_ads_release$default(AnalyticsClient analyticsClient, Sdk.SDKError.Reason reason, String str, LogEntry logEntry, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            logEntry = null;
        }
        analyticsClient.logError$vungle_ads_release(reason, str, logEntry);
    }

    private final synchronized void logErrorInSameThread(Sdk.SDKError.Reason reason, String str, LogEntry logEntry) {
        if (logLevel == LogLevel.ERROR_LOG_LEVEL_OFF) {
            return;
        }
        try {
            Sdk.SDKError.Builder builderGenSDKError = genSDKError(reason, str, logEntry);
            BlockingQueue<Sdk.SDKError.Builder> blockingQueue = errors;
            blockingQueue.put(builderGenSDKError);
            Logger.Companion.w(TAG, new C24121(reason, str, builderGenSDKError));
            if (blockingQueue.size() >= 20) {
                report();
            }
        } catch (Exception e10) {
            Logger.Companion.e(TAG, "Cannot logError", e10);
        }
    }

    static /* synthetic */ void logErrorInSameThread$default(AnalyticsClient analyticsClient, Sdk.SDKError.Reason reason, String str, LogEntry logEntry, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            logEntry = null;
        }
        analyticsClient.logErrorInSameThread(reason, str, logEntry);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: logMetric$lambda-8, reason: not valid java name */
    public static final void m216logMetric$lambda8(Sdk.SDKMetric.SDKMetricType metricType, long j10, LogEntry logEntry, String str) {
        t.f(metricType, "$metricType");
        INSTANCE.logMetricInSameThread(metricType, j10, logEntry, str);
    }

    public static /* synthetic */ void logMetric$vungle_ads_release$default(AnalyticsClient analyticsClient, Sdk.SDKMetric.SDKMetricType sDKMetricType, long j10, LogEntry logEntry, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        analyticsClient.logMetric$vungle_ads_release(sDKMetricType, j10, (i10 & 4) != 0 ? null : logEntry, (i10 & 8) != 0 ? null : str);
    }

    private final synchronized void logMetricInSameThread(Sdk.SDKMetric.SDKMetricType sDKMetricType, long j10, LogEntry logEntry, String str) {
        if (metricsEnabled) {
            try {
                Sdk.SDKMetric.Builder builderGenMetric = genMetric(sDKMetricType, j10, logEntry, str);
                BlockingQueue<Sdk.SDKMetric.Builder> blockingQueue = metrics;
                blockingQueue.put(builderGenMetric);
                Logger.Companion.w(TAG, new C24131(sDKMetricType, j10, logEntry, builderGenMetric));
                if (blockingQueue.size() >= 20) {
                    report();
                }
            } catch (Exception e10) {
                Logger.Companion.e(TAG, "Cannot logMetrics", e10);
            }
        }
    }

    static /* synthetic */ void logMetricInSameThread$default(AnalyticsClient analyticsClient, Sdk.SDKMetric.SDKMetricType sDKMetricType, long j10, LogEntry logEntry, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        analyticsClient.logMetricInSameThread(sDKMetricType, j10, (i10 & 4) != 0 ? null : logEntry, (i10 & 8) != 0 ? null : str);
    }

    private final synchronized void report() {
        if (logLevel != LogLevel.ERROR_LOG_LEVEL_OFF && errors.size() > 0) {
            flushErrors();
        }
        if (metricsEnabled && metrics.size() > 0) {
            flushMetrics();
        }
    }

    public final BlockingQueue<Sdk.SDKError.Builder> getErrors$vungle_ads_release() {
        return errors;
    }

    public final VungleThreadPoolExecutor getExecutor$vungle_ads_release() {
        return executor;
    }

    public final BlockingQueue<Sdk.SDKMetric.Builder> getMetrics$vungle_ads_release() {
        return metrics;
    }

    public final boolean getMetricsEnabled$vungle_ads_release() {
        return metricsEnabled;
    }

    public final BlockingQueue<Sdk.SDKError.Builder> getPendingErrors$vungle_ads_release() {
        return pendingErrors;
    }

    public final BlockingQueue<Sdk.SDKMetric.Builder> getPendingMetrics$vungle_ads_release() {
        return pendingMetrics;
    }

    public final boolean getRefreshEnabled$vungle_ads_release() {
        return refreshEnabled;
    }

    public final VungleApiClient getVungleApiClient$vungle_ads_release() {
        return vungleApiClient;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0079 A[Catch: Exception -> 0x007f, all -> 0x00a1, TRY_LEAVE, TryCatch #0 {Exception -> 0x007f, blocks: (B:24:0x0070, B:26:0x0079), top: B:38:0x0070, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x008d A[Catch: all -> 0x00a1, TRY_LEAVE, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x001e, B:12:0x0040, B:14:0x0048, B:17:0x0053, B:18:0x0057, B:20:0x0060, B:24:0x0070, B:26:0x0079, B:30:0x0089, B:32:0x008d, B:29:0x0080, B:23:0x0067, B:6:0x0024, B:8:0x002d, B:9:0x0033, B:11:0x003b), top: B:40:0x0001, inners: #0, #2 }] */
    public final synchronized void initOrUpdate$vungle_ads_release(VungleApiClient vungleApiClient2, final VungleThreadPoolExecutor executor2, int i10, boolean z10) {
        BlockingQueue<Sdk.SDKMetric.Builder> blockingQueue;
        t.f(vungleApiClient2, "vungleApiClient");
        t.f(executor2, "executor");
        logLevel = LogLevel.Companion.fromValue(i10);
        metricsEnabled = z10;
        if (i10 == LogLevel.ERROR_LOG_LEVEL_DEBUG.getLevel()) {
            Logger.Companion.enable$vungle_ads_release(true);
        } else if (i10 == LogLevel.ERROR_LOG_LEVEL_ERROR.getLevel() || i10 == LogLevel.ERROR_LOG_LEVEL_OFF.getLevel()) {
            Logger.Companion.enable$vungle_ads_release(false);
        }
        if (isInitialized.getAndSet(true)) {
            Logger.Companion.d(TAG, "AnalyticsClient already initialized");
            return;
        }
        executor = executor2;
        vungleApiClient = vungleApiClient2;
        try {
            BlockingQueue<Sdk.SDKError.Builder> blockingQueue2 = pendingErrors;
            if (!(!blockingQueue2.isEmpty())) {
                blockingQueue = pendingMetrics;
                if (!blockingQueue.isEmpty()) {
                    blockingQueue.drainTo(metrics);
                }
                if (refreshEnabled) {
                    Executors.newSingleThreadScheduledExecutor().scheduleWithFixedDelay(new Runnable() { // from class: com.vungle.ads.d
                        @Override // java.lang.Runnable
                        public final void run() {
                            AnalyticsClient.m213initOrUpdate$lambda1(executor2);
                        }
                    }, 5000L, 5000L, TimeUnit.MILLISECONDS);
                }
                return;
            }
            blockingQueue2.drainTo(errors);
            try {
                blockingQueue = pendingMetrics;
                if (!blockingQueue.isEmpty()) {
                    blockingQueue.drainTo(metrics);
                }
            } catch (Exception e10) {
                Logger.Companion.e(TAG, "Failed to add pendingMetrics to metrics queue.", e10);
            }
            if (refreshEnabled) {
                Executors.newSingleThreadScheduledExecutor().scheduleWithFixedDelay(new Runnable() { // from class: com.vungle.ads.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnalyticsClient.m213initOrUpdate$lambda1(executor2);
                    }
                }, 5000L, 5000L, TimeUnit.MILLISECONDS);
            }
            return;
        } catch (Exception e11) {
            Logger.Companion.e(TAG, "Failed to add pendingErrors to errors queue.", e11);
        }
        throw th;
    }

    public final AtomicBoolean isInitialized$vungle_ads_release() {
        return isInitialized;
    }

    public final synchronized void logError$vungle_ads_release(final Sdk.SDKError.Reason reason, final String message, final LogEntry logEntry) {
        try {
            t.f(reason, "reason");
            t.f(message, "message");
            try {
                VungleThreadPoolExecutor vungleThreadPoolExecutor = executor;
                if (vungleThreadPoolExecutor == null) {
                    pendingErrors.put(genSDKError(reason, message, logEntry));
                } else {
                    if (vungleThreadPoolExecutor != null) {
                        vungleThreadPoolExecutor.execute(new Runnable() { // from class: com.vungle.ads.a
                            @Override // java.lang.Runnable
                            public final void run() {
                                AnalyticsClient.m215logError$lambda2(reason, message, logEntry);
                            }
                        });
                    }
                }
            } catch (Exception e10) {
                Logger.Companion.e(TAG, "Cannot logError " + reason + ", " + message + ", " + logEntry, e10);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void logMetric$vungle_ads_release(final Sdk.SDKMetric.SDKMetricType metricType, final long j10, final LogEntry logEntry, final String str) {
        t.f(metricType, "metricType");
        try {
            VungleThreadPoolExecutor vungleThreadPoolExecutor = executor;
            if (vungleThreadPoolExecutor == null) {
                pendingMetrics.put(genMetric(metricType, j10, logEntry, str));
            } else {
                if (vungleThreadPoolExecutor != null) {
                    vungleThreadPoolExecutor.execute(new Runnable() { // from class: com.vungle.ads.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            AnalyticsClient.m216logMetric$lambda8(metricType, j10, logEntry, str);
                        }
                    });
                }
            }
        } catch (Exception e10) {
            Logger.Companion.e(TAG, "Cannot logMetric " + metricType + ", " + j10 + ", " + logEntry + ", " + str, e10);
        }
    }

    public final void setExecutor$vungle_ads_release(VungleThreadPoolExecutor vungleThreadPoolExecutor) {
        executor = vungleThreadPoolExecutor;
    }

    public final void setMetricsEnabled$vungle_ads_release(boolean z10) {
        metricsEnabled = z10;
    }

    public final void setRefreshEnabled$vungle_ads_release(boolean z10) {
        refreshEnabled = z10;
    }

    public final void setVungleApiClient$vungle_ads_release(VungleApiClient vungleApiClient2) {
        vungleApiClient = vungleApiClient2;
    }

    public static /* synthetic */ void logMetric$vungle_ads_release$default(AnalyticsClient analyticsClient, SingleValueMetric singleValueMetric, LogEntry logEntry, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            logEntry = null;
        }
        if ((i10 & 4) != 0) {
            str = singleValueMetric.getMeta();
        }
        analyticsClient.logMetric$vungle_ads_release(singleValueMetric, logEntry, str);
    }

    public static /* synthetic */ void logMetric$vungle_ads_release$default(AnalyticsClient analyticsClient, OneShotSingleValueMetric oneShotSingleValueMetric, LogEntry logEntry, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            logEntry = null;
        }
        if ((i10 & 4) != 0) {
            str = oneShotSingleValueMetric.getMeta();
        }
        analyticsClient.logMetric$vungle_ads_release(oneShotSingleValueMetric, logEntry, str);
    }

    public static /* synthetic */ void logMetric$vungle_ads_release$default(AnalyticsClient analyticsClient, TimeIntervalMetric timeIntervalMetric, LogEntry logEntry, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            logEntry = null;
        }
        if ((i10 & 4) != 0) {
            str = timeIntervalMetric.getMeta();
        }
        analyticsClient.logMetric$vungle_ads_release(timeIntervalMetric, logEntry, str);
    }

    public static /* synthetic */ void logMetric$vungle_ads_release$default(AnalyticsClient analyticsClient, OneShotTimeIntervalMetric oneShotTimeIntervalMetric, LogEntry logEntry, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            logEntry = null;
        }
        if ((i10 & 4) != 0) {
            str = oneShotTimeIntervalMetric.getMeta();
        }
        analyticsClient.logMetric$vungle_ads_release(oneShotTimeIntervalMetric, logEntry, str);
    }

    public final synchronized void logMetric$vungle_ads_release(SingleValueMetric singleValueMetric, LogEntry logEntry, String str) {
        t.f(singleValueMetric, "singleValueMetric");
        logMetric$vungle_ads_release(singleValueMetric.getMetricType(), singleValueMetric.getValue(), logEntry, str);
    }

    public final synchronized void logMetric$vungle_ads_release(OneShotSingleValueMetric oneShotSingleValueMetric, LogEntry logEntry, String str) {
        t.f(oneShotSingleValueMetric, "oneShotSingleValueMetric");
        if (!oneShotSingleValueMetric.isLogged()) {
            logMetric$vungle_ads_release((SingleValueMetric) oneShotSingleValueMetric, logEntry, str);
            oneShotSingleValueMetric.markLogged();
        }
    }

    public static /* synthetic */ void getErrors$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getExecutor$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getMetrics$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getMetricsEnabled$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getPendingErrors$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getPendingMetrics$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getRefreshEnabled$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getVungleApiClient$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void isInitialized$vungle_ads_release$annotations() {
    }

    public final synchronized void logMetric$vungle_ads_release(TimeIntervalMetric timeIntervalMetric, LogEntry logEntry, String str) {
        t.f(timeIntervalMetric, "timeIntervalMetric");
        logMetric$vungle_ads_release(timeIntervalMetric.getMetricType(), timeIntervalMetric.getValue(), logEntry, str);
    }

    public final synchronized void logMetric$vungle_ads_release(OneShotTimeIntervalMetric oneShotTimeIntervalMetric, LogEntry logEntry, String str) {
        t.f(oneShotTimeIntervalMetric, "oneShotTimeIntervalMetric");
        if (!oneShotTimeIntervalMetric.isLogged()) {
            logMetric$vungle_ads_release((TimeIntervalMetric) oneShotTimeIntervalMetric, logEntry, str);
            oneShotTimeIntervalMetric.markLogged();
        }
    }
}
