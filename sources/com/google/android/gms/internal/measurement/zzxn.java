package com.google.android.gms.internal.measurement;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzxn extends zzyq {
    private static final zzyf zza = new zzxl();
    private final AtomicLong zzb = new AtomicLong(-1);

    zzxn() {
    }

    static zzyq zza(zzzj zzzjVar, zzyd zzydVar, long j10) {
        if (((zzxm) zzzjVar.zzd(zzxx.zzd)) == null) {
            return null;
        }
        zzxn zzxnVar = (zzxn) zza.zzb(zzydVar, zzzjVar);
        zzabr.zzb(j10 >= 0, "timestamp cannot be negative");
        AtomicLong atomicLong = zzxnVar.zzb;
        long j11 = atomicLong.get();
        if (j11 >= 0) {
            throw null;
        }
        atomicLong.compareAndSet(j11, -j10);
        return zzxnVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzyq
    public final void zzb() {
        AtomicLong atomicLong = this.zzb;
        atomicLong.set(Math.max(-atomicLong.get(), 0L));
    }
}
