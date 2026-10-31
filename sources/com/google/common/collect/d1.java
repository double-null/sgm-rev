package com.google.common.collect;

import java.util.ListIterator;

/* JADX INFO: compiled from: UnmodifiableListIterator.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class d1<E> extends c1<E> implements ListIterator<E> {
    protected d1() {
    }

    @Override // java.util.ListIterator
    @Deprecated
    public final void add(E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    @Deprecated
    public final void set(E e10) {
        throw new UnsupportedOperationException();
    }
}
