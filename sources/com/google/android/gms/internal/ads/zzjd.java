package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzjd {
    private final long zza;
    private final long zzb;
    private long zzc = -9223372036854775807L;
    private long zzd = -9223372036854775807L;
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private float zzj = 0.97f;
    private float zzi = 1.03f;
    private float zzk = 1.0f;
    private long zzl = -9223372036854775807L;
    private long zze = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private long zzm = -9223372036854775807L;
    private long zzn = -9223372036854775807L;

    /* synthetic */ zzjd(float f10, float f11, long j10, float f12, long j11, long j12, float f13, byte[] bArr) {
        this.zza = j11;
        this.zzb = j12;
    }

    private final void zzf() {
        long j10;
        long j11 = this.zzc;
        if (j11 != -9223372036854775807L) {
            j10 = this.zzd;
            if (j10 == -9223372036854775807L) {
                long j12 = this.zzf;
                if (j12 != -9223372036854775807L && j11 < j12) {
                    j11 = j12;
                }
                j10 = this.zzg;
                if (j10 == -9223372036854775807L || j11 <= j10) {
                    j10 = j11;
                }
            }
        } else {
            j10 = -9223372036854775807L;
        }
        if (this.zze == j10) {
            return;
        }
        this.zze = j10;
        this.zzh = j10;
        this.zzm = -9223372036854775807L;
        this.zzn = -9223372036854775807L;
        this.zzl = -9223372036854775807L;
    }

    private static long zzg(long j10, long j11, float f10) {
        return (long) ((j10 * 0.999f) + (j11 * 9.999871E-4f));
    }

    public final void zza(zzaf zzafVar) {
        long j10 = zzafVar.zza;
        this.zzc = zzfl.zzs(-9223372036854775807L);
        this.zzf = zzfl.zzs(-9223372036854775807L);
        this.zzg = zzfl.zzs(-9223372036854775807L);
        this.zzj = 0.97f;
        this.zzi = 1.03f;
        zzf();
    }

    public final void zzb(long j10) {
        this.zzd = j10;
        zzf();
    }

    public final void zzc() {
        long j10 = this.zzh;
        if (j10 == -9223372036854775807L) {
            return;
        }
        long j11 = j10 + this.zzb;
        this.zzh = j11;
        long j12 = this.zzg;
        if (j12 != -9223372036854775807L && j11 > j12) {
            this.zzh = j12;
        }
        this.zzl = -9223372036854775807L;
    }

    public final float zzd(long j10, long j11) {
        if (this.zzc == -9223372036854775807L) {
            return 1.0f;
        }
        long j12 = j10 - j11;
        long j13 = this.zzm;
        if (j13 == -9223372036854775807L) {
            this.zzm = j12;
            this.zzn = 0L;
        } else {
            long jMax = Math.max(j12, zzg(j13, j12, 0.999f));
            this.zzm = jMax;
            this.zzn = zzg(this.zzn, Math.abs(j12 - jMax), 0.999f);
        }
        if (this.zzl != -9223372036854775807L && SystemClock.elapsedRealtime() - this.zzl < 1000) {
            return this.zzk;
        }
        this.zzl = SystemClock.elapsedRealtime();
        long jMax2 = this.zzm + (this.zzn * 3);
        if (this.zzh > jMax2) {
            float fZzs = zzfl.zzs(1000L);
            long[] jArr = {jMax2, this.zze, this.zzh - (((long) ((this.zzk - 1.0f) * fZzs)) + ((long) ((this.zzi - 1.0f) * fZzs)))};
            for (int i10 = 1; i10 < 3; i10++) {
                long j14 = jArr[i10];
                if (j14 > jMax2) {
                    jMax2 = j14;
                }
            }
            this.zzh = jMax2;
        } else {
            long jMax3 = j10 - ((long) (Math.max(0.0f, this.zzk - 1.0f) / 1.0E-7f));
            long j15 = this.zzh;
            String str = zzfl.zza;
            jMax2 = Math.max(j15, Math.min(jMax3, jMax2));
            this.zzh = jMax2;
            long j16 = this.zzg;
            if (j16 != -9223372036854775807L && jMax2 > j16) {
                this.zzh = j16;
                jMax2 = j16;
            }
        }
        long j17 = j10 - jMax2;
        if (Math.abs(j17) < this.zza) {
            this.zzk = 1.0f;
            return 1.0f;
        }
        float fMax = Math.max(this.zzj, Math.min((j17 * 1.0E-7f) + 1.0f, this.zzi));
        this.zzk = fMax;
        return fMax;
    }

    public final long zze() {
        return this.zzh;
    }
}
