package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
abstract class zzafz {
    private static volatile int zza = 100;

    zzafz() {
    }

    abstract void zza(Object obj, int i10, long j10);

    abstract void zzb(Object obj, int i10, int i11);

    abstract void zzc(Object obj, int i10, long j10);

    abstract void zzd(Object obj, int i10, zzacr zzacrVar);

    abstract void zze(Object obj, int i10, Object obj2);

    abstract Object zzf();

    abstract Object zzg(Object obj);

    abstract Object zzh(Object obj);

    abstract void zzi(Object obj, Object obj2);

    abstract void zzj(Object obj);

    final boolean zzk(Object obj, zzafo zzafoVar, int i10) throws IOException {
        int iZzc = zzafoVar.zzc();
        int i11 = iZzc >>> 3;
        int i12 = iZzc & 7;
        if (i12 == 0) {
            zza(obj, i11, zzafoVar.zzh());
            return true;
        }
        if (i12 == 1) {
            zzc(obj, i11, zzafoVar.zzj());
            return true;
        }
        if (i12 == 2) {
            zzd(obj, i11, zzafoVar.zzq());
            return true;
        }
        if (i12 != 3) {
            if (i12 == 4) {
                if (i10 != 0) {
                    return false;
                }
                throw new zzaeh("Protocol message end-group tag did not match expected tag.");
            }
            if (i12 != 5) {
                throw new zzaeg("Protocol message tag had invalid wire type.");
            }
            zzb(obj, i11, zzafoVar.zzk());
            return true;
        }
        Object objZzf = zzf();
        int i13 = i11 << 3;
        int i14 = i10 + 1;
        if (i14 >= zza) {
            throw new zzaeh("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (zzafoVar.zzb() != Integer.MAX_VALUE && zzk(objZzf, zzafoVar, i14)) {
        }
        if ((i13 | 4) != zzafoVar.zzc()) {
            throw new zzaeh("Protocol message end-group tag did not match expected tag.");
        }
        zze(obj, i11, zzg(objZzf));
        return true;
    }
}
