package com.google.android.gms.common.util;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import be.LNO.fzLzfW;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.InternalClientFlagRegistry;
import com.google.android.gms.common.internal.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.11.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class DeviceProperties {
    private static Boolean zza;
    private static Boolean zzb;
    private static Boolean zzc;
    private static Boolean zzd;
    private static Boolean zze;
    private static Boolean zzf;
    private static Boolean zzg;
    private static Boolean zzh;
    private static Boolean zzi;
    private static Boolean zzj;
    private static Boolean zzk;
    private static Boolean zzl;
    private static Boolean zzm;
    private static Boolean zzn;
    private static Boolean zzo;
    private static Boolean zzp;
    private static Boolean zzq;
    private static Boolean zzr;

    private DeviceProperties() {
    }

    public static boolean isAuto(Context context) {
        return zzg(context.getPackageManager());
    }

    public static boolean isBstar(Context context) {
        if (zzo == null) {
            boolean z10 = false;
            if (PlatformVersion.isAtLeastR() && context.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")) {
                z10 = true;
            }
            zzo = Boolean.valueOf(z10);
        }
        return zzo.booleanValue();
    }

    public static boolean isFoldable(Context context) {
        if (zzd == null) {
            boolean z10 = false;
            if (PlatformVersion.isAtLeastR() && context.getPackageManager().hasSystemFeature("android.hardware.sensor.hinge_angle")) {
                z10 = true;
            }
            zzd = Boolean.valueOf(z10);
        }
        return zzd.booleanValue();
    }

    public static boolean isPhone(Context context) {
        if (zza == null) {
            boolean z10 = true;
            if (InternalClientFlagRegistry.getClientFlags().isPhoneRefinedFoldableAndTabletLogic()) {
                boolean z11 = isWearable(context) || zze(context) || zzf(context) || isAuto(context) || isTv(context) || isBstar(context) || isXr(context) || zzk(context) || zzc(context.getPackageManager());
                if (isTablet(context)) {
                    zza = Boolean.valueOf(isFoldable(context) && !z11);
                } else {
                    zza = Boolean.valueOf(!z11);
                }
            } else {
                if (!isFoldable(context) && (isTablet(context) || isWearable(context) || zze(context) || zzf(context) || isAuto(context) || isTv(context) || zzj(context.getPackageManager()) || isBstar(context) || isXr(context) || zzk(context) || zzc(context.getPackageManager()))) {
                    z10 = false;
                }
                zza = Boolean.valueOf(z10);
            }
        }
        return zza.booleanValue();
    }

    public static boolean isPhoneGo(Context context) {
        ActivityManager activityManager;
        boolean z10 = false;
        if (context == null) {
            return false;
        }
        if (zzb == null) {
            if (isPhone(context)) {
                if (zzi == null && (activityManager = (ActivityManager) context.getSystemService("activity")) != null) {
                    zzi = Boolean.valueOf(activityManager.isLowRamDevice());
                }
                if (Objects.equal(zzi, Boolean.TRUE) && Build.VERSION.SDK_INT >= 27) {
                    z10 = true;
                }
            }
            zzb = Boolean.valueOf(z10);
        }
        return zzb.booleanValue();
    }

    public static boolean isSevenInchTablet(Context context) {
        return zza(context.getResources());
    }

    public static boolean isSidewinder(Context context) {
        return zzd(context);
    }

    public static boolean isTablet(Context context) {
        return isTablet(context.getResources());
    }

    public static boolean isTv(Context context) {
        return zzh(context.getPackageManager());
    }

    public static boolean isUserBuild() {
        int i10 = GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        return "user".equals(Build.TYPE);
    }

    public static boolean isWearable(Context context) {
        return zzb(context.getPackageManager());
    }

    public static boolean isWearableWithoutPlayStore(Context context) {
        if (isWearable(context) && !PlatformVersion.isAtLeastN()) {
            return true;
        }
        if (zzd(context)) {
            return !PlatformVersion.isAtLeastO() || PlatformVersion.isAtLeastR();
        }
        return false;
    }

    public static boolean isXr(Context context) {
        return zzi(context.getPackageManager());
    }

    public static boolean zza(Resources resources) {
        boolean z10 = false;
        if (resources == null) {
            return false;
        }
        if (zze == null) {
            Configuration configuration = resources.getConfiguration();
            if ((configuration.screenLayout & 15) <= 3 && configuration.smallestScreenWidthDp >= 600) {
                z10 = true;
            }
            zze = Boolean.valueOf(z10);
        }
        return zze.booleanValue();
    }

    public static boolean zzb(PackageManager packageManager) {
        if (zzf == null) {
            zzf = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        return zzf.booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x002e  */
    public static boolean zzc(PackageManager packageManager) {
        if (zzr == null) {
            boolean z10 = false;
            if (PlatformVersion.isAtLeastV()) {
                if (Build.VERSION.SDK_INT < 36) {
                    String str = Build.VERSION.CODENAME;
                    if (str.charAt(0) >= 'B' && str.charAt(0) <= 'C') {
                        if (packageManager.hasSystemFeature("android.hardware.type.xr_peripheral")) {
                            z10 = true;
                        }
                    }
                } else if (packageManager.hasSystemFeature("android.hardware.type.xr_peripheral")) {
                    z10 = true;
                }
            }
            zzr = Boolean.valueOf(z10);
        }
        return zzr.booleanValue();
    }

    public static boolean zzd(Context context) {
        if (zzg == null) {
            zzg = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return zzg.booleanValue();
    }

    public static boolean zze(Context context) {
        if (zzj == null) {
            zzj = Boolean.valueOf(PlatformVersion.isAtLeastO() ? context.getPackageManager().hasSystemFeature("android.hardware.type.embedded") : context.getPackageManager().hasSystemFeature("android.hardware.type.iot"));
        }
        return zzj.booleanValue();
    }

    public static boolean zzf(Context context) {
        if (zzk == null) {
            zzk = Boolean.valueOf(context.getPackageManager().hasSystemFeature("org.chromium.arc"));
        }
        return zzk.booleanValue();
    }

    public static boolean zzg(PackageManager packageManager) {
        if (zzl == null) {
            boolean z10 = false;
            if (PlatformVersion.isAtLeastO() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z10 = true;
            }
            zzl = Boolean.valueOf(z10);
        }
        return zzl.booleanValue();
    }

    public static boolean zzh(PackageManager packageManager) {
        if (zzm == null) {
            boolean z10 = true;
            if (!packageManager.hasSystemFeature("com.google.android.tv") && !packageManager.hasSystemFeature("android.hardware.type.television") && !packageManager.hasSystemFeature("android.software.leanback") && !zzj(packageManager)) {
                z10 = false;
            }
            zzm = Boolean.valueOf(z10);
        }
        return zzm.booleanValue();
    }

    public static boolean zzi(PackageManager packageManager) {
        if (zzp == null) {
            zzp = Boolean.valueOf(packageManager.hasSystemFeature("android.software.xr.api.spatial"));
        }
        return zzp.booleanValue();
    }

    public static boolean zzj(PackageManager packageManager) {
        if (zzn == null) {
            zzn = Boolean.valueOf(packageManager.hasSystemFeature("com.google.android.feature.AMATI_EXPERIENCE"));
        }
        return zzn.booleanValue();
    }

    public static boolean zzk(Context context) {
        if (zzq == null) {
            zzq = Boolean.valueOf(context.getPackageManager().hasSystemFeature("com.google.desktop.gms"));
        }
        return zzq.booleanValue();
    }

    public static boolean isLatchsky(Context context) {
        if (zzh == null) {
            PackageManager packageManager = context.getPackageManager();
            boolean z10 = false;
            if (packageManager.hasSystemFeature("com.google.android.feature.services_updater") && packageManager.hasSystemFeature(fzLzfW.Jtl)) {
                z10 = true;
            }
            zzh = Boolean.valueOf(z10);
        }
        return zzh.booleanValue();
    }

    public static boolean isTablet(Resources resources) {
        if (resources == null) {
            return false;
        }
        if (zzc == null) {
            zzc = Boolean.valueOf((resources.getConfiguration().screenLayout & 15) > 3 || zza(resources));
        }
        return zzc.booleanValue();
    }
}
