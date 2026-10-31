package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzgb implements zzhk {
    private static final zzgb zza = new zzgb();

    private zzgb() {
    }

    public static zzgb zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.play_billing.zzhk
    public final zzhj zzb(Class cls) {
        if (!zzgg.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (zzhj) zzgg.zzr(cls.asSubclass(zzgg.class)).zzd(3, null, null);
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhk
    public final boolean zzc(Class cls) {
        return zzgg.class.isAssignableFrom(cls);
    }
}
