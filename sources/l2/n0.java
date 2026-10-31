package l2;

/* JADX INFO: compiled from: SQLiteEventStore_Factory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class n0 implements f2.b<m0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final vc.a<n2.a> f21697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final vc.a<n2.a> f21698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final vc.a<e> f21699c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final vc.a<v0> f21700d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final vc.a<String> f21701e;

    public n0(vc.a<n2.a> aVar, vc.a<n2.a> aVar2, vc.a<e> aVar3, vc.a<v0> aVar4, vc.a<String> aVar5) {
        this.f21697a = aVar;
        this.f21698b = aVar2;
        this.f21699c = aVar3;
        this.f21700d = aVar4;
        this.f21701e = aVar5;
    }

    public static n0 a(vc.a<n2.a> aVar, vc.a<n2.a> aVar2, vc.a<e> aVar3, vc.a<v0> aVar4, vc.a<String> aVar5) {
        return new n0(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static m0 c(n2.a aVar, n2.a aVar2, Object obj, Object obj2, vc.a<String> aVar3) {
        return new m0(aVar, aVar2, (e) obj, (v0) obj2, aVar3);
    }

    @Override // vc.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public m0 get() {
        return c(this.f21697a.get(), this.f21698b.get(), this.f21699c.get(), this.f21700d.get(), this.f21701e);
    }
}
