package ud;

import java.util.concurrent.Future;

/* JADX INFO: compiled from: Executors.kt */
/* JADX INFO: loaded from: classes5.dex */
final class l implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Future<?> f26780a;

    public l(Future<?> future) {
        this.f26780a = future;
    }

    @Override // ud.m
    public void b(Throwable th) {
        this.f26780a.cancel(false);
    }

    public String toString() {
        return "CancelFutureOnCancel[" + this.f26780a + ']';
    }
}
