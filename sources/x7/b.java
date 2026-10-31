package x7;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: BackgroundExecutor.java */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Executor f28095a;

    public static synchronized Executor a() {
        if (f28095a == null) {
            f28095a = l0.T0("ExoPlayer:BackgroundExecutor");
        }
        return f28095a;
    }
}
