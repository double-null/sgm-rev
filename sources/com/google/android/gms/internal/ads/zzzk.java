package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzzk implements zzxi, zzxh {
    private final zzxi zza;
    private final long zzb;
    private zzxh zzc;

    public zzzk(zzxi zzxiVar, long j10) {
        this.zza = zzxiVar;
        this.zzb = j10;
    }

    public final zzxi zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    public final void zzb(zzxh zzxhVar, long j10) {
        this.zzc = zzxhVar;
        this.zza.zzb(this, j10 - this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    public final void zzc() throws IOException {
        this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    public final zzzn zzd() {
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    public final long zze(zzaba[] zzabaVarArr, boolean[] zArr, zzzc[] zzzcVarArr, boolean[] zArr2, long j10) {
        zzzc[] zzzcVarArr2 = new zzzc[zzzcVarArr.length];
        int i10 = 0;
        while (true) {
            zzzc zzzcVarZza = null;
            if (i10 >= zzzcVarArr.length) {
                break;
            }
            zzzj zzzjVar = (zzzj) zzzcVarArr[i10];
            if (zzzjVar != null) {
                zzzcVarZza = zzzjVar.zza();
            }
            zzzcVarArr2[i10] = zzzcVarZza;
            i10++;
        }
        zzxi zzxiVar = this.zza;
        long j11 = this.zzb;
        long jZze = zzxiVar.zze(zzabaVarArr, zArr, zzzcVarArr2, zArr2, j10 - j11);
        for (int i11 = 0; i11 < zzzcVarArr.length; i11++) {
            zzzc zzzcVar = zzzcVarArr2[i11];
            if (zzzcVar == null) {
                zzzcVarArr[i11] = null;
            } else {
                zzzc zzzcVar2 = zzzcVarArr[i11];
                if (zzzcVar2 == null || ((zzzj) zzzcVar2).zza() != zzzcVar) {
                    zzzcVarArr[i11] = new zzzj(zzzcVar, j11);
                }
            }
        }
        return jZze + j11;
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    public final void zzf(long j10, boolean z10) {
        this.zza.zzf(j10 - this.zzb, false);
    }

    @Override // com.google.android.gms.internal.ads.zzxi, com.google.android.gms.internal.ads.zzze
    public final void zzg(long j10) {
        this.zza.zzg(j10 - this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    public final long zzh() {
        long jZzh = this.zza.zzh();
        if (jZzh == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return jZzh + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzxi, com.google.android.gms.internal.ads.zzze
    public final long zzi() {
        long jZzi = this.zza.zzi();
        if (jZzi == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jZzi + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    public final long zzj(long j10) {
        long j11 = this.zzb;
        return this.zza.zzj(j10 - j11) + j11;
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    public final long zzk(long j10, zzni zzniVar) {
        long j11 = this.zzb;
        return this.zza.zzk(j10 - j11, zzniVar) + j11;
    }

    @Override // com.google.android.gms.internal.ads.zzxi, com.google.android.gms.internal.ads.zzze
    public final long zzl() {
        long jZzl = this.zza.zzl();
        if (jZzl == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jZzl + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzxi, com.google.android.gms.internal.ads.zzze
    public final boolean zzm(zzma zzmaVar) {
        long j10 = zzmaVar.zza;
        long j11 = this.zzb;
        zzlz zzlzVarZza = zzmaVar.zza();
        zzlzVarZza.zza(j10 - j11);
        return this.zza.zzm(zzlzVarZza.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzxi, com.google.android.gms.internal.ads.zzze
    public final boolean zzn() {
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzxh
    public final void zzp(zzxi zzxiVar) {
        zzxh zzxhVar = this.zzc;
        zzxhVar.getClass();
        zzxhVar.zzp(this);
    }

    @Override // com.google.android.gms.internal.ads.zzzd
    public final /* bridge */ /* synthetic */ void zzs(zzze zzzeVar) {
        zzxh zzxhVar = this.zzc;
        zzxhVar.getClass();
        zzxhVar.zzs(this);
    }
}
