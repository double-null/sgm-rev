package kotlin.collections;

import java.util.Iterator;

/* JADX INFO: compiled from: Iterables.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class h0<T> implements Iterable<g0<? extends T>>, jd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final id.a<Iterator<T>> f21462a;

    /* JADX WARN: Multi-variable type inference failed */
    public h0(id.a<? extends Iterator<? extends T>> iteratorFactory) {
        kotlin.jvm.internal.t.f(iteratorFactory, "iteratorFactory");
        this.f21462a = iteratorFactory;
    }

    @Override // java.lang.Iterable
    public Iterator<g0<T>> iterator() {
        return new i0(this.f21462a.invoke());
    }
}
