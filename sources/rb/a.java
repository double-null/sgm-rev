package rb;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public abstract class a implements d {
    private void b(Runnable runnable, boolean z10) {
        try {
            if (runnable instanceof wb.b) {
                ((wb.b) runnable).a(z10);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // rb.d
    public void a(Runnable runnable) {
        b(runnable, true);
    }

    @Override // rb.d
    public void execute(Runnable runnable) {
        b(runnable, false);
    }

    @Override // rb.d
    public void schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
        b(runnable, false);
    }
}
