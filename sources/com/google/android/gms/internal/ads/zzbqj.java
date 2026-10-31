package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.applovin.sdk.AppLovinEventParameters;
import com.google.android.gms.common.util.cS.EFLCCdIRcb;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbqj implements zzbpq {
    private final zzbqi zza;

    public zzbqj(zzbqi zzbqiVar) {
        this.zza = zzbqiVar;
    }

    public static void zzb(zzcku zzckuVar, zzbqi zzbqiVar) {
        zzckuVar.zzab("/reward", new zzbqj(zzbqiVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final void zza(Object obj, Map map) {
        String str = (String) map.get(EFLCCdIRcb.ZBILnnTNC);
        if (!"grant".equals(str)) {
            if ("video_start".equals(str)) {
                this.zza.zza();
                return;
            } else {
                if ("video_complete".equals(str)) {
                    this.zza.zzc();
                    return;
                }
                return;
            }
        }
        zzccb zzccbVar = null;
        try {
            int i10 = Integer.parseInt((String) map.get(AppLovinEventParameters.REVENUE_AMOUNT));
            String str2 = (String) map.get("type");
            if (!TextUtils.isEmpty(str2)) {
                zzccbVar = new zzccb(str2, i10);
            }
        } catch (NumberFormatException e10) {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Unable to parse reward amount.", e10);
        }
        this.zza.zzb(zzccbVar);
    }
}
