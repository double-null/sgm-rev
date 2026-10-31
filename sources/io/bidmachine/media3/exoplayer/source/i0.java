package io.bidmachine.media3.exoplayer.source;

import android.net.Uri;

/* JADX INFO: compiled from: SingleSampleMediaSource.java */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class i0 extends io.bidmachine.media3.exoplayer.source.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final z7.g f19614h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final z7.d.a f19615i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final u7.q f19616j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f19617k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final io.bidmachine.media3.exoplayer.upstream.b f19618l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f19619m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final u7.d0 f19620n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final u7.s f19621o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final com.google.common.base.w<s8.a> f19622p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private z7.o f19623q;

    /* JADX INFO: compiled from: SingleSampleMediaSource.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final z7.d.a f19624a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private io.bidmachine.media3.exoplayer.upstream.b f19625b = new io.bidmachine.media3.exoplayer.upstream.a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f19626c = true;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Object f19627d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f19628e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private com.google.common.base.w<s8.a> f19629f;

        public b(z7.d.a aVar) {
            this.f19624a = (z7.d.a) x7.a.e(aVar);
        }

        public i0 a(u7.s.k kVar, long j10) {
            return new i0(this.f19628e, kVar, this.f19624a, j10, this.f19625b, this.f19626c, this.f19627d, this.f19629f);
        }

        public b b(io.bidmachine.media3.exoplayer.upstream.b bVar) {
            if (bVar == null) {
                bVar = new io.bidmachine.media3.exoplayer.upstream.a();
            }
            this.f19625b = bVar;
            return this;
        }
    }

    @Override // io.bidmachine.media3.exoplayer.source.r
    public q a(r.b bVar, r8.b bVar2, long j10) {
        z7.g gVar = this.f19614h;
        z7.d.a aVar = this.f19615i;
        z7.o oVar = this.f19623q;
        u7.q qVar = this.f19616j;
        long j11 = this.f19617k;
        io.bidmachine.media3.exoplayer.upstream.b bVar3 = this.f19618l;
        s.a aVarU = u(bVar);
        boolean z10 = this.f19619m;
        com.google.common.base.w<s8.a> wVar = this.f19622p;
        return new h0(gVar, aVar, oVar, qVar, j11, bVar3, aVarU, z10, wVar != null ? wVar.get() : null);
    }

    @Override // io.bidmachine.media3.exoplayer.source.r
    public u7.s e() {
        return this.f19621o;
    }

    @Override // io.bidmachine.media3.exoplayer.source.r
    public void n(q qVar) {
        ((h0) qVar).v();
    }

    @Override // io.bidmachine.media3.exoplayer.source.a
    protected void z(z7.o oVar) {
        this.f19623q = oVar;
        A(this.f19620n);
    }

    private i0(String str, u7.s.k kVar, z7.d.a aVar, long j10, io.bidmachine.media3.exoplayer.upstream.b bVar, boolean z10, Object obj, com.google.common.base.w<s8.a> wVar) {
        this.f19615i = aVar;
        this.f19617k = j10;
        this.f19618l = bVar;
        this.f19619m = z10;
        u7.s sVarA = new u7.s.c().f(Uri.EMPTY).c(kVar.f26420a.toString()).d(com.google.common.collect.u.I(kVar)).e(obj).a();
        this.f19621o = sVarA;
        u7.q.b bVarH0 = new u7.q.b().u0((String) com.google.common.base.j.a(kVar.f26421b, "text/x-unknown")).j0(kVar.f26422c).w0(kVar.f26423d).s0(kVar.f26424e).h0(kVar.f26425f);
        String str2 = kVar.f26426g;
        this.f19616j = bVarH0.f0(str2 == null ? str : str2).N();
        this.f19614h = new z7.g.b().i(kVar.f26420a).b(1).a();
        this.f19620n = new n8.u(j10, true, false, false, null, sVarA);
        this.f19622p = wVar;
    }

    @Override // io.bidmachine.media3.exoplayer.source.a
    protected void B() {
    }

    @Override // io.bidmachine.media3.exoplayer.source.r
    public void j() {
    }
}
