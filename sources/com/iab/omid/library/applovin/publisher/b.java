package com.iab.omid.library.applovin.publisher;

import android.content.Context;
import android.os.Handler;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import com.iab.omid.library.applovin.internal.g;
import com.iab.omid.library.applovin.internal.h;
import com.iab.omid.library.applovin.utils.f;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class b extends AdSessionStatePublisher {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private WebView f12606g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Long f12607h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<String, VerificationScriptResource> f12608i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f12609j;

    class a extends WebViewClient {
        a() {
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            return b.this.a(webView, renderProcessGoneDetail);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            return com.iab.omid.library.applovin.webviewclient.a.a(webResourceRequest.getUrl().toString());
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return com.iab.omid.library.applovin.webviewclient.a.a(str);
        }
    }

    /* JADX INFO: renamed from: com.iab.omid.library.applovin.publisher.b$b, reason: collision with other inner class name */
    class C0163b extends WebViewClient {
        C0163b() {
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            return b.this.a(webView, renderProcessGoneDetail);
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WebView f12612a;

        c() {
            this.f12612a = b.this.f12606g;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f12612a.destroy();
        }
    }

    public b(String str, Map<String, VerificationScriptResource> map, String str2) {
        super(str);
        this.f12607h = null;
        this.f12608i = map;
        this.f12609j = str2;
    }

    private WebViewClient c(boolean z10) {
        return z10 ? k() : j();
    }

    private WebViewClient j() {
        return new C0163b();
    }

    private WebViewClient k() {
        return new a();
    }

    @Override // com.iab.omid.library.applovin.publisher.AdSessionStatePublisher
    public void b() {
        super.b();
        new Handler().postDelayed(new c(), Math.max(4000 - (this.f12607h == null ? 4000L : TimeUnit.MILLISECONDS.convert(f.b() - this.f12607h.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f12606g = null;
    }

    @Override // com.iab.omid.library.applovin.publisher.AdSessionStatePublisher
    public void i() {
        super.i();
        l();
    }

    void l() {
        Context contextA = g.b().a();
        WebView webView = new WebView(contextA);
        this.f12606g = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f12606g.getSettings().setAllowContentAccess(false);
        this.f12606g.getSettings().setAllowFileAccess(false);
        this.f12606g.setWebViewClient(c(a(com.iab.omid.library.applovin.attestation.g.a(this.f12606g), contextA)));
        a(this.f12606g);
        h.a().c(this.f12606g, this.f12609j);
        for (String str : this.f12608i.keySet()) {
            h.a().d(this.f12606g, this.f12608i.get(str).getResourceUrl().toExternalForm(), str);
        }
        this.f12607h = Long.valueOf(f.b());
    }

    @Override // com.iab.omid.library.applovin.publisher.AdSessionStatePublisher
    public void a(com.iab.omid.library.applovin.adsession.a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String str : injectedResourcesMap.keySet()) {
            com.iab.omid.library.applovin.utils.c.a(jSONObject, str, injectedResourcesMap.get(str).toJsonObject());
        }
        a(aVar, adSessionContext, jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        Log.w("NativeBridge", "WebView renderer gone: " + renderProcessGoneDetail.toString() + " for WebView: " + webView);
        if (getWebView() == webView) {
            Log.w("NativeBridge", "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
            a((WebView) null);
        }
        if (webView == null) {
            return true;
        }
        webView.destroy();
        return true;
    }

    private boolean a(boolean z10, Context context) {
        return !z10 && com.iab.omid.library.applovin.attestation.c.a(context).b();
    }
}
