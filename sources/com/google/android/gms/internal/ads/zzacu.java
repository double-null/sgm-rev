package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzacu {
    final /* synthetic */ zzacv zza;
    private zzv zzb;

    /* synthetic */ zzacu(zzacv zzacvVar, byte[] bArr) {
        Objects.requireNonNull(zzacvVar);
        this.zza = zzacvVar;
    }

    public final void zza(final zzbv zzbvVar) {
        zzt zztVar = new zzt();
        zztVar.zzv(zzbvVar.zzb);
        zztVar.zzw(zzbvVar.zzc);
        zztVar.zzo("video/raw");
        this.zzb = zztVar.zzO();
        this.zza.zzC().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzact
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zza.zzB().zzd(zzbvVar);
            }
        });
    }

    public final void zzb(long j10, long j11, boolean z10) {
        if (z10) {
            zzacv zzacvVar = this.zza;
            if (zzacvVar.zzA() != null) {
                zzacvVar.zzC().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzacr
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zza.zzB().zzb();
                    }
                });
            }
        }
        zzv zzvVarZzO = this.zzb;
        if (zzvVarZzO == null) {
            zzvVarZzO = new zzt().zzO();
        }
        zzv zzvVar = zzvVarZzO;
        zzacv zzacvVar2 = this.zza;
        zzacvVar2.zzD().zzcS(j11, j10, zzvVar, null);
        ((zzaes) zzacvVar2.zzz().remove()).zza(j10);
    }
}
