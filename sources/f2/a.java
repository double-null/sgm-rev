package f2;

/* JADX INFO: compiled from: DoubleCheck.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a<T> implements vc.a<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f14612c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile vc.a<T> f14613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Object f14614b = f14612c;

    private a(vc.a<T> aVar) {
        this.f14613a = aVar;
    }

    public static <P extends vc.a<T>, T> vc.a<T> a(P p10) {
        d.b(p10);
        return p10 instanceof a ? p10 : new a(p10);
    }

    private static Object b(Object obj, Object obj2) {
        if (!(obj != f14612c) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // vc.a
    public T get() {
        T t10 = (T) this.f14614b;
        Object obj = f14612c;
        if (t10 == obj) {
            synchronized (this) {
                t10 = (T) this.f14614b;
                if (t10 == obj) {
                    t10 = this.f14613a.get();
                    this.f14614b = b(this.f14614b, t10);
                    this.f14613a = null;
                }
            }
        }
        return t10;
    }
}
