package kotlin.collections;

import java.util.Iterator;

/* JADX INFO: compiled from: Iterators.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class i0<T> implements Iterator<g0<? extends T>>, jd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Iterator<T> f21468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f21469b;

    /* JADX WARN: Multi-variable type inference failed */
    public i0(Iterator<? extends T> iterator) {
        kotlin.jvm.internal.t.f(iterator, "iterator");
        this.f21468a = iterator;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final g0<T> next() {
        int i10 = this.f21469b;
        this.f21469b = i10 + 1;
        if (i10 < 0) {
            t.t();
        }
        return new g0<>(i10, this.f21468a.next());
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f21468a.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
