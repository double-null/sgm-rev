package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzlb extends zzgg implements zzhn {
    private static final zzlb zzb;
    private int zzd;
    private zzjp zze;
    private long zzf;

    static {
        zzlb zzlbVar = new zzlb();
        zzb = zzlbVar;
        zzgg.zzB(zzlb.class, zzlbVar);
    }

    private zzlb() {
    }

    public static zzkz zza() {
        return (zzkz) zzb.zzp();
    }

    static /* synthetic */ void zzc(zzlb zzlbVar, zzjp zzjpVar) {
        zzjpVar.getClass();
        zzlbVar.zze = zzjpVar;
        zzlbVar.zzd |= 1;
    }

    static /* synthetic */ void zze(zzlb zzlbVar, long j10) {
        zzlbVar.zzd |= 2;
        zzlbVar.zzf = j10;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgg
    protected final Object zzd(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgg.zzy(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new zzlb();
        }
        zzla zzlaVar = null;
        if (i11 == 4) {
            return new zzkz(zzlaVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
