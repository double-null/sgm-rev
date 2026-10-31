package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzalu {
    public static String zza(List list) {
        Iterator it = list.iterator();
        String str = null;
        boolean z10 = false;
        while (it.hasNext()) {
            String str2 = ((zzaml) it.next()).zza.zzg.zzp;
            if (zzas.zzb(str2)) {
                return "video/mp4";
            }
            if (zzas.zza(str2)) {
                z10 = true;
            } else if (zzas.zzc(str2)) {
                if (Objects.equals(str2, "image/heic")) {
                    str = "image/heif";
                } else if (Objects.equals(str2, "image/avif")) {
                    str = "image/avif";
                }
            }
        }
        if (z10) {
            return "audio/mp4";
        }
        return str != null ? str : "application/mp4";
    }
}
