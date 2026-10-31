package zd;

import java.util.concurrent.CancellationException;
import ud.a3;
import ud.b2;
import ud.k1;
import ud.v2;

/* JADX INFO: compiled from: DispatchedContinuation.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final e0 f29200a = new e0("UNDEFINED");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e0 f29201b = new e0("REUSABLE_CLAIMED");

    public static final <T> void b(zc.f<? super T> fVar, Object obj) {
        boolean z10;
        if (!(fVar instanceof g)) {
            fVar.resumeWith(obj);
            return;
        }
        g gVar = (g) fVar;
        Object objB = ud.d0.b(obj);
        if (gVar.f29195d.n0(gVar.getContext())) {
            gVar.f29197f = objB;
            gVar.f26720c = 1;
            gVar.f29195d.m0(gVar.getContext(), gVar);
            return;
        }
        k1 k1VarB = v2.f26824a.b();
        if (k1VarB.x0()) {
            gVar.f29197f = objB;
            gVar.f26720c = 1;
            k1VarB.t0(gVar);
            return;
        }
        k1VarB.v0(true);
        try {
            b2 b2Var = (b2) gVar.getContext().e(b2.X8);
            if (b2Var == null || b2Var.c()) {
                z10 = false;
            } else {
                CancellationException cancellationExceptionV = b2Var.v();
                gVar.d(objB, cancellationExceptionV);
                wc.r.a aVar = wc.r.f27774b;
                gVar.resumeWith(wc.r.c(wc.s.a(cancellationExceptionV)));
                z10 = true;
            }
            if (!z10) {
                zc.f<T> fVar2 = gVar.f29196e;
                Object obj2 = gVar.f29198g;
                zc.j context = fVar2.getContext();
                Object objI = l0.i(context, obj2);
                a3<?> a3VarM = objI != l0.f29213a ? ud.i0.m(fVar2, context, objI) : null;
                try {
                    gVar.f29196e.resumeWith(obj);
                    wc.g0 g0Var = wc.g0.f27756a;
                    if (a3VarM == null || a3VarM.Y0()) {
                        l0.f(context, objI);
                    }
                } catch (Throwable th) {
                    if (a3VarM == null || a3VarM.Y0()) {
                        l0.f(context, objI);
                    }
                    throw th;
                }
            }
            while (k1VarB.A0()) {
            }
        } catch (Throwable th2) {
            try {
                gVar.i(th2);
            } finally {
                k1VarB.q0(true);
            }
        }
    }
}
