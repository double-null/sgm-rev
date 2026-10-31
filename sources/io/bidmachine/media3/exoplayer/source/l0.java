package io.bidmachine.media3.exoplayer.source;

/* JADX INFO: compiled from: WrappingMediaSource.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class l0 extends c<Void> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Void f19654l = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected final r f19655k;

    protected l0(r rVar) {
        this.f19655k = rVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.bidmachine.media3.exoplayer.source.c
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public final r.b D(Void r10, r.b bVar) {
        return J(bVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.bidmachine.media3.exoplayer.source.c
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public final long E(Void r10, long j10, r.b bVar) {
        return L(j10, bVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.bidmachine.media3.exoplayer.source.c
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public final int F(Void r10, int i10) {
        return N(i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.bidmachine.media3.exoplayer.source.c
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public final void G(Void r10, r rVar, u7.d0 d0Var) {
        Q(d0Var);
    }

    protected abstract void Q(u7.d0 d0Var);

    protected final void R() {
        I(f19654l, this.f19655k);
    }

    protected void S() {
        R();
    }

    @Override // io.bidmachine.media3.exoplayer.source.r
    public u7.s e() {
        return this.f19655k.e();
    }

    @Override // io.bidmachine.media3.exoplayer.source.r
    public boolean k() {
        return this.f19655k.k();
    }

    @Override // io.bidmachine.media3.exoplayer.source.r
    public u7.d0 l() {
        return this.f19655k.l();
    }

    @Override // io.bidmachine.media3.exoplayer.source.r
    public void m(u7.s sVar) {
        this.f19655k.m(sVar);
    }

    @Override // io.bidmachine.media3.exoplayer.source.c, io.bidmachine.media3.exoplayer.source.a
    protected final void z(z7.o oVar) {
        super.z(oVar);
        S();
    }

    protected r.b J(r.b bVar) {
        return bVar;
    }

    protected int N(int i10) {
        return i10;
    }

    protected long L(long j10, r.b bVar) {
        return j10;
    }
}
