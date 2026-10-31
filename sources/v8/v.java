package v8;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import io.bidmachine.media3.common.ParserException;
import java.io.IOException;

/* JADX INFO: compiled from: FlacFrameReader.java */
/* JADX INFO: loaded from: classes4.dex */
public final class v {

    /* JADX INFO: compiled from: FlacFrameReader.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f27436a;
    }

    private static boolean a(x7.a0 a0Var, y yVar, int i10) {
        int iJ = j(a0Var, i10);
        return iJ != -1 && iJ <= yVar.f27441b;
    }

    private static boolean b(x7.a0 a0Var, int i10) {
        return a0Var.H() == x7.l0.y(a0Var.e(), i10, a0Var.f() - 1, 0);
    }

    private static boolean c(x7.a0 a0Var, y yVar, boolean z10, a aVar) {
        try {
            long jQ = a0Var.Q();
            if (!z10) {
                jQ *= (long) yVar.f27441b;
            }
            aVar.f27436a = jQ;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static boolean d(x7.a0 a0Var, y yVar, int i10, a aVar) {
        int iF = a0Var.f();
        long J = a0Var.J();
        long j10 = J >>> 16;
        if (j10 != i10) {
            return false;
        }
        return g((int) ((J >> 4) & 15), yVar) && f((int) ((J >> 1) & 7), yVar) && !(((J & 1) > 1L ? 1 : ((J & 1) == 1L ? 0 : -1)) == 0) && c(a0Var, yVar, ((j10 & 1) > 1L ? 1 : ((j10 & 1) == 1L ? 0 : -1)) == 0, aVar) && a(a0Var, yVar, (int) ((J >> 12) & 15)) && e(a0Var, yVar, (int) ((J >> 8) & 15)) && b(a0Var, iF);
    }

    private static boolean e(x7.a0 a0Var, y yVar, int i10) {
        int i11 = yVar.f27444e;
        if (i10 == 0) {
            return true;
        }
        if (i10 <= 11) {
            return i10 == yVar.f27445f;
        }
        if (i10 == 12) {
            return a0Var.H() * 1000 == i11;
        }
        if (i10 > 14) {
            return false;
        }
        int iP = a0Var.P();
        if (i10 == 14) {
            iP *= 10;
        }
        return iP == i11;
    }

    private static boolean f(int i10, y yVar) {
        return i10 == 0 || i10 == yVar.f27448i;
    }

    private static boolean g(int i10, y yVar) {
        if (i10 <= 7) {
            return i10 == yVar.f27446g - 1;
        }
        return i10 <= 10 && yVar.f27446g == 2;
    }

    public static boolean h(q qVar, y yVar, int i10, a aVar) throws IOException {
        long jF = qVar.f();
        byte[] bArr = new byte[2];
        qVar.n(bArr, 0, 2);
        if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i10) {
            qVar.d();
            qVar.g((int) (jF - qVar.getPosition()));
            return false;
        }
        x7.a0 a0Var = new x7.a0(16);
        System.arraycopy(bArr, 0, a0Var.e(), 0, 2);
        a0Var.V(s.c(qVar, a0Var.e(), 2, 14));
        qVar.d();
        qVar.g((int) (jF - qVar.getPosition()));
        return d(a0Var, yVar, i10, aVar);
    }

    public static long i(q qVar, y yVar) throws IOException {
        qVar.d();
        qVar.g(1);
        byte[] bArr = new byte[1];
        qVar.n(bArr, 0, 1);
        boolean z10 = (bArr[0] & 1) == 1;
        qVar.g(2);
        int i10 = z10 ? 7 : 6;
        x7.a0 a0Var = new x7.a0(i10);
        a0Var.V(s.c(qVar, a0Var.e(), 0, i10));
        qVar.d();
        a aVar = new a();
        if (c(a0Var, yVar, z10, aVar)) {
            return aVar.f27436a;
        }
        throw ParserException.b(null, null);
    }

    public static int j(x7.a0 a0Var, int i10) {
        switch (i10) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i10 - 2);
            case 6:
                return a0Var.H() + 1;
            case 7:
                return a0Var.P() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return UserVerificationMethods.USER_VERIFY_HANDPRINT << (i10 - 8);
            default:
                return -1;
        }
    }
}
