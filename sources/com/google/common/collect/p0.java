package com.google.common.collect;

import java.util.Objects;

/* JADX INFO: compiled from: RegularImmutableList.java */
/* JADX INFO: loaded from: classes4.dex */
class p0<E> extends u<E> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final u<Object> f11665e = new p0(new Object[0], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final transient Object[] f11666c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient int f11667d;

    p0(Object[] objArr, int i10) {
        this.f11666c = objArr;
        this.f11667d = i10;
    }

    @Override // com.google.common.collect.u, com.google.common.collect.s
    int e(Object[] objArr, int i10) {
        System.arraycopy(this.f11666c, 0, objArr, i10, this.f11667d);
        return i10 + this.f11667d;
    }

    @Override // com.google.common.collect.s
    Object[] f() {
        return this.f11666c;
    }

    @Override // com.google.common.collect.s
    int g() {
        return this.f11667d;
    }

    @Override // java.util.List
    public E get(int i10) {
        com.google.common.base.p.j(i10, this.f11667d);
        E e10 = (E) this.f11666c[i10];
        Objects.requireNonNull(e10);
        return e10;
    }

    @Override // com.google.common.collect.s
    int h() {
        return 0;
    }

    @Override // com.google.common.collect.s
    boolean o() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f11667d;
    }

    @Override // com.google.common.collect.u, com.google.common.collect.s
    Object writeReplace() {
        return super.writeReplace();
    }
}
