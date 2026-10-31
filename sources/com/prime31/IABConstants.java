package com.prime31;

import android.util.Log;
import com.vungle.ads.internal.network.converters.vY.cTJaRZ;

/* JADX INFO: loaded from: classes4.dex */
public class IABConstants {
    public static boolean DEBUG = false;
    private static final String TAG = "Prime31-HD";

    public static void logDebug(String str) {
        if (DEBUG) {
            Log.i(TAG, str);
        }
    }

    public static void logEntering(String str, String str2) {
        if (DEBUG) {
            Log.i(TAG, str + cTJaRZ.BnWEhzespnlFaRc + str2 + "()");
        }
    }

    public static void logEntering(String str, String str2, Object obj) {
        if (DEBUG) {
            Log.i(TAG, str + "." + str2 + "( " + obj + " )");
        }
    }

    public static void logEntering(String str, String str2, Object[] objArr) {
        if (DEBUG) {
            StringBuilder sb2 = new StringBuilder();
            int length = objArr.length;
            String str3 = "";
            int i10 = 0;
            while (i10 < length) {
                Object obj = objArr[i10];
                sb2.append(str3);
                sb2.append(obj);
                i10++;
                str3 = ", ";
            }
            Log.i(TAG, str + "." + str2 + "( " + sb2.toString() + " )");
        }
    }
}
