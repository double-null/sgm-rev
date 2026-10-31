package m5;

import android.net.Uri;
import android.os.Build;
import android.webkit.WebView;
import c5.c;
import e5.g;
import e5.j;

/* JADX INFO: loaded from: classes4.dex */
public class a {
    public static void a(WebView webView) {
        if (Build.VERSION.SDK_INT < 26 || !c.a(g.c().a()).d()) {
            return;
        }
        webView.setWebViewClient(new b(webView.getWebViewClient()));
    }

    public static boolean b(String str) {
        if (str != null && str.startsWith("omid-native")) {
            try {
                Uri uri = Uri.parse(str);
                if ("omid-native".equals(uri.getScheme())) {
                    j.c(uri);
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
