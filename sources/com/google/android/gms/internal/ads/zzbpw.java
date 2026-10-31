package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbpw implements zzbpq {
    private final Context zza;
    private final Map zzb;

    public zzbpw(Context context, Map map) {
        this.zza = context;
        this.zzb = map;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0051  */
    @Override // com.google.android.gms.internal.ads.zzbpq
    public final void zza(Object obj, Map map) {
        byte b10;
        zzcdz zzcdzVarZzD = com.google.android.gms.ads.internal.zzt.zzD();
        Context context = this.zza;
        if (zzcdzVarZzD.zza(context)) {
            String str = (String) map.get("eventName");
            String str2 = (String) map.get("eventId");
            int iHashCode = str.hashCode();
            if (iHashCode != 94399) {
                if (iHashCode != 94401) {
                    if (iHashCode == 94407 && str.equals("_ai")) {
                        b10 = 1;
                    } else {
                        b10 = -1;
                    }
                } else if (str.equals("_ac")) {
                    b10 = 0;
                } else {
                    b10 = -1;
                }
            } else if (str.equals("_aa")) {
                b10 = 2;
            } else {
                b10 = -1;
            }
            if (b10 == 0) {
                com.google.android.gms.ads.internal.zzt.zzD().zzk(context, str2, (Map) this.zzb.get("_ac"));
            } else if (b10 == 1) {
                com.google.android.gms.ads.internal.zzt.zzD().zzl(context, str2, (Map) this.zzb.get("_ai"));
            } else if (b10 == 2) {
                com.google.android.gms.ads.internal.zzt.zzD().zzn(context, str2);
            } else {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzf("logScionEvent gmsg contained unsupported eventName");
            }
        }
    }
}
