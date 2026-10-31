package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: Android.java */
/* JADX INFO: loaded from: classes.dex */
final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f2118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class<?> f2119b = a("libcore.io.Memory");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f2120c;

    static {
        f2120c = (f2118a || a("org.robolectric.Robolectric") == null) ? false : true;
    }

    private static <T> Class<T> a(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static Class<?> b() {
        return f2119b;
    }

    static boolean c() {
        return f2118a || !(f2119b == null || f2120c);
    }
}
