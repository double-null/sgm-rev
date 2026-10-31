package com.google.android.gms.internal.ads;

import android.os.Bundle;
import kotlinx.coroutines.channels.eY.oqHAiWkeGzWld;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzewq implements zzfci {
    private final double zza;
    private final boolean zzb;

    public zzewq(double d10, boolean z10) {
        this.zza = d10;
        this.zzb = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzfci
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        String str = oqHAiWkeGzWld.fpT;
        Bundle bundleZza = zzfln.zza(bundle, str);
        bundle.putBundle(str, bundleZza);
        Bundle bundleZza2 = zzfln.zza(bundleZza, "battery");
        bundleZza.putBundle("battery", bundleZza2);
        bundleZza2.putBoolean("is_charging", this.zzb);
        bundleZza2.putDouble("battery_level", this.zza);
    }
}
