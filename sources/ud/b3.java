package ud;

/* JADX INFO: compiled from: CoroutineContext.kt */
/* JADX INFO: loaded from: classes5.dex */
final class b3 implements zc.j.b, zc.j.c<b3> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b3 f26722a = new b3();

    private b3() {
    }

    @Override // zc.j
    public <R> R U(R r10, id.p<? super R, ? super zc.j.b, ? extends R> pVar) {
        return (R) zc.j.b.a.a(this, r10, pVar);
    }

    @Override // zc.j
    public zc.j a0(zc.j.c<?> cVar) {
        return zc.j.b.a.c(this, cVar);
    }

    @Override // zc.j.b, zc.j
    public <E extends zc.j.b> E e(zc.j.c<E> cVar) {
        return (E) zc.j.b.a.b(this, cVar);
    }

    @Override // zc.j
    public zc.j z(zc.j jVar) {
        return zc.j.b.a.d(this, jVar);
    }

    @Override // zc.j.b
    public zc.j.c<?> getKey() {
        return this;
    }
}
