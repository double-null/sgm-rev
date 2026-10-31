package ud;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: DefaultExecutor.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class t0 extends l1 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final t0 f26817i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f26818j;

    static {
        Long l10;
        t0 t0Var = new t0();
        f26817i = t0Var;
        k1.w0(t0Var, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l10 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l10 = 1000L;
        }
        f26818j = timeUnit.toNanos(l10.longValue());
    }

    private t0() {
    }

    private final synchronized void W0() {
        if (Z0()) {
            debugStatus = 3;
            Q0();
            kotlin.jvm.internal.t.d(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    private final synchronized Thread X0() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setContextClassLoader(f26817i.getClass().getClassLoader());
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    private final boolean Y0() {
        return debugStatus == 4;
    }

    private final boolean Z0() {
        int i10 = debugStatus;
        return i10 == 2 || i10 == 3;
    }

    private final synchronized boolean a1() {
        if (Z0()) {
            return false;
        }
        debugStatus = 1;
        kotlin.jvm.internal.t.d(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return true;
    }

    private final void b1() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // ud.m1
    protected Thread C0() {
        Thread thread = _thread;
        return thread == null ? X0() : thread;
    }

    @Override // ud.m1
    protected void D0(long j10, l1.c cVar) {
        b1();
    }

    @Override // ud.l1
    public void I0(Runnable runnable) {
        if (Y0()) {
            b1();
        }
        super.I0(runnable);
    }

    @Override // ud.l1, ud.x0
    public g1 L(long j10, Runnable runnable, zc.j jVar) {
        return T0(j10, runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zO0;
        v2.f26824a.d(this);
        c.a();
        try {
            if (!a1()) {
                if (zO0) {
                    return;
                } else {
                    return;
                }
            }
            long j10 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long jZ0 = z0();
                if (jZ0 == Long.MAX_VALUE) {
                    c.a();
                    long jNanoTime = System.nanoTime();
                    if (j10 == Long.MAX_VALUE) {
                        j10 = f26818j + jNanoTime;
                    }
                    long j11 = j10 - jNanoTime;
                    if (j11 <= 0) {
                        if (zO0) {
                            return;
                        } else {
                            return;
                        }
                    }
                    jZ0 = od.k.g(jZ0, j11);
                } else {
                    j10 = Long.MAX_VALUE;
                }
                if (jZ0 > 0) {
                    if (Z0()) {
                        if (zO0) {
                            return;
                        } else {
                            return;
                        }
                    } else {
                        c.a();
                        LockSupport.parkNanos(this, jZ0);
                    }
                }
            }
        } finally {
            _thread = null;
            W0();
            c.a();
            if (!O0()) {
                C0();
            }
        }
    }

    @Override // ud.l1, ud.k1
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // ud.k0
    public String toString() {
        return "DefaultExecutor";
    }
}
