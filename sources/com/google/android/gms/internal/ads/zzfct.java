package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import java.util.ArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzfct implements zzfci {
    public final boolean zza;
    public final boolean zzb;
    public final String zzc;
    public final boolean zzd;
    public final boolean zze;
    public final boolean zzf;
    public final String zzg;
    public final String zzh;
    public final String zzi;
    public final ArrayList zzj;
    public final String zzk;
    public final String zzl;
    public final String zzm;
    public final boolean zzn;
    public final String zzo;
    public final long zzp;
    public final boolean zzq;
    public final String zzr;
    public final int zzs;
    public final String zzt;

    public zzfct(boolean z10, boolean z11, String str, boolean z12, boolean z13, boolean z14, String str2, ArrayList arrayList, String str3, String str4, String str5, boolean z15, String str6, long j10, boolean z16, String str7, int i10, String str8, String str9, String str10) {
        this.zza = z10;
        this.zzb = z11;
        this.zzc = str;
        this.zzd = z12;
        this.zze = z13;
        this.zzf = z14;
        this.zzg = str2;
        this.zzh = str8;
        this.zzj = arrayList;
        this.zzk = str3;
        this.zzl = str4;
        this.zzm = str5;
        this.zzn = z15;
        this.zzo = str6;
        this.zzp = j10;
        this.zzq = z16;
        this.zzr = str7;
        this.zzs = i10;
        this.zzt = str10;
        this.zzi = str9;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0070  */
    @Override // com.google.android.gms.internal.ads.zzfci
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        String str;
        Bundle bundle = (Bundle) obj;
        bundle.putBoolean("cog", this.zza);
        bundle.putBoolean("coh", this.zzb);
        bundle.putString("gl", this.zzc);
        bundle.putBoolean("simulator", this.zzd);
        bundle.putBoolean("is_latchsky", this.zze);
        bundle.putInt("build_api_level", this.zzs);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzmw)).booleanValue()) {
            bundle.putBoolean("is_sidewinder", this.zzf);
        }
        bundle.putString("hl", this.zzg);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzoU)).booleanValue()) {
            bundle.putString("dlc", this.zzh);
        } else if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzoV)).booleanValue()) {
            bundle.putString("dlc", this.zzh);
        }
        ArrayList<String> arrayList = this.zzj;
        if (!arrayList.isEmpty()) {
            bundle.putStringArrayList("hl_list", arrayList);
        }
        String str2 = this.zzi;
        if (str2 != null) {
            bundle.putString("dgl", str2);
        }
        bundle.putString("mv", this.zzk);
        bundle.putString("submodel", this.zzo);
        Bundle bundleZza = zzfln.zza(bundle, DeviceRequestsHelper.DEVICE_INFO_DEVICE);
        bundle.putBundle(DeviceRequestsHelper.DEVICE_INFO_DEVICE, bundleZza);
        bundleZza.putString(InAppPurchaseConstants.METHOD_BUILD, this.zzm);
        bundleZza.putLong("remaining_data_partition_space", this.zzp);
        Bundle bundleZza2 = zzfln.zza(bundleZza, "browser");
        bundleZza.putBundle("browser", bundleZza2);
        bundleZza2.putBoolean("is_browser_custom_tabs_capable", this.zzn);
        String str3 = this.zzl;
        if (!TextUtils.isEmpty(str3)) {
            Bundle bundleZza3 = zzfln.zza(bundleZza, "play_store");
            bundleZza.putBundle("play_store", bundleZza3);
            bundleZza3.putString("package_version", str3);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzmM)).booleanValue()) {
            bundle.putBoolean("is_bstar", this.zzq);
        }
        String str4 = this.zzr;
        if (!TextUtils.isEmpty(str4)) {
            bundle.putString("v_unity", str4);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzmG)).booleanValue()) {
            zzfln.zzd(bundle, "gotmt_l", true, ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzmD)).booleanValue());
            zzfln.zzd(bundle, "gotmt_i", true, ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzmC)).booleanValue());
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzpK)).booleanValue() || (str = this.zzt) == null) {
            return;
        }
        bundle.putString("sdk_i_s", str);
    }
}
