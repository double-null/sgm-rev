package na;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import oa.s;
import oa.t;
import pb.a1;
import pb.b0;
import wb.a0;

/* JADX INFO: loaded from: classes5.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lb.a f22940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s f22941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private o f22942c;

    private final class a implements t {
        public a() {
        }

        @Override // ma.a
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public void e(s adView) {
            kotlin.jvm.internal.t.f(adView, "adView");
            n.this.G();
        }

        @Override // ma.a
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public void d(s adView) {
            kotlin.jvm.internal.t.f(adView, "adView");
            n.this.J();
        }

        @Override // ma.a
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public void c(s adView) {
            kotlin.jvm.internal.t.f(adView, "adView");
            n.this.L();
        }

        @Override // ma.a
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void b(s adView) {
            kotlin.jvm.internal.t.f(adView, "adView");
            n.this.O();
        }

        @Override // ma.a
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void k(s adView, b0 error) {
            kotlin.jvm.internal.t.f(adView, "adView");
            kotlin.jvm.internal.t.f(error, "error");
            n.this.u(error);
        }

        @Override // ma.a
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public void j(s adView, b0 error) {
            kotlin.jvm.internal.t.f(adView, "adView");
            kotlin.jvm.internal.t.f(error, "error");
            n.this.Z(error);
        }

        @Override // ma.a
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void g(s adView) {
            kotlin.jvm.internal.t.f(adView, "adView");
            n.this.a0();
        }

        @Override // ma.a
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void f(s adView) {
            kotlin.jvm.internal.t.f(adView, "adView");
            n.this.S();
        }

        @Override // ma.a
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public void a(s adView) {
            kotlin.jvm.internal.t.f(adView, "adView");
            n.this.U();
        }

        @Override // ma.a
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public void l(s adView, pb.t brokenCreativeEvent) {
            kotlin.jvm.internal.t.f(adView, "adView");
            kotlin.jvm.internal.t.f(brokenCreativeEvent, "brokenCreativeEvent");
            n.this.t(brokenCreativeEvent);
        }

        @Override // ma.a
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public void h(s adView, a1 privacySheetParams) {
            kotlin.jvm.internal.t.f(adView, "adView");
            kotlin.jvm.internal.t.f(privacySheetParams, "privacySheetParams");
            n.this.v(privacySheetParams);
        }

        @Override // ma.a
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public void i(s adView, mc.a actionEvent, wb.h hVar) {
            kotlin.jvm.internal.t.f(adView, "adView");
            kotlin.jvm.internal.t.f(actionEvent, "actionEvent");
            n.this.n(actionEvent, hVar);
        }
    }

    public n(Context context, pb.c adParams) {
        kotlin.jvm.internal.t.f(context, "context");
        kotlin.jvm.internal.t.f(adParams, "adParams");
        this.f22940a = new lb.d("FullScreenAd");
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.t.e(applicationContext, "context.applicationContext");
        this.f22941b = new s(applicationContext, adParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G() {
        if (this.f22940a.b(true)) {
            a0.c(new pa.s() { // from class: na.l
                @Override // wb.v
                public final void p() {
                    n.o(this.f22936a);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(n this$0) {
        kotlin.jvm.internal.t.f(this$0, "this$0");
        o oVar = this$0.f22942c;
        if (oVar != null) {
            oVar.d(this$0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(n this$0, b0 error) {
        kotlin.jvm.internal.t.f(this$0, "this$0");
        kotlin.jvm.internal.t.f(error, "$error");
        o oVar = this$0.f22942c;
        if (oVar != null) {
            oVar.j(this$0, error);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J() {
        this.f22940a.e();
        a0.c(new pa.s() { // from class: na.c
            @Override // wb.v
            public final void p() {
                n.H(this.f22924a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(n this$0) {
        kotlin.jvm.internal.t.f(this$0, "this$0");
        o oVar = this$0.f22942c;
        if (oVar != null) {
            oVar.c(this$0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L() {
        if (this.f22940a.b(false)) {
            a0.c(new pa.s() { // from class: na.f
                @Override // wb.v
                public final void p() {
                    n.K(this.f22927a);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(n this$0) {
        kotlin.jvm.internal.t.f(this$0, "this$0");
        o oVar = this$0.f22942c;
        if (oVar != null) {
            oVar.b(this$0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O() {
        if (this.f22940a.r()) {
            a0.c(new pa.s() { // from class: na.i
                @Override // wb.v
                public final void p() {
                    n.M(this.f22931a);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P(n this$0) {
        kotlin.jvm.internal.t.f(this$0, "this$0");
        o oVar = this$0.f22942c;
        if (oVar != null) {
            oVar.g(this$0);
        }
    }

    private final void Q() {
        if (this.f22940a.m()) {
            a0.c(new pa.s() { // from class: na.e
                @Override // wb.v
                public final void p() {
                    n.P(this.f22926a);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R(n this$0) {
        kotlin.jvm.internal.t.f(this$0, "this$0");
        o oVar = this$0.f22942c;
        if (oVar != null) {
            oVar.f(this$0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S() {
        if (this.f22940a.a(true)) {
            a0.c(new pa.s() { // from class: na.g
                @Override // wb.v
                public final void p() {
                    n.R(this.f22928a);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T(n this$0) {
        kotlin.jvm.internal.t.f(this$0, "this$0");
        o oVar = this$0.f22942c;
        if (oVar != null) {
            oVar.a(this$0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U() {
        if (this.f22940a.j()) {
            a0.c(new pa.s() { // from class: na.d
                @Override // wb.v
                public final void p() {
                    n.T(this.f22925a);
                }
            });
        }
    }

    private final void m() {
        this.f22941b.t0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(final mc.a aVar, final wb.h hVar) {
        if (this.f22940a.i()) {
            return;
        }
        a0.c(new Runnable() { // from class: na.m
            @Override // java.lang.Runnable
            public final void run() {
                n.p(this.f22937a, aVar, hVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(n this$0) {
        kotlin.jvm.internal.t.f(this$0, "this$0");
        o oVar = this$0.f22942c;
        if (oVar != null) {
            oVar.e(this$0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(n this$0, mc.a actionEvent, wb.h hVar) {
        kotlin.jvm.internal.t.f(this$0, "this$0");
        kotlin.jvm.internal.t.f(actionEvent, "$actionEvent");
        o oVar = this$0.f22942c;
        if (oVar != null) {
            oVar.i(this$0, actionEvent, hVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(n this$0, pb.t brokenCreativeEvent) {
        kotlin.jvm.internal.t.f(this$0, "this$0");
        kotlin.jvm.internal.t.f(brokenCreativeEvent, "$brokenCreativeEvent");
        o oVar = this$0.f22942c;
        if (oVar != null) {
            oVar.l(this$0, brokenCreativeEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(n this$0, b0 error) {
        kotlin.jvm.internal.t.f(this$0, "this$0");
        kotlin.jvm.internal.t.f(error, "$error");
        o oVar = this$0.f22942c;
        if (oVar != null) {
            oVar.k(this$0, error);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(n this$0, a1 privacySheetParams) {
        kotlin.jvm.internal.t.f(this$0, "this$0");
        kotlin.jvm.internal.t.f(privacySheetParams, "$privacySheetParams");
        o oVar = this$0.f22942c;
        if (oVar != null) {
            oVar.h(this$0, privacySheetParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t(final pb.t tVar) {
        if (this.f22940a.i()) {
            return;
        }
        a0.c(new pa.s() { // from class: na.j
            @Override // wb.v
            public final void p() {
                n.q(this.f22932a, tVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u(final b0 b0Var) {
        if (this.f22940a.a(false)) {
            a0.c(new pa.s() { // from class: na.k
                @Override // wb.v
                public final void p() {
                    n.r(this.f22934a, b0Var);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(final a1 a1Var) {
        a0.c(new pa.s() { // from class: na.h
            @Override // wb.v
            public final void p() {
                n.s(this.f22929a, a1Var);
            }
        });
    }

    public final void N() {
        this.f22940a.destroy();
        this.f22941b.z0();
    }

    public final boolean V() {
        return this.f22941b.L0();
    }

    public final boolean W() {
        return this.f22940a.g();
    }

    public final boolean X() {
        return this.f22940a.a();
    }

    public final void Y() {
        if (this.f22940a.b()) {
            this.f22941b.setAdViewListener(new a());
            this.f22941b.Q0();
        }
    }

    public final void Z(final b0 error) {
        kotlin.jvm.internal.t.f(error, "error");
        a0.c(new pa.s() { // from class: na.b
            @Override // wb.v
            public final void p() {
                n.I(this.f22922a, error);
            }
        });
    }

    public final void a0() {
        m();
        L();
        Q();
    }

    public final void b0(o oVar) {
        this.f22942c = oVar;
    }

    public final void c0(Drawable drawable) {
        this.f22941b.setWatermark(drawable);
    }

    public final void d0(Context context) {
        kotlin.jvm.internal.t.f(context, "context");
        if (X()) {
            na.a.c(this, context);
        } else {
            Z(new b0("FullScreenAd not loaded"));
        }
    }

    public final void e0(Activity activity) {
        kotlin.jvm.internal.t.f(activity, "activity");
        this.f22941b.Z0(activity);
    }
}
