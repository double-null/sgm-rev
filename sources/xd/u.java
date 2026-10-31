package xd;

import com.applovin.impl.sdk.i0;
import java.util.concurrent.atomic.AtomicReference;
import wc.g0;

/* JADX INFO: compiled from: StateFlow.kt */
/* JADX INFO: loaded from: classes5.dex */
final class u extends yd.c<s<?>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference<Object> f28567a = new AtomicReference<>(null);

    @Override // yd.c
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(s<?> sVar) {
        if (zd.c.a(this.f28567a) != null) {
            return false;
        }
        zd.c.b(this.f28567a, t.f28565a);
        return true;
    }

    public final Object e(zc.f<? super g0> fVar) {
        ud.p pVar = new ud.p(ad.c.c(fVar), 1);
        pVar.G();
        if (!i0.a(this.f28567a, t.f28565a, pVar)) {
            wc.r.a aVar = wc.r.f27774b;
            pVar.resumeWith(wc.r.c(g0.f27756a));
        }
        Object objZ = pVar.z();
        if (objZ == ad.d.f()) {
            kotlin.coroutines.jvm.internal.h.c(fVar);
        }
        return objZ == ad.d.f() ? objZ : g0.f27756a;
    }

    @Override // yd.c
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public zc.f<g0>[] b(s<?> sVar) {
        zd.c.b(this.f28567a, null);
        return yd.b.f28876a;
    }

    public final void g() {
        AtomicReference<Object> atomicReference = this.f28567a;
        while (true) {
            Object objA = zd.c.a(atomicReference);
            if (objA == null || objA == t.f28566b) {
                return;
            }
            if (objA == t.f28565a) {
                if (i0.a(this.f28567a, objA, t.f28566b)) {
                    return;
                }
            } else if (i0.a(this.f28567a, objA, t.f28565a)) {
                wc.r.a aVar = wc.r.f27774b;
                ((ud.p) objA).resumeWith(wc.r.c(g0.f27756a));
                return;
            }
        }
    }

    public final boolean h() {
        Object andSet = this.f28567a.getAndSet(t.f28565a);
        kotlin.jvm.internal.t.c(andSet);
        return andSet == t.f28566b;
    }
}
