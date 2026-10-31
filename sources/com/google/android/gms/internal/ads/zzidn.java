package com.google.android.gms.internal.ads;

import com.applovin.shadow.okhttp3.internal.http2.Settings;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzidn {
    private final Object zza;
    private final int zzb;

    zzidn(Object obj, int i10) {
        this.zza = obj;
        this.zzb = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzidn)) {
            return false;
        }
        zzidn zzidnVar = (zzidn) obj;
        return this.zza == zzidnVar.zza && this.zzb == zzidnVar.zzb;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.zzb;
    }
}
