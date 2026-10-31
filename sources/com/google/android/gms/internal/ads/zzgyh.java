package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzgyh extends zzgwm {
    static final zzgwm zza = new zzgyh(new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    zzgyh(Object[] objArr, int i10) {
        this.zzb = objArr;
        this.zzc = i10;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        zzgtj.zzm(i10, this.zzc, "index");
        Object obj = this.zzb[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgwi
    final Object[] zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgwi
    final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgwi
    final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgwi
    final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgwm, com.google.android.gms.internal.ads.zzgwi
    final int zzg(Object[] objArr, int i10) {
        Object[] objArr2 = this.zzb;
        int i11 = this.zzc;
        System.arraycopy(objArr2, 0, objArr, i10, i11);
        return i10 + i11;
    }
}
