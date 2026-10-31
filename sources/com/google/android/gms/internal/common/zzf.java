package com.google.android.gms.internal.common;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.11.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzf implements ThreadFactory {
    private final ThreadFactory zza = Executors.defaultThreadFactory();

    private zzf() {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.zza.newThread(runnable);
        if (threadNewThread == null) {
            throw new NullPointerException("Default ThreadFactory returned null thread");
        }
        threadNewThread.setName("punch".concat(String.valueOf(threadNewThread.getName())));
        return threadNewThread;
    }

    /* synthetic */ zzf(byte[] bArr) {
    }
}
