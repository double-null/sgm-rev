package u7;

import android.net.Uri;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: AdPlaybackState.java */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f25944g = new b(null, new a[0], 0, -9223372036854775807L, 0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final a f25945h = new a(0).h(0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f25946i = x7.l0.C0(1);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f25947j = x7.l0.C0(2);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f25948k = x7.l0.C0(3);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f25949l = x7.l0.C0(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f25950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f25951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f25952c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f25953d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f25954e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final a[] f25955f;

    /* JADX INFO: compiled from: AdPlaybackState.java */
    public static final class a {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final String f25956l = x7.l0.C0(0);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final String f25957m = x7.l0.C0(1);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final String f25958n = x7.l0.C0(2);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final String f25959o = x7.l0.C0(3);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private static final String f25960p = x7.l0.C0(4);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final String f25961q = x7.l0.C0(5);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final String f25962r = x7.l0.C0(6);

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private static final String f25963s = x7.l0.C0(7);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        static final String f25964t = x7.l0.C0(8);

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        static final String f25965u = x7.l0.C0(9);

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        static final String f25966v = x7.l0.C0(10);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f25967a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f25968b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f25969c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Deprecated
        public final Uri[] f25970d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final s[] f25971e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int[] f25972f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long[] f25973g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String[] f25974h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final long f25975i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f25976j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final boolean f25977k;

        public a(long j10) {
            this(j10, -1, -1, new int[0], new s[0], new long[0], 0L, false, new String[0], false);
        }

        private static long[] a(long[] jArr, int i10) {
            int length = jArr.length;
            int iMax = Math.max(i10, length);
            long[] jArrCopyOf = Arrays.copyOf(jArr, iMax);
            Arrays.fill(jArrCopyOf, length, iMax, -9223372036854775807L);
            return jArrCopyOf;
        }

        private static int[] b(int[] iArr, int i10) {
            int length = iArr.length;
            int iMax = Math.max(i10, length);
            int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
            Arrays.fill(iArrCopyOf, length, iMax, 0);
            return iArrCopyOf;
        }

        public int c() {
            return d(-1);
        }

        public int d(int i10) {
            int i11;
            int i12 = i10 + 1;
            while (true) {
                int[] iArr = this.f25972f;
                if (i12 >= iArr.length || this.f25976j || (i11 = iArr[i12]) == 0 || i11 == 1) {
                    break;
                }
                i12++;
            }
            return i12;
        }

        public boolean e() {
            if (this.f25968b == -1) {
                return true;
            }
            for (int i10 = 0; i10 < this.f25968b; i10++) {
                int i11 = this.f25972f[i10];
                if (i11 == 0 || i11 == 1) {
                    return true;
                }
            }
            return false;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f25967a == aVar.f25967a && this.f25968b == aVar.f25968b && this.f25969c == aVar.f25969c && Arrays.equals(this.f25971e, aVar.f25971e) && Arrays.equals(this.f25972f, aVar.f25972f) && Arrays.equals(this.f25973g, aVar.f25973g) && this.f25975i == aVar.f25975i && this.f25976j == aVar.f25976j && Arrays.equals(this.f25974h, aVar.f25974h) && this.f25977k == aVar.f25977k;
        }

        public boolean f() {
            return this.f25977k && this.f25967a == Long.MIN_VALUE && this.f25968b == -1;
        }

        public boolean g() {
            return this.f25968b == -1 || c() < this.f25968b;
        }

        public a h(int i10) {
            int[] iArrB = b(this.f25972f, i10);
            long[] jArrA = a(this.f25973g, i10);
            return new a(this.f25967a, i10, this.f25969c, iArrB, (s[]) Arrays.copyOf(this.f25971e, i10), jArrA, this.f25975i, this.f25976j, (String[]) Arrays.copyOf(this.f25974h, i10), this.f25977k);
        }

        public int hashCode() {
            int i10 = ((this.f25968b * 31) + this.f25969c) * 31;
            long j10 = this.f25967a;
            int iHashCode = (((((((i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + Arrays.hashCode(this.f25971e)) * 31) + Arrays.hashCode(this.f25972f)) * 31) + Arrays.hashCode(this.f25973g)) * 31;
            long j11 = this.f25975i;
            return ((((((iHashCode + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f25976j ? 1 : 0)) * 31) + Arrays.hashCode(this.f25974h)) * 31) + (this.f25977k ? 1 : 0);
        }

        private a(long j10, int i10, int i11, int[] iArr, s[] sVarArr, long[] jArr, long j11, boolean z10, String[] strArr, boolean z11) {
            int i12 = 0;
            x7.a.a(iArr.length == sVarArr.length);
            this.f25967a = j10;
            this.f25968b = i10;
            this.f25969c = i11;
            this.f25972f = iArr;
            this.f25971e = sVarArr;
            this.f25973g = jArr;
            this.f25975i = j11;
            this.f25976j = z10;
            this.f25970d = new Uri[sVarArr.length];
            while (true) {
                Uri[] uriArr = this.f25970d;
                if (i12 >= uriArr.length) {
                    this.f25974h = strArr;
                    this.f25977k = z11;
                    return;
                } else {
                    s sVar = sVarArr[i12];
                    uriArr[i12] = sVar == null ? null : ((s.h) x7.a.e(sVar.f26302b)).f26394a;
                    i12++;
                }
            }
        }
    }

    private b(Object obj, a[] aVarArr, long j10, long j11, int i10) {
        this.f25950a = obj;
        this.f25952c = j10;
        this.f25953d = j11;
        this.f25951b = aVarArr.length + i10;
        this.f25955f = aVarArr;
        this.f25954e = i10;
    }

    private boolean e(long j10, long j11, int i10) {
        if (j10 == Long.MIN_VALUE) {
            return false;
        }
        a aVarA = a(i10);
        long j12 = aVarA.f25967a;
        if (j12 == Long.MIN_VALUE) {
            return j11 == -9223372036854775807L || aVarA.f() || j10 < j11;
        }
        return j10 < j12;
    }

    public a a(int i10) {
        int i11 = this.f25954e;
        return i10 < i11 ? f25945h : this.f25955f[i10 - i11];
    }

    public int b(long j10, long j11) {
        if (j10 == Long.MIN_VALUE) {
            return -1;
        }
        if (j11 != -9223372036854775807L && j10 >= j11) {
            return -1;
        }
        int i10 = this.f25954e;
        while (i10 < this.f25951b && ((a(i10).f25967a != Long.MIN_VALUE && a(i10).f25967a <= j10) || !a(i10).g())) {
            i10++;
        }
        if (i10 < this.f25951b) {
            return i10;
        }
        return -1;
    }

    public int c(long j10, long j11) {
        int i10 = this.f25951b - 1;
        int i11 = i10 - (d(i10) ? 1 : 0);
        while (i11 >= 0 && e(j10, j11, i11)) {
            i11--;
        }
        if (i11 < 0 || !a(i11).e()) {
            return -1;
        }
        return i11;
    }

    public boolean d(int i10) {
        return i10 == this.f25951b - 1 && a(i10).f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return Objects.equals(this.f25950a, bVar.f25950a) && this.f25951b == bVar.f25951b && this.f25952c == bVar.f25952c && this.f25953d == bVar.f25953d && this.f25954e == bVar.f25954e && Arrays.equals(this.f25955f, bVar.f25955f);
    }

    public int hashCode() {
        int i10 = this.f25951b * 31;
        Object obj = this.f25950a;
        return ((((((((i10 + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.f25952c)) * 31) + ((int) this.f25953d)) * 31) + this.f25954e) * 31) + Arrays.hashCode(this.f25955f);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("AdPlaybackState(adsId=");
        sb2.append(this.f25950a);
        sb2.append(", adResumePositionUs=");
        sb2.append(this.f25952c);
        sb2.append(", adGroups=[");
        for (int i10 = 0; i10 < this.f25955f.length; i10++) {
            sb2.append("adGroup(timeUs=");
            sb2.append(this.f25955f[i10].f25967a);
            sb2.append(", ads=[");
            for (int i11 = 0; i11 < this.f25955f[i10].f25972f.length; i11++) {
                sb2.append("ad(state=");
                int i12 = this.f25955f[i10].f25972f[i11];
                if (i12 == 0) {
                    sb2.append('_');
                } else if (i12 == 1) {
                    sb2.append('R');
                } else if (i12 == 2) {
                    sb2.append('S');
                } else if (i12 == 3) {
                    sb2.append('P');
                } else if (i12 != 4) {
                    sb2.append('?');
                } else {
                    sb2.append('!');
                }
                sb2.append(", durationUs=");
                sb2.append(this.f25955f[i10].f25973g[i11]);
                sb2.append(')');
                if (i11 < this.f25955f[i10].f25972f.length - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append("])");
            if (i10 < this.f25955f.length - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("])");
        return sb2.toString();
    }
}
