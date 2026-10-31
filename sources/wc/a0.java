package wc;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: UIntArray.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a0 implements Collection<z>, jd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f27737a;

    /* JADX INFO: compiled from: UIntArray.kt */
    private static final class a implements Iterator<z>, jd.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int[] f27738a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f27739b;

        public a(int[] array) {
            kotlin.jvm.internal.t.f(array, "array");
            this.f27738a = array;
        }

        public int a() {
            int i10 = this.f27739b;
            int[] iArr = this.f27738a;
            if (i10 >= iArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f27739b));
            }
            this.f27739b = i10 + 1;
            return z.b(iArr[i10]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f27739b < this.f27738a.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ z next() {
            return z.a(a());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ a0(int[] iArr) {
        this.f27737a = iArr;
    }

    public static final /* synthetic */ a0 a(int[] iArr) {
        return new a0(iArr);
    }

    public static int[] c(int i10) {
        return d(new int[i10]);
    }

    public static int[] d(int[] storage) {
        kotlin.jvm.internal.t.f(storage, "storage");
        return storage;
    }

    public static boolean f(int[] iArr, int i10) {
        return kotlin.collections.o.t(iArr, i10);
    }

    public static boolean g(int[] iArr, Collection<z> elements) {
        kotlin.jvm.internal.t.f(elements, "elements");
        if (elements.isEmpty()) {
            return true;
        }
        for (Object obj : elements) {
            if (!((obj instanceof z) && kotlin.collections.o.t(iArr, ((z) obj).g()))) {
                return false;
            }
        }
        return true;
    }

    public static boolean i(int[] iArr, Object obj) {
        return (obj instanceof a0) && kotlin.jvm.internal.t.a(iArr, ((a0) obj).t());
    }

    public static final int j(int[] iArr, int i10) {
        return z.b(iArr[i10]);
    }

    public static int m(int[] iArr) {
        return iArr.length;
    }

    public static int o(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    public static boolean p(int[] iArr) {
        return iArr.length == 0;
    }

    public static Iterator<z> q(int[] iArr) {
        return new a(iArr);
    }

    public static final void r(int[] iArr, int i10, int i11) {
        iArr[i10] = i11;
    }

    public static String s(int[] iArr) {
        return "UIntArray(storage=" + Arrays.toString(iArr) + ')';
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(z zVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends z> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof z) {
            return e(((z) obj).g());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        kotlin.jvm.internal.t.f(elements, "elements");
        return g(this.f27737a, elements);
    }

    public boolean e(int i10) {
        return f(this.f27737a, i10);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return i(this.f27737a, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return o(this.f27737a);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return p(this.f27737a);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<z> iterator() {
        return q(this.f27737a);
    }

    @Override // java.util.Collection
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public int size() {
        return m(this.f27737a);
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

    public final /* synthetic */ int[] t() {
        return this.f27737a;
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return kotlin.jvm.internal.j.a(this);
    }

    public String toString() {
        return s(this.f27737a);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.t.f(array, "array");
        return (T[]) kotlin.jvm.internal.j.b(this, array);
    }
}
