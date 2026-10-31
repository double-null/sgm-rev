package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzoa {
    protected long zza;
    protected long zzb;
    final /* synthetic */ zzoc zzc;
    private final zzaz zzd;

    public zzoa(zzoc zzocVar) {
        Objects.requireNonNull(zzocVar);
        this.zzc = zzocVar;
        this.zzd = new zznz(this, zzocVar.zzu);
        long jElapsedRealtime = zzocVar.zzu.zzba().elapsedRealtime();
        this.zza = jElapsedRealtime;
        this.zzb = jElapsedRealtime;
    }

    final void zza(long j10) {
        this.zzc.zzg();
        this.zzd.zzd();
        this.zza = j10;
        this.zzb = j10;
    }

    final void zzb(long j10) {
        this.zzd.zzd();
    }

    final void zzc() {
        this.zzd.zzd();
        long jElapsedRealtime = this.zzc.zzu.zzba().elapsedRealtime();
        this.zza = jElapsedRealtime;
        this.zzb = jElapsedRealtime;
    }

    public final boolean zzd(boolean z10, boolean z11, long j10) {
        zzoc zzocVar = this.zzc;
        zzocVar.zzg();
        zzocVar.zzb();
        if (zzocVar.zzu.zzB()) {
            zzic zzicVar = zzocVar.zzu;
            zzicVar.zzd().zzk.zzb(zzicVar.zzba().currentTimeMillis());
        }
        long j11 = j10 - this.zza;
        if (!z10 && j11 < 1000) {
            zzocVar.zzu.zzaW().zzk().zzb("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j11));
            return false;
        }
        if (!z11) {
            j11 = j10 - this.zzb;
            this.zzb = j10;
        }
        zzic zzicVar2 = zzocVar.zzu;
        zzicVar2.zzaW().zzk().zzb("Recording user engagement, ms", Long.valueOf(j11));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j11);
        boolean z12 = !zzicVar2.zzc().zzv();
        zzic zzicVar3 = zzocVar.zzu;
        zzpp.zzay(zzicVar3.zzs().zzh(z12), bundle, true);
        if (!z11) {
            zzicVar3.zzj().zzE("auto", "_e", bundle);
        }
        this.zza = j10;
        zzaz zzazVar = this.zzd;
        zzazVar.zzd();
        zzazVar.zzb(((Long) zzfy.zzap.zzb(null)).longValue());
        return true;
    }
}
