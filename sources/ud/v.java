package ud;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes5.dex */
final class v extends f2 implements u {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w f26822e;

    public v(w wVar) {
        this.f26822e = wVar;
    }

    @Override // ud.u
    public boolean d(Throwable th) {
        return v().S(th);
    }

    @Override // ud.u
    public b2 getParent() {
        return v();
    }

    @Override // ud.f2
    public boolean w() {
        return true;
    }

    @Override // ud.f2
    public void x(Throwable th) {
        this.f26822e.n(v());
    }
}
