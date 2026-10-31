package com.google.android.gms.internal.ads;

import io.bidmachine.iab.vast.activity.IIj.KBBdKxoAiHo;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzbfi implements Runnable {
    final /* synthetic */ zzbfj zza;

    zzbfi(zzbfj zzbfjVar) {
        Objects.requireNonNull(zzbfjVar);
        this.zza = zzbfjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbfj zzbfjVar = this.zza;
        synchronized (zzbfjVar.zzf()) {
            if (zzbfjVar.zzg().get() && zzbfjVar.zzh()) {
                zzbfjVar.zzg().set(false);
                String str = KBBdKxoAiHo.BcexhgykTtJcAn;
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd(str);
                Iterator it = zzbfjVar.zzi().iterator();
                while (it.hasNext()) {
                    try {
                        ((zzbfk) it.next()).zza(false);
                    } catch (Exception e10) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("", e10);
                    }
                }
            } else {
                int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("App is still foreground");
            }
        }
    }
}
