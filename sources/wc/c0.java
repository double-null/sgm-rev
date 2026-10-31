package wc;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: ULongArray.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class c0 implements Collection<b0>, jd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long[] f27743a;

    /* JADX INFO: compiled from: ULongArray.kt */
    private static final class a implements Iterator<b0>, jd.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long[] f27744a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f27745b;

        public a(long[] array) {
            kotlin.jvm.internal.t.f(array, "array");
            this.f27744a = array;
        }

        public long a() {
            int i10 = this.f27745b;
            long[] jArr = this.f27744a;
            if (i10 >= jArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f27745b));
            }
            this.f27745b = i10 + 1;
            return b0.b(jArr[i10]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f27745b < this.f27744a.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ b0 next() {
            return b0.a(a());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ c0(long[] jArr) {
        this.f27743a = jArr;
    }

    public static final /* synthetic */ c0 a(long[] jArr) {
        return new c0(jArr);
    }

    public static long[] c(int i10) {
        return d(new long[i10]);
    }

    public static long[] d(long[] storage) {
        kotlin.jvm.internal.t.f(storage, "storage");
        return storage;
    }

    public static boolean f(long[] jArr, long j10) {
        return kotlin.collections.o.u(jArr, j10);
    }

    public static boolean g(long[] jArr, Collection<b0> elements) {
        kotlin.jvm.internal.t.f(elements, "elements");
        if (elements.isEmpty()) {
            return true;
        }
        for (Object obj : elements) {
            if (!((obj instanceof b0) && kotlin.collections.o.u(jArr, ((b0) obj).g()))) {
                return false;
            }
        }
        return true;
    }

    public static boolean i(long[] jArr, Object obj) {
        return (obj instanceof c0) && kotlin.jvm.internal.t.a(jArr, ((c0) obj).t());
    }

    public static final long j(long[] jArr, int i10) {
        return b0.b(jArr[i10]);
    }

    public static int m(long[] jArr) {
        return jArr.length;
    }

    public static int o(long[] jArr) {
        return Arrays.hashCode(jArr);
    }

    public static boolean p(long[] jArr) {
        return jArr.length == 0;
    }

    public static Iterator<b0> q(long[] jArr) {
        return new a(jArr);
    }

    public static final void r(long[] jArr, int i10, long j10) {
        jArr[i10] = j10;
    }

    public static String s(long[] jArr) {
        return "ULongArray(storage=" + Arrays.toString(jArr) + ')';
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(b0 b0Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends b0> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof b0) {
            return e(((b0) obj).g());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        kotlin.jvm.internal.t.f(elements, "elements");
        return g(this.f27743a, elements);
    }

    public boolean e(long j10) {
        return f(this.f27743a, j10);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return i(this.f27743a, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return o(this.f27743a);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return p(this.f27743a);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<b0> iterator() {
        return q(this.f27743a);
    }

    @Override // java.util.Collection
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public int size() {
        return m(this.f27743a);
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

    public final /* synthetic */ long[] t() {
        return this.f27743a;
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return kotlin.jvm.internal.j.a(this);
    }

    public String toString() {
        return s(this.f27743a);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.t.f(array, "array");
        return (T[]) kotlin.jvm.internal.j.b(this, array);
    }
}
