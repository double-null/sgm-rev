package com.google.android.gms.internal.measurement;

import com.google.common.base.p;
import com.google.common.collect.w;
import java.util.UUID;
import java.util.function.Consumer;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzwa extends zzwb {
    zzwa() {
        super(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzwb
    public final zzwi zza(String str, zzxd zzxdVar) {
        boolean z10;
        zzws zzwsVarZzg;
        zzwl zzwlVar = zzwk.zza;
        p.l(zzxdVar);
        zzwq zzwqVarZzd = zzvy.zzd();
        zzws zzwsVar = zzwqVarZzd.zzb;
        final Exception exc = null;
        if (zzwsVar == zzwg.zza) {
            zzvy.zzc(zzwqVarZzd, null);
            z10 = true;
            zzwsVar = null;
        } else {
            z10 = false;
        }
        if (zzwsVar == null) {
            final UUID uuidZzc = zzvz.zza().zzc();
            String strZzcL = zzvn.zzcL(uuidZzc);
            zzvq zzvqVar = zzwd.zza;
            w wVarZza = zzvy.zza();
            if (!wVarZza.isEmpty()) {
                wVarZza.forEach(new Consumer(uuidZzc, exc) { // from class: com.google.android.gms.internal.measurement.zzwe
                    @Override // java.util.function.Consumer
                    public final /* synthetic */ void accept(Object obj) {
                        ((zzwu) obj).zza();
                    }
                });
            }
            zzwsVarZzg = new zzwf(uuidZzc, strZzcL, str, zzwlVar, zzvqVar, false, false, zzwqVarZzd);
        } else {
            zzwsVarZzg = zzwsVar instanceof zzvs ? ((zzvs) zzwsVar).zzg(str, zzwlVar, false, zzwqVarZzd) : zzwsVar.zzj(str, "", "", 0, zzwlVar, zzwqVarZzd);
        }
        zzvy.zzc(zzwqVarZzd, zzwsVarZzg);
        return new zzwi(zzwsVarZzg, z10);
    }
}
