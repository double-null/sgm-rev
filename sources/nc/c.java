package nc;

import android.view.View;
import android.view.ViewTreeObserver;
import id.p;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import ud.e1;
import ud.e2;
import ud.o0;
import ud.p0;
import ud.t2;
import ud.y0;
import wb.i0;
import wc.g0;
import wc.s;

/* JADX INFO: compiled from: VisibilityTrackerImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class c implements nc.b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f22971k = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final nc.d f22972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bc.e f22973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f22974c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ViewTreeObserver.OnPreDrawListener f22975d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f22976e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f22977f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f22978g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Collection<lc.a> f22979h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final o0 f22980i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private WeakReference<View> f22981j;

    /* JADX INFO: compiled from: VisibilityTrackerImpl.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(k kVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: VisibilityTrackerImpl.kt */
    private final class b implements ViewTreeObserver.OnPreDrawListener {
        public b() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            c.this.m();
            return true;
        }
    }

    /* JADX INFO: renamed from: nc.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: VisibilityTrackerImpl.kt */
    @f(c = "io.bidmachine.util.visibilitytracking.VisibilityTrackerImpl$processOnPreDraw$1", f = "VisibilityTrackerImpl.kt", l = {141}, m = "invokeSuspend")
    static final class C0381c extends l implements p<o0, zc.f<? super g0>, Object> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f22983h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private /* synthetic */ Object f22984i;

        C0381c(zc.f<? super C0381c> fVar) {
            super(2, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f<g0> create(Object obj, zc.f<?> fVar) {
            C0381c c0381c = c.this.new C0381c(fVar);
            c0381c.f22984i = obj;
            return c0381c;
        }

        @Override // id.p
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, zc.f<? super g0> fVar) {
            return ((C0381c) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v10 */
        /* JADX WARN: Type inference failed for: r6v11 */
        /* JADX WARN: Type inference failed for: r6v6, types: [nc.c$c] */
        /* JADX WARN: Type inference failed for: r6v7 */
        /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object, wc.g0] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0047 -> B:16:0x004a). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            o0 o0Var;
            C0381c c0381c;
            Object objF = ad.d.f();
            int i10 = this.f22983h;
            try {
                if (i10 == 0) {
                    s.b(obj);
                    o0Var = (o0) this.f22984i;
                    c0381c = this;
                    if (c.this.f22976e.get() || !c.this.f22977f.get()) {
                        return g0.f27756a;
                    }
                    c0381c.f22984i = o0Var;
                    c0381c.f22983h = 1;
                    if (y0.a(100L, c0381c) == objF) {
                        c0381c = c0381c;
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o0Var = (o0) this.f22984i;
                    s.b(obj);
                    c0381c = this;
                }
            } catch (Throwable unused) {
            }
            c0381c = c0381c;
            c cVar = c.this;
            View viewJ = cVar.j();
            if (viewJ == null) {
                cVar.stop();
                c0381c = g0.f27756a;
                return c0381c;
            }
            if (cVar.i(viewJ)) {
                cVar.k();
            } else {
                cVar.l();
            }
            g0 g0Var = g0.f27756a;
            if (c.this.f22976e.get()) {
            }
            return g0.f27756a;
        }
    }

    /* JADX INFO: compiled from: VisibilityTrackerImpl.kt */
    static final class d extends u implements id.a<String> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ View f22986d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(View view) {
            super(0);
            this.f22986d = view;
        }

        @Override // id.a
        public final String invoke() {
            return "Start tracking - " + this.f22986d;
        }
    }

    /* JADX INFO: compiled from: VisibilityTrackerImpl.kt */
    static final class e extends u implements id.a<String> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ View f22987d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(View view) {
            super(0);
            this.f22987d = view;
        }

        @Override // id.a
        public final String invoke() {
            return "Stop tracking - " + this.f22987d;
        }
    }

    public c(nc.a visibilityParams, nc.d visibilityTrackerListener) {
        t.f(visibilityParams, "visibilityParams");
        t.f(visibilityTrackerListener, "visibilityTrackerListener");
        this.f22972a = visibilityTrackerListener;
        this.f22973b = new bc.e("VisibilityTracker", null, 2, null);
        this.f22974c = new Object();
        this.f22975d = new b();
        this.f22976e = new AtomicBoolean(false);
        this.f22977f = new AtomicBoolean(false);
        this.f22978g = new AtomicBoolean(false);
        this.f22980i = p0.a(t2.b(null, 1, null).z(e1.c().q0()));
        ArrayList arrayList = new ArrayList();
        Float fValueOf = Float.valueOf(1.0f);
        arrayList.add(new lc.b(true, fValueOf, fValueOf, fValueOf));
        if (!visibilityParams.d()) {
            arrayList.add(new lc.c(kotlin.collections.s.e(lc.c.b.HAS_WINDOW_FOCUS)));
        }
        arrayList.add(new lc.e(lc.e.b.PARENT_VIEW, visibilityParams.b()));
        if (!visibilityParams.c()) {
            arrayList.add(new lc.d(lc.d.b.VIEW_SIBLINGS, visibilityParams.b()));
        }
        this.f22979h = arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean i(View view) {
        Iterator<T> it = this.f22979h.iterator();
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

    /* JADX INFO: Access modifiers changed from: private */
    public final View j() {
        WeakReference<View> weakReference = this.f22981j;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k() {
        if (this.f22978g.compareAndSet(false, true)) {
            this.f22972a.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l() {
        if (this.f22978g.compareAndSet(true, false)) {
            this.f22972a.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m() {
        View viewJ = j();
        if (viewJ != null) {
            i0.r(viewJ, this.f22975d);
        }
        if (!this.f22976e.get() || this.f22977f.compareAndSet(false, true)) {
            n();
            ud.k.d(this.f22980i, e1.c().q0(), null, new C0381c(null), 2, null);
        }
    }

    private final void n() {
        e2.f(this.f22980i.q(), null, 1, null);
    }

    @Override // nc.b
    public void a(View view) {
        t.f(view, "view");
        if (this.f22976e.compareAndSet(false, true)) {
            synchronized (this.f22974c) {
                bc.c.e(this.f22973b, null, new d(view), 1, null);
                this.f22981j = new WeakReference<>(view);
                i0.b(view, this.f22975d);
                g0 g0Var = g0.f27756a;
            }
        }
    }

    @Override // nc.b
    public void destroy() {
        stop();
        WeakReference<View> weakReference = this.f22981j;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f22981j = null;
    }

    @Override // nc.b
    public void stop() {
        synchronized (this.f22974c) {
            this.f22976e.set(false);
            View viewJ = j();
            if (viewJ != null) {
                bc.c.e(this.f22973b, null, new e(viewJ), 1, null);
                i0.r(viewJ, this.f22975d);
            }
            n();
            this.f22977f.set(false);
            this.f22978g.set(false);
            g0 g0Var = g0.f27756a;
        }
    }
}
