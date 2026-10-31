package com.google.common.util.concurrent;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: SettableFuture.java */
/* JADX INFO: loaded from: classes4.dex */
public final class l0<V> extends b.j<V> {
    private l0() {
    }

    public static <V> l0<V> a() {
        return new l0<>();
    }

    @Override // com.google.common.util.concurrent.b.j, com.google.common.util.concurrent.b, com.google.common.util.concurrent.ListenableFuture
    public /* bridge */ /* synthetic */ void addListener(Runnable runnable, Executor executor) {
        super.addListener(runnable, executor);
    }

    @Override // com.google.common.util.concurrent.b.j, com.google.common.util.concurrent.b, java.util.concurrent.Future
    public /* bridge */ /* synthetic */ boolean isCancelled() {
        return super.isCancelled();
    }

    @Override // com.google.common.util.concurrent.b.j, com.google.common.util.concurrent.b, java.util.concurrent.Future
    public /* bridge */ /* synthetic */ boolean isDone() {
        return super.isDone();
    }

    @Override // com.google.common.util.concurrent.b
    public boolean set(V v10) {
        return super.set(v10);
    }

    @Override // com.google.common.util.concurrent.b
    public boolean setException(Throwable th) {
        return super.setException(th);
    }

    @Override // com.google.common.util.concurrent.b
    public boolean setFuture(ListenableFuture<? extends V> listenableFuture) {
        return super.setFuture(listenableFuture);
    }
}
