package com.google.android.gms.internal.play_billing;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzck extends zzca {
    final /* synthetic */ zzcl zza;

    zzck(zzcl zzclVar) {
        Objects.requireNonNull(zzclVar);
        this.zza = zzclVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        zzcl zzclVar = this.zza;
        zzbl.zza(i10, zzclVar.zzc, "index");
        int i11 = i10 + i10;
        Object obj = zzclVar.zzb[i11];
        Objects.requireNonNull(obj);
        Object obj2 = zzclVar.zzb[i11 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zzc;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbx
    public final boolean zzf() {
        return true;
    }
}
