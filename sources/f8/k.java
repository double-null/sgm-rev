package f8;

import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;
import u7.q;
import x7.l0;

/* JADX INFO: compiled from: SegmentBase.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final i f14729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long f14730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f14731c;

    /* JADX INFO: compiled from: SegmentBase.java */
    public static abstract class a extends k {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final long f14732d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final long f14733e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final List<d> f14734f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final long f14735g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final long f14736h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final long f14737i;

        public a(i iVar, long j10, long j11, long j12, long j13, List<d> list, long j14, long j15, long j16) {
            super(iVar, j10, j11);
            this.f14732d = j12;
            this.f14733e = j13;
            this.f14734f = list;
            this.f14737i = j14;
            this.f14735g = j15;
            this.f14736h = j16;
        }

        public long c(long j10, long j11) {
            long jG = g(j10);
            return jG != -1 ? jG : (int) (i((j11 - this.f14736h) + this.f14737i, j10) - d(j10, j11));
        }

        public long d(long j10, long j11) {
            if (g(j10) == -1) {
                long j12 = this.f14735g;
                if (j12 != -9223372036854775807L) {
                    return Math.max(e(), i((j11 - this.f14736h) - j12, j10));
                }
            }
            return e();
        }

        public long e() {
            return this.f14732d;
        }

        public long f(long j10, long j11) {
            if (this.f14734f != null) {
                return -9223372036854775807L;
            }
            long jD = d(j10, j11) + c(j10, j11);
            return (j(jD) + h(jD, j10)) - this.f14737i;
        }

        public abstract long g(long j10);

        public final long h(long j10, long j11) {
            List<d> list = this.f14734f;
            if (list != null) {
                return (list.get((int) (j10 - this.f14732d)).f14743b * 1000000) / this.f14730b;
            }
            long jG = g(j11);
            return (jG == -1 || j10 != (e() + jG) - 1) ? (this.f14733e * 1000000) / this.f14730b : j11 - j(j10);
        }

        public long i(long j10, long j11) {
            long jE = e();
            long jG = g(j11);
            if (jG == 0) {
                return jE;
            }
            if (this.f14734f == null) {
                long j12 = this.f14732d + (j10 / ((this.f14733e * 1000000) / this.f14730b));
                if (j12 < jE) {
                    return jE;
                }
                return jG == -1 ? j12 : Math.min(j12, (jE + jG) - 1);
            }
            long j13 = (jG + jE) - 1;
            long j14 = jE;
            while (j14 <= j13) {
                long j15 = ((j13 - j14) / 2) + j14;
                long j16 = j(j15);
                if (j16 < j10) {
                    j14 = j15 + 1;
                } else {
                    if (j16 <= j10) {
                        return j15;
                    }
                    j13 = j15 - 1;
                }
            }
            return j14 == jE ? j14 : j13;
        }

        public final long j(long j10) {
            List<d> list = this.f14734f;
            return l0.f1(list != null ? list.get((int) (j10 - this.f14732d)).f14742a - this.f14731c : (j10 - this.f14732d) * this.f14733e, 1000000L, this.f14730b);
        }

        public abstract i k(j jVar, long j10);

        public boolean l() {
            return this.f14734f != null;
        }
    }

    /* JADX INFO: compiled from: SegmentBase.java */
    public static final class b extends a {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final List<i> f14738j;

        public b(i iVar, long j10, long j11, long j12, long j13, List<d> list, long j14, List<i> list2, long j15, long j16) {
            super(iVar, j10, j11, j12, j13, list, j14, j15, j16);
            this.f14738j = list2;
        }

        @Override // f8.k.a
        public long g(long j10) {
            return this.f14738j.size();
        }

        @Override // f8.k.a
        public i k(j jVar, long j10) {
            return this.f14738j.get((int) (j10 - this.f14732d));
        }

        @Override // f8.k.a
        public boolean l() {
            return true;
        }
    }

    /* JADX INFO: compiled from: SegmentBase.java */
    public static final class c extends a {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final n f14739j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final n f14740k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final long f14741l;

        public c(i iVar, long j10, long j11, long j12, long j13, long j14, List<d> list, long j15, n nVar, n nVar2, long j16, long j17) {
            super(iVar, j10, j11, j12, j14, list, j15, j16, j17);
            this.f14739j = nVar;
            this.f14740k = nVar2;
            this.f14741l = j13;
        }

        @Override // f8.k
        public i a(j jVar) {
            n nVar = this.f14739j;
            if (nVar == null) {
                return super.a(jVar);
            }
            q qVar = jVar.f14716b;
            return new i(nVar.a(qVar.f26238a, 0L, qVar.f26247j, 0L), 0L, -1L);
        }

        @Override // f8.k.a
        public long g(long j10) {
            List<d> list = this.f14734f;
            if (list != null) {
                return list.size();
            }
            long j11 = this.f14741l;
            if (j11 != -1) {
                return (j11 - this.f14732d) + 1;
            }
            if (j10 != -9223372036854775807L) {
                return u2.a.a(BigInteger.valueOf(j10).multiply(BigInteger.valueOf(this.f14730b)), BigInteger.valueOf(this.f14733e).multiply(BigInteger.valueOf(1000000L)), RoundingMode.CEILING).longValue();
            }
            return -1L;
        }

        @Override // f8.k.a
        public i k(j jVar, long j10) {
            List<d> list = this.f14734f;
            long j11 = list != null ? list.get((int) (j10 - this.f14732d)).f14742a : (j10 - this.f14732d) * this.f14733e;
            n nVar = this.f14740k;
            q qVar = jVar.f14716b;
            return new i(nVar.a(qVar.f26238a, j10, qVar.f26247j, j11), 0L, -1L);
        }
    }

    /* JADX INFO: compiled from: SegmentBase.java */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final long f14742a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long f14743b;

        public d(long j10, long j11) {
            this.f14742a = j10;
            this.f14743b = j11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.f14742a == dVar.f14742a && this.f14743b == dVar.f14743b;
        }

        public int hashCode() {
            return (((int) this.f14742a) * 31) + ((int) this.f14743b);
        }
    }

    public k(i iVar, long j10, long j11) {
        this.f14729a = iVar;
        this.f14730b = j10;
        this.f14731c = j11;
    }

    public i a(j jVar) {
        return this.f14729a;
    }

    public long b() {
        return l0.f1(this.f14731c, 1000000L, this.f14730b);
    }

    /* JADX INFO: compiled from: SegmentBase.java */
    public static class e extends k {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final long f14744d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final long f14745e;

        public e(i iVar, long j10, long j11, long j12, long j13) {
            super(iVar, j10, j11);
            this.f14744d = j12;
            this.f14745e = j13;
        }

        public i c() {
            long j10 = this.f14745e;
            if (j10 <= 0) {
                return null;
            }
            return new i(null, this.f14744d, j10);
        }

        public e() {
            this(null, 1L, 0L, 0L, 0L);
        }
    }
}
