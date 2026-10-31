package ae;

import ad.c;
import ad.d;
import id.p;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.m0;
import kotlinx.coroutines.TimeoutCancellationException;
import ud.c0;
import ud.h2;
import wc.r;
import wc.s;
import zc.f;
import zc.j;
import zd.a0;
import zd.l0;

/* JADX INFO: compiled from: Undispatched.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class b {
    public static final <R, T> void a(p<? super R, ? super f<? super T>, ? extends Object> pVar, R r10, f<? super T> fVar) {
        f fVarA = h.a(fVar);
        try {
            j context = fVarA.getContext();
            Object objI = l0.i(context, null);
            try {
                h.b(fVarA);
                Object objD = !(pVar instanceof kotlin.coroutines.jvm.internal.a) ? c.d(pVar, r10, fVarA) : ((p) m0.d(pVar, 2)).invoke(r10, fVarA);
                l0.f(context, objI);
                if (objD != d.f()) {
                    fVarA.resumeWith(r.c(objD));
                }
            } catch (Throwable th) {
                l0.f(context, objI);
                throw th;
            }
        } catch (Throwable th2) {
            r.a aVar = r.f27774b;
            fVarA.resumeWith(r.c(s.a(th2)));
        }
    }

    public static final <T, R> Object b(a0<? super T> a0Var, R r10, p<? super R, ? super f<? super T>, ? extends Object> pVar) {
        Object c0Var;
        Object objY0;
        try {
            c0Var = !(pVar instanceof kotlin.coroutines.jvm.internal.a) ? c.d(pVar, r10, a0Var) : ((p) m0.d(pVar, 2)).invoke(r10, a0Var);
        } catch (Throwable th) {
            c0Var = new c0(th, false, 2, null);
        }
        if (c0Var != d.f() && (objY0 = a0Var.y0(c0Var)) != h2.f26766b) {
            if (objY0 instanceof c0) {
                throw ((c0) objY0).f26724a;
            }
            return h2.h(objY0);
        }
        return d.f();
    }

    public static final <T, R> Object c(a0<? super T> a0Var, R r10, p<? super R, ? super f<? super T>, ? extends Object> pVar) throws Throwable {
        Object c0Var;
        Object objY0;
        try {
            c0Var = !(pVar instanceof kotlin.coroutines.jvm.internal.a) ? c.d(pVar, r10, a0Var) : ((p) m0.d(pVar, 2)).invoke(r10, a0Var);
        } catch (Throwable th) {
            c0Var = new c0(th, false, 2, null);
        }
        if (c0Var != d.f() && (objY0 = a0Var.y0(c0Var)) != h2.f26766b) {
            if (objY0 instanceof c0) {
                Throwable th2 = ((c0) objY0).f26724a;
                if (((th2 instanceof TimeoutCancellationException) && ((TimeoutCancellationException) th2).f21540a == a0Var) ? false : true) {
                    throw th2;
                }
                if (c0Var instanceof c0) {
                    throw ((c0) c0Var).f26724a;
                }
            } else {
                c0Var = h2.h(objY0);
            }
            return c0Var;
        }
        return d.f();
    }
}
