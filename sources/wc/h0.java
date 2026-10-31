package wc;

import java.io.Serializable;

/* JADX INFO: compiled from: Lazy.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class h0<T> implements k<T>, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private id.a<? extends T> f27758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f27759b;

    public h0(id.a<? extends T> initializer) {
        kotlin.jvm.internal.t.f(initializer, "initializer");
        this.f27758a = initializer;
        this.f27759b = d0.f27750a;
    }

    private final Object writeReplace() {
        return new h(getValue());
    }

    @Override // wc.k
    public T getValue() {
        if (this.f27759b == d0.f27750a) {
            id.a<? extends T> aVar = this.f27758a;
            kotlin.jvm.internal.t.c(aVar);
            this.f27759b = aVar.invoke();
            this.f27758a = null;
        }
        return (T) this.f27759b;
    }

    @Override // wc.k
    public boolean isInitialized() {
        return this.f27759b != d0.f27750a;
    }

    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
