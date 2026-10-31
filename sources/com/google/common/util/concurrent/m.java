package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: CombinedFuture.java */
/* JADX INFO: loaded from: classes4.dex */
final class m<V> extends g<Object, V> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private m<V>.c<?> f11852i;

    /* JADX INFO: compiled from: CombinedFuture.java */
    private final class a extends m<V>.c<ListenableFuture<V>> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final i<V> f11853e;

        a(i<V> iVar, Executor executor) {
            super(executor);
            this.f11853e = (i) com.google.common.base.p.l(iVar);
        }

        @Override // com.google.common.util.concurrent.b0
        String k() {
            return this.f11853e.toString();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.util.concurrent.b0
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public ListenableFuture<V> h() throws Exception {
            return (ListenableFuture) com.google.common.base.p.n(this.f11853e.call(), "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.f11853e);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.util.concurrent.m.c
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public void s(ListenableFuture<V> listenableFuture) {
            m.this.setFuture(listenableFuture);
        }
    }

    /* JADX INFO: compiled from: CombinedFuture.java */
    private final class b extends m<V>.c<V> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Callable<V> f11855e;

        b(Callable<V> callable, Executor executor) {
            super(executor);
            this.f11855e = (Callable) com.google.common.base.p.l(callable);
        }

        @Override // com.google.common.util.concurrent.b0
        V h() throws Exception {
            return this.f11855e.call();
        }

        @Override // com.google.common.util.concurrent.b0
        String k() {
            return this.f11855e.toString();
        }

        @Override // com.google.common.util.concurrent.m.c
        void s(V v10) {
            m.this.set(v10);
        }
    }

    /* JADX INFO: compiled from: CombinedFuture.java */
    private abstract class c<T> extends b0<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Executor f11857c;

        c(Executor executor) {
            this.f11857c = (Executor) com.google.common.base.p.l(executor);
        }

        @Override // com.google.common.util.concurrent.b0
        final void c(Throwable th) {
            m.this.f11852i = null;
            if (th instanceof ExecutionException) {
                m.this.setException(((ExecutionException) th).getCause());
            } else if (th instanceof CancellationException) {
                m.this.cancel(false);
            } else {
                m.this.setException(th);
            }
        }

        @Override // com.google.common.util.concurrent.b0
        final void e(T t10) {
            m.this.f11852i = null;
            s(t10);
        }

        @Override // com.google.common.util.concurrent.b0
        final boolean g() {
            return m.this.isDone();
        }

        final void o() {
            try {
                this.f11857c.execute(this);
            } catch (RejectedExecutionException e10) {
                m.this.setException(e10);
            }
        }

        abstract void s(T t10);
    }

    m(com.google.common.collect.s<? extends ListenableFuture<?>> sVar, boolean z10, Executor executor, i<V> iVar) {
        super(sVar, z10, false);
        this.f11852i = new a(iVar, executor);
        r();
    }

    @Override // com.google.common.util.concurrent.b
    protected void interruptTask() {
        m<V>.c<?> cVar = this.f11852i;
        if (cVar != null) {
            cVar.f();
        }
    }

    @Override // com.google.common.util.concurrent.g
    void o() {
        m<V>.c<?> cVar = this.f11852i;
        if (cVar != null) {
            cVar.o();
        }
    }

    @Override // com.google.common.util.concurrent.g
    void x(g.a aVar) {
        super.x(aVar);
        if (aVar == g.a.OUTPUT_FUTURE_DONE) {
            this.f11852i = null;
        }
    }

    m(com.google.common.collect.s<? extends ListenableFuture<?>> sVar, boolean z10, Executor executor, Callable<V> callable) {
        super(sVar, z10, false);
        this.f11852i = new b(callable, executor);
        r();
    }

    @Override // com.google.common.util.concurrent.g
    void l(int i10, Object obj) {
    }
}
