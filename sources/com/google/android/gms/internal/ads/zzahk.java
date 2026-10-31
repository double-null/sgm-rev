package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public interface zzahk {
    void zzA(zzv zzvVar);

    default int zza(zzj zzjVar, int i10, boolean z10) throws IOException {
        return zzb(zzjVar, i10, z10, 0);
    }

    int zzb(zzj zzjVar, int i10, boolean z10, int i11) throws IOException;

    default void zzc(zzet zzetVar, int i10) {
        zzd(zzetVar, i10, 0);
    }

    void zzd(zzet zzetVar, int i10, int i11);

    void zze(long j10, int i10, int i11, int i12, zzahj zzahjVar);

    default void zzO(long j10) {
    }
}
