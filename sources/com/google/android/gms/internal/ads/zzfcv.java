package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.LocaleList;
import android.os.StatFs;
import com.applovin.shadow.okhttp3.internal.ws.RealWebSocket;
import com.facebook.internal.NativeProtocol;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzfcv implements zzfck {
    private final zzhcg zza;
    private final Context zzb;
    private final zzeeb zzc;
    private final String zzd;

    zzfcv(zzhcg zzhcgVar, Context context, zzeeb zzeebVar, String str) {
        this.zza = zzhcgVar;
        this.zzb = context;
        this.zzc = zzeebVar;
        this.zzd = str;
    }

    private static ResolveInfo zzd(PackageManager packageManager, String str) {
        return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST);
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final ListenableFuture zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzfcu
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final int zzb() {
        return 38;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:47:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:48:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:51:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:53:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:54:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:55:0x01da  */
    /* JADX WARN: Code duplicated, block: B:58:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:59:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:61:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:62:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:8:0x005c  */
    final /* synthetic */ zzfct zzc() {
        ActivityInfo activityInfo;
        String string;
        String string2;
        String str;
        String strZza;
        String str2;
        boolean zEquals;
        boolean z10;
        String strZzf;
        boolean z11;
        boolean z12;
        Context context = this.zzb;
        PackageManager packageManager = context.getPackageManager();
        Locale locale = Locale.getDefault();
        ResolveInfo resolveInfoZzd = zzd(packageManager, "geo:0,0?q=donuts");
        ResolveInfo resolveInfoZzd2 = zzd(packageManager, "http://www.google.com");
        String country = locale.getCountry();
        com.google.android.gms.ads.internal.zzt.zzc();
        com.google.android.gms.ads.internal.client.zzay.zza();
        boolean zZzy = com.google.android.gms.ads.internal.util.client.zzf.zzy();
        boolean zIsLatchsky = DeviceProperties.isLatchsky(context);
        boolean zIsSidewinder = DeviceProperties.isSidewinder(context);
        String language = locale.getLanguage();
        ArrayList arrayList = new ArrayList();
        LocaleList localeList = LocaleList.getDefault();
        for (int i10 = 0; i10 < localeList.size(); i10++) {
            arrayList.add(localeList.get(i10).getLanguage());
        }
        ResolveInfo resolveInfoZzd3 = zzd(packageManager, "market://details?id=com.google.android.gms.ads");
        if (resolveInfoZzd3 == null || (activityInfo = resolveInfoZzd3.activityInfo) == null) {
            string = null;
        } else {
            try {
                PackageInfo packageInfo = Wrappers.packageManager(context).getPackageInfo(activityInfo.packageName, 0);
                if (packageInfo != null) {
                    int i11 = packageInfo.versionCode;
                    String str3 = activityInfo.packageName;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 1 + String.valueOf(str3).length());
                    sb2.append(i11);
                    sb2.append(".");
                    sb2.append(str3);
                    string = sb2.toString();
                } else {
                    string = null;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        try {
            PackageInfo packageInfo2 = Wrappers.packageManager(this.zzb).getPackageInfo("com.android.vending", 128);
            if (packageInfo2 != null) {
                int i12 = packageInfo2.versionCode;
                String str4 = packageInfo2.packageName;
                StringBuilder sb3 = new StringBuilder(String.valueOf(i12).length() + 1 + String.valueOf(str4).length());
                sb3.append(i12);
                sb3.append(".");
                sb3.append(str4);
                string2 = sb3.toString();
            } else {
                string2 = null;
            }
        } catch (Exception unused2) {
        }
        String str5 = Build.FINGERPRINT;
        String language2 = Locale.getDefault().getLanguage();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzoV)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzq zzqVarZzk = com.google.android.gms.ads.internal.util.zzs.zzk(this.zzb);
            String strZzb = zzqVarZzk.zzb();
            strZza = zzqVarZzk.zza();
            str = strZzb;
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzoU)).booleanValue()) {
                language2 = com.google.android.gms.ads.internal.util.zzs.zzk(this.zzb).zzb();
            }
            str = language2;
            strZza = null;
        }
        Context context2 = this.zzb;
        if (packageManager != null) {
            str2 = str5;
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
            ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0);
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST);
            if (listQueryIntentActivities != null && resolveInfoResolveActivity != null) {
                int i13 = 0;
                while (true) {
                    if (i13 < listQueryIntentActivities.size()) {
                        List<ResolveInfo> list = listQueryIntentActivities;
                        if (resolveInfoResolveActivity.activityInfo.name.equals(listQueryIntentActivities.get(i13).activityInfo.name)) {
                            zEquals = resolveInfoResolveActivity.activityInfo.packageName.equals(zzink.zza(context2));
                            break;
                        }
                        i13++;
                        listQueryIntentActivities = list;
                    }
                }
            }
            com.google.android.gms.ads.internal.zzt.zzc();
            long availableBytes = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzmM)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                if (com.google.android.gms.ads.internal.util.zzs.zzE(context2)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzmQ)).booleanValue()) {
                strZzf = "";
            } else if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzmS)).booleanValue()) {
                strZzf = this.zzd;
            } else {
                strZzf = com.google.android.gms.ads.internal.util.client.zzf.zzf(context2);
            }
            String str6 = strZzf;
            if (resolveInfoZzd2 != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (resolveInfoZzd != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            return new zzfct(z12, z11, country, zZzy, zIsLatchsky, zIsSidewinder, language, arrayList, string, string2, str2, zEquals, Build.MODEL, availableBytes, z10, str6, Build.VERSION.SDK_INT, str, strZza, this.zzc.zza());
        }
        str2 = str5;
        zEquals = false;
        com.google.android.gms.ads.internal.zzt.zzc();
        long availableBytes2 = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzmM)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzc();
            if (com.google.android.gms.ads.internal.util.zzs.zzE(context2)) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzmQ)).booleanValue()) {
            strZzf = "";
        } else if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzmS)).booleanValue()) {
            strZzf = this.zzd;
        } else {
            strZzf = com.google.android.gms.ads.internal.util.client.zzf.zzf(context2);
        }
        String str7 = strZzf;
        if (resolveInfoZzd2 != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (resolveInfoZzd != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        return new zzfct(z12, z11, country, zZzy, zIsLatchsky, zIsSidewinder, language, arrayList, string, string2, str2, zEquals, Build.MODEL, availableBytes2, z10, str7, Build.VERSION.SDK_INT, str, strZza, this.zzc.zza());
    }
}
