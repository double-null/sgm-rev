package me;

import java.util.concurrent.TimeUnit;
import rd.f0;

/* JADX INFO: compiled from: CacheControl.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final b f22362n = new b(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final d f22363o = new a().d().a();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final d f22364p = new a().e().c(Integer.MAX_VALUE, TimeUnit.SECONDS).a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f22365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f22366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f22367c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f22368d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f22369e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f22370f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f22371g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f22372h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f22373i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f22374j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f22375k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f22376l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f22377m;

    /* JADX INFO: compiled from: CacheControl.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f22378a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f22379b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f22380c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f22381d = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f22382e = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f22383f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f22384g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f22385h;

        private final int b(long j10) {
            if (j10 > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            return (int) j10;
        }

        public final d a() {
            return new d(this.f22378a, this.f22379b, this.f22380c, -1, false, false, false, this.f22381d, this.f22382e, this.f22383f, this.f22384g, this.f22385h, null, null);
        }

        public final a c(int i10, TimeUnit timeUnit) {
            kotlin.jvm.internal.t.f(timeUnit, "timeUnit");
            if (!(i10 >= 0)) {
                throw new IllegalArgumentException(kotlin.jvm.internal.t.n("maxStale < 0: ", Integer.valueOf(i10)).toString());
            }
            this.f22381d = b(timeUnit.toSeconds(i10));
            return this;
        }

        public final a d() {
            this.f22378a = true;
            return this;
        }

        public final a e() {
            this.f22383f = true;
            return this;
        }
    }

    /* JADX INFO: compiled from: CacheControl.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.k kVar) {
            this();
        }

        private final int a(String str, String str2, int i10) {
            int length = str.length();
            while (i10 < length) {
                int i11 = i10 + 1;
                if (f0.T(str2, str.charAt(i10), false, 2, null)) {
                    return i10;
                }
                i10 = i11;
            }
            return str.length();
        }

        /* JADX WARN: Code duplicated, block: B:15:0x004c  */
        /* JADX WARN: Code duplicated, block: B:28:0x00c0  */
        /* JADX WARN: Code duplicated, block: B:39:0x00f6  */
        /* JADX WARN: Code duplicated, block: B:42:0x0104  */
        /* JADX WARN: Code duplicated, block: B:54:0x0142  */
        /* JADX WARN: Code duplicated, block: B:57:0x0150  */
        /* JADX WARN: Code duplicated, block: B:75:0x00d4 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:76:0x00e3 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:77:0x00cd A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:78:0x0179 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:79:0x00dc A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:80:0x010c A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:81:0x011b A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:82:0x012a A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:83:0x0159 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:84:0x0169 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:85:0x00f0 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:86:0x00eb A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:87:0x00fe A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:88:0x013a A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:89:0x014a A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:90:0x0171 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:91:0x0161 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:92:0x0132 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:93:0x0122 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:94:0x0113 A[SYNTHETIC] */
        public final d b(t tVar) {
            int iA;
            int iA2;
            String string;
            String string2;
            t headers = tVar;
            kotlin.jvm.internal.t.f(headers, "headers");
            int size = tVar.size();
            boolean z10 = true;
            boolean z11 = true;
            int i10 = 0;
            String str = null;
            boolean z12 = false;
            boolean z13 = false;
            int iW = -1;
            int iW2 = -1;
            boolean z14 = false;
            boolean z15 = false;
            boolean z16 = false;
            int iW3 = -1;
            int iW4 = -1;
            boolean z17 = false;
            boolean z18 = false;
            boolean z19 = false;
            while (i10 < size) {
                int i11 = i10 + 1;
                String strC = headers.c(i10);
                String strE = headers.e(i10);
                if (rd.c0.B(strC, "Cache-Control", z10)) {
                    if (str == null) {
                        str = strE;
                    }
                    iA = 0;
                    while (iA < strE.length()) {
                        iA2 = a(strE, "=,;", iA);
                        String strSubstring = strE.substring(iA, iA2);
                        kotlin.jvm.internal.t.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                        string = f0.d1(strSubstring).toString();
                        if (iA2 != strE.length() || strE.charAt(iA2) == ',' || strE.charAt(iA2) == ';') {
                            iA = iA2 + 1;
                            string2 = null;
                        } else {
                            int iD = ne.d.D(strE, iA2 + 1);
                            if (iD >= strE.length() || strE.charAt(iD) != '\"') {
                                iA = a(strE, ",;", iD);
                                String strSubstring2 = strE.substring(iD, iA);
                                kotlin.jvm.internal.t.e(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                                string2 = f0.d1(strSubstring2).toString();
                            } else {
                                int i12 = iD + 1;
                                int iH0 = f0.h0(strE, '\"', i12, false, 4, null);
                                string2 = strE.substring(i12, iH0);
                                kotlin.jvm.internal.t.e(string2, "this as java.lang.String…ing(startIndex, endIndex)");
                                iA = iH0 + 1;
                            }
                        }
                        if (rd.c0.B("no-cache", string, true)) {
                            z10 = true;
                            z12 = true;
                        } else if (rd.c0.B("no-store", string, true)) {
                            z10 = true;
                            z13 = true;
                        } else {
                            if (rd.c0.B("max-age", string, true)) {
                                iW = ne.d.W(string2, -1);
                            } else if (rd.c0.B("s-maxage", string, true)) {
                                iW2 = ne.d.W(string2, -1);
                            } else if (rd.c0.B("private", string, true)) {
                                z10 = true;
                                z14 = true;
                            } else if (rd.c0.B("public", string, true)) {
                                z10 = true;
                                z15 = true;
                            } else if (rd.c0.B("must-revalidate", string, true)) {
                                z10 = true;
                                z16 = true;
                            } else if (rd.c0.B("max-stale", string, true)) {
                                iW3 = ne.d.W(string2, Integer.MAX_VALUE);
                            } else if (rd.c0.B("min-fresh", string, true)) {
                                iW4 = ne.d.W(string2, -1);
                            } else if (rd.c0.B("only-if-cached", string, true)) {
                                z10 = true;
                                z17 = true;
                            } else if (rd.c0.B("no-transform", string, true)) {
                                z10 = true;
                                z18 = true;
                            } else if (rd.c0.B("immutable", string, true)) {
                                z10 = true;
                                z19 = true;
                            }
                            z10 = true;
                        }
                    }
                    headers = tVar;
                    i10 = i11;
                } else {
                    if (rd.c0.B(strC, "Pragma", z10)) {
                    }
                    headers = tVar;
                    i10 = i11;
                }
                z11 = false;
                iA = 0;
                while (iA < strE.length()) {
                    iA2 = a(strE, "=,;", iA);
                    String strSubstring3 = strE.substring(iA, iA2);
                    kotlin.jvm.internal.t.e(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    string = f0.d1(strSubstring3).toString();
                    if (iA2 != strE.length()) {
                        iA = iA2 + 1;
                        string2 = null;
                    } else {
                        iA = iA2 + 1;
                        string2 = null;
                    }
                    if (rd.c0.B("no-cache", string, true)) {
                        z10 = true;
                        z12 = true;
                    } else if (rd.c0.B("no-store", string, true)) {
                        z10 = true;
                        z13 = true;
                    } else {
                        if (rd.c0.B("max-age", string, true)) {
                            iW = ne.d.W(string2, -1);
                        } else if (rd.c0.B("s-maxage", string, true)) {
                            iW2 = ne.d.W(string2, -1);
                        } else if (rd.c0.B("private", string, true)) {
                            z10 = true;
                            z14 = true;
                        } else if (rd.c0.B("public", string, true)) {
                            z10 = true;
                            z15 = true;
                        } else if (rd.c0.B("must-revalidate", string, true)) {
                            z10 = true;
                            z16 = true;
                        } else if (rd.c0.B("max-stale", string, true)) {
                            iW3 = ne.d.W(string2, Integer.MAX_VALUE);
                        } else if (rd.c0.B("min-fresh", string, true)) {
                            iW4 = ne.d.W(string2, -1);
                        } else if (rd.c0.B("only-if-cached", string, true)) {
                            z10 = true;
                            z17 = true;
                        } else if (rd.c0.B("no-transform", string, true)) {
                            z10 = true;
                            z18 = true;
                        } else if (rd.c0.B("immutable", string, true)) {
                            z10 = true;
                            z19 = true;
                        }
                        z10 = true;
                    }
                }
                headers = tVar;
                i10 = i11;
            }
            return new d(z12, z13, iW, iW2, z14, z15, z16, iW3, iW4, z17, z18, z19, !z11 ? null : str, null);
        }
    }

    public /* synthetic */ d(boolean z10, boolean z11, int i10, int i11, boolean z12, boolean z13, boolean z14, int i12, int i13, boolean z15, boolean z16, boolean z17, String str, kotlin.jvm.internal.k kVar) {
        this(z10, z11, i10, i11, z12, z13, z14, i12, i13, z15, z16, z17, str);
    }

    public final boolean a() {
        return this.f22376l;
    }

    public final boolean b() {
        return this.f22369e;
    }

    public final boolean c() {
        return this.f22370f;
    }

    public final int d() {
        return this.f22367c;
    }

    public final int e() {
        return this.f22372h;
    }

    public final int f() {
        return this.f22373i;
    }

    public final boolean g() {
        return this.f22371g;
    }

    public final boolean h() {
        return this.f22365a;
    }

    public final boolean i() {
        return this.f22366b;
    }

    public final boolean j() {
        return this.f22375k;
    }

    public final boolean k() {
        return this.f22374j;
    }

    public final int l() {
        return this.f22368d;
    }

    public String toString() {
        String str = this.f22377m;
        if (str != null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        if (h()) {
            sb2.append("no-cache, ");
        }
        if (i()) {
            sb2.append("no-store, ");
        }
        if (d() != -1) {
            sb2.append("max-age=");
            sb2.append(d());
            sb2.append(", ");
        }
        if (l() != -1) {
            sb2.append("s-maxage=");
            sb2.append(l());
            sb2.append(", ");
        }
        if (b()) {
            sb2.append("private, ");
        }
        if (c()) {
            sb2.append("public, ");
        }
        if (g()) {
            sb2.append("must-revalidate, ");
        }
        if (e() != -1) {
            sb2.append("max-stale=");
            sb2.append(e());
            sb2.append(", ");
        }
        if (f() != -1) {
            sb2.append("min-fresh=");
            sb2.append(f());
            sb2.append(", ");
        }
        if (k()) {
            sb2.append("only-if-cached, ");
        }
        if (j()) {
            sb2.append("no-transform, ");
        }
        if (a()) {
            sb2.append("immutable, ");
        }
        if (sb2.length() == 0) {
            return "";
        }
        sb2.delete(sb2.length() - 2, sb2.length());
        String string = sb2.toString();
        kotlin.jvm.internal.t.e(string, "StringBuilder().apply(builderAction).toString()");
        this.f22377m = string;
        return string;
    }

    private d(boolean z10, boolean z11, int i10, int i11, boolean z12, boolean z13, boolean z14, int i12, int i13, boolean z15, boolean z16, boolean z17, String str) {
        this.f22365a = z10;
        this.f22366b = z11;
        this.f22367c = i10;
        this.f22368d = i11;
        this.f22369e = z12;
        this.f22370f = z13;
        this.f22371g = z14;
        this.f22372h = i12;
        this.f22373i = i13;
        this.f22374j = z15;
        this.f22375k = z16;
        this.f22376l = z17;
        this.f22377m = str;
    }
}
