package q8;

import com.google.common.collect.g0;
import com.google.common.collect.h0;
import com.google.common.collect.y;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import u7.d0;
import u7.e0;
import x7.l0;

/* JADX INFO: compiled from: AdaptiveTrackSelection.java */
/* JADX INFO: loaded from: classes4.dex */
public class a extends c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final r8.d f24462i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f24463j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f24464k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f24465l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f24466m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f24467n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final float f24468o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final float f24469p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final com.google.common.collect.u<C0398a> f24470q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final x7.h f24471r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f24472s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f24473t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f24474u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f24475v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private o8.m f24476w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f24477x;

    /* JADX INFO: renamed from: q8.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AdaptiveTrackSelection.java */
    public static final class C0398a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f24478a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f24479b;

        public C0398a(long j10, long j11) {
            this.f24478a = j10;
            this.f24479b = j11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0398a)) {
                return false;
            }
            C0398a c0398a = (C0398a) obj;
            return this.f24478a == c0398a.f24478a && this.f24479b == c0398a.f24479b;
        }

        public int hashCode() {
            return (((int) this.f24478a) * 31) + ((int) this.f24479b);
        }
    }

    /* JADX INFO: compiled from: AdaptiveTrackSelection.java */
    public static class b implements q.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f24480a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f24481b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f24482c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f24483d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f24484e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final float f24485f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final float f24486g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final x7.h f24487h;

        public b() {
            this(10000, 25000, 25000, 0.7f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // q8.q.b
        public final q[] a(q.a[] aVarArr, r8.d dVar, io.bidmachine.media3.exoplayer.source.r.b bVar, d0 d0Var) {
            com.google.common.collect.u uVarB = a.B(aVarArr);
            q[] qVarArr = new q[aVarArr.length];
            for (int i10 = 0; i10 < aVarArr.length; i10++) {
                q.a aVar = aVarArr[i10];
                if (aVar != null) {
                    int[] iArr = aVar.f24597b;
                    if (iArr.length != 0) {
                        qVarArr[i10] = iArr.length == 1 ? new r(aVar.f24596a, iArr[0], aVar.f24598c) : b(aVar.f24596a, iArr, aVar.f24598c, dVar, (com.google.common.collect.u) uVarB.get(i10));
                    }
                }
            }
            return qVarArr;
        }

        protected a b(e0 e0Var, int[] iArr, int i10, r8.d dVar, com.google.common.collect.u<C0398a> uVar) {
            return new a(e0Var, iArr, i10, dVar, this.f24480a, this.f24481b, this.f24482c, this.f24483d, this.f24484e, this.f24485f, this.f24486g, uVar, this.f24487h);
        }

        public b(int i10, int i11, int i12, float f10) {
            this(i10, i11, i12, 1279, 719, f10, 0.75f, x7.h.f28124a);
        }

        public b(int i10, int i11, int i12, int i13, int i14, float f10, float f11, x7.h hVar) {
            this.f24480a = i10;
            this.f24481b = i11;
            this.f24482c = i12;
            this.f24483d = i13;
            this.f24484e = i14;
            this.f24485f = f10;
            this.f24486g = f11;
            this.f24487h = hVar;
        }
    }

    protected a(e0 e0Var, int[] iArr, int i10, r8.d dVar, long j10, long j11, long j12, int i11, int i12, float f10, float f11, List<C0398a> list, x7.h hVar) {
        long j13;
        super(e0Var, iArr, i10);
        if (j12 < j10) {
            x7.r.h("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j13 = j10;
        } else {
            j13 = j12;
        }
        this.f24462i = dVar;
        this.f24463j = j10 * 1000;
        this.f24464k = j11 * 1000;
        this.f24465l = j13 * 1000;
        this.f24466m = i11;
        this.f24467n = i12;
        this.f24468o = f10;
        this.f24469p = f11;
        this.f24470q = com.google.common.collect.u.B(list);
        this.f24471r = hVar;
        this.f24472s = 1.0f;
        this.f24474u = 0;
        this.f24475v = -9223372036854775807L;
        this.f24477x = -2147483647L;
    }

    private int A(long j10, long j11) {
        long jC = C(j11);
        int i10 = 0;
        for (int i11 = 0; i11 < this.f24489b; i11++) {
            if (j10 == Long.MIN_VALUE || !a(i11, j10)) {
                u7.q qVarE = e(i11);
                if (z(qVarE, qVarE.f26247j, jC)) {
                    return i11;
                }
                i10 = i11;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.common.collect.u<com.google.common.collect.u<C0398a>> B(q.a[] aVarArr) {
        ArrayList arrayList = new ArrayList();
        for (q.a aVar : aVarArr) {
            if (aVar == null || aVar.f24597b.length <= 1) {
                arrayList.add(null);
            } else {
                com.google.common.collect.u.a aVarV = com.google.common.collect.u.v();
                aVarV.a(new C0398a(0L, 0L));
                arrayList.add(aVarV);
            }
        }
        long[][] jArrG = G(aVarArr);
        int[] iArr = new int[jArrG.length];
        long[] jArr = new long[jArrG.length];
        for (int i10 = 0; i10 < jArrG.length; i10++) {
            long[] jArr2 = jArrG[i10];
            jArr[i10] = jArr2.length == 0 ? 0L : jArr2[0];
        }
        y(arrayList, jArr);
        com.google.common.collect.u<Integer> uVarH = H(jArrG);
        for (int i11 = 0; i11 < uVarH.size(); i11++) {
            int iIntValue = uVarH.get(i11).intValue();
            int i12 = iArr[iIntValue] + 1;
            iArr[iIntValue] = i12;
            jArr[iIntValue] = jArrG[iIntValue][i12];
            y(arrayList, jArr);
        }
        for (int i13 = 0; i13 < aVarArr.length; i13++) {
            if (arrayList.get(i13) != null) {
                jArr[i13] = jArr[i13] * 2;
            }
        }
        y(arrayList, jArr);
        com.google.common.collect.u.a aVarV2 = com.google.common.collect.u.v();
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            com.google.common.collect.u.a aVar2 = (com.google.common.collect.u.a) arrayList.get(i14);
            aVarV2.a(aVar2 == null ? com.google.common.collect.u.H() : aVar2.m());
        }
        return aVarV2.m();
    }

    private long C(long j10) {
        long jI = I(j10);
        if (this.f24470q.isEmpty()) {
            return jI;
        }
        int i10 = 1;
        while (i10 < this.f24470q.size() - 1 && this.f24470q.get(i10).f24478a < jI) {
            i10++;
        }
        C0398a c0398a = this.f24470q.get(i10 - 1);
        C0398a c0398a2 = this.f24470q.get(i10);
        long j11 = c0398a.f24478a;
        float f10 = (jI - j11) / (c0398a2.f24478a - j11);
        long j12 = c0398a.f24479b;
        return j12 + ((long) (f10 * (c0398a2.f24479b - j12)));
    }

    private long D(List<? extends o8.m> list) {
        if (list.isEmpty()) {
            return -9223372036854775807L;
        }
        o8.m mVar = (o8.m) y.d(list);
        long j10 = mVar.f23174g;
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j11 = mVar.f23175h;
        if (j11 != -9223372036854775807L) {
            return j11 - j10;
        }
        return -9223372036854775807L;
    }

    private long F(o8.n[] nVarArr, List<? extends o8.m> list) {
        int i10 = this.f24473t;
        if (i10 < nVarArr.length && nVarArr[i10].next()) {
            o8.n nVar = nVarArr[this.f24473t];
            return nVar.b() - nVar.a();
        }
        for (o8.n nVar2 : nVarArr) {
            if (nVar2.next()) {
                return nVar2.b() - nVar2.a();
            }
        }
        return D(list);
    }

    private static long[][] G(q.a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length][];
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            q.a aVar = aVarArr[i10];
            if (aVar == null) {
                jArr[i10] = new long[0];
            } else {
                jArr[i10] = new long[aVar.f24597b.length];
                int i11 = 0;
                while (true) {
                    int[] iArr = aVar.f24597b;
                    if (i11 >= iArr.length) {
                        break;
                    }
                    long j10 = aVar.f24596a.a(iArr[i11]).f26247j;
                    long[] jArr2 = jArr[i10];
                    if (j10 == -1) {
                        j10 = 0;
                    }
                    jArr2[i11] = j10;
                    i11++;
                }
                Arrays.sort(jArr[i10]);
            }
        }
        return jArr;
    }

    private static com.google.common.collect.u<Integer> H(long[][] jArr) {
        g0 g0VarE = h0.c().a().e();
        for (int i10 = 0; i10 < jArr.length; i10++) {
            long[] jArr2 = jArr[i10];
            if (jArr2.length > 1) {
                int length = jArr2.length;
                double[] dArr = new double[length];
                int i11 = 0;
                while (true) {
                    long[] jArr3 = jArr[i10];
                    double dLog = 0.0d;
                    if (i11 >= jArr3.length) {
                        break;
                    }
                    long j10 = jArr3[i11];
                    if (j10 != -1) {
                        dLog = Math.log(j10);
                    }
                    dArr[i11] = dLog;
                    i11++;
                }
                int i12 = length - 1;
                double d10 = dArr[i12] - dArr[0];
                int i13 = 0;
                while (i13 < i12) {
                    double d11 = dArr[i13];
                    i13++;
                    g0VarE.put(Double.valueOf(d10 == 0.0d ? 1.0d : (((d11 + dArr[i13]) * 0.5d) - dArr[0]) / d10), Integer.valueOf(i10));
                }
            }
        }
        return com.google.common.collect.u.B(g0VarE.values());
    }

    private long I(long j10) {
        long jE = this.f24462i.e();
        this.f24477x = jE;
        long j11 = (long) (jE * this.f24468o);
        long jA = this.f24462i.a();
        if (jA == -9223372036854775807L || j10 == -9223372036854775807L) {
            return (long) (j11 / this.f24472s);
        }
        float f10 = j10;
        return (long) ((j11 * Math.max((f10 / this.f24472s) - jA, 0.0f)) / f10);
    }

    private long J(long j10, long j11) {
        if (j10 == -9223372036854775807L) {
            return this.f24463j;
        }
        if (j11 != -9223372036854775807L) {
            j10 -= j11;
        }
        return Math.min((long) (j10 * this.f24469p), this.f24463j);
    }

    private static void y(List<com.google.common.collect.u.a<C0398a>> list, long[] jArr) {
        long j10 = 0;
        for (long j11 : jArr) {
            j10 += j11;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            com.google.common.collect.u.a<C0398a> aVar = list.get(i10);
            if (aVar != null) {
                aVar.a(new C0398a(j10, jArr[i10]));
            }
        }
    }

    protected long E() {
        return this.f24465l;
    }

    protected boolean K(long j10, List<? extends o8.m> list) {
        long j11 = this.f24475v;
        return j11 == -9223372036854775807L || j10 - j11 >= 1000 || !(list.isEmpty() || ((o8.m) y.d(list)).equals(this.f24476w));
    }

    @Override // q8.q
    public int b() {
        return this.f24473t;
    }

    @Override // q8.c, q8.q
    public void d() {
        this.f24476w = null;
    }

    @Override // q8.c, q8.q
    public void h(float f10) {
        this.f24472s = f10;
    }

    @Override // q8.q
    public Object i() {
        return null;
    }

    @Override // q8.q
    public void l(long j10, long j11, long j12, List<? extends o8.m> list, o8.n[] nVarArr) {
        long jElapsedRealtime = this.f24471r.elapsedRealtime();
        long jF = F(nVarArr, list);
        int i10 = this.f24474u;
        if (i10 == 0) {
            this.f24474u = 1;
            this.f24473t = A(jElapsedRealtime, jF);
            return;
        }
        int i11 = this.f24473t;
        int iC = list.isEmpty() ? -1 : c(((o8.m) y.d(list)).f23171d);
        if (iC != -1) {
            i10 = ((o8.m) y.d(list)).f23172e;
            i11 = iC;
        }
        int iA = A(jElapsedRealtime, jF);
        if (iA != i11 && !a(i11, jElapsedRealtime)) {
            u7.q qVarE = e(i11);
            u7.q qVarE2 = e(iA);
            long J = J(j12, jF);
            int i12 = qVarE2.f26247j;
            int i13 = qVarE.f26247j;
            if ((i12 > i13 && j11 < J) || (i12 < i13 && j11 >= this.f24464k)) {
                iA = i11;
            }
        }
        if (iA != i11) {
            i10 = 3;
        }
        this.f24474u = i10;
        this.f24473t = iA;
    }

    @Override // q8.c, q8.q
    public void o() {
        this.f24475v = -9223372036854775807L;
        this.f24476w = null;
    }

    @Override // q8.c, q8.q
    public int p(long j10, List<? extends o8.m> list) {
        int i10;
        int i11;
        long jElapsedRealtime = this.f24471r.elapsedRealtime();
        if (!K(jElapsedRealtime, list)) {
            return list.size();
        }
        this.f24475v = jElapsedRealtime;
        this.f24476w = list.isEmpty() ? null : (o8.m) y.d(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long jL0 = l0.l0(list.get(size - 1).f23174g - j10, this.f24472s);
        long jE = E();
        if (jL0 < jE) {
            return size;
        }
        u7.q qVarE = e(A(jElapsedRealtime, D(list)));
        for (int i12 = 0; i12 < size; i12++) {
            o8.m mVar = list.get(i12);
            u7.q qVar = mVar.f23171d;
            if (l0.l0(mVar.f23174g - j10, this.f24472s) >= jE && qVar.f26247j < qVarE.f26247j && (i10 = qVar.f26260w) != -1 && i10 <= this.f24467n && (i11 = qVar.f26259v) != -1 && i11 <= this.f24466m && i10 < qVarE.f26260w) {
                return i12;
            }
        }
        return size;
    }

    @Override // q8.q
    public int t() {
        return this.f24474u;
    }

    protected boolean z(u7.q qVar, int i10, long j10) {
        return ((long) i10) <= j10;
    }
}
