package io.bidmachine.media3.exoplayer.video;

import io.bidmachine.media3.exoplayer.ExoPlaybackException;
import u7.l0;
import x7.f0;
import x7.t;

/* JADX INFO: compiled from: VideoFrameRenderControl.java */
/* JADX INFO: loaded from: classes4.dex */
final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f19974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n f19975b;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f19984k;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n.a f19976c = new n.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f0<l0> f19977d = new f0<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final f0<Long> f19978e = new f0<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final t f19979f = new t();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f19980g = -9223372036854775807L;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private l0 f19983j = l0.f26202e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f19981h = -9223372036854775807L;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f19982i = -9223372036854775807L;

    /* JADX INFO: compiled from: VideoFrameRenderControl.java */
    interface a {
        void c(l0 l0Var);

        void d();

        void e(long j10, long j11, boolean z10);
    }

    public o(a aVar, n nVar) {
        this.f19974a = aVar;
        this.f19975b = nVar;
    }

    private void a() {
        this.f19979f.f();
        this.f19974a.d();
    }

    private static <T> T c(f0<T> f0Var) {
        x7.a.a(f0Var.l() > 0);
        while (f0Var.l() > 1) {
            f0Var.i();
        }
        return (T) x7.a.e(f0Var.i());
    }

    private boolean e(long j10) {
        Long lJ = this.f19978e.j(j10);
        if (lJ == null || lJ.longValue() == this.f19984k) {
            return false;
        }
        this.f19984k = lJ.longValue();
        return true;
    }

    private boolean f(long j10) {
        l0 l0VarJ = this.f19977d.j(j10);
        if (l0VarJ == null || l0VarJ.equals(l0.f26202e) || l0VarJ.equals(this.f19983j)) {
            return false;
        }
        this.f19983j = l0VarJ;
        return true;
    }

    private void k(boolean z10) {
        long jF = this.f19979f.f();
        if (f(jF)) {
            this.f19974a.c(this.f19983j);
        }
        this.f19974a.e(z10 ? -1L : this.f19976c.g(), jF, this.f19975b.i());
    }

    public void b() {
        this.f19979f.b();
        this.f19980g = -9223372036854775807L;
        this.f19981h = -9223372036854775807L;
        this.f19982i = -9223372036854775807L;
        if (this.f19978e.l() > 0) {
            this.f19978e.a(0L, Long.valueOf(((Long) c(this.f19978e)).longValue()));
        }
        if (this.f19977d.l() > 0) {
            this.f19977d.a(0L, (l0) c(this.f19977d));
        }
    }

    public boolean d() {
        long j10 = this.f19982i;
        return j10 != -9223372036854775807L && this.f19981h == j10;
    }

    public void g(long j10) {
        this.f19979f.a(j10);
        this.f19980g = j10;
        this.f19982i = -9223372036854775807L;
    }

    public void h(long j10) {
        f0<Long> f0Var = this.f19978e;
        long j11 = this.f19980g;
        f0Var.a(j11 == -9223372036854775807L ? 0L : j11 + 1, Long.valueOf(j10));
    }

    public void i(int i10, int i11) {
        f0<l0> f0Var = this.f19977d;
        long j10 = this.f19980g;
        f0Var.a(j10 == -9223372036854775807L ? 0L : j10 + 1, new l0(i10, i11));
    }

    public void j(long j10, long j11) throws ExoPlaybackException {
        while (!this.f19979f.e()) {
            long jD = this.f19979f.d();
            if (e(jD)) {
                this.f19975b.j();
            }
            int iC = this.f19975b.c(jD, j10, j11, this.f19984k, false, false, this.f19976c);
            if (iC == 0 || iC == 1) {
                this.f19981h = jD;
                k(iC == 0);
            } else if (iC == 2 || iC == 3) {
                this.f19981h = jD;
                a();
            } else {
                if (iC != 4) {
                    if (iC != 5) {
                        throw new IllegalStateException(String.valueOf(iC));
                    }
                    return;
                }
                this.f19981h = jD;
            }
        }
    }

    public void l() {
        this.f19982i = this.f19980g;
    }
}
