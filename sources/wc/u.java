package wc;

import java.io.Serializable;

/* JADX INFO: compiled from: LazyJVM.kt */
/* JADX INFO: loaded from: classes5.dex */
final class u<T> implements k<T>, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private id.a<? extends T> f27782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Object f27783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f27784c;

    public u(id.a<? extends T> initializer, Object obj) {
        kotlin.jvm.internal.t.f(initializer, "initializer");
        this.f27782a = initializer;
        this.f27783b = d0.f27750a;
        this.f27784c = obj == null ? this : obj;
    }

    private final Object writeReplace() {
        return new h(getValue());
    }

    @Override // wc.k
    public T getValue() {
        T tInvoke;
        T t10 = (T) this.f27783b;
        d0 d0Var = d0.f27750a;
        if (t10 != d0Var) {
            return t10;
        }
        synchronized (this.f27784c) {
            tInvoke = (T) this.f27783b;
            if (tInvoke == d0Var) {
                id.a<? extends T> aVar = this.f27782a;
                kotlin.jvm.internal.t.c(aVar);
                tInvoke = aVar.invoke();
                this.f27783b = tInvoke;
                this.f27782a = null;
            }
        }
        return tInvoke;
    }

    @Override // wc.k
    public boolean isInitialized() {
        return this.f27783b != d0.f27750a;
    }

    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    public /* synthetic */ u(id.a aVar, Object obj, int i10, kotlin.jvm.internal.k kVar) {
        this(aVar, (i10 & 2) != 0 ? null : obj);
    }
}
