package c5;

import android.webkit.WebView;

/* JADX INFO: loaded from: classes4.dex */
public class g {
    public static boolean a(WebView webView) {
        try {
            if (d1.g.a("WEB_MESSAGE_LISTENER") && c.a(e5.g.c().a()).d()) {
                f.a(webView);
                return true;
            }
        } catch (Exception e10) {
            i5.d.b("Error during initialization of AttestationMessageListener", e10);
        } catch (NoClassDefFoundError unused) {
            i5.d.a("androidx.webkit not available, skipping attestation listener initialization");
        }
        return false;
    }
}
