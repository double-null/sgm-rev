package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzqx extends zzadu implements zzafd {
    private static final zzqx zzh;
    private static volatile zzafj zzi;
    private int zzb;
    private Object zzf;
    private int zze = 0;
    private String zzg = "";

    static {
        zzqx zzqxVar = new zzqx();
        zzh = zzqxVar;
        zzadu.zzcs(zzqx.class, zzqxVar);
    }

    private zzqx() {
    }

    public static zzqw zzh() {
        return (zzqw) zzh.zzcn();
    }

    public final String zza() {
        return this.zzg;
    }

    public final long zzb() {
        if (this.zze == 2) {
            return ((Long) this.zzf).longValue();
        }
        return 0L;
    }

    public final boolean zzc() {
        if (this.zze == 3) {
            return ((Boolean) this.zzf).booleanValue();
        }
        return false;
    }

    public final double zzd() {
        if (this.zze == 4) {
            return ((Double) this.zzf).doubleValue();
        }
        return 0.0d;
    }

    public final String zze() {
        return this.zze == 5 ? (String) this.zzf : "";
    }

    public final zzacr zzf() {
        return this.zze == 6 ? (zzacr) this.zzf : zzacr.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    protected final Object zzg(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzadu.zzct(zzh, "\u0004\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u00025\u0000\u0003:\u0000\u00043\u0000\u0005;\u0000\u0006=\u0000", new Object[]{"zzf", "zze", "zzb", "zzg"});
        }
        if (i11 == 3) {
            return new zzqx();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzqw(bArr);
        }
        if (i11 == 5) {
            return zzh;
        }
        if (i11 != 6) {
            throw null;
        }
        zzafj zzadqVar = zzi;
        if (zzadqVar == null) {
            synchronized (zzqx.class) {
                zzadqVar = zzi;
                if (zzadqVar == null) {
                    zzadqVar = new zzadq(zzh);
                    zzi = zzadqVar;
                }
            }
        }
        return zzadqVar;
    }

    final /* synthetic */ void zzi(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzg = str;
    }

    final /* synthetic */ void zzj(long j10) {
        this.zze = 2;
        this.zzf = Long.valueOf(j10);
    }

    final /* synthetic */ void zzk(boolean z10) {
        this.zze = 3;
        this.zzf = Boolean.valueOf(z10);
    }

    final /* synthetic */ void zzl(double d10) {
        this.zze = 4;
        this.zzf = Double.valueOf(d10);
    }

    final /* synthetic */ void zzm(String str) {
        str.getClass();
        this.zze = 5;
        this.zzf = str;
    }

    final /* synthetic */ void zzn(zzacr zzacrVar) {
        zzacrVar.getClass();
        this.zze = 6;
        this.zzf = zzacrVar;
    }

    public final int zzp() {
        int i10 = this.zze;
        if (i10 == 0) {
            return 6;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 3) {
            return 2;
        }
        if (i10 == 4) {
            return 3;
        }
        if (i10 != 5) {
            return i10 != 6 ? 0 : 5;
        }
        return 4;
    }
}
