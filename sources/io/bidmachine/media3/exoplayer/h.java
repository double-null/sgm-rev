package io.bidmachine.media3.exoplayer;

import io.bidmachine.media3.decoder.DecoderInputBuffer;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: BaseRenderer.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class h implements h2, i2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f18662b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b8.y f18664d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f18665e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private c8.b2 f18666f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private x7.h f18667g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f18668h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private n8.s f18669i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private u7.q[] f18670j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f18671k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f18672l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f18674n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f18675o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private i2.a f18677q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f18661a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b8.u f18663c = new b8.u();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f18673m = Long.MIN_VALUE;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private u7.d0 f18676p = u7.d0.f26009a;

    public h(int i10) {
        this.f18662b = i10;
    }

    private void r0(long j10, boolean z10) throws ExoPlaybackException {
        this.f18674n = false;
        this.f18672l = j10;
        this.f18673m = j10;
        i0(j10, z10);
    }

    @Override // io.bidmachine.media3.exoplayer.h2
    public final void A() throws IOException {
        ((n8.s) x7.a.e(this.f18669i)).a();
    }

    @Override // io.bidmachine.media3.exoplayer.h2
    public final boolean D() {
        return this.f18674n;
    }

    @Override // io.bidmachine.media3.exoplayer.h2
    public final void I(u7.d0 d0Var) {
        if (Objects.equals(this.f18676p, d0Var)) {
            return;
        }
        this.f18676p = d0Var;
        p0(d0Var);
    }

    @Override // io.bidmachine.media3.exoplayer.i2
    public int N() throws ExoPlaybackException {
        return 0;
    }

    @Override // io.bidmachine.media3.exoplayer.h2
    public final void O(u7.q[] qVarArr, n8.s sVar, long j10, long j11, io.bidmachine.media3.exoplayer.source.r.b bVar) throws ExoPlaybackException {
        x7.a.g(!this.f18674n);
        this.f18669i = sVar;
        if (this.f18673m == Long.MIN_VALUE) {
            this.f18673m = j10;
        }
        this.f18670j = qVarArr;
        this.f18671k = j11;
        o0(qVarArr, j10, j11, bVar);
    }

    @Override // io.bidmachine.media3.exoplayer.h2
    public final long P() {
        return this.f18673m;
    }

    @Override // io.bidmachine.media3.exoplayer.h2
    public final void Q(long j10) throws ExoPlaybackException {
        r0(j10, false);
    }

    @Override // io.bidmachine.media3.exoplayer.h2
    public b8.w R() {
        return null;
    }

    protected final ExoPlaybackException T(Throwable th, u7.q qVar, int i10) {
        return U(th, qVar, false, i10);
    }

    protected final ExoPlaybackException U(Throwable th, u7.q qVar, boolean z10, int i10) {
        int iS;
        if (qVar == null || this.f18675o) {
            iS = 4;
        } else {
            this.f18675o = true;
            try {
                iS = i2.S(a(qVar));
                this.f18675o = false;
            } catch (ExoPlaybackException unused) {
                this.f18675o = false;
                iS = 4;
            } catch (Throwable th2) {
                this.f18675o = false;
                throw th2;
            }
        }
        return ExoPlaybackException.c(th, getName(), Y(), qVar, iS, z10, i10);
    }

    protected final x7.h V() {
        return (x7.h) x7.a.e(this.f18667g);
    }

    protected final b8.y W() {
        return (b8.y) x7.a.e(this.f18664d);
    }

    protected final b8.u X() {
        this.f18663c.a();
        return this.f18663c;
    }

    protected final int Y() {
        return this.f18665e;
    }

    protected final long Z() {
        return this.f18672l;
    }

    protected final c8.b2 a0() {
        return (c8.b2) x7.a.e(this.f18666f);
    }

    protected final u7.q[] b0() {
        return (u7.q[]) x7.a.e(this.f18670j);
    }

    protected final long c0() {
        return this.f18671k;
    }

    @Override // io.bidmachine.media3.exoplayer.h2
    public final void d() {
        x7.a.g(this.f18668h == 1);
        this.f18663c.a();
        this.f18668h = 0;
        this.f18669i = null;
        this.f18670j = null;
        this.f18674n = false;
        f0();
    }

    protected final u7.d0 d0() {
        return this.f18676p;
    }

    protected final boolean e0() {
        return n() ? this.f18674n : ((n8.s) x7.a.e(this.f18669i)).h();
    }

    protected abstract void f0();

    @Override // io.bidmachine.media3.exoplayer.h2, io.bidmachine.media3.exoplayer.i2
    public final int g() {
        return this.f18662b;
    }

    protected abstract void i0(long j10, boolean z10) throws ExoPlaybackException;

    @Override // io.bidmachine.media3.exoplayer.h2
    public final n8.s j() {
        return this.f18669i;
    }

    @Override // io.bidmachine.media3.exoplayer.h2
    public final int k() {
        return this.f18668h;
    }

    protected final void k0() {
        i2.a aVar;
        synchronized (this.f18661a) {
            aVar = this.f18677q;
        }
        if (aVar != null) {
            aVar.a(this);
        }
    }

    @Override // io.bidmachine.media3.exoplayer.i2
    public final void l(i2.a aVar) {
        synchronized (this.f18661a) {
            this.f18677q = aVar;
        }
    }

    @Override // io.bidmachine.media3.exoplayer.i2
    public final void m() {
        synchronized (this.f18661a) {
            this.f18677q = null;
        }
    }

    @Override // io.bidmachine.media3.exoplayer.h2
    public final boolean n() {
        return this.f18673m == Long.MIN_VALUE;
    }

    @Override // io.bidmachine.media3.exoplayer.h2
    public final void q() {
        this.f18674n = true;
    }

    protected final int q0(b8.u uVar, DecoderInputBuffer decoderInputBuffer, int i10) {
        int iE = ((n8.s) x7.a.e(this.f18669i)).e(uVar, decoderInputBuffer, i10);
        if (iE == -4) {
            if (decoderInputBuffer.j()) {
                this.f18673m = Long.MIN_VALUE;
                return this.f18674n ? -4 : -3;
            }
            long j10 = decoderInputBuffer.f18059f + this.f18671k;
            decoderInputBuffer.f18059f = j10;
            this.f18673m = Math.max(this.f18673m, j10);
        } else if (iE == -5) {
            u7.q qVar = (u7.q) x7.a.e(uVar.f4168b);
            if (qVar.f26257t != Long.MAX_VALUE) {
                uVar.f4168b = qVar.b().y0(qVar.f26257t + this.f18671k).N();
            }
        }
        return iE;
    }

    @Override // io.bidmachine.media3.exoplayer.h2
    public final void release() {
        x7.a.g(this.f18668h == 0);
        j0();
    }

    @Override // io.bidmachine.media3.exoplayer.h2
    public final void reset() {
        x7.a.g(this.f18668h == 0);
        this.f18663c.a();
        l0();
    }

    protected int s0(long j10) {
        return ((n8.s) x7.a.e(this.f18669i)).r(j10 - this.f18671k);
    }

    @Override // io.bidmachine.media3.exoplayer.h2
    public final void start() throws ExoPlaybackException {
        x7.a.g(this.f18668h == 1);
        this.f18668h = 2;
        m0();
    }

    @Override // io.bidmachine.media3.exoplayer.h2
    public final void stop() {
        x7.a.g(this.f18668h == 2);
        this.f18668h = 1;
        n0();
    }

    @Override // io.bidmachine.media3.exoplayer.h2
    public final void x(int i10, c8.b2 b2Var, x7.h hVar) {
        this.f18665e = i10;
        this.f18666f = b2Var;
        this.f18667g = hVar;
        h0();
    }

    @Override // io.bidmachine.media3.exoplayer.h2
    public final void y(b8.y yVar, u7.q[] qVarArr, n8.s sVar, long j10, boolean z10, boolean z11, long j11, long j12, io.bidmachine.media3.exoplayer.source.r.b bVar) throws ExoPlaybackException {
        x7.a.g(this.f18668h == 0);
        this.f18664d = yVar;
        this.f18668h = 1;
        g0(z10, z11);
        O(qVarArr, sVar, j11, j12, bVar);
        r0(j11, z10);
    }

    @Override // io.bidmachine.media3.exoplayer.h2
    public final i2 J() {
        return this;
    }

    protected void h0() {
    }

    protected void j0() {
    }

    protected void l0() {
    }

    protected void m0() throws ExoPlaybackException {
    }

    protected void n0() {
    }

    protected void p0(u7.d0 d0Var) {
    }

    protected void g0(boolean z10, boolean z11) throws ExoPlaybackException {
    }

    @Override // io.bidmachine.media3.exoplayer.f2.b
    public void z(int i10, Object obj) throws ExoPlaybackException {
    }

    protected void o0(u7.q[] qVarArr, long j10, long j11, io.bidmachine.media3.exoplayer.source.r.b bVar) throws ExoPlaybackException {
    }
}
