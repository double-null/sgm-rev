package kc;

import ad.d;
import android.view.View;
import bc.e;
import id.p;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import ud.e1;
import ud.e2;
import ud.k;
import ud.o0;
import ud.p0;
import ud.t2;
import ud.y0;
import wb.h;
import wc.g0;
import wc.s;

/* JADX INFO: compiled from: ViewabilityCheckerImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class b implements kc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final mc.c f21302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final kc.c f21303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e f21304c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f21305d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f21306e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicInteger f21307f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final o0 f21308g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private WeakReference<View> f21309h;

    /* JADX INFO: compiled from: ViewabilityCheckerImpl.kt */
    @f(c = "io.bidmachine.util.viewabilitytracker.checker.ViewabilityCheckerImpl$scheduleCheck$1", f = "ViewabilityCheckerImpl.kt", l = {100}, m = "invokeSuspend")
    static final class a extends l implements p<o0, zc.f<? super g0>, Object> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f21310h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ long f21311i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ b f21312j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j10, b bVar, zc.f<? super a> fVar) {
            super(2, fVar);
            this.f21311i = j10;
            this.f21312j = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f<g0> create(Object obj, zc.f<?> fVar) {
            return new a(this.f21311i, this.f21312j, fVar);
        }

        @Override // id.p
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, zc.f<? super g0> fVar) {
            return ((a) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = d.f();
            int i10 = this.f21310h;
            if (i10 == 0) {
                s.b(obj);
                long j10 = this.f21311i;
                if (j10 > 0) {
                    this.f21310h = 1;
                    if (y0.a(j10, this) == objF) {
                        return objF;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            try {
                View viewF = this.f21312j.f();
                if (viewF == null) {
                    this.f21312j.m();
                    return g0.f27756a;
                }
                if (this.f21312j.d(viewF)) {
                    mc.b bVarC = this.f21312j.f21302a.c();
                    if (this.f21312j.e().incrementAndGet() >= bVarC.a()) {
                        this.f21312j.h();
                    } else {
                        long jC = bVarC.c();
                        if (jC > 0) {
                            this.f21312j.k(jC);
                        } else {
                            h hVar = new h("Can't schedule check - intervalMs must be greater than 0");
                            bc.c.a(this.f21312j.f21304c, null, hVar, 1, null);
                            this.f21312j.g(hVar);
                        }
                    }
                } else {
                    this.f21312j.i();
                }
                return g0.f27756a;
            } catch (Throwable unused) {
                this.f21312j.i();
            }
        }
    }

    /* JADX INFO: renamed from: kc.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ViewabilityCheckerImpl.kt */
    static final class C0347b extends u implements id.a<String> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ View f21313d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0347b(View view) {
            super(0);
            this.f21313d = view;
        }

        @Override // id.a
        public final String invoke() {
            return "Start tracking - " + this.f21313d;
        }
    }

    /* JADX INFO: compiled from: ViewabilityCheckerImpl.kt */
    static final class c extends u implements id.a<String> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ View f21314d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(View view) {
            super(0);
            this.f21314d = view;
        }

        @Override // id.a
        public final String invoke() {
            return "Stop tracking - " + this.f21314d;
        }
    }

    public b(mc.c viewabilityRule, kc.c viewabilityCheckerListener) {
        t.f(viewabilityRule, "viewabilityRule");
        t.f(viewabilityCheckerListener, "viewabilityCheckerListener");
        this.f21302a = viewabilityRule;
        this.f21303b = viewabilityCheckerListener;
        this.f21304c = new e("ViewabilityChecker", null, 2, null);
        this.f21305d = new Object();
        this.f21306e = new AtomicBoolean(false);
        this.f21307f = new AtomicInteger(0);
        this.f21308g = p0.a(t2.b(null, 1, null).z(e1.c().q0()));
    }

    @Override // kc.a
    public void a(View view, long j10) {
        t.f(view, "view");
        if (this.f21306e.compareAndSet(false, true)) {
            synchronized (this.f21305d) {
                bc.c.e(this.f21304c, null, new C0347b(view), 1, null);
                this.f21309h = new WeakReference<>(view);
                l(j10);
                g0 g0Var = g0.f27756a;
            }
        }
    }

    public final boolean d(View view) {
        t.f(view, "view");
        Iterator<T> it = this.f21302a.b().iterator();
        while (it.hasNext()) {
            try {
                if (!((lc.a) it.next()).a(view)) {
                    return false;
                }
                g0 g0Var = g0.f27756a;
            } catch (Throwable unused) {
            }
        }
        return true;
    }

    @Override // kc.a
    public void destroy() {
        stop();
        WeakReference<View> weakReference = this.f21309h;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f21309h = null;
    }

    public final AtomicInteger e() {
        return this.f21307f;
    }

    public final View f() {
        WeakReference<View> weakReference = this.f21309h;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final void g(h error) {
        t.f(error, "error");
        this.f21303b.b(this, this.f21302a.a(), error);
    }

    public final void h() {
        this.f21303b.a(this, this.f21302a.a());
    }

    public final void i() {
        Long lB = this.f21302a.c().b();
        if (lB != null && lB.longValue() > 0) {
            l(lB.longValue());
            return;
        }
        h hVar = new h("Can't restart check - failureTimeoutMs must be greater than 0");
        bc.c.a(this.f21304c, null, hVar, 1, null);
        g(hVar);
    }

    public final void j() {
        this.f21307f.set(0);
    }

    public final void k(long j10) {
        m();
        k.d(this.f21308g, e1.c().q0(), null, new a(j10, this, null), 2, null);
    }

    public final void l(long j10) {
        j();
        k(j10);
    }

    public final void m() {
        e2.f(this.f21308g.q(), null, 1, null);
    }

    @Override // kc.a
    public void stop() {
        synchronized (this.f21305d) {
            this.f21306e.set(false);
            View viewF = f();
            if (viewF != null) {
                bc.c.e(this.f21304c, null, new c(viewF), 1, null);
            }
            m();
            g0 g0Var = g0.f27756a;
        }
    }
}
