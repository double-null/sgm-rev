package com.applovin.impl;

import android.content.Intent;
import android.webkit.ConsoleMessage;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.facebook.share.internal.ShareConstants;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class t extends WebChromeClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f8747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.p f8748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.applovin.impl.adview.a f8749c;

    public t(com.applovin.impl.adview.a aVar, com.applovin.impl.sdk.l lVar) {
        this.f8747a = lVar;
        this.f8748b = lVar.Q();
        this.f8749c = aVar;
    }

    private void a(String str, ConsoleMessage consoleMessage) {
        String str2;
        com.applovin.impl.sdk.ad.b bVarG = this.f8749c.g();
        if (bVarG != null) {
            String str3 = consoleMessage.messageLevel() + ": " + consoleMessage.sourceId() + ": " + consoleMessage.lineNumber();
            if (str == null) {
                str2 = "AdWebView";
            } else {
                str2 = "AdWebView:" + str;
            }
            Map mapA = h2.a((AppLovinAdImpl) bVarG);
            mapA.putAll(h2.a(bVarG));
            mapA.put(ShareConstants.FEED_SOURCE_PARAM, str2);
            mapA.put("top_main_method", str3);
            mapA.put("error_message", consoleMessage.message());
            this.f8747a.E().d(f2.f6493i1, mapA);
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String str = consoleMessage.messageLevel() + ": " + consoleMessage.sourceId() + ": " + consoleMessage.lineNumber() + ": " + consoleMessage.message();
        if (com.applovin.impl.sdk.p.a()) {
            this.f8748b.a("AdWebView", str);
        }
        if (consoleMessage.messageLevel() != ConsoleMessage.MessageLevel.ERROR) {
            return true;
        }
        String strMessage = consoleMessage.message();
        if (strMessage.contains("al_onPoststitialShow")) {
            AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.al_onPoststitialShow_evaluation_error"), null);
            a("onPoststitialShowEvaluationError", consoleMessage);
        } else if (strMessage.contains("SyntaxError")) {
            a(null, consoleMessage);
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        if (!com.applovin.impl.sdk.p.a()) {
            return true;
        }
        this.f8748b.k("AdWebView", "Alert attempted: " + str2);
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        if (!com.applovin.impl.sdk.p.a()) {
            return true;
        }
        this.f8748b.k("AdWebView", "JS onBeforeUnload attempted: " + str2);
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        if (!com.applovin.impl.sdk.p.a()) {
            return true;
        }
        this.f8748b.k("AdWebView", "JS confirm attempted: " + str2);
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i10) {
        com.applovin.impl.adview.a aVar;
        if (i10 != 100 || (aVar = this.f8749c) == null) {
            return;
        }
        aVar.c(webView);
    }

    @Override // android.webkit.WebChromeClient
    public void onConsoleMessage(String str, int i10, String str2) {
        if (com.applovin.impl.sdk.p.a()) {
            this.f8748b.k("AdWebView", "console.log[" + i10 + "] :" + str);
        }
    }
}
