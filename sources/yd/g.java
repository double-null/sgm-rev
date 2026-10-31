package yd;

import wc.g0;

/* JADX INFO: compiled from: ChannelFlow.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class g<T> extends f<T, T> {
    public /* synthetic */ g(xd.c cVar, zc.j jVar, int i10, wd.a aVar, int i11, kotlin.jvm.internal.k kVar) {
        this(cVar, (i11 & 2) != 0 ? zc.k.f29181a : jVar, (i11 & 4) != 0 ? -3 : i10, (i11 & 8) != 0 ? wd.a.SUSPEND : aVar);
    }

    @Override // yd.d
    protected d<T> g(zc.j jVar, int i10, wd.a aVar) {
        return new g(this.f28887d, jVar, i10, aVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // yd.f
    protected Object n(xd.d<? super T> dVar, zc.f<? super g0> fVar) {
        Object objA = this.f28887d.a((xd.d<? super S>) dVar, fVar);
        return objA == ad.d.f() ? objA : g0.f27756a;
    }

    public g(xd.c<? extends T> cVar, zc.j jVar, int i10, wd.a aVar) {
        super(cVar, jVar, i10, aVar);
    }
}
