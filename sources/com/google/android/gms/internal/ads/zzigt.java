package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
abstract class zzigt {
    private static volatile int zza = 100;

    zzigt() {
    }

    abstract void zza(Object obj, int i10, long j10);

    abstract void zzb(Object obj, int i10, int i11);

    abstract void zzc(Object obj, int i10, long j10);

    abstract void zzd(Object obj, int i10, zzida zzidaVar);

    abstract void zze(Object obj, int i10, Object obj2);

    abstract Object zzf();

    abstract Object zzg(Object obj);

    abstract Object zzh(Object obj);

    abstract void zzi(Object obj, Object obj2);

    abstract void zzj(Object obj);

    final boolean zzk(Object obj, zzigc zzigcVar, int i10) throws IOException {
        int iZzc = zzigcVar.zzc();
        int i11 = iZzc >>> 3;
        int i12 = iZzc & 7;
        if (i12 == 0) {
            zza(obj, i11, zzigcVar.zzh());
            return true;
        }
        if (i12 == 1) {
            zzc(obj, i11, zzigcVar.zzj());
            return true;
        }
        if (i12 == 2) {
            zzd(obj, i11, zzigcVar.zzq());
            return true;
        }
        if (i12 != 3) {
            if (i12 == 4) {
                if (i10 != 0) {
                    return false;
                }
                throw new zziet("Protocol message end-group tag did not match expected tag.");
            }
            if (i12 != 5) {
                throw new zzies("Protocol message tag had invalid wire type.");
            }
            zzb(obj, i11, zzigcVar.zzk());
            return true;
        }
        Object objZzf = zzf();
        int i13 = i11 << 3;
        int i14 = i10 + 1;
        if (i14 >= zza) {
            throw new zziet("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (zzigcVar.zzb() != Integer.MAX_VALUE && zzk(objZzf, zzigcVar, i14)) {
        }
        if ((i13 | 4) != zzigcVar.zzc()) {
            throw new zziet("Protocol message end-group tag did not match expected tag.");
        }
        zze(obj, i11, zzg(objZzf));
        return true;
    }
}
