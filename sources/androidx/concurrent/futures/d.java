package androidx.concurrent.futures;

/* JADX INFO: compiled from: ResolvableFuture.java */
/* JADX INFO: loaded from: classes.dex */
public final class d<V> extends a<V> {
    private d() {
    }

    public static <V> d<V> t() {
        return new d<>();
    }

    @Override // androidx.concurrent.futures.a
    public boolean p(V v10) {
        return super.p(v10);
    }

    @Override // androidx.concurrent.futures.a
    public boolean q(Throwable th) {
        return super.q(th);
    }
}
