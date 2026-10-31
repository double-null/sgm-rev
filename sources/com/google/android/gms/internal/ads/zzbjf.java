package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class zzbjf {
    private final List zza = new LinkedList();
    private final Map zzb;
    private final Object zzc;

    public zzbjf(boolean z10, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzb = linkedHashMap;
        this.zzc = new Object();
        linkedHashMap.put("action", "make_wv");
        linkedHashMap.put("ad_format", str2);
    }

    public static final zzbjc zzf() {
        return new zzbjc(com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime(), null, null);
    }

    public final void zza(zzbjf zzbjfVar) {
        synchronized (this.zzc) {
        }
    }

    public final boolean zzb(zzbjc zzbjcVar, long j10, String... strArr) {
        synchronized (this.zzc) {
            this.zza.add(new zzbjc(j10, strArr[0], zzbjcVar));
        }
        return true;
    }

    public final zzbje zzc() {
        zzbje zzbjeVar;
        boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzcB)).booleanValue();
        StringBuilder sb2 = new StringBuilder();
        HashMap map = new HashMap();
        synchronized (this.zzc) {
            List<zzbjc> list = this.zza;
            for (zzbjc zzbjcVar : list) {
                long jZza = zzbjcVar.zza();
                String strZzb = zzbjcVar.zzb();
                zzbjc zzbjcVarZzc = zzbjcVar.zzc();
                if (zzbjcVarZzc != null && jZza > 0) {
                    long jZza2 = jZza - zzbjcVarZzc.zza();
                    sb2.append(strZzb);
                    sb2.append('.');
                    sb2.append(jZza2);
                    sb2.append(',');
                    if (zBooleanValue) {
                        if (map.containsKey(Long.valueOf(zzbjcVarZzc.zza()))) {
                            StringBuilder sb3 = (StringBuilder) map.get(Long.valueOf(zzbjcVarZzc.zza()));
                            sb3.append('+');
                            sb3.append(strZzb);
                        } else {
                            map.put(Long.valueOf(zzbjcVarZzc.zza()), new StringBuilder(strZzb));
                        }
                    }
                }
            }
            list.clear();
            String string = null;
            if (!TextUtils.isEmpty(null)) {
                sb2.append((String) null);
            } else if (sb2.length() > 0) {
                sb2.setLength(sb2.length() - 1);
            }
            StringBuilder sb4 = new StringBuilder();
            if (zBooleanValue) {
                for (Map.Entry entry : map.entrySet()) {
                    sb4.append((CharSequence) entry.getValue());
                    sb4.append('.');
                    sb4.append(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() + (((Long) entry.getKey()).longValue() - com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime()));
                    sb4.append(',');
                }
                if (sb4.length() > 0) {
                    sb4.setLength(sb4.length() - 1);
                }
                string = sb4.toString();
            }
            zzbjeVar = new zzbje(sb2.toString(), string);
        }
        return zzbjeVar;
    }

    public final void zzd(String str, String str2) {
        zzbiv zzbivVarZza;
        if (TextUtils.isEmpty(str2) || (zzbivVarZza = com.google.android.gms.ads.internal.zzt.zzh().zza()) == null) {
            return;
        }
        synchronized (this.zzc) {
            zzbjb zzbjbVarZzd = zzbivVarZza.zzd(str);
            Map map = this.zzb;
            map.put(str, zzbjbVarZzd.zza((String) map.get(str), str2));
        }
    }

    public final Map zze() {
        Map map;
        synchronized (this.zzc) {
            com.google.android.gms.ads.internal.zzt.zzh().zza();
            map = this.zzb;
        }
        return map;
    }
}
