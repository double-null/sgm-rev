package com.google.android.gms.internal.measurement;

import com.google.common.util.concurrent.f0;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzqf implements Runnable {
    final /* synthetic */ Runnable zza;
    final /* synthetic */ f0 zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ TimeUnit zzd;

    zzqf(zzqi zzqiVar, Runnable runnable, f0 f0Var, long j10, TimeUnit timeUnit) {
        this.zza = runnable;
        this.zzb = f0Var;
        this.zzc = j10;
        this.zzd = timeUnit;
        Objects.requireNonNull(zzqiVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.run();
        zzpx.zza(this.zzb.schedule((Runnable) this, this.zzc, this.zzd));
    }
}
