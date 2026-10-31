package k2;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: WorkInitializer_Factory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class w implements f2.b<v> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final vc.a<Executor> f21206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final vc.a<l2.d> f21207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final vc.a<x> f21208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final vc.a<m2.a> f21209d;

    public w(vc.a<Executor> aVar, vc.a<l2.d> aVar2, vc.a<x> aVar3, vc.a<m2.a> aVar4) {
        this.f21206a = aVar;
        this.f21207b = aVar2;
        this.f21208c = aVar3;
        this.f21209d = aVar4;
    }

    public static w a(vc.a<Executor> aVar, vc.a<l2.d> aVar2, vc.a<x> aVar3, vc.a<m2.a> aVar4) {
        return new w(aVar, aVar2, aVar3, aVar4);
    }

    public static v c(Executor executor, l2.d dVar, x xVar, m2.a aVar) {
        return new v(executor, dVar, xVar, aVar);
    }

    @Override // vc.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public v get() {
        return c(this.f21206a.get(), this.f21207b.get(), this.f21208c.get(), this.f21209d.get());
    }
}
