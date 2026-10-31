package com.applovin.impl;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import com.facebook.GraphResponse;
import com.facebook.login.LoginLogger;
import java.util.Map;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class p8 {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(WebView webView, boolean z10) {
        ViewParent parent = webView.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(webView);
        }
        webView.removeAllViews();
        if (z10) {
            webView.loadUrl("about:blank");
        }
        webView.onPause();
        webView.destroyDrawingCache();
        webView.destroy();
    }

    public static void b(final WebView webView, final boolean z10) {
        if (webView == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sd
            @Override // java.lang.Runnable
            public final void run() {
                p8.a(webView, z10);
            }
        });
    }

    public static String c(String str, Map map) {
        String str2;
        str.hashCode();
        if (str.equals("com.applovin.external_redirect_success")) {
            str2 = GraphResponse.SUCCESS_KEY;
        } else {
            if (!str.equals("com.applovin.external_redirect_failure")) {
                return null;
            }
            str2 = LoginLogger.EVENT_EXTRAS_FAILURE;
        }
        return a("al_onExternalRedirectEvent", str2, map);
    }

    public static String b(String str, Map map) {
        String str2;
        str.hashCode();
        switch (str) {
            case "com.applovin.custom_tabs_failure":
                str2 = LoginLogger.EVENT_EXTRAS_FAILURE;
                break;
            case "com.applovin.custom_tabs_hidden":
                str2 = "hidden";
                break;
            case "com.applovin.custom_tabs_shown":
                str2 = "shown";
                break;
            default:
                return null;
        }
        return a("al_onInAppBrowserEvent", str2, map);
    }

    public static String d(String str, Map map) {
        String str2;
        str.hashCode();
        if (str.equals("com.applovin.preload_success")) {
            str2 = GraphResponse.SUCCESS_KEY;
        } else {
            if (!str.equals("com.applovin.preload_failure")) {
                return null;
            }
            str2 = LoginLogger.EVENT_EXTRAS_FAILURE;
        }
        return a("al_onPreloadEvent", str2, map);
    }

    public static String a(String str, Map map) {
        String str2;
        str.hashCode();
        if (str.equals("com.applovin.custom_intent_launch_failure")) {
            str2 = LoginLogger.EVENT_EXTRAS_FAILURE;
        } else {
            if (!str.equals("com.applovin.custom_intent_launch_success")) {
                return null;
            }
            str2 = GraphResponse.SUCCESS_KEY;
        }
        return a("al_onCustomIntentLaunchEvent", str2, map);
    }

    public static String a(Map map) {
        return a("al_onWindowInsetsInfoCollectedEvent", GraphResponse.SUCCESS_KEY, map);
    }

    private static String a(String str, String str2, Map map) {
        JSONObject jSONObject;
        try {
            jSONObject = CollectionUtils.toJson(map);
        } catch (JSONException unused) {
            jSONObject = new JSONObject();
        }
        return "javascript:" + str + "('" + str2 + "'," + jSONObject + ");";
    }

    public static void a(final WebView webView, final String str, String str2, com.applovin.impl.sdk.l lVar) {
        if (webView == null) {
            return;
        }
        try {
            lVar.Q();
            if (com.applovin.impl.sdk.p.a()) {
                lVar.Q().a(str2, "Forwarding \"" + str + "\" to WebView");
            }
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.pd
                @Override // java.lang.Runnable
                public final void run() {
                    webView.loadUrl(str);
                }
            });
        } catch (Throwable th) {
            lVar.Q();
            if (com.applovin.impl.sdk.p.a()) {
                lVar.Q().a(str2, "Unable to forward to WebView", th);
            }
            lVar.E().a(str2, th, CollectionUtils.hashMap("operation", str));
        }
    }

    public static void a(final WebView webView, final String str) {
        if (webView == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.rd
            @Override // java.lang.Runnable
            public final void run() {
                webView.evaluateJavascript(str, null);
            }
        });
    }

    public static u4 a(final WebView webView, final String str, com.applovin.impl.sdk.l lVar) {
        final u4 u4Var = new u4("evaluateJavascript");
        if (webView == null) {
            return u4Var.a("null_webview");
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.td
            @Override // java.lang.Runnable
            public final void run() {
                p8.a(webView, str, u4Var);
            }
        });
        Long l10 = (Long) lVar.a(z4.V2);
        if (l10.longValue() > 0) {
            l6.a(l10.longValue(), u4Var, "timed_out", "evaluateJavascriptTimeout", lVar);
        } else {
            u4Var.b(null);
        }
        return u4Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(WebView webView, String str, final u4 u4Var) {
        Objects.requireNonNull(u4Var);
        webView.evaluateJavascript(str, new ValueCallback() { // from class: com.applovin.impl.qd
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                u4Var.b((String) obj);
            }
        });
    }
}
