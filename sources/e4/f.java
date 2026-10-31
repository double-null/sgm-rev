package e4;

/* JADX INFO: compiled from: RemoteSettingsFetcher_Factory.java */
/* JADX INFO: loaded from: classes4.dex */
public final class f implements d4.b<e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d4.e<b4.b> f14417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d4.e<zc.j> f14418b;

    private f(d4.e<b4.b> eVar, d4.e<zc.j> eVar2) {
        this.f14417a = eVar;
        this.f14418b = eVar2;
    }

    public static f a(d4.e<b4.b> eVar, d4.e<zc.j> eVar2) {
        return new f(eVar, eVar2);
    }

    public static e c(b4.b bVar, zc.j jVar) {
        return new e(bVar, jVar);
    }

    @Override // vc.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e get() {
        return c(this.f14417a.get(), this.f14418b.get());
    }
}
