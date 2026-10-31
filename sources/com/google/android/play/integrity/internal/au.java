package com.google.android.play.integrity.internal;

import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.4.0 */
/* JADX INFO: loaded from: classes.dex */
final class au extends as {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final au f11391a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Object[] f11392d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final transient Object[] f11393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final transient Object[] f11394c;

    static {
        Object[] objArr = new Object[0];
        f11392d = objArr;
        f11391a = new au(objArr, 0, objArr, 0, 0);
    }

    au(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        this.f11393b = objArr;
        this.f11394c = objArr2;
    }

    @Override // com.google.android.play.integrity.internal.ao
    final int a(Object[] objArr, int i10) {
        System.arraycopy(this.f11393b, 0, objArr, 0, 0);
        return 0;
    }

    @Override // com.google.android.play.integrity.internal.ao
    final int b() {
        return 0;
    }

    @Override // com.google.android.play.integrity.internal.ao
    final int c() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        int length = this.f11394c.length;
        return false;
    }

    @Override // com.google.android.play.integrity.internal.as, com.google.android.play.integrity.internal.ao
    /* JADX INFO: renamed from: d */
    public final av iterator() {
        return f().listIterator(0);
    }

    @Override // com.google.android.play.integrity.internal.ao
    final Object[] e() {
        return this.f11393b;
    }

    @Override // com.google.android.play.integrity.internal.as
    final ar g() {
        int i10 = ar.f11387d;
        return at.f11389a;
    }

    @Override // com.google.android.play.integrity.internal.as, java.util.Collection, java.util.Set
    public final int hashCode() {
        return 0;
    }

    @Override // com.google.android.play.integrity.internal.as
    final boolean i() {
        return true;
    }

    @Override // com.google.android.play.integrity.internal.as, com.google.android.play.integrity.internal.ao, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return f().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 0;
    }
}
