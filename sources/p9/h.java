package p9;

import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.vungle.ads.internal.network.converters.vY.vgmm;
import io.bidmachine.media3.common.ParserException;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import v8.b0;
import v8.i0;
import v8.j0;
import v8.n0;
import v8.o0;
import x7.a0;
import x7.g0;
import x7.l0;

/* JADX INFO: compiled from: FragmentedMp4Extractor.java */
/* JADX INFO: loaded from: classes4.dex */
public class h implements v8.p {

    @Deprecated
    public static final v8.u M = new v8.u() { // from class: p9.e
        @Override // v8.u
        public final v8.p[] g() {
            return h.t();
        }
    };
    private static final byte[] N = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final u7.q O = new u7.q.b().u0("application/x-emsg").N();
    private long A;
    private long B;
    private b C;
    private int D;
    private int E;
    private int F;
    private boolean G;
    private boolean H;
    private v8.r I;
    private o0[] J;
    private o0[] K;
    private boolean L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s9.r.a f23578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f23579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final t f23580c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<u7.q> f23581d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final SparseArray<b> f23582e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final a0 f23583f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final a0 f23584g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final a0 f23585h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final byte[] f23586i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final a0 f23587j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final g0 f23588k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final g9.c f23589l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final a0 f23590m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ArrayDeque<y7.c.b> f23591n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final ArrayDeque<a> f23592o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final y7.i f23593p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final o0 f23594q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private com.google.common.collect.u<n0> f23595r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f23596s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f23597t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f23598u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f23599v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private a0 f23600w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f23601x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f23602y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f23603z;

    /* JADX INFO: compiled from: FragmentedMp4Extractor.java */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f23604a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f23605b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f23606c;

        public a(long j10, boolean z10, int i10) {
            this.f23604a = j10;
            this.f23605b = z10;
            this.f23606c = i10;
        }
    }

    /* JADX INFO: compiled from: FragmentedMp4Extractor.java */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o0 f23607a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public w f23610d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public c f23611e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f23612f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f23613g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f23614h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f23615i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final String f23616j;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f23619m;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final v f23608b = new v();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a0 f23609c = new a0();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final a0 f23617k = new a0(1);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final a0 f23618l = new a0();

        public b(o0 o0Var, w wVar, c cVar, String str) {
            this.f23607a = o0Var;
            this.f23610d = wVar;
            this.f23611e = cVar;
            this.f23616j = str;
            j(wVar, cVar);
        }

        public int c() {
            int i10;
            if (this.f23619m) {
                i10 = this.f23608b.f23695k[this.f23612f] ? 1 : 0;
            } else {
                i10 = this.f23610d.f23709g[this.f23612f];
            }
            return g() != null ? i10 | 1073741824 : i10;
        }

        public long d() {
            return !this.f23619m ? this.f23610d.f23705c[this.f23612f] : this.f23608b.f23691g[this.f23614h];
        }

        public long e() {
            return !this.f23619m ? this.f23610d.f23708f[this.f23612f] : this.f23608b.c(this.f23612f);
        }

        public int f() {
            return !this.f23619m ? this.f23610d.f23706d[this.f23612f] : this.f23608b.f23693i[this.f23612f];
        }

        public u g() {
            if (!this.f23619m) {
                return null;
            }
            int i10 = ((c) l0.i(this.f23608b.f23685a)).f23565a;
            u uVarB = this.f23608b.f23698n;
            if (uVarB == null) {
                uVarB = this.f23610d.f23703a.b(i10);
            }
            if (uVarB == null || !uVarB.f23680a) {
                return null;
            }
            return uVarB;
        }

        public boolean h() {
            this.f23612f++;
            if (!this.f23619m) {
                return false;
            }
            int i10 = this.f23613g + 1;
            this.f23613g = i10;
            int[] iArr = this.f23608b.f23692h;
            int i11 = this.f23614h;
            if (i10 != iArr[i11]) {
                return true;
            }
            this.f23614h = i11 + 1;
            this.f23613g = 0;
            return false;
        }

        public int i(int i10, int i11) {
            a0 a0Var;
            u uVarG = g();
            if (uVarG == null) {
                return 0;
            }
            int length = uVarG.f23683d;
            if (length != 0) {
                a0Var = this.f23608b.f23699o;
            } else {
                byte[] bArr = (byte[]) l0.i(uVarG.f23684e);
                this.f23618l.U(bArr, bArr.length);
                a0 a0Var2 = this.f23618l;
                length = bArr.length;
                a0Var = a0Var2;
            }
            boolean zG = this.f23608b.g(this.f23612f);
            boolean z10 = zG || i11 != 0;
            this.f23617k.e()[0] = (byte) ((z10 ? 128 : 0) | length);
            this.f23617k.W(0);
            this.f23607a.d(this.f23617k, 1, 1);
            this.f23607a.d(a0Var, length, 1);
            if (!z10) {
                return length + 1;
            }
            if (!zG) {
                this.f23609c.S(8);
                byte[] bArrE = this.f23609c.e();
                bArrE[0] = 0;
                bArrE[1] = 1;
                bArrE[2] = (byte) ((i11 >> 8) & 255);
                bArrE[3] = (byte) (i11 & 255);
                bArrE[4] = (byte) ((i10 >> 24) & 255);
                bArrE[5] = (byte) ((i10 >> 16) & 255);
                bArrE[6] = (byte) ((i10 >> 8) & 255);
                bArrE[7] = (byte) (i10 & 255);
                this.f23607a.d(this.f23609c, 8, 1);
                return length + 1 + 8;
            }
            a0 a0Var3 = this.f23608b.f23699o;
            int iP = a0Var3.P();
            a0Var3.X(-2);
            int i12 = (iP * 6) + 2;
            if (i11 != 0) {
                this.f23609c.S(i12);
                byte[] bArrE2 = this.f23609c.e();
                a0Var3.l(bArrE2, 0, i12);
                int i13 = (((bArrE2[2] & 255) << 8) | (bArrE2[3] & 255)) + i11;
                bArrE2[2] = (byte) ((i13 >> 8) & 255);
                bArrE2[3] = (byte) (i13 & 255);
                a0Var3 = this.f23609c;
            }
            this.f23607a.d(a0Var3, i12, 1);
            return length + 1 + i12;
        }

        public void j(w wVar, c cVar) {
            this.f23610d = wVar;
            this.f23611e = cVar;
            this.f23607a.a(wVar.f23703a.f23674g.b().U(this.f23616j).N());
            k();
        }

        public void k() {
            this.f23608b.f();
            this.f23612f = 0;
            this.f23614h = 0;
            this.f23613g = 0;
            this.f23615i = 0;
            this.f23619m = false;
        }

        public void l(long j10) {
            int i10 = this.f23612f;
            while (true) {
                v vVar = this.f23608b;
                if (i10 >= vVar.f23690f || vVar.c(i10) > j10) {
                    return;
                }
                if (this.f23608b.f23695k[i10]) {
                    this.f23615i = i10;
                }
                i10++;
            }
        }

        public void m() {
            u uVarG = g();
            if (uVarG == null) {
                return;
            }
            a0 a0Var = this.f23608b.f23699o;
            int i10 = uVarG.f23683d;
            if (i10 != 0) {
                a0Var.X(i10);
            }
            if (this.f23608b.g(this.f23612f)) {
                a0Var.X(a0Var.P() * 6);
            }
        }

        public void n(u7.l lVar) {
            u uVarB = this.f23610d.f23703a.b(((c) l0.i(this.f23608b.f23685a)).f23565a);
            this.f23607a.a(this.f23610d.f23703a.f23674g.b().U(this.f23616j).Y(lVar.c(uVarB != null ? uVarB.f23681b : null)).N());
        }
    }

    public h(s9.r.a aVar, int i10) {
        this(aVar, i10, null, null, com.google.common.collect.u.H(), null);
    }

    private void A(long j10) {
        while (!this.f23592o.isEmpty()) {
            a aVarRemoveFirst = this.f23592o.removeFirst();
            this.f23602y -= aVarRemoveFirst.f23606c;
            long jA = aVarRemoveFirst.f23604a;
            if (aVarRemoveFirst.f23605b) {
                jA += j10;
            }
            g0 g0Var = this.f23588k;
            if (g0Var != null) {
                jA = g0Var.a(jA);
            }
            for (o0 o0Var : this.J) {
                o0Var.f(jA, 1, aVarRemoveFirst.f23606c, this.f23602y, null);
            }
        }
    }

    private static long B(a0 a0Var) {
        a0Var.W(8);
        return p9.b.p(a0Var.q()) == 0 ? a0Var.J() : a0Var.O();
    }

    private static void C(y7.c.b bVar, SparseArray<b> sparseArray, boolean z10, int i10, byte[] bArr) throws ParserException {
        int size = bVar.f28687d.size();
        for (int i11 = 0; i11 < size; i11++) {
            y7.c.b bVar2 = bVar.f28687d.get(i11);
            if (bVar2.f28684a == 1953653094) {
                L(bVar2, sparseArray, z10, i10, bArr);
            }
        }
    }

    private static void D(a0 a0Var, v vVar) throws ParserException {
        a0Var.W(8);
        int iQ = a0Var.q();
        if ((p9.b.o(iQ) & 1) == 1) {
            a0Var.X(8);
        }
        int iL = a0Var.L();
        if (iL == 1) {
            vVar.f23688d += p9.b.p(iQ) == 0 ? a0Var.J() : a0Var.O();
        } else {
            throw ParserException.b("Unexpected saio entry count: " + iL, null);
        }
    }

    private static void E(u uVar, a0 a0Var, v vVar) throws ParserException {
        int i10;
        int i11 = uVar.f23683d;
        a0Var.W(8);
        if ((p9.b.o(a0Var.q()) & 1) == 1) {
            a0Var.X(8);
        }
        int iH = a0Var.H();
        int iL = a0Var.L();
        if (iL > vVar.f23690f) {
            throw ParserException.b("Saiz sample count " + iL + " is greater than fragment sample count" + vVar.f23690f, null);
        }
        if (iH == 0) {
            boolean[] zArr = vVar.f23697m;
            i10 = 0;
            for (int i12 = 0; i12 < iL; i12++) {
                int iH2 = a0Var.H();
                i10 += iH2;
                zArr[i12] = iH2 > i11;
            }
        } else {
            i10 = (iH * iL) + 0;
            Arrays.fill(vVar.f23697m, 0, iL, iH > i11);
        }
        Arrays.fill(vVar.f23697m, iL, vVar.f23690f, false);
        if (i10 > 0) {
            vVar.d(i10);
        }
    }

    private static void G(a0 a0Var, int i10, v vVar) throws ParserException {
        a0Var.W(i10 + 8);
        int iO = p9.b.o(a0Var.q());
        if ((iO & 1) != 0) {
            throw ParserException.f("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z10 = (iO & 2) != 0;
        int iL = a0Var.L();
        if (iL == 0) {
            Arrays.fill(vVar.f23697m, 0, vVar.f23690f, false);
            return;
        }
        if (iL == vVar.f23690f) {
            Arrays.fill(vVar.f23697m, 0, iL, z10);
            vVar.d(a0Var.a());
            vVar.b(a0Var);
        } else {
            throw ParserException.b("Senc sample count " + iL + " is different from fragment sample count" + vVar.f23690f, null);
        }
    }

    private static void H(a0 a0Var, v vVar) throws ParserException {
        G(a0Var, 0, vVar);
    }

    private static Pair<Long, v8.g> I(a0 a0Var, long j10) throws ParserException {
        long jO;
        long jO2;
        a0Var.W(8);
        int iP = p9.b.p(a0Var.q());
        a0Var.X(4);
        long J = a0Var.J();
        if (iP == 0) {
            jO = a0Var.J();
            jO2 = a0Var.J();
        } else {
            jO = a0Var.O();
            jO2 = a0Var.O();
        }
        long j11 = jO;
        long j12 = j10 + jO2;
        long jF1 = l0.f1(j11, 1000000L, J);
        a0Var.X(2);
        int iP2 = a0Var.P();
        int[] iArr = new int[iP2];
        long[] jArr = new long[iP2];
        long[] jArr2 = new long[iP2];
        long[] jArr3 = new long[iP2];
        long j13 = jF1;
        int i10 = 0;
        long j14 = j11;
        while (i10 < iP2) {
            int iQ = a0Var.q();
            if ((iQ & Integer.MIN_VALUE) != 0) {
                throw ParserException.b("Unhandled indirect reference", null);
            }
            long J2 = a0Var.J();
            iArr[i10] = iQ & Integer.MAX_VALUE;
            jArr[i10] = j12;
            jArr3[i10] = j13;
            long j15 = j14 + J2;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            int i11 = iP2;
            int[] iArr2 = iArr;
            long jF2 = l0.f1(j15, 1000000L, J);
            jArr4[i10] = jF2 - jArr5[i10];
            a0Var.X(4);
            j12 += (long) iArr2[i10];
            i10++;
            iArr = iArr2;
            jArr3 = jArr5;
            jArr2 = jArr4;
            jArr = jArr;
            iP2 = i11;
            j14 = j15;
            j13 = jF2;
        }
        return Pair.create(Long.valueOf(jF1), new v8.g(iArr, jArr, jArr2, jArr3));
    }

    private static long J(a0 a0Var) {
        a0Var.W(8);
        return p9.b.p(a0Var.q()) == 1 ? a0Var.O() : a0Var.J();
    }

    private static b K(a0 a0Var, SparseArray<b> sparseArray, boolean z10) {
        a0Var.W(8);
        int iO = p9.b.o(a0Var.q());
        b bVarValueAt = z10 ? sparseArray.valueAt(0) : sparseArray.get(a0Var.q());
        if (bVarValueAt == null) {
            return null;
        }
        if ((iO & 1) != 0) {
            long jO = a0Var.O();
            v vVar = bVarValueAt.f23608b;
            vVar.f23687c = jO;
            vVar.f23688d = jO;
        }
        c cVar = bVarValueAt.f23611e;
        bVarValueAt.f23608b.f23685a = new c((iO & 2) != 0 ? a0Var.q() - 1 : cVar.f23565a, (iO & 8) != 0 ? a0Var.q() : cVar.f23566b, (iO & 16) != 0 ? a0Var.q() : cVar.f23567c, (iO & 32) != 0 ? a0Var.q() : cVar.f23568d);
        return bVarValueAt;
    }

    private static void L(y7.c.b bVar, SparseArray<b> sparseArray, boolean z10, int i10, byte[] bArr) throws ParserException {
        b bVarK = K(((y7.c.C0487c) x7.a.e(bVar.e(1952868452))).f28688b, sparseArray, z10);
        if (bVarK == null) {
            return;
        }
        v vVar = bVarK.f23608b;
        long j10 = vVar.f23701q;
        boolean z11 = vVar.f23702r;
        bVarK.k();
        bVarK.f23619m = true;
        y7.c.C0487c c0487cE = bVar.e(1952867444);
        if (c0487cE == null || (i10 & 2) != 0) {
            vVar.f23701q = j10;
            vVar.f23702r = z11;
        } else {
            vVar.f23701q = J(c0487cE.f28688b);
            vVar.f23702r = true;
        }
        O(bVar, bVarK, i10);
        u uVarB = bVarK.f23610d.f23703a.b(((c) x7.a.e(vVar.f23685a)).f23565a);
        y7.c.C0487c c0487cE2 = bVar.e(1935763834);
        if (c0487cE2 != null) {
            E((u) x7.a.e(uVarB), c0487cE2.f28688b, vVar);
        }
        y7.c.C0487c c0487cE3 = bVar.e(1935763823);
        if (c0487cE3 != null) {
            D(c0487cE3.f28688b, vVar);
        }
        y7.c.C0487c c0487cE4 = bVar.e(1936027235);
        if (c0487cE4 != null) {
            H(c0487cE4.f28688b, vVar);
        }
        F(bVar, uVarB != null ? uVarB.f23681b : null, vVar);
        int size = bVar.f28686c.size();
        for (int i11 = 0; i11 < size; i11++) {
            y7.c.C0487c c0487c = bVar.f28686c.get(i11);
            if (c0487c.f28684a == 1970628964) {
                P(c0487c.f28688b, vVar, bArr);
            }
        }
    }

    private static Pair<Integer, c> M(a0 a0Var) {
        a0Var.W(12);
        return Pair.create(Integer.valueOf(a0Var.q()), new c(a0Var.q() - 1, a0Var.q(), a0Var.q(), a0Var.q()));
    }

    private static int N(b bVar, int i10, int i11, a0 a0Var, int i12) throws ParserException {
        int iQ;
        b bVar2 = bVar;
        a0Var.W(8);
        int iO = p9.b.o(a0Var.q());
        t tVar = bVar2.f23610d.f23703a;
        v vVar = bVar2.f23608b;
        c cVar = (c) l0.i(vVar.f23685a);
        vVar.f23692h[i10] = a0Var.L();
        long[] jArr = vVar.f23691g;
        long j10 = vVar.f23687c;
        jArr[i10] = j10;
        if ((iO & 1) != 0) {
            jArr[i10] = j10 + ((long) a0Var.q());
        }
        boolean z10 = (iO & 4) != 0;
        int iQ2 = cVar.f23568d;
        if (z10) {
            iQ2 = a0Var.q();
        }
        boolean z11 = (iO & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0;
        boolean z12 = (iO & 512) != 0;
        boolean z13 = (iO & 1024) != 0;
        boolean z14 = (iO & 2048) != 0;
        long j11 = r(tVar) ? ((long[]) l0.i(tVar.f23677j))[0] : 0L;
        int[] iArr = vVar.f23693i;
        long[] jArr2 = vVar.f23694j;
        boolean[] zArr = vVar.f23695k;
        int i13 = iQ2;
        boolean z15 = tVar.f23669b == 2 && (i11 & 1) != 0;
        int i14 = i12 + vVar.f23692h[i10];
        boolean z16 = z15;
        long j12 = tVar.f23670c;
        long j13 = vVar.f23701q;
        int i15 = i12;
        while (i15 < i14) {
            int iH = h(z11 ? a0Var.q() : cVar.f23566b);
            int iH2 = h(z12 ? a0Var.q() : cVar.f23567c);
            if (z13) {
                iQ = a0Var.q();
            } else {
                iQ = (i15 == 0 && z10) ? i13 : cVar.f23568d;
            }
            long jF1 = l0.f1((((long) (z14 ? a0Var.q() : 0)) + j13) - j11, 1000000L, j12);
            jArr2[i15] = jF1;
            if (!vVar.f23702r) {
                jArr2[i15] = jF1 + bVar2.f23610d.f23710h;
            }
            iArr[i15] = iH2;
            zArr[i15] = ((iQ >> 16) & 1) == 0 && (!z16 || i15 == 0);
            j13 += (long) iH;
            i15++;
            bVar2 = bVar;
            z11 = z11;
            z10 = z10;
            z14 = z14;
            z12 = z12;
            z13 = z13;
        }
        vVar.f23701q = j13;
        return i14;
    }

    private static void O(y7.c.b bVar, b bVar2, int i10) throws ParserException {
        List<y7.c.C0487c> list = bVar.f28686c;
        int size = list.size();
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            y7.c.C0487c c0487c = list.get(i13);
            if (c0487c.f28684a == 1953658222) {
                a0 a0Var = c0487c.f28688b;
                a0Var.W(12);
                int iL = a0Var.L();
                if (iL > 0) {
                    i12 += iL;
                    i11++;
                }
            }
        }
        bVar2.f23614h = 0;
        bVar2.f23613g = 0;
        bVar2.f23612f = 0;
        bVar2.f23608b.e(i11, i12);
        int i14 = 0;
        int iN = 0;
        for (int i15 = 0; i15 < size; i15++) {
            y7.c.C0487c c0487c2 = list.get(i15);
            if (c0487c2.f28684a == 1953658222) {
                iN = N(bVar2, i14, i10, c0487c2.f28688b, iN);
                i14++;
            }
        }
    }

    private static void P(a0 a0Var, v vVar, byte[] bArr) throws ParserException {
        a0Var.W(8);
        a0Var.l(bArr, 0, 16);
        if (Arrays.equals(bArr, N)) {
            G(a0Var, 16, vVar);
        }
    }

    private void Q(long j10) throws ParserException {
        while (!this.f23591n.isEmpty() && this.f23591n.peek().f28685b == j10) {
            v(this.f23591n.pop());
        }
        k();
    }

    private boolean R(v8.q qVar) throws IOException {
        if (this.f23599v == 0) {
            if (!qVar.e(this.f23590m.e(), 0, 8, true)) {
                return false;
            }
            this.f23599v = 8;
            this.f23590m.W(0);
            this.f23598u = this.f23590m.J();
            this.f23597t = this.f23590m.q();
        }
        long j10 = this.f23598u;
        if (j10 == 1) {
            qVar.readFully(this.f23590m.e(), 8, 8);
            this.f23599v += 8;
            this.f23598u = this.f23590m.O();
        } else if (j10 == 0) {
            long length = qVar.getLength();
            if (length == -1 && !this.f23591n.isEmpty()) {
                length = this.f23591n.peek().f28685b;
            }
            if (length != -1) {
                this.f23598u = (length - qVar.getPosition()) + ((long) this.f23599v);
            }
        }
        if (this.f23598u < this.f23599v) {
            throw ParserException.f("Atom size less than header length (unsupported).");
        }
        long position = qVar.getPosition() - ((long) this.f23599v);
        int i10 = this.f23597t;
        if ((i10 == 1836019558 || i10 == 1835295092) && !this.L) {
            this.I.h(new j0.b(this.A, position));
            this.L = true;
        }
        if (this.f23597t == 1836019558) {
            int size = this.f23582e.size();
            for (int i11 = 0; i11 < size; i11++) {
                v vVar = this.f23582e.valueAt(i11).f23608b;
                vVar.f23686b = position;
                vVar.f23688d = position;
                vVar.f23687c = position;
            }
        }
        int i12 = this.f23597t;
        if (i12 == 1835295092) {
            this.C = null;
            this.f23601x = position + this.f23598u;
            this.f23596s = 2;
            return true;
        }
        if (V(i12)) {
            long position2 = (qVar.getPosition() + this.f23598u) - 8;
            this.f23591n.push(new y7.c.b(this.f23597t, position2));
            if (this.f23598u == this.f23599v) {
                Q(position2);
            } else {
                k();
            }
        } else if (W(this.f23597t)) {
            if (this.f23599v != 8) {
                throw ParserException.f("Leaf atom defines extended atom size (unsupported).");
            }
            if (this.f23598u > 2147483647L) {
                throw ParserException.f("Leaf atom with length > 2147483647 (unsupported).");
            }
            a0 a0Var = new a0((int) this.f23598u);
            System.arraycopy(this.f23590m.e(), 0, a0Var.e(), 0, 8);
            this.f23600w = a0Var;
            this.f23596s = 1;
        } else {
            if (this.f23598u > 2147483647L) {
                throw ParserException.f("Skipping atom with length > 2147483647 (unsupported).");
            }
            this.f23600w = null;
            this.f23596s = 1;
        }
        return true;
    }

    private void S(v8.q qVar) throws IOException {
        int i10 = (int) (this.f23598u - ((long) this.f23599v));
        a0 a0Var = this.f23600w;
        if (a0Var != null) {
            qVar.readFully(a0Var.e(), 8, i10);
            x(new y7.c.C0487c(this.f23597t, a0Var), qVar.getPosition());
        } else {
            qVar.k(i10);
        }
        Q(qVar.getPosition());
    }

    private void T(v8.q qVar) throws IOException {
        int size = this.f23582e.size();
        long j10 = Long.MAX_VALUE;
        b bVarValueAt = null;
        for (int i10 = 0; i10 < size; i10++) {
            v vVar = this.f23582e.valueAt(i10).f23608b;
            if (vVar.f23700p) {
                long j11 = vVar.f23688d;
                if (j11 < j10) {
                    bVarValueAt = this.f23582e.valueAt(i10);
                    j10 = j11;
                }
            }
        }
        if (bVarValueAt == null) {
            this.f23596s = 3;
            return;
        }
        int position = (int) (j10 - qVar.getPosition());
        if (position < 0) {
            throw ParserException.b("Offset to encryption data was negative.", null);
        }
        qVar.k(position);
        bVarValueAt.f23608b.a(qVar);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0114  */
    private boolean U(v8.q qVar) throws IOException {
        int iC;
        int iO;
        b bVarO = this.C;
        if (bVarO == null) {
            bVarO = o(this.f23582e);
            if (bVarO == null) {
                int position = (int) (this.f23601x - qVar.getPosition());
                if (position < 0) {
                    throw ParserException.b("Offset to end of mdat was negative.", null);
                }
                qVar.k(position);
                k();
                return false;
            }
            int iD = (int) (bVarO.d() - qVar.getPosition());
            if (iD < 0) {
                x7.r.h("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                iD = 0;
            }
            qVar.k(iD);
            this.C = bVarO;
        }
        if (this.f23596s == 3) {
            this.D = bVarO.f();
            this.G = !g(bVarO.f23610d.f23703a.f23674g);
            if (bVarO.f23612f < bVarO.f23615i) {
                qVar.k(this.D);
                bVarO.m();
                if (!bVarO.h()) {
                    this.C = null;
                }
                this.f23596s = 3;
                return true;
            }
            if (bVarO.f23610d.f23703a.f23675h == 1) {
                this.D -= 8;
                qVar.k(8);
            }
            if ("audio/ac4".equals(bVarO.f23610d.f23703a.f23674g.f26252o)) {
                this.E = bVarO.i(this.D, 7);
                v8.c.a(this.D, this.f23587j);
                bVarO.f23607a.b(this.f23587j, 7);
                this.E += 7;
            } else {
                this.E = bVarO.i(this.D, 0);
            }
            this.D += this.E;
            this.f23596s = 4;
            this.F = 0;
        }
        t tVar = bVarO.f23610d.f23703a;
        o0 o0Var = bVarO.f23607a;
        long jE = bVarO.e();
        g0 g0Var = this.f23588k;
        if (g0Var != null) {
            jE = g0Var.a(jE);
        }
        long j10 = jE;
        if (tVar.f23678k == 0) {
            while (true) {
                int i10 = this.E;
                int i11 = this.D;
                if (i10 >= i11) {
                    break;
                }
                this.E += o0Var.c(qVar, i11 - i10, false);
            }
        } else {
            byte[] bArrE = this.f23584g.e();
            bArrE[0] = 0;
            bArrE[1] = 0;
            bArrE[2] = 0;
            int i12 = 4 - tVar.f23678k;
            while (this.E < this.D) {
                int i13 = this.F;
                if (i13 == 0) {
                    if (this.K.length > 0 || !this.G) {
                        iO = y7.f.o(tVar.f23674g);
                        if (tVar.f23678k + iO > this.D - this.E) {
                            iO = 0;
                        }
                    } else {
                        iO = 0;
                    }
                    qVar.readFully(bArrE, i12, tVar.f23678k + iO);
                    this.f23584g.W(0);
                    int iQ = this.f23584g.q();
                    if (iQ < 0) {
                        throw ParserException.b("Invalid NAL length", null);
                    }
                    this.F = iQ - iO;
                    this.f23583f.W(0);
                    o0Var.b(this.f23583f, 4);
                    this.E += 4;
                    this.D += i12;
                    this.H = this.K.length > 0 && iO > 0 && y7.f.n(tVar.f23674g, bArrE[4]);
                    o0Var.b(this.f23584g, iO);
                    this.E += iO;
                    if (iO > 0 && !this.G && y7.f.k(bArrE, 4, iO, tVar.f23674g)) {
                        this.G = true;
                    }
                } else {
                    if (this.H) {
                        this.f23585h.S(i13);
                        qVar.readFully(this.f23585h.e(), 0, this.F);
                        o0Var.b(this.f23585h, this.F);
                        iC = this.F;
                        int iL = y7.f.L(this.f23585h.e(), this.f23585h.g());
                        this.f23585h.W(0);
                        this.f23585h.V(iL);
                        if (tVar.f23674g.f26254q != -1) {
                            int iF = this.f23593p.f();
                            int i14 = tVar.f23674g.f26254q;
                            if (iF != i14) {
                                this.f23593p.g(i14);
                            }
                        } else if (this.f23593p.f() != 0) {
                            this.f23593p.g(0);
                        }
                        this.f23593p.a(j10, this.f23585h);
                        if ((bVarO.c() & 4) != 0) {
                            this.f23593p.d();
                        }
                    } else {
                        iC = o0Var.c(qVar, i13, false);
                    }
                    this.E += iC;
                    this.F -= iC;
                }
            }
        }
        int iC2 = bVarO.c();
        if (!this.G) {
            iC2 |= 67108864;
        }
        int i15 = iC2;
        u uVarG = bVarO.g();
        o0Var.f(j10, i15, this.D, 0, uVarG != null ? uVarG.f23682c : null);
        A(j10);
        if (!bVarO.h()) {
            this.C = null;
        }
        this.f23596s = 3;
        return true;
    }

    private static boolean V(int i10) {
        return i10 == 1836019574 || i10 == 1953653099 || i10 == 1835297121 || i10 == 1835626086 || i10 == 1937007212 || i10 == 1836019558 || i10 == 1953653094 || i10 == 1836475768 || i10 == 1701082227;
    }

    private static boolean W(int i10) {
        return i10 == 1751411826 || i10 == 1835296868 || i10 == 1836476516 || i10 == 1936286840 || i10 == 1937011556 || i10 == 1937011827 || i10 == 1668576371 || i10 == 1937011555 || i10 == 1937011578 || i10 == 1937013298 || i10 == 1937007471 || i10 == 1668232756 || i10 == 1937011571 || i10 == 1952867444 || i10 == 1952868452 || i10 == 1953196132 || i10 == 1953654136 || i10 == 1953658222 || i10 == 1886614376 || i10 == 1935763834 || i10 == 1935763823 || i10 == 1936027235 || i10 == 1970628964 || i10 == 1935828848 || i10 == 1936158820 || i10 == 1701606260 || i10 == 1835362404 || i10 == 1701671783;
    }

    private boolean g(u7.q qVar) {
        if (Objects.equals(qVar.f26252o, "video/avc")) {
            return (this.f23579b & 64) != 0;
        }
        return Objects.equals(qVar.f26252o, "video/hevc") && (this.f23579b & 128) != 0;
    }

    private static int h(int i10) throws ParserException {
        if (i10 >= 0) {
            return i10;
        }
        throw ParserException.b("Unexpected negative value: " + i10, null);
    }

    public static int j(int i10) {
        int i11 = (i10 & 1) != 0 ? 64 : 0;
        return (i10 & 2) != 0 ? i11 | 128 : i11;
    }

    private void k() {
        this.f23596s = 0;
        this.f23599v = 0;
    }

    private c m(SparseArray<c> sparseArray, int i10) {
        return sparseArray.size() == 1 ? sparseArray.valueAt(0) : (c) x7.a.e(sparseArray.get(i10));
    }

    private static u7.l n(List<y7.c.C0487c> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            y7.c.C0487c c0487c = list.get(i10);
            if (c0487c.f28684a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArrE = c0487c.f28688b.e();
                UUID uuidF = p.f(bArrE);
                if (uuidF == null) {
                    x7.r.h("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new u7.l.b(uuidF, "video/mp4", bArrE));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new u7.l(arrayList);
    }

    private static b o(SparseArray<b> sparseArray) {
        int size = sparseArray.size();
        b bVar = null;
        long j10 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < size; i10++) {
            b bVarValueAt = sparseArray.valueAt(i10);
            if ((bVarValueAt.f23619m || bVarValueAt.f23612f != bVarValueAt.f23610d.f23704b) && (!bVarValueAt.f23619m || bVarValueAt.f23614h != bVarValueAt.f23608b.f23689e)) {
                long jD = bVarValueAt.d();
                if (jD < j10) {
                    bVar = bVarValueAt;
                    j10 = jD;
                }
            }
        }
        return bVar;
    }

    private void q() {
        int i10;
        o0[] o0VarArr = new o0[2];
        this.J = o0VarArr;
        o0 o0Var = this.f23594q;
        int i11 = 0;
        if (o0Var != null) {
            o0VarArr[0] = o0Var;
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i12 = 100;
        if ((this.f23579b & 4) != 0) {
            o0VarArr[i10] = this.I.e(100, 5);
            i12 = 101;
            i10++;
        }
        o0[] o0VarArr2 = (o0[]) l0.Y0(this.J, i10);
        this.J = o0VarArr2;
        for (o0 o0Var2 : o0VarArr2) {
            o0Var2.a(O);
        }
        this.K = new o0[this.f23581d.size()];
        while (i11 < this.K.length) {
            o0 o0VarE = this.I.e(i12, 3);
            o0VarE.a(this.f23581d.get(i11));
            this.K[i11] = o0VarE;
            i11++;
            i12++;
        }
    }

    private static boolean r(t tVar) {
        long[] jArr = tVar.f23676i;
        if (jArr == null || jArr.length != 1 || tVar.f23677j == null) {
            return false;
        }
        long j10 = jArr[0];
        return j10 == 0 || l0.f1(j10, 1000000L, tVar.f23671d) + l0.f1(tVar.f23677j[0], 1000000L, tVar.f23670c) >= tVar.f23672e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s(long j10, a0 a0Var) {
        v8.f.a(j10, a0Var, this.K);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ v8.p[] t() {
        return new v8.p[]{new h(s9.r.a.f25343a, 32)};
    }

    private void v(y7.c.b bVar) throws ParserException {
        int i10 = bVar.f28684a;
        if (i10 == 1836019574) {
            z(bVar);
        } else if (i10 == 1836019558) {
            y(bVar);
        } else {
            if (this.f23591n.isEmpty()) {
                return;
            }
            this.f23591n.peek().b(bVar);
        }
    }

    private void w(a0 a0Var) {
        long jF1;
        String str;
        long jF2;
        String str2;
        long J;
        long jA;
        if (this.J.length == 0) {
            return;
        }
        a0Var.W(8);
        int iP = p9.b.p(a0Var.q());
        if (iP == 0) {
            String str3 = (String) x7.a.e(a0Var.B());
            String str4 = (String) x7.a.e(a0Var.B());
            long J2 = a0Var.J();
            jF1 = l0.f1(a0Var.J(), 1000000L, J2);
            long j10 = this.B;
            long j11 = j10 != -9223372036854775807L ? j10 + jF1 : -9223372036854775807L;
            str = str3;
            jF2 = l0.f1(a0Var.J(), 1000L, J2);
            str2 = str4;
            J = a0Var.J();
            jA = j11;
        } else {
            if (iP != 1) {
                x7.r.h("FragmentedMp4Extractor", "Skipping unsupported emsg version: " + iP);
                return;
            }
            long J3 = a0Var.J();
            jA = l0.f1(a0Var.O(), 1000000L, J3);
            long jF3 = l0.f1(a0Var.J(), 1000L, J3);
            long J4 = a0Var.J();
            str = (String) x7.a.e(a0Var.B());
            jF2 = jF3;
            J = J4;
            str2 = (String) x7.a.e(a0Var.B());
            jF1 = -9223372036854775807L;
        }
        byte[] bArr = new byte[a0Var.a()];
        a0Var.l(bArr, 0, a0Var.a());
        a0 a0Var2 = new a0(this.f23589l.a(new g9.a(str, str2, jF2, J, bArr)));
        int iA = a0Var2.a();
        for (o0 o0Var : this.J) {
            a0Var2.W(0);
            o0Var.b(a0Var2, iA);
        }
        if (jA == -9223372036854775807L) {
            this.f23592o.addLast(new a(jF1, true, iA));
            this.f23602y += iA;
            return;
        }
        if (!this.f23592o.isEmpty()) {
            this.f23592o.addLast(new a(jA, false, iA));
            this.f23602y += iA;
            return;
        }
        g0 g0Var = this.f23588k;
        if (g0Var != null && !g0Var.g()) {
            this.f23592o.addLast(new a(jA, false, iA));
            this.f23602y += iA;
            return;
        }
        g0 g0Var2 = this.f23588k;
        if (g0Var2 != null) {
            jA = g0Var2.a(jA);
        }
        for (o0 o0Var2 : this.J) {
            o0Var2.f(jA, 1, iA, 0, null);
        }
    }

    private void x(y7.c.C0487c c0487c, long j10) throws ParserException {
        if (!this.f23591n.isEmpty()) {
            this.f23591n.peek().c(c0487c);
            return;
        }
        int i10 = c0487c.f28684a;
        if (i10 != 1936286840) {
            if (i10 == 1701671783) {
                w(c0487c.f28688b);
            }
        } else {
            Pair<Long, v8.g> pairI = I(c0487c.f28688b, j10);
            this.B = ((Long) pairI.first).longValue();
            this.I.h((j0) pairI.second);
            this.L = true;
        }
    }

    private void y(y7.c.b bVar) throws ParserException {
        C(bVar, this.f23582e, this.f23580c != null, this.f23579b, this.f23586i);
        u7.l lVarN = n(bVar.f28686c);
        if (lVarN != null) {
            int size = this.f23582e.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f23582e.valueAt(i10).n(lVarN);
            }
        }
        if (this.f23603z != -9223372036854775807L) {
            int size2 = this.f23582e.size();
            for (int i11 = 0; i11 < size2; i11++) {
                this.f23582e.valueAt(i11).l(this.f23603z);
            }
            this.f23603z = -9223372036854775807L;
        }
    }

    private void z(y7.c.b bVar) throws ParserException {
        int i10 = 0;
        x7.a.h(this.f23580c == null, "Unexpected moov box.");
        u7.l lVarN = n(bVar.f28686c);
        y7.c.b bVar2 = (y7.c.b) x7.a.e(bVar.d(1836475768));
        SparseArray<c> sparseArray = new SparseArray<>();
        int size = bVar2.f28686c.size();
        long jB = -9223372036854775807L;
        for (int i11 = 0; i11 < size; i11++) {
            y7.c.C0487c c0487c = bVar2.f28686c.get(i11);
            int i12 = c0487c.f28684a;
            if (i12 == 1953654136) {
                Pair<Integer, c> pairM = M(c0487c.f28688b);
                sparseArray.put(((Integer) pairM.first).intValue(), (c) pairM.second);
            } else if (i12 == 1835362404) {
                jB = B(c0487c.f28688b);
            }
        }
        List<w> listG = p9.b.G(bVar, new b0(), jB, lVarN, (this.f23579b & 16) != 0, false, new com.google.common.base.g() { // from class: p9.f
            @Override // com.google.common.base.g
            public final Object apply(Object obj) {
                return this.f23576a.u((t) obj);
            }
        });
        int size2 = listG.size();
        if (this.f23582e.size() != 0) {
            x7.a.g(this.f23582e.size() == size2);
            while (i10 < size2) {
                w wVar = listG.get(i10);
                t tVar = wVar.f23703a;
                this.f23582e.get(tVar.f23668a).j(wVar, m(sparseArray, tVar.f23668a));
                i10++;
            }
            return;
        }
        String strA = k.a(listG);
        while (i10 < size2) {
            w wVar2 = listG.get(i10);
            t tVar2 = wVar2.f23703a;
            o0 o0VarE = this.I.e(i10, tVar2.f23669b);
            o0VarE.g(tVar2.f23672e);
            this.f23582e.put(tVar2.f23668a, new b(o0VarE, wVar2, m(sparseArray, tVar2.f23668a), strA));
            this.A = Math.max(this.A, tVar2.f23672e);
            i10++;
        }
        this.I.r();
    }

    @Override // v8.p
    public void a(long j10, long j11) {
        int size = this.f23582e.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f23582e.valueAt(i10).k();
        }
        this.f23592o.clear();
        this.f23602y = 0;
        this.f23593p.b();
        this.f23603z = j11;
        this.f23591n.clear();
        k();
    }

    @Override // v8.p
    public void c(v8.r rVar) {
        if ((this.f23579b & 32) == 0) {
            rVar = new s9.s(rVar, this.f23578a);
        }
        this.I = rVar;
        k();
        q();
        t tVar = this.f23580c;
        if (tVar != null) {
            this.f23582e.put(0, new b(this.I.e(0, tVar.f23669b), new w(this.f23580c, new long[0], new int[0], 0, new long[0], new int[0], 0L), new c(0, 0, 0, 0), k.b(this.f23580c.f23674g)));
            this.I.r();
        }
    }

    @Override // v8.p
    public boolean e(v8.q qVar) throws IOException {
        n0 n0VarB = s.b(qVar);
        this.f23595r = n0VarB != null ? com.google.common.collect.u.I(n0VarB) : com.google.common.collect.u.H();
        return n0VarB == null;
    }

    @Override // v8.p
    public int l(v8.q qVar, i0 i0Var) throws IOException {
        while (true) {
            int i10 = this.f23596s;
            if (i10 != 0) {
                if (i10 == 1) {
                    S(qVar);
                } else if (i10 == 2) {
                    T(qVar);
                } else if (U(qVar)) {
                    return 0;
                }
            } else if (!R(qVar)) {
                this.f23593p.d();
                return -1;
            }
        }
    }

    @Override // v8.p
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public com.google.common.collect.u<n0> i() {
        return this.f23595r;
    }

    @Override // v8.p
    public void release() {
    }

    protected t u(t tVar) {
        return tVar;
    }

    private static void F(y7.c.b bVar, String str, v vVar) throws ParserException {
        byte[] bArr = null;
        a0 a0Var = null;
        a0 a0Var2 = null;
        for (int i10 = 0; i10 < bVar.f28686c.size(); i10++) {
            y7.c.C0487c c0487c = bVar.f28686c.get(i10);
            a0 a0Var3 = c0487c.f28688b;
            int i11 = c0487c.f28684a;
            if (i11 == 1935828848) {
                a0Var3.W(12);
                if (a0Var3.q() == 1936025959) {
                    a0Var = a0Var3;
                }
            } else if (i11 == 1936158820) {
                a0Var3.W(12);
                if (a0Var3.q() == 1936025959) {
                    a0Var2 = a0Var3;
                }
            }
        }
        if (a0Var == null || a0Var2 == null) {
            return;
        }
        a0Var.W(8);
        int iP = p9.b.p(a0Var.q());
        a0Var.X(4);
        if (iP == 1) {
            a0Var.X(4);
        }
        if (a0Var.q() != 1) {
            throw ParserException.f(vgmm.SLCefIKY);
        }
        a0Var2.W(8);
        int iP2 = p9.b.p(a0Var2.q());
        a0Var2.X(4);
        if (iP2 == 1) {
            if (a0Var2.J() == 0) {
                throw ParserException.f("Variable length description in sgpd found (unsupported)");
            }
        } else if (iP2 >= 2) {
            a0Var2.X(4);
        }
        if (a0Var2.J() != 1) {
            throw ParserException.f("Entry count in sgpd != 1 (unsupported).");
        }
        a0Var2.X(1);
        int iH = a0Var2.H();
        int i12 = (iH & 240) >> 4;
        int i13 = iH & 15;
        boolean z10 = a0Var2.H() == 1;
        if (z10) {
            int iH2 = a0Var2.H();
            byte[] bArr2 = new byte[16];
            a0Var2.l(bArr2, 0, 16);
            if (iH2 == 0) {
                int iH3 = a0Var2.H();
                bArr = new byte[iH3];
                a0Var2.l(bArr, 0, iH3);
            }
            vVar.f23696l = true;
            vVar.f23698n = new u(z10, str, iH2, bArr2, i12, i13, bArr);
        }
    }

    public h(s9.r.a aVar, int i10, g0 g0Var, t tVar, List<u7.q> list, o0 o0Var) {
        this.f23578a = aVar;
        this.f23579b = i10;
        this.f23588k = g0Var;
        this.f23580c = tVar;
        this.f23581d = Collections.unmodifiableList(list);
        this.f23594q = o0Var;
        this.f23589l = new g9.c();
        this.f23590m = new a0(16);
        this.f23583f = new a0(y7.f.f28694a);
        this.f23584g = new a0(6);
        this.f23585h = new a0();
        byte[] bArr = new byte[16];
        this.f23586i = bArr;
        this.f23587j = new a0(bArr);
        this.f23591n = new ArrayDeque<>();
        this.f23592o = new ArrayDeque<>();
        this.f23582e = new SparseArray<>();
        this.f23595r = com.google.common.collect.u.H();
        this.A = -9223372036854775807L;
        this.f23603z = -9223372036854775807L;
        this.B = -9223372036854775807L;
        this.I = v8.r.Y8;
        this.J = new o0[0];
        this.K = new o0[0];
        this.f23593p = new y7.i(new y7.i.b() { // from class: p9.g
            @Override // y7.i.b
            public final void a(long j10, a0 a0Var) {
                this.f23577a.s(j10, a0Var);
            }
        });
    }
}
