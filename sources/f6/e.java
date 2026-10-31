package f6;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PackageInfo f14631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f14632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f14633c;

    e(Context context, String str) {
        this.f14631a = a(context);
        this.f14632b = str;
    }

    private static PackageInfo a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException unused) {
            throw null;
        }
    }

    public final String b() {
        String str = this.f14633c;
        if (str != null) {
            return str;
        }
        PackageInfo packageInfo = this.f14631a;
        String str2 = packageInfo == null ? "UNK" : packageInfo.packageName;
        String str3 = packageInfo != null ? packageInfo.versionName : "UNK";
        Locale locale = Locale.getDefault();
        String str4 = str2 + "/" + str3 + " ChannelSDK/" + this.f14632b + " (Linux; U; Android " + Build.VERSION.RELEASE + "; " + locale.getLanguage() + "-" + locale.getCountry() + "; " + Build.MODEL + " Build/" + Build.ID + ")";
        this.f14633c = str4;
        return str4;
    }
}
