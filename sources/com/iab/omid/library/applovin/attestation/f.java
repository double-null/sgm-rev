package com.iab.omid.library.applovin.attestation;

import android.webkit.WebView;
import com.facebook.internal.ServerProtocol;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class f implements com.iab.omid.library.applovin.messagelistener.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.applovin.messagelistener.a f12521a;

    private f(WebView webView) {
        com.iab.omid.library.applovin.messagelistener.a aVar = new com.iab.omid.library.applovin.messagelistener.a(webView, this);
        this.f12521a = aVar;
        aVar.a();
    }

    public static f a(WebView webView) {
        return new f(webView);
    }

    @Override // com.iab.omid.library.applovin.messagelistener.b
    public String getListenerName() {
        return "omidJsAttestationListener";
    }

    @Override // com.iab.omid.library.applovin.messagelistener.b
    public void onMessageReceived(String str, JSONObject jSONObject) {
        if ("attest".equals(str)) {
            a(jSONObject);
            return;
        }
        com.iab.omid.library.applovin.utils.d.b("Unexpected method in AttestationMessageListener: " + str);
    }

    @Override // com.iab.omid.library.applovin.messagelistener.b
    public void onWebMessageListenerUnsupported() {
        com.iab.omid.library.applovin.utils.d.b("The Attestation Webview Listener cannot be supported in this WebView version.");
    }

    private void a(JSONObject jSONObject) {
        try {
            String string = jSONObject.getString("mechanism");
            String string2 = jSONObject.getString(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION);
            Map<String, String> mapB = com.iab.omid.library.applovin.utils.c.b(jSONObject.getJSONObject("attestationArgs"));
            mapB.put(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, string2);
            e.a(com.iab.omid.library.applovin.internal.g.b().a().getApplicationContext(), string, new a(mapB));
        } catch (Exception e10) {
            com.iab.omid.library.applovin.utils.d.a("Error processing attestation request", e10);
        }
    }
}
