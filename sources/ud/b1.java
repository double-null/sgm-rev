package ud;

import java.util.concurrent.CancellationException;
import ze.tmM.zKUlck;

/* JADX INFO: compiled from: DispatchedTask.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class b1<T> extends be.h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26720c;

    public b1(int i10) {
        this.f26720c = i10;
    }

    public void d(Object obj, Throwable th) {
    }

    public abstract zc.f<T> e();

    public Throwable f(Object obj) {
        c0 c0Var = obj instanceof c0 ? (c0) obj : null;
        if (c0Var != null) {
            return c0Var.f26724a;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T h(Object obj) {
        return obj;
    }

    public abstract Object j();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            zc.f<T> fVarE = e();
            kotlin.jvm.internal.t.d(fVarE, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            zd.g gVar = (zd.g) fVarE;
            zc.f<T> fVar = gVar.f29196e;
            Object obj = gVar.f29198g;
            zc.j context = fVar.getContext();
            Object objI = zd.l0.i(context, obj);
            b2 b2Var = null;
            a3<?> a3VarM = objI != zd.l0.f29213a ? i0.m(fVar, context, objI) : null;
            try {
                zc.j context2 = fVar.getContext();
                Object objJ = j();
                Throwable thF = f(objJ);
                if (thF == null && c1.b(this.f26720c)) {
                    b2Var = (b2) context2.e(b2.X8);
                }
                if (b2Var != null && !b2Var.c()) {
                    CancellationException cancellationExceptionV = b2Var.v();
                    d(objJ, cancellationExceptionV);
                    wc.r.a aVar = wc.r.f27774b;
                    fVar.resumeWith(wc.r.c(wc.s.a(cancellationExceptionV)));
                } else if (thF != null) {
                    wc.r.a aVar2 = wc.r.f27774b;
                    fVar.resumeWith(wc.r.c(wc.s.a(thF)));
                } else {
                    wc.r.a aVar3 = wc.r.f27774b;
                    fVar.resumeWith(wc.r.c(h(objJ)));
                }
                wc.g0 g0Var = wc.g0.f27756a;
            } finally {
                if (a3VarM == null || a3VarM.Y0()) {
                    zd.l0.f(context, objI);
                }
            }
        } catch (Throwable th) {
            i(th);
        }
    }

    public final void i(Throwable th) {
        m0.a(e().getContext(), new r0("Fatal exception in coroutines machinery for " + this + zKUlck.tjTLGAQ, th));
    }
}
