package com.google.common.collect;

import java.util.Iterator;

/* JADX INFO: compiled from: TransformedIterator.java */
/* JADX INFO: loaded from: classes4.dex */
abstract class a1<F, T> implements Iterator<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Iterator<? extends F> f11491a;

    a1(Iterator<? extends F> it) {
        this.f11491a = (Iterator) com.google.common.base.p.l(it);
    }

    abstract T a(F f10);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f11491a.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        return a(this.f11491a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f11491a.remove();
    }
}
