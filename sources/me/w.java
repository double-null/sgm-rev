package me;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: MediaType.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class w {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f22559e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Pattern f22560f = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Pattern f22561g = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f22562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f22563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f22564c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String[] f22565d;

    /* JADX INFO: compiled from: MediaType.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final w a(String str) {
            kotlin.jvm.internal.t.f(str, "<this>");
            Matcher matcher = w.f22560f.matcher(str);
            if (!matcher.lookingAt()) {
                throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
            }
            String strGroup = matcher.group(1);
            kotlin.jvm.internal.t.e(strGroup, "typeSubtype.group(1)");
            Locale US = Locale.US;
            kotlin.jvm.internal.t.e(US, "US");
            String lowerCase = strGroup.toLowerCase(US);
            kotlin.jvm.internal.t.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            String strGroup2 = matcher.group(2);
            kotlin.jvm.internal.t.e(strGroup2, "typeSubtype.group(2)");
            kotlin.jvm.internal.t.e(US, "US");
            String lowerCase2 = strGroup2.toLowerCase(US);
            kotlin.jvm.internal.t.e(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            ArrayList arrayList = new ArrayList();
            Matcher matcher2 = w.f22561g.matcher(str);
            int iEnd = matcher.end();
            while (iEnd < str.length()) {
                matcher2.region(iEnd, str.length());
                if (!matcher2.lookingAt()) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Parameter is not formatted correctly: \"");
                    String strSubstring = str.substring(iEnd);
                    kotlin.jvm.internal.t.e(strSubstring, "this as java.lang.String).substring(startIndex)");
                    sb2.append(strSubstring);
                    sb2.append("\" for: \"");
                    sb2.append(str);
                    sb2.append('\"');
                    throw new IllegalArgumentException(sb2.toString().toString());
                }
                String strGroup3 = matcher2.group(1);
                if (strGroup3 == null) {
                    iEnd = matcher2.end();
                } else {
                    String strGroup4 = matcher2.group(2);
                    if (strGroup4 == null) {
                        strGroup4 = matcher2.group(3);
                    } else if (rd.c0.O(strGroup4, "'", false, 2, null) && rd.c0.A(strGroup4, "'", false, 2, null) && strGroup4.length() > 2) {
                        strGroup4 = strGroup4.substring(1, strGroup4.length() - 1);
                        kotlin.jvm.internal.t.e(strGroup4, "this as java.lang.String…ing(startIndex, endIndex)");
                    }
                    arrayList.add(strGroup3);
                    arrayList.add(strGroup4);
                    iEnd = matcher2.end();
                }
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return new w(str, lowerCase, lowerCase2, (String[]) array, null);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }

        public final w b(String str) {
            kotlin.jvm.internal.t.f(str, "<this>");
            try {
                return a(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }

    public /* synthetic */ w(String str, String str2, String str3, String[] strArr, kotlin.jvm.internal.k kVar) {
        this(str, str2, str3, strArr);
    }

    public static /* synthetic */ Charset d(w wVar, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = null;
        }
        return wVar.c(charset);
    }

    public final Charset c(Charset charset) {
        String strE = e("charset");
        if (strE == null) {
            return charset;
        }
        try {
            return Charset.forName(strE);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public final String e(String name) {
        kotlin.jvm.internal.t.f(name, "name");
        int i10 = 0;
        int iB = cd.c.b(0, this.f22565d.length - 1, 2);
        if (iB < 0) {
            return null;
        }
        while (true) {
            int i11 = i10 + 2;
            if (rd.c0.B(this.f22565d[i10], name, true)) {
                return this.f22565d[i10 + 1];
            }
            if (i10 == iB) {
                return null;
            }
            i10 = i11;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof w) && kotlin.jvm.internal.t.a(((w) obj).f22562a, this.f22562a);
    }

    public int hashCode() {
        return this.f22562a.hashCode();
    }

    public String toString() {
        return this.f22562a;
    }

    private w(String str, String str2, String str3, String[] strArr) {
        this.f22562a = str;
        this.f22563b = str2;
        this.f22564c = str3;
        this.f22565d = strArr;
    }
}
