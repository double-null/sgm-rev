package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzgqh {
    private final zzgfh zza;
    private final zzgcn zzb;

    zzgqh(zzgcn zzgcnVar, zzgfh zzgfhVar) {
        this.zza = zzgfhVar;
        this.zzb = zzgcnVar;
    }

    public final zzgqf zza(int i10) {
        return new zzgqf(i10, this.zzb, this.zza);
    }

    public final void zzb(int i10) {
        this.zza.zzb(i10 - 1, -1L, null, null);
    }

    public final void zzc(int i10, String str) {
        this.zza.zzb(i10 - 1, -1L, null, str);
    }

    public final void zzd(int i10, Throwable th) {
        this.zza.zzb(i10 - 1, -1L, th, null);
    }

    public final ListenableFuture zze(int i10, ListenableFuture listenableFuture) {
        zzgqf zzgqfVarZza = zza(i10);
        zzgqfVarZza.zza();
        zzhbw.zzr(listenableFuture, new zzgqg(this, zzgqfVarZza), zzhcn.zza());
        return listenableFuture;
    }

    public final void zzf(int i10, Runnable runnable) {
        zzgqf zzgqfVarZza = zza(i10);
        try {
            zzgqfVarZza.zza();
            runnable.run();
            zzgqfVarZza.zzc();
        } catch (Throwable th) {
            try {
                zzgqfVarZza.zzb(th);
                throw th;
            } catch (Throwable th2) {
                zzgqfVarZza.zzc();
                throw th2;
            }
        }
    }
}
