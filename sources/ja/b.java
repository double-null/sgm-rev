package ja;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: NativeNetworkExecutor.java */
/* JADX INFO: loaded from: classes4.dex */
public class b implements Executor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static b f20747b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ThreadPoolExecutor f20748a;

    private b() {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors() * 2;
        this.f20748a = new ThreadPoolExecutor(iAvailableProcessors, iAvailableProcessors, 0L, TimeUnit.MICROSECONDS, new LinkedBlockingQueue());
    }

    public static b a() {
        if (f20747b == null) {
            f20747b = new b();
        }
        return f20747b;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f20748a.execute(runnable);
    }
}
