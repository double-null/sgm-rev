package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzmo implements zzmg {
    public final zzxf zza;
    public int zzd;
    public boolean zze;
    public final List zzc = new ArrayList();
    public final Object zzb = new Object();

    public zzmo(zzxm zzxmVar, boolean z10) {
        this.zza = new zzxf(zzxmVar, z10);
    }

    @Override // com.google.android.gms.internal.ads.zzmg
    public final Object zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzmg
    public final zzbf zzb() {
        return this.zza.zzz();
    }

    public final void zzc(int i10) {
        this.zzd = i10;
        this.zze = false;
        this.zzc.clear();
    }
}
