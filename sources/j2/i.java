package j2;

import android.content.Context;
import k2.x;

/* JADX INFO: compiled from: SchedulingModule_WorkSchedulerFactory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class i implements f2.b<x> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final vc.a<Context> f20564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final vc.a<l2.d> f20565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final vc.a<k2.f> f20566c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final vc.a<n2.a> f20567d;

    public i(vc.a<Context> aVar, vc.a<l2.d> aVar2, vc.a<k2.f> aVar3, vc.a<n2.a> aVar4) {
        this.f20564a = aVar;
        this.f20565b = aVar2;
        this.f20566c = aVar3;
        this.f20567d = aVar4;
    }

    public static i a(vc.a<Context> aVar, vc.a<l2.d> aVar2, vc.a<k2.f> aVar3, vc.a<n2.a> aVar4) {
        return new i(aVar, aVar2, aVar3, aVar4);
    }

    public static x c(Context context, l2.d dVar, k2.f fVar, n2.a aVar) {
        return (x) f2.d.d(h.a(context, dVar, fVar, aVar));
    }

    @Override // vc.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public x get() {
        return c(this.f20564a.get(), this.f20565b.get(), this.f20566c.get(), this.f20567d.get());
    }
}
