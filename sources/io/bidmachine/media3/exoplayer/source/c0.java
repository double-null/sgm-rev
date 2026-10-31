package io.bidmachine.media3.exoplayer.source;

import android.net.Uri;
import android.os.Looper;
import c8.b2;
import io.bidmachine.media3.exoplayer.source.c0;

/* JADX INFO: compiled from: ProgressiveMediaSource.java */
/* JADX INFO: loaded from: classes4.dex */
public final class c0 extends io.bidmachine.media3.exoplayer.source.a implements b0.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final z7.d.a f19496h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final w.a f19497i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final io.bidmachine.media3.exoplayer.drm.i f19498j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final io.bidmachine.media3.exoplayer.upstream.b f19499k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f19500l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f19501m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final u7.q f19502n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final com.google.common.base.w<s8.a> f19503o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f19504p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f19505q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f19506r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f19507s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private z7.o f19508t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private u7.s f19509u;

    /* JADX INFO: compiled from: ProgressiveMediaSource.java */
    class a extends m {
        a(u7.d0 d0Var) {
            super(d0Var);
        }

        @Override // io.bidmachine.media3.exoplayer.source.m, u7.d0
        public u7.d0.b g(int i10, u7.d0.b bVar, boolean z10) {
            super.g(i10, bVar, z10);
            bVar.f26023f = true;
            return bVar;
        }

        @Override // io.bidmachine.media3.exoplayer.source.m, u7.d0
        public u7.d0.c o(int i10, u7.d0.c cVar, long j10) {
            super.o(i10, cVar, j10);
            cVar.f26045k = true;
            return cVar;
        }
    }

    /* JADX INFO: compiled from: ProgressiveMediaSource.java */
    public static final class b implements t {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final z7.d.a f19511c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private w.a f19512d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private g8.k f19513e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private io.bidmachine.media3.exoplayer.upstream.b f19514f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f19515g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private com.google.common.base.w<s8.a> f19516h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f19517i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private u7.q f19518j;

        public b(z7.d.a aVar, final v8.u uVar) {
            this(aVar, new w.a() { // from class: n8.r
                @Override // io.bidmachine.media3.exoplayer.source.w.a
                public final io.bidmachine.media3.exoplayer.source.w a(b2 b2Var) {
                    return c0.b.k(uVar, b2Var);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ w k(v8.u uVar, b2 b2Var) {
            return new n8.b(uVar);
        }

        @Override // io.bidmachine.media3.exoplayer.source.r.a
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public c0 f(u7.s sVar) {
            x7.a.e(sVar.f26302b);
            return new c0(sVar, this.f19511c, this.f19512d, this.f19513e.a(sVar), this.f19514f, this.f19515g, this.f19517i, this.f19518j, this.f19516h, null);
        }

        b j(int i10, u7.q qVar) {
            this.f19517i = i10;
            this.f19518j = (u7.q) x7.a.e(qVar);
            return this;
        }

        @Override // io.bidmachine.media3.exoplayer.source.r.a
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public b d(g8.k kVar) {
            this.f19513e = (g8.k) x7.a.f(kVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // io.bidmachine.media3.exoplayer.source.r.a
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public b g(io.bidmachine.media3.exoplayer.upstream.b bVar) {
            this.f19514f = (io.bidmachine.media3.exoplayer.upstream.b) x7.a.f(bVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        public b(z7.d.a aVar, w.a aVar2) {
            this(aVar, aVar2, new io.bidmachine.media3.exoplayer.drm.g(), new io.bidmachine.media3.exoplayer.upstream.a(), 1048576);
        }

        public b(z7.d.a aVar, w.a aVar2, g8.k kVar, io.bidmachine.media3.exoplayer.upstream.b bVar, int i10) {
            this.f19511c = aVar;
            this.f19512d = aVar2;
            this.f19513e = kVar;
            this.f19514f = bVar;
            this.f19515g = i10;
        }
    }

    /* synthetic */ c0(u7.s sVar, z7.d.a aVar, w.a aVar2, io.bidmachine.media3.exoplayer.drm.i iVar, io.bidmachine.media3.exoplayer.upstream.b bVar, int i10, int i11, u7.q qVar, com.google.common.base.w wVar, a aVar3) {
        this(sVar, aVar, aVar2, iVar, bVar, i10, i11, qVar, wVar);
    }

    private u7.s.h C() {
        return (u7.s.h) x7.a.e(e().f26302b);
    }

    private void D() {
        u7.d0 uVar = new n8.u(this.f19505q, this.f19506r, false, this.f19507s, null, e());
        if (this.f19504p) {
            uVar = new a(uVar);
        }
        A(uVar);
    }

    @Override // io.bidmachine.media3.exoplayer.source.a
    protected void B() {
        this.f19498j.release();
    }

    @Override // io.bidmachine.media3.exoplayer.source.r
    public q a(r.b bVar, r8.b bVar2, long j10) {
        z7.d dVarA = this.f19496h.a();
        z7.o oVar = this.f19508t;
        if (oVar != null) {
            dVarA.a(oVar);
        }
        u7.s.h hVarC = C();
        Uri uri = hVarC.f26394a;
        w wVarA = this.f19497i.a(x());
        io.bidmachine.media3.exoplayer.drm.i iVar = this.f19498j;
        io.bidmachine.media3.exoplayer.drm.h.a aVarS = s(bVar);
        io.bidmachine.media3.exoplayer.upstream.b bVar3 = this.f19499k;
        s.a aVarU = u(bVar);
        String str = hVarC.f26398e;
        int i10 = this.f19500l;
        int i11 = this.f19501m;
        u7.q qVar = this.f19502n;
        long jS0 = x7.l0.S0(hVarC.f26402i);
        com.google.common.base.w<s8.a> wVar = this.f19503o;
        return new b0(uri, dVarA, wVarA, iVar, aVarS, bVar3, aVarU, this, bVar2, str, i10, i11, qVar, jS0, wVar != null ? wVar.get() : null);
    }

    @Override // io.bidmachine.media3.exoplayer.source.b0.c
    public void c(long j10, v8.j0 j0Var, boolean z10) {
        if (j10 == -9223372036854775807L) {
            j10 = this.f19505q;
        }
        boolean zH = j0Var.h();
        if (!this.f19504p && this.f19505q == j10 && this.f19506r == zH && this.f19507s == z10) {
            return;
        }
        this.f19505q = j10;
        this.f19506r = zH;
        this.f19507s = z10;
        this.f19504p = false;
        D();
    }

    @Override // io.bidmachine.media3.exoplayer.source.r
    public synchronized u7.s e() {
        return this.f19509u;
    }

    @Override // io.bidmachine.media3.exoplayer.source.r
    public synchronized void m(u7.s sVar) {
        this.f19509u = sVar;
    }

    @Override // io.bidmachine.media3.exoplayer.source.r
    public void n(q qVar) {
        ((b0) qVar).h0();
    }

    @Override // io.bidmachine.media3.exoplayer.source.a
    protected void z(z7.o oVar) {
        this.f19508t = oVar;
        this.f19498j.l((Looper) x7.a.e(Looper.myLooper()), x());
        this.f19498j.k();
        D();
    }

    private c0(u7.s sVar, z7.d.a aVar, w.a aVar2, io.bidmachine.media3.exoplayer.drm.i iVar, io.bidmachine.media3.exoplayer.upstream.b bVar, int i10, int i11, u7.q qVar, com.google.common.base.w<s8.a> wVar) {
        this.f19509u = sVar;
        this.f19496h = aVar;
        this.f19497i = aVar2;
        this.f19498j = iVar;
        this.f19499k = bVar;
        this.f19500l = i10;
        this.f19502n = qVar;
        this.f19501m = i11;
        this.f19504p = true;
        this.f19505q = -9223372036854775807L;
        this.f19503o = wVar;
    }

    @Override // io.bidmachine.media3.exoplayer.source.r
    public void j() {
    }
}
