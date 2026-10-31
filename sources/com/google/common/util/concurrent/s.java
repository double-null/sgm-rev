package com.google.common.util.concurrent;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: ForwardingFluentFuture.java */
/* JADX INFO: loaded from: classes4.dex */
final class s<V> extends r<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ListenableFuture<V> f11887a;

    s(ListenableFuture<V> listenableFuture) {
        this.f11887a = (ListenableFuture) com.google.common.base.p.l(listenableFuture);
    }

    @Override // com.google.common.util.concurrent.b, com.google.common.util.concurrent.ListenableFuture
    public void addListener(Runnable runnable, Executor executor) {
        this.f11887a.addListener(runnable, executor);
    }

    @Override // com.google.common.util.concurrent.b, java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        return this.f11887a.cancel(z10);
    }

    @Override // com.google.common.util.concurrent.b, java.util.concurrent.Future
    public V get() throws ExecutionException, InterruptedException {
        return this.f11887a.get();
    }

    @Override // com.google.common.util.concurrent.b, java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f11887a.isCancelled();
    }

    @Override // com.google.common.util.concurrent.b, java.util.concurrent.Future
    public boolean isDone() {
        return this.f11887a.isDone();
    }

    @Override // com.google.common.util.concurrent.b
    public String toString() {
        return this.f11887a.toString();
    }

    @Override // com.google.common.util.concurrent.b, java.util.concurrent.Future
    public V get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.f11887a.get(j10, timeUnit);
    }
}
