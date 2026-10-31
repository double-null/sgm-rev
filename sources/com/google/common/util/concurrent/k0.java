package com.google.common.util.concurrent;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: SequentialExecutor.java */
/* JADX INFO: loaded from: classes4.dex */
final class k0 implements Executor {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final c0 f11837f = new c0(k0.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f11838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Deque<Runnable> f11839b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f11840c = c.IDLE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f11841d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b f11842e = new b(this, null);

    /* JADX INFO: compiled from: SequentialExecutor.java */
    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f11843a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k0 f11844b;

        a(k0 k0Var, Runnable runnable) {
            this.f11843a = runnable;
            this.f11844b = k0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f11843a.run();
        }

        public String toString() {
            return this.f11843a.toString();
        }
    }

    /* JADX INFO: compiled from: SequentialExecutor.java */
    private final class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Runnable f11845a;

        private b() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
        
            if (r1 == false) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
        
            java.lang.Thread.currentThread().interrupt();
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
        
            r1 = r1 | java.lang.Thread.interrupted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
        
            r8.f11845a.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
        
            r3 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x005f, code lost:
        
            com.google.common.util.concurrent.k0.f11837f.a().log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + r8.f11845a, (java.lang.Throwable) r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0080, code lost:
        
            r8.f11845a = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0082, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:?, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void a() {
            /*
                r8 = this;
                r0 = 0
                r1 = r0
            L2:
                com.google.common.util.concurrent.k0 r2 = com.google.common.util.concurrent.k0.this     // Catch: java.lang.Throwable -> L86
                java.util.Deque r2 = com.google.common.util.concurrent.k0.a(r2)     // Catch: java.lang.Throwable -> L86
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L86
                if (r0 != 0) goto L2b
                com.google.common.util.concurrent.k0 r0 = com.google.common.util.concurrent.k0.this     // Catch: java.lang.Throwable -> L83
                com.google.common.util.concurrent.k0$c r0 = com.google.common.util.concurrent.k0.b(r0)     // Catch: java.lang.Throwable -> L83
                com.google.common.util.concurrent.k0$c r3 = com.google.common.util.concurrent.k0.c.RUNNING     // Catch: java.lang.Throwable -> L83
                if (r0 != r3) goto L20
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L83
                if (r1 == 0) goto L1f
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L1f:
                return
            L20:
                com.google.common.util.concurrent.k0 r0 = com.google.common.util.concurrent.k0.this     // Catch: java.lang.Throwable -> L83
                com.google.common.util.concurrent.k0.d(r0)     // Catch: java.lang.Throwable -> L83
                com.google.common.util.concurrent.k0 r0 = com.google.common.util.concurrent.k0.this     // Catch: java.lang.Throwable -> L83
                com.google.common.util.concurrent.k0.c(r0, r3)     // Catch: java.lang.Throwable -> L83
                r0 = 1
            L2b:
                com.google.common.util.concurrent.k0 r3 = com.google.common.util.concurrent.k0.this     // Catch: java.lang.Throwable -> L83
                java.util.Deque r3 = com.google.common.util.concurrent.k0.a(r3)     // Catch: java.lang.Throwable -> L83
                java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L83
                java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L83
                r8.f11845a = r3     // Catch: java.lang.Throwable -> L83
                if (r3 != 0) goto L4d
                com.google.common.util.concurrent.k0 r0 = com.google.common.util.concurrent.k0.this     // Catch: java.lang.Throwable -> L83
                com.google.common.util.concurrent.k0$c r3 = com.google.common.util.concurrent.k0.c.IDLE     // Catch: java.lang.Throwable -> L83
                com.google.common.util.concurrent.k0.c(r0, r3)     // Catch: java.lang.Throwable -> L83
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L83
                if (r1 == 0) goto L4c
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L4c:
                return
            L4d:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L83
                boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L86
                r1 = r1 | r2
                r2 = 0
                java.lang.Runnable r3 = r8.f11845a     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5e
                r3.run()     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5e
            L59:
                r8.f11845a = r2     // Catch: java.lang.Throwable -> L86
                goto L2
            L5c:
                r0 = move-exception
                goto L80
            L5e:
                r3 = move-exception
                com.google.common.util.concurrent.c0 r4 = com.google.common.util.concurrent.k0.e()     // Catch: java.lang.Throwable -> L5c
                java.util.logging.Logger r4 = r4.a()     // Catch: java.lang.Throwable -> L5c
                java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L5c
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5c
                r6.<init>()     // Catch: java.lang.Throwable -> L5c
                java.lang.String r7 = "Exception while executing runnable "
                r6.append(r7)     // Catch: java.lang.Throwable -> L5c
                java.lang.Runnable r7 = r8.f11845a     // Catch: java.lang.Throwable -> L5c
                r6.append(r7)     // Catch: java.lang.Throwable -> L5c
                java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L5c
                r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L5c
                goto L59
            L80:
                r8.f11845a = r2     // Catch: java.lang.Throwable -> L86
                throw r0     // Catch: java.lang.Throwable -> L86
            L83:
                r0 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L83
                throw r0     // Catch: java.lang.Throwable -> L86
            L86:
                r0 = move-exception
                if (r1 == 0) goto L90
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r1.interrupt()
            L90:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.k0.b.a():void");
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                a();
            } catch (Error e10) {
                synchronized (k0.this.f11839b) {
                    k0.this.f11840c = c.IDLE;
                    throw e10;
                }
            }
        }

        public String toString() {
            Runnable runnable = this.f11845a;
            if (runnable != null) {
                return "SequentialExecutorWorker{running=" + runnable + "}";
            }
            return "SequentialExecutorWorker{state=" + k0.this.f11840c + "}";
        }

        /* synthetic */ b(k0 k0Var, a aVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: SequentialExecutor.java */
    enum c {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    k0(Executor executor) {
        this.f11838a = (Executor) com.google.common.base.p.l(executor);
    }

    static /* synthetic */ long d(k0 k0Var) {
        long j10 = k0Var.f11841d;
        k0Var.f11841d = 1 + j10;
        return j10;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        c cVar;
        com.google.common.base.p.l(runnable);
        synchronized (this.f11839b) {
            c cVar2 = this.f11840c;
            if (cVar2 != c.RUNNING && cVar2 != (cVar = c.QUEUED)) {
                long j10 = this.f11841d;
                a aVar = new a(this, runnable);
                this.f11839b.add(aVar);
                c cVar3 = c.QUEUING;
                this.f11840c = cVar3;
                boolean z10 = true;
                try {
                    this.f11838a.execute(this.f11842e);
                    if (this.f11840c != cVar3) {
                        return;
                    }
                    synchronized (this.f11839b) {
                        if (this.f11841d == j10 && this.f11840c == cVar3) {
                            this.f11840c = cVar;
                        }
                    }
                    return;
                } catch (Throwable th) {
                    synchronized (this.f11839b) {
                        c cVar4 = this.f11840c;
                        if ((cVar4 != c.IDLE && cVar4 != c.QUEUING) || !this.f11839b.removeLastOccurrence(aVar)) {
                            z10 = false;
                        }
                        if (!(th instanceof RejectedExecutionException) || z10) {
                            throw th;
                        }
                        return;
                    }
                }
            }
            this.f11839b.add(runnable);
        }
    }

    public String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f11838a + "}";
    }
}
