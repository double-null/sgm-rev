package io.bidmachine.core;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.location.Location;
import android.media.MediaMetadataRetriever;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Environment;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Process;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Size;
import android.view.View;
import com.adjust.sdk.Constants;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import com.vungle.ads.internal.protos.Sdk;
import io.bidmachine.Executable;
import io.bidmachine.Function;
import io.bidmachine.SimpleContextProvider;
import io.bidmachine.UserAgentManager;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.Flushable;
import java.io.InputStream;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import oc.q;
import org.json.JSONObject;
import wb.d0;
import wb.g0;

/* JADX INFO: compiled from: Utils.java */
/* JADX INFO: loaded from: classes4.dex */
public class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Handler f17546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final qc.a<Integer> f17547c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static String f17550f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static String f17551g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Handler f17545a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final char[] f17548d = "0123456789abcdef".toCharArray();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final char[] f17549e = "0123456789ABCDEF".toCharArray();

    static {
        HandlerThread handlerThread = new HandlerThread("BackgroundHandlerThread");
        handlerThread.start();
        f17546b = new Handler(handlerThread.getLooper());
        f17547c = new qc.a<>(new qc.b() { // from class: io.bidmachine.core.f
            @Override // qc.b
            public final Object get() {
                return h.P();
            }
        });
    }

    public static void A(String str, Executable<String> executable) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        executable.execute(str);
    }

    public static <T> void B(T t10, Executable<T> executable) {
        if (t10 != null) {
            executable.execute(t10);
        }
    }

    public static boolean C(Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    public static boolean D() {
        return Environment.getExternalStorageState().equals("mounted");
    }

    public static boolean E(String str) {
        return str.startsWith("http://") || str.startsWith("https://");
    }

    public static boolean F(Context context) {
        NetworkInfo networkInfoP = p(context);
        return networkInfoP != null && networkInfoP.isConnected();
    }

    public static boolean G(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            return context.checkPermission(str, Process.myPid(), Process.myUid()) == 0;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean H() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean I(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            new URL(str);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean J(int i10) {
        return i10 >= 1900 && i10 <= f17547c.get().intValue();
    }

    public static <T> String K(List<T> list) {
        return L(list, ", ");
    }

    public static <T> String L(List<T> list, CharSequence charSequence) {
        return M(list, charSequence, new Function() { // from class: io.bidmachine.core.d
            @Override // io.bidmachine.Function
            public final Object apply(Object obj) {
                return obj.toString();
            }
        });
    }

    public static <T> String M(List<T> list, CharSequence charSequence, Function<T, String> function) {
        String strApply;
        if (C(list)) {
            return null;
        }
        try {
            StringBuilder sb2 = new StringBuilder(list.size());
            for (T t10 : list) {
                if (t10 != null && (strApply = function.apply(t10)) != null) {
                    if (sb2.length() > 0) {
                        sb2.append(charSequence);
                    }
                    sb2.append(strApply);
                }
            }
            return sb2.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String N() {
        return String.format("Manifest permission not found: %s. Check the integration.", "android.permission.ACCESS_NETWORK_STATE");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:39:0x0060 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static /* synthetic */ void O(String str) throws Throwable {
        Throwable th;
        HttpURLConnection httpURLConnection;
        Exception e10;
        try {
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                try {
                    httpURLConnection.setInstanceFollowRedirects(true);
                    httpURLConnection.setConnectTimeout(Sdk.SDKError.Reason.MEDIATION_ERROR_VALUE);
                    httpURLConnection.setRequestProperty("Connection", MRAIDPresenter.CLOSE);
                    httpURLConnection.setRequestMethod("GET");
                    String userAgent = UserAgentManager.getUserAgent();
                    if (!TextUtils.isEmpty(userAgent)) {
                        httpURLConnection.setRequestProperty("User-Agent", userAgent);
                    }
                    httpURLConnection.getResponseCode();
                    try {
                        h(httpURLConnection.getInputStream());
                    } catch (Exception e11) {
                        e = e11;
                        a.o(e);
                    }
                } catch (Exception e12) {
                    e10 = e12;
                    a.o(e10);
                    if (httpURLConnection != null) {
                        try {
                            h(httpURLConnection.getInputStream());
                        } catch (Exception e13) {
                            e = e13;
                            a.o(e);
                        }
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (httpURLConnection != null) {
                    try {
                        h(httpURLConnection.getInputStream());
                    } catch (Exception e14) {
                        a.o(e14);
                    }
                }
                cc.h.b(httpURLConnection);
                throw th;
            }
        } catch (Exception e15) {
            e10 = e15;
            httpURLConnection = null;
        } catch (Throwable th3) {
            th = th3;
            httpURLConnection = null;
            if (httpURLConnection != null) {
                h(httpURLConnection.getInputStream());
            }
            cc.h.b(httpURLConnection);
            throw th;
        }
        cc.h.b(httpURLConnection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer P() {
        return Integer.valueOf(d0().get(1));
    }

    public static void Q(Runnable runnable) {
        Looper looperMyLooper = Looper.myLooper();
        Handler handler = f17546b;
        if (looperMyLooper == handler.getLooper()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    public static void R(Runnable runnable, long j10) {
        f17546b.postDelayed(runnable, j10);
    }

    public static void S(Runnable runnable) {
        if (H()) {
            runnable.run();
        } else {
            f17545a.post(runnable);
        }
    }

    public static <T> T T(T t10, T t11) {
        return (T) U(t10, t11, null);
    }

    public static <T> T U(T t10, T t11, T t12) {
        if (t10 != null) {
            return t10;
        }
        return t11 != null ? t11 : t12;
    }

    public static Float V(String str, Float f10) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Float.valueOf(Float.parseFloat(str));
            } catch (Throwable unused) {
            }
        }
        return f10;
    }

    public static Integer W(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        str.hashCode();
        switch (str) {
            case "center":
                return 1;
            case "left":
                return 3;
            case "right":
                return 5;
            default:
                return null;
        }
    }

    public static int X(String str, int i10) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.parseInt(str);
            } catch (Throwable unused) {
            }
        }
        return i10;
    }

    public static Integer Y(String str, Integer num) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Integer.parseInt(str));
            } catch (Throwable unused) {
            }
        }
        return num;
    }

    public static Integer Z(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        str.hashCode();
        switch (str) {
            case "bottom":
                return 80;
            case "center":
                return 16;
            case "top":
                return 48;
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V> void a0(Map<K, V> map, Map<K, V> map2) {
        if (map == null || map2 == 0) {
            return;
        }
        map.putAll(map2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Closeable, java.io.Flushable] */
    public static File b0(Context context, Uri uri, String str) throws Throwable {
        FileOutputStream fileOutputStream;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(context, uri);
        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
        ?? r10 = 0;
        if (strExtractMetadata == null) {
            return null;
        }
        Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime(Long.parseLong(strExtractMetadata), 2);
        try {
            if (frameAtTime != null) {
                try {
                    File file = new File(t(context, str), n(uri.toString()));
                    fileOutputStream = new FileOutputStream(file);
                    try {
                        frameAtTime.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                        m(fileOutputStream);
                        h(fileOutputStream);
                        return file;
                    } catch (Exception e10) {
                        e = e10;
                        a.o(e);
                        m(fileOutputStream);
                        h(fileOutputStream);
                        return null;
                    }
                } catch (Exception e11) {
                    e = e11;
                    fileOutputStream = null;
                } catch (Throwable th) {
                    th = th;
                    m(r10);
                    h(r10);
                    throw th;
                }
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            r10 = context;
        }
    }

    public static void c0(q qVar) {
        try {
            qVar.run();
        } catch (Throwable unused) {
        }
    }

    public static boolean d(Activity activity) {
        return (activity == null || activity.getWindow() == null || !activity.getWindow().isActive() || activity.getWindow().getDecorView().getWindowToken() == null) ? false : true;
    }

    private static Calendar d0() {
        try {
            try {
                return Calendar.getInstance();
            } catch (Throwable unused) {
                return Calendar.getInstance(Locale.US);
            }
        } catch (Throwable unused2) {
            return Calendar.getInstance(TimeZone.getTimeZone("GMT"), Locale.US);
        }
    }

    public static boolean e() {
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
    }

    public static void e0(final String str, Executor executor) {
        if (TextUtils.isEmpty(str) || executor == null) {
            return;
        }
        try {
            executor.execute(new Runnable() { // from class: io.bidmachine.core.e
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    h.O(str);
                }
            });
        } catch (Exception e10) {
            a.o(e10);
        }
    }

    public static void f(Runnable runnable) {
        f17546b.removeCallbacks(runnable);
    }

    public static void f0(Context context, Intent intent) {
        try {
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            context.startActivity(intent);
        } catch (Throwable th) {
            a.o(th);
        }
    }

    public static String g(String str, String str2) {
        return !TextUtils.isEmpty(str) ? str : str2;
    }

    public static String g0(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream;
        String string = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i10 = inputStream.read(bArr);
                    if (i10 == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i10);
                }
                string = byteArrayOutputStream.toString(Constants.ENCODING);
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            byteArrayOutputStream = null;
        }
        m(byteArrayOutputStream);
        h(byteArrayOutputStream);
        h(inputStream);
        return string;
    }

    public static void h(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e10) {
                a.o(e10);
            }
        }
    }

    public static Map<String, String> h0(JSONObject jSONObject) throws Exception {
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = jSONObject.opt(next);
            if (objOpt != null) {
                map.put(next, objOpt.toString());
            }
        }
        return map;
    }

    public static Float i(Object obj, Float f10) {
        if (obj == null) {
            return f10;
        }
        return obj instanceof Number ? Float.valueOf(((Number) obj).floatValue()) : V(obj.toString(), f10);
    }

    public static String i0(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        if (bArr.length == 0) {
            return "";
        }
        char[] cArr = new char[(bArr.length * 3) - 1];
        int i10 = 0;
        for (int i11 = 0; i11 < bArr.length; i11++) {
            int i12 = bArr[i11] & 255;
            int i13 = i10 + 1;
            char[] cArr2 = f17549e;
            cArr[i10] = cArr2[i12 >>> 4];
            i10 = i13 + 1;
            cArr[i13] = cArr2[i12 & 15];
            if (i11 < bArr.length - 1) {
                cArr[i10] = ':';
                i10++;
            }
        }
        return new String(cArr);
    }

    public static Integer j(Object obj, Integer num) {
        if (obj == null) {
            return num;
        }
        return obj instanceof Number ? Integer.valueOf(((Number) obj).intValue()) : Y(obj.toString(), num);
    }

    public static Context k(Context context) {
        return l(context, null);
    }

    public static Context l(Context context, View view) {
        Activity activity = new SimpleContextProvider(context).getActivity();
        if (activity != null) {
            return activity;
        }
        if (view == null) {
            return context;
        }
        View viewD = g0.d(view);
        return viewD != null ? viewD.getContext() : view.getContext();
    }

    public static void m(Flushable flushable) {
        if (flushable != null) {
            try {
                flushable.flush();
            } catch (Exception e10) {
                a.o(e10);
            }
        }
    }

    public static String n(String str) {
        return new BigInteger(v(str.getBytes())).abs().toString(36);
    }

    public static NetworkCapabilities o(Context context) {
        ConnectivityManager connectivityManagerU = u(context);
        if (connectivityManagerU == null) {
            return null;
        }
        try {
            Network activeNetwork = connectivityManagerU.getActiveNetwork();
            if (activeNetwork == null) {
                return null;
            }
            return connectivityManagerU.getNetworkCapabilities(activeNetwork);
        } catch (Throwable th) {
            a.o(th);
            return null;
        }
    }

    public static NetworkInfo p(Context context) {
        try {
            ConnectivityManager connectivityManagerU = u(context);
            if (connectivityManagerU != null) {
                return connectivityManagerU.getActiveNetworkInfo();
            }
            return null;
        } catch (Throwable th) {
            a.o(th);
            return null;
        }
    }

    public static String q(Context context) {
        if (f17550f == null) {
            f17550f = (String) context.getPackageManager().getApplicationLabel(context.getApplicationInfo());
        }
        return f17550f;
    }

    public static String r(Context context) {
        if (f17551g == null) {
            try {
                String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
                if (str != null) {
                    f17551g = str;
                }
            } catch (Exception e10) {
                a.o(e10);
            }
        }
        return f17551g;
    }

    public static Location s(Context context, Location location, Location location2) {
        Location location3 = (Location) T(location, location2);
        Location locationM = d0.m(context);
        if (locationM != null) {
            return (location3 == null || locationM.getTime() >= location3.getTime()) ? locationM : location3;
        }
        return location3;
    }

    public static File t(Context context, String str) {
        File file = new File(context.getCacheDir(), str);
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    public static ConnectivityManager u(Context context) {
        if (!G(context, "android.permission.ACCESS_NETWORK_STATE")) {
            a.g(new qc.b() { // from class: io.bidmachine.core.g
                @Override // qc.b
                public final Object get() {
                    return h.N();
                }
            });
            return null;
        }
        try {
            return (ConnectivityManager) context.getSystemService("connectivity");
        } catch (Throwable th) {
            a.o(th);
            return null;
        }
    }

    public static byte[] v(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            return messageDigest.digest();
        } catch (NoSuchAlgorithmException e10) {
            a.o(e10);
            return null;
        }
    }

    public static long w(long j10, long j11, long j12) {
        return j10 == j11 ? j12 : j10;
    }

    public static float x(Context context) {
        return oc.d.d(context).density;
    }

    public static Size y(Context context) {
        DisplayMetrics displayMetricsD = oc.d.d(context);
        return new Size(displayMetricsD.widthPixels, displayMetricsD.heightPixels);
    }

    public static int z() {
        return (int) TimeUnit.MILLISECONDS.toMinutes(TimeZone.getDefault().getOffset(System.currentTimeMillis()));
    }
}
