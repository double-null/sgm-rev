package mb;

import android.content.Context;
import android.widget.FrameLayout;
import bb.t;
import bb.u;
import bb.v;
import pb.a1;
import pb.b0;
import wb.g0;
import wb.y;

/* JADX INFO: loaded from: classes5.dex */
public final class l extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y f22246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t f22247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f22248c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private c f22249d;

    private final class a implements u {
        public a() {
        }

        @Override // bb.u
        public void k(t adPhaseController, b0 error) {
            kotlin.jvm.internal.t.f(adPhaseController, "adPhaseController");
            kotlin.jvm.internal.t.f(error, "error");
            pa.t.b(l.this.f22246a, "onAdPhaseFailToLoad (%s) - %s", adPhaseController, error);
            adPhaseController.destroy();
        }

        @Override // bb.u
        public void l(t adPhaseController) {
            kotlin.jvm.internal.t.f(adPhaseController, "adPhaseController");
            pa.t.g(l.this.f22246a, "onAdPhaseLoaded (%s)", adPhaseController);
            l lVar = l.this;
            if (adPhaseController.f(lVar, lVar)) {
                adPhaseController.c(l.this.new b());
                l.this.p();
            }
        }
    }

    public interface c {
        void a();

        void b();

        void i(pb.t tVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Context context, pb.d dVar, ab.c adAnimationController) {
        super(context);
        kotlin.jvm.internal.t.f(context, "context");
        kotlin.jvm.internal.t.f(adAnimationController, "adAnimationController");
        y yVar = new y("PlaceholderView");
        this.f22246a = yVar;
        dVar = dVar == null ? pa.i.b() : dVar;
        y yVar2 = new y("PlaceholderViewAdPhaseController");
        this.f22247b = new bb.b0(context, dVar, yVar, yVar2, new lb.c(yVar2.toString(), pa.h.f23769i.a()), new a(), adAnimationController);
        f fVar = new f(context);
        this.f22248c = fVar;
        addView(fVar, g0.c());
        fVar.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(final pb.t tVar) {
        pa.t.g(this.f22246a, "notifyBrokenCreativeEvent", new Object[0]);
        qb.h.d(new Runnable() { // from class: mb.j
            @Override // java.lang.Runnable
            public final void run() {
                l.k(this.f22243a, tVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(l this$0, pb.t brokenCreativeEvent) {
        kotlin.jvm.internal.t.f(this$0, "this$0");
        kotlin.jvm.internal.t.f(brokenCreativeEvent, "$brokenCreativeEvent");
        c cVar = this$0.f22249d;
        if (cVar != null) {
            cVar.i(brokenCreativeEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(l this$0) {
        kotlin.jvm.internal.t.f(this$0, "this$0");
        this$0.removeAllViews();
    }

    private final void n() {
        pa.t.g(this.f22246a, "notifyPlaceholderClosed", new Object[0]);
        qb.h.d(new Runnable() { // from class: mb.h
            @Override // java.lang.Runnable
            public final void run() {
                l.o(this.f22241a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(l this$0) {
        kotlin.jvm.internal.t.f(this$0, "this$0");
        c cVar = this$0.f22249d;
        if (cVar != null) {
            cVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(l this$0) {
        kotlin.jvm.internal.t.f(this$0, "this$0");
        c cVar = this$0.f22249d;
        if (cVar != null) {
            cVar.b();
        }
    }

    public final void f() {
        n();
    }

    public final c getListener() {
        return this.f22249d;
    }

    public final void j() {
        this.f22249d = null;
        this.f22247b.destroy();
        qb.h.d(new Runnable() { // from class: mb.k
            @Override // java.lang.Runnable
            public final void run() {
                l.m(this.f22245a);
            }
        });
    }

    public final void l() {
        pa.t.g(this.f22246a, "load", new Object[0]);
        this.f22247b.b();
    }

    public final void p() {
        pa.t.g(this.f22246a, "notifyPlaceholderLoaded", new Object[0]);
        qb.h.d(new Runnable() { // from class: mb.i
            @Override // java.lang.Runnable
            public final void run() {
                l.q(this.f22242a);
            }
        });
    }

    public final void r() {
        this.f22247b.a(true);
        this.f22247b.a(false);
    }

    public final void s() {
        this.f22247b.b(true);
    }

    public final void setListener(c cVar) {
        this.f22249d = cVar;
    }

    public final void t() {
        this.f22247b.c();
    }

    private final class b implements v {
        public b() {
        }

        @Override // bb.v
        public void a() {
            l.this.f();
        }

        @Override // bb.v
        public void d() {
            l.this.f22248c.j();
        }

        @Override // bb.v
        public void e() {
            l.this.f();
        }

        @Override // bb.v
        public void f() {
            l.this.f22248c.d();
        }

        @Override // bb.v
        public void i(pb.t brokenCreativeEvent) {
            kotlin.jvm.internal.t.f(brokenCreativeEvent, "brokenCreativeEvent");
            l.this.h(brokenCreativeEvent);
        }

        @Override // bb.v
        public void j(a1 privacySheetParams) {
            kotlin.jvm.internal.t.f(privacySheetParams, "privacySheetParams");
        }

        @Override // bb.v
        public void b() {
        }

        @Override // bb.v
        public void c() {
        }

        @Override // bb.v
        public void g() {
        }
    }
}
