package f8;

import android.net.Uri;
import x7.i0;

/* JADX INFO: compiled from: RangedUri.java */
/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f14712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f14713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f14714d;

    public i(String str, long j10, long j11) {
        this.f14713c = str == null ? "" : str;
        this.f14711a = j10;
        this.f14712b = j11;
    }

    public i a(i iVar, String str) {
        String strC = c(str);
        if (iVar != null && strC.equals(iVar.c(str))) {
            long j10 = this.f14712b;
            if (j10 != -1) {
                long j11 = this.f14711a;
                if (j11 + j10 == iVar.f14711a) {
                    long j12 = iVar.f14712b;
                    return new i(strC, j11, j12 != -1 ? j10 + j12 : -1L);
                }
            }
            long j13 = iVar.f14712b;
            if (j13 != -1) {
                long j14 = iVar.f14711a;
                if (j14 + j13 == this.f14711a) {
                    return new i(strC, j14, j10 != -1 ? j13 + j10 : -1L);
                }
            }
        }
        return null;
    }

    public Uri b(String str) {
        return i0.f(str, this.f14713c);
    }

    public String c(String str) {
        return i0.e(str, this.f14713c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        return this.f14711a == iVar.f14711a && this.f14712b == iVar.f14712b && this.f14713c.equals(iVar.f14713c);
    }

    public int hashCode() {
        if (this.f14714d == 0) {
            this.f14714d = ((((527 + ((int) this.f14711a)) * 31) + ((int) this.f14712b)) * 31) + this.f14713c.hashCode();
        }
        return this.f14714d;
    }

    public String toString() {
        return "RangedUri(referenceUri=" + this.f14713c + ", start=" + this.f14711a + ", length=" + this.f14712b + ")";
    }
}
