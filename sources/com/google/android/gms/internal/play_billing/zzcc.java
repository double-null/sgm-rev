package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzcc {
    Object[] zza = new Object[8];
    int zzb = 0;
    zzcb zzc;

    public final zzcc zza(Object obj, Object obj2) {
        int i10 = this.zzb + 1;
        Object[] objArr = this.zza;
        int length = objArr.length;
        int i11 = i10 + i10;
        if (i11 > length) {
            this.zza = Arrays.copyOf(objArr, zzbw.zza(length, i11));
        }
        zzbt.zza(obj, obj2);
        Object[] objArr2 = this.zza;
        int i12 = this.zzb;
        int i13 = i12 + i12;
        objArr2[i13] = obj;
        objArr2[i13 + 1] = obj2;
        this.zzb = i12 + 1;
        return this;
    }

    public final zzcd zzb() {
        zzcb zzcbVar = this.zzc;
        if (zzcbVar != null) {
            throw zzcbVar.zza();
        }
        zzco zzcoVarZzg = zzco.zzg(this.zzb, this.zza, this);
        zzcb zzcbVar2 = this.zzc;
        if (zzcbVar2 == null) {
            return zzcoVarZzg;
        }
        throw zzcbVar2.zza();
    }
}
