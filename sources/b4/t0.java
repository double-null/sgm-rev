package b4;

/* JADX INFO: compiled from: SessionsActivityLifecycleCallbacks_Factory.java */
/* JADX INFO: loaded from: classes4.dex */
public final class t0 implements d4.b<s0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d4.e<u0> f4018a;

    private t0(d4.e<u0> eVar) {
        this.f4018a = eVar;
    }

    public static t0 a(d4.e<u0> eVar) {
        return new t0(eVar);
    }

    public static s0 c(u0 u0Var) {
        return new s0(u0Var);
    }

    @Override // vc.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public s0 get() {
        return c(this.f4018a.get());
    }
}
