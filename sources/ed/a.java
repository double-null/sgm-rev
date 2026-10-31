package ed;

import md.d;

/* JADX INFO: compiled from: JDK8PlatformImplementations.kt */
/* JADX INFO: loaded from: classes5.dex */
public class a extends dd.a {

    /* JADX INFO: renamed from: ed.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: JDK8PlatformImplementations.kt */
    private static final class C0218a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0218a f14526a = new C0218a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Integer f14527b;

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
            f14527b = num2;
        }

        private C0218a() {
        }
    }

    private final boolean c(int i10) {
        Integer num = C0218a.f14527b;
        return num == null || num.intValue() >= i10;
    }

    @Override // cd.a
    public d b() {
        return c(34) ? new nd.a() : super.b();
    }
}
