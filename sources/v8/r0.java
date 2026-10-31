package v8;

import android.util.Base64;
import io.bidmachine.media3.common.ParserException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: VorbisUtil.java */
/* JADX INFO: loaded from: classes4.dex */
public final class r0 {

    /* JADX INFO: compiled from: VorbisUtil.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f27418a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String[] f27419b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f27420c;

        public a(String str, String[] strArr, int i10) {
            this.f27418a = str;
            this.f27419b = strArr;
            this.f27420c = i10;
        }
    }

    /* JADX INFO: compiled from: VorbisUtil.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f27421a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f27422b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f27423c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f27424d;

        public b(boolean z10, int i10, int i11, int i12) {
            this.f27421a = z10;
            this.f27422b = i10;
            this.f27423c = i11;
            this.f27424d = i12;
        }
    }

    /* JADX INFO: compiled from: VorbisUtil.java */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f27425a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f27426b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f27427c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f27428d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f27429e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f27430f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f27431g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f27432h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f27433i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final byte[] f27434j;

        public c(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z10, byte[] bArr) {
            this.f27425a = i10;
            this.f27426b = i11;
            this.f27427c = i12;
            this.f27428d = i13;
            this.f27429e = i14;
            this.f27430f = i15;
            this.f27431g = i16;
            this.f27432h = i17;
            this.f27433i = z10;
            this.f27434j = bArr;
        }
    }

    public static int[] a(int i10) {
        if (i10 == 3) {
            return new int[]{0, 2, 1};
        }
        if (i10 == 5) {
            return new int[]{0, 2, 1, 3, 4};
        }
        if (i10 == 6) {
            return new int[]{0, 2, 1, 5, 3, 4};
        }
        if (i10 == 7) {
            return new int[]{0, 2, 1, 6, 5, 3, 4};
        }
        if (i10 != 8) {
            return null;
        }
        return new int[]{0, 2, 1, 7, 5, 6, 3, 4};
    }

    public static int b(int i10) {
        int i11 = 0;
        while (i10 > 0) {
            i11++;
            i10 >>>= 1;
        }
        return i11;
    }

    private static long c(long j10, long j11) {
        return (long) Math.floor(Math.pow(j10, 1.0d / j11));
    }

    public static u7.v d(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = list.get(i10);
            String[] strArrN1 = x7.l0.n1(str, "=");
            if (strArrN1.length != 2) {
                x7.r.h("VorbisUtil", "Failed to parse Vorbis comment: " + str);
            } else if (strArrN1[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(h9.a.d(new x7.a0(Base64.decode(strArrN1[1], 0))));
                } catch (RuntimeException e10) {
                    x7.r.i("VorbisUtil", "Failed to parse vorbis picture", e10);
                }
            } else {
                arrayList.add(new m9.a(strArrN1[0], strArrN1[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new u7.v(arrayList);
    }

    public static com.google.common.collect.u<byte[]> e(byte[] bArr) {
        x7.a0 a0Var = new x7.a0(bArr);
        a0Var.X(1);
        int i10 = 0;
        while (a0Var.a() > 0 && a0Var.j() == 255) {
            i10 += 255;
            a0Var.X(1);
        }
        int iH = i10 + a0Var.H();
        int i11 = 0;
        while (a0Var.a() > 0 && a0Var.j() == 255) {
            i11 += 255;
            a0Var.X(1);
        }
        int iH2 = i11 + a0Var.H();
        byte[] bArr2 = new byte[iH];
        int iF = a0Var.f();
        System.arraycopy(bArr, iF, bArr2, 0, iH);
        int i12 = iF + iH + iH2;
        int length = bArr.length - i12;
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr, i12, bArr3, 0, length);
        return com.google.common.collect.u.K(bArr2, bArr3);
    }

    private static void f(q0 q0Var) throws ParserException {
        int iD = q0Var.d(6) + 1;
        for (int i10 = 0; i10 < iD; i10++) {
            int iD2 = q0Var.d(16);
            if (iD2 == 0) {
                q0Var.e(8);
                q0Var.e(16);
                q0Var.e(16);
                q0Var.e(6);
                q0Var.e(8);
                int iD3 = q0Var.d(4) + 1;
                for (int i11 = 0; i11 < iD3; i11++) {
                    q0Var.e(8);
                }
            } else {
                if (iD2 != 1) {
                    throw ParserException.b("floor type greater than 1 not decodable: " + iD2, null);
                }
                int iD4 = q0Var.d(5);
                int[] iArr = new int[iD4];
                int i12 = -1;
                for (int i13 = 0; i13 < iD4; i13++) {
                    int iD5 = q0Var.d(4);
                    iArr[i13] = iD5;
                    if (iD5 > i12) {
                        i12 = iD5;
                    }
                }
                int i14 = i12 + 1;
                int[] iArr2 = new int[i14];
                for (int i15 = 0; i15 < i14; i15++) {
                    iArr2[i15] = q0Var.d(3) + 1;
                    int iD6 = q0Var.d(2);
                    if (iD6 > 0) {
                        q0Var.e(8);
                    }
                    for (int i16 = 0; i16 < (1 << iD6); i16++) {
                        q0Var.e(8);
                    }
                }
                q0Var.e(2);
                int iD7 = q0Var.d(4);
                int i17 = 0;
                int i18 = 0;
                for (int i19 = 0; i19 < iD4; i19++) {
                    i17 += iArr2[iArr[i19]];
                    while (i18 < i17) {
                        q0Var.e(iD7);
                        i18++;
                    }
                }
            }
        }
    }

    private static void g(int i10, q0 q0Var) throws ParserException {
        int iD = q0Var.d(6) + 1;
        for (int i11 = 0; i11 < iD; i11++) {
            int iD2 = q0Var.d(16);
            if (iD2 != 0) {
                x7.r.c("VorbisUtil", "mapping type other than 0 not supported: " + iD2);
            } else {
                int iD3 = q0Var.c() ? q0Var.d(4) + 1 : 1;
                if (q0Var.c()) {
                    int iD4 = q0Var.d(8) + 1;
                    for (int i12 = 0; i12 < iD4; i12++) {
                        int i13 = i10 - 1;
                        q0Var.e(b(i13));
                        q0Var.e(b(i13));
                    }
                }
                if (q0Var.d(2) != 0) {
                    throw ParserException.b("to reserved bits must be zero after mapping coupling steps", null);
                }
                if (iD3 > 1) {
                    for (int i14 = 0; i14 < i10; i14++) {
                        q0Var.e(4);
                    }
                }
                for (int i15 = 0; i15 < iD3; i15++) {
                    q0Var.e(8);
                    q0Var.e(8);
                    q0Var.e(8);
                }
            }
        }
    }

    private static b[] h(q0 q0Var) {
        int iD = q0Var.d(6) + 1;
        b[] bVarArr = new b[iD];
        for (int i10 = 0; i10 < iD; i10++) {
            bVarArr[i10] = new b(q0Var.c(), q0Var.d(16), q0Var.d(16), q0Var.d(8));
        }
        return bVarArr;
    }

    private static void i(q0 q0Var) throws ParserException {
        int iD = q0Var.d(6) + 1;
        for (int i10 = 0; i10 < iD; i10++) {
            if (q0Var.d(16) > 2) {
                throw ParserException.b("residueType greater than 2 is not decodable", null);
            }
            q0Var.e(24);
            q0Var.e(24);
            q0Var.e(24);
            int iD2 = q0Var.d(6) + 1;
            q0Var.e(8);
            int[] iArr = new int[iD2];
            for (int i11 = 0; i11 < iD2; i11++) {
                iArr[i11] = ((q0Var.c() ? q0Var.d(5) : 0) * 8) + q0Var.d(3);
            }
            for (int i12 = 0; i12 < iD2; i12++) {
                for (int i13 = 0; i13 < 8; i13++) {
                    if ((iArr[i12] & (1 << i13)) != 0) {
                        q0Var.e(8);
                    }
                }
            }
        }
    }

    public static a j(x7.a0 a0Var) throws ParserException {
        return k(a0Var, true, true);
    }

    public static a k(x7.a0 a0Var, boolean z10, boolean z11) throws ParserException {
        if (z10) {
            o(3, a0Var, false);
        }
        String strE = a0Var.E((int) a0Var.x());
        int length = 11 + strE.length();
        long jX = a0Var.x();
        String[] strArr = new String[(int) jX];
        int length2 = length + 4;
        for (int i10 = 0; i10 < jX; i10++) {
            String strE2 = a0Var.E((int) a0Var.x());
            strArr[i10] = strE2;
            length2 = length2 + 4 + strE2.length();
        }
        if (z11 && (a0Var.H() & 1) == 0) {
            throw ParserException.b("framing bit expected to be set", null);
        }
        return new a(strE, strArr, length2 + 1);
    }

    public static c l(x7.a0 a0Var) throws ParserException {
        o(1, a0Var, false);
        int iY = a0Var.y();
        int iH = a0Var.H();
        int iY2 = a0Var.y();
        int iU = a0Var.u();
        if (iU <= 0) {
            iU = -1;
        }
        int iU2 = a0Var.u();
        if (iU2 <= 0) {
            iU2 = -1;
        }
        int iU3 = a0Var.u();
        if (iU3 <= 0) {
            iU3 = -1;
        }
        int iH2 = a0Var.H();
        return new c(iY, iH, iY2, iU, iU2, iU3, (int) Math.pow(2.0d, iH2 & 15), (int) Math.pow(2.0d, (iH2 & 240) >> 4), (a0Var.H() & 1) > 0, Arrays.copyOf(a0Var.e(), a0Var.g()));
    }

    public static b[] m(x7.a0 a0Var, int i10) throws ParserException {
        o(5, a0Var, false);
        int iH = a0Var.H() + 1;
        q0 q0Var = new q0(a0Var.e());
        q0Var.e(a0Var.f() * 8);
        for (int i11 = 0; i11 < iH; i11++) {
            n(q0Var);
        }
        int iD = q0Var.d(6) + 1;
        for (int i12 = 0; i12 < iD; i12++) {
            if (q0Var.d(16) != 0) {
                throw ParserException.b("placeholder of time domain transforms not zeroed out", null);
            }
        }
        f(q0Var);
        i(q0Var);
        g(i10, q0Var);
        b[] bVarArrH = h(q0Var);
        if (q0Var.c()) {
            return bVarArrH;
        }
        throw ParserException.b("framing bit after modes not set as expected", null);
    }

    private static void n(q0 q0Var) throws ParserException {
        long jC;
        if (q0Var.d(24) != 5653314) {
            throw ParserException.b("expected code book to start with [0x56, 0x43, 0x42] at " + q0Var.b(), null);
        }
        int iD = q0Var.d(16);
        int iD2 = q0Var.d(24);
        int iD3 = 0;
        if (q0Var.c()) {
            q0Var.e(5);
            while (iD3 < iD2) {
                iD3 += q0Var.d(b(iD2 - iD3));
            }
        } else {
            boolean zC = q0Var.c();
            while (iD3 < iD2) {
                if (!zC) {
                    q0Var.e(5);
                } else if (q0Var.c()) {
                    q0Var.e(5);
                }
                iD3++;
            }
        }
        int iD4 = q0Var.d(4);
        if (iD4 > 2) {
            throw ParserException.b("lookup type greater than 2 not decodable: " + iD4, null);
        }
        if (iD4 == 1 || iD4 == 2) {
            q0Var.e(32);
            q0Var.e(32);
            int iD5 = q0Var.d(4) + 1;
            q0Var.e(1);
            if (iD4 == 1) {
                jC = iD != 0 ? c(iD2, iD) : 0L;
            } else {
                jC = ((long) iD) * ((long) iD2);
            }
            q0Var.e((int) (jC * ((long) iD5)));
        }
    }

    public static boolean o(int i10, x7.a0 a0Var, boolean z10) throws ParserException {
        if (a0Var.a() < 7) {
            if (z10) {
                return false;
            }
            throw ParserException.b("too short header: " + a0Var.a(), null);
        }
        if (a0Var.H() != i10) {
            if (z10) {
                return false;
            }
            throw ParserException.b("expected header type " + Integer.toHexString(i10), null);
        }
        if (a0Var.H() == 118 && a0Var.H() == 111 && a0Var.H() == 114 && a0Var.H() == 98 && a0Var.H() == 105 && a0Var.H() == 115) {
            return true;
        }
        if (z10) {
            return false;
        }
        throw ParserException.b("expected characters 'vorbis'", null);
    }
}
