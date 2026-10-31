package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzakw implements zzakt {
    private final long zza;
    private final int zzb;
    private final long zzc;
    private final int zzd;
    private final long zze;
    private final long zzf;
    private final long[] zzg;

    private zzakw(long j10, int i10, long j11, int i11, long j12, long[] jArr) {
        this.zza = j10;
        this.zzb = i10;
        this.zzc = j11;
        this.zzd = i11;
        this.zze = j12;
        this.zzg = jArr;
        this.zzf = j12 != -1 ? j10 + j12 : -1L;
    }

    public static zzakw zze(zzakv zzakvVar, long j10) {
        long jZzb = zzakvVar.zzb();
        if (jZzb == -9223372036854775807L) {
            return null;
        }
        zzagv zzagvVar = zzakvVar.zza;
        return new zzakw(j10, zzagvVar.zzc, jZzb, zzagvVar.zzf, zzakvVar.zzc, zzakvVar.zzg);
    }

    private final long zzi(int i10) {
        return (this.zzc * ((long) i10)) / 100;
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final boolean zzb() {
        return this.zzg != null;
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final zzagz zzc(long j10) {
        if (!zzb()) {
            zzahc zzahcVar = new zzahc(0L, this.zza + ((long) this.zzb));
            return new zzagz(zzahcVar, zzahcVar);
        }
        long j11 = this.zzc;
        String str = zzfl.zza;
        long jMax = Math.max(0L, Math.min(j10, j11));
        double d10 = (jMax * 100.0d) / j11;
        double d11 = 0.0d;
        if (d10 > 0.0d) {
            if (d10 >= 100.0d) {
                d11 = 256.0d;
            } else {
                int i10 = (int) d10;
                long[] jArr = this.zzg;
                jArr.getClass();
                double d12 = jArr[i10];
                d11 = d12 + ((d10 - ((double) i10)) * ((i10 == 99 ? 256.0d : jArr[i10 + 1]) - d12));
            }
        }
        long j12 = this.zze;
        zzahc zzahcVar2 = new zzahc(jMax, this.zza + Math.max(this.zzb, Math.min(Math.round((d11 / 256.0d) * j12), j12 - 1)));
        return new zzagz(zzahcVar2, zzahcVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzakt
    public final long zzf(long j10) {
        if (!zzb()) {
            return 0L;
        }
        long j11 = j10 - this.zza;
        if (j11 <= this.zzb) {
            return 0L;
        }
        long[] jArr = this.zzg;
        jArr.getClass();
        double d10 = (j11 * 256.0d) / this.zze;
        int iZzo = zzfl.zzo(jArr, (long) d10, true, true);
        long jZzi = zzi(iZzo);
        long j12 = jArr[iZzo];
        int i10 = iZzo + 1;
        long jZzi2 = zzi(i10);
        long j13 = iZzo == 99 ? 256L : jArr[i10];
        return jZzi + Math.round((j12 == j13 ? 0.0d : (d10 - j12) / (j13 - j12)) * (jZzi2 - jZzi));
    }

    @Override // com.google.android.gms.internal.ads.zzakt
    public final long zzg() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzakt
    public final int zzh() {
        return this.zzd;
    }
}
