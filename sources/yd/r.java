package yd;

import wc.g0;
import wd.v;

/* JADX INFO: compiled from: SendingCollector.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class r<T> implements xd.d<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v<T> f28906a;

    /* JADX WARN: Multi-variable type inference failed */
    public r(v<? super T> vVar) {
        this.f28906a = vVar;
    }

    @Override // xd.d
    public Object b(T t10, zc.f<? super g0> fVar) {
        Object objJ = this.f28906a.j(t10, fVar);
        return objJ == ad.d.f() ? objJ : g0.f27756a;
    }
}
