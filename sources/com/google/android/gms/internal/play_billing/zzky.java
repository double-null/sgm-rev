package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzky extends zzgg implements zzhn {
    private static final zzky zzb;
    private int zzd;
    private int zze;

    static {
        zzky zzkyVar = new zzky();
        zzb = zzkyVar;
        zzgg.zzB(zzky.class, zzkyVar);
    }

    private zzky() {
    }

    public static zzkv zza() {
        return (zzkv) zzb.zzp();
    }

    static /* synthetic */ void zzc(zzky zzkyVar, int i10) {
        zzkyVar.zze = i10 - 1;
        zzkyVar.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgg
    protected final Object zzd(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgg.zzy(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", zzkw.zza});
        }
        if (i11 == 3) {
            return new zzky();
        }
        zzkx zzkxVar = null;
        if (i11 == 4) {
            return new zzkv(zzkxVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
