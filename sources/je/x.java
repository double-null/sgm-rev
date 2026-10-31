package je;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: Caching.kt */
/* JADX INFO: loaded from: classes5.dex */
final class x<T> implements r2<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final id.l<pd.c<?>, fe.d<T>> f21031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap<Class<?>, m<T>> f21032b;

    /* JADX WARN: Multi-variable type inference failed */
    public x(id.l<? super pd.c<?>, ? extends fe.d<T>> compute) {
        kotlin.jvm.internal.t.f(compute, "compute");
        this.f21031a = compute;
        this.f21032b = new ConcurrentHashMap<>();
    }

    @Override // je.r2
    public fe.d<T> a(pd.c<Object> key) {
        m<T> mVarPutIfAbsent;
        kotlin.jvm.internal.t.f(key, "key");
        ConcurrentHashMap<Class<?>, m<T>> concurrentHashMap = this.f21032b;
        Class<?> clsA = hd.a.a(key);
        m<T> mVar = concurrentHashMap.get(clsA);
        if (mVar == null && (mVarPutIfAbsent = concurrentHashMap.putIfAbsent(clsA, (mVar = new m<>(this.f21031a.invoke(key))))) != null) {
            mVar = mVarPutIfAbsent;
        }
        return mVar.f20962a;
    }
}
