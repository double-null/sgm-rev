package wb;

import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.graphics.Rect;
import android.location.Location;
import android.net.Uri;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import c2.YDwL.tFQWuE;
import com.adjust.sdk.Constants;
import java.io.Closeable;
import java.io.Flushable;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: Utils.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d0 f27684a = new d0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final char[] f27685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final char[] f27686c;

    private d0() {
    }

    public static final Intent A(BroadcastReceiver receiver, Context context, IntentFilter intentFilter) {
        kotlin.jvm.internal.t.f(receiver, "receiver");
        kotlin.jvm.internal.t.f(context, "context");
        kotlin.jvm.internal.t.f(intentFilter, "intentFilter");
        return e0.E(context, receiver, intentFilter);
    }

    public static final float a(int i10) {
        return e0.W(Integer.valueOf(Color.blue(i10)), 255.0f);
    }

    public static final void b(Closeable closeable) {
        e0.c(closeable);
    }

    public static final Handler c() {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            looperMyLooper = Looper.getMainLooper();
        }
        return new Handler(looperMyLooper);
    }

    public static final byte[] d(String base64, int i10) {
        kotlin.jvm.internal.t.f(base64, "base64");
        return e0.e(base64, i10);
    }

    public static /* synthetic */ byte[] e(String str, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 2;
        }
        return d(str, i10);
    }

    public static final String f(String data, int i10) {
        kotlin.jvm.internal.t.f(data, "data");
        return e0.i(data, i10);
    }

    public static /* synthetic */ String g(String str, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 2;
        }
        return f(str, i10);
    }

    public static final int h(Context context, float f10) {
        kotlin.jvm.internal.t.f(context, "context");
        return e0.k(context, f10);
    }

    public static final void i(Flushable flushable) {
        e0.o(flushable);
    }

    public static final Object j(Object obj) {
        if (obj != null && !kotlin.jvm.internal.t.a(obj, JSONObject.NULL)) {
            if (obj instanceof JSONObject) {
                return e0.V((JSONObject) obj);
            }
            return obj instanceof JSONArray ? e0.S((JSONArray) obj) : obj;
        }
        return null;
    }

    public static final Object k(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof List) {
            return e0.Q((List) obj);
        }
        return obj instanceof Map ? e0.R((Map) obj) : obj;
    }

    public static final DownloadManager l(Context context) {
        kotlin.jvm.internal.t.f(context, "context");
        return e0.s(context);
    }

    public static final Location m(Context context) {
        kotlin.jvm.internal.t.f(context, "context");
        return e0.u(context);
    }

    public static final float n(Rect mainRect, Rect coverRect) {
        kotlin.jvm.internal.t.f(mainRect, "mainRect");
        kotlin.jvm.internal.t.f(coverRect, "coverRect");
        int iWidth = mainRect.width() * mainRect.height();
        if (iWidth == 0) {
            return 0.0f;
        }
        return (iWidth - (Math.max(0, Math.min(mainRect.right, coverRect.right) - Math.max(mainRect.left, coverRect.left)) * Math.max(0, Math.min(mainRect.bottom, coverRect.bottom) - Math.max(mainRect.top, coverRect.top)))) / iWidth;
    }

    public static final Uri o(String str) {
        try {
            return Uri.parse(p(str));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final String p(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        if (v(str)) {
            return str;
        }
        try {
            return URLDecoder.decode(str, Constants.ENCODING);
        } catch (UnsupportedEncodingException | IllegalArgumentException unused) {
            return str;
        }
    }

    public static final float q(int i10) {
        return e0.W(Integer.valueOf(Color.green(i10)), 255.0f);
    }

    public static final <T> void r(T t10, i<T> action) {
        kotlin.jvm.internal.t.f(action, "action");
        if (t10 != null) {
            action.execute(t10);
        }
    }

    public static final boolean s() {
        return kotlin.jvm.internal.t.a(Environment.getExternalStorageState(), "mounted");
    }

    public static final boolean t(Uri uri) {
        String string;
        return (uri == null || (string = uri.toString()) == null || !e0.x(string)) ? false : true;
    }

    public static final boolean u(String url) {
        kotlin.jvm.internal.t.f(url, "url");
        return e0.x(url);
    }

    public static final boolean v(String str) {
        Boolean bool;
        if (str == null || str.length() == 0) {
            return false;
        }
        try {
            new URL(str);
            bool = Boolean.TRUE;
        } catch (Throwable unused) {
            bool = null;
        }
        return kotlin.jvm.internal.t.a(bool, Boolean.TRUE);
    }

    public static final Integer w(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            return Integer.valueOf(Color.parseColor(str));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final Integer x(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            if (str.charAt(0) == '#' && str.length() == 9) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append('#');
                String strSubstring = str.substring(7, 9);
                kotlin.jvm.internal.t.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                sb2.append(strSubstring);
                String strSubstring2 = str.substring(1, 7);
                kotlin.jvm.internal.t.e(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                sb2.append(strSubstring2);
                str = sb2.toString();
            }
            return Integer.valueOf(Color.parseColor(str));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final int y(float f10, int i10) {
        return (int) ((i10 / f10) + 0.5f);
    }

    public static final float z(int i10) {
        return e0.W(Integer.valueOf(Color.red(i10)), 255.0f);
    }

    static {
        char[] charArray = tFQWuE.hgcupWaAxOwuu.toCharArray();
        kotlin.jvm.internal.t.e(charArray, "this as java.lang.String).toCharArray()");
        f27685b = charArray;
        char[] charArray2 = "0123456789ABCDEF".toCharArray();
        kotlin.jvm.internal.t.e(charArray2, "this as java.lang.String).toCharArray()");
        f27686c = charArray2;
    }
}
