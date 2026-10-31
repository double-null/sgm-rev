package oa;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import pb.a1;
import pb.b0;
import pb.l1;
import pb.v0;
import rd.h0;
import wb.a0;
import wb.f0;
import wb.g0;
import wb.i0;
import wb.y;

/* JADX INFO: loaded from: classes5.dex */
public final class s extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y f23307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f0 f23308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FrameLayout f23309c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final sb.d f23310d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final sb.b f23311e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final lb.a f23312f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final bb.a f23313g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final mb.f f23314h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ic.a f23315i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final pa.f0 f23316j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private t f23317k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f23318l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f23319m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private WeakReference f23320n;

    static final class a extends kotlin.jvm.internal.u implements id.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f23321d = new a();

        a() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final xb.a invoke() {
            id.a<xb.a> aVarB = la.f.b();
            if (aVarB != null) {
                return aVarB.invoke();
            }
            return null;
        }
    }

    private static final class b implements bb.r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference f23322a;

        public b(s adView) {
            kotlin.jvm.internal.t.f(adView, "adView");
            this.f23322a = new WeakReference(adView);
        }

        @Override // bb.r
        public void a() {
            s sVar = (s) this.f23322a.get();
            if (sVar != null) {
                sVar.s();
            }
        }

        @Override // bb.r
        public void b() {
            s sVar = (s) this.f23322a.get();
            if (sVar != null) {
                sVar.u0();
            }
        }

        @Override // bb.r
        public void c() {
            s sVar = (s) this.f23322a.get();
            if (sVar != null) {
                sVar.j0();
            }
        }

        @Override // bb.r
        public void d() {
            s sVar = (s) this.f23322a.get();
            if (sVar != null) {
                sVar.Y0();
            }
        }

        @Override // bb.r
        public void f() {
            s sVar = (s) this.f23322a.get();
            if (sVar != null) {
                sVar.q0();
            }
        }

        @Override // bb.r
        public void g() {
            s sVar = (s) this.f23322a.get();
            if (sVar != null) {
                sVar.S0();
            }
        }

        @Override // bb.r
        public void h() {
            s sVar = (s) this.f23322a.get();
            if (sVar != null) {
                sVar.n0(new b0("Ad loading timeout after display"));
                sVar.s();
            }
        }

        @Override // bb.r
        public void i(pb.t brokenCreativeEvent) {
            kotlin.jvm.internal.t.f(brokenCreativeEvent, "brokenCreativeEvent");
            s sVar = (s) this.f23322a.get();
            if (sVar != null) {
                sVar.H(brokenCreativeEvent);
            }
        }

        @Override // bb.r
        public void j(a1 privacySheetParams) {
            kotlin.jvm.internal.t.f(privacySheetParams, "privacySheetParams");
            s sVar = (s) this.f23322a.get();
            if (sVar != null) {
                sVar.o0(privacySheetParams);
            }
        }

        @Override // bb.r
        public void k(bb.t tVar, b0 error) {
            kotlin.jvm.internal.t.f(error, "error");
            s sVar = (s) this.f23322a.get();
            if (sVar != null) {
                sVar.y0(error);
            }
        }

        @Override // bb.r
        public void l(bb.t adPhaseController) {
            kotlin.jvm.internal.t.f(adPhaseController, "adPhaseController");
            s sVar = (s) this.f23322a.get();
            if (sVar != null) {
                sVar.t(adPhaseController);
            }
        }

        @Override // bb.r
        public void m(mb.l placeholderView) {
            kotlin.jvm.internal.t.f(placeholderView, "placeholderView");
            s sVar = (s) this.f23322a.get();
            if (sVar != null) {
                sVar.v(placeholderView);
            }
        }

        @Override // bb.r
        public void n(bb.a adController, b0 error) {
            kotlin.jvm.internal.t.f(adController, "adController");
            kotlin.jvm.internal.t.f(error, "error");
            s sVar = (s) this.f23322a.get();
            if (sVar != null) {
                sVar.s0(error);
            }
        }

        @Override // bb.r
        public void o(mb.l placeholderView) {
            kotlin.jvm.internal.t.f(placeholderView, "placeholderView");
            s sVar = (s) this.f23322a.get();
            if (sVar != null) {
                sVar.k0(placeholderView);
            }
        }

        @Override // bb.r
        public void onAdClicked() {
            s sVar = (s) this.f23322a.get();
            if (sVar != null) {
                sVar.B0();
            }
        }

        @Override // bb.r
        public void p(bb.a adController) {
            kotlin.jvm.internal.t.f(adController, "adController");
            s sVar = (s) this.f23322a.get();
            if (sVar != null) {
                sVar.M0();
            }
        }

        @Override // bb.r
        public void q(bb.a adController) {
            kotlin.jvm.internal.t.f(adController, "adController");
            s sVar = (s) this.f23322a.get();
            if (sVar != null) {
                sVar.F0();
            }
        }

        @Override // bb.r
        public void r(bb.a adController) {
            kotlin.jvm.internal.t.f(adController, "adController");
            s sVar = (s) this.f23322a.get();
            if (sVar != null) {
                sVar.O0();
            }
        }
    }

    private final class c extends View {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ s f23323a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(s sVar, Context context) {
            super(context);
            kotlin.jvm.internal.t.f(context, "context");
            this.f23323a = sVar;
        }

        @Override // android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            this.f23323a.R0();
        }
    }

    private static final class d implements ic.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference f23324a;

        public d(s adView) {
            kotlin.jvm.internal.t.f(adView, "adView");
            this.f23324a = new WeakReference(adView);
        }

        @Override // ic.b
        public void a(boolean z10) {
            s sVar = (s) this.f23324a.get();
            if (sVar != null) {
                sVar.p0(z10);
            }
        }

        @Override // ic.b
        public void b(mc.a actionEvent) {
            kotlin.jvm.internal.t.f(actionEvent, "actionEvent");
            s sVar = (s) this.f23324a.get();
            if (sVar != null) {
                sVar.x(actionEvent);
            }
        }

        @Override // ic.b
        public void c(mc.a actionEvent, wb.h error) {
            kotlin.jvm.internal.t.f(actionEvent, "actionEvent");
            kotlin.jvm.internal.t.f(error, "error");
            s sVar = (s) this.f23324a.get();
            if (sVar != null) {
                sVar.y(actionEvent, error);
            }
        }

        @Override // ic.b
        public void d() {
            s sVar = (s) this.f23324a.get();
            if (sVar != null) {
                sVar.V0();
            }
        }
    }

    static final class e extends kotlin.jvm.internal.u implements id.l {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f23325d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f23326e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f23327f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, String str2, String str3) {
            super(1);
            this.f23325d = str;
            this.f23326e = str2;
            this.f23327f = str3;
        }

        public final String b(int i10) {
            if (i10 == 0) {
                return "";
            }
            if (i10 < this.f23325d.length() + this.f23326e.length() + this.f23327f.length()) {
                return h0.h1(h0.j1(h0.h1(this.f23325d).toString(), Math.min(i10, this.f23325d.length()))).toString();
            }
            return this.f23326e + this.f23327f + this.f23325d;
        }

        @Override // id.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return b(((Number) obj).intValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Context context, pb.c adParams) {
        pa.f0 f0VarA;
        super(context);
        kotlin.jvm.internal.t.f(context, "context");
        kotlin.jvm.internal.t.f(adParams, "adParams");
        y yVar = new y("AdView");
        this.f23307a = yVar;
        this.f23308b = new f0();
        FrameLayout frameLayout = new FrameLayout(context);
        this.f23309c = frameLayout;
        sb.d dVar = new sb.d(context);
        this.f23310d = dVar;
        sb.b bVar = new sb.b(context);
        bVar.setVisibility(8);
        this.f23311e = bVar;
        this.f23315i = new ic.a(adParams.f(), adParams.g(), new d(this));
        addView(new c(this, context));
        addView(frameLayout, g0.c());
        addView(bVar, g0.c());
        addView(dVar, g0.c());
        pa.h hVarA = pa.h.f23769i.a();
        lb.c cVar = new lb.c(yVar.toString(), hVarA);
        this.f23312f = cVar;
        lb.b bVarQ = cVar.q();
        this.f23313g = new bb.q(context, adParams, new b(this), new ab.k(bVarQ, hVarA));
        mb.f fVar = new mb.f(context);
        this.f23314h = fVar;
        addView(fVar, g0.c());
        fVar.d();
        Context appContext = context.getApplicationContext();
        pb.k kVarB = adParams.b();
        if (kVarB != null) {
            kotlin.jvm.internal.t.e(appContext, "appContext");
            f0VarA = pa.g0.a(kVarB, appContext, new jb.a(a.f23321d, bVarQ, hVarA));
        } else {
            f0VarA = null;
        }
        this.f23316j = f0VarA;
        K(adParams.h());
        this.f23318l = false;
        setBackgroundColor(-16777216);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(s this$0, mb.l placeholderView) {
        kotlin.jvm.internal.t.f(this$0, "this$0");
        kotlin.jvm.internal.t.f(placeholderView, "$placeholderView");
        this$0.removeView(placeholderView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(s this$0, mc.a actionEvent, wb.h hVar) {
        kotlin.jvm.internal.t.f(this$0, "this$0");
        kotlin.jvm.internal.t.f(actionEvent, "$actionEvent");
        t tVar = this$0.f23317k;
        if (tVar != null) {
            tVar.i(this$0, actionEvent, hVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B0() {
        this.f23312f.e();
        pa.t.g(this.f23307a, "notifyAdClicked", new Object[0]);
        a0.c(new Runnable() { // from class: oa.k
            @Override // java.lang.Runnable
            public final void run() {
                s.C0(this.f23295a);
            }
        });
    }

    static /* synthetic */ void C(s sVar, mc.a aVar, wb.h hVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            hVar = null;
        }
        sVar.y(aVar, hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C0(s this$0) {
        kotlin.jvm.internal.t.f(this$0, "this$0");
        t tVar = this$0.f23317k;
        if (tVar != null) {
            tVar.d(this$0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(s this$0, pb.t brokenCreativeEvent) {
        kotlin.jvm.internal.t.f(this$0, "this$0");
        kotlin.jvm.internal.t.f(brokenCreativeEvent, "$brokenCreativeEvent");
        t tVar = this$0.f23317k;
        if (tVar != null) {
            tVar.l(this$0, brokenCreativeEvent);
        }
    }

    private final void D0() {
        if (this.f23312f.b(false)) {
            pa.t.g(this.f23307a, "notifyAdDisappeared", new Object[0]);
            a0.c(new Runnable() { // from class: oa.o
                @Override // java.lang.Runnable
                public final void run() {
                    s.E0(this.f23302a);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(s this$0, b0 error) {
        kotlin.jvm.internal.t.f(this$0, "this$0");
        kotlin.jvm.internal.t.f(error, "$error");
        t tVar = this$0.f23317k;
        if (tVar != null) {
            tVar.k(this$0, error);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E0(s this$0) {
        kotlin.jvm.internal.t.f(this$0, "this$0");
        t tVar = this$0.f23317k;
        if (tVar != null) {
            tVar.c(this$0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(s this$0, a1 privacySheetParams) {
        kotlin.jvm.internal.t.f(this$0, "this$0");
        kotlin.jvm.internal.t.f(privacySheetParams, "$privacySheetParams");
        t tVar = this$0.f23317k;
        if (tVar != null) {
            tVar.h(this$0, privacySheetParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F0() {
        if (this.f23312f.r()) {
            pa.t.g(this.f23307a, "notifyAdExpired", new Object[0]);
            a0.c(new Runnable() { // from class: oa.q
                @Override // java.lang.Runnable
                public final void run() {
                    s.G0(this.f23304a);
                }
            });
        }
    }

    static /* synthetic */ void G(s sVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        sVar.L(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G0(s this$0) {
        kotlin.jvm.internal.t.f(this$0, "this$0");
        t tVar = this$0.f23317k;
        if (tVar != null) {
            tVar.b(this$0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(final pb.t tVar) {
        if (this.f23312f.i()) {
            return;
        }
        a0.c(new Runnable() { // from class: oa.n
            @Override // java.lang.Runnable
            public final void run() {
                s.D(this.f23300a, tVar);
            }
        });
    }

    private final void H0() {
        if (this.f23312f.m()) {
            pa.t.g(this.f23307a, "notifyAdFinished", new Object[0]);
            a0.c(new Runnable() { // from class: oa.h
                @Override // java.lang.Runnable
                public final void run() {
                    s.I0(this.f23292a);
                }
            });
        }
    }

    private final void I(final b0 b0Var) {
        if (this.f23312f.a(false)) {
            pa.t.b(this.f23307a, "notifyAdFailToLoad - %s", b0Var);
            a0.c(new Runnable() { // from class: oa.f
                @Override // java.lang.Runnable
                public final void run() {
                    s.E(this.f23288a, b0Var);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I0(s this$0) {
        kotlin.jvm.internal.t.f(this$0, "this$0");
        t tVar = this$0.f23317k;
        if (tVar != null) {
            tVar.g(this$0);
        }
    }

    private final void J(final a1 a1Var) {
        a0.c(new Runnable() { // from class: oa.r
            @Override // java.lang.Runnable
            public final void run() {
                s.F(this.f23305a, a1Var);
            }
        });
    }

    private final void J0() {
        if (this.f23312f.a(true)) {
            pa.t.g(this.f23307a, "notifyAdLoaded", new Object[0]);
            a0.c(new Runnable() { // from class: oa.j
                @Override // java.lang.Runnable
                public final void run() {
                    s.K0(this.f23294a);
                }
            });
        }
    }

    private final void K(l1 l1Var) {
        if (l1Var == null) {
            this.f23311e.setVisibility(8);
            return;
        }
        sd.a.C0418a c0418a = sd.a.f25407b;
        String strValueOf = String.valueOf(sd.a.r(sd.c.t(System.currentTimeMillis(), sd.d.MILLISECONDS)));
        sb.b bVar = this.f23311e;
        bVar.setVisibility(0);
        bVar.setLocation(l1Var.b());
        bVar.setBaseColor(l1Var.a());
        bVar.setPayloadProvider(v0(strValueOf, l1Var.c()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K0(s this$0) {
        kotlin.jvm.internal.t.f(this$0, "this$0");
        t tVar = this$0.f23317k;
        if (tVar != null) {
            tVar.f(this$0);
        }
    }

    private final void L(boolean z10) {
        pa.t.g(this.f23307a, "onViewOnScreen (isViewability - %s)", Boolean.valueOf(z10));
        pa.f0 f0Var = this.f23316j;
        if (f0Var != null) {
            f0Var.l(this.f23307a, this, (12 & 4) != 0 ? null : null, (12 & 8) != 0 ? null : null, (12 & 16) != 0, (12 & 32) != 0 ? null : new pa.f0.a(0L, null, 3, null));
        }
        this.f23313g.c();
        this.f23313g.a(z10);
        w0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M0() {
        if (this.f23312f.j()) {
            pa.t.g(this.f23307a, "notifyAdShown", new Object[0]);
            a0.c(new Runnable() { // from class: oa.i
                @Override // java.lang.Runnable
                public final void run() {
                    s.N0(this.f23293a);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N0(s this$0) {
        kotlin.jvm.internal.t.f(this$0, "this$0");
        t tVar = this$0.f23317k;
        if (tVar != null) {
            tVar.a(this$0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O0() {
        J0();
    }

    private final void P0() {
        if (this.f23312f.o()) {
            if (this.f23315i.b()) {
                V0();
            }
            if (this.f23315i.c()) {
                G(this, false, 1, null);
            }
        }
        this.f23315i.j(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R0() {
        pa.t.g(this.f23307a, "onDetachedFromWindow", new Object[0]);
        this.f23318l = false;
        W0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S0() {
        pa.t.g(this.f23307a, "onPreparingForShowStarted", new Object[0]);
    }

    private final void T0() {
        pa.t.g(this.f23307a, "onViewOutOfScreen", new Object[0]);
        W0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V0() {
        pa.t.g(this.f23307a, "onViewabilityShown", new Object[0]);
        L(true);
    }

    private final void W0() {
        if (!this.f23318l || !i0.p(this)) {
            this.f23315i.k();
        }
        this.f23313g.d();
        D0();
    }

    private final void X0() {
        if (this.f23318l && i0.p(this)) {
            this.f23312f.s();
            if (this.f23319m) {
                P0();
            } else {
                this.f23313g.c();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y0() {
        this.f23314h.j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j0() {
        a0.c(new pa.s() { // from class: oa.d
            @Override // wb.v
            public final void p() {
                s.r0(this.f23284a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k0(final mb.l lVar) {
        pa.t.g(this.f23307a, "showPlaceholder (%s)", lVar);
        a0.c(new pa.s() { // from class: oa.a
            @Override // wb.v
            public final void p() {
                s.w(lVar, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l0(s this$0) {
        kotlin.jvm.internal.t.f(this$0, "this$0");
        this$0.f23309c.removeAllViews();
        this$0.removeAllViews();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m0(s this$0, b0 error) {
        kotlin.jvm.internal.t.f(this$0, "this$0");
        kotlin.jvm.internal.t.f(error, "$error");
        t tVar = this$0.f23317k;
        if (tVar != null) {
            tVar.j(this$0, error);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n0(final b0 b0Var) {
        if (this.f23312f.d()) {
            pa.t.b(this.f23307a, "notifyAdFailToShow - %s", b0Var);
            a0.c(new Runnable() { // from class: oa.g
                @Override // java.lang.Runnable
                public final void run() {
                    s.m0(this.f23290a, b0Var);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o0(a1 a1Var) {
        pa.t.g(this.f23307a, "onOpenPrivacySheet", new Object[0]);
        J(a1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p0(boolean z10) {
        if (z10) {
            G(this, false, 1, null);
        } else {
            T0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q0() {
        this.f23314h.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r0(s this$0) {
        kotlin.jvm.internal.t.f(this$0, "this$0");
        this$0.f23308b.c(this$0);
        u.d(this$0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s() {
        this.f23312f.l();
        H0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s0(b0 b0Var) {
        I(b0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t(final bb.t tVar) {
        pa.t.g(this.f23307a, "onPreparingForShowComplete", new Object[0]);
        a0.c(new pa.s() { // from class: oa.l
            @Override // wb.v
            public final void p() {
                s.u(tVar, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(bb.t adPhaseController, s this$0) {
        kotlin.jvm.internal.t.f(adPhaseController, "$adPhaseController");
        kotlin.jvm.internal.t.f(this$0, "this$0");
        if (adPhaseController.f(this$0, this$0.f23309c)) {
            this$0.f23319m = true;
            this$0.q0();
            this$0.X0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(final mb.l lVar) {
        pa.t.g(this.f23307a, "hidePlaceholder (%s)", lVar);
        a0.c(new pa.s() { // from class: oa.m
            @Override // wb.v
            public final void p() {
                s.A(this.f23298a, lVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(mb.l placeholderView, s this$0) {
        kotlin.jvm.internal.t.f(placeholderView, "$placeholderView");
        kotlin.jvm.internal.t.f(this$0, "this$0");
        if (placeholderView.getParent() == this$0) {
            return;
        }
        g7.y.u(placeholderView);
        this$0.addView(placeholderView, g0.c());
        placeholderView.bringToFront();
        placeholderView.r();
    }

    private final void w0() {
        if (this.f23312f.b(true)) {
            pa.t.g(this.f23307a, "notifyAdAppeared", new Object[0]);
            a0.c(new Runnable() { // from class: oa.p
                @Override // java.lang.Runnable
                public final void run() {
                    s.x0(this.f23303a);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x(mc.a aVar) {
        pa.t.g(this.f23307a, "onViewabilityEvent (%s)", aVar);
        C(this, aVar, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x0(s this$0) {
        kotlin.jvm.internal.t.f(this$0, "this$0");
        t tVar = this$0.f23317k;
        if (tVar != null) {
            tVar.e(this$0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y(final mc.a aVar, final wb.h hVar) {
        if (this.f23312f.i()) {
            return;
        }
        if (hVar != null) {
            pa.t.b(this.f23307a, "notifyViewabilityEvent - %s, error - %s", aVar, hVar);
        } else {
            pa.t.g(this.f23307a, "notifyViewabilityEvent - %s", aVar);
        }
        a0.c(new Runnable() { // from class: oa.e
            @Override // java.lang.Runnable
            public final void run() {
                s.B(this.f23285a, aVar, hVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y0(b0 b0Var) {
        pa.t.b(this.f23307a, "onPreparingForShowFail - %s", b0Var);
        n0(new b0("No phase loaded"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(s this$0) {
        kotlin.jvm.internal.t.f(this$0, "this$0");
        this$0.f23308b.b(this$0);
        this$0.f23313g.e();
    }

    public final void A0() {
        WeakReference weakReference = this.f23320n;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f23320n = null;
    }

    public final boolean L0() {
        return this.f23312f.k();
    }

    public final void Q0() {
        if (this.f23312f.b()) {
            pa.f0 f0Var = this.f23316j;
            if (f0Var != null) {
                f0Var.l(this.f23307a, this, (12 & 4) != 0 ? null : null, (12 & 8) != 0 ? null : null, (12 & 16) != 0, (12 & 32) != 0 ? null : null);
            }
            this.f23313g.b();
        }
    }

    public final void U0() {
        this.f23313g.f();
    }

    public final void Z0(Activity activity) {
        kotlin.jvm.internal.t.f(activity, "activity");
        t0();
        i0(activity);
        qb.i.b(activity, getRequiredOrientation());
        wb.b0.h(activity);
        i0.q(this);
        qb.i.a(activity, this, false);
        activity.setContentView(this, g0.c());
        wb.b0.a(activity);
    }

    public final t getAdViewListener() {
        return this.f23317k;
    }

    public final Activity getAttachedActivity() {
        WeakReference weakReference = this.f23320n;
        if (weakReference != null) {
            return (Activity) weakReference.get();
        }
        return null;
    }

    public final v0 getRequiredOrientation() {
        return this.f23313g.g();
    }

    public final void i0(Activity activity) {
        kotlin.jvm.internal.t.f(activity, "activity");
        this.f23320n = new WeakReference(activity);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        pa.t.g(this.f23307a, "onAttachedToWindow", new Object[0]);
        this.f23318l = true;
        X0();
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View changedView, int i10) {
        kotlin.jvm.internal.t.f(changedView, "changedView");
        super.onVisibilityChanged(changedView, i10);
        pa.t.g(this.f23307a, "onVisibilityChanged - %s", qb.h.g(i10));
        if (g0.g(i10)) {
            X0();
        } else {
            W0();
        }
    }

    public final void setAdViewListener(t tVar) {
        this.f23317k = tVar;
    }

    public final void setWatermark(Drawable drawable) {
        this.f23310d.setWatermark(drawable);
    }

    public final void t0() {
        wb.b0.f(getAttachedActivity());
        A0();
    }

    @Override // android.view.View
    public String toString() {
        return this.f23307a.toString();
    }

    public final void u0() {
        t0();
        a0.c(new pa.s() { // from class: oa.b
            @Override // wb.v
            public final void p() {
                s.z(this.f23282a);
            }
        });
    }

    public final id.l<Integer, String> v0(String timestamp, String payload) {
        kotlin.jvm.internal.t.f(timestamp, "timestamp");
        kotlin.jvm.internal.t.f(payload, "payload");
        return new e(payload, timestamp, ":");
    }

    public final void z0() {
        pa.t.g(this.f23307a, "destroy", new Object[0]);
        pa.f0 f0Var = this.f23316j;
        if (f0Var != null) {
            f0Var.b();
        }
        this.f23317k = null;
        this.f23308b.a();
        this.f23313g.destroy();
        this.f23315i.a();
        a0.c(new pa.s() { // from class: oa.c
            @Override // wb.v
            public final void p() {
                s.l0(this.f23283a);
            }
        });
        this.f23312f.destroy();
        t0();
    }
}
