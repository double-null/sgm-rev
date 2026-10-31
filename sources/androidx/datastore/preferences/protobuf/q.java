package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: ExtensionSchemas.java */
/* JADX INFO: loaded from: classes.dex */
final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final o<?> f2291a = new p();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final o<?> f2292b = c();

    static o<?> a() {
        o<?> oVar = f2292b;
        if (oVar != null) {
            return oVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static o<?> b() {
        return f2291a;
    }

    private static o<?> c() {
        if (a1.f2102d) {
            return null;
        }
        try {
            return (o) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
