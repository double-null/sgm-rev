package e0;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: Actual.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicInteger f13568a;

    public e(int i10) {
        this.f13568a = new AtomicInteger(i10);
    }

    public final int a() {
        return this.f13568a.decrementAndGet();
    }

    public final int b() {
        return this.f13568a.get();
    }

    public final int c() {
        return this.f13568a.getAndIncrement();
    }

    public final int d() {
        return this.f13568a.incrementAndGet();
    }
}
