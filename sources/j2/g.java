package j2;

/* JADX INFO: compiled from: SchedulingConfigModule_ConfigFactory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements f2.b<k2.f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final vc.a<n2.a> f20563a;

    public g(vc.a<n2.a> aVar) {
        this.f20563a = aVar;
    }

    public static k2.f a(n2.a aVar) {
        return (k2.f) f2.d.d(f.a(aVar));
    }

    public static g b(vc.a<n2.a> aVar) {
        return new g(aVar);
    }

    @Override // vc.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public k2.f get() {
        return a(this.f20563a.get());
    }
}
