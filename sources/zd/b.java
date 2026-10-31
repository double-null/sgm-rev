package zd;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import zd.b;

/* JADX INFO: compiled from: ConcurrentLinkedList.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class b<N extends b<N>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f29184a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f29185b = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public b(N n10) {
        this._prev$volatile = n10;
    }

    private final N d() {
        N n10 = (N) h();
        while (n10 != null && n10.k()) {
            n10 = (N) f29185b.get(n10);
        }
        return n10;
    }

    private final N e() {
        b bVarF;
        N n10 = (N) f();
        kotlin.jvm.internal.t.c(n10);
        while (n10.k() && (bVarF = n10.f()) != null) {
            n10 = (N) bVarF;
        }
        return n10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object g() {
        return f29184a.get(this);
    }

    public final void c() {
        f29185b.set(this, null);
    }

    public final N f() {
        Object objG = g();
        if (objG == a.f29182a) {
            return null;
        }
        return (N) objG;
    }

    public final N h() {
        return (N) f29185b.get(this);
    }

    public abstract boolean k();

    public final boolean l() {
        return f() == null;
    }

    public final boolean m() {
        return androidx.concurrent.futures.b.a(f29184a, this, null, a.f29182a);
    }

    public final void n() {
        Object obj;
        if (l()) {
            return;
        }
        while (true) {
            b bVarD = d();
            b bVarE = e();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29185b;
            do {
                obj = atomicReferenceFieldUpdater.get(bVarE);
            } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, bVarE, obj, ((b) obj) == null ? null : bVarD));
            if (bVarD != null) {
                f29184a.set(bVarD, bVarE);
            }
            if (!bVarE.k() || bVarE.l()) {
                if (bVarD == null || !bVarD.k()) {
                    return;
                }
            }
        }
    }

    public final boolean o(N n10) {
        return androidx.concurrent.futures.b.a(f29184a, this, null, n10);
    }
}
