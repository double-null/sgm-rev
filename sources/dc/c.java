package dc;

import java.util.concurrent.atomic.AtomicBoolean;
import wc.g0;
import zc.f;
import zc.j;

/* JADX INFO: compiled from: SuspendCancellableTask.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class c implements Runnable, wb.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f13514a = new AtomicBoolean(false);

    @Override // wb.b
    public void a(boolean z10) {
        this.f13514a.set(z10);
    }

    public boolean c() {
        return this.f13514a.get();
    }

    public final Object d(j jVar, f<? super g0> fVar) {
        if (c()) {
            return g0.f27756a;
        }
        Object objE = e(jVar, fVar);
        return objE == ad.d.f() ? objE : g0.f27756a;
    }

    public abstract Object e(j jVar, f<? super g0> fVar);

    @Override // java.lang.Runnable
    public final void run() {
    }
}
