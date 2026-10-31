package com.google.android.gms.internal.ads;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.os.Build;
import com.adjust.sdk.Constants;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzdx {
    public static boolean zza(Context context) throws zzdw {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 26 && (Constants.REFERRER_API_SAMSUNG.equals(Build.MANUFACTURER) || "XT1650".equals(Build.MODEL))) {
            return false;
        }
        if (i10 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
            return zzf("EGL_EXT_protected_content");
        }
        return false;
    }

    public static boolean zzb() throws zzdw {
        return zzf("EGL_KHR_surfaceless_context");
    }

    public static boolean zzc(int i10) throws zzdw {
        if (i10 == 6) {
            return zzd();
        }
        if (i10 == 7) {
            return zzf("EGL_EXT_gl_colorspace_bt2020_hlg");
        }
        return true;
    }

    public static boolean zzd() throws zzdw {
        return Build.VERSION.SDK_INT >= 33 && zzf("EGL_EXT_gl_colorspace_bt2020_pq");
    }

    public static void zze(boolean z10, String str) throws zzdw {
        if (!z10) {
            throw new zzdw(str, zzgwm.zzi());
        }
    }

    private static boolean zzf(String str) throws zzdw {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        zze(!eGLDisplayEglGetDisplay.equals(EGL14.EGL_NO_DISPLAY), "No EGL display.");
        zze(EGL14.eglInitialize(eGLDisplayEglGetDisplay, new int[1], 0, new int[1], 0), "Error in eglInitialize.");
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError == 12288) {
            String strEglQueryString = EGL14.eglQueryString(eGLDisplayEglGetDisplay, 12373);
            return strEglQueryString != null && strEglQueryString.contains(str);
        }
        throw new zzdw("Error in getDefaultEglDisplay, error code: 0x".concat(String.valueOf(Integer.toHexString(iEglGetError))), zzgwm.zzj(Integer.valueOf(iEglGetError)));
    }
}
