package com.google.android.gms.internal.measurement;

import java.util.UUID;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzwf extends zzvt implements zzvs {
    private final Exception zza;
    private final boolean zzb;

    zzwf(String str, zzvs zzvsVar, zzwl zzwlVar, boolean z10, zzwq zzwqVar) {
        super("<missing root>:".concat(str), zzvsVar, zzwl.zza(zzwlVar, zzwk.zzb), zzwqVar);
        this.zza = zzvsVar.zzf();
        this.zzb = z10;
    }

    @Override // com.google.android.gms.internal.measurement.zzvs
    public final Exception zzf() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzvs
    public final zzws zzg(String str, zzwl zzwlVar, boolean z10, zzwq zzwqVar) {
        if (z10 && !this.zzb) {
            int i10 = zzvy.zzb;
        }
        return new zzwf(str, this, zzwlVar, (z10 && !this.zzb) || this.zzb, zzwqVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzws
    public final zzws zzj(String str, String str2, String str3, int i10, zzwl zzwlVar, zzwq zzwqVar) {
        int i11 = zzvy.zzb;
        return zzg(str, zzwlVar, true, zzwqVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzws
    public final long zzk() {
        return -1L;
    }

    @Override // com.google.android.gms.internal.measurement.zzws
    public final zzwl zzl() {
        return zzwk.zza;
    }

    zzwf(UUID uuid, String str, String str2, zzwl zzwlVar, Exception exc, boolean z10, boolean z11, zzwq zzwqVar) {
        super("<missing root>:".concat(str2), uuid, str, zzwl.zza(zzwlVar, zzwk.zzb), zzwqVar);
        this.zza = exc;
        this.zzb = false;
    }
}
