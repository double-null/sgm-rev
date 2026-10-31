package ud;

/* JADX INFO: compiled from: DispatchedTask.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class c1 {
    public static final <T> void a(b1<? super T> b1Var, int i10) {
        zc.f<? super T> fVarE = b1Var.e();
        boolean z10 = i10 == 4;
        if (z10 || !(fVarE instanceof zd.g) || b(i10) != b(b1Var.f26720c)) {
            d(b1Var, fVarE, z10);
            return;
        }
        zd.g gVar = (zd.g) fVarE;
        k0 k0Var = gVar.f29195d;
        zc.j context = gVar.getContext();
        if (k0Var.n0(context)) {
            k0Var.m0(context, b1Var);
        } else {
            e(b1Var);
        }
    }

    public static final boolean b(int i10) {
        return i10 == 1 || i10 == 2;
    }

    public static final boolean c(int i10) {
        return i10 == 2;
    }

    public static final <T> void d(b1<? super T> b1Var, zc.f<? super T> fVar, boolean z10) {
        Object objH;
        Object objJ = b1Var.j();
        Throwable thF = b1Var.f(objJ);
        if (thF != null) {
            wc.r.a aVar = wc.r.f27774b;
            objH = wc.s.a(thF);
        } else {
            wc.r.a aVar2 = wc.r.f27774b;
            objH = b1Var.h(objJ);
        }
        Object objC = wc.r.c(objH);
        if (!z10) {
            fVar.resumeWith(objC);
            return;
        }
        kotlin.jvm.internal.t.d(fVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        zd.g gVar = (zd.g) fVar;
        zc.f<T> fVar2 = gVar.f29196e;
        Object obj = gVar.f29198g;
        zc.j context = fVar2.getContext();
        Object objI = zd.l0.i(context, obj);
        a3<?> a3VarM = objI != zd.l0.f29213a ? i0.m(fVar2, context, objI) : null;
        try {
            gVar.f29196e.resumeWith(objC);
            wc.g0 g0Var = wc.g0.f27756a;
        } finally {
            if (a3VarM == null || a3VarM.Y0()) {
                zd.l0.f(context, objI);
            }
        }
    }

    private static final void e(b1<?> b1Var) {
        k1 k1VarB = v2.f26824a.b();
        if (k1VarB.x0()) {
            k1VarB.t0(b1Var);
            return;
        }
        k1VarB.v0(true);
        try {
            d(b1Var, b1Var.e(), true);
            do {
            } while (k1VarB.A0());
        } catch (Throwable th) {
            try {
                b1Var.i(th);
            } finally {
                k1VarB.q0(true);
            }
        }
    }
}
