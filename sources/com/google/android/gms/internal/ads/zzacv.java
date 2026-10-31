package com.google.android.gms.internal.ads;

import android.view.Surface;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzacv implements zzaeu {
    private final zzadu zza;
    private final zzadv zzb;
    private final zzaec zzc;
    private final Queue zzd;
    private Surface zze;
    private zzv zzf;
    private long zzg;
    private zzaer zzh;
    private Executor zzi;
    private zzadr zzj;

    public zzacv(zzadu zzaduVar, zzadv zzadvVar, zzdo zzdoVar) {
        this.zza = zzaduVar;
        this.zzb = zzadvVar;
        zzaduVar.zzg(zzdoVar);
        this.zzc = new zzaec(new zzacu(this, null), zzaduVar, zzadvVar);
        this.zzd = new ArrayDeque();
        this.zzf = new zzt().zzO();
        this.zzg = -9223372036854775807L;
        this.zzh = zzaer.zzb;
        this.zzi = zzacq.zza;
        this.zzj = zzaco.zza;
    }

    final /* synthetic */ Surface zzA() {
        return this.zze;
    }

    final /* synthetic */ zzaer zzB() {
        return this.zzh;
    }

    final /* synthetic */ Executor zzC() {
        return this.zzi;
    }

    final /* synthetic */ zzadr zzD() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zza() {
        this.zzb.zzd();
        this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzb() {
        this.zzb.zzd();
        this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzc(zzaer zzaerVar, Executor executor) {
        this.zzh = zzaerVar;
        this.zzi = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zzd(zzv zzvVar) {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zze() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzf() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzg(boolean z10) {
        if (z10) {
            this.zza.zzl();
        }
        this.zzb.zzd();
        this.zzc.zza();
        this.zzd.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zzh(boolean z10) {
        return this.zza.zzi(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzi() {
        this.zzc.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zzj() {
        return this.zzc.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final Surface zzk() {
        Surface surface = this.zze;
        surface.getClass();
        return surface;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzl(zzadr zzadrVar) {
        this.zzj = zzadrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzm(float f10) {
        this.zza.zzn(f10);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzn(List list) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzo(long j10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzp(Surface surface, zzeu zzeuVar) {
        this.zze = surface;
        this.zza.zzd(surface);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzq() {
        this.zze = null;
        this.zza.zzd(null);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzr(int i10) {
        this.zza.zzm(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzs(int i10, zzv zzvVar, long j10, int i11, List list) {
        zzgtj.zzi(list.isEmpty());
        int i12 = zzvVar.zzw;
        zzv zzvVar2 = this.zzf;
        if (i12 != zzvVar2.zzw || zzvVar.zzx != zzvVar2.zzx) {
            this.zzc.zzc(i12, zzvVar.zzx);
        }
        float f10 = zzvVar.zzA;
        if (f10 != this.zzf.zzA) {
            this.zza.zze(f10);
        }
        this.zzf = zzvVar;
        if (j10 != this.zzg) {
            this.zzc.zzd(i11, j10);
            this.zzg = j10;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzt() {
        this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zzu(long j10, zzaes zzaesVar) {
        this.zzd.add(zzaesVar);
        this.zzc.zze(j10);
        this.zzi.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzacp
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzy();
            }
        });
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzv(long j10, long j11) throws zzaet {
        try {
            this.zzc.zzb(j10, j11);
        } catch (zzjk e10) {
            throw new zzaet(e10, this.zzf);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzw(boolean z10) {
        this.zza.zzj(z10);
    }

    final /* synthetic */ void zzy() {
        this.zzh.zza();
    }

    final /* synthetic */ Queue zzz() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzx() {
    }
}
