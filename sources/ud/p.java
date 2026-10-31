package ud;

import com.facebook.internal.AnalyticsEvents;
import com.google.android.gms.common.util.cS.EFLCCdIRcb;
import g7.EinF.ZHgPsTG;
import io.bidmachine.analytics.internal.n.QQJ.WKirgUEJJ;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlinx.coroutines.CompletionHandlerException;

/* JADX INFO: compiled from: CancellableContinuationImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
public class p<T> extends b1<T> implements n<T>, kotlin.coroutines.jvm.internal.e, c3 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f26798f = AtomicIntegerFieldUpdater.newUpdater(p.class, "_decisionAndIndex$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f26799g = AtomicReferenceFieldUpdater.newUpdater(p.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f26800h = AtomicReferenceFieldUpdater.newUpdater(p.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final zc.f<T> f26801d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final zc.j f26802e;

    /* JADX WARN: Multi-variable type inference failed */
    public p(zc.f<? super T> fVar, int i10) {
        super(i10);
        this.f26801d = fVar;
        this.f26802e = fVar.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = d.f26726a;
    }

    private final String B() {
        Object objA = A();
        if (objA instanceof n2) {
            return "Active";
        }
        return objA instanceof s ? AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_CANCELLED : AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_COMPLETED;
    }

    private final g1 I() {
        b2 b2Var = (b2) getContext().e(b2.X8);
        if (b2Var == null) {
            return null;
        }
        g1 g1VarL = e2.l(b2Var, false, new t(this), 1, null);
        androidx.concurrent.futures.b.a(f26800h, this, null, g1VarL);
        return g1VarL;
    }

    private final void J(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f26799g;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof d) {
                if (androidx.concurrent.futures.b.a(f26799g, this, obj2, obj)) {
                    return;
                }
            } else if ((obj2 instanceof m) || (obj2 instanceof zd.b0)) {
                M(obj, obj2);
            } else {
                boolean z10 = obj2 instanceof c0;
                if (z10) {
                    c0 c0Var = (c0) obj2;
                    if (!c0Var.c()) {
                        M(obj, obj2);
                    }
                    if (obj2 instanceof s) {
                        if (!z10) {
                            c0Var = null;
                        }
                        Throwable th = c0Var != null ? c0Var.f26724a : null;
                        if (obj instanceof m) {
                            n((m) obj, th);
                            return;
                        } else {
                            kotlin.jvm.internal.t.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                            q((zd.b0) obj, th);
                            return;
                        }
                    }
                    return;
                }
                if (obj2 instanceof b0) {
                    b0 b0Var = (b0) obj2;
                    if (b0Var.f26716b != null) {
                        M(obj, obj2);
                    }
                    if (obj instanceof zd.b0) {
                        return;
                    }
                    kotlin.jvm.internal.t.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    m mVar = (m) obj;
                    if (b0Var.c()) {
                        n(mVar, b0Var.f26719e);
                        return;
                    } else {
                        if (androidx.concurrent.futures.b.a(f26799g, this, obj2, b0.b(b0Var, null, mVar, null, null, null, 29, null))) {
                            return;
                        }
                    }
                } else {
                    if (obj instanceof zd.b0) {
                        return;
                    }
                    kotlin.jvm.internal.t.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    if (androidx.concurrent.futures.b.a(f26799g, this, obj2, new b0(obj2, (m) obj, null, null, null, 28, null))) {
                        return;
                    }
                }
            }
        }
    }

    private final boolean L() {
        if (c1.c(this.f26720c)) {
            zc.f<T> fVar = this.f26801d;
            kotlin.jvm.internal.t.d(fVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (((zd.g) fVar).q()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wc.g0 S(id.l lVar, Throwable th, Object obj, zc.j jVar) {
        lVar.invoke(th);
        return wc.g0.f27756a;
    }

    public static /* synthetic */ void U(p pVar, Object obj, int i10, id.q qVar, int i11, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i11 & 4) != 0) {
            qVar = null;
        }
        pVar.T(obj, i10, qVar);
    }

    private final <R> Object V(n2 n2Var, R r10, int i10, id.q<? super Throwable, ? super R, ? super zc.j, wc.g0> qVar, Object obj) {
        if (r10 instanceof c0) {
            return r10;
        }
        if (!c1.b(i10) && obj == null) {
            return r10;
        }
        if (qVar == null && !(n2Var instanceof m) && obj == null) {
            return r10;
        }
        return new b0(r10, n2Var instanceof m ? (m) n2Var : null, qVar, obj, null, 16, null);
    }

    private final boolean W() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f26798f;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f26798f.compareAndSet(this, i10, 1073741824 + (536870911 & i10)));
        return true;
    }

    private final <R> zd.e0 X(R r10, Object obj, id.q<? super Throwable, ? super R, ? super zc.j, wc.g0> qVar) {
        Object obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f26799g;
        do {
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof n2)) {
                if ((obj2 instanceof b0) && obj != null && ((b0) obj2).f26718d == obj) {
                    return q.f26804a;
                }
                return null;
            }
        } while (!androidx.concurrent.futures.b.a(f26799g, this, obj2, V((n2) obj2, r10, this.f26720c, qVar, obj)));
        t();
        return q.f26804a;
    }

    private final boolean Y() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f26798f;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f26798f.compareAndSet(this, i10, 536870912 + (536870911 & i10)));
        return true;
    }

    private final Void m(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    private final boolean r(Throwable th) {
        if (!L()) {
            return false;
        }
        zc.f<T> fVar = this.f26801d;
        kotlin.jvm.internal.t.d(fVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((zd.g) fVar).r(th);
    }

    private final void t() {
        if (L()) {
            return;
        }
        s();
    }

    private final void u(int i10) {
        if (W()) {
            return;
        }
        c1.a(this, i10);
    }

    private final g1 y() {
        return (g1) f26800h.get(this);
    }

    public final Object A() {
        return f26799g.get(this);
    }

    @Override // ud.n
    public void D(k0 k0Var, T t10) {
        zc.f<T> fVar = this.f26801d;
        zd.g gVar = fVar instanceof zd.g ? (zd.g) fVar : null;
        U(this, t10, (gVar != null ? gVar.f29195d : null) == k0Var ? 4 : this.f26720c, null, 4, null);
    }

    public void G() {
        g1 g1VarI = I();
        if (g1VarI != null && k()) {
            g1VarI.e();
            f26800h.set(this, m2.f26792a);
        }
    }

    @Override // ud.n
    public void H(id.l<? super Throwable, wc.g0> lVar) {
        r.c(this, new m.a(lVar));
    }

    public final void K(m mVar) {
        J(mVar);
    }

    public final void O(Throwable th) {
        if (r(th)) {
            return;
        }
        x(th);
        t();
    }

    public final void P() {
        Throwable thT;
        zc.f<T> fVar = this.f26801d;
        zd.g gVar = fVar instanceof zd.g ? (zd.g) fVar : null;
        if (gVar == null || (thT = gVar.t(this)) == null) {
            return;
        }
        s();
        x(thT);
    }

    public final boolean Q() {
        Object obj = f26799g.get(this);
        if ((obj instanceof b0) && ((b0) obj).f26718d != null) {
            s();
            return false;
        }
        f26798f.set(this, 536870911);
        f26799g.set(this, d.f26726a);
        return true;
    }

    public void R(T t10, final id.l<? super Throwable, wc.g0> lVar) {
        T(t10, this.f26720c, lVar != null ? new id.q() { // from class: ud.o
            @Override // id.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return p.S(lVar, (Throwable) obj, obj2, (zc.j) obj3);
            }
        } : null);
    }

    public final <R> void T(R r10, int i10, id.q<? super Throwable, ? super R, ? super zc.j, wc.g0> qVar) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f26799g;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof n2)) {
                if (obj instanceof s) {
                    s sVar = (s) obj;
                    if (sVar.e()) {
                        if (qVar != null) {
                            o(qVar, sVar.f26724a, r10);
                            return;
                        }
                        return;
                    }
                }
                m(r10);
                throw new KotlinNothingValueException();
            }
        } while (!androidx.concurrent.futures.b.a(f26799g, this, obj, V((n2) obj, r10, i10, qVar, null)));
        t();
        u(i10);
    }

    @Override // ud.c3
    public void a(zd.b0<?> b0Var, int i10) {
        int i11;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f26798f;
        do {
            i11 = atomicIntegerFieldUpdater.get(this);
            if (!((i11 & 536870911) == 536870911)) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once".toString());
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, ((i11 >> 29) << 29) + i10));
        J(b0Var);
    }

    @Override // ud.n
    public boolean c() {
        return A() instanceof n2;
    }

    @Override // ud.b1
    public void d(Object obj, Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f26799g;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof n2) {
                throw new IllegalStateException("Not completed".toString());
            }
            if (obj2 instanceof c0) {
                return;
            }
            if (obj2 instanceof b0) {
                b0 b0Var = (b0) obj2;
                if (!(!b0Var.c())) {
                    throw new IllegalStateException("Must be called at most once".toString());
                }
                if (androidx.concurrent.futures.b.a(f26799g, this, obj2, b0.b(b0Var, null, null, null, null, th, 15, null))) {
                    b0Var.d(this, th);
                    return;
                }
            } else if (androidx.concurrent.futures.b.a(f26799g, this, obj2, new b0(obj2, null, null, null, th, 14, null))) {
                return;
            }
        }
    }

    @Override // ud.n
    public <R extends T> void d0(R r10, id.q<? super Throwable, ? super R, ? super zc.j, wc.g0> qVar) {
        T(r10, this.f26720c, qVar);
    }

    @Override // ud.b1
    public final zc.f<T> e() {
        return this.f26801d;
    }

    @Override // ud.b1
    public Throwable f(Object obj) {
        Throwable thF = super.f(obj);
        if (thF != null) {
            return thF;
        }
        return null;
    }

    @Override // ud.n
    public <R extends T> Object g(R r10, Object obj, id.q<? super Throwable, ? super R, ? super zc.j, wc.g0> qVar) {
        return X(r10, obj, qVar);
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        zc.f<T> fVar = this.f26801d;
        if (fVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) fVar;
        }
        return null;
    }

    @Override // zc.f
    public zc.j getContext() {
        return this.f26802e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ud.b1
    public <T> T h(Object obj) {
        return obj instanceof b0 ? (T) ((b0) obj).f26715a : obj;
    }

    @Override // ud.n
    public void h0(Object obj) {
        u(this.f26720c);
    }

    @Override // ud.b1
    public Object j() {
        return A();
    }

    @Override // ud.n
    public boolean k() {
        return !(A() instanceof n2);
    }

    public final void n(m mVar, Throwable th) {
        try {
            mVar.b(th);
        } catch (Throwable th2) {
            m0.a(getContext(), new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> void o(id.q<? super Throwable, ? super R, ? super zc.j, wc.g0> qVar, Throwable th, R r10) {
        try {
            qVar.invoke(th, r10, getContext());
        } catch (Throwable th2) {
            m0.a(getContext(), new CompletionHandlerException("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    @Override // zc.f
    public void resumeWith(Object obj) {
        U(this, d0.c(obj, this), this.f26720c, null, 4, null);
    }

    public final void s() {
        g1 g1VarY = y();
        if (g1VarY == null) {
            return;
        }
        g1VarY.e();
        f26800h.set(this, m2.f26792a);
    }

    public String toString() {
        return N() + '(' + s0.c(this.f26801d) + "){" + B() + "}@" + s0.b(this);
    }

    public Throwable v(b2 b2Var) {
        return b2Var.v();
    }

    @Override // ud.n
    public Object w(Throwable th) {
        return X(new c0(th, false, 2, null), null, null);
    }

    @Override // ud.n
    public boolean x(Throwable th) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f26799g;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof n2)) {
                return false;
            }
        } while (!androidx.concurrent.futures.b.a(f26799g, this, obj, new s(this, th, (obj instanceof m) || (obj instanceof zd.b0))));
        n2 n2Var = (n2) obj;
        if (n2Var instanceof m) {
            n((m) obj, th);
        } else if (n2Var instanceof zd.b0) {
            q((zd.b0) obj, th);
        }
        t();
        u(this.f26720c);
        return true;
    }

    public final Object z() {
        b2 b2Var;
        boolean zL = L();
        if (Y()) {
            if (y() == null) {
                I();
            }
            if (zL) {
                P();
            }
            return ad.d.f();
        }
        if (zL) {
            P();
        }
        Object objA = A();
        if (objA instanceof c0) {
            throw ((c0) objA).f26724a;
        }
        if (!c1.b(this.f26720c) || (b2Var = (b2) getContext().e(b2.X8)) == null || b2Var.c()) {
            return h(objA);
        }
        CancellationException cancellationExceptionV = b2Var.v();
        d(objA, cancellationExceptionV);
        throw cancellationExceptionV;
    }

    private final void M(Object obj, Object obj2) {
        throw new IllegalStateException((EFLCCdIRcb.Gbsz + obj + ", already has " + obj2).toString());
    }

    protected String N() {
        return ZHgPsTG.LdcXFusvdex;
    }

    private final void q(zd.b0<?> b0Var, Throwable th) {
        boolean z10;
        int i10 = f26798f.get(this) & 536870911;
        if (i10 != 536870911) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            try {
                b0Var.s(i10, th, getContext());
                return;
            } catch (Throwable th2) {
                m0.a(getContext(), new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
                return;
            }
        }
        throw new IllegalStateException(WKirgUEJJ.YPR.toString());
    }
}
