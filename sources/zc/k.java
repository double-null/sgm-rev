package zc;

import id.p;
import java.io.Serializable;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: CoroutineContextImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class k implements j, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f29181a = new k();

    private k() {
    }

    private final Object readResolve() {
        return f29181a;
    }

    @Override // zc.j
    public <R> R U(R r10, p<? super R, ? super j.b, ? extends R> operation) {
        t.f(operation, "operation");
        return r10;
    }

    @Override // zc.j
    public j a0(j.c<?> key) {
        t.f(key, "key");
        return this;
    }

    @Override // zc.j
    public <E extends j.b> E e(j.c<E> key) {
        t.f(key, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // zc.j
    public j z(j context) {
        t.f(context, "context");
        return context;
    }
}
