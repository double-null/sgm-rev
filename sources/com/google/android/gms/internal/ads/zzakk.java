package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzakk extends zzafo implements zzakt {
    private final long zza;
    private final int zzb;
    private final int zzc;
    private final long zzd;

    public zzakk(long j10, long j11, int i10, int i11, boolean z10) {
        this(j10, j11, i10, i11, false, true);
    }

    @Override // com.google.android.gms.internal.ads.zzakt
    public final long zzf(long j10) {
        return zze(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzakt
    public final long zzg() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzakt
    public final int zzh() {
        return this.zzb;
    }

    public final zzakk zzi(long j10) {
        return new zzakk(j10, this.zza, this.zzb, this.zzc, false, false);
    }

    private zzakk(long j10, long j11, int i10, int i11, boolean z10, boolean z11) {
        super(j10, j11, i10, i11, false, z11);
        this.zza = j11;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = j10 != -1 ? j10 : -1L;
    }

    public zzakk(long j10, long j11, zzagv zzagvVar, boolean z10) {
        this(j10, j11, zzagvVar.zzf, zzagvVar.zzc, false, true);
    }
}
