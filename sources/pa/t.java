package pa;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;

/* JADX INFO: loaded from: classes5.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f23852a = false;

    private static void a(Object obj, String str, boolean z10, Object... objArr) {
        if (f()) {
            if (objArr != null && objArr.length != 0) {
                try {
                    str = String.format(str, objArr);
                } catch (Throwable unused) {
                }
            }
            if (obj != null) {
                String string = obj.toString();
                if (!TextUtils.isEmpty(string)) {
                    str = "[" + string + "] " + str;
                }
            }
            if (z10) {
                Log.e("AdaptiveRendering", str);
            } else {
                Log.d("AdaptiveRendering", str);
            }
        }
    }

    public static void b(Object obj, String str, Object... objArr) {
        a(obj, str, true, objArr);
    }

    public static void c(String str, Object... objArr) {
        a(null, str, true, objArr);
    }

    private static void d(Throwable th) {
        if (f()) {
            if (th instanceof UnknownHostException) {
                th.printStackTrace();
            } else {
                Log.w("AdaptiveRendering", th);
            }
        }
    }

    public static void e(boolean z10) {
        f23852a = z10;
    }

    public static boolean f() {
        return j();
    }

    public static void g(Object obj, String str, Object... objArr) {
        a(obj, str, false, objArr);
    }

    public static void h(String str, Object... objArr) {
        a(null, str, false, objArr);
    }

    public static void i(Throwable th) {
        d(th);
    }

    public static boolean j() {
        return f23852a;
    }
}
