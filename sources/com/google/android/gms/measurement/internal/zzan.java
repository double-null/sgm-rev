package com.google.android.gms.measurement.internal;

import com.facebook.appevents.AppEventsConstants;
import java.util.EnumMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzan {
    private final EnumMap zza;

    zzan() {
        this.zza = new EnumMap(zzjk.class);
    }

    public static zzan zzd(String str) {
        EnumMap enumMap = new EnumMap(zzjk.class);
        if (str.length() >= zzjk.values().length) {
            int i10 = 0;
            if (str.charAt(0) == '1') {
                zzjk[] zzjkVarArrValues = zzjk.values();
                int length = zzjkVarArrValues.length;
                int i11 = 1;
                while (i10 < length) {
                    enumMap.put(zzjkVarArrValues[i10], zzam.zza(str.charAt(i11)));
                    i10++;
                    i11++;
                }
                return new zzan(enumMap);
            }
        }
        return new zzan();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(AppEventsConstants.EVENT_PARAM_VALUE_YES);
        for (zzjk zzjkVar : zzjk.values()) {
            zzam zzamVar = (zzam) this.zza.get(zzjkVar);
            if (zzamVar == null) {
                zzamVar = zzam.UNSET;
            }
            sb2.append(zzamVar.zzb());
        }
        return sb2.toString();
    }

    public final zzam zza(zzjk zzjkVar) {
        zzam zzamVar = (zzam) this.zza.get(zzjkVar);
        return zzamVar == null ? zzam.UNSET : zzamVar;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    public final void zzb(zzjk zzjkVar, int i10) {
        zzam zzamVar = zzam.UNSET;
        if (i10 == -30) {
            zzamVar = zzam.TCF;
        } else if (i10 == -20) {
            zzamVar = zzam.API;
        } else if (i10 == -10) {
            zzamVar = zzam.MANIFEST;
        } else if (i10 == 0) {
            zzamVar = zzam.API;
        } else if (i10 == 30) {
            zzamVar = zzam.INITIALIZATION;
        }
        this.zza.put(zzjkVar, zzamVar);
    }

    public final void zzc(zzjk zzjkVar, zzam zzamVar) {
        this.zza.put(zzjkVar, zzamVar);
    }

    private zzan(EnumMap enumMap) {
        EnumMap enumMap2 = new EnumMap(zzjk.class);
        this.zza = enumMap2;
        enumMap2.putAll(enumMap);
    }
}
