package je;

import java.util.List;

/* JADX INFO: compiled from: Caching.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f20970a;

    static {
        boolean z10;
        try {
            Class.forName("java.lang.ClassValue");
            z10 = true;
        } catch (Throwable unused) {
            z10 = false;
        }
        f20970a = z10;
    }

    public static final <T> r2<T> a(id.l<? super pd.c<?>, ? extends fe.d<T>> factory) {
        kotlin.jvm.internal.t.f(factory, "factory");
        return f20970a ? new s(factory) : new x(factory);
    }

    public static final <T> y1<T> b(id.p<? super pd.c<Object>, ? super List<? extends pd.l>, ? extends fe.d<T>> factory) {
        kotlin.jvm.internal.t.f(factory, "factory");
        return f20970a ? new t(factory) : new y(factory);
    }
}
