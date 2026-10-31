package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public interface zzafy {
    boolean zza(zzafz zzafzVar) throws IOException;

    default List zzb() {
        return zzgwm.zzi();
    }

    void zzc(zzagb zzagbVar);

    int zzd(zzafz zzafzVar, zzagy zzagyVar) throws IOException;

    void zze(long j10, long j11);

    void zzf();

    default zzafy zzg() {
        return this;
    }
}
