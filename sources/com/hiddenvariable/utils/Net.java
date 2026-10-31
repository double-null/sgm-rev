package com.hiddenvariable.utils;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;

/* JADX INFO: loaded from: classes4.dex */
public class Net {
    public static void openEmail(String str, String str2, String str3, Activity activity) {
        try {
            Log.i(">> OpenEmail", "Trying To Show Email");
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.EMAIL", new String[]{str, ""});
            intent.putExtra("android.intent.extra.SUBJECT", str2);
            intent.putExtra("android.intent.extra.TEXT", str3);
            activity.startActivity(Intent.createChooser(intent, "Email:"));
        } catch (Throwable th) {
            Log.i("HVS", "OpenEmail Exception: " + th.getMessage());
        }
    }

    public static void openEmailURL(String str, String str2, String str3, Activity activity) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("mailto:" + str + "?subject=" + str2 + "&body=" + str3));
            intent.addFlags(268435456);
            intent.addFlags(1073741824);
            intent.addCategory("android.intent.category.BROWSABLE");
            activity.getApplication().startActivity(intent);
        } catch (Throwable th) {
            Log.i("HVS", "OpenEmailURL Exception: " + th.getMessage());
        }
    }

    public static void openStore(String str, Activity activity) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.addFlags(268435456);
        intent.addFlags(67108864);
        activity.getApplication().startActivity(intent);
    }

    public static void openURL(String str, Activity activity) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268435456);
            intent.addFlags(1073741824);
            intent.addCategory("android.intent.category.BROWSABLE");
            activity.getApplication().startActivity(intent);
        } catch (Throwable th) {
            Log.i("OpenURL Error", th.getMessage());
        }
    }
}
