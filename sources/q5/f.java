package q5;

import android.webkit.WebView;
import com.facebook.internal.ServerProtocol;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class f implements t5.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t5.a f24430a;

    private f(WebView webView) {
        t5.a aVar = new t5.a(webView, this);
        this.f24430a = aVar;
        aVar.a();
    }

    public static f a(WebView webView) {
        return new f(webView);
    }

    private void b(JSONObject jSONObject) {
        try {
            String string = jSONObject.getString("mechanism");
            String string2 = jSONObject.getString(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION);
            Map<String, String> mapM = w5.c.m(jSONObject.getJSONObject("attestationArgs"));
            mapM.put(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, string2);
            e.a(s5.g.c().a().getApplicationContext(), string, new a(mapM));
        } catch (Exception e10) {
            w5.d.b("Error processing attestation request", e10);
        }
    }

    @Override // t5.b
    public String getListenerName() {
        return "omidJsAttestationListener";
    }

    @Override // t5.b
    public void onMessageReceived(String str, JSONObject jSONObject) {
        if ("attest".equals(str)) {
            b(jSONObject);
            return;
        }
        w5.d.c("Unexpected method in AttestationMessageListener: " + str);
    }

    @Override // t5.b
    public void onWebMessageListenerUnsupported() {
        w5.d.c("The Attestation Webview Listener cannot be supported in this WebView version.");
    }
}
