package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class zzu implements Runnable {
    private final /* synthetic */ zzic zza;

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        zzic zzicVar = this.zza;
        if (!zzicVar.zzk().zzU()) {
            zzicVar.zzaW().zze().zza("registerTrigger called but app not eligible");
            return;
        }
        zzicVar.zzj().zzv();
        final zzlj zzljVarZzj = zzicVar.zzj();
        Objects.requireNonNull(zzljVarZzj);
        new Thread(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzv
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzljVarZzj.zzw();
            }
        }).start();
    }
}
