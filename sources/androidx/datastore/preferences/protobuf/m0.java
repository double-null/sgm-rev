package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: MapFieldSchemas.java */
/* JADX INFO: loaded from: classes.dex */
final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final k0 f2222a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final k0 f2223b = new l0();

    static k0 a() {
        return f2222a;
    }

    static k0 b() {
        return f2223b;
    }

    private static k0 c() {
        if (a1.f2102d) {
            return null;
        }
        try {
            return (k0) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
