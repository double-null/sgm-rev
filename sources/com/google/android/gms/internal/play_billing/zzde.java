package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzde implements Runnable {
    final zzdk zza;
    final zzdd zzb;

    zzde(zzdk zzdkVar, zzdd zzddVar) {
        this.zza = zzdkVar;
        this.zzb = zzddVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Throwable thZza;
        zzdk zzdkVar = this.zza;
        if ((zzdkVar instanceof zzdq) && (thZza = zzdr.zza((zzdq) zzdkVar)) != null) {
            this.zzb.zza(thZza);
            return;
        }
        try {
            boolean zIsDone = zzdkVar.isDone();
            boolean z10 = false;
            Future future = zzdkVar;
            if (!zIsDone) {
                throw new IllegalStateException(zzbo.zzb("Future was expected to be done: %s", zzdkVar));
            }
            while (true) {
                try {
                    obj = future.get();
                    break;
                } catch (InterruptedException unused) {
                    z10 = true;
                    future = future;
                } catch (Throwable th) {
                    if (z10) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
            this.zzb.zzb(obj);
        } catch (ExecutionException e10) {
            this.zzb.zza(e10.getCause());
        } catch (Throwable th2) {
            this.zzb.zza(th2);
        }
    }

    public final String toString() {
        zzbh zzbhVarZza = zzbj.zza(this);
        zzbhVarZza.zza(this.zzb);
        return zzbhVarZza.toString();
    }
}
