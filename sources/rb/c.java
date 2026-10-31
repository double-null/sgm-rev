package rb;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public abstract class c extends a {
    @Override // rb.a, rb.d
    public void a(Runnable runnable) {
        super.a(runnable);
        c().removeCallbacks(runnable);
    }

    protected abstract Handler c();

    protected boolean d() {
        return Looper.myLooper() == c().getLooper();
    }

    @Override // rb.a, rb.d
    public void execute(Runnable runnable) {
        super.execute(runnable);
        if (d()) {
            runnable.run();
        } else {
            c().post(runnable);
        }
    }

    @Override // rb.a, rb.d
    public void schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
        super.schedule(runnable, j10, timeUnit);
        c().postDelayed(runnable, timeUnit.toMillis(j10));
    }
}
