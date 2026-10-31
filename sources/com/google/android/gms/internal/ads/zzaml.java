package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzaml {
    public final zzami zza;
    public final int zzb;
    public final long[] zzc;
    public final int[] zzd;
    public final int zze;
    public final long[] zzf;
    public final int[] zzg;
    public final int[] zzh;
    public final long zzi;
    public final boolean zzj;

    public zzaml(zzami zzamiVar, long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, int[] iArr3, boolean z10, long j10, int i11) {
        int length = iArr.length;
        int length2 = jArr2.length;
        zzgtj.zza(length == length2);
        zzgtj.zza(jArr.length == length2);
        int length3 = iArr2.length;
        zzgtj.zza(length3 == length2);
        this.zza = zzamiVar;
        this.zzc = jArr;
        this.zzd = iArr;
        this.zze = i10;
        this.zzf = jArr2;
        this.zzg = iArr2;
        this.zzh = iArr3;
        this.zzj = z10;
        this.zzi = j10;
        this.zzb = i11;
        if (length3 > 0) {
            int i12 = length3 - 1;
            iArr2[i12] = iArr2[i12] | 536870912;
        }
    }

    public final int zza(long j10) {
        int i10 = 0;
        if (this.zzj) {
            return zzfl.zzo(this.zzf, j10, true, false);
        }
        int[] iArr = this.zzh;
        int length = iArr.length - 1;
        int i11 = -1;
        while (i10 <= length) {
            int i12 = ((length - i10) / 2) + i10;
            if (this.zzf[iArr[i12]] <= j10) {
                i10 = i12 + 1;
                i11 = i12;
            } else {
                length = i12 - 1;
            }
        }
        if (i11 == -1) {
            return -1;
        }
        long[] jArr = this.zzf;
        long j11 = jArr[iArr[i11]];
        if (j11 == j10) {
            while (i11 > 0) {
                int i13 = i11 - 1;
                if (jArr[iArr[i13]] != j11) {
                    break;
                }
                i11 = i13;
            }
        }
        return iArr[i11];
    }

    public final int zzb(long j10) {
        int i10 = 0;
        if (this.zzj) {
            return zzfl.zzq(this.zzf, j10, true, false);
        }
        int[] iArr = this.zzh;
        int length = iArr.length - 1;
        int i11 = -1;
        while (i10 <= length) {
            int i12 = ((length - i10) / 2) + i10;
            if (this.zzf[iArr[i12]] >= j10) {
                length = i12 - 1;
                i11 = i12;
            } else {
                i10 = i12 + 1;
            }
        }
        if (i11 == -1) {
            return -1;
        }
        long[] jArr = this.zzf;
        long j11 = jArr[iArr[i11]];
        if (j11 == j10) {
            while (i11 < iArr.length - 1) {
                int i13 = i11 + 1;
                if (jArr[iArr[i13]] != j11) {
                    break;
                }
                i11 = i13;
            }
        }
        return iArr[i11];
    }
}
