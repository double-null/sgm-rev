package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzix {
    public static final /* synthetic */ int zza = 0;

    static {
        int i10 = zzet.zza;
    }

    static int zza(String str, byte[] bArr, int i10, int i11) {
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
                        return zziu.zza(str, bArr, i10, i11);
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
                    return zziu.zza(str, bArr, i10, i11);
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

    static boolean zzb(byte[] bArr, int i10, int i11) {
        while (i10 < i11 && bArr[i10] >= 0) {
            i10++;
        }
        if (i10 >= i11) {
            return true;
        }
        while (i10 < i11) {
            int i12 = i10 + 1;
            byte b10 = bArr[i10];
            if (b10 < 0) {
                if (b10 < -32) {
                    if (i12 < i11 && b10 >= -62) {
                        i10 = i12 + 1;
                        if (bArr[i12] > -65) {
                        }
                    }
                    return false;
                }
                if (b10 < -16) {
                    if (i12 < i11 - 1) {
                        int i13 = i12 + 1;
                        byte b11 = bArr[i12];
                        if (b11 <= -65 && ((b10 != -32 || b11 >= -96) && (b10 != -19 || b11 < -96))) {
                            i10 = i13 + 1;
                            if (bArr[i13] > -65) {
                            }
                        }
                    }
                } else if (i12 < i11 - 2) {
                    int i14 = i12 + 1;
                    byte b12 = bArr[i12];
                    if (b12 <= -65 && (((b10 << 28) + (b12 + 112)) >> 30) == 0) {
                        int i15 = i14 + 1;
                        if (bArr[i14] <= -65) {
                            i12 = i15 + 1;
                            if (bArr[i15] > -65) {
                            }
                        }
                    }
                }
                return false;
            }
            i10 = i12;
        }
        return true;
    }
}
