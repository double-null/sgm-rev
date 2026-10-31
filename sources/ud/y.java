package ud;

/* JADX INFO: compiled from: CompletableDeferred.kt */
/* JADX INFO: loaded from: classes5.dex */
final class y<T> extends g2 implements x<T> {
    public y(b2 b2Var) {
        super(true);
        t0(b2Var);
    }

    @Override // ud.x
    public boolean F(Throwable th) {
        return x0(new c0(th, false, 2, null));
    }

    @Override // ud.x
    public boolean G(T t10) {
        return x0(t10);
    }

    @Override // ud.g2
    public boolean g0() {
        return true;
    }

    @Override // ud.v0
    public T h() {
        return (T) Z();
    }

    @Override // ud.v0
    public Object j0(zc.f<? super T> fVar) throws Throwable {
        Object objE = E(fVar);
        ad.d.f();
        return objE;
    }
}
