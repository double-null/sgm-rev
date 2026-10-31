package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.Spliterators;

/* JADX INFO: compiled from: ImmutableCollection.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class s<E> extends AbstractCollection<E> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object[] f11689a = new Object[0];

    /* JADX INFO: compiled from: ImmutableCollection.java */
    static abstract class a<E> extends b<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object[] f11690a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f11691b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f11692c;

        a(int i10) {
            h.b(i10, "initialCapacity");
            this.f11690a = new Object[i10];
            this.f11691b = 0;
        }

        private void h(int i10) {
            Object[] objArr = this.f11690a;
            int iD = b.d(objArr.length, this.f11691b + i10);
            if (iD > objArr.length || this.f11692c) {
                this.f11690a = Arrays.copyOf(this.f11690a, iD);
                this.f11692c = false;
            }
        }

        @Override // com.google.common.collect.s.b
        public b<E> b(Iterable<? extends E> iterable) {
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                h(collection.size());
                if (collection instanceof s) {
                    this.f11691b = ((s) collection).e(this.f11690a, this.f11691b);
                    return this;
                }
            }
            super.b(iterable);
            return this;
        }

        public a<E> e(E e10) {
            com.google.common.base.p.l(e10);
            h(1);
            Object[] objArr = this.f11690a;
            int i10 = this.f11691b;
            this.f11691b = i10 + 1;
            objArr[i10] = e10;
            return this;
        }

        public b<E> f(E... eArr) {
            g(eArr, eArr.length);
            return this;
        }

        final void g(Object[] objArr, int i10) {
            m0.c(objArr, i10);
            h(i10);
            System.arraycopy(objArr, 0, this.f11690a, this.f11691b, i10);
            this.f11691b += i10;
        }
    }

    /* JADX INFO: compiled from: ImmutableCollection.java */
    public static abstract class b<E> {
        b() {
        }

        static int d(int i10, int i11) {
            if (i11 < 0) {
                throw new IllegalArgumentException("cannot store more than MAX_VALUE elements");
            }
            if (i11 <= i10) {
                return i10;
            }
            int iHighestOneBit = i10 + (i10 >> 1) + 1;
            if (iHighestOneBit < i11) {
                iHighestOneBit = Integer.highestOneBit(i11 - 1) << 1;
            }
            if (iHighestOneBit < 0) {
                return Integer.MAX_VALUE;
            }
            return iHighestOneBit;
        }

        public abstract b<E> a(E e10);

        public b<E> b(Iterable<? extends E> iterable) {
            Iterator<? extends E> it = iterable.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
            return this;
        }

        public b<E> c(Iterator<? extends E> it) {
            while (it.hasNext()) {
                a(it.next());
            }
            return this;
        }
    }

    s() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    public u<E> c() {
        return isEmpty() ? u.H() : u.s(toArray());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    int e(Object[] objArr, int i10) {
        c1<E> it = iterator();
        while (it.hasNext()) {
            objArr[i10] = it.next();
            i10++;
        }
        return i10;
    }

    Object[] f() {
        return null;
    }

    int g() {
        throw new UnsupportedOperationException();
    }

    int h() {
        throw new UnsupportedOperationException();
    }

    abstract boolean o();

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: p */
    public abstract c1<E> iterator();

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Spliterator<E> spliterator() {
        return Spliterators.spliterator(this, 1296);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f11689a);
    }

    Object writeReplace() {
        return new u.d(toArray());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        com.google.common.base.p.l(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] objArrF = f();
            if (objArrF != null) {
                return (T[]) o0.a(objArrF, h(), g(), tArr);
            }
            tArr = (T[]) m0.d(tArr, size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        e(tArr, 0);
        return tArr;
    }
}
