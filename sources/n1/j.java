package n1;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: SerialExecutor.java */
/* JADX INFO: loaded from: classes.dex */
public class j implements Executor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f22683b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile Runnable f22685d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayDeque<a> f22682a = new ArrayDeque<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f22684c = new Object();

    /* JADX INFO: compiled from: SerialExecutor.java */
    static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final j f22686a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Runnable f22687b;

        a(j jVar, Runnable runnable) {
            this.f22686a = jVar;
            this.f22687b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f22687b.run();
            } finally {
                this.f22686a.b();
            }
        }
    }

    public j(Executor executor) {
        this.f22683b = executor;
    }

    public boolean a() {
        boolean z10;
        synchronized (this.f22684c) {
            z10 = !this.f22682a.isEmpty();
        }
        return z10;
    }

    void b() {
        synchronized (this.f22684c) {
            a aVarPoll = this.f22682a.poll();
            this.f22685d = aVarPoll;
            if (aVarPoll != null) {
                this.f22683b.execute(this.f22685d);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        synchronized (this.f22684c) {
            this.f22682a.add(new a(this, runnable));
            if (this.f22685d == null) {
                b();
            }
        }
    }
}
