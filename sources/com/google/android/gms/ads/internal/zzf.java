package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.facebook.internal.ServerProtocol;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbih;
import com.google.android.gms.internal.ads.zzbiq;
import com.google.android.gms.internal.ads.zzbty;
import com.google.android.gms.internal.ads.zzbuc;
import com.google.android.gms.internal.ads.zzbuf;
import com.google.android.gms.internal.ads.zzbui;
import com.google.android.gms.internal.ads.zzcey;
import com.google.android.gms.internal.ads.zzcfr;
import com.google.android.gms.internal.ads.zzcfu;
import com.google.android.gms.internal.ads.zzdzk;
import com.google.android.gms.internal.ads.zzdzl;
import com.google.android.gms.internal.ads.zzfpw;
import com.google.android.gms.internal.ads.zzfqj;
import com.google.android.gms.internal.ads.zzhbe;
import com.google.android.gms.internal.ads.zzhbw;
import com.google.android.gms.internal.ads.zzhcg;
import com.google.common.util.concurrent.ListenableFuture;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzf {
    private Context zza;
    private long zzb = 0;

    static final /* synthetic */ ListenableFuture zzd(Long l10, zzdzl zzdzlVar, zzfpw zzfpwVar, zzfqj zzfqjVar, JSONObject jSONObject) throws JSONException {
        boolean zOptBoolean = jSONObject.optBoolean("isSuccessful", false);
        if (zOptBoolean) {
            zzt.zzh().zzo().zzh(jSONObject.getString("appSettingsJson"));
            if (l10 != null) {
                zzf(zzdzlVar, "cld_s", zzt.zzk().elapsedRealtime() - l10.longValue());
            }
        }
        String strOptString = jSONObject.optString("errorReason", "");
        if (!TextUtils.isEmpty(strOptString)) {
            zzfpwVar.zzk(strOptString);
        }
        zzfpwVar.zzd(zOptBoolean);
        zzfqjVar.zzb(zzfpwVar.zzm());
        return zzhbw.zza(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zzf(zzdzl zzdzlVar, String str, long j10) {
        if (zzdzlVar != null) {
            if (((Boolean) zzba.zzc().zzd(zzbiq.zzof)).booleanValue()) {
                zzdzk zzdzkVarZza = zzdzlVar.zza();
                zzdzkVarZza.zzc("action", "lat_init");
                zzdzkVarZza.zzc(str, Long.toString(j10));
                zzdzkVarZza.zzd();
            }
        }
    }

    public final void zza(Context context, VersionInfoParcel versionInfoParcel, String str, Runnable runnable, zzfqj zzfqjVar, zzdzl zzdzlVar, Long l10, boolean z10) {
        zzc(context, versionInfoParcel, true, null, str, null, runnable, zzfqjVar, zzdzlVar, l10, z10);
    }

    public final void zzb(Context context, VersionInfoParcel versionInfoParcel, String str, zzcey zzceyVar, zzfqj zzfqjVar, boolean z10) {
        zzc(context, versionInfoParcel, false, zzceyVar, zzceyVar != null ? zzceyVar.zze() : null, str, null, zzfqjVar, null, null, z10);
    }

    final void zzc(Context context, VersionInfoParcel versionInfoParcel, boolean z10, zzcey zzceyVar, String str, String str2, Runnable runnable, final zzfqj zzfqjVar, final zzdzl zzdzlVar, final Long l10, boolean z11) {
        PackageInfo packageInfo;
        if (zzt.zzk().elapsedRealtime() - this.zzb < 5000) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Not retrying to fetch app settings");
            return;
        }
        this.zzb = zzt.zzk().elapsedRealtime();
        if (zzceyVar != null && !TextUtils.isEmpty(zzceyVar.zzd())) {
            if (zzt.zzk().currentTimeMillis() - zzceyVar.zzb() <= ((Long) zzba.zzc().zzd(zzbiq.zzfb)).longValue() && zzceyVar.zzc()) {
                return;
            }
        }
        if (context == null) {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Context not provided to fetch application settings");
            return;
        }
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            int i12 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("App settings could not be fetched. Required parameters missing");
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        this.zza = applicationContext;
        final zzfpw zzfpwVarZzn = zzfpw.zzn(context, 4);
        zzfpwVarZzn.zza();
        zzbui zzbuiVarZzb = zzt.zzr().zzb(this.zza, versionInfoParcel, zzfqjVar);
        zzbuc zzbucVar = zzbuf.zza;
        zzbty zzbtyVarZza = zzbuiVarZzb.zza("google.afma.config.fetchAppSettings", zzbucVar, zzbucVar);
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("app_id", str);
            } else if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("ad_unit_id", str2);
            }
            jSONObject.put("is_init", z10);
            jSONObject.put("pn", context.getPackageName());
            zzbih zzbihVar = zzbiq.zza;
            jSONObject.put("experiment_ids", TextUtils.join(",", zzba.zzb().zze()));
            jSONObject.put("js", versionInfoParcel.afmaVersion);
            if (((Boolean) zzba.zzc().zzd(zzbiq.zzkU)).booleanValue()) {
                jSONObject.put("inspector_enabled", z11);
            }
            try {
                ApplicationInfo applicationInfo = this.zza.getApplicationInfo();
                if (applicationInfo != null && (packageInfo = Wrappers.packageManager(context).getPackageInfo(applicationInfo.packageName, 0)) != null) {
                    jSONObject.put(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, packageInfo.versionCode);
                }
            } catch (PackageManager.NameNotFoundException unused) {
                com.google.android.gms.ads.internal.util.zze.zza("Error fetching PackageInfo.");
            }
            ListenableFuture listenableFutureZzb = zzbtyVarZza.zzb(jSONObject);
            zzhbe zzhbeVar = new zzhbe(this) { // from class: com.google.android.gms.ads.internal.zzd
                @Override // com.google.android.gms.internal.ads.zzhbe
                public final /* synthetic */ ListenableFuture zza(Object obj) {
                    return zzf.zzd(l10, zzdzlVar, zzfpwVarZzn, zzfqjVar, (JSONObject) obj);
                }
            };
            zzhcg zzhcgVar = zzcfr.zzh;
            ListenableFuture listenableFutureZzj = zzhbw.zzj(listenableFutureZzb, zzhbeVar, zzhcgVar);
            if (runnable != null) {
                listenableFutureZzb.addListener(runnable, zzhcgVar);
            }
            if (l10 != null) {
                listenableFutureZzb.addListener(new Runnable(this) { // from class: com.google.android.gms.ads.internal.zze
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzf.zzf(zzdzlVar, "cld_r", zzt.zzk().elapsedRealtime() - l10.longValue());
                    }
                }, zzhcgVar);
            }
            if (((Boolean) zzba.zzc().zzd(zzbiq.zziG)).booleanValue()) {
                zzcfu.zzb(listenableFutureZzj, "ConfigLoader.maybeFetchNewAppSettings");
            } else {
                zzcfu.zza(listenableFutureZzj, "ConfigLoader.maybeFetchNewAppSettings", zzhcgVar);
            }
        } catch (Exception e10) {
            int i13 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error requesting application settings", e10);
            zzfpwVarZzn.zzj(e10);
            zzfpwVarZzn.zzd(false);
            zzfqjVar.zzb(zzfpwVarZzn.zzm());
        }
    }
}
