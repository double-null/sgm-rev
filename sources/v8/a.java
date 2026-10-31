package v8;

import io.bidmachine.media3.common.ParserException;

/* JADX INFO: compiled from: AacUtil.java */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f27222a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f27223b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* JADX INFO: compiled from: AacUtil.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f27224a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f27225b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f27226c;

        private b(int i10, int i11, String str) {
            this.f27224a = i10;
            this.f27225b = i11;
            this.f27226c = str;
        }
    }

    public static byte[] a(int i10, int i11, int i12) {
        return new byte[]{(byte) (((i10 << 3) & 248) | ((i11 >> 1) & 7)), (byte) (((i11 << 7) & 128) | ((i12 << 3) & 120))};
    }

    private static int b(x7.z zVar) {
        int iH = zVar.h(5);
        return iH == 31 ? zVar.h(6) + 32 : iH;
    }

    private static int c(x7.z zVar) throws ParserException {
        int iH = zVar.h(4);
        if (iH == 15) {
            if (zVar.b() >= 24) {
                return zVar.h(24);
            }
            throw ParserException.b("AAC header insufficient data", null);
        }
        if (iH < 13) {
            return f27222a[iH];
        }
        throw ParserException.b("AAC header wrong Sampling Frequency Index", null);
    }

    public static b d(x7.z zVar, boolean z10) throws ParserException {
        int iB = b(zVar);
        int iC = c(zVar);
        int iH = zVar.h(4);
        String str = "mp4a.40." + iB;
        if (iB == 5 || iB == 29) {
            iC = c(zVar);
            iB = b(zVar);
            if (iB == 22) {
                iH = zVar.h(4);
            }
        }
        if (z10) {
            if (iB != 1 && iB != 2 && iB != 3 && iB != 4 && iB != 6 && iB != 7 && iB != 17) {
                switch (iB) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw ParserException.f("Unsupported audio object type: " + iB);
                }
            }
            f(zVar, iB, iH);
            switch (iB) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int iH2 = zVar.h(2);
                    if (iH2 == 2 || iH2 == 3) {
                        throw ParserException.f("Unsupported epConfig: " + iH2);
                    }
                    break;
            }
        }
        int i10 = f27223b[iH];
        if (i10 != -1) {
            return new b(iC, i10, str);
        }
        throw ParserException.b(null, null);
    }

    public static b e(byte[] bArr) throws ParserException {
        return d(new x7.z(bArr), false);
    }

    private static void f(x7.z zVar, int i10, int i11) {
        if (zVar.g()) {
            x7.r.h("AacUtil", "Unexpected frameLengthFlag = 1");
        }
        if (zVar.g()) {
            zVar.r(14);
        }
        boolean zG = zVar.g();
        if (i11 == 0) {
            throw new UnsupportedOperationException();
        }
        if (i10 == 6 || i10 == 20) {
            zVar.r(3);
        }
        if (zG) {
            if (i10 == 22) {
                zVar.r(16);
            }
            if (i10 == 17 || i10 == 19 || i10 == 20 || i10 == 23) {
                zVar.r(3);
            }
            zVar.r(1);
        }
    }
}
