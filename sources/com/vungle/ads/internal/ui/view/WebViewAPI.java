package com.vungle.ads.internal.ui.view;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import com.vungle.ads.internal.omsdk.WebViewObserver;
import kotlinx.serialization.json.d0;

/* JADX INFO: compiled from: WebViewAPI.kt */
/* JADX INFO: loaded from: classes4.dex */
public interface WebViewAPI {

    /* JADX INFO: compiled from: WebViewAPI.kt */
    public interface MraidDelegate {
        boolean processCommand(String str, d0 d0Var);
    }

    /* JADX INFO: compiled from: WebViewAPI.kt */
    public interface WebClientErrorHandler {
        void onReceivedError(String str, boolean z10);

        void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess);

        boolean onWebRenderingProcessGone(WebView webView, Boolean bool);
    }

    void notifyPropertiesChange(boolean z10);

    void setAdVisibility(boolean z10);

    void setConsentStatus(boolean z10, String str, String str2, String str3, String str4);

    void setErrorHandler(WebClientErrorHandler webClientErrorHandler);

    void setMraidDelegate(MraidDelegate mraidDelegate);

    void setWebViewObserver(WebViewObserver webViewObserver);
}
