package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzjc {
    public final String zza;
    public final zzv zzb;
    public final zzv zzc;
    public final int zzd;
    public final int zze;

    public zzjc(String str, zzv zzvVar, zzv zzvVar2, int i10, int i11) {
        boolean z10;
        if (i10 != 0) {
            z10 = false;
            if (i11 == 0) {
                i11 = 0;
                z10 = true;
            }
        } else {
            z10 = true;
        }
        zzgtj.zza(z10);
        zzgtj.zza(true ^ TextUtils.isEmpty(str));
        this.zza = str;
        this.zzb = zzvVar;
        zzvVar2.getClass();
        this.zzc = zzvVar2;
        this.zzd = i10;
        this.zze = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzjc.class == obj.getClass()) {
            zzjc zzjcVar = (zzjc) obj;
            if (this.zzd == zzjcVar.zzd && this.zze == zzjcVar.zze && this.zza.equals(zzjcVar.zza) && this.zzb.equals(zzjcVar.zzb) && this.zzc.equals(zzjcVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.zzd + 527) * 31) + this.zze) * 31) + this.zza.hashCode()) * 31) + this.zzb.hashCode()) * 31) + this.zzc.hashCode();
    }
}
