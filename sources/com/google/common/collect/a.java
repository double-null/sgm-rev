package com.google.common.collect;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: AbstractIndexedListIterator.java */
/* JADX INFO: loaded from: classes4.dex */
abstract class a<E> extends d1<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f11489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f11490b;

    protected a(int i10, int i11) {
        com.google.common.base.p.o(i11, i10);
        this.f11489a = i10;
        this.f11490b = i11;
    }

    protected abstract E a(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f11490b < this.f11489a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f11490b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f11490b;
        this.f11490b = i10 + 1;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f11490b;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f11490b - 1;
        this.f11490b = i10;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f11490b - 1;
    }
}
