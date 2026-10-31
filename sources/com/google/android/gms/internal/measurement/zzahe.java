package com.google.android.gms.internal.measurement;

import com.google.common.base.w;
import com.google.common.base.x;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzahe implements w {
    private static final zzahe zza = new zzahe();
    private final w zzb = x.b(new zzahg());

    public static String zza() {
        return zza.get().zza();
    }

    public static String zzb() {
        return zza.get().zzb();
    }

    public static String zzc() {
        return zza.get().zzc();
    }

    @Override // com.google.common.base.w
    /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final zzahf get() {
        return (zzahf) this.zzb.get();
    }
}
