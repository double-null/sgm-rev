package ba;

import android.text.TextUtils;
import com.vungle.ads.internal.network.converters.vY.cTJaRZ;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import x7.a0;
import x7.l0;
import x7.r;

/* JADX INFO: compiled from: WebvttCssParser.java */
/* JADX INFO: loaded from: classes4.dex */
final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f4177c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Pattern f4178d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a0 f4179a = new a0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final StringBuilder f4180b = new StringBuilder();

    private void a(c cVar, String str) {
        if ("".equals(str)) {
            return;
        }
        int iIndexOf = str.indexOf(91);
        if (iIndexOf != -1) {
            Matcher matcher = f4177c.matcher(str.substring(iIndexOf));
            if (matcher.matches()) {
                cVar.z((String) x7.a.e(matcher.group(1)));
            }
            str = str.substring(0, iIndexOf);
        }
        String[] strArrM1 = l0.m1(str, "\\.");
        String str2 = strArrM1[0];
        int iIndexOf2 = str2.indexOf(35);
        if (iIndexOf2 != -1) {
            cVar.y(str2.substring(0, iIndexOf2));
            cVar.x(str2.substring(iIndexOf2 + 1));
        } else {
            cVar.y(str2);
        }
        if (strArrM1.length > 1) {
            cVar.w((String[]) l0.Z0(strArrM1, 1, strArrM1.length));
        }
    }

    private static boolean b(a0 a0Var) {
        int iF = a0Var.f();
        int iG = a0Var.g();
        byte[] bArrE = a0Var.e();
        if (iF + 2 > iG) {
            return false;
        }
        int i10 = iF + 1;
        if (bArrE[iF] != 47) {
            return false;
        }
        int i11 = i10 + 1;
        if (bArrE[i10] != 42) {
            return false;
        }
        while (true) {
            int i12 = i11 + 1;
            if (i12 >= iG) {
                a0Var.X(iG - a0Var.f());
                return true;
            }
            if (((char) bArrE[i11]) == '*' && ((char) bArrE[i12]) == '/') {
                i11 = i12 + 1;
                iG = i11;
            } else {
                i11 = i12;
            }
        }
    }

    private static boolean c(a0 a0Var) {
        char cK = k(a0Var, a0Var.f());
        if (cK != '\t' && cK != '\n' && cK != '\f' && cK != '\r' && cK != ' ') {
            return false;
        }
        a0Var.X(1);
        return true;
    }

    private static void e(String str, c cVar) {
        Matcher matcher = f4178d.matcher(com.google.common.base.c.e(str));
        if (!matcher.matches()) {
            r.h("WebvttCssParser", "Invalid font-size: '" + str + "'.");
            return;
        }
        String str2 = (String) x7.a.e(matcher.group(2));
        str2.hashCode();
        switch (str2) {
            case "%":
                cVar.t(3);
                break;
            case "em":
                cVar.t(2);
                break;
            case "px":
                cVar.t(1);
                break;
            default:
                throw new IllegalStateException();
        }
        cVar.s(Float.parseFloat((String) x7.a.e(matcher.group(1))));
    }

    private static String f(a0 a0Var, StringBuilder sb2) {
        boolean z10 = false;
        sb2.setLength(0);
        int iF = a0Var.f();
        int iG = a0Var.g();
        while (iF < iG && !z10) {
            char c10 = (char) a0Var.e()[iF];
            if ((c10 < 'A' || c10 > 'Z') && ((c10 < 'a' || c10 > 'z') && !((c10 >= '0' && c10 <= '9') || c10 == '#' || c10 == '-' || c10 == '.' || c10 == '_'))) {
                z10 = true;
            } else {
                iF++;
                sb2.append(c10);
            }
        }
        a0Var.X(iF - a0Var.f());
        return sb2.toString();
    }

    static String g(a0 a0Var, StringBuilder sb2) {
        n(a0Var);
        if (a0Var.a() == 0) {
            return null;
        }
        String strF = f(a0Var, sb2);
        if (!"".equals(strF)) {
            return strF;
        }
        return "" + ((char) a0Var.H());
    }

    private static String h(a0 a0Var, StringBuilder sb2) {
        StringBuilder sb3 = new StringBuilder();
        boolean z10 = false;
        while (!z10) {
            int iF = a0Var.f();
            String strG = g(a0Var, sb2);
            if (strG == null) {
                return null;
            }
            if ("}".equals(strG) || ";".equals(strG)) {
                a0Var.W(iF);
                z10 = true;
            } else {
                sb3.append(strG);
            }
        }
        return sb3.toString();
    }

    private static void j(a0 a0Var, c cVar, StringBuilder sb2) {
        n(a0Var);
        String strF = f(a0Var, sb2);
        if (!"".equals(strF) && ":".equals(g(a0Var, sb2))) {
            n(a0Var);
            String strH = h(a0Var, sb2);
            if (strH == null || "".equals(strH)) {
                return;
            }
            int iF = a0Var.f();
            String strG = g(a0Var, sb2);
            if (!";".equals(strG)) {
                if (!"}".equals(strG)) {
                    return;
                } else {
                    a0Var.W(iF);
                }
            }
            if ("color".equals(strF)) {
                cVar.q(x7.j.b(strH));
                return;
            }
            if ("background-color".equals(strF)) {
                cVar.n(x7.j.b(strH));
                return;
            }
            boolean z10 = true;
            if ("ruby-position".equals(strF)) {
                if ("over".equals(strH)) {
                    cVar.v(1);
                    return;
                } else {
                    if ("under".equals(strH)) {
                        cVar.v(2);
                        return;
                    }
                    return;
                }
            }
            if ("text-combine-upright".equals(strF)) {
                if (!"all".equals(strH) && !strH.startsWith("digits")) {
                    z10 = false;
                }
                cVar.p(z10);
                return;
            }
            if ("text-decoration".equals(strF)) {
                if ("underline".equals(strH)) {
                    cVar.A(true);
                    return;
                }
                return;
            }
            if ("font-family".equals(strF)) {
                cVar.r(strH);
                return;
            }
            if ("font-weight".equals(strF)) {
                if ("bold".equals(strH)) {
                    cVar.o(true);
                }
            } else if ("font-style".equals(strF)) {
                if ("italic".equals(strH)) {
                    cVar.u(true);
                }
            } else if ("font-size".equals(strF)) {
                e(strH, cVar);
            }
        }
    }

    private static char k(a0 a0Var, int i10) {
        return (char) a0Var.e()[i10];
    }

    private static String l(a0 a0Var) {
        int iF = a0Var.f();
        int iG = a0Var.g();
        boolean z10 = false;
        while (iF < iG && !z10) {
            int i10 = iF + 1;
            z10 = ((char) a0Var.e()[iF]) == ')';
            iF = i10;
        }
        return a0Var.E((iF - 1) - a0Var.f()).trim();
    }

    static void m(a0 a0Var) {
        while (!TextUtils.isEmpty(a0Var.s())) {
        }
    }

    static void n(a0 a0Var) {
        while (true) {
            for (boolean z10 = true; a0Var.a() > 0 && z10; z10 = false) {
                if (!c(a0Var) && !b(a0Var)) {
                }
            }
            return;
        }
    }

    public List<c> d(a0 a0Var) {
        this.f4180b.setLength(0);
        int iF = a0Var.f();
        m(a0Var);
        this.f4179a.U(a0Var.e(), a0Var.f());
        this.f4179a.W(iF);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String strI = i(this.f4179a, this.f4180b);
            if (strI == null) {
                return arrayList;
            }
            if (!"{".equals(g(this.f4179a, this.f4180b))) {
                return arrayList;
            }
            c cVar = new c();
            a(cVar, strI);
            String str = null;
            boolean z10 = false;
            while (!z10) {
                int iF2 = this.f4179a.f();
                String strG = g(this.f4179a, this.f4180b);
                boolean z11 = strG == null || "}".equals(strG);
                if (!z11) {
                    this.f4179a.W(iF2);
                    j(this.f4179a, cVar, this.f4180b);
                }
                str = strG;
                z10 = z11;
            }
            if ("}".equals(str)) {
                arrayList.add(cVar);
            }
        }
    }

    private static String i(a0 a0Var, StringBuilder sb2) {
        String strL;
        n(a0Var);
        if (a0Var.a() < 5 || !"::cue".equals(a0Var.E(5))) {
            return null;
        }
        int iF = a0Var.f();
        String strG = g(a0Var, sb2);
        if (strG == null) {
            return null;
        }
        if ("{".equals(strG)) {
            a0Var.W(iF);
            return "";
        }
        if (cTJaRZ.aafG.equals(strG)) {
            strL = l(a0Var);
        } else {
            strL = null;
        }
        if (!")".equals(g(a0Var, sb2))) {
            return null;
        }
        return strL;
    }
}
