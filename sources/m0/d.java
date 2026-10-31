package m0;

import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: CreationExtras.kt */
/* JADX INFO: loaded from: classes.dex */
public final class d extends a {
    public d(a initialExtras) {
        t.f(initialExtras, "initialExtras");
        b().putAll(initialExtras.b());
    }

    @Override // m0.a
    public <T> T a(a.b<T> key) {
        t.f(key, "key");
        return (T) b().get(key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> void c(a.b<T> key, T t10) {
        t.f(key, "key");
        b().put(key, t10);
    }
}
