package e1;

import android.net.Uri;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;

/* JADX INFO: compiled from: WebMessageListenerAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public class q implements WebMessageListenerBoundaryInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d1.f.a f13884a;

    public q(d1.f.a aVar) {
        this.f13884a = aVar;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    public void onPostMessage(WebView webView, InvocationHandler invocationHandler, Uri uri, boolean z10, InvocationHandler invocationHandler2) {
        d1.d dVarB = p.b((WebMessageBoundaryInterface) cf.a.a(WebMessageBoundaryInterface.class, invocationHandler));
        if (dVarB != null) {
            this.f13884a.onPostMessage(webView, dVarB, uri, z10, k.b(invocationHandler2));
        }
    }
}
