package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public class zzafk {
    protected final zzafe zza;
    protected final zzafj zzb;
    protected zzafg zzc;
    private final int zzd;

    protected zzafk(zzafh zzafhVar, zzafj zzafjVar, long j10, long j11, long j12, long j13, long j14, long j15, int i10) {
        this.zzb = zzafjVar;
        this.zzd = i10;
        this.zza = new zzafe(zzafhVar, j10, 0L, j12, j13, j14, j15);
    }

    protected static final int zzf(zzafz zzafzVar, long j10, zzagy zzagyVar) {
        if (j10 == zzafzVar.zzn()) {
            return 0;
        }
        zzagyVar.zza = j10;
        return 1;
    }

    protected static final boolean zzg(zzafz zzafzVar, long j10) throws IOException {
        long jZzn = j10 - zzafzVar.zzn();
        if (jZzn < 0 || jZzn > 262144) {
            return false;
        }
        zzafzVar.zzf((int) jZzn);
        return true;
    }

    public final zzahb zza() {
        return this.zza;
    }

    public final void zzb(long j10) {
        zzafg zzafgVar = this.zzc;
        if (zzafgVar == null || zzafgVar.zze() != j10) {
            zzafe zzafeVar = this.zza;
            this.zzc = new zzafg(j10, zzafeVar.zzd(j10), 0L, zzafeVar.zze(), zzafeVar.zzf(), zzafeVar.zzg(), zzafeVar.zzh());
        }
    }

    public final boolean zzc() {
        return this.zzc != null;
    }

    public final int zzd(zzafz zzafzVar, zzagy zzagyVar) throws IOException {
        while (true) {
            zzafg zzafgVar = this.zzc;
            zzafgVar.getClass();
            long jZzb = zzafgVar.zzb();
            long jZzc = zzafgVar.zzc();
            long jZzh = zzafgVar.zzh();
            if (jZzc - jZzb <= this.zzd) {
                zze(false, jZzb);
                return zzf(zzafzVar, jZzb, zzagyVar);
            }
            if (!zzg(zzafzVar, jZzh)) {
                return zzf(zzafzVar, jZzh, zzagyVar);
            }
            zzafzVar.zzl();
            zzafi zzafiVarZza = this.zzb.zza(zzafzVar, zzafgVar.zzd());
            int iZzd = zzafiVarZza.zzd();
            if (iZzd == -3) {
                zze(false, jZzh);
                return zzf(zzafzVar, jZzh, zzagyVar);
            }
            if (iZzd == -2) {
                zzafgVar.zzf(zzafiVarZza.zze(), zzafiVarZza.zzf());
            } else {
                if (iZzd != -1) {
                    zzg(zzafzVar, zzafiVarZza.zzf());
                    zze(true, zzafiVarZza.zzf());
                    return zzf(zzafzVar, zzafiVarZza.zzf(), zzagyVar);
                }
                zzafgVar.zzg(zzafiVarZza.zze(), zzafiVarZza.zzf());
            }
        }
    }

    protected final void zze(boolean z10, long j10) {
        this.zzc = null;
        this.zzb.zzb();
    }
}
