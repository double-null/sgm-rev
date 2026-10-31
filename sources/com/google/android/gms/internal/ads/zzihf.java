package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzihf {
    private static final zzihc zza;

    static {
        int i10 = zzicn.zza;
        zza = new zzihd();
    }

    static boolean zza(byte[] bArr) {
        return zza.zza(bArr, 0, bArr.length);
    }

    static boolean zzb(byte[] bArr, int i10, int i11) {
        return zza.zza(bArr, i10, i11);
    }

    static int zzc(String str) {
        int length = str.length();
        int i10 = 0;
        int i11 = 0;
        while (i11 < length && str.charAt(i11) < 128) {
            i11++;
        }
        int i12 = length;
        while (i11 < length) {
            char cCharAt = str.charAt(i11);
            if (cCharAt >= 2048) {
                try {
                    int length2 = str.length();
                    while (i11 < length2) {
                        char cCharAt2 = str.charAt(i11);
                        if (cCharAt2 < 2048) {
                            i10 += (127 - cCharAt2) >>> 31;
                        } else {
                            i10 += 2;
                            if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                                if (Character.codePointAt(str, i11) < 65536) {
                                    throw new zzihe(i11, length2);
                                }
                                i11++;
                            }
                        }
                        i11++;
                    }
                    i12 += i10;
                    break;
                } catch (zzihe unused) {
                    return str.getBytes(StandardCharsets.UTF_8).length;
                }
            }
            i12 += (127 - cCharAt) >>> 31;
            i11++;
        }
        if (i12 >= length) {
            return i12;
        }
        long j10 = ((long) i12) + 4294967296L;
        StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + 34);
        sb2.append("UTF-8 length does not fit in int: ");
        sb2.append(j10);
        throw new IllegalArgumentException(sb2.toString());
    }

    static int zzd(String str, byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        char cCharAt;
        int length = str.length();
        int i15 = 0;
        while (true) {
            i12 = i10 + i11;
            if (i15 >= length || (i14 = i15 + i10) >= i12 || (cCharAt = str.charAt(i15)) >= 128) {
                break;
            }
            bArr[i14] = (byte) cCharAt;
            i15++;
        }
        if (i15 == length) {
            return i10 + length;
        }
        int i16 = i10 + i15;
        while (i15 < length) {
            char cCharAt2 = str.charAt(i15);
            if (cCharAt2 < 128 && i16 < i12) {
                bArr[i16] = (byte) cCharAt2;
                i16++;
            } else if (cCharAt2 < 2048 && i16 <= i12 - 2) {
                int i17 = i16 + 1;
                bArr[i16] = (byte) ((cCharAt2 >>> 6) | 960);
                bArr[i17] = (byte) ((cCharAt2 & '?') | 128);
                i16 = i17 + 1;
            } else {
                if ((cCharAt2 >= 55296 && cCharAt2 <= 57343) || i16 > i12 - 3) {
                    if (i16 > i12 - 4) {
                        if (cCharAt2 < 55296 || cCharAt2 > 57343 || ((i13 = i15 + 1) != str.length() && Character.isSurrogatePair(cCharAt2, str.charAt(i13)))) {
                            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
                        }
                        return zzihc.zzb(str, bArr, i10, i11);
                    }
                    i15++;
                    if (i15 != str.length()) {
                        char cCharAt3 = str.charAt(i15);
                        if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                            int i18 = i16 + 1;
                            int i19 = i18 + 1;
                            int i20 = i19 + 1;
                            int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                            bArr[i16] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i18] = (byte) (((codePoint >>> 12) & 63) | 128);
                            bArr[i19] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i16 = i20 + 1;
                            bArr[i20] = (byte) ((codePoint & 63) | 128);
                        }
                    }
                    return zzihc.zzb(str, bArr, i10, i11);
                }
                int i21 = i16 + 1;
                int i22 = i21 + 1;
                bArr[i16] = (byte) ((cCharAt2 >>> '\f') | 480);
                bArr[i21] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                bArr[i22] = (byte) ((cCharAt2 & '?') | 128);
                i16 = i22 + 1;
            }
            i15++;
        }
        return i16;
    }

    static String zze(byte[] bArr, int i10, int i11) throws zziet {
        if (i11 == 0) {
            return "";
        }
        int length = bArr.length;
        if ((((length - i10) - i11) | i10 | i11) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i10), Integer.valueOf(i11)));
        }
        int i12 = i10 + i11;
        char[] cArr = new char[i11];
        int i13 = 0;
        while (i10 < i12) {
            byte b10 = bArr[i10];
            if (!zzihb.zza(b10)) {
                break;
            }
            i10++;
            cArr[i13] = (char) b10;
            i13++;
        }
        while (i10 < i12) {
            int i14 = i10 + 1;
            byte b11 = bArr[i10];
            if (zzihb.zza(b11)) {
                int i15 = i13 + 1;
                cArr[i13] = (char) b11;
                i10 = i14;
                while (true) {
                    i13 = i15;
                    if (i10 >= i12) {
                        break;
                    }
                    byte b12 = bArr[i10];
                    if (!zzihb.zza(b12)) {
                        break;
                    }
                    i10++;
                    i15 = i13 + 1;
                    cArr[i13] = (char) b12;
                }
            } else if (b11 < -32) {
                if (i14 >= i12) {
                    throw new zziet("Protocol message had invalid UTF-8.");
                }
                zzihb.zzb(b11, bArr[i14], cArr, i13);
                i13++;
                i10 = i14 + 1;
            } else if (b11 < -16) {
                if (i14 >= i12 - 1) {
                    throw new zziet("Protocol message had invalid UTF-8.");
                }
                int i16 = i14 + 1;
                zzihb.zzc(b11, bArr[i14], bArr[i16], cArr, i13);
                i13++;
                i10 = i16 + 1;
            } else {
                if (i14 >= i12 - 2) {
                    throw new zziet("Protocol message had invalid UTF-8.");
                }
                int i17 = i14 + 1;
                byte b13 = bArr[i14];
                int i18 = i17 + 1;
                zzihb.zzd(b11, b13, bArr[i17], bArr[i18], cArr, i13);
                i13 += 2;
                i10 = i18 + 1;
            }
        }
        return new String(cArr, 0, i13);
    }
}
