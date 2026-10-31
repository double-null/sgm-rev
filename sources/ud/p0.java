package ud;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: CoroutineScope.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class p0 {
    public static final o0 a(zc.j jVar) {
        if (jVar.e(b2.X8) == null) {
            jVar = jVar.z(e2.b(null, 1, null));
        }
        return new zd.d(jVar);
    }

    public static final void b(o0 o0Var, CancellationException cancellationException) {
        b2 b2Var = (b2) o0Var.q().e(b2.X8);
        if (b2Var != null) {
            b2Var.f(cancellationException);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + o0Var).toString());
    }

    public static /* synthetic */ void c(o0 o0Var, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        b(o0Var, cancellationException);
    }

    public static final <R> Object d(id.p<? super o0, ? super zc.f<? super R>, ? extends Object> pVar, zc.f<? super R> fVar) {
        zd.a0 a0Var = new zd.a0(fVar.getContext(), fVar);
        Object objB = ae.b.b(a0Var, a0Var, pVar);
        if (objB == ad.d.f()) {
            kotlin.coroutines.jvm.internal.h.c(fVar);
        }
        return objB;
    }

    public static final void e(o0 o0Var) {
        d2.i(o0Var.q());
    }

    public static final boolean f(o0 o0Var) {
        b2 b2Var = (b2) o0Var.q().e(b2.X8);
        if (b2Var != null) {
            return b2Var.c();
        }
        return true;
    }
}
