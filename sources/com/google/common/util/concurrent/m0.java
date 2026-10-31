package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: compiled from: TrustedListenableFutureTask.java */
/* JADX INFO: loaded from: classes4.dex */
class m0<V> extends r.a<V> implements RunnableFuture<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile b0<?> f11859a;

    /* JADX INFO: compiled from: TrustedListenableFutureTask.java */
    private final class a extends b0<ListenableFuture<V>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final i<V> f11860c;

        a(i<V> iVar) {
            this.f11860c = (i) com.google.common.base.p.l(iVar);
        }

        @Override // com.google.common.util.concurrent.b0
        void c(Throwable th) {
            m0.this.setException(th);
        }

        @Override // com.google.common.util.concurrent.b0
        final boolean g() {
            return m0.this.isDone();
        }

        @Override // com.google.common.util.concurrent.b0
        String k() {
            return this.f11860c.toString();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.util.concurrent.b0
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public void e(ListenableFuture<V> listenableFuture) {
            m0.this.setFuture(listenableFuture);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.util.concurrent.b0
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public ListenableFuture<V> h() throws Exception {
            return (ListenableFuture) com.google.common.base.p.n(this.f11860c.call(), "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.f11860c);
        }
    }

    /* JADX INFO: compiled from: TrustedListenableFutureTask.java */
    private final class b extends b0<V> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Callable<V> f11862c;

        b(Callable<V> callable) {
            this.f11862c = (Callable) com.google.common.base.p.l(callable);
        }

        @Override // com.google.common.util.concurrent.b0
        void c(Throwable th) {
            m0.this.setException(th);
        }

        @Override // com.google.common.util.concurrent.b0
        void e(V v10) {
            m0.this.set(v10);
        }

        @Override // com.google.common.util.concurrent.b0
        final boolean g() {
            return m0.this.isDone();
        }

        @Override // com.google.common.util.concurrent.b0
        V h() throws Exception {
            return this.f11862c.call();
        }

        @Override // com.google.common.util.concurrent.b0
        String k() {
            return this.f11862c.toString();
        }
    }

    m0(Callable<V> callable) {
        this.f11859a = new b(callable);
    }

    static <V> m0<V> f(i<V> iVar) {
        return new m0<>(iVar);
    }

    static <V> m0<V> g(Runnable runnable, V v10) {
        return new m0<>(Executors.callable(runnable, v10));
    }

    static <V> m0<V> h(Callable<V> callable) {
        return new m0<>(callable);
    }

    @Override // com.google.common.util.concurrent.b
    protected void afterDone() {
        b0<?> b0Var;
        super.afterDone();
        if (wasInterrupted() && (b0Var = this.f11859a) != null) {
            b0Var.f();
        }
        this.f11859a = null;
    }

    @Override // com.google.common.util.concurrent.b
    protected String pendingToString() {
        b0<?> b0Var = this.f11859a;
        if (b0Var == null) {
            return super.pendingToString();
        }
        return "task=[" + b0Var + "]";
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public void run() {
        b0<?> b0Var = this.f11859a;
        if (b0Var != null) {
            b0Var.run();
        }
        this.f11859a = null;
    }

    m0(i<V> iVar) {
        this.f11859a = new a(iVar);
    }
}
