package com.google.android.gms.tasks;

import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.4.1 */
/* JADX INFO: loaded from: classes3.dex */
final class zze implements Runnable {
    final /* synthetic */ Task zza;
    final /* synthetic */ zzf zzb;

    zze(zzf zzfVar, Task task) {
        this.zza = task;
        Objects.requireNonNull(zzfVar);
        this.zzb = zzfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Task task = (Task) this.zzb.zzc().then(this.zza);
            if (task == null) {
                this.zzb.onFailure(new NullPointerException("Continuation returned null"));
                return;
            }
            zzf zzfVar = this.zzb;
            Executor executor = TaskExecutors.zza;
            task.addOnSuccessListener(executor, zzfVar);
            task.addOnFailureListener(executor, zzfVar);
            task.addOnCanceledListener(executor, zzfVar);
        } catch (RuntimeExecutionException e10) {
            if (!(e10.getCause() instanceof Exception)) {
                this.zzb.zzd().zzc(e10);
                return;
            }
            zzf zzfVar2 = this.zzb;
            zzfVar2.zzd().zzc((Exception) e10.getCause());
        } catch (Exception e11) {
            this.zzb.zzd().zzc(e11);
        }
    }
}
