package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzjg extends zzgg implements zzhn {
    private static final zzjg zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private zzjp zzh;
    private int zzi;

    static {
        zzjg zzjgVar = new zzjg();
        zzb = zzjgVar;
        zzgg.zzB(zzjg.class, zzjgVar);
    }

    private zzjg() {
    }

    static /* synthetic */ void zzG(zzjg zzjgVar, zzko zzkoVar) {
        zzkoVar.getClass();
        zzjgVar.zzf = zzkoVar;
        zzjgVar.zze = 7;
    }

    static /* synthetic */ void zzH(zzjg zzjgVar, zzli zzliVar) {
        zzliVar.getClass();
        zzjgVar.zzf = zzliVar;
        zzjgVar.zze = 6;
    }

    static /* synthetic */ void zzI(zzjg zzjgVar, int i10) {
        zzjgVar.zzg = i10 - 1;
        zzjgVar.zzd |= 1;
    }

    public static zzje zza() {
        return (zzje) zzb.zzp();
    }

    public static zzjg zzc(byte[] bArr) throws zzgs {
        return (zzjg) zzgg.zzt(zzb, bArr);
    }

    static /* synthetic */ void zzf(zzjg zzjgVar, zzju zzjuVar) {
        zzjgVar.zzi = zzjuVar.zza();
        zzjgVar.zzd |= 4;
    }

    static /* synthetic */ void zzg(zzjg zzjgVar, zzjp zzjpVar) {
        zzjpVar.getClass();
        zzjgVar.zzh = zzjpVar;
        zzjgVar.zzd |= 2;
    }

    static /* synthetic */ void zzh(zzjg zzjgVar, zzki zzkiVar) {
        zzkiVar.getClass();
        zzjgVar.zzf = zzkiVar;
        zzjgVar.zze = 4;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgg
    protected final Object zzd(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgg.zzy(zzb, "\u0004\u0006\u0001\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0004<\u0000\u0005᠌\u0002\u0006<\u0000\u0007<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", zzjh.zza, "zzh", zzki.class, "zzi", zzjt.zza, zzli.class, zzko.class});
        }
        if (i11 == 3) {
            return new zzjg();
        }
        zzjf zzjfVar = null;
        if (i11 == 4) {
            return new zzje(zzjfVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }

    public final zzko zze() {
        return this.zze == 7 ? (zzko) this.zzf : zzko.zzb();
    }
}
