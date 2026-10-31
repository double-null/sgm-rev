package com.google.common.collect;

import java.io.Serializable;

/* JADX INFO: compiled from: ByFunctionOrdering.java */
/* JADX INFO: loaded from: classes4.dex */
final class g<F, T> extends n0<F> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final com.google.common.base.g<F, ? extends T> f11625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final n0<T> f11626b;

    g(com.google.common.base.g<F, ? extends T> gVar, n0<T> n0Var) {
        this.f11625a = (com.google.common.base.g) com.google.common.base.p.l(gVar);
        this.f11626b = (n0) com.google.common.base.p.l(n0Var);
    }

    @Override // com.google.common.collect.n0, java.util.Comparator
    public int compare(F f10, F f11) {
        return this.f11626b.compare(this.f11625a.apply(f10), this.f11625a.apply(f11));
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f11625a.equals(gVar.f11625a) && this.f11626b.equals(gVar.f11626b);
    }

    public int hashCode() {
        return com.google.common.base.l.b(this.f11625a, this.f11626b);
    }

    public String toString() {
        return this.f11626b + ".onResultOf(" + this.f11625a + ")";
    }
}
