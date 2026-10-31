package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzieb implements zzids {
    final int zza;
    final zzihg zzb;
    final boolean zzc;
    final boolean zzd;

    zzieb(zziej zziejVar, int i10, zzihg zzihgVar, boolean z10, boolean z11) {
        this.zza = i10;
        this.zzb = zzihgVar;
        this.zzc = z10;
        this.zzd = z11;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.zza - ((zzieb) obj).zza;
    }

    @Override // com.google.android.gms.internal.ads.zzids
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzids
    public final zzihg zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzids
    public final zzihh zzc() {
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzids
    public final boolean zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzids
    public final boolean zze() {
        return this.zzd;
    }
}
