package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: compiled from: ImmutableSet.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class w<E> extends s<E> implements Set<E> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient u<E> f11720b;

    /* JADX INFO: compiled from: ImmutableSet.java */
    public static class a<E> extends s.a<E> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object[] f11721d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f11722e;

        public a() {
            super(4);
        }

        private void l(E e10) {
            Objects.requireNonNull(this.f11721d);
            int length = this.f11721d.length - 1;
            int iHashCode = e10.hashCode();
            int iB = r.b(iHashCode);
            while (true) {
                int i10 = iB & length;
                Object[] objArr = this.f11721d;
                Object obj = objArr[i10];
                if (obj == null) {
                    objArr[i10] = e10;
                    this.f11722e += iHashCode;
                    super.e(e10);
                    return;
                } else if (obj.equals(e10)) {
                    return;
                } else {
                    iB = i10 + 1;
                }
            }
        }

        @Override // com.google.common.collect.s.b
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public a<E> a(E e10) {
            com.google.common.base.p.l(e10);
            if (this.f11721d != null && w.v(this.f11691b) <= this.f11721d.length) {
                l(e10);
                return this;
            }
            this.f11721d = null;
            super.e(e10);
            return this;
        }

        public a<E> j(E... eArr) {
            if (this.f11721d != null) {
                for (E e10 : eArr) {
                    a(e10);
                }
            } else {
                super.f(eArr);
            }
            return this;
        }

        public a<E> k(Iterable<? extends E> iterable) {
            com.google.common.base.p.l(iterable);
            if (this.f11721d != null) {
                Iterator<? extends E> it = iterable.iterator();
                while (it.hasNext()) {
                    a(it.next());
                }
            } else {
                super.b(iterable);
            }
            return this;
        }

        public w<E> m() {
            w<E> wVarW;
            int i10 = this.f11691b;
            if (i10 == 0) {
                return w.D();
            }
            if (i10 == 1) {
                Object obj = this.f11690a[0];
                Objects.requireNonNull(obj);
                return w.F(obj);
            }
            if (this.f11721d == null || w.v(i10) != this.f11721d.length) {
                wVarW = w.w(this.f11691b, this.f11690a);
                this.f11691b = wVarW.size();
            } else {
                Object[] objArrCopyOf = w.N(this.f11691b, this.f11690a.length) ? Arrays.copyOf(this.f11690a, this.f11691b) : this.f11690a;
                int i11 = this.f11722e;
                Object[] objArr = this.f11721d;
                wVarW = new r0<>(objArrCopyOf, i11, objArr, objArr.length - 1, this.f11691b);
            }
            this.f11692c = true;
            this.f11721d = null;
            return wVarW;
        }
    }

    /* JADX INFO: compiled from: ImmutableSet.java */
    private static class b implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object[] f11723a;

        b(Object[] objArr) {
            this.f11723a = objArr;
        }

        Object readResolve() {
            return w.z(this.f11723a);
        }
    }

    w() {
    }

    public static <E> w<E> D() {
        return r0.f11683i;
    }

    public static <E> w<E> F(E e10) {
        return new x0(e10);
    }

    public static <E> w<E> G(E e10, E e11) {
        return w(2, e10, e11);
    }

    public static <E> w<E> H(E e10, E e11, E e12) {
        return w(3, e10, e11, e12);
    }

    public static <E> w<E> I(E e10, E e11, E e12, E e13, E e14) {
        return w(5, e10, e11, e12, e13, e14);
    }

    @SafeVarargs
    public static <E> w<E> K(E e10, E e11, E e12, E e13, E e14, E e15, E... eArr) {
        com.google.common.base.p.e(eArr.length <= 2147483641, "the total number of elements must fit in an int");
        int length = eArr.length + 6;
        Object[] objArr = new Object[length];
        objArr[0] = e10;
        objArr[1] = e11;
        objArr[2] = e12;
        objArr[3] = e13;
        objArr[4] = e14;
        objArr[5] = e15;
        System.arraycopy(eArr, 0, objArr, 6, eArr.length);
        return w(length, objArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean N(int i10, int i11) {
        return i10 < (i11 >> 1) + (i11 >> 2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    static int v(int i10) {
        int iMax = Math.max(i10, 2);
        if (iMax >= 751619276) {
            com.google.common.base.p.e(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> w<E> w(int i10, Object... objArr) {
        if (i10 == 0) {
            return D();
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return F(obj);
        }
        int iV = v(i10);
        Object[] objArr2 = new Object[iV];
        int i11 = iV - 1;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            Object objA = m0.a(objArr[i14], i14);
            int iHashCode = objA.hashCode();
            int iB = r.b(iHashCode);
            while (true) {
                int i15 = iB & i11;
                Object obj2 = objArr2[i15];
                if (obj2 == null) {
                    objArr[i13] = objA;
                    objArr2[i15] = objA;
                    i12 += iHashCode;
                    i13++;
                    break;
                }
                if (obj2.equals(objA)) {
                    break;
                }
                iB++;
            }
        }
        Arrays.fill(objArr, i13, i10, (Object) null);
        if (i13 == 1) {
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3);
            return new x0(obj3);
        }
        if (v(i13) < iV / 2) {
            return w(i13, objArr);
        }
        if (N(i13, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i13);
        }
        return new r0(objArr, i12, objArr2, i11, i13);
    }

    public static <E> w<E> x(Collection<? extends E> collection) {
        if ((collection instanceof w) && !(collection instanceof SortedSet)) {
            w<E> wVar = (w) collection;
            if (!wVar.o()) {
                return wVar;
            }
        }
        Object[] array = collection.toArray();
        return w(array.length, array);
    }

    public static <E> w<E> z(E[] eArr) {
        int length = eArr.length;
        if (length != 0) {
            return length != 1 ? w(eArr.length, (Object[]) eArr.clone()) : F(eArr[0]);
        }
        return D();
    }

    u<E> B() {
        return u.s(toArray());
    }

    boolean C() {
        return false;
    }

    @Override // com.google.common.collect.s
    public u<E> c() {
        u<E> uVar = this.f11720b;
        if (uVar != null) {
            return uVar;
        }
        u<E> uVarB = B();
        this.f11720b = uVarB;
        return uVarB;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof w) && C() && ((w) obj).C() && hashCode() != obj.hashCode()) {
            return false;
        }
        return w0.a(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return w0.d(this);
    }

    @Override // com.google.common.collect.s, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: p */
    public abstract c1<E> iterator();

    @Override // com.google.common.collect.s
    Object writeReplace() {
        return new b(toArray());
    }
}
