package h5;

import a5.d;
import a5.o;
import a5.p;
import android.content.Context;
import android.os.Handler;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import e5.g;
import e5.h;
import i5.f;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class c extends h5.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private WebView f15606g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Long f15607h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<String, o> f15608i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f15609j;

    class a extends WebViewClient {
        a() {
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            return c.this.G(webView, renderProcessGoneDetail);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            return m5.a.b(webResourceRequest.getUrl().toString());
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return m5.a.b(str);
        }
    }

    class b extends WebViewClient {
        b() {
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            return c.this.G(webView, renderProcessGoneDetail);
        }
    }

    /* JADX INFO: renamed from: h5.c$c, reason: collision with other inner class name */
    class RunnableC0238c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WebView f15612a;

        RunnableC0238c() {
            this.f15612a = c.this.f15606g;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f15612a.destroy();
        }
    }

    public c(String str, Map<String, o> map, String str2) {
        super(str);
        this.f15607h = null;
        this.f15608i = map;
        this.f15609j = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean G(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        Log.w("NativeBridge", "WebView renderer gone: " + renderProcessGoneDetail.toString() + " for WebView: " + webView);
        if (C() == webView) {
            Log.w("NativeBridge", "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
            k(null);
        }
        if (webView == null) {
            return true;
        }
        webView.destroy();
        return true;
    }

    private boolean I(boolean z10, Context context) {
        return !z10 && c5.c.a(context).d();
    }

    private WebViewClient J(boolean z10) {
        return z10 ? L() : K();
    }

    private WebViewClient K() {
        return new b();
    }

    private WebViewClient L() {
        return new a();
    }

    @Override // h5.a
    public void E() {
        super.E();
        M();
    }

    void M() {
        Context contextA = g.c().a();
        WebView webView = new WebView(contextA);
        this.f15606g = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f15606g.getSettings().setAllowContentAccess(false);
        this.f15606g.getSettings().setAllowFileAccess(false);
        this.f15606g.setWebViewClient(J(I(c5.g.a(this.f15606g), contextA)));
        k(this.f15606g);
        h.a().r(this.f15606g, this.f15609j);
        for (String str : this.f15608i.keySet()) {
            h.a().s(this.f15606g, this.f15608i.get(str).c().toExternalForm(), str);
        }
        this.f15607h = Long.valueOf(f.b());
    }

    @Override // h5.a
    public void i(p pVar, d dVar) {
        JSONObject jSONObject = new JSONObject();
        Map<String, o> mapG = dVar.g();
        for (String str : mapG.keySet()) {
            i5.c.i(jSONObject, str, mapG.get(str).f());
        }
        j(pVar, dVar, jSONObject);
    }

    @Override // h5.a
    public void s() {
        super.s();
        new Handler().postDelayed(new RunnableC0238c(), Math.max(4000 - (this.f15607h == null ? 4000L : TimeUnit.MILLISECONDS.convert(f.b() - this.f15607h.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f15606g = null;
    }
}
