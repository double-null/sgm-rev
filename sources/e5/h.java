package e5;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import c0.IbU.elEbP;
import d5.LXP.wcAlQCOdREZdI;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static h f14478a = new h();

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ WebView f14479a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f14480b;

        a(WebView webView, String str) {
            this.f14479a = webView;
            this.f14480b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            h.this.r(this.f14479a, this.f14480b);
        }
    }

    private h() {
    }

    public static final h a() {
        return f14478a;
    }

    public void b(WebView webView, String str) {
        i(webView, "finishSession", str);
    }

    public void c(WebView webView, String str, float f10) {
        i(webView, "setDeviceVolume", Float.valueOf(f10), str);
    }

    public void d(WebView webView, String str, a5.h hVar, String str2) {
        i(webView, "error", hVar.toString(), str2, str);
    }

    public void e(WebView webView, String str, String str2) {
        i(webView, "setDeviceLockState", str2);
    }

    public void f(WebView webView, String str, String str2, JSONObject jSONObject) {
        i(webView, "publishMediaEvent", str2, jSONObject, str);
    }

    public void g(WebView webView, String str, JSONObject jSONObject) {
        i(webView, "init", jSONObject, str);
    }

    public void h(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        i(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    void j(WebView webView, StringBuilder sb2) {
        String string = sb2.toString();
        Handler handler = webView.getHandler();
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
        }
        if (Looper.myLooper() == handler.getLooper()) {
            r(webView, string);
        } else {
            handler.post(new a(webView, string));
        }
    }

    public void k(WebView webView, JSONObject jSONObject) {
        i(webView, wcAlQCOdREZdI.XzYJfEc, jSONObject);
    }

    void l(StringBuilder sb2, Object[] objArr) {
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

    public void m(WebView webView, String str) {
        i(webView, "publishImpressionEvent", str);
    }

    public void n(WebView webView, String str, String str2) {
        i(webView, "setNativeViewHierarchy", str2, str);
    }

    public void o(WebView webView, String str, JSONObject jSONObject) {
        i(webView, "publishLoadedEvent", jSONObject, str);
    }

    public void p(WebView webView, JSONObject jSONObject) {
        i(webView, "setSupportedAttestations", jSONObject);
    }

    public void q(WebView webView, String str, String str2) {
        i(webView, "setState", str2, str);
    }

    public boolean r(WebView webView, String str) {
        if (webView != null && !TextUtils.isEmpty(str)) {
            try {
                try {
                    webView.evaluateJavascript(str, null);
                    return true;
                } catch (IllegalStateException unused) {
                    webView.loadUrl("javascript: " + str);
                    return true;
                }
            } catch (Exception e10) {
                i5.d.e("Unable to inject javascript: " + e10.getMessage());
            }
        }
        return false;
    }

    public void s(WebView webView, String str, String str2) {
        if (str == null || TextUtils.isEmpty(str2)) {
            return;
        }
        r(webView, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};Object.defineProperty(this.omidVerificationProperties, 'injectionId', {get: function() {var currentScript = document && document.currentScript;return currentScript && currentScript.getAttribute('data-injection-id');}, configurable: true});var script = document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");script.setAttribute(\"data-injection-id\",\"%INJECTION_ID%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", str).replace("%INJECTION_ID%", str2));
    }

    void i(WebView webView, String str, Object... objArr) {
        if (webView == null) {
            i5.d.d("The WebView is null for " + str);
            return;
        }
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("if(window.omidBridge!==undefined){omidBridge.");
        sb2.append(str);
        sb2.append("(");
        l(sb2, objArr);
        sb2.append(elEbP.pVjiiJGLFnZiJk);
        j(webView, sb2);
    }
}
