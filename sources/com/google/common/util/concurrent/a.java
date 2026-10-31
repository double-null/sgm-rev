package com.google.common.util.concurrent;

import java.lang.Throwable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: AbstractCatchingFuture.java */
/* JADX INFO: loaded from: classes4.dex */
abstract class a<V, X extends Throwable, F, T> extends r.a<V> implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ListenableFuture<? extends V> f11771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Class<X> f11772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    F f11773c;

    /* JADX INFO: renamed from: com.google.common.util.concurrent.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AbstractCatchingFuture.java */
    private static final class C0147a<V, X extends Throwable> extends a<V, X, j<? super X, ? extends V>, ListenableFuture<? extends V>> {
        C0147a(ListenableFuture<? extends V> listenableFuture, Class<X> cls, j<? super X, ? extends V> jVar) {
            super(listenableFuture, cls, jVar);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.util.concurrent.a
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public ListenableFuture<? extends V> h(j<? super X, ? extends V> jVar, X x10) throws Exception {
            ListenableFuture<? extends V> listenableFutureApply = jVar.apply(x10);
            com.google.common.base.p.n(listenableFutureApply, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", jVar);
            return listenableFutureApply;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.util.concurrent.a
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(ListenableFuture<? extends V> listenableFuture) {
            setFuture(listenableFuture);
        }
    }

    /* JADX INFO: compiled from: AbstractCatchingFuture.java */
    private static final class b<V, X extends Throwable> extends a<V, X, com.google.common.base.g<? super X, ? extends V>, V> {
        b(ListenableFuture<? extends V> listenableFuture, Class<X> cls, com.google.common.base.g<? super X, ? extends V> gVar) {
            super(listenableFuture, cls, gVar);
        }

        @Override // com.google.common.util.concurrent.a
        void i(V v10) {
            set(v10);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.util.concurrent.a
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public V h(com.google.common.base.g<? super X, ? extends V> gVar, X x10) throws Exception {
            return gVar.apply(x10);
        }
    }

    a(ListenableFuture<? extends V> listenableFuture, Class<X> cls, F f10) {
        this.f11771a = (ListenableFuture) com.google.common.base.p.l(listenableFuture);
        this.f11772b = (Class) com.google.common.base.p.l(cls);
        this.f11773c = (F) com.google.common.base.p.l(f10);
    }

    static <V, X extends Throwable> ListenableFuture<V> f(ListenableFuture<? extends V> listenableFuture, Class<X> cls, com.google.common.base.g<? super X, ? extends V> gVar, Executor executor) {
        b bVar = new b(listenableFuture, cls, gVar);
        listenableFuture.addListener(bVar, g0.d(executor, bVar));
        return bVar;
    }

    static <X extends Throwable, V> ListenableFuture<V> g(ListenableFuture<? extends V> listenableFuture, Class<X> cls, j<? super X, ? extends V> jVar, Executor executor) {
        C0147a c0147a = new C0147a(listenableFuture, cls, jVar);
        listenableFuture.addListener(c0147a, g0.d(executor, c0147a));
        return c0147a;
    }

    @Override // com.google.common.util.concurrent.b
    protected final void afterDone() {
        maybePropagateCancellationTo(this.f11771a);
        this.f11771a = null;
        this.f11772b = null;
        this.f11773c = null;
    }

    abstract T h(F f10, X x10) throws Exception;

    abstract void i(T t10);

    @Override // com.google.common.util.concurrent.b
    protected String pendingToString() {
        String str;
        ListenableFuture<? extends V> listenableFuture = this.f11771a;
        Class<X> cls = this.f11772b;
        F f10 = this.f11773c;
        String strPendingToString = super.pendingToString();
        if (listenableFuture != null) {
            str = "inputFuture=[" + listenableFuture + "], ";
        } else {
            str = "";
        }
        if (cls == null || f10 == null) {
            if (strPendingToString == null) {
                return null;
            }
            return str + strPendingToString;
        }
        return str + "exceptionType=[" + cls + "], fallback=[" + f10 + "]";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [F, java.lang.Class<X extends java.lang.Throwable>] */
    @Override // java.lang.Runnable
    public final void run() {
        Object objD;
        ListenableFuture<? extends V> listenableFuture = this.f11771a;
        Class<X> cls = this.f11772b;
        F f10 = this.f11773c;
        if (((f10 == null) || ((listenableFuture == 0) | (cls == null))) || isCancelled()) {
            return;
        }
        ?? r10 = (Class<X>) null;
        this.f11771a = null;
        try {
            th = listenableFuture instanceof com.google.common.util.concurrent.internal.a ? com.google.common.util.concurrent.internal.b.a((com.google.common.util.concurrent.internal.a) listenableFuture) : null;
            objD = th == null ? x.d(listenableFuture) : null;
        } catch (ExecutionException e10) {
            Throwable cause = e10.getCause();
            if (cause == null) {
                cause = new NullPointerException("Future type " + listenableFuture.getClass() + " threw " + e10.getClass() + " without a cause");
            }
            th = cause;
        } catch (Throwable th) {
            th = th;
        }
        if (th == null) {
            set(h0.a(objD));
            return;
        }
        if (!j0.a(th, cls)) {
            setFuture(listenableFuture);
            return;
        }
        try {
            Object objH = h(f10, th);
            this.f11772b = null;
            this.f11773c = null;
            i(objH);
        } catch (Throwable th2) {
            try {
                j0.b(th2);
                setException(th2);
            } finally {
                this.f11772b = null;
                this.f11773c = null;
            }
        }
    }
}
