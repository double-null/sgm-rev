package e1;

import android.webkit.WebView;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* JADX INFO: compiled from: WebViewProviderFactory.java */
/* JADX INFO: loaded from: classes.dex */
public interface v {
    String[] a();

    WebViewProviderBoundaryInterface createWebView(WebView webView);

    ProfileStoreBoundaryInterface getProfileStore();

    StaticsBoundaryInterface getStatics();
}
