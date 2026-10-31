package wc;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: UShortArray.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class f0 implements Collection<e0>, jd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final short[] f27753a;

    /* JADX INFO: compiled from: UShortArray.kt */
    private static final class a implements Iterator<e0>, jd.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final short[] f27754a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f27755b;

        public a(short[] array) {
            kotlin.jvm.internal.t.f(array, "array");
            this.f27754a = array;
        }

        public short a() {
            int i10 = this.f27755b;
            short[] sArr = this.f27754a;
            if (i10 >= sArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f27755b));
            }
            this.f27755b = i10 + 1;
            return e0.b(sArr[i10]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f27755b < this.f27754a.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ e0 next() {
            return e0.a(a());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ f0(short[] sArr) {
        this.f27753a = sArr;
    }

    public static final /* synthetic */ f0 a(short[] sArr) {
        return new f0(sArr);
    }

    public static short[] c(int i10) {
        return d(new short[i10]);
    }

    public static short[] d(short[] storage) {
        kotlin.jvm.internal.t.f(storage, "storage");
        return storage;
    }

    public static boolean f(short[] sArr, short s10) {
        return kotlin.collections.o.w(sArr, s10);
    }

    public static boolean g(short[] sArr, Collection<e0> elements) {
        kotlin.jvm.internal.t.f(elements, "elements");
        if (elements.isEmpty()) {
            return true;
        }
        for (Object obj : elements) {
            if (!((obj instanceof e0) && kotlin.collections.o.w(sArr, ((e0) obj).g()))) {
                return false;
            }
        }
        return true;
    }

    public static boolean i(short[] sArr, Object obj) {
        return (obj instanceof f0) && kotlin.jvm.internal.t.a(sArr, ((f0) obj).t());
    }

    public static final short j(short[] sArr, int i10) {
        return e0.b(sArr[i10]);
    }

    public static int m(short[] sArr) {
        return sArr.length;
    }

    public static int o(short[] sArr) {
        return Arrays.hashCode(sArr);
    }

    public static boolean p(short[] sArr) {
        return sArr.length == 0;
    }

    public static Iterator<e0> q(short[] sArr) {
        return new a(sArr);
    }

    public static final void r(short[] sArr, int i10, short s10) {
        sArr[i10] = s10;
    }

    public static String s(short[] sArr) {
        return "UShortArray(storage=" + Arrays.toString(sArr) + ')';
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(e0 e0Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends e0> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof e0) {
            return e(((e0) obj).g());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        kotlin.jvm.internal.t.f(elements, "elements");
        return g(this.f27753a, elements);
    }

    public boolean e(short s10) {
        return f(this.f27753a, s10);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return i(this.f27753a, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return o(this.f27753a);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return p(this.f27753a);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<e0> iterator() {
        return q(this.f27753a);
    }

    @Override // java.util.Collection
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public int size() {
        return m(this.f27753a);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* synthetic */ short[] t() {
        return this.f27753a;
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return kotlin.jvm.internal.j.a(this);
    }

    public String toString() {
        return s(this.f27753a);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.t.f(array, "array");
        return (T[]) kotlin.jvm.internal.j.b(this, array);
    }
}
