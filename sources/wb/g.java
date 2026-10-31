package wb;

import android.content.Context;
import android.content.res.Configuration;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;

/* JADX INFO: compiled from: DeviceUtils.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class g {
    public static final Configuration a(Context context) {
        kotlin.jvm.internal.t.f(context, "<this>");
        Configuration configuration = context.getResources().getConfiguration();
        kotlin.jvm.internal.t.e(configuration, "resources.configuration");
        return configuration;
    }

    public static final DisplayMetrics b(Context context) {
        kotlin.jvm.internal.t.f(context, "<this>");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        kotlin.jvm.internal.t.e(displayMetrics, "resources.displayMetrics");
        return displayMetrics;
    }

    public static final String c(Context context) {
        kotlin.jvm.internal.t.f(context, "<this>");
        try {
            TelephonyManager telephonyManagerW = e0.w(context);
            String networkOperator = telephonyManagerW != null ? telephonyManagerW.getNetworkOperator() : null;
            if (networkOperator != null && networkOperator.length() >= 3) {
                StringBuilder sb2 = new StringBuilder();
                String strSubstring = networkOperator.substring(0, 3);
                kotlin.jvm.internal.t.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                sb2.append(strSubstring);
                sb2.append('-');
                String strSubstring2 = networkOperator.substring(3);
                kotlin.jvm.internal.t.e(strSubstring2, "this as java.lang.String).substring(startIndex)");
                sb2.append(strSubstring2);
                return sb2.toString();
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static final String d(Context context) {
        kotlin.jvm.internal.t.f(context, "<this>");
        TelephonyManager telephonyManagerW = e0.w(context);
        if (telephonyManagerW != null) {
            return telephonyManagerW.getNetworkOperatorName();
        }
        return null;
    }

    public static final String e(Context context) {
        kotlin.jvm.internal.t.f(context, "<this>");
        TelephonyManager telephonyManagerW = e0.w(context);
        if (telephonyManagerW != null) {
            return telephonyManagerW.getSimCountryIso();
        }
        return null;
    }

    public static final String f(Context context) {
        kotlin.jvm.internal.t.f(context, "<this>");
        TelephonyManager telephonyManagerW = e0.w(context);
        if (telephonyManagerW != null) {
            return telephonyManagerW.getSimOperatorName();
        }
        return null;
    }

    public static final float g(Context context) {
        kotlin.jvm.internal.t.f(context, "<this>");
        return b(context).density;
    }

    public static final Boolean h(Context context) {
        kotlin.jvm.internal.t.f(context, "<this>");
        TelephonyManager telephonyManagerW = e0.w(context);
        if (telephonyManagerW != null) {
            return Boolean.valueOf(telephonyManagerW.isNetworkRoaming());
        }
        return null;
    }
}
