package zd;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: LockFreeTaskQueue.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class r<E> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f29228e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f29229f = AtomicReferenceFieldUpdater.newUpdater(r.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f29230g = AtomicLongFieldUpdater.newUpdater(r.class, "_state$volatile");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final e0 f29231h = new e0("REMOVE_FROZEN");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f29232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f29233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f29234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final /* synthetic */ AtomicReferenceArray f29235d;

    /* JADX INFO: compiled from: LockFreeTaskQueue.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final int a(long j10) {
            return (j10 & 2305843009213693952L) != 0 ? 2 : 1;
        }

        public final long b(long j10, int i10) {
            return d(j10, 1073741823L) | (((long) i10) << 0);
        }

        public final long c(long j10, int i10) {
            return d(j10, 1152921503533105152L) | (((long) i10) << 30);
        }

        public final long d(long j10, long j11) {
            return j10 & (~j11);
        }
    }

    /* JADX INFO: compiled from: LockFreeTaskQueue.kt */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f29236a;

        public b(int i10) {
            this.f29236a = i10;
        }
    }

    public r(int i10, boolean z10) {
        this.f29232a = i10;
        this.f29233b = z10;
        int i11 = i10 - 1;
        this.f29234c = i11;
        this.f29235d = new AtomicReferenceArray(i10);
        if (!(i11 <= 1073741823)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!((i10 & i11) == 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final r<E> b(long j10) {
        r<E> rVar = new r<>(this.f29232a * 2, this.f29233b);
        int i10 = (int) ((1073741823 & j10) >> 0);
        int i11 = (int) ((1152921503533105152L & j10) >> 30);
        while (true) {
            int i12 = this.f29234c;
            if ((i10 & i12) == (i12 & i11)) {
                f29230g.set(rVar, f29228e.d(j10, 1152921504606846976L));
                return rVar;
            }
            Object bVar = f().get(this.f29234c & i10);
            if (bVar == null) {
                bVar = new b(i10);
            }
            rVar.f().set(rVar.f29234c & i10, bVar);
            i10++;
        }
    }

    private final r<E> c(long j10) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29229f;
        while (true) {
            r<E> rVar = (r) atomicReferenceFieldUpdater.get(this);
            if (rVar != null) {
                return rVar;
            }
            androidx.concurrent.futures.b.a(f29229f, this, null, b(j10));
        }
    }

    private final r<E> e(int i10, E e10) {
        Object obj = f().get(this.f29234c & i10);
        if (!(obj instanceof b) || ((b) obj).f29236a != i10) {
            return null;
        }
        f().set(i10 & this.f29234c, e10);
        return this;
    }

    private final /* synthetic */ AtomicReferenceArray f() {
        return this.f29235d;
    }

    private final long k() {
        long j10;
        long j11;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f29230g;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            if ((j10 & 1152921504606846976L) != 0) {
                return j10;
            }
            j11 = j10 | 1152921504606846976L;
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, j11));
        return j11;
    }

    private final r<E> n(int i10, int i11) {
        long j10;
        int i12;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f29230g;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            i12 = (int) ((1073741823 & j10) >> 0);
            if ((1152921504606846976L & j10) != 0) {
                return l();
            }
        } while (!f29230g.compareAndSet(this, j10, f29228e.b(j10, i11)));
        f().set(this.f29234c & i12, null);
        return null;
    }

    public final int a(E e10) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f29230g;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j10) != 0) {
                return f29228e.a(j10);
            }
            int i10 = (int) ((1073741823 & j10) >> 0);
            int i11 = (int) ((1152921503533105152L & j10) >> 30);
            int i12 = this.f29234c;
            if (((i11 + 2) & i12) == (i10 & i12)) {
                return 1;
            }
            if (!this.f29233b && f().get(i11 & i12) != null) {
                int i13 = this.f29232a;
                if (i13 < 1024 || ((i11 - i10) & 1073741823) > (i13 >> 1)) {
                    return 1;
                }
            } else if (f29230g.compareAndSet(this, j10, f29228e.c(j10, (i11 + 1) & 1073741823))) {
                f().set(i11 & i12, e10);
                r<E> rVarE = this;
                while ((f29230g.get(rVarE) & 1152921504606846976L) != 0 && (rVarE = rVarE.l().e(i11, e10)) != null) {
                }
                return 0;
            }
        }
    }

    public final boolean d() {
        long j10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f29230g;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            if ((j10 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j10) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, j10 | 2305843009213693952L));
        return true;
    }

    public final int g() {
        long j10 = f29230g.get(this);
        return (((int) ((j10 & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j10) >> 0))) & 1073741823;
    }

    public final boolean j() {
        long j10 = f29230g.get(this);
        return ((int) ((1073741823 & j10) >> 0)) == ((int) ((j10 & 1152921503533105152L) >> 30));
    }

    public final r<E> l() {
        return c(k());
    }

    public final Object m() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f29230g;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            if ((1152921504606846976L & j10) != 0) {
                return f29231h;
            }
            int i10 = (int) ((1073741823 & j10) >> 0);
            int i11 = this.f29234c;
            if ((((int) ((1152921503533105152L & j10) >> 30)) & i11) == (i11 & i10)) {
                return null;
            }
            Object obj = f().get(this.f29234c & i10);
            if (obj == null) {
                if (this.f29233b) {
                    return null;
                }
            } else {
                if (obj instanceof b) {
                    return null;
                }
                int i12 = (i10 + 1) & 1073741823;
                if (f29230g.compareAndSet(this, j10, f29228e.b(j10, i12))) {
                    f().set(this.f29234c & i10, null);
                    return obj;
                }
                if (this.f29233b) {
                    r<E> rVarN = this;
                    do {
                        rVarN = rVarN.n(i10, i12);
                    } while (rVarN != null);
                    return obj;
                }
            }
        }
    }
}
