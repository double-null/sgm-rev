package ca;

import java.io.IOException;

/* JADX INFO: compiled from: TsDurationReader.java */
/* JADX INFO: loaded from: classes4.dex */
final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f5148a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f5151d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f5152e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f5153f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x7.g0 f5149b = new x7.g0(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f5154g = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f5155h = -9223372036854775807L;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f5156i = -9223372036854775807L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x7.a0 f5150c = new x7.a0();

    i0(int i10) {
        this.f5148a = i10;
    }

    private int a(v8.q qVar) {
        this.f5150c.T(x7.l0.f28141f);
        this.f5151d = true;
        qVar.d();
        return 0;
    }

    private int f(v8.q qVar, v8.i0 i0Var, int i10) throws IOException {
        int iMin = (int) Math.min(this.f5148a, qVar.getLength());
        long j10 = 0;
        if (qVar.getPosition() != j10) {
            i0Var.f27344a = j10;
            return 1;
        }
        this.f5150c.S(iMin);
        qVar.d();
        qVar.n(this.f5150c.e(), 0, iMin);
        this.f5154g = g(this.f5150c, i10);
        this.f5152e = true;
        return 0;
    }

    private long g(x7.a0 a0Var, int i10) {
        int iG = a0Var.g();
        for (int iF = a0Var.f(); iF < iG; iF++) {
            if (a0Var.e()[iF] == 71) {
                long jC = m0.c(a0Var, iF, i10);
                if (jC != -9223372036854775807L) {
                    return jC;
                }
            }
        }
        return -9223372036854775807L;
    }

    private int h(v8.q qVar, v8.i0 i0Var, int i10) throws IOException {
        long length = qVar.getLength();
        int iMin = (int) Math.min(this.f5148a, length);
        long j10 = length - ((long) iMin);
        if (qVar.getPosition() != j10) {
            i0Var.f27344a = j10;
            return 1;
        }
        this.f5150c.S(iMin);
        qVar.d();
        qVar.n(this.f5150c.e(), 0, iMin);
        this.f5155h = i(this.f5150c, i10);
        this.f5153f = true;
        return 0;
    }

    private long i(x7.a0 a0Var, int i10) {
        int iF = a0Var.f();
        int iG = a0Var.g();
        for (int i11 = iG - 188; i11 >= iF; i11--) {
            if (m0.b(a0Var.e(), iF, iG, i11)) {
                long jC = m0.c(a0Var, i11, i10);
                if (jC != -9223372036854775807L) {
                    return jC;
                }
            }
        }
        return -9223372036854775807L;
    }

    public long b() {
        return this.f5156i;
    }

    public x7.g0 c() {
        return this.f5149b;
    }

    public boolean d() {
        return this.f5151d;
    }

    public int e(v8.q qVar, v8.i0 i0Var, int i10) throws IOException {
        if (i10 <= 0) {
            return a(qVar);
        }
        if (!this.f5153f) {
            return h(qVar, i0Var, i10);
        }
        if (this.f5155h == -9223372036854775807L) {
            return a(qVar);
        }
        if (!this.f5152e) {
            return f(qVar, i0Var, i10);
        }
        long j10 = this.f5154g;
        if (j10 == -9223372036854775807L) {
            return a(qVar);
        }
        this.f5156i = this.f5149b.c(this.f5155h) - this.f5149b.b(j10);
        return a(qVar);
    }
}
