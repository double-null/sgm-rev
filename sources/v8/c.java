package v8;

import io.bidmachine.media3.common.ParserException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: Ac4Util.java */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f27244a = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* JADX INFO: compiled from: Ac4Util.java */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f27245a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f27246b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f27247c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f27248d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f27249e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f27250f;

        private b() {
            this.f27245a = true;
            this.f27246b = -1;
            this.f27247c = -1;
            this.f27248d = true;
            this.f27249e = 2;
            this.f27250f = 0;
        }
    }

    /* JADX INFO: renamed from: v8.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Ac4Util.java */
    public static final class C0454c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f27251a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f27252b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f27253c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f27254d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f27255e;

        private C0454c(int i10, int i11, int i12, int i13, int i14) {
            this.f27251a = i10;
            this.f27253c = i11;
            this.f27252b = i12;
            this.f27254d = i13;
            this.f27255e = i14;
        }
    }

    public static void a(int i10, x7.a0 a0Var) {
        a0Var.S(7);
        byte[] bArrE = a0Var.e();
        bArrE[0] = -84;
        bArrE[1] = 64;
        bArrE[2] = -1;
        bArrE[3] = -1;
        bArrE[4] = (byte) ((i10 >> 16) & 255);
        bArrE[5] = (byte) ((i10 >> 8) & 255);
        bArrE[6] = (byte) (i10 & 255);
    }

    private static int b(int i10, boolean z10, int i11) {
        int iC = c(i10);
        if (i10 != 11 && i10 != 12 && i10 != 13 && i10 != 14) {
            return iC;
        }
        if (!z10) {
            iC -= 2;
        }
        if (i11 != 0) {
            return i11 != 1 ? iC : iC - 2;
        }
        return iC - 4;
    }

    private static int c(int i10) {
        switch (i10) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
            case 7:
            case 9:
                return 7;
            case 6:
            case 8:
            case 10:
                return 8;
            case 11:
                return 11;
            case 12:
                return 12;
            case 13:
                return 13;
            case 14:
                return 14;
            case 15:
                return 24;
            default:
                return -1;
        }
    }

    public static u7.q d(x7.a0 a0Var, String str, String str2, u7.l lVar) throws ParserException {
        int iB;
        boolean zG;
        int iH;
        int iH2;
        int iH3;
        int iB2;
        boolean z10;
        boolean zG2;
        int i10;
        x7.z zVar = new x7.z();
        zVar.m(a0Var);
        int iB3 = zVar.b();
        int iH4 = zVar.h(3);
        if (iH4 > 1) {
            throw ParserException.f("Unsupported AC-4 DSI version: " + iH4);
        }
        int iH5 = zVar.h(7);
        int i11 = zVar.g() ? 48000 : 44100;
        zVar.r(4);
        int iH6 = zVar.h(9);
        if (iH5 > 1) {
            if (iH4 == 0) {
                throw ParserException.f("Invalid AC-4 DSI version: " + iH4);
            }
            if (zVar.g()) {
                zVar.r(16);
                if (zVar.g()) {
                    zVar.r(128);
                }
            }
        }
        if (iH4 == 1) {
            if (!k(zVar)) {
                throw ParserException.f("Invalid AC-4 DSI bitrate.");
            }
            zVar.c();
        }
        b bVar = new b();
        int i12 = 0;
        while (true) {
            if (i12 < iH6) {
                if (iH4 == 0) {
                    zG = zVar.g();
                    iH = zVar.h(5);
                    iH2 = zVar.h(5);
                    iH3 = 0;
                    iB2 = 0;
                    z10 = false;
                } else {
                    int iH7 = zVar.h(8);
                    iH3 = zVar.h(8);
                    if (iH3 == 255) {
                        iH3 += zVar.h(16);
                    }
                    if (iH7 > 2) {
                        zVar.r(iH3 * 8);
                        i12++;
                    } else {
                        iB2 = (iB3 - zVar.b()) / 8;
                        int iH8 = zVar.h(5);
                        z10 = iH8 == 31;
                        iH2 = iH7;
                        iH = iH8;
                        zG = false;
                    }
                }
                if (zG || z10 || iH != 6) {
                    bVar.f27250f = zVar.h(3);
                    if (zVar.g()) {
                        zVar.r(5);
                    }
                    zVar.r(2);
                    if (iH4 == 1 && (iH2 == 1 || iH2 == 2)) {
                        zVar.r(2);
                    }
                    zVar.r(5);
                    zVar.r(10);
                    if (iH4 == 1) {
                        if (iH2 > 0) {
                            bVar.f27245a = zVar.g();
                        }
                        if (bVar.f27245a) {
                            if (iH2 == 1 || iH2 == 2) {
                                int iH9 = zVar.h(5);
                                if (iH9 >= 0 && iH9 <= 15) {
                                    bVar.f27246b = iH9;
                                }
                                if (iH9 >= 11 && iH9 <= 14) {
                                    bVar.f27248d = zVar.g();
                                    bVar.f27249e = zVar.h(2);
                                }
                            }
                            zVar.r(24);
                            i10 = 1;
                        } else {
                            i10 = 1;
                        }
                        if (iH2 == i10 || iH2 == 2) {
                            if (zVar.g() && zVar.g()) {
                                zVar.r(2);
                            }
                            if (zVar.g()) {
                                zVar.q();
                                int i13 = 8;
                                int iH10 = zVar.h(8);
                                int i14 = 0;
                                while (i14 < iH10) {
                                    zVar.r(i13);
                                    i14++;
                                    i13 = 8;
                                }
                            }
                        }
                    }
                    if (!zG && !z10) {
                        zVar.q();
                        if (iH == 0 || iH == 1 || iH == 2) {
                            if (iH2 == 0) {
                                for (int i15 = 0; i15 < 2; i15++) {
                                    h(zVar, bVar);
                                }
                            } else {
                                for (int i16 = 0; i16 < 2; i16++) {
                                    i(zVar, bVar);
                                }
                            }
                        } else if (iH == 3 || iH == 4) {
                            if (iH2 == 0) {
                                for (int i17 = 0; i17 < 3; i17++) {
                                    h(zVar, bVar);
                                }
                            } else {
                                int i18 = 0;
                                for (int i19 = 3; i18 < i19; i19 = 3) {
                                    i(zVar, bVar);
                                    i18++;
                                }
                            }
                        } else if (iH != 5) {
                            int iH11 = zVar.h(7);
                            for (int i20 = 0; i20 < iH11; i20++) {
                                zVar.r(8);
                            }
                        } else if (iH2 == 0) {
                            h(zVar, bVar);
                        } else {
                            int iH12 = zVar.h(3);
                            for (int i21 = 0; i21 < iH12 + 2; i21++) {
                                i(zVar, bVar);
                            }
                        }
                    } else if (iH2 == 0) {
                        h(zVar, bVar);
                    } else {
                        i(zVar, bVar);
                    }
                    zVar.q();
                    zG2 = zVar.g();
                } else {
                    zG2 = true;
                }
                if (zG2) {
                    int iH13 = zVar.h(7);
                    for (int i22 = 0; i22 < iH13; i22++) {
                        zVar.r(15);
                    }
                }
                if (iH2 > 0) {
                    if (zVar.g() && !k(zVar)) {
                        throw ParserException.f("Can't parse bitrate DSI.");
                    }
                    if (zVar.g()) {
                        zVar.c();
                        zVar.s(zVar.h(16));
                        int iH14 = zVar.h(5);
                        for (int i23 = 0; i23 < iH14; i23++) {
                            zVar.r(3);
                            zVar.r(8);
                        }
                    }
                }
                zVar.c();
                if (iH4 == 1) {
                    int iB4 = ((iB3 - zVar.b()) / 8) - iB2;
                    if (iH3 < iB4) {
                        throw ParserException.f("pres_bytes is smaller than presentation bytes read.");
                    }
                    zVar.s(iH3 - iB4);
                }
                if (bVar.f27245a && bVar.f27246b == -1) {
                    throw ParserException.f("Can't determine channel mode of presentation " + i12);
                }
            }
            if (bVar.f27245a) {
                iB = b(bVar.f27246b, bVar.f27248d, bVar.f27249e);
            } else {
                iB = bVar.f27247c + 1;
                if (bVar.f27250f == 4 && iB == 17) {
                    iB = 21;
                }
            }
            if (iB > 0) {
                return new u7.q.b().f0(str).u0("audio/ac4").R(iB).v0(i11).Y(lVar).j0(str2).N();
            }
            throw ParserException.f("Can't determine channel count of presentation.");
        }
    }

    public static int e(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[16];
        int iPosition = byteBuffer.position();
        byteBuffer.get(bArr);
        byteBuffer.position(iPosition);
        return f(new x7.z(bArr)).f27255e;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0088  */
    /* JADX WARN: Code duplicated, block: B:47:0x008f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0092  */
    public static C0454c f(x7.z zVar) {
        int i10;
        int i11;
        int iH = zVar.h(16);
        int iH2 = zVar.h(16);
        if (iH2 == 65535) {
            iH2 = zVar.h(24);
            i10 = 7;
        } else {
            i10 = 4;
        }
        int i12 = iH2 + i10;
        if (iH == 44097) {
            i12 += 2;
        }
        int i13 = i12;
        int iH3 = zVar.h(2);
        if (iH3 == 3) {
            iH3 += j(zVar, 2);
        }
        int i14 = iH3;
        int iH4 = zVar.h(10);
        if (zVar.g() && zVar.h(3) > 0) {
            zVar.r(2);
        }
        int i15 = zVar.g() ? 48000 : 44100;
        int iH5 = zVar.h(4);
        if (i15 == 44100 && iH5 == 13) {
            i11 = f27244a[iH5];
        } else if (i15 == 48000) {
            int[] iArr = f27244a;
            if (iH5 < iArr.length) {
                int i16 = iArr[iH5];
                int i17 = iH4 % 5;
                if (i17 == 1) {
                    if (iH5 != 3 || iH5 == 8) {
                        i16++;
                    }
                } else if (i17 != 2) {
                    if (i17 != 3) {
                        if (i17 == 4 && (iH5 == 3 || iH5 == 8 || iH5 == 11)) {
                            i16++;
                        }
                    } else if (iH5 != 3) {
                        i16++;
                    } else {
                        i16++;
                    }
                } else if (iH5 == 8 || iH5 == 11) {
                    i16++;
                }
                i11 = i16;
            } else {
                i11 = 0;
            }
        } else {
            i11 = 0;
        }
        return new C0454c(i14, 2, i15, i13, i11);
    }

    public static int g(byte[] bArr, int i10) {
        int i11 = 7;
        if (bArr.length < 7) {
            return -1;
        }
        int i12 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        if (i12 == 65535) {
            i12 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
        } else {
            i11 = 4;
        }
        if (i10 == 44097) {
            i11 += 2;
        }
        return i12 + i11;
    }

    private static void h(x7.z zVar, b bVar) throws ParserException {
        int iH = zVar.h(5);
        zVar.r(2);
        if (zVar.g()) {
            zVar.r(5);
        }
        if (iH >= 7 && iH <= 10) {
            zVar.q();
        }
        if (zVar.g()) {
            int iH2 = zVar.h(3);
            if (bVar.f27246b == -1 && iH >= 0 && iH <= 15 && (iH2 == 0 || iH2 == 1)) {
                bVar.f27246b = iH;
            }
            if (zVar.g()) {
                l(zVar);
            }
        }
    }

    private static void i(x7.z zVar, b bVar) throws ParserException {
        zVar.r(2);
        boolean zG = zVar.g();
        int iH = zVar.h(8);
        for (int i10 = 0; i10 < iH; i10++) {
            zVar.r(2);
            if (zVar.g()) {
                zVar.r(5);
            }
            if (zG) {
                zVar.r(24);
            } else {
                if (zVar.g()) {
                    if (!zVar.g()) {
                        zVar.r(4);
                    }
                    bVar.f27247c = zVar.h(6) + 1;
                }
                zVar.r(4);
            }
        }
        if (zVar.g()) {
            zVar.r(3);
            if (zVar.g()) {
                l(zVar);
            }
        }
    }

    private static int j(x7.z zVar, int i10) {
        int i11 = 0;
        while (true) {
            int iH = i11 + zVar.h(i10);
            if (!zVar.g()) {
                return iH;
            }
            i11 = (iH + 1) << i10;
        }
    }

    private static boolean k(x7.z zVar) {
        if (zVar.b() < 66) {
            return false;
        }
        zVar.r(66);
        return true;
    }

    private static void l(x7.z zVar) throws ParserException {
        int iH = zVar.h(6);
        if (iH < 2 || iH > 42) {
            throw ParserException.f(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(iH)));
        }
        zVar.r(iH * 8);
    }
}
