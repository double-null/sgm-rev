package ud;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: Delay.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class y0 {
    public static final Object a(long j10, zc.f<? super wc.g0> fVar) {
        if (j10 <= 0) {
            return wc.g0.f27756a;
        }
        p pVar = new p(ad.c.c(fVar), 1);
        pVar.G();
        if (j10 < Long.MAX_VALUE) {
            c(pVar.getContext()).u(j10, pVar);
        }
        Object objZ = pVar.z();
        if (objZ == ad.d.f()) {
            kotlin.coroutines.jvm.internal.h.c(fVar);
        }
        return objZ == ad.d.f() ? objZ : wc.g0.f27756a;
    }

    public static final Object b(long j10, zc.f<? super wc.g0> fVar) {
        Object objA = a(d(j10), fVar);
        return objA == ad.d.f() ? objA : wc.g0.f27756a;
    }

    public static final x0 c(zc.j jVar) {
        zc.j.b bVarE = jVar.e(zc.g.f29179a9);
        x0 x0Var = bVarE instanceof x0 ? (x0) bVarE : null;
        return x0Var == null ? u0.a() : x0Var;
    }

    public static final long d(long j10) {
        boolean zD = sd.a.D(j10);
        if (zD) {
            return sd.a.p(sd.a.E(j10, sd.c.t(999999L, sd.d.NANOSECONDS)));
        }
        if (zD) {
            throw new NoWhenBranchMatchedException();
        }
        return 0L;
    }
}
