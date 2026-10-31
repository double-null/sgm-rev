package rd;

import com.applovin.impl.communicator.ZREl.sRGQSqxgxlS;
import com.facebook.internal.ServerProtocol;
import com.google.ads.mediation.ZRT.wHzciBnJlYkdX;
import io.bidmachine.iab.vast.activity.IIj.KBBdKxoAiHo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: Strings.kt */
/* JADX INFO: loaded from: classes5.dex */
public class f0 extends c0 {

    /* JADX INFO: compiled from: Sequences.kt */
    public static final class a implements qd.g<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CharSequence f25025a;

        public a(CharSequence charSequence) {
            this.f25025a = charSequence;
        }

        @Override // qd.g
        public Iterator<String> iterator() {
            return new i(this.f25025a);
        }
    }

    public static final boolean A0(CharSequence charSequence, int i10, CharSequence other, int i11, int i12, boolean z10) {
        kotlin.jvm.internal.t.f(charSequence, "<this>");
        kotlin.jvm.internal.t.f(other, "other");
        if (i11 < 0 || i10 < 0 || i10 > charSequence.length() - i12 || i11 > other.length() - i12) {
            return false;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            if (!c.e(charSequence.charAt(i10 + i13), other.charAt(i11 + i13), z10)) {
                return false;
            }
        }
        return true;
    }

    public static String B0(String str, CharSequence prefix) {
        kotlin.jvm.internal.t.f(str, "<this>");
        kotlin.jvm.internal.t.f(prefix, "prefix");
        if (!O0(str, prefix, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(prefix.length());
        kotlin.jvm.internal.t.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String C0(String str, CharSequence suffix) {
        kotlin.jvm.internal.t.f(str, "<this>");
        kotlin.jvm.internal.t.f(suffix, "suffix");
        if (!a0(str, suffix, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(0, str.length() - suffix.length());
        kotlin.jvm.internal.t.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String D0(String str, CharSequence delimiter) {
        kotlin.jvm.internal.t.f(str, "<this>");
        kotlin.jvm.internal.t.f(delimiter, "delimiter");
        return E0(str, delimiter, delimiter);
    }

    public static final String E0(String str, CharSequence prefix, CharSequence suffix) {
        kotlin.jvm.internal.t.f(str, "<this>");
        kotlin.jvm.internal.t.f(prefix, "prefix");
        kotlin.jvm.internal.t.f(suffix, "suffix");
        if (str.length() < prefix.length() + suffix.length() || !O0(str, prefix, false, 2, null) || !a0(str, suffix, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(prefix.length(), str.length() - suffix.length());
        kotlin.jvm.internal.t.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final void F0(int i10) {
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i10).toString());
    }

    public static final List<String> G0(CharSequence charSequence, char[] delimiters, boolean z10, int i10) {
        kotlin.jvm.internal.t.f(charSequence, "<this>");
        kotlin.jvm.internal.t.f(delimiters, "delimiters");
        if (delimiters.length == 1) {
            return I0(charSequence, String.valueOf(delimiters[0]), z10, i10);
        }
        Iterable iterableL = qd.r.l(w0(charSequence, delimiters, 0, z10, i10, 2, null));
        ArrayList arrayList = new ArrayList(kotlin.collections.u.u(iterableL, 10));
        Iterator it = iterableL.iterator();
        while (it.hasNext()) {
            arrayList.add(P0(charSequence, (od.h) it.next()));
        }
        return arrayList;
    }

    public static final List<String> H0(CharSequence charSequence, String[] delimiters, boolean z10, int i10) {
        kotlin.jvm.internal.t.f(charSequence, "<this>");
        kotlin.jvm.internal.t.f(delimiters, "delimiters");
        if (delimiters.length == 1) {
            String str = delimiters[0];
            if (!(str.length() == 0)) {
                return I0(charSequence, str, z10, i10);
            }
        }
        Iterable iterableL = qd.r.l(x0(charSequence, delimiters, 0, z10, i10, 2, null));
        ArrayList arrayList = new ArrayList(kotlin.collections.u.u(iterableL, 10));
        Iterator it = iterableL.iterator();
        while (it.hasNext()) {
            arrayList.add(P0(charSequence, (od.h) it.next()));
        }
        return arrayList;
    }

    private static final List<String> I0(CharSequence charSequence, String str, boolean z10, int i10) {
        F0(i10);
        int length = 0;
        int iE0 = e0(charSequence, str, 0, z10);
        if (iE0 == -1 || i10 == 1) {
            return kotlin.collections.s.e(charSequence.toString());
        }
        boolean z11 = i10 > 0;
        ArrayList arrayList = new ArrayList(z11 ? od.k.f(i10, 10) : 10);
        do {
            arrayList.add(charSequence.subSequence(length, iE0).toString());
            length = str.length() + iE0;
            if (z11 && arrayList.size() == i10 - 1) {
                break;
            }
            iE0 = e0(charSequence, str, length, z10);
        } while (iE0 != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static /* synthetic */ List J0(CharSequence charSequence, char[] cArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return G0(charSequence, cArr, z10, i10);
    }

    public static /* synthetic */ List K0(CharSequence charSequence, String[] strArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return H0(charSequence, strArr, z10, i10);
    }

    public static final boolean L0(CharSequence charSequence, char c10, boolean z10) {
        kotlin.jvm.internal.t.f(charSequence, "<this>");
        return charSequence.length() > 0 && c.e(charSequence.charAt(0), c10, z10);
    }

    public static final boolean M0(CharSequence charSequence, CharSequence prefix, boolean z10) {
        kotlin.jvm.internal.t.f(charSequence, "<this>");
        kotlin.jvm.internal.t.f(prefix, "prefix");
        return (!z10 && (charSequence instanceof String) && (prefix instanceof String)) ? c0.O((String) charSequence, (String) prefix, false, 2, null) : A0(charSequence, 0, prefix, 0, prefix.length(), z10);
    }

    public static /* synthetic */ boolean N0(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return L0(charSequence, c10, z10);
    }

    public static /* synthetic */ boolean O0(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return M0(charSequence, charSequence2, z10);
    }

    public static final String P0(CharSequence charSequence, od.h range) {
        kotlin.jvm.internal.t.f(charSequence, "<this>");
        kotlin.jvm.internal.t.f(range, "range");
        return charSequence.subSequence(range.j().intValue(), range.i().intValue() + 1).toString();
    }

    public static String Q0(String str, char c10, String missingDelimiterValue) {
        kotlin.jvm.internal.t.f(str, "<this>");
        kotlin.jvm.internal.t.f(missingDelimiterValue, "missingDelimiterValue");
        int iH0 = h0(str, c10, 0, false, 6, null);
        if (iH0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iH0 + 1, str.length());
        kotlin.jvm.internal.t.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final boolean R(CharSequence charSequence, char c10, boolean z10) {
        kotlin.jvm.internal.t.f(charSequence, "<this>");
        return h0(charSequence, c10, 0, z10, 2, null) >= 0;
    }

    public static final String R0(String str, String delimiter, String missingDelimiterValue) {
        kotlin.jvm.internal.t.f(str, "<this>");
        kotlin.jvm.internal.t.f(delimiter, "delimiter");
        kotlin.jvm.internal.t.f(missingDelimiterValue, "missingDelimiterValue");
        int iI0 = i0(str, delimiter, 0, false, 6, null);
        if (iI0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iI0 + delimiter.length(), str.length());
        kotlin.jvm.internal.t.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static boolean S(CharSequence charSequence, CharSequence other, boolean z10) {
        kotlin.jvm.internal.t.f(charSequence, "<this>");
        kotlin.jvm.internal.t.f(other, "other");
        if (other instanceof String) {
            if (i0(charSequence, (String) other, 0, z10, 2, null) >= 0) {
                return true;
            }
        } else if (g0(charSequence, other, 0, charSequence.length(), z10, false, 16, null) >= 0) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ String S0(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return Q0(str, c10, str2);
    }

    public static /* synthetic */ boolean T(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return R(charSequence, c10, z10);
    }

    public static /* synthetic */ String T0(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return R0(str, str2, str3);
    }

    public static /* synthetic */ boolean U(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return S(charSequence, charSequence2, z10);
    }

    public static String U0(String str, char c10, String missingDelimiterValue) {
        kotlin.jvm.internal.t.f(str, "<this>");
        kotlin.jvm.internal.t.f(missingDelimiterValue, "missingDelimiterValue");
        int iN0 = n0(str, c10, 0, false, 6, null);
        if (iN0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iN0 + 1, str.length());
        kotlin.jvm.internal.t.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final boolean V(CharSequence charSequence, CharSequence charSequence2) {
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return c0.B((String) charSequence, (String) charSequence2, true);
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!c.e(charSequence.charAt(i10), charSequence2.charAt(i10), true)) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ String V0(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return U0(str, c10, str2);
    }

    public static final boolean W(CharSequence charSequence, CharSequence charSequence2) {
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return kotlin.jvm.internal.t.a(charSequence, charSequence2);
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (charSequence.charAt(i10) != charSequence2.charAt(i10)) {
                return false;
            }
        }
        return true;
    }

    public static final String W0(String str, char c10, String missingDelimiterValue) {
        kotlin.jvm.internal.t.f(str, "<this>");
        kotlin.jvm.internal.t.f(missingDelimiterValue, "missingDelimiterValue");
        int iH0 = h0(str, c10, 0, false, 6, null);
        if (iH0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iH0);
        kotlin.jvm.internal.t.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final boolean X(CharSequence charSequence, char c10, boolean z10) {
        kotlin.jvm.internal.t.f(charSequence, "<this>");
        return charSequence.length() > 0 && c.e(charSequence.charAt(c0(charSequence)), c10, z10);
    }

    public static final String X0(String str, String delimiter, String missingDelimiterValue) {
        kotlin.jvm.internal.t.f(str, "<this>");
        kotlin.jvm.internal.t.f(delimiter, "delimiter");
        kotlin.jvm.internal.t.f(missingDelimiterValue, "missingDelimiterValue");
        int iI0 = i0(str, delimiter, 0, false, 6, null);
        if (iI0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iI0);
        kotlin.jvm.internal.t.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ String Y0(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return W0(str, c10, str2);
    }

    public static /* synthetic */ boolean Z(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return X(charSequence, c10, z10);
    }

    public static /* synthetic */ String Z0(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return X0(str, str2, str3);
    }

    public static /* synthetic */ boolean a0(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return Y(charSequence, charSequence2, z10);
    }

    public static final String a1(String str, String delimiter, String missingDelimiterValue) {
        kotlin.jvm.internal.t.f(str, "<this>");
        kotlin.jvm.internal.t.f(delimiter, "delimiter");
        kotlin.jvm.internal.t.f(missingDelimiterValue, "missingDelimiterValue");
        int iO0 = o0(str, delimiter, 0, false, 6, null);
        if (iO0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iO0);
        kotlin.jvm.internal.t.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    private static final wc.q<Integer, String> b0(CharSequence charSequence, Collection<String> collection, int i10, boolean z10, boolean z11) {
        Object next;
        String str;
        Object next2;
        String str2;
        if (!z10 && collection.size() == 1) {
            String str3 = (String) kotlin.collections.b0.e0(collection);
            int iI0 = !z11 ? i0(charSequence, str3, i10, false, 4, null) : o0(charSequence, str3, i10, false, 4, null);
            if (iI0 < 0) {
                return null;
            }
            return wc.w.a(Integer.valueOf(iI0), str3);
        }
        od.f hVar = !z11 ? new od.h(od.k.d(i10, 0), charSequence.length()) : od.k.l(od.k.f(i10, c0(charSequence)), 0);
        if (charSequence instanceof String) {
            int iA = hVar.a();
            int iC = hVar.c();
            int iD = hVar.d();
            if ((iD > 0 && iA <= iC) || (iD < 0 && iC <= iA)) {
                while (true) {
                    Iterator<T> it = collection.iterator();
                    do {
                        if (!it.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it.next();
                        str2 = (String) next2;
                    } while (!c0.E(str2, 0, (String) charSequence, iA, str2.length(), z10));
                    String str4 = (String) next2;
                    if (str4 != null) {
                        return wc.w.a(Integer.valueOf(iA), str4);
                    }
                    if (iA != iC) {
                        iA += iD;
                    }
                }
            }
        } else {
            int iA2 = hVar.a();
            int iC2 = hVar.c();
            int iD2 = hVar.d();
            if ((iD2 > 0 && iA2 <= iC2) || (iD2 < 0 && iC2 <= iA2)) {
                while (true) {
                    Iterator<T> it2 = collection.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        str = (String) next;
                    } while (!A0(str, 0, charSequence, iA2, str.length(), z10));
                    String str5 = (String) next;
                    if (str5 != null) {
                        return wc.w.a(Integer.valueOf(iA2), str5);
                    }
                    if (iA2 != iC2) {
                        iA2 += iD2;
                    }
                }
            }
        }
        return null;
    }

    public static /* synthetic */ String b1(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return a1(str, str2, str3);
    }

    public static Boolean c1(String str) {
        kotlin.jvm.internal.t.f(str, "<this>");
        if (kotlin.jvm.internal.t.a(str, ServerProtocol.DIALOG_RETURN_SCOPES_TRUE)) {
            return Boolean.TRUE;
        }
        if (kotlin.jvm.internal.t.a(str, "false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static final int d0(CharSequence charSequence, char c10, int i10, boolean z10) {
        kotlin.jvm.internal.t.f(charSequence, "<this>");
        return (z10 || !(charSequence instanceof String)) ? j0(charSequence, new char[]{c10}, i10, z10) : ((String) charSequence).indexOf(c10, i10);
    }

    public static CharSequence d1(CharSequence charSequence) {
        kotlin.jvm.internal.t.f(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean zC = b.c(charSequence.charAt(!z10 ? i10 : length));
            if (z10) {
                if (!zC) {
                    break;
                }
                length--;
            } else if (zC) {
                i10++;
            } else {
                z10 = true;
            }
        }
        return charSequence.subSequence(i10, length + 1);
    }

    public static final int e0(CharSequence charSequence, String string, int i10, boolean z10) {
        kotlin.jvm.internal.t.f(charSequence, "<this>");
        kotlin.jvm.internal.t.f(string, "string");
        return (z10 || !(charSequence instanceof String)) ? g0(charSequence, string, i10, charSequence.length(), z10, false, 16, null) : ((String) charSequence).indexOf(string, i10);
    }

    public static String e1(String str, char... chars) {
        kotlin.jvm.internal.t.f(str, "<this>");
        kotlin.jvm.internal.t.f(chars, "chars");
        int length = str.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean zS = kotlin.collections.o.s(chars, str.charAt(!z10 ? i10 : length));
            if (z10) {
                if (!zS) {
                    break;
                }
                length--;
            } else if (zS) {
                i10++;
            } else {
                z10 = true;
            }
        }
        return str.subSequence(i10, length + 1).toString();
    }

    private static final int f0(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11) {
        od.f hVar = !z11 ? new od.h(od.k.d(i10, 0), od.k.f(i11, charSequence.length())) : od.k.l(od.k.f(i10, c0(charSequence)), od.k.d(i11, 0));
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            int iA = hVar.a();
            int iC = hVar.c();
            int iD = hVar.d();
            if ((iD <= 0 || iA > iC) && (iD >= 0 || iC > iA)) {
                return -1;
            }
            while (!A0(charSequence2, 0, charSequence, iA, charSequence2.length(), z10)) {
                if (iA == iC) {
                    return -1;
                }
                iA += iD;
            }
            return iA;
        }
        int iA2 = hVar.a();
        int iC2 = hVar.c();
        int iD2 = hVar.d();
        if ((iD2 <= 0 || iA2 > iC2) && (iD2 >= 0 || iC2 > iA2)) {
            return -1;
        }
        while (true) {
            String str = (String) charSequence2;
            if (c0.E(str, 0, (String) charSequence, iA2, str.length(), z10)) {
                return iA2;
            }
            if (iA2 == iC2) {
                return -1;
            }
            iA2 += iD2;
        }
    }

    static /* synthetic */ int g0(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11, int i12, Object obj) {
        if ((i12 & 16) != 0) {
            z11 = false;
        }
        return f0(charSequence, charSequence2, i10, i11, z10, z11);
    }

    public static /* synthetic */ int h0(CharSequence charSequence, char c10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return d0(charSequence, c10, i10, z10);
    }

    public static /* synthetic */ int i0(CharSequence charSequence, String str, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return e0(charSequence, str, i10, z10);
    }

    public static final int j0(CharSequence charSequence, char[] chars, int i10, boolean z10) {
        boolean z11;
        kotlin.jvm.internal.t.f(charSequence, "<this>");
        kotlin.jvm.internal.t.f(chars, "chars");
        if (!z10 && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(kotlin.collections.o.R(chars), i10);
        }
        int iD = od.k.d(i10, 0);
        int iC0 = c0(charSequence);
        if (iD > iC0) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(iD);
            int length = chars.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    z11 = false;
                    break;
                }
                if (c.e(chars[i11], cCharAt, z10)) {
                    z11 = true;
                    break;
                }
                i11++;
            }
            if (z11) {
                return iD;
            }
            if (iD == iC0) {
                return -1;
            }
            iD++;
        }
    }

    public static final int l0(CharSequence charSequence, char c10, int i10, boolean z10) {
        kotlin.jvm.internal.t.f(charSequence, "<this>");
        return (z10 || !(charSequence instanceof String)) ? p0(charSequence, new char[]{c10}, i10, z10) : ((String) charSequence).lastIndexOf(c10, i10);
    }

    public static final int m0(CharSequence charSequence, String string, int i10, boolean z10) {
        kotlin.jvm.internal.t.f(charSequence, "<this>");
        kotlin.jvm.internal.t.f(string, "string");
        return (z10 || !(charSequence instanceof String)) ? f0(charSequence, string, i10, 0, z10, true) : ((String) charSequence).lastIndexOf(string, i10);
    }

    public static /* synthetic */ int n0(CharSequence charSequence, char c10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = c0(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return l0(charSequence, c10, i10, z10);
    }

    public static /* synthetic */ int o0(CharSequence charSequence, String str, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = c0(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return m0(charSequence, str, i10, z10);
    }

    public static final int p0(CharSequence charSequence, char[] chars, int i10, boolean z10) {
        kotlin.jvm.internal.t.f(charSequence, "<this>");
        kotlin.jvm.internal.t.f(chars, "chars");
        if (!z10 && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(kotlin.collections.o.R(chars), i10);
        }
        for (int iF = od.k.f(i10, c0(charSequence)); -1 < iF; iF--) {
            char cCharAt = charSequence.charAt(iF);
            boolean z11 = false;
            for (char c10 : chars) {
                if (c.e(c10, cCharAt, z10)) {
                    z11 = true;
                    break;
                }
            }
            if (z11) {
                return iF;
            }
        }
        return -1;
    }

    public static final qd.g<String> q0(CharSequence charSequence) {
        kotlin.jvm.internal.t.f(charSequence, "<this>");
        return new a(charSequence);
    }

    public static final List<String> r0(CharSequence charSequence) {
        kotlin.jvm.internal.t.f(charSequence, "<this>");
        return qd.r.x(q0(charSequence));
    }

    public static final CharSequence s0(CharSequence charSequence, int i10, char c10) {
        kotlin.jvm.internal.t.f(charSequence, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException("Desired length " + i10 + " is less than zero.");
        }
        if (i10 <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb2 = new StringBuilder(i10);
        int length = i10 - charSequence.length();
        int i11 = 1;
        if (1 <= length) {
            while (true) {
                sb2.append(c10);
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        sb2.append(charSequence);
        return sb2;
    }

    public static String t0(String str, int i10, char c10) {
        kotlin.jvm.internal.t.f(str, "<this>");
        return s0(str, i10, c10).toString();
    }

    private static final qd.g<od.h> u0(CharSequence charSequence, final char[] cArr, int i10, final boolean z10, int i11) {
        F0(i11);
        return new e(charSequence, i10, i11, new id.p() { // from class: rd.d0
            @Override // id.p
            public final Object invoke(Object obj, Object obj2) {
                return f0.y0(cArr, z10, (CharSequence) obj, ((Integer) obj2).intValue());
            }
        });
    }

    private static final qd.g<od.h> v0(CharSequence charSequence, String[] strArr, int i10, final boolean z10, int i11) {
        F0(i11);
        final List listC = kotlin.collections.m.c(strArr);
        return new e(charSequence, i10, i11, new id.p() { // from class: rd.e0
            @Override // id.p
            public final Object invoke(Object obj, Object obj2) {
                return f0.z0(listC, z10, (CharSequence) obj, ((Integer) obj2).intValue());
            }
        });
    }

    static /* synthetic */ qd.g w0(CharSequence charSequence, char[] cArr, int i10, boolean z10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return u0(charSequence, cArr, i10, z10, i11);
    }

    static /* synthetic */ qd.g x0(CharSequence charSequence, String[] strArr, int i10, boolean z10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return v0(charSequence, strArr, i10, z10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wc.q y0(char[] cArr, boolean z10, CharSequence DelimitedRangesSequence, int i10) {
        kotlin.jvm.internal.t.f(DelimitedRangesSequence, "$this$DelimitedRangesSequence");
        int iJ0 = j0(DelimitedRangesSequence, cArr, i10, z10);
        if (iJ0 < 0) {
            return null;
        }
        return wc.w.a(Integer.valueOf(iJ0), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wc.q z0(List list, boolean z10, CharSequence DelimitedRangesSequence, int i10) {
        kotlin.jvm.internal.t.f(DelimitedRangesSequence, "$this$DelimitedRangesSequence");
        wc.q<Integer, String> qVarB0 = b0(DelimitedRangesSequence, list, i10, z10, false);
        if (qVarB0 != null) {
            return wc.w.a(qVarB0.e(), Integer.valueOf(qVarB0.f().length()));
        }
        return null;
    }

    public static final boolean Y(CharSequence charSequence, CharSequence suffix, boolean z10) {
        kotlin.jvm.internal.t.f(charSequence, sRGQSqxgxlS.AgpQwQMasHJxYgx);
        kotlin.jvm.internal.t.f(suffix, "suffix");
        return (!z10 && (charSequence instanceof String) && (suffix instanceof String)) ? c0.A((String) charSequence, (String) suffix, false, 2, null) : A0(charSequence, charSequence.length() - suffix.length(), suffix, 0, suffix.length(), z10);
    }

    public static int c0(CharSequence charSequence) {
        kotlin.jvm.internal.t.f(charSequence, wHzciBnJlYkdX.XcFDKehAWw);
        return charSequence.length() - 1;
    }

    public static boolean k0(CharSequence charSequence) {
        kotlin.jvm.internal.t.f(charSequence, KBBdKxoAiHo.vNsMtEaueDDrzeE);
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            if (!b.c(charSequence.charAt(i10))) {
                return false;
            }
        }
        return true;
    }
}
