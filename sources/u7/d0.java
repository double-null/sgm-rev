package u7;

import android.net.Uri;
import android.util.Pair;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Objects;

/* JADX INFO: compiled from: Timeline.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d0 f26009a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f26010b = x7.l0.C0(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f26011c = x7.l0.C0(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f26012d = x7.l0.C0(2);

    /* JADX INFO: compiled from: Timeline.java */
    class a extends d0 {
        a() {
        }

        @Override // u7.d0
        public int b(Object obj) {
            return -1;
        }

        @Override // u7.d0
        public b g(int i10, b bVar, boolean z10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // u7.d0
        public int i() {
            return 0;
        }

        @Override // u7.d0
        public Object m(int i10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // u7.d0
        public c o(int i10, c cVar, long j10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // u7.d0
        public int p() {
            return 0;
        }
    }

    /* JADX INFO: compiled from: Timeline.java */
    public static final class b {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final String f26013h = x7.l0.C0(0);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final String f26014i = x7.l0.C0(1);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final String f26015j = x7.l0.C0(2);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final String f26016k = x7.l0.C0(3);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final String f26017l = x7.l0.C0(4);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f26018a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f26019b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f26020c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f26021d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f26022e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f26023f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public u7.b f26024g = u7.b.f25944g;

        public int a(int i10) {
            return this.f26024g.a(i10).f25968b;
        }

        public long b(int i10, int i11) {
            u7.b.a aVarA = this.f26024g.a(i10);
            if (aVarA.f25968b != -1) {
                return aVarA.f25973g[i11];
            }
            return -9223372036854775807L;
        }

        public int c() {
            return this.f26024g.f25951b;
        }

        public int d(long j10) {
            return this.f26024g.b(j10, this.f26021d);
        }

        public int e(long j10) {
            return this.f26024g.c(j10, this.f26021d);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !b.class.equals(obj.getClass())) {
                return false;
            }
            b bVar = (b) obj;
            return Objects.equals(this.f26018a, bVar.f26018a) && Objects.equals(this.f26019b, bVar.f26019b) && this.f26020c == bVar.f26020c && this.f26021d == bVar.f26021d && this.f26022e == bVar.f26022e && this.f26023f == bVar.f26023f && Objects.equals(this.f26024g, bVar.f26024g);
        }

        public long f(int i10) {
            return this.f26024g.a(i10).f25967a;
        }

        public long g() {
            return this.f26024g.f25952c;
        }

        public int h(int i10, int i11) {
            u7.b.a aVarA = this.f26024g.a(i10);
            if (aVarA.f25968b != -1) {
                return aVarA.f25972f[i11];
            }
            return 0;
        }

        public int hashCode() {
            Object obj = this.f26018a;
            int iHashCode = (Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.f26019b;
            int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f26020c) * 31;
            long j10 = this.f26021d;
            int i10 = (iHashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f26022e;
            return ((((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f26023f ? 1 : 0)) * 31) + this.f26024g.hashCode();
        }

        public long i(int i10) {
            return this.f26024g.a(i10).f25975i;
        }

        public long j() {
            return this.f26021d;
        }

        public int k(int i10) {
            return this.f26024g.a(i10).c();
        }

        public int l(int i10, int i11) {
            return this.f26024g.a(i10).d(i11);
        }

        public long m() {
            return x7.l0.t1(this.f26022e);
        }

        public long n() {
            return this.f26022e;
        }

        public int o() {
            return this.f26024g.f25954e;
        }

        public boolean p(int i10) {
            return !this.f26024g.a(i10).e();
        }

        public boolean q(int i10) {
            return i10 == c() - 1 && this.f26024g.d(i10);
        }

        public boolean r(int i10) {
            return this.f26024g.a(i10).f25976j;
        }

        public b s(Object obj, Object obj2, int i10, long j10, long j11) {
            return t(obj, obj2, i10, j10, j11, u7.b.f25944g, false);
        }

        public b t(Object obj, Object obj2, int i10, long j10, long j11, u7.b bVar, boolean z10) {
            this.f26018a = obj;
            this.f26019b = obj2;
            this.f26020c = i10;
            this.f26021d = j10;
            this.f26022e = j11;
            this.f26024g = bVar;
            this.f26023f = z10;
            return this;
        }
    }

    /* JADX INFO: compiled from: Timeline.java */
    public static final class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Deprecated
        public Object f26036b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f26038d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f26039e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f26040f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f26041g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f26042h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f26043i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public s.g f26044j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f26045k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public long f26046l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public long f26047m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f26048n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f26049o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public long f26050p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final Object f26025q = new Object();

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final Object f26026r = new Object();

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private static final s f26027s = new s.c().c("io.bidmachine.media3.common.Timeline").f(Uri.EMPTY).a();

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final String f26028t = x7.l0.C0(1);

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private static final String f26029u = x7.l0.C0(2);

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private static final String f26030v = x7.l0.C0(3);

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private static final String f26031w = x7.l0.C0(4);

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private static final String f26032x = x7.l0.C0(5);

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private static final String f26033y = x7.l0.C0(6);

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private static final String f26034z = x7.l0.C0(7);
        private static final String A = x7.l0.C0(8);
        private static final String B = x7.l0.C0(9);
        private static final String C = x7.l0.C0(10);
        private static final String D = x7.l0.C0(11);
        private static final String E = x7.l0.C0(12);
        private static final String F = x7.l0.C0(13);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f26035a = f26025q;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public s f26037c = f26027s;

        public long a() {
            return x7.l0.h0(this.f26041g);
        }

        public long b() {
            return x7.l0.t1(this.f26046l);
        }

        public long c() {
            return this.f26046l;
        }

        public long d() {
            return x7.l0.t1(this.f26047m);
        }

        public long e() {
            return this.f26050p;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !c.class.equals(obj.getClass())) {
                return false;
            }
            c cVar = (c) obj;
            return Objects.equals(this.f26035a, cVar.f26035a) && Objects.equals(this.f26037c, cVar.f26037c) && Objects.equals(this.f26038d, cVar.f26038d) && Objects.equals(this.f26044j, cVar.f26044j) && this.f26039e == cVar.f26039e && this.f26040f == cVar.f26040f && this.f26041g == cVar.f26041g && this.f26042h == cVar.f26042h && this.f26043i == cVar.f26043i && this.f26045k == cVar.f26045k && this.f26046l == cVar.f26046l && this.f26047m == cVar.f26047m && this.f26048n == cVar.f26048n && this.f26049o == cVar.f26049o && this.f26050p == cVar.f26050p;
        }

        public boolean f() {
            return this.f26044j != null;
        }

        public c g(Object obj, s sVar, Object obj2, long j10, long j11, long j12, boolean z10, boolean z11, s.g gVar, long j13, long j14, int i10, int i11, long j15) {
            s.h hVar;
            this.f26035a = obj;
            this.f26037c = sVar != null ? sVar : f26027s;
            this.f26036b = (sVar == null || (hVar = sVar.f26302b) == null) ? null : hVar.f26401h;
            this.f26038d = obj2;
            this.f26039e = j10;
            this.f26040f = j11;
            this.f26041g = j12;
            this.f26042h = z10;
            this.f26043i = z11;
            this.f26044j = gVar;
            this.f26046l = j13;
            this.f26047m = j14;
            this.f26048n = i10;
            this.f26049o = i11;
            this.f26050p = j15;
            this.f26045k = false;
            return this;
        }

        public int hashCode() {
            int iHashCode = (((Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE + this.f26035a.hashCode()) * 31) + this.f26037c.hashCode()) * 31;
            Object obj = this.f26038d;
            int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            s.g gVar = this.f26044j;
            int iHashCode3 = (iHashCode2 + (gVar != null ? gVar.hashCode() : 0)) * 31;
            long j10 = this.f26039e;
            int i10 = (iHashCode3 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f26040f;
            int i11 = (i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
            long j12 = this.f26041g;
            int i12 = (((((((i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.f26042h ? 1 : 0)) * 31) + (this.f26043i ? 1 : 0)) * 31) + (this.f26045k ? 1 : 0)) * 31;
            long j13 = this.f26046l;
            int i13 = (i12 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
            long j14 = this.f26047m;
            int i14 = (((((i13 + ((int) (j14 ^ (j14 >>> 32)))) * 31) + this.f26048n) * 31) + this.f26049o) * 31;
            long j15 = this.f26050p;
            return i14 + ((int) (j15 ^ (j15 >>> 32)));
        }
    }

    protected d0() {
    }

    public int a(boolean z10) {
        return q() ? -1 : 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z10) {
        if (q()) {
            return -1;
        }
        return p() - 1;
    }

    public final int d(int i10, b bVar, c cVar, int i11, boolean z10) {
        int i12 = f(i10, bVar).f26020c;
        if (n(i12, cVar).f26049o != i10) {
            return i10 + 1;
        }
        int iE = e(i12, i11, z10);
        if (iE == -1) {
            return -1;
        }
        return n(iE, cVar).f26048n;
    }

    public int e(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == c(z10)) {
                return -1;
            }
            return i10 + 1;
        }
        if (i11 == 1) {
            return i10;
        }
        if (i11 == 2) {
            return i10 == c(z10) ? a(z10) : i10 + 1;
        }
        throw new IllegalStateException();
    }

    public boolean equals(Object obj) {
        int iC;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        if (d0Var.p() != p() || d0Var.i() != i()) {
            return false;
        }
        c cVar = new c();
        b bVar = new b();
        c cVar2 = new c();
        b bVar2 = new b();
        for (int i10 = 0; i10 < p(); i10++) {
            if (!n(i10, cVar).equals(d0Var.n(i10, cVar2))) {
                return false;
            }
        }
        for (int i11 = 0; i11 < i(); i11++) {
            if (!g(i11, bVar, true).equals(d0Var.g(i11, bVar2, true))) {
                return false;
            }
        }
        int iA = a(true);
        if (iA != d0Var.a(true) || (iC = c(true)) != d0Var.c(true)) {
            return false;
        }
        while (iA != iC) {
            int iE = e(iA, 0, true);
            if (iE != d0Var.e(iA, 0, true)) {
                return false;
            }
            iA = iE;
        }
        return true;
    }

    public final b f(int i10, b bVar) {
        return g(i10, bVar, false);
    }

    public abstract b g(int i10, b bVar, boolean z10);

    public b h(Object obj, b bVar) {
        return g(b(obj), bVar, true);
    }

    public int hashCode() {
        c cVar = new c();
        b bVar = new b();
        int iP = Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE + p();
        for (int i10 = 0; i10 < p(); i10++) {
            iP = (iP * 31) + n(i10, cVar).hashCode();
        }
        int i11 = (iP * 31) + i();
        for (int i12 = 0; i12 < i(); i12++) {
            i11 = (i11 * 31) + g(i12, bVar, true).hashCode();
        }
        int iA = a(true);
        while (iA != -1) {
            i11 = (i11 * 31) + iA;
            iA = e(iA, 0, true);
        }
        return i11;
    }

    public abstract int i();

    public final Pair<Object, Long> j(c cVar, b bVar, int i10, long j10) {
        return (Pair) x7.a.e(k(cVar, bVar, i10, j10, 0L));
    }

    public final Pair<Object, Long> k(c cVar, b bVar, int i10, long j10, long j11) {
        x7.a.c(i10, 0, p());
        o(i10, cVar, j11);
        if (j10 == -9223372036854775807L) {
            j10 = cVar.c();
            if (j10 == -9223372036854775807L) {
                return null;
            }
        }
        int i11 = cVar.f26048n;
        f(i11, bVar);
        while (i11 < cVar.f26049o && bVar.f26022e != j10) {
            int i12 = i11 + 1;
            if (f(i12, bVar).f26022e > j10) {
                break;
            }
            i11 = i12;
        }
        g(i11, bVar, true);
        long jMin = j10 - bVar.f26022e;
        long j12 = bVar.f26021d;
        if (j12 != -9223372036854775807L) {
            jMin = Math.min(jMin, j12 - 1);
        }
        return Pair.create(x7.a.e(bVar.f26019b), Long.valueOf(Math.max(0L, jMin)));
    }

    public int l(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == a(z10)) {
                return -1;
            }
            return i10 - 1;
        }
        if (i11 == 1) {
            return i10;
        }
        if (i11 == 2) {
            return i10 == a(z10) ? c(z10) : i10 - 1;
        }
        throw new IllegalStateException();
    }

    public abstract Object m(int i10);

    public final c n(int i10, c cVar) {
        return o(i10, cVar, 0L);
    }

    public abstract c o(int i10, c cVar, long j10);

    public abstract int p();

    public final boolean q() {
        return p() == 0;
    }

    public final boolean r(int i10, b bVar, c cVar, int i11, boolean z10) {
        return d(i10, bVar, cVar, i11, z10) == -1;
    }
}
