package ud;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: Executors.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class s1 extends r1 implements x0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Executor f26815d;

    public s1(Executor executor) {
        this.f26815d = executor;
        if (r0() instanceof ScheduledThreadPoolExecutor) {
            ((ScheduledThreadPoolExecutor) r0()).setRemoveOnCancelPolicy(true);
        }
    }

    private final void q0(zc.j jVar, RejectedExecutionException rejectedExecutionException) {
        d2.c(jVar, p1.a("The task was rejected", rejectedExecutionException));
    }

    private final ScheduledFuture<?> s0(ScheduledExecutorService scheduledExecutorService, Runnable runnable, zc.j jVar, long j10) {
        try {
            return scheduledExecutorService.schedule(runnable, j10, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            q0(jVar, e10);
            return null;
        }
    }

    @Override // ud.x0
    public g1 L(long j10, Runnable runnable, zc.j jVar) {
        Executor executorR0 = r0();
        ScheduledExecutorService scheduledExecutorService = executorR0 instanceof ScheduledExecutorService ? (ScheduledExecutorService) executorR0 : null;
        ScheduledFuture<?> scheduledFutureS0 = scheduledExecutorService != null ? s0(scheduledExecutorService, runnable, jVar, j10) : null;
        return scheduledFutureS0 != null ? new f1(scheduledFutureS0) : t0.f26817i.L(j10, runnable, jVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Executor executorR0 = r0();
        ExecutorService executorService = executorR0 instanceof ExecutorService ? (ExecutorService) executorR0 : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof s1) && ((s1) obj).r0() == r0();
    }

    public int hashCode() {
        return System.identityHashCode(r0());
    }

    @Override // ud.k0
    public void m0(zc.j jVar, Runnable runnable) {
        try {
            Executor executorR0 = r0();
            c.a();
            executorR0.execute(runnable);
        } catch (RejectedExecutionException e10) {
            c.a();
            q0(jVar, e10);
            e1.b().m0(jVar, runnable);
        }
    }

    public Executor r0() {
        return this.f26815d;
    }

    @Override // ud.k0
    public String toString() {
        return r0().toString();
    }

    @Override // ud.x0
    public void u(long j10, n<? super wc.g0> nVar) {
        Executor executorR0 = r0();
        ScheduledExecutorService scheduledExecutorService = executorR0 instanceof ScheduledExecutorService ? (ScheduledExecutorService) executorR0 : null;
        ScheduledFuture<?> scheduledFutureS0 = scheduledExecutorService != null ? s0(scheduledExecutorService, new q2(this, nVar), nVar.getContext(), j10) : null;
        if (scheduledFutureS0 != null) {
            r.c(nVar, new l(scheduledFutureS0));
        } else {
            t0.f26817i.u(j10, nVar);
        }
    }
}
