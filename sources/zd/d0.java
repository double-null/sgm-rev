package zd;

/* JADX INFO: compiled from: StackTraceRecovery.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final StackTraceElement f29189a = new a.a().a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f29190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f29191c;

    static {
        Object objC;
        Object objC2;
        try {
            wc.r.a aVar = wc.r.f27774b;
            objC = wc.r.c(kotlin.coroutines.jvm.internal.a.class.getCanonicalName());
        } catch (Throwable th) {
            wc.r.a aVar2 = wc.r.f27774b;
            objC = wc.r.c(wc.s.a(th));
        }
        if (wc.r.g(objC) != null) {
            objC = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        f29190b = (String) objC;
        try {
            objC2 = wc.r.c(d0.class.getCanonicalName());
        } catch (Throwable th2) {
            wc.r.a aVar3 = wc.r.f27774b;
            objC2 = wc.r.c(wc.s.a(th2));
        }
        if (wc.r.g(objC2) != null) {
            objC2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        f29191c = (String) objC2;
    }

    public static final <E extends Throwable> E a(E e10) {
        return e10;
    }
}
