package kotlin.collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: SlidingWindow.kt */
/* JADX INFO: loaded from: classes5.dex */
final class r0<T> extends d<T> implements RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object[] f21471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f21472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f21473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f21474d;

    /* JADX INFO: compiled from: SlidingWindow.kt */
    public static final class a extends c<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f21475c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f21476d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ r0<T> f21477e;

        a(r0<T> r0Var) {
            this.f21477e = r0Var;
            this.f21475c = r0Var.size();
            this.f21476d = ((r0) r0Var).f21473c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.collections.c
        protected void a() {
            if (this.f21475c == 0) {
                b();
                return;
            }
            c(((r0) this.f21477e).f21471a[this.f21476d]);
            this.f21476d = (this.f21476d + 1) % ((r0) this.f21477e).f21472b;
            this.f21475c--;
        }
    }

    public r0(Object[] buffer, int i10) {
        kotlin.jvm.internal.t.f(buffer, "buffer");
        this.f21471a = buffer;
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("ring buffer filled size should not be negative but it is " + i10).toString());
        }
        if (i10 <= buffer.length) {
            this.f21472b = buffer.length;
            this.f21474d = i10;
            return;
        }
        throw new IllegalArgumentException(("ring buffer filled size: " + i10 + " cannot be larger than the buffer size: " + buffer.length).toString());
    }

    @Override // kotlin.collections.d, java.util.List
    public T get(int i10) {
        d.Companion.b(i10, size());
        return (T) this.f21471a[(this.f21473c + i10) % this.f21472b];
    }

    @Override // kotlin.collections.d, kotlin.collections.b
    public int getSize() {
        return this.f21474d;
    }

    @Override // kotlin.collections.d, kotlin.collections.b, java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return new a(this);
    }

    public final void o(T t10) {
        if (s()) {
            throw new IllegalStateException("ring buffer is full");
        }
        this.f21471a[(this.f21473c + size()) % this.f21472b] = t10;
        this.f21474d = size() + 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final r0<T> p(int i10) {
        Object[] array;
        int i11 = this.f21472b;
        int iF = od.k.f(i11 + (i11 >> 1) + 1, i10);
        if (this.f21473c == 0) {
            array = Arrays.copyOf(this.f21471a, iF);
            kotlin.jvm.internal.t.e(array, "copyOf(...)");
        } else {
            array = toArray(new Object[iF]);
        }
        return new r0<>(array, size());
    }

    public final boolean s() {
        return size() == this.f21472b;
    }

    public final void t(int i10) {
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("n shouldn't be negative but it is " + i10).toString());
        }
        if (!(i10 <= size())) {
            throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = " + i10 + ", size = " + size()).toString());
        }
        if (i10 > 0) {
            int i11 = this.f21473c;
            int i12 = (i11 + i10) % this.f21472b;
            if (i11 > i12) {
                m.l(this.f21471a, null, i11, this.f21472b);
                m.l(this.f21471a, null, 0, i12);
            } else {
                m.l(this.f21471a, null, i11, i12);
            }
            this.f21473c = i12;
            this.f21474d = size() - i10;
        }
    }

    @Override // kotlin.collections.b, java.util.Collection
    public <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.t.f(array, "array");
        int length = array.length;
        Object[] objArr = array;
        if (length < size()) {
            Object[] objArr2 = (T[]) Arrays.copyOf(array, size());
            kotlin.jvm.internal.t.e(objArr2, "copyOf(...)");
            objArr = objArr2;
        }
        int size = size();
        int i10 = 0;
        int i11 = 0;
        for (int i12 = this.f21473c; i11 < size && i12 < this.f21472b; i12++) {
            objArr[i11] = this.f21471a[i12];
            i11++;
        }
        while (i11 < size) {
            objArr[i11] = this.f21471a[i10];
            i11++;
            i10++;
        }
        return (T[]) s.f(size, objArr);
    }

    public r0(int i10) {
        this(new Object[i10], 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.b, java.util.Collection
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
