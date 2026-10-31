package com.google.android.gms.internal.ads;

import com.facebook.appevents.AppEventsConstants;
import com.facebook.internal.logging.dumpsys.Tj.ljglrLUdGZhMhQ;
import io.bidmachine.analytics.internal.s.bOI.CwEo;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzciv implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ long zzf;
    final /* synthetic */ long zzg;
    final /* synthetic */ boolean zzh;
    final /* synthetic */ int zzi;
    final /* synthetic */ int zzj;
    final /* synthetic */ zzcja zzk;

    zzciv(zzcja zzcjaVar, String str, String str2, long j10, long j11, long j12, long j13, long j14, boolean z10, int i10, int i11) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = j10;
        this.zzd = j11;
        this.zze = j12;
        this.zzf = j13;
        this.zzg = j14;
        this.zzh = z10;
        this.zzi = i10;
        this.zzj = i11;
        Objects.requireNonNull(zzcjaVar);
        this.zzk = zzcjaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put("event", "precacheProgress");
        map.put("src", this.zza);
        map.put("cachedSrc", this.zzb);
        map.put("bufferedDuration", Long.toString(this.zzc));
        map.put("totalDuration", Long.toString(this.zzd));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzcB)).booleanValue()) {
            map.put(CwEo.sbxTDAHBtgTI, Long.toString(this.zze));
            map.put("qoeCachedBytes", Long.toString(this.zzf));
            map.put("totalBytes", Long.toString(this.zzg));
            map.put("reportTime", Long.toString(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis()));
        }
        map.put("cacheReady", true != this.zzh ? ljglrLUdGZhMhQ.fEweScgP : AppEventsConstants.EVENT_PARAM_VALUE_YES);
        map.put("playerCount", Integer.toString(this.zzi));
        map.put("playerPreparedCount", Integer.toString(this.zzj));
        this.zzk.zzw("onPrecacheEvent", map);
    }
}
