package k2;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: Uploader_Factory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class s implements f2.b<r> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final vc.a<Context> f21191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final vc.a<e2.e> f21192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final vc.a<l2.d> f21193c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final vc.a<x> f21194d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final vc.a<Executor> f21195e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final vc.a<m2.a> f21196f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final vc.a<n2.a> f21197g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final vc.a<n2.a> f21198h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final vc.a<l2.c> f21199i;

    public s(vc.a<Context> aVar, vc.a<e2.e> aVar2, vc.a<l2.d> aVar3, vc.a<x> aVar4, vc.a<Executor> aVar5, vc.a<m2.a> aVar6, vc.a<n2.a> aVar7, vc.a<n2.a> aVar8, vc.a<l2.c> aVar9) {
        this.f21191a = aVar;
        this.f21192b = aVar2;
        this.f21193c = aVar3;
        this.f21194d = aVar4;
        this.f21195e = aVar5;
        this.f21196f = aVar6;
        this.f21197g = aVar7;
        this.f21198h = aVar8;
        this.f21199i = aVar9;
    }

    public static s a(vc.a<Context> aVar, vc.a<e2.e> aVar2, vc.a<l2.d> aVar3, vc.a<x> aVar4, vc.a<Executor> aVar5, vc.a<m2.a> aVar6, vc.a<n2.a> aVar7, vc.a<n2.a> aVar8, vc.a<l2.c> aVar9) {
        return new s(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9);
    }

    public static r c(Context context, e2.e eVar, l2.d dVar, x xVar, Executor executor, m2.a aVar, n2.a aVar2, n2.a aVar3, l2.c cVar) {
        return new r(context, eVar, dVar, xVar, executor, aVar, aVar2, aVar3, cVar);
    }

    @Override // vc.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public r get() {
        return c(this.f21191a.get(), this.f21192b.get(), this.f21193c.get(), this.f21194d.get(), this.f21195e.get(), this.f21196f.get(), this.f21197g.get(), this.f21198h.get(), this.f21199i.get());
    }
}
