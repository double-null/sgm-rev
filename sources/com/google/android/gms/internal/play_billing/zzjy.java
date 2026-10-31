package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzjy extends zzgg implements zzhn {
    private static final zzjy zzb;
    private int zzd;
    private int zzf;
    private zzjp zzi;
    private boolean zzj;
    private boolean zzk;
    private zzky zzl;
    private String zze = "";
    private zzgk zzg = zzgg.zzu();
    private zzgl zzh = zzgg.zzv();

    static {
        zzjy zzjyVar = new zzjy();
        zzb = zzjyVar;
        zzgg.zzB(zzjy.class, zzjyVar);
    }

    private zzjy() {
    }

    public static zzjv zza() {
        return (zzjv) zzb.zzp();
    }

    static /* synthetic */ void zzc(zzjy zzjyVar, zzju zzjuVar) {
        zzjuVar.getClass();
        zzgk zzgkVar = zzjyVar.zzg;
        if (!zzgkVar.zzc()) {
            int size = zzgkVar.size();
            zzjyVar.zzg = zzgkVar.zzd(size + size);
        }
        zzjyVar.zzg.zzh(zzjuVar.zza());
    }

    static /* synthetic */ void zze(zzjy zzjyVar, zzjp zzjpVar) {
        zzjpVar.getClass();
        zzjyVar.zzi = zzjpVar;
        zzjyVar.zzd |= 4;
    }

    static /* synthetic */ void zzf(zzjy zzjyVar, String str) {
        zzjyVar.zzd |= 1;
        zzjyVar.zze = "ProxyBillingBroadcastReceiver";
    }

    static /* synthetic */ void zzg(zzjy zzjyVar, zzky zzkyVar) {
        zzkyVar.getClass();
        zzjyVar.zzl = zzkyVar;
        zzjyVar.zzd |= 32;
    }

    static /* synthetic */ void zzh(zzjy zzjyVar, int i10) {
        zzjyVar.zzf = i10 - 1;
        zzjyVar.zzd |= 2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgg
    protected final Object zzd(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgg.zzy(zzb, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ࠬ\u0004\u001b\u0005ဉ\u0002\u0006ဇ\u0003\u0007ဇ\u0004\bဉ\u0005", new Object[]{"zzd", "zze", "zzf", zzjw.zza, "zzg", zzjt.zza, "zzh", zzku.class, "zzi", "zzj", "zzk", "zzl"});
        }
        if (i11 == 3) {
            return new zzjy();
        }
        zzjx zzjxVar = null;
        if (i11 == 4) {
            return new zzjv(zzjxVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
