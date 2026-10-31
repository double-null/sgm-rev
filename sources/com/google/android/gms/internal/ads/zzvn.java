package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.os.Build;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzvn {
    /* JADX WARN: Code duplicated, block: B:13:0x0027  */
    public static int zza(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        List supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
        if (supportedPerformancePoints == null || supportedPerformancePoints.isEmpty()) {
            return 0;
        }
        int iZzc = zzc(supportedPerformancePoints, new MediaCodecInfo.VideoCapabilities.PerformancePoint(i10, i11, (int) d10));
        boolean z10 = true;
        if (iZzc == 1 && zzvo.zza == null) {
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 37) {
                z10 = false;
            } else {
                int iZzb = zzb(true);
                if (i12 < 35 ? !(zzb(false) != 2 || iZzb == 1) : iZzb != 1) {
                    z10 = false;
                }
            }
            zzvo.zza = Boolean.valueOf(z10);
            if (zzvo.zza.booleanValue()) {
                return 0;
            }
        }
        return iZzc;
    }

    private static int zzb(boolean z10) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        List supportedPerformancePoints;
        try {
            zzt zztVar = new zzt();
            zztVar.zzo("video/avc");
            zzv zzvVarZzO = zztVar.zzO();
            if (zzvVarZzO.zzp != null) {
                List listZzc = zzwf.zzc(zzvv.zzb, zzvVarZzO, z10, false);
                for (int i10 = 0; i10 < listZzc.size(); i10++) {
                    if (((zzvm) listZzc.get(i10)).zzd != null && (videoCapabilities = ((zzvm) listZzc.get(i10)).zzd.getVideoCapabilities()) != null && (supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                        return zzc(supportedPerformancePoints, new MediaCodecInfo.VideoCapabilities.PerformancePoint(1280, 720, 60));
                    }
                }
            }
        } catch (zzvx unused) {
        }
        return 0;
    }

    private static int zzc(List list, MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (((MediaCodecInfo.VideoCapabilities.PerformancePoint) list.get(i10)).covers(performancePoint)) {
                return 2;
            }
        }
        return 1;
    }
}
