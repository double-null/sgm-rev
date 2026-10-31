package u4;

import com.google.zxing.WriterException;
import com.google.zxing.c;
import com.google.zxing.e;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Map;
import p4.b;
import v4.d;

/* JADX INFO: compiled from: PDF417Writer.java */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements e {
    private static b b(byte[][] bArr, int i10) {
        int i11 = i10 * 2;
        b bVar = new b(bArr[0].length + i11, bArr.length + i11);
        bVar.b();
        int iH = (bVar.h() - i10) - 1;
        int i12 = 0;
        while (i12 < bArr.length) {
            byte[] bArr2 = bArr[i12];
            for (int i13 = 0; i13 < bArr[0].length; i13++) {
                if (bArr2[i13] == 1) {
                    bVar.j(i13 + i10, iH);
                }
            }
            i12++;
            iH--;
        }
        return bVar;
    }

    private static b c(v4.e eVar, String str, int i10, int i11, int i12, int i13) throws WriterException {
        boolean z10;
        eVar.e(str, i10);
        byte[][] bArrB = eVar.f().b(1, 4);
        if ((i12 > i11) != (bArrB[0].length < bArrB.length)) {
            bArrB = d(bArrB);
            z10 = true;
        } else {
            z10 = false;
        }
        int length = i11 / bArrB[0].length;
        int length2 = i12 / bArrB.length;
        if (length >= length2) {
            length = length2;
        }
        if (length <= 1) {
            return b(bArrB, i13);
        }
        byte[][] bArrB2 = eVar.f().b(length, length << 2);
        if (z10) {
            bArrB2 = d(bArrB2);
        }
        return b(bArrB2, i13);
    }

    private static byte[][] d(byte[][] bArr) {
        byte[][] bArr2 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, bArr[0].length, bArr.length);
        for (int i10 = 0; i10 < bArr.length; i10++) {
            int length = (bArr.length - i10) - 1;
            for (int i11 = 0; i11 < bArr[0].length; i11++) {
                bArr2[i11][length] = bArr[i10][i11];
            }
        }
        return bArr2;
    }

    @Override // com.google.zxing.e
    public b a(String str, com.google.zxing.a aVar, int i10, int i11, Map<c, ?> map) throws WriterException {
        if (aVar != com.google.zxing.a.PDF_417) {
            throw new IllegalArgumentException("Can only encode PDF_417, but got ".concat(String.valueOf(aVar)));
        }
        v4.e eVar = new v4.e();
        int i12 = 30;
        int i13 = 2;
        if (map != null) {
            c cVar = c.PDF417_COMPACT;
            if (map.containsKey(cVar)) {
                eVar.h(Boolean.valueOf(map.get(cVar).toString()).booleanValue());
            }
            c cVar2 = c.PDF417_COMPACTION;
            if (map.containsKey(cVar2)) {
                eVar.i(v4.c.valueOf(map.get(cVar2).toString()));
            }
            c cVar3 = c.PDF417_DIMENSIONS;
            if (map.containsKey(cVar3)) {
                d dVar = (d) map.get(cVar3);
                eVar.j(dVar.a(), dVar.c(), dVar.b(), dVar.d());
            }
            c cVar4 = c.MARGIN;
            i12 = map.containsKey(cVar4) ? Integer.parseInt(map.get(cVar4).toString()) : 30;
            c cVar5 = c.ERROR_CORRECTION;
            i13 = map.containsKey(cVar5) ? Integer.parseInt(map.get(cVar5).toString()) : 2;
            c cVar6 = c.CHARACTER_SET;
            if (map.containsKey(cVar6)) {
                eVar.k(Charset.forName(map.get(cVar6).toString()));
            }
        }
        return c(eVar, str, i13, i10, i11, i12);
    }
}
