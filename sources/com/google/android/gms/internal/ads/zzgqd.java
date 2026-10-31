package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import android.view.View;
import b2.Bo.yeILL;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzgqd implements zzgpe, zzgfd {
    static final String[] zza = {"android:establish_vpn_service", "android:establish_vpn_manager"};
    private final Context zzb;
    private final ExecutorService zzc;
    private final String[] zzd;
    private long zze = 0;
    private long zzf = 0;
    private long zzg = -1;
    private boolean zzh = false;

    zzgqd(Context context, zzgcn zzgcnVar, ExecutorService executorService, String[] strArr) {
        this.zzb = context;
        this.zzc = executorService;
        this.zzd = strArr;
    }

    @Override // com.google.android.gms.internal.ads.zzgfd
    public final ListenableFuture zza() {
        return Build.VERSION.SDK_INT < 30 ? zzhbw.zzb() : zzhbw.zze(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgqc
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzf();
            }
        }, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzgpe
    public final void zzc(Map map, Context context, View view) {
        zze();
    }

    @Override // com.google.android.gms.internal.ads.zzgpe
    public final void zzd(Map map) {
        zze();
    }

    final void zze() {
        synchronized (this) {
            if (this.zzh) {
                this.zzf = System.currentTimeMillis();
            }
        }
    }

    final /* synthetic */ void zzf() {
        zzgqb zzgqbVar = new zzgqb(this);
        try {
            Object systemService = this.zzb.getSystemService("appops");
            systemService.getClass();
            ((AppOpsManager) systemService).startWatchingActive(this.zzd, this.zzc, zzgqbVar);
        } catch (Throwable unused) {
        }
    }

    final /* synthetic */ void zzg(long j10) {
        this.zze = j10;
    }

    final /* synthetic */ long zzh() {
        return this.zzf;
    }

    final /* synthetic */ void zzi(long j10) {
        this.zzg = j10;
    }

    final /* synthetic */ void zzj(boolean z10) {
        this.zzh = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzgpe
    public final void zzb(Map map) {
        long j10;
        long j11;
        zze();
        synchronized (this) {
            if (this.zzh) {
                j10 = this.zzf - this.zze;
            } else {
                j10 = -1;
            }
        }
        map.put("vs", Long.valueOf(j10));
        synchronized (this) {
            j11 = this.zzg;
            this.zzg = -1L;
        }
        map.put(yeILL.BHyq, Long.valueOf(j11));
    }
}
