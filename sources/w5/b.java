package w5;

import android.os.Build;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class b {
    public static String a() {
        return Build.MANUFACTURER + "; " + Build.MODEL;
    }

    public static String b() {
        return "Android";
    }

    public static String c() {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    public static JSONObject d() {
        JSONObject jSONObject = new JSONObject();
        c.g(jSONObject, "deviceType", a());
        c.g(jSONObject, "osVersion", c());
        c.g(jSONObject, "os", b());
        return jSONObject;
    }
}
