package com.google.android.gms.internal.measurement;

import android.util.Log;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzrm {
    private static final Method zza;

    static {
        Method method = null;
        try {
            try {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                method = cls.getMethod("get", String.class, String.class);
                cls.getMethod("getInt", String.class, Integer.TYPE);
                cls.getMethod("getLong", String.class, Long.TYPE);
                cls.getMethod("getBoolean", String.class, Boolean.TYPE);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        } finally {
            zza = method;
        }
    }

    public static String zza(String str, String str2) {
        try {
            return (String) zza.invoke(null, "tiktok_systrace", "false");
        } catch (Exception e10) {
            Log.e("SystemProperties", "get error", e10);
            return "false";
        }
    }
}
