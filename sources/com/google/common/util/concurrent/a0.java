package com.google.common.util.concurrent;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: compiled from: ImmediateFuture.java */
/* JADX INFO: loaded from: classes4.dex */
class a0<V> implements ListenableFuture<V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final ListenableFuture<?> f11774b = new a0(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final c0 f11775c = new c0(a0.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final V f11776a;

    /* JADX INFO: compiled from: ImmediateFuture.java */
    static final class a<V> extends com.google.common.util.concurrent.b.j<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final a<Object> f11777a;

        static {
            f11777a = com.google.common.util.concurrent.b.GENERATE_CANCELLATION_CAUSES ? null : new a<>();
        }

        a() {
            cancel(false);
        }
    }

    /* JADX INFO: compiled from: ImmediateFuture.java */
    static final class b<V> extends com.google.common.util.concurrent.b.j<V> {
        b(Throwable th) {
            setException(th);
        }
    }

    a0(V v10) {
        this.f11776a = v10;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void addListener(Runnable runnable, Executor executor) {
        com.google.common.base.p.m(runnable, "Runnable was null.");
        com.google.common.base.p.m(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e10) {
            f11775c.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public V get() {
        return this.f11776a;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return true;
    }

    public String toString() {
        return super.toString() + "[status=SUCCESS, result=[" + this.f11776a + "]]";
    }

    @Override // java.util.concurrent.Future
    public V get(long j10, TimeUnit timeUnit) throws ExecutionException {
        com.google.common.base.p.l(timeUnit);
        return get();
    }
}
