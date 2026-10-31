package com.google.android.gms.internal.measurement;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.g0;
import com.google.common.util.concurrent.x;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzpx {
    static void zza(final ListenableFuture listenableFuture) {
        listenableFuture.addListener(new Runnable() { // from class: com.google.android.gms.internal.measurement.zzpw
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                try {
                    x.d(listenableFuture);
                } catch (ExecutionException e10) {
                    zzrn.zzb().post(new Runnable() { // from class: com.google.android.gms.internal.measurement.zzpv
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            throw new RuntimeException(e10.getCause());
                        }
                    });
                }
            }
        }, g0.a());
    }
}
