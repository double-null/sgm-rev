package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzhcq implements Runnable {
    zzhcs zza;

    zzhcq(zzhcs zzhcsVar) {
        this.zza = zzhcsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture listenableFutureZzf;
        zzhcs zzhcsVar = this.zza;
        if (zzhcsVar == null || (listenableFutureZzf = zzhcsVar.zzf()) == null) {
            return;
        }
        this.zza = null;
        if (listenableFutureZzf.isDone()) {
            zzhcsVar.zzk(listenableFutureZzf);
            return;
        }
        try {
            ScheduledFuture scheduledFutureZzx = zzhcsVar.zzx();
            zzhcsVar.zzy(null);
            String string = "Timed out";
            if (scheduledFutureZzx != null) {
                try {
                    long jAbs = Math.abs(scheduledFutureZzx.getDelay(TimeUnit.MILLISECONDS));
                    if (jAbs > 10) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(jAbs).length() + 55);
                        sb2.append("Timed out");
                        sb2.append(" (timeout delayed by ");
                        sb2.append(jAbs);
                        sb2.append(" ms after scheduled time)");
                        string = sb2.toString();
                    }
                } catch (Throwable th) {
                    zzhcsVar.zzb(new zzhcr(string, null));
                    throw th;
                }
            }
            String string2 = listenableFutureZzf.toString();
            StringBuilder sb3 = new StringBuilder(string.length() + 2 + string2.length());
            sb3.append(string);
            sb3.append(": ");
            sb3.append(string2);
            zzhcsVar.zzb(new zzhcr(sb3.toString(), null));
            listenableFutureZzf.cancel(true);
        } catch (Throwable th2) {
            listenableFutureZzf.cancel(true);
            throw th2;
        }
    }
}
