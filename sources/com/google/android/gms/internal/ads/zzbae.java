package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzbae implements zzfye {
    final /* synthetic */ zzfxg zza;

    zzbae(zzfxg zzfxgVar) {
        this.zza = zzfxgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfye
    public final void zza(int i10, long j10) {
        this.zza.zzb(i10, System.currentTimeMillis() - j10);
    }

    @Override // com.google.android.gms.internal.ads.zzfye
    public final void zzb(int i10, long j10, String str) {
        this.zza.zzf(i10, System.currentTimeMillis() - j10, str);
    }
}
