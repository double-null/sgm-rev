package ae;

import ad.c;
import id.p;
import wc.g0;
import wc.r;
import wc.s;
import zc.f;
import zd.h;

/* JADX INFO: compiled from: Cancellable.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a {
    private static final void a(f<?> fVar, Throwable th) throws Throwable {
        r.a aVar = r.f27774b;
        fVar.resumeWith(r.c(s.a(th)));
        throw th;
    }

    public static final <R, T> void b(p<? super R, ? super f<? super T>, ? extends Object> pVar, R r10, f<? super T> fVar) {
        try {
            f fVarC = c.c(c.a(pVar, r10, fVar));
            r.a aVar = r.f27774b;
            h.b(fVarC, r.c(g0.f27756a));
        } catch (Throwable th) {
            a(fVar, th);
        }
    }

    public static final void c(f<? super g0> fVar, f<?> fVar2) throws Throwable {
        try {
            f fVarC = c.c(fVar);
            r.a aVar = r.f27774b;
            h.b(fVarC, r.c(g0.f27756a));
        } catch (Throwable th) {
            a(fVar2, th);
        }
    }
}
