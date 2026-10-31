package com.google.android.gms.internal.ads;

import com.applovin.shadow.okhttp3.HttpUrl;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhaf implements Serializable {
    private static final zzhaf zza = new zzhaf(new int[0], 0, 0);
    private final int[] zzb;
    private final int zzc;

    private zzhaf(int[] iArr, int i10, int i11) {
        this.zzb = iArr;
        this.zzc = i11;
    }

    public static zzhaf zza() {
        return zza;
    }

    public static zzhaf zzb(int i10, int i11, int i12) {
        return new zzhaf(new int[]{0, 2, 1}, 0, 3);
    }

    public static zzhaf zzc(int i10, int i11, int i12, int i13, int i14) {
        return new zzhaf(new int[]{0, 2, 1, 3, 4}, 0, 5);
    }

    public static zzhaf zzd(int i10, int i11, int i12, int i13, int i14, int i15) {
        return new zzhaf(new int[]{0, 2, 1, 5, 3, 4}, 0, 6);
    }

    public static zzhaf zze(int i10, int... iArr) {
        int length = iArr.length;
        int i11 = length + 1;
        int[] iArr2 = new int[i11];
        iArr2[0] = 0;
        System.arraycopy(iArr, 0, iArr2, 1, length);
        return new zzhaf(iArr2, 0, i11);
    }

    public static zzhaf zzf(int[] iArr) {
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        return new zzhaf(iArrCopyOf, 0, iArrCopyOf.length);
    }

    public static zzhae zzg(int i10) {
        zzgtj.zzd(i10 >= 0, "Invalid initialCapacity: %s", i10);
        return new zzhae(i10);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzhaf)) {
            return false;
        }
        zzhaf zzhafVar = (zzhaf) obj;
        int i10 = this.zzc;
        if (i10 != zzhafVar.zzc) {
            return false;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (zzi(i11) != zzhafVar.zzi(i11)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = 1;
        for (int i10 = 0; i10 < this.zzc; i10++) {
            iHashCode = (iHashCode * 31) + Integer.hashCode(this.zzb[i10]);
        }
        return iHashCode;
    }

    public final String toString() {
        int i10 = this.zzc;
        if (i10 == 0) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb2 = new StringBuilder(i10 * 5);
        sb2.append('[');
        int[] iArr = this.zzb;
        sb2.append(iArr[0]);
        for (int i11 = 1; i11 < i10; i11++) {
            sb2.append(", ");
            sb2.append(iArr[i11]);
        }
        sb2.append(']');
        return sb2.toString();
    }

    public final int zzh() {
        return this.zzc;
    }

    public final int zzi(int i10) {
        zzgtj.zzm(i10, this.zzc, "index");
        return this.zzb[i10];
    }

    /* synthetic */ zzhaf(int[] iArr, int i10, int i11, byte[] bArr) {
        this(iArr, 0, i11);
    }
}
