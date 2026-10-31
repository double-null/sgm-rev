package com.google.android.gms.internal.ads;

import com.applovin.shadow.okio.Utf8;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzihb {
    static /* synthetic */ boolean zza(byte b10) {
        return b10 >= 0;
    }

    static /* synthetic */ void zzb(byte b10, byte b11, char[] cArr, int i10) throws zziet {
        if (b10 < -62 || zze(b11)) {
            throw new zziet("Protocol message had invalid UTF-8.");
        }
        cArr[i10] = (char) (((b10 & 31) << 6) | (b11 & Utf8.REPLACEMENT_BYTE));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0013 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:11:0x0015  */
    /* JADX WARN: Code duplicated, block: B:12:0x0016 A[PHI: r2
      0x0016: PHI (r2v3 byte) = (r2v2 byte), (r2v9 byte) binds: [B:9:0x0011, B:11:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x001c  */
    static /* synthetic */ void zzc(byte b10, byte b11, byte b12, char[] cArr, int i10) throws zziet {
        if (!zze(b11)) {
            if (b10 != -32) {
                if (b10 != -19) {
                    if (!zze(b12)) {
                        cArr[i10] = (char) (((b10 & 15) << 12) | ((b11 & Utf8.REPLACEMENT_BYTE) << 6) | (b12 & Utf8.REPLACEMENT_BYTE));
                        return;
                    }
                } else if (b11 < -96) {
                    b10 = -19;
                    if (!zze(b12)) {
                        cArr[i10] = (char) (((b10 & 15) << 12) | ((b11 & Utf8.REPLACEMENT_BYTE) << 6) | (b12 & Utf8.REPLACEMENT_BYTE));
                        return;
                    }
                }
            } else if (b11 >= -96) {
                b10 = -32;
                if (b10 != -19) {
                    if (!zze(b12)) {
                        cArr[i10] = (char) (((b10 & 15) << 12) | ((b11 & Utf8.REPLACEMENT_BYTE) << 6) | (b12 & Utf8.REPLACEMENT_BYTE));
                        return;
                    }
                } else if (b11 < -96) {
                    b10 = -19;
                    if (!zze(b12)) {
                        cArr[i10] = (char) (((b10 & 15) << 12) | ((b11 & Utf8.REPLACEMENT_BYTE) << 6) | (b12 & Utf8.REPLACEMENT_BYTE));
                        return;
                    }
                }
            }
        }
        throw new zziet("Protocol message had invalid UTF-8.");
    }

    static /* synthetic */ void zzd(byte b10, byte b11, byte b12, byte b13, char[] cArr, int i10) throws zziet {
        if (zze(b11) || (((b10 << 28) + (b11 + 112)) >> 30) != 0 || zze(b12) || zze(b13)) {
            throw new zziet("Protocol message had invalid UTF-8.");
        }
        int i11 = ((b10 & 7) << 18) | ((b11 & Utf8.REPLACEMENT_BYTE) << 12) | ((b12 & Utf8.REPLACEMENT_BYTE) << 6) | (b13 & Utf8.REPLACEMENT_BYTE);
        cArr[i10] = (char) ((i11 >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
        cArr[i10 + 1] = (char) ((i11 & 1023) + Utf8.LOG_SURROGATE_HEADER);
    }

    private static boolean zze(byte b10) {
        return b10 > -65;
    }
}
