package p9;

import x7.l0;

/* JADX INFO: compiled from: TrackSampleTable.java */
/* JADX INFO: loaded from: classes4.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f23703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f23705c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f23706d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f23707e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long[] f23708f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f23709g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f23710h;

    public w(t tVar, long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j10) {
        x7.a.a(iArr.length == jArr2.length);
        x7.a.a(jArr.length == jArr2.length);
        x7.a.a(iArr2.length == jArr2.length);
        this.f23703a = tVar;
        this.f23705c = jArr;
        this.f23706d = iArr;
        this.f23707e = i10;
        this.f23708f = jArr2;
        this.f23709g = iArr2;
        this.f23710h = j10;
        this.f23704b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public int a(long j10) {
        for (int iH = l0.h(this.f23708f, j10, true, false); iH >= 0; iH--) {
            if ((this.f23709g[iH] & 1) != 0) {
                return iH;
            }
        }
        return -1;
    }

    public int b(long j10) {
        for (int iD = l0.d(this.f23708f, j10, true, false); iD < this.f23708f.length; iD++) {
            if ((this.f23709g[iD] & 1) != 0) {
                return iD;
            }
        }
        return -1;
    }
}
