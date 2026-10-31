package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzaon {
    public static zzaoo zza(zzaoo zzaooVar, String[] strArr, Map map) {
        int length;
        int i10 = 0;
        if (zzaooVar == null) {
            if (strArr == null) {
                return null;
            }
            int length2 = strArr.length;
            if (length2 == 1) {
                return (zzaoo) map.get(strArr[0]);
            }
            if (length2 > 1) {
                zzaoo zzaooVar2 = new zzaoo();
                while (i10 < length2) {
                    zzaooVar2.zzr((zzaoo) map.get(strArr[i10]));
                    i10++;
                }
                return zzaooVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                zzaooVar.zzr((zzaoo) map.get(strArr[0]));
                return zzaooVar;
            }
            if (strArr != null && (length = strArr.length) > 1) {
                while (i10 < length) {
                    zzaooVar.zzr((zzaoo) map.get(strArr[i10]));
                    i10++;
                }
            }
        }
        return zzaooVar;
    }
}
