package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public class zzbka {
    private final String zza;
    private final Object zzb;
    private final int zzc;

    protected zzbka(String str, Object obj, int i10) {
        this.zza = str;
        this.zzb = obj;
        this.zzc = i10;
    }

    public static zzbka zza(String str, boolean z10) {
        return new zzbka(str, Boolean.valueOf(z10), 1);
    }

    public static zzbka zzb(String str, long j10) {
        return new zzbka(str, Long.valueOf(j10), 2);
    }

    public static zzbka zzc(String str, double d10) {
        return new zzbka(str, Double.valueOf(d10), 3);
    }

    public static zzbka zzd(String str, String str2) {
        return new zzbka("gad:dynamite_module:experiment_id", "", 4);
    }

    public final Object zze() {
        zzblg zzblgVarZza = zzbli.zza();
        if (zzblgVarZza == null) {
            if (zzbli.zzb() != null) {
                zzbli.zzb().zza();
            }
            return this.zzb;
        }
        int i10 = this.zzc - 1;
        if (i10 == 0) {
            return zzblgVarZza.zza(this.zza, ((Boolean) this.zzb).booleanValue());
        }
        if (i10 != 1) {
            return i10 != 2 ? zzblgVarZza.zzd(this.zza, (String) this.zzb) : zzblgVarZza.zzc(this.zza, ((Double) this.zzb).doubleValue());
        }
        return zzblgVarZza.zzb(this.zza, ((Long) this.zzb).longValue());
    }
}
