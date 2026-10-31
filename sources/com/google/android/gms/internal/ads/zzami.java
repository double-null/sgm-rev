package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzami {
    public final int zza;
    public final int zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final long zzf;
    public final zzv zzg;
    public final int zzh;
    public final long[] zzi;
    public final long[] zzj;
    public final int zzk;
    private final zzamj[] zzl;

    public zzami(int i10, int i11, long j10, long j11, long j12, long j13, zzv zzvVar, int i12, zzamj[] zzamjVarArr, int i13, long[] jArr, long[] jArr2) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = j10;
        this.zzd = j11;
        this.zze = j12;
        this.zzf = j13;
        this.zzg = zzvVar;
        this.zzh = i12;
        this.zzl = zzamjVarArr;
        this.zzk = i13;
        this.zzi = jArr;
        this.zzj = jArr2;
    }

    public final zzamj zza(int i10) {
        return this.zzl[i10];
    }

    public final zzami zzb(zzv zzvVar) {
        return new zzami(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, zzvVar, this.zzh, this.zzl, this.zzk, this.zzi, this.zzj);
    }
}
