package ud;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: Executors.kt */
/* JADX INFO: loaded from: classes5.dex */
final class d1 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k0 f26727a;

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        k0 k0Var = this.f26727a;
        zc.k kVar = zc.k.f29181a;
        if (k0Var.n0(kVar)) {
            this.f26727a.m0(kVar, runnable);
        } else {
            runnable.run();
        }
    }

    public String toString() {
        return this.f26727a.toString();
    }
}
