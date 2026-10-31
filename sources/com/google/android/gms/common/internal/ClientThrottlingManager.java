package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.11.0 */
/* JADX INFO: loaded from: classes3.dex */
public interface ClientThrottlingManager {
    public static final int NO_THROTTLING = Integer.MIN_VALUE;

    void release(int i10);

    int tryAcquire(int i10, ConnectionThrottlingConfig connectionThrottlingConfig);
}
