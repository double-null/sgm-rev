package com.applovin.impl.sdk;

import android.text.TextUtils;
import android.util.Log;
import com.applovin.impl.x2;
import com.applovin.impl.z4;
import sc.NfwM.XDucgbzInpQa;

/* JADX INFO: loaded from: classes2.dex */
public class p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f8666b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f8667a;

    p(l lVar) {
        this.f8667a = lVar;
        a("SDK Session Begin");
    }

    public static void a(boolean z10) {
        f8666b = z10;
    }

    public static void c(String str, String str2, Throwable th) {
        if (!f8666b || a()) {
            Log.e("AppLovinSdk", "[" + str + "] " + str2, th);
        }
    }

    public static void e(String str, String str2) {
        g(str, str2);
    }

    public static void h(String str, String str2) {
        c(str, str2, null);
    }

    public static void i(String str, String str2) {
        if (!f8666b || a()) {
            Log.i("AppLovinSdk", "[" + str + "] " + str2);
        }
    }

    public static void j(String str, String str2) {
        if (!f8666b || a()) {
            Log.w("AppLovinSdk", "[" + str + "] " + str2);
        }
    }

    public static void l(String str, String str2) {
        l lVar = l.E0;
        if (lVar == null) {
            return;
        }
        lVar.Q();
        if (a()) {
            l.E0.Q().k(str, str2);
        }
    }

    public void b(String str, String str2) {
        a(str, str2, null);
    }

    public void d(String str, String str2) {
        Log.i("AppLovinSdk", "[" + str + "] " + str2);
    }

    public void f(String str, String str2) {
        int iIntValue;
        if (a(this.f8667a) && !TextUtils.isEmpty(str2) && (iIntValue = ((Integer) this.f8667a.a(z4.f9331r)).intValue()) > 0) {
            int length = str2.length();
            int i10 = ((length + iIntValue) - 1) / iIntValue;
            for (int i11 = 0; i11 < i10; i11++) {
                int i12 = i11 * iIntValue;
                a(str, str2.substring(i12, Math.min(length, i12 + iIntValue)));
            }
        }
    }

    public void k(String str, String str2) {
        d(str, str2, null);
    }

    private void a(String str) {
        x2 x2Var = new x2();
        x2Var.a().a(str).a();
        g("AppLovinSdk", x2Var.toString());
    }

    public static void b(String str, String str2, Throwable th) {
        l lVar = l.E0;
        if (lVar == null) {
            return;
        }
        lVar.Q();
        if (a()) {
            l.E0.Q().a(str, str2, th);
        }
    }

    public static void g(String str, String str2) {
        if (!f8666b || a()) {
            Log.d(XDucgbzInpQa.WLKjmn, "[" + str + "] " + str2);
        }
    }

    public void d(String str, String str2, Throwable th) {
        Log.w("AppLovinSdk", "[" + str + "] " + str2, th);
    }

    public static void c(String str, String str2) {
        b(str, str2, null);
    }

    public void a(String str, Throwable th) {
        for (Throwable th2 : th.getSuppressed()) {
            b(str, th2.toString());
        }
    }

    public void a(String str, String str2) {
        Log.d("AppLovinSdk", "[" + str + "] " + str2);
    }

    public void a(String str, String str2, Throwable th) {
        Log.e("AppLovinSdk", "[" + str + "] " + str2, th);
    }

    public static boolean a() {
        return a(l.E0);
    }

    public static boolean a(l lVar) {
        return lVar != null && lVar.q0().c();
    }
}
