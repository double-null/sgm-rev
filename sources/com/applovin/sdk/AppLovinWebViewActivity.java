package com.applovin.sdk;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.applovin.impl.q7;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.v4;
import com.applovin.impl.z4;
import com.pairip.VMRunner;
import com.vungle.ads.internal.network.converters.vY.vgmm;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class AppLovinWebViewActivity extends Activity {
    public static final String EVENT_DISMISSED_VIA_BACK_BUTTON = "dismissed_via_back_button";
    public static final String INTENT_EXTRA_KEY_IMMERSIVE_MODE_ON = "immersive_mode_on";
    public static final String INTENT_EXTRA_KEY_LOAD_URL = "load_url";
    public static final String INTENT_EXTRA_KEY_SDK_KEY = "sdk_key";
    public static final String URI_PATH_WEBVIEW_EVENT = "webview_event";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f9672a = new AtomicBoolean();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f9673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WebView f9674c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private EventListener f9675d;

    /* JADX INFO: loaded from: classes.dex */
    public interface EventListener {
        void onReceivedEvent(String str);
    }

    public void loadUrl(String str, EventListener eventListener) {
        this.f9675d = eventListener;
        this.f9673b = str;
        this.f9672a.set(false);
        WebView webView = this.f9674c;
        if (webView != null) {
            webView.loadUrl(str);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        EventListener eventListener = this.f9675d;
        if (eventListener != null) {
            eventListener.onReceivedEvent(EVENT_DISMISSED_VIA_BACK_BUTTON);
        }
        super.onBackPressed();
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        VMRunner.invoke("pnl30bODyYXvdx2S", new Object[]{this, bundle});
    }

    class a extends v4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l f9676a;

        a(l lVar) {
            this.f9676a = lVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(l lVar) {
            if (!((Boolean) lVar.a(z4.Y5)).booleanValue() || !AppLovinWebViewActivity.this.f9672a.compareAndSet(false, true)) {
                AppLovinWebViewActivity.this.finish();
                return;
            }
            AppLovinWebViewActivity.this.a(lVar);
            if (StringUtils.isValidString(AppLovinWebViewActivity.this.f9673b)) {
                AppLovinWebViewActivity.this.f9674c.loadUrl(AppLovinWebViewActivity.this.f9673b);
            }
        }

        @Override // com.applovin.impl.v4, android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (AppLovinWebViewActivity.this.f9674c == webView) {
                AppLovinWebViewActivity.this.f9674c.destroy();
                AppLovinWebViewActivity.this.f9674c = null;
                AppLovinWebViewActivity appLovinWebViewActivity = AppLovinWebViewActivity.this;
                final l lVar = this.f9676a;
                appLovinWebViewActivity.runOnUiThread(new Runnable() { // from class: com.applovin.sdk.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f9678a.a(lVar);
                    }
                });
            }
            return super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Uri uri = Uri.parse(str);
            String scheme = uri.getScheme();
            String host = uri.getHost();
            String path = uri.getPath();
            this.f9676a.Q();
            if (p.a()) {
                this.f9676a.Q().a("AppLovinWebViewActivity", "Handling url load: " + str);
            }
            if ("applovin".equalsIgnoreCase(scheme) && "com.applovin.sdk".equalsIgnoreCase(host) && AppLovinWebViewActivity.this.f9675d != null) {
                if (path.endsWith(AppLovinWebViewActivity.URI_PATH_WEBVIEW_EVENT)) {
                    Set<String> queryParameterNames = uri.getQueryParameterNames();
                    String str2 = queryParameterNames.isEmpty() ? vgmm.GrplsRKyjmhaxKy : (String) queryParameterNames.toArray()[0];
                    if (StringUtils.isValidString(str2)) {
                        String queryParameter = uri.getQueryParameter(str2);
                        this.f9676a.Q();
                        if (p.a()) {
                            this.f9676a.Q().a("AppLovinWebViewActivity", "Parsed WebView event parameter name: " + str2 + " and value: " + queryParameter);
                        }
                        AppLovinWebViewActivity.this.f9675d.onReceivedEvent(queryParameter);
                        return true;
                    }
                    this.f9676a.Q();
                    if (p.a()) {
                        this.f9676a.Q().b("AppLovinWebViewActivity", "Failed to parse WebView event parameter");
                        return true;
                    }
                    return true;
                }
                return true;
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }

        @Override // com.applovin.impl.v4
        protected Map a() {
            return CollectionUtils.hashMap("name", "AppLovinWebViewActivity");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(l lVar) {
        WebView webViewB = q7.b(this, "WebView Activity");
        this.f9674c = webViewB;
        if (webViewB == null) {
            finish();
            return;
        }
        setContentView(webViewB);
        WebSettings settings = this.f9674c.getSettings();
        settings.setSupportMultipleWindows(false);
        settings.setJavaScriptEnabled(true);
        this.f9674c.setVerticalScrollBarEnabled(true);
        this.f9674c.setHorizontalScrollBarEnabled(true);
        this.f9674c.setScrollBarStyle(33554432);
        this.f9674c.setWebViewClient(new a(lVar));
    }
}
