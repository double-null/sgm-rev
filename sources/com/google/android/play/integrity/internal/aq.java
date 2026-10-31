package com.google.android.play.integrity.internal;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.4.0 */
/* JADX INFO: loaded from: classes.dex */
final class aq extends ar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final transient int f11383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final transient int f11384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ ar f11385c;

    aq(ar arVar, int i10, int i11) {
        this.f11385c = arVar;
        this.f11383a = i10;
        this.f11384b = i11;
    }

    @Override // com.google.android.play.integrity.internal.ao
    final int b() {
        return this.f11385c.c() + this.f11383a + this.f11384b;
    }

    @Override // com.google.android.play.integrity.internal.ao
    final int c() {
        return this.f11385c.c() + this.f11383a;
    }

    @Override // com.google.android.play.integrity.internal.ao
    final Object[] e() {
        return this.f11385c.e();
    }

    @Override // com.google.android.play.integrity.internal.ar
    /* JADX INFO: renamed from: f */
    public final ar subList(int i10, int i11) {
        al.c(i10, i11, this.f11384b);
        int i12 = this.f11383a;
        return this.f11385c.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.List
    public final Object get(int i10) {
        al.a(i10, this.f11384b, "index");
        return this.f11385c.get(i10 + this.f11383a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11384b;
    }

    @Override // com.google.android.play.integrity.internal.ar, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
