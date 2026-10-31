package v8;

import java.io.IOException;

/* JADX INFO: compiled from: SingleSampleExtractor.java */
/* JADX INFO: loaded from: classes4.dex */
public final class l0 implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f27375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f27376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f27377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f27378d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f27379e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private r f27380f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private o0 f27381g;

    public l0(int i10, int i11, String str) {
        this.f27375a = i10;
        this.f27376b = i11;
        this.f27377c = str;
    }

    private void b(String str) {
        o0 o0VarE = this.f27380f.e(1024, 4);
        this.f27381g = o0VarE;
        o0VarE.a(new u7.q.b().U(str).u0(str).N());
        this.f27380f.r();
        this.f27380f.h(new m0(-9223372036854775807L));
        this.f27379e = 1;
    }

    private void d(q qVar) throws IOException {
        int iC = ((o0) x7.a.e(this.f27381g)).c(qVar, 1024, true);
        if (iC != -1) {
            this.f27378d += iC;
            return;
        }
        this.f27379e = 2;
        this.f27381g.f(0L, 1, this.f27378d, 0, null);
        this.f27378d = 0;
    }

    @Override // v8.p
    public void a(long j10, long j11) {
        if (j10 == 0 || this.f27379e == 1) {
            this.f27379e = 1;
            this.f27378d = 0;
        }
    }

    @Override // v8.p
    public void c(r rVar) {
        this.f27380f = rVar;
        b(this.f27377c);
    }

    @Override // v8.p
    public boolean e(q qVar) throws IOException {
        x7.a.g((this.f27375a == -1 || this.f27376b == -1) ? false : true);
        x7.a0 a0Var = new x7.a0(this.f27376b);
        qVar.n(a0Var.e(), 0, this.f27376b);
        return a0Var.P() == this.f27375a;
    }

    @Override // v8.p
    public int l(q qVar, i0 i0Var) throws IOException {
        int i10 = this.f27379e;
        if (i10 == 1) {
            d(qVar);
            return 0;
        }
        if (i10 == 2) {
            return -1;
        }
        throw new IllegalStateException();
    }

    @Override // v8.p
    public void release() {
    }
}
