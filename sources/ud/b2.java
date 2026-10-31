package ud;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: Job.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface b2 extends zc.j.b {
    public static final b X8 = b.f26721a;

    /* JADX INFO: compiled from: Job.kt */
    public static final class a {
        public static /* synthetic */ void a(b2 b2Var, CancellationException cancellationException, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i10 & 1) != 0) {
                cancellationException = null;
            }
            b2Var.f(cancellationException);
        }

        public static <R> R b(b2 b2Var, R r10, id.p<? super R, ? super zc.j.b, ? extends R> pVar) {
            return (R) zc.j.b.a.a(b2Var, r10, pVar);
        }

        public static <E extends zc.j.b> E c(b2 b2Var, zc.j.c<E> cVar) {
            return (E) zc.j.b.a.b(b2Var, cVar);
        }

        public static zc.j d(b2 b2Var, zc.j.c<?> cVar) {
            return zc.j.b.a.c(b2Var, cVar);
        }

        public static zc.j e(b2 b2Var, zc.j jVar) {
            return zc.j.b.a.d(b2Var, jVar);
        }
    }

    /* JADX INFO: compiled from: Job.kt */
    public static final class b implements zc.j.c<b2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ b f26721a = new b();

        private b() {
        }
    }

    u Y(w wVar);

    boolean c();

    void f(CancellationException cancellationException);

    boolean isCancelled();

    boolean k();

    g1 k0(boolean z10, boolean z11, id.l<? super Throwable, wc.g0> lVar);

    qd.g<b2> o();

    g1 s(id.l<? super Throwable, wc.g0> lVar);

    boolean start();

    CancellationException v();
}
