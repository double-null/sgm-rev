package com.google.android.gms.internal.ads;

import io.bidmachine.iab.vast.activity.IIj.KBBdKxoAiHo;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbzh {
    public final boolean zza;
    public final String zzb;
    public final boolean zzc;

    public zzbzh(boolean z10, String str, boolean z11) {
        this.zza = z10;
        this.zzb = str;
        this.zzc = z11;
    }

    public static zzbzh zza(JSONObject jSONObject) {
        return new zzbzh(jSONObject.optBoolean(KBBdKxoAiHo.GiyVkl, false), jSONObject.optString("prefetch_url", ""), jSONObject.optBoolean("skip_offline_notification_flow", false));
    }
}
