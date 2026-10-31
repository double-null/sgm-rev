package com.google.common.util.concurrent;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: FluentFuture.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class r<V> extends y<V> {

    /* JADX INFO: compiled from: FluentFuture.java */
    static abstract class a<V> extends r<V> implements b.i<V> {
        a() {
        }

        @Override // com.google.common.util.concurrent.b, com.google.common.util.concurrent.ListenableFuture
        public final void addListener(Runnable runnable, Executor executor) {
            super.addListener(runnable, executor);
        }

        @Override // com.google.common.util.concurrent.b, java.util.concurrent.Future
        public final boolean cancel(boolean z10) {
            return super.cancel(z10);
        }

        @Override // com.google.common.util.concurrent.b, java.util.concurrent.Future
        public final V get() throws ExecutionException, InterruptedException {
            return (V) super.get();
        }

        @Override // com.google.common.util.concurrent.b, java.util.concurrent.Future
        public final boolean isCancelled() {
            return super.isCancelled();
        }

        @Override // com.google.common.util.concurrent.b, java.util.concurrent.Future
        public final boolean isDone() {
            return super.isDone();
        }

        @Override // com.google.common.util.concurrent.b, java.util.concurrent.Future
        public final V get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
            return (V) super.get(j10, timeUnit);
        }
    }

    r() {
    }

    public static <V> r<V> c(ListenableFuture<V> listenableFuture) {
        return listenableFuture instanceof r ? (r) listenableFuture : new s(listenableFuture);
    }

    public final <X extends Throwable> r<V> a(Class<X> cls, com.google.common.base.g<? super X, ? extends V> gVar, Executor executor) {
        return (r) x.b(this, cls, gVar, executor);
    }

    public final <T> r<T> d(com.google.common.base.g<? super V, T> gVar, Executor executor) {
        return (r) x.l(this, gVar, executor);
    }

    public final <T> r<T> e(j<? super V, T> jVar, Executor executor) {
        return (r) x.m(this, jVar, executor);
    }
}
