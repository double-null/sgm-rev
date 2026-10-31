package io.bidmachine.iab.mraid;

import android.content.Context;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.adjust.sdk.Constants;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public class i extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h0 f17692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f17693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f17694c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f17695d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f17696e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f17697f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f17698g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f17699h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f17700i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final AtomicBoolean f17701j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final GestureDetector f17702k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final d0 f17703l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final e0 f17704m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final j1 f17705n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final b1 f17706o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final d f17707p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final List f17708q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    b1 f17709r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private o0 f17710s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final io.bidmachine.iab.mraid.c f17711t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f17712u;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f17713a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final h0 f17714b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final d f17715c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f17716d = "https://localhost";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private List f17717e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f17718f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f17719g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Long f17720h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private List f17721i;

        public b(Context context, h0 h0Var, d dVar) {
            this.f17713a = context;
            this.f17714b = h0Var;
            this.f17715c = dVar;
        }

        public i a() {
            return new i(this.f17713a, this.f17714b, this.f17716d, this.f17719g, this.f17717e, this.f17718f, this.f17720h, this.f17721i, this.f17715c);
        }

        public b b(String[] strArr) {
            this.f17717e = strArr != null ? Arrays.asList(strArr) : null;
            return this;
        }

        public b c(String str) {
            this.f17716d = str;
            return this;
        }

        public b d(String str) {
            this.f17718f = str;
            return this;
        }

        public b e(String str) {
            this.f17719g = str;
            return this;
        }
    }

    private static class c extends GestureDetector.SimpleOnGestureListener {
        private c() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            return true;
        }
    }

    public interface d {
        void a(i iVar);

        void b(i iVar, g0 g0Var);

        boolean c(i iVar);

        void d(i iVar, String str);

        void e(i iVar, c7.b bVar);

        void f(i iVar);

        void g(i iVar);

        void h(i iVar);

        void i(i iVar, String str);

        void j(i iVar, String str);

        void k(i iVar, String str, WebView webView, boolean z10);

        void l(i iVar, String str);

        void m(i iVar, c7.b bVar);

        boolean n(i iVar, WebView webView, g0 g0Var, boolean z10);

        void o(i iVar, pb.a1 a1Var);

        void p(i iVar, boolean z10);

        void q(i iVar, c7.b bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    abstract class e implements b1.a {
        private e() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void A(String str) {
            i.this.f17707p.l(i.this, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String B() {
            return "Callback - onLoaded";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String C(String str) {
            return "Callback - onCalendarEvent: " + str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String D(String str) {
            return "Callback - onExpand: " + str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String E(String str) {
            return "Callback - onOpen: " + str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String F(String str) {
            return "Callback - onOpenPrivacySheet: " + str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String G(String str) {
            return "Callback - onPlayVideo: " + str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String H(String str) {
            return "Callback - onStorePicture: " + str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void I(String str) {
            i.this.f17707p.j(i.this, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String x() {
            return "Callback - onClose";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String y(c7.b bVar) {
            return "Callback - onError: " + bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String z(g0 g0Var) {
            return "Callback - onOrientation: " + g0Var;
        }

        @Override // io.bidmachine.iab.mraid.b1.a
        public void b() {
            b0.c("MraidAdView", new id.a() { // from class: io.bidmachine.iab.mraid.o
                @Override // id.a
                public final Object invoke() {
                    return i.e.B();
                }
            });
            i.this.p();
        }

        @Override // io.bidmachine.iab.mraid.b1.a
        public void c(final String str) {
            b0.c("MraidAdView", new id.a() { // from class: io.bidmachine.iab.mraid.r
                @Override // id.a
                public final Object invoke() {
                    return i.e.G(str);
                }
            });
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                i.this.f17707p.d(i.this, URLDecoder.decode(str, Constants.ENCODING));
            } catch (UnsupportedEncodingException e10) {
                b0.f("MraidAdView", e10);
            }
        }

        @Override // io.bidmachine.iab.mraid.b1.a
        public void d(final String str) {
            b0.c("MraidAdView", new id.a() { // from class: io.bidmachine.iab.mraid.m
                @Override // id.a
                public final Object invoke() {
                    return i.e.E(str);
                }
            });
            i.this.v(str);
        }

        @Override // io.bidmachine.iab.mraid.b1.a
        public void e(final String str) {
            b0.c("MraidAdView", new id.a() { // from class: io.bidmachine.iab.mraid.u
                @Override // id.a
                public final Object invoke() {
                    return i.e.H(str);
                }
            });
            String strB = i.this.f17705n.b(str);
            if (TextUtils.isEmpty(strB)) {
                return;
            }
            i.this.n(strB, new wb.i() { // from class: io.bidmachine.iab.mraid.k
                @Override // wb.i
                public final void execute(Object obj) {
                    this.f17741a.I((String) obj);
                }
            });
        }

        @Override // io.bidmachine.iab.mraid.b1.a
        public void f(final String str) {
            b0.c("MraidAdView", new id.a() { // from class: io.bidmachine.iab.mraid.q
                @Override // id.a
                public final Object invoke() {
                    return i.e.F(str);
                }
            });
            i.this.r(str);
        }

        @Override // io.bidmachine.iab.mraid.b1.a
        public void g(final String str) {
            b0.c("MraidAdView", new id.a() { // from class: io.bidmachine.iab.mraid.n
                @Override // id.a
                public final Object invoke() {
                    return i.e.D(str);
                }
            });
            i.this.m(str);
        }

        @Override // io.bidmachine.iab.mraid.b1.a
        public void h(final String str) {
            b0.c("MraidAdView", new id.a() { // from class: io.bidmachine.iab.mraid.s
                @Override // id.a
                public final Object invoke() {
                    return i.e.C(str);
                }
            });
            String strA = i.this.f17705n.a(str);
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            i.this.n(strA, new wb.i() { // from class: io.bidmachine.iab.mraid.t
                @Override // wb.i
                public final void execute(Object obj) {
                    this.f17827a.A((String) obj);
                }
            });
        }

        @Override // io.bidmachine.iab.mraid.b1.a
        public void j(final g0 g0Var) {
            b0.c("MraidAdView", new id.a() { // from class: io.bidmachine.iab.mraid.p
                @Override // id.a
                public final Object invoke() {
                    return i.e.z(g0Var);
                }
            });
            if (i.this.O() || i.this.f17710s == o0.EXPANDED) {
                i.this.f17707p.b(i.this, g0Var);
            }
        }

        @Override // io.bidmachine.iab.mraid.b1.a
        public void l(final c7.b bVar) {
            b0.c("MraidAdView", new id.a() { // from class: io.bidmachine.iab.mraid.j
                @Override // id.a
                public final Object invoke() {
                    return i.e.y(bVar);
                }
            });
            i.this.i(bVar);
        }

        @Override // io.bidmachine.iab.mraid.b1.a
        public void onClose() {
            b0.c("MraidAdView", new id.a() { // from class: io.bidmachine.iab.mraid.l
                @Override // id.a
                public final Object invoke() {
                    return i.e.x();
                }
            });
            i.this.h();
        }
    }

    private class f extends e {
        private f() {
            super();
        }

        @Override // io.bidmachine.iab.mraid.b1.a
        public void i(String str) {
            i.this.B(str);
        }

        @Override // io.bidmachine.iab.mraid.b1.a
        public void t(boolean z10) {
            d dVar = i.this.f17707p;
            i iVar = i.this;
            dVar.p(iVar, iVar.f17706o.M());
        }
    }

    private class g extends e {
        private g() {
            super();
        }

        @Override // io.bidmachine.iab.mraid.b1.a
        public void i(String str) {
            i.this.t();
        }

        @Override // io.bidmachine.iab.mraid.b1.a
        public void t(boolean z10) {
            i iVar = i.this;
            if (iVar.f17709r != null) {
                d dVar = iVar.f17707p;
                i iVar2 = i.this;
                dVar.p(iVar2, iVar2.f17709r.M());
            }
        }
    }

    public i(Context context, h0 h0Var, String str, String str2, List<String> list, String str3, Long l10, List<pb.f1> list2, d dVar) {
        this(context, h0Var, str, str2, list, str3, l10, list2, dVar, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B(String str) {
        if (this.f17710s == o0.LOADING && this.f17697f.compareAndSet(false, true)) {
            this.f17706o.s(this.f17703l);
            this.f17706o.p(this.f17692a);
            this.f17706o.t(this.f17712u);
            this.f17706o.K(this.f17694c);
            setViewState(o0.DEFAULT);
            N();
            J();
            this.f17707p.k(this, str, this.f17706o.J(), this.f17706o.M());
        }
    }

    private boolean C() {
        return this.f17699h.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String E() {
        return "Callback - can't parse privacy sheet";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G(String str) {
        this.f17707p.i(this, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I(String str) {
        if (str == null || !str.isEmpty()) {
            return;
        }
        v(str);
    }

    private void J() {
        if (this.f17698g.compareAndSet(false, true)) {
            this.f17706o.P();
        }
    }

    private void L() {
        if (this.f17700i.compareAndSet(false, true)) {
            this.f17707p.f(this);
        }
    }

    private void N() {
        this.f17706o.Q(this.f17712u);
        if (P() && this.f17712u) {
            J();
            L();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public b1 getCurrentMraidWebViewController() {
        b1 b1Var = this.f17709r;
        return b1Var != null ? b1Var : this.f17706o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        this.f17707p.g(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(c7.b bVar) {
        if (!P()) {
            this.f17707p.e(this, bVar);
        } else if (C()) {
            this.f17707p.q(this, bVar);
        } else {
            this.f17707p.m(this, bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(String str) {
        b1 b1Var;
        if (O()) {
            return;
        }
        o0 o0Var = this.f17710s;
        if (o0Var == o0.DEFAULT || o0Var == o0.RESIZED) {
            if (str == null || this.f17707p.c(this)) {
                b1Var = this.f17706o;
            } else {
                try {
                    String strDecode = URLDecoder.decode(str, Constants.ENCODING);
                    if (!wb.d0.u(strDecode)) {
                        strDecode = this.f17693b + strDecode;
                    }
                    b1Var = new b1(getContext(), new g(), this.f17695d);
                    this.f17709r = b1Var;
                    b1Var.N(strDecode);
                } catch (UnsupportedEncodingException unused) {
                    return;
                }
            }
            if (this.f17707p.n(this, b1Var.J(), b1Var.I(), b1Var.M())) {
                setViewState(o0.EXPANDED);
                this.f17707p.h(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(String str, wb.i iVar) {
        this.f17701j.set(true);
        this.f17711t.l();
        if (this.f17704m.a(str)) {
            iVar.execute(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        this.f17707p.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r(String str) {
        pb.a1 a1VarC = qb.e.c(str);
        if (a1VarC == null) {
            b0.e("MraidAdView", new id.a() { // from class: io.bidmachine.iab.mraid.h
                @Override // id.a
                public final Object invoke() {
                    return i.E();
                }
            });
        } else {
            this.f17707p.o(this, a1VarC);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        b1 b1Var = this.f17709r;
        if (b1Var == null) {
            return;
        }
        b1Var.s(this.f17703l);
        this.f17709r.p(this.f17692a);
        this.f17709r.t(this.f17712u);
        this.f17709r.r(this.f17710s);
        this.f17709r.K(this.f17694c);
        this.f17709r.P();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v(String str) {
        n(str, new wb.i() { // from class: io.bidmachine.iab.mraid.g
            @Override // wb.i
            public final void execute(Object obj) {
                this.f17683a.G((String) obj);
            }
        });
    }

    public void D() {
        this.f17711t.l();
        this.f17706o.E();
        b1 b1Var = this.f17709r;
        if (b1Var != null) {
            b1Var.E();
        }
    }

    public void M(g7.e eVar) {
        this.f17711t.m(eVar);
    }

    public boolean O() {
        return this.f17692a == h0.INTERSTITIAL;
    }

    public boolean P() {
        return this.f17697f.get();
    }

    public boolean Q() {
        return this.f17701j.get();
    }

    public boolean R() {
        return this.f17706o.L();
    }

    public boolean S() {
        return this.f17706o.M();
    }

    public void T(String str) {
        if (str == null) {
            i(c7.b.h("Html data are null"));
        } else {
            this.f17706o.O(this.f17693b, str, this.f17708q);
        }
    }

    public void U(boolean z10) {
        this.f17712u = z10;
        b1 b1Var = this.f17709r;
        if (b1Var != null) {
            b1Var.Q(z10);
        } else {
            N();
        }
    }

    public void V() {
        if (this.f17699h.compareAndSet(false, true) && P()) {
            J();
        }
    }

    public String getBaseUrl() {
        return this.f17693b;
    }

    public g0 getLastOrientationProperties() {
        return this.f17706o.I();
    }

    public o0 getMraidViewState() {
        return this.f17710s;
    }

    public WebView getWebView() {
        return this.f17706o.J();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f17702k.onTouchEvent(motionEvent)) {
            motionEvent.setAction(3);
        }
        return super.onTouchEvent(motionEvent);
    }

    void setViewState(o0 o0Var) {
        this.f17710s = o0Var;
        this.f17706o.r(o0Var);
        b1 b1Var = this.f17709r;
        if (b1Var != null) {
            b1Var.r(o0Var);
        }
    }

    public void w() {
        setViewState(o0.HIDDEN);
    }

    public void x() {
        b1 b1Var = this.f17709r;
        if (b1Var != null) {
            b1Var.E();
            this.f17709r = null;
        } else {
            s0 s0VarJ = this.f17706o.J();
            if (s0VarJ.getParent() != this) {
                wb.g0.a(this, s0VarJ);
            }
        }
        setViewState(o0.DEFAULT);
        N();
    }

    public void y() {
        wb.g0.a(this, this.f17706o.J());
        setViewState(o0.DEFAULT);
    }

    i(Context context, h0 h0Var, String str, final String str2, List list, String str3, Long l10, final List list2, d dVar, b1 b1Var) {
        super(context);
        this.f17705n = new j1();
        this.f17712u = false;
        this.f17692a = h0Var;
        this.f17693b = str;
        this.f17696e = str2;
        this.f17694c = str3;
        long jLongValue = l10 != null ? l10.longValue() : 0L;
        this.f17695d = jLongValue;
        this.f17708q = list2;
        this.f17707p = dVar;
        this.f17697f = new AtomicBoolean(false);
        this.f17698g = new AtomicBoolean(false);
        this.f17699h = new AtomicBoolean(false);
        this.f17700i = new AtomicBoolean(false);
        this.f17701j = new AtomicBoolean(false);
        this.f17702k = new GestureDetector(context, new c());
        d0 d0Var = new d0(context, (List<String>) list);
        this.f17703l = d0Var;
        this.f17704m = new e0(d0Var);
        b1Var = b1Var == null ? new b1(context, new f(), jLongValue) : b1Var;
        this.f17706o = b1Var;
        addView(b1Var.J(), new FrameLayout.LayoutParams(-1, -1, 17));
        this.f17711t = new io.bidmachine.iab.mraid.c(new id.a() { // from class: io.bidmachine.iab.mraid.d
            @Override // id.a
            public final Object invoke() {
                return this.f17669a.getCurrentMraidWebViewController();
            }
        }, new id.a() { // from class: io.bidmachine.iab.mraid.e
            @Override // id.a
            public final Object invoke() {
                return i.g(list2);
            }
        }, new Runnable() { // from class: io.bidmachine.iab.mraid.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f17680a.I(str2);
            }
        });
        this.f17710s = o0.LOADING;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List g(List list) {
        return list;
    }
}
