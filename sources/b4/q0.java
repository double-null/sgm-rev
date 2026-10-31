package b4;

/* JADX INFO: compiled from: SessionGenerator_Factory.java */
/* JADX INFO: loaded from: classes4.dex */
public final class q0 implements d4.b<p0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d4.e<y0> f4003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d4.e<a1> f4004b;

    private q0(d4.e<y0> eVar, d4.e<a1> eVar2) {
        this.f4003a = eVar;
        this.f4004b = eVar2;
    }

    public static q0 a(d4.e<y0> eVar, d4.e<a1> eVar2) {
        return new q0(eVar, eVar2);
    }

    public static p0 c(y0 y0Var, a1 a1Var) {
        return new p0(y0Var, a1Var);
    }

    @Override // vc.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public p0 get() {
        return c(this.f4003a.get(), this.f4004b.get());
    }
}
