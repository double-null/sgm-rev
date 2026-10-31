package xe;

import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.lang.reflect.Method;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: CloseGuard.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f28594d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Method f28595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Method f28596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Method f28597c;

    /* JADX INFO: compiled from: CloseGuard.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final h a() {
            Method method;
            Method method2;
            Method method3;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                method = cls.getMethod("get", new Class[0]);
                method3 = cls.getMethod(MRAIDPresenter.OPEN, String.class);
                method2 = cls.getMethod("warnIfOpen", new Class[0]);
            } catch (Exception unused) {
                method = null;
                method2 = null;
                method3 = null;
            }
            return new h(method, method3, method2);
        }
    }

    public h(Method method, Method method2, Method method3) {
        this.f28595a = method;
        this.f28596b = method2;
        this.f28597c = method3;
    }

    public final Object a(String closer) {
        t.f(closer, "closer");
        Method method = this.f28595a;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(null, new Object[0]);
                Method method2 = this.f28596b;
                t.c(method2);
                method2.invoke(objInvoke, closer);
                return objInvoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public final boolean b(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            Method method = this.f28597c;
            t.c(method);
            method.invoke(obj, new Object[0]);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
