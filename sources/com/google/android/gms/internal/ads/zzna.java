package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public interface zzna extends zzmv {
    String zzU();

    default long zzV(long j10, long j11) {
        if (zze() == 1) {
            return (zzaa() || zzab()) ? 1000000L : 10000L;
        }
        return 10000L;
    }

    default boolean zzW(long j10) {
        return false;
    }

    void zzZ(long j10, long j11) throws zzjk;

    int zza();

    boolean zzaa();

    boolean zzab();

    zznc zzb();

    void zzc(int i10, zzqf zzqfVar, zzdo zzdoVar);

    void zzcT() throws zzjk;

    void zzcU(zzv[] zzvVarArr, zzzc zzzcVar, long j10, long j11, zzxk zzxkVar) throws zzjk;

    zzzc zzcV();

    boolean zzcW();

    zzmb zzd();

    int zze();

    void zzf(zznd zzndVar, zzv[] zzvVarArr, zzzc zzzcVar, long j10, boolean z10, boolean z11, long j11, long j12, zzxk zzxkVar) throws zzjk;

    long zzk();

    void zzl();

    boolean zzm();

    void zzn() throws IOException;

    void zzo(zzbf zzbfVar);

    void zzp(long j10, boolean z10) throws zzjk;

    void zzq();

    void zzr();

    void zzs();

    default void zzY() {
    }

    default void zzt() {
    }

    default void zzX(float f10, float f11) throws zzjk {
    }
}
