package com.google.android.gms.internal.play_billing;

import java.io.IOException;

/* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzev {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzb = 100;

    static int zza(byte[] bArr, int i10, zzeu zzeuVar) throws zzgs {
        int iZzi = zzi(bArr, i10, zzeuVar);
        int i11 = zzeuVar.zza;
        if (i11 < 0) {
            throw new zzgs("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i11 > bArr.length - iZzi) {
            throw new zzgs("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i11 == 0) {
            zzeuVar.zzc = zzfg.zza;
            return iZzi;
        }
        zzeuVar.zzc = zzfg.zzk(bArr, iZzi, i11);
        return iZzi + i11;
    }

    static int zzb(byte[] bArr, int i10) {
        int i11 = bArr[i10] & 255;
        int i12 = bArr[i10 + 1] & 255;
        int i13 = bArr[i10 + 2] & 255;
        return ((bArr[i10 + 3] & 255) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    static int zzc(zzhw zzhwVar, byte[] bArr, int i10, int i11, int i12, zzeu zzeuVar) throws IOException {
        Object objZze = zzhwVar.zze();
        int iZzm = zzm(objZze, zzhwVar, bArr, i10, i11, i12, zzeuVar);
        zzhwVar.zzf(objZze);
        zzeuVar.zzc = objZze;
        return iZzm;
    }

    static int zzd(zzhw zzhwVar, byte[] bArr, int i10, int i11, zzeu zzeuVar) throws IOException {
        Object objZze = zzhwVar.zze();
        int iZzn = zzn(objZze, zzhwVar, bArr, i10, i11, zzeuVar);
        zzhwVar.zzf(objZze);
        zzeuVar.zzc = objZze;
        return iZzn;
    }

    static int zze(zzhw zzhwVar, int i10, byte[] bArr, int i11, int i12, zzgl zzglVar, zzeu zzeuVar) throws IOException {
        int iZzd = zzd(zzhwVar, bArr, i11, i12, zzeuVar);
        zzglVar.add(zzeuVar.zzc);
        while (iZzd < i12) {
            int iZzi = zzi(bArr, iZzd, zzeuVar);
            if (i10 != zzeuVar.zza) {
                break;
            }
            iZzd = zzd(zzhwVar, bArr, iZzi, i12, zzeuVar);
            zzglVar.add(zzeuVar.zzc);
        }
        return iZzd;
    }

    static int zzf(byte[] bArr, int i10, zzgl zzglVar, zzeu zzeuVar) throws IOException {
        zzgh zzghVar = (zzgh) zzglVar;
        int iZzi = zzi(bArr, i10, zzeuVar);
        int i11 = zzeuVar.zza;
        if (i11 < 0) {
            throw new zzgs("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i11 > bArr.length - iZzi) {
            throw new zzgs("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i12 = i11 + iZzi;
        while (iZzi < i12) {
            iZzi = zzi(bArr, iZzi, zzeuVar);
            zzghVar.zzh(zzeuVar.zza);
        }
        if (iZzi == i12) {
            return iZzi;
        }
        throw new zzgs("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int zzg(byte[] bArr, int i10, zzeu zzeuVar) throws zzgs {
        int iZzi = zzi(bArr, i10, zzeuVar);
        int i11 = zzeuVar.zza;
        if (i11 < 0) {
            throw new zzgs("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i11 == 0) {
            zzeuVar.zzc = "";
            return iZzi;
        }
        int i12 = zzix.zza;
        int length = bArr.length;
        if ((((length - iZzi) - i11) | iZzi | i11) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(iZzi), Integer.valueOf(i11)));
        }
        int i13 = iZzi + i11;
        char[] cArr = new char[i11];
        int i14 = 0;
        while (iZzi < i13) {
            byte b10 = bArr[iZzi];
            if (!zzit.zzd(b10)) {
                break;
            }
            iZzi++;
            cArr[i14] = (char) b10;
            i14++;
        }
        while (iZzi < i13) {
            int i15 = iZzi + 1;
            byte b11 = bArr[iZzi];
            if (zzit.zzd(b11)) {
                int i16 = i14 + 1;
                cArr[i14] = (char) b11;
                iZzi = i15;
                while (true) {
                    i14 = i16;
                    if (iZzi >= i13) {
                        break;
                    }
                    byte b12 = bArr[iZzi];
                    if (!zzit.zzd(b12)) {
                        break;
                    }
                    iZzi++;
                    i16 = i14 + 1;
                    cArr[i14] = (char) b12;
                }
            } else if (b11 < -32) {
                if (i15 >= i13) {
                    throw new zzgs("Protocol message had invalid UTF-8.");
                }
                zzit.zzc(b11, bArr[i15], cArr, i14);
                i14++;
                iZzi = i15 + 1;
            } else if (b11 < -16) {
                if (i15 >= i13 - 1) {
                    throw new zzgs("Protocol message had invalid UTF-8.");
                }
                int i17 = i15 + 1;
                zzit.zzb(b11, bArr[i15], bArr[i17], cArr, i14);
                i14++;
                iZzi = i17 + 1;
            } else {
                if (i15 >= i13 - 2) {
                    throw new zzgs("Protocol message had invalid UTF-8.");
                }
                int i18 = i15 + 1;
                byte b13 = bArr[i15];
                int i19 = i18 + 1;
                zzit.zza(b11, b13, bArr[i18], bArr[i19], cArr, i14);
                i14 += 2;
                iZzi = i19 + 1;
            }
        }
        zzeuVar.zzc = new String(cArr, 0, i14);
        return i13;
    }

    static int zzh(int i10, byte[] bArr, int i11, int i12, zzim zzimVar, zzeu zzeuVar) throws zzgs {
        if ((i10 >>> 3) == 0) {
            throw new zzgs("Protocol message contained an invalid tag (zero).");
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int iZzl = zzl(bArr, i11, zzeuVar);
            zzimVar.zzj(i10, Long.valueOf(zzeuVar.zzb));
            return iZzl;
        }
        if (i13 == 1) {
            zzimVar.zzj(i10, Long.valueOf(zzp(bArr, i11)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int iZzi = zzi(bArr, i11, zzeuVar);
            int i14 = zzeuVar.zza;
            if (i14 < 0) {
                throw new zzgs("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i14 > bArr.length - iZzi) {
                throw new zzgs("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i14 == 0) {
                zzimVar.zzj(i10, zzfg.zza);
            } else {
                zzimVar.zzj(i10, zzfg.zzk(bArr, iZzi, i14));
            }
            return iZzi + i14;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw new zzgs("Protocol message contained an invalid tag (zero).");
            }
            zzimVar.zzj(i10, Integer.valueOf(zzb(bArr, i11)));
            return i11 + 4;
        }
        int i15 = (i10 & (-8)) | 4;
        zzim zzimVarZzf = zzim.zzf();
        int i16 = zzeuVar.zze + 1;
        zzeuVar.zze = i16;
        zzq(i16);
        int i17 = 0;
        while (i11 < i12) {
            int iZzi2 = zzi(bArr, i11, zzeuVar);
            i17 = zzeuVar.zza;
            if (i17 == i15) {
                i11 = iZzi2;
                break;
            }
            i11 = zzh(i17, bArr, iZzi2, i12, zzimVarZzf, zzeuVar);
        }
        zzeuVar.zze--;
        if (i11 > i12 || i17 != i15) {
            throw new zzgs("Failed to parse the message.");
        }
        zzimVar.zzj(i10, zzimVarZzf);
        return i11;
    }

    static int zzi(byte[] bArr, int i10, zzeu zzeuVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return zzj(b10, bArr, i11, zzeuVar);
        }
        zzeuVar.zza = b10;
        return i11;
    }

    static int zzj(int i10, byte[] bArr, int i11, zzeu zzeuVar) {
        byte b10 = bArr[i11];
        int i12 = i11 + 1;
        int i13 = i10 & 127;
        if (b10 >= 0) {
            zzeuVar.zza = i13 | (b10 << 7);
            return i12;
        }
        int i14 = i13 | ((b10 & 127) << 7);
        int i15 = i12 + 1;
        byte b11 = bArr[i12];
        if (b11 >= 0) {
            zzeuVar.zza = i14 | (b11 << 14);
            return i15;
        }
        int i16 = i14 | ((b11 & 127) << 14);
        int i17 = i15 + 1;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            zzeuVar.zza = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & 127) << 21);
        int i19 = i17 + 1;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            zzeuVar.zza = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & 127) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                zzeuVar.zza = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    static int zzk(int i10, byte[] bArr, int i11, int i12, zzgl zzglVar, zzeu zzeuVar) {
        zzgh zzghVar = (zzgh) zzglVar;
        int iZzi = zzi(bArr, i11, zzeuVar);
        zzghVar.zzh(zzeuVar.zza);
        while (iZzi < i12) {
            int iZzi2 = zzi(bArr, iZzi, zzeuVar);
            if (i10 != zzeuVar.zza) {
                break;
            }
            iZzi = zzi(bArr, iZzi2, zzeuVar);
            zzghVar.zzh(zzeuVar.zza);
        }
        return iZzi;
    }

    static int zzl(byte[] bArr, int i10, zzeu zzeuVar) {
        long j10 = bArr[i10];
        int i11 = i10 + 1;
        if (j10 >= 0) {
            zzeuVar.zzb = j10;
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
        zzeuVar.zzb = j11;
        return i12;
    }

    static int zzm(Object obj, zzhw zzhwVar, byte[] bArr, int i10, int i11, int i12, zzeu zzeuVar) throws IOException {
        zzhp zzhpVar = (zzhp) zzhwVar;
        int i13 = zzeuVar.zze + 1;
        zzeuVar.zze = i13;
        zzq(i13);
        int iZzc = zzhpVar.zzc(obj, bArr, i10, i11, i12, zzeuVar);
        zzeuVar.zze--;
        zzeuVar.zzc = obj;
        return iZzc;
    }

    static int zzn(Object obj, zzhw zzhwVar, byte[] bArr, int i10, int i11, zzeu zzeuVar) throws IOException {
        int iZzj = i10 + 1;
        int i12 = bArr[i10];
        if (i12 < 0) {
            iZzj = zzj(i12, bArr, iZzj, zzeuVar);
            i12 = zzeuVar.zza;
        }
        int i13 = iZzj;
        if (i12 < 0 || i12 > i11 - i13) {
            throw new zzgs("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i14 = zzeuVar.zze + 1;
        zzeuVar.zze = i14;
        zzq(i14);
        int i15 = i12 + i13;
        zzhwVar.zzh(obj, bArr, i13, i15, zzeuVar);
        zzeuVar.zze--;
        zzeuVar.zzc = obj;
        return i15;
    }

    static int zzo(int i10, byte[] bArr, int i11, int i12, zzeu zzeuVar) throws zzgs {
        if ((i10 >>> 3) == 0) {
            throw new zzgs("Protocol message contained an invalid tag (zero).");
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            return zzl(bArr, i11, zzeuVar);
        }
        if (i13 == 1) {
            return i11 + 8;
        }
        if (i13 == 2) {
            return zzi(bArr, i11, zzeuVar) + zzeuVar.zza;
        }
        if (i13 != 3) {
            if (i13 == 5) {
                return i11 + 4;
            }
            throw new zzgs("Protocol message contained an invalid tag (zero).");
        }
        int i14 = (i10 & (-8)) | 4;
        int i15 = zzeuVar.zze + 1;
        zzeuVar.zze = i15;
        zzq(i15);
        int i16 = 0;
        while (i11 < i12) {
            i11 = zzi(bArr, i11, zzeuVar);
            i16 = zzeuVar.zza;
            if (i16 == i14) {
                break;
            }
            i11 = zzo(i16, bArr, i11, i12, zzeuVar);
        }
        zzeuVar.zze--;
        if (i11 > i12 || i16 != i14) {
            throw new zzgs("Failed to parse the message.");
        }
        return i11;
    }

    static long zzp(byte[] bArr, int i10) {
        return (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48) | ((((long) bArr[i10 + 7]) & 255) << 56);
    }

    private static void zzq(int i10) throws zzgs {
        if (i10 >= zzb) {
            throw new zzgs("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
