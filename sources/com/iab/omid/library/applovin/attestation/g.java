package com.iab.omid.library.applovin.attestation;

import android.webkit.WebView;

/* JADX INFO: loaded from: classes4.dex */
public class g {
    public static boolean a(WebView webView) {
        try {
            if (d1.g.a("WEB_MESSAGE_LISTENER") && c.a(com.iab.omid.library.applovin.internal.g.b().a()).b()) {
                f.a(webView);
                return true;
            }
        } catch (Exception e10) {
            com.iab.omid.library.applovin.utils.d.a("Error during initialization of AttestationMessageListener", e10);
        } catch (NoClassDefFoundError unused) {
            com.iab.omid.library.applovin.utils.d.a("androidx.webkit not available, skipping attestation listener initialization");
        }
        return false;
    }
}
