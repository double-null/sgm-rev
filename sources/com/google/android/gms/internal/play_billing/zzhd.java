package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzhd {
    private static final zzhk zza = new zzhb();
    private final zzhk zzb;

    public zzhd() {
        zzhk zzhkVar = zza;
        int i10 = zzet.zza;
        this.zzb = new zzhc(zzgb.zza(), zzhkVar);
    }

    public final zzhw zza(Class cls) {
        int i10 = zzhx.zza;
        if (!zzgg.class.isAssignableFrom(cls)) {
            int i11 = zzet.zza;
        }
        zzhj zzhjVarZzb = this.zzb.zzb(cls);
        if (zzhjVarZzb.zzb()) {
            int i12 = zzet.zza;
            return zzhq.zzc(zzhx.zzm(), zzfw.zza(), zzhjVarZzb.zza());
        }
        int i13 = zzet.zza;
        return zzhp.zzl(cls, zzhjVarZzb, zzhs.zza(), zzgw.zza(), zzhx.zzm(), zzhjVarZzb.zzc() + (-1) != 1 ? zzfw.zza() : null, zzhi.zza());
    }
}
