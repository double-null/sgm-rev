package f5;

import android.net.Uri;
import android.webkit.WebView;
import d1.d;
import d1.f;
import i5.g;
import i5.i;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final i f14620c = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WebView f14621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f14622b;

    /* JADX INFO: renamed from: f5.a$a, reason: collision with other inner class name */
    class C0221a implements f.a {
        C0221a() {
        }

        @Override // d1.f.a
        public void onPostMessage(WebView webView, d dVar, Uri uri, boolean z10, d1.a aVar) {
            a.this.c(dVar.b());
        }
    }

    public a(WebView webView, b bVar) {
        g.d(webView, "WebView is null");
        this.f14621a = webView;
        this.f14622b = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f14622b.onMessageReceived(jSONObject.getString("method"), jSONObject.getJSONObject("data"));
        } catch (JSONException e10) {
            i5.d.b("Error parsing JS message", e10);
        }
    }

    public void a() {
        try {
            if (!d1.g.a("WEB_MESSAGE_LISTENER")) {
                this.f14622b.onWebMessageListenerUnsupported();
                return;
            }
            try {
                d();
                f14620c.b(this.f14621a, this.f14622b.getListenerName(), new HashSet(Arrays.asList("*")), new C0221a());
            } catch (Exception e10) {
                i5.d.b("Error adding WebView listener", e10);
                this.f14622b.onWebMessageListenerUnsupported();
            }
        } catch (NoClassDefFoundError unused) {
            this.f14622b.onWebMessageListenerUnsupported();
        }
    }

    public void d() {
        f14620c.a(this.f14621a, this.f14622b.getListenerName());
    }
}
