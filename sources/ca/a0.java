package ca;

import java.io.IOException;

/* JADX INFO: compiled from: PsDurationReader.java */
/* JADX INFO: loaded from: classes4.dex */
final class a0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f5033c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f5034d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f5035e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x7.g0 f5031a = new x7.g0(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f5036f = -9223372036854775807L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f5037g = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f5038h = -9223372036854775807L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x7.a0 f5032b = new x7.a0();

    a0() {
    }

    private static boolean a(byte[] bArr) {
        return (bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3;
    }

    private int b(v8.q qVar) {
        this.f5032b.T(x7.l0.f28141f);
        this.f5033c = true;
        qVar.d();
        return 0;
    }

    private int f(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    private int h(v8.q qVar, v8.i0 i0Var) throws IOException {
        int iMin = (int) Math.min(20000L, qVar.getLength());
        long j10 = 0;
        if (qVar.getPosition() != j10) {
            i0Var.f27344a = j10;
            return 1;
        }
        this.f5032b.S(iMin);
        qVar.d();
        qVar.n(this.f5032b.e(), 0, iMin);
        this.f5036f = i(this.f5032b);
        this.f5034d = true;
        return 0;
    }

    private long i(x7.a0 a0Var) {
        int iG = a0Var.g();
        for (int iF = a0Var.f(); iF < iG - 3; iF++) {
            if (f(a0Var.e(), iF) == 442) {
                a0Var.W(iF + 4);
                long jL = l(a0Var);
                if (jL != -9223372036854775807L) {
                    return jL;
                }
            }
        }
        return -9223372036854775807L;
    }

    private int j(v8.q qVar, v8.i0 i0Var) throws IOException {
        long length = qVar.getLength();
        int iMin = (int) Math.min(20000L, length);
        long j10 = length - ((long) iMin);
        if (qVar.getPosition() != j10) {
            i0Var.f27344a = j10;
            return 1;
        }
        this.f5032b.S(iMin);
        qVar.d();
        qVar.n(this.f5032b.e(), 0, iMin);
        this.f5037g = k(this.f5032b);
        this.f5035e = true;
        return 0;
    }

    private long k(x7.a0 a0Var) {
        int iF = a0Var.f();
        for (int iG = a0Var.g() - 4; iG >= iF; iG--) {
            if (f(a0Var.e(), iG) == 442) {
                a0Var.W(iG + 4);
                long jL = l(a0Var);
                if (jL != -9223372036854775807L) {
                    return jL;
                }
            }
        }
        return -9223372036854775807L;
    }

    public static long l(x7.a0 a0Var) {
        int iF = a0Var.f();
        if (a0Var.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        a0Var.l(bArr, 0, 9);
        a0Var.W(iF);
        if (a(bArr)) {
            return m(bArr);
        }
        return -9223372036854775807L;
    }

    private static long m(byte[] bArr) {
        byte b10 = bArr[0];
        long j10 = (((((long) b10) & 56) >> 3) << 30) | ((((long) b10) & 3) << 28) | ((((long) bArr[1]) & 255) << 20);
        byte b11 = bArr[2];
        return j10 | (((((long) b11) & 248) >> 3) << 15) | ((((long) b11) & 3) << 13) | ((((long) bArr[3]) & 255) << 5) | ((((long) bArr[4]) & 248) >> 3);
    }

    public long c() {
        return this.f5038h;
    }

    public x7.g0 d() {
        return this.f5031a;
    }

    public boolean e() {
        return this.f5033c;
    }

    public int g(v8.q qVar, v8.i0 i0Var) throws IOException {
        if (!this.f5035e) {
            return j(qVar, i0Var);
        }
        if (this.f5037g == -9223372036854775807L) {
            return b(qVar);
        }
        if (!this.f5034d) {
            return h(qVar, i0Var);
        }
        long j10 = this.f5036f;
        if (j10 == -9223372036854775807L) {
            return b(qVar);
        }
        this.f5038h = this.f5031a.c(this.f5037g) - this.f5031a.b(j10);
        return b(qVar);
    }
}
