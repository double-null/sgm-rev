package v5;

import android.content.Context;
import android.os.Handler;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import o5.d;
import o5.n;
import o5.o;
import org.json.JSONObject;
import s5.g;
import s5.h;
import w5.f;

/* JADX INFO: loaded from: classes4.dex */
public class c extends v5.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private WebView f27152g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Long f27153h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<String, n> f27154i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f27155j;

    class a extends WebViewClient {
        a() {
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            return c.this.F(webView, renderProcessGoneDetail);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            return a6.a.b(webResourceRequest.getUrl().toString());
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return a6.a.b(str);
        }
    }

    class b extends WebViewClient {
        b() {
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            return c.this.F(webView, renderProcessGoneDetail);
        }
    }

    /* JADX INFO: renamed from: v5.c$c, reason: collision with other inner class name */
    class RunnableC0450c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WebView f27158a;

        RunnableC0450c() {
            this.f27158a = c.this.f27152g;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f27158a.destroy();
        }
    }

    public c(String str, Map<String, n> map, String str2) {
        super(str);
        this.f27153h = null;
        this.f27154i = map;
        this.f27155j = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean F(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        Log.w("NativeBridge", "WebView renderer gone: " + renderProcessGoneDetail.toString() + " for WebView: " + webView);
        if (B() == webView) {
            Log.w("NativeBridge", "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
            f(null);
        }
        if (webView == null) {
            return true;
        }
        webView.destroy();
        return true;
    }

    private boolean H(boolean z10, Context context) {
        return !z10 && q5.c.b(context).d();
    }

    private WebViewClient I(boolean z10) {
        return z10 ? K() : J();
    }

    private WebViewClient J() {
        return new b();
    }

    private WebViewClient K() {
        return new a();
    }

    @Override // v5.a
    public void D() {
        super.D();
        L();
    }

    void L() {
        Context contextA = g.c().a();
        WebView webView = new WebView(contextA);
        this.f27152g = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f27152g.getSettings().setAllowContentAccess(false);
        this.f27152g.getSettings().setAllowFileAccess(false);
        this.f27152g.setWebViewClient(I(H(q5.g.a(this.f27152g), contextA)));
        f(this.f27152g);
        h.a().q(this.f27152g, this.f27155j);
        for (String str : this.f27154i.keySet()) {
            h.a().r(this.f27152g, this.f27154i.get(str).b().toExternalForm(), str);
        }
        this.f27153h = Long.valueOf(f.b());
    }

    @Override // v5.a
    public void m(o oVar, d dVar) {
        JSONObject jSONObject = new JSONObject();
        Map<String, n> mapG = dVar.g();
        for (String str : mapG.keySet()) {
            w5.c.g(jSONObject, str, mapG.get(str).e());
        }
        n(oVar, dVar, jSONObject);
    }

    @Override // v5.a
    public void r() {
        super.r();
        new Handler().postDelayed(new RunnableC0450c(), Math.max(4000 - (this.f27153h == null ? 4000L : TimeUnit.MILLISECONDS.convert(f.b() - this.f27153h.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f27152g = null;
    }
}
