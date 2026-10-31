package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzht {
    private static final zzht zza = new zzht();
    private final ConcurrentMap zzc = new ConcurrentHashMap();
    private final zzhd zzb = new zzhd();

    private zzht() {
    }

    static zzht zza() {
        return zza;
    }

    private <T> zzhw<T> zzc(Class<T> cls) {
        ConcurrentMap concurrentMap = this.zzc;
        zzhw<T> zzhwVarZza = this.zzb.zza(cls);
        zzhw<T> zzhwVar = (zzhw) concurrentMap.putIfAbsent(cls, zzhwVarZza);
        return zzhwVar != null ? zzhwVar : zzhwVarZza;
    }

    final zzhw zzb(Class cls) {
        Object obj = this.zzc.get(cls);
        return obj == null ? zzc(cls) : (zzhw) obj;
    }
}
