package dd;

import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: JDK7PlatformImplementations.kt */
/* JADX INFO: loaded from: classes5.dex */
public class a extends cd.a {

    /* JADX INFO: renamed from: dd.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: JDK7PlatformImplementations.kt */
    private static final class C0180a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0180a f13515a = new C0180a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Integer f13516b;

        static {
            Integer num;
            Integer num2 = null;
            try {
                Object obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
                num = obj instanceof Integer ? (Integer) obj : null;
            } catch (Throwable unused) {
            }
            if (num != null) {
                if (num.intValue() > 0) {
                    num2 = num;
                }
            }
            f13516b = num2;
        }

        private C0180a() {
        }
    }

    private final boolean c(int i10) {
        Integer num = C0180a.f13516b;
        return num == null || num.intValue() >= i10;
    }

    @Override // cd.a
    public void a(Throwable cause, Throwable exception) {
        t.f(cause, "cause");
        t.f(exception, "exception");
        if (c(19)) {
            cause.addSuppressed(exception);
        } else {
            super.a(cause, exception);
        }
    }
}
