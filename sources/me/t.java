package me;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import rd.f0;

/* JADX INFO: compiled from: Headers.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class t implements Iterable<wc.q<? extends String, ? extends String>>, jd.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f22535b = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String[] f22536a;

    /* JADX INFO: compiled from: Headers.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<String> f22537a = new ArrayList(20);

        public final a a(String name, String value) {
            kotlin.jvm.internal.t.f(name, "name");
            kotlin.jvm.internal.t.f(value, "value");
            b bVar = t.f22535b;
            bVar.d(name);
            bVar.e(value, name);
            c(name, value);
            return this;
        }

        public final a b(String line) {
            kotlin.jvm.internal.t.f(line, "line");
            int iH0 = f0.h0(line, ':', 1, false, 4, null);
            if (iH0 != -1) {
                String strSubstring = line.substring(0, iH0);
                kotlin.jvm.internal.t.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                String strSubstring2 = line.substring(iH0 + 1);
                kotlin.jvm.internal.t.e(strSubstring2, "this as java.lang.String).substring(startIndex)");
                c(strSubstring, strSubstring2);
            } else if (line.charAt(0) == ':') {
                String strSubstring3 = line.substring(1);
                kotlin.jvm.internal.t.e(strSubstring3, "this as java.lang.String).substring(startIndex)");
                c("", strSubstring3);
            } else {
                c("", line);
            }
            return this;
        }

        public final a c(String name, String value) {
            kotlin.jvm.internal.t.f(name, "name");
            kotlin.jvm.internal.t.f(value, "value");
            f().add(name);
            f().add(f0.d1(value).toString());
            return this;
        }

        public final t d() {
            Object[] array = this.f22537a.toArray(new String[0]);
            if (array != null) {
                return new t((String[]) array, null);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }

        public final String e(String name) {
            kotlin.jvm.internal.t.f(name, "name");
            int size = this.f22537a.size() - 2;
            int iB = cd.c.b(size, 0, -2);
            if (iB > size) {
                return null;
            }
            while (true) {
                int i10 = size - 2;
                if (rd.c0.B(name, this.f22537a.get(size), true)) {
                    return this.f22537a.get(size + 1);
                }
                if (size == iB) {
                    return null;
                }
                size = i10;
            }
        }

        public final List<String> f() {
            return this.f22537a;
        }

        public final a g(String name) {
            kotlin.jvm.internal.t.f(name, "name");
            int i10 = 0;
            while (i10 < f().size()) {
                if (rd.c0.B(name, f().get(i10), true)) {
                    f().remove(i10);
                    f().remove(i10);
                    i10 -= 2;
                }
                i10 += 2;
            }
            return this;
        }

        public final a h(String name, String value) {
            kotlin.jvm.internal.t.f(name, "name");
            kotlin.jvm.internal.t.f(value, "value");
            b bVar = t.f22535b;
            bVar.d(name);
            bVar.e(value, name);
            g(name);
            c(name, value);
            return this;
        }
    }

    /* JADX INFO: compiled from: Headers.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void d(String str) {
            if (!(str.length() > 0)) {
                throw new IllegalArgumentException("name is empty".toString());
            }
            int length = str.length();
            int i10 = 0;
            while (i10 < length) {
                int i11 = i10 + 1;
                char cCharAt = str.charAt(i10);
                if (!('!' <= cCharAt && cCharAt < 127)) {
                    throw new IllegalArgumentException(ne.d.t("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i10), str).toString());
                }
                i10 = i11;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:15:0x0023  */
        public final void e(String str, String str2) {
            boolean z10;
            int length = str.length();
            int i10 = 0;
            while (i10 < length) {
                int i11 = i10 + 1;
                char cCharAt = str.charAt(i10);
                if (cCharAt == '\t') {
                    z10 = true;
                } else {
                    if (' ' <= cCharAt && cCharAt < 127) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                if (!z10) {
                    throw new IllegalArgumentException(kotlin.jvm.internal.t.n(ne.d.t("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i10), str2), ne.d.H(str2) ? "" : kotlin.jvm.internal.t.n(": ", str)).toString());
                }
                i10 = i11;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String f(String[] strArr, String str) {
            int length = strArr.length - 2;
            int iB = cd.c.b(length, 0, -2);
            if (iB > length) {
                return null;
            }
            while (true) {
                int i10 = length - 2;
                if (rd.c0.B(str, strArr[length], true)) {
                    return strArr[length + 1];
                }
                if (length == iB) {
                    return null;
                }
                length = i10;
            }
        }

        public final t g(Map<String, String> map) {
            kotlin.jvm.internal.t.f(map, "<this>");
            String[] strArr = new String[map.size() * 2];
            int i10 = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                String string = f0.d1(key).toString();
                String string2 = f0.d1(value).toString();
                d(string);
                e(string2, string);
                strArr[i10] = string;
                strArr[i10 + 1] = string2;
                i10 += 2;
            }
            return new t(strArr, null);
        }

        public final t h(String... namesAndValues) {
            kotlin.jvm.internal.t.f(namesAndValues, "namesAndValues");
            int i10 = 0;
            if (!(namesAndValues.length % 2 == 0)) {
                throw new IllegalArgumentException("Expected alternating header names and values".toString());
            }
            String[] strArr = (String[]) namesAndValues.clone();
            int length = strArr.length;
            int i11 = 0;
            while (i11 < length) {
                int i12 = i11 + 1;
                String str = strArr[i11];
                if (!(str != null)) {
                    throw new IllegalArgumentException("Headers cannot be null".toString());
                }
                strArr[i11] = f0.d1(str).toString();
                i11 = i12;
            }
            int iB = cd.c.b(0, strArr.length - 1, 2);
            if (iB >= 0) {
                while (true) {
                    int i13 = i10 + 2;
                    String str2 = strArr[i10];
                    String str3 = strArr[i10 + 1];
                    d(str2);
                    e(str3, str2);
                    if (i10 == iB) {
                        break;
                    }
                    i10 = i13;
                }
            }
            return new t(strArr, null);
        }
    }

    public /* synthetic */ t(String[] strArr, kotlin.jvm.internal.k kVar) {
        this(strArr);
    }

    public final String a(String name) {
        kotlin.jvm.internal.t.f(name, "name");
        return f22535b.f(this.f22536a, name);
    }

    public final String c(int i10) {
        return this.f22536a[i10 * 2];
    }

    public final a d() {
        a aVar = new a();
        kotlin.collections.y.A(aVar.f(), this.f22536a);
        return aVar;
    }

    public final String e(int i10) {
        return this.f22536a[(i10 * 2) + 1];
    }

    public boolean equals(Object obj) {
        return (obj instanceof t) && Arrays.equals(this.f22536a, ((t) obj).f22536a);
    }

    public final List<String> f(String name) {
        kotlin.jvm.internal.t.f(name, "name");
        int size = size();
        ArrayList arrayList = null;
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            if (rd.c0.B(name, c(i10), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(e(i10));
            }
            i10 = i11;
        }
        if (arrayList == null) {
            return kotlin.collections.t.k();
        }
        List<String> listUnmodifiableList = Collections.unmodifiableList(arrayList);
        kotlin.jvm.internal.t.e(listUnmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
        return listUnmodifiableList;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f22536a);
    }

    @Override // java.lang.Iterable
    public Iterator<wc.q<? extends String, ? extends String>> iterator() {
        int size = size();
        wc.q[] qVarArr = new wc.q[size];
        for (int i10 = 0; i10 < size; i10++) {
            qVarArr[i10] = wc.w.a(c(i10), e(i10));
        }
        return kotlin.jvm.internal.c.a(qVarArr);
    }

    public final int size() {
        return this.f22536a.length / 2;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int size = size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            String strC = c(i10);
            String strE = e(i10);
            sb2.append(strC);
            sb2.append(": ");
            if (ne.d.H(strC)) {
                strE = "██";
            }
            sb2.append(strE);
            sb2.append("\n");
            i10 = i11;
        }
        String string = sb2.toString();
        kotlin.jvm.internal.t.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    private t(String[] strArr) {
        this.f22536a = strArr;
    }
}
