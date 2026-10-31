package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzakf implements zzahb {
    private final zzafm zza;
    private final SparseArray zzb;
    private final long zzc;
    private final int zzd;

    public zzakf(SparseArray sparseArray, long j10, int i10, long j11, long j12) {
        int i11;
        this.zzb = sparseArray;
        this.zzc = j10;
        this.zzd = i10;
        List list = (List) sparseArray.get(i10);
        zzafm zzafmVar = null;
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            int[] iArrCopyOf = new int[size];
            long[] jArrCopyOf = new long[size];
            long[] jArrCopyOf2 = new long[size];
            long[] jArrCopyOf3 = new long[size];
            int i12 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                zzake zzakeVar = (zzake) list.get(i13);
                jArrCopyOf3[i13] = zzakeVar.zza();
                jArrCopyOf[i13] = zzakeVar.zzb();
            }
            while (true) {
                i11 = size - 1;
                if (i12 >= i11) {
                    break;
                }
                int i14 = i12 + 1;
                iArrCopyOf[i12] = (int) (jArrCopyOf[i14] - jArrCopyOf[i12]);
                jArrCopyOf2[i12] = jArrCopyOf3[i14] - jArrCopyOf3[i12];
                i12 = i14;
            }
            int i15 = i11;
            while (i15 > 0 && jArrCopyOf3[i15] >= j10) {
                i15--;
            }
            iArrCopyOf[i15] = (int) ((j11 + j12) - jArrCopyOf[i15]);
            jArrCopyOf2[i15] = j10 - jArrCopyOf3[i15];
            if (i15 < i11) {
                zzeg.zzc("MatroskaExtractor", "Discarding trailing cue points with timestamps greater than total duration.");
                int i16 = i15 + 1;
                iArrCopyOf = Arrays.copyOf(iArrCopyOf, i16);
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i16);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i16);
                jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i16);
            }
            zzafmVar = new zzafm(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
        }
        this.zza = zzafmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final boolean zzb() {
        List list = (List) this.zzb.get(this.zzd);
        return (list == null || list.isEmpty()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final zzagz zzc(long j10) {
        zzafm zzafmVar = this.zza;
        if (zzafmVar != null) {
            return zzafmVar.zzc(j10);
        }
        zzahc zzahcVar = zzahc.zza;
        return new zzagz(zzahcVar, zzahcVar);
    }
}
