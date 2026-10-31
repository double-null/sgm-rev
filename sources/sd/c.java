package sd;

import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.j0;
import kotlin.jvm.internal.t;
import od.h;
import od.k;
import rd.c0;
import rd.f0;
import rd.h0;

/* JADX INFO: compiled from: Duration.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class c {
    /* JADX INFO: Access modifiers changed from: private */
    public static final long i(long j10, int i10) {
        return a.i((j10 << 1) + ((long) i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long j(long j10) {
        return a.i((j10 << 1) + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long k(long j10) {
        boolean z10 = false;
        if (-4611686018426L <= j10 && j10 < 4611686018427L) {
            z10 = true;
        }
        return z10 ? l(n(j10)) : j(k.k(j10, -4611686018427387903L, 4611686018427387903L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long l(long j10) {
        return a.i(j10 << 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long m(long j10) {
        boolean z10 = false;
        if (-4611686018426999999L <= j10 && j10 < 4611686018427000000L) {
            z10 = true;
        }
        return z10 ? l(j10) : j(o(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long n(long j10) {
        return j10 * ((long) 1000000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long o(long j10) {
        return j10 / ((long) 1000000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long p(String str, boolean z10) {
        int length = str.length();
        if (length == 0) {
            throw new IllegalArgumentException("The string is empty");
        }
        a.C0418a c0418a = a.f25407b;
        long jB = c0418a.b();
        char cCharAt = str.charAt(0);
        boolean z11 = true;
        int length2 = (cCharAt == '+' || cCharAt == '-') ? 1 : 0;
        boolean z12 = length2 > 0;
        boolean z13 = z12 && f0.N0(str, '-', false, 2, null);
        if (length <= length2) {
            throw new IllegalArgumentException("No components");
        }
        char c10 = ':';
        char c11 = '0';
        if (str.charAt(length2) == 'P') {
            int i10 = length2 + 1;
            if (i10 == length) {
                throw new IllegalArgumentException();
            }
            boolean z14 = false;
            d dVar = null;
            while (i10 < length) {
                if (str.charAt(i10) != 'T') {
                    int i11 = i10;
                    while (i11 < str.length()) {
                        char cCharAt2 = str.charAt(i11);
                        if (!(((c11 > cCharAt2 || cCharAt2 >= c10) ? false : z11) || f0.T("+-.", cCharAt2, false, 2, null))) {
                            break;
                        }
                        i11++;
                        c11 = '0';
                        c10 = ':';
                        z11 = true;
                    }
                    t.d(str, "null cannot be cast to non-null type java.lang.String");
                    String strSubstring = str.substring(i10, i11);
                    t.e(strSubstring, "substring(...)");
                    if (strSubstring.length() == 0) {
                        throw new IllegalArgumentException();
                    }
                    int length3 = i10 + strSubstring.length();
                    if (!(length3 >= 0 && length3 < str.length())) {
                        throw new IllegalArgumentException("Missing unit for value " + strSubstring);
                    }
                    char cCharAt3 = str.charAt(length3);
                    i10 = length3 + 1;
                    d dVarD = f.d(cCharAt3, z14);
                    if (dVar != null && dVar.compareTo(dVarD) <= 0) {
                        throw new IllegalArgumentException("Unexpected order of duration components");
                    }
                    int iH0 = f0.h0(strSubstring, '.', 0, false, 6, null);
                    if (dVarD != d.SECONDS || iH0 <= 0) {
                        jB = a.E(jB, t(q(strSubstring), dVarD));
                    } else {
                        t.d(strSubstring, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring2 = strSubstring.substring(0, iH0);
                        t.e(strSubstring2, "substring(...)");
                        long jE = a.E(jB, t(q(strSubstring2), dVarD));
                        t.d(strSubstring, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring3 = strSubstring.substring(iH0);
                        t.e(strSubstring3, "substring(...)");
                        jB = a.E(jE, r(Double.parseDouble(strSubstring3), dVarD));
                    }
                    z14 = z14;
                    dVar = dVarD;
                    c11 = '0';
                    c10 = ':';
                    z11 = true;
                } else {
                    if (z14 || (i10 = i10 + 1) == length) {
                        throw new IllegalArgumentException();
                    }
                    z14 = z11;
                }
            }
        } else {
            if (z10) {
                throw new IllegalArgumentException();
            }
            String str2 = "Unexpected order of duration components";
            if (c0.E(str, length2, "Infinity", 0, Math.max(length - length2, 8), true)) {
                jB = c0418a.a();
            } else {
                boolean z15 = !z12;
                if (z12 && str.charAt(length2) == '(' && h0.g1(str) == ')') {
                    length2++;
                    length--;
                    if (length2 == length) {
                        throw new IllegalArgumentException("No components");
                    }
                    z15 = true;
                }
                d dVar2 = null;
                boolean z16 = false;
                while (length2 < length) {
                    if (z16 && z15) {
                        while (length2 < str.length()) {
                            if (!(str.charAt(length2) == ' ')) {
                                break;
                            }
                            length2++;
                        }
                    }
                    int i12 = length2;
                    while (i12 < str.length()) {
                        char cCharAt4 = str.charAt(i12);
                        if (!(('0' <= cCharAt4 && cCharAt4 < ':') || cCharAt4 == '.')) {
                            break;
                        }
                        i12++;
                    }
                    t.d(str, "null cannot be cast to non-null type java.lang.String");
                    String strSubstring4 = str.substring(length2, i12);
                    t.e(strSubstring4, "substring(...)");
                    if (strSubstring4.length() == 0) {
                        throw new IllegalArgumentException();
                    }
                    int length4 = length2 + strSubstring4.length();
                    int i13 = length4;
                    while (i13 < str.length()) {
                        char cCharAt5 = str.charAt(i13);
                        if (!('a' <= cCharAt5 && cCharAt5 < '{')) {
                            break;
                        }
                        i13++;
                    }
                    t.d(str, "null cannot be cast to non-null type java.lang.String");
                    String strSubstring5 = str.substring(length4, i13);
                    t.e(strSubstring5, "substring(...)");
                    length2 = length4 + strSubstring5.length();
                    d dVarE = f.e(strSubstring5);
                    if (dVar2 != null && dVar2.compareTo(dVarE) <= 0) {
                        throw new IllegalArgumentException(str2);
                    }
                    String str3 = str2;
                    int iH1 = f0.h0(strSubstring4, '.', 0, false, 6, null);
                    if (iH1 > 0) {
                        t.d(strSubstring4, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring6 = strSubstring4.substring(0, iH1);
                        t.e(strSubstring6, "substring(...)");
                        long jE2 = a.E(jB, t(Long.parseLong(strSubstring6), dVarE));
                        t.d(strSubstring4, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring7 = strSubstring4.substring(iH1);
                        t.e(strSubstring7, "substring(...)");
                        jB = a.E(jE2, r(Double.parseDouble(strSubstring7), dVarE));
                        if (length2 < length) {
                            throw new IllegalArgumentException("Fractional component must be last");
                        }
                    } else {
                        jB = a.E(jB, t(Long.parseLong(strSubstring4), dVarE));
                    }
                    str2 = str3;
                    dVar2 = dVarE;
                    z16 = true;
                }
            }
        }
        return z13 ? a.I(jB) : jB;
    }

    private static final long q(String str) {
        boolean z10;
        int length = str.length();
        int i10 = (length <= 0 || !f0.T("+-", str.charAt(0), false, 2, null)) ? 0 : 1;
        if (length - i10 > 16) {
            Iterable hVar = new h(i10, f0.c0(str));
            if (!(hVar instanceof Collection) || !((Collection) hVar).isEmpty()) {
                Iterator it = hVar.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z10 = true;
                        break;
                    }
                    char cCharAt = str.charAt(((j0) it).nextInt());
                    if (!('0' <= cCharAt && cCharAt < ':')) {
                        z10 = false;
                        break;
                    }
                }
            } else {
                z10 = true;
                break;
            }
            if (z10) {
                return str.charAt(0) == '-' ? Long.MIN_VALUE : Long.MAX_VALUE;
            }
        }
        if (c0.O(str, "+", false, 2, null)) {
            str = h0.f1(str, 1);
        }
        return Long.parseLong(str);
    }

    public static final long r(double d10, d unit) {
        t.f(unit, "unit");
        double dA = e.a(d10, unit, d.NANOSECONDS);
        if (!(!Double.isNaN(dA))) {
            throw new IllegalArgumentException("Duration value cannot be NaN.".toString());
        }
        long jB = kd.c.b(dA);
        return -4611686018426999999L <= jB && jB < 4611686018427000000L ? l(jB) : k(kd.c.b(e.a(d10, unit, d.MILLISECONDS)));
    }

    public static final long s(int i10, d unit) {
        t.f(unit, "unit");
        return unit.compareTo(d.SECONDS) <= 0 ? l(e.c(i10, unit, d.NANOSECONDS)) : t(i10, unit);
    }

    public static final long t(long j10, d unit) {
        t.f(unit, "unit");
        d dVar = d.NANOSECONDS;
        long jC = e.c(4611686018426999999L, dVar, unit);
        boolean z10 = false;
        if ((-jC) <= j10 && j10 <= jC) {
            z10 = true;
        }
        return z10 ? l(e.c(j10, unit, dVar)) : j(k.k(e.b(j10, unit, d.MILLISECONDS), -4611686018427387903L, 4611686018427387903L));
    }
}
