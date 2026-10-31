package com.google.common.collect;

/* JADX INFO: compiled from: SingletonImmutableSet.java */
/* JADX INFO: loaded from: classes4.dex */
final class x0<E> extends w<E> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final transient E f11733c;

    x0(E e10) {
        this.f11733c = (E) com.google.common.base.p.l(e10);
    }

    @Override // com.google.common.collect.w, com.google.common.collect.s
    public u<E> c() {
        return u.I(this.f11733c);
    }

    @Override // com.google.common.collect.s, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f11733c.equals(obj);
    }

    @Override // com.google.common.collect.s
    int e(Object[] objArr, int i10) {
        objArr[i10] = this.f11733c;
        return i10 + 1;
    }

    @Override // com.google.common.collect.w, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f11733c.hashCode();
    }

    @Override // com.google.common.collect.s
    boolean o() {
        return false;
    }

    @Override // com.google.common.collect.w, com.google.common.collect.s, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: p */
    public c1<E> iterator() {
        return z.q(this.f11733c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return '[' + this.f11733c.toString() + ']';
    }

    @Override // com.google.common.collect.w, com.google.common.collect.s
    Object writeReplace() {
        return super.writeReplace();
    }
}
