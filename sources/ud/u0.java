package ud;

/* JADX INFO: compiled from: DefaultExecutor.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f26819a = zd.f0.f("kotlinx.coroutines.main.delay", false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final x0 f26820b = b();

    public static final x0 a() {
        return f26820b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final x0 b() {
        if (!f26819a) {
            return t0.f26817i;
        }
        k2 k2VarC = e1.c();
        return (zd.u.c(k2VarC) || !(k2VarC instanceof x0)) ? t0.f26817i : (x0) k2VarC;
    }
}
