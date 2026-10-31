package ud;

/* JADX INFO: compiled from: CancellableContinuation.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface n<T> extends zc.f<T> {

    /* JADX INFO: compiled from: CancellableContinuation.kt */
    public static final class a {
        public static /* synthetic */ boolean a(n nVar, Throwable th, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i10 & 1) != 0) {
                th = null;
            }
            return nVar.x(th);
        }
    }

    void D(k0 k0Var, T t10);

    void H(id.l<? super Throwable, wc.g0> lVar);

    boolean c();

    <R extends T> void d0(R r10, id.q<? super Throwable, ? super R, ? super zc.j, wc.g0> qVar);

    <R extends T> Object g(R r10, Object obj, id.q<? super Throwable, ? super R, ? super zc.j, wc.g0> qVar);

    void h0(Object obj);

    boolean k();

    Object w(Throwable th);

    boolean x(Throwable th);
}
