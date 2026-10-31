package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzaie extends zzafk {
    public zzaie(final zzagl zzaglVar, int i10, long j10, long j11) {
        long j12;
        Objects.requireNonNull(zzaglVar);
        zzafh zzafhVar = new zzafh() { // from class: com.google.android.gms.internal.ads.zzaic
            @Override // com.google.android.gms.internal.ads.zzafh
            public final /* synthetic */ long zza(long j13) {
                return zzaglVar.zzb(j13);
            }
        };
        zzaid zzaidVar = new zzaid(zzaglVar, i10, null);
        long jZza = zzaglVar.zza();
        long j13 = zzaglVar.zzj;
        int i11 = zzaglVar.zzd;
        if (i11 > 0) {
            j12 = ((((long) i11) + ((long) zzaglVar.zzc)) / 2) + 1;
        } else {
            int i12 = zzaglVar.zza;
            long j14 = 4096;
            if (i12 == zzaglVar.zzb && i12 > 0) {
                j14 = i12;
            }
            j12 = (((j14 * ((long) zzaglVar.zzg)) * ((long) zzaglVar.zzh)) / 8) + 64;
        }
        super(zzafhVar, zzaidVar, jZza, 0L, j13, j10, j11, j12, Math.max(6, zzaglVar.zzc));
    }
}
