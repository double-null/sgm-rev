package ud;

import com.vungle.ads.internal.persistence.mP.RHIpdOnfgiYkEj;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: Builders.common.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a1<T> extends zd.a0<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f26712e = AtomicIntegerFieldUpdater.newUpdater(a1.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    public a1(zc.j jVar, zc.f<? super T> fVar) {
        super(jVar, fVar);
    }

    private final boolean a1() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f26712e;
        do {
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f26712e.compareAndSet(this, 0, 2));
        return true;
    }

    @Override // zd.a0, ud.g2
    protected void A(Object obj) {
        U0(obj);
    }

    @Override // zd.a0, ud.a
    protected void U0(Object obj) {
        if (a1()) {
            return;
        }
        zd.h.b(ad.c.c(this.f29183d), d0.a(obj, this.f29183d));
    }

    public final Object Y0() {
        if (b1()) {
            return ad.d.f();
        }
        Object objH = h2.h(o0());
        if (objH instanceof c0) {
            throw ((c0) objH).f26724a;
        }
        return objH;
    }

    private final boolean b1() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f26712e;
        do {
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 2) {
                    return false;
                }
                throw new IllegalStateException(RHIpdOnfgiYkEj.iUGAkfNgd.toString());
            }
        } while (!f26712e.compareAndSet(this, 0, 1));
        return true;
    }
}
