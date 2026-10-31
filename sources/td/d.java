package td;

import rd.f;

/* JADX INFO: compiled from: Uuid.kt */
/* JADX INFO: loaded from: classes5.dex */
class d extends c {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(String str, int i10) {
        if (str.charAt(i10) == '-') {
            return;
        }
        throw new IllegalArgumentException(("Expected '-' (hyphen) at index " + i10 + ", but was '" + str.charAt(i10) + '\'').toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(long j10, byte[] bArr, int i10, int i11) {
        int i12 = i10 + (i11 * 2);
        for (int i13 = 0; i13 < i11; i13++) {
            int i14 = f.d()[(int) (255 & j10)];
            int i15 = i12 - 1;
            bArr[i15] = (byte) i14;
            i12 = i15 - 1;
            bArr[i12] = (byte) (i14 >> 8);
            j10 >>= 8;
        }
    }
}
