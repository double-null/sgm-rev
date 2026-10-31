package t5;

import android.net.Uri;
import android.webkit.WebView;
import d1.d;
import d1.f;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONException;
import org.json.JSONObject;
import w5.g;
import w5.i;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final i f25523c = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WebView f25524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f25525b;

    /* JADX INFO: renamed from: t5.a$a, reason: collision with other inner class name */
    class C0420a implements f.a {
        C0420a() {
        }

        @Override // d1.f.a
        public void onPostMessage(WebView webView, d dVar, Uri uri, boolean z10, d1.a aVar) {
            a.this.b(dVar.b());
        }
    }

    public a(WebView webView, b bVar) {
        g.b(webView, "WebView is null");
        this.f25524a = webView;
        this.f25525b = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f25525b.onMessageReceived(jSONObject.getString("method"), jSONObject.getJSONObject("data"));
        } catch (JSONException e10) {
            w5.d.b("Error parsing JS message", e10);
        }
    }

    public void a() {
        try {
            if (!d1.g.a("WEB_MESSAGE_LISTENER")) {
                this.f25525b.onWebMessageListenerUnsupported();
                return;
            }
            try {
                d();
                f25523c.b(this.f25524a, this.f25525b.getListenerName(), new HashSet(Arrays.asList("*")), new C0420a());
            } catch (Exception e10) {
                w5.d.b("Error adding WebView listener", e10);
                this.f25525b.onWebMessageListenerUnsupported();
            }
        } catch (NoClassDefFoundError unused) {
            this.f25525b.onWebMessageListenerUnsupported();
        }
    }

    public void d() {
        f25523c.a(this.f25524a, this.f25525b.getListenerName());
    }
}
