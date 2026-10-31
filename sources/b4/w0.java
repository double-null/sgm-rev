package b4;

/* JADX INFO: compiled from: SharedSessionRepositoryImpl_Factory.java */
/* JADX INFO: loaded from: classes4.dex */
public final class w0 implements d4.b<v0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d4.e<e4.j> f4077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d4.e<p0> f4078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d4.e<m0> f4079c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d4.e<y0> f4080d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d4.e<e0.k<g0>> f4081e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final d4.e<x> f4082f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final d4.e<zc.j> f4083g;

    private w0(d4.e<e4.j> eVar, d4.e<p0> eVar2, d4.e<m0> eVar3, d4.e<y0> eVar4, d4.e<e0.k<g0>> eVar5, d4.e<x> eVar6, d4.e<zc.j> eVar7) {
        this.f4077a = eVar;
        this.f4078b = eVar2;
        this.f4079c = eVar3;
        this.f4080d = eVar4;
        this.f4081e = eVar5;
        this.f4082f = eVar6;
        this.f4083g = eVar7;
    }

    public static w0 a(d4.e<e4.j> eVar, d4.e<p0> eVar2, d4.e<m0> eVar3, d4.e<y0> eVar4, d4.e<e0.k<g0>> eVar5, d4.e<x> eVar6, d4.e<zc.j> eVar7) {
        return new w0(eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7);
    }

    public static v0 c(e4.j jVar, p0 p0Var, m0 m0Var, y0 y0Var, e0.k<g0> kVar, x xVar, zc.j jVar2) {
        return new v0(jVar, p0Var, m0Var, y0Var, kVar, xVar, jVar2);
    }

    @Override // vc.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public v0 get() {
        return c(this.f4077a.get(), this.f4078b.get(), this.f4079c.get(), this.f4080d.get(), this.f4081e.get(), this.f4082f.get(), this.f4083g.get());
    }
}
