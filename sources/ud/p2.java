package ud;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes5.dex */
final class p2<T> extends f2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p<T> f26803e;

    /* JADX WARN: Multi-variable type inference failed */
    public p2(p<? super T> pVar) {
        this.f26803e = pVar;
    }

    @Override // ud.f2
    public boolean w() {
        return false;
    }

    @Override // ud.f2
    public void x(Throwable th) {
        Object objO0 = v().o0();
        if (objO0 instanceof c0) {
            p<T> pVar = this.f26803e;
            wc.r.a aVar = wc.r.f27774b;
            pVar.resumeWith(wc.r.c(wc.s.a(((c0) objO0).f26724a)));
        } else {
            p<T> pVar2 = this.f26803e;
            wc.r.a aVar2 = wc.r.f27774b;
            pVar2.resumeWith(wc.r.c(h2.h(objO0)));
        }
    }
}
