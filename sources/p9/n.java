package p9;

import io.bidmachine.media3.common.ParserException;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import v8.b0;
import v8.i0;
import v8.j0;
import v8.k0;
import v8.n0;
import v8.o0;
import v8.p0;
import x7.a0;
import x7.l0;

/* JADX INFO: compiled from: Mp4Extractor.java */
/* JADX INFO: loaded from: classes4.dex */
public final class n implements v8.p, j0 {

    @Deprecated
    public static final v8.u G = new v8.u() { // from class: p9.m
        @Override // v8.u
        public final v8.p[] g() {
            return n.z();
        }
    };
    private a[] A;
    private long[][] B;
    private int C;
    private long D;
    private int E;
    private k9.a F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s9.r.a f23623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f23624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a0 f23625c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a0 f23626d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a0 f23627e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final a0 f23628f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ArrayDeque<y7.c.b> f23629g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final q f23630h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List<u7.v.a> f23631i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.google.common.collect.u<n0> f23632j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f23633k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f23634l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f23635m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f23636n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private a0 f23637o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f23638p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f23639q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f23640r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f23641s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f23642t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f23643u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f23644v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f23645w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f23646x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f23647y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private v8.r f23648z;

    /* JADX INFO: compiled from: Mp4Extractor.java */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final t f23649a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final w f23650b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final o0 f23651c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final p0 f23652d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f23653e;

        public a(t tVar, w wVar, o0 o0Var) {
            this.f23649a = tVar;
            this.f23650b = wVar;
            this.f23651c = o0Var;
            this.f23652d = "audio/true-hd".equals(tVar.f23674g.f26252o) ? new p0() : null;
        }
    }

    @Deprecated
    public n() {
        this(s9.r.a.f25343a, 16);
    }

    private static long A(w wVar, long j10, long j11) {
        int iW = w(wVar, j10);
        return iW == -1 ? j11 : Math.min(wVar.f23705c[iW], j11);
    }

    private void B(u7.v vVar) {
        y7.a aVarA = j.a(vVar, "auxiliary.tracks.interleaved");
        if (aVarA == null || aVarA.f28680b[0] != 0) {
            return;
        }
        this.f23647y = this.f23645w + 16;
    }

    private void C(v8.q qVar) throws IOException {
        this.f23627e.S(8);
        qVar.n(this.f23627e.e(), 0, 8);
        b.f(this.f23627e);
        qVar.k(this.f23627e.f());
        qVar.d();
    }

    private void D(long j10) throws ParserException {
        while (!this.f23629g.isEmpty() && this.f23629g.peek().f28685b == j10) {
            y7.c.b bVarPop = this.f23629g.pop();
            if (bVarPop.f28684a == 1836019574) {
                G(bVarPop);
                this.f23629g.clear();
                if (!this.f23644v) {
                    this.f23633k = 2;
                }
            } else if (!this.f23629g.isEmpty()) {
                this.f23629g.peek().b(bVarPop);
            }
        }
        if (this.f23633k != 2) {
            s();
        }
    }

    private void E() {
        if (this.E != 2 || (this.f23624b & 2) == 0) {
            return;
        }
        o0 o0VarE = this.f23648z.e(0, 4);
        k9.a aVar = this.F;
        o0VarE.a(new u7.q.b().n0(aVar == null ? null : new u7.v(aVar)).N());
        this.f23648z.r();
        this.f23648z.h(new j0.b(-9223372036854775807L));
    }

    private static int F(a0 a0Var) {
        a0Var.W(8);
        int iO = o(a0Var.q());
        if (iO != 0) {
            return iO;
        }
        a0Var.X(4);
        while (a0Var.a() > 0) {
            int iO2 = o(a0Var.q());
            if (iO2 != 0) {
                return iO2;
            }
        }
        return 0;
    }

    private void G(y7.c.b bVar) throws ParserException {
        List<Integer> list;
        u7.v vVar;
        u7.v vVar2;
        long jMax;
        char c10;
        u7.v vVar3;
        y7.c.b bVarD = bVar.d(1835365473);
        List<Integer> arrayList = new ArrayList<>();
        if (bVarD != null) {
            u7.v vVarT = b.t(bVarD);
            if (this.f23646x) {
                x7.a.i(vVarT);
                B(vVarT);
                arrayList = t(vVarT);
            } else if (O(vVarT)) {
                this.f23644v = true;
                return;
            }
            vVar = vVarT;
            list = arrayList;
        } else {
            list = arrayList;
            vVar = null;
        }
        ArrayList arrayList2 = new ArrayList();
        boolean z10 = this.E == 1;
        b0 b0Var = new b0();
        y7.c.C0487c c0487cE = bVar.e(1969517665);
        if (c0487cE != null) {
            u7.v vVarH = b.H(c0487cE);
            b0Var.c(vVarH);
            vVar2 = vVarH;
        } else {
            vVar2 = null;
        }
        u7.v vVar4 = new u7.v(b.v(((y7.c.C0487c) x7.a.e(bVar.e(1836476516))).f28688b));
        List<w> listG = b.G(bVar, b0Var, -9223372036854775807L, null, (this.f23624b & 1) != 0, z10, new com.google.common.base.g() { // from class: p9.l
            @Override // com.google.common.base.g
            public final Object apply(Object obj) {
                return n.y((t) obj);
            }
        });
        char c11 = 2;
        if (this.f23646x) {
            x7.a.h(list.size() == listG.size(), String.format(Locale.US, "The number of auxiliary track types from metadata (%d) is not same as the number of auxiliary tracks (%d)", Integer.valueOf(list.size()), Integer.valueOf(listG.size())));
        }
        String strA = k.a(listG);
        u7.v vVar5 = vVar;
        int i10 = 0;
        int i11 = 0;
        int size = -1;
        long j10 = -9223372036854775807L;
        while (i10 < listG.size()) {
            w wVar = listG.get(i10);
            if (wVar.f23704b == 0) {
                jMax = j10;
                vVar3 = vVar5;
                c10 = c11;
            } else {
                t tVar = wVar.f23703a;
                int i12 = i11 + 1;
                a aVar = new a(tVar, wVar, this.f23648z.e(i11, tVar.f23669b));
                long j11 = tVar.f23672e;
                if (j11 == -9223372036854775807L) {
                    j11 = wVar.f23710h;
                }
                aVar.f23651c.g(j11);
                jMax = Math.max(j10, j11);
                int i13 = "audio/true-hd".equals(tVar.f23674g.f26252o) ? wVar.f23707e * 16 : wVar.f23707e + 30;
                u7.q.b bVarB = tVar.f23674g.b();
                bVarB.k0(i13);
                if (tVar.f23669b == 2) {
                    int i14 = tVar.f23674g.f26243f;
                    if ((this.f23624b & 8) != 0) {
                        i14 |= size == -1 ? 1 : 2;
                    }
                    if (this.f23646x) {
                        i14 |= 32768;
                        bVarB.P(list.get(i10).intValue());
                    }
                    bVarB.s0(i14);
                }
                j.l(tVar.f23669b, b0Var, bVarB);
                int i15 = tVar.f23669b;
                u7.v vVar6 = tVar.f23674g.f26249l;
                u7.v[] vVarArr = new u7.v[3];
                vVarArr[0] = this.f23631i.isEmpty() ? null : new u7.v(this.f23631i);
                vVarArr[1] = vVar2;
                c10 = 2;
                vVarArr[2] = vVar4;
                vVar3 = vVar5;
                j.m(i15, vVar3, bVarB, vVar6, vVarArr);
                bVarB.U(strA);
                aVar.f23651c.a(bVarB.N());
                if (tVar.f23669b == 2 && size == -1) {
                    size = arrayList2.size();
                }
                arrayList2.add(aVar);
                i11 = i12;
            }
            i10++;
            c11 = c10;
            vVar5 = vVar3;
            listG = listG;
            j10 = jMax;
        }
        this.C = size;
        this.D = j10;
        a[] aVarArr = (a[]) arrayList2.toArray(new a[0]);
        this.A = aVarArr;
        this.B = p(aVarArr);
        this.f23648z.r();
        this.f23648z.h(this);
    }

    private void H(long j10) {
        if (this.f23634l == 1836086884) {
            int i10 = this.f23636n;
            this.F = new k9.a(0L, j10, -9223372036854775807L, j10 + ((long) i10), this.f23635m - ((long) i10));
        }
    }

    private boolean I(v8.q qVar) throws IOException {
        y7.c.b bVarPeek;
        if (this.f23636n == 0) {
            if (!qVar.e(this.f23628f.e(), 0, 8, true)) {
                E();
                return false;
            }
            this.f23636n = 8;
            this.f23628f.W(0);
            this.f23635m = this.f23628f.J();
            this.f23634l = this.f23628f.q();
        }
        long j10 = this.f23635m;
        if (j10 == 1) {
            qVar.readFully(this.f23628f.e(), 8, 8);
            this.f23636n += 8;
            this.f23635m = this.f23628f.O();
        } else if (j10 == 0) {
            long length = qVar.getLength();
            if (length == -1 && (bVarPeek = this.f23629g.peek()) != null) {
                length = bVarPeek.f28685b;
            }
            if (length != -1) {
                this.f23635m = (length - qVar.getPosition()) + ((long) this.f23636n);
            }
        }
        if (this.f23635m < this.f23636n) {
            throw ParserException.f("Atom size less than header length (unsupported).");
        }
        if (M(this.f23634l)) {
            long position = qVar.getPosition();
            long j11 = this.f23635m;
            int i10 = this.f23636n;
            long j12 = (position + j11) - ((long) i10);
            if (j11 != i10 && this.f23634l == 1835365473) {
                C(qVar);
            }
            this.f23629g.push(new y7.c.b(this.f23634l, j12));
            if (this.f23635m == this.f23636n) {
                D(j12);
            } else {
                s();
            }
        } else if (N(this.f23634l)) {
            x7.a.g(this.f23636n == 8);
            x7.a.g(this.f23635m <= 2147483647L);
            a0 a0Var = new a0((int) this.f23635m);
            System.arraycopy(this.f23628f.e(), 0, a0Var.e(), 0, 8);
            this.f23637o = a0Var;
            this.f23633k = 1;
        } else {
            H(qVar.getPosition() - ((long) this.f23636n));
            this.f23637o = null;
            this.f23633k = 1;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006f  */
    private boolean J(v8.q qVar, i0 i0Var) throws IOException {
        boolean z10;
        long j10 = this.f23635m - ((long) this.f23636n);
        long position = qVar.getPosition() + j10;
        a0 a0Var = this.f23637o;
        if (a0Var == null) {
            if (!this.f23643u && this.f23634l == 1835295092) {
                this.E = 1;
            }
            if (j10 < 262144) {
                qVar.k((int) j10);
            } else {
                i0Var.f27344a = qVar.getPosition() + j10;
                z10 = true;
            }
            D(position);
            if (this.f23644v) {
                this.f23646x = true;
                i0Var.f27344a = this.f23645w;
                this.f23644v = false;
                z10 = true;
            }
            return (z10 || this.f23633k == 2) ? false : true;
        }
        qVar.readFully(a0Var.e(), this.f23636n, (int) j10);
        if (this.f23634l == 1718909296) {
            this.f23643u = true;
            this.E = F(a0Var);
        } else if (!this.f23629g.isEmpty()) {
            this.f23629g.peek().c(new y7.c.C0487c(this.f23634l, a0Var));
        }
        z10 = false;
        D(position);
        if (this.f23644v) {
            this.f23646x = true;
            i0Var.f27344a = this.f23645w;
            this.f23644v = false;
            z10 = true;
        }
        if (z10) {
        }
    }

    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [boolean, int] */
    private int K(v8.q qVar, i0 i0Var) throws IOException {
        o0.a aVar;
        ?? r10;
        boolean z10;
        int iO;
        long position = qVar.getPosition();
        if (this.f23638p == -1) {
            int iX = x(position);
            this.f23638p = iX;
            if (iX == -1) {
                return -1;
            }
        }
        a aVar2 = this.A[this.f23638p];
        o0 o0Var = aVar2.f23651c;
        int i10 = aVar2.f23653e;
        w wVar = aVar2.f23650b;
        long j10 = wVar.f23705c[i10] + this.f23647y;
        int i11 = wVar.f23706d[i10];
        p0 p0Var = aVar2.f23652d;
        long j11 = (j10 - position) + ((long) this.f23639q);
        if (j11 < 0 || j11 >= 262144) {
            i0Var.f27344a = j10;
            return 1;
        }
        if (aVar2.f23649a.f23675h == 1) {
            j11 += 8;
            i11 -= 8;
        }
        qVar.k((int) j11);
        if (!q(aVar2.f23649a.f23674g)) {
            this.f23642t = true;
        }
        t tVar = aVar2.f23649a;
        if (tVar.f23678k == 0) {
            aVar = null;
            if ("audio/ac4".equals(tVar.f23674g.f26252o)) {
                if (this.f23640r == 0) {
                    v8.c.a(i11, this.f23627e);
                    o0Var.b(this.f23627e, 7);
                    this.f23640r += 7;
                }
                i11 += 7;
            } else if (p0Var != null) {
                p0Var.d(qVar);
            }
            while (true) {
                int i12 = this.f23640r;
                if (i12 >= i11) {
                    break;
                }
                int iC = o0Var.c(qVar, i11 - i12, false);
                this.f23639q += iC;
                this.f23640r += iC;
                this.f23641s -= iC;
            }
        } else {
            byte[] bArrE = this.f23626d.e();
            bArrE[0] = 0;
            bArrE[1] = 0;
            bArrE[2] = 0;
            int i13 = 4 - aVar2.f23649a.f23678k;
            i11 += i13;
            while (this.f23640r < i11) {
                int i14 = this.f23641s;
                if (i14 == 0) {
                    t tVar2 = aVar2.f23649a;
                    int i15 = tVar2.f23678k;
                    if (this.f23642t || y7.f.o(tVar2.f23674g) + i15 > aVar2.f23650b.f23706d[i10] - this.f23639q) {
                        iO = 0;
                    } else {
                        iO = y7.f.o(aVar2.f23649a.f23674g);
                        i15 = aVar2.f23649a.f23678k + iO;
                    }
                    qVar.readFully(bArrE, i13, i15);
                    this.f23639q += i15;
                    this.f23626d.W(0);
                    int iQ = this.f23626d.q();
                    if (iQ < 0) {
                        throw ParserException.b("Invalid NAL length", null);
                    }
                    this.f23641s = iQ - iO;
                    this.f23625c.W(0);
                    o0Var.b(this.f23625c, 4);
                    this.f23640r += 4;
                    if (iO > 0) {
                        o0Var.b(this.f23626d, iO);
                        this.f23640r += iO;
                        if (y7.f.k(bArrE, 4, iO, aVar2.f23649a.f23674g)) {
                            this.f23642t = true;
                        }
                    }
                } else {
                    int iC2 = o0Var.c(qVar, i14, false);
                    this.f23639q += iC2;
                    this.f23640r += iC2;
                    this.f23641s -= iC2;
                }
            }
            aVar = null;
        }
        int i16 = i11;
        w wVar2 = aVar2.f23650b;
        long j12 = wVar2.f23708f[i10];
        int i17 = wVar2.f23709g[i10];
        if (!this.f23642t) {
            i17 |= 67108864;
        }
        if (p0Var != null) {
            int i18 = i17;
            o0.a aVar3 = aVar;
            z10 = false;
            p0Var.c(o0Var, j12, i18, i16, 0, null);
            if (i10 + 1 == aVar2.f23650b.f23704b) {
                r10 = z10;
                p0Var.a(o0Var, aVar3);
                r10 = z10;
            }
        } else {
            r10 = 0;
            o0Var.f(j12, i17, i16, 0, null);
        }
        r10 = z10;
        aVar2.f23653e++;
        this.f23638p = -1;
        this.f23639q = r10;
        this.f23640r = r10;
        this.f23641s = r10;
        this.f23642t = r10;
        return r10;
    }

    private int L(v8.q qVar, i0 i0Var) throws IOException {
        int iC = this.f23630h.c(qVar, i0Var, this.f23631i);
        if (iC == 1 && i0Var.f27344a == 0) {
            s();
        }
        return iC;
    }

    private static boolean M(int i10) {
        return i10 == 1836019574 || i10 == 1953653099 || i10 == 1835297121 || i10 == 1835626086 || i10 == 1937007212 || i10 == 1701082227 || i10 == 1835365473 || i10 == 1635284069;
    }

    private static boolean N(int i10) {
        return i10 == 1835296868 || i10 == 1836476516 || i10 == 1751411826 || i10 == 1937011556 || i10 == 1937011827 || i10 == 1937011571 || i10 == 1668576371 || i10 == 1701606260 || i10 == 1937011555 || i10 == 1937011578 || i10 == 1937013298 || i10 == 1937007471 || i10 == 1668232756 || i10 == 1953196132 || i10 == 1718909296 || i10 == 1969517665 || i10 == 1801812339 || i10 == 1768715124;
    }

    private boolean O(u7.v vVar) {
        y7.a aVarA;
        if (vVar != null && (this.f23624b & 64) != 0 && (aVarA = j.a(vVar, "auxiliary.tracks.offset")) != null) {
            long jO = new a0(aVarA.f28680b).O();
            if (jO > 0) {
                this.f23645w = jO;
                return true;
            }
        }
        return false;
    }

    private void P(a aVar, long j10) {
        w wVar = aVar.f23650b;
        int iA = wVar.a(j10);
        if (iA == -1) {
            iA = wVar.b(j10);
        }
        aVar.f23653e = iA;
    }

    private static int o(int i10) {
        if (i10 != 1751476579) {
            return i10 != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    private static long[][] p(a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length][];
        int[] iArr = new int[aVarArr.length];
        long[] jArr2 = new long[aVarArr.length];
        boolean[] zArr = new boolean[aVarArr.length];
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            jArr[i10] = new long[aVarArr[i10].f23650b.f23704b];
            jArr2[i10] = aVarArr[i10].f23650b.f23708f[0];
        }
        long j10 = 0;
        int i11 = 0;
        while (i11 < aVarArr.length) {
            long j11 = Long.MAX_VALUE;
            int i12 = -1;
            for (int i13 = 0; i13 < aVarArr.length; i13++) {
                if (!zArr[i13]) {
                    long j12 = jArr2[i13];
                    if (j12 <= j11) {
                        i12 = i13;
                        j11 = j12;
                    }
                }
            }
            int i14 = iArr[i12];
            long[] jArr3 = jArr[i12];
            jArr3[i14] = j10;
            w wVar = aVarArr[i12].f23650b;
            j10 += (long) wVar.f23706d[i14];
            int i15 = i14 + 1;
            iArr[i12] = i15;
            if (i15 < jArr3.length) {
                jArr2[i12] = wVar.f23708f[i15];
            } else {
                zArr[i12] = true;
                i11++;
            }
        }
        return jArr;
    }

    private boolean q(u7.q qVar) {
        if (Objects.equals(qVar.f26252o, "video/avc")) {
            return (this.f23624b & 32) != 0;
        }
        return Objects.equals(qVar.f26252o, "video/hevc") && (this.f23624b & 128) != 0;
    }

    public static int r(int i10) {
        int i11 = (i10 & 1) != 0 ? 32 : 0;
        return (i10 & 2) != 0 ? i11 | 128 : i11;
    }

    private void s() {
        this.f23633k = 0;
        this.f23636n = 0;
    }

    private List<Integer> t(u7.v vVar) {
        List<Integer> listD = ((y7.a) x7.a.i(j.a(vVar, "auxiliary.tracks.map"))).d();
        ArrayList arrayList = new ArrayList(listD.size());
        for (int i10 = 0; i10 < listD.size(); i10++) {
            int iIntValue = listD.get(i10).intValue();
            int i11 = 1;
            if (iIntValue != 0) {
                if (iIntValue != 1) {
                    i11 = 3;
                    if (iIntValue != 2) {
                        i11 = iIntValue != 3 ? 0 : 4;
                    }
                } else {
                    i11 = 2;
                }
            }
            arrayList.add(Integer.valueOf(i11));
        }
        return arrayList;
    }

    private static int w(w wVar, long j10) {
        int iA = wVar.a(j10);
        return iA == -1 ? wVar.b(j10) : iA;
    }

    private int x(long j10) {
        int i10 = -1;
        int i11 = -1;
        int i12 = 0;
        long j11 = Long.MAX_VALUE;
        boolean z10 = true;
        long j12 = Long.MAX_VALUE;
        boolean z11 = true;
        long j13 = Long.MAX_VALUE;
        while (true) {
            a[] aVarArr = this.A;
            if (i12 >= aVarArr.length) {
                break;
            }
            a aVar = aVarArr[i12];
            int i13 = aVar.f23653e;
            w wVar = aVar.f23650b;
            if (i13 != wVar.f23704b) {
                long j14 = wVar.f23705c[i13];
                long j15 = ((long[][]) l0.i(this.B))[i12][i13];
                long j16 = j14 - j10;
                boolean z12 = j16 < 0 || j16 >= 262144;
                if ((!z12 && z11) || (z12 == z11 && j16 < j13)) {
                    z11 = z12;
                    j13 = j16;
                    i11 = i12;
                    j12 = j15;
                }
                if (j15 < j11) {
                    z10 = z12;
                    i10 = i12;
                    j11 = j15;
                }
            }
            i12++;
        }
        return (j11 == Long.MAX_VALUE || !z10 || j12 < j11 + 10485760) ? i11 : i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ v8.p[] z() {
        return new v8.p[]{new n(s9.r.a.f25343a, 16)};
    }

    @Override // v8.p
    public void a(long j10, long j11) {
        this.f23629g.clear();
        this.f23636n = 0;
        this.f23638p = -1;
        this.f23639q = 0;
        this.f23640r = 0;
        this.f23641s = 0;
        this.f23642t = false;
        if (j10 == 0) {
            if (this.f23633k != 3) {
                s();
                return;
            } else {
                this.f23630h.g();
                this.f23631i.clear();
                return;
            }
        }
        for (a aVar : this.A) {
            P(aVar, j11);
            p0 p0Var = aVar.f23652d;
            if (p0Var != null) {
                p0Var.b();
            }
        }
    }

    @Override // v8.p
    public void c(v8.r rVar) {
        if ((this.f23624b & 16) == 0) {
            rVar = new s9.s(rVar, this.f23623a);
        }
        this.f23648z = rVar;
    }

    @Override // v8.j0
    public j0.a d(long j10) {
        return u(j10, -1);
    }

    @Override // v8.p
    public boolean e(v8.q qVar) throws IOException {
        n0 n0VarD = s.d(qVar, (this.f23624b & 2) != 0);
        this.f23632j = n0VarD != null ? com.google.common.collect.u.I(n0VarD) : com.google.common.collect.u.H();
        return n0VarD == null;
    }

    @Override // v8.j0
    public boolean h() {
        return true;
    }

    @Override // v8.j0
    public long k() {
        return this.D;
    }

    @Override // v8.p
    public int l(v8.q qVar, i0 i0Var) throws IOException {
        while (true) {
            int i10 = this.f23633k;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        return K(qVar, i0Var);
                    }
                    if (i10 == 3) {
                        return L(qVar, i0Var);
                    }
                    throw new IllegalStateException();
                }
                if (J(qVar, i0Var)) {
                    return 1;
                }
            } else if (!I(qVar)) {
                return -1;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0062  */
    /* JADX WARN: Code duplicated, block: B:30:0x0068  */
    /* JADX WARN: Code duplicated, block: B:32:0x006c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0078  */
    /* JADX WARN: Code duplicated, block: B:38:0x0088  */
    /* JADX WARN: Code duplicated, block: B:40:0x008e  */
    /* JADX WARN: Code duplicated, block: B:42:0x007f A[EDGE_INSN: B:42:0x007f->B:36:0x007f BREAK  A[LOOP:0: B:28:0x0063->B:35:0x007c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x007c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x007c A[SYNTHETIC] */
    public j0.a u(long j10, int i10) {
        long jA;
        long j11;
        long jA2;
        long j12;
        int i11;
        a[] aVarArr;
        w wVar;
        int iB;
        a[] aVarArr2 = this.A;
        if (aVarArr2.length == 0) {
            return new j0.a(k0.f27349c);
        }
        int i12 = i10 != -1 ? i10 : this.C;
        if (i12 != -1) {
            w wVar2 = aVarArr2[i12].f23650b;
            int iW = w(wVar2, j10);
            if (iW == -1) {
                return new j0.a(k0.f27349c);
            }
            j11 = wVar2.f23708f[iW];
            jA = wVar2.f23705c[iW];
            if (j11 < j10 && iW < wVar2.f23704b - 1 && (iB = wVar2.b(j10)) != -1 && iB != iW) {
                j12 = wVar2.f23708f[iB];
                jA2 = wVar2.f23705c[iB];
            }
            if (i10 == -1) {
                i11 = 0;
                while (true) {
                    aVarArr = this.A;
                    if (i11 < aVarArr.length) {
                        break;
                    }
                    if (i11 != this.C) {
                        wVar = aVarArr[i11].f23650b;
                        jA = A(wVar, j11, jA);
                        if (j12 != -9223372036854775807L) {
                            jA2 = A(wVar, j12, jA2);
                        }
                    }
                    i11++;
                }
            }
            k0 k0Var = new k0(j11, jA);
            return j12 == -9223372036854775807L ? new j0.a(k0Var) : new j0.a(k0Var, new k0(j12, jA2));
        }
        jA = Long.MAX_VALUE;
        j11 = j10;
        jA2 = -1;
        j12 = -9223372036854775807L;
        if (i10 == -1) {
            i11 = 0;
            while (true) {
                aVarArr = this.A;
                if (i11 < aVarArr.length) {
                    break;
                    break;
                }
                if (i11 != this.C) {
                    wVar = aVarArr[i11].f23650b;
                    jA = A(wVar, j11, jA);
                    if (j12 != -9223372036854775807L) {
                        jA2 = A(wVar, j12, jA2);
                    }
                }
                i11++;
            }
        }
        k0 k0Var2 = new k0(j11, jA);
        if (j12 == -9223372036854775807L) {
        }
    }

    @Override // v8.p
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public com.google.common.collect.u<n0> i() {
        return this.f23632j;
    }

    public n(s9.r.a aVar, int i10) {
        this.f23623a = aVar;
        this.f23624b = i10;
        this.f23632j = com.google.common.collect.u.H();
        this.f23633k = (i10 & 4) != 0 ? 3 : 0;
        this.f23630h = new q();
        this.f23631i = new ArrayList();
        this.f23628f = new a0(16);
        this.f23629g = new ArrayDeque<>();
        this.f23625c = new a0(y7.f.f28694a);
        this.f23626d = new a0(6);
        this.f23627e = new a0();
        this.f23638p = -1;
        this.f23648z = v8.r.Y8;
        this.A = new a[0];
    }

    @Override // v8.p
    public void release() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ t y(t tVar) {
        return tVar;
    }
}
