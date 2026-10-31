package com.google.common.collect;

import java.io.Serializable;

/* JADX INFO: compiled from: ReverseNaturalOrdering.java */
/* JADX INFO: loaded from: classes4.dex */
final class t0 extends n0<Comparable<?>> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final t0 f11697a = new t0();

    private t0() {
    }

    private Object readResolve() {
        return f11697a;
    }

    @Override // com.google.common.collect.n0
    public <S extends Comparable<?>> n0<S> g() {
        return n0.e();
    }

    @Override // com.google.common.collect.n0, java.util.Comparator
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable<?> comparable, Comparable<?> comparable2) {
        com.google.common.base.p.l(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public String toString() {
        return "Ordering.natural().reverse()";
    }
}
