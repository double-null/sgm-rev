package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzfx extends zzfz {
    public final long zza;
    public final List zzb;
    public final List zzc;

    public zzfx(int i10, long j10) {
        super(i10, null);
        this.zza = j10;
        this.zzb = new ArrayList();
        this.zzc = new ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.zzfz
    public final String toString() {
        List list = this.zzb;
        String strZze = zzfz.zze(this.zzd);
        String string = Arrays.toString(list.toArray());
        String string2 = Arrays.toString(this.zzc.toArray());
        int length = strZze.length();
        StringBuilder sb2 = new StringBuilder(length + 9 + String.valueOf(string).length() + 13 + String.valueOf(string2).length());
        sb2.append(strZze);
        sb2.append(" leaves: ");
        sb2.append(string);
        sb2.append(" containers: ");
        sb2.append(string2);
        return sb2.toString();
    }

    public final void zza(zzfy zzfyVar) {
        this.zzb.add(zzfyVar);
    }

    public final void zzb(zzfx zzfxVar) {
        this.zzc.add(zzfxVar);
    }

    public final zzfy zzc(int i10) {
        List list = this.zzb;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            zzfy zzfyVar = (zzfy) list.get(i11);
            if (zzfyVar.zzd == i10) {
                return zzfyVar;
            }
        }
        return null;
    }

    public final zzfx zzd(int i10) {
        List list = this.zzc;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            zzfx zzfxVar = (zzfx) list.get(i11);
            if (zzfxVar.zzd == i10) {
                return zzfxVar;
            }
        }
        return null;
    }
}
