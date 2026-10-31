package com.vungle.ads.internal.ui;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: VungleWebClient.kt */
/* JADX INFO: loaded from: classes4.dex */
final class VungleWebClient$VungleWebViewRenderProcessClient$onRenderProcessUnresponsive$1 extends u implements id.a<String> {
    final /* synthetic */ WebView $webView;
    final /* synthetic */ WebViewRenderProcess $webViewRenderProcess;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VungleWebClient$VungleWebViewRenderProcessClient$onRenderProcessUnresponsive$1(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        super(0);
        this.$webView = webView;
        this.$webViewRenderProcess = webViewRenderProcess;
    }

    @Override // id.a
    public final String invoke() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onRenderProcessUnresponsive(Title = ");
        sb2.append(this.$webView.getTitle());
        sb2.append(", URL = ");
        sb2.append(this.$webView.getOriginalUrl());
        sb2.append(", (webViewRenderProcess != null) = ");
        sb2.append(this.$webViewRenderProcess != null);
        return sb2.toString();
    }
}
