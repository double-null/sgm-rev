package com.google.android.gms.internal.auth;

/* JADX INFO: compiled from: com.google.android.gms:play-services-auth-base@@18.0.4 */
/* JADX INFO: loaded from: classes3.dex */
final class zzhm {
    private static final zzhk zza;

    static {
        if (zzhi.zzu() && zzhi.zzv()) {
            int i10 = zzdr.zza;
        }
        zza = new zzhl();
    }

    static /* bridge */ /* synthetic */ int zza(byte[] bArr, int i10, int i11) {
        byte b10 = bArr[i10 - 1];
        int i12 = i11 - i10;
        if (i12 != 0) {
            if (i12 == 1) {
                byte b11 = bArr[i10];
                if (b10 <= -12 && b11 <= -65) {
                    return b10 ^ (b11 << 8);
                }
            } else {
                if (i12 != 2) {
                    throw new AssertionError();
                }
                byte b12 = bArr[i10];
                byte b13 = bArr[i10 + 1];
                if (b10 <= -12 && b12 <= -65 && b13 <= -65) {
                    return ((b12 << 8) ^ b10) ^ (b13 << 16);
                }
            }
        } else if (b10 <= -12) {
            return b10;
        }
        return -1;
    }

    static String zzb(byte[] bArr, int i10, int i11) throws zzfa {
        int length = bArr.length;
        if ((i10 | i11 | ((length - i10) - i11)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i10), Integer.valueOf(i11)));
        }
        int i12 = i10 + i11;
        char[] cArr = new char[i11];
        int i13 = 0;
        while (i10 < i12) {
            byte b10 = bArr[i10];
            if (!zzhj.zzd(b10)) {
                break;
            }
            i10++;
            cArr[i13] = (char) b10;
            i13++;
        }
        while (i10 < i12) {
            int i14 = i10 + 1;
            byte b11 = bArr[i10];
            if (zzhj.zzd(b11)) {
                int i15 = i13 + 1;
                cArr[i13] = (char) b11;
                i10 = i14;
                while (true) {
                    i13 = i15;
                    if (i10 >= i12) {
                        break;
                    }
                    byte b12 = bArr[i10];
                    if (!zzhj.zzd(b12)) {
                        break;
                    }
                    i10++;
                    i15 = i13 + 1;
                    cArr[i13] = (char) b12;
                }
            } else if (b11 < -32) {
                if (i14 >= i12) {
                    throw zzfa.zzb();
                }
                zzhj.zzc(b11, bArr[i14], cArr, i13);
                i10 = i14 + 1;
                i13++;
            } else if (b11 < -16) {
                if (i14 >= i12 - 1) {
                    throw zzfa.zzb();
                }
                int i16 = i14 + 1;
                zzhj.zzb(b11, bArr[i14], bArr[i16], cArr, i13);
                i10 = i16 + 1;
                i13++;
            } else {
                if (i14 >= i12 - 2) {
                    throw zzfa.zzb();
                }
                int i17 = i14 + 1;
                int i18 = i17 + 1;
                zzhj.zza(b11, bArr[i14], bArr[i17], bArr[i18], cArr, i13);
                i13 += 2;
                i10 = i18 + 1;
            }
        }
        return new String(cArr, 0, i13);
    }

    static boolean zzc(byte[] bArr) {
        return zza.zzb(bArr, 0, bArr.length);
    }

    static boolean zzd(byte[] bArr, int i10, int i11) {
        return zza.zzb(bArr, i10, i11);
    }
}
