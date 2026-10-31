package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzafe implements zzahb {
    private final zzafh zza;
    private final long zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;
    private final long zzf;

    public zzafe(zzafh zzafhVar, long j10, long j11, long j12, long j13, long j14, long j15) {
        this.zza = zzafhVar;
        this.zzb = j10;
        this.zzc = j12;
        this.zzd = j13;
        this.zze = j14;
        this.zzf = j15;
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final long zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final zzagz zzc(long j10) {
        zzahc zzahcVar = new zzahc(j10, zzafg.zza(this.zza.zza(j10), 0L, this.zzc, this.zzd, this.zze, this.zzf));
        return new zzagz(zzahcVar, zzahcVar);
    }

    public final long zzd(long j10) {
        return this.zza.zza(j10);
    }

    final /* synthetic */ long zze() {
        return this.zzc;
    }

    final /* synthetic */ long zzf() {
        return this.zzd;
    }

    final /* synthetic */ long zzg() {
        return this.zze;
    }

    final /* synthetic */ long zzh() {
        return this.zzf;
    }
}
