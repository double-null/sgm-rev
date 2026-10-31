package com.vungle.ads.internal.model;

import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: ErrorInfo.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class ErrorInfo {
    private final String description;
    private final boolean errorIsTerminal;
    private final boolean isRetryCode;

    public ErrorInfo(String description, boolean z10, boolean z11) {
        t.f(description, "description");
        this.description = description;
        this.errorIsTerminal = z10;
        this.isRetryCode = z11;
    }

    public static /* synthetic */ ErrorInfo copy$default(ErrorInfo errorInfo, String str, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = errorInfo.description;
        }
        if ((i10 & 2) != 0) {
            z10 = errorInfo.errorIsTerminal;
        }
        if ((i10 & 4) != 0) {
            z11 = errorInfo.isRetryCode;
        }
        return errorInfo.copy(str, z10, z11);
    }

    public final String component1() {
        return this.description;
    }

    public final boolean component2() {
        return this.errorIsTerminal;
    }

    public final boolean component3() {
        return this.isRetryCode;
    }

    public final ErrorInfo copy(String description, boolean z10, boolean z11) {
        t.f(description, "description");
        return new ErrorInfo(description, z10, z11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ErrorInfo)) {
            return false;
        }
        ErrorInfo errorInfo = (ErrorInfo) obj;
        return t.a(this.description, errorInfo.description) && this.errorIsTerminal == errorInfo.errorIsTerminal && this.isRetryCode == errorInfo.isRetryCode;
    }

    public final String getDescription() {
        return this.description;
    }

    public final boolean getErrorIsTerminal() {
        return this.errorIsTerminal;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = this.description.hashCode() * 31;
        boolean z10 = this.errorIsTerminal;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int i10 = (iHashCode + r10) * 31;
        boolean z11 = this.isRetryCode;
        return i10 + (z11 ? 1 : z11);
    }

    public final boolean isRetryCode() {
        return this.isRetryCode;
    }

    public String toString() {
        return "ErrorInfo(description=" + this.description + ", errorIsTerminal=" + this.errorIsTerminal + ", isRetryCode=" + this.isRetryCode + ')';
    }

    public /* synthetic */ ErrorInfo(String str, boolean z10, boolean z11, int i10, k kVar) {
        this(str, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? false : z11);
    }
}
