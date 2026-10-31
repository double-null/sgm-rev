package wb;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: compiled from: UiUtils.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class b0 {
    public static final void a(Activity activity) {
        kotlin.jvm.internal.t.f(activity, "<this>");
        d(activity, false, 1, null);
        g(activity);
    }

    public static final void b(Activity activity, boolean z10) {
        kotlin.jvm.internal.t.f(activity, "<this>");
        Window window = activity.getWindow();
        if (window != null) {
            c(window, z10);
        }
    }

    public static final void c(Window window, boolean z10) {
        int i10;
        kotlin.jvm.internal.t.f(window, "<this>");
        if (Build.VERSION.SDK_INT >= 30) {
            WindowInsetsController windowInsetsController = window.getDecorView().getWindowInsetsController();
            if (windowInsetsController != null) {
                windowInsetsController.setSystemBarsBehavior(2);
                if (z10) {
                    windowInsetsController.hide(WindowInsets.Type.statusBars());
                    return;
                }
                return;
            }
            return;
        }
        if (z10) {
            window.setFlags(1024, 1024);
            i10 = 4;
        } else {
            i10 = 0;
        }
        if (i10 > 0) {
            window.getDecorView().setSystemUiVisibility(i10);
        }
    }

    public static /* synthetic */ void d(Activity activity, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        b(activity, z10);
    }

    public static final void e(Activity activity) {
        kotlin.jvm.internal.t.f(activity, "<this>");
        activity.finish();
        j(activity);
    }

    public static final void f(Activity activity) {
        if (activity == null) {
            return;
        }
        try {
            e(activity);
            wc.g0 g0Var = wc.g0.f27756a;
        } catch (Throwable unused) {
        }
    }

    public static final Boolean g(Activity activity) {
        kotlin.jvm.internal.t.f(activity, "<this>");
        InputMethodManager inputMethodManagerT = e0.t(activity);
        if (inputMethodManagerT == null) {
            return null;
        }
        View currentFocus = activity.getCurrentFocus();
        if (currentFocus == null) {
            currentFocus = new View(activity);
        }
        return Boolean.valueOf(inputMethodManagerT.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0));
    }

    public static final void h(Activity activity) {
        kotlin.jvm.internal.t.f(activity, "<this>");
        activity.requestWindowFeature(1);
        Window window = activity.getWindow();
        if (window != null) {
            window.addFlags(128);
        }
    }

    public static final wc.g0 i(Activity activity, int i10) {
        kotlin.jvm.internal.t.f(activity, "<this>");
        return a0.e(activity.getWindow(), i10);
    }

    public static final void j(Activity activity) {
        kotlin.jvm.internal.t.f(activity, "<this>");
        if (Build.VERSION.SDK_INT >= 34) {
            try {
                activity.overrideActivityTransition(0, 0, 0, 0);
                activity.overrideActivityTransition(1, 0, 0, 0);
                return;
            } catch (Throwable unused) {
            }
        }
        try {
            activity.overridePendingTransition(0, 0);
            wc.g0 g0Var = wc.g0.f27756a;
        } catch (Throwable unused2) {
        }
    }

    public static final wc.g0 k(Window window, int i10) {
        if (window == null) {
            return null;
        }
        window.setBackgroundDrawable(new ColorDrawable(i10));
        return wc.g0.f27756a;
    }
}
