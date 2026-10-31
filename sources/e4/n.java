package e4;

import b4.y0;

/* JADX INFO: compiled from: SettingsCacheImpl_Factory.java */
/* JADX INFO: loaded from: classes4.dex */
public final class n implements d4.b<m> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d4.e<zc.j> f14454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d4.e<y0> f14455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d4.e<e0.k<h>> f14456c;

    private n(d4.e<zc.j> eVar, d4.e<y0> eVar2, d4.e<e0.k<h>> eVar3) {
        this.f14454a = eVar;
        this.f14455b = eVar2;
        this.f14456c = eVar3;
    }

    public static n a(d4.e<zc.j> eVar, d4.e<y0> eVar2, d4.e<e0.k<h>> eVar3) {
        return new n(eVar, eVar2, eVar3);
    }

    public static m c(zc.j jVar, y0 y0Var, e0.k<h> kVar) {
        return new m(jVar, y0Var, kVar);
    }

    @Override // vc.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public m get() {
        return c(this.f14454a.get(), this.f14455b.get(), this.f14456c.get());
    }
}
