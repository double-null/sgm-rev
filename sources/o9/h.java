package o9;

import v8.f0;
import v8.j0;
import v8.k0;
import x7.a0;
import x7.l0;
import x7.r;

/* JADX INFO: compiled from: VbriSeeker.java */
/* JADX INFO: loaded from: classes4.dex */
final class h implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long[] f23262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f23263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f23264c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f23265d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f23266e;

    private h(long[] jArr, long[] jArr2, long j10, long j11, int i10) {
        this.f23262a = jArr;
        this.f23263b = jArr2;
        this.f23264c = j10;
        this.f23265d = j11;
        this.f23266e = i10;
    }

    public static h a(long j10, long j11, f0.a aVar, a0 a0Var) {
        int iH;
        a0Var.X(6);
        long jQ = j11 + ((long) aVar.f27319c) + ((long) a0Var.q());
        int iQ = a0Var.q();
        if (iQ <= 0) {
            return null;
        }
        long jE1 = l0.e1((((long) iQ) * ((long) aVar.f27323g)) - 1, aVar.f27320d);
        int iP = a0Var.P();
        int iP2 = a0Var.P();
        int iP3 = a0Var.P();
        a0Var.X(2);
        long j12 = j11 + ((long) aVar.f27319c);
        long[] jArr = new long[iP];
        long[] jArr2 = new long[iP];
        int i10 = 0;
        while (i10 < iP) {
            long j13 = jE1;
            jArr[i10] = (((long) i10) * jE1) / ((long) iP);
            jArr2[i10] = j12;
            if (iP3 == 1) {
                iH = a0Var.H();
            } else if (iP3 == 2) {
                iH = a0Var.P();
            } else if (iP3 == 3) {
                iH = a0Var.K();
            } else {
                if (iP3 != 4) {
                    return null;
                }
                iH = a0Var.L();
            }
            j12 += ((long) iH) * ((long) iP2);
            i10++;
            jE1 = j13;
        }
        long j14 = jE1;
        if (j10 != -1 && j10 != jQ) {
            r.h("VbriSeeker", "VBRI data size mismatch: " + j10 + ", " + jQ);
        }
        if (jQ != j12) {
            r.h("VbriSeeker", "VBRI bytes and ToC mismatch (using max): " + jQ + ", " + j12 + "\nSeeking will be inaccurate.");
            jQ = Math.max(jQ, j12);
        }
        return new h(jArr, jArr2, j14, jQ, aVar.f27322f);
    }

    @Override // o9.g
    public long b(long j10) {
        return this.f23262a[l0.h(this.f23263b, j10, true, true)];
    }

    @Override // v8.j0
    public j0.a d(long j10) {
        int iH = l0.h(this.f23262a, j10, true, true);
        k0 k0Var = new k0(this.f23262a[iH], this.f23263b[iH]);
        if (k0Var.f27350a >= j10 || iH == this.f23262a.length - 1) {
            return new j0.a(k0Var);
        }
        int i10 = iH + 1;
        return new j0.a(k0Var, new k0(this.f23262a[i10], this.f23263b[i10]));
    }

    @Override // o9.g
    public long g() {
        return this.f23265d;
    }

    @Override // v8.j0
    public boolean h() {
        return true;
    }

    @Override // o9.g
    public int j() {
        return this.f23266e;
    }

    @Override // v8.j0
    public long k() {
        return this.f23264c;
    }
}
