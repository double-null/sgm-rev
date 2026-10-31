package e1;

import android.os.Build;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: compiled from: WebViewGlueCommunicator.java */
/* JADX INFO: loaded from: classes.dex */
public class t {

    /* JADX INFO: compiled from: WebViewGlueCommunicator.java */
    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final v f13922a = t.a();
    }

    static v a() {
        try {
            return new w((WebViewProviderFactoryBoundaryInterface) cf.a.a(WebViewProviderFactoryBoundaryInterface.class, b()));
        } catch (ClassNotFoundException unused) {
            return new i();
        } catch (IllegalAccessException e10) {
            e = e10;
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e11) {
            e = e11;
            throw new RuntimeException(e);
        } catch (InvocationTargetException e12) {
            e = e12;
            throw new RuntimeException(e);
        }
    }

    private static InvocationHandler b() throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, d()).getDeclaredMethod("createWebViewProviderFactory", new Class[0]).invoke(null, new Object[0]);
    }

    public static v c() {
        return a.f13922a;
    }

    public static ClassLoader d() {
        return Build.VERSION.SDK_INT >= 28 ? g.a() : e().getClass().getClassLoader();
    }

    private static Object e() {
        try {
            Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", new Class[0]);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(null, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }
}
