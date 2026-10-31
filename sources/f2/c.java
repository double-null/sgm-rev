package f2;

/* JADX INFO: compiled from: InstanceFactory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c<T> implements b<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c<Object> f14615b = new c<>(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T f14616a;

    private c(T t10) {
        this.f14616a = t10;
    }

    public static <T> b<T> a(T t10) {
        return new c(d.c(t10, "instance cannot be null"));
    }

    @Override // vc.a
    public T get() {
        return this.f14616a;
    }
}
