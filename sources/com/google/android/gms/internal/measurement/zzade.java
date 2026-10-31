package com.google.android.gms.internal.measurement;

import com.applovin.shadow.okhttp3.internal.http2.Settings;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzade {
    private final Object zza;
    private final int zzb;

    zzade(Object obj, int i10) {
        this.zza = obj;
        this.zzb = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzade)) {
            return false;
        }
        zzade zzadeVar = (zzade) obj;
        return this.zza == zzadeVar.zza && this.zzb == zzadeVar.zzb;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.zzb;
    }
}
