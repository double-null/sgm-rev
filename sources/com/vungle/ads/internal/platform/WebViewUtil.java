package com.vungle.ads.internal.platform;

import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.util.Logger;
import kotlin.jvm.internal.t;
import wc.r;
import wc.s;

/* JADX INFO: compiled from: WebViewUtil.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class WebViewUtil {
    public static final WebViewUtil INSTANCE = new WebViewUtil();
    private static final String TAG = "WebViewUtil";

    private WebViewUtil() {
    }

    public final void applyWebSettings(WebView webView, AdPayload.WebViewSettings webViewSettings) {
        Boolean allowUniversalAccessFromFileUrls;
        Boolean allowFileAccessFromFileUrls;
        t.f(webView, "webView");
        WebSettings settings = webView.getSettings();
        t.e(settings, "webView.settings");
        settings.setBuiltInZoomControls(false);
        settings.setJavaScriptEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setSaveFormData(true);
        settings.setUseWideViewPort(false);
        settings.setAllowFileAccess(true);
        settings.setAllowFileAccessFromFileURLs((webViewSettings == null || (allowFileAccessFromFileUrls = webViewSettings.getAllowFileAccessFromFileUrls()) == null) ? false : allowFileAccessFromFileUrls.booleanValue());
        settings.setAllowUniversalAccessFromFileURLs((webViewSettings == null || (allowUniversalAccessFromFileUrls = webViewSettings.getAllowUniversalAccessFromFileUrls()) == null) ? false : allowUniversalAccessFromFileUrls.booleanValue());
        webView.setVisibility(4);
        settings.setMediaPlaybackRequiresUserGesture(false);
    }

    public final void getUserAgent(Context context, w.b<String> consumer) {
        Object objC;
        t.f(context, "context");
        t.f(consumer, "consumer");
        try {
            r.a aVar = r.f27774b;
            objC = r.c(WebSettings.getDefaultUserAgent(context));
        } catch (Throwable th) {
            r.a aVar2 = r.f27774b;
            objC = r.c(s.a(th));
        }
        if (r.n(objC)) {
            consumer.accept((String) objC);
        }
        Throwable thG = r.g(objC);
        if (thG != null) {
            Logger.Companion.e(TAG, "Failed to get user agent", thG);
            consumer.accept(null);
        }
    }
}
