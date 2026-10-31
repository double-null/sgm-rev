package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.MobileAds;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzelq {
    private final Context zza;

    zzelq(Context context) {
        this.zza = context;
    }

    public final ListenableFuture zza(boolean z10) {
        try {
            androidx.privacysandbox.ads.adservices.topics.b bVarA = new androidx.privacysandbox.ads.adservices.topics.b.a().b(MobileAds.ERROR_DOMAIN).c(z10).a();
            r0.a aVarA = r0.a.a(this.zza);
            return aVarA != null ? aVarA.b(bVarA) : zzhbw.zzc(new IllegalStateException());
        } catch (Exception e10) {
            return zzhbw.zzc(e10);
        }
    }
}
