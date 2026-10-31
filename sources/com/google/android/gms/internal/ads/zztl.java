package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zztl {
    private final zzv zza;
    private final zzv zzb;
    private final int zzc;
    private final int zzd;
    private final zzre zze;
    private final zzck zzf;

    private zztl(zzv zzvVar, zzv zzvVar2, int i10, int i11, zzre zzreVar, zzck zzckVar) {
        this.zza = zzvVar;
        this.zzb = zzvVar2;
        this.zzc = i10;
        this.zzd = i11;
        this.zze = zzreVar;
        this.zzf = zzckVar;
    }

    final /* synthetic */ zztl zza(zzre zzreVar) {
        return new zztl(this.zza, this.zzb, this.zzc, this.zzd, zzreVar, this.zzf);
    }

    final /* synthetic */ long zzb(long j10) {
        return zzfl.zzt(j10, this.zza.zzI);
    }

    final /* synthetic */ long zzc(long j10) {
        return zzfl.zzt(j10, this.zze.zzb);
    }

    final /* synthetic */ zzry zzd() {
        zzre zzreVar = this.zze;
        return new zzry(zzreVar.zza, zzreVar.zzb, zzreVar.zzc, false, false, zzreVar.zze);
    }

    final /* synthetic */ boolean zze() {
        return Objects.equals(this.zza.zzp, "audio/raw");
    }

    final /* synthetic */ zzv zzf() {
        return this.zza;
    }

    final /* synthetic */ zzv zzg() {
        return this.zzb;
    }

    final /* synthetic */ int zzh() {
        return this.zzc;
    }

    final /* synthetic */ int zzi() {
        return this.zzd;
    }

    final /* synthetic */ zzre zzj() {
        return this.zze;
    }

    final /* synthetic */ zzck zzk() {
        return this.zzf;
    }

    /* synthetic */ zztl(zzv zzvVar, zzv zzvVar2, int i10, int i11, zzre zzreVar, zzck zzckVar, byte[] bArr) {
        this(zzvVar, zzvVar2, i10, i11, zzreVar, zzckVar);
    }
}
