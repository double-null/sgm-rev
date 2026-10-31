package q9;

import java.io.IOException;
import u7.q;
import v8.i0;
import v8.j0;
import v8.o0;
import v8.r;
import x7.a0;
import x7.l0;

/* JADX INFO: compiled from: StreamReader.java */
/* JADX INFO: loaded from: classes4.dex */
abstract class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private o0 f24659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private r f24660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private g f24661d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f24662e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f24663f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f24664g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f24665h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f24666i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f24668k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f24669l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f24670m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f24658a = new e();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private b f24667j = new b();

    /* JADX INFO: compiled from: StreamReader.java */
    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        q f24671a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        g f24672b;

        b() {
        }
    }

    private void a() {
        x7.a.i(this.f24659b);
        l0.i(this.f24660c);
    }

    private boolean h(v8.q qVar) throws IOException {
        while (this.f24658a.d(qVar)) {
            this.f24668k = qVar.getPosition() - this.f24663f;
            if (!i(this.f24658a.c(), this.f24663f, this.f24667j)) {
                return true;
            }
            this.f24663f = qVar.getPosition();
        }
        this.f24665h = 3;
        return false;
    }

    private int j(v8.q qVar) throws IOException {
        if (!h(qVar)) {
            return -1;
        }
        q qVar2 = this.f24667j.f24671a;
        this.f24666i = qVar2.F;
        if (!this.f24670m) {
            this.f24659b.a(qVar2);
            this.f24670m = true;
        }
        g gVar = this.f24667j.f24672b;
        if (gVar != null) {
            this.f24661d = gVar;
        } else if (qVar.getLength() == -1) {
            this.f24661d = new c();
        } else {
            f fVarB = this.f24658a.b();
            this.f24661d = new q9.a(this, this.f24663f, qVar.getLength(), fVarB.f24651h + fVarB.f24652i, fVarB.f24646c, (fVarB.f24645b & 4) != 0);
        }
        this.f24665h = 2;
        this.f24658a.f();
        return 0;
    }

    private int k(v8.q qVar, i0 i0Var) throws IOException {
        long jA = this.f24661d.a(qVar);
        if (jA >= 0) {
            i0Var.f27344a = jA;
            return 1;
        }
        if (jA < -1) {
            e(-(jA + 2));
        }
        if (!this.f24669l) {
            j0 j0Var = (j0) x7.a.i(this.f24661d.b());
            this.f24660c.h(j0Var);
            this.f24659b.g(j0Var.k());
            this.f24669l = true;
        }
        if (this.f24668k <= 0 && !this.f24658a.d(qVar)) {
            this.f24665h = 3;
            return -1;
        }
        this.f24668k = 0L;
        a0 a0VarC = this.f24658a.c();
        long jF = f(a0VarC);
        if (jF >= 0) {
            long j10 = this.f24664g;
            if (j10 + jF >= this.f24662e) {
                long jB = b(j10);
                this.f24659b.b(a0VarC, a0VarC.g());
                this.f24659b.f(jB, 1, a0VarC.g(), 0, null);
                this.f24662e = -1L;
            }
        }
        this.f24664g += jF;
        return 0;
    }

    protected long b(long j10) {
        return (j10 * 1000000) / ((long) this.f24666i);
    }

    protected long c(long j10) {
        return (((long) this.f24666i) * j10) / 1000000;
    }

    void d(r rVar, o0 o0Var) {
        this.f24660c = rVar;
        this.f24659b = o0Var;
        l(true);
    }

    protected void e(long j10) {
        this.f24664g = j10;
    }

    protected abstract long f(a0 a0Var);

    final int g(v8.q qVar, i0 i0Var) throws IOException {
        a();
        int i10 = this.f24665h;
        if (i10 == 0) {
            return j(qVar);
        }
        if (i10 == 1) {
            qVar.k((int) this.f24663f);
            this.f24665h = 2;
            return 0;
        }
        if (i10 == 2) {
            l0.i(this.f24661d);
            return k(qVar, i0Var);
        }
        if (i10 == 3) {
            return -1;
        }
        throw new IllegalStateException();
    }

    protected abstract boolean i(a0 a0Var, long j10, b bVar) throws IOException;

    protected void l(boolean z10) {
        if (z10) {
            this.f24667j = new b();
            this.f24663f = 0L;
            this.f24665h = 0;
        } else {
            this.f24665h = 1;
        }
        this.f24662e = -1L;
        this.f24664g = 0L;
    }

    final void m(long j10, long j11) {
        this.f24658a.e();
        if (j10 == 0) {
            l(!this.f24669l);
        } else if (this.f24665h != 0) {
            this.f24662e = c(j11);
            ((g) l0.i(this.f24661d)).c(this.f24662e);
            this.f24665h = 2;
        }
    }

    /* JADX INFO: compiled from: StreamReader.java */
    private static final class c implements g {
        private c() {
        }

        @Override // q9.g
        public long a(v8.q qVar) {
            return -1L;
        }

        @Override // q9.g
        public j0 b() {
            return new j0.b(-9223372036854775807L);
        }

        @Override // q9.g
        public void c(long j10) {
        }
    }
}
