package com.google.android.gms.libs.throttling;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.11.0 */
/* JADX INFO: loaded from: classes3.dex */
public interface GmsThrottler {
    void release(long j10);

    boolean tryAcquire(long j10, ThrottlingLimits throttlingLimits);
}
