package com.applovin.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class f6 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final ExecutorService f6545r = Executors.newFixedThreadPool(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f6546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.p f6547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f6548c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f6549d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f6550e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f6551f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f6552g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f6553h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f6554i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ExecutorService f6556k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ExecutorService f6557l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f6560o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f6561p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final boolean f6562q;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Map f6555j = new HashMap();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final List f6558m = new ArrayList(5);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Object f6559n = new Object();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f6563a;

        static {
            int[] iArr = new int[b.values().length];
            f6563a = iArr;
            try {
                iArr[b.CORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6563a[b.CACHING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6563a[b.MEDIATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6563a[b.TIMEOUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public enum b {
        CORE,
        CACHING,
        MEDIATION,
        TIMEOUT,
        OTHER
    }

    private static class c extends e {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final long f6570f;

        public c(com.applovin.impl.sdk.l lVar, k5 k5Var, b bVar, long j10) {
            super(lVar, k5Var, bVar);
            this.f6570f = j10;
        }
    }

    private class d implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f6571a;

        class a implements Thread.UncaughtExceptionHandler {
            a() {
            }

            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(Thread thread, Throwable th) {
                com.applovin.impl.sdk.p unused = f6.this.f6547b;
                if (com.applovin.impl.sdk.p.a()) {
                    f6.this.f6547b.a("TaskManager", "Caught unhandled exception", th);
                }
            }
        }

        d(String str) {
            this.f6571a = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "AppLovinSdk:" + this.f6571a);
            thread.setDaemon(true);
            thread.setPriority(((Integer) f6.this.f6546a.a(z4.Q)).intValue());
            thread.setUncaughtExceptionHandler(new a());
            return thread;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.sdk.l f6574a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f6575b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final com.applovin.impl.sdk.p f6576c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        protected final k5 f6577d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        protected final b f6578e;

        public e(com.applovin.impl.sdk.l lVar, k5 k5Var, b bVar) {
            this.f6574a = lVar;
            this.f6576c = lVar.Q();
            this.f6575b = k5Var.c();
            this.f6577d = k5Var;
            this.f6578e = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                p0.a();
                if (!this.f6574a.G0() || this.f6577d.d()) {
                    ScheduledFuture scheduledFutureB = this.f6577d.b(Thread.currentThread(), ((Long) this.f6574a.a(z4.f9367v)).longValue());
                    this.f6577d.run();
                    if (scheduledFutureB != null) {
                        scheduledFutureB.cancel(false);
                    }
                } else {
                    if (com.applovin.impl.sdk.p.a()) {
                        this.f6576c.d(this.f6575b, "Task re-scheduled...");
                    }
                    this.f6574a.s0().a(this.f6577d, this.f6578e, 2000L);
                }
                if (com.applovin.impl.sdk.p.a()) {
                    this.f6576c.d(this.f6575b, this.f6578e + " queue finished task " + this.f6577d.c());
                }
            } catch (Throwable th) {
                try {
                    if (com.applovin.impl.sdk.p.a()) {
                        this.f6576c.a(this.f6575b, "Task failed execution", th);
                    }
                    this.f6577d.a(th);
                } finally {
                    if (com.applovin.impl.sdk.p.a()) {
                        this.f6576c.d(this.f6575b, this.f6578e + " queue finished task " + this.f6577d.c());
                    }
                }
            }
        }
    }

    public f6(com.applovin.impl.sdk.l lVar) {
        this.f6546a = lVar;
        this.f6547b = lVar.Q();
        this.f6561p = ((Boolean) lVar.a(z4.T)).booleanValue();
        this.f6562q = ((Boolean) lVar.a(z4.W6)).booleanValue();
        this.f6548c = b("auxiliary_operations", ((Integer) lVar.a(z4.O)).intValue());
        this.f6549d = b("shared_thread_pool", ((Integer) lVar.a(z4.N)).intValue());
        this.f6550e = b("core", ((Integer) lVar.a(z4.U)).intValue());
        this.f6552g = b("caching", ((Integer) lVar.a(z4.V)).intValue());
        this.f6553h = b("mediation", ((Integer) lVar.a(z4.W)).intValue());
        this.f6551f = b("timeout", ((Integer) lVar.a(z4.X)).intValue());
        this.f6554i = b("other", ((Integer) lVar.a(z4.Y)).intValue());
        if (((Boolean) lVar.a(z4.J0)).booleanValue() && ((Boolean) lVar.a(z4.K0)).booleanValue()) {
            this.f6556k = Executors.newFixedThreadPool(((Integer) lVar.a(z4.L0)).intValue(), new d("com.applovin.sdk.caching.shared"));
            this.f6557l = Executors.newFixedThreadPool(((Integer) lVar.a(z4.M0)).intValue(), new d("com.applovin.sdk.caching.html.shared"));
        }
    }

    public Executor c() {
        return this.f6561p ? this.f6550e : this.f6549d;
    }

    public ExecutorService d() {
        return this.f6557l;
    }

    public boolean e() {
        return (a() == null || d() == null) ? false : true;
    }

    public boolean f() {
        return this.f6560o;
    }

    public void g() {
        synchronized (this.f6559n) {
            this.f6560o = true;
            for (e eVar : this.f6558m) {
                if (this.f6562q) {
                    c cVar = (c) eVar;
                    a(cVar.f6577d, cVar.f6578e, cVar.f6570f);
                } else {
                    a(eVar.f6577d, eVar.f6578e);
                }
            }
            this.f6558m.clear();
        }
    }

    public void h() {
        synchronized (this.f6559n) {
            this.f6560o = false;
        }
    }

    public ExecutorService a() {
        return this.f6556k;
    }

    public ScheduledFuture b(k5 k5Var, b bVar, long j10) {
        if (this.f6561p) {
            return a(new e(this.f6546a, k5Var, bVar)).schedule(k5Var, j10, TimeUnit.MILLISECONDS);
        }
        return this.f6548c.schedule(k5Var, j10, TimeUnit.MILLISECONDS);
    }

    public void a(k5 k5Var, b bVar) {
        a(k5Var, bVar, 0L);
    }

    public void a(k5 k5Var, b bVar, long j10) {
        a(k5Var, bVar, j10, false);
    }

    public void a(k5 k5Var, b bVar, long j10, boolean z10) {
        e eVar;
        if (k5Var == null) {
            throw new IllegalArgumentException("No task specified");
        }
        if (j10 >= 0) {
            if (this.f6562q) {
                eVar = new c(this.f6546a, k5Var, bVar, j10);
            } else {
                eVar = new e(this.f6546a, k5Var, bVar);
            }
            if (!b(eVar)) {
                a(eVar, j10, z10);
                return;
            } else {
                if (com.applovin.impl.sdk.p.a()) {
                    this.f6547b.d(k5Var.c(), "Task execution delayed until after init");
                    return;
                }
                return;
            }
        }
        throw new IllegalArgumentException("Invalid delay (millis) specified: " + j10);
    }

    public ExecutorService b() {
        return this.f6561p ? this.f6552g : f6545r;
    }

    private boolean b(e eVar) {
        if (eVar.f6577d.d()) {
            return false;
        }
        synchronized (this.f6559n) {
            if (this.f6560o) {
                return false;
            }
            this.f6558m.add(eVar);
            return true;
        }
    }

    public void a(Runnable runnable, b bVar) {
        if (this.f6561p) {
            com.applovin.impl.sdk.l lVar = this.f6546a;
            e eVar = new e(lVar, new u6(lVar, "auxiliaryOperation", runnable), bVar);
            a(eVar).submit(eVar);
            return;
        }
        this.f6548c.submit(runnable);
    }

    private ScheduledThreadPoolExecutor b(String str, int i10) {
        return new ScheduledThreadPoolExecutor(i10, new d(str));
    }

    public Executor a(final String str) {
        return new Executor() { // from class: com.applovin.impl.ea
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                this.f6436a.a(str, runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, Runnable runnable) {
        a(new u6(this.f6546a, str, runnable));
    }

    public void a(k5 k5Var) {
        if (k5Var != null) {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f6561p ? this.f6550e : this.f6549d;
            try {
                if (q7.i()) {
                    scheduledThreadPoolExecutor.submit(new e(this.f6546a, k5Var, b.CORE));
                    return;
                }
                ScheduledFuture scheduledFutureB = k5Var.b(Thread.currentThread(), ((Long) this.f6546a.a(z4.f9367v)).longValue());
                k5Var.run();
                if (scheduledFutureB != null) {
                    scheduledFutureB.cancel(false);
                    return;
                }
                return;
            } catch (Throwable th) {
                if (com.applovin.impl.sdk.p.a()) {
                    this.f6547b.a(k5Var.c(), "Task failed execution", th);
                }
                k5Var.a(th);
                return;
            }
        }
        throw new IllegalArgumentException("No task specified");
    }

    public void a(k5 k5Var, m3 m3Var) {
        String strB = m3Var.b();
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutorB = (ScheduledThreadPoolExecutor) this.f6555j.get(strB);
        if (scheduledThreadPoolExecutorB == null) {
            scheduledThreadPoolExecutorB = b(strB, 1);
            this.f6555j.put(strB, scheduledThreadPoolExecutorB);
        }
        scheduledThreadPoolExecutorB.submit(new e(this.f6546a, k5Var, b.MEDIATION));
    }

    private void a(final e eVar, long j10, boolean z10) {
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutorA = this.f6561p ? a(eVar) : this.f6549d;
        if (j10 <= 0) {
            scheduledThreadPoolExecutorA.submit(eVar);
        } else if (z10) {
            i0.a(j10, this.f6546a, new Runnable() { // from class: com.applovin.impl.da
                @Override // java.lang.Runnable
                public final void run() {
                    scheduledThreadPoolExecutorA.execute(eVar);
                }
            });
        } else {
            scheduledThreadPoolExecutorA.schedule(eVar, j10, TimeUnit.MILLISECONDS);
        }
    }

    private ScheduledThreadPoolExecutor a(e eVar) {
        int i10 = a.f6563a[eVar.f6578e.ordinal()];
        if (i10 == 1) {
            return this.f6550e;
        }
        if (i10 == 2) {
            return this.f6552g;
        }
        if (i10 == 3) {
            return this.f6553h;
        }
        if (i10 != 4) {
            return this.f6554i;
        }
        return this.f6551f;
    }

    public ExecutorService a(String str, int i10) {
        return Executors.newFixedThreadPool(i10, new d(str));
    }

    public List a(List list, ExecutorService executorService) {
        try {
            if (com.applovin.impl.sdk.p.a()) {
                this.f6547b.a("TaskManager", "Awaiting " + list.size() + " tasks...");
            }
            return executorService.invokeAll(list);
        } catch (Throwable th) {
            if (!com.applovin.impl.sdk.p.a()) {
                return null;
            }
            this.f6547b.a("TaskManager", "Awaiting tasks were interrupted", th);
            return null;
        }
    }
}
