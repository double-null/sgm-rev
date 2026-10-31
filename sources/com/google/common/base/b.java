package com.google.common.base;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: AbstractIterator.java */
/* JADX INFO: loaded from: classes.dex */
abstract class b<T> implements Iterator<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f11435a = a.NOT_READY;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private T f11436b;

    /* JADX INFO: compiled from: AbstractIterator.java */
    private enum a {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    protected b() {
    }

    private boolean c() {
        this.f11435a = a.FAILED;
        this.f11436b = a();
        if (this.f11435a == a.DONE) {
            return false;
        }
        this.f11435a = a.READY;
        return true;
    }

    protected abstract T a();

    protected final T b() {
        this.f11435a = a.DONE;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        p.r(this.f11435a != a.FAILED);
        int iOrdinal = this.f11435a.ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal != 2) {
            return c();
        }
        return false;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f11435a = a.NOT_READY;
        T t10 = (T) k.a(this.f11436b);
        this.f11436b = null;
        return t10;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
