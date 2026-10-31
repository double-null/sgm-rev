package com.iab.omid.library.applovin.messagelistener;

import android.net.Uri;
import android.webkit.WebView;
import com.iab.omid.library.applovin.utils.g;
import com.iab.omid.library.applovin.utils.i;
import d1.d;
import d1.f;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final i f12588c = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WebView f12589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f12590b;

    /* JADX INFO: renamed from: com.iab.omid.library.applovin.messagelistener.a$a, reason: collision with other inner class name */
    class C0161a implements f.a {
        C0161a() {
        }

        @Override // d1.f.a
        public void onPostMessage(WebView webView, d dVar, Uri uri, boolean z10, d1.a aVar) {
            a.this.a(dVar.b());
        }
    }

    public a(WebView webView, b bVar) {
        g.a(webView, "WebView is null");
        this.f12589a = webView;
        this.f12590b = bVar;
    }

    public void a() {
        try {
            if (!d1.g.a("WEB_MESSAGE_LISTENER")) {
                this.f12590b.onWebMessageListenerUnsupported();
                return;
            }
            try {
                b();
                f12588c.a(this.f12589a, this.f12590b.getListenerName(), new HashSet(Arrays.asList("*")), new C0161a());
            } catch (Exception e10) {
                com.iab.omid.library.applovin.utils.d.a("Error adding WebView listener", e10);
                this.f12590b.onWebMessageListenerUnsupported();
            }
        } catch (NoClassDefFoundError unused) {
            this.f12590b.onWebMessageListenerUnsupported();
        }
    }

    public void b() {
        f12588c.a(this.f12589a, this.f12590b.getListenerName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f12590b.onMessageReceived(jSONObject.getString("method"), jSONObject.getJSONObject("data"));
        } catch (JSONException e10) {
            com.iab.omid.library.applovin.utils.d.a("Error parsing JS message", e10);
        }
    }
}
