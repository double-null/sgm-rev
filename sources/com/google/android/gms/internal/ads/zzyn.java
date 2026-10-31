package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzyn implements zzzc {
    final /* synthetic */ zzyq zza;
    private final int zzb;

    public zzyn(zzyq zzyqVar, int i10) {
        Objects.requireNonNull(zzyqVar);
        this.zza = zzyqVar;
        this.zzb = i10;
    }

    final /* synthetic */ int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzzc
    public final boolean zzb() {
        return this.zza.zzp(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzzc
    public final void zzc() throws IOException {
        this.zza.zzq(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzzc
    public final int zzd(zzlw zzlwVar, zziv zzivVar, int i10) {
        return this.zza.zzs(this.zzb, zzlwVar, zzivVar, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzzc
    public final int zze(long j10) {
        return this.zza.zzt(this.zzb, j10);
    }
}
