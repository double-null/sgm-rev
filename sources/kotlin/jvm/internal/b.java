package kotlin.jvm.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: ArrayIterator.kt */
/* JADX INFO: loaded from: classes5.dex */
final class b<T> implements Iterator<T>, jd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T[] f21505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f21506b;

    public b(T[] array) {
        t.f(array, "array");
        this.f21505a = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f21506b < this.f21505a.length;
    }

    @Override // java.util.Iterator
    public T next() {
        try {
            T[] tArr = this.f21505a;
            int i10 = this.f21506b;
            this.f21506b = i10 + 1;
            return tArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f21506b--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
