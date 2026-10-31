package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzyg extends zzago {
    private final zzzb zza;
    private final zzafv zzb;
    private final AtomicReference zzc;

    zzyg(zzzb zzzbVar) {
        super(zzzbVar);
        this.zza = zzzbVar;
        this.zzb = new zzafv();
        this.zzc = new AtomicReference(zzyf.PASS_THROUGH);
    }

    private final zzahk zzh() {
        return this.zzc.get() == zzyf.DISCARDING ? this.zzb : this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzago, com.google.android.gms.internal.ads.zzahk
    public final int zza(zzj zzjVar, int i10, boolean z10) throws IOException {
        return zzh().zza(zzjVar, i10, z10);
    }

    @Override // com.google.android.gms.internal.ads.zzago, com.google.android.gms.internal.ads.zzahk
    public final int zzb(zzj zzjVar, int i10, boolean z10, int i11) throws IOException {
        return zzh().zzb(zzjVar, i10, z10, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzago, com.google.android.gms.internal.ads.zzahk
    public final void zzc(zzet zzetVar, int i10) {
        zzh().zzc(zzetVar, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzago, com.google.android.gms.internal.ads.zzahk
    public final void zzd(zzet zzetVar, int i10, int i11) {
        zzh().zzd(zzetVar, i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzago, com.google.android.gms.internal.ads.zzahk
    public final void zze(long j10, int i10, int i11, int i12, zzahj zzahjVar) {
        zzh().zze(j10, i10, i11, i12, zzahjVar);
        AtomicReference atomicReference = this.zzc;
        if (atomicReference.get() == zzyf.DISCARD_AFTER_NEXT_SAMPLE_METADATA) {
            this.zza.zzg(false);
            atomicReference.set(zzyf.DISCARDING);
        }
    }

    final boolean zzf() {
        return this.zzc.get() == zzyf.PASS_THROUGH;
    }
}
