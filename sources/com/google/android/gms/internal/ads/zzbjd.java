package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class zzbjd {
    private final Map zza = new HashMap();
    private final zzbjf zzb;

    public zzbjd(zzbjf zzbjfVar) {
        this.zzb = zzbjfVar;
    }

    public final void zza(String str, zzbjc zzbjcVar) {
        this.zza.put(str, zzbjcVar);
    }

    public final void zzb(String str, String str2, long j10) {
        Map map = this.zza;
        zzbjc zzbjcVar = (zzbjc) map.get(str2);
        String[] strArr = {str};
        if (zzbjcVar != null) {
            this.zzb.zzb(zzbjcVar, j10, strArr);
        }
        map.put(str, new zzbjc(j10, null, null));
    }

    public final zzbjf zzc() {
        return this.zzb;
    }
}
