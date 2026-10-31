package me;

import com.applovin.impl.communicator.ZREl.sRGQSqxgxlS;
import com.applovin.shadow.okhttp3.HttpUrl;
import com.applovin.shadow.okio.Utf8;
import com.explorestack.protobuf.openrtb.LossReason;
import com.google.ads.mediation.ZRT.wHzciBnJlYkdX;
import com.vungle.ads.internal.protos.Sdk;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import rd.f0;
import rd.h0;

/* JADX INFO: compiled from: HttpUrl.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class u {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final b f22538k = new b(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final char[] f22539l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f22540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f22541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f22542c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f22543d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f22544e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<String> f22545f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List<String> f22546g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f22547h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f22548i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f22549j;

    /* JADX INFO: compiled from: HttpUrl.kt */
    public static final class a {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final C0373a f22550i = new C0373a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f22551a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f22554d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final List<String> f22556f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private List<String> f22557g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f22558h;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f22552b = "";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f22553c = "";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f22555e = -1;

        /* JADX INFO: renamed from: me.u$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: HttpUrl.kt */
        public static final class C0373a {
            private C0373a() {
            }

            public /* synthetic */ C0373a(kotlin.jvm.internal.k kVar) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int e(String str, int i10, int i11) {
                try {
                    int i12 = Integer.parseInt(b.b(u.f22538k, str, i10, i11, "", false, false, false, false, null, 248, null));
                    boolean z10 = false;
                    if (1 <= i12 && i12 < 65536) {
                        z10 = true;
                    }
                    if (z10) {
                        return i12;
                    }
                    return -1;
                } catch (NumberFormatException unused) {
                    return -1;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int f(String str, int i10, int i11) {
                while (i10 < i11) {
                    char cCharAt = str.charAt(i10);
                    if (cCharAt == '[') {
                        do {
                            i10++;
                            if (i10 >= i11) {
                                break;
                            }
                        } while (str.charAt(i10) != ']');
                    } else if (cCharAt == ':') {
                        return i10;
                    }
                    i10++;
                }
                return i11;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int g(String str, int i10, int i11) {
                if (i11 - i10 < 2) {
                    return -1;
                }
                char cCharAt = str.charAt(i10);
                if ((kotlin.jvm.internal.t.g(cCharAt, 97) < 0 || kotlin.jvm.internal.t.g(cCharAt, 122) > 0) && (kotlin.jvm.internal.t.g(cCharAt, 65) < 0 || kotlin.jvm.internal.t.g(cCharAt, 90) > 0)) {
                    return -1;
                }
                int i12 = i10 + 1;
                while (i12 < i11) {
                    int i13 = i12 + 1;
                    char cCharAt2 = str.charAt(i12);
                    if (!(((((('a' <= cCharAt2 && cCharAt2 < '{') || ('A' <= cCharAt2 && cCharAt2 < '[')) || ('0' <= cCharAt2 && cCharAt2 < ':')) || cCharAt2 == '+') || cCharAt2 == '-') || cCharAt2 == '.')) {
                        if (cCharAt2 == ':') {
                            return i12;
                        }
                        return -1;
                    }
                    i12 = i13;
                }
                return -1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int h(String str, int i10, int i11) {
                int i12 = 0;
                while (i10 < i11) {
                    int i13 = i10 + 1;
                    char cCharAt = str.charAt(i10);
                    if (cCharAt != '\\' && cCharAt != '/') {
                        break;
                    }
                    i12++;
                    i10 = i13;
                }
                return i12;
            }
        }

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f22556f = arrayList;
            arrayList.add("");
        }

        private final int b() {
            int i10 = this.f22555e;
            if (i10 != -1) {
                return i10;
            }
            b bVar = u.f22538k;
            String str = this.f22551a;
            kotlin.jvm.internal.t.c(str);
            return bVar.c(str);
        }

        private final boolean m(String str) {
            return kotlin.jvm.internal.t.a(str, ".") || rd.c0.B(str, "%2e", true);
        }

        private final boolean n(String str) {
            return kotlin.jvm.internal.t.a(str, "..") || rd.c0.B(str, "%2e.", true) || rd.c0.B(str, ".%2e", true) || rd.c0.B(str, "%2e%2e", true);
        }

        private final void q() {
            List<String> list = this.f22556f;
            if (!(list.remove(list.size() - 1).length() == 0) || !(!this.f22556f.isEmpty())) {
                this.f22556f.add("");
            } else {
                List<String> list2 = this.f22556f;
                list2.set(list2.size() - 1, "");
            }
        }

        private final void s(String str, int i10, int i11, boolean z10, boolean z11) {
            String strB = b.b(u.f22538k, str, i10, i11, HttpUrl.PATH_SEGMENT_ENCODE_SET, z11, false, false, false, null, 240, null);
            if (m(strB)) {
                return;
            }
            if (n(strB)) {
                q();
                return;
            }
            List<String> list = this.f22556f;
            if (list.get(list.size() - 1).length() == 0) {
                List<String> list2 = this.f22556f;
                list2.set(list2.size() - 1, strB);
            } else {
                this.f22556f.add(strB);
            }
            if (z10) {
                this.f22556f.add("");
            }
        }

        private final void u(String str, int i10, int i11) {
            if (i10 == i11) {
                return;
            }
            char cCharAt = str.charAt(i10);
            if (cCharAt == '/' || cCharAt == '\\') {
                this.f22556f.clear();
                this.f22556f.add("");
                i10++;
            } else {
                List<String> list = this.f22556f;
                list.set(list.size() - 1, "");
            }
            while (true) {
                int i12 = i10;
                while (i12 < i11) {
                    i10 = ne.d.q(str, "/\\", i12, i11);
                    boolean z10 = i10 < i11;
                    s(str, i12, i10, z10, true);
                    if (z10) {
                        i12 = i10 + 1;
                    }
                }
                return;
            }
        }

        public final void A(String str) {
            this.f22554d = str;
        }

        public final void B(int i10) {
            this.f22555e = i10;
        }

        public final void C(String str) {
            this.f22551a = str;
        }

        public final a D(String username) {
            kotlin.jvm.internal.t.f(username, "username");
            z(b.b(u.f22538k, username, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null));
            return this;
        }

        public final u a() {
            ArrayList arrayList;
            String str = this.f22551a;
            if (str == null) {
                throw new IllegalStateException("scheme == null");
            }
            b bVar = u.f22538k;
            String strH = b.h(bVar, this.f22552b, 0, 0, false, 7, null);
            String strH2 = b.h(bVar, this.f22553c, 0, 0, false, 7, null);
            String str2 = this.f22554d;
            if (str2 == null) {
                throw new IllegalStateException("host == null");
            }
            int iB = b();
            List<String> list = this.f22556f;
            ArrayList arrayList2 = new ArrayList(kotlin.collections.u.u(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(b.h(u.f22538k, (String) it.next(), 0, 0, false, 7, null));
            }
            List<String> list2 = this.f22557g;
            if (list2 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(kotlin.collections.u.u(list2, 10));
                for (String str3 : list2) {
                    arrayList.add(str3 == null ? null : b.h(u.f22538k, str3, 0, 0, true, 3, null));
                }
            }
            String str4 = this.f22558h;
            return new u(str, strH, strH2, str2, iB, arrayList2, arrayList, str4 == null ? null : b.h(u.f22538k, str4, 0, 0, false, 7, null), toString());
        }

        public final a c(String str) {
            List<String> listJ = null;
            if (str != null) {
                b bVar = u.f22538k;
                String strB = b.b(bVar, str, 0, 0, HttpUrl.QUERY_ENCODE_SET, true, false, true, false, null, LossReason.LOSS_REASON_CREATIVE_FILTERED_ANIMATION_TOO_LONG_VALUE, null);
                if (strB != null) {
                    listJ = bVar.j(strB);
                }
            }
            y(listJ);
            return this;
        }

        public final String d() {
            return this.f22558h;
        }

        public final String e() {
            return this.f22553c;
        }

        public final List<String> f() {
            return this.f22556f;
        }

        public final List<String> g() {
            return this.f22557g;
        }

        public final String h() {
            return this.f22552b;
        }

        public final String i() {
            return this.f22554d;
        }

        public final int j() {
            return this.f22555e;
        }

        public final String k() {
            return this.f22551a;
        }

        public final a l(String host) {
            kotlin.jvm.internal.t.f(host, "host");
            String strE = ne.a.e(b.h(u.f22538k, host, 0, 0, false, 7, null));
            if (strE == null) {
                throw new IllegalArgumentException(kotlin.jvm.internal.t.n("unexpected host: ", host));
            }
            A(strE);
            return this;
        }

        public final a o(u uVar, String str) {
            int iQ;
            int i10;
            int i11;
            boolean z10;
            String str2;
            int i12;
            boolean z11;
            String input = str;
            kotlin.jvm.internal.t.f(input, "input");
            int iA = ne.d.A(input, 0, 0, 3, null);
            int iC = ne.d.C(input, iA, 0, 2, null);
            C0373a c0373a = f22550i;
            int iG = c0373a.g(input, iA, iC);
            String str3 = "this as java.lang.String…ing(startIndex, endIndex)";
            boolean z12 = true;
            byte b10 = -1;
            if (iG != -1) {
                if (rd.c0.L(input, "https:", iA, true)) {
                    this.f22551a = "https";
                    iA += 6;
                } else {
                    if (!rd.c0.L(input, "http:", iA, true)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Expected URL scheme 'http' or 'https' but was '");
                        String strSubstring = input.substring(0, iG);
                        kotlin.jvm.internal.t.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                        sb2.append(strSubstring);
                        sb2.append('\'');
                        throw new IllegalArgumentException(sb2.toString());
                    }
                    this.f22551a = "http";
                    iA += 5;
                }
            } else {
                if (uVar == null) {
                    if (str.length() > 6) {
                        input = kotlin.jvm.internal.t.n(h0.j1(input, 6), "...");
                    }
                    throw new IllegalArgumentException(kotlin.jvm.internal.t.n("Expected URL scheme 'http' or 'https' but no scheme was found for ", input));
                }
                this.f22551a = uVar.p();
            }
            int iH = c0373a.h(input, iA, iC);
            byte b11 = Utf8.REPLACEMENT_BYTE;
            byte b12 = 35;
            if (iH >= 2 || uVar == null || !kotlin.jvm.internal.t.a(uVar.p(), this.f22551a)) {
                int i13 = iA + iH;
                boolean z13 = false;
                boolean z14 = false;
                while (true) {
                    iQ = ne.d.q(input, "@/\\?#", i13, iC);
                    byte bCharAt = iQ != iC ? input.charAt(iQ) : b10;
                    if (bCharAt == b10 || bCharAt == b12 || bCharAt == 47 || bCharAt == 92 || bCharAt == b11) {
                        break;
                    }
                    if (bCharAt == 64) {
                        if (z13) {
                            z10 = z12;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(this.f22553c);
                            sb3.append("%40");
                            str2 = str3;
                            i12 = iQ;
                            sb3.append(b.b(u.f22538k, str, i13, iQ, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null));
                            this.f22553c = sb3.toString();
                        } else {
                            int iP = ne.d.p(input, ':', i13, iQ);
                            b bVar = u.f22538k;
                            z10 = z12;
                            String str4 = str3;
                            String strB = b.b(bVar, str, i13, iP, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                            if (z14) {
                                strB = this.f22552b + "%40" + strB;
                            }
                            this.f22552b = strB;
                            if (iP != iQ) {
                                this.f22553c = b.b(bVar, str, iP + 1, iQ, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                                z11 = z10;
                            } else {
                                z11 = z13;
                            }
                            z13 = z11;
                            str2 = str4;
                            z14 = z10;
                            i12 = iQ;
                        }
                        i13 = i12 + 1;
                        str3 = str2;
                        z12 = z10;
                        iC = iC;
                        b12 = 35;
                        b11 = Utf8.REPLACEMENT_BYTE;
                        b10 = -1;
                    }
                }
                boolean z15 = z12;
                String str5 = str3;
                i10 = iC;
                C0373a c0373a2 = f22550i;
                int iF = c0373a2.f(input, i13, iQ);
                int i14 = iF + 1;
                if (i14 < iQ) {
                    i11 = i13;
                    this.f22554d = ne.a.e(b.h(u.f22538k, str, i13, iF, false, 4, null));
                    int iE = c0373a2.e(input, i14, iQ);
                    this.f22555e = iE;
                    if (!(iE != -1 ? z15 : false)) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Invalid URL port: \"");
                        String strSubstring2 = input.substring(i14, iQ);
                        kotlin.jvm.internal.t.e(strSubstring2, str5);
                        sb4.append(strSubstring2);
                        sb4.append('\"');
                        throw new IllegalArgumentException(sb4.toString().toString());
                    }
                } else {
                    i11 = i13;
                    b bVar2 = u.f22538k;
                    this.f22554d = ne.a.e(b.h(bVar2, str, i11, iF, false, 4, null));
                    String str6 = this.f22551a;
                    kotlin.jvm.internal.t.c(str6);
                    this.f22555e = bVar2.c(str6);
                }
                if (!(this.f22554d != null ? z15 : false)) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("Invalid URL host: \"");
                    String strSubstring3 = input.substring(i11, iF);
                    kotlin.jvm.internal.t.e(strSubstring3, str5);
                    sb5.append(strSubstring3);
                    sb5.append('\"');
                    throw new IllegalArgumentException(sb5.toString().toString());
                }
                iA = iQ;
            } else {
                this.f22552b = uVar.g();
                this.f22553c = uVar.c();
                this.f22554d = uVar.h();
                this.f22555e = uVar.l();
                this.f22556f.clear();
                this.f22556f.addAll(uVar.e());
                if (iA == iC || input.charAt(iA) == '#') {
                    c(uVar.f());
                }
                i10 = iC;
            }
            int i15 = i10;
            int iQ2 = ne.d.q(input, "?#", iA, i15);
            u(input, iA, iQ2);
            if (iQ2 < i15 && input.charAt(iQ2) == '?') {
                int iP2 = ne.d.p(input, '#', iQ2, i15);
                b bVar3 = u.f22538k;
                this.f22557g = bVar3.j(b.b(bVar3, str, iQ2 + 1, iP2, HttpUrl.QUERY_ENCODE_SET, true, false, true, false, null, 208, null));
                iQ2 = iP2;
            }
            if (iQ2 < i15 && input.charAt(iQ2) == '#') {
                this.f22558h = b.b(u.f22538k, str, iQ2 + 1, i15, "", true, false, false, true, null, 176, null);
            }
            return this;
        }

        public final a p(String password) {
            kotlin.jvm.internal.t.f(password, "password");
            x(b.b(u.f22538k, password, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null));
            return this;
        }

        public final a r(int i10) {
            boolean z10 = false;
            if (1 <= i10 && i10 < 65536) {
                z10 = true;
            }
            if (!z10) {
                throw new IllegalArgumentException(kotlin.jvm.internal.t.n("unexpected port: ", Integer.valueOf(i10)).toString());
            }
            B(i10);
            return this;
        }

        public final a t() {
            String strI = i();
            A(strI == null ? null : new rd.o("[\"<>^`{|}]").f(strI, ""));
            int size = f().size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                f().set(i11, b.b(u.f22538k, f().get(i11), 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, true, true, false, false, null, Sdk.SDKError.Reason.INVALID_CSB_DATA_VALUE, null));
            }
            List<String> listG = g();
            if (listG != null) {
                int size2 = listG.size();
                while (i10 < size2) {
                    int i12 = i10 + 1;
                    String str = listG.get(i10);
                    listG.set(i10, str == null ? null : b.b(u.f22538k, str, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET_URI, true, true, true, false, null, 195, null));
                    i10 = i12;
                }
            }
            String strD = d();
            w(strD != null ? b.b(u.f22538k, strD, 0, 0, HttpUrl.FRAGMENT_ENCODE_SET_URI, true, true, false, true, null, 163, null) : null);
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:17:0x003f  */
        /* JADX WARN: Code duplicated, block: B:20:0x0051  */
        /* JADX WARN: Code duplicated, block: B:22:0x0054  */
        /* JADX WARN: Code duplicated, block: B:38:0x00b7  */
        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            if (k() != null) {
                sb2.append(k());
                sb2.append("://");
            } else {
                sb2.append("//");
            }
            if (h().length() > 0) {
                sb2.append(h());
                if (e().length() > 0) {
                    sb2.append(':');
                    sb2.append(e());
                }
                sb2.append('@');
            } else {
                if (e().length() > 0) {
                    sb2.append(h());
                    if (e().length() > 0) {
                        sb2.append(':');
                        sb2.append(e());
                    }
                    sb2.append('@');
                }
            }
            if (i() != null) {
                String strI = i();
                kotlin.jvm.internal.t.c(strI);
                if (f0.T(strI, ':', false, 2, null)) {
                    sb2.append('[');
                    sb2.append(i());
                    sb2.append(']');
                } else {
                    sb2.append(i());
                }
            }
            if (j() != -1 || k() != null) {
                int iB = b();
                if (k() != null) {
                    b bVar = u.f22538k;
                    String strK = k();
                    kotlin.jvm.internal.t.c(strK);
                    if (iB != bVar.c(strK)) {
                        sb2.append(':');
                        sb2.append(iB);
                    }
                } else {
                    sb2.append(':');
                    sb2.append(iB);
                }
            }
            b bVar2 = u.f22538k;
            bVar2.i(f(), sb2);
            if (g() != null) {
                sb2.append('?');
                List<String> listG = g();
                kotlin.jvm.internal.t.c(listG);
                bVar2.k(listG, sb2);
            }
            if (d() != null) {
                sb2.append('#');
                sb2.append(d());
            }
            String string = sb2.toString();
            kotlin.jvm.internal.t.e(string, "StringBuilder().apply(builderAction).toString()");
            return string;
        }

        public final a v(String scheme) {
            kotlin.jvm.internal.t.f(scheme, "scheme");
            if (rd.c0.B(scheme, "http", true)) {
                C("http");
            } else {
                if (!rd.c0.B(scheme, "https", true)) {
                    throw new IllegalArgumentException(kotlin.jvm.internal.t.n("unexpected scheme: ", scheme));
                }
                C("https");
            }
            return this;
        }

        public final void w(String str) {
            this.f22558h = str;
        }

        public final void x(String str) {
            kotlin.jvm.internal.t.f(str, "<set-?>");
            this.f22553c = str;
        }

        public final void y(List<String> list) {
            this.f22557g = list;
        }

        public final void z(String str) {
            kotlin.jvm.internal.t.f(str, "<set-?>");
            this.f22552b = str;
        }
    }

    /* JADX INFO: compiled from: HttpUrl.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.k kVar) {
            this();
        }

        public static /* synthetic */ String b(b bVar, String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset, int i12, Object obj) {
            return bVar.a(str, (i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? str.length() : i11, str2, (i12 & 8) != 0 ? false : z10, (i12 & 16) != 0 ? false : z11, (i12 & 32) != 0 ? false : z12, (i12 & 64) != 0 ? false : z13, (i12 & 128) != 0 ? null : charset);
        }

        private final boolean e(String str, int i10, int i11) {
            int i12 = i10 + 2;
            return i12 < i11 && str.charAt(i10) == '%' && ne.d.I(str.charAt(i10 + 1)) != -1 && ne.d.I(str.charAt(i12)) != -1;
        }

        public static /* synthetic */ String h(b bVar, String str, int i10, int i11, boolean z10, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = str.length();
            }
            if ((i12 & 4) != 0) {
                z10 = false;
            }
            return bVar.g(str, i10, i11, z10);
        }

        /* JADX WARN: Code duplicated, block: B:37:0x0062  */
        /* JADX WARN: Code duplicated, block: B:39:0x0067  */
        /* JADX WARN: Code duplicated, block: B:42:0x006e  */
        /* JADX WARN: Code duplicated, block: B:48:0x0087  */
        /* JADX WARN: Code duplicated, block: B:51:0x0090 A[LOOP:1: B:49:0x008a->B:51:0x0090, LOOP_END] */
        private final void l(af.e eVar, String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) {
            int iCharCount = i10;
            af.e eVar2 = null;
            while (iCharCount < i11) {
                int iCodePointAt = str.codePointAt(iCharCount);
                if (!z10 || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                    if (iCodePointAt == 43 && z12) {
                        eVar.writeUtf8(z10 ? "+" : "%2B");
                    } else if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z13) || f0.T(str2, (char) iCodePointAt, false, 2, null))) {
                        if (eVar2 == null) {
                            eVar2 = new af.e();
                        }
                        if (charset != null || kotlin.jvm.internal.t.a(charset, StandardCharsets.UTF_8)) {
                            eVar2.k0(iCodePointAt);
                        } else {
                            eVar2.a0(str, iCharCount, Character.charCount(iCodePointAt) + iCharCount, charset);
                        }
                        while (!eVar2.exhausted()) {
                            int i12 = eVar2.readByte() & 255;
                            eVar.writeByte(37);
                            eVar.writeByte(u.f22539l[(i12 >> 4) & 15]);
                            eVar.writeByte(u.f22539l[i12 & 15]);
                        }
                    } else {
                        if (iCodePointAt == 37) {
                            if (z10) {
                                if (z11) {
                                    if (!e(str, iCharCount, i11)) {
                                    }
                                }
                            }
                            if (eVar2 == null) {
                                eVar2 = new af.e();
                            }
                            if (charset != null) {
                                eVar2.k0(iCodePointAt);
                            } else {
                                eVar2.k0(iCodePointAt);
                            }
                            while (!eVar2.exhausted()) {
                                int i13 = eVar2.readByte() & 255;
                                eVar.writeByte(37);
                                eVar.writeByte(u.f22539l[(i13 >> 4) & 15]);
                                eVar.writeByte(u.f22539l[i13 & 15]);
                            }
                        }
                        eVar.k0(iCodePointAt);
                    }
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
        }

        private final void m(af.e eVar, String str, int i10, int i11, boolean z10) {
            int i12;
            while (i10 < i11) {
                int iCodePointAt = str.codePointAt(i10);
                if (iCodePointAt == 37 && (i12 = i10 + 2) < i11) {
                    int I = ne.d.I(str.charAt(i10 + 1));
                    int I2 = ne.d.I(str.charAt(i12));
                    if (I == -1 || I2 == -1) {
                        eVar.k0(iCodePointAt);
                        i10 += Character.charCount(iCodePointAt);
                    } else {
                        eVar.writeByte((I << 4) + I2);
                        i10 = Character.charCount(iCodePointAt) + i12;
                    }
                } else if (iCodePointAt == 43 && z10) {
                    eVar.writeByte(32);
                    i10++;
                } else {
                    eVar.k0(iCodePointAt);
                    i10 += Character.charCount(iCodePointAt);
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:20:0x003e  */
        public final String a(String str, int i10, int i11, String encodeSet, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) {
            kotlin.jvm.internal.t.f(str, "<this>");
            kotlin.jvm.internal.t.f(encodeSet, "encodeSet");
            int iCharCount = i10;
            while (true) {
                if (iCharCount >= i11) {
                    String strSubstring = str.substring(i10, i11);
                    kotlin.jvm.internal.t.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    return strSubstring;
                }
                int iCodePointAt = str.codePointAt(iCharCount);
                if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z13) || f0.T(encodeSet, (char) iCodePointAt, false, 2, null))) {
                    break;
                }
                if (iCodePointAt == 37) {
                    if (!z10) {
                        break;
                    }
                    if (z11) {
                        if (e(str, iCharCount, i11)) {
                        }
                    }
                    if (iCodePointAt == 43) {
                    }
                    iCharCount += Character.charCount(iCodePointAt);
                } else if (iCodePointAt == 43 || !z12) {
                    iCharCount += Character.charCount(iCodePointAt);
                }
                af.e eVar = new af.e();
                eVar.j0(str, i10, iCharCount);
                l(eVar, str, iCharCount, i11, encodeSet, z10, z11, z12, z13, charset);
                return eVar.readUtf8();
            }
            af.e eVar2 = new af.e();
            eVar2.j0(str, i10, iCharCount);
            l(eVar2, str, iCharCount, i11, encodeSet, z10, z11, z12, z13, charset);
            return eVar2.readUtf8();
        }

        public final u d(String str) {
            kotlin.jvm.internal.t.f(str, "<this>");
            return new a().o(null, str).a();
        }

        public final u f(String str) {
            kotlin.jvm.internal.t.f(str, "<this>");
            try {
                return d(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public final String g(String str, int i10, int i11, boolean z10) {
            kotlin.jvm.internal.t.f(str, "<this>");
            int i12 = i10;
            while (i12 < i11) {
                int i13 = i12 + 1;
                char cCharAt = str.charAt(i12);
                if (cCharAt == '%' || (cCharAt == '+' && z10)) {
                    af.e eVar = new af.e();
                    eVar.j0(str, i10, i12);
                    m(eVar, str, i12, i11, z10);
                    return eVar.readUtf8();
                }
                i12 = i13;
            }
            String strSubstring = str.substring(i10, i11);
            kotlin.jvm.internal.t.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring;
        }

        public final void i(List<String> list, StringBuilder out) {
            kotlin.jvm.internal.t.f(list, "<this>");
            kotlin.jvm.internal.t.f(out, "out");
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                out.append('/');
                out.append(list.get(i10));
            }
        }

        public final List<String> j(String str) {
            kotlin.jvm.internal.t.f(str, "<this>");
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (i10 <= str.length()) {
                int iH0 = f0.h0(str, '&', i10, false, 4, null);
                if (iH0 == -1) {
                    iH0 = str.length();
                }
                int i11 = iH0;
                int iH1 = f0.h0(str, '=', i10, false, 4, null);
                if (iH1 == -1 || iH1 > i11) {
                    String strSubstring = str.substring(i10, i11);
                    kotlin.jvm.internal.t.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring);
                    arrayList.add(null);
                } else {
                    String strSubstring2 = str.substring(i10, iH1);
                    kotlin.jvm.internal.t.e(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring2);
                    String strSubstring3 = str.substring(iH1 + 1, i11);
                    kotlin.jvm.internal.t.e(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring3);
                }
                i10 = i11 + 1;
            }
            return arrayList;
        }

        public final void k(List<String> list, StringBuilder out) {
            kotlin.jvm.internal.t.f(list, "<this>");
            kotlin.jvm.internal.t.f(out, "out");
            od.f fVarM = od.k.m(od.k.n(0, list.size()), 2);
            int iA = fVarM.a();
            int iC = fVarM.c();
            int iD = fVarM.d();
            if ((iD <= 0 || iA > iC) && (iD >= 0 || iC > iA)) {
                return;
            }
            while (true) {
                int i10 = iA + iD;
                String str = list.get(iA);
                String str2 = list.get(iA + 1);
                if (iA > 0) {
                    out.append('&');
                }
                out.append(str);
                if (str2 != null) {
                    out.append('=');
                    out.append(str2);
                }
                if (iA == iC) {
                    return;
                } else {
                    iA = i10;
                }
            }
        }

        public final int c(String scheme) {
            kotlin.jvm.internal.t.f(scheme, "scheme");
            if (kotlin.jvm.internal.t.a(scheme, "http")) {
                return 80;
            }
            return kotlin.jvm.internal.t.a(scheme, sRGQSqxgxlS.LHbYIHAilEbcJ) ? 443 : -1;
        }
    }

    public u(String scheme, String username, String password, String host, int i10, List<String> pathSegments, List<String> list, String str, String url) {
        kotlin.jvm.internal.t.f(scheme, "scheme");
        kotlin.jvm.internal.t.f(username, "username");
        kotlin.jvm.internal.t.f(password, "password");
        kotlin.jvm.internal.t.f(host, "host");
        kotlin.jvm.internal.t.f(pathSegments, "pathSegments");
        kotlin.jvm.internal.t.f(url, "url");
        this.f22540a = scheme;
        this.f22541b = username;
        this.f22542c = password;
        this.f22543d = host;
        this.f22544e = i10;
        this.f22545f = pathSegments;
        this.f22546g = list;
        this.f22547h = str;
        this.f22548i = url;
        this.f22549j = kotlin.jvm.internal.t.a(scheme, "https");
    }

    public final String b() {
        if (this.f22547h == null) {
            return null;
        }
        String strSubstring = this.f22548i.substring(f0.h0(this.f22548i, '#', 0, false, 6, null) + 1);
        kotlin.jvm.internal.t.e(strSubstring, "this as java.lang.String).substring(startIndex)");
        return strSubstring;
    }

    public final String c() {
        if (this.f22542c.length() == 0) {
            return "";
        }
        String strSubstring = this.f22548i.substring(f0.h0(this.f22548i, ':', this.f22540a.length() + 3, false, 4, null) + 1, f0.h0(this.f22548i, '@', 0, false, 6, null));
        kotlin.jvm.internal.t.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String d() {
        int iH0 = f0.h0(this.f22548i, '/', this.f22540a.length() + 3, false, 4, null);
        String str = this.f22548i;
        String strSubstring = this.f22548i.substring(iH0, ne.d.q(str, "?#", iH0, str.length()));
        kotlin.jvm.internal.t.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final List<String> e() {
        int iH0 = f0.h0(this.f22548i, '/', this.f22540a.length() + 3, false, 4, null);
        String str = this.f22548i;
        int iQ = ne.d.q(str, "?#", iH0, str.length());
        ArrayList arrayList = new ArrayList();
        while (iH0 < iQ) {
            int i10 = iH0 + 1;
            int iP = ne.d.p(this.f22548i, '/', i10, iQ);
            String strSubstring = this.f22548i.substring(i10, iP);
            kotlin.jvm.internal.t.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(strSubstring);
            iH0 = iP;
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        return (obj instanceof u) && kotlin.jvm.internal.t.a(((u) obj).f22548i, this.f22548i);
    }

    public final String f() {
        if (this.f22546g == null) {
            return null;
        }
        int iH0 = f0.h0(this.f22548i, '?', 0, false, 6, null) + 1;
        String str = this.f22548i;
        String strSubstring = this.f22548i.substring(iH0, ne.d.p(str, '#', iH0, str.length()));
        kotlin.jvm.internal.t.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String h() {
        return this.f22543d;
    }

    public int hashCode() {
        return this.f22548i.hashCode();
    }

    public final boolean i() {
        return this.f22549j;
    }

    public final a j() {
        a aVar = new a();
        aVar.C(this.f22540a);
        aVar.z(g());
        aVar.x(c());
        aVar.A(this.f22543d);
        aVar.B(this.f22544e != f22538k.c(this.f22540a) ? this.f22544e : -1);
        aVar.f().clear();
        aVar.f().addAll(e());
        aVar.c(f());
        aVar.w(b());
        return aVar;
    }

    public final a k(String link) {
        kotlin.jvm.internal.t.f(link, "link");
        try {
            return new a().o(this, link);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final int l() {
        return this.f22544e;
    }

    public final String m() {
        if (this.f22546g == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        f22538k.k(this.f22546g, sb2);
        return sb2.toString();
    }

    public final String n() {
        a aVarK = k("/...");
        kotlin.jvm.internal.t.c(aVarK);
        return aVarK.D("").p("").a().toString();
    }

    public final u o(String link) {
        kotlin.jvm.internal.t.f(link, "link");
        a aVarK = k(link);
        if (aVarK == null) {
            return null;
        }
        return aVarK.a();
    }

    public final String p() {
        return this.f22540a;
    }

    public final URI q() {
        String string = j().t().toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e10) {
            try {
                URI uriCreate = URI.create(new rd.o("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").f(string, ""));
                kotlin.jvm.internal.t.e(uriCreate, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final URL r() {
        try {
            return new URL(this.f22548i);
        } catch (MalformedURLException e10) {
            throw new RuntimeException(e10);
        }
    }

    public String toString() {
        return this.f22548i;
    }

    public final String g() {
        if (this.f22541b.length() == 0) {
            return "";
        }
        int length = this.f22540a.length() + 3;
        String str = this.f22548i;
        String strSubstring = this.f22548i.substring(length, ne.d.q(str, wHzciBnJlYkdX.quVlzp, length, str.length()));
        kotlin.jvm.internal.t.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }
}
