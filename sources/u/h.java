package u;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: RequestExecutor.java */
/* JADX INFO: loaded from: classes.dex */
class h {

    /* JADX INFO: compiled from: RequestExecutor.java */
    private static class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f25863a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f25864b;

        /* JADX INFO: renamed from: u.h$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: RequestExecutor.java */
        private static class C0435a extends Thread {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f25865a;

            C0435a(Runnable runnable, String str, int i10) {
                super(runnable, str);
                this.f25865a = i10;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.f25865a);
                super.run();
            }
        }

        a(String str, int i10) {
            this.f25863a = str;
            this.f25864b = i10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C0435a(runnable, this.f25863a, this.f25864b);
        }
    }

    /* JADX INFO: compiled from: RequestExecutor.java */
    private static class b<T> implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Callable<T> f25866a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private w.b<T> f25867b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Handler f25868c;

        /* JADX INFO: compiled from: RequestExecutor.java */
        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ w.b f25869a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Object f25870b;

            a(w.b bVar, Object obj) {
                this.f25869a = bVar;
                this.f25870b = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                this.f25869a.accept(this.f25870b);
            }
        }

        b(Handler handler, Callable<T> callable, w.b<T> bVar) {
            this.f25866a = callable;
            this.f25867b = bVar;
            this.f25868c = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            T tCall;
            try {
                tCall = this.f25866a.call();
            } catch (Exception unused) {
                tCall = null;
            }
            this.f25868c.post(new a(this.f25867b, tCall));
        }
    }

    static ThreadPoolExecutor a(String str, int i10, int i11) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i11, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i10));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    static <T> void b(Executor executor, Callable<T> callable, w.b<T> bVar) {
        executor.execute(new b(u.b.a(), callable, bVar));
    }

    static <T> T c(ExecutorService executorService, Callable<T> callable, int i10) throws InterruptedException {
        try {
            return executorService.submit(callable).get(i10, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            throw e10;
        } catch (ExecutionException e11) {
            throw new RuntimeException(e11);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
