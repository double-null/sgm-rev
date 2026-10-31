package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzfax implements zzfck {
    private final ApplicationInfo zza;
    private final PackageInfo zzb;
    private final Context zzc;

    zzfax(ApplicationInfo applicationInfo, PackageInfo packageInfo, Context context) {
        this.zza = applicationInfo;
        this.zzb = packageInfo;
        this.zzc = context;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0086  */
    @Override // com.google.android.gms.internal.ads.zzfck
    public final ListenableFuture zza() {
        String strValueOf;
        String installingPackageName;
        String str;
        PackageManager.NameNotFoundException e10;
        String initiatingPackageName;
        String str2 = this.zza.packageName;
        PackageInfo packageInfo = this.zzb;
        Integer numValueOf = packageInfo == null ? null : Integer.valueOf(packageInfo.versionCode);
        String str3 = packageInfo == null ? null : packageInfo.versionName;
        try {
            Context context = this.zzc;
            zzgam zzgamVar = com.google.android.gms.ads.internal.util.zzs.zza;
            strValueOf = String.valueOf(Wrappers.packageManager(context).getApplicationLabel(str2));
        } catch (PackageManager.NameNotFoundException unused) {
            strValueOf = null;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzol)).booleanValue()) {
                try {
                    InstallSourceInfo installSourceInfo = this.zzc.getPackageManager().getInstallSourceInfo(str2);
                    if (installSourceInfo != null) {
                        installingPackageName = installSourceInfo.getInstallingPackageName();
                        try {
                            if (TextUtils.isEmpty(installingPackageName)) {
                                com.google.android.gms.ads.internal.util.zze.zza("No installing package name found");
                                installingPackageName = null;
                            }
                            initiatingPackageName = installSourceInfo.getInitiatingPackageName();
                            try {
                                if (TextUtils.isEmpty(initiatingPackageName)) {
                                    com.google.android.gms.ads.internal.util.zze.zza("No initiating package name found");
                                    str = null;
                                } else {
                                    str = initiatingPackageName;
                                }
                            } catch (PackageManager.NameNotFoundException e11) {
                                e10 = e11;
                                com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "PackageInfoSignalSource.getInstallSourceInfo");
                            }
                        } catch (PackageManager.NameNotFoundException e12) {
                            e10 = e12;
                            initiatingPackageName = null;
                        }
                    } else {
                        installingPackageName = null;
                        str = null;
                    }
                } catch (PackageManager.NameNotFoundException e13) {
                    installingPackageName = null;
                    e10 = e13;
                    initiatingPackageName = null;
                }
            } else {
                installingPackageName = null;
                str = null;
            }
        } else {
            installingPackageName = null;
            str = null;
        }
        return zzhbw.zza(new zzfay(str2, numValueOf, str3, strValueOf, installingPackageName, str));
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final int zzb() {
        return 29;
    }
}
