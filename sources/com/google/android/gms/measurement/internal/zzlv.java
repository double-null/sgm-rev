package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzlv implements Runnable {
    final /* synthetic */ Bundle zza;
    final /* synthetic */ zzlu zzb;
    final /* synthetic */ zzlu zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ zzmb zze;

    zzlv(zzmb zzmbVar, Bundle bundle, zzlu zzluVar, zzlu zzluVar2, long j10) {
        this.zza = bundle;
        this.zzb = zzluVar;
        this.zzc = zzluVar2;
        this.zzd = j10;
        Objects.requireNonNull(zzmbVar);
        this.zze = zzmbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle = this.zza;
        bundle.remove("screen_name");
        bundle.remove("screen_class");
        zzmb zzmbVar = this.zze;
        zzmbVar.zzm(this.zzb, this.zzc, this.zzd, true, zzmbVar.zzu.zzk().zzH(null, "screen_view", bundle, null, false));
    }
}
