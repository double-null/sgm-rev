package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzbtc implements Runnable {
    final /* synthetic */ zzbtt zza;
    final /* synthetic */ zzbsp zzb;
    final /* synthetic */ ArrayList zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ zzbtu zze;

    zzbtc(zzbtu zzbtuVar, zzbtt zzbttVar, zzbsp zzbspVar, ArrayList arrayList, long j10) {
        this.zza = zzbttVar;
        this.zzb = zzbspVar;
        this.zzc = arrayList;
        this.zzd = j10;
        Objects.requireNonNull(zzbtuVar);
        this.zze = zzbtuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String string;
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Trying to acquire lock");
        zzbtu zzbtuVar = this.zze;
        synchronized (zzbtuVar.zzg()) {
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock acquired");
            zzbtt zzbttVar = this.zza;
            if (zzbttVar.zzi() != -1 && zzbttVar.zzi() != 1) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zziF)).booleanValue()) {
                    zzbttVar.zzh(new TimeoutException("Unable to fully load JS engine."), "SdkJavascriptFactory.loadJavascriptEngine.Runnable");
                } else {
                    zzbttVar.zzg();
                }
                zzhcg zzhcgVar = zzcfr.zzf;
                final zzbsp zzbspVar = this.zzb;
                Objects.requireNonNull(zzbspVar);
                zzhcgVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbtb
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzbspVar.zzj();
                    }
                });
                String strValueOf = String.valueOf(com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zze));
                int iZzi = zzbttVar.zzi();
                int iZzk = zzbtuVar.zzk();
                ArrayList arrayList = this.zzc;
                if (arrayList.isEmpty()) {
                    string = ". Still waiting for the engine to be loaded";
                } else {
                    String strValueOf2 = String.valueOf(arrayList.get(0));
                    StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 88);
                    sb2.append(". While waiting for the /jsLoaded gmsg, observed the loadNewJavascriptEngine latency is ");
                    sb2.append(strValueOf2);
                    string = sb2.toString();
                }
                long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - this.zzd;
                StringBuilder sb3 = new StringBuilder(strValueOf.length() + 107 + String.valueOf(iZzi).length() + 36 + String.valueOf(iZzk).length() + string.length() + 39 + String.valueOf(jCurrentTimeMillis).length() + 26);
                sb3.append("Could not finish the full JS engine loading in ");
                sb3.append(strValueOf);
                sb3.append(" ms. JS engine session reference status(fullLoadTimeout) is ");
                sb3.append(iZzi);
                sb3.append(". Update status(fullLoadTimeout) is ");
                sb3.append(iZzk);
                sb3.append(string);
                sb3.append(" ms. Total latency(fullLoadTimeout) is ");
                sb3.append(jCurrentTimeMillis);
                sb3.append(" ms at timeout. Rejecting.");
                com.google.android.gms.ads.internal.util.zze.zza(sb3.toString());
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released");
                return;
            }
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released, the promise is already settled");
        }
    }
}
