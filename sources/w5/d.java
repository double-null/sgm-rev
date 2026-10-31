package w5;

import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: loaded from: classes4.dex */
public final class d {
    public static void a(String str) {
        if (!n5.b.f22737a.booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        Log.d("OMIDLIB", str);
    }

    public static void b(String str, Exception exc) {
        if ((!n5.b.f22737a.booleanValue() || TextUtils.isEmpty(str)) && exc == null) {
            return;
        }
        Log.e("OMIDLIB", str, exc);
    }

    public static void c(String str) {
        if (!n5.b.f22737a.booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        Log.e("OMIDLIB", str);
    }

    public static void d(String str) {
        if (!n5.b.f22737a.booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        Log.i("OMIDLIB", str);
    }

    public static void e(String str) {
        if (!n5.b.f22737a.booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        Log.w("OMIDLIB", str);
    }
}
