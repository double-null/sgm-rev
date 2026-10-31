package re;

import java.lang.ref.Reference;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import me.d0;
import wc.g0;

/* JADX INFO: compiled from: RealConnectionPool.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f25153f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f25154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f25155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final qe.d f25156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f25157d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ConcurrentLinkedQueue<f> f25158e;

    /* JADX INFO: compiled from: RealConnectionPool.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(k kVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: RealConnectionPool.kt */
    public static final class b extends qe.a {
        b(String str) {
            super(str, false, 2, null);
        }

        @Override // qe.a
        public long f() {
            return g.this.b(System.nanoTime());
        }
    }

    public g(qe.e taskRunner, int i10, long j10, TimeUnit timeUnit) {
        t.f(taskRunner, "taskRunner");
        t.f(timeUnit, "timeUnit");
        this.f25154a = i10;
        this.f25155b = timeUnit.toNanos(j10);
        this.f25156c = taskRunner.i();
        this.f25157d = new b(t.n(ne.d.f22999i, " ConnectionPool"));
        this.f25158e = new ConcurrentLinkedQueue<>();
        if (!(j10 > 0)) {
            throw new IllegalArgumentException(t.n("keepAliveDuration <= 0: ", Long.valueOf(j10)).toString());
        }
    }

    private final int d(f fVar, long j10) {
        if (ne.d.f22998h && !Thread.holdsLock(fVar)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + fVar);
        }
        List<Reference<e>> listN = fVar.n();
        int i10 = 0;
        while (i10 < listN.size()) {
            Reference<e> reference = listN.get(i10);
            if (reference.get() != null) {
                i10++;
            } else {
                we.h.f27895a.g().m("A connection to " + fVar.z().a().l() + " was leaked. Did you forget to close a response body?", ((e.b) reference).a());
                listN.remove(i10);
                fVar.C(true);
                if (listN.isEmpty()) {
                    fVar.B(j10 - this.f25155b);
                    return 0;
                }
            }
        }
        return listN.size();
    }

    public final boolean a(me.a address, e call, List<d0> list, boolean z10) {
        t.f(address, "address");
        t.f(call, "call");
        for (f connection : this.f25158e) {
            t.e(connection, "connection");
            synchronized (connection) {
                if (z10) {
                    if (!connection.v()) {
                    }
                    g0 g0Var = g0.f27756a;
                }
                if (connection.t(address, list)) {
                    call.d(connection);
                    return true;
                }
                g0 g0Var2 = g0.f27756a;
            }
        }
        return false;
    }

    public final long b(long j10) {
        int i10 = 0;
        long j11 = Long.MIN_VALUE;
        f fVar = null;
        int i11 = 0;
        for (f connection : this.f25158e) {
            t.e(connection, "connection");
            synchronized (connection) {
                if (d(connection, j10) > 0) {
                    i11++;
                } else {
                    i10++;
                    long jO = j10 - connection.o();
                    if (jO > j11) {
                        fVar = connection;
                        j11 = jO;
                    }
                    g0 g0Var = g0.f27756a;
                }
            }
        }
        long j12 = this.f25155b;
        if (j11 < j12 && i10 <= this.f25154a) {
            if (i10 > 0) {
                return j12 - j11;
            }
            if (i11 > 0) {
                return j12;
            }
            return -1L;
        }
        t.c(fVar);
        synchronized (fVar) {
            if (!fVar.n().isEmpty()) {
                return 0L;
            }
            if (fVar.o() + j11 != j10) {
                return 0L;
            }
            fVar.C(true);
            this.f25158e.remove(fVar);
            ne.d.n(fVar.D());
            if (this.f25158e.isEmpty()) {
                this.f25156c.a();
            }
            return 0L;
        }
    }

    public final boolean c(f connection) {
        t.f(connection, "connection");
        if (ne.d.f22998h && !Thread.holdsLock(connection)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + connection);
        }
        if (!connection.p() && this.f25154a != 0) {
            qe.d.j(this.f25156c, this.f25157d, 0L, 2, null);
            return false;
        }
        connection.C(true);
        this.f25158e.remove(connection);
        if (this.f25158e.isEmpty()) {
            this.f25156c.a();
        }
        return true;
    }

    public final void e(f connection) {
        t.f(connection, "connection");
        if (!ne.d.f22998h || Thread.holdsLock(connection)) {
            this.f25158e.add(connection);
            qe.d.j(this.f25156c, this.f25157d, 0L, 2, null);
            return;
        }
        throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + connection);
    }
}
