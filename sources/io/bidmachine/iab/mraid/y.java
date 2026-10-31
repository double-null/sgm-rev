package io.bidmachine.iab.mraid;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public class y {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final AtomicInteger f17840l = new AtomicInteger(0);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final /* synthetic */ boolean f17841m = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    m0 f17846e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private z f17847f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17842a = f17840l.getAndIncrement();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f17844c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f17848g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f17849h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f17850i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f17851j = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f17852k = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f17843b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final n0 f17845d = new c();

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final m0.a f17853a = new m0.a(h0.INTERSTITIAL);

        public a() {
        }

        public y a(Context context) {
            this.f17853a.D(y.this.f17845d);
            y.this.f17846e = this.f17853a.c(context);
            return y.this;
        }

        public a b(boolean z10) {
            this.f17853a.h(z10);
            return this;
        }

        public a c(e7.b bVar) {
            this.f17853a.u(bVar);
            return this;
        }

        public a d(boolean z10) {
            this.f17853a.v(z10);
            return this;
        }

        public a e(String str) {
            this.f17853a.w(str);
            return this;
        }

        public a f(c7.a aVar) {
            this.f17853a.x(aVar);
            return this;
        }

        public a g(g7.n nVar) {
            this.f17853a.y(nVar);
            return this;
        }

        public a h(float f10) {
            this.f17853a.z(f10);
            return this;
        }

        public a i(g7.n nVar) {
            this.f17853a.A(nVar);
            return this;
        }

        public a j(float f10) {
            this.f17853a.B(f10);
            return this;
        }

        public a k(boolean z10) {
            this.f17853a.C(z10);
            return this;
        }

        public a l(z zVar) {
            y.this.f17847f = zVar;
            return this;
        }

        public a m(g7.n nVar) {
            this.f17853a.E(nVar);
            return this;
        }

        public a n(float f10) {
            this.f17853a.F(f10);
            return this;
        }

        public a o(String str) {
            this.f17853a.G(str);
            return this;
        }

        public a p(g7.n nVar) {
            this.f17853a.H(nVar);
            return this;
        }

        public a q(boolean z10) {
            this.f17853a.I(z10);
            return this;
        }

        public a r(boolean z10) {
            this.f17853a.J(z10);
            return this;
        }
    }

    private y() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        m0 m0Var;
        Activity activityU0;
        if (!this.f17852k || (m0Var = this.f17846e) == null || (activityU0 = m0Var.u0()) == null) {
            return;
        }
        wb.a0.b(activityU0);
    }

    public static a w() {
        return new y().new a();
    }

    void d(Activity activity, ViewGroup viewGroup, boolean z10, boolean z11) {
        if (!s()) {
            if (activity != null && z10) {
                wb.a0.b(activity);
            }
            l(c7.b.e("Interstitial is not ready"));
            b0.j("MraidInterstitial", "Show failed: interstitial is not ready", new Object[0]);
            return;
        }
        if (!f17841m && this.f17846e == null) {
            throw new AssertionError();
        }
        this.f17851j = z11;
        this.f17852k = z10;
        g7.y.u(this.f17846e);
        viewGroup.addView(this.f17846e, new ViewGroup.LayoutParams(-1, -1));
        this.f17846e.w0(activity);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(Activity activity, boolean z10) {
        d(activity, (ViewGroup) activity.findViewById(R.id.content), true, z10);
    }

    void f(c7.b bVar) {
        this.f17848g = false;
        this.f17850i = true;
        z zVar = this.f17847f;
        if (zVar != null) {
            zVar.c(this, bVar);
        }
    }

    void g() {
        if (q()) {
            return;
        }
        this.f17849h = true;
        z zVar = this.f17847f;
        if (zVar != null) {
            zVar.k(this);
        }
        if (this.f17851j) {
            o();
        }
    }

    void h(c7.b bVar) {
        this.f17848g = false;
        this.f17850i = true;
        l(bVar);
    }

    void k() {
        this.f17848g = true;
        z zVar = this.f17847f;
        if (zVar != null) {
            zVar.b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l(c7.b bVar) {
        z zVar = this.f17847f;
        if (zVar != null) {
            zVar.a(this, bVar);
        }
    }

    public boolean m() {
        m0 m0Var = this.f17846e;
        return m0Var == null || m0Var.k() || t();
    }

    void n() {
        this.f17843b.set(true);
        z zVar = this.f17847f;
        if (zVar != null) {
            zVar.f(this);
        }
    }

    public void o() {
        b0.d("MraidInterstitial", "destroy", new Object[0]);
        this.f17848g = false;
        this.f17847f = null;
        m0 m0Var = this.f17846e;
        if (m0Var != null) {
            m0Var.X();
            this.f17846e = null;
        }
    }

    public void p() {
        if (this.f17846e == null || !m()) {
            return;
        }
        this.f17846e.b0();
    }

    public boolean q() {
        return this.f17849h;
    }

    public boolean r() {
        return this.f17844c.get();
    }

    public boolean s() {
        return this.f17848g && this.f17846e != null;
    }

    public boolean t() {
        return this.f17850i;
    }

    public boolean u() {
        return this.f17843b.get();
    }

    public void v(String str) {
        m0 m0Var = this.f17846e;
        if (m0Var == null) {
            throw new IllegalStateException("MraidView not created (mraidView == null)");
        }
        m0Var.p0(str);
    }

    public Context x() {
        m0 m0Var = this.f17846e;
        if (m0Var == null) {
            return null;
        }
        return m0Var.v0();
    }

    public void y(Context context, j0 j0Var) {
        MraidActivity.m(context, this, j0Var);
    }

    public void z(ViewGroup viewGroup, boolean z10) {
        d(null, viewGroup, false, z10);
    }

    private class c implements n0 {
        private c() {
        }

        @Override // io.bidmachine.iab.mraid.n0
        public void a(m0 m0Var) {
            b0.d("MraidInterstitial", "ViewListener - onLoaded", new Object[0]);
            y.this.k();
        }

        @Override // io.bidmachine.iab.mraid.n0
        public void c(m0 m0Var) {
            b0.d("MraidInterstitial", "ViewListener - onShown", new Object[0]);
            y.this.n();
        }

        @Override // io.bidmachine.iab.mraid.n0
        public void d(m0 m0Var, c7.b bVar) {
            b0.d("MraidInterstitial", "ViewListener - onShowFailed (%s)", bVar);
            y.this.c();
            y.this.h(bVar);
        }

        @Override // io.bidmachine.iab.mraid.n0
        public void e(m0 m0Var, String str) {
            b0.d("MraidInterstitial", "ViewListener - onPlayVideo (%s)", str);
            if (y.this.f17847f != null) {
                y.this.f17847f.j(y.this, str);
            }
        }

        @Override // io.bidmachine.iab.mraid.n0
        public void f(m0 m0Var, String str, g7.i iVar) {
            b0.d("MraidInterstitial", "ViewListener - onCalendarEvent (%s)", str);
            if (y.this.f17847f != null) {
                y.this.f17847f.h(y.this, str, iVar);
            }
        }

        @Override // io.bidmachine.iab.mraid.n0
        public void g(m0 m0Var, c7.b bVar) {
            b0.d("MraidInterstitial", "ViewListener - onLoadFailed (%s)", bVar);
            y.this.c();
            y.this.f(bVar);
        }

        @Override // io.bidmachine.iab.mraid.n0
        public void h(m0 m0Var, c7.b bVar) {
            b0.d("MraidInterstitial", "ViewListener - onExpired (%s)", bVar);
            if (y.this.f17847f != null) {
                y.this.f17847f.e(y.this, bVar);
            }
        }

        @Override // io.bidmachine.iab.mraid.n0
        public void i(m0 m0Var) {
            b0.d("MraidInterstitial", "ViewListener - onClose", new Object[0]);
            y.this.f17844c.set(true);
            y.this.c();
            y.this.g();
        }

        @Override // io.bidmachine.iab.mraid.n0
        public void j(m0 m0Var, String str, g7.i iVar) {
            b0.d("MraidInterstitial", "ViewListener - onCalendarEvent (%s)", str);
            if (y.this.f17847f != null) {
                y.this.f17847f.i(y.this, str, iVar);
            }
        }

        @Override // io.bidmachine.iab.mraid.n0
        public void k(m0 m0Var, String str, g7.i iVar) {
            b0.d("MraidInterstitial", "ViewListener - onOpenBrowser (%s)", str);
            if (y.this.f17847f != null) {
                y.this.f17847f.g(y.this, str, iVar);
            }
        }

        @Override // io.bidmachine.iab.mraid.n0
        public void l(m0 m0Var, pb.a1 a1Var) {
            b0.d("MraidInterstitial", "ViewListener - onOpenPrivacySheet (%s)", a1Var.toString());
            if (y.this.f17847f != null) {
                y.this.f17847f.d(y.this, a1Var);
            }
        }

        @Override // io.bidmachine.iab.mraid.n0
        public void b(m0 m0Var) {
        }
    }
}
