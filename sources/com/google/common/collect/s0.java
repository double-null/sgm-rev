package com.google.common.collect;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: compiled from: RegularImmutableSortedSet.java */
/* JADX INFO: loaded from: classes4.dex */
final class s0<E> extends x<E> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final s0<Comparable> f11693f = new s0<>(u.H(), n0.e());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final transient u<E> f11694e;

    s0(u<E> uVar, Comparator<? super E> comparator) {
        super(comparator);
        this.f11694e = uVar;
    }

    private int x0(Object obj) throws ClassCastException {
        return Collections.binarySearch(this.f11694e, obj, y0());
    }

    @Override // com.google.common.collect.x
    x<E> Y() {
        Comparator comparatorReverseOrder = Collections.reverseOrder(this.f11728c);
        return isEmpty() ? x.e0(comparatorReverseOrder) : new s0(this.f11694e.d0(), comparatorReverseOrder);
    }

    @Override // com.google.common.collect.x, java.util.NavigableSet
    /* JADX INFO: renamed from: a0 */
    public c1<E> descendingIterator() {
        return this.f11694e.d0().iterator();
    }

    @Override // com.google.common.collect.w, com.google.common.collect.s
    public u<E> c() {
        return this.f11694e;
    }

    @Override // com.google.common.collect.x, java.util.NavigableSet
    public E ceiling(E e10) {
        int iW0 = w0(e10, true);
        if (iW0 == size()) {
            return null;
        }
        return this.f11694e.get(iW0);
    }

    @Override // com.google.common.collect.s, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return x0(obj) >= 0;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        if (collection instanceof j0) {
            collection = ((j0) collection).k();
        }
        if (!z0.b(comparator(), collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        c1<E> it = iterator();
        Iterator<?> it2 = collection.iterator();
        if (!it.hasNext()) {
            return false;
        }
        Object next = it2.next();
        E next2 = it.next();
        while (true) {
            try {
                int iS0 = s0(next2, next);
                if (iS0 < 0) {
                    if (!it.hasNext()) {
                        return false;
                    }
                    next2 = it.next();
                } else if (iS0 == 0) {
                    if (!it2.hasNext()) {
                        return true;
                    }
                    next = it2.next();
                } else if (iS0 > 0) {
                    return false;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
    }

    @Override // com.google.common.collect.s
    int e(Object[] objArr, int i10) {
        return this.f11694e.e(objArr, i10);
    }

    @Override // com.google.common.collect.w, java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        if (!z0.b(this.f11728c, set)) {
            return containsAll(set);
        }
        Iterator<E> it = set.iterator();
        try {
            c1<E> it2 = iterator();
            while (it2.hasNext()) {
                E next = it2.next();
                E next2 = it.next();
                if (next2 == null || s0(next, next2) != 0) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    @Override // com.google.common.collect.s
    Object[] f() {
        return this.f11694e.f();
    }

    @Override // com.google.common.collect.x, java.util.SortedSet
    public E first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f11694e.get(0);
    }

    @Override // com.google.common.collect.x, java.util.NavigableSet
    public E floor(E e10) {
        int iV0 = v0(e10, true) - 1;
        if (iV0 == -1) {
            return null;
        }
        return this.f11694e.get(iV0);
    }

    @Override // com.google.common.collect.s
    int g() {
        return this.f11694e.g();
    }

    @Override // com.google.common.collect.s
    int h() {
        return this.f11694e.h();
    }

    @Override // com.google.common.collect.x, java.util.NavigableSet
    public E higher(E e10) {
        int iW0 = w0(e10, false);
        if (iW0 == size()) {
            return null;
        }
        return this.f11694e.get(iW0);
    }

    @Override // com.google.common.collect.x
    x<E> j0(E e10, boolean z10) {
        return u0(0, v0(e10, z10));
    }

    @Override // com.google.common.collect.x, java.util.SortedSet
    public E last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f11694e.get(size() - 1);
    }

    @Override // com.google.common.collect.x, java.util.NavigableSet
    public E lower(E e10) {
        int iV0 = v0(e10, false) - 1;
        if (iV0 == -1) {
            return null;
        }
        return this.f11694e.get(iV0);
    }

    @Override // com.google.common.collect.s
    boolean o() {
        return this.f11694e.o();
    }

    @Override // com.google.common.collect.x
    x<E> o0(E e10, boolean z10, E e11, boolean z11) {
        return r0(e10, z10).j0(e11, z11);
    }

    @Override // com.google.common.collect.x, com.google.common.collect.w, com.google.common.collect.s, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: p */
    public c1<E> iterator() {
        return this.f11694e.iterator();
    }

    @Override // com.google.common.collect.x
    x<E> r0(E e10, boolean z10) {
        return u0(w0(e10, z10), size());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f11694e.size();
    }

    s0<E> u0(int i10, int i11) {
        if (i10 == 0 && i11 == size()) {
            return this;
        }
        return i10 < i11 ? new s0<>(this.f11694e.subList(i10, i11), this.f11728c) : x.e0(this.f11728c);
    }

    int v0(E e10, boolean z10) {
        int iBinarySearch = Collections.binarySearch(this.f11694e, com.google.common.base.p.l(e10), comparator());
        if (iBinarySearch >= 0) {
            return z10 ? iBinarySearch + 1 : iBinarySearch;
        }
        return ~iBinarySearch;
    }

    int w0(E e10, boolean z10) {
        int iBinarySearch = Collections.binarySearch(this.f11694e, com.google.common.base.p.l(e10), comparator());
        if (iBinarySearch >= 0) {
            return z10 ? iBinarySearch : iBinarySearch + 1;
        }
        return ~iBinarySearch;
    }

    @Override // com.google.common.collect.x, com.google.common.collect.w, com.google.common.collect.s
    Object writeReplace() {
        return super.writeReplace();
    }

    Comparator<Object> y0() {
        return this.f11728c;
    }
}
