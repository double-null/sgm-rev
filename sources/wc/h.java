package wc;

import java.io.Serializable;

/* JADX INFO: compiled from: Lazy.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class h<T> implements k<T>, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T f27757a;

    public h(T t10) {
        this.f27757a = t10;
    }

    @Override // wc.k
    public T getValue() {
        return this.f27757a;
    }

    @Override // wc.k
    public boolean isInitialized() {
        return true;
    }

    public String toString() {
        return String.valueOf(getValue());
    }
}
