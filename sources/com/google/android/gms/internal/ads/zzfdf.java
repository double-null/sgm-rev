package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzfdf implements zzfci {
    final String zza;
    final int zzb;

    /* synthetic */ zzfdf(String str, int i10, byte[] bArr) {
        this.zza = str;
        this.zzb = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzfci
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzlP)).booleanValue()) {
            String str = this.zza;
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("topics", str);
            }
            int i10 = this.zzb;
            if (i10 != -1) {
                bundle.putInt("atps", i10);
            }
        }
    }
}
