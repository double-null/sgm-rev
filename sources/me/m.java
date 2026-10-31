package me;

import com.applovin.shadow.okhttp3.internal.http.DatesKt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import rd.f0;
import zb.ZTs.GEmOVMyH;

/* JADX INFO: compiled from: Cookie.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class m {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f22497j = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Pattern f22498k = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Pattern f22499l = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Pattern f22500m = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Pattern f22501n = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f22502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f22503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f22504c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f22505d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f22506e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f22507f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f22508g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f22509h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f22510i;

    /* JADX INFO: compiled from: Cookie.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:32:0x0041  */
        private final int a(String str, int i10, int i11, boolean z10) {
            boolean z11;
            while (i10 < i11) {
                int i12 = i10 + 1;
                char cCharAt = str.charAt(i10);
                if ((cCharAt >= ' ' || cCharAt == '\t') && cCharAt < 127) {
                    if (!(cCharAt <= '9' && '0' <= cCharAt)) {
                        if (!(cCharAt <= 'z' && 'a' <= cCharAt)) {
                            z11 = (cCharAt <= 'Z' && 'A' <= cCharAt) || cCharAt == ':';
                        }
                    }
                }
                if (z11 == (!z10)) {
                    return i10;
                }
                i10 = i12;
            }
            return i11;
        }

        private final boolean b(String str, String str2) {
            if (kotlin.jvm.internal.t.a(str, str2)) {
                return true;
            }
            return rd.c0.A(str, str2, false, 2, null) && str.charAt((str.length() - str2.length()) - 1) == '.' && !ne.d.i(str);
        }

        private final String f(String str) {
            if (!(!rd.c0.A(str, ".", false, 2, null))) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            String strE = ne.a.e(f0.B0(str, "."));
            if (strE != null) {
                return strE;
            }
            throw new IllegalArgumentException();
        }

        private final long g(String str, int i10, int i11) {
            int iA = a(str, i10, i11, false);
            Matcher matcher = m.f22501n.matcher(str);
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int iI0 = -1;
            int i15 = -1;
            int i16 = -1;
            while (iA < i11) {
                int iA2 = a(str, iA + 1, i11, true);
                matcher.region(iA, iA2);
                if (i13 == -1 && matcher.usePattern(m.f22501n).matches()) {
                    String strGroup = matcher.group(1);
                    kotlin.jvm.internal.t.e(strGroup, "matcher.group(1)");
                    i13 = Integer.parseInt(strGroup);
                    String strGroup2 = matcher.group(2);
                    kotlin.jvm.internal.t.e(strGroup2, "matcher.group(2)");
                    i15 = Integer.parseInt(strGroup2);
                    String strGroup3 = matcher.group(3);
                    kotlin.jvm.internal.t.e(strGroup3, "matcher.group(3)");
                    i16 = Integer.parseInt(strGroup3);
                } else if (i14 == -1 && matcher.usePattern(m.f22500m).matches()) {
                    String strGroup4 = matcher.group(1);
                    kotlin.jvm.internal.t.e(strGroup4, "matcher.group(1)");
                    i14 = Integer.parseInt(strGroup4);
                } else if (iI0 == -1 && matcher.usePattern(m.f22499l).matches()) {
                    String strGroup5 = matcher.group(1);
                    kotlin.jvm.internal.t.e(strGroup5, "matcher.group(1)");
                    Locale locale = Locale.US;
                    kotlin.jvm.internal.t.e(locale, GEmOVMyH.YVuGmUmt);
                    String lowerCase = strGroup5.toLowerCase(locale);
                    kotlin.jvm.internal.t.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    String strPattern = m.f22499l.pattern();
                    kotlin.jvm.internal.t.e(strPattern, "MONTH_PATTERN.pattern()");
                    iI0 = f0.i0(strPattern, lowerCase, 0, false, 6, null) / 4;
                } else if (i12 == -1 && matcher.usePattern(m.f22498k).matches()) {
                    String strGroup6 = matcher.group(1);
                    kotlin.jvm.internal.t.e(strGroup6, "matcher.group(1)");
                    i12 = Integer.parseInt(strGroup6);
                }
                iA = a(str, iA2 + 1, i11, false);
            }
            if (70 <= i12 && i12 < 100) {
                i12 += 1900;
            }
            if (i12 >= 0 && i12 < 70) {
                i12 += 2000;
            }
            if (!(i12 >= 1601)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(iI0 != -1)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(1 <= i14 && i14 < 32)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(i13 >= 0 && i13 < 24)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(i15 >= 0 && i15 < 60)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(i16 >= 0 && i16 < 60)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(ne.d.f22996f);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i12);
            gregorianCalendar.set(2, iI0 - 1);
            gregorianCalendar.set(5, i14);
            gregorianCalendar.set(11, i13);
            gregorianCalendar.set(12, i15);
            gregorianCalendar.set(13, i16);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }

        private final long h(String str) {
            try {
                long j10 = Long.parseLong(str);
                if (j10 <= 0) {
                    return Long.MIN_VALUE;
                }
                return j10;
            } catch (NumberFormatException e10) {
                if (new rd.o("-?\\d+").e(str)) {
                    return rd.c0.O(str, "-", false, 2, null) ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
                throw e10;
            }
        }

        public final m c(u url, String setCookie) {
            kotlin.jvm.internal.t.f(url, "url");
            kotlin.jvm.internal.t.f(setCookie, "setCookie");
            return d(System.currentTimeMillis(), url, setCookie);
        }

        /* JADX WARN: Code duplicated, block: B:46:0x00dc A[PHI: r1
          0x00dc: PHI (r1v24 long) = (r1v8 long), (r1v12 long) binds: [B:45:0x00da, B:56:0x0102] A[DONT_GENERATE, DONT_INLINE]] */
        public final m d(long j10, u url, String setCookie) {
            long j11;
            long j12;
            m mVar;
            String str;
            String str2;
            kotlin.jvm.internal.t.f(url, "url");
            kotlin.jvm.internal.t.f(setCookie, "setCookie");
            int iR = ne.d.r(setCookie, ';', 0, 0, 6, null);
            int iR2 = ne.d.r(setCookie, '=', 0, iR, 2, null);
            if (iR2 == iR) {
                return null;
            }
            String strY = ne.d.Y(setCookie, 0, iR2, 1, null);
            if ((strY.length() == 0) || ne.d.y(strY) != -1) {
                return null;
            }
            String strX = ne.d.X(setCookie, iR2 + 1, iR);
            if (ne.d.y(strX) != -1) {
                return null;
            }
            int i10 = iR + 1;
            int length = setCookie.length();
            String strF = null;
            String str3 = null;
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            boolean z13 = true;
            long jH = -1;
            long jG = DatesKt.MAX_DATE;
            while (i10 < length) {
                int iP = ne.d.p(setCookie, ';', i10, length);
                int iP2 = ne.d.p(setCookie, '=', i10, iP);
                String strX2 = ne.d.X(setCookie, i10, iP2);
                String strX3 = iP2 < iP ? ne.d.X(setCookie, iP2 + 1, iP) : "";
                if (rd.c0.B(strX2, "expires", true)) {
                    try {
                        jG = g(strX3, 0, strX3.length());
                        z12 = true;
                    } catch (NumberFormatException | IllegalArgumentException unused) {
                    }
                } else if (rd.c0.B(strX2, "max-age", true)) {
                    jH = h(strX3);
                    z12 = true;
                } else if (rd.c0.B(strX2, "domain", true)) {
                    strF = f(strX3);
                    z13 = false;
                } else if (rd.c0.B(strX2, "path", true)) {
                    str3 = strX3;
                } else if (rd.c0.B(strX2, "secure", true)) {
                    z10 = true;
                } else if (rd.c0.B(strX2, "httponly", true)) {
                    z11 = true;
                }
                i10 = iP + 1;
            }
            long j13 = Long.MIN_VALUE;
            if (jH == Long.MIN_VALUE) {
                j11 = j13;
            } else if (jH != -1) {
                j13 = j10 + (jH <= 9223372036854775L ? jH * ((long) 1000) : Long.MAX_VALUE);
                if (j13 >= j10) {
                    j12 = DatesKt.MAX_DATE;
                    if (j13 <= DatesKt.MAX_DATE) {
                        j11 = j13;
                    }
                } else {
                    j12 = DatesKt.MAX_DATE;
                }
                j11 = j12;
            } else {
                j11 = jG;
            }
            String strH = url.h();
            if (strF == null) {
                str = strH;
                mVar = null;
            } else {
                if (!b(strH, strF)) {
                    return null;
                }
                mVar = null;
                str = strF;
            }
            if (strH.length() != str.length() && PublicSuffixDatabase.f23399e.c().c(str) == null) {
                return mVar;
            }
            String strSubstring = "/";
            String str4 = str3;
            if (str4 == null || !rd.c0.O(str4, "/", false, 2, mVar)) {
                String strD = url.d();
                int iN0 = f0.n0(strD, '/', 0, false, 6, null);
                if (iN0 != 0) {
                    strSubstring = strD.substring(0, iN0);
                    kotlin.jvm.internal.t.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                str2 = strSubstring;
            } else {
                str2 = str4;
            }
            return new m(strY, strX, j11, str, str2, z10, z11, z12, z13, null);
        }

        public final List<m> e(u url, t headers) {
            kotlin.jvm.internal.t.f(url, "url");
            kotlin.jvm.internal.t.f(headers, "headers");
            List<String> listF = headers.f("Set-Cookie");
            int size = listF.size();
            ArrayList arrayList = null;
            int i10 = 0;
            while (i10 < size) {
                int i11 = i10 + 1;
                m mVarC = c(url, listF.get(i10));
                if (mVarC != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(mVarC);
                }
                i10 = i11;
            }
            if (arrayList == null) {
                return kotlin.collections.t.k();
            }
            List<m> listUnmodifiableList = Collections.unmodifiableList(arrayList);
            kotlin.jvm.internal.t.e(listUnmodifiableList, "{\n        Collections.un…ableList(cookies)\n      }");
            return listUnmodifiableList;
        }
    }

    public /* synthetic */ m(String str, String str2, long j10, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13, kotlin.jvm.internal.k kVar) {
        this(str, str2, j10, str3, str4, z10, z11, z12, z13);
    }

    public final String e() {
        return this.f22505d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (kotlin.jvm.internal.t.a(mVar.f22502a, this.f22502a) && kotlin.jvm.internal.t.a(mVar.f22503b, this.f22503b) && mVar.f22504c == this.f22504c && kotlin.jvm.internal.t.a(mVar.f22505d, this.f22505d) && kotlin.jvm.internal.t.a(mVar.f22506e, this.f22506e) && mVar.f22507f == this.f22507f && mVar.f22508g == this.f22508g && mVar.f22509h == this.f22509h && mVar.f22510i == this.f22510i) {
                return true;
            }
        }
        return false;
    }

    public final long f() {
        return this.f22504c;
    }

    public final boolean g() {
        return this.f22510i;
    }

    public final boolean h() {
        return this.f22508g;
    }

    public int hashCode() {
        return ((((((((((((((((527 + this.f22502a.hashCode()) * 31) + this.f22503b.hashCode()) * 31) + Long.hashCode(this.f22504c)) * 31) + this.f22505d.hashCode()) * 31) + this.f22506e.hashCode()) * 31) + Boolean.hashCode(this.f22507f)) * 31) + Boolean.hashCode(this.f22508g)) * 31) + Boolean.hashCode(this.f22509h)) * 31) + Boolean.hashCode(this.f22510i);
    }

    public final String i() {
        return this.f22502a;
    }

    public final String j() {
        return this.f22506e;
    }

    public final boolean k() {
        return this.f22509h;
    }

    public final boolean l() {
        return this.f22507f;
    }

    public final String m(boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i());
        sb2.append('=');
        sb2.append(n());
        if (k()) {
            if (f() == Long.MIN_VALUE) {
                sb2.append("; max-age=0");
            } else {
                sb2.append("; expires=");
                sb2.append(se.c.b(new Date(f())));
            }
        }
        if (!g()) {
            sb2.append("; domain=");
            if (z10) {
                sb2.append(".");
            }
            sb2.append(e());
        }
        sb2.append("; path=");
        sb2.append(j());
        if (l()) {
            sb2.append("; secure");
        }
        if (h()) {
            sb2.append("; httponly");
        }
        String string = sb2.toString();
        kotlin.jvm.internal.t.e(string, "toString()");
        return string;
    }

    public final String n() {
        return this.f22503b;
    }

    public String toString() {
        return m(false);
    }

    private m(String str, String str2, long j10, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f22502a = str;
        this.f22503b = str2;
        this.f22504c = j10;
        this.f22505d = str3;
        this.f22506e = str4;
        this.f22507f = z10;
        this.f22508g = z11;
        this.f22509h = z12;
        this.f22510i = z13;
    }
}
