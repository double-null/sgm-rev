package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzada implements zzaes {
    final /* synthetic */ zzvj zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzade zzd;

    zzada(zzade zzadeVar, zzvj zzvjVar, int i10, long j10) {
        this.zza = zzvjVar;
        this.zzb = i10;
        this.zzc = j10;
        Objects.requireNonNull(zzadeVar);
        this.zzd = zzadeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final void zza(long j10) {
        this.zzd.zzaB(this.zza, this.zzb, this.zzc, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final void zzb() {
        this.zzd.zzay(this.zza, this.zzb, this.zzc);
    }
}
