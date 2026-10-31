package p9;

import x7.a0;

/* JADX INFO: compiled from: SmtaAtomUtil.java */
/* JADX INFO: loaded from: classes4.dex */
public final class r {
    private static int a(int i10, a0 a0Var, int i11) {
        if (i10 == 12) {
            return 240;
        }
        if (i10 == 13) {
            return 120;
        }
        if (i10 == 21 && a0Var.a() >= 8 && a0Var.f() + 8 <= i11) {
            int iQ = a0Var.q();
            int iQ2 = a0Var.q();
            if (iQ >= 12 && iQ2 == 1936877170) {
                return a0Var.I();
            }
        }
        return -2147483647;
    }

    public static u7.v b(a0 a0Var, int i10) {
        a0Var.X(12);
        while (a0Var.f() < i10) {
            int iF = a0Var.f();
            int iQ = a0Var.q();
            if (a0Var.q() == 1935766900) {
                if (iQ < 16) {
                    return null;
                }
                a0Var.X(4);
                int i11 = -1;
                int i12 = 0;
                for (int i13 = 0; i13 < 2; i13++) {
                    int iH = a0Var.H();
                    int iH2 = a0Var.H();
                    if (iH == 0) {
                        i11 = iH2;
                    } else if (iH == 1) {
                        i12 = iH2;
                    }
                }
                int iA = a(i11, a0Var, i10);
                if (iA == -2147483647) {
                    return null;
                }
                return new u7.v(new k9.d(iA, i12));
            }
            a0Var.W(iF + iQ);
        }
        return null;
    }
}
