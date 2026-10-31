package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.mediation.ads.Zfi.OgqfiHA;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import sc.NfwM.XDucgbzInpQa;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzfal implements zzfci {
    private final zzfky zza;
    private final PackageInfo zzb;
    private final com.google.android.gms.ads.internal.util.zzg zzc;

    public zzfal(zzfky zzfkyVar, PackageInfo packageInfo, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = zzfkyVar;
        this.zzb = packageInfo;
        this.zzc = zzgVar;
    }

    /* JADX WARN: Code duplicated, block: B:72:0x0114  */
    @Override // com.google.android.gms.internal.ads.zzfci
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        JSONArray jSONArrayOptJSONArray;
        String str;
        zzfky zzfkyVar = this.zza;
        ArrayList<String> arrayList = zzfkyVar.zzh;
        Bundle bundle = (Bundle) obj;
        if (arrayList == null) {
            return;
        }
        if (arrayList.isEmpty()) {
            bundle.putInt("native_version", 0);
            return;
        }
        bundle.putInt("native_version", 3);
        bundle.putStringArrayList("native_templates", arrayList);
        bundle.putStringArrayList("native_custom_templates", zzfkyVar.zzi);
        zzblt zzbltVar = zzfkyVar.zzj;
        if (zzbltVar != null) {
            String str2 = "landscape";
            if (zzbltVar.zza > 3) {
                bundle.putBoolean("enable_native_media_orientation", true);
                int i10 = zzbltVar.zzh;
                if (i10 == 1) {
                    str = "any";
                } else if (i10 == 2) {
                    str = "landscape";
                } else if (i10 != 3) {
                    str = i10 != 4 ? "unknown" : "square";
                } else {
                    str = "portrait";
                }
                if (!"unknown".equals(str)) {
                    bundle.putString("native_media_orientation", str);
                }
            }
            int i11 = zzbltVar.zzc;
            if (i11 == 0) {
                str2 = "any";
            } else if (i11 == 1) {
                str2 = "portrait";
            } else if (i11 != 2) {
                str2 = "unknown";
            }
            if (!"unknown".equals(str2)) {
                bundle.putString("native_image_orientation", str2);
            }
            bundle.putBoolean("native_multiple_images", zzbltVar.zzd);
            bundle.putBoolean("use_custom_mute", zzbltVar.zzg);
            int i12 = zzbltVar.zzi;
            if (i12 != 0) {
                bundle.putBoolean("sccg_tap", zzbltVar.zzj);
                bundle.putInt("sccg_dir", i12);
            }
        }
        PackageInfo packageInfo = this.zzb;
        int i13 = packageInfo != null ? packageInfo.versionCode : 0;
        com.google.android.gms.ads.internal.util.zzg zzgVar = this.zzc;
        if (i13 > zzgVar.zzg()) {
            zzgVar.zzt();
            zzgVar.zzf(i13);
        }
        JSONObject jSONObjectZzs = zzgVar.zzs();
        String string = null;
        if (jSONObjectZzs != null && (jSONArrayOptJSONArray = jSONObjectZzs.optJSONArray(zzfkyVar.zzg)) != null) {
            string = jSONArrayOptJSONArray.toString();
        }
        if (!TextUtils.isEmpty(string)) {
            bundle.putString("native_advanced_settings", string);
        }
        int i14 = zzfkyVar.zzl;
        if (i14 > 1) {
            bundle.putInt("max_num_ads", i14);
        }
        zzbsb zzbsbVar = zzfkyVar.zzb;
        if (zzbsbVar != null) {
            String str3 = zzbsbVar.zzc;
            if (TextUtils.isEmpty(str3)) {
                String str4 = "p";
                if (zzbsbVar.zza >= 2) {
                    int i15 = zzbsbVar.zzd;
                    if (i15 == 2 || i15 != 3) {
                        str4 = "l";
                    }
                } else {
                    int i16 = zzbsbVar.zzb;
                    if (i16 == 1) {
                        str4 = "l";
                    } else if (i16 != 2) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i16).length() + 41);
                        sb2.append("Instream ad video aspect ratio ");
                        sb2.append(i16);
                        sb2.append(" is wrong.");
                        com.google.android.gms.ads.internal.util.client.zzo.zzf(sb2.toString());
                        str4 = "l";
                    }
                }
                bundle.putString("ia_var", str4);
            } else {
                bundle.putString("ad_tag", str3);
            }
            bundle.putBoolean("instr", true);
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zznp)).booleanValue() || zzbltVar == null) {
            return;
        }
        com.google.android.gms.ads.internal.client.zzfw zzfwVar = zzbltVar.zzf;
        if (zzfwVar != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean(XDucgbzInpQa.jLWfHuRde, zzfwVar.zza);
            bundle2.putBoolean("clickToExpandRequested", zzfwVar.zzc);
            bundle2.putBoolean("customControlsRequested", zzfwVar.zzb);
            bundle.putBundle("video", bundle2);
        }
        bundle.putBoolean("disable_image_loading", zzbltVar.zzb);
        bundle.putInt(OgqfiHA.RTyEkRb, zzbltVar.zze);
    }
}
