package b8;

import x7.l0;

/* JADX INFO: compiled from: StandaloneMediaClock.java */
/* JADX INFO: loaded from: classes4.dex */
public final class b0 implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x7.h f4140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f4141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f4142c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f4143d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private u7.x f4144e = u7.x.f26515d;

    public b0(x7.h hVar) {
        this.f4140a = hVar;
    }

    @Override // b8.w
    public long K() {
        long j10 = this.f4142c;
        if (!this.f4141b) {
            return j10;
        }
        long jElapsedRealtime = this.f4140a.elapsedRealtime() - this.f4143d;
        u7.x xVar = this.f4144e;
        return j10 + (xVar.f26518a == 1.0f ? l0.S0(jElapsedRealtime) : xVar.a(jElapsedRealtime));
    }

    public void a(long j10) {
        this.f4142c = j10;
        if (this.f4141b) {
            this.f4143d = this.f4140a.elapsedRealtime();
        }
    }

    public void b() {
        if (this.f4141b) {
            return;
        }
        this.f4143d = this.f4140a.elapsedRealtime();
        this.f4141b = true;
    }

    @Override // b8.w
    public void c(u7.x xVar) {
        if (this.f4141b) {
            a(K());
        }
        this.f4144e = xVar;
    }

    public void d() {
        if (this.f4141b) {
            a(K());
            this.f4141b = false;
        }
    }

    @Override // b8.w
    public u7.x e() {
        return this.f4144e;
    }
}
