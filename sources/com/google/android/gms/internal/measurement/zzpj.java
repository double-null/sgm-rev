package com.google.android.gms.internal.measurement;

import com.google.common.base.g;
import com.google.common.collect.w;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzpj {
    private final g zza;
    private final w zzb = w.D();
    private boolean zzc = false;

    public zzpj(g gVar) {
        this.zza = gVar;
    }

    public final zzpj zza() {
        this.zzc = true;
        return this;
    }

    public final zzph zzb() {
        return new zzpi(new zzon(this.zza, false, false, this.zzc, false, this.zzb), null);
    }
}
