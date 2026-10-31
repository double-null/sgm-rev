package dc;

import g7.EinF.ZHgPsTG;
import kotlin.jvm.internal.t;
import wc.g0;

/* JADX INFO: compiled from: BaseTaskManager.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class a implements d {
    private final void d(Runnable runnable, boolean z10) {
        wb.b bVar = runnable instanceof wb.b ? (wb.b) runnable : null;
        if (bVar != null) {
            try {
                bVar.a(z10);
                g0 g0Var = g0.f27756a;
            } catch (Throwable unused) {
            }
        }
        try {
            e(runnable);
            g0 g0Var2 = g0.f27756a;
        } catch (Throwable unused2) {
        }
    }

    protected abstract void e(Runnable runnable) throws Throwable;

    protected abstract void f(Runnable runnable, long j10) throws Throwable;

    @Override // dc.d
    public void schedule(Runnable task, long j10) throws Throwable {
        t.f(task, "task");
        d(task, false);
        f(task, j10);
    }

    @Override // dc.d
    public void a(Runnable runnable) {
        t.f(runnable, ZHgPsTG.gyV);
        d(runnable, true);
    }
}
