package o9;

import v8.f0;
import x7.a0;
import x7.l0;

/* JADX INFO: compiled from: XingFrame.java */
/* JADX INFO: loaded from: classes4.dex */
final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0.a f23267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f23268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f23269c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f23270d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f23271e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long[] f23272f;

    private i(f0.a aVar, long j10, long j11, long[] jArr, int i10, int i11) {
        this.f23267a = new f0.a(aVar);
        this.f23268b = j10;
        this.f23269c = j11;
        this.f23272f = jArr;
        this.f23270d = i10;
        this.f23271e = i11;
    }

    public static i b(f0.a aVar, a0 a0Var) {
        long[] jArr;
        int i10;
        int i11;
        int iQ = a0Var.q();
        int iL = (iQ & 1) != 0 ? a0Var.L() : -1;
        long J = (iQ & 2) != 0 ? a0Var.J() : -1L;
        if ((iQ & 4) == 4) {
            long[] jArr2 = new long[100];
            for (int i12 = 0; i12 < 100; i12++) {
                jArr2[i12] = a0Var.H();
            }
            jArr = jArr2;
        } else {
            jArr = null;
        }
        if ((iQ & 8) != 0) {
            a0Var.X(4);
        }
        if (a0Var.a() >= 24) {
            a0Var.X(21);
            int iK = a0Var.K();
            i11 = iK & 4095;
            i10 = (16773120 & iK) >> 12;
        } else {
            i10 = -1;
            i11 = -1;
        }
        return new i(aVar, iL, J, jArr, i10, i11);
    }

    public long a() {
        long j10 = this.f23268b;
        if (j10 == -1 || j10 == 0) {
            return -9223372036854775807L;
        }
        f0.a aVar = this.f23267a;
        return l0.e1((j10 * ((long) aVar.f27323g)) - 1, aVar.f27320d);
    }
}
