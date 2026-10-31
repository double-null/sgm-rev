package y2;

import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

/* JADX INFO: compiled from: SequentialExecutor.java */
/* JADX INFO: loaded from: classes4.dex */
final class k implements Executor {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Logger f28627f = Logger.getLogger(k.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f28628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Deque<Runnable> f28629b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f28630c = c.IDLE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f28631d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b f28632e = new b(this, null);

    /* JADX INFO: compiled from: SequentialExecutor.java */
    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f28633a;

        a(Runnable runnable) {
            this.f28633a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f28633a.run();
        }

        public String toString() {
            return this.f28633a.toString();
        }
    }

    /* JADX INFO: compiled from: SequentialExecutor.java */
    private final class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Runnable f28635a;

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
        
            r8.f28635a.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
        
            r3 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x005f, code lost:
        
            y2.k.f28627f.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + r8.f28635a, (java.lang.Throwable) r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x007c, code lost:
        
            r8.f28635a = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x007e, code lost:
        
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
                y2.k r2 = y2.k.this     // Catch: java.lang.Throwable -> L82
                java.util.Deque r2 = y2.k.a(r2)     // Catch: java.lang.Throwable -> L82
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L82
                if (r0 != 0) goto L2b
                y2.k r0 = y2.k.this     // Catch: java.lang.Throwable -> L7f
                y2.k$c r0 = y2.k.b(r0)     // Catch: java.lang.Throwable -> L7f
                y2.k$c r3 = y2.k.c.RUNNING     // Catch: java.lang.Throwable -> L7f
                if (r0 != r3) goto L20
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L7f
                if (r1 == 0) goto L1f
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L1f:
                return
            L20:
                y2.k r0 = y2.k.this     // Catch: java.lang.Throwable -> L7f
                y2.k.d(r0)     // Catch: java.lang.Throwable -> L7f
                y2.k r0 = y2.k.this     // Catch: java.lang.Throwable -> L7f
                y2.k.c(r0, r3)     // Catch: java.lang.Throwable -> L7f
                r0 = 1
            L2b:
                y2.k r3 = y2.k.this     // Catch: java.lang.Throwable -> L7f
                java.util.Deque r3 = y2.k.a(r3)     // Catch: java.lang.Throwable -> L7f
                java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L7f
                java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L7f
                r8.f28635a = r3     // Catch: java.lang.Throwable -> L7f
                if (r3 != 0) goto L4d
                y2.k r0 = y2.k.this     // Catch: java.lang.Throwable -> L7f
                y2.k$c r3 = y2.k.c.IDLE     // Catch: java.lang.Throwable -> L7f
                y2.k.c(r0, r3)     // Catch: java.lang.Throwable -> L7f
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L7f
                if (r1 == 0) goto L4c
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L4c:
                return
            L4d:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L7f
                boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L82
                r1 = r1 | r2
                r2 = 0
                java.lang.Runnable r3 = r8.f28635a     // Catch: java.lang.Throwable -> L5c java.lang.RuntimeException -> L5e
                r3.run()     // Catch: java.lang.Throwable -> L5c java.lang.RuntimeException -> L5e
            L59:
                r8.f28635a = r2     // Catch: java.lang.Throwable -> L82
                goto L2
            L5c:
                r0 = move-exception
                goto L7c
            L5e:
                r3 = move-exception
                java.util.logging.Logger r4 = y2.k.e()     // Catch: java.lang.Throwable -> L5c
                java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L5c
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5c
                r6.<init>()     // Catch: java.lang.Throwable -> L5c
                java.lang.String r7 = "Exception while executing runnable "
                r6.append(r7)     // Catch: java.lang.Throwable -> L5c
                java.lang.Runnable r7 = r8.f28635a     // Catch: java.lang.Throwable -> L5c
                r6.append(r7)     // Catch: java.lang.Throwable -> L5c
                java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L5c
                r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L5c
                goto L59
            L7c:
                r8.f28635a = r2     // Catch: java.lang.Throwable -> L82
                throw r0     // Catch: java.lang.Throwable -> L82
            L7f:
                r0 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L7f
                throw r0     // Catch: java.lang.Throwable -> L82
            L82:
                r0 = move-exception
                if (r1 == 0) goto L8c
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r1.interrupt()
            L8c:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: y2.k.b.a():void");
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                a();
            } catch (Error e10) {
                synchronized (k.this.f28629b) {
                    k.this.f28630c = c.IDLE;
                    throw e10;
                }
            }
        }

        public String toString() {
            Runnable runnable = this.f28635a;
            if (runnable != null) {
                return "SequentialExecutorWorker{running=" + runnable + "}";
            }
            return "SequentialExecutorWorker{state=" + k.this.f28630c + "}";
        }

        /* synthetic */ b(k kVar, a aVar) {
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

    k(Executor executor) {
        this.f28628a = (Executor) Preconditions.checkNotNull(executor);
    }

    static /* synthetic */ long d(k kVar) {
        long j10 = kVar.f28631d;
        kVar.f28631d = 1 + j10;
        return j10;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        c cVar;
        Preconditions.checkNotNull(runnable);
        synchronized (this.f28629b) {
            c cVar2 = this.f28630c;
            if (cVar2 != c.RUNNING && cVar2 != (cVar = c.QUEUED)) {
                long j10 = this.f28631d;
                a aVar = new a(runnable);
                this.f28629b.add(aVar);
                c cVar3 = c.QUEUING;
                this.f28630c = cVar3;
                boolean z10 = true;
                try {
                    this.f28628a.execute(this.f28632e);
                    if (this.f28630c != cVar3) {
                        return;
                    }
                    synchronized (this.f28629b) {
                        if (this.f28631d == j10 && this.f28630c == cVar3) {
                            this.f28630c = cVar;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e10) {
                    synchronized (this.f28629b) {
                        c cVar4 = this.f28630c;
                        if ((cVar4 != c.IDLE && cVar4 != c.QUEUING) || !this.f28629b.removeLastOccurrence(aVar)) {
                            z10 = false;
                        }
                        if (!(e10 instanceof RejectedExecutionException) || z10) {
                            throw e10;
                        }
                    }
                    return;
                }
            }
            this.f28629b.add(runnable);
        }
    }

    public String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f28628a + "}";
    }
}
