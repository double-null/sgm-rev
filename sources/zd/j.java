package zd;

/* JADX INFO: compiled from: FastServiceLoader.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f29203a;

    static {
        Object objC;
        try {
            wc.r.a aVar = wc.r.f27774b;
            objC = wc.r.c(Class.forName("android.os.Build"));
        } catch (Throwable th) {
            wc.r.a aVar2 = wc.r.f27774b;
            objC = wc.r.c(wc.s.a(th));
        }
        f29203a = wc.r.n(objC);
    }

    public static final boolean a() {
        return f29203a;
    }
}
