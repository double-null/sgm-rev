package com.google.android.gms.internal.measurement;

import com.google.common.base.w;
import com.google.common.base.x;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzaic implements w {
    private static final zzaic zza = new zzaic();
    private final w zzb = x.b(new zzaie());

    public static boolean zza() {
        return zza.get().zza();
    }

    public static long zzb() {
        return zza.get().zzb();
    }

    public static double zzc() {
        return zza.get().zzc();
    }

    public static long zzd() {
        return zza.get().zzd();
    }

    public static long zze() {
        return zza.get().zze();
    }

    public static String zzf() {
        return zza.get().zzf();
    }

    @Override // com.google.common.base.w
    /* JADX INFO: renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final zzaid get() {
        return (zzaid) this.zzb.get();
    }
}
