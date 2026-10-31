package xd;

import wc.g0;

/* JADX INFO: compiled from: Builders.kt */
/* JADX INFO: loaded from: classes5.dex */
class b<T> extends yd.d<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final id.p<wd.s<? super T>, zc.f<? super g0>, Object> f28479d;

    public /* synthetic */ b(id.p pVar, zc.j jVar, int i10, wd.a aVar, int i11, kotlin.jvm.internal.k kVar) {
        this(pVar, (i11 & 2) != 0 ? zc.k.f29181a : jVar, (i11 & 4) != 0 ? -2 : i10, (i11 & 8) != 0 ? wd.a.SUSPEND : aVar);
    }

    static /* synthetic */ <T> Object k(b<T> bVar, wd.s<? super T> sVar, zc.f<? super g0> fVar) {
        Object objInvoke = ((b) bVar).f28479d.invoke(sVar, fVar);
        return objInvoke == ad.d.f() ? objInvoke : g0.f27756a;
    }

    @Override // yd.d
    protected Object f(wd.s<? super T> sVar, zc.f<? super g0> fVar) {
        return k(this, sVar, fVar);
    }

    @Override // yd.d
    protected yd.d<T> g(zc.j jVar, int i10, wd.a aVar) {
        return new b(this.f28479d, jVar, i10, aVar);
    }

    @Override // yd.d
    public String toString() {
        return "block[" + this.f28479d + "] -> " + super.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(id.p<? super wd.s<? super T>, ? super zc.f<? super g0>, ? extends Object> pVar, zc.j jVar, int i10, wd.a aVar) {
        super(jVar, i10, aVar);
        this.f28479d = pVar;
    }
}
