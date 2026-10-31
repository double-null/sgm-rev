package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzjp extends zzgg implements zzhn {
    private static final zzjp zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private int zzi;
    private int zzj;
    private String zzf = "";
    private String zzh = "";

    static {
        zzjp zzjpVar = new zzjp();
        zzb = zzjpVar;
        zzgg.zzB(zzjp.class, zzjpVar);
    }

    private zzjp() {
    }

    static /* synthetic */ void zzG(zzjp zzjpVar, int i10) {
        zzjpVar.zzd |= 1;
        zzjpVar.zze = i10;
    }

    public static zzjl zza() {
        return (zzjl) zzb.zzp();
    }

    static /* synthetic */ void zzc(zzjp zzjpVar, String str) {
        zzjpVar.zzd |= 8;
        zzjpVar.zzh = str;
    }

    static /* synthetic */ void zze(zzjp zzjpVar, String str) {
        str.getClass();
        zzjpVar.zzd |= 2;
        zzjpVar.zzf = str;
    }

    static /* synthetic */ void zzf(zzjp zzjpVar, int i10) {
        zzjpVar.zzd |= 32;
        zzjpVar.zzj = i10;
    }

    static /* synthetic */ void zzg(zzjp zzjpVar, int i10) {
        zzjpVar.zzd |= 16;
        zzjpVar.zzi = i10;
    }

    static /* synthetic */ void zzh(zzjp zzjpVar, zzjn zzjnVar) {
        zzjpVar.zzg = zzjnVar.zza();
        zzjpVar.zzd |= 4;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgg
    protected final Object zzd(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgg.zzy(zzb, "\u0004\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0004᠌\u0002\u0005ဈ\u0003\u0007င\u0004\bင\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", zzjm.zza, "zzh", "zzi", "zzj"});
        }
        if (i11 == 3) {
            return new zzjp();
        }
        zzjo zzjoVar = null;
        if (i11 == 4) {
            return new zzjl(zzjoVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
