package io.bidmachine.media3.exoplayer;

/* JADX INFO: compiled from: DefaultMediaClock.java */
/* JADX INFO: loaded from: classes4.dex */
final class k implements b8.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b8.b0 f19117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f19118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private h2 f19119c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b8.w f19120d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f19121e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f19122f;

    /* JADX INFO: compiled from: DefaultMediaClock.java */
    public interface a {
        void x(u7.x xVar);
    }

    public k(a aVar, x7.h hVar) {
        this.f19118b = aVar;
        this.f19117a = new b8.b0(hVar);
    }

    private boolean f(boolean z10) {
        h2 h2Var = this.f19119c;
        return h2Var == null || h2Var.b() || (z10 && this.f19119c.k() != 2) || (!this.f19119c.h() && (z10 || this.f19119c.n()));
    }

    private void j(boolean z10) {
        if (f(z10)) {
            this.f19121e = true;
            if (this.f19122f) {
                this.f19117a.b();
                return;
            }
            return;
        }
        b8.w wVar = (b8.w) x7.a.e(this.f19120d);
        long jK = wVar.K();
        if (this.f19121e) {
            if (jK < this.f19117a.K()) {
                this.f19117a.d();
                return;
            } else {
                this.f19121e = false;
                if (this.f19122f) {
                    this.f19117a.b();
                }
            }
        }
        this.f19117a.a(jK);
        u7.x xVarE = wVar.e();
        if (xVarE.equals(this.f19117a.e())) {
            return;
        }
        this.f19117a.c(xVarE);
        this.f19118b.x(xVarE);
    }

    @Override // b8.w
    public long K() {
        return this.f19121e ? this.f19117a.K() : ((b8.w) x7.a.e(this.f19120d)).K();
    }

    public void a(h2 h2Var) {
        if (h2Var == this.f19119c) {
            this.f19120d = null;
            this.f19119c = null;
            this.f19121e = true;
        }
    }

    public void b(h2 h2Var) throws ExoPlaybackException {
        b8.w wVar;
        b8.w wVarR = h2Var.R();
        if (wVarR == null || wVarR == (wVar = this.f19120d)) {
            return;
        }
        if (wVar != null) {
            throw ExoPlaybackException.f(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.f19120d = wVarR;
        this.f19119c = h2Var;
        wVarR.c(this.f19117a.e());
    }

    @Override // b8.w
    public void c(u7.x xVar) {
        b8.w wVar = this.f19120d;
        if (wVar != null) {
            wVar.c(xVar);
            xVar = this.f19120d.e();
        }
        this.f19117a.c(xVar);
    }

    public void d(long j10) {
        this.f19117a.a(j10);
    }

    @Override // b8.w
    public u7.x e() {
        b8.w wVar = this.f19120d;
        return wVar != null ? wVar.e() : this.f19117a.e();
    }

    public void g() {
        this.f19122f = true;
        this.f19117a.b();
    }

    public void h() {
        this.f19122f = false;
        this.f19117a.d();
    }

    public long i(boolean z10) {
        j(z10);
        return K();
    }

    @Override // b8.w
    public boolean w() {
        return this.f19121e ? this.f19117a.w() : ((b8.w) x7.a.e(this.f19120d)).w();
    }
}
