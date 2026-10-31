package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzaru implements zzahb {
    private final zzarr zza;
    private final int zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;

    public zzaru(zzarr zzarrVar, int i10, long j10, long j11) {
        this.zza = zzarrVar;
        this.zzb = i10;
        this.zzc = j10;
        long j12 = (j11 - j10) / ((long) zzarrVar.zzd);
        this.zzd = j12;
        this.zze = zze(j12);
    }

    private final long zze(long j10) {
        return zzfl.zzv(j10 * ((long) this.zzb), 1000000L, this.zza.zzc, RoundingMode.DOWN);
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final long zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final zzagz zzc(long j10) {
        long j11 = this.zzb;
        zzarr zzarrVar = this.zza;
        long j12 = (((long) zzarrVar.zzc) * j10) / (j11 * 1000000);
        String str = zzfl.zza;
        long j13 = this.zzd - 1;
        long jMax = Math.max(0L, Math.min(j12, j13));
        long j14 = zzarrVar.zzd;
        long jZze = zze(jMax);
        long j15 = this.zzc;
        zzahc zzahcVar = new zzahc(jZze, (jMax * j14) + j15);
        if (jZze >= j10 || jMax == j13) {
            return new zzagz(zzahcVar, zzahcVar);
        }
        long j16 = jMax + 1;
        return new zzagz(zzahcVar, new zzahc(zze(j16), j15 + (j14 * j16)));
    }
}
