package sc;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: BackgroundTaskManager.java */
/* JADX INFO: loaded from: classes5.dex */
public class a implements c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f25400c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f25401d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f25402a = new ScheduledThreadPoolExecutor(f25401d);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<Runnable, Future<?>> f25403b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: sc.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BackgroundTaskManager.java */
    private class RunnableC0417a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Runnable f25404a;

        public RunnableC0417a(Runnable runnable) {
            this.f25404a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.c(this.f25404a);
            this.f25404a.run();
        }
    }

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        f25400c = iAvailableProcessors;
        f25401d = Math.max(2, Math.min(iAvailableProcessors - 1, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Future<?> c(Runnable runnable) {
        try {
            return this.f25403b.remove(runnable);
        } catch (Throwable unused) {
            return null;
        }
    }

    public void b(b bVar) {
        try {
            bVar.d(true);
            Future<?> futureC = c(bVar);
            if (futureC == null) {
                return;
            }
            futureC.cancel(false);
        } catch (Throwable unused) {
        }
    }

    public void d(b bVar, long j10, TimeUnit timeUnit) {
        try {
            bVar.d(false);
            this.f25403b.put(bVar, this.f25402a.schedule(new RunnableC0417a(bVar), j10, timeUnit));
        } catch (Throwable unused) {
        }
    }

    @Override // sc.c
    public void execute(Runnable runnable) {
        try {
            this.f25402a.execute(runnable);
        } catch (Throwable unused) {
        }
    }
}
