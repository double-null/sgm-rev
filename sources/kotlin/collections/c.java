package kotlin.collections;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: AbstractIterator.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class c<T> implements Iterator<T>, jd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f21446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private T f21447b;

    private final boolean d() {
        this.f21446a = 3;
        a();
        return this.f21446a == 1;
    }

    protected abstract void a();

    protected final void b() {
        this.f21446a = 2;
    }

    protected final void c(T t10) {
        this.f21447b = t10;
        this.f21446a = 1;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i10 = this.f21446a;
        if (i10 == 0) {
            return d();
        }
        if (i10 == 1) {
            return true;
        }
        if (i10 == 2) {
            return false;
        }
        throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    }

    @Override // java.util.Iterator
    public T next() {
        int i10 = this.f21446a;
        if (i10 == 1) {
            this.f21446a = 0;
            return this.f21447b;
        }
        if (i10 == 2 || !d()) {
            throw new NoSuchElementException();
        }
        this.f21446a = 0;
        return this.f21447b;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
