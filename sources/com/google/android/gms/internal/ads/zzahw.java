package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzahw {
    private final zzahv zza;
    private final zzahk zzb;
    private final int zzc;
    private final int zzd;
    private final long zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private long zzl;
    private long[] zzm;
    private int[] zzn;

    public zzahw(int i10, zzahv zzahvVar, zzahk zzahkVar) {
        this.zza = zzahvVar;
        int iZzc = zzahvVar.zzc();
        boolean z10 = true;
        if (iZzc != 1) {
            if (iZzc == 2) {
                iZzc = 2;
            } else {
                z10 = false;
            }
        }
        zzgtj.zza(z10);
        this.zzc = zzj(i10, iZzc == 2 ? 1667497984 : 1651965952);
        this.zze = zzahvVar.zzd();
        this.zzb = zzahkVar;
        this.zzd = iZzc == 2 ? zzj(i10, 1650720768) : -1;
        this.zzl = -1L;
        this.zzm = new long[512];
        this.zzn = new int[512];
        this.zzf = zzahvVar.zzd;
    }

    private final long zzh(int i10) {
        return (this.zze * ((long) i10)) / ((long) this.zzf);
    }

    private final zzahc zzi(int i10) {
        return new zzahc(((long) this.zzn[i10]) * zzh(1), this.zzm[i10]);
    }

    private static int zzj(int i10, int i11) {
        return (((i10 % 10) + 48) << 8) | ((i10 / 10) + 48) | i11;
    }

    public final void zza(long j10, boolean z10) {
        if (this.zzl == -1) {
            this.zzl = j10;
        }
        if (z10) {
            if (this.zzk == this.zzn.length) {
                long[] jArr = this.zzm;
                this.zzm = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                int[] iArr = this.zzn;
                this.zzn = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
            }
            long[] jArr2 = this.zzm;
            int i10 = this.zzk;
            jArr2[i10] = j10;
            this.zzn[i10] = this.zzj;
            this.zzk = i10 + 1;
        }
        this.zzj++;
    }

    public final void zzb() {
        int i10;
        this.zzm = Arrays.copyOf(this.zzm, this.zzk);
        this.zzn = Arrays.copyOf(this.zzn, this.zzk);
        if ((this.zzc & 1651965952) != 1651965952 || this.zza.zzf == 0 || (i10 = this.zzk) <= 0) {
            return;
        }
        this.zzf = i10;
    }

    public final boolean zzc(int i10) {
        return this.zzc == i10 || this.zzd == i10;
    }

    public final void zzd(int i10) {
        this.zzg = i10;
        this.zzh = i10;
    }

    public final boolean zze(zzafz zzafzVar) throws IOException {
        int i10 = this.zzh;
        zzahk zzahkVar = this.zzb;
        int iZza = i10 - zzahkVar.zza(zzafzVar, i10, false);
        this.zzh = iZza;
        boolean z10 = iZza == 0;
        if (z10) {
            if (this.zzg > 0) {
                zzahkVar.zze(zzh(this.zzi), Arrays.binarySearch(this.zzn, this.zzi) >= 0 ? 1 : 0, this.zzg, 0, null);
            }
            this.zzi++;
        }
        return z10;
    }

    public final void zzf(long j10) {
        if (this.zzk == 0) {
            this.zzi = 0;
        } else {
            this.zzi = this.zzn[zzfl.zzo(this.zzm, j10, true, true)];
        }
    }

    public final zzagz zzg(long j10) {
        if (this.zzk == 0) {
            zzahc zzahcVar = new zzahc(0L, this.zzl);
            return new zzagz(zzahcVar, zzahcVar);
        }
        int iZzh = (int) (j10 / zzh(1));
        int iZzn = zzfl.zzn(this.zzn, iZzh, true, true);
        if (this.zzn[iZzn] == iZzh) {
            zzahc zzahcVarZzi = zzi(iZzn);
            return new zzagz(zzahcVarZzi, zzahcVarZzi);
        }
        zzahc zzahcVarZzi2 = zzi(iZzn);
        int i10 = iZzn + 1;
        return i10 < this.zzm.length ? new zzagz(zzahcVarZzi2, zzi(i10)) : new zzagz(zzahcVarZzi2, zzahcVarZzi2);
    }
}
