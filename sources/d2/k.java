package d2;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: ExecutionModule_ExecutorFactory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class k implements f2.b<Executor> {

    /* JADX INFO: compiled from: ExecutionModule_ExecutorFactory.java */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final k f13225a = new k();
    }

    public static k a() {
        return a.f13225a;
    }

    public static Executor b() {
        return (Executor) f2.d.d(j.a());
    }

    @Override // vc.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Executor get() {
        return b();
    }
}
