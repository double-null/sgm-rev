package n4;

import com.google.zxing.e;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import o4.c;
import p4.b;

/* JADX INFO: compiled from: AztecWriter.java */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements e {
    private static b b(String str, com.google.zxing.a aVar, int i10, int i11, Charset charset, int i12, int i13) {
        if (aVar == com.google.zxing.a.AZTEC) {
            return c(c.d(str.getBytes(charset), i12, i13), i10, i11);
        }
        throw new IllegalArgumentException("Can only encode AZTEC, but got ".concat(String.valueOf(aVar)));
    }

    private static b c(o4.a aVar, int i10, int i11) {
        b bVarA = aVar.a();
        if (bVarA == null) {
            throw new IllegalStateException();
        }
        int i12 = bVarA.i();
        int iH = bVarA.h();
        int iMax = Math.max(i10, i12);
        int iMax2 = Math.max(i11, iH);
        int iMin = Math.min(iMax / i12, iMax2 / iH);
        int i13 = (iMax - (i12 * iMin)) / 2;
        int i14 = (iMax2 - (iH * iMin)) / 2;
        b bVar = new b(iMax, iMax2);
        int i15 = 0;
        while (i15 < iH) {
            int i16 = 0;
            int i17 = i13;
            while (i16 < i12) {
                if (bVarA.g(i16, i15)) {
                    bVar.k(i17, i14, iMin, iMin);
                }
                i16++;
                i17 += iMin;
            }
            i15++;
            i14 += iMin;
        }
        return bVar;
    }

    @Override // com.google.zxing.e
    public b a(String str, com.google.zxing.a aVar, int i10, int i11, Map<com.google.zxing.c, ?> map) {
        Charset charsetForName = StandardCharsets.ISO_8859_1;
        int i12 = 33;
        int i13 = 0;
        if (map != null) {
            com.google.zxing.c cVar = com.google.zxing.c.CHARACTER_SET;
            if (map.containsKey(cVar)) {
                charsetForName = Charset.forName(map.get(cVar).toString());
            }
            com.google.zxing.c cVar2 = com.google.zxing.c.ERROR_CORRECTION;
            i12 = map.containsKey(cVar2) ? Integer.parseInt(map.get(cVar2).toString()) : 33;
            com.google.zxing.c cVar3 = com.google.zxing.c.AZTEC_LAYERS;
            if (map.containsKey(cVar3)) {
                i13 = Integer.parseInt(map.get(cVar3).toString());
            }
        }
        return b(str, aVar, i10, i11, charsetForName, i12, i13);
    }
}
