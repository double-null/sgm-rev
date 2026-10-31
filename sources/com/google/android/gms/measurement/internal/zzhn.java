package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzhn implements com.google.android.gms.internal.measurement.zzr {
    final /* synthetic */ zzht zza;

    zzhn(zzht zzhtVar) {
        Objects.requireNonNull(zzhtVar);
        this.zza = zzhtVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzr
    public final void zza(int i10, String str, List list, boolean z10, boolean z11) {
        zzgs zzgsVarZzj;
        int i11 = i10 - 1;
        if (i11 == 0) {
            zzgsVarZzj = this.zza.zzu.zzaW().zzj();
        } else if (i11 != 1) {
            if (i11 == 3) {
                zzgsVarZzj = this.zza.zzu.zzaW().zzk();
            } else if (i11 != 4) {
                zzgsVarZzj = this.zza.zzu.zzaW().zzi();
            } else if (z10) {
                zzgsVarZzj = this.zza.zzu.zzaW().zzf();
            } else {
                zzgsVarZzj = !z11 ? this.zza.zzu.zzaW().zzh() : this.zza.zzu.zzaW().zze();
            }
        } else if (z10) {
            zzgsVarZzj = this.zza.zzu.zzaW().zzc();
        } else {
            zzgsVarZzj = !z11 ? this.zza.zzu.zzaW().zzd() : this.zza.zzu.zzaW().zzb();
        }
        int size = list.size();
        if (size == 1) {
            zzgsVarZzj.zzb(str, list.get(0));
            return;
        }
        if (size == 2) {
            zzgsVarZzj.zzc(str, list.get(0), list.get(1));
        } else if (size != 3) {
            zzgsVarZzj.zza(str);
        } else {
            zzgsVarZzj.zzd(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
