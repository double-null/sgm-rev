package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzkr extends zzgg implements zzhn {
    private static final zzkr zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private zzkb zzg;
    private zzke zzh;

    static {
        zzkr zzkrVar = new zzkr();
        zzb = zzkrVar;
        zzgg.zzB(zzkr.class, zzkrVar);
    }

    private zzkr() {
    }

    static /* synthetic */ void zzG(zzkr zzkrVar, zzlb zzlbVar) {
        zzlbVar.getClass();
        zzkrVar.zzf = zzlbVar;
        zzkrVar.zze = 8;
    }

    static /* synthetic */ void zzH(zzkr zzkrVar, zzlf zzlfVar) {
        zzkrVar.zzf = zzlfVar;
        zzkrVar.zze = 4;
    }

    public static zzkp zza() {
        return (zzkp) zzb.zzp();
    }

    static /* synthetic */ void zzc(zzkr zzkrVar, zzjg zzjgVar) {
        zzkrVar.zzf = zzjgVar;
        zzkrVar.zze = 2;
    }

    static /* synthetic */ void zze(zzkr zzkrVar, zzjk zzjkVar) {
        zzkrVar.zzf = zzjkVar;
        zzkrVar.zze = 3;
    }

    static /* synthetic */ void zzf(zzkr zzkrVar, zzjs zzjsVar) {
        zzjsVar.getClass();
        zzkrVar.zzf = zzjsVar;
        zzkrVar.zze = 7;
    }

    static /* synthetic */ void zzg(zzkr zzkrVar, zzjy zzjyVar) {
        zzjyVar.getClass();
        zzkrVar.zzf = zzjyVar;
        zzkrVar.zze = 5;
    }

    static /* synthetic */ void zzh(zzkr zzkrVar, zzkb zzkbVar) {
        zzkbVar.getClass();
        zzkrVar.zzg = zzkbVar;
        zzkrVar.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgg
    protected final Object zzd(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgg.zzy(zzb, "\u0004\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006ဉ\u0001\u0007<\u0000\b<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", zzjg.class, zzjk.class, zzlf.class, zzjy.class, "zzh", zzjs.class, zzlb.class});
        }
        if (i11 == 3) {
            return new zzkr();
        }
        zzkq zzkqVar = null;
        if (i11 == 4) {
            return new zzkp(zzkqVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
