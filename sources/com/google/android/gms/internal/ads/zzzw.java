package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public class zzzw implements zzaba {
    protected final zzbg zza;
    protected final int zzb;
    protected final int[] zzc;
    private final zzv[] zzd;
    private int zze;

    public zzzw(zzbg zzbgVar, int[] iArr, int i10) {
        int length = iArr.length;
        zzgtj.zzi(length > 0);
        zzbgVar.getClass();
        this.zza = zzbgVar;
        this.zzb = length;
        this.zzd = new zzv[length];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            this.zzd[i11] = zzbgVar.zza(iArr[i11]);
        }
        Arrays.sort(this.zzd, zzzv.zza);
        this.zzc = new int[this.zzb];
        for (int i12 = 0; i12 < this.zzb; i12++) {
            this.zzc[i12] = zzbgVar.zzb(this.zzd[i12]);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzzw zzzwVar = (zzzw) obj;
            if (this.zza.equals(zzzwVar.zza) && Arrays.equals(this.zzc, zzzwVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zze;
        if (i10 != 0) {
            return i10;
        }
        int iIdentityHashCode = (System.identityHashCode(this.zza) * 31) + Arrays.hashCode(this.zzc);
        this.zze = iIdentityHashCode;
        return iIdentityHashCode;
    }

    @Override // com.google.android.gms.internal.ads.zzabf
    public final zzbg zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzabf
    public final zzv zzb(int i10) {
        return this.zzd[i10];
    }

    @Override // com.google.android.gms.internal.ads.zzaba
    public final zzv zzc() {
        return this.zzd[0];
    }

    @Override // com.google.android.gms.internal.ads.zzabf
    public final int zze() {
        return this.zzc.length;
    }

    @Override // com.google.android.gms.internal.ads.zzabf
    public final int zzf(int i10) {
        return this.zzc[i10];
    }

    @Override // com.google.android.gms.internal.ads.zzabf
    public final int zzg(int i10) {
        for (int i11 = 0; i11 < this.zzb; i11++) {
            if (this.zzc[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzaba
    public final int zzh() {
        return this.zzc[0];
    }
}
