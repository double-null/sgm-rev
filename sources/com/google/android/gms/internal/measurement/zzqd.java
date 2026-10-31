package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzqd implements zzpm {
    final /* synthetic */ zzqe zza;
    private final zzqm zzb;

    zzqd(zzqe zzqeVar, zzqm zzqmVar) {
        Objects.requireNonNull(zzqeVar);
        this.zza = zzqeVar;
        this.zzb = zzqmVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzpm
    public final void zza(zzpl zzplVar) {
        Iterator it = this.zza.zzc().iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (((zzqc) it.next()).zza(zzplVar.zza()) && !z10) {
                this.zzb.zza();
                z10 = true;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzpm
    public final void zzb(Throwable th) {
    }
}
