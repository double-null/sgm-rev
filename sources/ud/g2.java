package ud;

import c0.IbU.elEbP;
import com.adjust.sdk.network.ErrorCodes;
import com.applovin.mediation.ads.Zfi.OgqfiHA;
import com.facebook.internal.AnalyticsEvents;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes5.dex */
public class g2 implements b2, w, o2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f26747a = AtomicReferenceFieldUpdater.newUpdater(g2.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f26748b = AtomicReferenceFieldUpdater.newUpdater(g2.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: compiled from: JobSupport.kt */
    private static final class a<T> extends p<T> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final g2 f26749i;

        public a(zc.f<? super T> fVar, g2 g2Var) {
            super(fVar, 1);
            this.f26749i = g2Var;
        }

        @Override // ud.p
        protected String N() {
            return "AwaitContinuation";
        }

        @Override // ud.p
        public Throwable v(b2 b2Var) {
            Throwable thF;
            Object objO0 = this.f26749i.o0();
            if (!(objO0 instanceof c) || (thF = ((c) objO0).f()) == null) {
                return objO0 instanceof c0 ? ((c0) objO0).f26724a : b2Var.v();
            }
            return thF;
        }
    }

    /* JADX INFO: compiled from: JobSupport.kt */
    private static final class b extends f2 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final g2 f26750e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final c f26751f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final v f26752g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final Object f26753h;

        public b(g2 g2Var, c cVar, v vVar, Object obj) {
            this.f26750e = g2Var;
            this.f26751f = cVar;
            this.f26752g = vVar;
            this.f26753h = obj;
        }

        @Override // ud.f2
        public boolean w() {
            return false;
        }

        @Override // ud.f2
        public void x(Throwable th) {
            this.f26750e.V(this.f26751f, this.f26752g, this.f26753h);
        }
    }

    /* JADX INFO: compiled from: JobSupport.kt */
    private static final class c implements w1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ AtomicIntegerFieldUpdater f26754b = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isCompleting$volatile");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f26755c = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_rootCause$volatile");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f26756d = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_exceptionsHolder$volatile");
        private volatile /* synthetic */ Object _exceptionsHolder$volatile;
        private volatile /* synthetic */ int _isCompleting$volatile;
        private volatile /* synthetic */ Object _rootCause$volatile;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final l2 f26757a;

        public c(l2 l2Var, boolean z10, Throwable th) {
            this.f26757a = l2Var;
            this._isCompleting$volatile = z10 ? 1 : 0;
            this._rootCause$volatile = th;
        }

        private final ArrayList<Throwable> d() {
            return new ArrayList<>(4);
        }

        private final Object e() {
            return f26756d.get(this);
        }

        private final void o(Object obj) {
            f26756d.set(this, obj);
        }

        @Override // ud.w1
        public l2 a() {
            return this.f26757a;
        }

        public final void b(Throwable th) {
            Throwable thF = f();
            if (thF == null) {
                p(th);
                return;
            }
            if (th == thF) {
                return;
            }
            Object objE = e();
            if (objE == null) {
                o(th);
                return;
            }
            if (objE instanceof Throwable) {
                if (th == objE) {
                    return;
                }
                ArrayList<Throwable> arrayListD = d();
                arrayListD.add(objE);
                arrayListD.add(th);
                o(arrayListD);
                return;
            }
            if (objE instanceof ArrayList) {
                ((ArrayList) objE).add(th);
                return;
            }
            throw new IllegalStateException(("State is " + objE).toString());
        }

        @Override // ud.w1
        public boolean c() {
            return f() == null;
        }

        public final Throwable f() {
            return (Throwable) f26755c.get(this);
        }

        public final boolean j() {
            return f() != null;
        }

        public final boolean k() {
            return f26754b.get(this) != 0;
        }

        public final boolean l() {
            return e() == h2.f26769e;
        }

        public final List<Throwable> m(Throwable th) {
            ArrayList<Throwable> arrayListD;
            Object objE = e();
            if (objE == null) {
                arrayListD = d();
            } else if (objE instanceof Throwable) {
                ArrayList<Throwable> arrayListD2 = d();
                arrayListD2.add(objE);
                arrayListD = arrayListD2;
            } else {
                if (!(objE instanceof ArrayList)) {
                    throw new IllegalStateException(("State is " + objE).toString());
                }
                arrayListD = (ArrayList) objE;
            }
            Throwable thF = f();
            if (thF != null) {
                arrayListD.add(0, thF);
            }
            if (th != null && !kotlin.jvm.internal.t.a(th, thF)) {
                arrayListD.add(th);
            }
            o(h2.f26769e);
            return arrayListD;
        }

        public final void n(boolean z10) {
            f26754b.set(this, z10 ? 1 : 0);
        }

        public final void p(Throwable th) {
            f26755c.set(this, th);
        }

        public String toString() {
            return "Finishing[cancelling=" + j() + ", completing=" + k() + ", rootCause=" + f() + OgqfiHA.CKHRt + e() + ", list=" + a() + ']';
        }
    }

    /* JADX INFO: compiled from: JobSupport.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.JobSupport$children$1", f = "JobSupport.kt", l = {ErrorCodes.MALFORMED_URL_EXCEPTION, 1005}, m = "invokeSuspend")
    static final class d extends kotlin.coroutines.jvm.internal.k implements id.p<qd.i<? super b2>, zc.f<? super wc.g0>, Object> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f26758h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Object f26759i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f26760j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private /* synthetic */ Object f26761k;

        d(zc.f<? super d> fVar) {
            super(2, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f<wc.g0> create(Object obj, zc.f<?> fVar) {
            d dVar = g2.this.new d(fVar);
            dVar.f26761k = obj;
            return dVar;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x006b  */
        /* JADX WARN: Code duplicated, block: B:24:0x006f  */
        /* JADX WARN: Code duplicated, block: B:26:0x0082 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x006d -> B:27:0x0083). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0080 -> B:27:0x0083). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = ad.b.f()
                int r1 = r7.f26760j
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2b
                if (r1 == r3) goto L27
                if (r1 != r2) goto L1f
                java.lang.Object r1 = r7.f26759i
                zd.p r1 = (zd.p) r1
                java.lang.Object r3 = r7.f26758h
                zd.o r3 = (zd.o) r3
                java.lang.Object r4 = r7.f26761k
                qd.i r4 = (qd.i) r4
                wc.s.b(r8)
                r8 = r7
                goto L83
            L1f:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L27:
                wc.s.b(r8)
                goto L88
            L2b:
                wc.s.b(r8)
                java.lang.Object r8 = r7.f26761k
                qd.i r8 = (qd.i) r8
                ud.g2 r1 = ud.g2.this
                java.lang.Object r1 = r1.o0()
                boolean r4 = r1 instanceof ud.v
                if (r4 == 0) goto L49
                ud.v r1 = (ud.v) r1
                ud.w r1 = r1.f26822e
                r7.f26760j = r3
                java.lang.Object r8 = r8.a(r1, r7)
                if (r8 != r0) goto L88
                return r0
            L49:
                boolean r3 = r1 instanceof ud.w1
                if (r3 == 0) goto L88
                ud.w1 r1 = (ud.w1) r1
                ud.l2 r1 = r1.a()
                if (r1 == 0) goto L88
                java.lang.Object r3 = r1.l()
                java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"
                kotlin.jvm.internal.t.d(r3, r4)
                zd.p r3 = (zd.p) r3
                r4 = r8
                r8 = r7
                r6 = r3
                r3 = r1
                r1 = r6
            L65:
                boolean r5 = kotlin.jvm.internal.t.a(r1, r3)
                if (r5 != 0) goto L88
                boolean r5 = r1 instanceof ud.v
                if (r5 == 0) goto L83
                r5 = r1
                ud.v r5 = (ud.v) r5
                ud.w r5 = r5.f26822e
                r8.f26761k = r4
                r8.f26758h = r3
                r8.f26759i = r1
                r8.f26760j = r2
                java.lang.Object r5 = r4.a(r5, r8)
                if (r5 != r0) goto L83
                return r0
            L83:
                zd.p r1 = r1.m()
                goto L65
            L88:
                wc.g0 r8 = wc.g0.f27756a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: ud.g2.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // id.p
        public final Object invoke(qd.i<? super b2> iVar, zc.f<? super wc.g0> fVar) {
            return ((d) create(iVar, fVar)).invokeSuspend(wc.g0.f27756a);
        }
    }

    public g2(boolean z10) {
        this._state$volatile = z10 ? h2.f26771g : h2.f26770f;
    }

    private final v A0(zd.p pVar) {
        while (pVar.r()) {
            pVar = pVar.n();
        }
        while (true) {
            pVar = pVar.m();
            if (!pVar.r()) {
                if (pVar instanceof v) {
                    return (v) pVar;
                }
                if (pVar instanceof l2) {
                    return null;
                }
            }
        }
    }

    private final void C0(l2 l2Var, Throwable th) throws Throwable {
        l2Var.h(1);
        Object objL = l2Var.l();
        kotlin.jvm.internal.t.d(objL, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        CompletionHandlerException completionHandlerException = null;
        for (zd.p pVarM = (zd.p) objL; !kotlin.jvm.internal.t.a(pVarM, l2Var); pVarM = pVarM.m()) {
            if (pVarM instanceof f2) {
                try {
                    ((f2) pVarM).x(th);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        wc.f.a(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + pVarM + " for " + this, th2);
                        wc.g0 g0Var = wc.g0.f27756a;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            s0(completionHandlerException);
        }
    }

    private final void G0(j1 j1Var) {
        l2 l2Var = new l2();
        Object v1Var = l2Var;
        if (!j1Var.c()) {
            v1Var = new v1(l2Var);
        }
        androidx.concurrent.futures.b.a(f26747a, this, j1Var, v1Var);
    }

    private final void H0(f2 f2Var) {
        f2Var.g(new l2());
        androidx.concurrent.futures.b.a(f26747a, this, f2Var, f2Var.m());
    }

    private final Object J(zc.f<Object> fVar) {
        a aVar = new a(ad.c.c(fVar), this);
        aVar.G();
        r.a(aVar, e2.l(this, false, new p2(aVar), 1, null));
        Object objZ = aVar.z();
        if (objZ == ad.d.f()) {
            kotlin.coroutines.jvm.internal.h.c(fVar);
        }
        return objZ;
    }

    private final int K0(Object obj) {
        if (obj instanceof j1) {
            if (((j1) obj).c()) {
                return 0;
            }
            if (!androidx.concurrent.futures.b.a(f26747a, this, obj, h2.f26771g)) {
                return -1;
            }
            F0();
            return 1;
        }
        if (!(obj instanceof v1)) {
            return 0;
        }
        if (!androidx.concurrent.futures.b.a(f26747a, this, obj, ((v1) obj).a())) {
            return -1;
        }
        F0();
        return 1;
    }

    private final String L0(Object obj) {
        if (!(obj instanceof c)) {
            if (obj instanceof w1) {
                return ((w1) obj).c() ? "Active" : "New";
            }
            return obj instanceof c0 ? AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_CANCELLED : AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_COMPLETED;
        }
        c cVar = (c) obj;
        if (cVar.j()) {
            return "Cancelling";
        }
        return cVar.k() ? "Completing" : "Active";
    }

    public static /* synthetic */ CancellationException N0(g2 g2Var, Throwable th, String str, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
        }
        if ((i10 & 1) != 0) {
            str = null;
        }
        return g2Var.M0(th, str);
    }

    private final Object P(Object obj) {
        Object objR0;
        do {
            Object objO0 = o0();
            if (!(objO0 instanceof w1) || ((objO0 instanceof c) && ((c) objO0).k())) {
                return h2.f26765a;
            }
            objR0 = R0(objO0, new c0(W(obj), false, 2, null));
        } while (objR0 == h2.f26767c);
        return objR0;
    }

    private final boolean P0(w1 w1Var, Object obj) throws Throwable {
        if (!androidx.concurrent.futures.b.a(f26747a, this, w1Var, h2.g(obj))) {
            return false;
        }
        D0(null);
        E0(obj);
        T(w1Var, obj);
        return true;
    }

    private final boolean Q(Throwable th) {
        if (v0()) {
            return true;
        }
        boolean z10 = th instanceof CancellationException;
        u uVarN0 = n0();
        if (uVarN0 == null || uVarN0 == m2.f26792a) {
            return z10;
        }
        return uVarN0.d(th) || z10;
    }

    private final boolean Q0(w1 w1Var, Throwable th) throws Throwable {
        l2 l2VarL0 = l0(w1Var);
        if (l2VarL0 == null) {
            return false;
        }
        if (!androidx.concurrent.futures.b.a(f26747a, this, w1Var, new c(l2VarL0, false, th))) {
            return false;
        }
        B0(l2VarL0, th);
        return true;
    }

    private final Object R0(Object obj, Object obj2) {
        if (!(obj instanceof w1)) {
            return h2.f26765a;
        }
        if ((!(obj instanceof j1) && !(obj instanceof f2)) || (obj instanceof v) || (obj2 instanceof c0)) {
            return S0((w1) obj, obj2);
        }
        return P0((w1) obj, obj2) ? obj2 : h2.f26767c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v2 */
    private final Object S0(w1 w1Var, Object obj) throws Throwable {
        l2 l2VarL0 = l0(w1Var);
        if (l2VarL0 == null) {
            return h2.f26767c;
        }
        c cVar = w1Var instanceof c ? (c) w1Var : null;
        if (cVar == null) {
            cVar = new c(l2VarL0, false, null);
        }
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        synchronized (cVar) {
            if (cVar.k()) {
                return h2.f26765a;
            }
            cVar.n(true);
            if (cVar != w1Var && !androidx.concurrent.futures.b.a(f26747a, this, w1Var, cVar)) {
                return h2.f26767c;
            }
            boolean zJ = cVar.j();
            c0 c0Var = obj instanceof c0 ? (c0) obj : null;
            if (c0Var != null) {
                cVar.b(c0Var.f26724a);
            }
            ?? F = Boolean.valueOf(zJ ? false : true).booleanValue() ? cVar.f() : 0;
            h0Var.f21514a = F;
            wc.g0 g0Var = wc.g0.f27756a;
            if (F != 0) {
                B0(l2VarL0, F);
            }
            v vVarA0 = A0(l2VarL0);
            if (vVarA0 != null && T0(cVar, vVarA0, obj)) {
                return h2.f26766b;
            }
            l2VarL0.h(2);
            v vVarA1 = A0(l2VarL0);
            return (vVarA1 == null || !T0(cVar, vVarA1, obj)) ? X(cVar, obj) : h2.f26766b;
        }
    }

    private final void T(w1 w1Var, Object obj) throws Throwable {
        u uVarN0 = n0();
        if (uVarN0 != null) {
            uVarN0.e();
            J0(m2.f26792a);
        }
        c0 c0Var = obj instanceof c0 ? (c0) obj : null;
        Throwable th = c0Var != null ? c0Var.f26724a : null;
        if (!(w1Var instanceof f2)) {
            l2 l2VarA = w1Var.a();
            if (l2VarA != null) {
                C0(l2VarA, th);
                return;
            }
            return;
        }
        try {
            ((f2) w1Var).x(th);
        } catch (Throwable th2) {
            s0(new CompletionHandlerException("Exception in completion handler " + w1Var + " for " + this, th2));
        }
    }

    private final boolean T0(c cVar, v vVar, Object obj) {
        while (d2.k(vVar.f26822e, false, new b(this, cVar, vVar, obj)) == m2.f26792a) {
            vVar = A0(vVar);
            if (vVar == null) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V(c cVar, v vVar, Object obj) {
        v vVarA0 = A0(vVar);
        if (vVarA0 == null || !T0(cVar, vVarA0, obj)) {
            cVar.a().h(2);
            v vVarA1 = A0(vVar);
            if (vVarA1 == null || !T0(cVar, vVarA1, obj)) {
                A(X(cVar, obj));
            }
        }
    }

    private final Throwable W(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new JobCancellationException(R(), null, this) : th;
        }
        kotlin.jvm.internal.t.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((o2) obj).K();
    }

    private final Object X(c cVar, Object obj) throws Throwable {
        boolean zJ;
        Throwable thC0;
        c0 c0Var = obj instanceof c0 ? (c0) obj : null;
        Throwable th = c0Var != null ? c0Var.f26724a : null;
        synchronized (cVar) {
            zJ = cVar.j();
            List<Throwable> listM = cVar.m(th);
            thC0 = c0(cVar, listM);
            if (thC0 != null) {
                y(thC0, listM);
            }
        }
        if (thC0 != null && thC0 != th) {
            obj = new c0(thC0, false, 2, null);
        }
        if (thC0 != null) {
            if (Q(thC0) || r0(thC0)) {
                kotlin.jvm.internal.t.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                ((c0) obj).c();
            }
        }
        if (!zJ) {
            D0(thC0);
        }
        E0(obj);
        androidx.concurrent.futures.b.a(f26747a, this, cVar, h2.g(obj));
        T(cVar, obj);
        return obj;
    }

    private final Throwable b0(Object obj) {
        c0 c0Var = obj instanceof c0 ? (c0) obj : null;
        if (c0Var != null) {
            return c0Var.f26724a;
        }
        return null;
    }

    private final Throwable c0(c cVar, List<? extends Throwable> list) {
        Object next;
        Object obj = null;
        if (list.isEmpty()) {
            if (cVar.j()) {
                return new JobCancellationException(R(), null, this);
            }
            return null;
        }
        Iterator<T> it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(!(((Throwable) next) instanceof CancellationException)));
        Throwable th = (Throwable) next;
        if (th != null) {
            return th;
        }
        Throwable th2 = list.get(0);
        if (th2 instanceof TimeoutCancellationException) {
            for (Object obj2 : list) {
                Throwable th3 = (Throwable) obj2;
                if (th3 != th2 && (th3 instanceof TimeoutCancellationException)) {
                    obj = obj2;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    private final l2 l0(w1 w1Var) {
        l2 l2VarA = w1Var.a();
        if (l2VarA != null) {
            return l2VarA;
        }
        if (w1Var instanceof j1) {
            return new l2();
        }
        if (w1Var instanceof f2) {
            H0((f2) w1Var);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + w1Var).toString());
    }

    private final Object w0(Object obj) throws Throwable {
        Throwable thW = null;
        while (true) {
            Object objO0 = o0();
            if (objO0 instanceof c) {
                synchronized (objO0) {
                    if (((c) objO0).l()) {
                        return h2.f26768d;
                    }
                    boolean zJ = ((c) objO0).j();
                    if (obj != null || !zJ) {
                        if (thW == null) {
                            thW = W(obj);
                        }
                        ((c) objO0).b(thW);
                    }
                    Throwable thF = zJ ^ true ? ((c) objO0).f() : null;
                    if (thF != null) {
                        B0(((c) objO0).a(), thF);
                    }
                    return h2.f26765a;
                }
            }
            if (!(objO0 instanceof w1)) {
                return h2.f26768d;
            }
            if (thW == null) {
                thW = W(obj);
            }
            w1 w1Var = (w1) objO0;
            if (!w1Var.c()) {
                Object objR0 = R0(objO0, new c0(thW, false, 2, null));
                if (objR0 == h2.f26765a) {
                    throw new IllegalStateException(("Cannot happen in " + objO0).toString());
                }
                if (objR0 != h2.f26767c) {
                    return objR0;
                }
            } else if (Q0(w1Var, thW)) {
                return h2.f26765a;
            }
        }
    }

    private final void y(Throwable th, List<? extends Throwable> list) {
        if (list.size() <= 1) {
            return;
        }
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
        for (Throwable th2 : list) {
            if (th2 != th && th2 != th && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                wc.f.a(th, th2);
            }
        }
    }

    protected void A(Object obj) {
    }

    protected void D0(Throwable th) {
    }

    protected final Object E(zc.f<Object> fVar) throws Throwable {
        Object objO0;
        do {
            objO0 = o0();
            if (!(objO0 instanceof w1)) {
                if (objO0 instanceof c0) {
                    throw ((c0) objO0).f26724a;
                }
                return h2.h(objO0);
            }
        } while (K0(objO0) < 0);
        return J(fVar);
    }

    protected void E0(Object obj) {
    }

    protected void F0() {
    }

    public final void I0(f2 f2Var) {
        Object objO0;
        do {
            objO0 = o0();
            if (!(objO0 instanceof f2)) {
                if (!(objO0 instanceof w1) || ((w1) objO0).a() == null) {
                    return;
                }
                f2Var.s();
                return;
            }
            if (objO0 != f2Var) {
                return;
            }
        } while (!androidx.concurrent.futures.b.a(f26747a, this, objO0, h2.f26771g));
    }

    public final void J0(u uVar) {
        f26748b.set(this, uVar);
    }

    @Override // ud.o2
    public CancellationException K() {
        Throwable thF;
        Object objO0 = o0();
        if (objO0 instanceof c) {
            thF = ((c) objO0).f();
        } else if (objO0 instanceof c0) {
            thF = ((c0) objO0).f26724a;
        } else {
            if (objO0 instanceof w1) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + objO0).toString());
            }
            thF = null;
        }
        CancellationException cancellationException = thF instanceof CancellationException ? (CancellationException) thF : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        return new JobCancellationException("Parent job is " + L0(objO0), thF, this);
    }

    public final boolean L(Throwable th) {
        return M(th);
    }

    public final boolean M(Object obj) throws Throwable {
        Object objW0 = h2.f26765a;
        if (g0() && (objW0 = P(obj)) == h2.f26766b) {
            return true;
        }
        if (objW0 == h2.f26765a) {
            objW0 = w0(obj);
        }
        if (objW0 == h2.f26765a || objW0 == h2.f26766b) {
            return true;
        }
        if (objW0 == h2.f26768d) {
            return false;
        }
        A(objW0);
        return true;
    }

    protected final CancellationException M0(Throwable th, String str) {
        CancellationException jobCancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (jobCancellationException == null) {
            if (str == null) {
                str = R();
            }
            jobCancellationException = new JobCancellationException(str, th, this);
        }
        return jobCancellationException;
    }

    public void O(Throwable th) throws Throwable {
        M(th);
    }

    public final String O0() {
        return z0() + '{' + L0(o0()) + '}';
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String R() {
        return "Job was cancelled";
    }

    public boolean S(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return M(th) && f0();
    }

    @Override // zc.j
    public <R> R U(R r10, id.p<? super R, ? super zc.j.b, ? extends R> pVar) {
        return (R) b2.a.b(this, r10, pVar);
    }

    @Override // ud.b2
    public final u Y(w wVar) {
        boolean z10;
        Throwable thF;
        v vVar = new v(wVar);
        vVar.y(this);
        while (true) {
            Object objO0 = o0();
            z10 = true;
            if (!(objO0 instanceof j1)) {
                if (!(objO0 instanceof w1)) {
                    z10 = false;
                    break;
                }
                l2 l2VarA = ((w1) objO0).a();
                if (l2VarA != null) {
                    if (!l2VarA.b(vVar, 7)) {
                        boolean zB = l2VarA.b(vVar, 3);
                        Object objO1 = o0();
                        if (objO1 instanceof c) {
                            thF = ((c) objO1).f();
                        } else {
                            c0 c0Var = objO1 instanceof c0 ? (c0) objO1 : null;
                            thF = c0Var != null ? c0Var.f26724a : null;
                        }
                        vVar.x(thF);
                        if (zB) {
                            break;
                        }
                        return m2.f26792a;
                    }
                    break;
                }
                kotlin.jvm.internal.t.d(objO0, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                H0((f2) objO0);
            } else {
                j1 j1Var = (j1) objO0;
                if (!j1Var.c()) {
                    G0(j1Var);
                } else if (androidx.concurrent.futures.b.a(f26747a, this, objO0, vVar)) {
                    break;
                }
            }
        }
        if (z10) {
            return vVar;
        }
        Object objO2 = o0();
        c0 c0Var2 = objO2 instanceof c0 ? (c0) objO2 : null;
        vVar.x(c0Var2 != null ? c0Var2.f26724a : null);
        return m2.f26792a;
    }

    public final Object Z() throws Throwable {
        Object objO0 = o0();
        if (!(!(objO0 instanceof w1))) {
            throw new IllegalStateException("This job has not completed yet".toString());
        }
        if (objO0 instanceof c0) {
            throw ((c0) objO0).f26724a;
        }
        return h2.h(objO0);
    }

    @Override // zc.j
    public zc.j a0(zc.j.c<?> cVar) {
        return b2.a.d(this, cVar);
    }

    @Override // ud.b2
    public boolean c() {
        Object objO0 = o0();
        return (objO0 instanceof w1) && ((w1) objO0).c();
    }

    @Override // zc.j.b, zc.j
    public <E extends zc.j.b> E e(zc.j.c<E> cVar) {
        return (E) b2.a.c(this, cVar);
    }

    @Override // ud.b2
    public void f(CancellationException cancellationException) throws Throwable {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(R(), null, this);
        }
        O(cancellationException);
    }

    public boolean f0() {
        return true;
    }

    public boolean g0() {
        return false;
    }

    @Override // zc.j.b
    public final zc.j.c<?> getKey() {
        return b2.X8;
    }

    @Override // ud.b2
    public final boolean isCancelled() {
        Object objO0 = o0();
        return (objO0 instanceof c0) || ((objO0 instanceof c) && ((c) objO0).j());
    }

    @Override // ud.b2
    public final boolean k() {
        return !(o0() instanceof w1);
    }

    @Override // ud.b2
    public final g1 k0(boolean z10, boolean z11, id.l<? super Throwable, wc.g0> lVar) {
        return u0(z11, z10 ? new z1(lVar) : new a2(lVar));
    }

    public b2 m0() {
        u uVarN0 = n0();
        if (uVarN0 != null) {
            return uVarN0.getParent();
        }
        return null;
    }

    @Override // ud.w
    public final void n(o2 o2Var) throws Throwable {
        M(o2Var);
    }

    public final u n0() {
        return (u) f26748b.get(this);
    }

    @Override // ud.b2
    public final qd.g<b2> o() {
        return qd.k.b(new d(null));
    }

    public final Object o0() {
        return f26747a.get(this);
    }

    protected boolean r0(Throwable th) {
        return false;
    }

    @Override // ud.b2
    public final g1 s(id.l<? super Throwable, wc.g0> lVar) {
        return u0(true, new a2(lVar));
    }

    public void s0(Throwable th) throws Throwable {
        throw th;
    }

    @Override // ud.b2
    public final boolean start() {
        int iK0;
        do {
            iK0 = K0(o0());
            if (iK0 == 0) {
                return false;
            }
        } while (iK0 != 1);
        return true;
    }

    protected final void t0(b2 b2Var) {
        if (b2Var == null) {
            J0(m2.f26792a);
            return;
        }
        b2Var.start();
        u uVarY = b2Var.Y(this);
        J0(uVarY);
        if (k()) {
            uVarY.e();
            J0(m2.f26792a);
        }
    }

    public String toString() {
        return O0() + '@' + s0.b(this);
    }

    public final g1 u0(boolean z10, f2 f2Var) {
        boolean z11;
        boolean zB;
        f2Var.y(this);
        while (true) {
            Object objO0 = o0();
            z11 = true;
            if (!(objO0 instanceof j1)) {
                if (!(objO0 instanceof w1)) {
                    z11 = false;
                    break;
                }
                w1 w1Var = (w1) objO0;
                l2 l2VarA = w1Var.a();
                if (l2VarA == null) {
                    kotlin.jvm.internal.t.d(objO0, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    H0((f2) objO0);
                } else {
                    if (f2Var.w()) {
                        c cVar = w1Var instanceof c ? (c) w1Var : null;
                        Throwable thF = cVar != null ? cVar.f() : null;
                        if (thF != null) {
                            if (z10) {
                                f2Var.x(thF);
                            }
                            return m2.f26792a;
                        }
                        zB = l2VarA.b(f2Var, 5);
                    } else {
                        zB = l2VarA.b(f2Var, 1);
                    }
                    if (zB) {
                        break;
                    }
                }
            } else {
                j1 j1Var = (j1) objO0;
                if (!j1Var.c()) {
                    G0(j1Var);
                } else if (androidx.concurrent.futures.b.a(f26747a, this, objO0, f2Var)) {
                    break;
                }
            }
        }
        if (z11) {
            return f2Var;
        }
        if (z10) {
            Object objO1 = o0();
            c0 c0Var = objO1 instanceof c0 ? (c0) objO1 : null;
            f2Var.x(c0Var != null ? c0Var.f26724a : null);
        }
        return m2.f26792a;
    }

    @Override // ud.b2
    public final CancellationException v() {
        Object objO0 = o0();
        if (!(objO0 instanceof c)) {
            if (objO0 instanceof w1) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (objO0 instanceof c0) {
                return N0(this, ((c0) objO0).f26724a, null, 1, null);
            }
            return new JobCancellationException(s0.a(this) + " has completed normally", null, this);
        }
        Throwable thF = ((c) objO0).f();
        if (thF != null) {
            CancellationException cancellationExceptionM0 = M0(thF, s0.a(this) + " is cancelling");
            if (cancellationExceptionM0 != null) {
                return cancellationExceptionM0;
            }
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    protected boolean v0() {
        return false;
    }

    public final boolean x0(Object obj) {
        Object objR0;
        do {
            objR0 = R0(o0(), obj);
            if (objR0 == h2.f26765a) {
                return false;
            }
            if (objR0 == h2.f26766b) {
                return true;
            }
        } while (objR0 == h2.f26767c);
        A(objR0);
        return true;
    }

    public final Object y0(Object obj) {
        Object objR0;
        do {
            objR0 = R0(o0(), obj);
            if (objR0 == h2.f26765a) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, b0(obj));
            }
        } while (objR0 == h2.f26767c);
        return objR0;
    }

    @Override // zc.j
    public zc.j z(zc.j jVar) {
        return b2.a.e(this, jVar);
    }

    public String z0() {
        return s0.a(this);
    }

    private final void B0(l2 l2Var, Throwable th) throws Throwable {
        D0(th);
        l2Var.h(4);
        Object objL = l2Var.l();
        kotlin.jvm.internal.t.d(objL, elEbP.vQodeQTqjkd);
        CompletionHandlerException completionHandlerException = null;
        for (zd.p pVarM = (zd.p) objL; !kotlin.jvm.internal.t.a(pVarM, l2Var); pVarM = pVarM.m()) {
            if ((pVarM instanceof f2) && ((f2) pVarM).w()) {
                try {
                    ((f2) pVarM).x(th);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        wc.f.a(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + pVarM + " for " + this, th2);
                        wc.g0 g0Var = wc.g0.f27756a;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            s0(completionHandlerException);
        }
        Q(th);
    }
}
