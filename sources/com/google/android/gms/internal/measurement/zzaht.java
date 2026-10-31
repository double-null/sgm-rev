package com.google.android.gms.internal.measurement;

import com.google.common.base.w;
import com.google.common.base.x;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzaht implements w {
    private static final zzaht zza = new zzaht();
    private final w zzb = x.b(new zzahv());

    public static boolean zza() {
        return zza.get().zza();
    }

    public static boolean zzb() {
        return zza.get().zzb();
    }

    @Override // com.google.common.base.w
    /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final zzahu get() {
        return (zzahu) this.zzb.get();
    }
}
