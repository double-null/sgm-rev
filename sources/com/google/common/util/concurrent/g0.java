package com.google.common.util.concurrent;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: MoreExecutors.java */
/* JADX INFO: loaded from: classes4.dex */
public final class g0 {

    /* JADX INFO: compiled from: MoreExecutors.java */
    class a implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Executor f11824a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.google.common.util.concurrent.b f11825b;

        a(Executor executor, com.google.common.util.concurrent.b bVar) {
            this.f11824a = executor;
            this.f11825b = bVar;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            try {
                this.f11824a.execute(runnable);
            } catch (RejectedExecutionException e10) {
                this.f11825b.setException(e10);
            }
        }
    }

    /* JADX INFO: compiled from: MoreExecutors.java */
    private static class b extends com.google.common.util.concurrent.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ExecutorService f11826a;

        b(ExecutorService executorService) {
            this.f11826a = (ExecutorService) com.google.common.base.p.l(executorService);
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean awaitTermination(long j10, TimeUnit timeUnit) throws InterruptedException {
            return this.f11826a.awaitTermination(j10, timeUnit);
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.f11826a.execute(runnable);
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isShutdown() {
            return this.f11826a.isShutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isTerminated() {
            return this.f11826a.isTerminated();
        }

        @Override // java.util.concurrent.ExecutorService
        public final void shutdown() {
            this.f11826a.shutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public final List<Runnable> shutdownNow() {
            return this.f11826a.shutdownNow();
        }

        public final String toString() {
            return super.toString() + "[" + this.f11826a + "]";
        }
    }

    public static Executor a() {
        return n.INSTANCE;
    }

    public static f0 b(ScheduledExecutorService scheduledExecutorService) {
        return scheduledExecutorService instanceof f0 ? (f0) scheduledExecutorService : new c(scheduledExecutorService);
    }

    public static Executor c(Executor executor) {
        return new k0(executor);
    }

    static Executor d(Executor executor, com.google.common.util.concurrent.b<?> bVar) {
        com.google.common.base.p.l(executor);
        com.google.common.base.p.l(bVar);
        return executor == a() ? executor : new a(executor, bVar);
    }

    /* JADX INFO: compiled from: MoreExecutors.java */
    private static final class c extends b implements f0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ScheduledExecutorService f11827b;

        /* JADX INFO: compiled from: MoreExecutors.java */
        private static final class a<V> extends u.a<V> implements d0<V> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final ScheduledFuture<?> f11828b;

            public a(ListenableFuture<V> listenableFuture, ScheduledFuture<?> scheduledFuture) {
                super(listenableFuture);
                this.f11828b = scheduledFuture;
            }

            @Override // com.google.common.util.concurrent.t, java.util.concurrent.Future
            public boolean cancel(boolean z10) {
                boolean zCancel = super.cancel(z10);
                if (zCancel) {
                    this.f11828b.cancel(z10);
                }
                return zCancel;
            }

            @Override // java.lang.Comparable
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public int compareTo(Delayed delayed) {
                return this.f11828b.compareTo(delayed);
            }

            @Override // java.util.concurrent.Delayed
            public long getDelay(TimeUnit timeUnit) {
                return this.f11828b.getDelay(timeUnit);
            }
        }

        /* JADX INFO: compiled from: MoreExecutors.java */
        private static final class b extends com.google.common.util.concurrent.b.j<Void> implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Runnable f11829a;

            public b(Runnable runnable) {
                this.f11829a = (Runnable) com.google.common.base.p.l(runnable);
            }

            @Override // com.google.common.util.concurrent.b
            protected String pendingToString() {
                return "task=[" + this.f11829a + "]";
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    this.f11829a.run();
                } catch (Throwable th) {
                    setException(th);
                    throw th;
                }
            }
        }

        c(ScheduledExecutorService scheduledExecutorService) {
            super(scheduledExecutorService);
            this.f11827b = (ScheduledExecutorService) com.google.common.base.p.l(scheduledExecutorService);
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public d0<?> scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
            b bVar = new b(runnable);
            return new a(bVar, this.f11827b.scheduleAtFixedRate(bVar, j10, j11, timeUnit));
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public d0<?> scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
            b bVar = new b(runnable);
            return new a(bVar, this.f11827b.scheduleWithFixedDelay(bVar, j10, j11, timeUnit));
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public d0<?> schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
            m0 m0VarG = m0.g(runnable, null);
            return new a(m0VarG, this.f11827b.schedule(m0VarG, j10, timeUnit));
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public <V> d0<V> schedule(Callable<V> callable, long j10, TimeUnit timeUnit) {
            m0 m0VarH = m0.h(callable);
            return new a(m0VarH, this.f11827b.schedule(m0VarH, j10, timeUnit));
        }
    }
}
