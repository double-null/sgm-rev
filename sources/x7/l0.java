package x7;

import android.app.UiModeManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.hardware.display.DisplayManager;
import android.media.AudioFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Display;
import android.view.WindowManager;
import com.android.billingclient.gp.VRfCTjjLv;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.explorestack.protobuf.openrtb.LossReason;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.facebook.share.internal.ShareConstants;
import com.facebook.share.internal.ShareInternalUtility;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.vungle.ads.internal.network.converters.vY.cTJaRZ;
import com.vungle.ads.internal.network.converters.vY.vgmm;
import com.vungle.ads.internal.protos.Sdk;
import io.bidmachine.media3.common.ParserException;
import java.io.Closeable;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import pb.vBC.NyXuoef;

/* JADX INFO: compiled from: Util.java */
/* JADX INFO: loaded from: classes4.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f28136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final String f28137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final String f28138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final String f28139d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f28140e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f28141f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long[] f28142g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Pattern f28143h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Pattern f28144i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Pattern f28145j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Pattern f28146k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static HashMap<String, String> f28147l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String[] f28148m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String[] f28149n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int[] f28150o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int[] f28151p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int[] f28152q;

    public static Handler A() {
        return B(null);
    }

    public static int A0(Uri uri, String str) {
        if (str == null) {
            return y0(uri);
        }
        switch (str) {
            case "application/x-mpegURL":
                return 2;
            case "application/vnd.ms-sstr+xml":
                return 1;
            case "application/dash+xml":
                return 0;
            case "application/x-rtsp":
                return 3;
            default:
                return 4;
        }
    }

    public static Handler B(Handler.Callback callback) {
        return z((Looper) a.i(Looper.myLooper()), callback);
    }

    public static boolean B0(a0 a0Var, a0 a0Var2, Inflater inflater) {
        if (a0Var.a() <= 0) {
            return false;
        }
        if (a0Var2.b() < a0Var.a()) {
            a0Var2.c(a0Var.a() * 2);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(a0Var.e(), a0Var.f(), a0Var.a());
        int iInflate = 0;
        while (true) {
            try {
                iInflate += inflater.inflate(a0Var2.e(), iInflate, a0Var2.b() - iInflate);
                if (inflater.finished()) {
                    a0Var2.V(iInflate);
                    inflater.reset();
                    return true;
                }
                if (!inflater.needsDictionary() && !inflater.needsInput()) {
                    if (iInflate == a0Var2.b()) {
                        a0Var2.c(a0Var2.b() * 2);
                    }
                }
                inflater.reset();
                return false;
            } catch (DataFormatException unused) {
                inflater.reset();
                return false;
            } catch (Throwable th) {
                inflater.reset();
                throw th;
            }
        }
    }

    public static Handler C() {
        return D(null);
    }

    public static String C0(int i10) {
        return Integer.toString(i10, 36);
    }

    public static Handler D(Handler.Callback callback) {
        return z(X(), callback);
    }

    public static boolean D0(Context context) {
        return f28136a >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
    }

    private static HashMap<String, String> E() {
        String[] iSOLanguages = Locale.getISOLanguages();
        HashMap<String, String> map = new HashMap<>(iSOLanguages.length + f28148m.length);
        int i10 = 0;
        for (String str : iSOLanguages) {
            try {
                String iSO3Language = new Locale(str).getISO3Language();
                if (!TextUtils.isEmpty(iSO3Language)) {
                    map.put(iSO3Language, str);
                }
            } catch (MissingResourceException unused) {
            }
        }
        while (true) {
            String[] strArr = f28148m;
            if (i10 >= strArr.length) {
                return map;
            }
            map.put(strArr[i10], strArr[i10 + 1]);
            i10 += 2;
        }
    }

    public static long F(long j10, int i10) {
        return h1(j10, i10, 1000000L, RoundingMode.UP);
    }

    public static boolean F0(int i10) {
        return i10 == 21 || i10 == 1342177280 || i10 == 22 || i10 == 1610612736 || i10 == 4;
    }

    public static String G(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static boolean G0(int i10) {
        return i10 == 3 || i10 == 2 || i10 == 268435456 || i10 == 21 || i10 == 1342177280 || i10 == 22 || i10 == 1610612736 || i10 == 4;
    }

    public static String H(byte[] bArr) {
        return new String(bArr, StandardCharsets.UTF_8);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0024  */
    public static boolean H0(Context context) {
        int i10 = f28136a;
        if (i10 >= 29 && context.getApplicationInfo().targetSdkVersion >= 29) {
            if (i10 != 30) {
                if (i10 == 34) {
                }
                return false;
            }
            String str = Build.MODEL;
            if (!com.google.common.base.c.a(str, "moto g(20)") && !com.google.common.base.c.a(str, "rmx3231")) {
                if (i10 == 34 || !com.google.common.base.c.a(Build.MODEL, "sm-x200")) {
                    return false;
                }
            }
        }
        return true;
    }

    public static String I(byte[] bArr, int i10, int i11) {
        return new String(bArr, i10, i11, StandardCharsets.UTF_8);
    }

    public static boolean I0(int i10) {
        return i10 == 10 || i10 == 13;
    }

    public static int J(Context context) {
        return v7.d.c(context).generateAudioSessionId();
    }

    public static boolean J0(Uri uri) {
        String scheme = uri.getScheme();
        return TextUtils.isEmpty(scheme) || ShareInternalUtility.STAGING_PARAM.equals(scheme);
    }

    public static int K(int i10) {
        if (i10 == 20) {
            return 30;
        }
        if (i10 == 22) {
            return 31;
        }
        if (i10 == 30) {
            return 34;
        }
        switch (i10) {
            case 2:
            case 3:
                return 3;
            case 4:
            case 5:
            case 6:
                return 21;
            case 7:
            case 8:
                return 23;
            case 9:
            case 10:
            case 11:
            case 12:
                return 28;
            default:
                switch (i10) {
                    case 14:
                        return 25;
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                        return 28;
                    default:
                        return Integer.MAX_VALUE;
                }
        }
    }

    public static boolean K0(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static AudioFormat L(int i10, int i11, int i12) {
        return new AudioFormat.Builder().setSampleRate(i10).setChannelMask(i11).setEncoding(i12).build();
    }

    public static boolean L0(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.watch");
    }

    public static int M(int i10) {
        if (i10 == 10) {
            return f28136a >= 32 ? 737532 : 6396;
        }
        if (i10 == 12) {
            return 743676;
        }
        if (i10 == 24) {
            return f28136a >= 32 ? 67108860 : 0;
        }
        switch (i10) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                return 6396;
            default:
                return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Thread M0(String str, Runnable runnable) {
        return new Thread(runnable, str);
    }

    public static String N(int i10) {
        if (i10 == 0) {
            return AdError.UNDEFINED_DOMAIN;
        }
        if (i10 == 1) {
            return "original";
        }
        if (i10 == 2) {
            return "depth-linear";
        }
        if (i10 == 3) {
            return "depth-inverse";
        }
        if (i10 == 4) {
            return "depth metadata";
        }
        throw new IllegalStateException("Unsupported auxiliary track type");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Thread N0(String str, Runnable runnable) {
        return new Thread(runnable, str);
    }

    public static u7.y.b O(u7.y yVar, u7.y.b bVar) {
        boolean zB = yVar.b();
        boolean zQ = yVar.Q();
        boolean zL = yVar.L();
        boolean zO = yVar.o();
        boolean zC0 = yVar.c0();
        boolean zS = yVar.s();
        boolean zQ2 = yVar.u().q();
        boolean z10 = false;
        u7.y.b.a aVarD = new u7.y.b.a().b(bVar).d(4, !zB).d(5, zQ && !zB).d(6, zL && !zB).d(7, !zQ2 && (zL || !zC0 || zQ) && !zB).d(8, zO && !zB).d(9, !zQ2 && (zO || (zC0 && zS)) && !zB).d(10, !zB).d(11, zQ && !zB);
        if (zQ && !zB) {
            z10 = true;
        }
        return aVarD.d(12, z10).e();
    }

    public static int O0(int[] iArr, int i10) {
        for (int i11 = 0; i11 < iArr.length; i11++) {
            if (iArr[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    public static int P(ByteBuffer byteBuffer, int i10) {
        int i11 = byteBuffer.getInt(i10);
        return byteBuffer.order() == ByteOrder.BIG_ENDIAN ? i11 : Integer.reverseBytes(i11);
    }

    public static boolean P0(a0 a0Var, a0 a0Var2, Inflater inflater) {
        return a0Var.a() > 0 && a0Var.j() == 120 && B0(a0Var, a0Var2, inflater);
    }

    public static int Q(int i10) {
        if (i10 != 2) {
            if (i10 == 3) {
                return 1;
            }
            if (i10 != 4) {
                if (i10 != 21) {
                    if (i10 != 22) {
                        if (i10 != 268435456) {
                            if (i10 != 1342177280) {
                                if (i10 != 1610612736) {
                                    throw new IllegalArgumentException();
                                }
                            }
                        }
                    }
                }
                return 3;
            }
            return 4;
        }
        return 2;
    }

    private static String Q0(String str) {
        int i10 = 0;
        while (true) {
            String[] strArr = f28149n;
            if (i10 >= strArr.length) {
                return str;
            }
            if (str.startsWith(strArr[i10])) {
                return strArr[i10 + 1] + str.substring(strArr[i10].length());
            }
            i10 += 2;
        }
    }

    public static int R(String str, int i10) {
        int i11 = 0;
        for (String str2 : o1(str)) {
            if (i10 == u7.w.m(str2)) {
                i11++;
            }
        }
        return i11;
    }

    public static <T> void R0(List<T> list, int i10, int i11, int i12) {
        ArrayDeque arrayDeque = new ArrayDeque();
        for (int i13 = (i11 - i10) - 1; i13 >= 0; i13--) {
            arrayDeque.addFirst(list.remove(i10 + i13));
        }
        list.addAll(Math.min(i12, list.size()), arrayDeque);
    }

    public static String S(String str, int i10) {
        String[] strArrO1 = o1(str);
        if (strArrO1.length == 0) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : strArrO1) {
            if (i10 == u7.w.m(str2)) {
                if (sb2.length() > 0) {
                    sb2.append(",");
                }
                sb2.append(str2);
            }
        }
        if (sb2.length() > 0) {
            return sb2.toString();
        }
        return null;
    }

    public static long S0(long j10) {
        return (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? j10 : j10 * 1000;
    }

    public static String T(String str, int i10) {
        String[] strArrO1 = o1(str);
        if (strArrO1.length == 0) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : strArrO1) {
            if (i10 != u7.w.m(str2)) {
                if (sb2.length() > 0) {
                    sb2.append(",");
                }
                sb2.append(str2);
            }
        }
        if (sb2.length() > 0) {
            return sb2.toString();
        }
        return null;
    }

    public static ExecutorService T0(final String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: x7.j0
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return l0.M0(str, runnable);
            }
        });
    }

    public static String U(Context context) {
        TelephonyManager telephonyManager;
        if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                return com.google.common.base.c.f(networkCountryIso);
            }
        }
        return com.google.common.base.c.f(Locale.getDefault().getCountry());
    }

    public static ScheduledExecutorService U0(final String str) {
        return Executors.newSingleThreadScheduledExecutor(new ThreadFactory() { // from class: x7.k0
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return l0.N0(str, runnable);
            }
        });
    }

    public static Point V(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null) {
            display = ((WindowManager) a.e((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
        }
        return W(context, display);
    }

    public static String V0(String str) {
        if (str == null) {
            return null;
        }
        String strReplace = str.replace('_', '-');
        if (!strReplace.isEmpty() && !strReplace.equals("und")) {
            str = strReplace;
        }
        String strE = com.google.common.base.c.e(str);
        String str2 = n1(strE, "-")[0];
        if (f28147l == null) {
            f28147l = E();
        }
        String str3 = f28147l.get(str2);
        if (str3 != null) {
            strE = str3 + strE.substring(str2.length());
            str2 = str3;
        }
        return ("no".equals(str2) || "i".equals(str2) || "zh".equals(str2)) ? Q0(strE) : strE;
    }

    public static Point W(Context context, Display display) {
        if (display.getDisplayId() == 0 && K0(context)) {
            String strS0 = f28136a < 28 ? s0("sys.display-size") : s0("vendor.display-size");
            if (!TextUtils.isEmpty(strS0)) {
                try {
                    String[] strArrM1 = m1(strS0.trim(), "x");
                    if (strArrM1.length == 2) {
                        int i10 = Integer.parseInt(strArrM1[0]);
                        int i11 = Integer.parseInt(strArrM1[1]);
                        if (i10 > 0 && i11 > 0) {
                            return new Point(i10, i11);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                r.c("Util", "Invalid display size: " + strS0);
            }
            if ("Sony".equals(Build.MANUFACTURER) && Build.MODEL.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        if (f28136a >= 23) {
            Z(display, point);
        } else {
            display.getRealSize(point);
        }
        return point;
    }

    public static <T> T[] W0(T[] tArr, T t10) {
        Object[] objArrCopyOf = Arrays.copyOf(tArr, tArr.length + 1);
        objArrCopyOf[tArr.length] = t10;
        return (T[]) j(objArrCopyOf);
    }

    public static Looper X() {
        Looper looperMyLooper = Looper.myLooper();
        return looperMyLooper != null ? looperMyLooper : Looper.getMainLooper();
    }

    public static <T> T[] X0(T[] tArr, T[] tArr2) {
        T[] tArr3 = (T[]) Arrays.copyOf(tArr, tArr.length + tArr2.length);
        System.arraycopy(tArr2, 0, tArr3, tArr.length, tArr2.length);
        return tArr3;
    }

    public static Locale Y() {
        return f28136a >= 24 ? Locale.getDefault(Locale.Category.DISPLAY) : Locale.getDefault();
    }

    public static <T> T[] Y0(T[] tArr, int i10) {
        a.a(i10 <= tArr.length);
        return (T[]) Arrays.copyOf(tArr, i10);
    }

    private static void Z(Display display, Point point) {
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
    }

    public static <T> T[] Z0(T[] tArr, int i10, int i11) {
        a.a(i10 >= 0);
        a.a(i11 <= tArr.length);
        return (T[]) Arrays.copyOfRange(tArr, i10, i11);
    }

    public static Drawable a0(Context context, Resources resources, int i10) {
        return resources.getDrawable(i10, context.getTheme());
    }

    public static long a1(String str) throws ParserException {
        Matcher matcher = f28143h.matcher(str);
        if (!matcher.matches()) {
            throw ParserException.b("Invalid date/time format: " + str, null);
        }
        int i10 = 0;
        if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
            i10 = (Integer.parseInt(matcher.group(12)) * 60) + Integer.parseInt(matcher.group(13));
            if ("-".equals(matcher.group(11))) {
                i10 *= -1;
            }
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
        gregorianCalendar.clear();
        gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
        if (!TextUtils.isEmpty(matcher.group(8))) {
            gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
        }
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        return i10 != 0 ? timeInMillis - (((long) i10) * 60000) : timeInMillis;
    }

    public static int b0(int i10) {
        if (i10 == 2 || i10 == 4) {
            return 6005;
        }
        if (i10 == 10) {
            return 6004;
        }
        if (i10 == 7) {
            return 6005;
        }
        if (i10 == 8) {
            return com.facebook.ads.AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE;
        }
        switch (i10) {
            case 15:
                return com.facebook.ads.AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE;
            case 16:
            case 18:
                return 6005;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return 6004;
            default:
                switch (i10) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return com.facebook.ads.AdError.ICONVIEW_MISSING_ERROR_CODE;
                    default:
                        return 6006;
                }
        }
    }

    public static long b1(String str) {
        Matcher matcher = f28144i.matcher(str);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(str) * 3600.0d * 1000.0d);
        }
        boolean zIsEmpty = true ^ TextUtils.isEmpty(matcher.group(1));
        String strGroup = matcher.group(3);
        double d10 = strGroup != null ? Double.parseDouble(strGroup) * 3.1556908E7d : 0.0d;
        String strGroup2 = matcher.group(5);
        double d11 = d10 + (strGroup2 != null ? Double.parseDouble(strGroup2) * 2629739.0d : 0.0d);
        String strGroup3 = matcher.group(7);
        double d12 = d11 + (strGroup3 != null ? Double.parseDouble(strGroup3) * 86400.0d : 0.0d);
        String strGroup4 = matcher.group(10);
        double d13 = d12 + (strGroup4 != null ? Double.parseDouble(strGroup4) * 3600.0d : 0.0d);
        String strGroup5 = matcher.group(12);
        double d14 = d13 + (strGroup5 != null ? Double.parseDouble(strGroup5) * 60.0d : 0.0d);
        String strGroup6 = matcher.group(14);
        long j10 = (long) ((d14 + (strGroup6 != null ? Double.parseDouble(strGroup6) : 0.0d)) * 1000.0d);
        return zIsEmpty ? -j10 : j10;
    }

    public static long c(long j10, long j11, long j12) {
        long j13 = j10 + j11;
        return ((j10 ^ j13) & (j11 ^ j13)) < 0 ? j12 : j13;
    }

    public static int c0(String str) {
        String[] strArrM1;
        int length;
        if (str == null || (length = (strArrM1 = m1(str, "_")).length) < 2) {
            return 0;
        }
        String str2 = strArrM1[length - 1];
        boolean z10 = length >= 3 && "neg".equals(strArrM1[length - 2]);
        try {
            int i10 = Integer.parseInt((String) a.e(str2));
            return z10 ? -i10 : i10;
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static boolean c1(Handler handler, Runnable runnable) {
        Looper looper = handler.getLooper();
        if (!looper.getThread().isAlive()) {
            return false;
        }
        if (looper != Looper.myLooper()) {
            return handler.post(runnable);
        }
        runnable.run();
        return true;
    }

    public static int d(long[] jArr, long j10, boolean z10, boolean z11) {
        int i10;
        int iBinarySearch = Arrays.binarySearch(jArr, j10);
        if (iBinarySearch < 0) {
            i10 = ~iBinarySearch;
        } else {
            do {
                iBinarySearch++;
                if (iBinarySearch >= jArr.length) {
                    break;
                }
            } while (jArr[iBinarySearch] == j10);
            i10 = z10 ? iBinarySearch - 1 : iBinarySearch;
        }
        return z11 ? Math.min(jArr.length - 1, i10) : i10;
    }

    public static String d0(int i10) {
        if (i10 == 0) {
            return "NO";
        }
        if (i10 == 1) {
            return "NO_UNSUPPORTED_TYPE";
        }
        if (i10 == 2) {
            return "NO_UNSUPPORTED_DRM";
        }
        if (i10 == 3) {
            return "NO_EXCEEDS_CAPABILITIES";
        }
        if (i10 == 4) {
            return "YES";
        }
        throw new IllegalStateException();
    }

    public static <T> void d1(List<T> list, int i10, int i11) {
        if (i10 < 0 || i11 > list.size() || i10 > i11) {
            throw new IllegalArgumentException();
        }
        if (i10 != i11) {
            list.subList(i10, i11).clear();
        }
    }

    public static <T extends Comparable<? super T>> int e(List<? extends Comparable<? super T>> list, T t10, boolean z10, boolean z11) {
        int i10;
        int iBinarySearch = Collections.binarySearch(list, t10);
        if (iBinarySearch < 0) {
            i10 = -(iBinarySearch + 2);
        } else {
            do {
                iBinarySearch--;
                if (iBinarySearch < 0) {
                    break;
                }
            } while (list.get(iBinarySearch).compareTo(t10) == 0);
            i10 = z10 ? iBinarySearch + 1 : iBinarySearch;
        }
        return z11 ? Math.max(0, i10) : i10;
    }

    public static String e0(Locale locale) {
        return locale.toLanguageTag();
    }

    public static long e1(long j10, int i10) {
        return h1(j10, 1000000L, i10, RoundingMode.DOWN);
    }

    public static int f(s sVar, long j10, boolean z10, boolean z11) {
        int i10;
        int iD = sVar.d() - 1;
        int i11 = 0;
        while (i11 <= iD) {
            int i12 = (i11 + iD) >>> 1;
            if (sVar.c(i12) < j10) {
                i11 = i12 + 1;
            } else {
                iD = i12 - 1;
            }
        }
        if (z10 && (i10 = iD + 1) < sVar.d() && sVar.c(i10) == j10) {
            return i10;
        }
        if (z11 && iD == -1) {
            return 0;
        }
        return iD;
    }

    public static int f0(Context context) {
        return H0(context) ? 1 : 5;
    }

    public static long f1(long j10, long j11, long j12) {
        return h1(j10, j11, j12, RoundingMode.DOWN);
    }

    public static int g(int[] iArr, int i10, boolean z10, boolean z11) {
        int i11;
        int iBinarySearch = Arrays.binarySearch(iArr, i10);
        if (iBinarySearch < 0) {
            i11 = -(iBinarySearch + 2);
        } else {
            do {
                iBinarySearch--;
                if (iBinarySearch < 0) {
                    break;
                }
            } while (iArr[iBinarySearch] == i10);
            i11 = z10 ? iBinarySearch + 1 : iBinarySearch;
        }
        return z11 ? Math.max(0, i11) : i11;
    }

    public static long g0(long j10, float f10) {
        return f10 == 1.0f ? j10 : Math.round(j10 * ((double) f10));
    }

    public static void g1(long[] jArr, long j10, long j11) {
        j1(jArr, j10, j11, RoundingMode.DOWN);
    }

    public static int h(long[] jArr, long j10, boolean z10, boolean z11) {
        int i10;
        int iBinarySearch = Arrays.binarySearch(jArr, j10);
        if (iBinarySearch < 0) {
            i10 = -(iBinarySearch + 2);
        } else {
            do {
                iBinarySearch--;
                if (iBinarySearch < 0) {
                    break;
                }
            } while (jArr[iBinarySearch] == j10);
            i10 = z10 ? iBinarySearch + 1 : iBinarySearch;
        }
        return z11 ? Math.max(0, i10) : i10;
    }

    public static long h0(long j10) {
        return j10 == -9223372036854775807L ? System.currentTimeMillis() : j10 + SystemClock.elapsedRealtime();
    }

    public static long h1(long j10, long j11, long j12, RoundingMode roundingMode) {
        if (j10 == 0 || j11 == 0) {
            return 0L;
        }
        if (j12 >= j11 && j12 % j11 == 0) {
            return u2.e.b(j10, u2.e.b(j12, j11, RoundingMode.UNNECESSARY), roundingMode);
        }
        if (j12 < j11 && j11 % j12 == 0) {
            return u2.e.d(j10, u2.e.b(j11, j12, RoundingMode.UNNECESSARY));
        }
        if (j12 < j10 || j12 % j10 != 0) {
            return (j12 >= j10 || j10 % j12 != 0) ? i1(j10, j11, j12, roundingMode) : u2.e.d(j11, u2.e.b(j10, j12, RoundingMode.UNNECESSARY));
        }
        return u2.e.b(j11, u2.e.b(j12, j10, RoundingMode.UNNECESSARY), roundingMode);
    }

    public static <T> T i(T t10) {
        return t10;
    }

    public static int i0(int i10) {
        if (i10 == 8) {
            return 3;
        }
        if (i10 == 16) {
            return 2;
        }
        if (i10 != 24) {
            return i10 != 32 ? 0 : 22;
        }
        return 21;
    }

    private static long i1(long j10, long j11, long j12, RoundingMode roundingMode) {
        long jD = u2.e.d(j10, j11);
        if (jD != Long.MAX_VALUE && jD != Long.MIN_VALUE) {
            return u2.e.b(jD, j12, roundingMode);
        }
        long jC = u2.e.c(Math.abs(j11), Math.abs(j12));
        long jB = u2.e.b(j11, jC, RoundingMode.UNNECESSARY);
        long jB2 = u2.e.b(j12, jC, RoundingMode.UNNECESSARY);
        long jC2 = u2.e.c(Math.abs(j10), Math.abs(jB2));
        long jB3 = u2.e.b(j10, jC2, RoundingMode.UNNECESSARY);
        long jB4 = u2.e.b(jB2, jC2, RoundingMode.UNNECESSARY);
        long jD2 = u2.e.d(jB3, jB);
        if (jD2 != Long.MAX_VALUE && jD2 != Long.MIN_VALUE) {
            return u2.e.b(jD2, jB4, roundingMode);
        }
        double d10 = jB3 * (jB / jB4);
        if (d10 > 9.223372036854776E18d) {
            return Long.MAX_VALUE;
        }
        if (d10 < -9.223372036854776E18d) {
            return Long.MIN_VALUE;
        }
        return u2.b.f(d10, roundingMode);
    }

    public static <T> T[] j(T[] tArr) {
        return tArr;
    }

    public static u7.q j0(int i10, int i11, int i12) {
        return new u7.q.b().u0("audio/raw").R(i11).v0(i12).o0(i10).N();
    }

    public static void j1(long[] jArr, long j10, long j11, RoundingMode roundingMode) {
        if (j10 == 0) {
            Arrays.fill(jArr, 0L);
            return;
        }
        int i10 = 0;
        if (j11 >= j10 && j11 % j10 == 0) {
            long jB = u2.e.b(j11, j10, RoundingMode.UNNECESSARY);
            while (i10 < jArr.length) {
                jArr[i10] = u2.e.b(jArr[i10], jB, roundingMode);
                i10++;
            }
            return;
        }
        if (j11 < j10 && j10 % j11 == 0) {
            long jB2 = u2.e.b(j10, j11, RoundingMode.UNNECESSARY);
            while (i10 < jArr.length) {
                jArr[i10] = u2.e.d(jArr[i10], jB2);
                i10++;
            }
            return;
        }
        for (int i11 = 0; i11 < jArr.length; i11++) {
            long j12 = jArr[i11];
            if (j12 != 0) {
                if (j11 >= j12 && j11 % j12 == 0) {
                    jArr[i11] = u2.e.b(j10, u2.e.b(j11, j12, RoundingMode.UNNECESSARY), roundingMode);
                } else if (j11 >= j12 || j12 % j11 != 0) {
                    jArr[i11] = i1(j12, j10, j11, roundingMode);
                } else {
                    jArr[i11] = u2.e.d(j10, u2.e.b(j12, j11, RoundingMode.UNNECESSARY));
                }
            }
        }
    }

    public static int k(int i10, int i11) {
        return ((i10 + i11) - 1) / i11;
    }

    public static int k0(int i10, int i11) {
        return Q(i10) * i11;
    }

    public static boolean k1(u7.y yVar) {
        return (yVar == null || !yVar.r(1) || (yVar.r(17) && yVar.u().q())) ? false : true;
    }

    public static long l(long j10, long j11) {
        return ((j10 + j11) - 1) / j11;
    }

    public static long l0(long j10, float f10) {
        return f10 == 1.0f ? j10 : Math.round(j10 / ((double) f10));
    }

    public static boolean l1(u7.y yVar, boolean z10) {
        if (yVar == null || !yVar.D() || yVar.R() == 1 || yVar.R() == 4) {
            return true;
        }
        return z10 && yVar.t() != 0;
    }

    public static void m(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static List<String> m0(int i10) {
        ArrayList arrayList = new ArrayList();
        if ((i10 & 1) != 0) {
            arrayList.add("main");
        }
        if ((i10 & 2) != 0) {
            arrayList.add("alt");
        }
        if ((i10 & 4) != 0) {
            arrayList.add("supplementary");
        }
        if ((i10 & 8) != 0) {
            arrayList.add("commentary");
        }
        if ((i10 & 16) != 0) {
            arrayList.add("dub");
        }
        if ((i10 & 32) != 0) {
            arrayList.add("emergency");
        }
        if ((i10 & 64) != 0) {
            arrayList.add(ShareConstants.FEED_CAPTION_PARAM);
        }
        if ((i10 & 128) != 0) {
            arrayList.add("subtitle");
        }
        if ((i10 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0) {
            arrayList.add("sign");
        }
        if ((i10 & 512) != 0) {
            arrayList.add("describes-video");
        }
        if ((i10 & 1024) != 0) {
            arrayList.add("describes-music");
        }
        if ((i10 & 2048) != 0) {
            arrayList.add("enhanced-intelligibility");
        }
        if ((i10 & 4096) != 0) {
            arrayList.add("transcribes-dialog");
        }
        if ((i10 & 8192) != 0) {
            arrayList.add("easy-read");
        }
        if ((i10 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
            arrayList.add("trick-play");
        }
        if ((i10 & 32768) != 0) {
            arrayList.add("auxiliary");
        }
        return arrayList;
    }

    public static String[] m1(String str, String str2) {
        return str.split(str2, -1);
    }

    public static int n(long j10, long j11) {
        if (j10 < j11) {
            return -1;
        }
        return j10 == j11 ? 0 : 1;
    }

    public static List<String> n0(int i10) {
        ArrayList arrayList = new ArrayList();
        if ((i10 & 4) != 0) {
            arrayList.add("auto");
        }
        if ((i10 & 1) != 0) {
            arrayList.add("default");
        }
        if ((i10 & 2) != 0) {
            arrayList.add("forced");
        }
        return arrayList;
    }

    public static String[] n1(String str, String str2) {
        return str.split(str2, 2);
    }

    public static float o(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f10, f12));
    }

    public static String o0(StringBuilder sb2, Formatter formatter, long j10) {
        if (j10 == -9223372036854775807L) {
            j10 = 0;
        }
        String str = j10 < 0 ? "-" : "";
        long jAbs = (Math.abs(j10) + 500) / 1000;
        long j11 = jAbs % 60;
        long j12 = (jAbs / 60) % 60;
        long j13 = jAbs / 3600;
        sb2.setLength(0);
        return j13 > 0 ? formatter.format("%s%d:%02d:%02d", str, Long.valueOf(j13), Long.valueOf(j12), Long.valueOf(j11)).toString() : formatter.format("%s%02d:%02d", str, Long.valueOf(j12), Long.valueOf(j11)).toString();
    }

    public static String[] o1(String str) {
        return TextUtils.isEmpty(str) ? new String[0] : m1(str.trim(), "(\\s*,\\s*)");
    }

    public static int p(int i10, int i11, int i12) {
        return Math.max(i11, Math.min(i10, i12));
    }

    public static String[] p0() {
        String[] strArrQ0 = q0();
        for (int i10 = 0; i10 < strArrQ0.length; i10++) {
            strArrQ0[i10] = V0(strArrQ0[i10]);
        }
        return strArrQ0;
    }

    public static long p1(long j10, long j11, long j12) {
        long j13 = j10 - j11;
        return ((j10 ^ j13) & (j11 ^ j10)) < 0 ? j12 : j13;
    }

    public static long q(long j10, long j11, long j12) {
        return Math.max(j11, Math.min(j10, j12));
    }

    private static String[] q0() {
        Configuration configuration = Resources.getSystem().getConfiguration();
        return f28136a >= 24 ? r0(configuration) : new String[]{e0(configuration.locale)};
    }

    public static String q1(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (int i10 = 0; i10 < bArr.length; i10++) {
            sb2.append(Character.forDigit((bArr[i10] >> 4) & 15, 16));
            sb2.append(Character.forDigit(bArr[i10] & 15, 16));
        }
        return sb2.toString();
    }

    public static <T> boolean r(SparseArray<T> sparseArray, int i10) {
        return sparseArray.indexOfKey(i10) >= 0;
    }

    private static String[] r0(Configuration configuration) {
        return m1(configuration.getLocales().toLanguageTags(), ",");
    }

    public static long r1(int i10, int i11) {
        return s1(i11) | (s1(i10) << 32);
    }

    public static boolean s(Object[] objArr, Object obj) {
        for (Object obj2 : objArr) {
            if (Objects.equals(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    private static String s0(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e10) {
            r.d("Util", "Failed to read system property " + str, e10);
            return null;
        }
    }

    public static long s1(int i10) {
        return ((long) i10) & 4294967295L;
    }

    public static <T> boolean t(SparseArray<T> sparseArray, SparseArray<T> sparseArray2) {
        if (sparseArray == null) {
            return sparseArray2 == null;
        }
        if (sparseArray2 == null) {
            return false;
        }
        if (f28136a >= 31) {
            return sparseArray.contentEquals(sparseArray2);
        }
        int size = sparseArray.size();
        if (size != sparseArray2.size()) {
            return false;
        }
        for (int i10 = 0; i10 < size; i10++) {
            if (!Objects.equals(sparseArray.valueAt(i10), sparseArray2.get(sparseArray.keyAt(i10)))) {
                return false;
            }
        }
        return true;
    }

    public static String t0(int i10) {
        switch (i10) {
            case -2:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return "default";
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return "metadata";
            case 6:
                return "camera motion";
            default:
                if (i10 < 10000) {
                    return "?";
                }
                return "custom (" + i10 + ")";
        }
    }

    public static long t1(long j10) {
        return (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? j10 : j10 / 1000;
    }

    public static <T> int u(SparseArray<T> sparseArray) {
        if (f28136a >= 31) {
            return sparseArray.contentHashCode();
        }
        int iKeyAt = 17;
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            iKeyAt = (((iKeyAt * 31) + sparseArray.keyAt(i10)) * 31) + Objects.hashCode(sparseArray.valueAt(i10));
        }
        return iKeyAt;
    }

    public static byte[] u0(String str) {
        return str.getBytes(StandardCharsets.UTF_8);
    }

    public static int v(byte[] bArr, int i10, int i11, int i12) {
        while (i10 < i11) {
            int iB = com.google.common.primitives.i.b(bArr[i10]);
            i12 = w(iB & 15, w(iB >> 4, i12));
            i10++;
        }
        return i12;
    }

    public static boolean v0(u7.y yVar) {
        if (yVar == null || !yVar.r(1)) {
            return false;
        }
        yVar.pause();
        return true;
    }

    private static int w(int i10, int i11) {
        int i12 = (i10 ^ ((i11 >> 12) & 255)) & 255;
        return (f28151p[i12] ^ ((i11 << 4) & Settings.DEFAULT_INITIAL_WINDOW_SIZE)) & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002a  */
    /* JADX WARN: Code duplicated, block: B:19:0x002e  */
    public static boolean w0(u7.y yVar) {
        boolean z10 = false;
        if (yVar == null) {
            return false;
        }
        int iR = yVar.R();
        if (iR != 1 || !yVar.r(2)) {
            if (iR == 4 && yVar.r(4)) {
                yVar.f();
            }
            if (yVar.r(1)) {
                return z10;
            }
            yVar.n();
            return true;
        }
        yVar.k();
        z10 = true;
        if (yVar.r(1)) {
            return z10;
        }
        yVar.n();
        return true;
    }

    public static int x(byte[] bArr, int i10, int i11, int i12) {
        while (i10 < i11) {
            i12 = f28150o[((i12 >>> 24) ^ (bArr[i10] & 255)) & 255] ^ (i12 << 8);
            i10++;
        }
        return i12;
    }

    public static boolean x0(u7.y yVar, boolean z10) {
        return l1(yVar, z10) ? w0(yVar) : v0(yVar);
    }

    public static int y(byte[] bArr, int i10, int i11, int i12) {
        while (i10 < i11) {
            i12 = f28152q[i12 ^ (bArr[i10] & 255)];
            i10++;
        }
        return i12;
    }

    public static int y0(Uri uri) {
        int iZ0;
        String scheme = uri.getScheme();
        if (scheme != null && (com.google.common.base.c.a("rtsp", scheme) || com.google.common.base.c.a("rtspt", scheme))) {
            return 3;
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return 4;
        }
        int iLastIndexOf = lastPathSegment.lastIndexOf(46);
        if (iLastIndexOf >= 0 && (iZ0 = z0(lastPathSegment.substring(iLastIndexOf + 1))) != 4) {
            return iZ0;
        }
        Matcher matcher = f28146k.matcher((CharSequence) a.e(uri.getPath()));
        if (!matcher.matches()) {
            return 4;
        }
        String strGroup = matcher.group(2);
        if (strGroup != null) {
            if (strGroup.contains("format=mpd-time-csf")) {
                return 0;
            }
            if (strGroup.contains("format=m3u8-aapl")) {
                return 2;
            }
        }
        return 1;
    }

    public static Handler z(Looper looper, Handler.Callback callback) {
        return new Handler(looper, callback);
    }

    public static int z0(String str) {
        String strE = com.google.common.base.c.e(str);
        strE.hashCode();
        switch (strE) {
            case "ism":
            case "isml":
                return 1;
            case "mpd":
                return 0;
            case "m3u8":
                return 2;
            default:
                return 4;
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        f28136a = i10;
        String str = Build.DEVICE;
        f28137b = str;
        String str2 = Build.MANUFACTURER;
        f28138c = str2;
        String str3 = Build.MODEL;
        f28139d = str3;
        f28140e = str + ", " + str3 + ", " + str2 + ", " + i10;
        f28141f = new byte[0];
        f28142g = new long[0];
        f28143h = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        f28144i = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        f28145j = Pattern.compile("%([A-Fa-f0-9]{2})");
        f28146k = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        f28148m = new String[]{vgmm.EpvEHpGTMmod, "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", NyXuoef.WrMhDvLYUIbeumN, "hsn", "zh-hsn"};
        f28149n = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", cTJaRZ.MMiXZJZCgte, "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", NyXuoef.WrMhDvLYUIbeumN, "zh-xiang", "zh-hsn"};
        f28150o = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f28151p = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        f28152q = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, Sdk.SDKError.Reason.AD_LOAD_FAIL_EMPTY_BID_PAYLOAD_VALUE, 231, 238, 233, 252, 251, 242, 245, Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, Sdk.SDKError.Reason.MRAID_DOWNLOAD_JS_ERROR_VALUE, Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE, 210, 255, 248, 241, 246, Sdk.SDKError.Reason.INVALID_CSB_DATA_VALUE, 228, 237, 234, 183, 176, ModuleDescriptor.MODULE_VERSION, FacebookRequestErrorClassification.EC_INVALID_TOKEN, 171, 172, 165, 162, 143, Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE, Sdk.SDKError.Reason.EMPTY_TPAT_ERROR_VALUE, Sdk.SDKError.Reason.STORE_REGION_CODE_ERROR_VALUE, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE, 122, Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, 142, Sdk.SDKError.Reason.INVALID_CONFIG_RESPONSE_VALUE, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE, 235, 236, 193, 198, 207, 200, Sdk.SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE, Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE, LossReason.LOSS_REASON_CREATIVE_FILTERED_ANIMATION_TOO_LONG_VALUE, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, Sdk.SDKError.Reason.CONFIG_REFRESH_FAILED_VALUE, 141, Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE, 208, Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE, 194, 197, 204, 203, 230, Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, 232, 239, 250, 253, 244, 243};
    }

    public static boolean E0(String str) {
        str.hashCode();
        byte b10 = -1;
        switch (str.hashCode()) {
            case -1487656890:
                if (str.equals("image/avif")) {
                    b10 = 0;
                }
                break;
            case -1487464693:
                if (str.equals("image/heic")) {
                    b10 = 1;
                }
                break;
            case -1487464690:
                if (str.equals("image/heif")) {
                    b10 = 2;
                }
                break;
            case -1487394660:
                if (str.equals("image/jpeg")) {
                    b10 = 3;
                }
                break;
            case -1487018032:
                if (str.equals(VRfCTjjLv.fhRpeADbPa)) {
                    b10 = 4;
                }
                break;
            case -879272239:
                if (str.equals("image/bmp")) {
                    b10 = 5;
                }
                break;
            case -879258763:
                if (str.equals("image/png")) {
                    b10 = 6;
                }
                break;
        }
        switch (b10) {
            case 0:
                if (f28136a >= 34) {
                    return true;
                }
                return false;
            case 1:
            case 2:
                if (f28136a >= 26) {
                    return true;
                }
                return false;
            case 3:
            case 4:
            case 5:
            case 6:
                return true;
            default:
                return false;
        }
    }
}
