package jc;

import android.view.View;
import android.view.ViewTreeObserver;
import bc.e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import wb.h;
import wb.i0;
import wc.g0;

/* JADX INFO: compiled from: ViewabilityTrackerImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class b implements jc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final jc.c f20850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f20851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f20852c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<kc.a> f20853d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ViewTreeObserver.OnPreDrawListener f20854e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f20855f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f20856g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List<kc.a> f20857h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile boolean f20858i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private WeakReference<View> f20859j;

    /* JADX INFO: compiled from: ViewabilityTrackerImpl.kt */
    private final class a implements kc.c {
        public a() {
        }

        @Override // kc.c
        public void a(kc.a viewabilityChecker, mc.a actionEvent) {
            t.f(viewabilityChecker, "viewabilityChecker");
            t.f(actionEvent, "actionEvent");
            b.this.g(viewabilityChecker, actionEvent);
        }

        @Override // kc.c
        public void b(kc.a viewabilityChecker, mc.a actionEvent, h error) {
            t.f(viewabilityChecker, "viewabilityChecker");
            t.f(actionEvent, "actionEvent");
            t.f(error, "error");
            b.this.f(viewabilityChecker, actionEvent, error);
        }
    }

    /* JADX INFO: renamed from: jc.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ViewabilityTrackerImpl.kt */
    private final class ViewTreeObserverOnPreDrawListenerC0343b implements ViewTreeObserver.OnPreDrawListener {
        public ViewTreeObserverOnPreDrawListenerC0343b() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            b.this.h(0L);
            return true;
        }
    }

    /* JADX INFO: compiled from: ViewabilityTrackerImpl.kt */
    static final class c extends u implements id.a<String> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ View f20862d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(View view) {
            super(0);
            this.f20862d = view;
        }

        @Override // id.a
        public final String invoke() {
            return "Start tracking - " + this.f20862d;
        }
    }

    /* JADX INFO: compiled from: ViewabilityTrackerImpl.kt */
    static final class d extends u implements id.a<String> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ View f20863d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(View view) {
            super(0);
            this.f20863d = view;
        }

        @Override // id.a
        public final String invoke() {
            return "Stop tracking - " + this.f20863d;
        }
    }

    public b(mc.d viewabilityTrackerParams, jc.c viewabilityTrackerListener) {
        t.f(viewabilityTrackerParams, "viewabilityTrackerParams");
        t.f(viewabilityTrackerListener, "viewabilityTrackerListener");
        this.f20850a = viewabilityTrackerListener;
        this.f20851b = new e("ViewabilityTracker", null, 2, null);
        this.f20852c = new Object();
        List<mc.c> listA = viewabilityTrackerParams.a();
        ArrayList arrayList = new ArrayList(kotlin.collections.u.u(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(new kc.b((mc.c) it.next(), new a()));
        }
        this.f20853d = arrayList;
        this.f20854e = new ViewTreeObserverOnPreDrawListenerC0343b();
        this.f20855f = new AtomicBoolean(false);
        this.f20856g = new AtomicBoolean(false);
        this.f20857h = new CopyOnWriteArrayList(arrayList);
    }

    private final View e() {
        WeakReference<View> weakReference = this.f20859j;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(kc.a aVar, mc.a aVar2, h hVar) {
        if (this.f20857h.contains(aVar)) {
            this.f20850a.a(aVar2, hVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(kc.a aVar, mc.a aVar2) {
        if (this.f20857h.contains(aVar)) {
            if (aVar2.b()) {
                this.f20858i = true;
            }
            this.f20857h.remove(aVar);
            this.f20850a.b(aVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(long j10) {
        if (this.f20856g.compareAndSet(false, true)) {
            View viewE = e();
            if (viewE == null) {
                stop();
                return;
            }
            Iterator<T> it = this.f20857h.iterator();
            while (it.hasNext()) {
                ((kc.a) it.next()).a(viewE, j10);
            }
        }
    }

    @Override // jc.a
    public void a(View view) {
        t.f(view, "view");
        if (!this.f20857h.isEmpty() && this.f20855f.compareAndSet(false, true)) {
            synchronized (this.f20852c) {
                bc.c.e(this.f20851b, null, new c(view), 1, null);
                this.f20859j = new WeakReference<>(view);
                i0.b(view, this.f20854e);
                g0 g0Var = g0.f27756a;
            }
        }
    }

    @Override // jc.a
    public void destroy() {
        stop();
        WeakReference<View> weakReference = this.f20859j;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f20859j = null;
        Iterator<T> it = this.f20853d.iterator();
        while (it.hasNext()) {
            ((kc.a) it.next()).destroy();
        }
    }

    @Override // jc.a
    public void stop() {
        synchronized (this.f20852c) {
            this.f20855f.set(false);
            View viewE = e();
            if (viewE != null) {
                bc.c.e(this.f20851b, null, new d(viewE), 1, null);
                i0.r(viewE, this.f20854e);
            }
            Iterator<T> it = this.f20853d.iterator();
            while (it.hasNext()) {
                ((kc.a) it.next()).stop();
            }
            this.f20856g.set(false);
            g0 g0Var = g0.f27756a;
        }
    }
}
