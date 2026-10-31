package com.google.common.collect;

/* JADX INFO: compiled from: RegularImmutableSet.java */
/* JADX INFO: loaded from: classes4.dex */
final class r0<E> extends w<E> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Object[] f11682h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final r0<Object> f11683i;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final transient Object[] f11684c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient int f11685d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final transient Object[] f11686e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final transient int f11687f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final transient int f11688g;

    static {
        Object[] objArr = new Object[0];
        f11682h = objArr;
        f11683i = new r0<>(objArr, 0, objArr, 0, 0);
    }

    r0(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        this.f11684c = objArr;
        this.f11685d = i10;
        this.f11686e = objArr2;
        this.f11687f = i11;
        this.f11688g = i12;
    }

    @Override // com.google.common.collect.w
    u<E> B() {
        return u.t(this.f11684c, this.f11688g);
    }

    @Override // com.google.common.collect.w
    boolean C() {
        return true;
    }

    @Override // com.google.common.collect.s, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        Object[] objArr = this.f11686e;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int iC = r.c(obj);
        while (true) {
            int i10 = iC & this.f11687f;
            Object obj2 = objArr[i10];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iC = i10 + 1;
        }
    }

    @Override // com.google.common.collect.s
    int e(Object[] objArr, int i10) {
        System.arraycopy(this.f11684c, 0, objArr, i10, this.f11688g);
        return i10 + this.f11688g;
    }

    @Override // com.google.common.collect.s
    Object[] f() {
        return this.f11684c;
    }

    @Override // com.google.common.collect.s
    int g() {
        return this.f11688g;
    }

    @Override // com.google.common.collect.s
    int h() {
        return 0;
    }

    @Override // com.google.common.collect.w, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.f11685d;
    }

    @Override // com.google.common.collect.s
    boolean o() {
        return false;
    }

    @Override // com.google.common.collect.w, com.google.common.collect.s, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: p */
    public c1<E> iterator() {
        return c().iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f11688g;
    }

    @Override // com.google.common.collect.w, com.google.common.collect.s
    Object writeReplace() {
        return super.writeReplace();
    }
}
