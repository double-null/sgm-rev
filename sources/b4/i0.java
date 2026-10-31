package b4;

/* JADX INFO: compiled from: SessionDataSerializer_Factory.java */
/* JADX INFO: loaded from: classes4.dex */
public final class i0 implements d4.b<h0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d4.e<p0> f3951a;

    private i0(d4.e<p0> eVar) {
        this.f3951a = eVar;
    }

    public static i0 a(d4.e<p0> eVar) {
        return new i0(eVar);
    }

    public static h0 c(p0 p0Var) {
        return new h0(p0Var);
    }

    @Override // vc.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public h0 get() {
        return c(this.f3951a.get());
    }
}
