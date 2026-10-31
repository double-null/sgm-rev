package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public class zzafo implements zzahb {
    private final long zza;
    private final long zzb;
    private final int zzc;
    private final long zzd;
    private final int zze;
    private final long zzf;
    private final boolean zzg;

    protected zzafo(long j10, long j11, int i10, int i11, boolean z10, boolean z11) {
        long jZzf;
        this.zza = j10;
        this.zzb = j11;
        this.zzc = i11 == -1 ? 1 : i11;
        this.zze = i10;
        this.zzg = z11;
        if (j10 == -1) {
            this.zzd = -1L;
            jZzf = -9223372036854775807L;
        } else {
            this.zzd = j10 - j11;
            jZzf = zzf(j10, j11, i10);
        }
        this.zzf = jZzf;
    }

    private static long zzf(long j10, long j11, int i10) {
        return (Math.max(0L, j10 - j11) * 8000000) / ((long) i10);
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final long zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final boolean zzb() {
        return this.zzd != -1;
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final zzagz zzc(long j10) {
        long j11 = this.zzd;
        if (j11 == -1) {
            zzahc zzahcVar = new zzahc(0L, this.zzb);
            return new zzagz(zzahcVar, zzahcVar);
        }
        long j12 = ((long) this.zze) * j10;
        long j13 = this.zzc;
        long jMin = ((j12 / 8000000) / j13) * j13;
        if (j11 != -1) {
            jMin = Math.min(jMin, j11 - j13);
        }
        long jMax = this.zzb + Math.max(jMin, 0L);
        long jZze = zze(jMax);
        zzahc zzahcVar2 = new zzahc(jZze, jMax);
        if (j11 != -1 && jZze < j10) {
            long j14 = jMax + j13;
            if (j14 < this.zza) {
                return new zzagz(zzahcVar2, new zzahc(zze(j14), j14));
            }
        }
        return new zzagz(zzahcVar2, zzahcVar2);
    }

    public final long zze(long j10) {
        return zzf(j10, this.zzb, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final boolean zzj() {
        return this.zzg;
    }
}
