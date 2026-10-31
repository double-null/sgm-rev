package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.provider.fH.UyXgnuLGEkgnZE;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzewy implements zzfck {
    private final AtomicReference zza = new AtomicReference();
    private final AtomicReference zzb = new AtomicReference(Boolean.FALSE);
    private final Clock zzc;
    private final Executor zzd;
    private final zzfck zze;
    private final long zzf;
    private final zzdzl zzg;

    public zzewy(zzfck zzfckVar, long j10, Clock clock, Executor executor, zzdzl zzdzlVar) {
        this.zzc = clock;
        this.zze = zzfckVar;
        this.zzf = j10;
        this.zzd = executor;
        this.zzg = zzdzlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final int zzb() {
        return this.zze.zzb();
    }

    final /* synthetic */ void zzc() {
        this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeww
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzd();
            }
        });
    }

    final /* synthetic */ void zzd() {
        this.zza.set(new zzewv(this.zze.zza(), this.zzf, this.zzc));
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final ListenableFuture zza() {
        zzewv zzewvVar;
        zzewv zzewvVar2;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zznl)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zznk)).booleanValue() && !((Boolean) this.zzb.getAndSet(Boolean.TRUE)).booleanValue()) {
                ScheduledExecutorService scheduledExecutorService = zzcfr.zzd;
                Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzewx
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzc();
                    }
                };
                long j10 = this.zzf;
                scheduledExecutorService.scheduleWithFixedDelay(runnable, j10, j10, TimeUnit.MILLISECONDS);
            }
            synchronized (this) {
                AtomicReference atomicReference = this.zza;
                zzewvVar = (zzewv) atomicReference.get();
                if (zzewvVar == null) {
                    zzewv zzewvVar3 = new zzewv(this.zze.zza(), this.zzf, this.zzc);
                    atomicReference.set(zzewvVar3);
                    return zzewvVar3.zza;
                }
                if (!((Boolean) this.zzb.get()).booleanValue() && zzewvVar.zza()) {
                    ListenableFuture listenableFuture = zzewvVar.zza;
                    zzfck zzfckVar = this.zze;
                    zzewvVar2 = new zzewv(zzfckVar.zza(), this.zzf, this.zzc);
                    this.zza.set(zzewvVar2);
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zznm)).booleanValue()) {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zznn)).booleanValue()) {
                            zzdzk zzdzkVarZza = this.zzg.zza();
                            zzdzkVarZza.zzc("action", UyXgnuLGEkgnZE.gpFLIR);
                            zzdzkVarZza.zzc("sid", String.valueOf(zzfckVar.zzb()));
                            zzdzkVarZza.zzd();
                        }
                        return listenableFuture;
                    }
                    zzewvVar = zzewvVar2;
                }
            }
        } else {
            AtomicReference atomicReference2 = this.zza;
            zzewvVar = (zzewv) atomicReference2.get();
            if (zzewvVar == null || zzewvVar.zza()) {
                zzfck zzfckVar2 = this.zze;
                zzewvVar2 = new zzewv(zzfckVar2.zza(), this.zzf, this.zzc);
                atomicReference2.set(zzewvVar2);
                zzewvVar = zzewvVar2;
            }
        }
        return zzewvVar.zza;
    }
}
