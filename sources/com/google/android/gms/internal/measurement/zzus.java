package com.google.android.gms.internal.measurement;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.g0;
import com.google.common.util.concurrent.j;
import com.google.common.util.concurrent.x;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzus implements zzth {
    final /* synthetic */ zzut zza;

    /* synthetic */ zzus(zzut zzutVar, byte[] bArr) {
        Objects.requireNonNull(zzutVar);
        this.zza = zzutVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzth
    public final ListenableFuture zza(final j jVar, final Executor executor) {
        return zzuy.zza(x.m(x.i(this.zza.zzg().zza()), zzxa.zzc(new j() { // from class: com.google.android.gms.internal.measurement.zzur
            @Override // com.google.common.util.concurrent.j
            public final /* synthetic */ ListenableFuture apply(Object obj) {
                return this.zza.zza.zzf().zzb(jVar, executor, null);
            }
        }), g0.a()));
    }
}
