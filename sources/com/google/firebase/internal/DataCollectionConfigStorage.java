package com.google.firebase.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.core.content.a;
import com.google.firebase.DataCollectionDefaultChange;
import s3.c;

/* JADX INFO: loaded from: classes4.dex */
public class DataCollectionConfigStorage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f12278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SharedPreferences f12279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f12280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f12281d;

    public DataCollectionConfigStorage(Context context, String str, c cVar) {
        Context contextA = a(context);
        this.f12278a = contextA;
        this.f12279b = contextA.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f12280c = cVar;
        this.f12281d = c();
    }

    private static Context a(Context context) {
        return a.b(context);
    }

    private boolean c() {
        return this.f12279b.contains("firebase_data_collection_default_enabled") ? this.f12279b.getBoolean("firebase_data_collection_default_enabled", true) : d();
    }

    private boolean d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f12278a.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f12278a.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    private synchronized void f(boolean z10) {
        if (this.f12281d != z10) {
            this.f12281d = z10;
            this.f12280c.b(new s3.a<>(DataCollectionDefaultChange.class, new DataCollectionDefaultChange(z10)));
        }
    }

    public synchronized boolean b() {
        return this.f12281d;
    }

    public synchronized void e(Boolean bool) {
        try {
            if (bool == null) {
                this.f12279b.edit().remove("firebase_data_collection_default_enabled").apply();
                f(d());
            } else {
                boolean zEquals = Boolean.TRUE.equals(bool);
                this.f12279b.edit().putBoolean("firebase_data_collection_default_enabled", zEquals).apply();
                f(zEquals);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
