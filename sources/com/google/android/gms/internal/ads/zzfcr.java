package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.facebook.internal.logging.dumpsys.Tj.ljglrLUdGZhMhQ;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzfcr implements zzfci {
    private final int zza;
    private final int zzb;

    zzfcr(int i10, int i11) {
        this.zza = i10;
        this.zzb = i11;
    }

    @Override // com.google.android.gms.internal.ads.zzfci
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        int i10;
        int i11 = this.zza;
        Bundle bundle = (Bundle) obj;
        if (i11 == -1 || (i10 = this.zzb) == -1) {
            return;
        }
        bundle.putInt(ljglrLUdGZhMhQ.oKaZeeGCyopHVm, i11);
        bundle.putInt("crashes_without_flags", i10);
        int i12 = com.google.android.gms.ads.internal.client.zzay.zza;
        if (com.google.android.gms.ads.internal.client.zzba.zzc().zzc()) {
            bundle.putBoolean("did_reset", true);
        }
    }
}
