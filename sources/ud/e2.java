package ud;

import java.util.Iterator;
import java.util.concurrent.CancellationException;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: Job.kt */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class e2 {

    /* JADX INFO: compiled from: Job.kt */
    /* synthetic */ class a extends kotlin.jvm.internal.q implements id.l<Throwable, wc.g0> {
        a(Object obj) {
            super(1, obj, f2.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0);
        }

        @Override // id.l
        public /* bridge */ /* synthetic */ wc.g0 invoke(Throwable th) {
            k(th);
            return wc.g0.f27756a;
        }

        public final void k(Throwable th) {
            ((f2) this.receiver).x(th);
        }
    }

    public static final a0 a(b2 b2Var) {
        return new c2(b2Var);
    }

    public static /* synthetic */ a0 b(b2 b2Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            b2Var = null;
        }
        return d2.a(b2Var);
    }

    public static final void c(zc.j jVar, CancellationException cancellationException) {
        b2 b2Var = (b2) jVar.e(b2.X8);
        if (b2Var != null) {
            b2Var.f(cancellationException);
        }
    }

    public static /* synthetic */ void d(zc.j jVar, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        d2.c(jVar, cancellationException);
    }

    public static final void e(zc.j jVar, CancellationException cancellationException) {
        qd.g<b2> gVarO;
        b2 b2Var = (b2) jVar.e(b2.X8);
        if (b2Var == null || (gVarO = b2Var.o()) == null) {
            return;
        }
        Iterator<b2> it = gVarO.iterator();
        while (it.hasNext()) {
            it.next().f(cancellationException);
        }
    }

    public static /* synthetic */ void f(zc.j jVar, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        d2.e(jVar, cancellationException);
    }

    public static final g1 g(b2 b2Var, g1 g1Var) {
        return l(b2Var, false, new i1(g1Var), 1, null);
    }

    public static final void h(b2 b2Var) {
        if (!b2Var.c()) {
            throw b2Var.v();
        }
    }

    public static final void i(zc.j jVar) {
        b2 b2Var = (b2) jVar.e(b2.X8);
        if (b2Var != null) {
            d2.h(b2Var);
        }
    }

    public static final b2 j(zc.j jVar) {
        b2 b2Var = (b2) jVar.e(b2.X8);
        if (b2Var != null) {
            return b2Var;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + jVar).toString());
    }

    public static final g1 k(b2 b2Var, boolean z10, f2 f2Var) {
        return b2Var instanceof g2 ? ((g2) b2Var).u0(z10, f2Var) : b2Var.k0(f2Var.w(), z10, new a(f2Var));
    }

    public static /* synthetic */ g1 l(b2 b2Var, boolean z10, f2 f2Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return d2.k(b2Var, z10, f2Var);
    }
}
