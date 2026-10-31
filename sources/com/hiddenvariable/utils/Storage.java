package com.hiddenvariable.utils;

import android.app.Activity;
import android.os.Environment;
import android.util.Log;
import com.facebook.internal.logging.dumpsys.Tj.ljglrLUdGZhMhQ;

/* JADX INFO: loaded from: classes4.dex */
public class Storage {
    public static String getInternalStoragePath(Activity activity) {
        try {
            return activity.getApplicationContext().getFilesDir().getAbsolutePath();
        } catch (Error unused) {
            Log.i("GetLocalPath >> ", ">>> Error");
            return "";
        }
    }

    public static String getExternalStoragePath(Activity activity) {
        String absolutePath = "";
        try {
            String externalStorageState = Environment.getExternalStorageState();
            if (ljglrLUdGZhMhQ.xhPoTnZ.equals(externalStorageState) || "mounted_ro".equals(externalStorageState)) {
                absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
                if (absolutePath.length() > 0) {
                    absolutePath = absolutePath + "/Android/data/" + activity.getApplicationContext().getPackageName() + "/files/";
                }
            } else {
                Log.i("HVS", "GetExternalPath >>> External Data Not Available");
            }
        } catch (Error unused) {
            Log.i("HVS", "GetExternalPath >>> Error");
        }
        return absolutePath;
    }
}
