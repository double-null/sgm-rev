package com.vungle.ads.internal.downloader;

import af.f;
import af.g;
import af.n;
import af.q;
import af.r;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.AssetWriteError;
import com.vungle.ads.InvalidAssetUrlError;
import com.vungle.ads.NoSpaceError;
import com.vungle.ads.OutOfMemory;
import com.vungle.ads.SingleValueMetric;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.executor.VungleThreadPoolExecutor;
import com.vungle.ads.internal.model.AdAsset;
import com.vungle.ads.internal.network.converters.vY.cTJaRZ;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.task.PriorityRunnable;
import com.vungle.ads.internal.util.FileUtility;
import com.vungle.ads.internal.util.Logger;
import com.vungle.ads.internal.util.PathProvider;
import g7.EinF.ZHgPsTG;
import java.io.File;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.t;
import me.b0;
import me.c;
import me.c0;
import me.e;
import me.x;
import me.z;
import pb.vBC.NyXuoef;
import se.h;
import wc.g0;
import wc.k;
import wc.m;

/* JADX INFO: compiled from: AssetDownloader.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class AssetDownloader implements Downloader {
    private static final String CONTENT_ENCODING = "Content-Encoding";
    private static final String CONTENT_TYPE = "Content-Type";
    public static final Companion Companion = new Companion(null);
    private static final int DOWNLOAD_CHUNK_SIZE = 8192;
    private static final long DOWNLOAD_RETRY_FAILURE = 2;
    private static final long DOWNLOAD_RETRY_SUCCESS = 1;
    private static final String GZIP = "gzip";
    private static final int MAX_PERCENT = 100;
    private static final int MINIMUM_SPACE_REQUIRED_MB = 20971520;
    private static final int PROGRESS_STEP = 1;
    private static final String TAG = "AssetDownloader";
    private final VungleThreadPoolExecutor downloadExecutor;
    private final k okHttpClient$delegate;
    private final PathProvider pathProvider;
    private final CopyOnWriteArrayList<DownloadRequest> transitioning;

    /* JADX INFO: compiled from: AssetDownloader.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: AssetDownloader.kt */
    static final class OkHttpSingleton {
        public static final OkHttpSingleton INSTANCE = new OkHttpSingleton();
        private static x client;

        private OkHttpSingleton() {
        }

        public final x createOkHttpClient(PathProvider pathProvider) {
            t.f(pathProvider, "pathProvider");
            x xVar = client;
            if (xVar != null) {
                return xVar;
            }
            x.a aVar = new x.a();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            x.a aVarF = aVar.L(60L, timeUnit).d(60L, timeUnit).c(null).e(true).f(true);
            ConfigManager configManager = ConfigManager.INSTANCE;
            long cleverCacheDiskSize = configManager.getCleverCacheDiskSize();
            int cleverCacheDiskPercentage = configManager.getCleverCacheDiskPercentage();
            String absolutePath = pathProvider.getCleverCacheDir().getAbsolutePath();
            t.e(absolutePath, "pathProvider.getCleverCacheDir().absolutePath");
            long jMin = Math.min(cleverCacheDiskSize, (pathProvider.getAvailableBytes(absolutePath) * ((long) cleverCacheDiskPercentage)) / ((long) 100));
            if (jMin > 0) {
                aVarF.c(new c(pathProvider.getCleverCacheDir(), jMin));
            } else {
                Logger.Companion.w(AssetDownloader.TAG, "cache disk capacity size <=0, no clever cache active.");
            }
            x xVarB = aVarF.b();
            client = xVarB;
            return xVarB;
        }
    }

    private final boolean checkSpaceAvailable(DownloadRequest downloadRequest) {
        PathProvider pathProvider = this.pathProvider;
        String absolutePath = pathProvider.getVungleDir().getAbsolutePath();
        t.e(absolutePath, "pathProvider.getVungleDir().absolutePath");
        long availableBytes = pathProvider.getAvailableBytes(absolutePath);
        if (availableBytes >= 20971520) {
            return true;
        }
        new NoSpaceError("Insufficient space " + availableBytes).setLogEntry$vungle_ads_release(downloadRequest.getLogEntry$vungle_ads_release()).logErrorNoReturnValue$vungle_ads_release();
        return false;
    }

    private final c0 decodeGzipIfNeeded(b0 b0Var) {
        c0 c0VarB = b0Var.b();
        if (!rd.c0.B(GZIP, b0.p(b0Var, CONTENT_ENCODING, null, 2, null), true) || c0VarB == null) {
            return c0VarB;
        }
        return new h(b0.p(b0Var, CONTENT_TYPE, null, 2, null), -1L, q.d(new n(c0VarB.source())));
    }

    private final void deliverError(DownloadRequest downloadRequest, AssetDownloadListener assetDownloadListener, AssetDownloadListener.DownloadError downloadError) {
        if (assetDownloadListener != null) {
            assetDownloadListener.onError(downloadError, downloadRequest);
        }
    }

    private final void deliverSuccess(File file, DownloadRequest downloadRequest, AssetDownloadListener assetDownloadListener) {
        Logger.Companion.d(TAG, "On success " + downloadRequest);
        if (assetDownloadListener != null) {
            assetDownloadListener.onSuccess(file, downloadRequest);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: download$lambda-0, reason: not valid java name */
    public static final void m252download$lambda0(DownloadRequest downloadRequest, AssetDownloader this$0, AssetDownloadListener assetDownloadListener) {
        t.f(this$0, "this$0");
        this$0.deliverError(downloadRequest, assetDownloadListener, new AssetDownloadListener.DownloadError(-1, new OutOfMemory("Failed to execute download request: " + downloadRequest.getAsset().getServerPath()), AssetDownloadListener.DownloadError.ErrorReason.Companion.getINTERNAL_ERROR()));
    }

    private final x getOkHttpClient() {
        return (x) this.okHttpClient$delegate.getValue();
    }

    private final void onProgressChanged(DownloadRequest downloadRequest, AssetDownloadListener.Progress progress, AssetDownloadListener assetDownloadListener) {
        if (assetDownloadListener != null) {
            assetDownloadListener.onProgress(progress, downloadRequest);
        }
    }

    private final boolean shouldRetryDownload(DownloadRequest downloadRequest, AssetDownloadListener.DownloadError downloadError) {
        if (downloadRequest.isCancelled()) {
            Logger.Companion.d(TAG, "Download cancelled, not retrying");
            return false;
        }
        Integer percentage = downloadRequest.getAsset().getPercentage();
        if (percentage != null && percentage.intValue() < 100) {
            Logger.Companion.d(TAG, "Partial download asset (percentage=" + percentage + "), not retrying");
            return false;
        }
        if (!downloadRequest.canRetry$vungle_ads_release()) {
            Logger.Companion.d(TAG, "Max retry attempts reached (" + downloadRequest.getMaxRetries$vungle_ads_release() + ')');
            return false;
        }
        if (AssetDownloadListener.DownloadError.Companion.shouldRetry(downloadError)) {
            return true;
        }
        Logger.Companion.d(TAG, "Error reason " + downloadError.getReason() + " is not retryable");
        return false;
    }

    @Override // com.vungle.ads.internal.downloader.Downloader
    public void cancel(DownloadRequest downloadRequest) {
        if (downloadRequest == null || downloadRequest.isCancelled()) {
            return;
        }
        downloadRequest.cancel();
    }

    @Override // com.vungle.ads.internal.downloader.Downloader
    public void cancelAll() {
        Iterator<T> it = this.transitioning.iterator();
        while (it.hasNext()) {
            cancel((DownloadRequest) it.next());
        }
        this.transitioning.clear();
    }

    @Override // com.vungle.ads.internal.downloader.Downloader
    public void download(final DownloadRequest downloadRequest, final AssetDownloadListener assetDownloadListener) {
        if (downloadRequest == null) {
            return;
        }
        this.transitioning.add(downloadRequest);
        this.downloadExecutor.execute(new PriorityRunnable() { // from class: com.vungle.ads.internal.downloader.AssetDownloader.download.1
            @Override // com.vungle.ads.internal.task.PriorityRunnable
            public int getPriority() {
                return downloadRequest.getPriority();
            }

            @Override // java.lang.Runnable
            public void run() throws Throwable {
                AssetDownloader.this.launchRequestWithRetry(downloadRequest, assetDownloadListener);
            }
        }, new Runnable() { // from class: com.vungle.ads.internal.downloader.a
            @Override // java.lang.Runnable
            public final void run() {
                AssetDownloader.m252download$lambda0(downloadRequest, this, assetDownloadListener);
            }
        });
    }

    public AssetDownloader(VungleThreadPoolExecutor downloadExecutor, PathProvider pathProvider) {
        t.f(downloadExecutor, "downloadExecutor");
        t.f(pathProvider, ZHgPsTG.TeRUdFY);
        this.downloadExecutor = downloadExecutor;
        this.pathProvider = pathProvider;
        this.okHttpClient$delegate = m.a(new AssetDownloader$okHttpClient$2(this));
        this.transitioning = new CopyOnWriteArrayList<>();
    }

    /* JADX WARN: Code duplicated, block: B:106:0x029c A[Catch: all -> 0x03c1, Exception -> 0x03cf, TRY_ENTER, TryCatch #41 {Exception -> 0x03cf, all -> 0x03c1, blocks: (B:102:0x028b, B:106:0x029c, B:108:0x02a2, B:112:0x02c1), top: B:328:0x028b }] */
    /* JADX WARN: Code duplicated, block: B:108:0x02a2 A[Catch: all -> 0x03c1, Exception -> 0x03cf, TRY_LEAVE, TryCatch #41 {Exception -> 0x03cf, all -> 0x03c1, blocks: (B:102:0x028b, B:106:0x029c, B:108:0x02a2, B:112:0x02c1), top: B:328:0x028b }] */
    /* JADX WARN: Code duplicated, block: B:110:0x02bc A[Catch: all -> 0x0265, Exception -> 0x026f, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x026f, blocks: (B:92:0x0258, B:104:0x0291, B:110:0x02bc), top: B:281:0x0258 }] */
    /* JADX WARN: Code duplicated, block: B:112:0x02c1 A[Catch: all -> 0x03c1, Exception -> 0x03cf, TRY_ENTER, TRY_LEAVE, TryCatch #41 {Exception -> 0x03cf, all -> 0x03c1, blocks: (B:102:0x028b, B:106:0x029c, B:108:0x02a2, B:112:0x02c1), top: B:328:0x028b }] */
    /* JADX WARN: Code duplicated, block: B:116:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:131:0x0307  */
    /* JADX WARN: Code duplicated, block: B:134:0x0315 A[Catch: Exception -> 0x031a, all -> 0x0371, TRY_LEAVE, TryCatch #9 {all -> 0x0371, blocks: (B:123:0x02e1, B:134:0x0315, B:139:0x0329, B:141:0x0335, B:143:0x0346, B:145:0x034f), top: B:292:0x02e1 }] */
    /* JADX WARN: Code duplicated, block: B:138:0x0327  */
    /* JADX WARN: Code duplicated, block: B:141:0x0335 A[Catch: all -> 0x0371, Exception -> 0x0373, TRY_LEAVE, TryCatch #6 {Exception -> 0x0373, blocks: (B:139:0x0329, B:141:0x0335), top: B:289:0x0329 }] */
    /* JADX WARN: Code duplicated, block: B:145:0x034f A[Catch: Exception -> 0x035c, all -> 0x0371, TRY_LEAVE, TryCatch #9 {all -> 0x0371, blocks: (B:123:0x02e1, B:134:0x0315, B:139:0x0329, B:141:0x0335, B:143:0x0346, B:145:0x034f), top: B:292:0x02e1 }] */
    /* JADX WARN: Code duplicated, block: B:177:0x03fb A[Catch: all -> 0x03bd, Exception -> 0x03bf, TRY_ENTER, TRY_LEAVE, TryCatch #43 {Exception -> 0x03bf, all -> 0x03bd, blocks: (B:147:0x0358, B:160:0x0388, B:161:0x03bc, B:177:0x03fb), top: B:325:0x0358 }] */
    /* JADX WARN: Code duplicated, block: B:180:0x040b  */
    /* JADX WARN: Code duplicated, block: B:213:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:240:0x0552  */
    /* JADX WARN: Code duplicated, block: B:241:0x0557  */
    /* JADX WARN: Code duplicated, block: B:243:0x055a  */
    /* JADX WARN: Code duplicated, block: B:247:0x0567  */
    /* JADX WARN: Code duplicated, block: B:251:0x0597  */
    /* JADX WARN: Code duplicated, block: B:252:0x059a  */
    /* JADX WARN: Code duplicated, block: B:257:0x05a4  */
    /* JADX WARN: Code duplicated, block: B:258:0x05a6  */
    /* JADX WARN: Code duplicated, block: B:260:0x05ac  */
    /* JADX WARN: Code duplicated, block: B:262:0x05c7  */
    /* JADX WARN: Code duplicated, block: B:264:0x05d2  */
    /* JADX WARN: Code duplicated, block: B:269:0x060a  */
    /* JADX WARN: Code duplicated, block: B:270:0x060f  */
    /* JADX WARN: Code duplicated, block: B:272:0x0612  */
    /* JADX WARN: Code duplicated, block: B:276:0x061f  */
    /* JADX WARN: Code duplicated, block: B:281:0x0258 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:285:0x01bf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:287:0x018c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:300:0x01cf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:303:0x0217 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:328:0x028b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:338:0x03e2 A[EDGE_INSN: B:338:0x03e2->B:174:0x03e2 BREAK  A[LOOP:0: B:91:0x0256->B:150:0x035f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:339:0x0291 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:340:0x0388 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x0186 A[Catch: Exception -> 0x04d0, all -> 0x04db, TRY_LEAVE, TryCatch #23 {Exception -> 0x04d0, blocks: (B:45:0x0180, B:47:0x0186), top: B:311:0x0180 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x01e4 A[Catch: all -> 0x01aa, Exception -> 0x01d9, TRY_LEAVE, TryCatch #5 {all -> 0x01aa, blocks: (B:49:0x018c, B:50:0x018e, B:65:0x01cf, B:69:0x01e4), top: B:287:0x018c }] */
    /* JADX WARN: Code duplicated, block: B:71:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:86:0x0234  */
    /* JADX WARN: Code duplicated, block: B:98:0x027f  */
    /* JADX WARN: Instruction removed from duplicated block: B:260:0x05ac, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:264:0x05d2, please report this as an issue */
    private final AssetDownloadListener.DownloadError launchRequest(DownloadRequest downloadRequest, AssetDownloadListener assetDownloadListener) throws Throwable {
        g gVarSource;
        f fVar;
        b0 b0VarExecute;
        e eVarA;
        boolean z10;
        f fVarC;
        c0 c0VarB;
        c0 c0VarB2;
        AssetDownloadListener.DownloadError downloadError;
        int status;
        AssetDownloadListener.Progress.ProgressStatus.Companion companion;
        boolean z11;
        int currentRetryAttempt$vungle_ads_release;
        c0 c0VarB3;
        c0 c0VarB4;
        int i10;
        c0 c0VarDecodeGzipIfNeeded;
        String strP;
        long jContentLength;
        String str;
        int i11;
        long j10;
        long j11;
        g gVar;
        int status2;
        AssetDownloadListener.Progress.ProgressStatus.Companion companion2;
        c0 c0VarB5;
        g gVar2;
        long j12;
        Long rangeEnd;
        long rangeStart;
        int i12;
        g gVar3;
        int i13;
        AssetDownloadListener.Progress.ProgressStatus.Companion companion3;
        AssetDownloader assetDownloader = this;
        String str2 = "download status: ";
        AdAsset asset = downloadRequest.getAsset();
        Logger.Companion companion4 = Logger.Companion;
        companion4.d(TAG, NyXuoef.pxFkfHJUVJS + Thread.currentThread().getId() + " request: " + asset.getServerPath());
        if (downloadRequest.isCancelled()) {
            companion4.d(TAG, "Request " + asset.getServerPath() + " is cancelled before starting");
            new AssetDownloadListener.Progress().setStatus(AssetDownloadListener.Progress.ProgressStatus.Companion.getCANCELLED());
            return null;
        }
        AssetDownloadListener.Progress progress = new AssetDownloadListener.Progress();
        progress.setTimestampDownloadStart(System.currentTimeMillis());
        String serverPath = asset.getServerPath();
        String localPath = asset.getLocalPath();
        int iH = -1;
        if ((serverPath.length() == 0) || !FileUtility.INSTANCE.isValidUrl(serverPath)) {
            return new AssetDownloadListener.DownloadError(-1, new InvalidAssetUrlError("invalid url: " + serverPath).setLogEntry$vungle_ads_release(downloadRequest.getLogEntry$vungle_ads_release()).logError$vungle_ads_release(), AssetDownloadListener.DownloadError.ErrorReason.Companion.getINTERNAL_ERROR());
        }
        if (localPath.length() == 0) {
            return new AssetDownloadListener.DownloadError(-1, new AssetWriteError("invalid path: " + localPath).setLogEntry$vungle_ads_release(downloadRequest.getLogEntry$vungle_ads_release()).logError$vungle_ads_release(), AssetDownloadListener.DownloadError.ErrorReason.Companion.getFILE_NOT_FOUND_ERROR());
        }
        if (!checkSpaceAvailable(downloadRequest)) {
            return new AssetDownloadListener.DownloadError(-1, new NoSpaceError(null, 1, null).setLogEntry$vungle_ads_release(downloadRequest.getLogEntry$vungle_ads_release()).logError$vungle_ads_release(), AssetDownloadListener.DownloadError.ErrorReason.Companion.getDISK_ERROR());
        }
        File file = new File(localPath);
        if (file.exists()) {
            companion4.d(TAG, "Deleting existing file before download: " + file.getAbsolutePath());
            if (!file.delete()) {
                return new AssetDownloadListener.DownloadError(-1, new AssetWriteError("Cannot delete partial file for restart").setLogEntry$vungle_ads_release(downloadRequest.getLogEntry$vungle_ads_release()).logError$vungle_ads_release(), AssetDownloadListener.DownloadError.ErrorReason.Companion.getDISK_ERROR());
            }
        }
        try {
            File parentFile = file.getParentFile();
            if (parentFile == null) {
                eVarA = getOkHttpClient().a(new z.a().n(serverPath).b());
                b0VarExecute = eVarA.execute();
                iH = b0VarExecute.h();
                if (!b0VarExecute.t()) {
                    eVarA = eVarA;
                    z10 = true;
                    i10 = iH;
                    throw new Downloader.RequestException(b0VarExecute.u());
                }
                if (b0VarExecute.e() != null) {
                    c0VarDecodeGzipIfNeeded = assetDownloader.decodeGzipIfNeeded(b0VarExecute);
                    i10 = iH;
                    strP = b0.p(b0VarExecute, CONTENT_TYPE, null, 2, null);
                    if (strP != null) {
                        downloadRequest.getAsset().setMimeType(strP);
                        g0 g0Var = g0.f27756a;
                    }
                    if (c0VarDecodeGzipIfNeeded != null) {
                        gVarSource = c0VarDecodeGzipIfNeeded.source();
                    } else {
                        gVarSource = null;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    str2 = "download status: ";
                    sb2.append("Start download from url: ");
                    sb2.append(serverPath);
                    sb2.append(" mimeType=");
                    sb2.append(strP);
                    companion4.d(TAG, sb2.toString());
                    fVarC = q.c(r.g(file, false, 1, null));
                    if (c0VarDecodeGzipIfNeeded != null) {
                        jContentLength = c0VarDecodeGzipIfNeeded.contentLength();
                    } else {
                        jContentLength = 0;
                    }
                    progress.setStatus(AssetDownloadListener.Progress.ProgressStatus.Companion.getSTARTED());
                    progress.setSizeBytes(jContentLength);
                    str = serverPath;
                    progress.setReadBytes(0L);
                    progress.setProgressPercent(0);
                    asset = asset;
                    asset.setContentLength(jContentLength);
                    assetDownloader.onProgressChanged(downloadRequest, progress, assetDownloadListener);
                    i11 = 0;
                    j10 = 0;
                    while (true) {
                        if (gVarSource != null) {
                            j11 = gVarSource.read(fVarC.getBuffer(), 8192L);
                        } else {
                            j11 = -1;
                        }
                        g0 g0Var2 = g0.f27756a;
                        if (j11 > 0) {
                            break;
                            break;
                        }
                        if (downloadRequest.isCancelled()) {
                            progress.setStatus(AssetDownloadListener.Progress.ProgressStatus.Companion.getCANCELLED());
                            break;
                        }
                        if (file.exists()) {
                            new AssetWriteError("Asset save error " + str).setLogEntry$vungle_ads_release(downloadRequest.getLogEntry$vungle_ads_release()).logErrorNoReturnValue$vungle_ads_release();
                            throw new Downloader.RequestException("File is not existing");
                        }
                        progress.setStatus(AssetDownloadListener.Progress.ProgressStatus.Companion.getIN_PROGRESS());
                        fVarC.emit();
                        fVarC.flush();
                        j12 = j10 + j11;
                        progress.setReadBytes(j12);
                        rangeEnd = asset.getRangeEnd();
                        if (rangeEnd != null) {
                            rangeStart = rangeEnd.longValue();
                        } else {
                            rangeStart = asset.getRangeStart();
                        }
                        i12 = i11;
                        gVar3 = gVarSource;
                        long j13 = rangeStart;
                        if (asset.isWaitingForDownload()) {
                            gVar2 = gVar3;
                            eVarA = eVarA;
                            file = file;
                        } else {
                            gVar2 = gVar3;
                            eVarA = eVarA;
                            file = file;
                        }
                        if (jContentLength > 0) {
                            i13 = (int) ((((long) 100) * j12) / jContentLength);
                        } else {
                            i13 = i12;
                        }
                        while (progress.getProgressPercent() + 1 <= Math.min(i13, 100)) {
                            companion3 = AssetDownloadListener.Progress.ProgressStatus.Companion;
                            progress.setStatus(companion3.getIN_PROGRESS());
                            z10 = true;
                            progress.setProgressPercent(progress.getProgressPercent() + 1);
                            if (progress.getProgressPercent() >= 100) {
                                progress.setStatus(companion3.getDONE());
                            }
                            assetDownloader = this;
                            assetDownloader.onProgressChanged(downloadRequest, progress, assetDownloadListener);
                        }
                        i11 = i13;
                        file = file;
                        gVarSource = gVar2;
                        eVarA = eVarA;
                        j10 = j12;
                        str = str;
                        assetDownloader = this;
                        iH = i10;
                        str2 = str2;
                        gVarSource = gVar2;
                        Logger.Companion companion5 = Logger.Companion;
                        companion5.e(TAG, "Download exception for " + asset.getServerPath() + ": " + e);
                        progress.setStatus(AssetDownloadListener.Progress.ProgressStatus.Companion.getERROR());
                        AssetDownloadListener.DownloadError downloadError2 = new AssetDownloadListener.DownloadError(iH, e, AssetDownloadListener.DownloadError.ErrorReason.Companion.getREQUEST_ERROR());
                        if (b0VarExecute != null) {
                            c0VarB3 = b0VarExecute.b();
                        } else {
                            c0VarB3 = null;
                        }
                        if (c0VarB3 != null) {
                            c0VarB4.close();
                            g0 g0Var3 = g0.f27756a;
                        }
                        if (eVarA != null) {
                            eVarA.cancel();
                            g0 g0Var4 = g0.f27756a;
                        }
                        FileUtility fileUtility = FileUtility.INSTANCE;
                        fileUtility.closeQuietly(fVarC);
                        fileUtility.closeQuietly(gVarSource);
                        companion5.d(TAG, str2 + progress.getStatus());
                        downloadError = downloadError2;
                        status = progress.getStatus();
                        companion = AssetDownloadListener.Progress.ProgressStatus.Companion;
                        if (status == companion.getERROR()) {
                            z11 = z10;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            return downloadError;
                        }
                        if (status == companion.getCANCELLED()) {
                            Logger.Companion.d(TAG, "On cancel " + downloadRequest);
                            assetDownloader.onProgressChanged(downloadRequest, progress, assetDownloadListener);
                        } else {
                            assetDownloader.deliverSuccess(file, downloadRequest, assetDownloadListener);
                            currentRetryAttempt$vungle_ads_release = downloadRequest.getCurrentRetryAttempt$vungle_ads_release();
                            if (currentRetryAttempt$vungle_ads_release > 0) {
                                AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(Sdk.SDKMetric.SDKMetricType.ASSET_DOWNLOAD_RETRY_STATUS, 1L, downloadRequest.getLogEntry$vungle_ads_release(), "retryCount=" + currentRetryAttempt$vungle_ads_release + " url=" + downloadRequest.getAsset().getServerPath());
                            }
                        }
                        return null;
                    }
                    z10 = true;
                    eVarA = eVarA;
                    file = file;
                    gVar = gVarSource;
                    assetDownloader = this;
                    fVarC.flush();
                    status2 = progress.getStatus();
                    companion2 = AssetDownloadListener.Progress.ProgressStatus.Companion;
                    if (status2 == companion2.getIN_PROGRESS()) {
                        progress.setStatus(companion2.getDONE());
                        assetDownloader.onProgressChanged(downloadRequest, progress, assetDownloadListener);
                    }
                    if (b0VarExecute.b() != null) {
                        c0VarB5.close();
                    }
                    eVarA.cancel();
                    FileUtility fileUtility2 = FileUtility.INSTANCE;
                    fileUtility2.closeQuietly(fVarC);
                    fileUtility2.closeQuietly(gVar);
                    Logger.Companion.d(TAG, str2 + progress.getStatus());
                    downloadError = null;
                    status = progress.getStatus();
                    companion = AssetDownloadListener.Progress.ProgressStatus.Companion;
                    if (status == companion.getERROR()) {
                        z11 = z10;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        return downloadError;
                    }
                    if (status == companion.getCANCELLED()) {
                        Logger.Companion.d(TAG, "On cancel " + downloadRequest);
                        assetDownloader.onProgressChanged(downloadRequest, progress, assetDownloadListener);
                    } else {
                        assetDownloader.deliverSuccess(file, downloadRequest, assetDownloadListener);
                        currentRetryAttempt$vungle_ads_release = downloadRequest.getCurrentRetryAttempt$vungle_ads_release();
                        if (currentRetryAttempt$vungle_ads_release > 0) {
                            AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(Sdk.SDKMetric.SDKMetricType.ASSET_DOWNLOAD_RETRY_STATUS, 1L, downloadRequest.getLogEntry$vungle_ads_release(), "retryCount=" + currentRetryAttempt$vungle_ads_release + " url=" + downloadRequest.getAsset().getServerPath());
                        }
                    }
                    return null;
                }
                AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.CACHED_ASSETS_USED), downloadRequest.getLogEntry$vungle_ads_release(), serverPath);
                g0 g0Var5 = g0.f27756a;
                c0VarDecodeGzipIfNeeded = assetDownloader.decodeGzipIfNeeded(b0VarExecute);
                i10 = iH;
                strP = b0.p(b0VarExecute, CONTENT_TYPE, null, 2, null);
                if (strP != null) {
                    downloadRequest.getAsset().setMimeType(strP);
                    g0 g0Var6 = g0.f27756a;
                }
                if (c0VarDecodeGzipIfNeeded != null) {
                    gVarSource = c0VarDecodeGzipIfNeeded.source();
                } else {
                    gVarSource = null;
                }
                StringBuilder sb3 = new StringBuilder();
                str2 = "download status: ";
                sb3.append("Start download from url: ");
                sb3.append(serverPath);
                sb3.append(" mimeType=");
                sb3.append(strP);
                companion4.d(TAG, sb3.toString());
                fVarC = q.c(r.g(file, false, 1, null));
                if (c0VarDecodeGzipIfNeeded != null) {
                    jContentLength = c0VarDecodeGzipIfNeeded.contentLength();
                } else {
                    jContentLength = 0;
                }
                progress.setStatus(AssetDownloadListener.Progress.ProgressStatus.Companion.getSTARTED());
                progress.setSizeBytes(jContentLength);
                str = serverPath;
                progress.setReadBytes(0L);
                progress.setProgressPercent(0);
                asset = asset;
                asset.setContentLength(jContentLength);
                assetDownloader.onProgressChanged(downloadRequest, progress, assetDownloadListener);
                i11 = 0;
                j10 = 0;
                while (true) {
                    if (gVarSource != null) {
                        j11 = gVarSource.read(fVarC.getBuffer(), 8192L);
                    } else {
                        j11 = -1;
                    }
                    g0 g0Var7 = g0.f27756a;
                    if (j11 > 0) {
                        break;
                        break;
                    }
                    if (downloadRequest.isCancelled()) {
                        progress.setStatus(AssetDownloadListener.Progress.ProgressStatus.Companion.getCANCELLED());
                        break;
                    }
                    if (file.exists()) {
                        new AssetWriteError("Asset save error " + str).setLogEntry$vungle_ads_release(downloadRequest.getLogEntry$vungle_ads_release()).logErrorNoReturnValue$vungle_ads_release();
                        throw new Downloader.RequestException("File is not existing");
                    }
                    progress.setStatus(AssetDownloadListener.Progress.ProgressStatus.Companion.getIN_PROGRESS());
                    fVarC.emit();
                    fVarC.flush();
                    j12 = j10 + j11;
                    progress.setReadBytes(j12);
                    rangeEnd = asset.getRangeEnd();
                    if (rangeEnd != null) {
                        rangeStart = rangeEnd.longValue();
                    } else {
                        rangeStart = asset.getRangeStart();
                    }
                    i12 = i11;
                    gVar3 = gVarSource;
                    long j14 = rangeStart;
                    if (asset.isWaitingForDownload()) {
                        gVar2 = gVar3;
                        eVarA = eVarA;
                        file = file;
                    } else {
                        gVar2 = gVar3;
                        eVarA = eVarA;
                        file = file;
                    }
                    if (jContentLength > 0) {
                        i13 = (int) ((((long) 100) * j12) / jContentLength);
                    } else {
                        i13 = i12;
                    }
                    while (progress.getProgressPercent() + 1 <= Math.min(i13, 100)) {
                        companion3 = AssetDownloadListener.Progress.ProgressStatus.Companion;
                        progress.setStatus(companion3.getIN_PROGRESS());
                        z10 = true;
                        progress.setProgressPercent(progress.getProgressPercent() + 1);
                        if (progress.getProgressPercent() >= 100) {
                            progress.setStatus(companion3.getDONE());
                        }
                        assetDownloader = this;
                        assetDownloader.onProgressChanged(downloadRequest, progress, assetDownloadListener);
                    }
                    i11 = i13;
                    file = file;
                    gVarSource = gVar2;
                    eVarA = eVarA;
                    j10 = j12;
                    str = str;
                    assetDownloader = this;
                    iH = i10;
                    str2 = str2;
                    gVarSource = gVar2;
                    Logger.Companion companion6 = Logger.Companion;
                    companion6.e(TAG, "Download exception for " + asset.getServerPath() + ": " + e);
                    progress.setStatus(AssetDownloadListener.Progress.ProgressStatus.Companion.getERROR());
                    AssetDownloadListener.DownloadError downloadError3 = new AssetDownloadListener.DownloadError(iH, e, AssetDownloadListener.DownloadError.ErrorReason.Companion.getREQUEST_ERROR());
                    if (b0VarExecute != null) {
                        c0VarB3 = b0VarExecute.b();
                    } else {
                        c0VarB3 = null;
                    }
                    if (c0VarB3 != null) {
                        c0VarB4.close();
                        g0 g0Var8 = g0.f27756a;
                    }
                    if (eVarA != null) {
                        eVarA.cancel();
                        g0 g0Var9 = g0.f27756a;
                    }
                    FileUtility fileUtility3 = FileUtility.INSTANCE;
                    fileUtility3.closeQuietly(fVarC);
                    fileUtility3.closeQuietly(gVarSource);
                    companion6.d(TAG, str2 + progress.getStatus());
                    downloadError = downloadError3;
                    status = progress.getStatus();
                    companion = AssetDownloadListener.Progress.ProgressStatus.Companion;
                    if (status == companion.getERROR()) {
                        z11 = z10;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        return downloadError;
                    }
                    if (status == companion.getCANCELLED()) {
                        Logger.Companion.d(TAG, "On cancel " + downloadRequest);
                        assetDownloader.onProgressChanged(downloadRequest, progress, assetDownloadListener);
                    } else {
                        assetDownloader.deliverSuccess(file, downloadRequest, assetDownloadListener);
                        currentRetryAttempt$vungle_ads_release = downloadRequest.getCurrentRetryAttempt$vungle_ads_release();
                        if (currentRetryAttempt$vungle_ads_release > 0) {
                            AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(Sdk.SDKMetric.SDKMetricType.ASSET_DOWNLOAD_RETRY_STATUS, 1L, downloadRequest.getLogEntry$vungle_ads_release(), "retryCount=" + currentRetryAttempt$vungle_ads_release + " url=" + downloadRequest.getAsset().getServerPath());
                        }
                    }
                    return null;
                }
                z10 = true;
                eVarA = eVarA;
                file = file;
                gVar = gVarSource;
                assetDownloader = this;
                fVarC.flush();
                status2 = progress.getStatus();
                companion2 = AssetDownloadListener.Progress.ProgressStatus.Companion;
                if (status2 == companion2.getIN_PROGRESS()) {
                    progress.setStatus(companion2.getDONE());
                    assetDownloader.onProgressChanged(downloadRequest, progress, assetDownloadListener);
                }
                if (b0VarExecute.b() != null) {
                    c0VarB5.close();
                }
                eVarA.cancel();
                FileUtility fileUtility4 = FileUtility.INSTANCE;
                fileUtility4.closeQuietly(fVarC);
                fileUtility4.closeQuietly(gVar);
                Logger.Companion.d(TAG, str2 + progress.getStatus());
                downloadError = null;
                status = progress.getStatus();
                companion = AssetDownloadListener.Progress.ProgressStatus.Companion;
                if (status == companion.getERROR()) {
                    z11 = z10;
                } else {
                    z11 = false;
                }
                if (z11) {
                    return downloadError;
                }
                if (status == companion.getCANCELLED()) {
                    Logger.Companion.d(TAG, "On cancel " + downloadRequest);
                    assetDownloader.onProgressChanged(downloadRequest, progress, assetDownloadListener);
                } else {
                    assetDownloader.deliverSuccess(file, downloadRequest, assetDownloadListener);
                    currentRetryAttempt$vungle_ads_release = downloadRequest.getCurrentRetryAttempt$vungle_ads_release();
                    if (currentRetryAttempt$vungle_ads_release > 0) {
                        AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(Sdk.SDKMetric.SDKMetricType.ASSET_DOWNLOAD_RETRY_STATUS, 1L, downloadRequest.getLogEntry$vungle_ads_release(), "retryCount=" + currentRetryAttempt$vungle_ads_release + " url=" + downloadRequest.getAsset().getServerPath());
                    }
                }
                return null;
                iH = i10;
                fVarC = null;
                gVarSource = null;
                Logger.Companion companion7 = Logger.Companion;
                companion7.e(TAG, "Download exception for " + asset.getServerPath() + ": " + e);
                progress.setStatus(AssetDownloadListener.Progress.ProgressStatus.Companion.getERROR());
                AssetDownloadListener.DownloadError downloadError4 = new AssetDownloadListener.DownloadError(iH, e, AssetDownloadListener.DownloadError.ErrorReason.Companion.getREQUEST_ERROR());
                if (b0VarExecute != null) {
                    c0VarB3 = b0VarExecute.b();
                } else {
                    c0VarB3 = null;
                }
                if (c0VarB3 != null) {
                    c0VarB4.close();
                    g0 g0Var10 = g0.f27756a;
                }
                if (eVarA != null) {
                    eVarA.cancel();
                    g0 g0Var11 = g0.f27756a;
                }
                FileUtility fileUtility5 = FileUtility.INSTANCE;
                fileUtility5.closeQuietly(fVarC);
                fileUtility5.closeQuietly(gVarSource);
                companion7.d(TAG, str2 + progress.getStatus());
                downloadError = downloadError4;
                status = progress.getStatus();
                companion = AssetDownloadListener.Progress.ProgressStatus.Companion;
                if (status == companion.getERROR()) {
                    z11 = z10;
                } else {
                    z11 = false;
                }
                if (z11) {
                    return downloadError;
                }
                if (status == companion.getCANCELLED()) {
                    Logger.Companion.d(TAG, "On cancel " + downloadRequest);
                    assetDownloader.onProgressChanged(downloadRequest, progress, assetDownloadListener);
                } else {
                    assetDownloader.deliverSuccess(file, downloadRequest, assetDownloadListener);
                    currentRetryAttempt$vungle_ads_release = downloadRequest.getCurrentRetryAttempt$vungle_ads_release();
                    if (currentRetryAttempt$vungle_ads_release > 0) {
                        AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(Sdk.SDKMetric.SDKMetricType.ASSET_DOWNLOAD_RETRY_STATUS, 1L, downloadRequest.getLogEntry$vungle_ads_release(), "retryCount=" + currentRetryAttempt$vungle_ads_release + " url=" + downloadRequest.getAsset().getServerPath());
                    }
                }
                return null;
            }
            try {
                try {
                    if (!parentFile.exists()) {
                        parentFile.mkdirs();
                    }
                    eVarA = getOkHttpClient().a(new z.a().n(serverPath).b());
                    try {
                        b0VarExecute = eVarA.execute();
                        try {
                            try {
                                iH = b0VarExecute.h();
                                try {
                                    if (!b0VarExecute.t()) {
                                        if (b0VarExecute.e() != null) {
                                            c0VarDecodeGzipIfNeeded = assetDownloader.decodeGzipIfNeeded(b0VarExecute);
                                            i10 = iH;
                                            strP = b0.p(b0VarExecute, CONTENT_TYPE, null, 2, null);
                                            if (strP != null) {
                                                downloadRequest.getAsset().setMimeType(strP);
                                                g0 g0Var12 = g0.f27756a;
                                            }
                                            if (c0VarDecodeGzipIfNeeded != null) {
                                                gVarSource = c0VarDecodeGzipIfNeeded.source();
                                            } else {
                                                gVarSource = null;
                                            }
                                            StringBuilder sb4 = new StringBuilder();
                                            str2 = "download status: ";
                                            sb4.append("Start download from url: ");
                                            sb4.append(serverPath);
                                            sb4.append(" mimeType=");
                                            sb4.append(strP);
                                            companion4.d(TAG, sb4.toString());
                                            fVarC = q.c(r.g(file, false, 1, null));
                                            if (c0VarDecodeGzipIfNeeded != null) {
                                                jContentLength = c0VarDecodeGzipIfNeeded.contentLength();
                                            } else {
                                                jContentLength = 0;
                                            }
                                            progress.setStatus(AssetDownloadListener.Progress.ProgressStatus.Companion.getSTARTED());
                                            progress.setSizeBytes(jContentLength);
                                            str = serverPath;
                                            progress.setReadBytes(0L);
                                            progress.setProgressPercent(0);
                                            asset = asset;
                                            asset.setContentLength(jContentLength);
                                            assetDownloader.onProgressChanged(downloadRequest, progress, assetDownloadListener);
                                            i11 = 0;
                                            j10 = 0;
                                            while (true) {
                                                if (gVarSource != null) {
                                                    j11 = gVarSource.read(fVarC.getBuffer(), 8192L);
                                                } else {
                                                    j11 = -1;
                                                }
                                                g0 g0Var13 = g0.f27756a;
                                                if (j11 > 0) {
                                                    break;
                                                    break;
                                                }
                                                if (downloadRequest.isCancelled()) {
                                                    progress.setStatus(AssetDownloadListener.Progress.ProgressStatus.Companion.getCANCELLED());
                                                    break;
                                                }
                                                if (file.exists()) {
                                                    new AssetWriteError("Asset save error " + str).setLogEntry$vungle_ads_release(downloadRequest.getLogEntry$vungle_ads_release()).logErrorNoReturnValue$vungle_ads_release();
                                                    throw new Downloader.RequestException("File is not existing");
                                                }
                                                progress.setStatus(AssetDownloadListener.Progress.ProgressStatus.Companion.getIN_PROGRESS());
                                                fVarC.emit();
                                                fVarC.flush();
                                                j12 = j10 + j11;
                                                progress.setReadBytes(j12);
                                                rangeEnd = asset.getRangeEnd();
                                                if (rangeEnd != null) {
                                                    rangeStart = rangeEnd.longValue();
                                                } else {
                                                    rangeStart = asset.getRangeStart();
                                                }
                                                i12 = i11;
                                                gVar3 = gVarSource;
                                                long j15 = rangeStart;
                                                if (asset.isWaitingForDownload()) {
                                                    gVar2 = gVar3;
                                                    eVarA = eVarA;
                                                    file = file;
                                                } else {
                                                    gVar2 = gVar3;
                                                    eVarA = eVarA;
                                                    file = file;
                                                }
                                                if (jContentLength > 0) {
                                                    i13 = (int) ((((long) 100) * j12) / jContentLength);
                                                } else {
                                                    i13 = i12;
                                                }
                                                while (progress.getProgressPercent() + 1 <= Math.min(i13, 100)) {
                                                    companion3 = AssetDownloadListener.Progress.ProgressStatus.Companion;
                                                    progress.setStatus(companion3.getIN_PROGRESS());
                                                    z10 = true;
                                                    progress.setProgressPercent(progress.getProgressPercent() + 1);
                                                    if (progress.getProgressPercent() >= 100) {
                                                        progress.setStatus(companion3.getDONE());
                                                    }
                                                    assetDownloader = this;
                                                    assetDownloader.onProgressChanged(downloadRequest, progress, assetDownloadListener);
                                                }
                                                i11 = i13;
                                                file = file;
                                                gVarSource = gVar2;
                                                eVarA = eVarA;
                                                j10 = j12;
                                                str = str;
                                                assetDownloader = this;
                                                iH = i10;
                                                str2 = str2;
                                                gVarSource = gVar2;
                                                Logger.Companion companion8 = Logger.Companion;
                                                companion8.e(TAG, "Download exception for " + asset.getServerPath() + ": " + e);
                                                progress.setStatus(AssetDownloadListener.Progress.ProgressStatus.Companion.getERROR());
                                                AssetDownloadListener.DownloadError downloadError5 = new AssetDownloadListener.DownloadError(iH, e, AssetDownloadListener.DownloadError.ErrorReason.Companion.getREQUEST_ERROR());
                                                if (b0VarExecute != null) {
                                                    c0VarB3 = b0VarExecute.b();
                                                } else {
                                                    c0VarB3 = null;
                                                }
                                                if (c0VarB3 != null) {
                                                    c0VarB4.close();
                                                    g0 g0Var14 = g0.f27756a;
                                                }
                                                if (eVarA != null) {
                                                    eVarA.cancel();
                                                    g0 g0Var15 = g0.f27756a;
                                                }
                                                FileUtility fileUtility6 = FileUtility.INSTANCE;
                                                fileUtility6.closeQuietly(fVarC);
                                                fileUtility6.closeQuietly(gVarSource);
                                                companion8.d(TAG, str2 + progress.getStatus());
                                                downloadError = downloadError5;
                                                status = progress.getStatus();
                                                companion = AssetDownloadListener.Progress.ProgressStatus.Companion;
                                                if (status == companion.getERROR()) {
                                                    z11 = z10;
                                                } else {
                                                    z11 = false;
                                                }
                                                if (z11) {
                                                    return downloadError;
                                                }
                                                if (status == companion.getCANCELLED()) {
                                                    Logger.Companion.d(TAG, "On cancel " + downloadRequest);
                                                    assetDownloader.onProgressChanged(downloadRequest, progress, assetDownloadListener);
                                                } else {
                                                    assetDownloader.deliverSuccess(file, downloadRequest, assetDownloadListener);
                                                    currentRetryAttempt$vungle_ads_release = downloadRequest.getCurrentRetryAttempt$vungle_ads_release();
                                                    if (currentRetryAttempt$vungle_ads_release > 0) {
                                                        AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(Sdk.SDKMetric.SDKMetricType.ASSET_DOWNLOAD_RETRY_STATUS, 1L, downloadRequest.getLogEntry$vungle_ads_release(), "retryCount=" + currentRetryAttempt$vungle_ads_release + " url=" + downloadRequest.getAsset().getServerPath());
                                                    }
                                                }
                                                return null;
                                            }
                                            z10 = true;
                                            eVarA = eVarA;
                                            file = file;
                                            gVar = gVarSource;
                                            assetDownloader = this;
                                            fVarC.flush();
                                            status2 = progress.getStatus();
                                            companion2 = AssetDownloadListener.Progress.ProgressStatus.Companion;
                                            if (status2 == companion2.getIN_PROGRESS()) {
                                                progress.setStatus(companion2.getDONE());
                                                assetDownloader.onProgressChanged(downloadRequest, progress, assetDownloadListener);
                                            }
                                            if (b0VarExecute.b() != null) {
                                                c0VarB5.close();
                                            }
                                            eVarA.cancel();
                                            FileUtility fileUtility7 = FileUtility.INSTANCE;
                                            fileUtility7.closeQuietly(fVarC);
                                            fileUtility7.closeQuietly(gVar);
                                            Logger.Companion.d(TAG, str2 + progress.getStatus());
                                            downloadError = null;
                                            status = progress.getStatus();
                                            companion = AssetDownloadListener.Progress.ProgressStatus.Companion;
                                            if (status == companion.getERROR()) {
                                                z11 = z10;
                                            } else {
                                                z11 = false;
                                            }
                                            if (z11) {
                                                return downloadError;
                                            }
                                            if (status == companion.getCANCELLED()) {
                                                Logger.Companion.d(TAG, "On cancel " + downloadRequest);
                                                assetDownloader.onProgressChanged(downloadRequest, progress, assetDownloadListener);
                                            } else {
                                                assetDownloader.deliverSuccess(file, downloadRequest, assetDownloadListener);
                                                currentRetryAttempt$vungle_ads_release = downloadRequest.getCurrentRetryAttempt$vungle_ads_release();
                                                if (currentRetryAttempt$vungle_ads_release > 0) {
                                                    AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(Sdk.SDKMetric.SDKMetricType.ASSET_DOWNLOAD_RETRY_STATUS, 1L, downloadRequest.getLogEntry$vungle_ads_release(), "retryCount=" + currentRetryAttempt$vungle_ads_release + " url=" + downloadRequest.getAsset().getServerPath());
                                                }
                                            }
                                            return null;
                                        }
                                        try {
                                            try {
                                                try {
                                                    AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.CACHED_ASSETS_USED), downloadRequest.getLogEntry$vungle_ads_release(), serverPath);
                                                    g0 g0Var16 = g0.f27756a;
                                                    try {
                                                        c0VarDecodeGzipIfNeeded = assetDownloader.decodeGzipIfNeeded(b0VarExecute);
                                                        i10 = iH;
                                                        try {
                                                            strP = b0.p(b0VarExecute, CONTENT_TYPE, null, 2, null);
                                                            if (strP != null) {
                                                                try {
                                                                    downloadRequest.getAsset().setMimeType(strP);
                                                                    g0 g0Var17 = g0.f27756a;
                                                                } catch (Exception e10) {
                                                                    e = e10;
                                                                    iH = i10;
                                                                    fVarC = null;
                                                                    gVarSource = null;
                                                                    z10 = true;
                                                                    assetDownloader = assetDownloader;
                                                                    Logger.Companion companion9 = Logger.Companion;
                                                                    companion9.e(TAG, "Download exception for " + asset.getServerPath() + ": " + e);
                                                                    progress.setStatus(AssetDownloadListener.Progress.ProgressStatus.Companion.getERROR());
                                                                    AssetDownloadListener.DownloadError downloadError6 = new AssetDownloadListener.DownloadError(iH, e, AssetDownloadListener.DownloadError.ErrorReason.Companion.getREQUEST_ERROR());
                                                                    if (b0VarExecute != null) {
                                                                        c0VarB3 = b0VarExecute.b();
                                                                    } else {
                                                                        c0VarB3 = null;
                                                                    }
                                                                    if (c0VarB3 != null) {
                                                                        c0VarB4.close();
                                                                        g0 g0Var18 = g0.f27756a;
                                                                    }
                                                                    if (eVarA != null) {
                                                                        eVarA.cancel();
                                                                        g0 g0Var19 = g0.f27756a;
                                                                    }
                                                                    FileUtility fileUtility8 = FileUtility.INSTANCE;
                                                                    fileUtility8.closeQuietly(fVarC);
                                                                    fileUtility8.closeQuietly(gVarSource);
                                                                    companion9.d(TAG, str2 + progress.getStatus());
                                                                    downloadError = downloadError6;
                                                                    status = progress.getStatus();
                                                                    companion = AssetDownloadListener.Progress.ProgressStatus.Companion;
                                                                    if (status == companion.getERROR()) {
                                                                        z11 = z10;
                                                                    } else {
                                                                        z11 = false;
                                                                    }
                                                                    if (z11) {
                                                                        return downloadError;
                                                                    }
                                                                    if (status == companion.getCANCELLED()) {
                                                                        Logger.Companion.d(TAG, "On cancel " + downloadRequest);
                                                                        assetDownloader.onProgressChanged(downloadRequest, progress, assetDownloadListener);
                                                                    } else {
                                                                        assetDownloader.deliverSuccess(file, downloadRequest, assetDownloadListener);
                                                                        currentRetryAttempt$vungle_ads_release = downloadRequest.getCurrentRetryAttempt$vungle_ads_release();
                                                                        if (currentRetryAttempt$vungle_ads_release > 0) {
                                                                            AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(Sdk.SDKMetric.SDKMetricType.ASSET_DOWNLOAD_RETRY_STATUS, 1L, downloadRequest.getLogEntry$vungle_ads_release(), "retryCount=" + currentRetryAttempt$vungle_ads_release + " url=" + downloadRequest.getAsset().getServerPath());
                                                                        }
                                                                    }
                                                                    return null;
                                                                }
                                                            }
                                                            if (c0VarDecodeGzipIfNeeded != null) {
                                                                gVarSource = c0VarDecodeGzipIfNeeded.source();
                                                            } else {
                                                                gVarSource = null;
                                                            }
                                                            try {
                                                                StringBuilder sb5 = new StringBuilder();
                                                                str2 = "download status: ";
                                                                try {
                                                                    try {
                                                                        sb5.append("Start download from url: ");
                                                                        sb5.append(serverPath);
                                                                        sb5.append(" mimeType=");
                                                                        sb5.append(strP);
                                                                        companion4.d(TAG, sb5.toString());
                                                                        try {
                                                                            fVarC = q.c(r.g(file, false, 1, null));
                                                                            if (c0VarDecodeGzipIfNeeded != null) {
                                                                                try {
                                                                                    try {
                                                                                        jContentLength = c0VarDecodeGzipIfNeeded.contentLength();
                                                                                    } catch (Exception e11) {
                                                                                        e = e11;
                                                                                        eVarA = eVarA;
                                                                                        file = file;
                                                                                        asset = asset;
                                                                                        gVarSource = gVarSource;
                                                                                        iH = i10;
                                                                                        str2 = str2;
                                                                                        z10 = true;
                                                                                        assetDownloader = assetDownloader;
                                                                                    }
                                                                                } catch (Throwable th) {
                                                                                    th = th;
                                                                                    eVarA = eVarA;
                                                                                    gVarSource = gVarSource;
                                                                                    str2 = str2;
                                                                                    fVar = fVarC;
                                                                                    if (b0VarExecute != null) {
                                                                                        c0VarB = b0VarExecute.b();
                                                                                    } else {
                                                                                        c0VarB = null;
                                                                                    }
                                                                                    if (c0VarB != null) {
                                                                                        c0VarB2.close();
                                                                                        g0 g0Var20 = g0.f27756a;
                                                                                    }
                                                                                    if (eVarA != null) {
                                                                                        eVarA.cancel();
                                                                                        g0 g0Var21 = g0.f27756a;
                                                                                    }
                                                                                    FileUtility fileUtility9 = FileUtility.INSTANCE;
                                                                                    fileUtility9.closeQuietly(fVar);
                                                                                    fileUtility9.closeQuietly(gVarSource);
                                                                                    Logger.Companion.d(TAG, str2 + progress.getStatus());
                                                                                    throw th;
                                                                                }
                                                                            } else {
                                                                                jContentLength = 0;
                                                                            }
                                                                            try {
                                                                                progress.setStatus(AssetDownloadListener.Progress.ProgressStatus.Companion.getSTARTED());
                                                                                progress.setSizeBytes(jContentLength);
                                                                                str = serverPath;
                                                                                progress.setReadBytes(0L);
                                                                                progress.setProgressPercent(0);
                                                                                asset = asset;
                                                                                try {
                                                                                    asset.setContentLength(jContentLength);
                                                                                    assetDownloader.onProgressChanged(downloadRequest, progress, assetDownloadListener);
                                                                                    i11 = 0;
                                                                                    j10 = 0;
                                                                                    try {
                                                                                        while (true) {
                                                                                            if (gVarSource != null) {
                                                                                                try {
                                                                                                    try {
                                                                                                        j11 = gVarSource.read(fVarC.getBuffer(), 8192L);
                                                                                                    } catch (Exception e12) {
                                                                                                        e = e12;
                                                                                                        eVarA = eVarA;
                                                                                                        file = file;
                                                                                                        gVarSource = gVarSource;
                                                                                                        iH = i10;
                                                                                                        str2 = str2;
                                                                                                        z10 = true;
                                                                                                        assetDownloader = this;
                                                                                                    }
                                                                                                } catch (Throwable th2) {
                                                                                                    th = th2;
                                                                                                    eVarA = eVarA;
                                                                                                    gVarSource = gVarSource;
                                                                                                    str2 = str2;
                                                                                                    fVar = fVarC;
                                                                                                    if (b0VarExecute != null) {
                                                                                                        c0VarB = b0VarExecute.b();
                                                                                                    } else {
                                                                                                        c0VarB = null;
                                                                                                    }
                                                                                                    if (c0VarB != null) {
                                                                                                        c0VarB2.close();
                                                                                                        g0 g0Var22 = g0.f27756a;
                                                                                                    }
                                                                                                    if (eVarA != null) {
                                                                                                        eVarA.cancel();
                                                                                                        g0 g0Var23 = g0.f27756a;
                                                                                                    }
                                                                                                    FileUtility fileUtility10 = FileUtility.INSTANCE;
                                                                                                    fileUtility10.closeQuietly(fVar);
                                                                                                    fileUtility10.closeQuietly(gVarSource);
                                                                                                    Logger.Companion.d(TAG, str2 + progress.getStatus());
                                                                                                    throw th;
                                                                                                }
                                                                                            } else {
                                                                                                j11 = -1;
                                                                                            }
                                                                                            try {
                                                                                                g0 g0Var110 = g0.f27756a;
                                                                                                if (j11 > 0) {
                                                                                                    break;
                                                                                                }
                                                                                                try {
                                                                                                    if (downloadRequest.isCancelled()) {
                                                                                                        progress.setStatus(AssetDownloadListener.Progress.ProgressStatus.Companion.getCANCELLED());
                                                                                                        break;
                                                                                                    }
                                                                                                    if (file.exists()) {
                                                                                                        new AssetWriteError("Asset save error " + str).setLogEntry$vungle_ads_release(downloadRequest.getLogEntry$vungle_ads_release()).logErrorNoReturnValue$vungle_ads_release();
                                                                                                        throw new Downloader.RequestException("File is not existing");
                                                                                                    }
                                                                                                    progress.setStatus(AssetDownloadListener.Progress.ProgressStatus.Companion.getIN_PROGRESS());
                                                                                                    fVarC.emit();
                                                                                                    fVarC.flush();
                                                                                                    j12 = j10 + j11;
                                                                                                    progress.setReadBytes(j12);
                                                                                                    rangeEnd = asset.getRangeEnd();
                                                                                                    if (rangeEnd != null) {
                                                                                                        rangeStart = rangeEnd.longValue();
                                                                                                    } else {
                                                                                                        rangeStart = asset.getRangeStart();
                                                                                                    }
                                                                                                    i12 = i11;
                                                                                                    gVar3 = gVarSource;
                                                                                                    long j16 = rangeStart;
                                                                                                    try {
                                                                                                        try {
                                                                                                            if (asset.isWaitingForDownload() || j12 < j16) {
                                                                                                                gVar2 = gVar3;
                                                                                                                eVarA = eVarA;
                                                                                                                file = file;
                                                                                                            } else {
                                                                                                                file = file;
                                                                                                                try {
                                                                                                                    Logger.Companion companion10 = Logger.Companion;
                                                                                                                    gVar2 = gVar3;
                                                                                                                    try {
                                                                                                                        StringBuilder sb6 = new StringBuilder();
                                                                                                                        eVarA = eVarA;
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                sb6.append("Downloader totalRead=");
                                                                                                                                sb6.append(j12);
                                                                                                                                sb6.append(" requiredBytes=");
                                                                                                                                sb6.append(j16);
                                                                                                                                companion10.e(TAG, sb6.toString());
                                                                                                                                asset.notifyDownloadEnough();
                                                                                                                            } catch (Throwable th3) {
                                                                                                                                th = th3;
                                                                                                                                fVar = fVarC;
                                                                                                                                str2 = str2;
                                                                                                                                gVarSource = gVar2;
                                                                                                                                if (b0VarExecute != null) {
                                                                                                                                    c0VarB = b0VarExecute.b();
                                                                                                                                } else {
                                                                                                                                    c0VarB = null;
                                                                                                                                }
                                                                                                                                if (c0VarB != null) {
                                                                                                                                    c0VarB2.close();
                                                                                                                                    g0 g0Var24 = g0.f27756a;
                                                                                                                                }
                                                                                                                                if (eVarA != null) {
                                                                                                                                    eVarA.cancel();
                                                                                                                                    g0 g0Var25 = g0.f27756a;
                                                                                                                                }
                                                                                                                                FileUtility fileUtility11 = FileUtility.INSTANCE;
                                                                                                                                fileUtility11.closeQuietly(fVar);
                                                                                                                                fileUtility11.closeQuietly(gVarSource);
                                                                                                                                Logger.Companion.d(TAG, str2 + progress.getStatus());
                                                                                                                                throw th;
                                                                                                                            }
                                                                                                                        } catch (Exception e13) {
                                                                                                                            e = e13;
                                                                                                                            assetDownloader = this;
                                                                                                                            iH = i10;
                                                                                                                            str2 = str2;
                                                                                                                            gVarSource = gVar2;
                                                                                                                            z10 = true;
                                                                                                                            Logger.Companion companion11 = Logger.Companion;
                                                                                                                            companion11.e(TAG, "Download exception for " + asset.getServerPath() + ": " + e);
                                                                                                                            progress.setStatus(AssetDownloadListener.Progress.ProgressStatus.Companion.getERROR());
                                                                                                                            AssetDownloadListener.DownloadError downloadError7 = new AssetDownloadListener.DownloadError(iH, e, AssetDownloadListener.DownloadError.ErrorReason.Companion.getREQUEST_ERROR());
                                                                                                                            if (b0VarExecute != null) {
                                                                                                                                c0VarB3 = b0VarExecute.b();
                                                                                                                            } else {
                                                                                                                                c0VarB3 = null;
                                                                                                                            }
                                                                                                                            if (c0VarB3 != null) {
                                                                                                                                c0VarB4.close();
                                                                                                                                g0 g0Var111 = g0.f27756a;
                                                                                                                            }
                                                                                                                            if (eVarA != null) {
                                                                                                                                eVarA.cancel();
                                                                                                                                g0 g0Var112 = g0.f27756a;
                                                                                                                            }
                                                                                                                            FileUtility fileUtility12 = FileUtility.INSTANCE;
                                                                                                                            fileUtility12.closeQuietly(fVarC);
                                                                                                                            fileUtility12.closeQuietly(gVarSource);
                                                                                                                            companion11.d(TAG, str2 + progress.getStatus());
                                                                                                                            downloadError = downloadError7;
                                                                                                                            status = progress.getStatus();
                                                                                                                            companion = AssetDownloadListener.Progress.ProgressStatus.Companion;
                                                                                                                            if (status == companion.getERROR()) {
                                                                                                                                z11 = z10;
                                                                                                                            } else {
                                                                                                                                z11 = false;
                                                                                                                            }
                                                                                                                            if (z11) {
                                                                                                                                return downloadError;
                                                                                                                            }
                                                                                                                            if (status == companion.getCANCELLED()) {
                                                                                                                                Logger.Companion.d(TAG, "On cancel " + downloadRequest);
                                                                                                                                assetDownloader.onProgressChanged(downloadRequest, progress, assetDownloadListener);
                                                                                                                            } else {
                                                                                                                                assetDownloader.deliverSuccess(file, downloadRequest, assetDownloadListener);
                                                                                                                                currentRetryAttempt$vungle_ads_release = downloadRequest.getCurrentRetryAttempt$vungle_ads_release();
                                                                                                                                if (currentRetryAttempt$vungle_ads_release > 0) {
                                                                                                                                    AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(Sdk.SDKMetric.SDKMetricType.ASSET_DOWNLOAD_RETRY_STATUS, 1L, downloadRequest.getLogEntry$vungle_ads_release(), "retryCount=" + currentRetryAttempt$vungle_ads_release + " url=" + downloadRequest.getAsset().getServerPath());
                                                                                                                                }
                                                                                                                            }
                                                                                                                            return null;
                                                                                                                        }
                                                                                                                    } catch (Exception e14) {
                                                                                                                        e = e14;
                                                                                                                        eVarA = eVarA;
                                                                                                                        assetDownloader = this;
                                                                                                                        iH = i10;
                                                                                                                        str2 = str2;
                                                                                                                        gVarSource = gVar2;
                                                                                                                        z10 = true;
                                                                                                                        Logger.Companion companion12 = Logger.Companion;
                                                                                                                        companion12.e(TAG, "Download exception for " + asset.getServerPath() + ": " + e);
                                                                                                                        progress.setStatus(AssetDownloadListener.Progress.ProgressStatus.Companion.getERROR());
                                                                                                                        AssetDownloadListener.DownloadError downloadError8 = new AssetDownloadListener.DownloadError(iH, e, AssetDownloadListener.DownloadError.ErrorReason.Companion.getREQUEST_ERROR());
                                                                                                                        if (b0VarExecute != null) {
                                                                                                                            c0VarB3 = b0VarExecute.b();
                                                                                                                        } else {
                                                                                                                            c0VarB3 = null;
                                                                                                                        }
                                                                                                                        if (c0VarB3 != null) {
                                                                                                                            c0VarB4.close();
                                                                                                                            g0 g0Var113 = g0.f27756a;
                                                                                                                        }
                                                                                                                        if (eVarA != null) {
                                                                                                                            eVarA.cancel();
                                                                                                                            g0 g0Var114 = g0.f27756a;
                                                                                                                        }
                                                                                                                        FileUtility fileUtility13 = FileUtility.INSTANCE;
                                                                                                                        fileUtility13.closeQuietly(fVarC);
                                                                                                                        fileUtility13.closeQuietly(gVarSource);
                                                                                                                        companion12.d(TAG, str2 + progress.getStatus());
                                                                                                                        downloadError = downloadError8;
                                                                                                                        status = progress.getStatus();
                                                                                                                        companion = AssetDownloadListener.Progress.ProgressStatus.Companion;
                                                                                                                        if (status == companion.getERROR()) {
                                                                                                                            z11 = z10;
                                                                                                                        } else {
                                                                                                                            z11 = false;
                                                                                                                        }
                                                                                                                        if (z11) {
                                                                                                                            return downloadError;
                                                                                                                        }
                                                                                                                        if (status == companion.getCANCELLED()) {
                                                                                                                            Logger.Companion.d(TAG, "On cancel " + downloadRequest);
                                                                                                                            assetDownloader.onProgressChanged(downloadRequest, progress, assetDownloadListener);
                                                                                                                        } else {
                                                                                                                            assetDownloader.deliverSuccess(file, downloadRequest, assetDownloadListener);
                                                                                                                            currentRetryAttempt$vungle_ads_release = downloadRequest.getCurrentRetryAttempt$vungle_ads_release();
                                                                                                                            if (currentRetryAttempt$vungle_ads_release > 0) {
                                                                                                                                AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(Sdk.SDKMetric.SDKMetricType.ASSET_DOWNLOAD_RETRY_STATUS, 1L, downloadRequest.getLogEntry$vungle_ads_release(), "retryCount=" + currentRetryAttempt$vungle_ads_release + " url=" + downloadRequest.getAsset().getServerPath());
                                                                                                                            }
                                                                                                                        }
                                                                                                                        return null;
                                                                                                                    } catch (Throwable th4) {
                                                                                                                        th = th4;
                                                                                                                        eVarA = eVarA;
                                                                                                                        fVar = fVarC;
                                                                                                                        str2 = str2;
                                                                                                                        gVarSource = gVar2;
                                                                                                                        if (b0VarExecute != null) {
                                                                                                                            c0VarB = b0VarExecute.b();
                                                                                                                        } else {
                                                                                                                            c0VarB = null;
                                                                                                                        }
                                                                                                                        if (c0VarB != null) {
                                                                                                                            c0VarB2.close();
                                                                                                                            g0 g0Var26 = g0.f27756a;
                                                                                                                        }
                                                                                                                        if (eVarA != null) {
                                                                                                                            eVarA.cancel();
                                                                                                                            g0 g0Var27 = g0.f27756a;
                                                                                                                        }
                                                                                                                        FileUtility fileUtility14 = FileUtility.INSTANCE;
                                                                                                                        fileUtility14.closeQuietly(fVar);
                                                                                                                        fileUtility14.closeQuietly(gVarSource);
                                                                                                                        Logger.Companion.d(TAG, str2 + progress.getStatus());
                                                                                                                        throw th;
                                                                                                                    }
                                                                                                                } catch (Exception e15) {
                                                                                                                    e = e15;
                                                                                                                    gVar2 = gVar3;
                                                                                                                }
                                                                                                            }
                                                                                                            if (jContentLength > 0) {
                                                                                                                i13 = (int) ((((long) 100) * j12) / jContentLength);
                                                                                                            } else {
                                                                                                                i13 = i12;
                                                                                                            }
                                                                                                            while (progress.getProgressPercent() + 1 <= Math.min(i13, 100)) {
                                                                                                                try {
                                                                                                                    companion3 = AssetDownloadListener.Progress.ProgressStatus.Companion;
                                                                                                                    progress.setStatus(companion3.getIN_PROGRESS());
                                                                                                                    z10 = true;
                                                                                                                    try {
                                                                                                                        progress.setProgressPercent(progress.getProgressPercent() + 1);
                                                                                                                        if (progress.getProgressPercent() >= 100) {
                                                                                                                            progress.setStatus(companion3.getDONE());
                                                                                                                        }
                                                                                                                        assetDownloader = this;
                                                                                                                        try {
                                                                                                                            assetDownloader.onProgressChanged(downloadRequest, progress, assetDownloadListener);
                                                                                                                        } catch (Exception e16) {
                                                                                                                            e = e16;
                                                                                                                        } catch (Throwable th5) {
                                                                                                                            th = th5;
                                                                                                                            fVar = fVarC;
                                                                                                                            str2 = str2;
                                                                                                                            gVarSource = gVar2;
                                                                                                                            if (b0VarExecute != null) {
                                                                                                                                c0VarB = b0VarExecute.b();
                                                                                                                            } else {
                                                                                                                                c0VarB = null;
                                                                                                                            }
                                                                                                                            if (c0VarB != null) {
                                                                                                                                c0VarB2.close();
                                                                                                                                g0 g0Var28 = g0.f27756a;
                                                                                                                            }
                                                                                                                            if (eVarA != null) {
                                                                                                                                eVarA.cancel();
                                                                                                                                g0 g0Var29 = g0.f27756a;
                                                                                                                            }
                                                                                                                            FileUtility fileUtility15 = FileUtility.INSTANCE;
                                                                                                                            fileUtility15.closeQuietly(fVar);
                                                                                                                            fileUtility15.closeQuietly(gVarSource);
                                                                                                                            Logger.Companion.d(TAG, str2 + progress.getStatus());
                                                                                                                            throw th;
                                                                                                                        }
                                                                                                                    } catch (Exception e17) {
                                                                                                                        e = e17;
                                                                                                                        assetDownloader = this;
                                                                                                                    }
                                                                                                                } catch (Exception e18) {
                                                                                                                    e = e18;
                                                                                                                    z10 = true;
                                                                                                                }
                                                                                                            }
                                                                                                            i11 = i13;
                                                                                                            file = file;
                                                                                                            gVarSource = gVar2;
                                                                                                            eVarA = eVarA;
                                                                                                            j10 = j12;
                                                                                                            str = str;
                                                                                                        } catch (Throwable th6) {
                                                                                                            th = th6;
                                                                                                            gVar2 = gVar3;
                                                                                                        }
                                                                                                    } catch (Exception e19) {
                                                                                                        e = e19;
                                                                                                        z10 = true;
                                                                                                        gVar2 = gVar3;
                                                                                                        eVarA = eVarA;
                                                                                                        file = file;
                                                                                                    }
                                                                                                } catch (Exception e20) {
                                                                                                    e = e20;
                                                                                                    z10 = true;
                                                                                                    eVarA = eVarA;
                                                                                                    file = file;
                                                                                                    gVar2 = gVarSource;
                                                                                                } catch (Throwable th7) {
                                                                                                    th = th7;
                                                                                                    eVarA = eVarA;
                                                                                                    gVar2 = gVarSource;
                                                                                                }
                                                                                                assetDownloader = this;
                                                                                                iH = i10;
                                                                                                str2 = str2;
                                                                                                gVarSource = gVar2;
                                                                                                Logger.Companion companion13 = Logger.Companion;
                                                                                                companion13.e(TAG, "Download exception for " + asset.getServerPath() + ": " + e);
                                                                                                progress.setStatus(AssetDownloadListener.Progress.ProgressStatus.Companion.getERROR());
                                                                                                AssetDownloadListener.DownloadError downloadError9 = new AssetDownloadListener.DownloadError(iH, e, AssetDownloadListener.DownloadError.ErrorReason.Companion.getREQUEST_ERROR());
                                                                                                if (b0VarExecute != null) {
                                                                                                    c0VarB3 = b0VarExecute.b();
                                                                                                } else {
                                                                                                    c0VarB3 = null;
                                                                                                }
                                                                                                if (c0VarB3 != null && (c0VarB4 = b0VarExecute.b()) != null) {
                                                                                                    c0VarB4.close();
                                                                                                    g0 g0Var115 = g0.f27756a;
                                                                                                }
                                                                                                if (eVarA != null) {
                                                                                                    eVarA.cancel();
                                                                                                    g0 g0Var116 = g0.f27756a;
                                                                                                }
                                                                                                FileUtility fileUtility16 = FileUtility.INSTANCE;
                                                                                                fileUtility16.closeQuietly(fVarC);
                                                                                                fileUtility16.closeQuietly(gVarSource);
                                                                                                companion13.d(TAG, str2 + progress.getStatus());
                                                                                                downloadError = downloadError9;
                                                                                                status = progress.getStatus();
                                                                                                companion = AssetDownloadListener.Progress.ProgressStatus.Companion;
                                                                                                if (status == companion.getERROR() && status != companion.getSTARTED()) {
                                                                                                    z11 = false;
                                                                                                } else {
                                                                                                    z11 = z10;
                                                                                                }
                                                                                                if (z11) {
                                                                                                    return downloadError;
                                                                                                }
                                                                                                if (status == companion.getCANCELLED()) {
                                                                                                    Logger.Companion.d(TAG, "On cancel " + downloadRequest);
                                                                                                    assetDownloader.onProgressChanged(downloadRequest, progress, assetDownloadListener);
                                                                                                } else {
                                                                                                    assetDownloader.deliverSuccess(file, downloadRequest, assetDownloadListener);
                                                                                                    currentRetryAttempt$vungle_ads_release = downloadRequest.getCurrentRetryAttempt$vungle_ads_release();
                                                                                                    if (currentRetryAttempt$vungle_ads_release > 0) {
                                                                                                        AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(Sdk.SDKMetric.SDKMetricType.ASSET_DOWNLOAD_RETRY_STATUS, 1L, downloadRequest.getLogEntry$vungle_ads_release(), "retryCount=" + currentRetryAttempt$vungle_ads_release + " url=" + downloadRequest.getAsset().getServerPath());
                                                                                                    }
                                                                                                }
                                                                                                return null;
                                                                                            } catch (Exception e21) {
                                                                                                e = e21;
                                                                                                eVarA = eVarA;
                                                                                                file = file;
                                                                                                gVarSource = gVarSource;
                                                                                                z10 = true;
                                                                                                assetDownloader = this;
                                                                                            }
                                                                                        }
                                                                                        fVarC.flush();
                                                                                        status2 = progress.getStatus();
                                                                                        companion2 = AssetDownloadListener.Progress.ProgressStatus.Companion;
                                                                                        if (status2 == companion2.getIN_PROGRESS()) {
                                                                                            progress.setStatus(companion2.getDONE());
                                                                                            assetDownloader.onProgressChanged(downloadRequest, progress, assetDownloadListener);
                                                                                        }
                                                                                        if (b0VarExecute.b() != null && (c0VarB5 = b0VarExecute.b()) != null) {
                                                                                            c0VarB5.close();
                                                                                        }
                                                                                        eVarA.cancel();
                                                                                        FileUtility fileUtility17 = FileUtility.INSTANCE;
                                                                                        fileUtility17.closeQuietly(fVarC);
                                                                                        fileUtility17.closeQuietly(gVar);
                                                                                        Logger.Companion.d(TAG, str2 + progress.getStatus());
                                                                                        downloadError = null;
                                                                                    } catch (Exception e22) {
                                                                                        e = e22;
                                                                                        gVarSource = gVar;
                                                                                        iH = i10;
                                                                                        Logger.Companion companion14 = Logger.Companion;
                                                                                        companion14.e(TAG, "Download exception for " + asset.getServerPath() + ": " + e);
                                                                                        progress.setStatus(AssetDownloadListener.Progress.ProgressStatus.Companion.getERROR());
                                                                                        AssetDownloadListener.DownloadError downloadError10 = new AssetDownloadListener.DownloadError(iH, e, AssetDownloadListener.DownloadError.ErrorReason.Companion.getREQUEST_ERROR());
                                                                                        if (b0VarExecute != null) {
                                                                                            c0VarB3 = b0VarExecute.b();
                                                                                        } else {
                                                                                            c0VarB3 = null;
                                                                                        }
                                                                                        if (c0VarB3 != null) {
                                                                                            c0VarB4.close();
                                                                                            g0 g0Var117 = g0.f27756a;
                                                                                        }
                                                                                        if (eVarA != null) {
                                                                                            eVarA.cancel();
                                                                                            g0 g0Var118 = g0.f27756a;
                                                                                        }
                                                                                        FileUtility fileUtility18 = FileUtility.INSTANCE;
                                                                                        fileUtility18.closeQuietly(fVarC);
                                                                                        fileUtility18.closeQuietly(gVarSource);
                                                                                        companion14.d(TAG, str2 + progress.getStatus());
                                                                                        downloadError = downloadError10;
                                                                                    } catch (Throwable th8) {
                                                                                        th = th8;
                                                                                        str2 = str2;
                                                                                        gVarSource = gVar;
                                                                                        fVar = fVarC;
                                                                                        if (b0VarExecute != null) {
                                                                                            c0VarB = b0VarExecute.b();
                                                                                        } else {
                                                                                            c0VarB = null;
                                                                                        }
                                                                                        if (c0VarB != null) {
                                                                                            c0VarB2.close();
                                                                                            g0 g0Var210 = g0.f27756a;
                                                                                        }
                                                                                        if (eVarA != null) {
                                                                                            eVarA.cancel();
                                                                                            g0 g0Var211 = g0.f27756a;
                                                                                        }
                                                                                        FileUtility fileUtility19 = FileUtility.INSTANCE;
                                                                                        fileUtility19.closeQuietly(fVar);
                                                                                        fileUtility19.closeQuietly(gVarSource);
                                                                                        Logger.Companion.d(TAG, str2 + progress.getStatus());
                                                                                        throw th;
                                                                                    }
                                                                                    z10 = true;
                                                                                    eVarA = eVarA;
                                                                                    file = file;
                                                                                    gVar = gVarSource;
                                                                                    assetDownloader = this;
                                                                                } catch (Exception e23) {
                                                                                    e = e23;
                                                                                    gVarSource = gVarSource;
                                                                                    z10 = true;
                                                                                    assetDownloader = assetDownloader;
                                                                                    iH = i10;
                                                                                    Logger.Companion companion15 = Logger.Companion;
                                                                                    companion15.e(TAG, "Download exception for " + asset.getServerPath() + ": " + e);
                                                                                    progress.setStatus(AssetDownloadListener.Progress.ProgressStatus.Companion.getERROR());
                                                                                    AssetDownloadListener.DownloadError downloadError11 = new AssetDownloadListener.DownloadError(iH, e, AssetDownloadListener.DownloadError.ErrorReason.Companion.getREQUEST_ERROR());
                                                                                    if (b0VarExecute != null) {
                                                                                        c0VarB3 = b0VarExecute.b();
                                                                                    } else {
                                                                                        c0VarB3 = null;
                                                                                    }
                                                                                    if (c0VarB3 != null) {
                                                                                        c0VarB4.close();
                                                                                        g0 g0Var119 = g0.f27756a;
                                                                                    }
                                                                                    if (eVarA != null) {
                                                                                        eVarA.cancel();
                                                                                        g0 g0Var1110 = g0.f27756a;
                                                                                    }
                                                                                    FileUtility fileUtility110 = FileUtility.INSTANCE;
                                                                                    fileUtility110.closeQuietly(fVarC);
                                                                                    fileUtility110.closeQuietly(gVarSource);
                                                                                    companion15.d(TAG, str2 + progress.getStatus());
                                                                                    downloadError = downloadError11;
                                                                                    status = progress.getStatus();
                                                                                    companion = AssetDownloadListener.Progress.ProgressStatus.Companion;
                                                                                    if (status == companion.getERROR()) {
                                                                                        z11 = z10;
                                                                                    } else {
                                                                                        z11 = false;
                                                                                    }
                                                                                    if (z11) {
                                                                                        return downloadError;
                                                                                    }
                                                                                    if (status == companion.getCANCELLED()) {
                                                                                        Logger.Companion.d(TAG, "On cancel " + downloadRequest);
                                                                                        assetDownloader.onProgressChanged(downloadRequest, progress, assetDownloadListener);
                                                                                    } else {
                                                                                        assetDownloader.deliverSuccess(file, downloadRequest, assetDownloadListener);
                                                                                        currentRetryAttempt$vungle_ads_release = downloadRequest.getCurrentRetryAttempt$vungle_ads_release();
                                                                                        if (currentRetryAttempt$vungle_ads_release > 0) {
                                                                                            AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(Sdk.SDKMetric.SDKMetricType.ASSET_DOWNLOAD_RETRY_STATUS, 1L, downloadRequest.getLogEntry$vungle_ads_release(), "retryCount=" + currentRetryAttempt$vungle_ads_release + " url=" + downloadRequest.getAsset().getServerPath());
                                                                                        }
                                                                                    }
                                                                                    return null;
                                                                                }
                                                                            } catch (Exception e24) {
                                                                                e = e24;
                                                                                asset = asset;
                                                                            }
                                                                        } catch (Exception e25) {
                                                                            e = e25;
                                                                            asset = asset;
                                                                            eVarA = eVarA;
                                                                            file = file;
                                                                            z10 = true;
                                                                            gVarSource = gVarSource;
                                                                            str2 = str2;
                                                                            assetDownloader = assetDownloader;
                                                                            iH = i10;
                                                                            fVarC = null;
                                                                        }
                                                                    } catch (Throwable th9) {
                                                                        th = th9;
                                                                        str2 = str2;
                                                                        fVar = null;
                                                                    }
                                                                } catch (Exception e26) {
                                                                    e = e26;
                                                                    str2 = str2;
                                                                    z10 = true;
                                                                    assetDownloader = assetDownloader;
                                                                    iH = i10;
                                                                    fVarC = null;
                                                                    Logger.Companion companion16 = Logger.Companion;
                                                                    companion16.e(TAG, "Download exception for " + asset.getServerPath() + ": " + e);
                                                                    progress.setStatus(AssetDownloadListener.Progress.ProgressStatus.Companion.getERROR());
                                                                    AssetDownloadListener.DownloadError downloadError12 = new AssetDownloadListener.DownloadError(iH, e, AssetDownloadListener.DownloadError.ErrorReason.Companion.getREQUEST_ERROR());
                                                                    if (b0VarExecute != null) {
                                                                        c0VarB3 = b0VarExecute.b();
                                                                    } else {
                                                                        c0VarB3 = null;
                                                                    }
                                                                    if (c0VarB3 != null) {
                                                                        c0VarB4.close();
                                                                        g0 g0Var1111 = g0.f27756a;
                                                                    }
                                                                    if (eVarA != null) {
                                                                        eVarA.cancel();
                                                                        g0 g0Var1112 = g0.f27756a;
                                                                    }
                                                                    FileUtility fileUtility111 = FileUtility.INSTANCE;
                                                                    fileUtility111.closeQuietly(fVarC);
                                                                    fileUtility111.closeQuietly(gVarSource);
                                                                    companion16.d(TAG, str2 + progress.getStatus());
                                                                    downloadError = downloadError12;
                                                                    status = progress.getStatus();
                                                                    companion = AssetDownloadListener.Progress.ProgressStatus.Companion;
                                                                    if (status == companion.getERROR()) {
                                                                        z11 = z10;
                                                                    } else {
                                                                        z11 = false;
                                                                    }
                                                                    if (z11) {
                                                                        return downloadError;
                                                                    }
                                                                    if (status == companion.getCANCELLED()) {
                                                                        Logger.Companion.d(TAG, "On cancel " + downloadRequest);
                                                                        assetDownloader.onProgressChanged(downloadRequest, progress, assetDownloadListener);
                                                                    } else {
                                                                        assetDownloader.deliverSuccess(file, downloadRequest, assetDownloadListener);
                                                                        currentRetryAttempt$vungle_ads_release = downloadRequest.getCurrentRetryAttempt$vungle_ads_release();
                                                                        if (currentRetryAttempt$vungle_ads_release > 0) {
                                                                            AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(Sdk.SDKMetric.SDKMetricType.ASSET_DOWNLOAD_RETRY_STATUS, 1L, downloadRequest.getLogEntry$vungle_ads_release(), "retryCount=" + currentRetryAttempt$vungle_ads_release + " url=" + downloadRequest.getAsset().getServerPath());
                                                                        }
                                                                    }
                                                                    return null;
                                                                }
                                                            } catch (Exception e27) {
                                                                e = e27;
                                                            } catch (Throwable th10) {
                                                                th = th10;
                                                            }
                                                        } catch (Exception e28) {
                                                            e = e28;
                                                            eVarA = eVarA;
                                                            z10 = true;
                                                            iH = i10;
                                                            fVarC = null;
                                                            gVarSource = null;
                                                        }
                                                    } catch (Exception e29) {
                                                        e = e29;
                                                        z10 = true;
                                                        assetDownloader = assetDownloader;
                                                        fVarC = null;
                                                        gVarSource = null;
                                                    }
                                                } catch (Exception e30) {
                                                    e = e30;
                                                    fVarC = null;
                                                    gVarSource = null;
                                                    z10 = true;
                                                    assetDownloader = assetDownloader;
                                                    Logger.Companion companion17 = Logger.Companion;
                                                    companion17.e(TAG, "Download exception for " + asset.getServerPath() + ": " + e);
                                                    progress.setStatus(AssetDownloadListener.Progress.ProgressStatus.Companion.getERROR());
                                                    AssetDownloadListener.DownloadError downloadError13 = new AssetDownloadListener.DownloadError(iH, e, AssetDownloadListener.DownloadError.ErrorReason.Companion.getREQUEST_ERROR());
                                                    if (b0VarExecute != null) {
                                                        c0VarB3 = b0VarExecute.b();
                                                    } else {
                                                        c0VarB3 = null;
                                                    }
                                                    if (c0VarB3 != null) {
                                                        c0VarB4.close();
                                                        g0 g0Var1113 = g0.f27756a;
                                                    }
                                                    if (eVarA != null) {
                                                        eVarA.cancel();
                                                        g0 g0Var1114 = g0.f27756a;
                                                    }
                                                    FileUtility fileUtility112 = FileUtility.INSTANCE;
                                                    fileUtility112.closeQuietly(fVarC);
                                                    fileUtility112.closeQuietly(gVarSource);
                                                    companion17.d(TAG, str2 + progress.getStatus());
                                                    downloadError = downloadError13;
                                                    status = progress.getStatus();
                                                    companion = AssetDownloadListener.Progress.ProgressStatus.Companion;
                                                    if (status == companion.getERROR()) {
                                                        z11 = z10;
                                                    } else {
                                                        z11 = false;
                                                    }
                                                    if (z11) {
                                                        return downloadError;
                                                    }
                                                    if (status == companion.getCANCELLED()) {
                                                        Logger.Companion.d(TAG, "On cancel " + downloadRequest);
                                                        assetDownloader.onProgressChanged(downloadRequest, progress, assetDownloadListener);
                                                    } else {
                                                        assetDownloader.deliverSuccess(file, downloadRequest, assetDownloadListener);
                                                        currentRetryAttempt$vungle_ads_release = downloadRequest.getCurrentRetryAttempt$vungle_ads_release();
                                                        if (currentRetryAttempt$vungle_ads_release > 0) {
                                                            AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(Sdk.SDKMetric.SDKMetricType.ASSET_DOWNLOAD_RETRY_STATUS, 1L, downloadRequest.getLogEntry$vungle_ads_release(), "retryCount=" + currentRetryAttempt$vungle_ads_release + " url=" + downloadRequest.getAsset().getServerPath());
                                                        }
                                                    }
                                                    return null;
                                                }
                                            } catch (Throwable th11) {
                                                th = th11;
                                                eVarA = eVarA;
                                                gVarSource = null;
                                                fVar = null;
                                            }
                                        } catch (Exception e31) {
                                            e = e31;
                                            asset = asset;
                                            eVarA = eVarA;
                                            file = file;
                                            z10 = true;
                                            fVarC = null;
                                            gVarSource = null;
                                            assetDownloader = assetDownloader;
                                        }
                                        status = progress.getStatus();
                                        companion = AssetDownloadListener.Progress.ProgressStatus.Companion;
                                        if (status == companion.getERROR()) {
                                            z11 = z10;
                                        } else {
                                            z11 = false;
                                        }
                                        if (z11) {
                                            return downloadError;
                                        }
                                        if (status == companion.getCANCELLED()) {
                                            Logger.Companion.d(TAG, "On cancel " + downloadRequest);
                                            assetDownloader.onProgressChanged(downloadRequest, progress, assetDownloadListener);
                                        } else {
                                            assetDownloader.deliverSuccess(file, downloadRequest, assetDownloadListener);
                                            currentRetryAttempt$vungle_ads_release = downloadRequest.getCurrentRetryAttempt$vungle_ads_release();
                                            if (currentRetryAttempt$vungle_ads_release > 0) {
                                                AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(Sdk.SDKMetric.SDKMetricType.ASSET_DOWNLOAD_RETRY_STATUS, 1L, downloadRequest.getLogEntry$vungle_ads_release(), "retryCount=" + currentRetryAttempt$vungle_ads_release + " url=" + downloadRequest.getAsset().getServerPath());
                                            }
                                        }
                                        return null;
                                    }
                                    eVarA = eVarA;
                                    z10 = true;
                                    i10 = iH;
                                    try {
                                        throw new Downloader.RequestException(b0VarExecute.u());
                                    } catch (Exception e32) {
                                        e = e32;
                                    } catch (Throwable th12) {
                                        th = th12;
                                        gVarSource = null;
                                        fVar = null;
                                        if (b0VarExecute != null) {
                                            c0VarB = b0VarExecute.b();
                                        } else {
                                            c0VarB = null;
                                        }
                                        if (c0VarB != null) {
                                            c0VarB2.close();
                                            g0 g0Var212 = g0.f27756a;
                                        }
                                        if (eVarA != null) {
                                            eVarA.cancel();
                                            g0 g0Var213 = g0.f27756a;
                                        }
                                        FileUtility fileUtility113 = FileUtility.INSTANCE;
                                        fileUtility113.closeQuietly(fVar);
                                        fileUtility113.closeQuietly(gVarSource);
                                        Logger.Companion.d(TAG, str2 + progress.getStatus());
                                        throw th;
                                    }
                                    iH = i10;
                                } catch (Exception e33) {
                                    e = e33;
                                    z10 = true;
                                }
                            } catch (Exception e34) {
                                e = e34;
                                z10 = true;
                            }
                        } catch (Throwable th13) {
                            th = th13;
                            eVarA = eVarA;
                        }
                        fVarC = null;
                        gVarSource = null;
                    } catch (Exception e35) {
                        e = e35;
                        asset = asset;
                        eVarA = eVarA;
                        file = file;
                        z10 = true;
                        assetDownloader = assetDownloader;
                        fVarC = null;
                        gVarSource = null;
                        b0VarExecute = null;
                    } catch (Throwable th14) {
                        th = th14;
                        eVarA = eVarA;
                        gVarSource = null;
                        fVar = null;
                        b0VarExecute = null;
                    }
                } catch (Exception e36) {
                    e = e36;
                    assetDownloader = assetDownloader;
                    asset = asset;
                    fVarC = null;
                    b0VarExecute = null;
                    eVarA = null;
                    file = file;
                    z10 = true;
                    gVarSource = null;
                } catch (Throwable th15) {
                    th = th15;
                    gVarSource = null;
                    fVar = null;
                    b0VarExecute = null;
                    eVarA = null;
                }
                Logger.Companion companion18 = Logger.Companion;
                companion18.e(TAG, "Download exception for " + asset.getServerPath() + ": " + e);
                progress.setStatus(AssetDownloadListener.Progress.ProgressStatus.Companion.getERROR());
                AssetDownloadListener.DownloadError downloadError14 = new AssetDownloadListener.DownloadError(iH, e, AssetDownloadListener.DownloadError.ErrorReason.Companion.getREQUEST_ERROR());
                if (b0VarExecute != null) {
                    c0VarB3 = b0VarExecute.b();
                } else {
                    c0VarB3 = null;
                }
                if (c0VarB3 != null) {
                    c0VarB4.close();
                    g0 g0Var1115 = g0.f27756a;
                }
                if (eVarA != null) {
                    eVarA.cancel();
                    g0 g0Var1116 = g0.f27756a;
                }
                FileUtility fileUtility114 = FileUtility.INSTANCE;
                fileUtility114.closeQuietly(fVarC);
                fileUtility114.closeQuietly(gVarSource);
                companion18.d(TAG, str2 + progress.getStatus());
                downloadError = downloadError14;
                status = progress.getStatus();
                companion = AssetDownloadListener.Progress.ProgressStatus.Companion;
                if (status == companion.getERROR()) {
                    z11 = z10;
                } else {
                    z11 = false;
                }
                if (z11) {
                    return downloadError;
                }
                if (status == companion.getCANCELLED()) {
                    Logger.Companion.d(TAG, "On cancel " + downloadRequest);
                    assetDownloader.onProgressChanged(downloadRequest, progress, assetDownloadListener);
                } else {
                    assetDownloader.deliverSuccess(file, downloadRequest, assetDownloadListener);
                    currentRetryAttempt$vungle_ads_release = downloadRequest.getCurrentRetryAttempt$vungle_ads_release();
                    if (currentRetryAttempt$vungle_ads_release > 0) {
                        AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(Sdk.SDKMetric.SDKMetricType.ASSET_DOWNLOAD_RETRY_STATUS, 1L, downloadRequest.getLogEntry$vungle_ads_release(), "retryCount=" + currentRetryAttempt$vungle_ads_release + " url=" + downloadRequest.getAsset().getServerPath());
                    }
                }
                return null;
            } catch (Throwable th16) {
                th = th16;
                fVar = fVarC;
                if (b0VarExecute != null) {
                    c0VarB = b0VarExecute.b();
                } else {
                    c0VarB = null;
                }
                if (c0VarB != null) {
                    c0VarB2.close();
                    g0 g0Var214 = g0.f27756a;
                }
                if (eVarA != null) {
                    eVarA.cancel();
                    g0 g0Var215 = g0.f27756a;
                }
                FileUtility fileUtility115 = FileUtility.INSTANCE;
                fileUtility115.closeQuietly(fVar);
                fileUtility115.closeQuietly(gVarSource);
                Logger.Companion.d(TAG, str2 + progress.getStatus());
                throw th;
            }
        } catch (Exception e37) {
            e = e37;
            assetDownloader = assetDownloader;
            asset = asset;
            file = file;
            z10 = true;
            fVarC = null;
            gVarSource = null;
            b0VarExecute = null;
            eVarA = null;
        } catch (Throwable th17) {
            th = th17;
            gVarSource = null;
            fVar = null;
            b0VarExecute = null;
            eVarA = null;
        }
        if (b0VarExecute != null) {
            c0VarB = b0VarExecute.b();
        } else {
            c0VarB = null;
        }
        if (c0VarB != null && (c0VarB2 = b0VarExecute.b()) != null) {
            c0VarB2.close();
            g0 g0Var216 = g0.f27756a;
        }
        if (eVarA != null) {
            eVarA.cancel();
            g0 g0Var217 = g0.f27756a;
        }
        FileUtility fileUtility116 = FileUtility.INSTANCE;
        fileUtility116.closeQuietly(fVar);
        fileUtility116.closeQuietly(gVarSource);
        Logger.Companion.d(TAG, str2 + progress.getStatus());
        throw th;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void launchRequestWithRetry(DownloadRequest downloadRequest, AssetDownloadListener assetDownloadListener) throws Throwable {
        if (assetDownloadListener != null) {
            assetDownloadListener.onStart(downloadRequest);
        }
        AssetDownloadListener.DownloadError downloadErrorLaunchRequest = launchRequest(downloadRequest, assetDownloadListener);
        while (downloadErrorLaunchRequest != null && shouldRetryDownload(downloadRequest, downloadErrorLaunchRequest)) {
            downloadRequest.incrementRetryAttempt$vungle_ads_release();
            downloadRequest.recordRetryReason$vungle_ads_release("Error: " + downloadErrorLaunchRequest.getCause().getMessage() + ", Code: " + downloadErrorLaunchRequest.getServerCode() + ", Reason: " + downloadErrorLaunchRequest.getReason());
            Logger.Companion.w(TAG, "Download failed, retrying immediately. Attempt " + downloadRequest.getCurrentRetryAttempt$vungle_ads_release() + '/' + downloadRequest.getMaxRetries$vungle_ads_release() + ". URL: " + downloadRequest.getAsset().getServerPath() + ", Error: " + downloadErrorLaunchRequest.getCause().getMessage());
            downloadErrorLaunchRequest = launchRequest(downloadRequest, assetDownloadListener);
        }
        if (downloadErrorLaunchRequest != null) {
            Logger.Companion.e(TAG, "Download failed after " + (downloadRequest.getCurrentRetryAttempt$vungle_ads_release() + 1) + cTJaRZ.gLcRF + downloadRequest.getAsset().getServerPath() + ". Retry history: " + downloadRequest.getRetryReasons$vungle_ads_release());
            if (downloadRequest.getCurrentRetryAttempt$vungle_ads_release() > 0) {
                AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(Sdk.SDKMetric.SDKMetricType.ASSET_DOWNLOAD_RETRY_STATUS, 2L, downloadRequest.getLogEntry$vungle_ads_release(), "retryCount=" + downloadRequest.getCurrentRetryAttempt$vungle_ads_release() + " url=" + downloadRequest.getAsset().getServerPath());
            }
            deliverError(downloadRequest, assetDownloadListener, downloadErrorLaunchRequest);
        }
    }
}
