package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzgvr extends zzgvd {
    final /* synthetic */ zzgvt zza;
    private final Object zzb;
    private int zzc;

    zzgvr(zzgvt zzgvtVar, int i10) {
        Objects.requireNonNull(zzgvtVar);
        this.zza = zzgvtVar;
        this.zzb = zzgvtVar.zzo(i10);
        this.zzc = i10;
    }

    private final void zza() {
        int i10 = this.zzc;
        if (i10 != -1) {
            zzgvt zzgvtVar = this.zza;
            if (i10 < zzgvtVar.size() && Objects.equals(this.zzb, zzgvtVar.zzo(this.zzc))) {
                return;
            }
        }
        this.zzc = this.zza.zzi(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzgvd, java.util.Map.Entry
    public final Object getKey() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgvd, java.util.Map.Entry
    public final Object getValue() {
        zzgvt zzgvtVar = this.zza;
        Map mapZzc = zzgvtVar.zzc();
        if (mapZzc != null) {
            return mapZzc.get(this.zzb);
        }
        zza();
        int i10 = this.zzc;
        if (i10 == -1) {
            return null;
        }
        return zzgvtVar.zzp(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzgvd, java.util.Map.Entry
    public final Object setValue(Object obj) {
        zzgvt zzgvtVar = this.zza;
        Map mapZzc = zzgvtVar.zzc();
        if (mapZzc != null) {
            return mapZzc.put(this.zzb, obj);
        }
        zza();
        int i10 = this.zzc;
        if (i10 == -1) {
            zzgvtVar.put(this.zzb, obj);
            return null;
        }
        Object objZzp = zzgvtVar.zzp(i10);
        zzgvtVar.zzq(this.zzc, obj);
        return objZzp;
    }
}
