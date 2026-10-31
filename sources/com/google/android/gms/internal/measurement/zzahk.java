package com.google.android.gms.internal.measurement;

import com.google.common.base.w;
import com.google.common.base.x;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzahk implements w {
    private static final zzahk zza = new zzahk();
    private final w zzb = x.b(new zzahm());

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

    @Override // com.google.common.base.w
    /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final zzahl get() {
        return (zzahl) this.zzb.get();
    }
}
