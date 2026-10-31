package e1;

import android.webkit.WebViewClient;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* JADX INFO: compiled from: WebViewProviderAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final WebViewProviderBoundaryInterface f13923a;

    public u(WebViewProviderBoundaryInterface webViewProviderBoundaryInterface) {
        this.f13923a = webViewProviderBoundaryInterface;
    }

    public n a(String str, String[] strArr) {
        return n.a(this.f13923a.addDocumentStartJavaScript(str, strArr));
    }

    public void b(String str, String[] strArr, d1.f.a aVar) {
        this.f13923a.addWebMessageListener(str, strArr, cf.a.c(new q(aVar)));
    }

    public WebViewClient c() {
        return this.f13923a.getWebViewClient();
    }

    public void d(String str) {
        this.f13923a.removeWebMessageListener(str);
    }

    public void e(boolean z10) {
        this.f13923a.setAudioMuted(z10);
    }

    public void f(String str) {
        this.f13923a.setProfile(str);
    }
}
