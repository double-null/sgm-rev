package ud;

/* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class m0 {
    public static final void a(zc.j jVar, Throwable th) {
        try {
            l0 l0Var = (l0) jVar.e(l0.W8);
            if (l0Var != null) {
                l0Var.N(jVar, th);
            } else {
                zd.f.a(jVar, th);
            }
        } catch (Throwable th2) {
            zd.f.a(jVar, b(th, th2));
        }
    }

    public static final Throwable b(Throwable th, Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        wc.f.a(runtimeException, th);
        return runtimeException;
    }
}
