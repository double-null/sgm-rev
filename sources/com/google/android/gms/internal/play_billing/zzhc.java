package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzhc implements zzhk {
    private final zzhk[] zza;

    zzhc(zzhk... zzhkVarArr) {
        this.zza = zzhkVarArr;
    }

    @Override // com.google.android.gms.internal.play_billing.zzhk
    public final zzhj zzb(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            zzhk zzhkVar = this.zza[i10];
            if (zzhkVar.zzc(cls)) {
                return zzhkVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.play_billing.zzhk
    public final boolean zzc(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            if (this.zza[i10].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
