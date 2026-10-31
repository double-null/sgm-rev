package be;

import com.applovin.mediation.adapters.google.NK.ykDFMuXDQMaR;
import com.applovin.shadow.okio.internal.MoA.edUJlCZxhVnO;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.t;
import ud.s0;
import wc.g0;
import zd.e0;
import zd.z;

/* JADX INFO: compiled from: CoroutineScheduler.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a implements Executor, Closeable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C0088a f4456h = new C0088a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f4457i = AtomicLongFieldUpdater.newUpdater(a.class, "parkedWorkersStack$volatile");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f4458j = AtomicLongFieldUpdater.newUpdater(a.class, "controlState$volatile");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f4459k = AtomicIntegerFieldUpdater.newUpdater(a.class, "_isTerminated$volatile");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final e0 f4460l = new e0("NOT_IN_STACK");
    private volatile /* synthetic */ int _isTerminated$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f4463c;
    private volatile /* synthetic */ long controlState$volatile;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f4464d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final be.d f4465e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final be.d f4466f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final z<c> f4467g;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* JADX INFO: renamed from: be.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CoroutineScheduler.kt */
    public static final class C0088a {
        private C0088a() {
        }

        public /* synthetic */ C0088a(kotlin.jvm.internal.k kVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: CoroutineScheduler.kt */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.PARKING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.BLOCKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.CPU_ACQUIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d.DORMANT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[d.TERMINATED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: compiled from: CoroutineScheduler.kt */
    public enum d {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED;


        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ bd.a f4483g = bd.b.a(b());
    }

    public a(int i10, int i11, long j10, String str) {
        this.f4461a = i10;
        this.f4462b = i11;
        this.f4463c = j10;
        this.f4464d = str;
        if (!(i10 >= 1)) {
            throw new IllegalArgumentException(("Core pool size " + i10 + " should be at least 1").toString());
        }
        if (!(i11 >= i10)) {
            throw new IllegalArgumentException(("Max pool size " + i11 + " should be greater than or equals to core pool size " + i10).toString());
        }
        if (!(i11 <= 2097150)) {
            throw new IllegalArgumentException(("Max pool size " + i11 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (!(j10 > 0)) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j10 + " must be positive").toString());
        }
        this.f4465e = new be.d();
        this.f4466f = new be.d();
        this.f4467g = new z<>((i10 + 1) * 2);
        this.controlState$volatile = ((long) i10) << 42;
        this._isTerminated$volatile = 0;
    }

    private final void F(long j10, boolean z10) {
        if (z10 || L() || J(j10)) {
            return;
        }
        L();
    }

    private final h I(c cVar, h hVar, boolean z10) {
        d dVar;
        if (cVar == null || (dVar = cVar.f4471c) == d.TERMINATED) {
            return hVar;
        }
        if (!hVar.f4494b && dVar == d.BLOCKING) {
            return hVar;
        }
        cVar.f4475g = true;
        return cVar.f4469a.a(hVar, z10);
    }

    private final boolean J(long j10) {
        if (od.k.d(((int) (2097151 & j10)) - ((int) ((j10 & 4398044413952L) >> 21)), 0) < this.f4461a) {
            int iE = e();
            if (iE == 1 && this.f4461a > 1) {
                e();
            }
            if (iE > 0) {
                return true;
            }
        }
        return false;
    }

    static /* synthetic */ boolean K(a aVar, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = f4458j.get(aVar);
        }
        return aVar.J(j10);
    }

    private final boolean L() {
        c cVarU;
        do {
            cVarU = u();
            if (cVarU == null) {
                return false;
            }
        } while (!c.f4468i.compareAndSet(cVarU, -1, 0));
        LockSupport.unpark(cVarU);
        return true;
    }

    private final boolean c(h hVar) {
        return hVar.f4494b ? this.f4466f.a(hVar) : this.f4465e.a(hVar);
    }

    private final c h() {
        Thread threadCurrentThread = Thread.currentThread();
        c cVar = threadCurrentThread instanceof c ? (c) threadCurrentThread : null;
        if (cVar == null || !t.a(a.this, this)) {
            return null;
        }
        return cVar;
    }

    public static /* synthetic */ void n(a aVar, Runnable runnable, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        aVar.k(runnable, z10, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicLongFieldUpdater o() {
        return f4458j;
    }

    private final int t(c cVar) {
        Object objH = cVar.h();
        while (objH != f4460l) {
            if (objH == null) {
                return 0;
            }
            c cVar2 = (c) objH;
            int iG = cVar2.g();
            if (iG != 0) {
                return iG;
            }
            objH = cVar2.h();
        }
        return -1;
    }

    private final c u() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f4457i;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            c cVarB = this.f4467g.b((int) (2097151 & j10));
            if (cVarB == null) {
                return null;
            }
            long j11 = (2097152 + j10) & (-2097152);
            int iT = t(cVarB);
            if (iT >= 0 && f4457i.compareAndSet(this, j10, ((long) iT) | j11)) {
                cVarB.q(f4460l);
                return cVarB;
            }
        }
    }

    public final void B(h hVar) {
        try {
            hVar.run();
        } catch (Throwable th) {
            try {
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
            } finally {
                ud.c.a();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005f  */
    public final void C(long j10) throws InterruptedException {
        int i10;
        h hVarE;
        if (f4459k.compareAndSet(this, 0, 1)) {
            c cVarH = h();
            synchronized (this.f4467g) {
                i10 = (int) (o().get(this) & 2097151);
            }
            if (1 <= i10) {
                int i11 = 1;
                while (true) {
                    c cVarB = this.f4467g.b(i11);
                    t.c(cVarB);
                    c cVar = cVarB;
                    if (cVar != cVarH) {
                        while (cVar.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(cVar);
                            cVar.join(j10);
                        }
                        cVar.f4469a.j(this.f4466f);
                    }
                    if (i11 == i10) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            this.f4466f.b();
            this.f4465e.b();
            while (true) {
                if (cVarH == null) {
                    hVarE = this.f4465e.e();
                    if (hVarE == null && (hVarE = this.f4466f.e()) == null) {
                        break;
                    }
                } else {
                    hVarE = cVarH.f(true);
                    if (hVarE == null) {
                        hVarE = this.f4465e.e();
                        if (hVarE == null) {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
                B(hVarE);
            }
            if (cVarH != null) {
                cVarH.t(d.TERMINATED);
            }
            f4457i.set(this, 0L);
            f4458j.set(this, 0L);
        }
    }

    public final void G() {
        if (L() || K(this, 0L, 1, null)) {
            return;
        }
        L();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws InterruptedException {
        C(10000L);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        n(this, runnable, false, false, 6, null);
    }

    public final h f(Runnable runnable, boolean z10) {
        long jA = j.f4501f.a();
        if (!(runnable instanceof h)) {
            return j.b(runnable, jA, z10);
        }
        h hVar = (h) runnable;
        hVar.f4493a = jA;
        hVar.f4494b = z10;
        return hVar;
    }

    public final boolean isTerminated() {
        return f4459k.get(this) != 0;
    }

    public final void k(Runnable runnable, boolean z10, boolean z11) {
        ud.c.a();
        h hVarF = f(runnable, z10);
        boolean z12 = hVarF.f4494b;
        long jAddAndGet = z12 ? f4458j.addAndGet(this, 2097152L) : 0L;
        c cVarH = h();
        h hVarI = I(cVarH, hVarF, z11);
        if (hVarI != null && !c(hVarI)) {
            throw new RejectedExecutionException(this.f4464d + " was terminated");
        }
        boolean z13 = z11 && cVarH != null;
        if (z12) {
            F(jAddAndGet, z13);
        } else {
            if (z13) {
                return;
            }
            G();
        }
    }

    public final boolean v(c cVar) {
        long j10;
        int iG;
        if (cVar.h() != f4460l) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f4457i;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            iG = cVar.g();
            cVar.q(this.f4467g.b((int) (2097151 & j10)));
        } while (!f4457i.compareAndSet(this, j10, ((2097152 + j10) & (-2097152)) | ((long) iG)));
        return true;
    }

    public final void z(c cVar, int i10, int i11) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f4457i;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            int iT = (int) (2097151 & j10);
            long j11 = (2097152 + j10) & (-2097152);
            if (iT == i10) {
                iT = i11 == 0 ? t(cVar) : i11;
            }
            if (iT >= 0 && f4457i.compareAndSet(this, j10, j11 | ((long) iT))) {
                return;
            }
        }
    }

    private final int e() {
        synchronized (this.f4467g) {
            if (isTerminated()) {
                return -1;
            }
            long j10 = f4458j.get(this);
            int i10 = (int) (j10 & 2097151);
            int iD = od.k.d(i10 - ((int) ((j10 & 4398044413952L) >> 21)), 0);
            if (iD >= this.f4461a) {
                return 0;
            }
            if (i10 >= this.f4462b) {
                return 0;
            }
            int i11 = ((int) (o().get(this) & 2097151)) + 1;
            if (!(i11 > 0 && this.f4467g.b(i11) == null)) {
                throw new IllegalArgumentException(edUJlCZxhVnO.CJplwDZgmdibo.toString());
            }
            c cVar = new c(this, i11);
            this.f4467g.c(i11, cVar);
            if (!(i11 == ((int) (2097151 & f4458j.incrementAndGet(this))))) {
                throw new IllegalArgumentException(edUJlCZxhVnO.CJplwDZgmdibo.toString());
            }
            int i12 = iD + 1;
            cVar.start();
            return i12;
        }
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        int iA = this.f4467g.a();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 1; i15 < iA; i15++) {
            c cVarB = this.f4467g.b(i15);
            if (cVarB != null) {
                int i16 = cVarB.f4469a.i();
                int i17 = b.$EnumSwitchMapping$0[cVarB.f4471c.ordinal()];
                if (i17 == 1) {
                    i12++;
                } else if (i17 == 2) {
                    i11++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i16);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (i17 == 3) {
                    i10++;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(i16);
                    sb3.append('c');
                    arrayList.add(sb3.toString());
                } else if (i17 == 4) {
                    i13++;
                    if (i16 > 0) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(i16);
                        sb4.append('d');
                        arrayList.add(sb4.toString());
                    }
                } else {
                    if (i17 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i14++;
                }
            }
        }
        long j10 = f4458j.get(this);
        return this.f4464d + '@' + s0.b(this) + "[Pool Size {core = " + this.f4461a + ", max = " + this.f4462b + "}, Worker States {CPU = " + i10 + ykDFMuXDQMaR.IIfK + i11 + ", parked = " + i12 + ", dormant = " + i13 + ", terminated = " + i14 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f4465e.c() + ", global blocking queue size = " + this.f4466f.c() + ", Control State {created workers= " + ((int) (2097151 & j10)) + ", blocking tasks = " + ((int) ((4398044413952L & j10) >> 21)) + ", CPUs acquired = " + (this.f4461a - ((int) ((9223367638808264704L & j10) >> 42))) + "}]";
    }

    /* JADX INFO: compiled from: CoroutineScheduler.kt */
    public final class c extends Thread {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final /* synthetic */ AtomicIntegerFieldUpdater f4468i = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl$volatile");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l f4469a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final h0<h> f4470b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public d f4471c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f4472d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f4473e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f4474f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f4475g;
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;
        private volatile /* synthetic */ int workerCtl$volatile;

        private c() {
            setDaemon(true);
            setContextClassLoader(a.this.getClass().getClassLoader());
            this.f4469a = new l();
            this.f4470b = new h0<>();
            this.f4471c = d.DORMANT;
            this.nextParkedWorker = a.f4460l;
            int iNanoTime = (int) System.nanoTime();
            this.f4474f = iNanoTime == 0 ? 42 : iNanoTime;
        }

        private final void c(h hVar) {
            this.f4472d = 0L;
            if (this.f4471c == d.PARKING) {
                this.f4471c = d.BLOCKING;
            }
            if (!hVar.f4494b) {
                a.this.B(hVar);
                return;
            }
            if (t(d.BLOCKING)) {
                a.this.G();
            }
            a.this.B(hVar);
            a.o().addAndGet(a.this, -2097152L);
            if (this.f4471c != d.TERMINATED) {
                this.f4471c = d.DORMANT;
            }
        }

        private final h d(boolean z10) {
            h hVarM;
            h hVarM2;
            if (z10) {
                boolean z11 = k(a.this.f4461a * 2) == 0;
                if (z11 && (hVarM2 = m()) != null) {
                    return hVarM2;
                }
                h hVarK = this.f4469a.k();
                if (hVarK != null) {
                    return hVarK;
                }
                if (!z11 && (hVarM = m()) != null) {
                    return hVarM;
                }
            } else {
                h hVarM3 = m();
                if (hVarM3 != null) {
                    return hVarM3;
                }
            }
            return u(3);
        }

        private final h e() {
            h hVarL = this.f4469a.l();
            if (hVarL != null) {
                return hVarL;
            }
            h hVarE = a.this.f4466f.e();
            return hVarE == null ? u(1) : hVarE;
        }

        private final boolean j() {
            return this.nextParkedWorker != a.f4460l;
        }

        private final void l() {
            if (this.f4472d == 0) {
                this.f4472d = System.nanoTime() + a.this.f4463c;
            }
            LockSupport.parkNanos(a.this.f4463c);
            if (System.nanoTime() - this.f4472d >= 0) {
                this.f4472d = 0L;
                v();
            }
        }

        private final h m() {
            if (k(2) == 0) {
                h hVarE = a.this.f4465e.e();
                return hVarE != null ? hVarE : a.this.f4466f.e();
            }
            h hVarE2 = a.this.f4466f.e();
            return hVarE2 != null ? hVarE2 : a.this.f4465e.e();
        }

        private final void n() {
            loop0: while (true) {
                boolean z10 = false;
                while (true) {
                    if (a.this.isTerminated() || this.f4471c == d.TERMINATED) {
                        break loop0;
                    }
                    h hVarF = f(this.f4475g);
                    if (hVarF != null) {
                        this.f4473e = 0L;
                        c(hVarF);
                        break;
                    }
                    this.f4475g = false;
                    if (this.f4473e == 0) {
                        s();
                    } else {
                        if (z10) {
                            t(d.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f4473e);
                            this.f4473e = 0L;
                            break;
                        }
                        z10 = true;
                    }
                }
            }
            t(d.TERMINATED);
        }

        private final boolean r() {
            boolean z10;
            if (this.f4471c == d.CPU_ACQUIRED) {
                return true;
            }
            a aVar = a.this;
            AtomicLongFieldUpdater atomicLongFieldUpdaterO = a.o();
            while (true) {
                long j10 = atomicLongFieldUpdaterO.get(aVar);
                if (((int) ((9223367638808264704L & j10) >> 42)) == 0) {
                    z10 = false;
                    break;
                }
                if (a.o().compareAndSet(aVar, j10, j10 - 4398046511104L)) {
                    z10 = true;
                    break;
                }
            }
            if (!z10) {
                return false;
            }
            this.f4471c = d.CPU_ACQUIRED;
            return true;
        }

        private final void s() {
            if (!j()) {
                a.this.v(this);
                return;
            }
            f4468i.set(this, -1);
            while (j() && f4468i.get(this) == -1 && !a.this.isTerminated() && this.f4471c != d.TERMINATED) {
                t(d.PARKING);
                Thread.interrupted();
                l();
            }
        }

        private final h u(int i10) {
            int i11 = (int) (a.o().get(a.this) & 2097151);
            if (i11 < 2) {
                return null;
            }
            int iK = k(i11);
            a aVar = a.this;
            long jMin = Long.MAX_VALUE;
            for (int i12 = 0; i12 < i11; i12++) {
                iK++;
                if (iK > i11) {
                    iK = 1;
                }
                c cVarB = aVar.f4467g.b(iK);
                if (cVarB != null && cVarB != this) {
                    long jR = cVarB.f4469a.r(i10, this.f4470b);
                    if (jR == -1) {
                        h0<h> h0Var = this.f4470b;
                        h hVar = h0Var.f21514a;
                        h0Var.f21514a = null;
                        return hVar;
                    }
                    if (jR > 0) {
                        jMin = Math.min(jMin, jR);
                    }
                }
            }
            if (jMin == Long.MAX_VALUE) {
                jMin = 0;
            }
            this.f4473e = jMin;
            return null;
        }

        private final void v() {
            a aVar = a.this;
            synchronized (aVar.f4467g) {
                if (aVar.isTerminated()) {
                    return;
                }
                if (((int) (a.o().get(aVar) & 2097151)) <= aVar.f4461a) {
                    return;
                }
                if (f4468i.compareAndSet(this, -1, 1)) {
                    int i10 = this.indexInArray;
                    o(0);
                    aVar.z(this, i10, 0);
                    int andDecrement = (int) (a.o().getAndDecrement(aVar) & 2097151);
                    if (andDecrement != i10) {
                        c cVarB = aVar.f4467g.b(andDecrement);
                        t.c(cVarB);
                        c cVar = cVarB;
                        aVar.f4467g.c(i10, cVar);
                        cVar.o(i10);
                        aVar.z(cVar, andDecrement, i10);
                    }
                    aVar.f4467g.c(andDecrement, null);
                    g0 g0Var = g0.f27756a;
                    this.f4471c = d.TERMINATED;
                }
            }
        }

        public final h f(boolean z10) {
            return r() ? d(z10) : e();
        }

        public final int g() {
            return this.indexInArray;
        }

        public final Object h() {
            return this.nextParkedWorker;
        }

        public final int k(int i10) {
            int i11 = this.f4474f;
            int i12 = i11 ^ (i11 << 13);
            int i13 = i12 ^ (i12 >> 17);
            int i14 = i13 ^ (i13 << 5);
            this.f4474f = i14;
            int i15 = i10 - 1;
            return (i15 & i10) == 0 ? i14 & i15 : (i14 & Integer.MAX_VALUE) % i10;
        }

        public final void o(int i10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(a.this.f4464d);
            sb2.append("-worker-");
            sb2.append(i10 == 0 ? "TERMINATED" : String.valueOf(i10));
            setName(sb2.toString());
            this.indexInArray = i10;
        }

        public final void q(Object obj) {
            this.nextParkedWorker = obj;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            n();
        }

        public final boolean t(d dVar) {
            d dVar2 = this.f4471c;
            boolean z10 = dVar2 == d.CPU_ACQUIRED;
            if (z10) {
                a.o().addAndGet(a.this, 4398046511104L);
            }
            if (dVar2 != dVar) {
                this.f4471c = dVar;
            }
            return z10;
        }

        public c(a aVar, int i10) {
            this();
            o(i10);
        }
    }
}
