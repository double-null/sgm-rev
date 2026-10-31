package com.google.android.gms.internal.measurement;

import com.google.common.base.w;
import com.google.common.base.x;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzahn implements w {
    private static final zzahn zza = new zzahn();
    private final w zzb = x.b(new zzahp());

    public static boolean zza() {
        zza.get().zza();
        return true;
    }

    public static boolean zzb() {
        return zza.get().zzb();
    }

    public static boolean zzc() {
        return zza.get().zzc();
    }

    public static boolean zzd() {
        return zza.get().zzd();
    }

    @Override // com.google.common.base.w
    /* JADX INFO: renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final zzaho get() {
        return (zzaho) this.zzb.get();
    }
}
