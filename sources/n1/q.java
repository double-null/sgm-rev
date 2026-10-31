package n1;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: WorkTimer.java */
/* JADX INFO: loaded from: classes.dex */
public class q {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f22724f = androidx.work.l.f("WorkTimer");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ThreadFactory f22725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f22726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Map<String, c> f22727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Map<String, b> f22728d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Object f22729e;

    /* JADX INFO: compiled from: WorkTimer.java */
    class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f22730a = 0;

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = Executors.defaultThreadFactory().newThread(runnable);
            threadNewThread.setName("WorkManager-WorkTimer-thread-" + this.f22730a);
            this.f22730a = this.f22730a + 1;
            return threadNewThread;
        }
    }

    /* JADX INFO: compiled from: WorkTimer.java */
    public interface b {
        void a(String str);
    }

    /* JADX INFO: compiled from: WorkTimer.java */
    public static class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final q f22732a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f22733b;

        c(q qVar, String str) {
            this.f22732a = qVar;
            this.f22733b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f22732a.f22729e) {
                if (this.f22732a.f22727c.remove(this.f22733b) != null) {
                    b bVarRemove = this.f22732a.f22728d.remove(this.f22733b);
                    if (bVarRemove != null) {
                        bVarRemove.a(this.f22733b);
                    }
                } else {
                    androidx.work.l.c().a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", this.f22733b), new Throwable[0]);
                }
            }
        }
    }

    public q() {
        a aVar = new a();
        this.f22725a = aVar;
        this.f22727c = new HashMap();
        this.f22728d = new HashMap();
        this.f22729e = new Object();
        this.f22726b = Executors.newSingleThreadScheduledExecutor(aVar);
    }

    public void a() {
        if (this.f22726b.isShutdown()) {
            return;
        }
        this.f22726b.shutdownNow();
    }

    public void b(String str, long j10, b bVar) {
        synchronized (this.f22729e) {
            androidx.work.l.c().a(f22724f, String.format("Starting timer for %s", str), new Throwable[0]);
            c(str);
            c cVar = new c(this, str);
            this.f22727c.put(str, cVar);
            this.f22728d.put(str, bVar);
            this.f22726b.schedule(cVar, j10, TimeUnit.MILLISECONDS);
        }
    }

    public void c(String str) {
        synchronized (this.f22729e) {
            if (this.f22727c.remove(str) != null) {
                androidx.work.l.c().a(f22724f, String.format("Stopping timer for %s", str), new Throwable[0]);
                this.f22728d.remove(str);
            }
        }
    }
}
