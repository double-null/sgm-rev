package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.util.LogEntry;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: VungleError.kt */
/* JADX INFO: loaded from: classes4.dex */
public abstract class VungleError extends Exception {
    private final int code;
    private final String errorMessage;
    private LogEntry logEntry;
    private final Sdk.SDKError.Reason loggableReason;

    public /* synthetic */ VungleError(Sdk.SDKError.Reason reason, String str, k kVar) {
        this(reason, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!t.a(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        t.d(obj, "null cannot be cast to non-null type com.vungle.ads.VungleError");
        VungleError vungleError = (VungleError) obj;
        return this.loggableReason == vungleError.loggableReason && t.a(this.errorMessage, vungleError.errorMessage) && t.a(this.logEntry, vungleError.logEntry);
    }

    public final int getCode() {
        return this.code;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return this.errorMessage;
    }

    public int hashCode() {
        int iHashCode = ((this.loggableReason.hashCode() * 31) + this.errorMessage.hashCode()) * 31;
        LogEntry logEntry = this.logEntry;
        return iHashCode + (logEntry != null ? logEntry.hashCode() : 0);
    }

    public final VungleError logError$vungle_ads_release() {
        logErrorNoReturnValue$vungle_ads_release();
        return this;
    }

    public final void logErrorNoReturnValue$vungle_ads_release() {
        AnalyticsClient.INSTANCE.logError$vungle_ads_release(this.loggableReason, this.errorMessage, this.logEntry);
    }

    public final VungleError setLogEntry$vungle_ads_release(LogEntry logEntry) {
        this.logEntry = logEntry;
        return this;
    }

    private VungleError(Sdk.SDKError.Reason reason, String str) {
        super(str);
        this.loggableReason = reason;
        this.errorMessage = str;
        this.code = reason.getNumber();
    }
}
