package io.bidmachine.iab.mraid;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.adjust.sdk.Constants;
import com.applovin.mediation.ads.Zfi.OgqfiHA;
import com.google.firebase.provider.fH.UyXgnuLGEkgnZE;
import com.vungle.ads.internal.network.converters.vY.vgmm;
import java.io.ByteArrayInputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import s.sBoZ.TwDPD;

/* JADX INFO: loaded from: classes4.dex */
public class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f17619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f17620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final s0 f17621c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f17622d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final f7.c f17623e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final w f17624f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f17625g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f17626h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private o0 f17627i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private g0 f17628j;

    public interface a {
        void b();

        void c(String str);

        void d(String str);

        void e(String str);

        void f(String str);

        void g(String str);

        void h(String str);

        void i(String str);

        void j(g0 g0Var);

        void l(c7.b bVar);

        void onClose();

        void t(boolean z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    class c extends WebViewClient {
        private c() {
        }

        private WebResourceResponse e() {
            String strI = l0.i();
            Charset charset = StandardCharsets.UTF_8;
            return new WebResourceResponse("text/javascript", charset.name(), new ByteArrayInputStream(strI.getBytes(charset)));
        }

        private void f(final String str, final String str2, final int i10) {
            b0.c("MraidWebViewController", new id.a() { // from class: io.bidmachine.iab.mraid.e1
                @Override // id.a
                public final Object invoke() {
                    return b1.c.j(str, str2, i10);
                }
            });
            if (str2 == null || !str2.contains("ERR_INTERNET_DISCONNECTED")) {
                return;
            }
            b1.this.f17626h = true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String j(String str, String str2, int i10) {
            return "onError: " + str + " / " + str2 + " / " + i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String k() {
            return "onPageStarted";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String l() {
            return "onRenderProcessGone";
        }

        boolean g(Uri uri) {
            return "mraid.js".equals(uri.getLastPathSegment());
        }

        boolean h(String str) {
            return g(Uri.parse(str.toLowerCase(Locale.US)));
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            b0.c("MraidWebViewController", new id.a() { // from class: io.bidmachine.iab.mraid.f1
                @Override // id.a
                public final Object invoke() {
                    return UyXgnuLGEkgnZE.fPfEfdAHquMO;
                }
            });
            if (b1.this.f17622d.compareAndSet(false, true)) {
                b1.this.f17619a.i(str);
                b1.this.f17621c.i();
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            b0.c("MraidWebViewController", new id.a() { // from class: io.bidmachine.iab.mraid.d1
                @Override // id.a
                public final Object invoke() {
                    return b1.c.k();
                }
            });
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            Uri url = webResourceRequest.getUrl();
            f(url != null ? url.toString() : null, webResourceError.getDescription().toString(), webResourceError.getErrorCode());
            super.onReceivedError(webView, webResourceRequest, webResourceError);
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            b0.c("MraidWebViewController", new id.a() { // from class: io.bidmachine.iab.mraid.c1
                @Override // id.a
                public final Object invoke() {
                    return b1.c.l();
                }
            });
            b1.this.E();
            b1.this.f17619a.l(c7.b.f("WebViewClient - onRenderProcessGone"));
            return true;
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            return g(webResourceRequest.getUrl()) ? e() : super.shouldInterceptRequest(webView, webResourceRequest);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (str.startsWith(vgmm.WKCkpEMbROIJJ)) {
                b1.this.k(str);
                return true;
            }
            if (d7.d.h(str)) {
                d7.d.g(b1.this.f17621c, str);
                return true;
            }
            b1.this.A(str);
            return true;
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            if (h(str)) {
                return e();
            }
            return super.shouldInterceptRequest(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            f(str2, str, i10);
            super.onReceivedError(webView, i10, str, str2);
        }
    }

    private class d implements g1 {
        private d() {
        }

        @Override // io.bidmachine.iab.mraid.g1
        public void a(i0 i0Var) {
            if (!b1.this.f17622d.get() || b1.this.f17627i == o0.HIDDEN) {
                return;
            }
            b1.this.q(i0Var);
        }
    }

    public b1(Context context, a aVar, long j10) {
        this.f17619a = aVar;
        this.f17620b = j10;
        s0 s0Var = new s0(context, this);
        this.f17621c = s0Var;
        s0Var.setWebViewClient(new c());
        s0Var.setMraidWebViewListener(new d());
        this.f17625g = false;
        this.f17626h = false;
        this.f17627i = o0.LOADING;
        this.f17622d = new AtomicBoolean(false);
        this.f17623e = new f7.c(s0Var);
        this.f17624f = new w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A(String str) {
        if (!this.f17621c.n()) {
            b0.c("MraidWebViewController", new id.a() { // from class: io.bidmachine.iab.mraid.u0
                @Override // id.a
                public final Object invoke() {
                    return b1.v();
                }
            });
        } else {
            this.f17619a.d(str);
            this.f17621c.l();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String C() {
        return "mraid.resize is not supported";
    }

    private void D(String str) {
        if (this.f17620b == 0 || System.currentTimeMillis() - this.f17621c.getClickTimeMs() > this.f17620b) {
            return;
        }
        this.f17619a.g(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String F() {
        return "data is null or empty";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String G() {
        return "data must be base64 encoded json";
    }

    private void H() {
        K("mraid.nativeCallComplete();");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String h() {
        return "handleJsCommand not found";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(final String str) {
        b0.c("MraidWebViewController", new id.a() { // from class: io.bidmachine.iab.mraid.v0
            @Override // id.a
            public final Object invoke() {
                return b1.w(str);
            }
        });
        try {
            Map<String, String> mapR = l0.r(str);
            if (mapR == null) {
                return;
            }
            String str2 = mapR.get("command");
            if (str2 == null) {
                b0.i("MraidWebViewController", new id.a() { // from class: io.bidmachine.iab.mraid.w0
                    @Override // id.a
                    public final Object invoke() {
                        return b1.h();
                    }
                });
            } else {
                l(str2, mapR);
                H();
            }
        } catch (Throwable th) {
            b0.f("MraidWebViewController", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String v() {
        return "Can't open url because webView wasn't clicked";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String w(String str) {
        return "handleJsCommand - " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String z() {
        return "url is null or empty";
    }

    public void E() {
        this.f17623e.g();
        s0 s0Var = this.f17621c;
        g7.y.u(s0Var);
        s0Var.destroy();
    }

    public g0 I() {
        return this.f17628j;
    }

    public s0 J() {
        return this.f17621c;
    }

    public void K(String str) {
        this.f17623e.h(str);
    }

    public boolean L() {
        return this.f17626h;
    }

    public boolean M() {
        return this.f17625g;
    }

    public void N(String str) {
        this.f17622d.set(false);
        this.f17621c.loadUrl(str);
    }

    public void O(String str, String str2, List<pb.f1> list) {
        this.f17622d.set(false);
        if (list != null) {
            this.f17623e.j(str, list);
        }
        this.f17624f.e(list);
        this.f17621c.loadDataWithBaseURL(str, this.f17623e.k(l0.t(str2), com.google.firebase.crashlytics.internal.common.m.a(new Object[]{pb.f1.b("mraid", 0, l0.i(), true), pb.f1.a("jsbridge", 1, d7.d.i())})), "text/html", Constants.ENCODING, null);
        o(b0.f17612c);
    }

    public void P() {
        K("mraid.fireReadyEvent();");
    }

    public void Q(boolean z10) {
        this.f17621c.j(z10);
        if (this.f17622d.get()) {
            t(z10);
        }
    }

    public void n(Point point) {
        K(this.f17624f.c(point));
    }

    public void o(int i10) {
        if (i10 == 3) {
            K("mraid.logLevel = mraid.LogLevelEnum.DEBUG;");
            return;
        }
        if (i10 == 4) {
            K("mraid.logLevel = mraid.LogLevelEnum.INFO;");
            return;
        }
        if (i10 == 5) {
            K("mraid.logLevel = mraid.LogLevelEnum.WARNING;");
        } else if (i10 == 6) {
            K("mraid.logLevel = mraid.LogLevelEnum.ERROR;");
        } else {
            K("mraid.logLevel = mraid.LogLevelEnum.NONE;");
        }
    }

    public void p(h0 h0Var) {
        if (h0Var == null) {
            return;
        }
        K("mraid.setPlacementType('" + h0Var.c() + "');");
    }

    public void r(o0 o0Var) {
        this.f17627i = o0Var;
        K("mraid.fireStateChangeEvent('" + o0Var.c() + "');");
    }

    public void s(d0 d0Var) {
        K("mraid.setSupports(mraid.SUPPORTED_FEATURES.CALENDAR, " + d0Var.b() + ");mraid.setSupports(mraid.SUPPORTED_FEATURES.INLINEVIDEO, " + d0Var.c() + ");mraid.setSupports(mraid.SUPPORTED_FEATURES.SMS, " + d0Var.d() + ");mraid.setSupports(mraid.SUPPORTED_FEATURES.STOREPICTURE, " + d0Var.e() + ");mraid.setSupports(mraid.SUPPORTED_FEATURES.TEL, " + d0Var.f() + ");");
    }

    public void t(boolean z10) {
        K("mraid.fireViewableChangeEvent(" + z10 + ");");
    }

    private void l(String str, Map map) {
        str.hashCode();
        switch (str) {
            case "playVideo":
                this.f17619a.c((String) map.get("url"));
                break;
            case "openPrivacySheet":
                String str2 = (String) map.get("data");
                if (TextUtils.isEmpty(str2)) {
                    b0.e("MraidWebViewController", new id.a() { // from class: io.bidmachine.iab.mraid.z0
                        @Override // id.a
                        public final Object invoke() {
                            return b1.F();
                        }
                    });
                    break;
                } else {
                    try {
                        this.f17619a.f(new String(Base64.decode(str2, 2)));
                    } catch (Throwable unused) {
                        b0.e("MraidWebViewController", new id.a() { // from class: io.bidmachine.iab.mraid.a1
                            @Override // id.a
                            public final Object invoke() {
                                return b1.G();
                            }
                        });
                        return;
                    }
                    break;
                }
                break;
            case "expand":
                D((String) map.get("url"));
                break;
            case "loaded":
                this.f17619a.b();
                break;
            case "noFill":
                this.f17619a.l(c7.b.g("Fired noFill event from mraid.js"));
                break;
            case "resize":
                b0.c("MraidWebViewController", new id.a() { // from class: io.bidmachine.iab.mraid.y0
                    @Override // id.a
                    public final Object invoke() {
                        return b1.C();
                    }
                });
                break;
            case "createCalendarEvent":
                this.f17619a.h((String) map.get("eventJSON"));
                break;
            case "open":
                String str3 = (String) map.get("url");
                if (TextUtils.isEmpty(str3)) {
                    b0.e("MraidWebViewController", new id.a() { // from class: io.bidmachine.iab.mraid.x0
                        @Override // id.a
                        public final Object invoke() {
                            return b1.z();
                        }
                    });
                    break;
                } else {
                    A(str3);
                    break;
                }
                break;
            case "close":
                this.f17619a.onClose();
                break;
            case "setOrientationProperties":
                g0 g0Var = new g0(Boolean.parseBoolean((String) map.get(OgqfiHA.IeVX)), g0.a((String) map.get("forceOrientation")));
                this.f17628j = g0Var;
                this.f17619a.j(g0Var);
                break;
            case "storePicture":
                this.f17619a.e((String) map.get("url"));
                break;
            case "useCustomClose":
                boolean z10 = Boolean.parseBoolean((String) map.get("useCustomClose"));
                if (this.f17625g != z10) {
                    this.f17625g = z10;
                    this.f17619a.t(z10);
                    break;
                }
                break;
        }
    }

    public void q(i0 i0Var) {
        Rect rectE = i0Var.e();
        Rect rectD = i0Var.d();
        K("mraid.setScreenSize(" + rectE.width() + "," + rectE.height() + TwDPD.DnsdGmB + rectD.width() + "," + rectD.height() + ");mraid.setCurrentPosition(" + g7.y.x(i0Var.b()) + ");mraid.setDefaultPosition(" + g7.y.x(i0Var.c()) + ");mraid.fireSizeChangeEvent(" + g7.y.y(i0Var.b()) + ");");
    }
}
