package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
abstract class zzhbh extends zzhay {
    private List zza;

    zzhbh(zzgwi zzgwiVar, boolean z10) {
        super(zzgwiVar, z10, true);
        List listEmptyList = zzgwiVar.isEmpty() ? Collections.emptyList() : zzgxm.zzb(zzgwiVar.size());
        for (int i10 = 0; i10 < zzgwiVar.size(); i10++) {
            listEmptyList.add(null);
        }
        this.zza = listEmptyList;
    }

    @Override // com.google.android.gms.internal.ads.zzhay
    final void zzA(int i10) {
        super.zzA(i10);
        this.zza = null;
    }

    abstract Object zzD(List list);

    @Override // com.google.android.gms.internal.ads.zzhay
    final void zzw(int i10, Object obj) {
        List list = this.zza;
        if (list != null) {
            list.set(i10, new zzhbg(obj));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhay
    final void zzx() {
        List list = this.zza;
        if (list != null) {
            zza(zzD(list));
        }
    }
}
