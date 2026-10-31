package com.google.android.gms.internal.measurement;

import com.google.common.base.w;
import com.google.common.base.x;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzagy implements w {
    private static final zzagy zza = new zzagy();
    private final w zzb = x.b(new zzaha());

    public static boolean zza() {
        return zza.get().zza();
    }

    public static boolean zzb() {
        return zza.get().zzb();
    }

    @Override // com.google.common.base.w
    /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final zzagz get() {
        return (zzagz) this.zzb.get();
    }
}
