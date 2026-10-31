package fc;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: HandlerTaskManager.kt */
/* JADX INFO: loaded from: classes5.dex */
public class b extends dc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f14928a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(Looper looper) {
        this(new Handler(looper));
        t.f(looper, "looper");
    }

    private final boolean h() {
        return t.a(Looper.myLooper(), this.f14928a.getLooper());
    }

    @Override // dc.a
    protected void e(Runnable task) throws Throwable {
        t.f(task, "task");
        this.f14928a.removeCallbacks(task);
    }

    @Override // dc.a
    protected void f(Runnable task, long j10) throws Throwable {
        t.f(task, "task");
        if (j10 > 0) {
            this.f14928a.postDelayed(task, j10);
        } else if (h()) {
            task.run();
        } else {
            this.f14928a.post(task);
        }
    }

    public final Handler g() {
        return this.f14928a;
    }

    public b(Handler handler) {
        t.f(handler, "handler");
        this.f14928a = handler;
    }
}
