package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhae {
    private int[] zza;
    private int zzb = 0;

    zzhae(int i10) {
        this.zza = new int[i10];
    }

    public final zzhae zza(int i10) {
        int i11 = this.zzb + 1;
        int[] iArr = this.zza;
        int length = iArr.length;
        if (i11 > length) {
            int i12 = length + (length >> 1) + 1;
            if (i12 < i11) {
                int iHighestOneBit = Integer.highestOneBit(i11 - 1);
                i12 = iHighestOneBit + iHighestOneBit;
            }
            if (i12 < 0) {
                i12 = Integer.MAX_VALUE;
            }
            this.zza = Arrays.copyOf(iArr, i12);
        }
        int[] iArr2 = this.zza;
        int i13 = this.zzb;
        iArr2[i13] = i10;
        this.zzb = i13 + 1;
        return this;
    }

    public final zzhaf zzb() {
        int i10 = this.zzb;
        return i10 == 0 ? zzhaf.zza : new zzhaf(this.zza, 0, i10, null);
    }
}
