package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzagc {
    public static void zza(boolean z10, String str) throws zzat {
        if (!z10) {
            throw zzat.zzb(str, null);
        }
    }

    public static int zzb(zzafz zzafzVar, byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        while (i12 < i11) {
            int iZzg = zzafzVar.zzg(bArr, i10 + i12, i11 - i12);
            if (iZzg == -1) {
                break;
            }
            i12 += iZzg;
        }
        return i12;
    }

    public static boolean zzc(zzafz zzafzVar, byte[] bArr, int i10, int i11) throws IOException {
        try {
            zzafzVar.zzc(bArr, i10, i11);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean zzd(zzafz zzafzVar, int i10) throws IOException {
        try {
            zzafzVar.zzf(i10);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean zze(zzafz zzafzVar, byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        try {
            return zzafzVar.zzh(bArr, 0, i11, z10);
        } catch (EOFException e10) {
            if (z10) {
                return false;
            }
            throw e10;
        }
    }

    public static int zzf(int i10) {
        if (i10 == 20) {
            return 63750;
        }
        if (i10 == 30) {
            return 2250000;
        }
        switch (i10) {
            case 5:
                return 80000;
            case 6:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            default:
                switch (i10) {
                    case 14:
                        return 3062500;
                    case 15:
                        return 8000;
                    case 16:
                        return 256000;
                    case 17:
                        return 336000;
                    case 18:
                        return 768000;
                    default:
                        return -2147483647;
                }
        }
    }
}
