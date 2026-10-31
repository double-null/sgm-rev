package s5;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import io.bidmachine.analytics.internal.n.QQJ.WKirgUEJJ;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static h f25258a = new h();

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ WebView f25259a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f25260b;

        a(WebView webView, String str) {
            this.f25259a = webView;
            this.f25260b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            h.this.q(this.f25259a, this.f25260b);
        }
    }

    private h() {
    }

    public static final h a() {
        return f25258a;
    }

    public void b(WebView webView, String str) {
        h(webView, "finishSession", str);
    }

    public void c(WebView webView, String str, float f10) {
        h(webView, "setDeviceVolume", Float.valueOf(f10), str);
    }

    public void d(WebView webView, String str, String str2) {
        h(webView, "setDeviceLockState", str2);
    }

    public void e(WebView webView, String str, String str2, JSONObject jSONObject) {
        h(webView, "publishMediaEvent", str2, jSONObject, str);
    }

    public void f(WebView webView, String str, JSONObject jSONObject) {
        h(webView, "init", jSONObject, str);
    }

    public void g(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        h(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    void h(WebView webView, String str, Object... objArr) {
        if (webView == null) {
            w5.d.d("The WebView is null for " + str);
            return;
        }
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("if(window.omidBridge!==undefined){omidBridge.");
        sb2.append(str);
        sb2.append("(");
        k(sb2, objArr);
        sb2.append(")}");
        i(webView, sb2);
    }

    void i(WebView webView, StringBuilder sb2) {
        String string = sb2.toString();
        Handler handler = webView.getHandler();
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
        }
        if (Looper.myLooper() == handler.getLooper()) {
            q(webView, string);
        } else {
            handler.post(new a(webView, string));
        }
    }

    public void j(WebView webView, JSONObject jSONObject) {
        h(webView, "setLastActivity", jSONObject);
    }

    void k(StringBuilder sb2, Object[] objArr) {
        String string;
        if (objArr == null || objArr.length <= 0) {
            return;
        }
        for (Object obj : objArr) {
            if (obj == null) {
                string = "null";
            } else {
                if (obj instanceof String) {
                    string = obj.toString();
                    if (!string.startsWith("{")) {
                        sb2.append('\"');
                        sb2.append(string);
                        sb2.append('\"');
                    }
                } else {
                    sb2.append(obj);
                }
                sb2.append(",");
            }
            sb2.append(string);
            sb2.append(",");
        }
        sb2.setLength(sb2.length() - 1);
    }

    public void l(WebView webView, String str) {
        h(webView, "publishImpressionEvent", str);
    }

    public void m(WebView webView, String str, String str2) {
        h(webView, "setNativeViewHierarchy", str2, str);
    }

    public void n(WebView webView, String str, JSONObject jSONObject) {
        h(webView, "publishLoadedEvent", jSONObject, str);
    }

    public void o(WebView webView, JSONObject jSONObject) {
        h(webView, "setSupportedAttestations", jSONObject);
    }

    public void p(WebView webView, String str, String str2) {
        h(webView, "setState", str2, str);
    }

    public boolean q(WebView webView, String str) {
        if (webView != null && !TextUtils.isEmpty(str)) {
            try {
                try {
                    webView.evaluateJavascript(str, null);
                    return true;
                } catch (IllegalStateException unused) {
                    webView.loadUrl(WKirgUEJJ.AVkmiaWjINOk + str);
                    return true;
                }
            } catch (Exception e10) {
                w5.d.e("Unable to inject javascript: " + e10.getMessage());
            }
        }
        return false;
    }

    public void r(WebView webView, String str, String str2) {
        if (str == null || TextUtils.isEmpty(str2)) {
            return;
        }
        q(webView, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};Object.defineProperty(this.omidVerificationProperties, 'injectionId', {get: function() {var currentScript = document && document.currentScript;return currentScript && currentScript.getAttribute('data-injection-id');}, configurable: true});var script = document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");script.setAttribute(\"data-injection-id\",\"%INJECTION_ID%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", str).replace("%INJECTION_ID%", str2));
    }
}
