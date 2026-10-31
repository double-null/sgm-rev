package g7;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Insets;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import com.vungle.ads.internal.protos.Sdk;
import java.io.Closeable;
import java.io.Flushable;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes4.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Handler f15512a = new Handler(Looper.getMainLooper());

    class a implements View.OnApplyWindowInsetsListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f15513a;

        a(int i10) {
            this.f15513a = i10;
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            Insets insets = windowInsets.getInsets(this.f15513a);
            view.setPadding(insets.left, insets.top, insets.right, insets.bottom);
            return windowInsets;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0074: MOVE (r4 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]) (LINE:117), block:B:19:0x0074 */
    public static /* synthetic */ void b(String str) throws Throwable {
        HttpURLConnection httpURLConnection;
        Exception e10;
        HttpURLConnection httpURLConnection2;
        HttpURLConnection httpURLConnection3 = null;
        try {
            try {
                h.a("Utils", "Connection to URL: %s", str);
                httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                try {
                    httpURLConnection.setInstanceFollowRedirects(true);
                    httpURLConnection.setConnectTimeout(Sdk.SDKError.Reason.MEDIATION_ERROR_VALUE);
                    httpURLConnection.setRequestProperty("Connection", MRAIDPresenter.CLOSE);
                    httpURLConnection.setRequestMethod("GET");
                    String strD = la.f.d();
                    if (!TextUtils.isEmpty(strD)) {
                        httpURLConnection.setRequestProperty("User-Agent", strD);
                    }
                    h.a("Utils", "Response code: %d, for URL: %s", Integer.valueOf(httpURLConnection.getResponseCode()), str);
                } catch (Exception e11) {
                    e10 = e11;
                    h.b("Utils", "%s: %s: %s", str, e10.getMessage(), e10.toString());
                }
            } catch (Throwable th) {
                th = th;
                httpURLConnection3 = httpURLConnection2;
                cc.h.b(httpURLConnection3);
                throw th;
            }
        } catch (Exception e12) {
            httpURLConnection = null;
            e10 = e12;
        } catch (Throwable th2) {
            th = th2;
            cc.h.b(httpURLConnection3);
            throw th;
        }
        cc.h.b(httpURLConnection);
    }

    public static void c(Activity activity) {
        if (Build.VERSION.SDK_INT >= 34) {
            Window window = activity.getWindow();
            if (window != null) {
                d(window.getDecorView());
            } else {
                d(activity.findViewById(R.id.content));
            }
        }
    }

    public static void d(View view) {
        e(view, WindowInsets.Type.systemBars() | WindowInsets.Type.displayCutout());
    }

    public static void e(View view, int i10) {
        view.setOnApplyWindowInsetsListener(new a(i10));
        view.requestApplyInsets();
    }

    public static void f(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th) {
                h.c("Utils", th);
            }
        }
    }

    public static Float g(String str) {
        return Float.valueOf(str.replace("px", ""));
    }

    public static int h(Context context, float f10) {
        return (int) TypedValue.applyDimension(1, f10, context.getResources().getDisplayMetrics());
    }

    public static void i(Flushable flushable) {
        if (flushable != null) {
            try {
                flushable.flush();
            } catch (Throwable th) {
                h.c("Utils", th);
            }
        }
    }

    public static int j(Context context) {
        int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        int i10 = context.getResources().getConfiguration().orientation;
        if (i10 == 1) {
            return (rotation == 2 || rotation == 3) ? 9 : 1;
        }
        if (i10 == 2) {
            return (rotation == 2 || rotation == 3) ? 8 : 0;
        }
        return 9;
    }

    public static boolean k(Context context) {
        int iJ = j(context);
        return iJ == 0 || iJ == 8 || iJ == 6 || iJ == 11;
    }

    public static boolean l(Context context) {
        NetworkInfo activeNetworkInfo;
        h.a("Utils", "Testing connectivity:", new Object[0]);
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) {
            h.a("Utils", "No Internet connection", new Object[0]);
            return false;
        }
        h.a("Utils", "Connected to Internet", new Object[0]);
        return true;
    }

    public static boolean m(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        double d10 = displayMetrics.widthPixels / displayMetrics.xdpi;
        double d11 = displayMetrics.heightPixels / displayMetrics.ydpi;
        return Math.sqrt((d10 * d10) + (d11 * d11)) >= 6.6d;
    }

    public static Float n(Float f10, Float f11) {
        if (f10 == null) {
            return f11;
        }
        return f11 == null ? f10 : Float.valueOf(Math.max(f10.floatValue(), f11.floatValue()));
    }

    public static Float o(Float f10, Float f11) {
        if (f10 == null) {
            return f11;
        }
        return f11 == null ? f10 : Float.valueOf(Math.min(f10.floatValue(), f11.floatValue()));
    }

    public static MotionEvent p(int i10, int i11, int i12) {
        return MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), i10, i11, i12, 0);
    }

    public static MotionEvent q(int i10, Point point) {
        return p(i10, point.x, point.y);
    }

    public static void r(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            runnable.run();
        } else {
            f15512a.post(runnable);
        }
    }

    public static int s(int i10, int i11) {
        return i10 > i11 ? 2 : 1;
    }

    public static String t(int i10) {
        if (i10 == 0) {
            return "UNDEFINED";
        }
        if (i10 != 1) {
            return i10 != 2 ? "UNKNOWN" : "LANDSCAPE";
        }
        return "PORTRAIT";
    }

    public static void u(View view) {
        if (view == null || view.getParent() == null || !(view.getParent() instanceof ViewGroup)) {
            return;
        }
        ((ViewGroup) view.getParent()).removeView(view);
    }

    public static void v(String str) {
        w(str, Executors.newSingleThreadExecutor());
    }

    public static void w(final String str, Executor executor) {
        if (TextUtils.isEmpty(str)) {
            h.a("Utils", "url is null or empty", new Object[0]);
            return;
        }
        try {
            executor.execute(new Runnable() { // from class: g7.x
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    y.b(str);
                }
            });
        } catch (Exception e10) {
            h.c("Utils", e10);
        }
    }

    public static String x(Rect rect) {
        return rect.left + "," + rect.top + "," + rect.width() + "," + rect.height();
    }

    public static String y(Rect rect) {
        return rect.width() + "," + rect.height();
    }
}
