package androidx.work;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: Configuration.java */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Executor f3614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Executor f3615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final x f3616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final k f3617d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final s f3618e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final String f3619f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final int f3620g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final int f3621h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final int f3622i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final int f3623j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f3624k;

    /* JADX INFO: compiled from: Configuration.java */
    class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicInteger f3625a = new AtomicInteger(0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f3626b;

        a(boolean z10) {
            this.f3626b = z10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, (this.f3626b ? "WM.task-" : "androidx.work-") + this.f3625a.incrementAndGet());
        }
    }

    /* JADX INFO: renamed from: androidx.work.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Configuration.java */
    public static final class C0073b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Executor f3628a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        x f3629b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        k f3630c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Executor f3631d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        s f3632e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        String f3633f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f3634g = 4;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f3635h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f3636i = Integer.MAX_VALUE;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f3637j = 20;

        public b a() {
            return new b(this);
        }
    }

    /* JADX INFO: compiled from: Configuration.java */
    public interface c {
        b a();
    }

    b(C0073b c0073b) {
        Executor executor = c0073b.f3628a;
        if (executor == null) {
            this.f3614a = a(false);
        } else {
            this.f3614a = executor;
        }
        Executor executor2 = c0073b.f3631d;
        if (executor2 == null) {
            this.f3624k = true;
            this.f3615b = a(true);
        } else {
            this.f3624k = false;
            this.f3615b = executor2;
        }
        x xVar = c0073b.f3629b;
        if (xVar == null) {
            this.f3616c = x.c();
        } else {
            this.f3616c = xVar;
        }
        k kVar = c0073b.f3630c;
        if (kVar == null) {
            this.f3617d = k.c();
        } else {
            this.f3617d = kVar;
        }
        s sVar = c0073b.f3632e;
        if (sVar == null) {
            this.f3618e = new f1.a();
        } else {
            this.f3618e = sVar;
        }
        this.f3620g = c0073b.f3634g;
        this.f3621h = c0073b.f3635h;
        this.f3622i = c0073b.f3636i;
        this.f3623j = c0073b.f3637j;
        this.f3619f = c0073b.f3633f;
    }

    private Executor a(boolean z10) {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), b(z10));
    }

    private ThreadFactory b(boolean z10) {
        return new a(z10);
    }

    public String c() {
        return this.f3619f;
    }

    public i d() {
        return null;
    }

    public Executor e() {
        return this.f3614a;
    }

    public k f() {
        return this.f3617d;
    }

    public int g() {
        return this.f3622i;
    }

    public int h() {
        return this.f3623j;
    }

    public int i() {
        return this.f3621h;
    }

    public int j() {
        return this.f3620g;
    }

    public s k() {
        return this.f3618e;
    }

    public Executor l() {
        return this.f3615b;
    }

    public x m() {
        return this.f3616c;
    }
}
