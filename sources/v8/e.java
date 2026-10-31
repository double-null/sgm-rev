package v8;

import java.io.IOException;

/* JADX INFO: compiled from: BinarySearchSeeker.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final a f27284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final f f27285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected c f27286c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f27287d;

    /* JADX INFO: compiled from: BinarySearchSeeker.java */
    public static class a implements j0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f27288a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f27289b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f27290c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f27291d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final long f27292e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final long f27293f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final long f27294g;

        public a(d dVar, long j10, long j11, long j12, long j13, long j14, long j15) {
            this.f27288a = dVar;
            this.f27289b = j10;
            this.f27290c = j11;
            this.f27291d = j12;
            this.f27292e = j13;
            this.f27293f = j14;
            this.f27294g = j15;
        }

        @Override // v8.j0
        public j0.a d(long j10) {
            return new j0.a(new k0(j10, c.h(this.f27288a.a(j10), this.f27290c, this.f27291d, this.f27292e, this.f27293f, this.f27294g)));
        }

        @Override // v8.j0
        public boolean h() {
            return true;
        }

        @Override // v8.j0
        public long k() {
            return this.f27289b;
        }

        public long l(long j10) {
            return this.f27288a.a(j10);
        }
    }

    /* JADX INFO: compiled from: BinarySearchSeeker.java */
    protected static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f27295a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f27296b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f27297c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f27298d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f27299e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f27300f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f27301g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f27302h;

        protected c(long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
            this.f27295a = j10;
            this.f27296b = j11;
            this.f27298d = j12;
            this.f27299e = j13;
            this.f27300f = j14;
            this.f27301g = j15;
            this.f27297c = j16;
            this.f27302h = h(j11, j12, j13, j14, j15, j16);
        }

        protected static long h(long j10, long j11, long j12, long j13, long j14, long j15) {
            if (j13 + 1 >= j14 || j11 + 1 >= j12) {
                return j13;
            }
            long j16 = (long) ((j10 - j11) * ((j14 - j13) / (j12 - j11)));
            return x7.l0.q(((j16 + j13) - j15) - (j16 / 20), j13, j14 - 1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long i() {
            return this.f27301g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long j() {
            return this.f27300f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long k() {
            return this.f27302h;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long l() {
            return this.f27295a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long m() {
            return this.f27296b;
        }

        private void n() {
            this.f27302h = h(this.f27296b, this.f27298d, this.f27299e, this.f27300f, this.f27301g, this.f27297c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void o(long j10, long j11) {
            this.f27299e = j10;
            this.f27301g = j11;
            n();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void p(long j10, long j11) {
            this.f27298d = j10;
            this.f27300f = j11;
            n();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: compiled from: BinarySearchSeeker.java */
    public interface d {
        long a(long j10);
    }

    /* JADX INFO: renamed from: v8.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BinarySearchSeeker.java */
    public static final class C0455e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final C0455e f27303d = new C0455e(-3, -9223372036854775807L, -1);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f27304a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f27305b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f27306c;

        private C0455e(int i10, long j10, long j11) {
            this.f27304a = i10;
            this.f27305b = j10;
            this.f27306c = j11;
        }

        public static C0455e d(long j10, long j11) {
            return new C0455e(-1, j10, j11);
        }

        public static C0455e e(long j10) {
            return new C0455e(0, -9223372036854775807L, j10);
        }

        public static C0455e f(long j10, long j11) {
            return new C0455e(-2, j10, j11);
        }
    }

    protected e(d dVar, f fVar, long j10, long j11, long j12, long j13, long j14, long j15, int i10) {
        this.f27285b = fVar;
        this.f27287d = i10;
        this.f27284a = new a(dVar, j10, j11, j12, j13, j14, j15);
    }

    protected c a(long j10) {
        return new c(j10, this.f27284a.l(j10), this.f27284a.f27290c, this.f27284a.f27291d, this.f27284a.f27292e, this.f27284a.f27293f, this.f27284a.f27294g);
    }

    public final j0 b() {
        return this.f27284a;
    }

    public int c(q qVar, i0 i0Var) throws IOException {
        while (true) {
            c cVar = (c) x7.a.i(this.f27286c);
            long j10 = cVar.j();
            long jI = cVar.i();
            long jK = cVar.k();
            if (jI - j10 <= this.f27287d) {
                e(false, j10);
                return g(qVar, j10, i0Var);
            }
            if (!i(qVar, jK)) {
                return g(qVar, jK, i0Var);
            }
            qVar.d();
            C0455e c0455eA = this.f27285b.a(qVar, cVar.m());
            int i10 = c0455eA.f27304a;
            if (i10 == -3) {
                e(false, jK);
                return g(qVar, jK, i0Var);
            }
            if (i10 == -2) {
                cVar.p(c0455eA.f27305b, c0455eA.f27306c);
            } else {
                if (i10 != -1) {
                    if (i10 != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    i(qVar, c0455eA.f27306c);
                    e(true, c0455eA.f27306c);
                    return g(qVar, c0455eA.f27306c, i0Var);
                }
                cVar.o(c0455eA.f27305b, c0455eA.f27306c);
            }
        }
    }

    public final boolean d() {
        return this.f27286c != null;
    }

    protected final void e(boolean z10, long j10) {
        this.f27286c = null;
        this.f27285b.b();
        f(z10, j10);
    }

    protected final int g(q qVar, long j10, i0 i0Var) {
        if (j10 == qVar.getPosition()) {
            return 0;
        }
        i0Var.f27344a = j10;
        return 1;
    }

    public final void h(long j10) {
        c cVar = this.f27286c;
        if (cVar == null || cVar.l() != j10) {
            this.f27286c = a(j10);
        }
    }

    protected final boolean i(q qVar, long j10) throws IOException {
        long position = j10 - qVar.getPosition();
        if (position < 0 || position > 262144) {
            return false;
        }
        qVar.k((int) position);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: compiled from: BinarySearchSeeker.java */
    public interface f {
        C0455e a(q qVar, long j10) throws IOException;

        default void b() {
        }
    }

    /* JADX INFO: compiled from: BinarySearchSeeker.java */
    public static final class b implements d {
        @Override // v8.e.d
        public long a(long j10) {
            return j10;
        }
    }

    protected void f(boolean z10, long j10) {
    }
}
