package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzs extends zzai {
    final boolean zza;
    final boolean zzb;
    final /* synthetic */ zzt zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzs(zzt zztVar, boolean z10, boolean z11) {
        super("log");
        Objects.requireNonNull(zztVar);
        this.zzc = zztVar;
        this.zza = z10;
        this.zzb = z11;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x006f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0083  */
    /* JADX WARN: Code duplicated, block: B:26:0x0092 A[LOOP:0: B:24:0x0088->B:26:0x0092, LOOP_END] */
    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzao zza(zzg zzgVar, List list) {
        int i10;
        int i11;
        String strZzc;
        ArrayList arrayList;
        zzh.zzb("log", 1, list);
        if (list.size() == 1) {
            zzt zztVar = this.zzc;
            zztVar.zzb().zza(3, zzgVar.zza((zzao) list.get(0)).zzc(), Collections.emptyList(), this.zza, this.zzb);
            return zzao.zzf;
        }
        int iZzg = zzh.zzg(zzgVar.zza((zzao) list.get(0)).zzd().doubleValue());
        if (iZzg != 2) {
            i10 = 3;
            if (iZzg == 3) {
                i11 = 1;
            } else if (iZzg == 5) {
                i11 = 5;
            } else if (iZzg == 6) {
                i11 = 2;
            }
            strZzc = zzgVar.zza((zzao) list.get(1)).zzc();
            if (list.size() == 2) {
                zzt zztVar2 = this.zzc;
                zztVar2.zzb().zza(i11, strZzc, Collections.emptyList(), this.zza, this.zzb);
                return zzao.zzf;
            }
            arrayList = new ArrayList();
            for (int i12 = 2; i12 < Math.min(list.size(), 5); i12++) {
                arrayList.add(zzgVar.zza((zzao) list.get(i12)).zzc());
            }
            this.zzc.zzb().zza(i11, strZzc, arrayList, this.zza, this.zzb);
            return zzao.zzf;
        }
        i10 = 4;
        i11 = i10;
        strZzc = zzgVar.zza((zzao) list.get(1)).zzc();
        if (list.size() == 2) {
            zzt zztVar3 = this.zzc;
            zztVar3.zzb().zza(i11, strZzc, Collections.emptyList(), this.zza, this.zzb);
            return zzao.zzf;
        }
        arrayList = new ArrayList();
        while (i12 < Math.min(list.size(), 5)) {
            arrayList.add(zzgVar.zza((zzao) list.get(i12)).zzc());
        }
        this.zzc.zzb().zza(i11, strZzc, arrayList, this.zza, this.zzb);
        return zzao.zzf;
    }
}
