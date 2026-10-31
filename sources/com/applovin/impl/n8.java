package com.applovin.impl;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import com.adjust.sdk.Constants;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinPostbackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import com.facebook.share.internal.ShareConstants;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import rd.PSo.cNMUz;

/* JADX INFO: loaded from: classes2.dex */
public class n8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f7708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.p f7709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WebView f7710c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f7711d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set f7712e = Collections.synchronizedSet(new HashSet());

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: loaded from: classes.dex */
    class a extends v4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f7713a;

        public a(boolean z10) {
            this.f7713a = z10;
        }

        @Override // com.applovin.impl.v4
        protected Map a() {
            return CollectionUtils.hashMap("name", "WebTrackerManagerWebViewClient");
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            if (this.f7713a) {
                com.applovin.impl.sdk.p unused = n8.this.f7709b;
                if (com.applovin.impl.sdk.p.a()) {
                    n8.this.f7709b.a("WebTrackerManager", "Successfully initialized web view for postbacks");
                }
                n8.this.f7711d = true;
            }
        }

        @Override // com.applovin.impl.v4, android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (webView == n8.this.f7710c) {
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.wc
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f9037a.b();
                    }
                });
            } else {
                n8.this.b(webView);
            }
            return super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b() {
            n8.this.f7710c.destroy();
            n8.this.f7710c = null;
        }
    }

    public n8(com.applovin.impl.sdk.l lVar) {
        this.f7708a = lVar;
        this.f7709b = lVar.Q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(String str) {
        final WebView webViewA = a(str);
        if (webViewA != null) {
            this.f7712e.add(webViewA);
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.sc
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8187a.b(webViewA);
                }
            }, ((Integer) this.f7708a.a(z4.O2)).intValue());
        } else if (com.applovin.impl.sdk.p.a()) {
            this.f7709b.b("WebTrackerManager", "Failed to fire tracker since web view could not be created");
        }
    }

    public void b() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.vc
            @Override // java.lang.Runnable
            public final void run() {
                this.f8963a.a();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a() {
        WebView webViewA = a("<script>window.al_firePostback = function(url) {\n    setTimeout(function() {\n        var img = new Image();\n        img.src = url;\n    }, 100);\n}\n</script>", true);
        this.f7710c = webViewA;
        if (webViewA == null && com.applovin.impl.sdk.p.a()) {
            this.f7709b.b("WebTrackerManager", "Failed to preload postback web view");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(com.applovin.impl.sdk.network.e eVar, final AppLovinPostbackListener appLovinPostbackListener) {
        final String strAppendQueryParameters = StringUtils.appendQueryParameters(eVar.f(), eVar.i(), ((Boolean) this.f7708a.a(z4.f9299n3)).booleanValue());
        if (this.f7710c == null) {
            WebView webViewA = a("<script>window.al_firePostback = function(url) {\n    setTimeout(function() {\n        var img = new Image();\n        img.src = url;\n    }, 100);\n}\n</script>", true);
            this.f7710c = webViewA;
            if (webViewA == null) {
                if (com.applovin.impl.sdk.p.a()) {
                    this.f7709b.b("WebTrackerManager", "Failed to fire postback since web view could not be created");
                }
                appLovinPostbackListener.onPostbackFailure(strAppendQueryParameters, -1);
                return;
            }
        }
        if (c() && !this.f7711d) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f7709b.b("WebTrackerManager", "Failed to fire postback since web view was not initialized in time");
            }
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("top_main_method", "firePostback");
            mapHashMap.put(ShareConstants.FEED_SOURCE_PARAM, "webViewNotInitialized");
            mapHashMap.put("url", strAppendQueryParameters);
            this.f7708a.E().d(f2.f6499k1, mapHashMap);
            appLovinPostbackListener.onPostbackFailure(strAppendQueryParameters, -1);
            return;
        }
        String str = "al_firePostback('" + strAppendQueryParameters + "')";
        if (((Boolean) this.f7708a.a(z4.U2)).booleanValue()) {
            p8.a(this.f7710c, str, this.f7708a).a(this.f7708a.s0().a("evaluateJavascriptPromise"), new u4.b() { // from class: com.applovin.impl.rc
                @Override // com.applovin.impl.u4.b
                public final void a(boolean z10, Object obj, Object obj2) {
                    this.f8142a.a(appLovinPostbackListener, strAppendQueryParameters, z10, (String) obj, (String) obj2);
                }
            });
        } else {
            p8.a(this.f7710c, str);
            appLovinPostbackListener.onPostbackSuccess(strAppendQueryParameters);
        }
    }

    public void a(final com.applovin.impl.sdk.network.e eVar, final AppLovinPostbackListener appLovinPostbackListener) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.tc
            @Override // java.lang.Runnable
            public final void run() {
                this.f8842a.b(eVar, appLovinPostbackListener);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AppLovinPostbackListener appLovinPostbackListener, String str, boolean z10, String str2, String str3) {
        if (z10) {
            appLovinPostbackListener.onPostbackSuccess(str);
            return;
        }
        appLovinPostbackListener.onPostbackFailure(str, -1);
        Map map = CollectionUtils.map("top_main_method", "firePostback");
        map.put(ShareConstants.FEED_SOURCE_PARAM, "evaluateJavascriptFailed");
        map.put("url", str);
        CollectionUtils.putStringIfValid("error_message", str3, map);
        this.f7708a.E().d(f2.f6499k1, map);
    }

    private boolean c() {
        return ((Boolean) this.f7708a.a(z4.T2)).booleanValue();
    }

    private WebView a(String str) {
        return a(str, false);
    }

    private WebView a(String str, boolean z10) {
        q7.b();
        WebView webViewB = q7.b(com.applovin.impl.sdk.l.p(), cNMUz.lvkoCQdcZvcSbYm);
        if (webViewB == null) {
            return null;
        }
        webViewB.getSettings().setJavaScriptEnabled(true);
        webViewB.setWebViewClient(new a(z10 && c()));
        webViewB.loadData("<html><head><link rel=\"icon\" href=\"data:,\">" + str + "</head><body></body></html>", "text/html", Constants.ENCODING);
        return webViewB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(final WebView webView) {
        if (webView == null || !this.f7712e.remove(webView)) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.uc
            @Override // java.lang.Runnable
            public final void run() {
                webView.destroy();
            }
        });
    }

    public void b(final String str) {
        if (!AppLovinSdkUtils.isValidString(str)) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f7709b.b("WebTrackerManager", "Failed to fire tracker due to empty script string");
            }
        } else {
            if (!str.startsWith("<script")) {
                if (com.applovin.impl.sdk.p.a()) {
                    this.f7709b.b("WebTrackerManager", "Failed to fire tracker due to improperly formatted script tag");
                    return;
                }
                return;
            }
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.qc
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8021a.c(str);
                }
            });
        }
    }
}
