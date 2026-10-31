package com.google.android.play.integrity.internal;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.4.0 */
/* JADX INFO: loaded from: classes.dex */
abstract class an extends aw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f11379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f11380b;

    protected an(int i10, int i11) {
        al.b(i11, i10, "index");
        this.f11379a = i10;
        this.f11380b = i11;
    }

    protected abstract Object a(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f11380b < this.f11379a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f11380b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f11380b;
        this.f11380b = i10 + 1;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f11380b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f11380b - 1;
        this.f11380b = i10;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f11380b - 1;
    }
}
