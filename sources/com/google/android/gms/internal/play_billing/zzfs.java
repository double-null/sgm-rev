package com.google.android.gms.internal.play_billing;

import com.applovin.shadow.okhttp3.internal.http2.Settings;

/* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzfs {
    private final Object zza;
    private final int zzb;

    zzfs(Object obj, int i10) {
        this.zza = obj;
        this.zzb = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzfs)) {
            return false;
        }
        zzfs zzfsVar = (zzfs) obj;
        return this.zza == zzfsVar.zza && this.zzb == zzfsVar.zzb;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.zzb;
    }
}
