package j2;

import java.util.concurrent.Executor;
import k2.x;

/* JADX INFO: compiled from: DefaultScheduler_Factory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements f2.b<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final vc.a<Executor> f20558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final vc.a<e2.e> f20559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final vc.a<x> f20560c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final vc.a<l2.d> f20561d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final vc.a<m2.a> f20562e;

    public d(vc.a<Executor> aVar, vc.a<e2.e> aVar2, vc.a<x> aVar3, vc.a<l2.d> aVar4, vc.a<m2.a> aVar5) {
        this.f20558a = aVar;
        this.f20559b = aVar2;
        this.f20560c = aVar3;
        this.f20561d = aVar4;
        this.f20562e = aVar5;
    }

    public static d a(vc.a<Executor> aVar, vc.a<e2.e> aVar2, vc.a<x> aVar3, vc.a<l2.d> aVar4, vc.a<m2.a> aVar5) {
        return new d(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static c c(Executor executor, e2.e eVar, x xVar, l2.d dVar, m2.a aVar) {
        return new c(executor, eVar, xVar, dVar, aVar);
    }

    @Override // vc.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c get() {
        return c(this.f20558a.get(), this.f20559b.get(), this.f20560c.get(), this.f20561d.get(), this.f20562e.get());
    }
}
