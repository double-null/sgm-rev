package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzdn {
    private int zzb;
    private int zzc;
    private int zzd = 7;
    private int[] zza = new int[8];

    public final void zza(int i10) {
        int[] iArr = this.zza;
        int i11 = this.zzc;
        iArr[i11] = i10;
        int i12 = this.zzd & (i11 + 1);
        this.zzc = i12;
        int i13 = this.zzb;
        if (i12 == i13) {
            int length = iArr.length;
            int i14 = length - i13;
            int i15 = length + length;
            int[] iArr2 = new int[i15];
            System.arraycopy(iArr, i13, iArr2, 0, i14);
            System.arraycopy(this.zza, 0, iArr2, i14, this.zzb);
            this.zza = iArr2;
            this.zzb = 0;
            this.zzc = length;
            this.zzd = i15 - 1;
        }
    }

    public final int zzb() {
        int i10 = this.zzb;
        if (i10 == this.zzc) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i11 = this.zza[i10];
        this.zzb = (i10 + 1) & this.zzd;
        return i11;
    }

    public final void zzc() {
        this.zzc = this.zzb;
    }

    public final boolean zzd() {
        return this.zzb == this.zzc;
    }
}
