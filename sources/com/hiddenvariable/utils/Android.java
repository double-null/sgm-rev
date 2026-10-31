package com.hiddenvariable.utils;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;

/* JADX INFO: loaded from: classes4.dex */
public class Android {
    public static String getAndroidId(Activity activity) {
        try {
            return "android_id" + Settings.Secure.getString(activity.getContentResolver(), "android_id");
        } catch (Error unused) {
            Log.i("HVS", ">>> Error");
            return "";
        }
    }

    public static String getMetdata(Context context, String str) {
        Bundle bundle;
        String string = null;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo != null && (bundle = applicationInfo.metaData) != null) {
                string = bundle.getString(str);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.i("HVS", "Error getting metadata for key " + str);
        }
        Log.i("HVS", "Returning value of " + string + " for meta-data key " + str);
        return string;
    }
}
