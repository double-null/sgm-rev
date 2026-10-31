package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzku extends zzgg implements zzhn {
    private static final zzku zzb;
    private int zzd;
    private int zzf;
    private zzgl zze = zzgg.zzv();
    private String zzg = "";

    static {
        zzku zzkuVar = new zzku();
        zzb = zzkuVar;
        zzgg.zzB(zzku.class, zzkuVar);
    }

    private zzku() {
    }

    @Override // com.google.android.gms.internal.play_billing.zzgg
    protected final Object zzd(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgg.zzy(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001a\u0002င\u0000\u0003ဈ\u0001", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new zzku();
        }
        zzkt zzktVar = null;
        if (i11 == 4) {
            return new zzks(zzktVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
