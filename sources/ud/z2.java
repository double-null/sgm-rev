package ud;

/* JADX INFO: compiled from: Unconfined.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class z2 extends k0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final z2 f26841c = new z2();

    private z2() {
    }

    @Override // ud.k0
    public void m0(zc.j jVar, Runnable runnable) {
        d3 d3Var = (d3) jVar.e(d3.f26728c);
        if (d3Var == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        d3Var.f26729b = true;
    }

    @Override // ud.k0
    public boolean n0(zc.j jVar) {
        return false;
    }

    @Override // ud.k0
    public k0 o0(int i10, String str) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // ud.k0
    public String toString() {
        return "Dispatchers.Unconfined";
    }
}
