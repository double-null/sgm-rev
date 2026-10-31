package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhl extends zzadu implements zzafd {
    private static final zzhl zzg;
    private static volatile zzafj zzh;
    private int zzb;
    private int zze;
    private int zzf;

    static {
        zzhl zzhlVar = new zzhl();
        zzg = zzhlVar;
        zzadu.zzcs(zzhl.class, zzhlVar);
    }

    private zzhl() {
    }

    public static zzhk zza() {
        return (zzhk) zzg.zzcn();
    }

    public final int zzc() {
        int iZza = zzhj.zza(this.zze);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }

    public final int zzd() {
        int iZza = zzhn.zza(this.zzf);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }

    final /* synthetic */ void zze(int i10) {
        this.zze = i10 - 1;
        this.zzb |= 1;
    }

    final /* synthetic */ void zzf(int i10) {
        this.zzf = i10 - 1;
        this.zzb |= 2;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    protected final Object zzg(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzadu.zzct(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zze", zzhi.zza, "zzf", zzhm.zza});
        }
        if (i11 == 3) {
            return new zzhl();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzhk(bArr);
        }
        if (i11 == 5) {
            return zzg;
        }
        if (i11 != 6) {
            throw null;
        }
        zzafj zzadqVar = zzh;
        if (zzadqVar == null) {
            synchronized (zzhl.class) {
                zzadqVar = zzh;
                if (zzadqVar == null) {
                    zzadqVar = new zzadq(zzg);
                    zzh = zzadqVar;
                }
            }
        }
        return zzadqVar;
    }
}
