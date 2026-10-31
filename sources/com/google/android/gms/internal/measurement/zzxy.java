package com.google.android.gms.internal.measurement;

import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzxy extends zzzj {
    private Object[] zza = new Object[8];
    private int zzb = 0;

    zzxy() {
    }

    private final int zzh(zzyl zzylVar) {
        for (int i10 = 0; i10 < this.zzb; i10++) {
            if (this.zza[i10 + i10].equals(zzylVar)) {
                return i10;
            }
        }
        return -1;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Metadata{");
        for (int i10 = 0; i10 < this.zzb; i10++) {
            sb2.append(" '");
            sb2.append(zzb(i10));
            sb2.append("': ");
            sb2.append(zzc(i10));
        }
        sb2.append(" }");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.measurement.zzzj
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.measurement.zzzj
    public final zzyl zzb(int i10) {
        if (i10 < this.zzb) {
            return (zzyl) this.zza[i10 + i10];
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // com.google.android.gms.internal.measurement.zzzj
    public final Object zzc(int i10) {
        if (i10 < this.zzb) {
            return this.zza[i10 + i10 + 1];
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // com.google.android.gms.internal.measurement.zzzj
    public final Object zzd(zzyl zzylVar) {
        int iZzh = zzh(zzylVar);
        if (iZzh != -1) {
            return zzylVar.zze(this.zza[iZzh + iZzh + 1]);
        }
        return null;
    }

    final void zze(zzyl zzylVar, Object obj) {
        int iZzh;
        if (!zzylVar.zzf() && (iZzh = zzh(zzylVar)) != -1) {
            zzabr.zza(obj, "metadata value");
            this.zza[iZzh + iZzh + 1] = obj;
            return;
        }
        int i10 = this.zzb + 1;
        Object[] objArr = this.zza;
        int length = objArr.length;
        if (i10 + i10 > length) {
            this.zza = Arrays.copyOf(objArr, length + length);
        }
        Object[] objArr2 = this.zza;
        int i11 = this.zzb;
        zzabr.zza(zzylVar, "metadata key");
        objArr2[i11 + i11] = zzylVar;
        Object[] objArr3 = this.zza;
        int i12 = this.zzb;
        zzabr.zza(obj, "metadata value");
        objArr3[i12 + i12 + 1] = obj;
        this.zzb++;
    }

    final void zzf(zzyl zzylVar) {
        int i10;
        int iZzh = zzh(zzylVar);
        if (iZzh >= 0) {
            int i11 = iZzh + iZzh;
            int i12 = i11 + 2;
            while (true) {
                i10 = this.zzb;
                if (i12 >= i10 + i10) {
                    break;
                }
                Object obj = this.zza[i12];
                if (!obj.equals(zzylVar)) {
                    Object[] objArr = this.zza;
                    objArr[i11] = obj;
                    objArr[i11 + 1] = objArr[i12 + 1];
                    i11 += 2;
                }
                i12 += 2;
            }
            this.zzb = i10 - ((i12 - i11) >> 1);
            while (i11 < i12) {
                this.zza[i11] = null;
                i11++;
            }
        }
    }
}
