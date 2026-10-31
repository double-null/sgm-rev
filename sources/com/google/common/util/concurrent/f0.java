package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: ListeningScheduledExecutorService.java */
/* JADX INFO: loaded from: classes4.dex */
public interface f0 extends ScheduledExecutorService, e0 {
    @Override // java.util.concurrent.ScheduledExecutorService
    d0<?> schedule(Runnable runnable, long j10, TimeUnit timeUnit);

    @Override // java.util.concurrent.ScheduledExecutorService
    <V> d0<V> schedule(Callable<V> callable, long j10, TimeUnit timeUnit);
}
