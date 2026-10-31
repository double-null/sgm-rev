package wc;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: UByteArray.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class y implements Collection<x>, jd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f27790a;

    /* JADX INFO: compiled from: UByteArray.kt */
    private static final class a implements Iterator<x>, jd.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final byte[] f27791a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f27792b;

        public a(byte[] array) {
            kotlin.jvm.internal.t.f(array, "array");
            this.f27791a = array;
        }

        public byte a() {
            int i10 = this.f27792b;
            byte[] bArr = this.f27791a;
            if (i10 >= bArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f27792b));
            }
            this.f27792b = i10 + 1;
            return x.b(bArr[i10]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f27792b < this.f27791a.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ x next() {
            return x.a(a());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ y(byte[] bArr) {
        this.f27790a = bArr;
    }

    public static final /* synthetic */ y a(byte[] bArr) {
        return new y(bArr);
    }

    public static byte[] c(int i10) {
        return d(new byte[i10]);
    }

    public static byte[] d(byte[] storage) {
        kotlin.jvm.internal.t.f(storage, "storage");
        return storage;
    }

    public static boolean f(byte[] bArr, byte b10) {
        return kotlin.collections.o.r(bArr, b10);
    }

    public static boolean g(byte[] bArr, Collection<x> elements) {
        kotlin.jvm.internal.t.f(elements, "elements");
        if (elements.isEmpty()) {
            return true;
        }
        for (Object obj : elements) {
            if (!((obj instanceof x) && kotlin.collections.o.r(bArr, ((x) obj).g()))) {
                return false;
            }
        }
        return true;
    }

    public static boolean i(byte[] bArr, Object obj) {
        return (obj instanceof y) && kotlin.jvm.internal.t.a(bArr, ((y) obj).t());
    }

    public static final byte j(byte[] bArr, int i10) {
        return x.b(bArr[i10]);
    }

    public static int m(byte[] bArr) {
        return bArr.length;
    }

    public static int o(byte[] bArr) {
        return Arrays.hashCode(bArr);
    }

    public static boolean p(byte[] bArr) {
        return bArr.length == 0;
    }

    public static Iterator<x> q(byte[] bArr) {
        return new a(bArr);
    }

    public static final void r(byte[] bArr, int i10, byte b10) {
        bArr[i10] = b10;
    }

    public static String s(byte[] bArr) {
        return "UByteArray(storage=" + Arrays.toString(bArr) + ')';
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(x xVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends x> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof x) {
            return e(((x) obj).g());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        kotlin.jvm.internal.t.f(elements, "elements");
        return g(this.f27790a, elements);
    }

    public boolean e(byte b10) {
        return f(this.f27790a, b10);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return i(this.f27790a, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return o(this.f27790a);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return p(this.f27790a);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<x> iterator() {
        return q(this.f27790a);
    }

    @Override // java.util.Collection
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public int size() {
        return m(this.f27790a);
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

    public final /* synthetic */ byte[] t() {
        return this.f27790a;
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return kotlin.jvm.internal.j.a(this);
    }

    public String toString() {
        return s(this.f27790a);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.t.f(array, "array");
        return (T[]) kotlin.jvm.internal.j.b(this, array);
    }
}
