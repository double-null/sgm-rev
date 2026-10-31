package h5;

import android.webkit.WebView;

/* JADX INFO: loaded from: classes4.dex */
public class b extends a {
    public b(String str, WebView webView) {
        super(str);
        if (webView != null) {
            m5.a.a(webView);
        }
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        k(webView);
    }
}
