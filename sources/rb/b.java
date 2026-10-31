package rb;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes5.dex */
public abstract class b implements Runnable, wb.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f24989a = new AtomicBoolean(false);

    @Override // wb.b
    public void a(boolean z10) {
        this.f24989a.set(z10);
    }

    public boolean c() {
        return this.f24989a.get();
    }

    public abstract void d();

    @Override // java.lang.Runnable
    public final void run() {
        if (c()) {
            return;
        }
        d();
    }
}
