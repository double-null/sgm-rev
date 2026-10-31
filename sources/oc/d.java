package oc;

import android.bluetooth.BluetoothAdapter;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.Signature;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import com.applovin.sdk.AppLovinEventTypes;
import com.explorestack.protobuf.adcom.ConnectionStatus;
import com.explorestack.protobuf.adcom.ConnectionType;
import java.security.MessageDigest;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: compiled from: DeviceUtils.java */
/* JADX INFO: loaded from: classes5.dex */
public class d {
    public static Double a(Context context) {
        try {
            Intent intentV = v(context, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (intentV == null) {
                return null;
            }
            int intExtra = intentV.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1);
            int intExtra2 = intentV.getIntExtra("scale", -1);
            if (intExtra < 0 || intExtra2 <= 0) {
                return null;
            }
            return Double.valueOf(Math.round((((double) intExtra) / ((double) intExtra2)) * 100.0d) / 100.0d);
        } catch (Exception unused) {
            return null;
        }
    }

    public static ConnectionType b(Context context) {
        NetworkInfo networkInfoP = io.bidmachine.core.h.p(context);
        if (networkInfoP == null) {
            return ConnectionType.CONNECTION_TYPE_INVALID;
        }
        int type = networkInfoP.getType();
        if (type == 0) {
            return g(networkInfoP);
        }
        if (type != 1) {
            return type != 9 ? ConnectionType.CONNECTION_TYPE_INVALID : ConnectionType.CONNECTION_TYPE_ETHERNET;
        }
        return ConnectionType.CONNECTION_TYPE_WIFI;
    }

    public static String c(Context context) {
        try {
            ContentResolver contentResolver = context.getContentResolver();
            String string = Settings.Global.getString(contentResolver, "device_name");
            if (!TextUtils.isEmpty(string)) {
                return string;
            }
            String string2 = Settings.Secure.getString(contentResolver, "bluetooth_name");
            if (!TextUtils.isEmpty(string2)) {
                return string2;
            }
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (!io.bidmachine.core.h.G(context, "android.permission.BLUETOOTH_CONNECT") || defaultAdapter == null) {
                return null;
            }
            return defaultAdapter.getName();
        } catch (Exception unused) {
            return null;
        }
    }

    public static DisplayMetrics d(Context context) {
        return context.getResources().getDisplayMetrics();
    }

    public static Set<String> e(Context context) {
        HashSet hashSet = new HashSet();
        try {
            InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
            if (inputMethodManager == null) {
                return hashSet;
            }
            Iterator<InputMethodInfo> it = inputMethodManager.getEnabledInputMethodList().iterator();
            while (it.hasNext()) {
                for (InputMethodSubtype inputMethodSubtype : inputMethodManager.getEnabledInputMethodSubtypeList(it.next(), true)) {
                    if (inputMethodSubtype.getMode().equals("keyboard")) {
                        String languageTag = inputMethodSubtype.getLanguageTag();
                        if (TextUtils.isEmpty(languageTag)) {
                            languageTag = inputMethodSubtype.getLocale();
                        }
                        if (!TextUtils.isEmpty(languageTag)) {
                            int iIndexOf = languageTag.indexOf("_");
                            if (iIndexOf > 0) {
                                languageTag = languageTag.substring(0, iIndexOf);
                            }
                            hashSet.add(languageTag);
                        }
                    }
                }
            }
            String language = Locale.getDefault().getLanguage();
            if (!TextUtils.isEmpty(language)) {
                hashSet.add(language);
            }
        } catch (Exception unused) {
        }
        return hashSet;
    }

    public static String f() {
        return Build.MANUFACTURER;
    }

    private static ConnectionType g(NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
            case 0:
                return ConnectionType.CONNECTION_TYPE_CELLULAR_NETWORK_UNKNOWN;
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16:
                return ConnectionType.CONNECTION_TYPE_CELLULAR_NETWORK_2G;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
            case 17:
                return ConnectionType.CONNECTION_TYPE_CELLULAR_NETWORK_3G;
            case 13:
            case 18:
            case 19:
            default:
                return ConnectionType.CONNECTION_TYPE_CELLULAR_NETWORK_4G;
            case 20:
                return ConnectionType.CONNECTION_TYPE_CELLULAR_NETWORK_5G;
        }
    }

    public static String h() {
        return Build.VERSION.RELEASE;
    }

    public static ConnectionStatus i(Context context) {
        ConnectivityManager connectivityManagerU = io.bidmachine.core.h.u(context);
        if (connectivityManagerU == null) {
            return ConnectionStatus.CONNECTION_STATUS_UNDEFINED;
        }
        return connectivityManagerU.getDefaultProxy() != null ? ConnectionStatus.CONNECTION_STATUS_ENABLED : ConnectionStatus.CONNECTION_STATUS_DISABLED;
    }

    public static Integer j(Context context) {
        try {
            return Integer.valueOf(Settings.System.getInt(context.getContentResolver(), "screen_brightness"));
        } catch (Exception unused) {
            return null;
        }
    }

    public static Double k(Context context) {
        Integer numJ = j(context);
        if (numJ == null) {
            return null;
        }
        return Double.valueOf(Math.round((((double) numJ.intValue()) / 255.0d) * 100.0d) / 100.0d);
    }

    public static int l(Context context) {
        return d(context).densityDpi;
    }

    public static String m(Context context) {
        return o(context, "SHA-1");
    }

    public static String n(Context context) {
        return o(context, "SHA-256");
    }

    private static String o(Context context, String str) {
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
            if (signatureArr.length == 0) {
                return null;
            }
            return io.bidmachine.core.h.i0(MessageDigest.getInstance(str).digest(signatureArr[0].toByteArray()));
        } catch (Throwable th) {
            io.bidmachine.core.a.o(th);
            return null;
        }
    }

    public static ConnectionStatus p(Context context) {
        NetworkCapabilities networkCapabilitiesO = io.bidmachine.core.h.o(context);
        if (networkCapabilitiesO == null) {
            return ConnectionStatus.CONNECTION_STATUS_UNDEFINED;
        }
        return networkCapabilitiesO.hasTransport(4) ? ConnectionStatus.CONNECTION_STATUS_ENABLED : ConnectionStatus.CONNECTION_STATUS_DISABLED;
    }

    public static Boolean q(Context context) {
        try {
            return Boolean.valueOf(Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on") != 0);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Boolean r(Context context) {
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager != null) {
            return Boolean.valueOf(powerManager.isPowerSaveMode());
        }
        return null;
    }

    public static Boolean s(Context context) {
        try {
            Intent intentV = v(context, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (intentV == null) {
                return null;
            }
            int intExtra = intentV.getIntExtra("plugged", -1);
            boolean z10 = true;
            if (intExtra != 1 && intExtra != 2 && intExtra != 4) {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean t(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public static Boolean u(Context context) {
        try {
            return Boolean.valueOf(Settings.Global.getInt(context.getContentResolver(), "zen_mode") != 0);
        } catch (Exception unused) {
            return null;
        }
    }

    private static Intent v(Context context, IntentFilter intentFilter) {
        return Build.VERSION.SDK_INT >= 34 ? context.registerReceiver(null, intentFilter, 4) : context.registerReceiver(null, intentFilter);
    }
}
