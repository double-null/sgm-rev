package je;

import java.lang.ref.SoftReference;

/* JADX INFO: compiled from: Caching.kt */
/* JADX INFO: loaded from: classes5.dex */
final class k1<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile SoftReference<T> f20954a = new SoftReference<>(null);

    public final synchronized T a(id.a<? extends T> factory) {
        kotlin.jvm.internal.t.f(factory, "factory");
        T t10 = this.f20954a.get();
        if (t10 != null) {
            return t10;
        }
        T tInvoke = factory.invoke();
        this.f20954a = new SoftReference<>(tInvoke);
        return tInvoke;
    }
}
