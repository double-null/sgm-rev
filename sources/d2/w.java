package d2;

/* JADX INFO: compiled from: TransportRuntime_Factory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class w implements f2.b<u> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final vc.a<n2.a> f13242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final vc.a<n2.a> f13243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final vc.a<j2.e> f13244c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final vc.a<k2.r> f13245d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final vc.a<k2.v> f13246e;

    public w(vc.a<n2.a> aVar, vc.a<n2.a> aVar2, vc.a<j2.e> aVar3, vc.a<k2.r> aVar4, vc.a<k2.v> aVar5) {
        this.f13242a = aVar;
        this.f13243b = aVar2;
        this.f13244c = aVar3;
        this.f13245d = aVar4;
        this.f13246e = aVar5;
    }

    public static w a(vc.a<n2.a> aVar, vc.a<n2.a> aVar2, vc.a<j2.e> aVar3, vc.a<k2.r> aVar4, vc.a<k2.v> aVar5) {
        return new w(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static u c(n2.a aVar, n2.a aVar2, j2.e eVar, k2.r rVar, k2.v vVar) {
        return new u(aVar, aVar2, eVar, rVar, vVar);
    }

    @Override // vc.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public u get() {
        return c(this.f13242a.get(), this.f13243b.get(), this.f13244c.get(), this.f13245d.get(), this.f13246e.get());
    }
}
