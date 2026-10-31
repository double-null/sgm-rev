package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzbd {
    final String zza;
    final String zzb;
    final long zzc;
    final long zzd;
    final long zze;
    final long zzf;
    final long zzg;
    final Long zzh;
    final Long zzi;
    final Long zzj;
    final Boolean zzk;

    zzbd(String str, String str2, long j10, long j11, long j12, long j13, long j14, Long l10, Long l11, Long l12, Boolean bool) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkArgument(j10 >= 0);
        Preconditions.checkArgument(j11 >= 0);
        Preconditions.checkArgument(j12 >= 0);
        Preconditions.checkArgument(j14 >= 0);
        this.zza = str;
        this.zzb = str2;
        this.zzc = j10;
        this.zzd = j11;
        this.zze = j12;
        this.zzf = j13;
        this.zzg = j14;
        this.zzh = l10;
        this.zzi = l11;
        this.zzj = l12;
        this.zzk = bool;
    }

    final zzbd zza(long j10) {
        return new zzbd(this.zza, this.zzb, this.zzc, this.zzd, this.zze, j10, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk);
    }

    final zzbd zzb(long j10, long j11) {
        return new zzbd(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, j10, Long.valueOf(j11), this.zzi, this.zzj, this.zzk);
    }

    final zzbd zzc(Long l10, Long l11, Boolean bool) {
        if (bool != null) {
            bool.booleanValue();
        }
        return new zzbd(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, l10, l11, bool);
    }
}
