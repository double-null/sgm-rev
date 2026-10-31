package xc;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: MapBuilder.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class f<E> extends kotlin.collections.g<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d<E, ?> f28465a;

    public f(d<E, ?> backing) {
        t.f(backing, "backing");
        this.f28465a = backing;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> elements) {
        t.f(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // kotlin.collections.g
    public int c() {
        return this.f28465a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f28465a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f28465a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f28465a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return this.f28465a.h0();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        return this.f28465a.q0(obj);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection<? extends Object> elements) {
        t.f(elements, "elements");
        this.f28465a.v();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection<? extends Object> elements) {
        t.f(elements, "elements");
        this.f28465a.v();
        return super.retainAll(elements);
    }
}
