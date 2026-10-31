package r4;

import com.google.zxing.c;
import com.google.zxing.e;
import java.util.Map;
import p4.b;
import s4.i;
import s4.j;
import s4.k;
import s4.l;

/* JADX INFO: compiled from: DataMatrixWriter.java */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements e {
    private static b b(y4.b bVar, int i10, int i11) {
        b bVar2;
        int iE = bVar.e();
        int iD = bVar.d();
        int iMax = Math.max(i10, iE);
        int iMax2 = Math.max(i11, iD);
        int iMin = Math.min(iMax / iE, iMax2 / iD);
        int i12 = (iMax - (iE * iMin)) / 2;
        int i13 = (iMax2 - (iD * iMin)) / 2;
        if (i11 < iD || i10 < iE) {
            bVar2 = new b(iE, iD);
            i12 = 0;
            i13 = 0;
        } else {
            bVar2 = new b(i10, i11);
        }
        bVar2.b();
        int i14 = 0;
        while (i14 < iD) {
            int i15 = i12;
            int i16 = 0;
            while (i16 < iE) {
                if (bVar.b(i16, i14) == 1) {
                    bVar2.k(i15, i13, iMin, iMin);
                }
                i16++;
                i15 += iMin;
            }
            i14++;
            i13 += iMin;
        }
        return bVar2;
    }

    private static b c(s4.e eVar, k kVar, int i10, int i11) {
        int iH = kVar.h();
        int iG = kVar.g();
        y4.b bVar = new y4.b(kVar.j(), kVar.i());
        int i12 = 0;
        for (int i13 = 0; i13 < iG; i13++) {
            if (i13 % kVar.f25229e == 0) {
                int i14 = 0;
                for (int i15 = 0; i15 < kVar.j(); i15++) {
                    bVar.g(i14, i12, i15 % 2 == 0);
                    i14++;
                }
                i12++;
            }
            int i16 = 0;
            for (int i17 = 0; i17 < iH; i17++) {
                if (i17 % kVar.f25228d == 0) {
                    bVar.g(i16, i12, true);
                    i16++;
                }
                bVar.g(i16, i12, eVar.e(i17, i13));
                i16++;
                int i18 = kVar.f25228d;
                if (i17 % i18 == i18 - 1) {
                    bVar.g(i16, i12, i13 % 2 == 0);
                    i16++;
                }
            }
            i12++;
            int i19 = kVar.f25229e;
            if (i13 % i19 == i19 - 1) {
                int i20 = 0;
                for (int i21 = 0; i21 < kVar.j(); i21++) {
                    bVar.g(i20, i12, true);
                    i20++;
                }
                i12++;
            }
        }
        return b(bVar, i10, i11);
    }

    @Override // com.google.zxing.e
    public b a(String str, com.google.zxing.a aVar, int i10, int i11, Map<c, ?> map) {
        com.google.zxing.b bVar;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (aVar != com.google.zxing.a.DATA_MATRIX) {
            throw new IllegalArgumentException("Can only encode DATA_MATRIX, but got ".concat(String.valueOf(aVar)));
        }
        if (i10 < 0 || i11 < 0) {
            throw new IllegalArgumentException("Requested dimensions can't be negative: " + i10 + 'x' + i11);
        }
        l lVar = l.FORCE_NONE;
        com.google.zxing.b bVar2 = null;
        if (map != null) {
            l lVar2 = (l) map.get(c.DATA_MATRIX_SHAPE);
            if (lVar2 != null) {
                lVar = lVar2;
            }
            com.google.zxing.b bVar3 = (com.google.zxing.b) map.get(c.MIN_SIZE);
            if (bVar3 == null) {
                bVar3 = null;
            }
            bVar = (com.google.zxing.b) map.get(c.MAX_SIZE);
            if (bVar == null) {
                bVar = null;
            }
            bVar2 = bVar3;
        } else {
            bVar = null;
        }
        String strB = j.b(str, lVar, bVar2, bVar);
        k kVarL = k.l(strB.length(), lVar, bVar2, bVar, true);
        s4.e eVar = new s4.e(i.c(strB, kVarL), kVarL.h(), kVarL.g());
        eVar.h();
        return c(eVar, kVarL, i10, i11);
    }
}
