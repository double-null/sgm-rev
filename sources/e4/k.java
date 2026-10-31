package e4;

/* JADX INFO: compiled from: SessionsSettings_Factory.java */
/* JADX INFO: loaded from: classes4.dex */
public final class k implements d4.b<j> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d4.e<o> f14438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d4.e<o> f14439b;

    private k(d4.e<o> eVar, d4.e<o> eVar2) {
        this.f14438a = eVar;
        this.f14439b = eVar2;
    }

    public static k a(d4.e<o> eVar, d4.e<o> eVar2) {
        return new k(eVar, eVar2);
    }

    public static j c(o oVar, o oVar2) {
        return new j(oVar, oVar2);
    }

    @Override // vc.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public j get() {
        return c(this.f14438a.get(), this.f14439b.get());
    }
}
