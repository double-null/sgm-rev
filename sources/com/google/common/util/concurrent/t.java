package com.google.common.util.concurrent;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: ForwardingFuture.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class t<V> extends com.google.common.collect.q implements Future<V> {
    protected t() {
    }

    protected abstract Future<? extends V> c();

    public boolean cancel(boolean z10) {
        return c().cancel(z10);
    }

    @Override // java.util.concurrent.Future
    public V get() throws ExecutionException, InterruptedException {
        return c().get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return c().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return c().isDone();
    }

    @Override // java.util.concurrent.Future
    public V get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return c().get(j10, timeUnit);
    }
}
