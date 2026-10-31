package com.vungle.ads.internal.platform;

import android.content.Context;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.ProxyInfo;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import be.LNO.fzLzfW;
import c2.YDwL.tFQWuE;
import com.facebook.internal.ServerProtocol;
import java.net.ConnectException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.security.cert.CertificateException;
import java.util.Iterator;
import java.util.Locale;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.collections.o;
import kotlin.jvm.internal.t;
import qd.n;
import rd.f0;
import wc.r;
import wc.s;

/* JADX INFO: compiled from: DeviceCheckUtils.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class DeviceCheckUtils {
    public static final DeviceCheckUtils INSTANCE = new DeviceCheckUtils();

    private DeviceCheckUtils() {
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0018  */
    private final boolean isEnabled(ProxyInfo proxyInfo) {
        boolean z10;
        if (proxyInfo == null) {
            return false;
        }
        String host = proxyInfo.getHost();
        if (host == null) {
            z10 = false;
        } else {
            if (host.length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return (z10 && proxyInfo.getPort() > 0) || (proxyInfo.getPacFileUrl() != null && !t.a(proxyInfo.getPacFileUrl(), Uri.EMPTY));
    }

    public final String getActiveNetworkType(Context context) {
        Object objC;
        String string;
        t.f(context, "context");
        try {
            r.a aVar = r.f27774b;
            Object systemService = context.getSystemService("connectivity");
            t.d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork == null) {
                string = "none";
            } else {
                t.e(activeNetwork, "cm.activeNetwork ?: return@runCatching \"none\"");
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
                if (networkCapabilities == null) {
                    string = "unknown";
                } else {
                    t.e(networkCapabilities, "cm.getNetworkCapabilitie…urn@runCatching \"unknown\"");
                    StringBuilder sb2 = new StringBuilder();
                    if (networkCapabilities.hasTransport(1)) {
                        sb2.append("wifi");
                    } else if (networkCapabilities.hasTransport(0)) {
                        sb2.append("cellular");
                    } else if (networkCapabilities.hasTransport(3)) {
                        sb2.append("ethernet");
                    } else {
                        sb2.append("other");
                    }
                    if (networkCapabilities.hasTransport(4)) {
                        sb2.append("+vpn");
                    }
                    if (connectivityManager.isActiveNetworkMetered()) {
                        sb2.append("+metered");
                    }
                    string = sb2.toString();
                    t.e(string, "StringBuilder().apply(builderAction).toString()");
                }
            }
            objC = r.c(string);
        } catch (Throwable th) {
            r.a aVar2 = r.f27774b;
            objC = r.c(s.a(th));
        }
        return (String) (r.k(objC) ? "unknown" : objC);
    }

    public final String getPrivateDnsInfo(Context context) {
        Object objC;
        t.f(context, "context");
        if (Build.VERSION.SDK_INT < 28) {
            return "n/a";
        }
        try {
            r.a aVar = r.f27774b;
            String string = Settings.Global.getString(context.getContentResolver(), "private_dns_mode");
            if (string == null) {
                string = "opportunistic";
            } else {
                t.e(string, "Settings.Global.getStrin…mode\") ?: \"opportunistic\"");
            }
            if (t.a(string, "hostname")) {
                String string2 = Settings.Global.getString(context.getContentResolver(), "private_dns_specifier");
                if (string2 == null) {
                    string2 = "";
                } else {
                    t.e(string2, "Settings.Global.getStrin…ate_dns_specifier\") ?: \"\"");
                }
                string = "hostname(" + string2 + ')';
            }
            objC = r.c(string);
        } catch (Throwable th) {
            r.a aVar2 = r.f27774b;
            objC = r.c(s.a(th));
        }
        if (r.k(objC)) {
            objC = "unknown";
        }
        return (String) objC;
    }

    public final int getSensorCount(Context context) {
        t.f(context, "context");
        Object systemService = context.getSystemService("sensor");
        t.d(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
        return ((SensorManager) systemService).getSensorList(-1).size();
    }

    public final boolean hasSystemAlertWindowPermission(Context context) {
        t.f(context, "context");
        return Settings.canDrawOverlays(context);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0023  */
    /* JADX WARN: Code duplicated, block: B:16:0x0033  */
    /* JADX WARN: Code duplicated, block: B:21:0x0043  */
    /* JADX WARN: Code duplicated, block: B:26:0x0053  */
    /* JADX WARN: Code duplicated, block: B:6:0x0013  */
    public final boolean isEmulator() {
        String lowerCase;
        String lowerCase2;
        String lowerCase3;
        String lowerCase4;
        String lowerCase5;
        String str = Build.FINGERPRINT;
        String str2 = "";
        if (str != null) {
            lowerCase = str.toLowerCase(Locale.ROOT);
            t.e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (lowerCase == null) {
                lowerCase = "";
            }
        } else {
            lowerCase = "";
        }
        String str3 = Build.MODEL;
        if (str3 != null) {
            lowerCase2 = str3.toLowerCase(Locale.ROOT);
            t.e(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (lowerCase2 == null) {
                lowerCase2 = "";
            }
        } else {
            lowerCase2 = "";
        }
        String str4 = Build.PRODUCT;
        if (str4 != null) {
            lowerCase3 = str4.toLowerCase(Locale.ROOT);
            t.e(lowerCase3, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (lowerCase3 == null) {
                lowerCase3 = "";
            }
        } else {
            lowerCase3 = "";
        }
        String str5 = Build.BRAND;
        if (str5 != null) {
            lowerCase4 = str5.toLowerCase(Locale.ROOT);
            t.e(lowerCase4, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (lowerCase4 == null) {
                lowerCase4 = "";
            }
        } else {
            lowerCase4 = "";
        }
        String str6 = Build.MANUFACTURER;
        if (str6 != null) {
            lowerCase5 = str6.toLowerCase(Locale.ROOT);
            t.e(lowerCase5, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (lowerCase5 == null) {
                lowerCase5 = "";
            }
        } else {
            lowerCase5 = "";
        }
        String str7 = Build.BOARD;
        if (str7 != null) {
            String lowerCase6 = str7.toLowerCase(Locale.ROOT);
            t.e(lowerCase6, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (lowerCase6 != null) {
                str2 = lowerCase6;
            }
        }
        String[] SUPPORTED_ABIS = Build.SUPPORTED_ABIS;
        t.e(SUPPORTED_ABIS, "SUPPORTED_ABIS");
        String lowerCase7 = o.Q(SUPPORTED_ABIS, null, null, null, 0, null, null, 63, null).toLowerCase(Locale.ROOT);
        t.e(lowerCase7, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return f0.U(lowerCase, "generic", false, 2, null) || f0.U(lowerCase, "emulator", false, 2, null) || f0.U(lowerCase2, "google_sdk", false, 2, null) || f0.U(lowerCase2, "emulator", false, 2, null) || f0.U(lowerCase3, ServerProtocol.DIALOG_PARAM_SDK_VERSION, false, 2, null) || f0.U(lowerCase3, "vbox", false, 2, null) || f0.U(lowerCase4, "generic", false, 2, null) || f0.U(lowerCase5, "genymotion", false, 2, null) || f0.U(str2, "nox", false, 2, null) || f0.U(lowerCase7, "x86", false, 2, null);
    }

    public final boolean isProxyEnabled(Context context) {
        Object objC;
        boolean zIsEnabled;
        t.f(context, "context");
        try {
            r.a aVar = r.f27774b;
            Object systemService = context.getSystemService("connectivity");
            t.d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork == null) {
                zIsEnabled = false;
            } else {
                t.e(activeNetwork, "cm.activeNetwork ?: return@runCatching false");
                LinkProperties linkProperties = connectivityManager.getLinkProperties(activeNetwork);
                zIsEnabled = isEnabled(linkProperties != null ? linkProperties.getHttpProxy() : null);
            }
            objC = r.c(Boolean.valueOf(zIsEnabled));
        } catch (Throwable th) {
            r.a aVar2 = r.f27774b;
            objC = r.c(s.a(th));
        }
        Boolean bool = Boolean.FALSE;
        if (r.k(objC)) {
            objC = bool;
        }
        return ((Boolean) objC).booleanValue();
    }

    public final boolean isVpnConnected(Context context) {
        Object objC;
        t.f(context, "context");
        try {
            r.a aVar = r.f27774b;
            Object systemService = context.getSystemService("connectivity");
            t.d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            Network[] allNetworks = connectivityManager.getAllNetworks();
            t.e(allNetworks, "cm.allNetworks");
            boolean z10 = false;
            for (Network network : allNetworks) {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
                if (networkCapabilities != null && networkCapabilities.hasTransport(4)) {
                    z10 = true;
                    break;
                }
            }
            objC = r.c(Boolean.valueOf(z10));
        } catch (Throwable th) {
            r.a aVar2 = r.f27774b;
            objC = r.c(s.a(th));
        }
        Boolean bool = Boolean.FALSE;
        if (r.k(objC)) {
            objC = bool;
        }
        return ((Boolean) objC).booleanValue();
    }

    public final String classifyNetworkError(Throwable th) {
        boolean z10;
        boolean z11;
        if (th == null) {
            return "none";
        }
        Iterator it = n.f(th, DeviceCheckUtils$classifyNetworkError$hasCertFailure$1.INSTANCE).iterator();
        while (true) {
            z10 = false;
            if (!it.hasNext()) {
                z11 = false;
                break;
            }
            if (((Throwable) it.next()) instanceof CertificateException) {
                z11 = true;
                break;
            }
        }
        boolean z12 = th instanceof SSLHandshakeException;
        if (z12 && z11) {
            return "SSL_CERT_ERROR";
        }
        if (z12) {
            return "SSL_HANDSHAKE";
        }
        if (th instanceof SSLPeerUnverifiedException) {
            return "SSL_PEER_UNVERIFIED";
        }
        if (th instanceof SSLException) {
            return "SSL_ERROR";
        }
        if (th instanceof UnknownHostException) {
            return "DNS_FAILURE";
        }
        if (th instanceof ConnectException) {
            return "CONNECT_FAILURE";
        }
        if (th instanceof SocketTimeoutException) {
            return "TIMEOUT";
        }
        if (!(th instanceof SocketException)) {
            String simpleName = th.getClass().getSimpleName();
            t.e(simpleName, tFQWuE.XJcQJl);
            return simpleName;
        }
        SocketException socketException = (SocketException) th;
        String message = socketException.getMessage();
        if (message != null && f0.S(message, "reset", true)) {
            return "CONNECTION_RESET";
        }
        String message2 = socketException.getMessage();
        if (message2 != null && f0.S(message2, "abort", true)) {
            return "CONNECTION_ABORT";
        }
        String message3 = socketException.getMessage();
        if (message3 != null && f0.S(message3, "closed", true)) {
            z10 = true;
        }
        return z10 ? "CONNECTION_CLOSED" : fzLzfW.DiNUJib;
    }
}
