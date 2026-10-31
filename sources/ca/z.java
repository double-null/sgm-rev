package ca;

import java.io.IOException;

/* JADX INFO: compiled from: PsBinarySearchSeeker.java */
/* JADX INFO: loaded from: classes4.dex */
final class z extends v8.e {

    /* JADX INFO: compiled from: PsBinarySearchSeeker.java */
    private static final class b implements v8.e.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final x7.g0 f5450a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final x7.a0 f5451b;

        private v8.e.C0455e c(x7.a0 a0Var, long j10, long j11) {
            int iF = -1;
            int iF2 = -1;
            long j12 = -9223372036854775807L;
            while (a0Var.a() >= 4) {
                if (z.k(a0Var.e(), a0Var.f()) != 442) {
                    a0Var.X(1);
                } else {
                    a0Var.X(4);
                    long jL = a0.l(a0Var);
                    if (jL != -9223372036854775807L) {
                        long jB = this.f5450a.b(jL);
                        if (jB > j10) {
                            return j12 == -9223372036854775807L ? v8.e.C0455e.d(jB, j11) : v8.e.C0455e.e(j11 + ((long) iF2));
                        }
                        if (100000 + jB > j10) {
                            return v8.e.C0455e.e(j11 + ((long) a0Var.f()));
                        }
                        iF2 = a0Var.f();
                        j12 = jB;
                    }
                    d(a0Var);
                    iF = a0Var.f();
                }
            }
            return j12 != -9223372036854775807L ? v8.e.C0455e.f(j12, j11 + ((long) iF)) : v8.e.C0455e.f27303d;
        }

        private static void d(x7.a0 a0Var) {
            int iK;
            int iG = a0Var.g();
            if (a0Var.a() < 10) {
                a0Var.W(iG);
                return;
            }
            a0Var.X(9);
            int iH = a0Var.H() & 7;
            if (a0Var.a() < iH) {
                a0Var.W(iG);
                return;
            }
            a0Var.X(iH);
            if (a0Var.a() < 4) {
                a0Var.W(iG);
                return;
            }
            if (z.k(a0Var.e(), a0Var.f()) == 443) {
                a0Var.X(4);
                int iP = a0Var.P();
                if (a0Var.a() < iP) {
                    a0Var.W(iG);
                    return;
                }
                a0Var.X(iP);
            }
            while (a0Var.a() >= 4 && (iK = z.k(a0Var.e(), a0Var.f())) != 442 && iK != 441 && (iK >>> 8) == 1) {
                a0Var.X(4);
                if (a0Var.a() < 2) {
                    a0Var.W(iG);
                    return;
                }
                a0Var.W(Math.min(a0Var.g(), a0Var.f() + a0Var.P()));
            }
        }

        @Override // v8.e.f
        public v8.e.C0455e a(v8.q qVar, long j10) throws IOException {
            long position = qVar.getPosition();
            int iMin = (int) Math.min(20000L, qVar.getLength() - position);
            this.f5451b.S(iMin);
            qVar.n(this.f5451b.e(), 0, iMin);
            return c(this.f5451b, j10, position);
        }

        @Override // v8.e.f
        public void b() {
            this.f5451b.T(x7.l0.f28141f);
        }

        private b(x7.g0 g0Var) {
            this.f5450a = g0Var;
            this.f5451b = new x7.a0();
        }
    }

    public z(x7.g0 g0Var, long j10, long j11) {
        super(new v8.e.b(), new b(g0Var), j10, 0L, j10 + 1, 0L, j11, 188L, 1000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int k(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }
}
