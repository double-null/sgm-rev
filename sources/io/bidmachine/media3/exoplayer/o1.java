package io.bidmachine.media3.exoplayer;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: MediaPeriodQueue.java */
/* JADX INFO: loaded from: classes4.dex */
final class o1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c8.a f19319c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final x7.n f19320d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final l1.a f19321e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f19322f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f19323g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f19324h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ExoPlayer.c f19325i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private l1 f19326j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private l1 f19327k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private l1 f19328l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private l1 f19329m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private l1 f19330n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f19331o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Object f19332p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f19333q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u7.d0.b f19317a = new u7.d0.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u7.d0.c f19318b = new u7.d0.c();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private List<l1> f19334r = new ArrayList();

    public o1(c8.a aVar, x7.n nVar, l1.a aVar2, ExoPlayer.c cVar) {
        this.f19319c = aVar;
        this.f19320d = nVar;
        this.f19321e = aVar2;
        this.f19325i = cVar;
    }

    private boolean A(Object obj, u7.d0 d0Var) {
        int iC = d0Var.h(obj, this.f19317a).c();
        int iO = this.f19317a.o();
        return iC > 0 && this.f19317a.r(iO) && (iC > 1 || this.f19317a.f(iO) != Long.MIN_VALUE);
    }

    private boolean C(io.bidmachine.media3.exoplayer.source.r.b bVar) {
        return !bVar.b() && bVar.f19688e == -1;
    }

    private boolean D(u7.d0 d0Var, io.bidmachine.media3.exoplayer.source.r.b bVar, boolean z10) {
        int iB = d0Var.b(bVar.f19684a);
        return !d0Var.n(d0Var.f(iB, this.f19317a).f26020c, this.f19318b).f26043i && d0Var.r(iB, this.f19317a, this.f19318b, this.f19323g, this.f19324h) && z10;
    }

    private boolean E(u7.d0 d0Var, io.bidmachine.media3.exoplayer.source.r.b bVar) {
        if (C(bVar)) {
            return d0Var.n(d0Var.h(bVar.f19684a, this.f19317a).f26020c, this.f19318b).f26049o == d0Var.b(bVar.f19684a);
        }
        return false;
    }

    private static boolean H(u7.d0.b bVar) {
        int iC = bVar.c();
        if (iC == 0) {
            return false;
        }
        if ((iC == 1 && bVar.q(0)) || !bVar.r(bVar.o())) {
            return false;
        }
        long jI = 0;
        if (bVar.e(0L) != -1) {
            return false;
        }
        if (bVar.f26021d == 0) {
            return true;
        }
        int i10 = iC - (bVar.q(iC + (-1)) ? 2 : 1);
        for (int i11 = 0; i11 <= i10; i11++) {
            jI += bVar.i(i11);
        }
        return bVar.f26021d <= jI;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I(com.google.common.collect.u.a aVar, io.bidmachine.media3.exoplayer.source.r.b bVar) {
        this.f19319c.d0(aVar.m(), bVar);
    }

    private void K() {
        final com.google.common.collect.u.a aVarV = com.google.common.collect.u.v();
        for (l1 l1VarK = this.f19326j; l1VarK != null; l1VarK = l1VarK.k()) {
            aVarV.a(l1VarK.f19151h.f19165a);
        }
        l1 l1Var = this.f19327k;
        final io.bidmachine.media3.exoplayer.source.r.b bVar = l1Var == null ? null : l1Var.f19151h.f19165a;
        this.f19320d.i(new Runnable() { // from class: io.bidmachine.media3.exoplayer.n1
            @Override // java.lang.Runnable
            public final void run() {
                this.f19311a.I(aVarV, bVar);
            }
        });
    }

    private void M(List<l1> list) {
        for (int i10 = 0; i10 < this.f19334r.size(); i10++) {
            this.f19334r.get(i10).x();
        }
        this.f19334r = list;
        this.f19330n = null;
        J();
    }

    private l1 P(m1 m1Var) {
        for (int i10 = 0; i10 < this.f19334r.size(); i10++) {
            if (this.f19334r.get(i10).d(m1Var)) {
                return this.f19334r.remove(i10);
            }
        }
        return null;
    }

    private static io.bidmachine.media3.exoplayer.source.r.b Q(u7.d0 d0Var, Object obj, long j10, long j11, u7.d0.c cVar, u7.d0.b bVar) {
        d0Var.h(obj, bVar);
        d0Var.n(bVar.f26020c, cVar);
        Object objE = obj;
        for (int iB = d0Var.b(obj); H(bVar) && iB <= cVar.f26049o; iB++) {
            d0Var.g(iB, bVar, true);
            objE = x7.a.e(bVar.f26019b);
        }
        d0Var.h(objE, bVar);
        int iE = bVar.e(j10);
        return iE == -1 ? new io.bidmachine.media3.exoplayer.source.r.b(objE, j11, bVar.d(j10)) : new io.bidmachine.media3.exoplayer.source.r.b(objE, iE, bVar.k(iE), j11);
    }

    private long S(u7.d0 d0Var, Object obj) {
        int iB;
        int i10 = d0Var.h(obj, this.f19317a).f26020c;
        Object obj2 = this.f19332p;
        if (obj2 != null && (iB = d0Var.b(obj2)) != -1 && d0Var.f(iB, this.f19317a).f26020c == i10) {
            return this.f19333q;
        }
        for (l1 l1VarK = this.f19326j; l1VarK != null; l1VarK = l1VarK.k()) {
            if (l1VarK.f19145b.equals(obj)) {
                return l1VarK.f19151h.f19165a.f19687d;
            }
        }
        for (l1 l1VarK2 = this.f19326j; l1VarK2 != null; l1VarK2 = l1VarK2.k()) {
            int iB2 = d0Var.b(l1VarK2.f19145b);
            if (iB2 != -1 && d0Var.f(iB2, this.f19317a).f26020c == i10) {
                return l1VarK2.f19151h.f19165a.f19687d;
            }
        }
        long jT = T(obj);
        if (jT != -1) {
            return jT;
        }
        long j10 = this.f19322f;
        this.f19322f = 1 + j10;
        if (this.f19326j == null) {
            this.f19332p = obj;
            this.f19333q = j10;
        }
        return j10;
    }

    private long T(Object obj) {
        for (int i10 = 0; i10 < this.f19334r.size(); i10++) {
            l1 l1Var = this.f19334r.get(i10);
            if (l1Var.f19145b.equals(obj)) {
                return l1Var.f19151h.f19165a.f19687d;
            }
        }
        return -1L;
    }

    private int V(u7.d0 d0Var) {
        l1 l1VarK = this.f19326j;
        if (l1VarK == null) {
            return 0;
        }
        int iB = d0Var.b(l1VarK.f19145b);
        while (true) {
            iB = d0Var.d(iB, this.f19317a, this.f19318b, this.f19323g, this.f19324h);
            while (((l1) x7.a.e(l1VarK)).k() != null && !l1VarK.f19151h.f19172h) {
                l1VarK = l1VarK.k();
            }
            l1 l1VarK2 = l1VarK.k();
            if (iB == -1 || l1VarK2 == null || d0Var.b(l1VarK2.f19145b) != iB) {
                break;
            }
            l1VarK = l1VarK2;
        }
        int iO = O(l1VarK);
        l1VarK.f19151h = z(d0Var, l1VarK.f19151h);
        return iO;
    }

    static boolean e(long j10, long j11) {
        return j10 == -9223372036854775807L || j10 == j11;
    }

    private boolean f(m1 m1Var, m1 m1Var2) {
        return m1Var.f19166b == m1Var2.f19166b && m1Var.f19165a.equals(m1Var2.f19165a);
    }

    private Pair<Object, Long> i(u7.d0 d0Var, Object obj, long j10) {
        int iE = d0Var.e(d0Var.h(obj, this.f19317a).f26020c, this.f19323g, this.f19324h);
        if (iE != -1) {
            return d0Var.k(this.f19318b, this.f19317a, iE, -9223372036854775807L, j10);
        }
        return null;
    }

    private m1 j(e2 e2Var) {
        return o(e2Var.f18602a, e2Var.f18603b, e2Var.f18604c, e2Var.f18620s);
    }

    private m1 k(u7.d0 d0Var, l1 l1Var, long j10) {
        long j11;
        long j12;
        Object obj;
        long j13;
        long j14;
        long jT;
        m1 m1Var = l1Var.f19151h;
        int iD = d0Var.d(d0Var.b(m1Var.f19165a.f19684a), this.f19317a, this.f19318b, this.f19323g, this.f19324h);
        if (iD == -1) {
            return null;
        }
        int i10 = d0Var.g(iD, this.f19317a, true).f26020c;
        Object objE = x7.a.e(this.f19317a.f26019b);
        long j15 = m1Var.f19165a.f19687d;
        if (d0Var.n(i10, this.f19318b).f26048n == iD) {
            Pair<Object, Long> pairK = d0Var.k(this.f19318b, this.f19317a, i10, -9223372036854775807L, Math.max(0L, j10));
            if (pairK == null) {
                return null;
            }
            Object obj2 = pairK.first;
            long jLongValue = ((Long) pairK.second).longValue();
            l1 l1VarK = l1Var.k();
            if (l1VarK == null || !l1VarK.f19145b.equals(obj2)) {
                jT = T(obj2);
                if (jT == -1) {
                    jT = this.f19322f;
                    this.f19322f = 1 + jT;
                }
            } else {
                jT = l1VarK.f19151h.f19165a.f19687d;
            }
            j11 = jT;
            j12 = -9223372036854775807L;
            obj = obj2;
            j13 = jLongValue;
        } else {
            j11 = j15;
            j12 = 0;
            obj = objE;
            j13 = 0;
        }
        io.bidmachine.media3.exoplayer.source.r.b bVarQ = Q(d0Var, obj, j13, j11, this.f19318b, this.f19317a);
        if (j12 == -9223372036854775807L || m1Var.f19167c == -9223372036854775807L) {
            j14 = j13;
        } else {
            boolean zA = A(m1Var.f19165a.f19684a, d0Var);
            if (bVarQ.b() && zA) {
                j12 = m1Var.f19167c;
            } else if (zA) {
                j14 = m1Var.f19167c;
            }
            j14 = j13;
        }
        return o(d0Var, bVarQ, j12, j14);
    }

    private m1 l(u7.d0 d0Var, l1 l1Var, long j10) {
        m1 m1Var = l1Var.f19151h;
        long jM = (l1Var.m() + m1Var.f19169e) - j10;
        return m1Var.f19172h ? k(d0Var, l1Var, jM) : m(d0Var, l1Var, jM);
    }

    private m1 m(u7.d0 d0Var, l1 l1Var, long j10) {
        m1 m1Var = l1Var.f19151h;
        io.bidmachine.media3.exoplayer.source.r.b bVar = m1Var.f19165a;
        d0Var.h(bVar.f19684a, this.f19317a);
        boolean z10 = m1Var.f19171g;
        if (!bVar.b()) {
            int i10 = bVar.f19688e;
            if (i10 != -1 && this.f19317a.q(i10)) {
                return k(d0Var, l1Var, j10);
            }
            int iK = this.f19317a.k(bVar.f19688e);
            boolean z11 = this.f19317a.r(bVar.f19688e) && this.f19317a.h(bVar.f19688e, iK) == 3;
            if (iK == this.f19317a.a(bVar.f19688e) || z11) {
                return q(d0Var, bVar.f19684a, s(d0Var, bVar.f19684a, bVar.f19688e), m1Var.f19169e, bVar.f19687d, false);
            }
            return p(d0Var, bVar.f19684a, bVar.f19688e, iK, m1Var.f19169e, bVar.f19687d, z10);
        }
        int i11 = bVar.f19685b;
        int iA = this.f19317a.a(i11);
        if (iA == -1) {
            return null;
        }
        int iL = this.f19317a.l(i11, bVar.f19686c);
        if (iL < iA) {
            return p(d0Var, bVar.f19684a, i11, iL, m1Var.f19167c, bVar.f19687d, z10);
        }
        long jLongValue = m1Var.f19167c;
        if (jLongValue == -9223372036854775807L) {
            u7.d0.c cVar = this.f19318b;
            u7.d0.b bVar2 = this.f19317a;
            Pair<Object, Long> pairK = d0Var.k(cVar, bVar2, bVar2.f26020c, -9223372036854775807L, Math.max(0L, j10));
            if (pairK == null) {
                return null;
            }
            jLongValue = ((Long) pairK.second).longValue();
        }
        return q(d0Var, bVar.f19684a, Math.max(s(d0Var, bVar.f19684a, bVar.f19685b), jLongValue), m1Var.f19167c, bVar.f19687d, z10);
    }

    private m1 o(u7.d0 d0Var, io.bidmachine.media3.exoplayer.source.r.b bVar, long j10, long j11) {
        d0Var.h(bVar.f19684a, this.f19317a);
        return bVar.b() ? p(d0Var, bVar.f19684a, bVar.f19685b, bVar.f19686c, j10, bVar.f19687d, false) : q(d0Var, bVar.f19684a, j11, j10, bVar.f19687d, false);
    }

    private m1 p(u7.d0 d0Var, Object obj, int i10, int i11, long j10, long j11, boolean z10) {
        io.bidmachine.media3.exoplayer.source.r.b bVar = new io.bidmachine.media3.exoplayer.source.r.b(obj, i10, i11, j11);
        long jB = d0Var.h(bVar.f19684a, this.f19317a).b(bVar.f19685b, bVar.f19686c);
        long jG = i11 == this.f19317a.k(i10) ? this.f19317a.g() : 0L;
        return new m1(bVar, (jB == -9223372036854775807L || jG < jB) ? jG : Math.max(0L, jB - 1), j10, -9223372036854775807L, jB, z10, this.f19317a.r(bVar.f19685b), false, false, false);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005a  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a8  */
    private m1 q(u7.d0 d0Var, Object obj, long j10, long j11, long j12, boolean z10) {
        boolean z11;
        long j13;
        long jF;
        long j14;
        long jMax = j10;
        d0Var.h(obj, this.f19317a);
        int iD = this.f19317a.d(jMax);
        int i10 = 1;
        boolean z12 = iD != -1 && this.f19317a.q(iD);
        if (iD == -1) {
            if (this.f19317a.c() > 0) {
                u7.d0.b bVar = this.f19317a;
                if (bVar.r(bVar.o())) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            } else {
                z11 = false;
            }
        } else if (this.f19317a.r(iD)) {
            long jF2 = this.f19317a.f(iD);
            u7.d0.b bVar2 = this.f19317a;
            if (jF2 == bVar2.f26021d && bVar2.p(iD)) {
                z11 = true;
                iD = -1;
            } else {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        io.bidmachine.media3.exoplayer.source.r.b bVar3 = new io.bidmachine.media3.exoplayer.source.r.b(obj, j12, iD);
        boolean zC = C(bVar3);
        boolean zE = E(d0Var, bVar3);
        boolean zD = D(d0Var, bVar3, zC);
        boolean z13 = (iD == -1 || !this.f19317a.r(iD) || z12) ? false : true;
        if (iD == -1 || z12) {
            if (z11) {
                jF = this.f19317a.f26021d;
            } else {
                j13 = -9223372036854775807L;
            }
            if (j13 != -9223372036854775807L || j13 == Long.MIN_VALUE) {
                j14 = this.f19317a.f26021d;
            } else {
                j14 = j13;
            }
            if (j14 != -9223372036854775807L && jMax >= j14) {
                if (!zD && z11) {
                    i10 = 0;
                }
                jMax = Math.max(0L, j14 - ((long) i10));
            }
            return new m1(bVar3, jMax, j11, j13, j14, z10, z13, zC, zE, zD);
        }
        jF = this.f19317a.f(iD);
        j13 = jF;
        if (j13 != -9223372036854775807L) {
            j14 = this.f19317a.f26021d;
        } else {
            j14 = this.f19317a.f26021d;
        }
        if (j14 != -9223372036854775807L) {
            if (!zD) {
                i10 = 0;
            }
            jMax = Math.max(0L, j14 - ((long) i10));
        }
        return new m1(bVar3, jMax, j11, j13, j14, z10, z13, zC, zE, zD);
    }

    private m1 r(u7.d0 d0Var, Object obj, long j10, long j11) {
        io.bidmachine.media3.exoplayer.source.r.b bVarQ = Q(d0Var, obj, j10, j11, this.f19318b, this.f19317a);
        return bVarQ.b() ? p(d0Var, bVarQ.f19684a, bVarQ.f19685b, bVarQ.f19686c, j10, bVarQ.f19687d, false) : q(d0Var, bVarQ.f19684a, j10, -9223372036854775807L, bVarQ.f19687d, false);
    }

    private long s(u7.d0 d0Var, Object obj, int i10) {
        d0Var.h(obj, this.f19317a);
        long jF = this.f19317a.f(i10);
        return jF == Long.MIN_VALUE ? this.f19317a.f26021d : jF + this.f19317a.i(i10);
    }

    public void B(u7.d0 d0Var) {
        l1 l1Var;
        if (this.f19325i.f18099a == -9223372036854775807L || (l1Var = this.f19329m) == null) {
            N();
            return;
        }
        ArrayList arrayList = new ArrayList();
        Pair<Object, Long> pairI = i(d0Var, l1Var.f19151h.f19165a.f19684a, 0L);
        if (pairI != null && !d0Var.n(d0Var.h(pairI.first, this.f19317a).f26020c, this.f19318b).f()) {
            long jT = T(pairI.first);
            if (jT == -1) {
                jT = this.f19322f;
                this.f19322f = 1 + jT;
            }
            m1 m1VarR = r(d0Var, pairI.first, ((Long) pairI.second).longValue(), jT);
            l1 l1VarP = P(m1VarR);
            if (l1VarP == null) {
                l1VarP = this.f19321e.a(m1VarR, (l1Var.m() + l1Var.f19151h.f19169e) - m1VarR.f19166b);
            }
            arrayList.add(l1VarP);
        }
        M(arrayList);
    }

    public boolean F(io.bidmachine.media3.exoplayer.source.q qVar) {
        l1 l1Var = this.f19329m;
        return l1Var != null && l1Var.f19144a == qVar;
    }

    public boolean G(io.bidmachine.media3.exoplayer.source.q qVar) {
        l1 l1Var = this.f19330n;
        return l1Var != null && l1Var.f19144a == qVar;
    }

    public void J() {
        l1 l1Var = this.f19330n;
        if (l1Var == null || l1Var.t()) {
            this.f19330n = null;
            for (int i10 = 0; i10 < this.f19334r.size(); i10++) {
                l1 l1Var2 = this.f19334r.get(i10);
                if (!l1Var2.t()) {
                    this.f19330n = l1Var2;
                    return;
                }
            }
        }
    }

    public void L(long j10) {
        l1 l1Var = this.f19329m;
        if (l1Var != null) {
            l1Var.w(j10);
        }
    }

    public void N() {
        if (this.f19334r.isEmpty()) {
            return;
        }
        M(new ArrayList());
    }

    public int O(l1 l1Var) {
        x7.a.i(l1Var);
        int i10 = 0;
        if (l1Var.equals(this.f19329m)) {
            return 0;
        }
        this.f19329m = l1Var;
        while (l1Var.k() != null) {
            l1Var = (l1) x7.a.e(l1Var.k());
            if (l1Var == this.f19327k) {
                l1 l1Var2 = this.f19326j;
                this.f19327k = l1Var2;
                this.f19328l = l1Var2;
                i10 = i10 | 1 | 2;
            }
            if (l1Var == this.f19328l) {
                this.f19328l = this.f19327k;
                i10 |= 2;
            }
            l1Var.x();
            this.f19331o--;
        }
        ((l1) x7.a.e(this.f19329m)).A(null);
        K();
        return i10;
    }

    public io.bidmachine.media3.exoplayer.source.r.b R(u7.d0 d0Var, Object obj, long j10) {
        long jS = S(d0Var, obj);
        d0Var.h(obj, this.f19317a);
        d0Var.n(this.f19317a.f26020c, this.f19318b);
        boolean z10 = false;
        for (int iB = d0Var.b(obj); iB >= this.f19318b.f26048n; iB--) {
            d0Var.g(iB, this.f19317a, true);
            boolean z11 = this.f19317a.c() > 0;
            z10 |= z11;
            u7.d0.b bVar = this.f19317a;
            if (bVar.e(bVar.f26021d) != -1) {
                obj = x7.a.e(this.f19317a.f26019b);
            }
            if (z10 && (!z11 || this.f19317a.f26021d != 0)) {
                break;
            }
        }
        return Q(d0Var, obj, j10, jS, this.f19318b, this.f19317a);
    }

    public boolean U() {
        l1 l1Var = this.f19329m;
        return l1Var == null || (!l1Var.f19151h.f19174j && l1Var.s() && this.f19329m.f19151h.f19169e != -9223372036854775807L && this.f19331o < 100);
    }

    public void W(u7.d0 d0Var, ExoPlayer.c cVar) {
        this.f19325i = cVar;
        B(d0Var);
    }

    public int X(u7.d0 d0Var, long j10, long j11, long j12) {
        m1 m1VarZ;
        l1 l1VarK = this.f19326j;
        l1 l1Var = null;
        while (true) {
            boolean z10 = false;
            if (l1VarK == null) {
                return 0;
            }
            m1 m1Var = l1VarK.f19151h;
            if (l1Var == null) {
                m1VarZ = z(d0Var, m1Var);
            } else {
                m1 m1VarL = l(d0Var, l1Var, j10);
                if (m1VarL == null || !f(m1Var, m1VarL)) {
                    return O(l1Var);
                }
                m1VarZ = m1VarL;
            }
            l1VarK.f19151h = m1VarZ.a(m1Var.f19167c);
            if (!e(m1Var.f19169e, m1VarZ.f19169e)) {
                l1VarK.E();
                long j13 = m1VarZ.f19169e;
                long jD = j13 == -9223372036854775807L ? Long.MAX_VALUE : l1VarK.D(j13);
                int i10 = (l1VarK != this.f19327k || l1VarK.f19151h.f19171g || (j11 != Long.MIN_VALUE && j11 < jD)) ? 0 : 1;
                if (l1VarK == this.f19328l && (j12 == Long.MIN_VALUE || j12 >= jD)) {
                    z10 = true;
                }
                int iO = O(l1VarK);
                if (iO != 0) {
                    return iO;
                }
                return z10 ? i10 | 2 : i10;
            }
            l1Var = l1VarK;
            l1VarK = l1VarK.k();
        }
    }

    public int Y(u7.d0 d0Var, int i10) {
        this.f19323g = i10;
        return V(d0Var);
    }

    public int Z(u7.d0 d0Var, boolean z10) {
        this.f19324h = z10;
        return V(d0Var);
    }

    public l1 b() {
        l1 l1Var = this.f19326j;
        if (l1Var == null) {
            return null;
        }
        if (l1Var == this.f19327k) {
            this.f19327k = l1Var.k();
        }
        l1 l1Var2 = this.f19326j;
        if (l1Var2 == this.f19328l) {
            this.f19328l = l1Var2.k();
        }
        this.f19326j.x();
        int i10 = this.f19331o - 1;
        this.f19331o = i10;
        if (i10 == 0) {
            this.f19329m = null;
            l1 l1Var3 = this.f19326j;
            this.f19332p = l1Var3.f19145b;
            this.f19333q = l1Var3.f19151h.f19165a.f19687d;
        }
        this.f19326j = this.f19326j.k();
        K();
        return this.f19326j;
    }

    public l1 c() {
        this.f19328l = ((l1) x7.a.i(this.f19328l)).k();
        K();
        return (l1) x7.a.i(this.f19328l);
    }

    public l1 d() {
        l1 l1Var = this.f19328l;
        l1 l1Var2 = this.f19327k;
        if (l1Var == l1Var2) {
            this.f19328l = ((l1) x7.a.i(l1Var2)).k();
        }
        this.f19327k = ((l1) x7.a.i(this.f19327k)).k();
        K();
        return (l1) x7.a.i(this.f19327k);
    }

    public void g() {
        if (this.f19331o == 0) {
            return;
        }
        l1 l1VarK = (l1) x7.a.i(this.f19326j);
        this.f19332p = l1VarK.f19145b;
        this.f19333q = l1VarK.f19151h.f19165a.f19687d;
        while (l1VarK != null) {
            l1VarK.x();
            l1VarK = l1VarK.k();
        }
        this.f19326j = null;
        this.f19329m = null;
        this.f19327k = null;
        this.f19328l = null;
        this.f19331o = 0;
        K();
    }

    public l1 h(m1 m1Var) {
        l1 l1Var = this.f19329m;
        long jM = l1Var == null ? 1000000000000L : (l1Var.m() + this.f19329m.f19151h.f19169e) - m1Var.f19166b;
        l1 l1VarP = P(m1Var);
        if (l1VarP == null) {
            l1VarP = this.f19321e.a(m1Var, jM);
        } else {
            l1VarP.f19151h = m1Var;
            l1VarP.B(jM);
        }
        l1 l1Var2 = this.f19329m;
        if (l1Var2 != null) {
            l1Var2.A(l1VarP);
        } else {
            this.f19326j = l1VarP;
            this.f19327k = l1VarP;
            this.f19328l = l1VarP;
        }
        this.f19332p = null;
        this.f19329m = l1VarP;
        this.f19331o++;
        K();
        return l1VarP;
    }

    public l1 n() {
        return this.f19329m;
    }

    public m1 t(long j10, e2 e2Var) {
        l1 l1Var = this.f19329m;
        return l1Var == null ? j(e2Var) : l(e2Var.f18602a, l1Var, j10);
    }

    public l1 u() {
        return this.f19326j;
    }

    public l1 v(io.bidmachine.media3.exoplayer.source.q qVar) {
        for (int i10 = 0; i10 < this.f19334r.size(); i10++) {
            l1 l1Var = this.f19334r.get(i10);
            if (l1Var.f19144a == qVar) {
                return l1Var;
            }
        }
        return null;
    }

    public l1 w() {
        return this.f19330n;
    }

    public l1 x() {
        return this.f19328l;
    }

    public l1 y() {
        return this.f19327k;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0062  */
    /* JADX WARN: Code duplicated, block: B:24:0x006c  */
    /* JADX WARN: Code duplicated, block: B:29:0x007a  */
    public m1 z(u7.d0 d0Var, m1 m1Var) {
        long j10;
        long j11;
        int i10;
        boolean zR;
        int i11;
        io.bidmachine.media3.exoplayer.source.r.b bVar = m1Var.f19165a;
        boolean zC = C(bVar);
        boolean zE = E(d0Var, bVar);
        boolean zD = D(d0Var, bVar, zC);
        d0Var.h(m1Var.f19165a.f19684a, this.f19317a);
        long jF = (bVar.b() || (i11 = bVar.f19688e) == -1) ? -9223372036854775807L : this.f19317a.f(i11);
        if (!bVar.b()) {
            if (jF == -9223372036854775807L || jF == Long.MIN_VALUE) {
                j10 = this.f19317a.j();
            } else {
                j11 = jF;
            }
            if (bVar.b()) {
                zR = this.f19317a.r(bVar.f19685b);
            } else {
                i10 = bVar.f19688e;
                if (i10 == -1 && this.f19317a.r(i10)) {
                    zR = true;
                } else {
                    zR = false;
                }
            }
            return new m1(bVar, m1Var.f19166b, m1Var.f19167c, jF, j11, m1Var.f19170f, zR, zC, zE, zD);
        }
        j10 = this.f19317a.b(bVar.f19685b, bVar.f19686c);
        j11 = j10;
        if (bVar.b()) {
            zR = this.f19317a.r(bVar.f19685b);
        } else {
            i10 = bVar.f19688e;
            if (i10 == -1) {
                zR = false;
            } else {
                zR = false;
            }
        }
        return new m1(bVar, m1Var.f19166b, m1Var.f19167c, jF, j11, m1Var.f19170f, zR, zC, zE, zD);
    }
}
