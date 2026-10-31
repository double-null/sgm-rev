package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzem extends zzgg implements zzhn {
    private static final zzem zzb;
    private int zzd;
    private String zze = "";

    static {
        zzem zzemVar = new zzem();
        zzb = zzemVar;
        zzgg.zzB(zzem.class, zzemVar);
    }

    private zzem() {
    }

    public static zzel zza() {
        return (zzel) zzb.zzp();
    }

    static /* synthetic */ void zzc(zzem zzemVar, String str) {
        zzemVar.zzd |= 1;
        zzemVar.zze = str;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgg
    protected final Object zzd(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgg.zzy(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new zzem();
        }
        zzen zzenVar = null;
        if (i11 == 4) {
            return new zzel(zzenVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
