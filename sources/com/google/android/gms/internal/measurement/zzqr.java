package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzqr {
    private final boolean zza;
    private final int zzb;
    private final int zzc;

    zzqr() {
        this.zzb = 2;
        this.zzc = 2;
        this.zza = true;
    }

    final zzmd zza() {
        if (this.zza) {
            return zzmd.zzb();
        }
        int i10 = this.zzb;
        zzmc zzmcVarZza = zzmd.zza();
        zzmcVarZza.zza(i10);
        zzmcVarZza.zzb(this.zzc);
        return (zzmd) zzmcVarZza.zzbd();
    }

    final int zzb() {
        return this.zzc;
    }

    final /* synthetic */ int zzc() {
        return this.zzb;
    }

    zzqr(int i10) {
        this.zzb = 2;
        this.zzc = i10;
        this.zza = false;
    }

    zzqr(int i10, int i11) {
        this.zzb = i10;
        this.zzc = i11;
        this.zza = false;
    }
}
