package dc;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: CancelableTask.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class b implements Runnable, wb.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f13513a = new AtomicBoolean(false);

    public void a(boolean z10) {
        this.f13513a.set(z10);
    }

    public boolean c() {
        return this.f13513a.get();
    }

    public abstract void d();

    @Override // java.lang.Runnable
    public void run() {
        if (c()) {
            return;
        }
        d();
    }
}
