package ud;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes5.dex */
final class a2 extends f2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final id.l<Throwable, wc.g0> f26713e;

    /* JADX WARN: Multi-variable type inference failed */
    public a2(id.l<? super Throwable, wc.g0> lVar) {
        this.f26713e = lVar;
    }

    @Override // ud.f2
    public boolean w() {
        return false;
    }

    @Override // ud.f2
    public void x(Throwable th) {
        this.f26713e.invoke(th);
    }
}
