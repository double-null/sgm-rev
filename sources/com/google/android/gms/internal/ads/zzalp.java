package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzalp implements zzahb {
    private final SparseArray zza;
    private final SparseArray zzb;
    private final long zzc;
    private final long zzd;
    private final int zze;

    /* synthetic */ zzalp(SparseArray sparseArray, SparseArray sparseArray2, long j10, long j11, int i10, byte[] bArr) {
        this.zza = sparseArray;
        this.zzb = sparseArray2;
        this.zzc = j10;
        this.zzd = j11;
        this.zze = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final zzagz zzc(long j10) {
        SparseArray sparseArray = this.zza;
        int i10 = this.zze;
        long[] jArr = (long[]) sparseArray.get(i10);
        SparseArray sparseArray2 = this.zzb;
        long[] jArr2 = (long[]) sparseArray2.get(i10);
        if (jArr == null || jArr2 == null) {
            jArr = (long[]) sparseArray.get(i10);
            jArr2 = (long[]) sparseArray2.get(i10);
            if (jArr == null || jArr2 == null) {
                jArr = (long[]) sparseArray.valueAt(0);
                jArr2 = (long[]) sparseArray2.valueAt(0);
            }
        }
        if (jArr.length == 0 || j10 < jArr[0]) {
            zzahc zzahcVar = new zzahc(0L, this.zzd);
            return new zzagz(zzahcVar, zzahcVar);
        }
        int iZzo = zzfl.zzo(jArr, j10, true, true);
        zzahc zzahcVar2 = new zzahc(jArr[iZzo], jArr2[iZzo]);
        return new zzagz(zzahcVar2, zzahcVar2);
    }
}
