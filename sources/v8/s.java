package v8;

import io.bidmachine.media3.common.ParserException;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: compiled from: ExtractorUtil.java */
/* JADX INFO: loaded from: classes4.dex */
public final class s {
    public static void a(boolean z10, String str) throws ParserException {
        if (!z10) {
            throw ParserException.b(str, null);
        }
    }

    public static boolean b(q qVar, byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        try {
            return qVar.b(bArr, i10, i11, z10);
        } catch (EOFException e10) {
            if (z10) {
                return false;
            }
            throw e10;
        }
    }

    public static int c(q qVar, byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        while (i12 < i11) {
            int iJ = qVar.j(bArr, i10 + i12, i11 - i12);
            if (iJ == -1) {
                break;
            }
            i12 += iJ;
        }
        return i12;
    }

    public static boolean d(q qVar, byte[] bArr, int i10, int i11) throws IOException {
        try {
            qVar.readFully(bArr, i10, i11);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean e(q qVar, int i10) throws IOException {
        try {
            qVar.k(i10);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
