package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzxc implements zzxi, zzxh {
    public final zzxk zza;
    private final long zzb;
    private final zzabl zzc;
    private zzxm zzd;
    private zzxi zze;
    private zzxh zzf;
    private long zzg = -9223372036854775807L;

    public zzxc(zzxk zzxkVar, zzabl zzablVar, long j10) {
        this.zza = zzxkVar;
        this.zzc = zzablVar;
        this.zzb = j10;
    }

    private final long zzv(long j10) {
        long j11 = this.zzg;
        return j11 != -9223372036854775807L ? j11 : j10;
    }

    public final long zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    public final void zzb(zzxh zzxhVar, long j10) {
        this.zzf = zzxhVar;
        zzxi zzxiVar = this.zze;
        if (zzxiVar != null) {
            zzxiVar.zzb(this, zzv(this.zzb));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    public final void zzc() throws IOException {
        try {
            zzxi zzxiVar = this.zze;
            if (zzxiVar != null) {
                zzxiVar.zzc();
                return;
            }
            zzxm zzxmVar = this.zzd;
            if (zzxmVar != null) {
                zzxmVar.zzt();
            }
        } catch (IOException e10) {
            throw e10;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    public final zzzn zzd() {
        zzxi zzxiVar = this.zze;
        String str = zzfl.zza;
        return zzxiVar.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    public final long zze(zzaba[] zzabaVarArr, boolean[] zArr, zzzc[] zzzcVarArr, boolean[] zArr2, long j10) {
        long j11 = this.zzg;
        long j12 = (j11 == -9223372036854775807L || j10 != this.zzb) ? j10 : j11;
        this.zzg = -9223372036854775807L;
        zzxi zzxiVar = this.zze;
        String str = zzfl.zza;
        return zzxiVar.zze(zzabaVarArr, zArr, zzzcVarArr, zArr2, j12);
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    public final void zzf(long j10, boolean z10) {
        zzxi zzxiVar = this.zze;
        String str = zzfl.zza;
        zzxiVar.zzf(j10, false);
    }

    @Override // com.google.android.gms.internal.ads.zzxi, com.google.android.gms.internal.ads.zzze
    public final void zzg(long j10) {
        zzxi zzxiVar = this.zze;
        String str = zzfl.zza;
        zzxiVar.zzg(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    public final long zzh() {
        zzxi zzxiVar = this.zze;
        String str = zzfl.zza;
        return zzxiVar.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzxi, com.google.android.gms.internal.ads.zzze
    public final long zzi() {
        zzxi zzxiVar = this.zze;
        String str = zzfl.zza;
        return zzxiVar.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    public final long zzj(long j10) {
        zzxi zzxiVar = this.zze;
        String str = zzfl.zza;
        return zzxiVar.zzj(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    public final long zzk(long j10, zzni zzniVar) {
        zzxi zzxiVar = this.zze;
        String str = zzfl.zza;
        return zzxiVar.zzk(j10, zzniVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxi, com.google.android.gms.internal.ads.zzze
    public final long zzl() {
        zzxi zzxiVar = this.zze;
        String str = zzfl.zza;
        return zzxiVar.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzxi, com.google.android.gms.internal.ads.zzze
    public final boolean zzm(zzma zzmaVar) {
        zzxi zzxiVar = this.zze;
        return zzxiVar != null && zzxiVar.zzm(zzmaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxi, com.google.android.gms.internal.ads.zzze
    public final boolean zzn() {
        zzxi zzxiVar = this.zze;
        return zzxiVar != null && zzxiVar.zzn();
    }

    public final void zzo(long j10) {
        this.zzg = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzxh
    public final void zzp(zzxi zzxiVar) {
        zzxh zzxhVar = this.zzf;
        String str = zzfl.zza;
        zzxhVar.zzp(this);
    }

    public final long zzq() {
        return this.zzg;
    }

    public final void zzr(zzxm zzxmVar) {
        zzgtj.zzi(this.zzd == null);
        this.zzd = zzxmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzd
    public final /* bridge */ /* synthetic */ void zzs(zzze zzzeVar) {
        zzxh zzxhVar = this.zzf;
        String str = zzfl.zza;
        zzxhVar.zzs(this);
    }

    public final void zzt(zzxk zzxkVar) {
        long jZzv = zzv(this.zzb);
        zzxm zzxmVar = this.zzd;
        zzxmVar.getClass();
        zzxi zzxiVarZzG = zzxmVar.zzG(zzxkVar, this.zzc, jZzv);
        this.zze = zzxiVarZzG;
        if (this.zzf != null) {
            zzxiVarZzG.zzb(this, jZzv);
        }
    }

    public final void zzu() {
        zzxi zzxiVar = this.zze;
        if (zzxiVar != null) {
            zzxm zzxmVar = this.zzd;
            zzxmVar.getClass();
            zzxmVar.zzD(zzxiVar);
        }
    }
}
