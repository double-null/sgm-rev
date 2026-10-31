package com.google.android.gms.internal.measurement;

import android.content.Context;
import com.google.common.base.g;
import com.google.common.collect.w;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzon {
    private final g zza;
    private final boolean zzb;
    private final w zzc;
    private volatile String zzd = null;

    zzon(g gVar, boolean z10, boolean z11, boolean z12, boolean z13, w wVar) {
        this.zza = gVar;
        this.zzb = z12;
        this.zzc = wVar;
    }

    final String zza(Context context) {
        String str = this.zzd;
        if (str != null) {
            return str;
        }
        String str2 = (String) this.zza.apply(context);
        this.zzd = str2;
        return str2;
    }

    final boolean zzb() {
        return this.zzb;
    }

    final w zzc() {
        return this.zzc;
    }
}
