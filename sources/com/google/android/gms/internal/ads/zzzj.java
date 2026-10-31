package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzzj implements zzzc {
    private final zzzc zza;
    private final long zzb;

    public zzzj(zzzc zzzcVar, long j10) {
        this.zza = zzzcVar;
        this.zzb = j10;
    }

    public final zzzc zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzzc
    public final boolean zzb() {
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzzc
    public final void zzc() throws IOException {
        this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzzc
    public final int zzd(zzlw zzlwVar, zziv zzivVar, int i10) {
        int iZzd = this.zza.zzd(zzlwVar, zzivVar, i10);
        if (iZzd != -4) {
            return iZzd;
        }
        zzivVar.zze += this.zzb;
        return -4;
    }

    @Override // com.google.android.gms.internal.ads.zzzc
    public final int zze(long j10) {
        return this.zza.zze(j10 - this.zzb);
    }
}
