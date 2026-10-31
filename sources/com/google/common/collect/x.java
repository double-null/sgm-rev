package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.NavigableSet;

/* JADX INFO: compiled from: ImmutableSortedSet.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class x<E> extends w<E> implements NavigableSet<E>, y0<E> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final transient Comparator<? super E> f11728c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    transient x<E> f11729d;

    /* JADX INFO: compiled from: ImmutableSortedSet.java */
    public static final class a<E> extends w.a<E> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Comparator<? super E> f11730f;

        public a(Comparator<? super E> comparator) {
            this.f11730f = (Comparator) com.google.common.base.p.l(comparator);
        }

        @Override // com.google.common.collect.w.a
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public a<E> a(E e10) {
            super.a(e10);
            return this;
        }

        @Override // com.google.common.collect.w.a
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public a<E> j(E... eArr) {
            super.j(eArr);
            return this;
        }

        @Override // com.google.common.collect.w.a
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public a<E> k(Iterable<? extends E> iterable) {
            super.k(iterable);
            return this;
        }

        @Override // com.google.common.collect.w.a
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public x<E> m() {
            x<E> xVarU = x.U(this.f11730f, this.f11691b, this.f11690a);
            this.f11691b = xVarU.size();
            this.f11692c = true;
            return xVarU;
        }
    }

    /* JADX INFO: compiled from: ImmutableSortedSet.java */
    private static class b<E> implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Comparator<? super E> f11731a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Object[] f11732b;

        public b(Comparator<? super E> comparator, Object[] objArr) {
            this.f11731a = comparator;
            this.f11732b = objArr;
        }

        /* JADX WARN: Multi-variable type inference failed */
        Object readResolve() {
            return new a(this.f11731a).j(this.f11732b).m();
        }
    }

    x(Comparator<? super E> comparator) {
        this.f11728c = comparator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static <E> x<E> U(Comparator<? super E> comparator, int i10, E... eArr) {
        if (i10 == 0) {
            return e0(comparator);
        }
        m0.c(eArr, i10);
        Arrays.sort(eArr, 0, i10, comparator);
        int i11 = 1;
        for (int i12 = 1; i12 < i10; i12++) {
            a1.a aVar = (Object) eArr[i12];
            if (comparator.compare(aVar, (Object) eArr[i11 - 1]) != 0) {
                eArr[i11] = aVar;
                i11++;
            }
        }
        Arrays.fill(eArr, i11, i10, (Object) null);
        if (i11 < eArr.length / 2) {
            eArr = (E[]) Arrays.copyOf(eArr, i11);
        }
        return new s0(u.t(eArr, i11), comparator);
    }

    static <E> s0<E> e0(Comparator<? super E> comparator) {
        return n0.e().equals(comparator) ? (s0<E>) s0.f11693f : new s0<>(u.H(), comparator);
    }

    public static <E extends Comparable<?>> a<E> k0() {
        return new a<>(n0.e());
    }

    public static <E> x<E> l0() {
        return s0.f11693f;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    static int t0(Comparator<?> comparator, Object obj, Object obj2) {
        return comparator.compare(obj, obj2);
    }

    abstract x<E> Y();

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public abstract c1<E> descendingIterator();

    public E ceiling(E e10) {
        return (E) y.c(tailSet(e10, true), null);
    }

    @Override // java.util.SortedSet, com.google.common.collect.y0
    public Comparator<? super E> comparator() {
        return this.f11728c;
    }

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
    public x<E> descendingSet() {
        x<E> xVar = this.f11729d;
        if (xVar != null) {
            return xVar;
        }
        x<E> xVarY = Y();
        this.f11729d = xVarY;
        xVarY.f11729d = this;
        return xVarY;
    }

    public E first() {
        return iterator().next();
    }

    public E floor(E e10) {
        return (E) z.k(headSet(e10, true).descendingIterator(), null);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
    public x<E> headSet(E e10) {
        return headSet(e10, false);
    }

    public E higher(E e10) {
        return (E) y.c(tailSet(e10, false), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public x<E> headSet(E e10, boolean z10) {
        return j0(com.google.common.base.p.l(e10), z10);
    }

    abstract x<E> j0(E e10, boolean z10);

    public E last() {
        return descendingIterator().next();
    }

    public E lower(E e10) {
        return (E) z.k(headSet(e10, false).descendingIterator(), null);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public x<E> subSet(E e10, E e11) {
        return subSet(e10, true, e11, false);
    }

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public x<E> subSet(E e10, boolean z10, E e11, boolean z11) {
        com.google.common.base.p.l(e10);
        com.google.common.base.p.l(e11);
        com.google.common.base.p.d(this.f11728c.compare(e10, e11) <= 0);
        return o0(e10, z10, e11, z11);
    }

    abstract x<E> o0(E e10, boolean z10, E e11, boolean z11);

    @Override // com.google.common.collect.w, com.google.common.collect.s, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: p */
    public abstract c1<E> iterator();

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public x<E> tailSet(E e10) {
        return tailSet(e10, true);
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final E pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final E pollLast() {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
    public x<E> tailSet(E e10, boolean z10) {
        return r0(com.google.common.base.p.l(e10), z10);
    }

    abstract x<E> r0(E e10, boolean z10);

    int s0(Object obj, Object obj2) {
        return t0(this.f11728c, obj, obj2);
    }

    @Override // com.google.common.collect.w, com.google.common.collect.s
    Object writeReplace() {
        return new b(this.f11728c, toArray());
    }
}
