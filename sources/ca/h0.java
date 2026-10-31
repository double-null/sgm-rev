package ca;

import java.io.IOException;

/* JADX INFO: compiled from: TsBinarySearchSeeker.java */
/* JADX INFO: loaded from: classes4.dex */
final class h0 extends v8.e {

    /* JADX INFO: compiled from: TsBinarySearchSeeker.java */
    private static final class a implements v8.e.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final x7.g0 f5120a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final x7.a0 f5121b = new x7.a0();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f5122c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f5123d;

        public a(int i10, x7.g0 g0Var, int i11) {
            this.f5122c = i10;
            this.f5120a = g0Var;
            this.f5123d = i11;
        }

        private v8.e.C0455e c(x7.a0 a0Var, long j10, long j11) {
            int iA;
            int iA2;
            int iG = a0Var.g();
            long j12 = -1;
            long j13 = -1;
            long j14 = -9223372036854775807L;
            while (a0Var.a() >= 188 && (iA2 = (iA = m0.a(a0Var.e(), a0Var.f(), iG)) + 188) <= iG) {
                long jC = m0.c(a0Var, iA, this.f5122c);
                if (jC != -9223372036854775807L) {
                    long jB = this.f5120a.b(jC);
                    if (jB > j10) {
                        return j14 == -9223372036854775807L ? v8.e.C0455e.d(jB, j11) : v8.e.C0455e.e(j11 + j13);
                    }
                    if (100000 + jB > j10) {
                        return v8.e.C0455e.e(j11 + ((long) iA));
                    }
                    j13 = iA;
                    j14 = jB;
                }
                a0Var.W(iA2);
                j12 = iA2;
            }
            return j14 != -9223372036854775807L ? v8.e.C0455e.f(j14, j11 + j12) : v8.e.C0455e.f27303d;
        }

        @Override // v8.e.f
        public v8.e.C0455e a(v8.q qVar, long j10) throws IOException {
            long position = qVar.getPosition();
            int iMin = (int) Math.min(this.f5123d, qVar.getLength() - position);
            this.f5121b.S(iMin);
            qVar.n(this.f5121b.e(), 0, iMin);
            return c(this.f5121b, j10, position);
        }

        @Override // v8.e.f
        public void b() {
            this.f5121b.T(x7.l0.f28141f);
        }
    }

    public h0(x7.g0 g0Var, long j10, long j11, int i10, int i11) {
        super(new v8.e.b(), new a(i10, g0Var, i11), j10, 0L, j10 + 1, 0L, j11, 188L, 940);
    }
}
