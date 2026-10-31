package t4;

import com.google.zxing.FormatException;
import com.google.zxing.WriterException;
import java.util.Map;

/* JADX INFO: compiled from: EAN8Writer.java */
/* JADX INFO: loaded from: classes4.dex */
public final class k extends q {
    @Override // t4.n, com.google.zxing.e
    public p4.b a(String str, com.google.zxing.a aVar, int i10, int i11, Map<com.google.zxing.c, ?> map) throws WriterException {
        if (aVar == com.google.zxing.a.EAN_8) {
            return super.a(str, aVar, i10, i11, map);
        }
        throw new IllegalArgumentException("Can only encode EAN_8, but got ".concat(String.valueOf(aVar)));
    }

    @Override // t4.n
    public boolean[] c(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                str = str + p.b(str);
            } catch (FormatException e10) {
                throw new IllegalArgumentException(e10);
            }
        } else {
            if (length != 8) {
                throw new IllegalArgumentException("Requested contents should be 8 digits long, but got ".concat(String.valueOf(length)));
            }
            try {
                if (!p.a(str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (FormatException unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        }
        boolean[] zArr = new boolean[67];
        int iB = n.b(zArr, 0, p.f25516a, true) + 0;
        for (int i10 = 0; i10 <= 3; i10++) {
            iB += n.b(zArr, iB, p.f25519d[Character.digit(str.charAt(i10), 10)], false);
        }
        int iB2 = iB + n.b(zArr, iB, p.f25517b, false);
        for (int i11 = 4; i11 <= 7; i11++) {
            iB2 += n.b(zArr, iB2, p.f25519d[Character.digit(str.charAt(i11), 10)], true);
        }
        n.b(zArr, iB2, p.f25516a, true);
        return zArr;
    }
}
