package f1;

import android.os.Handler;
import android.os.Looper;
import androidx.work.s;

/* JADX INFO: compiled from: DefaultRunnableScheduler.java */
/* JADX INFO: loaded from: classes.dex */
public class a implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f14533a = androidx.core.os.g.a(Looper.getMainLooper());

    @Override // androidx.work.s
    public void a(Runnable runnable) {
        this.f14533a.removeCallbacks(runnable);
    }

    @Override // androidx.work.s
    public void b(long j10, Runnable runnable) {
        this.f14533a.postDelayed(runnable, j10);
    }
}
