package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: ListFieldSchemas.java */
/* JADX INFO: loaded from: classes.dex */
final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final d0 f2124a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final d0 f2125b = new e0();

    static d0 a() {
        return f2124a;
    }

    static d0 b() {
        return f2125b;
    }

    private static d0 c() {
        if (a1.f2102d) {
            return null;
        }
        try {
            return (d0) Class.forName("androidx.datastore.preferences.protobuf.ListFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
