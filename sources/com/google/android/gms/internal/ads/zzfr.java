package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzfr {
    private final zzfq zza;
    private final zzdz zzb;
    private final zzdz zzc;
    private boolean zzd;
    private boolean zze;

    public zzfr(Context context, Looper looper, zzdo zzdoVar) {
        this.zza = new zzfq(context.getApplicationContext());
        this.zzb = zzdoVar.zzd(looper, null);
        this.zzc = zzdoVar.zzd(Looper.getMainLooper(), null);
    }

    private final void zzg(final boolean z10, final boolean z11) {
        if (zzh(z10, z11)) {
            this.zzb.zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfn
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zze(z10, z11);
                }
            });
            return;
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        this.zzc.zzn(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfo
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzc(atomicBoolean);
            }
        }, 1000L);
        this.zzb.zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfm
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzd(atomicBoolean, z10, z11);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzh(boolean z10, boolean z11) {
        return z10 && z11;
    }

    public final void zza(boolean z10) {
        if (this.zzd == z10) {
            return;
        }
        this.zzd = z10;
        zzg(z10, this.zze);
    }

    public final void zzb(boolean z10) {
        if (this.zze == z10) {
            return;
        }
        this.zze = z10;
        if (this.zzd) {
            zzg(true, z10);
        }
    }

    final /* synthetic */ void zzc(final AtomicBoolean atomicBoolean) {
        if (atomicBoolean.get()) {
            final zzfq zzfqVar = this.zza;
            new Thread(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfp
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzfqVar.zza(atomicBoolean);
                }
            }, "ExoPlayer:WakeLockManager").start();
        }
    }

    final /* synthetic */ void zzd(AtomicBoolean atomicBoolean, boolean z10, boolean z11) {
        atomicBoolean.set(false);
        this.zza.zzb(z10, z11);
    }

    final /* synthetic */ void zze(boolean z10, boolean z11) {
        this.zza.zzb(z10, z11);
    }
}
