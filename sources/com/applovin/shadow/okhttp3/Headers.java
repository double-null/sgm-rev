package com.applovin.shadow.okhttp3;

import cd.c;
import com.applovin.shadow.okhttp3.internal.Util;
import com.applovin.shadow.okhttp3.internal.http.DatesKt;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import kotlin.collections.y;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.t;
import rd.c0;
import rd.f0;
import wc.q;
import wc.w;

/* JADX INFO: compiled from: Headers.kt */
/* JADX INFO: loaded from: classes.dex */
public final class Headers implements Iterable<q<? extends String, ? extends String>>, jd.a {
    public static final Companion Companion = new Companion(null);
    private final String[] namesAndValues;

    /* JADX INFO: compiled from: Headers.kt */
    public static final class Builder {
        private final List<String> namesAndValues = new ArrayList(20);

        public final Builder add(String line) {
            t.f(line, "line");
            int iH0 = f0.h0(line, ':', 0, false, 6, null);
            if (!(iH0 != -1)) {
                throw new IllegalArgumentException(("Unexpected header: " + line).toString());
            }
            String strSubstring = line.substring(0, iH0);
            t.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            String string = f0.d1(strSubstring).toString();
            String strSubstring2 = line.substring(iH0 + 1);
            t.e(strSubstring2, "this as java.lang.String).substring(startIndex)");
            add(string, strSubstring2);
            return this;
        }

        public final Builder addAll(Headers headers) {
            t.f(headers, "headers");
            int size = headers.size();
            for (int i10 = 0; i10 < size; i10++) {
                addLenient$okhttp(headers.name(i10), headers.value(i10));
            }
            return this;
        }

        public final Builder addLenient$okhttp(String line) {
            t.f(line, "line");
            int iH0 = f0.h0(line, ':', 1, false, 4, null);
            if (iH0 != -1) {
                String strSubstring = line.substring(0, iH0);
                t.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                String strSubstring2 = line.substring(iH0 + 1);
                t.e(strSubstring2, "this as java.lang.String).substring(startIndex)");
                addLenient$okhttp(strSubstring, strSubstring2);
            } else if (line.charAt(0) == ':') {
                String strSubstring3 = line.substring(1);
                t.e(strSubstring3, "this as java.lang.String).substring(startIndex)");
                addLenient$okhttp("", strSubstring3);
            } else {
                addLenient$okhttp("", line);
            }
            return this;
        }

        public final Builder addUnsafeNonAscii(String name, String value) {
            t.f(name, "name");
            t.f(value, "value");
            Headers.Companion.checkName(name);
            addLenient$okhttp(name, value);
            return this;
        }

        public final Headers build() {
            return new Headers((String[]) this.namesAndValues.toArray(new String[0]), null);
        }

        public final String get(String name) {
            t.f(name, "name");
            int size = this.namesAndValues.size() - 2;
            int iB = c.b(size, 0, -2);
            if (iB > size) {
                return null;
            }
            while (!c0.B(name, this.namesAndValues.get(size), true)) {
                if (size == iB) {
                    return null;
                }
                size -= 2;
            }
            return this.namesAndValues.get(size + 1);
        }

        public final List<String> getNamesAndValues$okhttp() {
            return this.namesAndValues;
        }

        public final Builder removeAll(String name) {
            t.f(name, "name");
            int i10 = 0;
            while (i10 < this.namesAndValues.size()) {
                if (c0.B(name, this.namesAndValues.get(i10), true)) {
                    this.namesAndValues.remove(i10);
                    this.namesAndValues.remove(i10);
                    i10 -= 2;
                }
                i10 += 2;
            }
            return this;
        }

        public final Builder set(String name, Date value) {
            t.f(name, "name");
            t.f(value, "value");
            set(name, DatesKt.toHttpDateString(value));
            return this;
        }

        public final Builder set(String name, Instant value) {
            t.f(name, "name");
            t.f(value, "value");
            return set(name, new Date(value.toEpochMilli()));
        }

        public final Builder set(String name, String value) {
            t.f(name, "name");
            t.f(value, "value");
            Companion companion = Headers.Companion;
            companion.checkName(name);
            companion.checkValue(value, name);
            removeAll(name);
            addLenient$okhttp(name, value);
            return this;
        }

        public final Builder add(String name, String value) {
            t.f(name, "name");
            t.f(value, "value");
            Companion companion = Headers.Companion;
            companion.checkName(name);
            companion.checkValue(value, name);
            addLenient$okhttp(name, value);
            return this;
        }

        public final Builder addLenient$okhttp(String name, String value) {
            t.f(name, "name");
            t.f(value, "value");
            this.namesAndValues.add(name);
            this.namesAndValues.add(f0.d1(value).toString());
            return this;
        }

        public final Builder add(String name, Date value) {
            t.f(name, "name");
            t.f(value, "value");
            add(name, DatesKt.toHttpDateString(value));
            return this;
        }

        public final Builder add(String name, Instant value) {
            t.f(name, "name");
            t.f(value, "value");
            add(name, new Date(value.toEpochMilli()));
            return this;
        }
    }

    /* JADX INFO: compiled from: Headers.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void checkName(String str) {
            if (!(str.length() > 0)) {
                throw new IllegalArgumentException("name is empty".toString());
            }
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = str.charAt(i10);
                if (!('!' <= cCharAt && cCharAt < 127)) {
                    throw new IllegalArgumentException(Util.format("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i10), str).toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:15:0x0021  */
        public final void checkValue(String str, String str2) {
            boolean z10;
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = str.charAt(i10);
                if (cCharAt == '\t') {
                    z10 = true;
                } else if (' ' <= cCharAt && cCharAt < 127) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(Util.format("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i10), str2));
                    sb2.append(Util.isSensitiveHeader(str2) ? "" : ": " + str);
                    throw new IllegalArgumentException(sb2.toString().toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String get(String[] strArr, String str) {
            int length = strArr.length - 2;
            int iB = c.b(length, 0, -2);
            if (iB > length) {
                return null;
            }
            while (!c0.B(str, strArr[length], true)) {
                if (length == iB) {
                    return null;
                }
                length -= 2;
            }
            return strArr[length + 1];
        }

        /* JADX INFO: renamed from: -deprecated_of, reason: not valid java name */
        public final Headers m54deprecated_of(String... namesAndValues) {
            t.f(namesAndValues, "namesAndValues");
            return of((String[]) Arrays.copyOf(namesAndValues, namesAndValues.length));
        }

        public final Headers of(String... namesAndValues) {
            t.f(namesAndValues, "namesAndValues");
            int i10 = 0;
            if (!(namesAndValues.length % 2 == 0)) {
                throw new IllegalArgumentException("Expected alternating header names and values".toString());
            }
            String[] strArr = (String[]) namesAndValues.clone();
            int length = strArr.length;
            for (int i11 = 0; i11 < length; i11++) {
                String str = strArr[i11];
                if (!(str != null)) {
                    throw new IllegalArgumentException("Headers cannot be null".toString());
                }
                strArr[i11] = f0.d1(str).toString();
            }
            int iB = c.b(0, strArr.length - 1, 2);
            if (iB >= 0) {
                while (true) {
                    String str2 = strArr[i10];
                    String str3 = strArr[i10 + 1];
                    checkName(str2);
                    checkValue(str3, str2);
                    if (i10 == iB) {
                        break;
                    }
                    i10 += 2;
                }
            }
            return new Headers(strArr, null);
        }

        /* JADX INFO: renamed from: -deprecated_of, reason: not valid java name */
        public final Headers m53deprecated_of(Map<String, String> headers) {
            t.f(headers, "headers");
            return of(headers);
        }

        public final Headers of(Map<String, String> map) {
            t.f(map, "<this>");
            String[] strArr = new String[map.size() * 2];
            int i10 = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                String string = f0.d1(key).toString();
                String string2 = f0.d1(value).toString();
                checkName(string);
                checkValue(string2, string);
                strArr[i10] = string;
                strArr[i10 + 1] = string2;
                i10 += 2;
            }
            return new Headers(strArr, null);
        }
    }

    public /* synthetic */ Headers(String[] strArr, k kVar) {
        this(strArr);
    }

    public static final Headers of(Map<String, String> map) {
        return Companion.of(map);
    }

    /* JADX INFO: renamed from: -deprecated_size, reason: not valid java name */
    public final int m52deprecated_size() {
        return size();
    }

    public final long byteCount() {
        String[] strArr = this.namesAndValues;
        long length = strArr.length * 2;
        int length2 = strArr.length;
        for (int i10 = 0; i10 < length2; i10++) {
            length += (long) this.namesAndValues[i10].length();
        }
        return length;
    }

    public boolean equals(Object obj) {
        return (obj instanceof Headers) && Arrays.equals(this.namesAndValues, ((Headers) obj).namesAndValues);
    }

    public final String get(String name) {
        t.f(name, "name");
        return Companion.get(this.namesAndValues, name);
    }

    public final Date getDate(String name) {
        t.f(name, "name");
        String str = get(name);
        if (str != null) {
            return DatesKt.toHttpDateOrNull(str);
        }
        return null;
    }

    public final Instant getInstant(String name) {
        t.f(name, "name");
        Date date = getDate(name);
        if (date != null) {
            return date.toInstant();
        }
        return null;
    }

    public int hashCode() {
        return Arrays.hashCode(this.namesAndValues);
    }

    @Override // java.lang.Iterable
    public Iterator<q<? extends String, ? extends String>> iterator() {
        int size = size();
        q[] qVarArr = new q[size];
        for (int i10 = 0; i10 < size; i10++) {
            qVarArr[i10] = w.a(name(i10), value(i10));
        }
        return kotlin.jvm.internal.c.a(qVarArr);
    }

    public final String name(int i10) {
        return this.namesAndValues[i10 * 2];
    }

    public final Set<String> names() {
        TreeSet treeSet = new TreeSet(c0.D(l0.f21527a));
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            treeSet.add(name(i10));
        }
        Set<String> setUnmodifiableSet = Collections.unmodifiableSet(treeSet);
        t.e(setUnmodifiableSet, "unmodifiableSet(result)");
        return setUnmodifiableSet;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        y.A(builder.getNamesAndValues$okhttp(), this.namesAndValues);
        return builder;
    }

    public final int size() {
        return this.namesAndValues.length / 2;
    }

    public final Map<String, List<String>> toMultimap() {
        TreeMap treeMap = new TreeMap(c0.D(l0.f21527a));
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            String strName = name(i10);
            Locale US = Locale.US;
            t.e(US, "US");
            String lowerCase = strName.toLowerCase(US);
            t.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            List arrayList = (List) treeMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(lowerCase, arrayList);
            }
            arrayList.add(value(i10));
        }
        return treeMap;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            String strName = name(i10);
            String strValue = value(i10);
            sb2.append(strName);
            sb2.append(": ");
            if (Util.isSensitiveHeader(strName)) {
                strValue = "██";
            }
            sb2.append(strValue);
            sb2.append("\n");
        }
        String string = sb2.toString();
        t.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final String value(int i10) {
        return this.namesAndValues[(i10 * 2) + 1];
    }

    public final List<String> values(String name) {
        t.f(name, "name");
        int size = size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            if (c0.B(name, name(i10), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(value(i10));
            }
        }
        if (arrayList == null) {
            return kotlin.collections.t.k();
        }
        List<String> listUnmodifiableList = Collections.unmodifiableList(arrayList);
        t.e(listUnmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
        return listUnmodifiableList;
    }

    private Headers(String[] strArr) {
        this.namesAndValues = strArr;
    }

    public static final Headers of(String... strArr) {
        return Companion.of(strArr);
    }
}
