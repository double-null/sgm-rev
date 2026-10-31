package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzinf {
    private final List zza;
    private final List zzb;

    /* synthetic */ zzinf(int i10, int i11, zzine zzineVar) {
        this.zza = zzimr.zza(i10);
        this.zzb = zzimr.zza(i11);
    }

    public final zzinf zza(zzind zzindVar) {
        this.zza.add(zzindVar);
        return this;
    }

    public final zzinf zzb(zzind zzindVar) {
        this.zzb.add(zzindVar);
        return this;
    }

    public final zzing zzc() {
        return new zzing(this.zza, this.zzb, null);
    }
}
