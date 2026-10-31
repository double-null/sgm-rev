package wd;

import kotlin.jvm.internal.i0;
import kotlinx.coroutines.internal.UndeliveredElementException;
import wc.g0;
import zd.x;

/* JADX INFO: compiled from: ConflatedBufferedChannel.kt */
/* JADX INFO: loaded from: classes5.dex */
public class p<E> extends e<E> {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f27856m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final a f27857n;

    public p(int i10, a aVar, id.l<? super E, g0> lVar) {
        super(i10, lVar);
        this.f27856m = i10;
        this.f27857n = aVar;
        if (!(aVar != a.SUSPEND)) {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + i0.b(e.class).g() + " instead").toString());
        }
        if (i10 >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i10 + " was specified").toString());
    }

    static /* synthetic */ <E> Object g1(p<E> pVar, E e10, zc.f<? super g0> fVar) throws Throwable {
        UndeliveredElementException undeliveredElementExceptionC;
        Object objI1 = pVar.i1(e10, true);
        if (!(objI1 instanceof k.a)) {
            return g0.f27756a;
        }
        k.e(objI1);
        id.l<E, g0> lVar = pVar.f27816b;
        if (lVar == null || (undeliveredElementExceptionC = x.c(lVar, e10, null, 2, null)) == null) {
            throw pVar.d0();
        }
        wc.f.a(undeliveredElementExceptionC, pVar.d0());
        throw undeliveredElementExceptionC;
    }

    private final Object h1(E e10, boolean z10) {
        id.l<E, g0> lVar;
        UndeliveredElementException undeliveredElementExceptionC;
        Object objI = super.i(e10);
        if (k.i(objI) || k.h(objI)) {
            return objI;
        }
        if (!z10 || (lVar = this.f27816b) == null || (undeliveredElementExceptionC = x.c(lVar, e10, null, 2, null)) == null) {
            return k.f27846b.c(g0.f27756a);
        }
        throw undeliveredElementExceptionC;
    }

    private final Object i1(E e10, boolean z10) {
        return this.f27857n == a.DROP_LATEST ? h1(e10, z10) : W0(e10);
    }

    @Override // wd.e, wd.v
    public Object i(E e10) {
        return i1(e10, false);
    }

    @Override // wd.e, wd.v
    public Object j(E e10, zc.f<? super g0> fVar) {
        return g1(this, e10, fVar);
    }

    @Override // wd.e
    protected boolean s0() {
        return this.f27857n == a.DROP_OLDEST;
    }
}
