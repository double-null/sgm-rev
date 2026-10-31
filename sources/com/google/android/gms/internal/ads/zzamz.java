package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
abstract class zzamz {
    private zzahk zzb;
    private zzagb zzc;
    private zzamv zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private int zzh;
    private int zzi;
    private long zzk;
    private boolean zzl;
    private boolean zzm;
    private final zzamt zza = new zzamt();
    private zzamx zzj = new zzamx();

    protected void zza(boolean z10) {
        int i10;
        if (z10) {
            this.zzj = new zzamx();
            this.zzf = 0L;
            i10 = 0;
        } else {
            i10 = 1;
        }
        this.zzh = i10;
        this.zze = -1L;
        this.zzg = 0L;
    }

    protected abstract long zzb(zzet zzetVar);

    protected abstract boolean zzc(zzet zzetVar, long j10, zzamx zzamxVar) throws IOException;

    final void zze(zzagb zzagbVar, zzahk zzahkVar) {
        this.zzc = zzagbVar;
        this.zzb = zzahkVar;
        zza(true);
    }

    final void zzf(long j10, long j11) {
        this.zza.zza();
        if (j10 == 0) {
            zza(!this.zzl);
            return;
        }
        if (this.zzh != 0) {
            long jZzi = zzi(j11);
            this.zze = jZzi;
            zzamv zzamvVar = this.zzd;
            String str = zzfl.zza;
            zzamvVar.zzb(jZzi);
            this.zzh = 2;
        }
    }

    final int zzg(zzafz zzafzVar, zzagy zzagyVar) throws IOException {
        this.zzb.getClass();
        String str = zzfl.zza;
        int i10 = this.zzh;
        if (i10 == 0) {
            while (true) {
                zzamt zzamtVar = this.zza;
                if (!zzamtVar.zzb(zzafzVar)) {
                    this.zzh = 3;
                    return -1;
                }
                long jZzn = zzafzVar.zzn();
                long j10 = this.zzf;
                this.zzk = jZzn - j10;
                if (!zzc(zzamtVar.zzd(), j10, this.zzj)) {
                    zzv zzvVar = this.zzj.zza;
                    this.zzi = zzvVar.zzI;
                    if (!this.zzm) {
                        this.zzb.zzA(zzvVar);
                        this.zzm = true;
                    }
                    zzamv zzamvVar = this.zzj.zzb;
                    if (zzamvVar != null) {
                        this.zzd = zzamvVar;
                    } else if (zzafzVar.zzo() == -1) {
                        this.zzd = new zzamy(null);
                    } else {
                        zzamu zzamuVarZzc = zzamtVar.zzc();
                        this.zzd = new zzamo(this, this.zzf, zzafzVar.zzo(), zzamuVarZzc.zzd + zzamuVarZzc.zze, zzamuVarZzc.zzb, (zzamuVarZzc.zza & 4) != 0);
                    }
                    this.zzh = 2;
                    zzamtVar.zze();
                    break;
                }
                this.zzf = zzafzVar.zzn();
            }
        } else {
            if (i10 == 1) {
                zzafzVar.zzf((int) this.zzf);
                this.zzh = 2;
                return 0;
            }
            if (i10 != 2) {
                return -1;
            }
            long jZza = this.zzd.zza(zzafzVar);
            if (jZza >= 0) {
                zzagyVar.zza = jZza;
                return 1;
            }
            if (jZza < -1) {
                zzj(-(jZza + 2));
            }
            if (!this.zzl) {
                zzahb zzahbVarZzc = this.zzd.zzc();
                zzahbVarZzc.getClass();
                this.zzc.zzw(zzahbVarZzc);
                this.zzb.zzO(zzahbVarZzc.zza());
                this.zzl = true;
            }
            if (this.zzk <= 0 && !this.zza.zzb(zzafzVar)) {
                this.zzh = 3;
                return -1;
            }
            this.zzk = 0L;
            zzet zzetVarZzd = this.zza.zzd();
            long jZzb = zzb(zzetVarZzd);
            if (jZzb >= 0) {
                long j11 = this.zzg;
                if (j11 + jZzb >= this.zze) {
                    long jZzh = zzh(j11);
                    this.zzb.zzc(zzetVarZzd, zzetVarZzd.zze());
                    this.zzb.zze(jZzh, 1, zzetVarZzd.zze(), 0, null);
                    this.zze = -1L;
                }
            }
            this.zzg += jZzb;
        }
        return 0;
    }

    protected final long zzh(long j10) {
        return (j10 * 1000000) / ((long) this.zzi);
    }

    protected final long zzi(long j10) {
        return (((long) this.zzi) * j10) / 1000000;
    }

    protected void zzj(long j10) {
        this.zzg = j10;
    }
}
