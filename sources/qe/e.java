package qe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import wc.g0;

/* JADX INFO: compiled from: TaskRunner.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f24784h = new b(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final e f24785i = new e(new c(ne.d.N(t.n(ne.d.f22999i, " TaskRunner"), true)));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Logger f24786j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f24787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f24788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f24789c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f24790d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<qe.d> f24791e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<qe.d> f24792f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Runnable f24793g;

    /* JADX INFO: compiled from: TaskRunner.kt */
    public interface a {
        void a(e eVar, long j10);

        void b(e eVar);

        void execute(Runnable runnable);

        long nanoTime();
    }

    /* JADX INFO: compiled from: TaskRunner.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(k kVar) {
            this();
        }

        public final Logger a() {
            return e.f24786j;
        }
    }

    /* JADX INFO: compiled from: TaskRunner.kt */
    public static final class c implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ThreadPoolExecutor f24794a;

        public c(ThreadFactory threadFactory) {
            t.f(threadFactory, "threadFactory");
            this.f24794a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        @Override // qe.e.a
        public void a(e taskRunner, long j10) throws InterruptedException {
            t.f(taskRunner, "taskRunner");
            long j11 = j10 / 1000000;
            long j12 = j10 - (1000000 * j11);
            if (j11 > 0 || j10 > 0) {
                taskRunner.wait(j11, (int) j12);
            }
        }

        @Override // qe.e.a
        public void b(e taskRunner) {
            t.f(taskRunner, "taskRunner");
            taskRunner.notify();
        }

        @Override // qe.e.a
        public void execute(Runnable runnable) {
            t.f(runnable, "runnable");
            this.f24794a.execute(runnable);
        }

        @Override // qe.e.a
        public long nanoTime() {
            return System.nanoTime();
        }
    }

    /* JADX INFO: compiled from: TaskRunner.kt */
    public static final class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            qe.a aVarD;
            long jNanoTime;
            while (true) {
                e eVar = e.this;
                synchronized (eVar) {
                    aVarD = eVar.d();
                }
                if (aVarD == null) {
                    return;
                }
                qe.d dVarD = aVarD.d();
                t.c(dVarD);
                e eVar2 = e.this;
                boolean zIsLoggable = e.f24784h.a().isLoggable(Level.FINE);
                if (zIsLoggable) {
                    jNanoTime = dVarD.h().g().nanoTime();
                    qe.b.c(aVarD, dVarD, "starting");
                } else {
                    jNanoTime = -1;
                }
                try {
                    eVar2.j(aVarD);
                    try {
                        g0 g0Var = g0.f27756a;
                        if (zIsLoggable) {
                            qe.b.c(aVarD, dVarD, t.n("finished run in ", qe.b.b(dVarD.h().g().nanoTime() - jNanoTime)));
                        }
                    } catch (Throwable th) {
                        if (zIsLoggable) {
                            qe.b.c(aVarD, dVarD, t.n("failed a run in ", qe.b.b(dVarD.h().g().nanoTime() - jNanoTime)));
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    eVar2.g().execute(this);
                    throw th2;
                }
            }
        }
    }

    static {
        Logger logger = Logger.getLogger(e.class.getName());
        t.e(logger, "getLogger(TaskRunner::class.java.name)");
        f24786j = logger;
    }

    public e(a backend) {
        t.f(backend, "backend");
        this.f24787a = backend;
        this.f24788b = 10000;
        this.f24791e = new ArrayList();
        this.f24792f = new ArrayList();
        this.f24793g = new d();
    }

    private final void c(qe.a aVar, long j10) {
        if (ne.d.f22998h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + this);
        }
        qe.d dVarD = aVar.d();
        t.c(dVarD);
        if (!(dVarD.c() == aVar)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        boolean zD = dVarD.d();
        dVarD.m(false);
        dVarD.l(null);
        this.f24791e.remove(dVarD);
        if (j10 != -1 && !zD && !dVarD.g()) {
            dVarD.k(aVar, j10, true);
        }
        if (!dVarD.e().isEmpty()) {
            this.f24792f.add(dVarD);
        }
    }

    private final void e(qe.a aVar) {
        if (ne.d.f22998h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + this);
        }
        aVar.g(-1L);
        qe.d dVarD = aVar.d();
        t.c(dVarD);
        dVarD.e().remove(aVar);
        this.f24792f.remove(dVarD);
        dVarD.l(aVar);
        this.f24791e.add(dVarD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(qe.a aVar) {
        if (ne.d.f22998h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(aVar.b());
        try {
            long jF = aVar.f();
            synchronized (this) {
                c(aVar, jF);
                g0 g0Var = g0.f27756a;
            }
        } finally {
            synchronized (this) {
                c(aVar, -1L);
                g0 g0Var2 = g0.f27756a;
                threadCurrentThread.setName(name);
            }
        }
    }

    public final qe.a d() {
        boolean z10;
        if (ne.d.f22998h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + this);
        }
        while (!this.f24792f.isEmpty()) {
            long jNanoTime = this.f24787a.nanoTime();
            Iterator<qe.d> it = this.f24792f.iterator();
            long jMin = Long.MAX_VALUE;
            qe.a aVar = null;
            while (true) {
                if (!it.hasNext()) {
                    z10 = false;
                    break;
                }
                qe.a aVar2 = it.next().e().get(0);
                long jMax = Math.max(0L, aVar2.c() - jNanoTime);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (aVar != null) {
                        z10 = true;
                        break;
                    }
                    aVar = aVar2;
                }
            }
            if (aVar != null) {
                e(aVar);
                if (z10 || (!this.f24789c && (!this.f24792f.isEmpty()))) {
                    this.f24787a.execute(this.f24793g);
                }
                return aVar;
            }
            if (this.f24789c) {
                if (jMin < this.f24790d - jNanoTime) {
                    this.f24787a.b(this);
                }
                return null;
            }
            this.f24789c = true;
            this.f24790d = jNanoTime + jMin;
            try {
                try {
                    this.f24787a.a(this, jMin);
                } catch (InterruptedException unused) {
                    f();
                }
                this.f24789c = false;
            } catch (Throwable th) {
                this.f24789c = false;
                throw th;
            }
        }
        return null;
    }

    public final void f() {
        int size = this.f24791e.size() - 1;
        if (size >= 0) {
            while (true) {
                int i10 = size - 1;
                this.f24791e.get(size).b();
                if (i10 < 0) {
                    break;
                } else {
                    size = i10;
                }
            }
        }
        int size2 = this.f24792f.size() - 1;
        if (size2 < 0) {
            return;
        }
        while (true) {
            int i11 = size2 - 1;
            qe.d dVar = this.f24792f.get(size2);
            dVar.b();
            if (dVar.e().isEmpty()) {
                this.f24792f.remove(size2);
            }
            if (i11 < 0) {
                return;
            } else {
                size2 = i11;
            }
        }
    }

    public final a g() {
        return this.f24787a;
    }

    public final void h(qe.d taskQueue) {
        t.f(taskQueue, "taskQueue");
        if (ne.d.f22998h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + this);
        }
        if (taskQueue.c() == null) {
            if (!taskQueue.e().isEmpty()) {
                ne.d.c(this.f24792f, taskQueue);
            } else {
                this.f24792f.remove(taskQueue);
            }
        }
        if (this.f24789c) {
            this.f24787a.b(this);
        } else {
            this.f24787a.execute(this.f24793g);
        }
    }

    public final qe.d i() {
        int i10;
        synchronized (this) {
            i10 = this.f24788b;
            this.f24788b = i10 + 1;
        }
        return new qe.d(this, t.n("Q", Integer.valueOf(i10)));
    }
}
