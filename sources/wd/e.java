package wd;

import com.applovin.impl.communicator.ZREl.sRGQSqxgxlS;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.channels.ClosedReceiveChannelException;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import kotlinx.coroutines.internal.UndeliveredElementException;
import rd.PSo.cNMUz;
import rd.h0;
import s.sBoZ.TwDPD;
import ud.c3;
import wc.g0;
import zd.b0;
import zd.c0;
import zd.d0;
import zd.x;

/* JADX INFO: compiled from: BufferedChannel.kt */
/* JADX INFO: loaded from: classes5.dex */
public class e<E> implements g<E> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f27806d = AtomicLongFieldUpdater.newUpdater(e.class, "sendersAndCloseStatus$volatile");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f27807e = AtomicLongFieldUpdater.newUpdater(e.class, "receivers$volatile");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f27808f = AtomicLongFieldUpdater.newUpdater(e.class, "bufferEnd$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f27809g = AtomicLongFieldUpdater.newUpdater(e.class, cNMUz.MtdmrpcZAUCbXY);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f27810h = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "sendSegment$volatile");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f27811i = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "receiveSegment$volatile");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f27812j = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "bufferEndSegment$volatile");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f27813k = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_closeCause$volatile");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f27814l = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f27815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final id.l<E, g0> f27816b;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final id.q<ce.b<?>, Object, Object, id.q<Throwable, Object, zc.j, g0>> f27817c;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    /* JADX INFO: compiled from: BufferedChannel.kt */
    private final class a implements i<E>, c3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Object f27818a = f.f27838p;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ud.p<? super Boolean> f27819b;

        public a() {
        }

        private final Object f(l<E> lVar, int i10, long j10, zc.f<? super Boolean> fVar) {
            Boolean boolA;
            e<E> eVar = e.this;
            ud.p pVarB = ud.r.b(ad.c.c(fVar));
            try {
                this.f27819b = pVarB;
                Object objZ0 = eVar.Z0(lVar, i10, j10, this);
                if (objZ0 != f.f27835m) {
                    id.q qVarC = null;
                    if (objZ0 == f.f27837o) {
                        if (j10 < eVar.g0()) {
                            lVar.c();
                        }
                        l lVar2 = (l) e.a0().get(eVar);
                        while (true) {
                            if (eVar.o0()) {
                                h();
                                break;
                            }
                            long andIncrement = e.b0().getAndIncrement(eVar);
                            int i11 = f.f27824b;
                            long j11 = andIncrement / ((long) i11);
                            int i12 = (int) (andIncrement % ((long) i11));
                            if (lVar2.f29187c != j11) {
                                l lVarR = eVar.R(j11, lVar2);
                                if (lVarR != null) {
                                    lVar2 = lVarR;
                                }
                            }
                            Object objZ1 = eVar.Z0(lVar2, i12, andIncrement, this);
                            if (objZ1 == f.f27835m) {
                                eVar.J0(this, lVar2, i12);
                                break;
                            }
                            if (objZ1 == f.f27837o) {
                                if (andIncrement < eVar.g0()) {
                                    lVar2.c();
                                }
                            } else {
                                if (objZ1 == f.f27836n) {
                                    throw new IllegalStateException("unexpected".toString());
                                }
                                lVar2.c();
                                this.f27818a = objZ1;
                                this.f27819b = null;
                                boolA = kotlin.coroutines.jvm.internal.b.a(true);
                                id.l<E, g0> lVar3 = eVar.f27816b;
                                if (lVar3 != null) {
                                    qVarC = eVar.C(lVar3, objZ1);
                                }
                            }
                        }
                    } else {
                        lVar.c();
                        this.f27818a = objZ0;
                        this.f27819b = null;
                        boolA = kotlin.coroutines.jvm.internal.b.a(true);
                        id.l<E, g0> lVar4 = eVar.f27816b;
                        if (lVar4 != null) {
                            qVarC = eVar.C(lVar4, objZ0);
                        }
                    }
                    pVarB.d0(boolA, qVarC);
                    break;
                }
                eVar.J0(this, lVar, i10);
                Object objZ = pVarB.z();
                if (objZ == ad.d.f()) {
                    kotlin.coroutines.jvm.internal.h.c(fVar);
                }
                return objZ;
            } catch (Throwable th) {
                pVarB.P();
                throw th;
            }
        }

        private final boolean g() throws Throwable {
            this.f27818a = f.z();
            Throwable thW = e.this.W();
            if (thW == null) {
                return false;
            }
            throw d0.a(thW);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void h() {
            ud.p<? super Boolean> pVar = this.f27819b;
            kotlin.jvm.internal.t.c(pVar);
            this.f27819b = null;
            this.f27818a = f.z();
            Throwable thW = e.this.W();
            if (thW == null) {
                wc.r.a aVar = wc.r.f27774b;
                pVar.resumeWith(wc.r.c(Boolean.FALSE));
            } else {
                wc.r.a aVar2 = wc.r.f27774b;
                pVar.resumeWith(wc.r.c(wc.s.a(thW)));
            }
        }

        @Override // ud.c3
        public void a(b0<?> b0Var, int i10) {
            ud.p<? super Boolean> pVar = this.f27819b;
            if (pVar != null) {
                pVar.a(b0Var, i10);
            }
        }

        @Override // wd.i
        public Object b(zc.f<? super Boolean> fVar) throws Throwable {
            l<E> lVar;
            boolean zG = true;
            if (this.f27818a == f.f27838p || this.f27818a == f.z()) {
                e<E> eVar = e.this;
                l<E> lVar2 = (l) e.a0().get(eVar);
                while (!eVar.o0()) {
                    long andIncrement = e.b0().getAndIncrement(eVar);
                    int i10 = f.f27824b;
                    long j10 = andIncrement / ((long) i10);
                    int i11 = (int) (andIncrement % ((long) i10));
                    if (lVar2.f29187c != j10) {
                        l<E> lVarR = eVar.R(j10, lVar2);
                        if (lVarR == null) {
                            continue;
                        } else {
                            lVar = lVarR;
                        }
                    } else {
                        lVar = lVar2;
                    }
                    Object objZ0 = eVar.Z0(lVar, i11, andIncrement, null);
                    if (objZ0 == f.f27835m) {
                        throw new IllegalStateException("unreachable".toString());
                    }
                    if (objZ0 == f.f27837o) {
                        if (andIncrement < eVar.g0()) {
                            lVar.c();
                        }
                        lVar2 = lVar;
                    } else {
                        if (objZ0 == f.f27836n) {
                            return f(lVar, i11, andIncrement, fVar);
                        }
                        lVar.c();
                        this.f27818a = objZ0;
                    }
                }
                zG = g();
            }
            return kotlin.coroutines.jvm.internal.b.a(zG);
        }

        public final boolean i(E e10) {
            ud.p<? super Boolean> pVar = this.f27819b;
            kotlin.jvm.internal.t.c(pVar);
            this.f27819b = null;
            this.f27818a = e10;
            Boolean bool = Boolean.TRUE;
            e<E> eVar = e.this;
            id.l<E, g0> lVar = eVar.f27816b;
            return f.B(pVar, bool, lVar != null ? eVar.C(lVar, e10) : null);
        }

        public final void j() {
            ud.p<? super Boolean> pVar = this.f27819b;
            kotlin.jvm.internal.t.c(pVar);
            this.f27819b = null;
            this.f27818a = f.z();
            Throwable thW = e.this.W();
            if (thW == null) {
                wc.r.a aVar = wc.r.f27774b;
                pVar.resumeWith(wc.r.c(Boolean.FALSE));
            } else {
                wc.r.a aVar2 = wc.r.f27774b;
                pVar.resumeWith(wc.r.c(wc.s.a(thW)));
            }
        }

        @Override // wd.i
        public E next() throws Throwable {
            E e10 = (E) this.f27818a;
            if (!(e10 != f.f27838p)) {
                throw new IllegalStateException("`hasNext()` has not been invoked".toString());
            }
            this.f27818a = f.f27838p;
            if (e10 != f.z()) {
                return e10;
            }
            throw d0.a(e.this.Z());
        }
    }

    /* JADX INFO: compiled from: BufferedChannel.kt */
    private static final class b implements c3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ ud.p<Boolean> f27821a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ud.n<Boolean> f27822b;

        @Override // ud.c3
        public void a(b0<?> b0Var, int i10) {
            this.f27821a.a(b0Var, i10);
        }

        public final ud.n<Boolean> b() {
            return this.f27822b;
        }
    }

    /* JADX INFO: compiled from: BufferedChannel.kt */
    /* synthetic */ class c extends kotlin.jvm.internal.q implements id.q<Throwable, E, zc.j, g0> {
        c(Object obj) {
            super(3, obj, e.class, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
        }

        @Override // id.q
        public /* bridge */ /* synthetic */ g0 invoke(Throwable th, Object obj, zc.j jVar) {
            k(th, obj, jVar);
            return g0.f27756a;
        }

        public final void k(Throwable th, E e10, zc.j jVar) {
            ((e) this.receiver).A0(th, e10, jVar);
        }
    }

    /* JADX INFO: compiled from: BufferedChannel.kt */
    /* synthetic */ class d extends kotlin.jvm.internal.q implements id.q<Throwable, k<? extends E>, zc.j, g0> {
        d(Object obj) {
            super(3, obj, e.class, "onCancellationChannelResultImplDoNotCall", "onCancellationChannelResultImplDoNotCall-5_sEAP8(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
        }

        @Override // id.q
        public /* bridge */ /* synthetic */ g0 invoke(Throwable th, Object obj, zc.j jVar) {
            k(th, ((k) obj).k(), jVar);
            return g0.f27756a;
        }

        public final void k(Throwable th, Object obj, zc.j jVar) {
            ((e) this.receiver).z0(th, obj, jVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(int i10, id.l<? super E, g0> lVar) {
        this.f27815a = i10;
        this.f27816b = lVar;
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Invalid channel capacity: " + i10 + ", should be >=0").toString());
        }
        this.bufferEnd$volatile = f.A(i10);
        this.completedExpandBuffersAndPauseFlag$volatile = U();
        l lVar2 = new l(0L, null, this, 3);
        this.sendSegment$volatile = lVar2;
        this.receiveSegment$volatile = lVar2;
        if (t0()) {
            lVar2 = f.f27823a;
            kotlin.jvm.internal.t.d(lVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = lVar2;
        this.f27817c = lVar != 0 ? new id.q() { // from class: wd.c
            @Override // id.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return e.H0(this.f27802a, (ce.b) obj, obj2, obj3);
            }
        } : null;
        this._closeCause$volatile = f.f27841s;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A0(Throwable th, E e10, zc.j jVar) {
        id.l<E, g0> lVar = this.f27816b;
        kotlin.jvm.internal.t.c(lVar);
        x.a(lVar, e10, jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final id.q<Throwable, Object, zc.j, g0> C(final id.l<? super E, g0> lVar, final E e10) {
        return new id.q() { // from class: wd.b
            @Override // id.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return e.E(lVar, e10, (Throwable) obj, obj2, (zc.j) obj3);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C0(ud.n<? super E> nVar) {
        wc.r.a aVar = wc.r.f27774b;
        nVar.resumeWith(wc.r.c(wc.s.a(Z())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final pd.g<g0> D(id.l<? super E, g0> lVar) {
        return new c(this);
    }

    private final Object D0(E e10, zc.f<? super g0> fVar) {
        UndeliveredElementException undeliveredElementExceptionC;
        ud.p pVar = new ud.p(ad.c.c(fVar), 1);
        pVar.G();
        id.l<E, g0> lVar = this.f27816b;
        if (lVar == null || (undeliveredElementExceptionC = x.c(lVar, e10, null, 2, null)) == null) {
            Throwable thD0 = d0();
            wc.r.a aVar = wc.r.f27774b;
            pVar.resumeWith(wc.r.c(wc.s.a(thD0)));
        } else {
            wc.f.a(undeliveredElementExceptionC, d0());
            wc.r.a aVar2 = wc.r.f27774b;
            pVar.resumeWith(wc.r.c(wc.s.a(undeliveredElementExceptionC)));
        }
        Object objZ = pVar.z();
        if (objZ == ad.d.f()) {
            kotlin.coroutines.jvm.internal.h.c(fVar);
        }
        return objZ == ad.d.f() ? objZ : g0.f27756a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g0 E(id.l lVar, Object obj, Throwable th, Object obj2, zc.j jVar) {
        x.a(lVar, obj, jVar);
        return g0.f27756a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E0(E e10, ud.n<? super g0> nVar) {
        id.l<E, g0> lVar = this.f27816b;
        if (lVar != null) {
            x.a(lVar, e10, nVar.getContext());
        }
        Throwable thD0 = d0();
        wc.r.a aVar = wc.r.f27774b;
        nVar.resumeWith(wc.r.c(wc.s.a(thD0)));
    }

    private final pd.g<g0> F(id.l<? super E, g0> lVar) {
        return new d(this);
    }

    private final boolean G(long j10) {
        return j10 < U() || j10 < c0() + ((long) this.f27815a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final id.q H0(final e eVar, final ce.b bVar, Object obj, final Object obj2) {
        return new id.q() { // from class: wd.d
            @Override // id.q
            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                return e.I0(obj2, eVar, bVar, (Throwable) obj3, obj4, (zc.j) obj5);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void I(l<E> lVar, long j10) {
        Object objB = zd.k.b(null, 1, null);
        loop0: while (lVar != null) {
            for (int i10 = f.f27824b - 1; -1 < i10; i10--) {
                if ((lVar.f29187c * ((long) f.f27824b)) + ((long) i10) < j10) {
                    break loop0;
                }
                while (true) {
                    Object objB2 = lVar.B(i10);
                    if (objB2 != null && objB2 != f.f27827e) {
                        if (!(objB2 instanceof w)) {
                            if (!(objB2 instanceof c3)) {
                                break;
                            }
                            if (lVar.v(i10, objB2, f.z())) {
                                objB = zd.k.c(objB, objB2);
                                lVar.C(i10, true);
                                break;
                            }
                        } else {
                            if (lVar.v(i10, objB2, f.z())) {
                                objB = zd.k.c(objB, ((w) objB2).f27864a);
                                lVar.C(i10, true);
                                break;
                            }
                        }
                    } else {
                        if (lVar.v(i10, objB2, f.z())) {
                            lVar.t();
                            break;
                        }
                    }
                }
            }
            lVar = (l) lVar.h();
        }
        if (objB != null) {
            if (!(objB instanceof ArrayList)) {
                O0((c3) objB);
                return;
            }
            kotlin.jvm.internal.t.d(objB, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>");
            ArrayList arrayList = (ArrayList) objB;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                O0((c3) arrayList.get(size));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g0 I0(Object obj, e eVar, ce.b bVar, Throwable th, Object obj2, zc.j jVar) {
        if (obj != f.z()) {
            x.a(eVar.f27816b, obj, bVar.getContext());
        }
        return g0.f27756a;
    }

    private final l<E> J() {
        Object obj = f27812j.get(this);
        l lVar = (l) f27810h.get(this);
        if (lVar.f29187c > ((l) obj).f29187c) {
            obj = lVar;
        }
        l lVar2 = (l) f27811i.get(this);
        if (lVar2.f29187c > ((l) obj).f29187c) {
            obj = lVar2;
        }
        return (l) zd.a.b((zd.b) obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J0(c3 c3Var, l<E> lVar, int i10) {
        G0();
        c3Var.a(lVar, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K0(c3 c3Var, l<E> lVar, int i10) {
        c3Var.a(lVar, i10 + f.f27824b);
    }

    private final void L(long j10) {
        N0(M(j10));
    }

    static /* synthetic */ <E> Object L0(e<E> eVar, zc.f<? super E> fVar) throws Throwable {
        l<E> lVar;
        l<E> lVar2 = (l) a0().get(eVar);
        while (!eVar.o0()) {
            long andIncrement = b0().getAndIncrement(eVar);
            int i10 = f.f27824b;
            long j10 = andIncrement / ((long) i10);
            int i11 = (int) (andIncrement % ((long) i10));
            if (lVar2.f29187c != j10) {
                l<E> lVarR = eVar.R(j10, lVar2);
                if (lVarR == null) {
                    continue;
                } else {
                    lVar = lVarR;
                }
            } else {
                lVar = lVar2;
            }
            Object objZ0 = eVar.Z0(lVar, i11, andIncrement, null);
            if (objZ0 == f.f27835m) {
                throw new IllegalStateException("unexpected".toString());
            }
            if (objZ0 != f.f27837o) {
                if (objZ0 == f.f27836n) {
                    return eVar.M0(lVar, i11, andIncrement, fVar);
                }
                lVar.c();
                return objZ0;
            }
            if (andIncrement < eVar.g0()) {
                lVar.c();
            }
            lVar2 = lVar;
        }
        throw d0.a(eVar.Z());
    }

    private final l<E> M(long j10) {
        l<E> lVarJ = J();
        if (s0()) {
            long jU0 = u0(lVarJ);
            if (jU0 != -1) {
                O(jU0);
            }
        }
        I(lVarJ, j10);
        return lVarJ;
    }

    private final Object M0(l<E> lVar, int i10, long j10, zc.f<? super E> fVar) {
        id.q qVar;
        ud.p pVarB = ud.r.b(ad.c.c(fVar));
        try {
            Object objZ0 = Z0(lVar, i10, j10, pVarB);
            if (objZ0 != f.f27835m) {
                if (objZ0 == f.f27837o) {
                    if (j10 < g0()) {
                        lVar.c();
                    }
                    l lVar2 = (l) a0().get(this);
                    while (true) {
                        if (o0()) {
                            C0(pVarB);
                            break;
                        }
                        long andIncrement = b0().getAndIncrement(this);
                        int i11 = f.f27824b;
                        long j11 = andIncrement / ((long) i11);
                        int i12 = (int) (andIncrement % ((long) i11));
                        if (lVar2.f29187c != j11) {
                            l lVarR = R(j11, lVar2);
                            if (lVarR != null) {
                                lVar2 = lVarR;
                            }
                        }
                        objZ0 = Z0(lVar2, i12, andIncrement, pVarB);
                        if (objZ0 == f.f27835m) {
                            ud.p pVar = pVarB instanceof c3 ? pVarB : null;
                            if (pVar == null) {
                                break;
                            }
                            J0(pVar, lVar2, i12);
                            break;
                        }
                        if (objZ0 == f.f27837o) {
                            if (andIncrement < g0()) {
                                lVar2.c();
                            }
                        } else {
                            if (objZ0 == f.f27836n) {
                                throw new IllegalStateException("unexpected".toString());
                            }
                            lVar2.c();
                            id.l<E, g0> lVar3 = this.f27816b;
                            qVar = (id.q) (lVar3 != null ? D(lVar3) : null);
                        }
                    }
                } else {
                    lVar.c();
                    id.l<E, g0> lVar4 = this.f27816b;
                    qVar = (id.q) (lVar4 != null ? D(lVar4) : null);
                }
                pVarB.d0(objZ0, qVar);
                break;
            }
            J0(pVarB, lVar, i10);
            Object objZ = pVarB.z();
            if (objZ == ad.d.f()) {
                kotlin.coroutines.jvm.internal.h.c(fVar);
            }
            return objZ;
        } catch (Throwable th) {
            pVarB.P();
            throw th;
        }
    }

    private final void N() {
        q0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void N0(l<E> lVar) {
        id.l<E, g0> lVar2 = this.f27816b;
        UndeliveredElementException undeliveredElementExceptionB = null;
        Object objB = zd.k.b(null, 1, null);
        loop0: do {
            for (int i10 = f.f27824b - 1; -1 < i10; i10--) {
                long j10 = (lVar.f29187c * ((long) f.f27824b)) + ((long) i10);
                while (true) {
                    Object objB2 = lVar.B(i10);
                    if (objB2 == f.f27831i) {
                        break loop0;
                    }
                    if (objB2 != f.f27826d) {
                        if (objB2 != f.f27827e && objB2 != null) {
                            if (!(objB2 instanceof c3) && !(objB2 instanceof w)) {
                                if (objB2 != f.f27829g && objB2 != f.f27828f) {
                                    if (objB2 != f.f27829g) {
                                        break;
                                    }
                                } else {
                                    break loop0;
                                }
                            } else {
                                if (j10 < c0()) {
                                    break loop0;
                                }
                                c3 c3Var = objB2 instanceof w ? ((w) objB2).f27864a : (c3) objB2;
                                if (lVar.v(i10, objB2, f.z())) {
                                    if (lVar2 != null) {
                                        undeliveredElementExceptionB = x.b(lVar2, lVar.A(i10), undeliveredElementExceptionB);
                                    }
                                    objB = zd.k.c(objB, c3Var);
                                    lVar.w(i10);
                                    lVar.t();
                                    break;
                                }
                            }
                        } else {
                            if (lVar.v(i10, objB2, f.z())) {
                                lVar.t();
                                break;
                            }
                        }
                    } else {
                        if (j10 < c0()) {
                            break loop0;
                        }
                        if (lVar.v(i10, objB2, f.z())) {
                            if (lVar2 != null) {
                                undeliveredElementExceptionB = x.b(lVar2, lVar.A(i10), undeliveredElementExceptionB);
                            }
                            lVar.w(i10);
                            lVar.t();
                            break;
                        }
                    }
                }
            }
            lVar = (l) lVar.h();
        } while (lVar != null);
        if (objB != null) {
            if (objB instanceof ArrayList) {
                kotlin.jvm.internal.t.d(objB, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>");
                ArrayList arrayList = (ArrayList) objB;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    P0((c3) arrayList.get(size));
                }
            } else {
                P0((c3) objB);
            }
        }
        if (undeliveredElementExceptionB != null) {
            throw undeliveredElementExceptionB;
        }
    }

    private final void O0(c3 c3Var) {
        Q0(c3Var, true);
    }

    private final void P() {
        if (t0()) {
            return;
        }
        l<E> lVar = (l) f27812j.get(this);
        while (true) {
            long andIncrement = f27808f.getAndIncrement(this);
            int i10 = f.f27824b;
            long j10 = andIncrement / ((long) i10);
            if (g0() <= andIncrement) {
                if (lVar.f29187c < j10 && lVar.f() != 0) {
                    y0(j10, lVar);
                }
                k0(this, 0L, 1, null);
                return;
            }
            if (lVar.f29187c != j10) {
                l<E> lVarQ = Q(j10, lVar, andIncrement);
                if (lVarQ == null) {
                    continue;
                } else {
                    lVar = lVarQ;
                }
            }
            if (X0(lVar, (int) (andIncrement % ((long) i10)), andIncrement)) {
                k0(this, 0L, 1, null);
                return;
            }
            k0(this, 0L, 1, null);
        }
    }

    private final void P0(c3 c3Var) {
        Q0(c3Var, false);
    }

    private final l<E> Q(long j10, l<E> lVar, long j11) {
        Object objC;
        boolean z10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f27812j;
        id.p pVar = (id.p) f.y();
        do {
            objC = zd.a.c(lVar, j10, pVar);
            if (!c0.c(objC)) {
                b0 b0VarB = c0.b(objC);
                while (true) {
                    b0 b0Var = (b0) atomicReferenceFieldUpdater.get(this);
                    if (b0Var.f29187c < b0VarB.f29187c) {
                        if (!b0VarB.u()) {
                            z10 = false;
                            break;
                        }
                        if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, b0Var, b0VarB)) {
                            if (b0Var.p()) {
                                b0Var.n();
                            }
                        } else if (b0VarB.p()) {
                            b0VarB.n();
                        }
                    }
                    z10 = true;
                    break;
                }
            } else {
                break;
            }
        } while (!z10);
        if (c0.c(objC)) {
            N();
            y0(j10, lVar);
            k0(this, 0L, 1, null);
            return null;
        }
        l<E> lVar2 = (l) c0.b(objC);
        if (lVar2.f29187c <= j10) {
            return lVar2;
        }
        long j12 = lVar2.f29187c;
        int i10 = f.f27824b;
        if (f27808f.compareAndSet(this, j11 + 1, j12 * ((long) i10))) {
            j0((lVar2.f29187c * ((long) i10)) - j11);
            return null;
        }
        k0(this, 0L, 1, null);
        return null;
    }

    private final void Q0(c3 c3Var, boolean z10) {
        if (c3Var instanceof b) {
            ud.n<Boolean> nVarB = ((b) c3Var).b();
            wc.r.a aVar = wc.r.f27774b;
            nVarB.resumeWith(wc.r.c(Boolean.FALSE));
            return;
        }
        if (c3Var instanceof ud.n) {
            zc.f fVar = (zc.f) c3Var;
            wc.r.a aVar2 = wc.r.f27774b;
            fVar.resumeWith(wc.r.c(wc.s.a(z10 ? Z() : d0())));
        } else if (c3Var instanceof t) {
            ud.p<k<? extends E>> pVar = ((t) c3Var).f27863a;
            wc.r.a aVar3 = wc.r.f27774b;
            pVar.resumeWith(wc.r.c(k.b(k.f27846b.a(W()))));
        } else if (c3Var instanceof a) {
            ((a) c3Var).j();
        } else {
            if (c3Var instanceof ce.b) {
                ((ce.b) c3Var).d(this, f.z());
                return;
            }
            throw new IllegalStateException(("Unexpected waiter: " + c3Var).toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l<E> R(long j10, l<E> lVar) {
        Object objC;
        boolean z10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f27811i;
        id.p pVar = (id.p) f.y();
        do {
            objC = zd.a.c(lVar, j10, pVar);
            if (!c0.c(objC)) {
                b0 b0VarB = c0.b(objC);
                while (true) {
                    b0 b0Var = (b0) atomicReferenceFieldUpdater.get(this);
                    z10 = true;
                    if (b0Var.f29187c >= b0VarB.f29187c) {
                        break;
                    }
                    if (!b0VarB.u()) {
                        z10 = false;
                        break;
                    }
                    if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, b0Var, b0VarB)) {
                        if (!b0Var.p()) {
                            break;
                        }
                        b0Var.n();
                        break;
                    }
                    if (b0VarB.p()) {
                        b0VarB.n();
                    }
                }
            } else {
                break;
            }
        } while (!z10);
        if (c0.c(objC)) {
            N();
            if (lVar.f29187c * ((long) f.f27824b) >= g0()) {
                return null;
            }
            lVar.c();
            return null;
        }
        l<E> lVar2 = (l) c0.b(objC);
        if (!t0() && j10 <= U() / ((long) f.f27824b)) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f27812j;
            while (true) {
                b0 b0Var2 = (b0) atomicReferenceFieldUpdater2.get(this);
                if (b0Var2.f29187c >= lVar2.f29187c || !lVar2.u()) {
                    break;
                }
                if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater2, this, b0Var2, lVar2)) {
                    if (!b0Var2.p()) {
                        break;
                    }
                    b0Var2.n();
                    break;
                }
                if (lVar2.p()) {
                    lVar2.n();
                }
            }
        }
        long j11 = lVar2.f29187c;
        if (j11 <= j10) {
            return lVar2;
        }
        int i10 = f.f27824b;
        d1(j11 * ((long) i10));
        if (lVar2.f29187c * ((long) i10) >= g0()) {
            return null;
        }
        lVar2.c();
        return null;
    }

    static /* synthetic */ <E> Object R0(e<E> eVar, E e10, zc.f<? super g0> fVar) {
        l<E> lVar;
        l<E> lVar2 = (l) e0().get(eVar);
        while (true) {
            long andIncrement = f0().getAndIncrement(eVar);
            long j10 = andIncrement & 1152921504606846975L;
            boolean zR0 = eVar.r0(andIncrement);
            int i10 = f.f27824b;
            long j11 = j10 / ((long) i10);
            int i11 = (int) (j10 % ((long) i10));
            if (lVar2.f29187c != j11) {
                l<E> lVarS = eVar.S(j11, lVar2);
                if (lVarS != null) {
                    lVar = lVarS;
                } else if (zR0) {
                    Object objD0 = eVar.D0(e10, fVar);
                    if (objD0 != ad.d.f()) {
                        break;
                    }
                    return objD0;
                }
            } else {
                lVar = lVar2;
            }
            int iB1 = eVar.b1(lVar, i11, e10, j10, null, zR0);
            if (iB1 == 0) {
                lVar.c();
                break;
            }
            if (iB1 != 1) {
                if (iB1 == 2) {
                    if (!zR0) {
                        break;
                    }
                    lVar.t();
                    Object objD1 = eVar.D0(e10, fVar);
                    if (objD1 != ad.d.f()) {
                        break;
                    }
                    return objD1;
                }
                if (iB1 == 3) {
                    Object objS0 = eVar.S0(lVar, i11, e10, j10, fVar);
                    if (objS0 != ad.d.f()) {
                        break;
                    }
                    return objS0;
                }
                if (iB1 == 4) {
                    if (j10 < eVar.c0()) {
                        lVar.c();
                    }
                    Object objD2 = eVar.D0(e10, fVar);
                    if (objD2 != ad.d.f()) {
                        break;
                    }
                    return objD2;
                }
                if (iB1 == 5) {
                    lVar.c();
                }
                lVar2 = lVar;
            } else {
                break;
            }
        }
        return g0.f27756a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l<E> S(long j10, l<E> lVar) {
        Object objC;
        boolean z10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f27810h;
        id.p pVar = (id.p) f.y();
        do {
            objC = zd.a.c(lVar, j10, pVar);
            if (!c0.c(objC)) {
                b0 b0VarB = c0.b(objC);
                while (true) {
                    b0 b0Var = (b0) atomicReferenceFieldUpdater.get(this);
                    z10 = true;
                    if (b0Var.f29187c >= b0VarB.f29187c) {
                        break;
                    }
                    if (!b0VarB.u()) {
                        z10 = false;
                        break;
                    }
                    if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, b0Var, b0VarB)) {
                        if (!b0Var.p()) {
                            break;
                        }
                        b0Var.n();
                        break;
                    }
                    if (b0VarB.p()) {
                        b0VarB.n();
                    }
                }
            } else {
                break;
            }
        } while (!z10);
        if (c0.c(objC)) {
            N();
            if (lVar.f29187c * ((long) f.f27824b) >= c0()) {
                return null;
            }
            lVar.c();
            return null;
        }
        l<E> lVar2 = (l) c0.b(objC);
        long j11 = lVar2.f29187c;
        if (j11 <= j10) {
            return lVar2;
        }
        int i10 = f.f27824b;
        e1(j11 * ((long) i10));
        if (lVar2.f29187c * ((long) i10) >= c0()) {
            return null;
        }
        lVar2.c();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0119  */
    /* JADX WARN: Code duplicated, block: B:63:0x0122 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:64:0x0123  */
    private final Object S0(l<E> lVar, int i10, E e10, long j10, zc.f<? super g0> fVar) {
        Object objC;
        Object objZ;
        l lVar2;
        ud.p pVarB = ud.r.b(ad.c.c(fVar));
        try {
            int iB1 = b1(lVar, i10, e10, j10, pVarB, false);
            if (iB1 == 0) {
                lVar.c();
                wc.r.a aVar = wc.r.f27774b;
                objC = wc.r.c(g0.f27756a);
            } else {
                if (iB1 != 1) {
                    if (iB1 != 2) {
                        if (iB1 != 4) {
                            if (iB1 != 5) {
                                throw new IllegalStateException("unexpected".toString());
                            }
                            lVar.c();
                            l lVar3 = (l) e0().get(this);
                            while (true) {
                                long andIncrement = f0().getAndIncrement(this);
                                long j11 = andIncrement & 1152921504606846975L;
                                boolean zR0 = r0(andIncrement);
                                int i11 = f.f27824b;
                                long j12 = j11 / ((long) i11);
                                int i12 = (int) (j11 % ((long) i11));
                                if (lVar3.f29187c != j12) {
                                    l lVarS = S(j12, lVar3);
                                    if (lVarS != null) {
                                        lVar2 = lVarS;
                                    } else if (zR0) {
                                    }
                                } else {
                                    lVar2 = lVar3;
                                }
                                l lVar4 = lVar2;
                                int iB2 = b1(lVar2, i12, e10, j11, pVarB, zR0);
                                if (iB2 == 0) {
                                    lVar4.c();
                                    wc.r.a aVar2 = wc.r.f27774b;
                                    objC = wc.r.c(g0.f27756a);
                                } else if (iB2 == 1) {
                                    wc.r.a aVar3 = wc.r.f27774b;
                                    objC = wc.r.c(g0.f27756a);
                                } else if (iB2 == 2) {
                                    if (!zR0) {
                                        ud.p pVar = pVarB instanceof c3 ? pVarB : null;
                                        if (pVar == null) {
                                            break;
                                        }
                                        K0(pVar, lVar4, i12);
                                        break;
                                    }
                                    lVar4.t();
                                } else {
                                    if (iB2 == 3) {
                                        throw new IllegalStateException("unexpected".toString());
                                    }
                                    if (iB2 != 4) {
                                        if (iB2 == 5) {
                                            lVar4.c();
                                        }
                                        lVar3 = lVar4;
                                    } else if (j11 < c0()) {
                                        lVar4.c();
                                    }
                                }
                            }
                        } else if (j10 < c0()) {
                            lVar.c();
                        }
                        E0(e10, pVarB);
                        break;
                    } else {
                        K0(pVarB, lVar, i10);
                    }
                    objZ = pVarB.z();
                    if (objZ == ad.d.f()) {
                        kotlin.coroutines.jvm.internal.h.c(fVar);
                    }
                    if (objZ == ad.d.f()) {
                        return objZ;
                    }
                    return g0.f27756a;
                }
                wc.r.a aVar4 = wc.r.f27774b;
                objC = wc.r.c(g0.f27756a);
            }
            pVarB.resumeWith(objC);
            objZ = pVarB.z();
            if (objZ == ad.d.f()) {
                kotlin.coroutines.jvm.internal.h.c(fVar);
            }
            if (objZ == ad.d.f()) {
                return objZ;
            }
            return g0.f27756a;
        } catch (Throwable th) {
            pVarB.P();
            throw th;
        }
    }

    private final boolean T0(long j10) {
        if (r0(j10)) {
            return false;
        }
        return !G(j10 & 1152921504606846975L);
    }

    private final long U() {
        return f27808f.get(this);
    }

    private final boolean U0(Object obj, E e10) {
        if (obj instanceof ce.b) {
            return ((ce.b) obj).d(this, e10);
        }
        if (obj instanceof t) {
            kotlin.jvm.internal.t.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            ud.p<k<? extends E>> pVar = ((t) obj).f27863a;
            k kVarB = k.b(k.f27846b.c(e10));
            id.l<E, g0> lVar = this.f27816b;
            return f.B(pVar, kVarB, (id.q) (lVar != null ? F(lVar) : null));
        }
        if (obj instanceof a) {
            kotlin.jvm.internal.t.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            return ((a) obj).i(e10);
        }
        if (obj instanceof ud.n) {
            kotlin.jvm.internal.t.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            ud.n nVar = (ud.n) obj;
            id.l<E, g0> lVar2 = this.f27816b;
            return f.B(nVar, e10, (id.q) (lVar2 != null ? D(lVar2) : null));
        }
        throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
    }

    private final boolean V0(Object obj, l<E> lVar, int i10) {
        if (obj instanceof ud.n) {
            kotlin.jvm.internal.t.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return f.C((ud.n) obj, g0.f27756a, null, 2, null);
        }
        if (obj instanceof ce.b) {
            kotlin.jvm.internal.t.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
            ce.d dVarG = ((ce.a) obj).g(this, g0.f27756a);
            if (dVarG == ce.d.REREGISTER) {
                lVar.w(i10);
            }
            return dVarG == ce.d.SUCCESSFUL;
        }
        if (obj instanceof b) {
            return f.C(((b) obj).b(), Boolean.TRUE, null, 2, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    private final boolean X0(l<E> lVar, int i10, long j10) {
        Object objB = lVar.B(i10);
        if (!(objB instanceof c3) || j10 < f27807e.get(this) || !lVar.v(i10, objB, f.f27829g)) {
            return Y0(lVar, i10, j10);
        }
        if (V0(objB, lVar, i10)) {
            lVar.F(i10, f.f27826d);
            return true;
        }
        lVar.F(i10, f.f27832j);
        lVar.C(i10, false);
        return false;
    }

    private final boolean Y0(l<E> lVar, int i10, long j10) {
        while (true) {
            Object objB = lVar.B(i10);
            if (objB instanceof c3) {
                if (j10 < f27807e.get(this)) {
                    if (lVar.v(i10, objB, new w((c3) objB))) {
                        return true;
                    }
                } else if (lVar.v(i10, objB, f.f27829g)) {
                    if (V0(objB, lVar, i10)) {
                        lVar.F(i10, f.f27826d);
                        return true;
                    }
                    lVar.F(i10, f.f27832j);
                    lVar.C(i10, false);
                    return false;
                }
            } else {
                if (objB == f.f27832j) {
                    return false;
                }
                if (objB == null) {
                    if (lVar.v(i10, objB, f.f27827e)) {
                        return true;
                    }
                } else {
                    if (objB == f.f27826d || objB == f.f27830h || objB == f.f27831i || objB == f.f27833k || objB == f.z()) {
                        return true;
                    }
                    if (objB != f.f27828f) {
                        throw new IllegalStateException(("Unexpected cell state: " + objB).toString());
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Throwable Z() {
        Throwable thW = W();
        return thW == null ? new ClosedReceiveChannelException("Channel was closed") : thW;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object Z0(l<E> lVar, int i10, long j10, Object obj) {
        Object objB = lVar.B(i10);
        if (objB == null) {
            if (j10 >= (f27806d.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return f.f27836n;
                }
                if (lVar.v(i10, objB, obj)) {
                    P();
                    return f.f27835m;
                }
            }
        } else if (objB == f.f27826d && lVar.v(i10, objB, f.f27831i)) {
            P();
            return lVar.D(i10);
        }
        return a1(lVar, i10, j10, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicReferenceFieldUpdater a0() {
        return f27811i;
    }

    private final Object a1(l<E> lVar, int i10, long j10, Object obj) {
        while (true) {
            Object objB = lVar.B(i10);
            if (objB == null || objB == f.f27827e) {
                if (j10 < (f27806d.get(this) & 1152921504606846975L)) {
                    if (lVar.v(i10, objB, f.f27830h)) {
                        P();
                        return f.f27837o;
                    }
                } else {
                    if (obj == null) {
                        return f.f27836n;
                    }
                    if (lVar.v(i10, objB, obj)) {
                        P();
                        return f.f27835m;
                    }
                }
            } else {
                if (objB != f.f27826d) {
                    if (objB != f.f27832j && objB != f.f27830h) {
                        if (objB == f.z()) {
                            P();
                            return f.f27837o;
                        }
                        if (objB != f.f27829g && lVar.v(i10, objB, f.f27828f)) {
                            boolean z10 = objB instanceof w;
                            if (z10) {
                                objB = ((w) objB).f27864a;
                            }
                            if (V0(objB, lVar, i10)) {
                                lVar.F(i10, f.f27831i);
                                P();
                                return lVar.D(i10);
                            }
                            lVar.F(i10, f.f27832j);
                            lVar.C(i10, false);
                            if (z10) {
                                P();
                            }
                            return f.f27837o;
                        }
                    }
                    return f.f27837o;
                }
                if (lVar.v(i10, objB, f.f27831i)) {
                    P();
                    return lVar.D(i10);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicLongFieldUpdater b0() {
        return f27807e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int b1(l<E> lVar, int i10, E e10, long j10, Object obj, boolean z10) {
        lVar.G(i10, e10);
        if (z10) {
            return c1(lVar, i10, e10, j10, obj, z10);
        }
        Object objB = lVar.B(i10);
        if (objB == null) {
            if (G(j10)) {
                if (lVar.v(i10, null, f.f27826d)) {
                    return 1;
                }
            } else {
                if (obj == null) {
                    return 3;
                }
                if (lVar.v(i10, null, obj)) {
                    return 2;
                }
            }
        } else if (objB instanceof c3) {
            lVar.w(i10);
            if (U0(objB, e10)) {
                lVar.F(i10, f.f27831i);
                F0();
                return 0;
            }
            if (lVar.x(i10, f.f27833k) != f.f27833k) {
                lVar.C(i10, true);
            }
            return 5;
        }
        return c1(lVar, i10, e10, j10, obj, z10);
    }

    private final int c1(l<E> lVar, int i10, E e10, long j10, Object obj, boolean z10) {
        while (true) {
            Object objB = lVar.B(i10);
            if (objB == null) {
                if (!G(j10) || z10) {
                    if (z10) {
                        if (lVar.v(i10, null, f.f27832j)) {
                            lVar.C(i10, false);
                            return 4;
                        }
                    } else {
                        if (obj == null) {
                            return 3;
                        }
                        if (lVar.v(i10, null, obj)) {
                            return 2;
                        }
                    }
                } else if (lVar.v(i10, null, f.f27826d)) {
                    return 1;
                }
            } else {
                if (objB != f.f27827e) {
                    if (objB == f.f27833k) {
                        lVar.w(i10);
                        return 5;
                    }
                    if (objB == f.f27830h) {
                        lVar.w(i10);
                        return 5;
                    }
                    if (objB == f.z()) {
                        lVar.w(i10);
                        N();
                        return 4;
                    }
                    lVar.w(i10);
                    if (objB instanceof w) {
                        objB = ((w) objB).f27864a;
                    }
                    if (U0(objB, e10)) {
                        lVar.F(i10, f.f27831i);
                        F0();
                        return 0;
                    }
                    if (lVar.x(i10, f.f27833k) != f.f27833k) {
                        lVar.C(i10, true);
                    }
                    return 5;
                }
                if (lVar.v(i10, objB, f.f27826d)) {
                    return 1;
                }
            }
        }
    }

    private final void d1(long j10) {
        long j11;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f27807e;
        do {
            j11 = atomicLongFieldUpdater.get(this);
            if (j11 >= j10) {
                return;
            }
        } while (!f27807e.compareAndSet(this, j11, j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicReferenceFieldUpdater e0() {
        return f27810h;
    }

    private final void e1(long j10) {
        long j11;
        long j12;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f27806d;
        do {
            j11 = atomicLongFieldUpdater.get(this);
            j12 = 1152921504606846975L & j11;
            if (j12 >= j10) {
                return;
            }
        } while (!f27806d.compareAndSet(this, j11, f.w(j12, (int) (j11 >> 60))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicLongFieldUpdater f0() {
        return f27806d;
    }

    private final void j0(long j10) {
        if ((f27809g.addAndGet(this, j10) & 4611686018427387904L) != 0) {
            do {
            } while ((f27809g.get(this) & 4611686018427387904L) != 0);
        }
    }

    static /* synthetic */ void k0(e eVar, long j10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
        }
        if ((i10 & 1) != 0) {
            j10 = 1;
        }
        eVar.j0(j10);
    }

    private final void l0() {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f27814l;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
        } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, obj, obj == null ? f.f27839q : f.f27840r));
        if (obj == null) {
            return;
        }
        ((id.l) obj).invoke(W());
    }

    private final boolean m0(l<E> lVar, int i10, long j10) {
        Object objB;
        do {
            objB = lVar.B(i10);
            if (objB != null && objB != f.f27827e) {
                if (objB == f.f27826d) {
                    return true;
                }
                if (objB == f.f27832j || objB == f.z() || objB == f.f27831i || objB == f.f27830h) {
                    return false;
                }
                if (objB == f.f27829g) {
                    return true;
                }
                return objB != f.f27828f && j10 == c0();
            }
        } while (!lVar.v(i10, objB, f.f27830h));
        P();
        return false;
    }

    private final boolean n0(long j10, boolean z10) {
        int i10 = (int) (j10 >> 60);
        if (i10 == 0 || i10 == 1) {
            return false;
        }
        if (i10 == 2) {
            M(j10 & 1152921504606846975L);
            if (z10 && i0()) {
                return false;
            }
        } else {
            if (i10 != 3) {
                throw new IllegalStateException(("unexpected close status: " + i10).toString());
            }
            L(j10 & 1152921504606846975L);
        }
        return true;
    }

    private final boolean p0(long j10) {
        return n0(j10, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean r0(long j10) {
        return n0(j10, false);
    }

    private final boolean t0() {
        long jU = U();
        return jU == 0 || jU == Long.MAX_VALUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final long u0(l<E> lVar) {
        do {
            int i10 = f.f27824b;
            while (true) {
                i10--;
                if (-1 < i10) {
                    long j10 = (lVar.f29187c * ((long) f.f27824b)) + ((long) i10);
                    if (j10 >= c0()) {
                        while (true) {
                            Object objB = lVar.B(i10);
                            if (objB != null && objB != f.f27827e) {
                                if (objB != f.f27826d) {
                                    break;
                                }
                                return j10;
                            }
                            if (lVar.v(i10, objB, f.z())) {
                                lVar.t();
                                break;
                            }
                        }
                    } else {
                        return -1L;
                    }
                }
            }
            lVar = (l) lVar.h();
        } while (lVar != null);
        return -1L;
    }

    private final void v0() {
        long j10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f27806d;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            if (((int) (j10 >> 60)) != 0) {
                return;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, f.w(1152921504606846975L & j10, 1)));
    }

    private final void w0() {
        long j10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f27806d;
        do {
            j10 = atomicLongFieldUpdater.get(this);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, f.w(1152921504606846975L & j10, 3)));
    }

    private final void x0() {
        long j10;
        long jW;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f27806d;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            int i10 = (int) (j10 >> 60);
            if (i10 == 0) {
                jW = f.w(j10 & 1152921504606846975L, 2);
            } else if (i10 != 1) {
                return;
            } else {
                jW = f.w(j10 & 1152921504606846975L, 3);
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, jW));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void y0(long j10, l<E> lVar) {
        boolean z10;
        l<E> lVar2;
        l<E> lVar3;
        while (lVar.f29187c < j10 && (lVar3 = (l) lVar.f()) != null) {
            lVar = lVar3;
        }
        while (true) {
            if (!lVar.k() || (lVar2 = (l) lVar.f()) == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f27812j;
                while (true) {
                    b0 b0Var = (b0) atomicReferenceFieldUpdater.get(this);
                    z10 = true;
                    if (b0Var.f29187c >= lVar.f29187c) {
                        break;
                    }
                    if (!lVar.u()) {
                        z10 = false;
                        break;
                    } else if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, b0Var, lVar)) {
                        if (!b0Var.p()) {
                            break;
                        }
                        b0Var.n();
                        break;
                    } else if (lVar.p()) {
                        lVar.n();
                    }
                }
                if (z10) {
                    return;
                }
            } else {
                lVar = lVar2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z0(Throwable th, Object obj, zc.j jVar) {
        id.l<E, g0> lVar = this.f27816b;
        kotlin.jvm.internal.t.c(lVar);
        Object objF = k.f(obj);
        kotlin.jvm.internal.t.c(objF);
        x.a(lVar, objF, jVar);
    }

    protected void B0() {
    }

    protected void F0() {
    }

    protected void G0() {
    }

    public boolean H(Throwable th) {
        if (th == null) {
            th = new CancellationException("Channel was cancelled");
        }
        return K(th, true);
    }

    protected boolean K(Throwable th, boolean z10) {
        if (z10) {
            v0();
        }
        boolean zA = androidx.concurrent.futures.b.a(f27813k, this, f.f27841s, th);
        if (z10) {
            w0();
        } else {
            x0();
        }
        N();
        B0();
        if (zA) {
            l0();
        }
        return zA;
    }

    protected final void O(long j10) {
        UndeliveredElementException undeliveredElementExceptionC;
        l<E> lVar = (l) f27811i.get(this);
        while (true) {
            long j11 = f27807e.get(this);
            if (j10 < Math.max(((long) this.f27815a) + j11, U())) {
                return;
            }
            if (f27807e.compareAndSet(this, j11, j11 + 1)) {
                int i10 = f.f27824b;
                long j12 = j11 / ((long) i10);
                int i11 = (int) (j11 % ((long) i10));
                if (lVar.f29187c != j12) {
                    l<E> lVarR = R(j12, lVar);
                    if (lVarR == null) {
                        continue;
                    } else {
                        lVar = lVarR;
                    }
                }
                Object objZ0 = Z0(lVar, i11, j11, null);
                if (objZ0 != f.f27837o) {
                    lVar.c();
                    id.l<E, g0> lVar2 = this.f27816b;
                    if (lVar2 != null && (undeliveredElementExceptionC = x.c(lVar2, objZ0, null, 2, null)) != null) {
                        throw undeliveredElementExceptionC;
                    }
                } else if (j11 < g0()) {
                    lVar.c();
                }
            }
        }
    }

    protected final Throwable W() {
        return (Throwable) f27813k.get(this);
    }

    protected final Object W0(E e10) {
        l lVar;
        Object obj = f.f27826d;
        l lVar2 = (l) e0().get(this);
        while (true) {
            long andIncrement = f0().getAndIncrement(this);
            long j10 = andIncrement & 1152921504606846975L;
            boolean zR0 = r0(andIncrement);
            int i10 = f.f27824b;
            long j11 = j10 / ((long) i10);
            int i11 = (int) (j10 % ((long) i10));
            if (lVar2.f29187c != j11) {
                l lVarS = S(j11, lVar2);
                if (lVarS != null) {
                    lVar = lVarS;
                } else if (zR0) {
                    return k.f27846b.a(d0());
                }
            } else {
                lVar = lVar2;
            }
            int iB1 = b1(lVar, i11, e10, j10, obj, zR0);
            if (iB1 == 0) {
                lVar.c();
                return k.f27846b.c(g0.f27756a);
            }
            if (iB1 == 1) {
                return k.f27846b.c(g0.f27756a);
            }
            if (iB1 == 2) {
                if (zR0) {
                    lVar.t();
                    return k.f27846b.a(d0());
                }
                c3 c3Var = obj instanceof c3 ? (c3) obj : null;
                if (c3Var != null) {
                    K0(c3Var, lVar, i11);
                }
                O((lVar.f29187c * ((long) i10)) + ((long) i11));
                return k.f27846b.c(g0.f27756a);
            }
            if (iB1 == 3) {
                throw new IllegalStateException("unexpected".toString());
            }
            if (iB1 == 4) {
                if (j10 < c0()) {
                    lVar.c();
                }
                return k.f27846b.a(d0());
            }
            if (iB1 == 5) {
                lVar.c();
            }
            lVar2 = lVar;
        }
    }

    @Override // wd.u
    public Object a(zc.f<? super E> fVar) {
        return L0(this, fVar);
    }

    public final long c0() {
        return f27807e.get(this);
    }

    @Override // wd.v
    public void d(id.l<? super Throwable, g0> lVar) {
        if (androidx.concurrent.futures.b.a(f27814l, this, null, lVar)) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f27814l;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != f.f27839q) {
                if (obj == f.f27840r) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked".toString());
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
        } while (!androidx.concurrent.futures.b.a(f27814l, this, f.f27839q, f.f27840r));
        lVar.invoke(W());
    }

    protected final Throwable d0() {
        Throwable thW = W();
        return thW == null ? new ClosedSendChannelException("Channel was closed") : thW;
    }

    @Override // wd.u
    public final void f(CancellationException cancellationException) {
        H(cancellationException);
    }

    public final void f1(long j10) {
        long j11;
        long j12;
        if (t0()) {
            return;
        }
        while (U() <= j10) {
        }
        int i10 = f.f27825c;
        for (int i11 = 0; i11 < i10; i11++) {
            long jU = U();
            if (jU == (f27809g.get(this) & 4611686018427387903L) && jU == U()) {
                return;
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f27809g;
        do {
            j11 = atomicLongFieldUpdater.get(this);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j11, f.v(j11 & 4611686018427387903L, true)));
        while (true) {
            long jU2 = U();
            long j13 = f27809g.get(this);
            long j14 = j13 & 4611686018427387903L;
            boolean z10 = (4611686018427387904L & j13) != 0;
            if (jU2 == j14 && jU2 == U()) {
                break;
            } else if (!z10) {
                f27809g.compareAndSet(this, j13, f.v(j14, true));
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f27809g;
        do {
            j12 = atomicLongFieldUpdater2.get(this);
        } while (!atomicLongFieldUpdater2.compareAndSet(this, j12, f.v(j12 & 4611686018427387903L, false)));
    }

    public final long g0() {
        return f27806d.get(this) & 1152921504606846975L;
    }

    public final boolean i0() {
        while (true) {
            l<E> lVarR = (l) f27811i.get(this);
            long jC0 = c0();
            if (g0() <= jC0) {
                return false;
            }
            int i10 = f.f27824b;
            long j10 = jC0 / ((long) i10);
            if (lVarR.f29187c == j10 || (lVarR = R(j10, lVarR)) != null) {
                lVarR.c();
                if (m0(lVarR, (int) (jC0 % ((long) i10)), jC0)) {
                    return true;
                }
                f27807e.compareAndSet(this, jC0, 1 + jC0);
            } else if (((l) f27811i.get(this)).f29187c < j10) {
                return false;
            }
        }
    }

    @Override // wd.u
    public i<E> iterator() {
        return new a();
    }

    @Override // wd.v
    public Object j(E e10, zc.f<? super g0> fVar) {
        return R0(this, e10, fVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // wd.u
    public Object l() {
        l lVar;
        long j10 = f27807e.get(this);
        long j11 = f27806d.get(this);
        if (p0(j11)) {
            return k.f27846b.a(W());
        }
        if (j10 >= (j11 & 1152921504606846975L)) {
            return k.f27846b.b();
        }
        Object obj = f.f27833k;
        l lVar2 = (l) a0().get(this);
        while (!o0()) {
            long andIncrement = b0().getAndIncrement(this);
            int i10 = f.f27824b;
            long j12 = andIncrement / ((long) i10);
            int i11 = (int) (andIncrement % ((long) i10));
            if (lVar2.f29187c != j12) {
                l lVarR = R(j12, lVar2);
                if (lVarR == null) {
                    continue;
                } else {
                    lVar = lVarR;
                }
            } else {
                lVar = lVar2;
            }
            Object objZ0 = Z0(lVar, i11, andIncrement, obj);
            if (objZ0 == f.f27835m) {
                c3 c3Var = obj instanceof c3 ? (c3) obj : null;
                if (c3Var != null) {
                    J0(c3Var, lVar, i11);
                }
                f1(andIncrement);
                lVar.t();
                return k.f27846b.b();
            }
            if (objZ0 != f.f27837o) {
                if (objZ0 == f.f27836n) {
                    throw new IllegalStateException("unexpected".toString());
                }
                lVar.c();
                return k.f27846b.c(objZ0);
            }
            if (andIncrement < g0()) {
                lVar.c();
            }
            lVar2 = lVar;
        }
        return k.f27846b.a(W());
    }

    @Override // wd.v
    public boolean m(Throwable th) {
        return K(th, false);
    }

    public boolean o0() {
        return p0(f27806d.get(this));
    }

    public boolean q0() {
        return r0(f27806d.get(this));
    }

    protected boolean s0() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String toString() {
        String string;
        StringBuilder sb2 = new StringBuilder();
        int i10 = (int) (f27806d.get(this) >> 60);
        if (i10 == 2) {
            sb2.append("closed,");
        } else if (i10 == 3) {
            sb2.append("cancelled,");
        }
        sb2.append("capacity=" + this.f27815a + ',');
        sb2.append("data=[");
        int i11 = 0;
        List listN = kotlin.collections.t.n(f27811i.get(this), f27810h.get(this), f27812j.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listN) {
            if (((l) obj) != f.f27823a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j10 = ((l) next).f29187c;
            do {
                Object next2 = it.next();
                long j11 = ((l) next2).f29187c;
                if (j10 > j11) {
                    next = next2;
                    j10 = j11;
                }
            } while (it.hasNext());
        }
        l lVar = (l) next;
        long jC0 = c0();
        long jG0 = g0();
        loop2: while (true) {
            int i12 = f.f27824b;
            for (int i13 = i11; i13 < i12; i13++) {
                long j12 = (lVar.f29187c * ((long) f.f27824b)) + ((long) i13);
                if (j12 >= jG0 && j12 >= jC0) {
                    break loop2;
                }
                Object objB = lVar.B(i13);
                Object objA = lVar.A(i13);
                if (objB instanceof ud.n) {
                    string = (j12 >= jC0 || j12 < jG0) ? (j12 >= jG0 || j12 < jC0) ? "cont" : "send" : "receive";
                } else if (objB instanceof ce.b) {
                    string = (j12 >= jC0 || j12 < jG0) ? (j12 >= jG0 || j12 < jC0) ? "select" : sRGQSqxgxlS.QnVyqZhKsBtuc : "onReceive";
                } else if (objB instanceof t) {
                    string = "receiveCatching";
                } else if (objB instanceof b) {
                    string = "sendBroadcast";
                } else if (objB instanceof w) {
                    string = "EB(" + objB + ')';
                } else if (kotlin.jvm.internal.t.a(objB, f.f27828f) || kotlin.jvm.internal.t.a(objB, f.f27829g)) {
                    string = "resuming_sender";
                } else {
                    if (objB != null && !kotlin.jvm.internal.t.a(objB, f.f27827e) && !kotlin.jvm.internal.t.a(objB, f.f27831i) && !kotlin.jvm.internal.t.a(objB, f.f27830h) && !kotlin.jvm.internal.t.a(objB, f.f27833k) && !kotlin.jvm.internal.t.a(objB, f.f27832j) && !kotlin.jvm.internal.t.a(objB, f.z())) {
                        string = objB.toString();
                    }
                }
                if (objA != null) {
                    sb2.append('(' + string + ',' + objA + "),");
                } else {
                    sb2.append(string + ',');
                }
            }
            lVar = (l) lVar.f();
            if (lVar == null) {
                break;
            }
            i11 = 0;
        }
        if (h0.g1(sb2) == ',') {
            kotlin.jvm.internal.t.e(sb2.deleteCharAt(sb2.length() - 1), "deleteCharAt(...)");
        }
        sb2.append("]");
        return sb2.toString();
    }

    @Override // wd.v
    public Object i(E e10) {
        l lVar;
        c3 c3Var;
        if (!T0(f27806d.get(this))) {
            Object obj = f.f27832j;
            l lVar2 = (l) e0().get(this);
            while (true) {
                long andIncrement = f0().getAndIncrement(this);
                long j10 = andIncrement & 1152921504606846975L;
                boolean zR0 = r0(andIncrement);
                int i10 = f.f27824b;
                long j11 = j10 / ((long) i10);
                int i11 = (int) (j10 % ((long) i10));
                if (lVar2.f29187c != j11) {
                    l lVarS = S(j11, lVar2);
                    if (lVarS == null) {
                        if (zR0) {
                            break;
                        }
                    } else {
                        lVar = lVarS;
                    }
                } else {
                    lVar = lVar2;
                }
                int iB1 = b1(lVar, i11, e10, j10, obj, zR0);
                if (iB1 != 0) {
                    if (iB1 != 1) {
                        if (iB1 != 2) {
                            if (iB1 != 3) {
                                if (iB1 != 4) {
                                    if (iB1 == 5) {
                                        lVar.c();
                                    }
                                    lVar2 = lVar;
                                } else {
                                    if (j10 >= c0()) {
                                        break;
                                    }
                                    lVar.c();
                                    break;
                                }
                            } else {
                                throw new IllegalStateException(TwDPD.tneD.toString());
                            }
                        } else {
                            if (zR0) {
                                lVar.t();
                                break;
                            }
                            if (obj instanceof c3) {
                                c3Var = (c3) obj;
                            } else {
                                c3Var = null;
                            }
                            if (c3Var != null) {
                                K0(c3Var, lVar, i11);
                            }
                            lVar.t();
                            return k.f27846b.b();
                        }
                    }
                } else {
                    lVar.c();
                }
                return k.f27846b.c(g0.f27756a);
            }
            return k.f27846b.a(d0());
        }
        return k.f27846b.b();
    }
}
