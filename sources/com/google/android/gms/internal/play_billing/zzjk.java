package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzjk extends zzgg implements zzhn {
    private static final zzjk zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private int zzh;

    static {
        zzjk zzjkVar = new zzjk();
        zzb = zzjkVar;
        zzgg.zzB(zzjk.class, zzjkVar);
    }

    private zzjk() {
    }

    static /* synthetic */ void zzG(zzjk zzjkVar, int i10) {
        zzjkVar.zzg = i10 - 1;
        zzjkVar.zzd |= 1;
    }

    public static zzji zza() {
        return (zzji) zzb.zzp();
    }

    static /* synthetic */ void zze(zzjk zzjkVar, zzju zzjuVar) {
        zzjkVar.zzh = zzjuVar.zza();
        zzjkVar.zzd |= 2;
    }

    static /* synthetic */ void zzf(zzjk zzjkVar, zzki zzkiVar) {
        zzkiVar.getClass();
        zzjkVar.zzf = zzkiVar;
        zzjkVar.zze = 2;
    }

    static /* synthetic */ void zzg(zzjk zzjkVar, zzko zzkoVar) {
        zzkoVar.getClass();
        zzjkVar.zzf = zzkoVar;
        zzjkVar.zze = 4;
    }

    static /* synthetic */ void zzh(zzjk zzjkVar, zzli zzliVar) {
        zzliVar.getClass();
        zzjkVar.zzf = zzliVar;
        zzjkVar.zze = 3;
    }

    public final zzko zzc() {
        return this.zze == 4 ? (zzko) this.zzf : zzko.zzb();
    }

    @Override // com.google.android.gms.internal.play_billing.zzgg
    protected final Object zzd(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgg.zzy(zzb, "\u0004\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005᠌\u0001", new Object[]{"zzf", "zze", "zzd", "zzg", zzjh.zza, zzki.class, zzli.class, zzko.class, "zzh", zzjt.zza});
        }
        if (i11 == 3) {
            return new zzjk();
        }
        zzjj zzjjVar = null;
        if (i11 == 4) {
            return new zzji(zzjjVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
