package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: NewInstanceSchemas.java */
/* JADX INFO: loaded from: classes.dex */
final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final u0 f2388a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final u0 f2389b = new v0();

    static u0 a() {
        return f2388a;
    }

    static u0 b() {
        return f2389b;
    }

    private static u0 c() {
        if (a1.f2102d) {
            return null;
        }
        try {
            return (u0) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
