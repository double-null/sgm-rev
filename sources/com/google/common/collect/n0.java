package com.google.common.collect;

import java.util.Comparator;

/* JADX INFO: compiled from: Ordering.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class n0<T> implements Comparator<T> {
    protected n0() {
    }

    public static <T> n0<T> c(Comparator<T> comparator) {
        return comparator instanceof n0 ? (n0) comparator : new l(comparator);
    }

    public static <C extends Comparable> n0<C> e() {
        return k0.f11658a;
    }

    public <U extends T> n0<U> b(Comparator<? super U> comparator) {
        return new n(this, (Comparator) com.google.common.base.p.l(comparator));
    }

    @Override // java.util.Comparator
    public abstract int compare(T t10, T t11);

    public <F> n0<F> f(com.google.common.base.g<F, ? extends T> gVar) {
        return new g(gVar, this);
    }

    public <S extends T> n0<S> g() {
        return new u0(this);
    }
}
