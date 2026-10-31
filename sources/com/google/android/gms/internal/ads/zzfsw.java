package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import java.util.Random;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzfsw {
    private final long zza;
    private final long zzb;
    private final Clock zzf;
    private long zzg;
    private long zzd = 5;
    private long zze = 0;
    private final Random zzh = new Random();
    private long zzc = 0;

    public zzfsw(long j10, double d10, long j11, double d11, Clock clock) {
        this.zza = j10;
        this.zzb = j11;
        this.zzf = clock;
        zza();
    }

    public final synchronized void zza() {
        this.zzg = this.zza;
        this.zzc = 0L;
        this.zze = 0L;
    }

    public final synchronized long zzb() {
        long j10;
        long j11;
        double d10 = this.zzg;
        double d11 = 0.2d * d10;
        j10 = (long) (d10 + d11);
        j11 = (long) (d10 - d11);
        return j11 + ((long) (this.zzh.nextDouble() * ((j10 - j11) + 1)));
    }

    public final synchronized void zzc() {
        this.zze = this.zzf.currentTimeMillis() + zzb();
        double d10 = this.zzg;
        this.zzg = Math.min((long) (d10 + d10), this.zzb);
        this.zzc++;
    }

    public final synchronized boolean zzd() {
        return this.zzf.currentTimeMillis() < this.zze;
    }

    public final synchronized boolean zze() {
        zzbih zzbihVar = zzbiq.zzI;
        if (((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar)).intValue() < 0) {
            return false;
        }
        return this.zzc > Math.max(this.zzd, (long) ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar)).intValue()) && this.zzg >= this.zzb;
    }

    public final synchronized void zzf(int i10) {
        Preconditions.checkArgument(i10 > 0);
        this.zzd = i10;
    }
}
