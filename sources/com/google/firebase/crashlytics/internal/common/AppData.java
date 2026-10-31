package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class AppData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<e> f12036c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f12037d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f12038e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f12039f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f12040g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final z2.e f12041h;

    public AppData(String str, String str2, List<e> list, String str3, String str4, String str5, String str6, z2.e eVar) {
        this.f12034a = str;
        this.f12035b = str2;
        this.f12036c = list;
        this.f12037d = str3;
        this.f12038e = str4;
        this.f12039f = str5;
        this.f12040g = str6;
        this.f12041h = eVar;
    }

    public static AppData a(Context context, IdManager idManager, String str, String str2, List<e> list, z2.e eVar) throws PackageManager.NameNotFoundException {
        String packageName = context.getPackageName();
        String strG = idManager.g();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String strB = b(packageInfo);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = "0.0";
        }
        return new AppData(str, str2, list, strG, packageName, strB, str3, eVar);
    }

    private static String b(PackageInfo packageInfo) {
        return Build.VERSION.SDK_INT >= 28 ? Long.toString(packageInfo.getLongVersionCode()) : Integer.toString(packageInfo.versionCode);
    }
}
