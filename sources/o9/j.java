package o9;

import v8.f0;
import v8.j0;
import v8.k0;
import x7.l0;

/* JADX INFO: compiled from: XingSeeker.java */
/* JADX INFO: loaded from: classes4.dex */
final class j implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f23273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f23274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f23275c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f23276d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f23277e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f23278f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long[] f23279g;

    private j(long j10, int i10, long j11, int i11) {
        this(j10, i10, j11, i11, -1L, null);
    }

    public static j a(i iVar, long j10) {
        long[] jArr;
        long jA = iVar.a();
        if (jA == -9223372036854775807L) {
            return null;
        }
        long j11 = iVar.f23269c;
        if (j11 == -1 || (jArr = iVar.f23272f) == null) {
            f0.a aVar = iVar.f23267a;
            return new j(j10, aVar.f27319c, jA, aVar.f27322f);
        }
        f0.a aVar2 = iVar.f23267a;
        return new j(j10, aVar2.f27319c, jA, aVar2.f27322f, j11, jArr);
    }

    private long c(int i10) {
        return (this.f23275c * ((long) i10)) / 100;
    }

    @Override // o9.g
    public long b(long j10) {
        long j11 = j10 - this.f23273a;
        if (!h() || j11 <= this.f23274b) {
            return 0L;
        }
        long[] jArr = (long[]) x7.a.i(this.f23279g);
        double d10 = (j11 * 256.0d) / this.f23277e;
        int iH = l0.h(jArr, (long) d10, true, true);
        long jC = c(iH);
        long j12 = jArr[iH];
        int i10 = iH + 1;
        long jC2 = c(i10);
        long j13 = iH == 99 ? 256L : jArr[i10];
        return jC + Math.round((j12 == j13 ? 0.0d : (d10 - j12) / (j13 - j12)) * (jC2 - jC));
    }

    @Override // v8.j0
    public j0.a d(long j10) {
        if (!h()) {
            return new j0.a(new k0(0L, this.f23273a + ((long) this.f23274b)));
        }
        long jQ = l0.q(j10, 0L, this.f23275c);
        double d10 = (jQ * 100.0d) / this.f23275c;
        double d11 = 0.0d;
        if (d10 > 0.0d) {
            if (d10 >= 100.0d) {
                d11 = 256.0d;
            } else {
                int i10 = (int) d10;
                long[] jArr = (long[]) x7.a.i(this.f23279g);
                double d12 = jArr[i10];
                d11 = d12 + ((d10 - ((double) i10)) * ((i10 == 99 ? 256.0d : jArr[i10 + 1]) - d12));
            }
        }
        return new j0.a(new k0(jQ, this.f23273a + l0.q(Math.round((d11 / 256.0d) * this.f23277e), this.f23274b, this.f23277e - 1)));
    }

    @Override // o9.g
    public long g() {
        return this.f23278f;
    }

    @Override // v8.j0
    public boolean h() {
        return this.f23279g != null;
    }

    @Override // o9.g
    public int j() {
        return this.f23276d;
    }

    @Override // v8.j0
    public long k() {
        return this.f23275c;
    }

    private j(long j10, int i10, long j11, int i11, long j12, long[] jArr) {
        this.f23273a = j10;
        this.f23274b = i10;
        this.f23275c = j11;
        this.f23276d = i11;
        this.f23277e = j12;
        this.f23279g = jArr;
        this.f23278f = j12 != -1 ? j10 + j12 : -1L;
    }
}
