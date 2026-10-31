package com.google.android.gms.internal.play_billing;

import java.io.IOException;

/* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhf {
    private final zzhe zza;

    private zzhf(zzjb zzjbVar, Object obj, zzjb zzjbVar2, Object obj2) {
        this.zza = new zzhe(zzjbVar, "", zzjbVar2, obj2);
    }

    static int zzb(zzhe zzheVar, Object obj, Object obj2) {
        return zzfy.zza(zzheVar.zza, 1, obj) + zzfy.zza(zzheVar.zzc, 2, obj2);
    }

    public static zzhf zzd(zzjb zzjbVar, Object obj, zzjb zzjbVar2, Object obj2) {
        return new zzhf(zzjbVar, "", zzjbVar2, obj2);
    }

    static void zze(zzfo zzfoVar, zzhe zzheVar, Object obj, Object obj2) throws IOException {
        zzfy.zzi(zzfoVar, zzheVar.zza, 1, obj);
        zzfy.zzi(zzfoVar, zzheVar.zzc, 2, obj2);
    }

    public final int zza(int i10, Object obj, Object obj2) {
        zzhe zzheVar = this.zza;
        int iZzy = zzfo.zzy(i10 << 3);
        int iZzb = zzb(zzheVar, obj, obj2);
        return iZzy + zzfo.zzy(iZzb) + iZzb;
    }

    final zzhe zzc() {
        return this.zza;
    }
}
