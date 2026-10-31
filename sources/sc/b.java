package sc;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: CancelableTask.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f25406a = new AtomicBoolean(false);

    public boolean a() {
        return this.f25406a.get();
    }

    public abstract void c();

    public void d(boolean z10) {
        this.f25406a.set(z10);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (a()) {
            return;
        }
        c();
    }
}
