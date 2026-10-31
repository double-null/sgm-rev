package com.google.android.gms.internal.ads;

import android.content.Context;
import io.bidmachine.iab.vast.activity.IIj.KBBdKxoAiHo;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzcsz implements zzddm {
    private final zzflw zza;

    public zzcsz(zzflw zzflwVar) {
        this.zza = zzflwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzddm
    public final void zza(Context context) {
        try {
            this.zza.zzi();
        } catch (zzflf e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Cannot invoke onPause for the mediation adapter.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddm
    public final void zzc(Context context) {
        try {
            this.zza.zzf();
        } catch (zzflf e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Cannot invoke onDestroy for the mediation adapter.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddm
    public final void zzb(Context context) {
        try {
            zzflw zzflwVar = this.zza;
            zzflwVar.zzj();
            if (context != null) {
                zzflwVar.zzp(context);
            }
        } catch (zzflf e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj(KBBdKxoAiHo.TtUKK, e10);
        }
    }
}
