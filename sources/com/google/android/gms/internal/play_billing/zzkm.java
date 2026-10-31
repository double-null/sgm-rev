package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzkm extends zzgg implements zzhn {
    private static final zzkm zzb;
    private int zzd;
    private int zze;
    private String zzf = "";

    static {
        zzkm zzkmVar = new zzkm();
        zzb = zzkmVar;
        zzgg.zzB(zzkm.class, zzkmVar);
    }

    private zzkm() {
    }

    @Override // com.google.android.gms.internal.play_billing.zzgg
    protected final Object zzd(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgg.zzy(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", zzkl.zza, "zzf"});
        }
        if (i11 == 3) {
            return new zzkm();
        }
        zzkn zzknVar = null;
        if (i11 == 4) {
            return new zzkk(zzknVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
