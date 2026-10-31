package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzli extends zzgg implements zzhn {
    private static final zzli zzb;
    private int zzd;
    private int zze;
    private boolean zzf;
    private long zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;

    static {
        zzli zzliVar = new zzli();
        zzb = zzliVar;
        zzgg.zzB(zzli.class, zzliVar);
    }

    private zzli() {
    }

    public static zzlg zza() {
        return (zzlg) zzb.zzp();
    }

    static /* synthetic */ void zzc(zzli zzliVar, boolean z10) {
        zzliVar.zzd |= 8;
        zzliVar.zzh = z10;
    }

    static /* synthetic */ void zze(zzli zzliVar, int i10) {
        zzliVar.zzd |= 16;
        zzliVar.zzi = i10;
    }

    static /* synthetic */ void zzf(zzli zzliVar, long j10) {
        zzliVar.zzd |= 4;
        zzliVar.zzg = j10;
    }

    static /* synthetic */ void zzg(zzli zzliVar, int i10) {
        zzliVar.zzd |= 32;
        zzliVar.zzj = i10;
    }

    static /* synthetic */ void zzh(zzli zzliVar, boolean z10) {
        zzliVar.zzd |= 2;
        zzliVar.zzf = true;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgg
    protected final Object zzd(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgg.zzy(zzb, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003ဂ\u0002\u0004ဇ\u0003\u0005င\u0004\u0006င\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i11 == 3) {
            return new zzli();
        }
        zzlh zzlhVar = null;
        if (i11 == 4) {
            return new zzlg(zzlhVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
