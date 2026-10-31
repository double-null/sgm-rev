package ud;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final zd.e0 f26765a = new zd.e0("COMPLETING_ALREADY");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zd.e0 f26766b = new zd.e0("COMPLETING_WAITING_CHILDREN");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final zd.e0 f26767c = new zd.e0("COMPLETING_RETRY");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final zd.e0 f26768d = new zd.e0("TOO_LATE_TO_CANCEL");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final zd.e0 f26769e = new zd.e0("SEALED");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final j1 f26770f = new j1(false);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final j1 f26771g = new j1(true);

    public static final Object g(Object obj) {
        return obj instanceof w1 ? new x1((w1) obj) : obj;
    }

    public static final Object h(Object obj) {
        w1 w1Var;
        x1 x1Var = obj instanceof x1 ? (x1) obj : null;
        return (x1Var == null || (w1Var = x1Var.f26829a) == null) ? obj : w1Var;
    }
}
