package io.bidmachine.media3.exoplayer.source;

/* JADX INFO: compiled from: ExternallyLoadedMediaSource.java */
/* JADX INFO: loaded from: classes4.dex */
public final class l extends io.bidmachine.media3.exoplayer.source.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final j f19649h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f19650i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private u7.s f19651j;

    @Override // io.bidmachine.media3.exoplayer.source.r
    public q a(r.b bVar, r8.b bVar2, long j10) {
        u7.s sVarE = e();
        x7.a.e(sVarE.f26302b);
        x7.a.f(sVarE.f26302b.f26395b, "Externally loaded mediaItems require a MIME type.");
        u7.s.h hVar = sVarE.f26302b;
        return new k(hVar.f26394a, hVar.f26395b, this.f19649h);
    }

    @Override // io.bidmachine.media3.exoplayer.source.r
    public synchronized u7.s e() {
        return this.f19651j;
    }

    @Override // io.bidmachine.media3.exoplayer.source.r
    public synchronized void m(u7.s sVar) {
        this.f19651j = sVar;
    }

    @Override // io.bidmachine.media3.exoplayer.source.r
    public void n(q qVar) {
        ((k) qVar).n();
    }

    @Override // io.bidmachine.media3.exoplayer.source.a
    protected void z(z7.o oVar) {
        A(new n8.u(this.f19650i, true, false, false, null, e()));
    }

    private l(u7.s sVar, long j10, j jVar) {
        this.f19651j = sVar;
        this.f19650i = j10;
        this.f19649h = jVar;
    }

    @Override // io.bidmachine.media3.exoplayer.source.a
    protected void B() {
    }

    @Override // io.bidmachine.media3.exoplayer.source.r
    public void j() {
    }

    /* JADX INFO: compiled from: ExternallyLoadedMediaSource.java */
    public static final class b implements r.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f19652c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final j f19653d;

        public b(long j10, j jVar) {
            this.f19652c = j10;
            this.f19653d = jVar;
        }

        @Override // io.bidmachine.media3.exoplayer.source.r.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public l f(u7.s sVar) {
            return new l(sVar, this.f19652c, this.f19653d);
        }

        @Override // io.bidmachine.media3.exoplayer.source.r.a
        public r.a d(g8.k kVar) {
            return this;
        }

        @Override // io.bidmachine.media3.exoplayer.source.r.a
        public r.a g(io.bidmachine.media3.exoplayer.upstream.b bVar) {
            return this;
        }
    }
}
