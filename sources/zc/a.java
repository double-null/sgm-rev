package zc;

import id.p;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: CoroutineContextImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class a implements j.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j.c<?> f29170a;

    public a(j.c<?> key) {
        t.f(key, "key");
        this.f29170a = key;
    }

    @Override // zc.j
    public <R> R U(R r10, p<? super R, ? super j.b, ? extends R> pVar) {
        return (R) j.b.a.a(this, r10, pVar);
    }

    @Override // zc.j
    public j a0(j.c<?> cVar) {
        return j.b.a.c(this, cVar);
    }

    @Override // zc.j.b, zc.j
    public <E extends j.b> E e(j.c<E> cVar) {
        return (E) j.b.a.b(this, cVar);
    }

    @Override // zc.j.b
    public j.c<?> getKey() {
        return this.f29170a;
    }

    @Override // zc.j
    public j z(j jVar) {
        return j.b.a.d(this, jVar);
    }
}
