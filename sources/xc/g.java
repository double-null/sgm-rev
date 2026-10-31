package xc;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: MapBuilder.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class g<V> extends kotlin.collections.e<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d<?, V> f28466a;

    public g(d<?, V> backing) {
        t.f(backing, "backing");
        this.f28466a = backing;
    }

    @Override // kotlin.collections.e
    public int a() {
        return this.f28466a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean add(V v10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection<? extends V> elements) {
        t.f(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f28466a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f28466a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.f28466a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<V> iterator() {
        return this.f28466a.t0();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        return this.f28466a.r0(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection<? extends Object> elements) {
        t.f(elements, "elements");
        this.f28466a.v();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection<? extends Object> elements) {
        t.f(elements, "elements");
        this.f28466a.v();
        return super.retainAll(elements);
    }
}
