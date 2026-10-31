package zd;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import ud.b1;
import ud.k1;
import ud.s0;
import ud.v2;

/* JADX INFO: compiled from: DispatchedContinuation.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class g<T> extends b1<T> implements kotlin.coroutines.jvm.internal.e, zc.f<T> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f29194h = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ud.k0 f29195d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final zc.f<T> f29196e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f29197f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f29198g;

    /* JADX WARN: Multi-variable type inference failed */
    public g(ud.k0 k0Var, zc.f<? super T> fVar) {
        super(-1);
        this.f29195d = k0Var;
        this.f29196e = fVar;
        this.f29197f = h.f29200a;
        this.f29198g = l0.g(getContext());
    }

    private final ud.p<?> n() {
        Object obj = f29194h.get(this);
        if (obj instanceof ud.p) {
            return (ud.p) obj;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        zc.f<T> fVar = this.f29196e;
        if (fVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) fVar;
        }
        return null;
    }

    @Override // zc.f
    public zc.j getContext() {
        return this.f29196e.getContext();
    }

    @Override // ud.b1
    public Object j() {
        Object obj = this.f29197f;
        this.f29197f = h.f29200a;
        return obj;
    }

    public final void l() {
        while (f29194h.get(this) == h.f29201b) {
        }
    }

    public final ud.p<T> m() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29194h;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                f29194h.set(this, h.f29201b);
                return null;
            }
            if (obj instanceof ud.p) {
                if (androidx.concurrent.futures.b.a(f29194h, this, obj, h.f29201b)) {
                    return (ud.p) obj;
                }
            } else if (obj != h.f29201b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    public final boolean q() {
        return f29194h.get(this) != null;
    }

    public final boolean r(Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29194h;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            e0 e0Var = h.f29201b;
            if (kotlin.jvm.internal.t.a(obj, e0Var)) {
                if (androidx.concurrent.futures.b.a(f29194h, this, e0Var, th)) {
                    return true;
                }
            } else {
                if (obj instanceof Throwable) {
                    return true;
                }
                if (androidx.concurrent.futures.b.a(f29194h, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    @Override // zc.f
    public void resumeWith(Object obj) {
        Object objB = ud.d0.b(obj);
        if (this.f29195d.n0(getContext())) {
            this.f29197f = objB;
            this.f26720c = 0;
            this.f29195d.m0(getContext(), this);
            return;
        }
        k1 k1VarB = v2.f26824a.b();
        if (k1VarB.x0()) {
            this.f29197f = objB;
            this.f26720c = 0;
            k1VarB.t0(this);
            return;
        }
        k1VarB.v0(true);
        try {
            zc.j context = getContext();
            Object objI = l0.i(context, this.f29198g);
            try {
                this.f29196e.resumeWith(obj);
                wc.g0 g0Var = wc.g0.f27756a;
                l0.f(context, objI);
                while (k1VarB.A0()) {
                }
            } catch (Throwable th) {
                l0.f(context, objI);
                throw th;
            }
        } catch (Throwable th2) {
            try {
                i(th2);
            } finally {
                k1VarB.q0(true);
            }
        }
    }

    public final void s() {
        l();
        ud.p<?> pVarN = n();
        if (pVarN != null) {
            pVarN.s();
        }
    }

    public final Throwable t(ud.n<?> nVar) {
        e0 e0Var;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29194h;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            e0Var = h.f29201b;
            if (obj != e0Var) {
                if (obj instanceof Throwable) {
                    if (androidx.concurrent.futures.b.a(f29194h, this, obj, null)) {
                        return (Throwable) obj;
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        } while (!androidx.concurrent.futures.b.a(f29194h, this, e0Var, nVar));
        return null;
    }

    public String toString() {
        return "DispatchedContinuation[" + this.f29195d + ", " + s0.c(this.f29196e) + ']';
    }

    @Override // ud.b1
    public zc.f<T> e() {
        return this;
    }
}
