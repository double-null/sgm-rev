package com.google.android.gms.internal.ads;

import com.facebook.internal.logging.dumpsys.Tj.ljglrLUdGZhMhQ;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzebm implements zzhbt {
    final /* synthetic */ zzebw zza;

    zzebm(zzebw zzebwVar) {
        Objects.requireNonNull(zzebwVar);
        this.zza = zzebwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zza(Throwable th) {
        synchronized (this) {
            zzebw zzebwVar = this.zza;
            zzebwVar.zzn(true);
            zzebwVar.zzm("com.google.android.gms.ads.MobileAds", false, ljglrLUdGZhMhQ.ezjsQiwC, (int) (com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - zzebwVar.zzo()));
            zzebwVar.zzp().zzd(new Exception());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        final String str = (String) obj;
        synchronized (this) {
            zzebw zzebwVar = this.zza;
            zzebwVar.zzn(true);
            zzebwVar.zzm("com.google.android.gms.ads.MobileAds", true, "", (int) (com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - zzebwVar.zzo()));
            zzebwVar.zzq().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzebl
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zza.zzl(str);
                }
            });
        }
    }
}
