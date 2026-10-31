package t4;

import com.google.zxing.FormatException;
import com.google.zxing.WriterException;
import java.util.Map;

/* JADX INFO: compiled from: EAN13Writer.java */
/* JADX INFO: loaded from: classes4.dex */
public final class j extends q {
    @Override // t4.n, com.google.zxing.e
    public p4.b a(String str, com.google.zxing.a aVar, int i10, int i11, Map<com.google.zxing.c, ?> map) throws WriterException {
        if (aVar == com.google.zxing.a.EAN_13) {
            return super.a(str, aVar, i10, i11, map);
        }
        throw new IllegalArgumentException("Can only encode EAN_13, but got ".concat(String.valueOf(aVar)));
    }

    @Override // t4.n
    public boolean[] c(String str) {
        int length = str.length();
        if (length == 12) {
            try {
                str = str + p.b(str);
            } catch (FormatException e10) {
                throw new IllegalArgumentException(e10);
            }
        } else {
            if (length != 13) {
                throw new IllegalArgumentException("Requested contents should be 12 or 13 digits long, but got ".concat(String.valueOf(length)));
            }
            try {
                if (!p.a(str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (FormatException unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        }
        int i10 = i.f25511f[Character.digit(str.charAt(0), 10)];
        boolean[] zArr = new boolean[95];
        int iB = n.b(zArr, 0, p.f25516a, true) + 0;
        for (int i11 = 1; i11 <= 6; i11++) {
            int iDigit = Character.digit(str.charAt(i11), 10);
            if (((i10 >> (6 - i11)) & 1) == 1) {
                iDigit += 10;
            }
            iB += n.b(zArr, iB, p.f25520e[iDigit], false);
        }
        int iB2 = iB + n.b(zArr, iB, p.f25517b, false);
        for (int i12 = 7; i12 <= 12; i12++) {
            iB2 += n.b(zArr, iB2, p.f25519d[Character.digit(str.charAt(i12), 10)], true);
        }
        n.b(zArr, iB2, p.f25516a, true);
        return zArr;
    }
}
