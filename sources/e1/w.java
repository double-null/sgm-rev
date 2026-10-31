package e1;

import android.webkit.WebView;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: compiled from: WebViewProviderFactoryAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public class w implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final WebViewProviderFactoryBoundaryInterface f13924a;

    public w(WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface) {
        this.f13924a = webViewProviderFactoryBoundaryInterface;
    }

    @Override // e1.v
    public String[] a() {
        return this.f13924a.getSupportedFeatures();
    }

    @Override // e1.v
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) cf.a.a(WebViewProviderBoundaryInterface.class, this.f13924a.createWebView(webView));
    }

    @Override // e1.v
    public ProfileStoreBoundaryInterface getProfileStore() {
        return (ProfileStoreBoundaryInterface) cf.a.a(ProfileStoreBoundaryInterface.class, this.f13924a.getProfileStore());
    }

    @Override // e1.v
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) cf.a.a(StaticsBoundaryInterface.class, this.f13924a.getStatics());
    }
}
