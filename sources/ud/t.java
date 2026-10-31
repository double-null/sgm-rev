package ud;

/* JADX INFO: compiled from: CancellableContinuationImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
final class t extends f2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p<?> f26816e;

    public t(p<?> pVar) {
        this.f26816e = pVar;
    }

    @Override // ud.f2
    public boolean w() {
        return true;
    }

    @Override // ud.f2
    public void x(Throwable th) {
        p<?> pVar = this.f26816e;
        pVar.O(pVar.v(v()));
    }
}
