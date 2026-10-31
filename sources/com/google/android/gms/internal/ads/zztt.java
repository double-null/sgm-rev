package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zztt implements zztj {
    protected zztt(zzts zztsVar) {
    }

    protected static int zza(int i10, int i11, int i12) {
        return zzhah.zza(((((long) i10) * ((long) i11)) * ((long) i12)) / 1000000);
    }

    protected static final int zzb(int i10, int i11, int i12, int i13, int i14, int i15) {
        int i16 = 250000;
        if (i12 == 0) {
            int iZza = zza(250000, i14, i13);
            int iZza2 = zza(750000, i14, i13);
            String str = zzfl.zza;
            return Math.max(iZza, Math.min(i10 * 4, iZza2));
        }
        if (i12 == 1) {
            return zzhah.zza((((long) zzc(i11)) * 50000000) / 1000000);
        }
        if (i11 == 5) {
            i16 = 500000;
        } else if (i11 == 8) {
            i16 = 1000000;
            i11 = 8;
        }
        return zzhah.zza((((long) i16) * ((long) (i15 != -1 ? zzgzz.zzb(i15, 8, RoundingMode.CEILING) : zzc(i11)))) / 1000000);
    }

    private static int zzc(int i10) {
        int iZzf = zzagc.zzf(i10);
        zzgtj.zzi(iZzf != -2147483647);
        return iZzf;
    }
}
