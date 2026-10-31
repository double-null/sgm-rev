package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: ExtensionRegistryFactory.java */
/* JADX INFO: loaded from: classes.dex */
final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Class<?> f2221a = c();

    public static n a() {
        n nVarB = b("getEmptyRegistry");
        return nVarB != null ? nVarB : n.f2225c;
    }

    private static final n b(String str) {
        Class<?> cls = f2221a;
        if (cls == null) {
            return null;
        }
        try {
            return (n) cls.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    static Class<?> c() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
