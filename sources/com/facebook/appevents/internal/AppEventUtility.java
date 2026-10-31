package com.facebook.appevents.internal;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Looper;
import android.view.View;
import android.view.Window;
import com.facebook.FacebookSdk;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.t;
import rd.c0;
import rd.f0;

/* JADX INFO: compiled from: AppEventUtility.kt */
/* JADX INFO: loaded from: classes.dex */
public final class AppEventUtility {
    public static final AppEventUtility INSTANCE = new AppEventUtility();
    private static final String PRICE_REGEX = "[-+]*\\d+([.,]\\d+)*([.,]\\d+)?";

    private AppEventUtility() {
    }

    public static final String bytesToHex(byte[] bytes) {
        t.f(bytes, "bytes");
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b10 : bytes) {
            l0 l0Var = l0.f21527a;
            String str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b10)}, 1));
            t.e(str, "format(format, *args)");
            stringBuffer.append(str);
        }
        String string = stringBuffer.toString();
        t.e(string, "sb.toString()");
        return string;
    }

    public static final String getAppVersion() {
        Context applicationContext = FacebookSdk.getApplicationContext();
        try {
            String str = applicationContext.getPackageManager().getPackageInfo(applicationContext.getPackageName(), 0).versionName;
            t.e(str, "{\n      val packageInfo …ageInfo.versionName\n    }");
            return str;
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    public static final View getRootView(Activity activity) {
        if (CrashShieldHandler.isObjectCrashing(AppEventUtility.class) || activity == null) {
            return null;
        }
        try {
            Window window = activity.getWindow();
            if (window == null) {
                return null;
            }
            return window.getDecorView().getRootView();
        } catch (Exception unused) {
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventUtility.class);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x006b  */
    /* JADX WARN: Code duplicated, block: B:22:? A[RETURN, SYNTHETIC] */
    public static final boolean isEmulator() {
        String FINGERPRINT = Build.FINGERPRINT;
        t.e(FINGERPRINT, "FINGERPRINT");
        if (!c0.O(FINGERPRINT, "generic", false, 2, null)) {
            t.e(FINGERPRINT, "FINGERPRINT");
            if (!c0.O(FINGERPRINT, "unknown", false, 2, null)) {
                String MODEL = Build.MODEL;
                t.e(MODEL, "MODEL");
                if (!f0.U(MODEL, "google_sdk", false, 2, null)) {
                    t.e(MODEL, "MODEL");
                    if (!f0.U(MODEL, "Emulator", false, 2, null)) {
                        t.e(MODEL, "MODEL");
                        if (!f0.U(MODEL, "Android SDK built for x86", false, 2, null)) {
                            String MANUFACTURER = Build.MANUFACTURER;
                            t.e(MANUFACTURER, "MANUFACTURER");
                            if (!f0.U(MANUFACTURER, "Genymotion", false, 2, null)) {
                                String BRAND = Build.BRAND;
                                t.e(BRAND, "BRAND");
                                if (c0.O(BRAND, "generic", false, 2, null)) {
                                    String DEVICE = Build.DEVICE;
                                    t.e(DEVICE, "DEVICE");
                                    if (!c0.O(DEVICE, "generic", false, 2, null)) {
                                        if (t.a("google_sdk", Build.PRODUCT)) {
                                            return false;
                                        }
                                    }
                                } else if (t.a("google_sdk", Build.PRODUCT)) {
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    private static final boolean isMainThread() {
        return t.a(Looper.myLooper(), Looper.getMainLooper());
    }

    public static final double normalizePrice(String str) {
        try {
            Matcher matcher = Pattern.compile(PRICE_REGEX, 8).matcher(str);
            if (!matcher.find()) {
                return 0.0d;
            }
            return NumberFormat.getNumberInstance(Utility.getCurrentLocale()).parse(matcher.group(0)).doubleValue();
        } catch (ParseException unused) {
            return 0.0d;
        }
    }

    public static final void assertIsMainThread() {
    }

    public static final void assertIsNotMainThread() {
    }
}
