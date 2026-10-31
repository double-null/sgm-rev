package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzmd {
    public final zzxk zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final long zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;
    public final boolean zzj;
    public final boolean zzk;

    zzmd(zzxk zzxkVar, long j10, long j11, long j12, long j13, long j14, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        boolean z15 = true;
        zzgtj.zza(!z14 || z12);
        if (z13 && !z12) {
            z15 = false;
        }
        zzgtj.zza(z15);
        this.zza = zzxkVar;
        this.zzb = j10;
        this.zzc = j11;
        this.zzd = j12;
        this.zze = j13;
        this.zzf = j14;
        this.zzg = false;
        this.zzh = false;
        this.zzi = z12;
        this.zzj = z13;
        this.zzk = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzmd.class == obj.getClass()) {
            zzmd zzmdVar = (zzmd) obj;
            if (this.zzb == zzmdVar.zzb && this.zzd == zzmdVar.zzd && this.zze == zzmdVar.zze && this.zzf == zzmdVar.zzf && this.zzi == zzmdVar.zzi && this.zzj == zzmdVar.zzj && this.zzk == zzmdVar.zzk && Objects.equals(this.zza, zzmdVar.zza)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() + 527;
        long j10 = this.zzf;
        long j11 = this.zze;
        return (((((((((((((iHashCode * 31) + ((int) this.zzb)) * 31) + ((int) this.zzd)) * 31) + ((int) j11)) * 31) + ((int) j10)) * 29791) + (this.zzi ? 1 : 0)) * 31) + (this.zzj ? 1 : 0)) * 31) + (this.zzk ? 1 : 0);
    }

    public final zzmd zza(long j10, long j11) {
        return (j10 == this.zzb && j11 == this.zzc) ? this : new zzmd(this.zza, j10, j11, this.zzd, this.zze, this.zzf, false, false, this.zzi, this.zzj, this.zzk);
    }

    public final zzmd zzb(long j10) {
        return j10 == this.zzd ? this : new zzmd(this.zza, this.zzb, this.zzc, j10, this.zze, this.zzf, false, false, this.zzi, this.zzj, this.zzk);
    }
}
