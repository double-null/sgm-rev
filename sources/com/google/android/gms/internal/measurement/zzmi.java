package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzmi extends zzadu implements zzafd {
    private static final zzmi zzh;
    private static volatile zzafj zzi;
    private int zzb;
    private Object zzf;
    private int zze = 0;
    private String zzg = "";

    static {
        zzmi zzmiVar = new zzmi();
        zzh = zzmiVar;
        zzadu.zzcs(zzmi.class, zzmiVar);
    }

    private zzmi() {
    }

    public static zzmh zzh() {
        return (zzmh) zzh.zzcn();
    }

    public static zzmi zzi() {
        return zzh;
    }

    public final String zza() {
        return this.zzg;
    }

    public final long zzb() {
        if (this.zze == 1) {
            return ((Long) this.zzf).longValue();
        }
        return 0L;
    }

    public final boolean zzc() {
        if (this.zze == 2) {
            return ((Boolean) this.zzf).booleanValue();
        }
        return false;
    }

    public final double zzd() {
        if (this.zze == 3) {
            return ((Double) this.zzf).doubleValue();
        }
        return 0.0d;
    }

    public final String zze() {
        return this.zze == 4 ? (String) this.zzf : "";
    }

    public final zzacr zzf() {
        return this.zze == 5 ? (zzacr) this.zzf : zzacr.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    protected final Object zzg(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzadu.zzct(zzh, "\u0004\u0006\u0001\u0001\u0001\n\u0006\u0000\u0000\u0000\u00018\u0000\u0002:\u0000\u00033\u0000\u0004;\u0000\u0005=\u0000\nဈ\u0000", new Object[]{"zzf", "zze", "zzb", "zzg"});
        }
        if (i11 == 3) {
            return new zzmi();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzmh(bArr);
        }
        if (i11 == 5) {
            return zzh;
        }
        if (i11 != 6) {
            throw null;
        }
        zzafj zzadqVar = zzi;
        if (zzadqVar == null) {
            synchronized (zzmi.class) {
                zzadqVar = zzi;
                if (zzadqVar == null) {
                    zzadqVar = new zzadq(zzh);
                    zzi = zzadqVar;
                }
            }
        }
        return zzadqVar;
    }

    final /* synthetic */ void zzj(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzg = str;
    }

    final /* synthetic */ void zzk(long j10) {
        this.zze = 1;
        this.zzf = Long.valueOf(j10);
    }

    final /* synthetic */ void zzl(boolean z10) {
        this.zze = 2;
        this.zzf = Boolean.valueOf(z10);
    }

    final /* synthetic */ void zzm(double d10) {
        this.zze = 3;
        this.zzf = Double.valueOf(d10);
    }

    final /* synthetic */ void zzn(String str) {
        str.getClass();
        this.zze = 4;
        this.zzf = str;
    }

    final /* synthetic */ void zzo(zzacr zzacrVar) {
        zzacrVar.getClass();
        this.zze = 5;
        this.zzf = zzacrVar;
    }

    public final int zzq() {
        int i10 = this.zze;
        if (i10 == 0) {
            return 6;
        }
        int i11 = 1;
        if (i10 != 1) {
            i11 = 2;
            if (i10 != 2) {
                i11 = 3;
                if (i10 != 3) {
                    i11 = 4;
                    if (i10 != 4) {
                        i11 = 5;
                        if (i10 != 5) {
                            return 0;
                        }
                    }
                }
            }
        }
        return i11;
    }
}
