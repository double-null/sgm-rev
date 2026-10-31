package rd;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: Indent.kt */
/* JADX INFO: loaded from: classes5.dex */
public class v extends s {
    private static final id.l<String, String> d(final String str) {
        return str.length() == 0 ? new id.l() { // from class: rd.t
            @Override // id.l
            public final Object invoke(Object obj) {
                return v.e((String) obj);
            }
        } : new id.l() { // from class: rd.u
            @Override // id.l
            public final Object invoke(Object obj) {
                return v.f(str, (String) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String e(String line) {
        kotlin.jvm.internal.t.f(line, "line");
        return line;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String f(String str, String line) {
        kotlin.jvm.internal.t.f(line, "line");
        return str + line;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001b  */
    /* JADX WARN: Code duplicated, block: B:15:? A[RETURN, SYNTHETIC] */
    private static final int g(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            if (!b.c(str.charAt(i10))) {
                if (i10 == -1) {
                    return str.length();
                }
                return i10;
            }
            i10++;
        }
        i10 = -1;
        if (i10 == -1) {
            return str.length();
        }
        return i10;
    }

    public static final String h(String str, String newIndent) {
        String strInvoke;
        kotlin.jvm.internal.t.f(str, "<this>");
        kotlin.jvm.internal.t.f(newIndent, "newIndent");
        List<String> listR0 = f0.r0(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listR0) {
            if (!f0.k0((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(kotlin.collections.u.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(g((String) it.next())));
        }
        Integer num = (Integer) kotlin.collections.b0.a0(arrayList2);
        int i10 = 0;
        int iIntValue = num != null ? num.intValue() : 0;
        int length = str.length() + (newIndent.length() * listR0.size());
        id.l<String, String> lVarD = d(newIndent);
        int iM = kotlin.collections.t.m(listR0);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listR0) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                kotlin.collections.t.t();
            }
            String str2 = (String) obj2;
            if ((i10 == 0 || i10 == iM) && f0.k0(str2)) {
                str2 = null;
            } else {
                String strF1 = h0.f1(str2, iIntValue);
                if (strF1 != null && (strInvoke = lVarD.invoke(strF1)) != null) {
                    str2 = strInvoke;
                }
            }
            if (str2 != null) {
                arrayList3.add(str2);
            }
            i10 = i11;
        }
        return ((StringBuilder) kotlin.collections.b0.S(arrayList3, new StringBuilder(length), (124 & 2) != 0 ? ", " : "\n", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null)).toString();
    }

    public static final String i(String str, String newIndent, String marginPrefix) {
        int i10;
        String strInvoke;
        kotlin.jvm.internal.t.f(str, "<this>");
        kotlin.jvm.internal.t.f(newIndent, "newIndent");
        kotlin.jvm.internal.t.f(marginPrefix, "marginPrefix");
        if (!(!f0.k0(marginPrefix))) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
        }
        List<String> listR0 = f0.r0(str);
        int length = str.length() + (newIndent.length() * listR0.size());
        id.l<String, String> lVarD = d(newIndent);
        int iM = kotlin.collections.t.m(listR0);
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        for (Object obj : listR0) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                kotlin.collections.t.t();
            }
            String str2 = (String) obj;
            String strSubstring = null;
            if ((i11 == 0 || i11 == iM) && f0.k0(str2)) {
                str2 = null;
            } else {
                int length2 = str2.length();
                int i13 = 0;
                while (true) {
                    if (i13 >= length2) {
                        i10 = -1;
                        break;
                    }
                    if (!b.c(str2.charAt(i13))) {
                        i10 = i13;
                        break;
                    }
                    i13++;
                }
                if (i10 != -1) {
                    int i14 = i10;
                    if (c0.N(str2, marginPrefix, i10, false, 4, null)) {
                        int length3 = i14 + marginPrefix.length();
                        kotlin.jvm.internal.t.d(str2, "null cannot be cast to non-null type java.lang.String");
                        strSubstring = str2.substring(length3);
                        kotlin.jvm.internal.t.e(strSubstring, "substring(...)");
                    }
                }
                if (strSubstring != null && (strInvoke = lVarD.invoke(strSubstring)) != null) {
                    str2 = strInvoke;
                }
            }
            if (str2 != null) {
                arrayList.add(str2);
            }
            i11 = i12;
        }
        return ((StringBuilder) kotlin.collections.b0.S(arrayList, new StringBuilder(length), (124 & 2) != 0 ? ", " : "\n", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null)).toString();
    }

    public static String j(String str) {
        kotlin.jvm.internal.t.f(str, "<this>");
        return h(str, "");
    }

    public static final String k(String str, String marginPrefix) {
        kotlin.jvm.internal.t.f(str, "<this>");
        kotlin.jvm.internal.t.f(marginPrefix, "marginPrefix");
        return i(str, "", marginPrefix);
    }

    public static /* synthetic */ String l(String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str2 = "|";
        }
        return k(str, str2);
    }
}
