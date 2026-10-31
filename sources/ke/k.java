package ke;

/* JADX INFO: compiled from: ArrayPools.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f21372a;

    static {
        Object objC;
        try {
            wc.r.a aVar = wc.r.f27774b;
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            kotlin.jvm.internal.t.e(property, "getProperty(...)");
            objC = wc.r.c(rd.b0.p(property));
        } catch (Throwable th) {
            wc.r.a aVar2 = wc.r.f27774b;
            objC = wc.r.c(wc.s.a(th));
        }
        if (wc.r.k(objC)) {
            objC = null;
        }
        Integer num = (Integer) objC;
        f21372a = num != null ? num.intValue() : 2097152;
    }
}
