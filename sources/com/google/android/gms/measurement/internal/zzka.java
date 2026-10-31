package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzka implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ zzlj zzb;

    zzka(zzlj zzljVar, long j10) {
        this.zza = j10;
        Objects.requireNonNull(zzljVar);
        this.zzb = zzljVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzic zzicVar = this.zzb.zzu;
        zzhe zzheVar = zzicVar.zzd().zzf;
        long j10 = this.zza;
        zzheVar.zzb(j10);
        zzicVar.zzaW().zzj().zzb("Session timeout duration set", Long.valueOf(j10));
    }
}
