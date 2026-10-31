package x7;

/* JADX INFO: compiled from: ConditionVariable.java */
/* JADX INFO: loaded from: classes4.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f28133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f28134b;

    public k() {
        this(h.f28124a);
    }

    public synchronized void a() throws InterruptedException {
        while (!this.f28134b) {
            wait();
        }
    }

    public synchronized void b() {
        boolean z10 = false;
        while (!this.f28134b) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z10 = true;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    public synchronized boolean c() {
        boolean z10;
        z10 = this.f28134b;
        this.f28134b = false;
        return z10;
    }

    public synchronized boolean d() {
        return this.f28134b;
    }

    public synchronized boolean e() {
        if (this.f28134b) {
            return false;
        }
        this.f28134b = true;
        notifyAll();
        return true;
    }

    public k(h hVar) {
        this.f28133a = hVar;
    }
}
