package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhmn {
    private static final zzhmn zzb = new zzhmn();
    private final Map zza = new HashMap();

    zzhmn() {
    }

    public static zzhmn zza() {
        return zzb;
    }

    public final synchronized void zzb(String str, zzheh zzhehVar) throws GeneralSecurityException {
        Map map = this.zza;
        if (!map.containsKey(str)) {
            map.put(str, zzhehVar);
            return;
        }
        if (((zzheh) map.get(str)).equals(zzhehVar)) {
            return;
        }
        String strValueOf = String.valueOf(map.get(str));
        String strValueOf2 = String.valueOf(zzhehVar);
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 45 + strValueOf.length() + 17 + strValueOf2.length());
        sb2.append("Parameters object with name ");
        sb2.append(str);
        sb2.append(" already exists (");
        sb2.append(strValueOf);
        sb2.append("), cannot insert ");
        sb2.append(strValueOf2);
        throw new GeneralSecurityException(sb2.toString());
    }

    public final synchronized zzheh zzc(String str) throws GeneralSecurityException {
        Map map;
        map = this.zza;
        if (!map.containsKey("AES128_GCM")) {
            throw new GeneralSecurityException("Name AES128_GCM does not exist");
        }
        return (zzheh) map.get("AES128_GCM");
    }

    public final synchronized void zzd(Map map) throws GeneralSecurityException {
        for (Map.Entry entry : map.entrySet()) {
            zzb((String) entry.getKey(), (zzheh) entry.getValue());
        }
    }
}
