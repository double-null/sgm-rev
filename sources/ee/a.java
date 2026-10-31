package ee;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: Tasks.kt */
/* JADX INFO: loaded from: classes5.dex */
final class a implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f14528a = new a();

    private a() {
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
