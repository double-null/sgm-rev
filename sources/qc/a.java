package qc;

/* JADX INFO: compiled from: LazyCachedValue.java */
/* JADX INFO: loaded from: classes5.dex */
public class a<T> implements b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b<T> f24738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    volatile T f24739b;

    public a(b<T> bVar) {
        this.f24738a = bVar;
    }

    @Override // qc.b
    public T get() {
        T t10 = this.f24739b;
        if (t10 != null) {
            return t10;
        }
        T t11 = this.f24738a.get();
        this.f24739b = t11;
        return t11;
    }
}
