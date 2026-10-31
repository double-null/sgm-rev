package be;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.h0;

/* JADX INFO: compiled from: WorkQueue.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f4503b = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "lastScheduledTask$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f4504c = AtomicIntegerFieldUpdater.newUpdater(l.class, "producerIndex$volatile");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f4505d = AtomicIntegerFieldUpdater.newUpdater(l.class, "consumerIndex$volatile");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f4506e = AtomicIntegerFieldUpdater.newUpdater(l.class, "blockingTasksInBuffer$volatile");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReferenceArray<h> f4507a = new AtomicReferenceArray<>(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    private final h b(h hVar) {
        if (e() == 127) {
            return hVar;
        }
        if (hVar.f4494b) {
            f4506e.incrementAndGet(this);
        }
        int i10 = f4504c.get(this) & 127;
        while (this.f4507a.get(i10) != null) {
            Thread.yield();
        }
        this.f4507a.lazySet(i10, hVar);
        f4504c.incrementAndGet(this);
        return null;
    }

    private final void c(h hVar) {
        if (hVar == null || !hVar.f4494b) {
            return;
        }
        f4506e.decrementAndGet(this);
    }

    private final int e() {
        return f4504c.get(this) - f4505d.get(this);
    }

    private final h m() {
        h andSet;
        while (true) {
            int i10 = f4505d.get(this);
            if (i10 - f4504c.get(this) == 0) {
                return null;
            }
            int i11 = i10 & 127;
            if (f4505d.compareAndSet(this, i10, i10 + 1) && (andSet = this.f4507a.getAndSet(i11, null)) != null) {
                c(andSet);
                return andSet;
            }
        }
    }

    private final boolean n(d dVar) {
        h hVarM = m();
        if (hVarM == null) {
            return false;
        }
        dVar.a(hVarM);
        return true;
    }

    private final h o(boolean z10) {
        h hVar;
        do {
            hVar = (h) f4503b.get(this);
            if (hVar == null || hVar.f4494b != z10) {
                int i10 = f4505d.get(this);
                int i11 = f4504c.get(this);
                while (i10 != i11) {
                    if (z10 && f4506e.get(this) == 0) {
                        return null;
                    }
                    i11--;
                    h hVarQ = q(i11, z10);
                    if (hVarQ != null) {
                        return hVarQ;
                    }
                }
                return null;
            }
        } while (!androidx.concurrent.futures.b.a(f4503b, this, hVar, null));
        return hVar;
    }

    private final h p(int i10) {
        int i11 = f4505d.get(this);
        int i12 = f4504c.get(this);
        boolean z10 = i10 == 1;
        while (i11 != i12) {
            if (z10 && f4506e.get(this) == 0) {
                return null;
            }
            int i13 = i11 + 1;
            h hVarQ = q(i11, z10);
            if (hVarQ != null) {
                return hVarQ;
            }
            i11 = i13;
        }
        return null;
    }

    private final h q(int i10, boolean z10) {
        int i11 = i10 & 127;
        h hVar = this.f4507a.get(i11);
        if (hVar == null || hVar.f4494b != z10 || !com.google.android.gms.internal.measurement.a.a(this.f4507a, i11, hVar, null)) {
            return null;
        }
        if (z10) {
            f4506e.decrementAndGet(this);
        }
        return hVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, be.h, java.lang.Object] */
    private final long s(int i10, h0<h> h0Var) {
        ?? r10;
        do {
            r10 = (h) f4503b.get(this);
            if (r10 == 0) {
                return -2L;
            }
            if (((r10.f4494b ? 1 : 2) & i10) == 0) {
                return -2L;
            }
            long jA = j.f4501f.a() - r10.f4493a;
            long j10 = j.f4497b;
            if (jA < j10) {
                return j10 - jA;
            }
        } while (!androidx.concurrent.futures.b.a(f4503b, this, r10, null));
        h0Var.f21514a = r10;
        return -1L;
    }

    public final h a(h hVar, boolean z10) {
        if (z10) {
            return b(hVar);
        }
        h hVar2 = (h) f4503b.getAndSet(this, hVar);
        if (hVar2 == null) {
            return null;
        }
        return b(hVar2);
    }

    public final int i() {
        return f4503b.get(this) != null ? e() + 1 : e();
    }

    public final void j(d dVar) {
        h hVar = (h) f4503b.getAndSet(this, null);
        if (hVar != null) {
            dVar.a(hVar);
        }
        while (n(dVar)) {
        }
    }

    public final h k() {
        h hVar = (h) f4503b.getAndSet(this, null);
        return hVar == null ? m() : hVar;
    }

    public final h l() {
        return o(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long r(int i10, h0<h> h0Var) {
        h hVarP;
        T t10;
        h hVarM;
        if (i10 == 3) {
            hVarM = m();
        } else {
            hVarP = p(i10);
        }
        if (t10 == 0) {
            t10 = hVarP;
            t10 = hVarM;
            return s(i10, h0Var);
        }
        t10 = hVarP;
        t10 = hVarM;
        h0Var.f21514a = t10;
        return -1L;
    }
}
