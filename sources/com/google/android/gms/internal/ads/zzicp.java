package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzicp {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzb = 100;

    static int zza(byte[] bArr, int i10, zzico zzicoVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return zzb(b10, bArr, i11, zzicoVar);
        }
        zzicoVar.zza = b10;
        return i11;
    }

    static int zzb(int i10, byte[] bArr, int i11, zzico zzicoVar) {
        byte b10 = bArr[i11];
        int i12 = i11 + 1;
        int i13 = i10 & 127;
        if (b10 >= 0) {
            zzicoVar.zza = i13 | (b10 << 7);
            return i12;
        }
        int i14 = i13 | ((b10 & 127) << 7);
        int i15 = i12 + 1;
        byte b11 = bArr[i12];
        if (b11 >= 0) {
            zzicoVar.zza = i14 | (b11 << 14);
            return i15;
        }
        int i16 = i14 | ((b11 & 127) << 14);
        int i17 = i15 + 1;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            zzicoVar.zza = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & 127) << 21);
        int i19 = i17 + 1;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            zzicoVar.zza = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & 127) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                zzicoVar.zza = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    static int zzc(byte[] bArr, int i10, zzico zzicoVar) {
        long j10 = bArr[i10];
        int i11 = i10 + 1;
        if (j10 >= 0) {
            zzicoVar.zzb = j10;
            return i11;
        }
        int i12 = i11 + 1;
        byte b10 = bArr[i11];
        long j11 = (j10 & 127) | (((long) (b10 & 127)) << 7);
        int i13 = 7;
        while (b10 < 0) {
            int i14 = i12 + 1;
            byte b11 = bArr[i12];
            i13 += 7;
            j11 |= ((long) (b11 & 127)) << i13;
            i12 = i14;
            b10 = b11;
        }
        zzicoVar.zzb = j11;
        return i12;
    }

    static int zzd(byte[] bArr, int i10) {
        int i11 = bArr[i10] & 255;
        int i12 = bArr[i10 + 1] & 255;
        int i13 = bArr[i10 + 2] & 255;
        return ((bArr[i10 + 3] & 255) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    static long zze(byte[] bArr, int i10) {
        return (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48) | ((((long) bArr[i10 + 7]) & 255) << 56);
    }

    static int zzf(byte[] bArr, int i10, zzico zzicoVar) throws zziet {
        int iZza = zza(bArr, i10, zzicoVar);
        int i11 = zzicoVar.zza;
        if (i11 < 0) {
            throw new zziet("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i11 == 0) {
            zzicoVar.zzc = "";
            return iZza;
        }
        zzicoVar.zzc = zzihf.zze(bArr, iZza, i11);
        return iZza + i11;
    }

    static int zzg(byte[] bArr, int i10, zzico zzicoVar) throws zziet {
        int iZza = zza(bArr, i10, zzicoVar);
        int i11 = zzicoVar.zza;
        if (i11 < 0) {
            throw new zziet("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i11 > bArr.length - iZza) {
            throw new zziet("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i11 == 0) {
            zzicoVar.zzc = zzida.zza;
            return iZza;
        }
        zzicoVar.zzc = zzida.zzt(bArr, iZza, i11);
        return iZza + i11;
    }

    static int zzh(zzigh zzighVar, byte[] bArr, int i10, int i11, zzico zzicoVar) throws IOException {
        Object objZza = zzighVar.zza();
        int iZzj = zzj(objZza, zzighVar, bArr, i10, i11, zzicoVar);
        zzighVar.zzk(objZza);
        zzicoVar.zzc = objZza;
        return iZzj;
    }

    static int zzi(zzigh zzighVar, byte[] bArr, int i10, int i11, int i12, zzico zzicoVar) throws IOException {
        Object objZza = zzighVar.zza();
        int iZzk = zzk(objZza, zzighVar, bArr, i10, i11, i12, zzicoVar);
        zzighVar.zzk(objZza);
        zzicoVar.zzc = objZza;
        return iZzk;
    }

    static int zzj(Object obj, zzigh zzighVar, byte[] bArr, int i10, int i11, zzico zzicoVar) throws IOException {
        int iZzb = i10 + 1;
        int i12 = bArr[i10];
        if (i12 < 0) {
            iZzb = zzb(i12, bArr, iZzb, zzicoVar);
            i12 = zzicoVar.zza;
        }
        int i13 = iZzb;
        if (i12 < 0 || i12 > i11 - i13) {
            throw new zziet("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i14 = zzicoVar.zze + 1;
        zzicoVar.zze = i14;
        zzq(i14);
        int i15 = i12 + i13;
        zzighVar.zzj(obj, bArr, i13, i15, zzicoVar);
        zzicoVar.zze--;
        zzicoVar.zzc = obj;
        return i15;
    }

    static int zzk(Object obj, zzigh zzighVar, byte[] bArr, int i10, int i11, int i12, zzico zzicoVar) throws IOException {
        zzifs zzifsVar = (zzifs) zzighVar;
        int i13 = zzicoVar.zze + 1;
        zzicoVar.zze = i13;
        zzq(i13);
        int iZzi = zzifsVar.zzi(obj, bArr, i10, i11, i12, zzicoVar);
        zzicoVar.zze--;
        zzicoVar.zzc = obj;
        return iZzi;
    }

    static int zzl(int i10, byte[] bArr, int i11, int i12, zzieq zzieqVar, zzico zzicoVar) {
        zzief zziefVar = (zzief) zzieqVar;
        int iZza = zza(bArr, i11, zzicoVar);
        zziefVar.zzi(zzicoVar.zza);
        while (iZza < i12) {
            int iZza2 = zza(bArr, iZza, zzicoVar);
            if (i10 != zzicoVar.zza) {
                break;
            }
            iZza = zza(bArr, iZza2, zzicoVar);
            zziefVar.zzi(zzicoVar.zza);
        }
        return iZza;
    }

    static int zzm(byte[] bArr, int i10, zzieq zzieqVar, zzico zzicoVar) throws IOException {
        zzief zziefVar = (zzief) zzieqVar;
        int iZza = zza(bArr, i10, zzicoVar);
        int i11 = zzicoVar.zza + iZza;
        while (iZza < i11) {
            iZza = zza(bArr, iZza, zzicoVar);
            zziefVar.zzi(zzicoVar.zza);
        }
        if (iZza == i11) {
            return iZza;
        }
        throw new zziet("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int zzn(zzigh zzighVar, int i10, byte[] bArr, int i11, int i12, zzieq zzieqVar, zzico zzicoVar) throws IOException {
        int iZzh = zzh(zzighVar, bArr, i11, i12, zzicoVar);
        zzieqVar.add(zzicoVar.zzc);
        while (iZzh < i12) {
            int iZza = zza(bArr, iZzh, zzicoVar);
            if (i10 != zzicoVar.zza) {
                break;
            }
            iZzh = zzh(zzighVar, bArr, iZza, i12, zzicoVar);
            zzieqVar.add(zzicoVar.zzc);
        }
        return iZzh;
    }

    static int zzo(int i10, byte[] bArr, int i11, int i12, zzigu zziguVar, zzico zzicoVar) throws zziet {
        if ((i10 >>> 3) == 0) {
            throw new zziet("Protocol message contained an invalid tag (zero).");
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int iZzc = zzc(bArr, i11, zzicoVar);
            zziguVar.zzk(i10, Long.valueOf(zzicoVar.zzb));
            return iZzc;
        }
        if (i13 == 1) {
            zziguVar.zzk(i10, Long.valueOf(zze(bArr, i11)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int iZza = zza(bArr, i11, zzicoVar);
            int i14 = zzicoVar.zza;
            if (i14 < 0) {
                throw new zziet("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i14 > bArr.length - iZza) {
                throw new zziet("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i14 == 0) {
                zziguVar.zzk(i10, zzida.zza);
            } else {
                zziguVar.zzk(i10, zzida.zzt(bArr, iZza, i14));
            }
            return iZza + i14;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw new zziet("Protocol message contained an invalid tag (zero).");
            }
            zziguVar.zzk(i10, Integer.valueOf(zzd(bArr, i11)));
            return i11 + 4;
        }
        int i15 = (i10 & (-8)) | 4;
        zzigu zziguVarZzb = zzigu.zzb();
        int i16 = zzicoVar.zze + 1;
        zzicoVar.zze = i16;
        zzq(i16);
        int i17 = 0;
        while (i11 < i12) {
            int iZza2 = zza(bArr, i11, zzicoVar);
            i17 = zzicoVar.zza;
            if (i17 == i15) {
                i11 = iZza2;
                break;
            }
            i11 = zzo(i17, bArr, iZza2, i12, zziguVarZzb, zzicoVar);
        }
        zzicoVar.zze--;
        if (i11 > i12 || i17 != i15) {
            throw new zziet("Failed to parse the message.");
        }
        zziguVar.zzk(i10, zziguVarZzb);
        return i11;
    }

    static int zzp(int i10, byte[] bArr, int i11, int i12, zzico zzicoVar) throws zziet {
        if ((i10 >>> 3) == 0) {
            throw new zziet("Protocol message contained an invalid tag (zero).");
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            return zzc(bArr, i11, zzicoVar);
        }
        if (i13 == 1) {
            return i11 + 8;
        }
        if (i13 == 2) {
            return zza(bArr, i11, zzicoVar) + zzicoVar.zza;
        }
        if (i13 != 3) {
            if (i13 == 5) {
                return i11 + 4;
            }
            throw new zziet("Protocol message contained an invalid tag (zero).");
        }
        int i14 = (i10 & (-8)) | 4;
        int i15 = 0;
        while (i11 < i12) {
            i11 = zza(bArr, i11, zzicoVar);
            i15 = zzicoVar.zza;
            if (i15 == i14) {
                break;
            }
            i11 = zzp(i15, bArr, i11, i12, zzicoVar);
        }
        if (i11 > i12 || i15 != i14) {
            throw new zziet("Failed to parse the message.");
        }
        return i11;
    }

    private static void zzq(int i10) throws zziet {
        if (i10 >= zzb) {
            throw new zziet("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
