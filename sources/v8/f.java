package v8;

/* JADX INFO: compiled from: CeaUtil.java */
/* JADX INFO: loaded from: classes4.dex */
public final class f {
    public static void a(long j10, x7.a0 a0Var, o0[] o0VarArr) {
        while (true) {
            if (a0Var.a() <= 1) {
                return;
            }
            int iC = c(a0Var);
            int iC2 = c(a0Var);
            int iF = a0Var.f() + iC2;
            if (iC2 == -1 || iC2 > a0Var.a()) {
                x7.r.h("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                iF = a0Var.g();
            } else if (iC == 4 && iC2 >= 8) {
                int iH = a0Var.H();
                int iP = a0Var.P();
                int iQ = iP == 49 ? a0Var.q() : 0;
                int iH2 = a0Var.H();
                if (iP == 47) {
                    a0Var.X(1);
                }
                boolean z10 = iH == 181 && (iP == 49 || iP == 47) && iH2 == 3;
                if (iP == 49) {
                    z10 &= iQ == 1195456820;
                }
                if (z10) {
                    b(j10, a0Var, o0VarArr);
                }
            }
            a0Var.W(iF);
        }
    }

    public static void b(long j10, x7.a0 a0Var, o0[] o0VarArr) {
        int iH = a0Var.H();
        if ((iH & 64) != 0) {
            a0Var.X(1);
            int i10 = (iH & 31) * 3;
            int iF = a0Var.f();
            for (o0 o0Var : o0VarArr) {
                a0Var.W(iF);
                o0Var.b(a0Var, i10);
                x7.a.g(j10 != -9223372036854775807L);
                o0Var.f(j10, 1, i10, 0, null);
            }
        }
    }

    private static int c(x7.a0 a0Var) {
        int i10 = 0;
        while (a0Var.a() != 0) {
            int iH = a0Var.H();
            i10 += iH;
            if (iH != 255) {
                return i10;
            }
        }
        return -1;
    }
}
