package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzavp implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        int length;
        zzavq zzavqVar = (zzavq) obj;
        zzavq zzavqVar2 = (zzavq) obj2;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            length = zzavqVar.zza.length;
            if (i10 >= length || i11 >= zzavqVar2.zza.length) {
                break;
            }
            int iCompare = Integer.compare(zzavq.zzg(zzavqVar.zzb(i10)), zzavq.zzg(zzavqVar2.zzb(i11)));
            if (iCompare != 0) {
                return iCompare;
            }
            i10++;
            i11++;
        }
        return Integer.compare(length, zzavqVar2.zza.length);
    }
}
