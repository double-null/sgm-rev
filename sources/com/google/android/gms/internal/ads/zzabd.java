package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzabd {
    private final int[] zza;
    private final zzzn[] zzb;
    private final int[] zzc;
    private final int[][][] zzd;
    private final zzzn zze;

    zzabd(String[] strArr, int[] iArr, zzzn[] zzznVarArr, int[] iArr2, int[][][] iArr3, zzzn zzznVar) {
        this.zza = iArr;
        this.zzb = zzznVarArr;
        this.zzd = iArr3;
        this.zzc = iArr2;
        this.zze = zzznVar;
    }

    public final int zza(int i10) {
        return this.zza[i10];
    }

    public final zzzn zzb(int i10) {
        return this.zzb[i10];
    }

    public final int zzc(int i10, int i11, int i12) {
        return this.zzd[i10][i11][i12];
    }

    public final int zzd(int i10, int i11, boolean z10) {
        zzzn[] zzznVarArr = this.zzb;
        int i12 = zzznVarArr[i10].zza(i11).zza;
        int[] iArr = new int[i12];
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < i12; i15++) {
            if ((this.zzd[i10][i11][i15] & 7) == 4) {
                iArr[i14] = i15;
                i14++;
            }
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr, i14);
        String str = null;
        int i16 = 0;
        int iMin = 16;
        boolean z11 = false;
        while (i13 < iArrCopyOf.length) {
            String str2 = zzznVarArr[i10].zza(i11).zza(iArrCopyOf[i13]).zzp;
            int i17 = i16 + 1;
            if (i16 == 0) {
                str = str2;
            } else {
                z11 |= !Objects.equals(str, str2);
            }
            iMin = Math.min(iMin, this.zzd[i10][i11][i13] & 24);
            i13++;
            i16 = i17;
        }
        return z11 ? Math.min(iMin, this.zzc[i10]) : iMin;
    }

    public final zzzn zze() {
        return this.zze;
    }
}
