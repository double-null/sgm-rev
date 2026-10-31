package i5;

import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: loaded from: classes4.dex */
public final class d {
    public static void a(String str) {
        if (!z4.c.f28942a.booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        Log.d("OMIDLIB", str);
    }

    public static void b(String str, Exception exc) {
        if ((!z4.c.f28942a.booleanValue() || TextUtils.isEmpty(str)) && exc == null) {
            return;
        }
        Log.e("OMIDLIB", str, exc);
    }

    public static void c(String str) {
        if (!z4.c.f28942a.booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        Log.e("OMIDLIB", str);
    }

    public static void d(String str) {
        if (!z4.c.f28942a.booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        Log.i("OMIDLIB", str);
    }

    public static void e(String str) {
        if (!z4.c.f28942a.booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        Log.w("OMIDLIB", str);
    }
}
