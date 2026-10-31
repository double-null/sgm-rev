package zd;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import ud.g1;
import ud.u0;
import ud.x0;

/* JADX INFO: compiled from: LimitedDispatcher.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class l extends ud.k0 implements x0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f29204i = AtomicIntegerFieldUpdater.newUpdater(l.class, "runningWorkers$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ x0 f29205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ud.k0 f29206d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f29207e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f29208f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final q<Runnable> f29209g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Object f29210h;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX INFO: compiled from: LimitedDispatcher.kt */
    private final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Runnable f29211a;

        public a(Runnable runnable) {
            this.f29211a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i10 = 0;
            while (true) {
                try {
                    this.f29211a.run();
                } catch (Throwable th) {
                    ud.m0.a(zc.k.f29181a, th);
                }
                Runnable runnableT0 = l.this.t0();
                if (runnableT0 == null) {
                    return;
                }
                this.f29211a = runnableT0;
                i10++;
                if (i10 >= 16 && l.this.f29206d.n0(l.this)) {
                    l.this.f29206d.m0(l.this, this);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l(ud.k0 k0Var, int i10, String str) {
        x0 x0Var = k0Var instanceof x0 ? (x0) k0Var : null;
        this.f29205c = x0Var == null ? u0.a() : x0Var;
        this.f29206d = k0Var;
        this.f29207e = i10;
        this.f29208f = str;
        this.f29209g = new q<>(false);
        this.f29210h = new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Runnable t0() {
        while (true) {
            Runnable runnableE = this.f29209g.e();
            if (runnableE != null) {
                return runnableE;
            }
            synchronized (this.f29210h) {
                f29204i.decrementAndGet(this);
                if (this.f29209g.c() == 0) {
                    return null;
                }
                f29204i.incrementAndGet(this);
            }
        }
    }

    private final boolean u0() {
        synchronized (this.f29210h) {
            if (f29204i.get(this) >= this.f29207e) {
                return false;
            }
            f29204i.incrementAndGet(this);
            return true;
        }
    }

    @Override // ud.x0
    public g1 L(long j10, Runnable runnable, zc.j jVar) {
        return this.f29205c.L(j10, runnable, jVar);
    }

    @Override // ud.k0
    public void m0(zc.j jVar, Runnable runnable) {
        Runnable runnableT0;
        this.f29209g.a(runnable);
        if (f29204i.get(this) >= this.f29207e || !u0() || (runnableT0 = t0()) == null) {
            return;
        }
        this.f29206d.m0(this, new a(runnableT0));
    }

    @Override // ud.k0
    public ud.k0 o0(int i10, String str) {
        m.a(i10);
        return i10 >= this.f29207e ? m.b(this, str) : super.o0(i10, str);
    }

    @Override // ud.k0
    public String toString() {
        String str = this.f29208f;
        if (str != null) {
            return str;
        }
        return this.f29206d + ".limitedParallelism(" + this.f29207e + ')';
    }

    @Override // ud.x0
    public void u(long j10, ud.n<? super wc.g0> nVar) {
        this.f29205c.u(j10, nVar);
    }
}
