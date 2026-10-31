package com.google.android.gms.internal.common;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.11.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzao extends zzam {
    static final zzam zza = new zzao(new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    zzao(Object[] objArr, int i10) {
        this.zzb = objArr;
        this.zzc = i10;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        zzs.zzb(i10, this.zzc, "index");
        Object obj = this.zzb[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.common.zzah
    final Object[] zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.common.zzah
    final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.common.zzah
    final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.common.zzah
    final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.common.zzam, com.google.android.gms.internal.common.zzah
    final int zzg(Object[] objArr, int i10) {
        Object[] objArr2 = this.zzb;
        int i11 = this.zzc;
        System.arraycopy(objArr2, 0, objArr, 0, i11);
        return i11;
    }
}
