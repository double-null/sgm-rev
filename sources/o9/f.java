package o9;

import j9.l;
import j9.n;
import java.io.EOFException;
import java.io.IOException;
import java.math.RoundingMode;
import u7.v;
import v8.b0;
import v8.d0;
import v8.f0;
import v8.i0;
import v8.m;
import v8.o0;
import v8.p;
import v8.q;
import v8.r;
import v8.u;
import x7.a0;
import x7.l0;

/* JADX INFO: compiled from: Mp3Extractor.java */
/* JADX INFO: loaded from: classes4.dex */
public final class f implements p {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final u f23239v = new u() { // from class: o9.d
        @Override // v8.u
        public final p[] g() {
            return f.r();
        }
    };

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final j9.h.a f23240w = new j9.h.a() { // from class: o9.e
        @Override // j9.h.a
        public final boolean a(int i10, int i11, int i12, int i13, int i14) {
            return f.s(i10, i11, i12, i13, i14);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f23241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f23242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a0 f23243c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f0.a f23244d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b0 f23245e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final d0 f23246f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final o0 f23247g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private r f23248h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private o0 f23249i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private o0 f23250j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f23251k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private v f23252l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f23253m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f23254n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f23255o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f23256p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f23257q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private g f23258r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f23259s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f23260t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f23261u;

    public f() {
        this(0);
    }

    private void g() {
        x7.a.i(this.f23249i);
        l0.i(this.f23248h);
    }

    private g h(q qVar) throws IOException {
        long jO;
        long jG;
        g gVarU = u(qVar);
        c cVarT = t(this.f23252l, qVar.getPosition());
        if (this.f23259s) {
            return new g.a();
        }
        if ((this.f23241a & 4) != 0) {
            if (cVarT != null) {
                jO = cVarT.k();
                jG = cVarT.g();
            } else if (gVarU != null) {
                jO = gVarU.k();
                jG = gVarU.g();
            } else {
                jO = o(this.f23252l);
                jG = -1;
            }
            gVarU = new b(jO, qVar.getPosition(), jG);
        } else if (cVarT != null) {
            gVarU = cVarT;
        } else if (gVarU == null) {
            gVarU = null;
        }
        if (gVarU == null || (!gVarU.h() && (this.f23241a & 1) != 0)) {
            gVarU = n(qVar, (this.f23241a & 2) != 0);
        }
        if (gVarU != null) {
            this.f23249i.g(gVarU.k());
        }
        return gVarU;
    }

    private long j(long j10) {
        return this.f23253m + ((j10 * 1000000) / ((long) this.f23244d.f27320d));
    }

    private g m(long j10, i iVar, long j11) {
        long j12;
        long j13;
        long jA = iVar.a();
        if (jA == -9223372036854775807L) {
            return null;
        }
        long j14 = iVar.f23269c;
        if (j14 != -1) {
            long j15 = j10 + j14;
            j12 = j14 - ((long) iVar.f23267a.f27319c);
            j13 = j15;
        } else {
            if (j11 == -1) {
                return null;
            }
            j12 = (j11 - j10) - ((long) iVar.f23267a.f27319c);
            j13 = j11;
        }
        long j16 = j12;
        return new a(j13, j10 + ((long) iVar.f23267a.f27319c), com.google.common.primitives.f.d(l0.h1(j16, 8000000L, jA, RoundingMode.HALF_UP)), com.google.common.primitives.f.d(u2.e.b(j16, iVar.f23268b, RoundingMode.HALF_UP)), false);
    }

    private g n(q qVar, boolean z10) throws IOException {
        qVar.n(this.f23243c.e(), 0, 4);
        this.f23243c.W(0);
        this.f23244d.a(this.f23243c.q());
        return new a(qVar.getLength(), qVar.getPosition(), this.f23244d, z10);
    }

    private static long o(v vVar) {
        if (vVar == null) {
            return -9223372036854775807L;
        }
        int iE = vVar.e();
        for (int i10 = 0; i10 < iE; i10++) {
            v.a aVarD = vVar.d(i10);
            if (aVarD instanceof n) {
                n nVar = (n) aVarD;
                if (nVar.f20724a.equals("TLEN")) {
                    return l0.S0(Long.parseLong(nVar.f20738d.get(0)));
                }
            }
        }
        return -9223372036854775807L;
    }

    private static int p(a0 a0Var, int i10) {
        if (a0Var.g() >= i10 + 4) {
            a0Var.W(i10);
            int iQ = a0Var.q();
            if (iQ == 1483304551 || iQ == 1231971951) {
                return iQ;
            }
        }
        if (a0Var.g() < 40) {
            return 0;
        }
        a0Var.W(36);
        return a0Var.q() == 1447187017 ? 1447187017 : 0;
    }

    private static boolean q(int i10, long j10) {
        return ((long) (i10 & (-128000))) == (j10 & (-128000));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ p[] r() {
        return new p[]{new f()};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean s(int i10, int i11, int i12, int i13, int i14) {
        return (i11 == 67 && i12 == 79 && i13 == 77 && (i14 == 77 || i10 == 2)) || (i11 == 77 && i12 == 76 && i13 == 76 && (i14 == 84 || i10 == 2));
    }

    private static c t(v vVar, long j10) {
        if (vVar == null) {
            return null;
        }
        int iE = vVar.e();
        for (int i10 = 0; i10 < iE; i10++) {
            v.a aVarD = vVar.d(i10);
            if (aVarD instanceof l) {
                return c.a(j10, (l) aVarD, o(vVar));
            }
        }
        return null;
    }

    private g u(q qVar) throws IOException {
        int i10;
        int i11;
        a0 a0Var = new a0(this.f23244d.f27319c);
        qVar.n(a0Var.e(), 0, this.f23244d.f27319c);
        f0.a aVar = this.f23244d;
        int i12 = 21;
        if ((aVar.f27317a & 1) != 0) {
            if (aVar.f27321e != 1) {
                i12 = 36;
            }
        } else if (aVar.f27321e == 1) {
            i12 = 13;
        }
        int iP = p(a0Var, i12);
        if (iP != 1231971951) {
            if (iP == 1447187017) {
                h hVarA = h.a(qVar.getLength(), qVar.getPosition(), this.f23244d, a0Var);
                qVar.k(this.f23244d.f27319c);
                return hVarA;
            }
            if (iP != 1483304551) {
                qVar.d();
                return null;
            }
        }
        i iVarB = i.b(this.f23244d, a0Var);
        if (!this.f23245e.a() && (i10 = iVarB.f23270d) != -1 && (i11 = iVarB.f23271e) != -1) {
            b0 b0Var = this.f23245e;
            b0Var.f27242a = i10;
            b0Var.f27243b = i11;
        }
        long position = qVar.getPosition();
        if (qVar.getLength() != -1 && iVarB.f23269c != -1 && qVar.getLength() != iVarB.f23269c + position) {
            x7.r.f("Mp3Extractor", "Data size mismatch between stream (" + qVar.getLength() + ") and Xing frame (" + (iVarB.f23269c + position) + "), using Xing value.");
        }
        qVar.k(this.f23244d.f27319c);
        return iP == 1483304551 ? j.a(iVarB, position) : m(position, iVarB, qVar.getLength());
    }

    private void v() {
        g gVar = this.f23258r;
        if ((gVar instanceof a) && gVar.h()) {
            long j10 = this.f23256p;
            if (j10 == -1 || j10 == this.f23258r.g()) {
                return;
            }
            this.f23258r = ((a) this.f23258r).f(this.f23256p);
            ((r) x7.a.e(this.f23248h)).h(this.f23258r);
            ((o0) x7.a.e(this.f23249i)).g(this.f23258r.k());
        }
    }

    private boolean w(q qVar) throws IOException {
        g gVar = this.f23258r;
        if (gVar != null) {
            long jG = gVar.g();
            if (jG != -1 && qVar.f() > jG - 4) {
                return true;
            }
        }
        try {
            return !qVar.b(this.f23243c.e(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private int x(q qVar) throws IOException {
        if (this.f23251k == 0) {
            try {
                z(qVar, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.f23258r == null) {
            g gVarH = h(qVar);
            this.f23258r = gVarH;
            this.f23248h.h(gVarH);
            u7.q.b bVarN0 = new u7.q.b().U("audio/mpeg").u0(this.f23244d.f27318b).k0(4096).R(this.f23244d.f27321e).v0(this.f23244d.f27320d).Z(this.f23245e.f27242a).a0(this.f23245e.f27243b).n0((this.f23241a & 8) != 0 ? null : this.f23252l);
            if (this.f23258r.j() != -2147483647) {
                bVarN0.Q(this.f23258r.j());
            }
            this.f23250j.a(bVarN0.N());
            this.f23255o = qVar.getPosition();
        } else if (this.f23255o != 0) {
            long position = qVar.getPosition();
            long j10 = this.f23255o;
            if (position < j10) {
                qVar.k((int) (j10 - position));
            }
        }
        return y(qVar);
    }

    private int y(q qVar) throws IOException {
        if (this.f23257q == 0) {
            qVar.d();
            if (w(qVar)) {
                return -1;
            }
            this.f23243c.W(0);
            int iQ = this.f23243c.q();
            if (!q(iQ, this.f23251k) || f0.j(iQ) == -1) {
                qVar.k(1);
                this.f23251k = 0;
                return 0;
            }
            this.f23244d.a(iQ);
            if (this.f23253m == -9223372036854775807L) {
                this.f23253m = this.f23258r.b(qVar.getPosition());
                if (this.f23242b != -9223372036854775807L) {
                    this.f23253m += this.f23242b - this.f23258r.b(0L);
                }
            }
            this.f23257q = this.f23244d.f27319c;
            long position = qVar.getPosition();
            f0.a aVar = this.f23244d;
            this.f23256p = position + ((long) aVar.f27319c);
            g gVar = this.f23258r;
            if (gVar instanceof b) {
                b bVar = (b) gVar;
                bVar.c(j(this.f23254n + ((long) aVar.f27323g)), this.f23256p);
                if (this.f23260t && bVar.a(this.f23261u)) {
                    this.f23260t = false;
                    this.f23250j = this.f23249i;
                }
            }
        }
        int iC = this.f23250j.c(qVar, this.f23257q, true);
        if (iC == -1) {
            return -1;
        }
        int i10 = this.f23257q - iC;
        this.f23257q = i10;
        if (i10 > 0) {
            return 0;
        }
        this.f23250j.f(j(this.f23254n), 1, this.f23244d.f27319c, 0, null);
        this.f23254n += (long) this.f23244d.f27323g;
        this.f23257q = 0;
        return 0;
    }

    private boolean z(q qVar, boolean z10) throws IOException {
        int iF;
        int i10;
        int iJ;
        int i11 = z10 ? 32768 : 131072;
        qVar.d();
        if (qVar.getPosition() == 0) {
            v vVarA = this.f23246f.a(qVar, (this.f23241a & 8) == 0 ? null : f23240w);
            this.f23252l = vVarA;
            if (vVarA != null) {
                this.f23245e.c(vVarA);
            }
            iF = (int) qVar.f();
            if (!z10) {
                qVar.k(iF);
            }
            i10 = 0;
        } else {
            iF = 0;
            i10 = 0;
        }
        int i12 = i10;
        int i13 = i12;
        while (true) {
            if (w(qVar)) {
                if (i12 > 0) {
                    break;
                }
                v();
                throw new EOFException();
            }
            this.f23243c.W(0);
            int iQ = this.f23243c.q();
            if ((i10 == 0 || q(iQ, i10)) && (iJ = f0.j(iQ)) != -1) {
                i12++;
                if (i12 != 1) {
                    if (i12 == 4) {
                        break;
                    }
                } else {
                    this.f23244d.a(iQ);
                    i10 = iQ;
                }
                qVar.g(iJ - 4);
            } else {
                int i14 = i13 + 1;
                if (i13 == i11) {
                    if (z10) {
                        return false;
                    }
                    v();
                    throw new EOFException();
                }
                if (z10) {
                    qVar.d();
                    qVar.g(iF + i14);
                } else {
                    qVar.k(1);
                }
                i12 = 0;
                i13 = i14;
                i10 = 0;
            }
        }
        if (z10) {
            qVar.k(iF + i13);
        } else {
            qVar.d();
        }
        this.f23251k = i10;
        return true;
    }

    @Override // v8.p
    public void a(long j10, long j11) {
        this.f23251k = 0;
        this.f23253m = -9223372036854775807L;
        this.f23254n = 0L;
        this.f23257q = 0;
        this.f23261u = j11;
        g gVar = this.f23258r;
        if (!(gVar instanceof b) || ((b) gVar).a(j11)) {
            return;
        }
        this.f23260t = true;
        this.f23250j = this.f23247g;
    }

    @Override // v8.p
    public void c(r rVar) {
        this.f23248h = rVar;
        o0 o0VarE = rVar.e(0, 1);
        this.f23249i = o0VarE;
        this.f23250j = o0VarE;
        this.f23248h.r();
    }

    @Override // v8.p
    public boolean e(q qVar) throws IOException {
        return z(qVar, true);
    }

    public void k() {
        this.f23259s = true;
    }

    @Override // v8.p
    public int l(q qVar, i0 i0Var) throws IOException {
        g();
        int iX = x(qVar);
        if (iX == -1 && (this.f23258r instanceof b)) {
            long j10 = j(this.f23254n);
            if (this.f23258r.k() != j10) {
                ((b) this.f23258r).e(j10);
                this.f23248h.h(this.f23258r);
                this.f23249i.g(this.f23258r.k());
            }
        }
        return iX;
    }

    public f(int i10) {
        this(i10, -9223372036854775807L);
    }

    public f(int i10, long j10) {
        this.f23241a = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f23242b = j10;
        this.f23243c = new a0(10);
        this.f23244d = new f0.a();
        this.f23245e = new b0();
        this.f23253m = -9223372036854775807L;
        this.f23246f = new d0();
        m mVar = new m();
        this.f23247g = mVar;
        this.f23250j = mVar;
        this.f23256p = -1L;
    }

    @Override // v8.p
    public void release() {
    }
}
