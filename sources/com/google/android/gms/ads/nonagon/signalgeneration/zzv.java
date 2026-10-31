package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.facebook.appevents.AppEventsConstants;
import com.google.android.gms.internal.ads.zzbiq;
import com.google.android.gms.internal.ads.zzcfr;
import com.google.android.gms.internal.ads.zzdzg;
import com.google.android.gms.internal.ads.zzdzq;
import com.google.android.gms.internal.ads.zzfkq;
import com.google.android.gms.internal.ads.zzfky;
import com.google.android.gms.internal.ads.zzfql;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzv {
    public static boolean zza(zzfkq zzfkqVar) {
        return zzg(zzfkqVar.zza.zza) != 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:36:0x006c  */
    public static String zzb(String str) {
        if (TextUtils.isEmpty(str)) {
            return "unspecified";
        }
        switch (str) {
            case "requester_type_0":
                return AppEventsConstants.EVENT_PARAM_VALUE_NO;
            case "requester_type_1":
                return AppEventsConstants.EVENT_PARAM_VALUE_YES;
            case "requester_type_2":
                return "2";
            case "requester_type_3":
                return "3";
            case "requester_type_4":
                return "4";
            case "requester_type_5":
                return "5";
            case "requester_type_6":
                return "6";
            case "requester_type_7":
                return "7";
            case "requester_type_8":
                return "8";
            default:
                return str;
        }
    }

    public static String zzc(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        Bundle bundle;
        return (zzmVar == null || (bundle = zzmVar.zzc) == null) ? "unspecified" : bundle.getString("query_info_type");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:39:0x007b  */
    public static zzfql zzd(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle2 != null) {
            bundle = bundle2;
        }
        String string = bundle.getString("query_info_type");
        if (TextUtils.isEmpty(string)) {
            return zzfql.SCAR_REQUEST_TYPE_UNSPECIFIED;
        }
        switch (string) {
            case "requester_type_0":
                return zzfql.SCAR_REQUEST_TYPE_ADMOB;
            case "requester_type_1":
                return zzfql.SCAR_REQUEST_TYPE_INBOUND_MEDIATION;
            case "requester_type_2":
                return zzfql.SCAR_REQUEST_TYPE_GBID;
            case "requester_type_3":
                return zzfql.SCAR_REQUEST_TYPE_GOLDENEYE;
            case "requester_type_4":
                return zzfql.SCAR_REQUEST_TYPE_YAVIN;
            case "requester_type_5":
                return zzfql.SCAR_REQUEST_TYPE_UNITY;
            case "requester_type_6":
                return zzfql.SCAR_REQUEST_TYPE_PAW;
            case "requester_type_7":
                return zzfql.SCAR_REQUEST_TYPE_GUILDER;
            case "requester_type_8":
                return zzfql.SCAR_REQUEST_TYPE_GAM_S2S;
            default:
                return zzfql.SCAR_REQUEST_TYPE_UNSPECIFIED;
        }
    }

    public static void zze(final zzdzq zzdzqVar, zzdzg zzdzgVar, final String str, final Pair... pairArr) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzhT)).booleanValue()) {
            final zzdzg zzdzgVar2 = null;
            zzcfr.zza.execute(new Runnable(zzdzgVar2, str, pairArr) { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzu
                private final /* synthetic */ String zzb;
                private final /* synthetic */ Pair[] zzc;

                {
                    this.zzb = str;
                    this.zzc = pairArr;
                }

                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzv.zzf(this.zza, null, this.zzb, this.zzc);
                }
            });
        }
    }

    static /* synthetic */ void zzf(zzdzq zzdzqVar, zzdzg zzdzgVar, String str, Pair[] pairArr) {
        ConcurrentHashMap concurrentHashMapZzd = zzdzqVar.zzd();
        zzh(concurrentHashMapZzd, "action", str);
        for (Pair pair : pairArr) {
            zzh(concurrentHashMapZzd, (String) pair.first, (String) pair.second);
        }
        zzdzqVar.zzb(concurrentHashMapZzd);
    }

    public static int zzg(zzfky zzfkyVar) {
        if (zzfkyVar.zzs) {
            return 2;
        }
        com.google.android.gms.ads.internal.client.zzm zzmVar = zzfkyVar.zzd;
        com.google.android.gms.ads.internal.client.zzc zzcVar = zzmVar.zzs;
        if (zzcVar == null && zzmVar.zzx == null) {
            return 1;
        }
        if (zzcVar == null || zzmVar.zzx == null) {
            return zzcVar != null ? 3 : 4;
        }
        return 5;
    }

    private static void zzh(Map map, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        map.put(str, str2);
    }
}
