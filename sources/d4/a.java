package d4;

/* JADX INFO: compiled from: DoubleCheck.java */
/* JADX INFO: loaded from: classes4.dex */
public final class a<T> implements e<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f13316c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile e<T> f13317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Object f13318b = f13316c;

    private a(e<T> eVar) {
        this.f13317a = eVar;
    }

    private synchronized Object a() {
        Object obj;
        obj = this.f13318b;
        if (obj == f13316c) {
            obj = this.f13317a.get();
            this.f13318b = c(this.f13318b, obj);
            this.f13317a = null;
        }
        return obj;
    }

    public static <T> e<T> b(e<T> eVar) {
        d.b(eVar);
        return eVar instanceof a ? eVar : new a(eVar);
    }

    private static Object c(Object obj, Object obj2) {
        if (!(obj != f13316c) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // vc.a
    public T get() {
        T t10 = (T) this.f13318b;
        return t10 == f13316c ? (T) a() : t10;
    }
}
