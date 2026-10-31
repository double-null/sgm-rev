package com.google.common.collect;

import java.util.Iterator;

/* JADX INFO: compiled from: UnmodifiableIterator.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c1<E> implements Iterator<E> {
    protected c1() {
    }

    @Override // java.util.Iterator
    @Deprecated
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
