package com.google.android.gms.internal.play_billing;

import com.android.billingclient.BuildConfig;

/* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzej extends zzgg implements zzhn {
    private static final zzej zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";

    static {
        zzej zzejVar = new zzej();
        zzb = zzejVar;
        zzgg.zzB(zzej.class, zzejVar);
    }

    private zzej() {
    }

    public static zzei zza() {
        return (zzei) zzb.zzp();
    }

    static /* synthetic */ void zzc(zzej zzejVar, String str) {
        zzejVar.zzd |= 4;
        zzejVar.zzg = str;
    }

    static /* synthetic */ void zze(zzej zzejVar, String str) {
        str.getClass();
        zzejVar.zzd |= 16;
        zzejVar.zzi = str;
    }

    static /* synthetic */ void zzf(zzej zzejVar, String str) {
        str.getClass();
        zzejVar.zzd |= 32;
        zzejVar.zzj = str;
    }

    static /* synthetic */ void zzg(zzej zzejVar, String str) {
        zzejVar.zzd |= 8;
        zzejVar.zzh = BuildConfig.VERSION_NAME;
    }

    static /* synthetic */ void zzh(zzej zzejVar, int i10) {
        zzejVar.zzd |= 1;
        zzejVar.zze = 24;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgg
    protected final Object zzd(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgg.zzy(zzb, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i11 == 3) {
            return new zzej();
        }
        zzek zzekVar = null;
        if (i11 == 4) {
            return new zzei(zzekVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
