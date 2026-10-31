package af;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import wc.g0;

/* JADX INFO: compiled from: AsyncTimeout.kt */
/* JADX INFO: loaded from: classes5.dex */
public class c extends d0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f334i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final ReentrantLock f335j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Condition f336k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f337l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final long f338m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static c f339n;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f340f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private c f341g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f342h;

    /* JADX INFO: compiled from: AsyncTimeout.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean d(c cVar) {
            ReentrantLock reentrantLockF = c.f334i.f();
            reentrantLockF.lock();
            try {
                if (!cVar.f340f) {
                    return false;
                }
                cVar.f340f = false;
                for (c cVar2 = c.f339n; cVar2 != null; cVar2 = cVar2.f341g) {
                    if (cVar2.f341g == cVar) {
                        cVar2.f341g = cVar.f341g;
                        cVar.f341g = null;
                        return false;
                    }
                }
                return true;
            } finally {
                reentrantLockF.unlock();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void g(c cVar, long j10, boolean z10) {
            ReentrantLock reentrantLockF = c.f334i.f();
            reentrantLockF.lock();
            try {
                if (!(!cVar.f340f)) {
                    throw new IllegalStateException("Unbalanced enter/exit".toString());
                }
                cVar.f340f = true;
                if (c.f339n == null) {
                    c.f339n = new c();
                    new b().start();
                }
                long jNanoTime = System.nanoTime();
                if (j10 != 0 && z10) {
                    cVar.f342h = Math.min(j10, cVar.c() - jNanoTime) + jNanoTime;
                } else if (j10 != 0) {
                    cVar.f342h = j10 + jNanoTime;
                } else {
                    if (!z10) {
                        throw new AssertionError();
                    }
                    cVar.f342h = cVar.c();
                }
                long jY = cVar.y(jNanoTime);
                c cVar2 = c.f339n;
                kotlin.jvm.internal.t.c(cVar2);
                while (cVar2.f341g != null) {
                    c cVar3 = cVar2.f341g;
                    kotlin.jvm.internal.t.c(cVar3);
                    if (jY < cVar3.y(jNanoTime)) {
                        break;
                    }
                    cVar2 = cVar2.f341g;
                    kotlin.jvm.internal.t.c(cVar2);
                }
                cVar.f341g = cVar2.f341g;
                cVar2.f341g = cVar;
                if (cVar2 == c.f339n) {
                    c.f334i.e().signal();
                }
                g0 g0Var = g0.f27756a;
                reentrantLockF.unlock();
            } catch (Throwable th) {
                reentrantLockF.unlock();
                throw th;
            }
        }

        public final c c() throws InterruptedException {
            c cVar = c.f339n;
            kotlin.jvm.internal.t.c(cVar);
            c cVar2 = cVar.f341g;
            if (cVar2 == null) {
                long jNanoTime = System.nanoTime();
                e().await(c.f337l, TimeUnit.MILLISECONDS);
                c cVar3 = c.f339n;
                kotlin.jvm.internal.t.c(cVar3);
                if (cVar3.f341g != null || System.nanoTime() - jNanoTime < c.f338m) {
                    return null;
                }
                return c.f339n;
            }
            long jY = cVar2.y(System.nanoTime());
            if (jY > 0) {
                e().await(jY, TimeUnit.NANOSECONDS);
                return null;
            }
            c cVar4 = c.f339n;
            kotlin.jvm.internal.t.c(cVar4);
            cVar4.f341g = cVar2.f341g;
            cVar2.f341g = null;
            return cVar2;
        }

        public final Condition e() {
            return c.f336k;
        }

        public final ReentrantLock f() {
            return c.f335j;
        }
    }

    /* JADX INFO: compiled from: AsyncTimeout.kt */
    private static final class b extends Thread {
        public b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (true) {
                try {
                    a aVar = c.f334i;
                    ReentrantLock reentrantLockF = aVar.f();
                    reentrantLockF.lock();
                    try {
                        c cVarC = aVar.c();
                        if (cVarC == c.f339n) {
                            c.f339n = null;
                            reentrantLockF.unlock();
                            return;
                        } else {
                            g0 g0Var = g0.f27756a;
                            reentrantLockF.unlock();
                            if (cVarC != null) {
                                cVarC.B();
                            }
                        }
                    } catch (Throwable th) {
                        reentrantLockF.unlock();
                        throw th;
                    }
                } catch (InterruptedException unused) {
                    continue;
                }
            }
        }
    }

    /* JADX INFO: renamed from: af.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AsyncTimeout.kt */
    public static final class C0007c implements a0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a0 f344b;

        C0007c(a0 a0Var) {
            this.f344b = a0Var;
        }

        @Override // af.a0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public c timeout() {
            return c.this;
        }

        @Override // af.a0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            c cVar = c.this;
            a0 a0Var = this.f344b;
            cVar.v();
            try {
                try {
                    a0Var.close();
                    g0 g0Var = g0.f27756a;
                    if (cVar.w()) {
                        throw cVar.p(null);
                    }
                } catch (IOException e10) {
                    if (!cVar.w()) {
                        throw e10;
                    }
                    throw cVar.p(e10);
                }
            } catch (Throwable th) {
                cVar.w();
                throw th;
            }
        }

        @Override // af.a0, java.io.Flushable
        public void flush() throws IOException {
            c cVar = c.this;
            a0 a0Var = this.f344b;
            cVar.v();
            try {
                try {
                    a0Var.flush();
                    g0 g0Var = g0.f27756a;
                    if (cVar.w()) {
                        throw cVar.p(null);
                    }
                } catch (IOException e10) {
                    if (!cVar.w()) {
                        throw e10;
                    }
                    throw cVar.p(e10);
                }
            } catch (Throwable th) {
                cVar.w();
                throw th;
            }
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f344b + ')';
        }

        @Override // af.a0
        public void y(e source, long j10) throws IOException {
            kotlin.jvm.internal.t.f(source, "source");
            af.b.b(source.size(), 0L, j10);
            while (true) {
                long j11 = 0;
                if (j10 <= 0) {
                    return;
                }
                x xVar = source.f352a;
                kotlin.jvm.internal.t.c(xVar);
                while (j11 < 65536) {
                    j11 += (long) (xVar.f403c - xVar.f402b);
                    if (j11 >= j10) {
                        j11 = j10;
                        break;
                    } else {
                        xVar = xVar.f406f;
                        kotlin.jvm.internal.t.c(xVar);
                    }
                }
                c cVar = c.this;
                a0 a0Var = this.f344b;
                cVar.v();
                try {
                    try {
                        a0Var.y(source, j11);
                        g0 g0Var = g0.f27756a;
                        if (cVar.w()) {
                            throw cVar.p(null);
                        }
                        j10 -= j11;
                    } catch (IOException e10) {
                        if (!cVar.w()) {
                            throw e10;
                        }
                        throw cVar.p(e10);
                    }
                } catch (Throwable th) {
                    cVar.w();
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: compiled from: AsyncTimeout.kt */
    public static final class d implements c0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c0 f346b;

        d(c0 c0Var) {
            this.f346b = c0Var;
        }

        @Override // af.c0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public c timeout() {
            return c.this;
        }

        @Override // af.c0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            c cVar = c.this;
            c0 c0Var = this.f346b;
            cVar.v();
            try {
                try {
                    c0Var.close();
                    g0 g0Var = g0.f27756a;
                    if (cVar.w()) {
                        throw cVar.p(null);
                    }
                } catch (IOException e10) {
                    if (!cVar.w()) {
                        throw e10;
                    }
                    throw cVar.p(e10);
                }
            } catch (Throwable th) {
                cVar.w();
                throw th;
            }
        }

        @Override // af.c0
        public long read(e sink, long j10) throws IOException {
            kotlin.jvm.internal.t.f(sink, "sink");
            c cVar = c.this;
            c0 c0Var = this.f346b;
            cVar.v();
            try {
                try {
                    long j11 = c0Var.read(sink, j10);
                    if (cVar.w()) {
                        throw cVar.p(null);
                    }
                    return j11;
                } catch (IOException e10) {
                    if (cVar.w()) {
                        throw cVar.p(e10);
                    }
                    throw e10;
                }
            } catch (Throwable th) {
                cVar.w();
                throw th;
            }
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f346b + ')';
        }
    }

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f335j = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        kotlin.jvm.internal.t.e(conditionNewCondition, "lock.newCondition()");
        f336k = conditionNewCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f337l = millis;
        f338m = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long y(long j10) {
        return this.f342h - j10;
    }

    public final c0 A(c0 source) {
        kotlin.jvm.internal.t.f(source, "source");
        return new d(source);
    }

    public final IOException p(IOException iOException) {
        return x(iOException);
    }

    public final void v() {
        long jH = h();
        boolean zE = e();
        if (jH != 0 || zE) {
            f334i.g(this, jH, zE);
        }
    }

    public final boolean w() {
        return f334i.d(this);
    }

    protected IOException x(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final a0 z(a0 sink) {
        kotlin.jvm.internal.t.f(sink, "sink");
        return new C0007c(sink);
    }

    protected void B() {
    }
}
