package ud;

/* JADX INFO: compiled from: CoroutineContext.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a3<T> extends zd.a0<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ThreadLocal<wc.q<zc.j, Object>> f26714e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public a3(zc.j jVar, zc.f<? super T> fVar) {
        b3 b3Var = b3.f26722a;
        super(jVar.e(b3Var) == null ? jVar.z(b3Var) : jVar, fVar);
        this.f26714e = new ThreadLocal<>();
        if (fVar.getContext().e(zc.g.f29179a9) instanceof k0) {
            return;
        }
        Object objI = zd.l0.i(jVar, null);
        zd.l0.f(jVar, objI);
        Z0(jVar, objI);
    }

    @Override // zd.a0, ud.a
    protected void U0(Object obj) {
        if (this.threadLocalIsSet) {
            wc.q<zc.j, Object> qVar = this.f26714e.get();
            if (qVar != null) {
                zd.l0.f(qVar.b(), qVar.c());
            }
            this.f26714e.remove();
        }
        Object objA = d0.a(obj, this.f29183d);
        zc.f<T> fVar = this.f29183d;
        zc.j context = fVar.getContext();
        Object objI = zd.l0.i(context, null);
        a3<?> a3VarM = objI != zd.l0.f29213a ? i0.m(fVar, context, objI) : null;
        try {
            this.f29183d.resumeWith(objA);
            wc.g0 g0Var = wc.g0.f27756a;
        } finally {
            if (a3VarM == null || a3VarM.Y0()) {
                zd.l0.f(context, objI);
            }
        }
    }

    public final boolean Y0() {
        boolean z10 = this.threadLocalIsSet && this.f26714e.get() == null;
        this.f26714e.remove();
        return !z10;
    }

    public final void Z0(zc.j jVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f26714e.set(wc.w.a(jVar, obj));
    }
}
