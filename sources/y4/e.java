package y4;

import com.google.zxing.WriterException;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: compiled from: MatrixUtil.java */
/* JADX INFO: loaded from: classes4.dex */
final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[][] f28653a = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[][] f28654b = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[][] f28655c = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, Sdk.SDKError.Reason.MRAID_DOWNLOAD_JS_ERROR_VALUE, -1}, new int[]{6, 30, 56, 82, 108, Sdk.SDKError.Reason.STORE_REGION_CODE_ERROR_VALUE, -1}, new int[]{6, 34, 60, 86, 112, Sdk.SDKError.Reason.CONFIG_REFRESH_FAILED_VALUE, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, 158}, new int[]{6, 32, 58, 84, 110, Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE, 162}, new int[]{6, 26, 54, 82, 110, Sdk.SDKError.Reason.CONFIG_REFRESH_FAILED_VALUE, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[][] f28656d = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    static void a(p4.a aVar, x4.a aVar2, x4.c cVar, int i10, b bVar) throws WriterException {
        c(bVar);
        d(cVar, bVar);
        l(aVar2, i10, bVar);
        s(cVar, bVar);
        f(aVar, i10, bVar);
    }

    static int b(int i10, int i11) {
        if (i11 == 0) {
            throw new IllegalArgumentException("0 polynomial");
        }
        int iN = n(i11);
        int iN2 = i10 << (iN - 1);
        while (n(iN2) >= iN) {
            iN2 ^= i11 << (n(iN2) - iN);
        }
        return iN2;
    }

    static void c(b bVar) {
        bVar.a((byte) -1);
    }

    static void d(x4.c cVar, b bVar) throws WriterException {
        j(bVar);
        e(bVar);
        r(cVar, bVar);
        k(bVar);
    }

    private static void e(b bVar) throws WriterException {
        if (bVar.b(8, bVar.d() - 8) == 0) {
            throw new WriterException();
        }
        bVar.f(8, bVar.d() - 8, 1);
    }

    static void f(p4.a aVar, int i10, b bVar) throws WriterException {
        boolean zI;
        int iE = bVar.e() - 1;
        int iD = bVar.d() - 1;
        int i11 = 0;
        int i12 = -1;
        while (iE > 0) {
            if (iE == 6) {
                iE--;
            }
            while (iD >= 0 && iD < bVar.d()) {
                for (int i13 = 0; i13 < 2; i13++) {
                    int i14 = iE - i13;
                    if (o(bVar.b(i14, iD))) {
                        if (i11 < aVar.j()) {
                            zI = aVar.i(i11);
                            i11++;
                        } else {
                            zI = false;
                        }
                        if (i10 != -1 && d.f(i10, i14, iD)) {
                            zI = !zI;
                        }
                        bVar.g(i14, iD, zI);
                    }
                }
                iD += i12;
            }
            i12 = -i12;
            iD += i12;
            iE -= 2;
        }
        if (i11 == aVar.j()) {
            return;
        }
        throw new WriterException("Not all bits consumed: " + i11 + '/' + aVar.j());
    }

    private static void g(int i10, int i11, b bVar) throws WriterException {
        for (int i12 = 0; i12 < 8; i12++) {
            int i13 = i10 + i12;
            if (!o(bVar.b(i13, i11))) {
                throw new WriterException();
            }
            bVar.f(i13, i11, 0);
        }
    }

    private static void h(int i10, int i11, b bVar) {
        for (int i12 = 0; i12 < 5; i12++) {
            int[] iArr = f28654b[i12];
            for (int i13 = 0; i13 < 5; i13++) {
                bVar.f(i10 + i13, i11 + i12, iArr[i13]);
            }
        }
    }

    private static void i(int i10, int i11, b bVar) {
        for (int i12 = 0; i12 < 7; i12++) {
            int[] iArr = f28653a[i12];
            for (int i13 = 0; i13 < 7; i13++) {
                bVar.f(i10 + i13, i11 + i12, iArr[i13]);
            }
        }
    }

    private static void j(b bVar) throws WriterException {
        int length = f28653a[0].length;
        i(0, 0, bVar);
        i(bVar.e() - length, 0, bVar);
        i(0, bVar.e() - length, bVar);
        g(0, 7, bVar);
        g(bVar.e() - 8, 7, bVar);
        g(0, bVar.e() - 8, bVar);
        m(7, 0, bVar);
        m((bVar.d() - 7) - 1, 0, bVar);
        m(7, bVar.d() - 7, bVar);
    }

    private static void k(b bVar) {
        int i10 = 8;
        while (i10 < bVar.e() - 8) {
            int i11 = i10 + 1;
            int i12 = i11 % 2;
            if (o(bVar.b(i10, 6))) {
                bVar.f(i10, 6, i12);
            }
            if (o(bVar.b(6, i10))) {
                bVar.f(6, i10, i12);
            }
            i10 = i11;
        }
    }

    static void l(x4.a aVar, int i10, b bVar) throws WriterException {
        p4.a aVar2 = new p4.a();
        p(aVar, i10, aVar2);
        for (int i11 = 0; i11 < aVar2.j(); i11++) {
            boolean zI = aVar2.i((aVar2.j() - 1) - i11);
            int[] iArr = f28656d[i11];
            bVar.g(iArr[0], iArr[1], zI);
            if (i11 < 8) {
                bVar.g((bVar.e() - i11) - 1, 8, zI);
            } else {
                bVar.g(8, (bVar.d() - 7) + (i11 - 8), zI);
            }
        }
    }

    private static void m(int i10, int i11, b bVar) throws WriterException {
        for (int i12 = 0; i12 < 7; i12++) {
            int i13 = i11 + i12;
            if (!o(bVar.b(i10, i13))) {
                throw new WriterException();
            }
            bVar.f(i10, i13, 0);
        }
    }

    static int n(int i10) {
        return 32 - Integer.numberOfLeadingZeros(i10);
    }

    private static boolean o(int i10) {
        return i10 == -1;
    }

    static void p(x4.a aVar, int i10, p4.a aVar2) throws WriterException {
        if (!f.b(i10)) {
            throw new WriterException("Invalid mask pattern");
        }
        int iB = (aVar.b() << 3) | i10;
        aVar2.d(iB, 5);
        aVar2.d(b(iB, 1335), 10);
        p4.a aVar3 = new p4.a();
        aVar3.d(21522, 15);
        aVar2.n(aVar3);
        if (aVar2.j() == 15) {
            return;
        }
        throw new WriterException("should not happen but we got: " + aVar2.j());
    }

    static void q(x4.c cVar, p4.a aVar) throws WriterException {
        aVar.d(cVar.f(), 6);
        aVar.d(b(cVar.f(), 7973), 12);
        if (aVar.j() == 18) {
            return;
        }
        throw new WriterException("should not happen but we got: " + aVar.j());
    }

    private static void r(x4.c cVar, b bVar) {
        if (cVar.f() < 2) {
            return;
        }
        int[] iArr = f28655c[cVar.f() - 1];
        for (int i10 : iArr) {
            if (i10 >= 0) {
                for (int i11 : iArr) {
                    if (i11 >= 0 && o(bVar.b(i11, i10))) {
                        h(i11 - 2, i10 - 2, bVar);
                    }
                }
            }
        }
    }

    static void s(x4.c cVar, b bVar) throws WriterException {
        if (cVar.f() < 7) {
            return;
        }
        p4.a aVar = new p4.a();
        q(cVar, aVar);
        int i10 = 17;
        for (int i11 = 0; i11 < 6; i11++) {
            for (int i12 = 0; i12 < 3; i12++) {
                boolean zI = aVar.i(i10);
                i10--;
                bVar.g(i11, (bVar.d() - 11) + i12, zI);
                bVar.g((bVar.d() - 11) + i12, i11, zI);
            }
        }
    }
}
