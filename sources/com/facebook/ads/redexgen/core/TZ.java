package com.facebook.ads.redexgen.core;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class TZ extends WebViewClient {
    public final /* synthetic */ CallableC1239Ta A00;

    public TZ(CallableC1239Ta callableC1239Ta) {
        this.A00 = callableC1239Ta;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        AbstractC1395Ze.A0D(AbstractC1234Sv.A2j);
        return true;
    }
}
