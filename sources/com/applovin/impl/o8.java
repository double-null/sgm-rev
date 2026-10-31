package com.applovin.impl;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public abstract class o8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f7772a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f7775d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static String f7776e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static String f7777f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f7773b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AtomicBoolean f7774c = new AtomicBoolean();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final AtomicBoolean f7778g = new AtomicBoolean();

    static {
        com.applovin.impl.sdk.l lVar = com.applovin.impl.sdk.l.E0;
        if (lVar != null && ((Boolean) lVar.a(z4.f9264j4)).booleanValue() && e()) {
            f7772a = (String) c5.a(b5.M, "", com.applovin.impl.sdk.l.p());
        } else {
            f7772a = "";
            c5.b(b5.M, (Object) null, com.applovin.impl.sdk.l.p());
        }
    }

    public static void a(final com.applovin.impl.sdk.l lVar) {
        if (f7774c.getAndSet(true)) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.zc
            @Override // java.lang.Runnable
            public final void run() {
                o8.d(lVar);
            }
        });
    }

    public static String b() {
        return f7777f;
    }

    public static String c() {
        return f7776e;
    }

    public static int d() {
        return f7775d;
    }

    public static void b(com.applovin.impl.sdk.l lVar) {
        if (f7778g.getAndSet(true)) {
            return;
        }
        PackageInfo packageInfoC = c(lVar);
        if (packageInfoC != null) {
            f7775d = packageInfoC.versionCode;
            f7776e = packageInfoC.versionName;
            f7777f = packageInfoC.packageName;
        } else {
            lVar.Q();
            if (com.applovin.impl.sdk.p.a()) {
                lVar.Q().b("WebViewDataCollector", "Failed to get WebView package info");
            }
        }
    }

    private static PackageInfo c(com.applovin.impl.sdk.l lVar) {
        PackageManager packageManager = com.applovin.impl.sdk.l.p().getPackageManager();
        if (p0.e()) {
            return WebView.getCurrentWebViewPackage();
        }
        Iterator it = lVar.c(z4.f9363u4).iterator();
        while (it.hasNext()) {
            try {
                return packageManager.getPackageInfo((String) it.next(), 0);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(com.applovin.impl.sdk.l lVar) {
        try {
            synchronized (f7773b) {
                String defaultUserAgent = WebSettings.getDefaultUserAgent(com.applovin.impl.sdk.l.p());
                if (!TextUtils.isEmpty(defaultUserAgent)) {
                    f7772a = defaultUserAgent;
                    c5.b(b5.M, f7772a, com.applovin.impl.sdk.l.p());
                } else {
                    lVar.Q();
                    if (com.applovin.impl.sdk.p.a()) {
                        lVar.Q().b("WebViewDataCollector", "Collected invalid user agent");
                    }
                    lVar.E().a(f2.f6499k1, "collectedInvalidUserAgent");
                }
            }
        } catch (Throwable th) {
            lVar.Q();
            if (com.applovin.impl.sdk.p.a()) {
                lVar.Q().a("WebViewDataCollector", "Failed to collect user agent", th);
            }
            lVar.E().a("WebViewDataCollector", "collectUserAgent", th);
        }
    }

    private static boolean e() {
        boolean zIsValidString;
        synchronized (f7773b) {
            zIsValidString = StringUtils.isValidString((String) c5.a(b5.M, "", com.applovin.impl.sdk.l.p()));
        }
        return zIsValidString;
    }

    public static String a() {
        String str;
        synchronized (f7773b) {
            str = f7772a;
        }
        return str;
    }
}
