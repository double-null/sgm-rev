package com.google.common.util.concurrent;

import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: ListeningExecutorService.java */
/* JADX INFO: loaded from: classes4.dex */
public interface e0 extends ExecutorService {
    ListenableFuture<?> submit(Runnable runnable);
}
