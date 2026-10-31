package io.bidmachine.iab.mraid;

import android.app.Activity;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public class m0 extends n7.a implements n7.a.InterfaceC0378a, g7.i {
    private final AtomicBoolean A;
    private final n7.a.InterfaceC0378a B;
    private final g7.n C;
    private final g7.n D;
    private final g7.n E;
    private final g7.n F;
    private boolean G;
    private g7.t H;
    private g7.r I;
    boolean J;
    private Integer K;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final MutableContextWrapper f17750h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final i f17751i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private n7.a f17752j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private n7.a f17753k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private g7.p f17754l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private WeakReference f17755m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f17756n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private n0 f17757o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final e7.b f17758p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final c7.a f17759q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final float f17760r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final float f17761s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final float f17762t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final boolean f17763u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final boolean f17764v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final boolean f17765w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final boolean f17766x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    final boolean f17767y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final AtomicBoolean f17768z;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final h0 f17769a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private c7.a f17770b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f17771c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f17772d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f17773e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String[] f17774f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public n0 f17775g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public e7.b f17776h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private g7.n f17777i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private g7.n f17778j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private g7.n f17779k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private g7.n f17780l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private float f17781m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private float f17782n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private float f17783o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private boolean f17784p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private boolean f17785q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private boolean f17786r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private boolean f17787s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private boolean f17788t;

        public a() {
            this(h0.INLINE);
        }

        public a A(g7.n nVar) {
            this.f17778j = nVar;
            return this;
        }

        public a B(float f10) {
            this.f17783o = f10;
            return this;
        }

        public a C(boolean z10) {
            this.f17784p = z10;
            return this;
        }

        public a D(n0 n0Var) {
            this.f17775g = n0Var;
            return this;
        }

        public a E(g7.n nVar) {
            this.f17779k = nVar;
            return this;
        }

        public a F(float f10) {
            this.f17781m = f10;
            return this;
        }

        public a G(String str) {
            this.f17772d = str;
            return this;
        }

        public a H(g7.n nVar) {
            this.f17780l = nVar;
            return this;
        }

        public a I(boolean z10) {
            this.f17786r = z10;
            return this;
        }

        public a J(boolean z10) {
            this.f17787s = z10;
            return this;
        }

        public m0 c(Context context) {
            return new m0(context, this, null);
        }

        public a h(boolean z10) {
            this.f17785q = z10;
            return this;
        }

        public a u(e7.b bVar) {
            this.f17776h = bVar;
            return this;
        }

        public a v(boolean z10) {
            this.f17788t = z10;
            return this;
        }

        public a w(String str) {
            this.f17771c = str;
            return this;
        }

        public a x(c7.a aVar) {
            this.f17770b = aVar;
            return this;
        }

        public a y(g7.n nVar) {
            this.f17777i = nVar;
            return this;
        }

        public a z(float f10) {
            this.f17782n = f10;
            return this;
        }

        a(h0 h0Var) {
            this.f17774f = null;
            this.f17781m = 3.0f;
            this.f17782n = 0.0f;
            this.f17783o = 0.0f;
            this.f17788t = false;
            this.f17769a = h0Var;
            this.f17770b = c7.a.FullLoad;
            this.f17771c = "https://localhost";
        }
    }

    class b implements g7.t.a {
        b() {
        }

        @Override // g7.t.a
        public void a(float f10, long j10, long j11) {
            int i10 = (int) (j11 / 1000);
            int i11 = (int) (j10 / 1000);
            if (m0.this.I != null) {
                m0.this.I.r(f10, i11, i10);
            }
        }

        @Override // g7.t.a
        public void b() {
            if (m0.this.I != null) {
                m0.this.I.l();
            }
            if (m0.this.f17751i.Q() || !m0.this.f17766x || m0.this.f17762t <= 0.0f) {
                return;
            }
            m0.this.d0();
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            o0 mraidViewState = m0.this.f17751i.getMraidViewState();
            if (mraidViewState == o0.RESIZED) {
                m0.this.Y();
                return;
            }
            if (mraidViewState == o0.EXPANDED) {
                m0.this.U();
            } else if (m0.this.g0()) {
                m0.this.f17751i.w();
                m0.this.j0();
            }
        }
    }

    static /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f17792a;

        static {
            int[] iArr = new int[c7.a.values().length];
            f17792a = iArr;
            try {
                iArr[c7.a.FullLoad.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17792a[c7.a.Stream.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17792a[c7.a.PartialLoad.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private class f implements i.d {
        private f() {
        }

        @Override // io.bidmachine.iab.mraid.i.d
        public void a(i iVar) {
            m0.this.n0();
        }

        @Override // io.bidmachine.iab.mraid.i.d
        public void b(i iVar, g0 g0Var) {
            m0.this.t(g0Var);
        }

        @Override // io.bidmachine.iab.mraid.i.d
        public boolean c(i iVar) {
            return false;
        }

        @Override // io.bidmachine.iab.mraid.i.d
        public void d(i iVar, String str) {
            m0.this.z(str);
        }

        @Override // io.bidmachine.iab.mraid.i.d
        public void e(i iVar, c7.b bVar) {
            m0.this.J(bVar);
        }

        @Override // io.bidmachine.iab.mraid.i.d
        public void f(i iVar) {
            m0.this.q0();
        }

        @Override // io.bidmachine.iab.mraid.i.d
        public void g(i iVar) {
            m0.this.b0();
        }

        @Override // io.bidmachine.iab.mraid.i.d
        public void h(i iVar) {
            m0.this.l0();
        }

        @Override // io.bidmachine.iab.mraid.i.d
        public void i(i iVar, String str) {
            m0.this.R(str);
        }

        @Override // io.bidmachine.iab.mraid.i.d
        public void j(i iVar, String str) {
            m0.this.W(str);
        }

        @Override // io.bidmachine.iab.mraid.i.d
        public void k(i iVar, String str, WebView webView, boolean z10) {
            m0.this.A(str, webView, z10);
        }

        @Override // io.bidmachine.iab.mraid.i.d
        public void l(i iVar, String str) {
            m0.this.N(str);
        }

        @Override // io.bidmachine.iab.mraid.i.d
        public void m(i iVar, c7.b bVar) {
            m0.this.s(bVar);
        }

        @Override // io.bidmachine.iab.mraid.i.d
        public boolean n(i iVar, WebView webView, g0 g0Var, boolean z10) {
            return m0.this.E(webView, g0Var, z10);
        }

        @Override // io.bidmachine.iab.mraid.i.d
        public void o(i iVar, pb.a1 a1Var) {
            m0.this.C(a1Var);
        }

        @Override // io.bidmachine.iab.mraid.i.d
        public void p(i iVar, boolean z10) {
            if (m0.this.f17764v) {
                return;
            }
            if (z10 && !m0.this.G) {
                m0.this.G = true;
            }
            m0.this.D(z10);
        }

        @Override // io.bidmachine.iab.mraid.i.d
        public void q(i iVar, c7.b bVar) {
            m0.this.O(bVar);
        }

        /* synthetic */ f(m0 m0Var, b bVar) {
            this();
        }
    }

    /* synthetic */ m0(Context context, a aVar, b bVar) {
        this(context, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A(String str, WebView webView, boolean z10) {
        setLoadingVisible(false);
        if (g0()) {
            B(this, z10);
        }
        e7.b bVar = this.f17758p;
        if (bVar != null) {
            bVar.M(webView);
        }
        if (this.f17759q != c7.a.FullLoad || this.f17763u || str.equals("data:text/html,<html></html>")) {
            return;
        }
        n0();
    }

    private void B(n7.a aVar, boolean z10) {
        setCloseClickListener(this);
        aVar.setCloseStyle(this.C);
        aVar.setCountDownStyle(this.D);
        D(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C(pb.a1 a1Var) {
        n0 n0Var = this.f17757o;
        if (n0Var == null) {
            return;
        }
        n0Var.l(this, a1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D(boolean z10) {
        boolean z11 = !z10 || this.f17764v;
        n7.a aVar = this.f17752j;
        if (aVar != null) {
            aVar.n(z11, this.f17761s);
            return;
        }
        n7.a aVar2 = this.f17753k;
        if (aVar2 != null) {
            aVar2.n(z11, this.f17761s);
        } else if (g0()) {
            n(z11, this.G ? 0.0f : this.f17761s);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean E(WebView webView, g0 g0Var, boolean z10) {
        n7.a aVar = this.f17753k;
        if (aVar == null || aVar.getParent() == null) {
            View viewP = l0.p(v0(), this);
            if (!(viewP instanceof ViewGroup)) {
                b0.g("MraidView", "Can't add expanded view because can't find required parent", new Object[0]);
                return false;
            }
            n7.a aVar2 = new n7.a(getContext());
            this.f17753k = aVar2;
            aVar2.setCloseClickListener(this);
            ((ViewGroup) viewP).addView(this.f17753k);
        }
        g7.y.u(webView);
        this.f17753k.addView(webView);
        B(this.f17753k, z10);
        t(g0Var);
        return true;
    }

    private void I(Activity activity) {
        this.K = Integer.valueOf(activity.getRequestedOrientation());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J(c7.b bVar) {
        e7.b bVar2 = this.f17758p;
        if (bVar2 != null) {
            bVar2.l(bVar);
        }
        n0 n0Var = this.f17757o;
        if (n0Var != null) {
            n0Var.g(this, bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N(String str) {
        if (this.f17757o == null) {
            return;
        }
        setLoadingVisible(true);
        e7.b bVar = this.f17758p;
        if (bVar != null) {
            bVar.onAdClicked();
        }
        this.f17757o.f(this, str, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O(c7.b bVar) {
        e7.b bVar2 = this.f17758p;
        if (bVar2 != null) {
            bVar2.l(bVar);
        }
        n0 n0Var = this.f17757o;
        if (n0Var != null) {
            n0Var.d(this, bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R(String str) {
        if (this.f17757o == null) {
            return;
        }
        setLoadingVisible(true);
        this.f17757o.k(this, str, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U() {
        r(this.f17753k);
        this.f17753k = null;
        Activity activityU0 = u0();
        if (activityU0 != null) {
            q(activityU0);
        }
        this.f17751i.x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W(String str) {
        if (this.f17757o == null) {
            return;
        }
        setLoadingVisible(true);
        e7.b bVar = this.f17758p;
        if (bVar != null) {
            bVar.onAdClicked();
        }
        this.f17757o.j(this, str, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y() {
        r(this.f17752j);
        this.f17752j = null;
        this.f17751i.y();
    }

    private void a0(String str) {
        this.f17751i.T(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d0() {
        g7.n nVarB = g7.a.b(getContext(), this.C);
        this.f17751i.M(new g7.e(nVarB.t().intValue(), nVarB.N().intValue()));
    }

    private boolean i0() {
        return this.f17751i.P();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j0() {
        n0 n0Var = this.f17757o;
        if (n0Var != null) {
            n0Var.i(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l0() {
        n0 n0Var = this.f17757o;
        if (n0Var != null) {
            n0Var.b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n0() {
        n0 n0Var;
        if (this.f17768z.getAndSet(true) || (n0Var = this.f17757o) == null) {
            return;
        }
        n0Var.a(this);
    }

    private void q(Activity activity) {
        Integer num = this.K;
        if (num != null) {
            activity.setRequestedOrientation(num.intValue());
            this.K = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q0() {
        e7.b bVar = this.f17758p;
        if (bVar != null) {
            bVar.j();
        }
        n0 n0Var = this.f17757o;
        if (n0Var != null) {
            n0Var.c(this);
        }
    }

    private void r(View view) {
        if (view == null) {
            return;
        }
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).removeAllViews();
        }
        g7.y.u(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s(c7.b bVar) {
        e7.b bVar2 = this.f17758p;
        if (bVar2 != null) {
            bVar2.l(bVar);
        }
        n0 n0Var = this.f17757o;
        if (n0Var != null) {
            n0Var.h(this, bVar);
        }
    }

    private void s0() {
        setCloseClickListener(this.B);
        n(true, this.f17760r);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t(g0 g0Var) {
        if (g0Var == null) {
            return;
        }
        Activity activityU0 = u0();
        b0.d("MraidView", "applyOrientation: %s", g0Var);
        if (activityU0 == null) {
            b0.d("MraidView", "no any interacted activities", new Object[0]);
        } else {
            I(activityU0);
            activityU0.setRequestedOrientation(g0Var.c(activityU0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(String str) {
        n0 n0Var = this.f17757o;
        if (n0Var != null) {
            n0Var.e(this, str);
        }
    }

    public void X() {
        this.f17757o = null;
        this.f17755m = null;
        Activity activityU0 = u0();
        if (activityU0 != null) {
            q(activityU0);
        }
        r(this.f17752j);
        r(this.f17753k);
        this.f17751i.D();
        g7.t tVar = this.H;
        if (tVar != null) {
            tVar.h();
        }
    }

    @Override // n7.a.InterfaceC0378a
    public void a() {
        if (!this.f17751i.Q() && this.f17766x && this.f17762t == 0.0f) {
            d0();
        }
    }

    @Override // g7.i
    public void b() {
        e7.b bVar = this.f17758p;
        if (bVar != null) {
            bVar.onAdClicked();
        }
    }

    void b0() {
        if (this.f17751i.Q() || !this.f17765w) {
            g7.y.r(new d());
        } else {
            d0();
        }
    }

    @Override // g7.i
    public void c() {
        setLoadingVisible(false);
    }

    @Override // n7.a.InterfaceC0378a
    public void d() {
        b0();
    }

    boolean g0() {
        return this.f17751i.O();
    }

    @Override // n7.a
    public boolean k() {
        if (getOnScreenTimeMs() > l0.f17743a || this.f17751i.R()) {
            return true;
        }
        if (this.f17764v || !this.f17751i.S()) {
            return super.k();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.J = true;
        p(getVisibility());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.J = false;
        p(getVisibility());
    }

    @Override // n7.a, android.view.View
    protected void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        p(i10);
    }

    void p(int i10) {
        if (this.f17767y) {
            boolean z10 = this.J && wb.g0.g(i10);
            if (this.A.compareAndSet(!z10, z10)) {
                t0(z10);
            }
        }
    }

    public void p0(String str) {
        e7.b bVar = this.f17758p;
        if (bVar != null && str != null) {
            str = bVar.d(str);
        }
        int i10 = e.f17792a[this.f17759q.ordinal()];
        if (i10 == 1) {
            a0(str);
            return;
        }
        if (i10 == 2) {
            this.f17756n = str;
            n0();
        } else {
            if (i10 != 3) {
                return;
            }
            n0();
            a0(str);
        }
    }

    public void setLastInteractedActivity(Activity activity) {
        if (activity != null) {
            this.f17755m = new WeakReference(activity);
            this.f17750h.setBaseContext(activity);
        }
    }

    public void setLoadingVisible(boolean z10) {
        if (!z10) {
            g7.p pVar = this.f17754l;
            if (pVar != null) {
                pVar.o(8);
                return;
            }
            return;
        }
        if (this.f17754l == null) {
            g7.p pVar2 = new g7.p(null);
            this.f17754l = pVar2;
            pVar2.g(getContext(), this, this.E);
        }
        this.f17754l.o(0);
        this.f17754l.i();
    }

    public void t0(boolean z10) {
        this.f17751i.U(z10);
    }

    public Activity u0() {
        WeakReference weakReference = this.f17755m;
        if (weakReference != null) {
            return (Activity) weakReference.get();
        }
        return null;
    }

    public Context v0() {
        Activity activityU0 = u0();
        return activityU0 == null ? getContext() : activityU0;
    }

    public void w0(Activity activity) {
        int i10 = e.f17792a[this.f17759q.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                if (g0()) {
                    s0();
                }
                a0(this.f17756n);
                this.f17756n = null;
            } else if (i10 == 3) {
                if (i0()) {
                    if (g0()) {
                        B(this, this.f17751i.S());
                    }
                } else if (g0()) {
                    s0();
                }
            }
        } else if (g0()) {
            B(this, this.f17751i.S());
        }
        this.f17751i.V();
        setLastInteractedActivity(activity);
        t(this.f17751i.getLastOrientationProperties());
    }

    private m0(Context context, a aVar) {
        super(context);
        this.f17768z = new AtomicBoolean(false);
        this.A = new AtomicBoolean(false);
        this.G = false;
        this.J = false;
        this.f17750h = new MutableContextWrapper(context);
        this.f17757o = aVar.f17775g;
        this.f17759q = aVar.f17770b;
        this.f17760r = aVar.f17781m;
        this.f17761s = aVar.f17782n;
        float f10 = aVar.f17783o;
        this.f17762t = f10;
        this.f17763u = aVar.f17784p;
        this.f17764v = aVar.f17785q;
        this.f17765w = aVar.f17786r;
        this.f17766x = aVar.f17787s;
        this.f17767y = aVar.f17788t;
        e7.b bVar = aVar.f17776h;
        this.f17758p = bVar;
        this.C = aVar.f17777i;
        this.D = aVar.f17778j;
        this.E = aVar.f17779k;
        g7.n nVar = aVar.f17780l;
        this.F = nVar;
        i iVarA = new i.b(context.getApplicationContext(), aVar.f17769a, new f(this, null)).c(aVar.f17771c).e(aVar.f17772d).b(aVar.f17774f).d(aVar.f17773e).a();
        this.f17751i = iVarA;
        addView(iVarA, new FrameLayout.LayoutParams(-1, -1, 17));
        if (f10 > 0.0f) {
            g7.r rVar = new g7.r(null);
            this.I = rVar;
            rVar.g(context, this, nVar);
            g7.t tVar = new g7.t(this, new b());
            this.H = tVar;
            tVar.k(f10);
        }
        this.B = new c();
        setCloseClickListener(this);
        if (bVar != null) {
            bVar.A(this);
            bVar.P(iVarA.getWebView());
        }
    }

    class c implements n7.a.InterfaceC0378a {
        c() {
        }

        @Override // n7.a.InterfaceC0378a
        public void d() {
            m0.this.O(c7.b.i("Close button clicked"));
            m0.this.j0();
        }

        @Override // n7.a.InterfaceC0378a
        public void a() {
        }
    }
}
