package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzihd extends zzihc {
    zzihd() {
    }

    @Override // com.google.android.gms.internal.ads.zzihc
    public final boolean zza(byte[] bArr, int i10, int i11) {
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
