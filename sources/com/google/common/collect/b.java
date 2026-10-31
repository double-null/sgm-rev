package com.google.common.collect;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: AbstractIterator.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b<T> extends c1<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f11492a = a.NOT_READY;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private T f11493b;

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
        this.f11492a = a.FAILED;
        this.f11493b = a();
        if (this.f11492a == a.DONE) {
            return false;
        }
        this.f11492a = a.READY;
        return true;
    }

    protected abstract T a();

    protected final T b() {
        this.f11492a = a.DONE;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        com.google.common.base.p.r(this.f11492a != a.FAILED);
        int iOrdinal = this.f11492a.ordinal();
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
        this.f11492a = a.NOT_READY;
        T t10 = (T) l0.a(this.f11493b);
        this.f11493b = null;
        return t10;
    }
}
