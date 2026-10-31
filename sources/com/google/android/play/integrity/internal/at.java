package com.google.android.play.integrity.internal;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.4.0 */
/* JADX INFO: loaded from: classes.dex */
final class at extends ar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final ar f11389a = new at(new Object[0], 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final transient Object[] f11390b;

    at(Object[] objArr, int i10) {
        this.f11390b = objArr;
    }

    @Override // com.google.android.play.integrity.internal.ar, com.google.android.play.integrity.internal.ao
    final int a(Object[] objArr, int i10) {
        System.arraycopy(this.f11390b, 0, objArr, 0, 0);
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

    @Override // com.google.android.play.integrity.internal.ao
    final Object[] e() {
        return this.f11390b;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        al.a(i10, 0, "index");
        Object obj = this.f11390b[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return 0;
    }
}
