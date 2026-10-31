package com.vungle.ads.internal.presenter;

import android.content.Context;
import android.webkit.WebView;
import com.vungle.ads.internal.executor.VungleThreadPoolExecutor;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.platform.Platform;
import com.vungle.ads.internal.ui.VungleWebClient;
import com.vungle.ads.internal.util.Logger;
import com.vungle.ads.internal.util.ThreadUtil;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.t;
import wc.g0;

/* JADX INFO: compiled from: WebViewManager.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class WebViewManager {
    private static final String TAG = "WebViewManager";
    public static final WebViewManager INSTANCE = new WebViewManager();
    private static final ReentrantLock lock = new ReentrantLock();
    private static final LinkedHashMap<String, WebViewEntry> webViewCache = new LinkedHashMap<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: WebViewManager.kt */
    static final class WebViewEntry {
        private final WebView webView;
        private final VungleWebClient webViewClient;

        public WebViewEntry(WebView webView, VungleWebClient webViewClient) {
            t.f(webView, "webView");
            t.f(webViewClient, "webViewClient");
            this.webView = webView;
            this.webViewClient = webViewClient;
        }

        public static /* synthetic */ WebViewEntry copy$default(WebViewEntry webViewEntry, WebView webView, VungleWebClient vungleWebClient, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                webView = webViewEntry.webView;
            }
            if ((i10 & 2) != 0) {
                vungleWebClient = webViewEntry.webViewClient;
            }
            return webViewEntry.copy(webView, vungleWebClient);
        }

        public final WebView component1() {
            return this.webView;
        }

        public final VungleWebClient component2() {
            return this.webViewClient;
        }

        public final WebViewEntry copy(WebView webView, VungleWebClient webViewClient) {
            t.f(webView, "webView");
            t.f(webViewClient, "webViewClient");
            return new WebViewEntry(webView, webViewClient);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WebViewEntry)) {
                return false;
            }
            WebViewEntry webViewEntry = (WebViewEntry) obj;
            return t.a(this.webView, webViewEntry.webView) && t.a(this.webViewClient, webViewEntry.webViewClient);
        }

        public final WebView getWebView() {
            return this.webView;
        }

        public final VungleWebClient getWebViewClient() {
            return this.webViewClient;
        }

        public int hashCode() {
            return (this.webView.hashCode() * 31) + this.webViewClient.hashCode();
        }

        public String toString() {
            return "WebViewEntry(webView=" + this.webView + ", webViewClient=" + this.webViewClient + ')';
        }
    }

    private WebViewManager() {
    }

    private final void destroyWebViewInternal(String str) {
        webViewCache.remove(str);
    }

    public final void destroyWebView(String key) {
        t.f(key, "key");
        ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            INSTANCE.destroyWebViewInternal(key);
            g0 g0Var = g0.f27756a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final WebView getOrCreateWebView(Context context, String str) {
        WebView webView;
        t.f(context, "context");
        ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            LinkedHashMap<String, WebViewEntry> linkedHashMap = webViewCache;
            WebViewEntry webViewEntry = linkedHashMap.get(str);
            if (webViewEntry != null) {
                Logger.Companion.d(TAG, "Reusing cached webview. Cache size: " + linkedHashMap.size());
                webView = webViewEntry.getWebView();
            } else {
                Logger.Companion.d(TAG, "Creating new webview. Cache size: " + linkedHashMap.size());
                webView = new WebView(context);
            }
            return webView;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final VungleWebClient getOrCreateWebViewClient(AdPayload advertisement, Placement placement, VungleThreadPoolExecutor offloadExecutor, Platform platform) {
        t.f(advertisement, "advertisement");
        t.f(placement, "placement");
        t.f(offloadExecutor, "offloadExecutor");
        t.f(platform, "platform");
        ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            WebViewEntry webViewEntry = webViewCache.get(advertisement.eventId());
            VungleWebClient webViewClient = webViewEntry != null ? webViewEntry.getWebViewClient() : null;
            if (webViewClient == null) {
                webViewClient = new VungleWebClient(advertisement, placement, offloadExecutor, platform, null, null, 48, null);
            }
            return webViewClient;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void preloadWebView$vungle_ads_release(Context context, AdPayload adv, Placement placement, String templatePath, AdPayload.WebViewSettings webViewSettings, PreloadDelegate delegate, Long l10) {
        t.f(context, "context");
        t.f(adv, "adv");
        t.f(placement, "placement");
        t.f(templatePath, "templatePath");
        t.f(delegate, "delegate");
        ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            Logger.Companion companion = Logger.Companion;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Preload webview start. Cache size: ");
            LinkedHashMap<String, WebViewEntry> linkedHashMap = webViewCache;
            sb2.append(linkedHashMap.size());
            companion.d(TAG, sb2.toString());
            String strEventId = adv.eventId();
            if (!linkedHashMap.containsKey(strEventId)) {
                ThreadUtil.INSTANCE.runOnUiThread(new WebViewManager$preloadWebView$1$1(context, adv, placement, delegate, l10, templatePath, strEventId, webViewSettings));
            }
            g0 g0Var = g0.f27756a;
        } finally {
            reentrantLock.unlock();
        }
    }
}
