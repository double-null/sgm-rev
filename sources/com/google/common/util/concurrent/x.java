package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: Futures.java */
/* JADX INFO: loaded from: classes4.dex */
public final class x extends z {

    /* JADX INFO: compiled from: Futures.java */
    private static final class a<V> implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Future<V> f11889a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final v<? super V> f11890b;

        a(Future<V> future, v<? super V> vVar) {
            this.f11889a = future;
            this.f11890b = vVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable thA;
            Future<V> future = this.f11889a;
            if ((future instanceof com.google.common.util.concurrent.internal.a) && (thA = com.google.common.util.concurrent.internal.b.a((com.google.common.util.concurrent.internal.a) future)) != null) {
                this.f11890b.onFailure(thA);
                return;
            }
            try {
                this.f11890b.onSuccess(x.d(this.f11889a));
            } catch (ExecutionException e10) {
                this.f11890b.onFailure(e10.getCause());
            } catch (Throwable th) {
                this.f11890b.onFailure(th);
            }
        }

        public String toString() {
            return com.google.common.base.j.b(this).h(this.f11890b).toString();
        }
    }

    /* JADX INFO: compiled from: Futures.java */
    public static final class b<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f11891a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.google.common.collect.u<ListenableFuture<? extends V>> f11892b;

        /* synthetic */ b(boolean z10, com.google.common.collect.u uVar, w wVar) {
            this(z10, uVar);
        }

        public <C> ListenableFuture<C> a(Callable<C> callable, Executor executor) {
            return new m(this.f11892b, this.f11891a, executor, callable);
        }

        public <C> ListenableFuture<C> b(i<C> iVar, Executor executor) {
            return new m(this.f11892b, this.f11891a, executor, iVar);
        }

        private b(boolean z10, com.google.common.collect.u<ListenableFuture<? extends V>> uVar) {
            this.f11891a = z10;
            this.f11892b = uVar;
        }
    }

    /* JADX INFO: compiled from: Futures.java */
    private static final class c<V> extends com.google.common.util.concurrent.b.j<V> implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ListenableFuture<V> f11893a;

        c(ListenableFuture<V> listenableFuture) {
            this.f11893a = listenableFuture;
        }

        @Override // com.google.common.util.concurrent.b
        protected void afterDone() {
            this.f11893a = null;
        }

        @Override // com.google.common.util.concurrent.b
        protected String pendingToString() {
            ListenableFuture<V> listenableFuture = this.f11893a;
            if (listenableFuture == null) {
                return null;
            }
            return "delegate=[" + listenableFuture + "]";
        }

        @Override // java.lang.Runnable
        public void run() {
            ListenableFuture<V> listenableFuture = this.f11893a;
            if (listenableFuture != null) {
                setFuture(listenableFuture);
            }
        }
    }

    public static <V> void a(ListenableFuture<V> listenableFuture, v<? super V> vVar, Executor executor) {
        com.google.common.base.p.l(vVar);
        listenableFuture.addListener(new a(listenableFuture, vVar), executor);
    }

    public static <V, X extends Throwable> ListenableFuture<V> b(ListenableFuture<? extends V> listenableFuture, Class<X> cls, com.google.common.base.g<? super X, ? extends V> gVar, Executor executor) {
        return com.google.common.util.concurrent.a.f(listenableFuture, cls, gVar, executor);
    }

    public static <V, X extends Throwable> ListenableFuture<V> c(ListenableFuture<? extends V> listenableFuture, Class<X> cls, j<? super X, ? extends V> jVar, Executor executor) {
        return com.google.common.util.concurrent.a.g(listenableFuture, cls, jVar, executor);
    }

    public static <V> V d(Future<V> future) throws ExecutionException {
        com.google.common.base.p.u(future.isDone(), "Future was expected to be done: %s", future);
        return (V) n0.a(future);
    }

    public static <V> ListenableFuture<V> e() {
        a0.a<Object> aVar = a0.a.f11777a;
        return aVar != null ? aVar : new a0.a();
    }

    public static <V> ListenableFuture<V> f(Throwable th) {
        com.google.common.base.p.l(th);
        return new a0.b(th);
    }

    public static <V> ListenableFuture<V> g(V v10) {
        return v10 == null ? (ListenableFuture<V>) a0.f11774b : new a0(v10);
    }

    public static ListenableFuture<Void> h() {
        return a0.f11774b;
    }

    public static <V> ListenableFuture<V> i(ListenableFuture<V> listenableFuture) {
        if (listenableFuture.isDone()) {
            return listenableFuture;
        }
        c cVar = new c(listenableFuture);
        listenableFuture.addListener(cVar, g0.a());
        return cVar;
    }

    public static <O> ListenableFuture<O> j(Callable<O> callable, Executor executor) {
        m0 m0VarH = m0.h(callable);
        executor.execute(m0VarH);
        return m0VarH;
    }

    public static <O> ListenableFuture<O> k(i<O> iVar, Executor executor) {
        m0 m0VarF = m0.f(iVar);
        executor.execute(m0VarF);
        return m0VarF;
    }

    public static <I, O> ListenableFuture<O> l(ListenableFuture<I> listenableFuture, com.google.common.base.g<? super I, ? extends O> gVar, Executor executor) {
        return d.f(listenableFuture, gVar, executor);
    }

    public static <I, O> ListenableFuture<O> m(ListenableFuture<I> listenableFuture, j<? super I, ? extends O> jVar, Executor executor) {
        return d.g(listenableFuture, jVar, executor);
    }

    public static <V> b<V> n(Iterable<? extends ListenableFuture<? extends V>> iterable) {
        return new b<>(false, com.google.common.collect.u.z(iterable), null);
    }

    public static <V> b<V> o(Iterable<? extends ListenableFuture<? extends V>> iterable) {
        return new b<>(true, com.google.common.collect.u.z(iterable), null);
    }
}
