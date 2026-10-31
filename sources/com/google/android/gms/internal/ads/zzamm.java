package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzamm implements zzahf {
    public final int zza;
    public final zzhaf zzb;

    public zzamm(int i10, int[] iArr) {
        this.zza = i10;
        this.zzb = iArr != null ? zzhaf.zzf(iArr) : zzhaf.zza();
    }

    public final String toString() {
        zzhaf zzhafVar = this.zzb;
        ArrayList arrayList = new ArrayList(zzhafVar.zzh());
        for (int i10 = 0; i10 < zzhafVar.zzh(); i10++) {
            arrayList.add(zzfl.zzz(zzhafVar.zzi(i10)));
        }
        String strZzz = zzfl.zzz(this.zza);
        String string = arrayList.toString();
        StringBuilder sb2 = new StringBuilder(strZzz.length() + 37 + string.length() + 1);
        sb2.append("UnsupportedBrands{major=");
        sb2.append(strZzz);
        sb2.append(", compatible=");
        sb2.append(string);
        sb2.append("}");
        return sb2.toString();
    }
}
