package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzaia implements zzafy {
    private final zzet zza = new zzet(4);
    private final zzahd zzb = new zzahd(-1, -1, "image/avif");

    private final boolean zzh(zzafz zzafzVar, int i10) throws IOException {
        zzet zzetVar = this.zza;
        zzetVar.zza(4);
        ((zzafp) zzafzVar).zzh(zzetVar.zzi(), 0, 4, false);
        return zzetVar.zzz() == ((long) i10);
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zza(zzafz zzafzVar) throws IOException {
        ((zzafp) zzafzVar).zzj(4, false);
        return zzh(zzafzVar, 1718909296) && zzh(zzafzVar, 1635150182);
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zzc(zzagb zzagbVar) {
        this.zzb.zzc(zzagbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final int zzd(zzafz zzafzVar, zzagy zzagyVar) throws IOException {
        return this.zzb.zzd(zzafzVar, zzagyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zze(long j10, long j11) {
        this.zzb.zze(j10, j11);
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zzf() {
    }
}
