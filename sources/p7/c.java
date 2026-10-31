package p7;

import android.content.Context;
import id.l;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import wc.g0;
import wc.r;
import wc.s;

/* JADX INFO: compiled from: StartupWatcherThread.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends Thread {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final d f23495i = new d(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f23496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final id.a<Long> f23497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l<Long, g0> f23498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final l<Context, p7.b> f23499d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile long f23500e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile int f23501f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile WeakReference<Context> f23502g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private p7.b f23503h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: compiled from: StartupWatcherThread.kt */
    public static final class a extends u implements id.a<Long> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f23504d = new a();

        a() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Long invoke() {
            return Long.valueOf(System.currentTimeMillis());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: compiled from: StartupWatcherThread.kt */
    public static final class b extends u implements l<Long, g0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f23505d = new b();

        b() {
            super(1);
        }

        public final void b(long j10) throws InterruptedException {
            Thread.sleep(j10);
        }

        @Override // id.l
        public /* bridge */ /* synthetic */ g0 invoke(Long l10) throws InterruptedException {
            b(l10.longValue());
            return g0.f27756a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: p7.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: StartupWatcherThread.kt */
    public static final class C0390c extends u implements l<Context, p7.b> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final C0390c f23506d = new C0390c();

        C0390c() {
            super(1);
        }

        @Override // id.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final p7.b invoke(Context it) {
            t.f(it, "it");
            return new p7.b(it);
        }
    }

    /* JADX INFO: compiled from: StartupWatcherThread.kt */
    public static final class d {
        private d() {
        }

        public /* synthetic */ d(k kVar) {
            this();
        }
    }

    public /* synthetic */ c(long j10, id.a aVar, l lVar, l lVar2, int i10, k kVar) {
        this(j10, (i10 & 2) != 0 ? a.f23504d : aVar, (i10 & 4) != 0 ? b.f23505d : lVar, (i10 & 8) != 0 ? C0390c.f23506d : lVar2);
    }

    private final String c() {
        long jLongValue = this.f23497b.invoke().longValue();
        return "bm:s:" + this.f23501f + ':' + this.f23496a + ':' + (this.f23500e < this.f23496a ? "" : String.valueOf(this.f23500e - this.f23496a)) + ':' + (jLongValue - this.f23496a);
    }

    private final p7.b d() {
        Context context;
        WeakReference<Context> weakReference = this.f23502g;
        if (weakReference == null || (context = weakReference.get()) == null) {
            return null;
        }
        p7.b bVar = this.f23503h;
        if (bVar != null) {
            return bVar;
        }
        p7.b bVarInvoke = this.f23499d.invoke(context);
        this.f23503h = bVarInvoke;
        return bVarInvoke;
    }

    private final void e(int i10) {
        if (i10 < this.f23501f) {
            return;
        }
        if (i10 != 2) {
            this.f23501f = i10;
            return;
        }
        this.f23500e = this.f23497b.invoke().longValue();
        this.f23501f = i10;
        try {
            interrupt();
            g0 g0Var = g0.f27756a;
        } catch (Throwable unused) {
        }
    }

    private final Object h() {
        try {
            r.a aVar = r.f27774b;
            p7.b bVarD = d();
            if (bVarD != null) {
                long jLongValue = this.f23500e;
                if (jLongValue == 0) {
                    jLongValue = this.f23497b.invoke().longValue();
                }
                long j10 = this.f23496a;
                bVarD.c(new p7.a(j10, jLongValue - j10, jLongValue != 0));
            }
            return r.c(g0.f27756a);
        } catch (Throwable th) {
            r.a aVar2 = r.f27774b;
            return r.c(s.a(th));
        }
    }

    private final void i() {
        try {
            setName(c());
        } catch (Throwable unused) {
        }
        h();
    }

    public final void a(Context context) {
        t.f(context, "context");
        this.f23502g = new WeakReference<>(context.getApplicationContext());
    }

    public final void f() {
        e(2);
    }

    public final void g() {
        e(1);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        while (this.f23501f < 2) {
            i();
            try {
                this.f23498c.invoke(200L);
            } catch (InterruptedException unused) {
                if (this.f23501f == 2) {
                    i();
                    this.f23498c.invoke(5000L);
                    g0 g0Var = g0.f27756a;
                }
            }
        }
        i();
        try {
            this.f23498c.invoke(5000L);
            g0 g0Var2 = g0.f27756a;
        } catch (Throwable unused2) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(long j10, id.a<Long> currentTimeProvider, l<? super Long, g0> sleeper, l<? super Context, p7.b> storageFactory) {
        super("bm:s:0:" + j10);
        t.f(currentTimeProvider, "currentTimeProvider");
        t.f(sleeper, "sleeper");
        t.f(storageFactory, "storageFactory");
        this.f23496a = j10;
        this.f23497b = currentTimeProvider;
        this.f23498c = sleeper;
        this.f23499d = storageFactory;
    }
}
