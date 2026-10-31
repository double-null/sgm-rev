package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzbhv;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzat {
    private final String zza;

    public final Set zza() {
        HashSet hashSet = new HashSet();
        hashSet.add(this.zza.toLowerCase(Locale.ROOT));
        return hashSet;
    }

    public final String zzb() {
        return this.zza.toLowerCase(Locale.ROOT);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:17:0x0035  */
    public final zzbhv.zza.EnumC0133zza zzc() {
        byte b10;
        switch (this.zza) {
            case "NATIVE":
                b10 = 2;
                break;
            case "INTERSTITIAL":
                b10 = 1;
                break;
            case "REWARDED":
                b10 = 3;
                break;
            case "BANNER":
                b10 = 0;
                break;
            default:
                b10 = -1;
                break;
        }
        if (b10 == 0) {
            return zzbhv.zza.EnumC0133zza.BANNER;
        }
        if (b10 == 1) {
            return zzbhv.zza.EnumC0133zza.INTERSTITIAL;
        }
        if (b10 != 2) {
            return b10 != 3 ? zzbhv.zza.EnumC0133zza.AD_INITIATER_UNSPECIFIED : zzbhv.zza.EnumC0133zza.REWARD_BASED_VIDEO_AD;
        }
        return zzbhv.zza.EnumC0133zza.AD_LOADER;
    }
}
