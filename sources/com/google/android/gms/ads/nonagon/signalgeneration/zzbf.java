package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.zzbka;
import com.google.android.gms.internal.ads.zzbkv;
import java.util.Locale;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzbf extends QueryInfoGenerationCallback {
    final /* synthetic */ String zza;
    final /* synthetic */ TaggingLibraryJsInterface zzb;

    zzbf(TaggingLibraryJsInterface taggingLibraryJsInterface, String str) {
        this.zza = str;
        Objects.requireNonNull(taggingLibraryJsInterface);
        this.zzb = taggingLibraryJsInterface;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onFailure(String str) {
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to generate query info for the tagging library, error: ".concat(String.valueOf(str)));
        String strConcat = ((Boolean) zzbkv.zzc.zze()).booleanValue() ? ",\"as\":".concat(this.zzb.zze().zzb().toString()) : "";
        String str2 = this.zza;
        Locale locale = Locale.getDefault();
        Object[] objArr = new Object[4];
        objArr[0] = str2;
        objArr[1] = str;
        zzbka zzbkaVar = zzbkv.zze;
        objArr[2] = Long.valueOf(((Boolean) zzbkaVar.zze()).booleanValue() ? ((Long) zzbkv.zzh.zze()).longValue() : 0L);
        objArr[3] = strConcat;
        final String str3 = String.format(locale, "window.postMessage({\"paw_id\":\"%1$s\",\"error\":\"%2$s\",\"sdk_ttl_ms\":%3$d%4$s}, '*');", objArr);
        if (((Boolean) zzbkaVar.zze()).booleanValue()) {
            try {
                this.zzb.zzd().execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbd
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzb.zzc().evaluateJavascript(str3, null);
                    }
                });
            } catch (RuntimeException e10) {
                com.google.android.gms.ads.internal.zzt.zzh().zzh(e10, "TaggingLibraryJsInterface.getQueryInfo.onFailure");
            }
        } else {
            this.zzb.zzc().evaluateJavascript(str3, null);
        }
        if (((Boolean) zzbkv.zzc.zze()).booleanValue() && ((Boolean) zzbkv.zzd.zze()).booleanValue()) {
            this.zzb.zzf().zzb();
        }
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onSuccess(QueryInfo queryInfo) {
        final String str;
        String query = queryInfo.getQuery();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("paw_id", this.zza);
            if (((Boolean) zzbkv.zzc.zze()).booleanValue()) {
                jSONObject.put("as", this.zzb.zze().zzb());
            }
            jSONObject.put("sdk_ttl_ms", ((Boolean) zzbkv.zze.zze()).booleanValue() ? ((Long) zzbkv.zzh.zze()).longValue() : 0L);
            jSONObject.put("signal", query);
            str = String.format(Locale.getDefault(), "window.postMessage(%1$s, '*');", jSONObject);
        } catch (JSONException unused) {
            String strConcat = ((Boolean) zzbkv.zzc.zze()).booleanValue() ? ",\"as\":".concat(this.zzb.zze().zzb().toString()) : "";
            String str2 = this.zza;
            Locale locale = Locale.getDefault();
            Object[] objArr = new Object[4];
            objArr[0] = str2;
            objArr[1] = queryInfo.getQuery();
            objArr[2] = Long.valueOf(((Boolean) zzbkv.zze.zze()).booleanValue() ? ((Long) zzbkv.zzh.zze()).longValue() : 0L);
            objArr[3] = strConcat;
            str = String.format(locale, "window.postMessage({\"paw_id\":\"%1$s\",\"signal\":\"%2$s\",\"sdk_ttl_ms\":%3$d%4$s}, '*');", objArr);
        }
        if (((Boolean) zzbkv.zze.zze()).booleanValue()) {
            try {
                this.zzb.zzd().execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbe
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzb.zzc().evaluateJavascript(str, null);
                    }
                });
            } catch (RuntimeException e10) {
                com.google.android.gms.ads.internal.zzt.zzh().zzh(e10, "TaggingLibraryJsInterface.getQueryInfo.onSuccess");
            }
        } else {
            this.zzb.zzc().evaluateJavascript(str, null);
        }
        if (((Boolean) zzbkv.zzc.zze()).booleanValue() && ((Boolean) zzbkv.zzd.zze()).booleanValue()) {
            this.zzb.zzf().zzb();
        }
    }
}
