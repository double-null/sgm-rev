package g7;

import com.adjust.sdk.Constants;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f15406a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25};

    /* JADX INFO: renamed from: g7.b$b, reason: collision with other inner class name */
    private static final class C0232b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f15407a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        byte[] f15408b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f15409c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f15410d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f15411e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f15412f;

        private C0232b() {
        }
    }

    private int a(int i10, int i11) {
        int i12 = i10 - Integer.MIN_VALUE;
        int i13 = i11 - Integer.MIN_VALUE;
        if (i12 < i13) {
            return -1;
        }
        return i12 == i13 ? 0 : 1;
    }

    private int b(C0232b c0232b) {
        if (c0232b.f15408b != null) {
            return c0232b.f15409c - c0232b.f15410d;
        }
        return 0;
    }

    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v20 */
    private void c(byte[] bArr, int i10, int i11, C0232b c0232b) {
        byte b10;
        if (c0232b.f15411e) {
            return;
        }
        ?? r10 = 1;
        if (i11 < 0) {
            c0232b.f15411e = true;
        }
        int i12 = 0;
        int i13 = i10;
        while (i12 < i11) {
            int i14 = i13 + 1;
            byte b11 = bArr[i13];
            if (b11 == 61) {
                c0232b.f15411e = r10;
                break;
            }
            byte[] bArrE = e(7, c0232b);
            if (b11 >= 0) {
                byte[] bArr2 = f15406a;
                if (b11 < bArr2.length && (b10 = bArr2[b11]) >= 0) {
                    int i15 = (c0232b.f15412f + r10) % 8;
                    c0232b.f15412f = i15;
                    long j10 = (c0232b.f15407a << 5) + ((long) b10);
                    c0232b.f15407a = j10;
                    if (i15 == 0) {
                        int i16 = c0232b.f15409c;
                        bArrE[i16] = (byte) ((j10 >> 32) & 255);
                        bArrE[i16 + 1] = (byte) ((j10 >> 24) & 255);
                        bArrE[i16 + 2] = (byte) ((j10 >> 16) & 255);
                        bArrE[i16 + 3] = (byte) ((j10 >> 8) & 255);
                        c0232b.f15409c = i16 + 5;
                        bArrE[i16 + 4] = (byte) (j10 & 255);
                    }
                }
            }
            i12++;
            i13 = i14;
            r10 = 1;
        }
        if (!c0232b.f15411e || c0232b.f15412f <= 0) {
            return;
        }
        byte[] bArrE2 = e(7, c0232b);
        switch (c0232b.f15412f) {
            case 1:
            case 2:
                int i17 = c0232b.f15409c;
                c0232b.f15409c = i17 + 1;
                bArrE2[i17] = (byte) ((c0232b.f15407a >> 2) & 255);
                return;
            case 3:
                int i18 = c0232b.f15409c;
                c0232b.f15409c = i18 + 1;
                bArrE2[i18] = (byte) ((c0232b.f15407a >> 7) & 255);
                return;
            case 4:
                long j11 = c0232b.f15407a;
                long j12 = j11 >> 4;
                c0232b.f15407a = j12;
                int i19 = c0232b.f15409c;
                bArrE2[i19] = (byte) ((j11 >> 12) & 255);
                c0232b.f15409c = i19 + 2;
                bArrE2[i19 + 1] = (byte) (j12 & 255);
                return;
            case 5:
                long j13 = c0232b.f15407a;
                long j14 = j13 >> 1;
                c0232b.f15407a = j14;
                int i20 = c0232b.f15409c;
                bArrE2[i20] = (byte) ((j13 >> 17) & 255);
                bArrE2[i20 + 1] = (byte) ((j13 >> 9) & 255);
                c0232b.f15409c = i20 + 3;
                bArrE2[i20 + 2] = (byte) (j14 & 255);
                return;
            case 6:
                long j15 = c0232b.f15407a;
                long j16 = j15 >> 6;
                c0232b.f15407a = j16;
                int i21 = c0232b.f15409c;
                bArrE2[i21] = (byte) ((j15 >> 22) & 255);
                bArrE2[i21 + 1] = (byte) ((j15 >> 14) & 255);
                c0232b.f15409c = i21 + 3;
                bArrE2[i21 + 2] = (byte) (j16 & 255);
                return;
            case 7:
                long j17 = c0232b.f15407a;
                long j18 = j17 >> 3;
                c0232b.f15407a = j18;
                int i22 = c0232b.f15409c;
                bArrE2[i22] = (byte) ((j17 >> 27) & 255);
                bArrE2[i22 + 1] = (byte) ((j17 >> 19) & 255);
                bArrE2[i22 + 2] = (byte) ((j17 >> 11) & 255);
                c0232b.f15409c = i22 + 4;
                bArrE2[i22 + 3] = (byte) (j18 & 255);
                return;
            default:
                throw new IllegalStateException("Impossible modulus " + c0232b.f15412f);
        }
    }

    private void d(byte[] bArr, int i10, C0232b c0232b) {
        if (c0232b.f15408b != null) {
            int iMin = Math.min(b(c0232b), i10);
            System.arraycopy(c0232b.f15408b, c0232b.f15410d, bArr, 0, iMin);
            int i11 = c0232b.f15410d + iMin;
            c0232b.f15410d = i11;
            if (i11 >= c0232b.f15409c) {
                c0232b.f15408b = null;
            }
        }
    }

    private byte[] e(int i10, C0232b c0232b) {
        byte[] bArr = c0232b.f15408b;
        if (bArr == null) {
            c0232b.f15408b = new byte[Math.max(i10, 8192)];
            c0232b.f15409c = 0;
            c0232b.f15410d = 0;
        } else {
            int i11 = c0232b.f15409c + i10;
            if (i11 - bArr.length > 0) {
                return f(c0232b, i11);
            }
        }
        return c0232b.f15408b;
    }

    private byte[] f(C0232b c0232b, int i10) {
        int length = c0232b.f15408b.length * 2;
        if (a(length, i10) < 0) {
            length = i10;
        }
        if (a(length, 2147483639) > 0) {
            length = Math.max(i10, 2147483639);
        }
        byte[] bArr = new byte[length];
        byte[] bArr2 = c0232b.f15408b;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        c0232b.f15408b = bArr;
        return bArr;
    }

    public String g(String str) {
        return h(str.getBytes(Charset.forName(Constants.ENCODING)));
    }

    public String h(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return new String(bArr);
        }
        C0232b c0232b = new C0232b();
        c(bArr, 0, bArr.length, c0232b);
        c(bArr, 0, -1, c0232b);
        int i10 = c0232b.f15409c;
        byte[] bArr2 = new byte[i10];
        d(bArr2, i10, c0232b);
        return new String(bArr2);
    }
}
