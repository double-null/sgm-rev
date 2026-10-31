package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzafi {
    public static final zzafi zza = new zzafi(-3, -9223372036854775807L, -1);
    private final int zzb;
    private final long zzc;
    private final long zzd;

    private zzafi(int i10, long j10, long j11) {
        this.zzb = i10;
        this.zzc = j10;
        this.zzd = j11;
    }

    public static zzafi zza(long j10, long j11) {
        return new zzafi(-1, j10, j11);
    }

    public static zzafi zzb(long j10, long j11) {
        return new zzafi(-2, j10, j11);
    }

    public static zzafi zzc(long j10) {
        return new zzafi(0, -9223372036854775807L, j10);
    }

    final /* synthetic */ int zzd() {
        return this.zzb;
    }

    final /* synthetic */ long zze() {
        return this.zzc;
    }

    final /* synthetic */ long zzf() {
        return this.zzd;
    }
}
