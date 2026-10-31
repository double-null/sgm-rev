package e1;

import android.os.Looper;
import android.webkit.WebView;

/* JADX INFO: compiled from: ApiHelperForP.java */
/* JADX INFO: loaded from: classes.dex */
public class g {
    public static ClassLoader a() {
        return WebView.getWebViewClassLoader();
    }

    public static Looper b(WebView webView) {
        return webView.getWebViewLooper();
    }
}
