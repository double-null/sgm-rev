package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.zzbiq;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public class zzu extends zzt {
    static final boolean zze(int i10, int i11, int i12) {
        return Math.abs(i10 - i11) <= i12;
    }

    @Override // com.google.android.gms.ads.internal.util.zzz
    public final boolean zzd(Activity activity, Configuration configuration) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzfZ)).booleanValue()) {
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzgb)).booleanValue()) {
            return activity.isInMultiWindowMode();
        }
        com.google.android.gms.ads.internal.client.zzay.zza();
        int iZzE = com.google.android.gms.ads.internal.util.client.zzf.zzE(activity, configuration.screenHeightDp);
        int iZzE2 = com.google.android.gms.ads.internal.util.client.zzf.zzE(activity, configuration.screenWidthDp);
        WindowManager windowManager = (WindowManager) activity.getApplicationContext().getSystemService("window");
        com.google.android.gms.ads.internal.zzt.zzc();
        DisplayMetrics displayMetricsZzv = zzs.zzv(windowManager);
        int i10 = displayMetricsZzv.heightPixels;
        int i11 = displayMetricsZzv.widthPixels;
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
        int iRound = ((int) Math.round(((double) activity.getResources().getDisplayMetrics().density) + 0.5d)) * ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzfX)).intValue();
        return (zze(i10, iZzE + dimensionPixelSize, iRound) && zze(i11, iZzE2, iRound)) ? false : true;
    }
}
