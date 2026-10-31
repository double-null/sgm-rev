package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: ImmutableList.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class u<E> extends s<E> implements List<E>, RandomAccess {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final d1<Object> f11698b = new b(p0.f11665e, 0);

    /* JADX INFO: compiled from: ImmutableList.java */
    public static final class a<E> extends s.a<E> {
        public a() {
            this(4);
        }

        @Override // com.google.common.collect.s.b
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public a<E> a(E e10) {
            super.e(e10);
            return this;
        }

        public a<E> j(E... eArr) {
            super.f(eArr);
            return this;
        }

        public a<E> k(Iterable<? extends E> iterable) {
            super.b(iterable);
            return this;
        }

        public a<E> l(Iterator<? extends E> it) {
            super.c(it);
            return this;
        }

        public u<E> m() {
            this.f11692c = true;
            return u.t(this.f11690a, this.f11691b);
        }

        a(int i10) {
            super(i10);
        }
    }

    /* JADX INFO: compiled from: ImmutableList.java */
    static class b<E> extends com.google.common.collect.a<E> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final u<E> f11699c;

        b(u<E> uVar, int i10) {
            super(uVar.size(), i10);
            this.f11699c = uVar;
        }

        @Override // com.google.common.collect.a
        protected E a(int i10) {
            return this.f11699c.get(i10);
        }
    }

    /* JADX INFO: compiled from: ImmutableList.java */
    private static class c<E> extends u<E> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final transient u<E> f11700c;

        c(u<E> uVar) {
            this.f11700c = uVar;
        }

        private int j0(int i10) {
            return (size() - 1) - i10;
        }

        private int k0(int i10) {
            return size() - i10;
        }

        @Override // com.google.common.collect.u, com.google.common.collect.s, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f11700c.contains(obj);
        }

        @Override // com.google.common.collect.u
        public u<E> d0() {
            return this.f11700c;
        }

        @Override // java.util.List
        public E get(int i10) {
            com.google.common.base.p.j(i10, size());
            return this.f11700c.get(j0(i10));
        }

        @Override // com.google.common.collect.u, java.util.List
        /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
        public u<E> subList(int i10, int i11) {
            com.google.common.base.p.q(i10, i11, size());
            return this.f11700c.subList(k0(i11), k0(i10)).d0();
        }

        @Override // com.google.common.collect.u, java.util.List
        public int indexOf(Object obj) {
            int iLastIndexOf = this.f11700c.lastIndexOf(obj);
            if (iLastIndexOf >= 0) {
                return j0(iLastIndexOf);
            }
            return -1;
        }

        @Override // com.google.common.collect.u, com.google.common.collect.s, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // com.google.common.collect.u, java.util.List
        public int lastIndexOf(Object obj) {
            int iIndexOf = this.f11700c.indexOf(obj);
            if (iIndexOf >= 0) {
                return j0(iIndexOf);
            }
            return -1;
        }

        @Override // com.google.common.collect.u, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // com.google.common.collect.s
        boolean o() {
            return this.f11700c.o();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f11700c.size();
        }

        @Override // com.google.common.collect.u, com.google.common.collect.s
        Object writeReplace() {
            return super.writeReplace();
        }

        @Override // com.google.common.collect.u, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
            return super.listIterator(i10);
        }
    }

    /* JADX INFO: compiled from: ImmutableList.java */
    static class d implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object[] f11701a;

        d(Object[] objArr) {
            this.f11701a = objArr;
        }

        Object readResolve() {
            return u.D(this.f11701a);
        }
    }

    /* JADX INFO: compiled from: ImmutableList.java */
    class e extends u<E> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final transient int f11702c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final transient int f11703d;

        e(int i10, int i11) {
            this.f11702c = i10;
            this.f11703d = i11;
        }

        @Override // com.google.common.collect.s
        Object[] f() {
            return u.this.f();
        }

        @Override // com.google.common.collect.s
        int g() {
            return u.this.h() + this.f11702c + this.f11703d;
        }

        @Override // java.util.List
        public E get(int i10) {
            com.google.common.base.p.j(i10, this.f11703d);
            return u.this.get(i10 + this.f11702c);
        }

        @Override // com.google.common.collect.s
        int h() {
            return u.this.h() + this.f11702c;
        }

        @Override // com.google.common.collect.u, java.util.List
        /* JADX INFO: renamed from: h0 */
        public u<E> subList(int i10, int i11) {
            com.google.common.base.p.q(i10, i11, this.f11703d);
            u uVar = u.this;
            int i12 = this.f11702c;
            return uVar.subList(i10 + i12, i11 + i12);
        }

        @Override // com.google.common.collect.u, com.google.common.collect.s, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // com.google.common.collect.u, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // com.google.common.collect.s
        boolean o() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f11703d;
        }

        @Override // com.google.common.collect.u, com.google.common.collect.s
        Object writeReplace() {
            return super.writeReplace();
        }

        @Override // com.google.common.collect.u, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
            return super.listIterator(i10);
        }
    }

    u() {
    }

    public static <E> u<E> B(Collection<? extends E> collection) {
        if (!(collection instanceof s)) {
            return x(collection.toArray());
        }
        u<E> uVarC = ((s) collection).c();
        return uVarC.o() ? s(uVarC.toArray()) : uVarC;
    }

    public static <E> u<E> C(Iterator<? extends E> it) {
        if (!it.hasNext()) {
            return H();
        }
        E next = it.next();
        return !it.hasNext() ? I(next) : new a().a(next).l(it).m();
    }

    public static <E> u<E> D(E[] eArr) {
        return eArr.length == 0 ? H() : x((Object[]) eArr.clone());
    }

    public static <E> u<E> H() {
        return (u<E>) p0.f11665e;
    }

    public static <E> u<E> I(E e10) {
        return x(e10);
    }

    public static <E> u<E> K(E e10, E e11) {
        return x(e10, e11);
    }

    public static <E> u<E> N(E e10, E e11, E e12) {
        return x(e10, e11, e12);
    }

    public static <E> u<E> U(E e10, E e11, E e12, E e13, E e14) {
        return x(e10, e11, e12, e13, e14);
    }

    public static <E> u<E> Y(E e10, E e11, E e12, E e13, E e14, E e15, E e16) {
        return x(e10, e11, e12, e13, e14, e15, e16);
    }

    @SafeVarargs
    public static <E> u<E> a0(E e10, E e11, E e12, E e13, E e14, E e15, E e16, E e17, E e18, E e19, E e20, E e21, E... eArr) {
        com.google.common.base.p.e(eArr.length <= 2147483635, "the total number of elements must fit in an int");
        Object[] objArr = new Object[eArr.length + 12];
        objArr[0] = e10;
        objArr[1] = e11;
        objArr[2] = e12;
        objArr[3] = e13;
        objArr[4] = e14;
        objArr[5] = e15;
        objArr[6] = e16;
        objArr[7] = e17;
        objArr[8] = e18;
        objArr[9] = e19;
        objArr[10] = e20;
        objArr[11] = e21;
        System.arraycopy(eArr, 0, objArr, 12, eArr.length);
        return x(objArr);
    }

    public static <E> u<E> e0(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        com.google.common.base.p.l(comparator);
        Object[] objArrK = y.k(iterable);
        m0.b(objArrK);
        Arrays.sort(objArrK, comparator);
        return s(objArrK);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    static <E> u<E> s(Object[] objArr) {
        return t(objArr, objArr.length);
    }

    static <E> u<E> t(Object[] objArr, int i10) {
        return i10 == 0 ? H() : new p0(objArr, i10);
    }

    public static <E> a<E> v() {
        return new a<>();
    }

    public static <E> a<E> w(int i10) {
        h.b(i10, "expectedSize");
        return new a<>(i10);
    }

    private static <E> u<E> x(Object... objArr) {
        return s(m0.b(objArr));
    }

    public static <E> u<E> z(Iterable<? extends E> iterable) {
        com.google.common.base.p.l(iterable);
        return iterable instanceof Collection ? B((Collection) iterable) : C(iterable.iterator());
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public d1<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public d1<E> listIterator(int i10) {
        com.google.common.base.p.o(i10, size());
        return isEmpty() ? (d1<E>) f11698b : new b(this, i10);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i10, E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i10, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.s, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public u<E> d0() {
        return size() <= 1 ? this : new c(this);
    }

    @Override // com.google.common.collect.s
    int e(Object[] objArr, int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i10 + i11] = get(i11);
        }
        return i10 + size;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return b0.c(this, obj);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: h0 */
    public u<E> subList(int i10, int i11) {
        com.google.common.base.p.q(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == size()) {
            return this;
        }
        return i12 == 0 ? H() : i0(i10, i11);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = ~(~((i10 * 31) + get(i11).hashCode()));
        }
        return i10;
    }

    u<E> i0(int i10, int i11) {
        return new e(i10, i11 - i10);
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return b0.d(this, obj);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return b0.f(this, obj);
    }

    @Override // com.google.common.collect.s, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public c1<E> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int i10, E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.s
    Object writeReplace() {
        return new d(toArray());
    }

    @Override // com.google.common.collect.s
    @Deprecated
    public final u<E> c() {
        return this;
    }
}
