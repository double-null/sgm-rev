package wd;

import java.util.concurrent.atomic.AtomicReferenceArray;
import ud.c3;
import wc.g0;
import zd.b0;
import zd.x;

/* JADX INFO: compiled from: BufferedChannel.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class l<E> extends b0<l<E>> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final e<E> f27850e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final /* synthetic */ AtomicReferenceArray f27851f;

    public l(long j10, l<E> lVar, e<E> eVar, int i10) {
        super(j10, lVar, i10);
        this.f27850e = eVar;
        this.f27851f = new AtomicReferenceArray(f.f27824b * 2);
    }

    private final void E(int i10, Object obj) {
        z().set(i10 * 2, obj);
    }

    private final /* synthetic */ AtomicReferenceArray z() {
        return this.f27851f;
    }

    public final E A(int i10) {
        return (E) z().get(i10 * 2);
    }

    public final Object B(int i10) {
        return z().get((i10 * 2) + 1);
    }

    public final void C(int i10, boolean z10) {
        if (z10) {
            y().f1((this.f29187c * ((long) f.f27824b)) + ((long) i10));
        }
        t();
    }

    public final E D(int i10) {
        E eA = A(i10);
        w(i10);
        return eA;
    }

    public final void F(int i10, Object obj) {
        z().set((i10 * 2) + 1, obj);
    }

    public final void G(int i10, E e10) {
        E(i10, e10);
    }

    @Override // zd.b0
    public int r() {
        return f.f27824b;
    }

    @Override // zd.b0
    public void s(int i10, Throwable th, zc.j jVar) {
        id.l<E, g0> lVar;
        id.l<E, g0> lVar2;
        int i11 = f.f27824b;
        boolean z10 = i10 >= i11;
        if (z10) {
            i10 -= i11;
        }
        E eA = A(i10);
        while (true) {
            Object objB = B(i10);
            if ((objB instanceof c3) || (objB instanceof w)) {
                if (v(i10, objB, z10 ? f.f27832j : f.f27833k)) {
                    w(i10);
                    C(i10, !z10);
                    if (!z10 || (lVar = y().f27816b) == null) {
                        return;
                    }
                    x.a(lVar, eA, jVar);
                    return;
                }
            } else {
                if (objB == f.f27832j || objB == f.f27833k) {
                    break;
                }
                if (objB != f.f27829g && objB != f.f27828f) {
                    if (objB == f.f27831i || objB == f.f27826d || objB == f.z()) {
                        return;
                    }
                    throw new IllegalStateException(("unexpected state: " + objB).toString());
                }
            }
        }
        w(i10);
        if (!z10 || (lVar2 = y().f27816b) == null) {
            return;
        }
        x.a(lVar2, eA, jVar);
    }

    public final boolean v(int i10, Object obj, Object obj2) {
        return com.google.android.gms.internal.measurement.a.a(z(), (i10 * 2) + 1, obj, obj2);
    }

    public final void w(int i10) {
        E(i10, null);
    }

    public final Object x(int i10, Object obj) {
        return z().getAndSet((i10 * 2) + 1, obj);
    }

    public final e<E> y() {
        e<E> eVar = this.f27850e;
        kotlin.jvm.internal.t.c(eVar);
        return eVar;
    }
}
