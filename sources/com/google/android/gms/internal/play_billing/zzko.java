package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzko extends zzgg implements zzhn {
    private static final zzko zzb;
    private int zzd;
    private zzgl zze = zzgg.zzv();
    private String zzf = "";
    private boolean zzg;

    static {
        zzko zzkoVar = new zzko();
        zzb = zzkoVar;
        zzgg.zzB(zzko.class, zzkoVar);
    }

    private zzko() {
    }

    public static zzko zzb() {
        return zzb;
    }

    static /* synthetic */ void zzc(zzko zzkoVar, boolean z10) {
        zzkoVar.zzd |= 2;
        zzkoVar.zzg = z10;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgg
    protected final Object zzd(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgg.zzy(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဇ\u0001", new Object[]{"zzd", "zze", zzkm.class, "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new zzko();
        }
        zzkn zzknVar = null;
        if (i11 == 4) {
            return new zzkj(zzknVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
