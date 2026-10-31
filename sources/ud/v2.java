package ud;

/* JADX INFO: compiled from: EventLoop.common.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class v2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v2 f26824a = new v2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ThreadLocal<k1> f26825b = zd.m0.a(new zd.e0("ThreadLocalEventLoop"));

    private v2() {
    }

    public final k1 a() {
        return f26825b.get();
    }

    public final k1 b() {
        ThreadLocal<k1> threadLocal = f26825b;
        k1 k1Var = threadLocal.get();
        if (k1Var != null) {
            return k1Var;
        }
        k1 k1VarA = n1.a();
        threadLocal.set(k1VarA);
        return k1VarA;
    }

    public final void c() {
        f26825b.set(null);
    }

    public final void d(k1 k1Var) {
        f26825b.set(k1Var);
    }
}
