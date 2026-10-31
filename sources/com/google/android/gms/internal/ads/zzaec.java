package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzaec {
    private final zzadu zza;
    private final zzadv zzf;
    private long zzk;
    private final zzacu zzl;
    private final zzads zzb = new zzads();
    private final zzfh zzc = new zzfh(10);
    private final zzfh zzd = new zzfh(10);
    private final zzei zze = new zzei(16);
    private long zzg = -9223372036854775807L;
    private zzbv zzj = zzbv.zza;
    private long zzh = -9223372036854775807L;
    private long zzi = -9223372036854775807L;

    public zzaec(zzacu zzacuVar, zzadu zzaduVar, zzadv zzadvVar) {
        this.zzl = zzacuVar;
        this.zza = zzaduVar;
        this.zzf = zzadvVar;
    }

    private static Object zzh(zzfh zzfhVar) {
        zzgtj.zza(zzfhVar.zzc() > 0);
        while (zzfhVar.zzc() > 1) {
            zzfhVar.zzd();
        }
        Object objZzd = zzfhVar.zzd();
        objZzd.getClass();
        return objZzd;
    }

    public final void zza() {
        this.zze.zze();
        this.zzg = -9223372036854775807L;
        this.zzh = -9223372036854775807L;
        this.zzi = -9223372036854775807L;
        zzfh zzfhVar = this.zzd;
        if (zzfhVar.zzc() > 0) {
            this.zzk = ((Long) zzh(zzfhVar)).longValue();
        }
        zzfh zzfhVar2 = this.zzc;
        if (zzfhVar2.zzc() > 0) {
            zzfhVar2.zza(0L, (zzbv) zzh(zzfhVar2));
        }
    }

    public final void zzb(long j10, long j11) throws zzjk {
        while (true) {
            zzei zzeiVar = this.zze;
            if (zzeiVar.zzd()) {
                return;
            }
            zzfh zzfhVar = this.zzd;
            long jZzc = zzeiVar.zzc();
            Long l10 = (Long) zzfhVar.zze(jZzc);
            if (l10 != null && l10.longValue() != this.zzk) {
                this.zzk = l10.longValue();
                this.zza.zza(2);
            }
            zzadu zzaduVar = this.zza;
            long j12 = this.zzk;
            zzads zzadsVar = this.zzb;
            int iZzk = zzaduVar.zzk(jZzc, j10, j11, j12, false, false, zzadsVar);
            if (iZzk != 5 && iZzk != 4) {
                this.zzf.zza(jZzc, zzadsVar.zza());
            }
            if (iZzk == 0 || iZzk == 1) {
                this.zzh = jZzc;
                long jZzb = zzeiVar.zzb();
                zzbv zzbvVar = (zzbv) this.zzc.zze(jZzb);
                if (zzbvVar != null && !zzbvVar.equals(zzbv.zza) && !zzbvVar.equals(this.zzj)) {
                    this.zzj = zzbvVar;
                    this.zzl.zza(zzbvVar);
                }
                this.zzl.zzb(iZzk == 0 ? System.nanoTime() : zzadsVar.zzb(), jZzb, zzaduVar.zzf());
            } else if (iZzk == 2 || iZzk == 3) {
                this.zzh = jZzc;
                zzeiVar.zzb();
                final zzacu zzacuVar = this.zzl;
                Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzacs
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzacuVar.zza.zzB().zzc();
                    }
                };
                zzacv zzacvVar = zzacuVar.zza;
                zzacvVar.zzC().execute(runnable);
                ((zzaes) zzacvVar.zzz().remove()).zzb();
            } else if (iZzk != 4) {
                return;
            } else {
                this.zzh = jZzc;
            }
        }
    }

    public final void zzc(int i10, int i11) {
        long j10 = this.zzg;
        this.zzc.zza(j10 == -9223372036854775807L ? 0L : j10 + 1, new zzbv(i10, i11, 1.0f));
    }

    public final void zzd(int i10, long j10) {
        if (this.zze.zzd()) {
            this.zza.zza(i10);
            this.zzk = j10;
        } else {
            zzfh zzfhVar = this.zzd;
            long j11 = this.zzg;
            zzfhVar.zza(j11 == -9223372036854775807L ? -4611686018427387904L : j11 + 1, Long.valueOf(j10));
        }
    }

    public final void zze(long j10) {
        this.zze.zza(j10);
        this.zzg = j10;
        this.zzi = -9223372036854775807L;
    }

    public final void zzf() {
        long j10 = this.zzg;
        if (j10 == -9223372036854775807L) {
            j10 = Long.MIN_VALUE;
            this.zzg = Long.MIN_VALUE;
            this.zzh = Long.MIN_VALUE;
        }
        this.zzi = j10;
    }

    public final boolean zzg() {
        long j10 = this.zzi;
        return j10 != -9223372036854775807L && this.zzh == j10;
    }
}
