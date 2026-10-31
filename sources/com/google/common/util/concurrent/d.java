package com.google.common.util.concurrent;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: AbstractTransformFuture.java */
/* JADX INFO: loaded from: classes4.dex */
abstract class d<I, O, F, T> extends r.a<O> implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ListenableFuture<? extends I> f11810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    F f11811b;

    /* JADX INFO: compiled from: AbstractTransformFuture.java */
    private static final class a<I, O> extends d<I, O, j<? super I, ? extends O>, ListenableFuture<? extends O>> {
        a(ListenableFuture<? extends I> listenableFuture, j<? super I, ? extends O> jVar) {
            super(listenableFuture, jVar);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.util.concurrent.d
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public ListenableFuture<? extends O> h(j<? super I, ? extends O> jVar, I i10) throws Exception {
            ListenableFuture<? extends O> listenableFutureApply = jVar.apply(i10);
            com.google.common.base.p.n(listenableFutureApply, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", jVar);
            return listenableFutureApply;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.util.concurrent.d
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(ListenableFuture<? extends O> listenableFuture) {
            setFuture(listenableFuture);
        }
    }

    /* JADX INFO: compiled from: AbstractTransformFuture.java */
    private static final class b<I, O> extends d<I, O, com.google.common.base.g<? super I, ? extends O>, O> {
        b(ListenableFuture<? extends I> listenableFuture, com.google.common.base.g<? super I, ? extends O> gVar) {
            super(listenableFuture, gVar);
        }

        @Override // com.google.common.util.concurrent.d
        void i(O o10) {
            set(o10);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.util.concurrent.d
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public O h(com.google.common.base.g<? super I, ? extends O> gVar, I i10) {
            return gVar.apply(i10);
        }
    }

    d(ListenableFuture<? extends I> listenableFuture, F f10) {
        this.f11810a = (ListenableFuture) com.google.common.base.p.l(listenableFuture);
        this.f11811b = (F) com.google.common.base.p.l(f10);
    }

    static <I, O> ListenableFuture<O> f(ListenableFuture<I> listenableFuture, com.google.common.base.g<? super I, ? extends O> gVar, Executor executor) {
        com.google.common.base.p.l(gVar);
        b bVar = new b(listenableFuture, gVar);
        listenableFuture.addListener(bVar, g0.d(executor, bVar));
        return bVar;
    }

    static <I, O> ListenableFuture<O> g(ListenableFuture<I> listenableFuture, j<? super I, ? extends O> jVar, Executor executor) {
        com.google.common.base.p.l(executor);
        a aVar = new a(listenableFuture, jVar);
        listenableFuture.addListener(aVar, g0.d(executor, aVar));
        return aVar;
    }

    @Override // com.google.common.util.concurrent.b
    protected final void afterDone() {
        maybePropagateCancellationTo(this.f11810a);
        this.f11810a = null;
        this.f11811b = null;
    }

    abstract T h(F f10, I i10) throws Exception;

    abstract void i(T t10);

    @Override // com.google.common.util.concurrent.b
    protected String pendingToString() {
        String str;
        ListenableFuture<? extends I> listenableFuture = this.f11810a;
        F f10 = this.f11811b;
        String strPendingToString = super.pendingToString();
        if (listenableFuture != null) {
            str = "inputFuture=[" + listenableFuture + "], ";
        } else {
            str = "";
        }
        if (f10 != null) {
            return str + "function=[" + f10 + "]";
        }
        if (strPendingToString == null) {
            return null;
        }
        return str + strPendingToString;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture<? extends I> listenableFuture = this.f11810a;
        F f10 = this.f11811b;
        if ((isCancelled() | (listenableFuture == null)) || (f10 == null)) {
            return;
        }
        this.f11810a = null;
        if (listenableFuture.isCancelled()) {
            setFuture(listenableFuture);
            return;
        }
        try {
            try {
                Object objH = h(f10, x.d(listenableFuture));
                this.f11811b = null;
                i(objH);
            } catch (Throwable th) {
                try {
                    j0.b(th);
                    setException(th);
                } finally {
                    this.f11811b = null;
                }
            }
        } catch (Error e10) {
            setException(e10);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e11) {
            setException(e11.getCause());
        } catch (Exception e12) {
            setException(e12);
        }
    }
}
