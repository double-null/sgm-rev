package v8;

import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.vungle.ads.internal.protos.Sdk;
import io.bidmachine.media3.common.ParserException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: DtsUtil.java */
/* JADX INFO: loaded from: classes4.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f27388a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f27389b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f27390c = {64, 112, 128, 192, Sdk.SDKError.Reason.AD_LOAD_FAIL_EMPTY_BID_PAYLOAD_VALUE, UserVerificationMethods.USER_VERIFY_HANDPRINT, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f27391d = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f27392e = {5, 8, 10, 12};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int[] f27393f = {6, 9, 12, 15};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int[] f27394g = {2, 4, 6, 8};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int[] f27395h = {9, 11, 13, 16};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int[] f27396i = {5, 8, 10, 12};

    /* JADX INFO: compiled from: DtsUtil.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f27397a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f27398b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f27399c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f27400d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f27401e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f27402f;

        private b(String str, int i10, int i11, int i12, long j10, int i13) {
            this.f27397a = str;
            this.f27399c = i10;
            this.f27398b = i11;
            this.f27400d = i12;
            this.f27401e = j10;
            this.f27402f = i13;
        }
    }

    private static void a(byte[] bArr, int i10) throws ParserException {
        int i11 = i10 - 2;
        if (((bArr[i10 - 1] & 255) | ((bArr[i11] << 8) & Settings.DEFAULT_INITIAL_WINDOW_SIZE)) != x7.l0.v(bArr, 0, i11, Settings.DEFAULT_INITIAL_WINDOW_SIZE)) {
            throw ParserException.b("CRC check failed", null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x005f  */
    /* JADX WARN: Code duplicated, block: B:17:? A[RETURN, SYNTHETIC] */
    public static int b(byte[] bArr) {
        int i10;
        byte b10;
        int i11;
        int i12;
        byte b11;
        boolean z10 = false;
        byte b12 = bArr[0];
        if (b12 != -2) {
            if (b12 == -1) {
                i12 = ((bArr[7] & 3) << 12) | ((bArr[6] & 255) << 4);
                b11 = bArr[9];
            } else if (b12 != 31) {
                i10 = ((bArr[5] & 3) << 12) | ((bArr[6] & 255) << 4);
                b10 = bArr[7];
            } else {
                i12 = ((bArr[6] & 3) << 12) | ((bArr[7] & 255) << 4);
                b11 = bArr[8];
            }
            i11 = (((b11 & 60) >> 2) | i12) + 1;
            z10 = true;
            if (z10) {
                return (i11 * 16) / 14;
            }
            return i11;
        }
        i10 = ((bArr[4] & 3) << 12) | ((bArr[7] & 255) << 4);
        b10 = bArr[6];
        i11 = (((b10 & 240) >> 4) | i10) + 1;
        if (z10) {
            return (i11 * 16) / 14;
        }
        return i11;
    }

    public static int c(int i10) {
        if (i10 == 2147385345 || i10 == -25230976 || i10 == 536864768 || i10 == -14745368) {
            return 1;
        }
        if (i10 == 1683496997 || i10 == 622876772) {
            return 2;
        }
        if (i10 == 1078008818 || i10 == -233094848) {
            return 3;
        }
        return (i10 == 1908687592 || i10 == -398277519) ? 4 : 0;
    }

    private static x7.z d(byte[] bArr) {
        byte b10 = bArr[0];
        if (b10 == 127 || b10 == 100 || b10 == 64 || b10 == 113) {
            return new x7.z(bArr);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        if (e(bArrCopyOf)) {
            for (int i10 = 0; i10 < bArrCopyOf.length - 1; i10 += 2) {
                byte b11 = bArrCopyOf[i10];
                int i11 = i10 + 1;
                bArrCopyOf[i10] = bArrCopyOf[i11];
                bArrCopyOf[i11] = b11;
            }
        }
        x7.z zVar = new x7.z(bArrCopyOf);
        if (bArrCopyOf[0] == 31) {
            x7.z zVar2 = new x7.z(bArrCopyOf);
            while (zVar2.b() >= 16) {
                zVar2.r(2);
                zVar.f(zVar2.h(14), 14);
            }
        }
        zVar.n(bArrCopyOf);
        return zVar;
    }

    private static boolean e(byte[] bArr) {
        byte b10 = bArr[0];
        return b10 == -2 || b10 == -1 || b10 == 37 || b10 == -14 || b10 == -24;
    }

    public static int f(ByteBuffer byteBuffer) {
        int i10;
        byte b10;
        int i11;
        byte b11;
        if (byteBuffer.getInt(0) == -233094848 || byteBuffer.getInt(0) == -398277519) {
            return 1024;
        }
        if (byteBuffer.getInt(0) == 622876772) {
            return 4096;
        }
        int iPosition = byteBuffer.position();
        byte b12 = byteBuffer.get(iPosition);
        if (b12 != -2) {
            if (b12 == -1) {
                i10 = (byteBuffer.get(iPosition + 4) & 7) << 4;
                b11 = byteBuffer.get(iPosition + 7);
            } else if (b12 != 31) {
                i10 = (byteBuffer.get(iPosition + 4) & 1) << 6;
                b10 = byteBuffer.get(iPosition + 5);
            } else {
                i10 = (byteBuffer.get(iPosition + 5) & 7) << 4;
                b11 = byteBuffer.get(iPosition + 6);
            }
            i11 = b11 & 60;
            return (((i11 >> 2) | i10) + 1) * 32;
        }
        i10 = (byteBuffer.get(iPosition + 5) & 1) << 6;
        b10 = byteBuffer.get(iPosition + 4);
        i11 = b10 & 252;
        return (((i11 >> 2) | i10) + 1) * 32;
    }

    public static int g(byte[] bArr) {
        int i10;
        byte b10;
        int i11;
        byte b11;
        byte b12 = bArr[0];
        if (b12 != -2) {
            if (b12 == -1) {
                i10 = (bArr[4] & 7) << 4;
                b11 = bArr[7];
            } else if (b12 != 31) {
                i10 = (bArr[4] & 1) << 6;
                b10 = bArr[5];
            } else {
                i10 = (bArr[5] & 7) << 4;
                b11 = bArr[6];
            }
            i11 = b11 & 60;
            return (((i11 >> 2) | i10) + 1) * 32;
        }
        i10 = (bArr[5] & 1) << 6;
        b10 = bArr[4];
        i11 = b10 & 252;
        return (((i11 >> 2) | i10) + 1) * 32;
    }

    public static u7.q h(byte[] bArr, String str, String str2, int i10, String str3, u7.l lVar) {
        x7.z zVarD = d(bArr);
        zVarD.r(60);
        int i11 = f27388a[zVarD.h(6)];
        int i12 = f27389b[zVarD.h(4)];
        int iH = zVarD.h(5);
        int[] iArr = f27390c;
        int i13 = iH >= iArr.length ? -1 : (iArr[iH] * 1000) / 2;
        zVarD.r(10);
        return new u7.q.b().f0(str).U(str3).u0("audio/vnd.dts").Q(i13).R(i11 + (zVarD.h(2) > 0 ? 1 : 0)).v0(i12).Y(lVar).j0(str2).s0(i10).N();
    }

    public static b i(byte[] bArr) throws ParserException {
        int i10;
        int i11;
        int iH;
        int i12;
        int iH2;
        long jF1;
        int i13;
        x7.z zVarD = d(bArr);
        zVarD.r(40);
        int iH3 = zVarD.h(2);
        if (zVarD.g()) {
            i10 = 20;
            i11 = 12;
        } else {
            i10 = 16;
            i11 = 8;
        }
        zVarD.r(i11);
        int iH4 = zVarD.h(i10) + 1;
        boolean zG = zVarD.g();
        int i14 = 0;
        if (zG) {
            iH = zVarD.h(2);
            int iH5 = (zVarD.h(3) + 1) * 512;
            if (zVarD.g()) {
                zVarD.r(36);
            }
            int iH6 = zVarD.h(3) + 1;
            int iH7 = zVarD.h(3) + 1;
            if (iH6 != 1 || iH7 != 1) {
                throw ParserException.f("Multiple audio presentations or assets not supported");
            }
            int i15 = iH3 + 1;
            int iH8 = zVarD.h(i15);
            for (int i16 = 0; i16 < i15; i16++) {
                if (((iH8 >> i16) & 1) == 1) {
                    zVarD.r(8);
                }
            }
            if (zVarD.g()) {
                zVarD.r(2);
                int iH9 = (zVarD.h(2) + 1) << 2;
                int iH10 = zVarD.h(2) + 1;
                while (i14 < iH10) {
                    zVarD.r(iH9);
                    i14++;
                }
            }
            i14 = iH5;
        } else {
            iH = -1;
        }
        zVarD.r(i10);
        zVarD.r(12);
        if (zG) {
            if (zVarD.g()) {
                zVarD.r(4);
            }
            if (zVarD.g()) {
                zVarD.r(24);
            }
            if (zVarD.g()) {
                zVarD.s(zVarD.h(10) + 1);
            }
            zVarD.r(5);
            int i17 = f27391d[zVarD.h(4)];
            iH2 = zVarD.h(8) + 1;
            i12 = i17;
        } else {
            i12 = -2147483647;
            iH2 = -1;
        }
        if (zG) {
            if (iH == 0) {
                i13 = 32000;
            } else if (iH == 1) {
                i13 = 44100;
            } else {
                if (iH != 2) {
                    throw ParserException.b("Unsupported reference clock code in DTS HD header: " + iH, null);
                }
                i13 = 48000;
            }
            jF1 = x7.l0.f1(i14, 1000000L, i13);
        } else {
            jF1 = -9223372036854775807L;
        }
        return new b("audio/vnd.dts.hd;profile=lbr", iH2, i12, iH4, jF1, 0);
    }

    public static int j(byte[] bArr) {
        x7.z zVarD = d(bArr);
        zVarD.r(42);
        return zVarD.h(zVarD.g() ? 12 : 8) + 1;
    }

    public static b k(byte[] bArr, AtomicInteger atomicInteger) throws ParserException {
        int iH;
        long jF1;
        int i10;
        int i11;
        x7.z zVarD = d(bArr);
        int i12 = zVarD.h(32) == 1078008818 ? 1 : 0;
        int iM = m(zVarD, f27392e, true) + 1;
        if (i12 == 0) {
            iH = -2147483647;
            jF1 = -9223372036854775807L;
        } else {
            if (!zVarD.g()) {
                throw ParserException.f("Only supports full channel mask-based audio presentation");
            }
            a(bArr, iM);
            int iH2 = zVarD.h(2);
            if (iH2 == 0) {
                i10 = 512;
            } else if (iH2 == 1) {
                i10 = 480;
            } else {
                if (iH2 != 2) {
                    throw ParserException.b("Unsupported base duration index in DTS UHD header: " + iH2, null);
                }
                i10 = 384;
            }
            int iH3 = i10 * (zVarD.h(3) + 1);
            int iH4 = zVarD.h(2);
            if (iH4 == 0) {
                i11 = 32000;
            } else if (iH4 == 1) {
                i11 = 44100;
            } else {
                if (iH4 != 2) {
                    throw ParserException.b("Unsupported clock rate index in DTS UHD header: " + iH4, null);
                }
                i11 = 48000;
            }
            if (zVarD.g()) {
                zVarD.r(36);
            }
            iH = (1 << zVarD.h(2)) * i11;
            jF1 = x7.l0.f1(iH3, 1000000L, i11);
        }
        int i13 = iH;
        long j10 = jF1;
        int iM2 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            iM2 += m(zVarD, f27393f, true);
        }
        if (i12 != 0) {
            atomicInteger.set(m(zVarD, f27394g, true));
        }
        return new b("audio/vnd.dts.uhd;profile=p2", 2, i13, iM + iM2 + (atomicInteger.get() != 0 ? m(zVarD, f27395h, true) : 0), j10, 0);
    }

    public static int l(byte[] bArr) {
        x7.z zVarD = d(bArr);
        zVarD.r(32);
        return m(zVarD, f27396i, true) + 1;
    }

    private static int m(x7.z zVar, int[] iArr, boolean z10) {
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < 3 && zVar.g(); i12++) {
            i11++;
        }
        if (z10) {
            int i13 = 0;
            while (i10 < i11) {
                i13 += 1 << iArr[i10];
                i10++;
            }
            i10 = i13;
        }
        return i10 + zVar.h(iArr[i11]);
    }
}
