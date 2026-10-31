package de;

import com.android.billingclient.gp.VRfCTjjLv;
import id.p;
import id.q;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.t;
import ud.c3;
import ud.n;
import wc.g0;
import zd.b0;
import zd.c0;

/* JADX INFO: compiled from: Semaphore.kt */
/* JADX INFO: loaded from: classes5.dex */
public class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f13532c = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "head$volatile");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f13533d = AtomicLongFieldUpdater.newUpdater(i.class, "deqIdx$volatile");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f13534e = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "tail$volatile");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f13535f = AtomicLongFieldUpdater.newUpdater(i.class, "enqIdx$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f13536g = AtomicIntegerFieldUpdater.newUpdater(i.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f13537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q<Throwable, g0, zc.j, g0> f13538b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    /* JADX INFO: compiled from: Semaphore.kt */
    /* synthetic */ class a extends kotlin.jvm.internal.q implements p<Long, k, k> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f13539a = new a();

        a() {
            super(2, j.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        @Override // id.p
        public /* bridge */ /* synthetic */ k invoke(Long l10, k kVar) {
            return k(l10.longValue(), kVar);
        }

        public final k k(long j10, k kVar) {
            return j.h(j10, kVar);
        }
    }

    /* JADX INFO: compiled from: Semaphore.kt */
    /* synthetic */ class b extends kotlin.jvm.internal.q implements p<Long, k, k> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f13540a = new b();

        b() {
            super(2, j.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        @Override // id.p
        public /* bridge */ /* synthetic */ k invoke(Long l10, k kVar) {
            return k(l10.longValue(), kVar);
        }

        public final k k(long j10, k kVar) {
            return j.h(j10, kVar);
        }
    }

    public i(int i10, int i11) {
        this.f13537a = i10;
        if (!(i10 > 0)) {
            throw new IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + i10).toString());
        }
        if (!(i11 >= 0 && i11 <= i10)) {
            throw new IllegalArgumentException(("The number of acquired permits should be in 0.." + i10).toString());
        }
        k kVar = new k(0L, null, 2);
        this.head$volatile = kVar;
        this.tail$volatile = kVar;
        this._availablePermits$volatile = i10 - i11;
        this.f13538b = new q() { // from class: de.h
            @Override // id.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return i.p(this.f13531a, (Throwable) obj, (g0) obj2, (zc.j) obj3);
            }
        };
    }

    private final boolean g(c3 c3Var) {
        Object objC;
        boolean z10;
        k kVar = (k) f13534e.get(this);
        long andIncrement = f13535f.getAndIncrement(this);
        a aVar = a.f13539a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13534e;
        long j10 = andIncrement / ((long) j.f13546f);
        do {
            objC = zd.a.c(kVar, j10, aVar);
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
        k kVar2 = (k) c0.b(objC);
        int i10 = (int) (andIncrement % ((long) j.f13546f));
        if (com.google.android.gms.internal.measurement.a.a(kVar2.v(), i10, null, c3Var)) {
            c3Var.a(kVar2, i10);
            return true;
        }
        if (!com.google.android.gms.internal.measurement.a.a(kVar2.v(), i10, j.f13542b, j.f13543c)) {
            return false;
        }
        if (c3Var instanceof n) {
            t.d(c3Var, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            ((n) c3Var).d0(g0.f27756a, this.f13538b);
            return true;
        }
        if (c3Var instanceof ce.b) {
            ((ce.b) c3Var).c(g0.f27756a);
            return true;
        }
        throw new IllegalStateException(("unexpected: " + c3Var).toString());
    }

    private final void h() {
        int i10;
        do {
            i10 = f13536g.get(this);
            if (i10 <= this.f13537a) {
                return;
            }
        } while (!f13536g.compareAndSet(this, i10, this.f13537a));
    }

    private final int i() {
        int andDecrement;
        do {
            andDecrement = f13536g.getAndDecrement(this);
        } while (andDecrement > this.f13537a);
        return andDecrement;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g0 p(i iVar, Throwable th, g0 g0Var, zc.j jVar) {
        iVar.q();
        return g0.f27756a;
    }

    private final boolean s(Object obj) {
        if (!(obj instanceof n)) {
            if (obj instanceof ce.b) {
                return ((ce.b) obj).d(this, g0.f27756a);
            }
            throw new IllegalStateException(("unexpected: " + obj).toString());
        }
        t.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
        n nVar = (n) obj;
        Object objG = nVar.g(g0.f27756a, null, this.f13538b);
        if (objG == null) {
            return false;
        }
        nVar.h0(objG);
        return true;
    }

    private final boolean t() {
        Object objC;
        boolean z10;
        k kVar = (k) f13532c.get(this);
        long andIncrement = f13533d.getAndIncrement(this);
        long j10 = andIncrement / ((long) j.f13546f);
        b bVar = b.f13540a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13532c;
        do {
            objC = zd.a.c(kVar, j10, bVar);
            if (c0.c(objC)) {
                break;
            }
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
        } while (!z10);
        k kVar2 = (k) c0.b(objC);
        kVar2.c();
        if (kVar2.f29187c > j10) {
            return false;
        }
        int i10 = (int) (andIncrement % ((long) j.f13546f));
        Object andSet = kVar2.v().getAndSet(i10, j.f13542b);
        if (andSet != null) {
            if (andSet == j.f13545e) {
                return false;
            }
            return s(andSet);
        }
        int i11 = j.f13541a;
        for (int i12 = 0; i12 < i11; i12++) {
            if (kVar2.v().get(i10) == j.f13543c) {
                return true;
            }
        }
        return !com.google.android.gms.internal.measurement.a.a(kVar2.v(), i10, j.f13542b, j.f13544d);
    }

    protected final void f(n<? super g0> nVar) {
        while (i() <= 0) {
            t.d(nVar, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (g((c3) nVar)) {
                return;
            }
        }
        nVar.d0(g0.f27756a, this.f13538b);
    }

    public final int j() {
        return Math.max(f13536g.get(this), 0);
    }

    public final boolean r() {
        while (true) {
            int i10 = f13536g.get(this);
            if (i10 > this.f13537a) {
                h();
            } else {
                if (i10 <= 0) {
                    return false;
                }
                if (f13536g.compareAndSet(this, i10, i10 - 1)) {
                    return true;
                }
            }
        }
    }

    public final void q() {
        do {
            int andIncrement = f13536g.getAndIncrement(this);
            if (andIncrement < this.f13537a) {
                if (andIncrement >= 0) {
                    return;
                }
            } else {
                h();
                throw new IllegalStateException((VRfCTjjLv.pHlZDWDF + this.f13537a).toString());
            }
        } while (!t());
    }
}
