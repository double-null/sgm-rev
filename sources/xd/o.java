package xd;

import wc.g0;

/* JADX INFO: compiled from: Builders.kt */
/* JADX INFO: loaded from: classes5.dex */
final class o<T> extends a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final id.p<d<? super T>, zc.f<? super g0>, Object> f28553a;

    /* JADX WARN: Multi-variable type inference failed */
    public o(id.p<? super d<? super T>, ? super zc.f<? super g0>, ? extends Object> pVar) {
        this.f28553a = pVar;
    }

    @Override // xd.a
    public Object b(d<? super T> dVar, zc.f<? super g0> fVar) {
        Object objInvoke = this.f28553a.invoke(dVar, fVar);
        return objInvoke == ad.d.f() ? objInvoke : g0.f27756a;
    }
}
