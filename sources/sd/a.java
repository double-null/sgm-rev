package sd;

import com.applovin.shadow.okhttp3.internal.http2.Http2Connection;
import com.facebook.appevents.cloudbridge.Gjw.yhXxbqGRMeI;
import com.vungle.ads.internal.persistence.mP.RHIpdOnfgiYkEj;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import rd.f0;

/* JADX INFO: compiled from: Duration.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a implements Comparable<a> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0418a f25407b = new C0418a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f25408c = i(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f25409d = c.j(4611686018427387903L);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f25410e = c.j(-4611686018427387903L);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f25411a;

    /* JADX INFO: renamed from: sd.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Duration.kt */
    public static final class C0418a {
        private C0418a() {
        }

        public /* synthetic */ C0418a(k kVar) {
            this();
        }

        public final long a() {
            return a.f25409d;
        }

        public final long b() {
            return a.f25408c;
        }

        public final long c(String value) {
            t.f(value, "value");
            try {
                return c.p(value, true);
            } catch (IllegalArgumentException e10) {
                throw new IllegalArgumentException("Invalid ISO duration string format: '" + value + yhXxbqGRMeI.MouOZl, e10);
            }
        }
    }

    private /* synthetic */ a(long j10) {
        this.f25411a = j10;
    }

    private static final boolean A(long j10) {
        return (((int) j10) & 1) == 0;
    }

    public static final boolean B(long j10) {
        return j10 == f25409d || j10 == f25410e;
    }

    public static final boolean C(long j10) {
        return j10 < 0;
    }

    public static final boolean D(long j10) {
        return j10 > 0;
    }

    public static final long E(long j10, long j11) {
        if (B(j10)) {
            if (y(j11) || (j11 ^ j10) >= 0) {
                return j10;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (B(j11)) {
            return j11;
        }
        if ((((int) j10) & 1) != (((int) j11) & 1)) {
            return z(j10) ? c(j10, w(j10), w(j11)) : c(j10, w(j11), w(j10));
        }
        long jW = w(j10) + w(j11);
        return A(j10) ? c.m(jW) : c.k(jW);
    }

    public static final String F(long j10) {
        StringBuilder sb2 = new StringBuilder();
        if (C(j10)) {
            sb2.append('-');
        }
        sb2.append("PT");
        long jL = l(j10);
        long jO = o(jL);
        int iS = s(jL);
        int iU = u(jL);
        int iT = t(jL);
        if (B(j10)) {
            jO = 9999999999999L;
        }
        boolean z10 = true;
        boolean z11 = jO != 0;
        boolean z12 = (iU == 0 && iT == 0) ? false : true;
        if (iS == 0 && (!z12 || !z11)) {
            z10 = false;
        }
        if (z11) {
            sb2.append(jO);
            sb2.append('H');
        }
        if (z10) {
            sb2.append(iS);
            sb2.append('M');
        }
        if (z12 || (!z11 && !z10)) {
            d(j10, sb2, iU, iT, 9, "S", true);
        }
        return sb2.toString();
    }

    public static final long G(long j10, d unit) {
        t.f(unit, "unit");
        if (j10 == f25409d) {
            return Long.MAX_VALUE;
        }
        if (j10 == f25410e) {
            return Long.MIN_VALUE;
        }
        return e.b(w(j10), v(j10), unit);
    }

    public static String H(long j10) {
        if (j10 == 0) {
            return "0s";
        }
        if (j10 == f25409d) {
            return "Infinity";
        }
        if (j10 == f25410e) {
            return "-Infinity";
        }
        boolean zC = C(j10);
        StringBuilder sb2 = new StringBuilder();
        if (zC) {
            sb2.append('-');
        }
        long jL = l(j10);
        long jN = n(jL);
        int iM = m(jL);
        int iS = s(jL);
        int iU = u(jL);
        int iT = t(jL);
        int i10 = 0;
        boolean z10 = jN != 0;
        boolean z11 = iM != 0;
        boolean z12 = iS != 0;
        boolean z13 = (iU == 0 && iT == 0) ? false : true;
        if (z10) {
            sb2.append(jN);
            sb2.append('d');
            i10 = 1;
        }
        if (z11 || (z10 && (z12 || z13))) {
            int i11 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            sb2.append(iM);
            sb2.append('h');
            i10 = i11;
        }
        if (z12 || (z13 && (z11 || z10))) {
            int i12 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            sb2.append(iS);
            sb2.append('m');
            i10 = i12;
        }
        if (z13) {
            int i13 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            if (iU != 0 || z10 || z11 || z12) {
                d(j10, sb2, iU, iT, 9, "s", false);
            } else if (iT >= 1000000) {
                d(j10, sb2, iT / 1000000, iT % 1000000, 6, "ms", false);
            } else if (iT >= 1000) {
                d(j10, sb2, iT / 1000, iT % 1000, 3, "us", false);
            } else {
                sb2.append(iT);
                sb2.append("ns");
            }
            i10 = i13;
        }
        if (zC && i10 > 1) {
            sb2.insert(1, '(').append(')');
        }
        return sb2.toString();
    }

    public static final long I(long j10) {
        return c.i(-w(j10), ((int) j10) & 1);
    }

    private static final long c(long j10, long j11, long j12) {
        long jO = c.o(j12);
        long j13 = j11 + jO;
        boolean z10 = false;
        if (-4611686018426L <= j13 && j13 < 4611686018427L) {
            z10 = true;
        }
        if (!z10) {
            return c.j(od.k.k(j13, -4611686018427387903L, 4611686018427387903L));
        }
        return c.l(c.n(j13) + (j12 - c.n(jO)));
    }

    public static final /* synthetic */ a e(long j10) {
        return new a(j10);
    }

    public static int h(long j10, long j11) {
        long j12 = j10 ^ j11;
        if (j12 < 0 || (((int) j12) & 1) == 0) {
            return t.h(j10, j11);
        }
        int i10 = (((int) j10) & 1) - (((int) j11) & 1);
        return C(j10) ? -i10 : i10;
    }

    public static long i(long j10) {
        if (b.a()) {
            if (A(j10)) {
                long jW = w(j10);
                if (!(-4611686018426999999L <= jW && jW < 4611686018427000000L)) {
                    throw new AssertionError(w(j10) + " ns is out of nanoseconds range");
                }
            } else {
                long jW2 = w(j10);
                if (!(-4611686018427387903L <= jW2 && jW2 < 4611686018427387904L)) {
                    throw new AssertionError(w(j10) + " ms is out of milliseconds range");
                }
                long jW3 = w(j10);
                if (-4611686018426L <= jW3 && jW3 < 4611686018427L) {
                    throw new AssertionError(w(j10) + " ms is denormalized");
                }
            }
        }
        return j10;
    }

    public static boolean j(long j10, Object obj) {
        return (obj instanceof a) && j10 == ((a) obj).J();
    }

    public static final boolean k(long j10, long j11) {
        return j10 == j11;
    }

    public static final long l(long j10) {
        return C(j10) ? I(j10) : j10;
    }

    public static final int m(long j10) {
        if (B(j10)) {
            return 0;
        }
        return (int) (o(j10) % ((long) 24));
    }

    public static final long n(long j10) {
        return G(j10, d.DAYS);
    }

    public static final long o(long j10) {
        return G(j10, d.HOURS);
    }

    public static final long p(long j10) {
        return (z(j10) && y(j10)) ? w(j10) : G(j10, d.MILLISECONDS);
    }

    public static final long q(long j10) {
        return G(j10, d.MINUTES);
    }

    public static final long r(long j10) {
        return G(j10, d.SECONDS);
    }

    public static final int s(long j10) {
        if (B(j10)) {
            return 0;
        }
        return (int) (q(j10) % ((long) 60));
    }

    public static final int t(long j10) {
        if (B(j10)) {
            return 0;
        }
        return (int) (z(j10) ? c.n(w(j10) % ((long) 1000)) : w(j10) % ((long) Http2Connection.DEGRADED_PONG_TIMEOUT_NS));
    }

    public static final int u(long j10) {
        if (B(j10)) {
            return 0;
        }
        return (int) (r(j10) % ((long) 60));
    }

    private static final d v(long j10) {
        return A(j10) ? d.NANOSECONDS : d.MILLISECONDS;
    }

    private static final long w(long j10) {
        return j10 >> 1;
    }

    public static int x(long j10) {
        return Long.hashCode(j10);
    }

    public static final boolean y(long j10) {
        return !B(j10);
    }

    private static final boolean z(long j10) {
        return (((int) j10) & 1) == 1;
    }

    public final /* synthetic */ long J() {
        return this.f25411a;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(a aVar) {
        return g(aVar.J());
    }

    public boolean equals(Object obj) {
        return j(this.f25411a, obj);
    }

    public int g(long j10) {
        return h(this.f25411a, j10);
    }

    public int hashCode() {
        return x(this.f25411a);
    }

    public String toString() {
        return H(this.f25411a);
    }

    private static final void d(long j10, StringBuilder sb2, int i10, int i11, int i12, String str, boolean z10) {
        boolean z11;
        sb2.append(i10);
        if (i11 != 0) {
            sb2.append('.');
            String strT0 = f0.t0(String.valueOf(i11), i12, '0');
            int i13 = -1;
            int length = strT0.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i14 = length - 1;
                    if (strT0.charAt(length) != '0') {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        i13 = length;
                        break;
                    } else if (i14 < 0) {
                        break;
                    } else {
                        length = i14;
                    }
                }
            }
            int i15 = i13 + 1;
            String str2 = RHIpdOnfgiYkEj.tDwJpusVIYCxaL;
            if (!z10 && i15 < 3) {
                sb2.append((CharSequence) strT0, 0, i15);
                t.e(sb2, str2);
            } else {
                sb2.append((CharSequence) strT0, 0, ((i15 + 2) / 3) * 3);
                t.e(sb2, str2);
            }
        }
        sb2.append(str);
    }
}
