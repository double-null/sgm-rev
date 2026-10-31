package com.vungle.ads.internal.model;

import com.vungle.ads.internal.util.Logger;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import pb.vBC.NyXuoef;
import wc.g0;
import wc.r;
import wc.s;

/* JADX INFO: compiled from: AdAsset.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class AdAsset {
    private final String adIdentifier;
    private long contentLength;
    private long fileSize;
    private final boolean isRequired;
    private final String localPath;
    private String mimeType;
    private final Integer percentage;
    private Long rangeEnd;
    private long rangeStart;
    private final String serverPath;
    private Status status;
    private final Object waitLock;
    private final AtomicBoolean waitingForDownload;

    /* JADX INFO: compiled from: AdAsset.kt */
    public enum Status {
        NEW,
        DOWNLOAD_RUNNING,
        DOWNLOAD_FAILED,
        DOWNLOAD_SUCCESS,
        PROCESSED
    }

    public AdAsset(String adIdentifier, String serverPath, String localPath, boolean z10, Integer num) {
        t.f(adIdentifier, "adIdentifier");
        t.f(serverPath, "serverPath");
        t.f(localPath, "localPath");
        this.adIdentifier = adIdentifier;
        this.serverPath = serverPath;
        this.localPath = localPath;
        this.isRequired = z10;
        this.percentage = num;
        this.status = Status.NEW;
        this.mimeType = "application/octet-stream";
        this.waitLock = new Object();
        this.waitingForDownload = new AtomicBoolean(false);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !t.a(AdAsset.class, obj.getClass())) {
            return false;
        }
        AdAsset adAsset = (AdAsset) obj;
        if (this.status == adAsset.status && this.fileSize == adAsset.fileSize && this.isRequired == adAsset.isRequired && t.a(this.adIdentifier, adAsset.adIdentifier) && t.a(this.serverPath, adAsset.serverPath) && this.contentLength == adAsset.contentLength && t.a(this.percentage, adAsset.percentage)) {
            return t.a(this.localPath, adAsset.localPath);
        }
        return false;
    }

    public final String getAdIdentifier() {
        return this.adIdentifier;
    }

    public final long getContentLength() {
        return this.contentLength;
    }

    public final long getFileSize() {
        return this.fileSize;
    }

    public final String getLocalPath() {
        return this.localPath;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final Integer getPercentage() {
        return this.percentage;
    }

    public final Long getRangeEnd() {
        return this.rangeEnd;
    }

    public final long getRangeStart() {
        return this.rangeStart;
    }

    public final String getServerPath() {
        return this.serverPath;
    }

    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        int iHashCode = ((((((this.adIdentifier.hashCode() * 31) + this.serverPath.hashCode()) * 31) + this.localPath.hashCode()) * 31) + this.status.hashCode()) * 31;
        long j10 = this.fileSize;
        int iHashCode2 = (((iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31) + Boolean.hashCode(this.isRequired)) * 31;
        long j11 = this.contentLength;
        int i10 = (iHashCode2 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        Integer num = this.percentage;
        return i10 + (num != null ? num.hashCode() : 0);
    }

    public final boolean isDownloaded() {
        return this.status == Status.DOWNLOAD_SUCCESS;
    }

    public final boolean isHtmlTemplate() {
        return t.a(this.adIdentifier, AdPayload.KEY_VM);
    }

    public final boolean isMainVideo() {
        return t.a(this.adIdentifier, "MAIN_VIDEO");
    }

    public final boolean isPrivacyIcon() {
        return t.a(this.adIdentifier, "VUNGLE_PRIVACY_ICON_URL");
    }

    public final boolean isRequired() {
        return this.isRequired;
    }

    public final boolean isWaitingForDownload() {
        return this.waitingForDownload.get();
    }

    public final void notifyDownloadEnough() {
        if (this.waitingForDownload.getAndSet(false)) {
            synchronized (this.waitLock) {
                this.waitLock.notifyAll();
                g0 g0Var = g0.f27756a;
            }
        }
    }

    public final void setContentLength(long j10) {
        this.contentLength = j10;
    }

    public final void setFileSize(long j10) {
        this.fileSize = j10;
    }

    public final void setMimeType(String str) {
        t.f(str, "<set-?>");
        this.mimeType = str;
    }

    public final void setRangeEnd(Long l10) {
        this.rangeEnd = l10;
    }

    public final void setRangeStart(long j10) {
        this.rangeStart = j10;
    }

    public final void setStatus(Status status) {
        t.f(status, "<set-?>");
        this.status = status;
    }

    public String toString() {
        return "AdAsset(adIdentifier=" + this.adIdentifier + ", serverPath=" + this.serverPath + ", localPath=" + this.localPath + ", status=" + this.status + ", fileSize=" + this.fileSize + ", contentLength=" + this.contentLength + ", isRequired=" + this.isRequired + ", percentage=" + this.percentage + ')';
    }

    public final void waitForDownload() {
        Object objC;
        this.waitingForDownload.set(true);
        synchronized (this.waitLock) {
            try {
                r.a aVar = r.f27774b;
                this.waitLock.wait();
                objC = r.c(g0.f27756a);
            } catch (Throwable th) {
                r.a aVar2 = r.f27774b;
                objC = r.c(s.a(th));
            }
            Throwable thG = r.g(objC);
            if (thG != null) {
                Logger.Companion.e("AdAsset", "Interrupted while waiting for file download: " + this, thG);
            }
        }
    }

    public final boolean isMainAssets() {
        return t.a(this.adIdentifier, NyXuoef.jmFENhSgAZnQkhb) || t.a(this.adIdentifier, "MAIN_VIDEO");
    }

    public /* synthetic */ AdAsset(String str, String str2, String str3, boolean z10, Integer num, int i10, k kVar) {
        this(str, str2, str3, z10, (i10 & 16) != 0 ? null : num);
    }
}
