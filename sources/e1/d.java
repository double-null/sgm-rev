package e1;

import android.content.pm.PackageInfo;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* JADX INFO: compiled from: ApiHelperForO.java */
/* JADX INFO: loaded from: classes.dex */
public class d {
    public static PackageInfo a() {
        return WebView.getCurrentWebViewPackage();
    }

    public static WebViewClient b(WebView webView) {
        return webView.getWebViewClient();
    }
}
