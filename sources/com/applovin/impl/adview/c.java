package com.applovin.impl.adview;

import android.content.Intent;
import android.net.Uri;
import android.net.http.SslError;
import android.view.MotionEvent;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.android.billingclient.gp.VRfCTjjLv;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.d8;
import com.applovin.impl.f2;
import com.applovin.impl.h2;
import com.applovin.impl.n7;
import com.applovin.impl.q7;
import com.applovin.impl.r7;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u7;
import com.applovin.impl.v4;
import com.applovin.impl.z4;
import com.applovin.sdk.AppLovinAdSize;
import com.facebook.GraphResponse;
import com.facebook.internal.ServerProtocol;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import pb.vBC.NyXuoef;

/* JADX INFO: loaded from: classes2.dex */
public class c extends v4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f6048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.p f6049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f6050c;

    public c(a aVar, com.applovin.impl.sdk.l lVar) {
        this.f6048a = lVar;
        this.f6049b = lVar.Q();
        this.f6050c = aVar;
    }

    private void b() {
        this.f6050c.y();
    }

    private void c() {
        this.f6050c.a();
    }

    @Override // com.applovin.impl.v4
    protected Map a() {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("name", "AdWebViewClient");
        mapHashMap.putAll(h2.a((AppLovinAdImpl) this.f6050c.g()));
        return mapHashMap;
    }

    protected a d() {
        return this.f6050c;
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
        if (com.applovin.impl.sdk.p.a()) {
            this.f6049b.d("AdWebView", "Loaded resource: " + str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        if (com.applovin.impl.sdk.p.a()) {
            this.f6049b.d("AdWebView", "Loaded URL: " + str);
        }
        this.f6050c.a(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        onReceivedError(webView, webResourceError.getErrorCode(), webResourceError.getDescription().toString(), webResourceRequest.getUrl().toString());
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        com.applovin.impl.sdk.ad.b bVarG = this.f6050c.g();
        if (com.applovin.impl.sdk.p.a()) {
            this.f6049b.b("AdWebView", "Received HTTP error: " + webResourceResponse + "for url: " + webResourceRequest.getUrl() + " and ad: " + bVarG);
        }
        if (q7.a(webResourceRequest.getUrl().toString(), this.f6048a)) {
            this.f6048a.E().a("adWebViewReceivedHttpError", webResourceRequest.getUrl().toString(), webResourceResponse.getStatusCode(), webResourceResponse.getReasonPhrase());
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        com.applovin.impl.sdk.ad.b bVarG = this.f6050c.g();
        String str = "Received SSL error: " + sslError;
        if (com.applovin.impl.sdk.p.a()) {
            this.f6049b.b("AdWebView", str + " for ad: " + bVarG);
        }
    }

    @Override // com.applovin.impl.v4, android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.render_process_gone"), null);
        com.applovin.impl.sdk.ad.b bVarG = this.f6050c.g();
        com.applovin.impl.sdk.p.h("AdWebView", "Render process gone for ad: " + bVarG + ". Process did crash: " + renderProcessGoneDetail.didCrash());
        boolean zOnRenderProcessGone = super.onRenderProcessGone(webView, renderProcessGoneDetail);
        if (((Boolean) this.f6048a.a(z4.X5)).booleanValue()) {
            a(webView, renderProcessGoneDetail, bVarG);
        }
        return zOnRenderProcessGone;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url = webResourceRequest.getUrl();
        if (url != null) {
            return a(webView, url.toString());
        }
        if (!com.applovin.impl.sdk.p.a()) {
            return false;
        }
        this.f6049b.b(VRfCTjjLv.ORXD, "No url found for request");
        return false;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i10, String str, String str2) {
        super.onReceivedError(webView, i10, str, str2);
        com.applovin.impl.sdk.ad.b bVarG = this.f6050c.g();
        String str3 = "Received error with error code: " + i10 + NyXuoef.Daj + str + "\\' for URL: " + str2;
        if (com.applovin.impl.sdk.p.a()) {
            this.f6049b.b("AdWebView", str3 + " for ad: " + bVarG);
        }
        if (q7.a(str2, this.f6048a)) {
            this.f6048a.E().a("adWebViewReceivedError", str2, i10, str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:151:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:78:0x0160  */
    protected boolean a(WebView webView, String str) {
        boolean z10;
        if (this.f6050c == null) {
            return true;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.f6049b.d("AdWebView", "Processing click on ad URL \"" + str + "\"");
        }
        if (str != null && (webView instanceof b)) {
            Uri uri = Uri.parse(str);
            b bVar = (b) webView;
            String scheme = uri.getScheme();
            String host = uri.getHost();
            String path = uri.getPath();
            com.applovin.impl.sdk.ad.b bVarG = this.f6050c.g();
            if (bVarG == null) {
                if (com.applovin.impl.sdk.p.a()) {
                    this.f6049b.b("AdWebView", "Unable to process click, ad not found!");
                }
                return true;
            }
            boolean zA = bVar.a();
            if ("applovin".equals(scheme) && "com.applovin.sdk".equals(host)) {
                if ("/vibrate".equals(path)) {
                    long j10 = StringUtils.parseLong(uri.getQueryParameter("duration_ms"), 0L);
                    if (j10 > 0) {
                        q7.a(StringUtils.parseFloat(uri.getQueryParameter("intensity"), 0.5f), j10, this.f6048a);
                    }
                } else if ("/adservice/close_ad".equals(path)) {
                    b();
                } else if ("/adservice/expand_ad".equals(path)) {
                    if (a(zA, bVarG, uri)) {
                        if (com.applovin.impl.sdk.p.a()) {
                            this.f6049b.b("AdWebView", "Skipping expand command without user interaction");
                        }
                        return true;
                    }
                    a(bVar.getLastClickEvent());
                } else if ("/adservice/contract_ad".equals(path)) {
                    c();
                } else {
                    if ("/adservice/no_op".equals(path)) {
                        return true;
                    }
                    if ("/adservice/load_url".equals(path)) {
                        if (a(zA, bVarG, uri)) {
                            if (com.applovin.impl.sdk.p.a()) {
                                this.f6049b.b("AdWebView", "Skipping URL load command without user interaction");
                            }
                            return true;
                        }
                        n7.a(uri, this.f6050c, this.f6048a);
                    } else if ("/adservice/track_click_now".equals(path)) {
                        if (a(zA, bVarG, uri)) {
                            if (com.applovin.impl.sdk.p.a()) {
                                this.f6049b.b("AdWebView", "Skipping click tracking command without user interaction");
                            }
                            return true;
                        }
                        if (bVarG instanceof r7) {
                            a((r7) bVarG, bVar);
                        } else {
                            a(bVar, Uri.parse("/adservice/track_click_now"));
                        }
                    } else if ("/adservice/deeplink".equals(path)) {
                        if (a(zA, bVarG, uri)) {
                            if (com.applovin.impl.sdk.p.a()) {
                                this.f6049b.b("AdWebView", "Skipping deep link plus command without user interaction");
                            }
                            return true;
                        }
                        if (bVarG instanceof r7) {
                            r7 r7Var = (r7) bVarG;
                            if (r7Var.w1()) {
                                a(r7Var, bVar);
                            } else {
                                a(bVar, uri);
                            }
                        } else {
                            a(bVar, uri);
                        }
                    } else if ("/adservice/postback".equals(path)) {
                        n7.a(uri, bVarG, this.f6048a);
                    } else if ("/ga_init".equals(path)) {
                        this.f6050c.c(uri);
                    } else if ("/ga_event".equals(path)) {
                        this.f6050c.b(uri);
                    } else if ("/playable_event".equals(path)) {
                        a(uri);
                    } else if ("/save_template_state".equals(path)) {
                        bVarG.b(uri.getQueryParameter(ServerProtocol.DIALOG_PARAM_STATE));
                    } else if ("/template_error".equals(path)) {
                        n7.c(uri, bVarG, this.f6048a);
                    } else if ("/adservice/fully_watched".equals(path)) {
                        this.f6050c.z();
                    } else if ("/adservice/preload".equals(path)) {
                        n7.b(uri, bVarG, this.f6048a);
                    } else if ("/adservice/custom_intent".equals(path)) {
                        n7.a(uri, bVarG, this.f6050c.i(), this.f6048a);
                    } else if ("/config_system_bars".equals(path)) {
                        this.f6050c.a(uri);
                    } else if ("/save_template_stage_info".equals(path)) {
                        bVarG.c(uri.getQueryParameter("stage_info"));
                    } else {
                        if (com.applovin.impl.sdk.p.a()) {
                            this.f6049b.k("AdWebView", "Unknown URL: " + str);
                        }
                        if (com.applovin.impl.sdk.p.a()) {
                            this.f6049b.k("AdWebView", "Path: " + path);
                        }
                    }
                }
            } else {
                Iterator it = bVarG.Y().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z10 = true;
                        break;
                    }
                    String str2 = (String) it.next();
                    if (StringUtils.isValidString(path) && path.contains(str2)) {
                        z10 = false;
                        break;
                    }
                }
                if (!zA) {
                    boolean zX0 = bVarG.X0();
                    boolean z11 = zX0 ? false : z10;
                    a(uri, zX0, bVarG, this.f6048a);
                    z10 = z11;
                }
                if (z10) {
                    List listR0 = bVarG.r0();
                    List listQ0 = bVarG.q0();
                    if ((!listR0.isEmpty() && !listR0.contains(scheme)) || (!listQ0.isEmpty() && !listQ0.contains(host))) {
                        if (com.applovin.impl.sdk.p.a()) {
                            this.f6049b.b("AdWebView", "URL is not whitelisted - bypassing click");
                        }
                    } else if (bVarG instanceof r7) {
                        r7 r7Var2 = (r7) bVarG;
                        if (r7Var2.w1()) {
                            a(r7Var2, bVar);
                        } else {
                            a(bVar, uri);
                        }
                    } else {
                        a(bVar, uri);
                    }
                }
            }
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return a(webView, str);
    }

    private void a(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail, com.applovin.impl.sdk.ad.b bVar) {
        if (renderProcessGoneDetail.didCrash() && ((Boolean) this.f6048a.a(z4.f9221e6)).booleanValue()) {
            throw new RuntimeException("Render process crashed. This is likely caused by a crash in an AppLovin ad with ID: " + (bVar != null ? String.valueOf(bVar.getAdIdNumber()) : "null"));
        }
        if (webView == null || !webView.equals(this.f6050c.f())) {
            return;
        }
        this.f6050c.a(((Boolean) this.f6048a.a(z4.f9231f7)).booleanValue());
        AppLovinAdSize appLovinAdSizeK = this.f6050c.k();
        if (q7.a(appLovinAdSizeK)) {
            this.f6050c.a(appLovinAdSizeK);
            this.f6050c.D();
        }
    }

    private boolean a(boolean z10, com.applovin.impl.sdk.ad.b bVar, Uri uri) {
        if (z10) {
            return false;
        }
        boolean zY0 = bVar.Y0();
        a(uri, zY0, bVar, this.f6048a);
        return zY0;
    }

    private static void a(Uri uri, boolean z10, com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.l lVar) {
        if (lVar.c(z4.V6).contains(uri.getScheme())) {
            return;
        }
        lVar.E().d(f2.S0, a(bVar, uri, z10));
    }

    private static Map a(com.applovin.impl.sdk.ad.b bVar, Uri uri, boolean z10) {
        Map mapA = h2.a((AppLovinAdImpl) bVar);
        CollectionUtils.putStringIfValid("url", uri.toString(), mapA);
        CollectionUtils.putStringIfValid("is_blocked_auto_redirect", String.valueOf(z10), mapA);
        return mapA;
    }

    private void a(MotionEvent motionEvent) {
        this.f6050c.a(motionEvent);
    }

    private void a(r7 r7Var, b bVar) {
        u7 u7VarG1 = r7Var.g1();
        if (u7VarG1 != null) {
            d8.a(u7VarG1.b(), this.f6050c.j());
            a(bVar, u7VarG1.c());
        }
    }

    private void a(b bVar, Uri uri) {
        com.applovin.impl.sdk.ad.b currentAd = bVar.getCurrentAd();
        AppLovinAdView appLovinAdViewI = this.f6050c.i();
        if (appLovinAdViewI != null && currentAd != null) {
            if (currentAd instanceof r7) {
                ((r7) currentAd).getAdEventTracker().v();
            }
            this.f6050c.a(currentAd, appLovinAdViewI, uri, bVar.getAndClearLastClickEvent());
        } else if (com.applovin.impl.sdk.p.a()) {
            this.f6049b.b("AdWebView", "Attempting to track click that is null or not an ApplovinAdView instance for clickedUri = " + uri);
        }
    }

    private void a(Uri uri) {
        String str;
        boolean booleanQueryParameter = uri.getBooleanQueryParameter(GraphResponse.SUCCESS_KEY, false);
        String queryParameter = uri.getQueryParameter("type");
        if (booleanQueryParameter) {
            str = "Tracked event: " + queryParameter;
        } else {
            str = "Failed to track event: " + queryParameter;
        }
        q7.a(str, com.applovin.impl.sdk.l.p());
    }
}
