package rd;

import java.util.Comparator;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: StringsJVM.kt */
/* JADX INFO: loaded from: classes5.dex */
public class c0 extends b0 {
    public static /* synthetic */ boolean A(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return z(str, str2, z10);
    }

    public static boolean B(String str, String str2, boolean z10) {
        if (str == null) {
            return str2 == null;
        }
        return !z10 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static /* synthetic */ boolean C(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return B(str, str2, z10);
    }

    public static Comparator<String> D(kotlin.jvm.internal.l0 l0Var) {
        kotlin.jvm.internal.t.f(l0Var, "<this>");
        Comparator<String> CASE_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
        kotlin.jvm.internal.t.e(CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
        return CASE_INSENSITIVE_ORDER;
    }

    public static boolean E(String str, int i10, String other, int i11, int i12, boolean z10) {
        kotlin.jvm.internal.t.f(str, "<this>");
        kotlin.jvm.internal.t.f(other, "other");
        return !z10 ? str.regionMatches(i10, other, i11, i12) : str.regionMatches(z10, i10, other, i11, i12);
    }

    public static /* synthetic */ boolean F(String str, int i10, String str2, int i11, int i12, boolean z10, int i13, Object obj) {
        if ((i13 & 16) != 0) {
            z10 = false;
        }
        return E(str, i10, str2, i11, i12, z10);
    }

    public static String G(CharSequence charSequence, int i10) {
        kotlin.jvm.internal.t.f(charSequence, "<this>");
        int i11 = 1;
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i10 + '.').toString());
        }
        if (i10 == 0) {
            return "";
        }
        if (i10 == 1) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char cCharAt = charSequence.charAt(0);
            char[] cArr = new char[i10];
            for (int i12 = 0; i12 < i10; i12++) {
                cArr[i12] = cCharAt;
            }
            return new String(cArr);
        }
        StringBuilder sb2 = new StringBuilder(charSequence.length() * i10);
        if (1 <= i10) {
            while (true) {
                sb2.append(charSequence);
                if (i11 == i10) {
                    break;
                }
                i11++;
            }
        }
        String string = sb2.toString();
        kotlin.jvm.internal.t.c(string);
        return string;
    }

    public static final String H(String str, char c10, char c11, boolean z10) {
        kotlin.jvm.internal.t.f(str, "<this>");
        if (!z10) {
            String strReplace = str.replace(c10, c11);
            kotlin.jvm.internal.t.e(strReplace, "replace(...)");
            return strReplace;
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (c.e(cCharAt, c10, z10)) {
                cCharAt = c11;
            }
            sb2.append(cCharAt);
        }
        return sb2.toString();
    }

    public static final String I(String str, String oldValue, String newValue, boolean z10) {
        kotlin.jvm.internal.t.f(str, "<this>");
        kotlin.jvm.internal.t.f(oldValue, "oldValue");
        kotlin.jvm.internal.t.f(newValue, "newValue");
        int i10 = 0;
        int iE0 = f0.e0(str, oldValue, 0, z10);
        if (iE0 < 0) {
            return str;
        }
        int length = oldValue.length();
        int iD = od.k.d(length, 1);
        int length2 = (str.length() - length) + newValue.length();
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb2 = new StringBuilder(length2);
        do {
            sb2.append((CharSequence) str, i10, iE0);
            sb2.append(newValue);
            i10 = iE0 + length;
            if (iE0 >= str.length()) {
                break;
            }
            iE0 = f0.e0(str, oldValue, iE0 + iD, z10);
        } while (iE0 > 0);
        sb2.append((CharSequence) str, i10, str.length());
        String string = sb2.toString();
        kotlin.jvm.internal.t.e(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String J(String str, char c10, char c11, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return H(str, c10, c11, z10);
    }

    public static /* synthetic */ String K(String str, String str2, String str3, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return I(str, str2, str3, z10);
    }

    public static boolean L(String str, String prefix, int i10, boolean z10) {
        kotlin.jvm.internal.t.f(str, "<this>");
        kotlin.jvm.internal.t.f(prefix, "prefix");
        return !z10 ? str.startsWith(prefix, i10) : E(str, i10, prefix, 0, prefix.length(), z10);
    }

    public static boolean M(String str, String prefix, boolean z10) {
        kotlin.jvm.internal.t.f(str, "<this>");
        kotlin.jvm.internal.t.f(prefix, "prefix");
        return !z10 ? str.startsWith(prefix) : E(str, 0, prefix, 0, prefix.length(), z10);
    }

    public static /* synthetic */ boolean N(String str, String str2, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return L(str, str2, i10, z10);
    }

    public static /* synthetic */ boolean O(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return M(str, str2, z10);
    }

    public static String t(char[] cArr) {
        kotlin.jvm.internal.t.f(cArr, "<this>");
        return new String(cArr);
    }

    public static String u(char[] cArr, int i10, int i11) {
        kotlin.jvm.internal.t.f(cArr, "<this>");
        kotlin.collections.d.Companion.a(i10, i11, cArr.length);
        return new String(cArr, i10, i11 - i10);
    }

    public static final boolean v(CharSequence charSequence, CharSequence charSequence2) {
        return (!(charSequence instanceof String) || charSequence2 == null) ? f0.W(charSequence, charSequence2) : ((String) charSequence).contentEquals(charSequence2);
    }

    public static boolean w(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        return z10 ? f0.V(charSequence, charSequence2) : v(charSequence, charSequence2);
    }

    public static String x(byte[] bArr) {
        kotlin.jvm.internal.t.f(bArr, "<this>");
        return new String(bArr, d.f24999b);
    }

    public static byte[] y(String str) {
        kotlin.jvm.internal.t.f(str, "<this>");
        byte[] bytes = str.getBytes(d.f24999b);
        kotlin.jvm.internal.t.e(bytes, "getBytes(...)");
        return bytes;
    }

    public static boolean z(String str, String suffix, boolean z10) {
        kotlin.jvm.internal.t.f(str, "<this>");
        kotlin.jvm.internal.t.f(suffix, "suffix");
        return !z10 ? str.endsWith(suffix) : E(str, str.length() - suffix.length(), suffix, 0, suffix.length(), true);
    }
}
