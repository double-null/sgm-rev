package com.facebook.ads.redexgen.core;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Gd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC0909Gd {
    public static String[] A00 = {"o6dy0jxWVFoVpdfIHLQ5kJFOMlq1Sn1Q", "79oj", "9g10QGOLUMPWkkbPiEKlPZ6GdmncXBXa", "6fmIgIVXmOYY3cUB7ZYAXnWSgE20TitB", "v6a7Yb3DANDL70kkwlzLnkI1heNzynkm", "eDdjZQkAYxVEYJ3d9Q78IvgSo191T7ve", "sHmXnPOOobIrXpWrquJBTDw1maWJKk3u", "k0vF7vRBeJQaOBXZ"};

    public static int A00(C4J c4j, int i10) {
        switch (i10) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i10 - 2);
            case 6:
                return c4j.A0I() + 1;
            case 7:
                int iA0M = c4j.A0M();
                String[] strArr = A00;
                if (strArr[6].charAt(23) != strArr[4].charAt(23)) {
                    throw new RuntimeException();
                }
                A00[7] = "hcXiJWofr5Txci555yuma5X";
                return iA0M + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return UserVerificationMethods.USER_VERIFY_HANDPRINT << (i10 - 8);
            default:
                return -1;
        }
    }

    public static long A01(InterfaceC2087lN interfaceC2087lN, C0913Gh c0913Gh) throws IOException {
        interfaceC2087lN.AI1();
        boolean z10 = true;
        interfaceC2087lN.A3z(1);
        byte[] bArr = new byte[1];
        interfaceC2087lN.AG9(bArr, 0, 1);
        if ((bArr[0] & 1) != 1) {
            z10 = false;
        }
        interfaceC2087lN.A3z(2);
        int i10 = z10 ? 7 : 6;
        C4J c4j = new C4J(i10);
        c4j.A0e(GZ.A00(interfaceC2087lN, c4j.A0l(), 0, i10));
        interfaceC2087lN.AI1();
        C0908Gc c0908Gc = new C0908Gc();
        boolean isBlockSizeVariable = A08(c4j, c0913Gh, z10, c0908Gc);
        if (isBlockSizeVariable) {
            return c0908Gc.A00;
        }
        throw C05662i.A01(null, null);
    }

    public static boolean A02(int i10, C0913Gh c0913Gh) {
        if (i10 == 0) {
            return true;
        }
        int i11 = c0913Gh.A01;
        if (A00[7].length() == 8) {
            throw new RuntimeException();
        }
        A00[0] = "dnyA5Em4Vekc9hKZNMMqKWCBR5ivXppC";
        return i10 == i11;
    }

    public static boolean A03(int i10, C0913Gh c0913Gh) {
        if (i10 <= 7) {
            return i10 == c0913Gh.A02 - 1;
        }
        if (A00[3].charAt(10) != 'Y') {
            throw new RuntimeException();
        }
        A00[3] = "e0AkGTV6jhYRPjlSs9AVJSXBXenCNngQ";
        return i10 <= 10 && c0913Gh.A02 == 2;
    }

    public static boolean A04(C4J c4j, int i10) {
        int iA0I = c4j.A0I();
        int crc = c4j.A09();
        return iA0I == AbstractC06104a.A0J(c4j.A0l(), i10, crc + (-1), 0);
    }

    public static boolean A05(C4J c4j, C0913Gh c0913Gh, int i10) {
        int iA00 = A00(c4j, i10);
        if (iA00 != -1) {
            int blockSizeSamples = c0913Gh.A03;
            if (iA00 <= blockSizeSamples) {
                return true;
            }
        }
        return false;
    }

    public static boolean A06(C4J c4j, C0913Gh c0913Gh, int i10) {
        int sampleRate = c0913Gh.A07;
        if (i10 == 0) {
            return true;
        }
        if (i10 <= 11) {
            return i10 == c0913Gh.A08;
        }
        if (i10 == 12) {
            return c4j.A0I() * 1000 == sampleRate;
        }
        if (i10 > 14) {
            return false;
        }
        int expectedSampleRate = c4j.A0M();
        if (i10 == 14) {
            expectedSampleRate *= 10;
        }
        return expectedSampleRate == sampleRate;
    }

    public static boolean A07(C4J c4j, C0913Gh c0913Gh, int i10, C0908Gc c0908Gc) {
        int iA09 = c4j.A09();
        long jA0Q = c4j.A0Q();
        long frameHeaderBytes = jA0Q >>> 16;
        if (frameHeaderBytes != i10) {
            return false;
        }
        int blockSizeKey = (int) ((jA0Q >> 8) & 15);
        long frameHeaderBytes2 = jA0Q >> 1;
        int frameStartPosition = (int) (frameHeaderBytes2 & 7);
        return A03((int) ((jA0Q >> 4) & 15), c0913Gh) && A02(frameStartPosition, c0913Gh) && !(((jA0Q & 1) > 1L ? 1 : ((jA0Q & 1) == 1L ? 0 : -1)) == 0) && A08(c4j, c0913Gh, (((jA0Q >>> 16) & 1) > 1L ? 1 : (((jA0Q >>> 16) & 1) == 1L ? 0 : -1)) == 0, c0908Gc) && A05(c4j, c0913Gh, (int) ((jA0Q >> 12) & 15)) && A06(c4j, c0913Gh, blockSizeKey) && A04(c4j, iA09);
    }

    public static boolean A08(C4J c4j, C0913Gh c0913Gh, boolean z10, C0908Gc c0908Gc) {
        long utf8Value;
        try {
            long jA0S = c4j.A0S();
            if (z10) {
                utf8Value = jA0S;
            } else {
                long utf8Value2 = c0913Gh.A03;
                utf8Value = utf8Value2 * jA0S;
            }
            c0908Gc.A00 = utf8Value;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static boolean A09(InterfaceC2087lN interfaceC2087lN, C0913Gh c0913Gh, int i10, C0908Gc c0908Gc) throws IOException {
        long jA8a = interfaceC2087lN.A8a();
        byte[] bArr = new byte[2];
        interfaceC2087lN.AG9(bArr, 0, 2);
        if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i10) {
            interfaceC2087lN.AI1();
            interfaceC2087lN.A3z((int) (jA8a - interfaceC2087lN.A8f()));
            return false;
        }
        C4J c4j = new C4J(16);
        System.arraycopy(bArr, 0, c4j.A0l(), 0, 2);
        byte[] frameStartBytes = c4j.A0l();
        c4j.A0e(GZ.A00(interfaceC2087lN, frameStartBytes, 2, 14));
        interfaceC2087lN.AI1();
        interfaceC2087lN.A3z((int) (jA8a - interfaceC2087lN.A8f()));
        return A07(c4j, c0913Gh, i10, c0908Gc);
    }
}
