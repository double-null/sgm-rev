package yd;

/* JADX INFO: compiled from: SafeCollector.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class h implements zc.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ zc.j f28891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f28892b;

    public h(Throwable th, zc.j jVar) {
        this.f28891a = jVar;
        this.f28892b = th;
    }

    @Override // zc.j
    public <R> R U(R r10, id.p<? super R, ? super zc.j.b, ? extends R> pVar) {
        return (R) this.f28891a.U(r10, pVar);
    }

    @Override // zc.j
    public zc.j a0(zc.j.c<?> cVar) {
        return this.f28891a.a0(cVar);
    }

    @Override // zc.j
    public <E extends zc.j.b> E e(zc.j.c<E> cVar) {
        return (E) this.f28891a.e(cVar);
    }

    @Override // zc.j
    public zc.j z(zc.j jVar) {
        return this.f28891a.z(jVar);
    }
}
