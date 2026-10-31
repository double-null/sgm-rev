package com.google.android.gms.common.internal;

import com.google.android.gms.libs.throttling.GmsThrottler;
import com.google.android.gms.libs.throttling.ThrottlingLimits;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.11.0 */
/* JADX INFO: loaded from: classes3.dex */
public class ClientThrottlingManagerImpl implements ClientThrottlingManager {
    private final GmsThrottler zza;

    public ClientThrottlingManagerImpl(GmsThrottler gmsThrottler) {
        this.zza = gmsThrottler;
    }

    @Override // com.google.android.gms.common.internal.ClientThrottlingManager
    public void release(int i10) {
        this.zza.release(i10);
    }

    @Override // com.google.android.gms.common.internal.ClientThrottlingManager
    public int tryAcquire(int i10, ConnectionThrottlingConfig connectionThrottlingConfig) {
        ThrottlingLimits throttlingLimitsZza = connectionThrottlingConfig.zza(i10);
        if (throttlingLimitsZza == null || this.zza.tryAcquire(i10, throttlingLimitsZza)) {
            return Integer.MIN_VALUE;
        }
        return throttlingLimitsZza.getMaxInflight();
    }

    public ClientThrottlingManagerImpl() {
        this.zza = com.google.android.gms.libs.throttling.zza.zza();
    }
}
