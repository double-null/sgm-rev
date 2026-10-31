package androidx.room;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: TransactionExecutor.java */
/* JADX INFO: loaded from: classes.dex */
class l implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f3562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayDeque<Runnable> f3563b = new ArrayDeque<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Runnable f3564c;

    /* JADX INFO: compiled from: TransactionExecutor.java */
    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f3565a;

        a(Runnable runnable) {
            this.f3565a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f3565a.run();
            } finally {
                l.this.a();
            }
        }
    }

    l(Executor executor) {
        this.f3562a = executor;
    }

    synchronized void a() {
        Runnable runnablePoll = this.f3563b.poll();
        this.f3564c = runnablePoll;
        if (runnablePoll != null) {
            this.f3562a.execute(runnablePoll);
        }
    }

    @Override // java.util.concurrent.Executor
    public synchronized void execute(Runnable runnable) {
        this.f3563b.offer(new a(runnable));
        if (this.f3564c == null) {
            a();
        }
    }
}
