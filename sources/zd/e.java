package zd;

import java.util.Collection;
import java.util.ServiceLoader;

/* JADX INFO: compiled from: CoroutineExceptionHandlerImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Collection<ud.l0> f29192a = qd.r.x(qd.n.d(ServiceLoader.load(ud.l0.class, ud.l0.class.getClassLoader()).iterator()));

    public static final Collection<ud.l0> a() {
        return f29192a;
    }

    public static final void b(Throwable th) {
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
    }
}
