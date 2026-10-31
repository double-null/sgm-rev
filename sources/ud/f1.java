package ud;

import java.util.concurrent.Future;

/* JADX INFO: compiled from: Executors.kt */
/* JADX INFO: loaded from: classes5.dex */
final class f1 implements g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Future<?> f26743a;

    public f1(Future<?> future) {
        this.f26743a = future;
    }

    @Override // ud.g1
    public void e() {
        this.f26743a.cancel(false);
    }

    public String toString() {
        return "DisposableFutureHandle[" + this.f26743a + ']';
    }
}
