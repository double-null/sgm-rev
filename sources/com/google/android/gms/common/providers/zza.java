package com.google.android.gms.common.providers;

import com.google.android.gms.internal.common.zzg;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.11.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zza implements PooledExecutorsProvider.PooledExecutorFactory {
    zza() {
    }

    @Override // com.google.android.gms.common.providers.PooledExecutorsProvider.PooledExecutorFactory
    public final ScheduledExecutorService newSingleThreadScheduledExecutor() {
        return zzg.zza().zza(1, 2);
    }
}
