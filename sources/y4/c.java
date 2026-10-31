package y4;

import com.google.zxing.WriterException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: Encoder.java */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f28651a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    /* JADX INFO: compiled from: Encoder.java */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f28652a;

        static {
            int[] iArr = new int[x4.b.values().length];
            f28652a = iArr;
            try {
                iArr[x4.b.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28652a[x4.b.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28652a[x4.b.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28652a[x4.b.KANJI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static void a(String str, p4.a aVar, String str2) throws WriterException {
        try {
            for (byte b10 : str.getBytes(str2)) {
                aVar.d(b10, 8);
            }
        } catch (UnsupportedEncodingException e10) {
            throw new WriterException(e10);
        }
    }

    static void b(CharSequence charSequence, p4.a aVar) throws WriterException {
        int length = charSequence.length();
        int i10 = 0;
        while (i10 < length) {
            int iP = p(charSequence.charAt(i10));
            if (iP == -1) {
                throw new WriterException();
            }
            int i11 = i10 + 1;
            if (i11 < length) {
                int iP2 = p(charSequence.charAt(i11));
                if (iP2 == -1) {
                    throw new WriterException();
                }
                aVar.d((iP * 45) + iP2, 11);
                i10 += 2;
            } else {
                aVar.d(iP, 6);
                i10 = i11;
            }
        }
    }

    static void c(String str, x4.b bVar, p4.a aVar, String str2) throws WriterException {
        int i10 = a.f28652a[bVar.ordinal()];
        if (i10 == 1) {
            h(str, aVar);
            return;
        }
        if (i10 == 2) {
            b(str, aVar);
        } else if (i10 == 3) {
            a(str, aVar, str2);
        } else {
            if (i10 != 4) {
                throw new WriterException("Invalid mode: ".concat(String.valueOf(bVar)));
            }
            e(str, aVar);
        }
    }

    private static void d(p4.c cVar, p4.a aVar) {
        aVar.d(x4.b.ECI.b(), 4);
        aVar.d(cVar.c(), 8);
    }

    static void e(String str, p4.a aVar) throws WriterException {
        int i10;
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            for (int i11 = 0; i11 < length; i11 += 2) {
                int i12 = ((bytes[i11] & 255) << 8) | (bytes[i11 + 1] & 255);
                int i13 = 33088;
                if (i12 >= 33088 && i12 <= 40956) {
                    i10 = i12 - i13;
                } else if (i12 < 57408 || i12 > 60351) {
                    i10 = -1;
                } else {
                    i13 = 49472;
                    i10 = i12 - i13;
                }
                if (i10 == -1) {
                    throw new WriterException("Invalid byte sequence");
                }
                aVar.d(((i10 >> 8) * 192) + (i10 & 255), 13);
            }
        } catch (UnsupportedEncodingException e10) {
            throw new WriterException(e10);
        }
    }

    static void f(int i10, x4.c cVar, x4.b bVar, p4.a aVar) throws WriterException {
        int iC = bVar.c(cVar);
        int i11 = 1 << iC;
        if (i10 < i11) {
            aVar.d(i10, iC);
            return;
        }
        throw new WriterException(i10 + " is bigger than " + (i11 - 1));
    }

    static void g(x4.b bVar, p4.a aVar) {
        aVar.d(bVar.b(), 4);
    }

    static void h(CharSequence charSequence, p4.a aVar) {
        int length = charSequence.length();
        int i10 = 0;
        while (i10 < length) {
            int iCharAt = charSequence.charAt(i10) - '0';
            int i11 = i10 + 2;
            if (i11 < length) {
                aVar.d((iCharAt * 100) + ((charSequence.charAt(i10 + 1) - '0') * 10) + (charSequence.charAt(i11) - '0'), 10);
                i10 += 3;
            } else {
                i10++;
                if (i10 < length) {
                    aVar.d((iCharAt * 10) + (charSequence.charAt(i10) - '0'), 7);
                    i10 = i11;
                } else {
                    aVar.d(iCharAt, 4);
                }
            }
        }
    }

    private static int i(x4.b bVar, p4.a aVar, p4.a aVar2, x4.c cVar) {
        return aVar.j() + bVar.c(cVar) + aVar2.j();
    }

    private static int j(b bVar) {
        return d.a(bVar) + d.c(bVar) + d.d(bVar) + d.e(bVar);
    }

    private static int k(p4.a aVar, x4.a aVar2, x4.c cVar, b bVar) throws WriterException {
        int i10 = Integer.MAX_VALUE;
        int i11 = -1;
        for (int i12 = 0; i12 < 8; i12++) {
            e.a(aVar, aVar2, cVar, i12, bVar);
            int iJ = j(bVar);
            if (iJ < i10) {
                i11 = i12;
                i10 = iJ;
            }
        }
        return i11;
    }

    private static x4.b l(String str, String str2) {
        if ("Shift_JIS".equals(str2) && s(str)) {
            return x4.b.KANJI;
        }
        boolean z10 = false;
        boolean z11 = false;
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt >= '0' && cCharAt <= '9') {
                z11 = true;
            } else {
                if (p(cCharAt) == -1) {
                    return x4.b.BYTE;
                }
                z10 = true;
            }
        }
        if (z10) {
            return x4.b.ALPHANUMERIC;
        }
        return z11 ? x4.b.NUMERIC : x4.b.BYTE;
    }

    private static x4.c m(int i10, x4.a aVar) throws WriterException {
        for (int i11 = 1; i11 <= 40; i11++) {
            x4.c cVarE = x4.c.e(i11);
            if (v(i10, cVarE, aVar)) {
                return cVarE;
            }
        }
        throw new WriterException("Data too big");
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0095  */
    public static f n(String str, x4.a aVar, Map<com.google.zxing.c, ?> map) throws WriterException {
        x4.c cVarT;
        p4.c cVarB;
        boolean z10 = map != null && map.containsKey(com.google.zxing.c.CHARACTER_SET);
        String string = z10 ? map.get(com.google.zxing.c.CHARACTER_SET).toString() : "ISO-8859-1";
        x4.b bVarL = l(str, string);
        p4.a aVar2 = new p4.a();
        x4.b bVar = x4.b.BYTE;
        if (bVarL == bVar && z10 && (cVarB = p4.c.b(string)) != null) {
            d(cVarB, aVar2);
        }
        if ((map != null && map.containsKey(com.google.zxing.c.GS1_FORMAT)) && Boolean.valueOf(map.get(com.google.zxing.c.GS1_FORMAT).toString()).booleanValue()) {
            g(x4.b.FNC1_FIRST_POSITION, aVar2);
        }
        g(bVarL, aVar2);
        p4.a aVar3 = new p4.a();
        c(str, bVarL, aVar3, string);
        if (map != null) {
            com.google.zxing.c cVar = com.google.zxing.c.QR_VERSION;
            if (map.containsKey(cVar)) {
                cVarT = x4.c.e(Integer.parseInt(map.get(cVar).toString()));
                if (!v(i(bVarL, aVar2, aVar3, cVarT), cVarT, aVar)) {
                    throw new WriterException("Data too big for requested version");
                }
            } else {
                cVarT = t(aVar, bVarL, aVar2, aVar3);
            }
        } else {
            cVarT = t(aVar, bVarL, aVar2, aVar3);
        }
        p4.a aVar4 = new p4.a();
        aVar4.b(aVar2);
        f(bVarL == bVar ? aVar3.k() : str.length(), cVarT, bVarL, aVar4);
        aVar4.b(aVar3);
        x4.c.b bVarC = cVarT.c(aVar);
        int iD = cVarT.d() - bVarC.d();
        u(iD, aVar4);
        p4.a aVarR = r(aVar4, cVarT.d(), iD, bVarC.c());
        f fVar = new f();
        fVar.c(aVar);
        fVar.f(bVarL);
        fVar.g(cVarT);
        int iB = cVarT.b();
        b bVar2 = new b(iB, iB);
        int iK = k(aVarR, aVar, cVarT, bVar2);
        fVar.d(iK);
        e.a(aVarR, aVar, cVarT, iK, bVar2);
        fVar.e(bVar2);
        return fVar;
    }

    static byte[] o(byte[] bArr, int i10) {
        int length = bArr.length;
        int[] iArr = new int[length + i10];
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = bArr[i11] & 255;
        }
        new q4.c(q4.a.f24408l).b(iArr, i10);
        byte[] bArr2 = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr2[i12] = (byte) iArr[length + i12];
        }
        return bArr2;
    }

    static int p(int i10) {
        int[] iArr = f28651a;
        if (i10 < iArr.length) {
            return iArr[i10];
        }
        return -1;
    }

    static void q(int i10, int i11, int i12, int i13, int[] iArr, int[] iArr2) throws WriterException {
        if (i13 >= i12) {
            throw new WriterException("Block ID too large");
        }
        int i14 = i10 % i12;
        int i15 = i12 - i14;
        int i16 = i10 / i12;
        int i17 = i16 + 1;
        int i18 = i11 / i12;
        int i19 = i18 + 1;
        int i20 = i16 - i18;
        int i21 = i17 - i19;
        if (i20 != i21) {
            throw new WriterException("EC bytes mismatch");
        }
        if (i12 != i15 + i14) {
            throw new WriterException("RS blocks mismatch");
        }
        if (i10 != ((i18 + i20) * i15) + ((i19 + i21) * i14)) {
            throw new WriterException("Total bytes mismatch");
        }
        if (i13 < i15) {
            iArr[0] = i18;
            iArr2[0] = i20;
        } else {
            iArr[0] = i19;
            iArr2[0] = i21;
        }
    }

    static p4.a r(p4.a aVar, int i10, int i11, int i12) throws WriterException {
        if (aVar.k() != i11) {
            throw new WriterException("Number of bits and data bytes does not match");
        }
        ArrayList arrayList = new ArrayList(i12);
        int i13 = 0;
        int iMax = 0;
        int iMax2 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            int[] iArr = new int[1];
            int[] iArr2 = new int[1];
            q(i10, i11, i12, i14, iArr, iArr2);
            int i15 = iArr[0];
            byte[] bArr = new byte[i15];
            aVar.m(i13 << 3, bArr, 0, i15);
            byte[] bArrO = o(bArr, iArr2[0]);
            arrayList.add(new y4.a(bArr, bArrO));
            iMax = Math.max(iMax, i15);
            iMax2 = Math.max(iMax2, bArrO.length);
            i13 += iArr[0];
        }
        if (i11 != i13) {
            throw new WriterException("Data bytes does not match offset");
        }
        p4.a aVar2 = new p4.a();
        for (int i16 = 0; i16 < iMax; i16++) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                byte[] bArrA = ((y4.a) it.next()).a();
                if (i16 < bArrA.length) {
                    aVar2.d(bArrA[i16], 8);
                }
            }
        }
        for (int i17 = 0; i17 < iMax2; i17++) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                byte[] bArrB = ((y4.a) it2.next()).b();
                if (i17 < bArrB.length) {
                    aVar2.d(bArrB[i17], 8);
                }
            }
        }
        if (i10 == aVar2.k()) {
            return aVar2;
        }
        throw new WriterException("Interleaving error: " + i10 + " and " + aVar2.k() + " differ.");
    }

    private static boolean s(String str) {
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            if (length % 2 != 0) {
                return false;
            }
            for (int i10 = 0; i10 < length; i10 += 2) {
                int i11 = bytes[i10] & 255;
                if ((i11 < 129 || i11 > 159) && (i11 < 224 || i11 > 235)) {
                    return false;
                }
            }
            return true;
        } catch (UnsupportedEncodingException unused) {
            return false;
        }
    }

    private static x4.c t(x4.a aVar, x4.b bVar, p4.a aVar2, p4.a aVar3) throws WriterException {
        return m(i(bVar, aVar2, aVar3, m(i(bVar, aVar2, aVar3, x4.c.e(1)), aVar)), aVar);
    }

    static void u(int i10, p4.a aVar) throws WriterException {
        int i11 = i10 << 3;
        if (aVar.j() > i11) {
            throw new WriterException("data bits cannot fit in the QR Code" + aVar.j() + " > " + i11);
        }
        for (int i12 = 0; i12 < 4 && aVar.j() < i11; i12++) {
            aVar.a(false);
        }
        int iJ = aVar.j() & 7;
        if (iJ > 0) {
            while (iJ < 8) {
                aVar.a(false);
                iJ++;
            }
        }
        int iK = i10 - aVar.k();
        for (int i13 = 0; i13 < iK; i13++) {
            aVar.d((i13 & 1) == 0 ? 236 : 17, 8);
        }
        if (aVar.j() != i11) {
            throw new WriterException("Bits size does not equal capacity");
        }
    }

    private static boolean v(int i10, x4.c cVar, x4.a aVar) {
        return cVar.d() - cVar.c(aVar).d() >= (i10 + 7) / 8;
    }
}
