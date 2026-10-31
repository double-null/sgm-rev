package d1;

import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import e1.s;
import e1.t;
import e1.u;
import e1.v;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Set;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* JADX INFO: compiled from: WebViewCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Uri f13148a = Uri.parse("*");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Uri f13149b = Uri.parse("");

    /* JADX INFO: compiled from: WebViewCompat.java */
    public interface a {
        void onPostMessage(WebView webView, d dVar, Uri uri, boolean z10, d1.a aVar);
    }

    public static c a(WebView webView, String str, Set<String> set) {
        if (s.V.c()) {
            return h(webView).a(str, (String[]) set.toArray(new String[0]));
        }
        throw s.a();
    }

    public static void b(WebView webView, String str, Set<String> set, a aVar) {
        if (!s.U.c()) {
            throw s.a();
        }
        h(webView).b(str, (String[]) set.toArray(new String[0]), aVar);
    }

    private static void c(WebView webView) {
        if (Build.VERSION.SDK_INT < 28) {
            try {
                Method declaredMethod = WebView.class.getDeclaredMethod("checkThread", new Class[0]);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(webView, new Object[0]);
                return;
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
                throw new RuntimeException(e10);
            }
        }
        Looper looperB = e1.g.b(webView);
        if (looperB == Looper.myLooper()) {
            return;
        }
        throw new RuntimeException("A WebView method was called on thread '" + Thread.currentThread().getName() + "'. All WebView methods must be called on the same thread. (Expected Looper " + looperB + " called on " + Looper.myLooper() + ", FYI main Looper is " + Looper.getMainLooper() + ")");
    }

    private static WebViewProviderBoundaryInterface d(WebView webView) {
        return f().createWebView(webView);
    }

    public static PackageInfo e() {
        if (Build.VERSION.SDK_INT >= 26) {
            return e1.d.a();
        }
        try {
            return g();
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    private static v f() {
        return t.c();
    }

    private static PackageInfo g() throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", new Class[0]).invoke(null, new Object[0]);
    }

    private static u h(WebView webView) {
        return new u(d(webView));
    }

    public static String i() {
        if (s.X.c()) {
            return f().getStatics().getVariationsHeader();
        }
        throw s.a();
    }

    public static WebViewClient j(WebView webView) {
        e1.a.e eVar = s.H;
        if (eVar.b()) {
            return e1.d.b(webView);
        }
        if (!eVar.c()) {
            throw s.a();
        }
        c(webView);
        return h(webView).c();
    }

    public static boolean k() {
        if (s.R.c()) {
            return f().getStatics().isMultiProcessEnabled();
        }
        throw s.a();
    }

    public static void l(WebView webView, String str) {
        if (!s.U.c()) {
            throw s.a();
        }
        h(webView).d(str);
    }

    public static void m(WebView webView, boolean z10) {
        if (!s.f13897f0.c()) {
            throw s.a();
        }
        h(webView).e(z10);
    }

    public static void n(WebView webView, String str) {
        if (!s.f13891c0.c()) {
            throw s.a();
        }
        h(webView).f(str);
    }
}
