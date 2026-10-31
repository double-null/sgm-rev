package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.facebook.appevents.AppEventsConstants;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzcip implements zzbpq {
    @Override // com.google.android.gms.internal.ads.zzbpq
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzchn zzchnVar = (zzchn) obj;
        zzcma zzcmaVarZzh = zzchnVar.zzh();
        if (zzcmaVarZzh == null) {
            try {
                zzcma zzcmaVar = new zzcma(zzchnVar, Float.parseFloat((String) map.get("duration")), AppEventsConstants.EVENT_PARAM_VALUE_YES.equals(map.get("customControlsAllowed")), AppEventsConstants.EVENT_PARAM_VALUE_YES.equals(map.get("clickToExpandAllowed")));
                zzchnVar.zzw(zzcmaVar);
                zzcmaVarZzh = zzcmaVar;
            } catch (NullPointerException e10) {
                e = e10;
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to parse videoMeta message.", e);
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            } catch (NumberFormatException e11) {
                e = e11;
                int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to parse videoMeta message.", e);
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            }
        }
        float f10 = Float.parseFloat((String) map.get("duration"));
        boolean zEquals = AppEventsConstants.EVENT_PARAM_VALUE_YES.equals(map.get("muted"));
        float f11 = Float.parseFloat((String) map.get("currentTime"));
        int i12 = Integer.parseInt((String) map.get("playbackState"));
        int i13 = 0;
        if (i12 >= 0 && i12 <= 3) {
            i13 = i12;
        }
        String str = (String) map.get("aspectRatio");
        float f12 = TextUtils.isEmpty(str) ? 0.0f : Float.parseFloat(str);
        if (com.google.android.gms.ads.internal.util.client.zzo.zzm(3)) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(f11).length() + 45 + String.valueOf(f10).length() + 13 + String.valueOf(zEquals).length() + 19 + String.valueOf(i13).length() + 17 + String.valueOf(str).length());
            sb2.append("Video Meta GMSG: currentTime : ");
            sb2.append(f11);
            sb2.append(" , duration : ");
            sb2.append(f10);
            sb2.append(" , isMuted : ");
            sb2.append(zEquals);
            sb2.append(" , playbackState : ");
            sb2.append(i13);
            sb2.append(" , aspectRatio : ");
            sb2.append(str);
            com.google.android.gms.ads.internal.util.client.zzo.zzd(sb2.toString());
        }
        zzcmaVarZzh.zzs(f11, f10, i13, zEquals, f12);
    }
}
