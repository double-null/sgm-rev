package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzjy implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzlj zzb;

    zzjy(zzlj zzljVar, boolean z10) {
        this.zza = z10;
        Objects.requireNonNull(zzljVar);
        this.zzb = zzljVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzlj zzljVar = this.zzb;
        zzic zzicVar = zzljVar.zzu;
        boolean zZzB = zzicVar.zzB();
        boolean zZzA = zzicVar.zzA();
        boolean z10 = this.zza;
        zzicVar.zzz(z10);
        if (zZzA == z10) {
            zzicVar.zzaW().zzk().zzb("Default data collection state already set to", Boolean.valueOf(z10));
        }
        if (zzicVar.zzB() == zZzB || zzicVar.zzB() != zzicVar.zzA()) {
            zzicVar.zzaW().zzh().zzc("Default data collection is different than actual status", Boolean.valueOf(z10), Boolean.valueOf(zZzB));
        }
        zzljVar.zzak();
    }
}
