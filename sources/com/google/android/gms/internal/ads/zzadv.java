package com.google.android.gms.internal.ads;

import android.util.Range;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzadv {
    private long zza;
    private long zzb;
    private double zzc;
    private Range zzd;

    public zzadv(float f10) {
        Range range = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d));
        this.zzd = range;
        this.zzc = ((Double) range.getUpper()).doubleValue();
        this.zza = -9223372036854775807L;
        this.zzb = -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0032  */
    public final void zza(long j10, long j11) {
        double dDoubleValue;
        zzgtj.zza(j10 != -9223372036854775807L);
        zzgtj.zza(j11 != -9223372036854775807L);
        long j12 = this.zza;
        if (j12 != -9223372036854775807L) {
            long j13 = this.zzb;
            if (j13 == -9223372036854775807L || j10 == j12) {
                dDoubleValue = ((Double) this.zzd.getUpper()).doubleValue();
            } else {
                dDoubleValue = (j11 - j13) / (j10 - j12);
            }
        } else {
            dDoubleValue = ((Double) this.zzd.getUpper()).doubleValue();
        }
        this.zzc = (this.zzc * 0.800000011920929d) + (((Double) this.zzd.clamp(Double.valueOf(dDoubleValue))).doubleValue() * 0.20000000298023224d);
        this.zza = j10;
        this.zzb = j11;
    }

    public final long zzb(long j10) {
        long j11 = this.zza;
        if (j11 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return (long) (this.zzb + ((j10 - j11) * this.zzc));
    }

    public final void zzc(float f10) {
        zzgtj.zza(f10 > 0.0f);
        this.zzd = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d / ((double) f10)));
        zzd();
    }

    public final void zzd() {
        this.zzc = ((Double) this.zzd.getUpper()).doubleValue();
        this.zza = -9223372036854775807L;
        this.zzb = -9223372036854775807L;
    }
}
