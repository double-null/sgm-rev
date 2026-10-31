package ud;

/* JADX INFO: compiled from: CancellableContinuation.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class r {
    public static final void a(n<?> nVar, g1 g1Var) {
        c(nVar, new h1(g1Var));
    }

    public static final <T> p<T> b(zc.f<? super T> fVar) {
        if (!(fVar instanceof zd.g)) {
            return new p<>(fVar, 1);
        }
        p<T> pVarM = ((zd.g) fVar).m();
        if (pVarM != null) {
            if (!pVarM.Q()) {
                pVarM = null;
            }
            if (pVarM != null) {
                return pVarM;
            }
        }
        return new p<>(fVar, 2);
    }

    public static final <T> void c(n<? super T> nVar, m mVar) {
        if (!(nVar instanceof p)) {
            throw new UnsupportedOperationException("third-party implementation of CancellableContinuation is not supported");
        }
        ((p) nVar).K(mVar);
    }
}
