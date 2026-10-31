package ud;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: EventLoop.common.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class l1 extends m1 implements x0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f26782f = AtomicReferenceFieldUpdater.newUpdater(l1.class, Object.class, "_queue$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f26783g = AtomicReferenceFieldUpdater.newUpdater(l1.class, Object.class, "_delayed$volatile");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f26784h = AtomicIntegerFieldUpdater.newUpdater(l1.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    /* JADX INFO: compiled from: EventLoop.common.kt */
    private final class a extends c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final n<wc.g0> f26785c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(long j10, n<? super wc.g0> nVar) {
            super(j10);
            this.f26785c = nVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f26785c.D(l1.this, wc.g0.f27756a);
        }

        @Override // ud.l1.c
        public String toString() {
            return super.toString() + this.f26785c;
        }
    }

    /* JADX INFO: compiled from: EventLoop.common.kt */
    private static final class b extends c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Runnable f26787c;

        public b(long j10, Runnable runnable) {
            super(j10);
            this.f26787c = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f26787c.run();
        }

        @Override // ud.l1.c
        public String toString() {
            return super.toString() + this.f26787c;
        }
    }

    /* JADX INFO: compiled from: EventLoop.common.kt */
    public static abstract class c implements Runnable, Comparable<c>, g1, zd.o0 {
        private volatile Object _heap;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f26788a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f26789b = -1;

        public c(long j10) {
            this.f26788a = j10;
        }

        @Override // zd.o0
        public void a(zd.n0<?> n0Var) {
            if (!(this._heap != o1.f26796a)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            this._heap = n0Var;
        }

        @Override // zd.o0
        public zd.n0<?> c() {
            Object obj = this._heap;
            if (obj instanceof zd.n0) {
                return (zd.n0) obj;
            }
            return null;
        }

        @Override // ud.g1
        public final void e() {
            synchronized (this) {
                Object obj = this._heap;
                if (obj == o1.f26796a) {
                    return;
                }
                d dVar = obj instanceof d ? (d) obj : null;
                if (dVar != null) {
                    dVar.h(this);
                }
                this._heap = o1.f26796a;
                wc.g0 g0Var = wc.g0.f27756a;
            }
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            long j10 = this.f26788a - cVar.f26788a;
            if (j10 > 0) {
                return 1;
            }
            return j10 < 0 ? -1 : 0;
        }

        @Override // zd.o0
        public int getIndex() {
            return this.f26789b;
        }

        public final int h(long j10, d dVar, l1 l1Var) {
            synchronized (this) {
                if (this._heap == o1.f26796a) {
                    return 2;
                }
                synchronized (dVar) {
                    c cVarB = dVar.b();
                    if (l1Var.k()) {
                        return 1;
                    }
                    if (cVarB == null) {
                        dVar.f26790c = j10;
                    } else {
                        long j11 = cVarB.f26788a;
                        if (j11 - j10 < 0) {
                            j10 = j11;
                        }
                        if (j10 - dVar.f26790c > 0) {
                            dVar.f26790c = j10;
                        }
                    }
                    long j12 = this.f26788a;
                    long j13 = dVar.f26790c;
                    if (j12 - j13 < 0) {
                        this.f26788a = j13;
                    }
                    dVar.a(this);
                    return 0;
                }
            }
        }

        public final boolean i(long j10) {
            return j10 - this.f26788a >= 0;
        }

        @Override // zd.o0
        public void setIndex(int i10) {
            this.f26789b = i10;
        }

        public String toString() {
            return "Delayed[nanos=" + this.f26788a + ']';
        }
    }

    /* JADX INFO: compiled from: EventLoop.common.kt */
    public static final class d extends zd.n0<c> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f26790c;

        public d(long j10) {
            this.f26790c = j10;
        }
    }

    private final void G0() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f26782f;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                if (androidx.concurrent.futures.b.a(f26782f, this, null, o1.f26797b)) {
                    return;
                }
            } else if (obj instanceof zd.r) {
                ((zd.r) obj).d();
                return;
            } else {
                if (obj == o1.f26797b) {
                    return;
                }
                zd.r rVar = new zd.r(8, true);
                kotlin.jvm.internal.t.d(obj, "null cannot be cast to non-null type java.lang.Runnable");
                rVar.a((Runnable) obj);
                if (androidx.concurrent.futures.b.a(f26782f, this, obj, rVar)) {
                    return;
                }
            }
        }
    }

    private final Runnable H0() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f26782f;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return null;
            }
            if (obj instanceof zd.r) {
                kotlin.jvm.internal.t.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable>");
                zd.r rVar = (zd.r) obj;
                Object objM = rVar.m();
                if (objM != zd.r.f29231h) {
                    return (Runnable) objM;
                }
                androidx.concurrent.futures.b.a(f26782f, this, obj, rVar.l());
            } else {
                if (obj == o1.f26797b) {
                    return null;
                }
                if (androidx.concurrent.futures.b.a(f26782f, this, obj, null)) {
                    kotlin.jvm.internal.t.d(obj, "null cannot be cast to non-null type java.lang.Runnable");
                    return (Runnable) obj;
                }
            }
        }
    }

    private final void J0() {
        c cVarI;
        d dVar = (d) f26783g.get(this);
        if (dVar == null || dVar.e()) {
            return;
        }
        ud.c.a();
        long jNanoTime = System.nanoTime();
        do {
            synchronized (dVar) {
                c cVarB = dVar.b();
                cVarI = null;
                if (cVarB != null) {
                    c cVar = cVarB;
                    cVarI = cVar.i(jNanoTime) ? K0(cVar) : false ? dVar.i(0) : null;
                }
            }
        } while (cVarI != null);
    }

    private final boolean K0(Runnable runnable) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f26782f;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (k()) {
                return false;
            }
            if (obj == null) {
                if (androidx.concurrent.futures.b.a(f26782f, this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof zd.r) {
                kotlin.jvm.internal.t.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable>");
                zd.r rVar = (zd.r) obj;
                int iA = rVar.a(runnable);
                if (iA == 0) {
                    return true;
                }
                if (iA == 1) {
                    androidx.concurrent.futures.b.a(f26782f, this, obj, rVar.l());
                } else if (iA == 2) {
                    return false;
                }
            } else {
                if (obj == o1.f26797b) {
                    return false;
                }
                zd.r rVar2 = new zd.r(8, true);
                kotlin.jvm.internal.t.d(obj, "null cannot be cast to non-null type java.lang.Runnable");
                rVar2.a((Runnable) obj);
                rVar2.a(runnable);
                if (androidx.concurrent.futures.b.a(f26782f, this, obj, rVar2)) {
                    return true;
                }
            }
        }
    }

    private final void P0() {
        c cVarJ;
        ud.c.a();
        long jNanoTime = System.nanoTime();
        while (true) {
            d dVar = (d) f26783g.get(this);
            if (dVar == null || (cVarJ = dVar.j()) == null) {
                return;
            } else {
                D0(jNanoTime, cVarJ);
            }
        }
    }

    private final int S0(long j10, c cVar) {
        if (k()) {
            return 1;
        }
        d dVar = (d) f26783g.get(this);
        if (dVar == null) {
            androidx.concurrent.futures.b.a(f26783g, this, null, new d(j10));
            Object obj = f26783g.get(this);
            kotlin.jvm.internal.t.c(obj);
            dVar = (d) obj;
        }
        return cVar.h(j10, dVar, this);
    }

    private final void U0(boolean z10) {
        f26784h.set(this, z10 ? 1 : 0);
    }

    private final boolean V0(c cVar) {
        d dVar = (d) f26783g.get(this);
        return (dVar != null ? dVar.f() : null) == cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean k() {
        return f26784h.get(this) != 0;
    }

    public void I0(Runnable runnable) {
        J0();
        if (K0(runnable)) {
            E0();
        } else {
            t0.f26817i.I0(runnable);
        }
    }

    @Override // ud.x0
    public g1 L(long j10, Runnable runnable, zc.j jVar) {
        return x0.a.a(this, j10, runnable, jVar);
    }

    protected boolean O0() {
        if (!y0()) {
            return false;
        }
        d dVar = (d) f26783g.get(this);
        if (dVar != null && !dVar.e()) {
            return false;
        }
        Object obj = f26782f.get(this);
        if (obj != null) {
            if (obj instanceof zd.r) {
                return ((zd.r) obj).j();
            }
            if (obj != o1.f26797b) {
                return false;
            }
        }
        return true;
    }

    protected final void Q0() {
        f26782f.set(this, null);
        f26783g.set(this, null);
    }

    public final void R0(long j10, c cVar) {
        int iS0 = S0(j10, cVar);
        if (iS0 == 0) {
            if (V0(cVar)) {
                E0();
            }
        } else if (iS0 == 1) {
            D0(j10, cVar);
        } else if (iS0 != 2) {
            throw new IllegalStateException("unexpected result".toString());
        }
    }

    protected final g1 T0(long j10, Runnable runnable) {
        long jC = o1.c(j10);
        if (jC >= 4611686018427387903L) {
            return m2.f26792a;
        }
        ud.c.a();
        long jNanoTime = System.nanoTime();
        b bVar = new b(jC + jNanoTime, runnable);
        R0(jNanoTime, bVar);
        return bVar;
    }

    @Override // ud.k0
    public final void m0(zc.j jVar, Runnable runnable) {
        I0(runnable);
    }

    @Override // ud.k1
    public void shutdown() {
        v2.f26824a.c();
        U0(true);
        G0();
        while (z0() <= 0) {
        }
        P0();
    }

    @Override // ud.x0
    public void u(long j10, n<? super wc.g0> nVar) {
        long jC = o1.c(j10);
        if (jC < 4611686018427387903L) {
            ud.c.a();
            long jNanoTime = System.nanoTime();
            a aVar = new a(jC + jNanoTime, nVar);
            R0(jNanoTime, aVar);
            r.a(nVar, aVar);
        }
    }

    @Override // ud.k1
    protected long u0() {
        c cVarF;
        if (super.u0() == 0) {
            return 0L;
        }
        Object obj = f26782f.get(this);
        if (obj != null) {
            if (!(obj instanceof zd.r)) {
                return obj == o1.f26797b ? Long.MAX_VALUE : 0L;
            }
            if (!((zd.r) obj).j()) {
                return 0L;
            }
        }
        d dVar = (d) f26783g.get(this);
        if (dVar == null || (cVarF = dVar.f()) == null) {
            return Long.MAX_VALUE;
        }
        long j10 = cVarF.f26788a;
        ud.c.a();
        return od.k.e(j10 - System.nanoTime(), 0L);
    }

    @Override // ud.k1
    public long z0() {
        if (A0()) {
            return 0L;
        }
        J0();
        Runnable runnableH0 = H0();
        if (runnableH0 == null) {
            return u0();
        }
        runnableH0.run();
        return 0L;
    }
}
