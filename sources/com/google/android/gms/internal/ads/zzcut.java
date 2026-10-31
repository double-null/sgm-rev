package com.google.android.gms.internal.ads;

import com.applovin.impl.communicator.ZREl.sRGQSqxgxlS;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzcut {
    private final zzdzl zza;
    private final zzfkq zzb;

    zzcut(zzdzl zzdzlVar, zzfkq zzfkqVar) {
        this.zza = zzdzlVar;
        this.zzb = zzfkqVar;
    }

    public final void zza(long j10, int i10) {
        String str;
        zzdzk zzdzkVarZza = this.zza.zza();
        zzdzkVarZza.zza(this.zzb.zzb.zzb);
        zzdzkVarZza.zzc("action", "ad_closed");
        zzdzkVarZza.zzc("show_time", String.valueOf(j10));
        zzdzkVarZza.zzc("ad_format", "app_open_ad");
        int i11 = i10 - 1;
        if (i11 == 0) {
            str = "h";
        } else if (i11 == 1) {
            str = "bb";
        } else if (i11 == 2) {
            str = "cc";
        } else if (i11 != 3) {
            str = i11 != 4 ? "u" : "ac";
        } else {
            str = sRGQSqxgxlS.JRlRSDFWIFg;
        }
        zzdzkVarZza.zzc("acr", str);
        zzdzkVarZza.zzd();
    }
}
