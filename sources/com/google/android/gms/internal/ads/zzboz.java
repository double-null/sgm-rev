package com.google.android.gms.internal.ads;

import com.android.billingclient.gp.VRfCTjjLv;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzboz implements zzbpq {
    zzboz() {
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final void zza(Object obj, Map map) {
        String strValueOf = String.valueOf((String) map.get(VRfCTjjLv.cpL));
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("Received log message: ".concat(strValueOf));
    }
}
