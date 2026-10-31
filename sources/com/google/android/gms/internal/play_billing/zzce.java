package com.google.android.gms.internal.play_billing;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzce extends zzbv {
    public zzce() {
        super(4);
    }

    public final zzce zzb(Object obj) {
        obj.getClass();
        int length = this.zza.length;
        int iZza = zzbw.zza(length, this.zzb + 1);
        if (iZza > length || this.zzc) {
            this.zza = Arrays.copyOf(this.zza, iZza);
            this.zzc = false;
        }
        Object[] objArr = this.zza;
        int i10 = this.zzb;
        this.zzb = i10 + 1;
        objArr[i10] = obj;
        return this;
    }

    public final zzcf zzc() {
        int i10 = this.zzb;
        if (i10 == 0) {
            return zzcp.zza;
        }
        if (i10 == 1) {
            Object obj = this.zza[0];
            Objects.requireNonNull(obj);
            return new zzcr(obj);
        }
        zzcf zzcfVarZzm = zzcf.zzm(i10, this.zza);
        this.zzb = zzcfVarZzm.size();
        this.zzc = true;
        return zzcfVarZzm;
    }
}
