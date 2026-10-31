package com.google.android.gms.internal.ads;

import android.util.Log;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzimh extends zzimm {
    final String zza;

    public zzimh(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzimm
    public final void zza(String str) {
        String str2 = this.zza;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(str).length());
        sb2.append(str2);
        sb2.append(":");
        sb2.append(str);
        Log.d("isoparser", sb2.toString());
    }
}
