package ud;

/* JADX INFO: compiled from: CompletableDeferred.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class z {
    public static final <T> x<T> a(b2 b2Var) {
        return new y(b2Var);
    }

    public static /* synthetic */ x b(b2 b2Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            b2Var = null;
        }
        return a(b2Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> boolean c(x<T> xVar, Object obj) {
        Throwable thG = wc.r.g(obj);
        return thG == null ? xVar.G(obj) : xVar.F(thG);
    }
}
