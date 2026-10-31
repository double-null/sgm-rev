package d2;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: SafeLoggingExecutor.java */
/* JADX INFO: loaded from: classes3.dex */
class n implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f13227a;

    /* JADX INFO: compiled from: SafeLoggingExecutor.java */
    static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Runnable f13228a;

        a(Runnable runnable) {
            this.f13228a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f13228a.run();
            } catch (Exception e10) {
                h2.a.d("Executor", "Background execution failure.", e10);
            }
        }
    }

    n(Executor executor) {
        this.f13227a = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f13227a.execute(new a(runnable));
    }
}
