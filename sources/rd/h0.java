package rd;

import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: _Strings.kt */
/* JADX INFO: loaded from: classes5.dex */
public class h0 extends g0 {
    public static String f1(String str, int i10) {
        kotlin.jvm.internal.t.f(str, "<this>");
        if (i10 >= 0) {
            String strSubstring = str.substring(od.k.f(i10, str.length()));
            kotlin.jvm.internal.t.e(strSubstring, "substring(...)");
            return strSubstring;
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }

    public static char g1(CharSequence charSequence) {
        kotlin.jvm.internal.t.f(charSequence, "<this>");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        return charSequence.charAt(f0.c0(charSequence));
    }

    public static CharSequence h1(CharSequence charSequence) {
        kotlin.jvm.internal.t.f(charSequence, "<this>");
        return new StringBuilder(charSequence).reverse();
    }

    public static char i1(CharSequence charSequence) {
        kotlin.jvm.internal.t.f(charSequence, "<this>");
        int length = charSequence.length();
        if (length == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (length == 1) {
            return charSequence.charAt(0);
        }
        throw new IllegalArgumentException("Char sequence has more than one element.");
    }

    public static String j1(String str, int i10) {
        kotlin.jvm.internal.t.f(str, "<this>");
        if (i10 >= 0) {
            String strSubstring = str.substring(0, od.k.f(i10, str.length()));
            kotlin.jvm.internal.t.e(strSubstring, "substring(...)");
            return strSubstring;
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }
}
