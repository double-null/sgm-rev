package com.google.android.gms.internal.measurement;

import android.os.Process;
import android.util.Log;
import com.google.common.base.w;
import com.google.common.util.concurrent.f0;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzqi implements zzqm {
    private static boolean zza;
    private final w zzb;
    private final int zzc;
    private final w zzd;

    public zzqi(w wVar, int i10) {
        zzqh zzqhVar = zzqh.zza;
        this.zzb = wVar;
        this.zzc = Math.max(5, 10);
        this.zzd = zzqhVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzqm
    public final void zza() {
        synchronized (zzqi.class) {
            if (!zza) {
                Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.measurement.zzqg
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzb();
                    }
                };
                long j10 = this.zzc;
                TimeUnit timeUnit = TimeUnit.MINUTES;
                f0 f0Var = (f0) this.zzb.get();
                zzpx.zza(f0Var.schedule((Runnable) new zzqf(this, runnable, f0Var, j10, timeUnit), j10, timeUnit));
                zza = true;
            }
        }
    }

    final /* synthetic */ void zzb() {
        if (((Boolean) this.zzd.get()).booleanValue()) {
            Log.i("PhenotypeProcessReaper", "Killing process to refresh experiment configuration");
            Process.killProcess(Process.myPid());
            System.exit(0);
        }
    }
}
