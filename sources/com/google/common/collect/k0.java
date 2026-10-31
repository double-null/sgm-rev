package com.google.common.collect;

import java.io.Serializable;

/* JADX INFO: compiled from: NaturalOrdering.java */
/* JADX INFO: loaded from: classes4.dex */
final class k0 extends n0<Comparable<?>> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final k0 f11658a = new k0();

    private k0() {
    }

    private Object readResolve() {
        return f11658a;
    }

    @Override // com.google.common.collect.n0
    public <S extends Comparable<?>> n0<S> g() {
        return t0.f11697a;
    }

    @Override // com.google.common.collect.n0, java.util.Comparator
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable<?> comparable, Comparable<?> comparable2) {
        com.google.common.base.p.l(comparable);
        com.google.common.base.p.l(comparable2);
        return comparable.compareTo(comparable2);
    }

    public String toString() {
        return "Ordering.natural()";
    }
}
