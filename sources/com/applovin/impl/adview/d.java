package com.applovin.impl.adview;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;

/* JADX INFO: loaded from: classes.dex */
class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f6052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WebViewRenderProcessClient f6053b = new a();

    d(com.applovin.impl.sdk.l lVar) {
        this.f6052a = lVar;
    }

    WebViewRenderProcessClient a() {
        return this.f6053b;
    }

    class a extends WebViewRenderProcessClient {
        a() {
        }

        @Override // android.webkit.WebViewRenderProcessClient
        public void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
            if (webView instanceof b) {
                com.applovin.impl.sdk.ad.b currentAd = ((b) webView).getCurrentAd();
                d.this.f6052a.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    d.this.f6052a.Q().b("AdWebViewRenderProcessClient", "WebView render process unresponsive for ad: " + currentAd);
                }
            }
        }

        @Override // android.webkit.WebViewRenderProcessClient
        public void onRenderProcessResponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        }
    }
}
