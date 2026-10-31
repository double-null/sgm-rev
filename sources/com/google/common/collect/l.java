package com.google.common.collect;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: compiled from: ComparatorOrdering.java */
/* JADX INFO: loaded from: classes4.dex */
final class l<T> extends n0<T> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Comparator<T> f11659a;

    l(Comparator<T> comparator) {
        this.f11659a = (Comparator) com.google.common.base.p.l(comparator);
    }

    @Override // com.google.common.collect.n0, java.util.Comparator
    public int compare(T t10, T t11) {
        return this.f11659a.compare(t10, t11);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l) {
            return this.f11659a.equals(((l) obj).f11659a);
        }
        return false;
    }

    public int hashCode() {
        return this.f11659a.hashCode();
    }

    public String toString() {
        return this.f11659a.toString();
    }
}
