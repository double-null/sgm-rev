package androidx.datastore.preferences.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: compiled from: Protobuf.java */
/* JADX INFO: loaded from: classes.dex */
final class a1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a1 f2101c = new a1();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static boolean f2102d = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentMap<Class<?>, e1<?>> f2104b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f1 f2103a = new h0();

    private a1() {
    }

    public static a1 a() {
        return f2101c;
    }

    public e1<?> b(Class<?> cls, e1<?> e1Var) {
        y.b(cls, "messageType");
        y.b(e1Var, "schema");
        return this.f2104b.putIfAbsent(cls, e1Var);
    }

    public <T> e1<T> c(Class<T> cls) {
        y.b(cls, "messageType");
        e1<T> e1Var = (e1) this.f2104b.get(cls);
        if (e1Var != null) {
            return e1Var;
        }
        e1<T> e1VarCreateSchema = this.f2103a.createSchema(cls);
        e1<T> e1Var2 = (e1<T>) b(cls, e1VarCreateSchema);
        return e1Var2 != null ? e1Var2 : e1VarCreateSchema;
    }

    public <T> e1<T> d(T t10) {
        return c(t10.getClass());
    }
}
