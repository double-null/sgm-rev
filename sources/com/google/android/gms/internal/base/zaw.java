package com.google.android.gms.internal.base;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.10.1 */
/* JADX INFO: loaded from: classes3.dex */
abstract class zaw extends zaad {
    private final int zaa;
    private int zab;

    zaw(int i10, int i11) {
        zau.zab(i11, i10, "index");
        this.zaa = i10;
        this.zab = i11;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.zab < this.zaa;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.zab > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.zab;
        this.zab = i10 + 1;
        return zaa(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.zab;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.zab - 1;
        this.zab = i10;
        return zaa(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.zab - 1;
    }

    abstract Object zaa(int i10);
}
