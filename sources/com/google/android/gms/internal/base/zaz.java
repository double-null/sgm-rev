package com.google.android.gms.internal.base;

import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.10.1 */
/* JADX INFO: loaded from: classes3.dex */
final class zaz extends zaaa {
    final transient int zaa;
    final transient int zab;
    final /* synthetic */ zaaa zac;

    zaz(zaaa zaaaVar, int i10, int i11) {
        Objects.requireNonNull(zaaaVar);
        this.zac = zaaaVar;
        this.zaa = i10;
        this.zab = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        zau.zaa(i10, this.zab, "index");
        return this.zac.get(i10 + this.zaa);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zab;
    }

    @Override // com.google.android.gms.internal.base.zaaa, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }

    @Override // com.google.android.gms.internal.base.zax
    final Object[] zab() {
        return this.zac.zab();
    }

    @Override // com.google.android.gms.internal.base.zax
    final int zac() {
        return this.zac.zac() + this.zaa;
    }

    @Override // com.google.android.gms.internal.base.zax
    final int zad() {
        return this.zac.zac() + this.zaa + this.zab;
    }

    @Override // com.google.android.gms.internal.base.zaaa
    /* JADX INFO: renamed from: zaf */
    public final zaaa subList(int i10, int i11) {
        zau.zac(i10, i11, this.zab);
        int i12 = this.zaa;
        return this.zac.subList(i10 + i12, i11 + i12);
    }
}
