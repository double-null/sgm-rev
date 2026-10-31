package p9;

import c2.YDwL.tFQWuE;
import v8.b0;
import x7.a0;

/* JADX INFO: compiled from: MetadataUtil.java */
/* JADX INFO: loaded from: classes4.dex */
final class j {
    public static y7.a a(u7.v vVar, String str) {
        for (int i10 = 0; i10 < vVar.e(); i10++) {
            u7.v.a aVarD = vVar.d(i10);
            if (aVarD instanceof y7.a) {
                y7.a aVar = (y7.a) aVarD;
                if (aVar.f28679a.equals(str)) {
                    return aVar;
                }
            }
        }
        return null;
    }

    private static j9.e b(int i10, a0 a0Var) {
        int iQ = a0Var.q();
        if (a0Var.q() == 1684108385) {
            a0Var.X(8);
            String strC = a0Var.C(iQ - 16);
            return new j9.e("und", strC, strC);
        }
        x7.r.h("MetadataUtil", "Failed to parse comment attribute: " + y7.c.a(i10));
        return null;
    }

    private static j9.a c(a0 a0Var) {
        String str;
        int iQ = a0Var.q();
        if (a0Var.q() != 1684108385) {
            x7.r.h("MetadataUtil", "Failed to parse cover art attribute");
            return null;
        }
        int iO = b.o(a0Var.q());
        if (iO == 13) {
            str = "image/jpeg";
        } else {
            str = iO == 14 ? "image/png" : null;
        }
        if (str == null) {
            x7.r.h("MetadataUtil", "Unrecognized cover art flags: " + iO);
            return null;
        }
        a0Var.X(4);
        int i10 = iQ - 16;
        byte[] bArr = new byte[i10];
        a0Var.l(bArr, 0, i10);
        return new j9.a(str, null, 3, bArr);
    }

    public static u7.v.a d(a0 a0Var) {
        int iF = a0Var.f() + a0Var.q();
        int iQ = a0Var.q();
        int i10 = (iQ >> 24) & 255;
        try {
            if (i10 == 169 || i10 == 253) {
                int i11 = 16777215 & iQ;
                if (i11 == 6516084) {
                    j9.e eVarB = b(iQ, a0Var);
                    a0Var.W(iF);
                    return eVarB;
                }
                if (i11 == 7233901 || i11 == 7631467) {
                    j9.n nVarK = k(iQ, "TIT2", a0Var);
                    a0Var.W(iF);
                    return nVarK;
                }
                if (i11 == 6516589 || i11 == 7828084) {
                    j9.n nVarK2 = k(iQ, "TCOM", a0Var);
                    a0Var.W(iF);
                    return nVarK2;
                }
                if (i11 == 6578553) {
                    j9.n nVarK3 = k(iQ, "TDRC", a0Var);
                    a0Var.W(iF);
                    return nVarK3;
                }
                if (i11 == 4280916) {
                    j9.n nVarK4 = k(iQ, "TPE1", a0Var);
                    a0Var.W(iF);
                    return nVarK4;
                }
                if (i11 == 7630703) {
                    j9.n nVarK5 = k(iQ, "TSSE", a0Var);
                    a0Var.W(iF);
                    return nVarK5;
                }
                if (i11 == 6384738) {
                    j9.n nVarK6 = k(iQ, "TALB", a0Var);
                    a0Var.W(iF);
                    return nVarK6;
                }
                if (i11 == 7108978) {
                    j9.n nVarK7 = k(iQ, "USLT", a0Var);
                    a0Var.W(iF);
                    return nVarK7;
                }
                if (i11 == 6776174) {
                    j9.n nVarK8 = k(iQ, "TCON", a0Var);
                    a0Var.W(iF);
                    return nVarK8;
                }
                if (i11 == 6779504) {
                    j9.n nVarK9 = k(iQ, "TIT1", a0Var);
                    a0Var.W(iF);
                    return nVarK9;
                }
            } else {
                if (iQ == 1735291493) {
                    j9.n nVarJ = j(a0Var);
                    a0Var.W(iF);
                    return nVarJ;
                }
                if (iQ == 1684632427) {
                    j9.n nVarE = e(iQ, "TPOS", a0Var);
                    a0Var.W(iF);
                    return nVarE;
                }
                if (iQ == 1953655662) {
                    j9.n nVarE2 = e(iQ, "TRCK", a0Var);
                    a0Var.W(iF);
                    return nVarE2;
                }
                if (iQ == 1953329263) {
                    j9.i iVarG = g(iQ, "TBPM", a0Var, true, false);
                    a0Var.W(iF);
                    return iVarG;
                }
                if (iQ == 1668311404) {
                    j9.i iVarG2 = g(iQ, "TCMP", a0Var, true, true);
                    a0Var.W(iF);
                    return iVarG2;
                }
                if (iQ == 1668249202) {
                    j9.a aVarC = c(a0Var);
                    a0Var.W(iF);
                    return aVarC;
                }
                if (iQ == 1631670868) {
                    j9.n nVarK10 = k(iQ, "TPE2", a0Var);
                    a0Var.W(iF);
                    return nVarK10;
                }
                if (iQ == 1936682605) {
                    j9.n nVarK11 = k(iQ, "TSOT", a0Var);
                    a0Var.W(iF);
                    return nVarK11;
                }
                if (iQ == 1936679276) {
                    j9.n nVarK12 = k(iQ, "TSOA", a0Var);
                    a0Var.W(iF);
                    return nVarK12;
                }
                if (iQ == 1936679282) {
                    j9.n nVarK13 = k(iQ, "TSOP", a0Var);
                    a0Var.W(iF);
                    return nVarK13;
                }
                if (iQ == 1936679265) {
                    j9.n nVarK14 = k(iQ, "TSO2", a0Var);
                    a0Var.W(iF);
                    return nVarK14;
                }
                if (iQ == 1936679791) {
                    j9.n nVarK15 = k(iQ, "TSOC", a0Var);
                    a0Var.W(iF);
                    return nVarK15;
                }
                if (iQ == 1920233063) {
                    j9.i iVarG3 = g(iQ, "ITUNESADVISORY", a0Var, false, false);
                    a0Var.W(iF);
                    return iVarG3;
                }
                if (iQ == 1885823344) {
                    j9.i iVarG4 = g(iQ, "ITUNESGAPLESS", a0Var, false, true);
                    a0Var.W(iF);
                    return iVarG4;
                }
                if (iQ == 1936683886) {
                    j9.n nVarK16 = k(iQ, "TVSHOWSORT", a0Var);
                    a0Var.W(iF);
                    return nVarK16;
                }
                if (iQ == 1953919848) {
                    j9.n nVarK17 = k(iQ, "TVSHOW", a0Var);
                    a0Var.W(iF);
                    return nVarK17;
                }
                if (iQ == 757935405) {
                    j9.i iVarH = h(a0Var, iF);
                    a0Var.W(iF);
                    return iVarH;
                }
            }
            x7.r.b("MetadataUtil", "Skipped unknown metadata entry: " + y7.c.a(iQ));
            a0Var.W(iF);
            return null;
        } catch (Throwable th) {
            a0Var.W(iF);
            throw th;
        }
    }

    private static j9.n e(int i10, String str, a0 a0Var) {
        int iQ = a0Var.q();
        if (a0Var.q() == 1684108385 && iQ >= 22) {
            a0Var.X(10);
            int iP = a0Var.P();
            if (iP > 0) {
                String str2 = "" + iP;
                int iP2 = a0Var.P();
                if (iP2 > 0) {
                    str2 = str2 + "/" + iP2;
                }
                return new j9.n(str, null, com.google.common.collect.u.I(str2));
            }
        }
        x7.r.h("MetadataUtil", "Failed to parse index/count attribute: " + y7.c.a(i10));
        return null;
    }

    private static int f(a0 a0Var) {
        int iQ = a0Var.q();
        if (a0Var.q() == 1684108385) {
            a0Var.X(8);
            int i10 = iQ - 16;
            if (i10 == 1) {
                return a0Var.H();
            }
            if (i10 == 2) {
                return a0Var.P();
            }
            if (i10 == 3) {
                return a0Var.K();
            }
            if (i10 == 4 && (a0Var.j() & 128) == 0) {
                return a0Var.L();
            }
        }
        x7.r.h("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    private static j9.i h(a0 a0Var, int i10) {
        String strC = null;
        String strC2 = null;
        int i11 = -1;
        int i12 = -1;
        while (a0Var.f() < i10) {
            int iF = a0Var.f();
            int iQ = a0Var.q();
            int iQ2 = a0Var.q();
            a0Var.X(4);
            if (iQ2 == 1835360622) {
                strC = a0Var.C(iQ - 12);
            } else if (iQ2 == 1851878757) {
                strC2 = a0Var.C(iQ - 12);
            } else {
                if (iQ2 == 1684108385) {
                    i11 = iF;
                    i12 = iQ;
                }
                a0Var.X(iQ - 12);
            }
        }
        if (strC == null || strC2 == null || i11 == -1) {
            return null;
        }
        a0Var.W(i11);
        a0Var.X(16);
        return new j9.k(strC, strC2, a0Var.C(i12 - 16));
    }

    public static y7.a i(a0 a0Var, int i10, String str) {
        while (true) {
            int iF = a0Var.f();
            if (iF >= i10) {
                return null;
            }
            int iQ = a0Var.q();
            if (a0Var.q() == 1684108385) {
                int iQ2 = a0Var.q();
                int iQ3 = a0Var.q();
                int i11 = iQ - 16;
                byte[] bArr = new byte[i11];
                a0Var.l(bArr, 0, i11);
                return new y7.a(str, bArr, iQ3, iQ2);
            }
            a0Var.W(iF + iQ);
        }
    }

    private static j9.n j(a0 a0Var) {
        String strA = j9.j.a(f(a0Var) - 1);
        if (strA != null) {
            return new j9.n("TCON", null, com.google.common.collect.u.I(strA));
        }
        x7.r.h("MetadataUtil", "Failed to parse standard genre code");
        return null;
    }

    private static j9.n k(int i10, String str, a0 a0Var) {
        int iQ = a0Var.q();
        if (a0Var.q() == 1684108385) {
            a0Var.X(8);
            return new j9.n(str, null, com.google.common.collect.u.I(a0Var.C(iQ - 16)));
        }
        x7.r.h("MetadataUtil", "Failed to parse text attribute: " + y7.c.a(i10));
        return null;
    }

    public static void l(int i10, b0 b0Var, u7.q.b bVar) {
        if (i10 == 1 && b0Var.a()) {
            bVar.Z(b0Var.f27242a).a0(b0Var.f27243b);
        }
    }

    public static void m(int i10, u7.v vVar, u7.q.b bVar, u7.v vVar2, u7.v... vVarArr) {
        if (vVar2 == null) {
            vVar2 = new u7.v(new u7.v.a[0]);
        }
        if (vVar != null) {
            for (int i11 = 0; i11 < vVar.e(); i11++) {
                u7.v.a aVarD = vVar.d(i11);
                if (aVarD instanceof y7.a) {
                    y7.a aVar = (y7.a) aVarD;
                    if (!aVar.f28679a.equals("com.android.capture.fps")) {
                        vVar2 = vVar2.a(aVar);
                    } else if (i10 == 2) {
                        vVar2 = vVar2.a(aVar);
                    }
                }
            }
        }
        for (u7.v vVar3 : vVarArr) {
            vVar2 = vVar2.b(vVar3);
        }
        if (vVar2.e() > 0) {
            bVar.n0(vVar2);
        }
    }

    private static j9.i g(int i10, String str, a0 a0Var, boolean z10, boolean z11) {
        int iF = f(a0Var);
        if (z11) {
            iF = Math.min(1, iF);
        }
        if (iF >= 0) {
            if (z10) {
                return new j9.n(str, null, com.google.common.collect.u.I(Integer.toString(iF)));
            }
            return new j9.e("und", str, Integer.toString(iF));
        }
        x7.r.h(tFQWuE.qhRfZAtKcgHRe, "Failed to parse uint8 attribute: " + y7.c.a(i10));
        return null;
    }
}
