package qb;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes5.dex */
public class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Runnable f24702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicInteger f24703b;

    public b(int i10, Runnable runnable) {
        this.f24702a = runnable;
        this.f24703b = new AtomicInteger(i10);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f24703b.decrementAndGet() > 0) {
            return;
        }
        this.f24702a.run();
    }
}
