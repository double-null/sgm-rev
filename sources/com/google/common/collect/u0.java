package com.google.common.collect;

import java.io.Serializable;

/* JADX INFO: compiled from: ReverseOrdering.java */
/* JADX INFO: loaded from: classes4.dex */
final class u0<T> extends n0<T> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final n0<? super T> f11705a;

    u0(n0<? super T> n0Var) {
        this.f11705a = (n0) com.google.common.base.p.l(n0Var);
    }

    @Override // com.google.common.collect.n0, java.util.Comparator
    public int compare(T t10, T t11) {
        return this.f11705a.compare(t11, t10);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u0) {
            return this.f11705a.equals(((u0) obj).f11705a);
        }
        return false;
    }

    @Override // com.google.common.collect.n0
    public <S extends T> n0<S> g() {
        return this.f11705a;
    }

    public int hashCode() {
        return -this.f11705a.hashCode();
    }

    public String toString() {
        return this.f11705a + ".reverse()";
    }
}
