package t4;

import com.google.zxing.FormatException;
import com.google.zxing.WriterException;
import java.util.Map;
import s.sBoZ.TwDPD;

/* JADX INFO: compiled from: UPCEWriter.java */
/* JADX INFO: loaded from: classes4.dex */
public final class s extends q {
    @Override // t4.n, com.google.zxing.e
    public p4.b a(String str, com.google.zxing.a aVar, int i10, int i11, Map<com.google.zxing.c, ?> map) throws WriterException {
        if (aVar == com.google.zxing.a.UPC_E) {
            return super.a(str, aVar, i10, i11, map);
        }
        throw new IllegalArgumentException("Can only encode UPC_E, but got ".concat(String.valueOf(aVar)));
    }

    @Override // t4.n
    public boolean[] c(String str) {
        int length = str.length();
        if (length != 7) {
            if (length == 8) {
                try {
                    if (!p.a(str)) {
                        throw new IllegalArgumentException("Contents do not pass checksum");
                    }
                } catch (FormatException unused) {
                    throw new IllegalArgumentException("Illegal contents");
                }
            } else {
                throw new IllegalArgumentException("Requested contents should be 8 digits long, but got ".concat(String.valueOf(length)));
            }
        } else {
            try {
                str = str + p.b(r.c(str));
            } catch (FormatException e10) {
                throw new IllegalArgumentException(e10);
            }
        }
        int iDigit = Character.digit(str.charAt(0), 10);
        if (iDigit != 0 && iDigit != 1) {
            throw new IllegalArgumentException(TwDPD.rRR);
        }
        int i10 = r.f25522g[iDigit][Character.digit(str.charAt(7), 10)];
        boolean[] zArr = new boolean[51];
        int iB = n.b(zArr, 0, p.f25516a, true) + 0;
        for (int i11 = 1; i11 <= 6; i11++) {
            int iDigit2 = Character.digit(str.charAt(i11), 10);
            if (((i10 >> (6 - i11)) & 1) == 1) {
                iDigit2 += 10;
            }
            iB += n.b(zArr, iB, p.f25520e[iDigit2], false);
        }
        n.b(zArr, iB, p.f25518c, false);
        return zArr;
    }
}
