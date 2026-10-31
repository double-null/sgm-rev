package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbqh implements zzbpq {
    private final Object zza = new Object();
    private final Map zzb = new HashMap();

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final void zza(Object obj, Map map) {
        String str = (String) map.get("id");
        String str2 = (String) map.get("fail");
        String str3 = (String) map.get("fail_reason");
        String str4 = (String) map.get("fail_stack");
        String str5 = (String) map.get("result");
        if (true == TextUtils.isEmpty(str4)) {
            str3 = "Unknown Fail Reason.";
        }
        String strConcat = TextUtils.isEmpty(str4) ? "" : "\n".concat(String.valueOf(str4));
        synchronized (this.zza) {
            zzbqg zzbqgVar = (zzbqg) this.zzb.remove(str);
            if (zzbqgVar == null) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 50);
                sb2.append("Received result for unexpected method invocation: ");
                sb2.append(str);
                String string = sb2.toString();
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi(string);
                return;
            }
            if (!TextUtils.isEmpty(str2)) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + strConcat.length());
                sb3.append(str3);
                sb3.append(strConcat);
                zzbqgVar.zzb(sb3.toString());
                return;
            }
            if (str5 == null) {
                zzbqgVar.zza(null);
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(str5);
                if (com.google.android.gms.ads.internal.util.zze.zzc()) {
                    String string2 = jSONObject.toString(2);
                    StringBuilder sb4 = new StringBuilder(String.valueOf(string2).length() + 13);
                    sb4.append("Result GMSG: ");
                    sb4.append(string2);
                    com.google.android.gms.ads.internal.util.zze.zza(sb4.toString());
                }
                zzbqgVar.zza(jSONObject);
            } catch (JSONException e10) {
                zzbqgVar.zzb(e10.getMessage());
            }
        }
    }

    public final void zzb(String str, zzbqg zzbqgVar) {
        synchronized (this.zza) {
            this.zzb.put(str, zzbqgVar);
        }
    }

    public final ListenableFuture zzc(zzbsy zzbsyVar, String str, JSONObject jSONObject) {
        zzcfw zzcfwVar = new zzcfw();
        com.google.android.gms.ads.internal.zzt.zzc();
        String string = UUID.randomUUID().toString();
        zzb(string, new zzbqf(this, zzcfwVar));
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", string);
            jSONObject2.put("args", jSONObject);
            zzbsyVar.zzb(str, jSONObject2);
        } catch (Exception e10) {
            zzcfwVar.zzd(e10);
        }
        return zzcfwVar;
    }
}
