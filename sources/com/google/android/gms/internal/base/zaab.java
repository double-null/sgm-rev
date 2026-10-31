package com.google.android.gms.internal.base;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.10.1 */
/* JADX INFO: loaded from: classes3.dex */
final class zaab extends zaaa {
    static final zaaa zaa = new zaab(new Object[0], 0);
    final transient Object[] zab;

    zaab(Object[] objArr, int i10) {
        this.zab = objArr;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        zau.zaa(i10, 0, "index");
        Object obj = this.zab[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return 0;
    }

    @Override // com.google.android.gms.internal.base.zax
    final Object[] zab() {
        return this.zab;
    }

    @Override // com.google.android.gms.internal.base.zax
    final int zac() {
        return 0;
    }

    @Override // com.google.android.gms.internal.base.zax
    final int zad() {
        return 0;
    }

    @Override // com.google.android.gms.internal.base.zaaa, com.google.android.gms.internal.base.zax
    final int zae(Object[] objArr, int i10) {
        System.arraycopy(this.zab, 0, objArr, 0, 0);
        return 0;
    }
}
