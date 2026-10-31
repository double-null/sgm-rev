package wb;

import android.app.Activity;
import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.os.Process;
import android.telephony.TelephonyManager;
import android.util.Base64;
import android.util.TypedValue;
import android.view.inputmethod.InputMethodManager;
import com.vungle.ads.internal.presenter.NativeAdPresenter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.Flushable;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: Utils.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final yb.g f27688a = new yb.g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final yb.b f27689b = new yb.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final yb.e f27690c = new yb.e();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final yb.f f27691d = new yb.f();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final yb.d f27692e = new yb.d();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final yb.c f27693f = new yb.c();

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> void A(Map<K, V> map, Map<K, ? extends V> map2) {
        kotlin.jvm.internal.t.f(map, "<this>");
        if (map2 == 0 || map2.isEmpty()) {
            return;
        }
        map.putAll(map2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> void B(Map<K, V> map, Map<K, ? extends V> map2) {
        kotlin.jvm.internal.t.f(map, "<this>");
        if (map2 == 0) {
            return;
        }
        map.putAll(map2);
    }

    public static final int C(Context context, int i10) {
        kotlin.jvm.internal.t.f(context, "<this>");
        return d0.y(g.g(context), i10);
    }

    public static final long D(InputStream inputStream, File file) throws Throwable {
        kotlin.jvm.internal.t.f(inputStream, "<this>");
        kotlin.jvm.internal.t.f(file, "file");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                long jB = fd.a.b(inputStream, fileOutputStream, 0, 2, null);
                fd.b.a(fileOutputStream, null);
                fd.b.a(inputStream, null);
                return jB;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    fd.b.a(fileOutputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                fd.b.a(inputStream, th3);
                throw th4;
            }
        }
    }

    public static final Intent E(Context context, BroadcastReceiver receiver, IntentFilter intentFilter) {
        kotlin.jvm.internal.t.f(context, "<this>");
        kotlin.jvm.internal.t.f(receiver, "receiver");
        kotlin.jvm.internal.t.f(intentFilter, "intentFilter");
        return Build.VERSION.SDK_INT >= 33 ? context.registerReceiver(receiver, intentFilter, 2) : context.registerReceiver(receiver, intentFilter);
    }

    public static final void F(Rect rect, Rect rectPx, float f10) {
        kotlin.jvm.internal.t.f(rect, "<this>");
        kotlin.jvm.internal.t.f(rectPx, "rectPx");
        rect.set(d0.y(f10, rectPx.left), d0.y(f10, rectPx.top), d0.y(f10, rectPx.right), d0.y(f10, rectPx.bottom));
    }

    public static final <T> void G(Collection<T> collection, Collection<? extends T> collection2) {
        kotlin.jvm.internal.t.f(collection, "<this>");
        collection.clear();
        a(collection, collection2);
    }

    public static final <K, V> void H(Map<K, V> map, Map<K, ? extends V> map2) {
        kotlin.jvm.internal.t.f(map, "<this>");
        map.clear();
        B(map, map2);
    }

    public static final Boolean I(Object obj, Boolean bool) {
        return f27689b.e(obj, bool);
    }

    public static /* synthetic */ Boolean J(Object obj, Boolean bool, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            bool = null;
        }
        return I(obj, bool);
    }

    public static final Double K(Object obj, Double d10) {
        return f27693f.e(obj, d10);
    }

    public static /* synthetic */ Double L(Object obj, Double d10, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            d10 = null;
        }
        return K(obj, d10);
    }

    public static final Float M(Object obj, Float f10) {
        return f27692e.e(obj, f10);
    }

    public static /* synthetic */ Float N(Object obj, Float f10, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            f10 = null;
        }
        return M(obj, f10);
    }

    public static final Integer O(Object obj, Integer num) {
        return f27690c.e(obj, num);
    }

    public static /* synthetic */ Integer P(Object obj, Integer num, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            num = null;
        }
        return O(obj, num);
    }

    public static final JSONArray Q(List<?> list) {
        kotlin.jvm.internal.t.f(list, "<this>");
        JSONArray jSONArray = new JSONArray();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Object objK = d0.k(it.next());
            if (objK != null) {
                jSONArray.put(objK);
            }
        }
        return jSONArray;
    }

    public static final JSONObject R(Map<?, ?> map) throws JSONException {
        Object objK;
        kotlin.jvm.internal.t.f(map, "<this>");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            String string = key != null ? key.toString() : null;
            Object value = entry.getValue();
            boolean z10 = false;
            if (string != null) {
                if (string.length() > 0) {
                    z10 = true;
                }
            }
            if (z10 && value != null && (objK = d0.k(value)) != null) {
                jSONObject.put(string, objK);
            }
        }
        return jSONObject;
    }

    public static final List<Object> S(JSONArray jSONArray) {
        kotlin.jvm.internal.t.f(jSONArray, "<this>");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            Object objJ = d0.j(jSONArray.opt(i10));
            if (objJ != null) {
                arrayList.add(objJ);
            }
        }
        return arrayList;
    }

    public static final Long T(Object obj, Long l10) {
        return f27691d.e(obj, l10);
    }

    public static /* synthetic */ Long U(Object obj, Long l10, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            l10 = null;
        }
        return T(obj, l10);
    }

    public static final Map<String, Object> V(JSONObject jSONObject) {
        kotlin.jvm.internal.t.f(jSONObject, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> itKeys = jSONObject.keys();
        kotlin.jvm.internal.t.e(itKeys, "keys()");
        for (String key : qd.n.d(itKeys)) {
            Object objJ = d0.j(jSONObject.opt(key));
            if (objJ != null) {
                kotlin.jvm.internal.t.e(key, "key");
                linkedHashMap.put(key, objJ);
            }
        }
        return linkedHashMap;
    }

    public static final <T extends Number> float W(T t10, float f10) {
        kotlin.jvm.internal.t.f(t10, "<this>");
        return kd.c.a((t10.floatValue() / f10) * 100) / 100.0f;
    }

    public static final String X(Object obj, String str) {
        return f27688a.e(obj, str);
    }

    public static /* synthetic */ String Y(Object obj, String str, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        return X(obj, str);
    }

    public static final int Z(Context context, int i10, float f10) {
        kotlin.jvm.internal.t.f(context, "<this>");
        if (f10 == 0.0f) {
            return 0;
        }
        return (int) TypedValue.applyDimension(i10, f10, g.b(context));
    }

    public static final <T> void a(Collection<T> collection, Collection<? extends T> collection2) {
        kotlin.jvm.internal.t.f(collection, "<this>");
        if (collection2 == null) {
            return;
        }
        collection.addAll(collection2);
    }

    public static final byte[] b(byte[] bArr) {
        kotlin.jvm.internal.t.f(bArr, "<this>");
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            return messageDigest.digest();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final void c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
                wc.g0 g0Var = wc.g0.f27756a;
            } catch (Throwable unused) {
            }
        }
    }

    public static final String d(Object obj) {
        kotlin.jvm.internal.t.f(obj, "<this>");
        String hexString = Integer.toHexString(obj.hashCode());
        kotlin.jvm.internal.t.e(hexString, "toHexString(hashCode())");
        return hexString;
    }

    public static final byte[] e(String str, int i10) {
        kotlin.jvm.internal.t.f(str, "<this>");
        try {
            byte[] bytes = str.getBytes(rd.d.f24999b);
            kotlin.jvm.internal.t.e(bytes, "this as java.lang.String).getBytes(charset)");
            return f(bytes, i10);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final byte[] f(byte[] bArr, int i10) {
        kotlin.jvm.internal.t.f(bArr, "<this>");
        try {
            return Base64.decode(bArr, i10);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ byte[] g(String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 2;
        }
        return e(str, i10);
    }

    public static /* synthetic */ byte[] h(byte[] bArr, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 2;
        }
        return f(bArr, i10);
    }

    public static final String i(String str, int i10) {
        kotlin.jvm.internal.t.f(str, "<this>");
        byte[] bytes = str.getBytes(rd.d.f24999b);
        kotlin.jvm.internal.t.e(bytes, "this as java.lang.String).getBytes(charset)");
        return j(bytes, i10);
    }

    public static final String j(byte[] bArr, int i10) {
        kotlin.jvm.internal.t.f(bArr, "<this>");
        byte[] bArrF = f(bArr, i10);
        if (bArrF != null) {
            return new String(bArrF, rd.d.f24999b);
        }
        return null;
    }

    public static final int k(Context context, float f10) {
        kotlin.jvm.internal.t.f(context, "<this>");
        return Z(context, 1, f10);
    }

    public static final <T extends q> T l(T[] tArr, String str) {
        String lowerCase;
        String key;
        kotlin.jvm.internal.t.f(tArr, "<this>");
        if (str == null || str.length() == 0) {
            return null;
        }
        Locale locale = Locale.getDefault();
        kotlin.jvm.internal.t.e(locale, "getDefault()");
        String lowerCase2 = str.toLowerCase(locale);
        kotlin.jvm.internal.t.e(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
        for (T t10 : tArr) {
            if (t10 == null || (key = t10.getKey()) == null) {
                lowerCase = null;
            } else {
                Locale locale2 = Locale.getDefault();
                kotlin.jvm.internal.t.e(locale2, "getDefault()");
                lowerCase = key.toLowerCase(locale2);
                kotlin.jvm.internal.t.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            }
            if (rd.c0.C(lowerCase, lowerCase2, false, 2, null)) {
                return t10;
            }
        }
        return null;
    }

    public static final Activity m(ContextWrapper contextWrapper, int i10) {
        kotlin.jvm.internal.t.f(contextWrapper, "<this>");
        if (i10 >= 10) {
            return null;
        }
        Context baseContext = contextWrapper.getBaseContext();
        if (baseContext instanceof Activity) {
            return (Activity) baseContext;
        }
        if (baseContext instanceof ContextWrapper) {
            return m((ContextWrapper) baseContext, i10 + 1);
        }
        return null;
    }

    public static /* synthetic */ Activity n(ContextWrapper contextWrapper, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return m(contextWrapper, i10);
    }

    public static final void o(Flushable flushable) {
        if (flushable != null) {
            try {
                flushable.flush();
                wc.g0 g0Var = wc.g0.f27756a;
            } catch (Throwable unused) {
            }
        }
    }

    public static final <T extends Number> float p(T t10, float f10) {
        kotlin.jvm.internal.t.f(t10, "<this>");
        return (f10 * t10.floatValue()) / 1.0f;
    }

    public static final ClipboardManager q(Context context) {
        kotlin.jvm.internal.t.f(context, "<this>");
        try {
            Object systemService = context.getSystemService("clipboard");
            if (!(systemService instanceof ClipboardManager)) {
                systemService = null;
            }
            return (ClipboardManager) systemService;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final int r(Context context, int i10) {
        kotlin.jvm.internal.t.f(context, "<this>");
        return context.getColor(i10);
    }

    public static final DownloadManager s(Context context) {
        kotlin.jvm.internal.t.f(context, "<this>");
        try {
            Object systemService = context.getSystemService(NativeAdPresenter.DOWNLOAD);
            if (!(systemService instanceof DownloadManager)) {
                systemService = null;
            }
            return (DownloadManager) systemService;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final InputMethodManager t(Context context) {
        kotlin.jvm.internal.t.f(context, "<this>");
        try {
            Object systemService = context.getSystemService("input_method");
            if (!(systemService instanceof InputMethodManager)) {
                systemService = null;
            }
            return (InputMethodManager) systemService;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final Location u(Context context) {
        LocationManager locationManagerV;
        Location lastKnownLocation;
        kotlin.jvm.internal.t.f(context, "<this>");
        try {
            if (!y(context, "android.permission.ACCESS_COARSE_LOCATION") || (locationManagerV = v(context)) == null) {
                return null;
            }
            String bestProvider = Build.VERSION.SDK_INT >= 34 ? "fused" : locationManagerV.getBestProvider(new Criteria(), false);
            if (bestProvider == null) {
                return null;
            }
            Location lastKnownLocation2 = locationManagerV.getLastKnownLocation(bestProvider);
            if (lastKnownLocation2 != null) {
                return lastKnownLocation2;
            }
            List<String> allProviders = locationManagerV.getAllProviders();
            kotlin.jvm.internal.t.e(allProviders, "locationManager.allProviders");
            if (allProviders.size() <= 1) {
                return null;
            }
            for (String str : allProviders) {
                if (str != null && !kotlin.jvm.internal.t.a(str, bestProvider) && (lastKnownLocation = locationManagerV.getLastKnownLocation(str)) != null) {
                    return lastKnownLocation;
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static final LocationManager v(Context context) {
        kotlin.jvm.internal.t.f(context, "<this>");
        try {
            Object systemService = context.getSystemService("location");
            if (!(systemService instanceof LocationManager)) {
                systemService = null;
            }
            return (LocationManager) systemService;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final TelephonyManager w(Context context) {
        kotlin.jvm.internal.t.f(context, "<this>");
        try {
            Object systemService = context.getSystemService("phone");
            if (!(systemService instanceof TelephonyManager)) {
                systemService = null;
            }
            return (TelephonyManager) systemService;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final boolean x(String str) {
        kotlin.jvm.internal.t.f(str, "<this>");
        return rd.c0.O(str, "http://", false, 2, null) || rd.c0.O(str, "https://", false, 2, null);
    }

    public static final boolean y(Context context, String str) {
        Boolean boolValueOf;
        kotlin.jvm.internal.t.f(context, "<this>");
        boolean z10 = true;
        if (str == null || str.length() == 0) {
            return false;
        }
        try {
            if (context.checkPermission(str, Process.myPid(), Process.myUid()) != 0) {
                z10 = false;
            }
            boolValueOf = Boolean.valueOf(z10);
        } catch (Throwable unused) {
            boolValueOf = null;
        }
        return kotlin.jvm.internal.t.a(boolValueOf, Boolean.TRUE);
    }

    public static final String z(String str) {
        if (str == null) {
            return null;
        }
        if (str.length() == 0) {
            str = null;
        }
        return str;
    }
}
