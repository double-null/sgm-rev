package m;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: ArchTaskExecutor.java */
/* JADX INFO: loaded from: classes.dex */
public class c extends f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile c f22028c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Executor f22029d = new Executor() { // from class: m.a
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            c.h(runnable);
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Executor f22030e = new Executor() { // from class: m.b
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            c.i(runnable);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private f f22031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f f22032b;

    private c() {
        d dVar = new d();
        this.f22032b = dVar;
        this.f22031a = dVar;
    }

    public static Executor f() {
        return f22030e;
    }

    public static c g() {
        if (f22028c != null) {
            return f22028c;
        }
        synchronized (c.class) {
            if (f22028c == null) {
                f22028c = new c();
            }
        }
        return f22028c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(Runnable runnable) {
        g().c(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void i(Runnable runnable) {
        g().a(runnable);
    }

    @Override // m.f
    public void a(Runnable runnable) {
        this.f22031a.a(runnable);
    }

    @Override // m.f
    public boolean b() {
        return this.f22031a.b();
    }

    @Override // m.f
    public void c(Runnable runnable) {
        this.f22031a.c(runnable);
    }
}
