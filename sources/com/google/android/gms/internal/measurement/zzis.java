package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzis extends zzadu implements zzafd {
    private static final zzis zzh;
    private static volatile zzafj zzi;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzis zzisVar = new zzis();
        zzh = zzisVar;
        zzadu.zzcs(zzis.class, zzisVar);
    }

    private zzis() {
    }

    public static zzil zzb() {
        return (zzil) zzh.zzcn();
    }

    public static zzis zzc() {
        return zzh;
    }

    public final zzin zza() {
        zzin zzinVarZzb = zzin.zzb(this.zzf);
        return zzinVarZzb == null ? zzin.CLIENT_UPLOAD_ELIGIBILITY_UNKNOWN : zzinVarZzb;
    }

    final /* synthetic */ void zzd(zzin zzinVar) {
        this.zzf = zzinVar.zza();
        this.zzb |= 2;
    }

    public final int zzf() {
        int iZza = zzir.zza(this.zze);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    protected final Object zzg(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzadu.zzct(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zze", zziq.zza, "zzf", zzim.zza, "zzg", zzio.zza});
        }
        if (i11 == 3) {
            return new zzis();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzil(bArr);
        }
        if (i11 == 5) {
            return zzh;
        }
        if (i11 != 6) {
            throw null;
        }
        zzafj zzadqVar = zzi;
        if (zzadqVar == null) {
            synchronized (zzis.class) {
                zzadqVar = zzi;
                if (zzadqVar == null) {
                    zzadqVar = new zzadq(zzh);
                    zzi = zzadqVar;
                }
            }
        }
        return zzadqVar;
    }

    public final int zzh() {
        int iZza = zzip.zza(this.zzg);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }

    final /* synthetic */ void zzi(int i10) {
        this.zze = i10 - 1;
        this.zzb |= 1;
    }

    final /* synthetic */ void zzj(int i10) {
        this.zzg = i10 - 1;
        this.zzb |= 4;
    }
}
