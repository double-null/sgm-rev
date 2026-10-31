package p9;

import android.util.Pair;
import c2.YDwL.tFQWuE;
import g7.EinF.ZHgPsTG;
import io.bidmachine.media3.common.ParserException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import v8.b0;
import v8.c0;
import v8.h0;
import v8.r0;
import x7.a0;
import x7.l0;
import x7.z;

/* JADX INFO: compiled from: BoxParser.java */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f23525a = l0.u0("OpusHead");

    /* JADX INFO: compiled from: BoxParser.java */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f23526a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f23527b;

        public a(long j10, long j11) {
            this.f23526a = j10;
            this.f23527b = j11;
        }
    }

    /* JADX INFO: renamed from: p9.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BoxParser.java */
    private static final class C0391b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f23528a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f23529b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f23530c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f23531d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f23532e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final a0 f23533f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final a0 f23534g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f23535h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f23536i;

        public C0391b(a0 a0Var, a0 a0Var2, boolean z10) throws ParserException {
            this.f23534g = a0Var;
            this.f23533f = a0Var2;
            this.f23532e = z10;
            a0Var2.W(12);
            this.f23528a = a0Var2.L();
            a0Var.W(12);
            this.f23536i = a0Var.L();
            v8.s.a(a0Var.q() == 1, "first_chunk must be 1");
            this.f23529b = -1;
        }

        public boolean a() {
            int i10 = this.f23529b + 1;
            this.f23529b = i10;
            if (i10 == this.f23528a) {
                return false;
            }
            this.f23531d = this.f23532e ? this.f23533f.O() : this.f23533f.J();
            if (this.f23529b == this.f23535h) {
                this.f23530c = this.f23534g.L();
                this.f23534g.X(4);
                int i11 = this.f23536i - 1;
                this.f23536i = i11;
                this.f23535h = i11 > 0 ? this.f23534g.L() - 1 : -1;
            }
            return true;
        }
    }

    /* JADX INFO: compiled from: BoxParser.java */
    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f23537a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final byte[] f23538b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f23539c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f23540d;

        public c(String str, byte[] bArr, long j10, long j11) {
            this.f23537a = str;
            this.f23538b = bArr;
            this.f23539c = j10;
            this.f23540d = j11;
        }
    }

    /* JADX INFO: compiled from: BoxParser.java */
    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final g f23541a;

        public d(g gVar) {
            this.f23541a = gVar;
        }
    }

    /* JADX INFO: compiled from: BoxParser.java */
    private static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f23542a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f23543b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f23544c;

        public e(long j10, long j11, String str) {
            this.f23542a = j10;
            this.f23543b = j11;
            this.f23544c = str;
        }
    }

    /* JADX INFO: compiled from: BoxParser.java */
    private interface f {
        int a();

        int b();

        int c();
    }

    /* JADX INFO: compiled from: BoxParser.java */
    private static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f23545a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f23546b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f23547c;

        public g(boolean z10, boolean z11, boolean z12) {
            this.f23545a = z10;
            this.f23546b = z11;
            this.f23547c = z12;
        }
    }

    /* JADX INFO: compiled from: BoxParser.java */
    private static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final u[] f23548a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public u7.q f23549b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f23550c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f23551d = 0;

        public h(int i10) {
            this.f23548a = new u[i10];
        }
    }

    /* JADX INFO: compiled from: BoxParser.java */
    static final class i implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f23552a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f23553b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final a0 f23554c;

        public i(y7.c.C0487c c0487c, u7.q qVar) {
            a0 a0Var = c0487c.f28688b;
            this.f23554c = a0Var;
            a0Var.W(12);
            int iL = a0Var.L();
            if ("audio/raw".equals(qVar.f26252o)) {
                int iK0 = l0.k0(qVar.G, qVar.E);
                if (iL == 0 || iL % iK0 != 0) {
                    x7.r.h("BoxParsers", "Audio sample size mismatch. stsd sample size: " + iK0 + ", stsz sample size: " + iL);
                    iL = iK0;
                }
            }
            this.f23552a = iL == 0 ? -1 : iL;
            this.f23553b = a0Var.L();
        }

        @Override // p9.b.f
        public int a() {
            int i10 = this.f23552a;
            return i10 == -1 ? this.f23554c.L() : i10;
        }

        @Override // p9.b.f
        public int b() {
            return this.f23552a;
        }

        @Override // p9.b.f
        public int c() {
            return this.f23553b;
        }
    }

    /* JADX INFO: compiled from: BoxParser.java */
    static final class j implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a0 f23555a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f23556b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f23557c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f23558d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f23559e;

        public j(y7.c.C0487c c0487c) {
            a0 a0Var = c0487c.f28688b;
            this.f23555a = a0Var;
            a0Var.W(12);
            this.f23557c = a0Var.L() & 255;
            this.f23556b = a0Var.L();
        }

        @Override // p9.b.f
        public int a() {
            int i10 = this.f23557c;
            if (i10 == 8) {
                return this.f23555a.H();
            }
            if (i10 == 16) {
                return this.f23555a.P();
            }
            int i11 = this.f23558d;
            this.f23558d = i11 + 1;
            if (i11 % 2 != 0) {
                return this.f23559e & 15;
            }
            int iH = this.f23555a.H();
            this.f23559e = iH;
            return (iH & 240) >> 4;
        }

        @Override // p9.b.f
        public int b() {
            return -1;
        }

        @Override // p9.b.f
        public int c() {
            return this.f23556b;
        }
    }

    /* JADX INFO: compiled from: BoxParser.java */
    private static final class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f23560a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f23561b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f23562c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f23563d;

        public k(int i10, long j10, int i11, int i12) {
            this.f23560a = i10;
            this.f23561b = j10;
            this.f23562c = i11;
            this.f23563d = i12;
        }
    }

    /* JADX INFO: compiled from: BoxParser.java */
    static final class l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f23564a;

        public l(d dVar) {
            this.f23564a = dVar;
        }

        public boolean b() {
            d dVar = this.f23564a;
            return dVar != null && dVar.f23541a.f23545a && this.f23564a.f23541a.f23546b;
        }
    }

    private static d B(a0 a0Var, int i10, int i11) throws ParserException {
        a0Var.W(i10 + 8);
        int iF = a0Var.f();
        while (iF - i10 < i11) {
            a0Var.W(iF);
            int iQ = a0Var.q();
            v8.s.a(iQ > 0, "childAtomSize must be positive");
            if (a0Var.q() == 1937011305) {
                a0Var.X(4);
                int iH = a0Var.H() & 15;
                return new d(new g((iH & 1) == 1, (iH & 2) == 2, (iH & 8) == 8));
            }
            iF += iQ;
        }
        return null;
    }

    private static h C(a0 a0Var, int i10, int i11, String str, u7.l lVar, boolean z10) throws ParserException {
        int i12;
        a0Var.W(12);
        int iQ = a0Var.q();
        h hVar = new h(iQ);
        for (int i13 = 0; i13 < iQ; i13++) {
            int iF = a0Var.f();
            int iQ2 = a0Var.q();
            v8.s.a(iQ2 > 0, "childAtomSize must be positive");
            int iQ3 = a0Var.q();
            if (iQ3 == 1635148593 || iQ3 == 1635148595 || iQ3 == 1701733238 || iQ3 == 1831958048 || iQ3 == 1836070006 || iQ3 == 1752589105 || iQ3 == 1751479857 || iQ3 == 1932670515 || iQ3 == 1211250227 || iQ3 == 1748121139 || iQ3 == 1987063864 || iQ3 == 1987063865 || iQ3 == 1635135537 || iQ3 == 1685479798 || iQ3 == 1685479729 || iQ3 == 1685481573 || iQ3 == 1685481521 || iQ3 == 1634760241) {
                i12 = iF;
                K(a0Var, iQ3, i12, iQ2, i10, str, i11, lVar, hVar, i13);
            } else if (iQ3 == 1836069985 || iQ3 == 1701733217 || iQ3 == 1633889587 || iQ3 == 1700998451 || iQ3 == 1633889588 || iQ3 == 1835823201 || iQ3 == 1685353315 || iQ3 == 1685353317 || iQ3 == 1685353320 || iQ3 == 1685353324 || iQ3 == 1685353336 || iQ3 == 1935764850 || iQ3 == 1935767394 || iQ3 == 1819304813 || iQ3 == 1936684916 || iQ3 == 1953984371 || iQ3 == 778924082 || iQ3 == 778924083 || iQ3 == 1835557169 || iQ3 == 1835560241 || iQ3 == 1634492771 || iQ3 == 1634492791 || iQ3 == 1970037111 || iQ3 == 1332770163 || iQ3 == 1716281667 || iQ3 == 1767992678) {
                i12 = iF;
                h(a0Var, iQ3, iF, iQ2, i10, str, z10, lVar, hVar, i13);
            } else {
                if (iQ3 == 1414810956 || iQ3 == 1954034535 || iQ3 == 2004251764 || iQ3 == 1937010800 || iQ3 == 1664495672) {
                    D(a0Var, iQ3, iF, iQ2, i10, str, hVar);
                } else if (iQ3 == 1835365492) {
                    u(a0Var, iQ3, iF, i10, hVar);
                } else if (iQ3 == 1667329389) {
                    hVar.f23549b = new u7.q.b().e0(i10).u0("application/x-camera-motion").N();
                }
                i12 = iF;
            }
            a0Var.W(i12 + iQ2);
        }
        return hVar;
    }

    private static void D(a0 a0Var, int i10, int i11, int i12, int i13, String str, h hVar) {
        a0Var.W(i11 + 8 + 8);
        String str2 = "application/ttml+xml";
        com.google.common.collect.u uVarI = null;
        long j10 = Long.MAX_VALUE;
        if (i10 != 1414810956) {
            if (i10 == 1954034535) {
                int i14 = (i12 - 8) - 8;
                byte[] bArr = new byte[i14];
                a0Var.l(bArr, 0, i14);
                uVarI = com.google.common.collect.u.I(bArr);
                str2 = "application/x-quicktime-tx3g";
            } else if (i10 == 2004251764) {
                str2 = "application/x-mp4-vtt";
            } else if (i10 == 1937010800) {
                j10 = 0;
            } else {
                if (i10 != 1664495672) {
                    throw new IllegalStateException();
                }
                hVar.f23551d = 1;
                str2 = "application/x-mp4-cea-608";
            }
        }
        hVar.f23549b = new u7.q.b().e0(i13).u0(str2).j0(str).y0(j10).g0(uVarI).N();
    }

    private static k E(a0 a0Var) {
        boolean z10;
        int i10;
        int i11;
        a0Var.W(8);
        int iP = p(a0Var.q());
        a0Var.X(iP == 0 ? 8 : 16);
        int iQ = a0Var.q();
        a0Var.X(4);
        int iF = a0Var.f();
        int i12 = iP == 0 ? 4 : 8;
        int i13 = 0;
        while (true) {
            if (i13 >= i12) {
                z10 = true;
                break;
            }
            if (a0Var.e()[iF + i13] != -1) {
                z10 = false;
                break;
            }
            i13++;
        }
        long j10 = -9223372036854775807L;
        if (z10) {
            a0Var.X(i12);
        } else {
            long J = iP == 0 ? a0Var.J() : a0Var.O();
            if (J != 0) {
                j10 = J;
            }
        }
        a0Var.X(10);
        int iP2 = a0Var.P();
        a0Var.X(4);
        int iQ2 = a0Var.q();
        int iQ3 = a0Var.q();
        a0Var.X(4);
        int iQ4 = a0Var.q();
        int iQ5 = a0Var.q();
        if (iQ2 == 0 && iQ3 == 65536 && iQ4 == -65536 && iQ5 == 0) {
            i11 = 90;
        } else {
            if (iQ2 != 0 || iQ3 != -65536 || iQ4 != 65536 || iQ5 != 0) {
                if (iQ2 == -65536 && iQ3 == 0 && iQ4 == 0 && iQ5 == -65536) {
                    i11 = 180;
                } else {
                    i10 = 0;
                }
                return new k(iQ, j10, iP2, i10);
            }
            i11 = 270;
        }
        i10 = i11;
        return new k(iQ, j10, iP2, i10);
    }

    public static t F(y7.c.b bVar, y7.c.C0487c c0487c, long j10, u7.l lVar, boolean z10, boolean z11) throws ParserException {
        long[] jArr;
        long[] jArr2;
        u7.q qVarN;
        y7.c.b bVarD;
        Pair<long[], long[]> pairL;
        y7.c.b bVar2 = (y7.c.b) x7.a.e(bVar.d(1835297121));
        int iE = e(q(((y7.c.C0487c) x7.a.e(bVar2.e(1751411826))).f28688b));
        if (iE == -1) {
            return null;
        }
        k kVarE = E(((y7.c.C0487c) x7.a.e(bVar.e(1953196132))).f28688b);
        long j11 = j10 == -9223372036854775807L ? kVarE.f23561b : j10;
        long j12 = v(c0487c.f28688b).f28693c;
        long jF1 = j11 != -9223372036854775807L ? l0.f1(j11, 1000000L, j12) : -9223372036854775807L;
        y7.c.b bVar3 = (y7.c.b) x7.a.e(((y7.c.b) x7.a.e(bVar2.d(1835626086))).d(1937007212));
        e eVarS = s(((y7.c.C0487c) x7.a.e(bVar2.e(1835296868))).f28688b);
        y7.c.C0487c c0487cE = bVar3.e(1937011556);
        if (c0487cE == null) {
            throw ParserException.b("Malformed sample table (stbl) missing sample description (stsd)", null);
        }
        h hVarC = C(c0487cE.f28688b, kVarE.f23560a, kVarE.f23563d, eVarS.f23544c, lVar, z11);
        if (z10 || (bVarD = bVar.d(1701082227)) == null || (pairL = l(bVarD)) == null) {
            jArr = null;
            jArr2 = null;
        } else {
            long[] jArr3 = (long[]) pairL.first;
            jArr2 = (long[]) pairL.second;
            jArr = jArr3;
        }
        if (hVarC.f23549b == null) {
            return null;
        }
        if (kVarE.f23562c != 0) {
            y7.b bVar4 = new y7.b(kVarE.f23562c);
            u7.q.b bVarB = hVarC.f23549b.b();
            u7.v vVar = hVarC.f23549b.f26249l;
            qVarN = bVarB.n0(vVar != null ? vVar.a(bVar4) : new u7.v(bVar4)).N();
        } else {
            qVarN = hVarC.f23549b;
        }
        return new t(kVarE.f23560a, iE, eVarS.f23542a, j12, jF1, eVarS.f23543b, qVarN, hVarC.f23551d, hVarC.f23548a, hVarC.f23550c, jArr, jArr2);
    }

    public static List<w> G(y7.c.b bVar, b0 b0Var, long j10, u7.l lVar, boolean z10, boolean z11, com.google.common.base.g<t, t> gVar) throws ParserException {
        t tVarApply;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < bVar.f28687d.size(); i10++) {
            y7.c.b bVar2 = bVar.f28687d.get(i10);
            if (bVar2.f28684a == 1953653099 && (tVarApply = gVar.apply(F(bVar2, (y7.c.C0487c) x7.a.e(bVar.e(1836476516)), j10, lVar, z10, z11))) != null) {
                arrayList.add(A(tVarApply, (y7.c.b) x7.a.e(((y7.c.b) x7.a.e(((y7.c.b) x7.a.e(bVar2.d(1835297121))).d(1835626086))).d(1937007212)), b0Var));
            }
        }
        return arrayList;
    }

    public static u7.v H(y7.c.C0487c c0487c) {
        a0 a0Var = c0487c.f28688b;
        a0Var.W(8);
        u7.v vVar = new u7.v(new u7.v.a[0]);
        while (a0Var.a() >= 8) {
            int iF = a0Var.f();
            int iQ = a0Var.q();
            int iQ2 = a0Var.q();
            if (iQ2 == 1835365473) {
                a0Var.W(iF);
                vVar = vVar.b(I(a0Var, iF + iQ));
            } else if (iQ2 == 1936553057) {
                a0Var.W(iF);
                vVar = vVar.b(r.b(a0Var, iF + iQ));
            } else if (iQ2 == -1451722374) {
                vVar = vVar.b(L(a0Var));
            }
            a0Var.W(iF + iQ);
        }
        return vVar;
    }

    private static u7.v I(a0 a0Var, int i10) {
        a0Var.X(8);
        f(a0Var);
        while (a0Var.f() < i10) {
            int iF = a0Var.f();
            int iQ = a0Var.q();
            if (a0Var.q() == 1768715124) {
                a0Var.W(iF);
                return r(a0Var, iF + iQ);
            }
            a0Var.W(iF + iQ);
        }
        return null;
    }

    static l J(a0 a0Var, int i10, int i11) throws ParserException {
        a0Var.W(i10 + 8);
        int iF = a0Var.f();
        d dVarB = null;
        while (iF - i10 < i11) {
            a0Var.W(iF);
            int iQ = a0Var.q();
            v8.s.a(iQ > 0, "childAtomSize must be positive");
            if (a0Var.q() == 1702454643) {
                dVarB = B(a0Var, iF, iQ);
            }
            iF += iQ;
        }
        if (dVarB == null) {
            return null;
        }
        return new l(dVarB);
    }

    /* JADX WARN: Code duplicated, block: B:203:0x04a9  */
    private static void K(a0 a0Var, int i10, int i11, int i12, int i13, String str, int i14, u7.l lVar, h hVar, int i15) throws ParserException {
        String str2;
        u7.l lVar2;
        int i16;
        int i17;
        int i18;
        int i19;
        List<byte[]> list;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25 = i11;
        int i26 = i12;
        u7.l lVarC = lVar;
        h hVar2 = hVar;
        int i27 = 8;
        a0Var.W(i25 + 8 + 8);
        a0Var.X(16);
        int iP = a0Var.P();
        int iP2 = a0Var.P();
        a0Var.X(50);
        int iF = a0Var.f();
        int iIntValue = i10;
        if (iIntValue == 1701733238) {
            Pair<Integer, u> pairY = y(a0Var, i25, i26);
            if (pairY != null) {
                iIntValue = ((Integer) pairY.first).intValue();
                lVarC = lVarC == null ? null : lVarC.c(((u) pairY.second).f23681b);
                hVar2.f23548a[i15] = (u) pairY.second;
            }
            a0Var.W(iF);
        }
        String str3 = "video/3gpp";
        if (iIntValue == 1831958048) {
            str2 = "video/mpeg";
        } else {
            str2 = iIntValue == 1211250227 ? "video/3gpp" : null;
        }
        float fW = 1.0f;
        List<byte[]> listI = null;
        String str4 = null;
        byte[] bArrX = null;
        int i28 = -1;
        int i29 = -1;
        int i30 = -1;
        int iJ = -1;
        int i31 = -1;
        int iK = -1;
        ByteBuffer byteBuffer = null;
        a aVarJ = null;
        c cVarM = null;
        y7.f.k kVar = null;
        boolean z10 = false;
        String str5 = str2;
        int i32 = iF;
        int i33 = 8;
        while (i32 - i25 < i26) {
            a0Var.W(i32);
            int iF2 = a0Var.f();
            int iQ = a0Var.q();
            if (iQ == 0 && a0Var.f() - i25 == i26) {
                break;
            }
            v8.s.a(iQ > 0, "childAtomSize must be positive");
            int iQ2 = a0Var.q();
            if (iQ2 == 1635148611) {
                v8.s.a(str5 == null, null);
                a0Var.W(iF2 + 8);
                v8.d dVarB = v8.d.b(a0Var);
                listI = dVarB.f27271a;
                hVar2.f23550c = dVarB.f27272b;
                if (!z10) {
                    fW = dVarB.f27281k;
                }
                String str6 = dVarB.f27282l;
                int i34 = dVarB.f27280j;
                int i35 = dVarB.f27277g;
                int i36 = dVarB.f27278h;
                int i37 = dVarB.f27279i;
                i22 = dVarB.f27275e;
                lVar2 = lVarC;
                i29 = i34;
                iJ = i35;
                i16 = i36;
                iK = i37;
                str5 = "video/avc";
                i33 = dVarB.f27276f;
                str4 = str6;
            } else {
                if (iQ2 == 1752589123) {
                    v8.s.a(str5 == null, null);
                    a0Var.W(iF2 + 8);
                    c0 c0VarA = c0.a(a0Var);
                    listI = c0VarA.f27256a;
                    hVar2.f23550c = c0VarA.f27257b;
                    if (!z10) {
                        fW = c0VarA.f27267l;
                    }
                    int i38 = c0VarA.f27268m;
                    int i39 = c0VarA.f27258c;
                    String str7 = c0VarA.f27269n;
                    int i40 = c0VarA.f27266k;
                    if (i40 != -1) {
                        i28 = i40;
                    }
                    int i41 = c0VarA.f27263h;
                    int i42 = c0VarA.f27264i;
                    int i43 = c0VarA.f27265j;
                    int i44 = c0VarA.f27261f;
                    int i45 = c0VarA.f27262g;
                    kVar = c0VarA.f27270o;
                    lVar2 = lVarC;
                    iP2 = iP2;
                    iIntValue = iIntValue;
                    iJ = i41;
                    i16 = i42;
                    iK = i43;
                    str5 = "video/hevc";
                    i29 = i38;
                    str4 = str7;
                    i33 = i45;
                    i30 = i39;
                    i27 = i44;
                } else {
                    lVar2 = lVarC;
                    if (iQ2 == 1818785347) {
                        v8.s.a("video/hevc".equals(str5), "lhvC must follow hvcC atom");
                        y7.f.k kVar2 = kVar;
                        v8.s.a(kVar2 != null && kVar2.f28747b.size() >= 2, "must have at least two layers");
                        a0Var.W(iF2 + 8);
                        c0 c0VarC = c0.c(a0Var, (y7.f.k) x7.a.e(kVar2));
                        v8.s.a(hVar2.f23550c == c0VarC.f27257b, "nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms");
                        int i46 = c0VarC.f27263h;
                        int i47 = iJ;
                        if (i46 != -1) {
                            v8.s.a(i47 == i46, "colorSpace must be the same for both views");
                        }
                        int i48 = c0VarC.f27264i;
                        int i49 = i31;
                        if (i48 != -1) {
                            v8.s.a(i49 == i48, "colorRange must be the same for both views");
                        }
                        int i50 = c0VarC.f27265j;
                        if (i50 != -1) {
                            i24 = iK;
                            v8.s.a(i24 == i50, "colorTransfer must be the same for both views");
                        } else {
                            i24 = iK;
                        }
                        v8.s.a(i27 == c0VarC.f27261f, "bitdepthLuma must be the same for both views");
                        v8.s.a(i33 == c0VarC.f27262g, "bitdepthChroma must be the same for both views");
                        if (listI != null) {
                            listI = com.google.common.collect.u.v().k(listI).k(c0VarC.f27256a).m();
                        } else {
                            v8.s.a(false, "initializationData must be already set from hvcC atom");
                        }
                        kVar = kVar2;
                        iP2 = iP2;
                        iIntValue = iIntValue;
                        iK = i24;
                        i16 = i49;
                        iJ = i47;
                        str4 = c0VarC.f27269n;
                        str5 = "video/mv-hevc";
                    } else {
                        iJ = iJ;
                        i16 = i31;
                        int i51 = iK;
                        y7.f.k kVar3 = kVar;
                        if (iQ2 == 1986361461) {
                            l lVarJ = J(a0Var, iF2, iQ);
                            if (lVarJ == null || lVarJ.f23564a == null) {
                                i23 = i28;
                                i28 = i23;
                            } else if (kVar3 == null || kVar3.f28747b.size() < 2) {
                                i23 = i28;
                                if (i23 == -1) {
                                    i28 = lVarJ.f23564a.f23541a.f23547c ? 5 : 4;
                                } else {
                                    i28 = i23;
                                }
                            } else {
                                v8.s.a(lVarJ.b(), "both eye views must be marked as available");
                                v8.s.a(!lVarJ.f23564a.f23541a.f23547c, "for MV-HEVC, eye_views_reversed must be set to false");
                                i23 = i28;
                                i28 = i23;
                            }
                            kVar = kVar3;
                            iP2 = iP2;
                            iIntValue = iIntValue;
                            iK = i51;
                            iJ = iJ;
                        } else {
                            int i52 = i28;
                            if (iQ2 == 1685480259 || iQ2 == 1685485123) {
                                i17 = i52;
                                i18 = i27;
                                iP2 = iP2;
                                i19 = i33;
                                iIntValue = iIntValue;
                                list = listI;
                                i20 = iJ;
                                v8.n nVarA = v8.n.a(a0Var);
                                if (nVarA != null) {
                                    str5 = "video/dolby-vision";
                                    str4 = nVarA.f27387c;
                                }
                            } else if (iQ2 == 1987076931) {
                                v8.s.a(str5 == null, null);
                                String str8 = iIntValue == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                a0Var.W(iF2 + 12);
                                byte bH = (byte) a0Var.H();
                                byte bH2 = (byte) a0Var.H();
                                int iH = a0Var.H();
                                int i53 = iH >> 4;
                                byte b10 = (byte) ((iH >> 1) & 7);
                                if (str8.equals("video/x-vnd.on2.vp9")) {
                                    listI = x7.i.h(bH, bH2, (byte) i53, b10);
                                }
                                boolean z11 = (iH & 1) != 0;
                                int iH2 = a0Var.H();
                                int iH3 = a0Var.H();
                                int iJ2 = u7.g.j(iH2);
                                int i54 = z11 ? 1 : 2;
                                iK = u7.g.k(iH3);
                                str5 = str8;
                                iJ = iJ2;
                                iP2 = iP2;
                                i27 = i53;
                                i33 = i27;
                                kVar = kVar3;
                                i16 = i54;
                                i28 = i52;
                                iIntValue = iIntValue;
                            } else if (iQ2 == 1635135811) {
                                int i55 = iQ - 8;
                                byte[] bArr = new byte[i55];
                                a0Var.l(bArr, 0, i55);
                                listI = com.google.common.collect.u.I(bArr);
                                a0Var.W(iF2 + 8);
                                u7.g gVarI = i(a0Var);
                                i22 = gVarI.f26080e;
                                int i56 = gVarI.f26081f;
                                int i57 = gVarI.f26076a;
                                int i58 = gVarI.f26077b;
                                iK = gVarI.f26078c;
                                iJ = i57;
                                i16 = i58;
                                str5 = "video/av01";
                                kVar = kVar3;
                                i28 = i52;
                                i33 = i56;
                            } else if (iQ2 == 1668050025) {
                                ByteBuffer byteBufferA = byteBuffer == null ? a() : byteBuffer;
                                byteBufferA.position(21);
                                byteBufferA.putShort(a0Var.D());
                                byteBufferA.putShort(a0Var.D());
                                byteBuffer = byteBufferA;
                                iP2 = iP2;
                                iIntValue = iIntValue;
                                iK = i51;
                                kVar = kVar3;
                                iJ = iJ;
                                i28 = i52;
                            } else {
                                if (iQ2 == 1835295606) {
                                    ByteBuffer byteBufferA2 = byteBuffer == null ? a() : byteBuffer;
                                    short sD = a0Var.D();
                                    short sD2 = a0Var.D();
                                    iIntValue = iIntValue;
                                    short sD3 = a0Var.D();
                                    short sD4 = a0Var.D();
                                    int i59 = i33;
                                    short sD5 = a0Var.D();
                                    int i60 = i27;
                                    short sD6 = a0Var.D();
                                    List<byte[]> list2 = listI;
                                    short sD7 = a0Var.D();
                                    i17 = i52;
                                    short sD8 = a0Var.D();
                                    long J = a0Var.J();
                                    long J2 = a0Var.J();
                                    iP2 = iP2;
                                    byteBufferA2.position(1);
                                    byteBufferA2.putShort(sD5);
                                    byteBufferA2.putShort(sD6);
                                    byteBufferA2.putShort(sD);
                                    byteBufferA2.putShort(sD2);
                                    byteBufferA2.putShort(sD3);
                                    byteBufferA2.putShort(sD4);
                                    byteBufferA2.putShort(sD7);
                                    byteBufferA2.putShort(sD8);
                                    byteBufferA2.putShort((short) (J / 10000));
                                    byteBufferA2.putShort((short) (J2 / 10000));
                                    byteBuffer = byteBufferA2;
                                    i33 = i59;
                                    i27 = i60;
                                    listI = list2;
                                } else {
                                    i17 = i52;
                                    i18 = i27;
                                    iP2 = iP2;
                                    i19 = i33;
                                    iIntValue = iIntValue;
                                    list = listI;
                                    if (iQ2 == 1681012275) {
                                        v8.s.a(str5 == null, null);
                                        str5 = str3;
                                    } else if (iQ2 == 1702061171) {
                                        v8.s.a(str5 == null, null);
                                        cVarM = m(a0Var, iF2);
                                        String str9 = cVarM.f23537a;
                                        byte[] bArr2 = cVarM.f23538b;
                                        listI = bArr2 != null ? com.google.common.collect.u.I(bArr2) : list;
                                        str5 = str9;
                                        i33 = i19;
                                        i27 = i18;
                                    } else if (iQ2 == 1651798644) {
                                        aVarJ = j(a0Var, iF2);
                                    } else if (iQ2 == 1885434736) {
                                        fW = w(a0Var, iF2);
                                        i33 = i19;
                                        i27 = i18;
                                        iJ = iJ;
                                        listI = list;
                                        z10 = true;
                                        iK = i51;
                                        kVar = kVar3;
                                        i28 = i17;
                                    } else if (iQ2 == 1937126244) {
                                        bArrX = x(a0Var, iF2, iQ);
                                    } else if (iQ2 == 1936995172) {
                                        int iH4 = a0Var.H();
                                        a0Var.X(3);
                                        if (iH4 != 0) {
                                            i21 = i17;
                                        } else {
                                            int iH5 = a0Var.H();
                                            if (iH5 == 0) {
                                                i21 = 0;
                                            } else if (iH5 == 1) {
                                                i21 = 1;
                                            } else if (iH5 == 2) {
                                                i21 = 2;
                                            } else if (iH5 != 3) {
                                                i21 = i17;
                                            } else {
                                                i21 = 3;
                                            }
                                        }
                                        i33 = i19;
                                        i27 = i18;
                                        listI = list;
                                        iK = i51;
                                        kVar = kVar3;
                                        i28 = i21;
                                        iJ = iJ;
                                    } else if (iQ2 == 1634760259) {
                                        int i61 = iQ - 12;
                                        byte[] bArr3 = new byte[i61];
                                        a0Var.W(iF2 + 12);
                                        a0Var.l(bArr3, 0, i61);
                                        listI = com.google.common.collect.u.I(bArr3);
                                        u7.g gVarG = g(new a0(bArr3));
                                        int i62 = gVarG.f26080e;
                                        int i63 = gVarG.f26081f;
                                        int i64 = gVarG.f26076a;
                                        int i65 = gVarG.f26077b;
                                        iK = gVarG.f26078c;
                                        iJ = i64;
                                        i16 = i65;
                                        str5 = "video/apv";
                                        kVar = kVar3;
                                        i28 = i17;
                                        i27 = i62;
                                        i33 = i63;
                                    } else if (iQ2 == 1668246642) {
                                        i20 = iJ;
                                        if (i20 == -1 && i51 == -1) {
                                            int iQ3 = a0Var.q();
                                            if (iQ3 == 1852009592 || iQ3 == 1852009571) {
                                                int iP3 = a0Var.P();
                                                int iP4 = a0Var.P();
                                                a0Var.X(2);
                                                boolean z12 = iQ == 19 && (a0Var.H() & 128) != 0;
                                                iJ = u7.g.j(iP3);
                                                int i66 = z12 ? 1 : 2;
                                                int iK2 = u7.g.k(iP4);
                                                i16 = i66;
                                                i33 = i19;
                                                i27 = i18;
                                                listI = list;
                                                iK = iK2;
                                            } else {
                                                x7.r.h("BoxParsers", "Unsupported color type: " + y7.c.a(iQ3));
                                            }
                                            kVar = kVar3;
                                            i28 = i17;
                                        }
                                    } else {
                                        i20 = iJ;
                                    }
                                    i33 = i19;
                                    i27 = i18;
                                    listI = list;
                                }
                                iK = i51;
                                kVar = kVar3;
                                i28 = i17;
                            }
                            iJ = i20;
                            i33 = i19;
                            i27 = i18;
                            listI = list;
                            iK = i51;
                            kVar = kVar3;
                            i28 = i17;
                        }
                    }
                }
                i32 += iQ;
                i25 = i11;
                i26 = i12;
                hVar2 = hVar;
                str3 = str3;
                iIntValue = iIntValue;
                lVarC = lVar2;
                i31 = i16;
                iP2 = iP2;
            }
            i27 = i22;
            i32 += iQ;
            i25 = i11;
            i26 = i12;
            hVar2 = hVar;
            str3 = str3;
            iIntValue = iIntValue;
            lVarC = lVar2;
            i31 = i16;
            iP2 = iP2;
        }
        u7.l lVar3 = lVarC;
        int i67 = i27;
        int i68 = iP2;
        List<byte[]> list3 = listI;
        int i69 = i28;
        int i70 = iJ;
        int i71 = i31;
        int i72 = iK;
        int i73 = i33;
        if (str5 == null) {
            return;
        }
        u7.q.b bVarT = new u7.q.b().e0(i13).u0(str5).S(str4).B0(iP).d0(i68).q0(fW).t0(i14).r0(bArrX).x0(i69).g0(list3).l0(i29).m0(i30).Y(lVar3).j0(str).T(new u7.g.b().d(i70).c(i71).e(i72).f(byteBuffer != null ? byteBuffer.array() : null).g(i67).b(i73).a());
        if (aVarJ != null) {
            bVarT.Q(com.google.common.primitives.f.l(aVarJ.f23526a)).p0(com.google.common.primitives.f.l(aVarJ.f23527b));
        } else if (cVarM != null) {
            bVarT.Q(com.google.common.primitives.f.l(cVarM.f23539c)).p0(com.google.common.primitives.f.l(cVarM.f23540d));
        }
        hVar.f23549b = bVarT.N();
    }

    private static u7.v L(a0 a0Var) {
        short sD = a0Var.D();
        a0Var.X(2);
        String strE = a0Var.E(sD);
        int iMax = Math.max(strE.lastIndexOf(43), strE.lastIndexOf(45));
        try {
            return new u7.v(new y7.d(Float.parseFloat(strE.substring(0, iMax)), Float.parseFloat(strE.substring(iMax, strE.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    private static ByteBuffer a() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    private static boolean b(long[] jArr, long j10, long j11, long j12) {
        int length = jArr.length - 1;
        return jArr[0] <= j11 && j11 < jArr[l0.p(4, 0, length)] && jArr[l0.p(jArr.length - 4, 0, length)] < j12 && j12 <= j10;
    }

    private static int c(a0 a0Var, int i10, int i11, int i12) throws ParserException {
        int iF = a0Var.f();
        v8.s.a(iF >= i11, null);
        while (iF - i11 < i12) {
            a0Var.W(iF);
            int iQ = a0Var.q();
            v8.s.a(iQ > 0, "childAtomSize must be positive");
            if (a0Var.q() == i10) {
                return iF;
            }
            iF += iQ;
        }
        return -1;
    }

    private static String d(int i10) {
        char[] cArr = {(char) (((i10 >> 10) & 31) + 96), (char) (((i10 >> 5) & 31) + 96), (char) ((i10 & 31) + 96)};
        for (int i11 = 0; i11 < 3; i11++) {
            char c10 = cArr[i11];
            if (c10 < 'a' || c10 > 'z') {
                return null;
            }
        }
        return new String(cArr);
    }

    private static int e(int i10) {
        if (i10 == 1936684398) {
            return 1;
        }
        if (i10 == 1986618469) {
            return 2;
        }
        if (i10 == 1952807028 || i10 == 1935832172 || i10 == 1937072756 || i10 == 1668047728) {
            return 3;
        }
        return i10 == 1835365473 ? 5 : -1;
    }

    public static void f(a0 a0Var) {
        int iF = a0Var.f();
        a0Var.X(4);
        if (a0Var.q() != 1751411826) {
            iF += 4;
        }
        a0Var.W(iF);
    }

    private static u7.g g(a0 a0Var) {
        u7.g.b bVar = new u7.g.b();
        z zVar = new z(a0Var.e());
        zVar.p(a0Var.f() * 8);
        zVar.s(1);
        int iH = zVar.h(8);
        for (int i10 = 0; i10 < iH; i10++) {
            zVar.s(1);
            int iH2 = zVar.h(8);
            for (int i11 = 0; i11 < iH2; i11++) {
                zVar.r(6);
                boolean zG = zVar.g();
                zVar.q();
                zVar.s(11);
                zVar.r(4);
                int iH3 = zVar.h(4) + 8;
                bVar.g(iH3);
                bVar.b(iH3);
                zVar.s(1);
                if (zG) {
                    int iH4 = zVar.h(8);
                    int iH5 = zVar.h(8);
                    zVar.s(1);
                    bVar.d(u7.g.j(iH4)).c(zVar.g() ? 1 : 2).e(u7.g.k(iH5));
                }
            }
        }
        return bVar.a();
    }

    /* JADX WARN: Code duplicated, block: B:142:0x01db  */
    /* JADX WARN: Code duplicated, block: B:144:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:145:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:148:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:150:0x020b  */
    /* JADX WARN: Code duplicated, block: B:151:0x021e  */
    /* JADX WARN: Code duplicated, block: B:154:0x023c  */
    /* JADX WARN: Code duplicated, block: B:155:0x0242  */
    /* JADX WARN: Code duplicated, block: B:156:0x024e  */
    /* JADX WARN: Code duplicated, block: B:158:0x0255  */
    /* JADX WARN: Code duplicated, block: B:160:0x0260  */
    /* JADX WARN: Code duplicated, block: B:162:0x0268  */
    /* JADX WARN: Code duplicated, block: B:163:0x026d  */
    /* JADX WARN: Code duplicated, block: B:166:0x0286  */
    /* JADX WARN: Code duplicated, block: B:212:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:214:0x040c  */
    /* JADX WARN: Code duplicated, block: B:215:0x040e  */
    /* JADX WARN: Code duplicated, block: B:218:0x0415  */
    /* JADX WARN: Code duplicated, block: B:220:0x0423  */
    /* JADX WARN: Code duplicated, block: B:222:0x042c  */
    /* JADX WARN: Code duplicated, block: B:223:0x0431  */
    /* JADX WARN: Code duplicated, block: B:225:0x0439  */
    /* JADX WARN: Code duplicated, block: B:245:0x044d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:246:0x044d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x008c  */
    /* JADX WARN: Code duplicated, block: B:94:0x014f  */
    private static void h(a0 a0Var, int i10, int i11, int i12, int i13, String str, boolean z10, u7.l lVar, h hVar, int i14) throws ParserException {
        int iP;
        int iP2;
        int I;
        int iQ;
        int i15;
        String str2;
        int i16;
        String str3;
        List<byte[]> listI;
        c cVarM;
        int iQ2;
        boolean z11;
        int iQ3;
        int iC;
        byte[] bArr;
        int iH;
        byte[] bArr2;
        int iH2;
        int i17;
        byte[] bArr3;
        int iIntValue = i10;
        int i18 = i11;
        int i19 = i12;
        u7.l lVarC = lVar;
        a0Var.W(i18 + 8 + 8);
        if (z10) {
            iP = a0Var.P();
            a0Var.X(6);
        } else {
            a0Var.X(8);
            iP = 0;
        }
        if (iP == 0 || iP == 1) {
            iP2 = a0Var.P();
            a0Var.X(6);
            I = a0Var.I();
            a0Var.W(a0Var.f() - 4);
            iQ = a0Var.q();
            if (iP == 1) {
                a0Var.X(16);
            }
            i15 = -1;
        } else {
            if (iP != 2) {
                return;
            }
            a0Var.X(16);
            I = (int) Math.round(a0Var.o());
            int iL = a0Var.L();
            a0Var.X(4);
            int iL2 = a0Var.L();
            int iL3 = a0Var.L();
            boolean z12 = (iL3 & 1) != 0;
            boolean z13 = (iL3 & 2) != 0;
            if (z12) {
                if (iL2 == 32) {
                    i15 = 4;
                } else {
                    i15 = -1;
                }
            } else if (iL2 == 8) {
                i15 = 3;
            } else if (iL2 == 16) {
                i15 = z13 ? 268435456 : 2;
            } else if (iL2 == 24) {
                i15 = z13 ? 1342177280 : 21;
            } else if (iL2 == 32) {
                i15 = z13 ? 1610612736 : 22;
            } else {
                i15 = -1;
            }
            a0Var.X(8);
            iP2 = iL;
            iQ = 0;
        }
        if (iIntValue == 1767992678) {
            I = -1;
            iP2 = -1;
        } else {
            if (iIntValue != 1935764850) {
                I = iIntValue == 1935767394 ? 16000 : 8000;
            }
            iP2 = 1;
        }
        int iF = a0Var.f();
        if (iIntValue == 1701733217) {
            Pair<Integer, u> pairY = y(a0Var, i18, i19);
            if (pairY != null) {
                iIntValue = ((Integer) pairY.first).intValue();
                lVarC = lVarC == null ? null : lVarC.c(((u) pairY.second).f23681b);
                hVar.f23548a[i14] = (u) pairY.second;
            }
            a0Var.W(iF);
        }
        String str4 = "audio/mhm1";
        if (iIntValue == 1633889587) {
            str2 = "audio/ac3";
        } else if (iIntValue == 1700998451) {
            str2 = "audio/eac3";
        } else if (iIntValue == 1633889588) {
            str2 = "audio/ac4";
        } else if (iIntValue == 1685353315) {
            str2 = "audio/vnd.dts";
        } else if (iIntValue == 1685353320 || iIntValue == 1685353324) {
            str2 = "audio/vnd.dts.hd";
        } else if (iIntValue == 1685353317) {
            str2 = "audio/vnd.dts.hd;profile=lbr";
        } else if (iIntValue == 1685353336) {
            str2 = "audio/vnd.dts.uhd;profile=p2";
        } else if (iIntValue == 1935764850) {
            str2 = "audio/3gpp";
        } else {
            if (iIntValue != 1935767394) {
                if (iIntValue == 1936684916) {
                    str2 = "audio/raw";
                    i16 = 2;
                } else if (iIntValue == 1953984371) {
                    str2 = "audio/raw";
                    i16 = 268435456;
                } else if (iIntValue == 1819304813) {
                    if (i15 == -1) {
                        str2 = "audio/raw";
                        i16 = 2;
                    } else {
                        i16 = i15;
                        str2 = "audio/raw";
                    }
                } else if (iIntValue == 778924082 || iIntValue == 778924083) {
                    str2 = "audio/mpeg";
                } else if (iIntValue == 1835557169) {
                    str2 = "audio/mha1";
                } else if (iIntValue == 1835560241) {
                    i16 = i15;
                    str2 = "audio/mhm1";
                } else if (iIntValue == 1634492771) {
                    str2 = "audio/alac";
                } else if (iIntValue == 1634492791) {
                    str2 = "audio/g711-alaw";
                } else if (iIntValue == 1970037111) {
                    str2 = "audio/g711-mlaw";
                } else if (iIntValue == 1332770163) {
                    str2 = "audio/opus";
                } else if (iIntValue == 1716281667) {
                    str2 = "audio/flac";
                } else if (iIntValue == 1835823201) {
                    str2 = "audio/true-hd";
                } else if (iIntValue == 1767992678) {
                    str2 = "audio/iamf";
                } else {
                    i16 = i15;
                    str2 = null;
                }
                int i20 = i16;
                str3 = null;
                listI = null;
                cVarM = null;
                a aVarJ = null;
                while (iF - i18 < i19) {
                    a0Var.W(iF);
                    iQ2 = a0Var.q();
                    if (iQ2 > 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    v8.s.a(z11, "childAtomSize must be positive");
                    iQ3 = a0Var.q();
                    if (iQ3 == 1835557187) {
                        a0Var.W(iF + 8);
                        a0Var.X(1);
                        iH2 = a0Var.H();
                        a0Var.X(1);
                        if (Objects.equals(str2, str4)) {
                            i17 = 0;
                            str3 = String.format("mhm1.%02X", Integer.valueOf(iH2));
                        } else {
                            i17 = 0;
                            str3 = String.format("mha1.%02X", Integer.valueOf(iH2));
                        }
                        int iP3 = a0Var.P();
                        bArr3 = new byte[iP3];
                        a0Var.l(bArr3, i17, iP3);
                        if (listI == null) {
                            listI = com.google.common.collect.u.I(bArr3);
                        } else {
                            listI = com.google.common.collect.u.K(bArr3, listI.get(i17));
                        }
                    } else {
                        str4 = str4;
                        if (iQ3 == 1835557200) {
                            a0Var.W(iF + 8);
                            iH = a0Var.H();
                            if (iH > 0) {
                                bArr2 = new byte[iH];
                                a0Var.l(bArr2, 0, iH);
                                if (listI == null) {
                                    listI = com.google.common.collect.u.I(bArr2);
                                } else {
                                    listI = com.google.common.collect.u.K(listI.get(0), bArr2);
                                }
                            }
                        } else {
                            if (iQ3 != 1702061171 || (z10 && iQ3 == 2002876005)) {
                                if (iQ3 == 1702061171) {
                                    iC = iF;
                                } else {
                                    iC = c(a0Var, 1702061171, iF, iQ2);
                                }
                                if (iC != -1) {
                                    cVarM = m(a0Var, iC);
                                    str2 = cVarM.f23537a;
                                    bArr = cVarM.f23538b;
                                    if (bArr != null) {
                                        if (tFQWuE.dLUwd.equals(str2)) {
                                            listI = r0.e(bArr);
                                        } else {
                                            if ("audio/mp4a-latm".equals(str2)) {
                                                v8.a.b bVarE = v8.a.e(bArr);
                                                int i21 = bVarE.f27224a;
                                                int i22 = bVarE.f27225b;
                                                str3 = bVarE.f27226c;
                                                I = i21;
                                                iP2 = i22;
                                            }
                                            listI = com.google.common.collect.u.I(bArr);
                                        }
                                    }
                                }
                            } else if (iQ3 == 1651798644) {
                                aVarJ = j(a0Var, iF);
                            } else if (iQ3 == 1684103987) {
                                a0Var.W(iF + 8);
                                hVar.f23549b = v8.b.d(a0Var, Integer.toString(i13), str, lVarC);
                            } else if (iQ3 == 1684366131) {
                                a0Var.W(iF + 8);
                                hVar.f23549b = v8.b.h(a0Var, Integer.toString(i13), str, lVarC);
                            } else if (iQ3 == 1684103988) {
                                a0Var.W(iF + 8);
                                hVar.f23549b = v8.c.d(a0Var, Integer.toString(i13), str, lVarC);
                            } else if (iQ3 == 1684892784) {
                                if (iQ <= 0) {
                                    throw ParserException.b("Invalid sample rate for Dolby TrueHD MLP stream: " + iQ, null);
                                }
                                I = iQ;
                                iP2 = 2;
                            } else if (iQ3 == 1684305011 || iQ3 == 1969517683) {
                                hVar.f23549b = new u7.q.b().e0(i13).u0(str2).R(iP2).v0(I).Y(lVarC).j0(str).N();
                            } else if (iQ3 == 1682927731) {
                                int i23 = iQ2 - 8;
                                byte[] bArr4 = f23525a;
                                byte[] bArrCopyOf = Arrays.copyOf(bArr4, bArr4.length + i23);
                                a0Var.W(iF + 8);
                                a0Var.l(bArrCopyOf, bArr4.length, i23);
                                listI = h0.a(bArrCopyOf);
                            } else if (iQ3 == 1684425825) {
                                int i24 = iQ2 - 12;
                                byte[] bArr5 = new byte[i24 + 4];
                                bArr5[0] = 102;
                                bArr5[1] = 76;
                                bArr5[2] = 97;
                                bArr5[3] = 67;
                                a0Var.W(iF + 12);
                                a0Var.l(bArr5, 4, i24);
                                listI = com.google.common.collect.u.I(bArr5);
                            } else if (iQ3 == 1634492771) {
                                int i25 = iQ2 - 12;
                                byte[] bArr6 = new byte[i25];
                                a0Var.W(iF + 12);
                                a0Var.l(bArr6, 0, i25);
                                Pair<Integer, Integer> pairU = x7.i.u(bArr6);
                                int iIntValue2 = ((Integer) pairU.first).intValue();
                                int iIntValue3 = ((Integer) pairU.second).intValue();
                                listI = com.google.common.collect.u.I(bArr6);
                                I = iIntValue2;
                                iP2 = iIntValue3;
                            } else if (iQ3 == 1767990114) {
                                a0Var.W(iF + 8 + 1);
                                int iM = a0Var.M();
                                byte[] bArr7 = new byte[iM];
                                a0Var.l(bArr7, 0, iM);
                                listI = com.google.common.collect.u.I(bArr7);
                            }
                            iF += iQ2;
                            i18 = i11;
                            i19 = i12;
                            str4 = str4;
                        }
                    }
                    iF += iQ2;
                    i18 = i11;
                    i19 = i12;
                    str4 = str4;
                }
                if (hVar.f23549b == null || str2 == null) {
                }
                u7.q.b bVarJ0 = new u7.q.b().e0(i13).u0(str2).S(str3).R(iP2).v0(I).o0(i20).g0(listI).Y(lVarC).j0(str);
                if (cVarM != null) {
                    bVarJ0.Q(com.google.common.primitives.f.l(cVarM.f23539c)).p0(com.google.common.primitives.f.l(cVarM.f23540d));
                } else if (aVarJ != null) {
                    bVarJ0.Q(com.google.common.primitives.f.l(aVarJ.f23526a)).p0(com.google.common.primitives.f.l(aVarJ.f23527b));
                }
                hVar.f23549b = bVarJ0.N();
                return;
            }
            str2 = "audio/amr-wb";
        }
        i16 = i15;
        int i26 = i16;
        str3 = null;
        listI = null;
        cVarM = null;
        a aVarJ2 = null;
        while (iF - i18 < i19) {
            a0Var.W(iF);
            iQ2 = a0Var.q();
            if (iQ2 > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            v8.s.a(z11, "childAtomSize must be positive");
            iQ3 = a0Var.q();
            if (iQ3 == 1835557187) {
                a0Var.W(iF + 8);
                a0Var.X(1);
                iH2 = a0Var.H();
                a0Var.X(1);
                if (Objects.equals(str2, str4)) {
                    i17 = 0;
                    str3 = String.format("mhm1.%02X", Integer.valueOf(iH2));
                } else {
                    i17 = 0;
                    str3 = String.format("mha1.%02X", Integer.valueOf(iH2));
                }
                int iP4 = a0Var.P();
                bArr3 = new byte[iP4];
                a0Var.l(bArr3, i17, iP4);
                if (listI == null) {
                    listI = com.google.common.collect.u.I(bArr3);
                } else {
                    listI = com.google.common.collect.u.K(bArr3, listI.get(i17));
                }
            } else {
                str4 = str4;
                if (iQ3 == 1835557200) {
                    a0Var.W(iF + 8);
                    iH = a0Var.H();
                    if (iH > 0) {
                        bArr2 = new byte[iH];
                        a0Var.l(bArr2, 0, iH);
                        if (listI == null) {
                            listI = com.google.common.collect.u.I(bArr2);
                        } else {
                            listI = com.google.common.collect.u.K(listI.get(0), bArr2);
                        }
                    }
                } else {
                    if (iQ3 != 1702061171) {
                        if (iQ3 == 1702061171) {
                            iC = iF;
                        } else {
                            iC = c(a0Var, 1702061171, iF, iQ2);
                        }
                        if (iC != -1) {
                            cVarM = m(a0Var, iC);
                            str2 = cVarM.f23537a;
                            bArr = cVarM.f23538b;
                            if (bArr != null) {
                                if (tFQWuE.dLUwd.equals(str2)) {
                                    listI = r0.e(bArr);
                                } else {
                                    if ("audio/mp4a-latm".equals(str2)) {
                                        v8.a.b bVarE2 = v8.a.e(bArr);
                                        int i27 = bVarE2.f27224a;
                                        int i28 = bVarE2.f27225b;
                                        str3 = bVarE2.f27226c;
                                        I = i27;
                                        iP2 = i28;
                                    }
                                    listI = com.google.common.collect.u.I(bArr);
                                }
                            }
                        }
                    } else {
                        if (iQ3 == 1702061171) {
                            iC = iF;
                        } else {
                            iC = c(a0Var, 1702061171, iF, iQ2);
                        }
                        if (iC != -1) {
                            cVarM = m(a0Var, iC);
                            str2 = cVarM.f23537a;
                            bArr = cVarM.f23538b;
                            if (bArr != null) {
                                if (tFQWuE.dLUwd.equals(str2)) {
                                    listI = r0.e(bArr);
                                } else {
                                    if ("audio/mp4a-latm".equals(str2)) {
                                        v8.a.b bVarE3 = v8.a.e(bArr);
                                        int i29 = bVarE3.f27224a;
                                        int i210 = bVarE3.f27225b;
                                        str3 = bVarE3.f27226c;
                                        I = i29;
                                        iP2 = i210;
                                    }
                                    listI = com.google.common.collect.u.I(bArr);
                                }
                            }
                        }
                    }
                    iF += iQ2;
                    i18 = i11;
                    i19 = i12;
                    str4 = str4;
                }
            }
            iF += iQ2;
            i18 = i11;
            i19 = i12;
            str4 = str4;
        }
        if (hVar.f23549b == null) {
        }
    }

    private static u7.g i(a0 a0Var) {
        u7.g.b bVar = new u7.g.b();
        z zVar = new z(a0Var.e());
        zVar.p(a0Var.f() * 8);
        zVar.s(1);
        int iH = zVar.h(3);
        zVar.r(6);
        boolean zG = zVar.g();
        boolean zG2 = zVar.g();
        if (iH == 2 && zG) {
            bVar.g(zG2 ? 12 : 10);
            bVar.b(zG2 ? 12 : 10);
        } else if (iH <= 2) {
            bVar.g(zG ? 10 : 8);
            bVar.b(zG ? 10 : 8);
        }
        zVar.r(13);
        zVar.q();
        int iH2 = zVar.h(4);
        if (iH2 != 1) {
            x7.r.f("BoxParsers", "Unsupported obu_type: " + iH2);
            return bVar.a();
        }
        if (zVar.g()) {
            x7.r.f("BoxParsers", "Unsupported obu_extension_flag");
            return bVar.a();
        }
        boolean zG3 = zVar.g();
        zVar.q();
        if (zG3 && zVar.h(8) > 127) {
            x7.r.f("BoxParsers", "Excessive obu_size");
            return bVar.a();
        }
        int iH3 = zVar.h(3);
        zVar.q();
        if (zVar.g()) {
            x7.r.f("BoxParsers", "Unsupported reduced_still_picture_header");
            return bVar.a();
        }
        if (zVar.g()) {
            x7.r.f("BoxParsers", "Unsupported timing_info_present_flag");
            return bVar.a();
        }
        if (zVar.g()) {
            x7.r.f("BoxParsers", "Unsupported initial_display_delay_present_flag");
            return bVar.a();
        }
        int iH4 = zVar.h(5);
        boolean z10 = false;
        for (int i10 = 0; i10 <= iH4; i10++) {
            zVar.r(12);
            if (zVar.h(5) > 7) {
                zVar.q();
            }
        }
        int iH5 = zVar.h(4);
        int iH6 = zVar.h(4);
        zVar.r(iH5 + 1);
        zVar.r(iH6 + 1);
        if (zVar.g()) {
            zVar.r(7);
        }
        zVar.r(7);
        boolean zG4 = zVar.g();
        if (zG4) {
            zVar.r(2);
        }
        if ((zVar.g() ? 2 : zVar.h(1)) > 0 && !zVar.g()) {
            zVar.r(1);
        }
        if (zG4) {
            zVar.r(3);
        }
        zVar.r(3);
        boolean zG5 = zVar.g();
        if (iH3 == 2 && zG5) {
            zVar.q();
        }
        if (iH3 != 1 && zVar.g()) {
            z10 = true;
        }
        if (zVar.g()) {
            int iH7 = zVar.h(8);
            int iH8 = zVar.h(8);
            bVar.d(u7.g.j(iH7)).c(((z10 || iH7 != 1 || iH8 != 13 || zVar.h(8) != 0) ? zVar.h(1) : 1) != 1 ? 2 : 1).e(u7.g.k(iH8));
        }
        return bVar.a();
    }

    private static a j(a0 a0Var, int i10) {
        a0Var.W(i10 + 8);
        a0Var.X(4);
        return new a(a0Var.J(), a0Var.J());
    }

    static Pair<Integer, u> k(a0 a0Var, int i10, int i11) throws ParserException {
        int i12 = i10 + 8;
        int i13 = -1;
        int i14 = 0;
        String strE = null;
        Integer numValueOf = null;
        while (i12 - i10 < i11) {
            a0Var.W(i12);
            int iQ = a0Var.q();
            int iQ2 = a0Var.q();
            if (iQ2 == 1718775137) {
                numValueOf = Integer.valueOf(a0Var.q());
            } else if (iQ2 == 1935894637) {
                a0Var.X(4);
                strE = a0Var.E(4);
            } else if (iQ2 == 1935894633) {
                i13 = i12;
                i14 = iQ;
            }
            i12 += iQ;
        }
        if (!"cenc".equals(strE) && !"cbc1".equals(strE) && !"cens".equals(strE) && !"cbcs".equals(strE)) {
            return null;
        }
        v8.s.a(numValueOf != null, "frma atom is mandatory");
        v8.s.a(i13 != -1, "schi atom is mandatory");
        u uVarZ = z(a0Var, i13, i14, strE);
        v8.s.a(uVarZ != null, "tenc atom is mandatory");
        return Pair.create(numValueOf, (u) l0.i(uVarZ));
    }

    private static Pair<long[], long[]> l(y7.c.b bVar) {
        y7.c.C0487c c0487cE = bVar.e(1701606260);
        if (c0487cE == null) {
            return null;
        }
        a0 a0Var = c0487cE.f28688b;
        a0Var.W(8);
        int iP = p(a0Var.q());
        int iL = a0Var.L();
        long[] jArr = new long[iL];
        long[] jArr2 = new long[iL];
        for (int i10 = 0; i10 < iL; i10++) {
            jArr[i10] = iP == 1 ? a0Var.O() : a0Var.J();
            jArr2[i10] = iP == 1 ? a0Var.A() : a0Var.q();
            if (a0Var.D() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            a0Var.X(2);
        }
        return Pair.create(jArr, jArr2);
    }

    private static c m(a0 a0Var, int i10) {
        a0Var.W(i10 + 8 + 4);
        a0Var.X(1);
        n(a0Var);
        a0Var.X(2);
        int iH = a0Var.H();
        if ((iH & 128) != 0) {
            a0Var.X(2);
        }
        if ((iH & 64) != 0) {
            a0Var.X(a0Var.H());
        }
        if ((iH & 32) != 0) {
            a0Var.X(2);
        }
        a0Var.X(1);
        n(a0Var);
        String strH = u7.w.h(a0Var.H());
        if ("audio/mpeg".equals(strH) || "audio/vnd.dts".equals(strH) || "audio/vnd.dts.hd".equals(strH)) {
            return new c(strH, null, -1L, -1L);
        }
        a0Var.X(4);
        long J = a0Var.J();
        long J2 = a0Var.J();
        a0Var.X(1);
        int iN = n(a0Var);
        byte[] bArr = new byte[iN];
        a0Var.l(bArr, 0, iN);
        return new c(strH, bArr, J2 > 0 ? J2 : -1L, J > 0 ? J : -1L);
    }

    private static int n(a0 a0Var) {
        int iH = a0Var.H();
        int i10 = iH & 127;
        while ((iH & 128) == 128) {
            iH = a0Var.H();
            i10 = (i10 << 7) | (iH & 127);
        }
        return i10;
    }

    public static int o(int i10) {
        return i10 & 16777215;
    }

    public static int p(int i10) {
        return (i10 >> 24) & 255;
    }

    private static int q(a0 a0Var) {
        a0Var.W(16);
        return a0Var.q();
    }

    private static u7.v r(a0 a0Var, int i10) {
        a0Var.X(8);
        ArrayList arrayList = new ArrayList();
        while (a0Var.f() < i10) {
            u7.v.a aVarD = p9.j.d(a0Var);
            if (aVarD != null) {
                arrayList.add(aVarD);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new u7.v(arrayList);
    }

    private static e s(a0 a0Var) {
        long jF1;
        a0Var.W(8);
        int iP = p(a0Var.q());
        a0Var.X(iP == 0 ? 8 : 16);
        long J = a0Var.J();
        int iF = a0Var.f();
        int i10 = iP == 0 ? 4 : 8;
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                z10 = true;
                break;
            }
            if (a0Var.e()[iF + i11] != -1) {
                break;
            }
            i11++;
        }
        if (!z10) {
            long J2 = iP == 0 ? a0Var.J() : a0Var.O();
            if (J2 != 0) {
                jF1 = l0.f1(J2, 1000000L, J);
            }
            return new e(J, jF1, d(a0Var.P()));
        }
        a0Var.X(i10);
        jF1 = -9223372036854775807L;
        return new e(J, jF1, d(a0Var.P()));
    }

    public static u7.v t(y7.c.b bVar) {
        y7.c.C0487c c0487cE = bVar.e(1751411826);
        y7.c.C0487c c0487cE2 = bVar.e(1801812339);
        y7.c.C0487c c0487cE3 = bVar.e(1768715124);
        if (c0487cE == null || c0487cE2 == null || c0487cE3 == null || q(c0487cE.f28688b) != 1835299937) {
            return null;
        }
        a0 a0Var = c0487cE2.f28688b;
        a0Var.W(12);
        int iQ = a0Var.q();
        String[] strArr = new String[iQ];
        for (int i10 = 0; i10 < iQ; i10++) {
            int iQ2 = a0Var.q();
            a0Var.X(4);
            strArr[i10] = a0Var.E(iQ2 - 8);
        }
        a0 a0Var2 = c0487cE3.f28688b;
        a0Var2.W(8);
        ArrayList arrayList = new ArrayList();
        while (a0Var2.a() > 8) {
            int iF = a0Var2.f();
            int iQ3 = a0Var2.q();
            int iQ4 = a0Var2.q() - 1;
            if (iQ4 < 0 || iQ4 >= iQ) {
                x7.r.h("BoxParsers", "Skipped metadata with unknown key index: " + iQ4);
            } else {
                y7.a aVarI = p9.j.i(a0Var2, iF + iQ3, strArr[iQ4]);
                if (aVarI != null) {
                    arrayList.add(aVarI);
                }
            }
            a0Var2.W(iF + iQ3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new u7.v(arrayList);
    }

    private static void u(a0 a0Var, int i10, int i11, int i12, h hVar) {
        a0Var.W(i11 + 8 + 8);
        if (i10 == 1835365492) {
            a0Var.B();
            String strB = a0Var.B();
            if (strB != null) {
                hVar.f23549b = new u7.q.b().e0(i12).u0(strB).N();
            }
        }
    }

    public static y7.e v(a0 a0Var) {
        long jA;
        long jA2;
        a0Var.W(8);
        if (p(a0Var.q()) == 0) {
            jA = a0Var.J();
            jA2 = a0Var.J();
        } else {
            jA = a0Var.A();
            jA2 = a0Var.A();
        }
        return new y7.e(jA, jA2, a0Var.J());
    }

    private static float w(a0 a0Var, int i10) {
        a0Var.W(i10 + 8);
        return a0Var.L() / a0Var.L();
    }

    private static byte[] x(a0 a0Var, int i10, int i11) {
        int i12 = i10 + 8;
        while (i12 - i10 < i11) {
            a0Var.W(i12);
            int iQ = a0Var.q();
            if (a0Var.q() == 1886547818) {
                return Arrays.copyOfRange(a0Var.e(), i12, iQ + i12);
            }
            i12 += iQ;
        }
        return null;
    }

    private static Pair<Integer, u> y(a0 a0Var, int i10, int i11) throws ParserException {
        Pair<Integer, u> pairK;
        int iF = a0Var.f();
        while (iF - i10 < i11) {
            a0Var.W(iF);
            int iQ = a0Var.q();
            v8.s.a(iQ > 0, "childAtomSize must be positive");
            if (a0Var.q() == 1936289382 && (pairK = k(a0Var, iF, iQ)) != null) {
                return pairK;
            }
            iF += iQ;
        }
        return null;
    }

    private static u z(a0 a0Var, int i10, int i11, String str) {
        int i12;
        int i13;
        int i14 = i10 + 8;
        while (true) {
            byte[] bArr = null;
            if (i14 - i10 >= i11) {
                return null;
            }
            a0Var.W(i14);
            int iQ = a0Var.q();
            if (a0Var.q() == 1952804451) {
                int iP = p(a0Var.q());
                a0Var.X(1);
                if (iP == 0) {
                    a0Var.X(1);
                    i13 = 0;
                    i12 = 0;
                } else {
                    int iH = a0Var.H();
                    i12 = iH & 15;
                    i13 = (iH & 240) >> 4;
                }
                boolean z10 = a0Var.H() == 1;
                int iH2 = a0Var.H();
                byte[] bArr2 = new byte[16];
                a0Var.l(bArr2, 0, 16);
                if (z10 && iH2 == 0) {
                    int iH3 = a0Var.H();
                    bArr = new byte[iH3];
                    a0Var.l(bArr, 0, iH3);
                }
                return new u(z10, str, iH2, bArr2, i13, i12, bArr);
            }
            i14 += iQ;
        }
    }

    public static w A(t tVar, y7.c.b bVar, b0 b0Var) throws ParserException {
        f jVar;
        boolean z10;
        int iL;
        int iL2;
        int iL3;
        int i10;
        String str;
        int i11;
        long[] jArr;
        int[] iArr;
        long[] jArrCopyOf;
        int[] iArrCopyOf;
        int i12;
        boolean z11;
        int i13;
        t tVarA;
        int[] iArr2;
        long[] jArr2;
        long j10;
        long j11;
        int i14;
        int i15;
        int iQ;
        int i16;
        int[] iArr3;
        boolean z12;
        int i17;
        int i18;
        t tVarA2 = tVar;
        y7.c.C0487c c0487cE = bVar.e(1937011578);
        if (c0487cE != null) {
            jVar = new i(c0487cE, tVarA2.f23674g);
        } else {
            y7.c.C0487c c0487cE2 = bVar.e(1937013298);
            if (c0487cE2 == null) {
                throw ParserException.b("Track has no sample table size information", null);
            }
            jVar = new j(c0487cE2);
        }
        int iC = jVar.c();
        if (iC == 0) {
            return new w(tVar, new long[0], new int[0], 0, new long[0], new int[0], 0L);
        }
        if (tVarA2.f23669b == 2) {
            long j12 = tVarA2.f23673f;
            if (j12 > 0) {
                tVarA2 = tVarA2.a(tVarA2.f23674g.b().b0(iC / (j12 / 1000000.0f)).N());
            }
        }
        y7.c.C0487c c0487cE3 = bVar.e(1937007471);
        if (c0487cE3 == null) {
            c0487cE3 = (y7.c.C0487c) x7.a.e(bVar.e(1668232756));
            z10 = true;
        } else {
            z10 = false;
        }
        a0 a0Var = c0487cE3.f28688b;
        a0 a0Var2 = ((y7.c.C0487c) x7.a.e(bVar.e(1937011555))).f28688b;
        a0 a0Var3 = ((y7.c.C0487c) x7.a.e(bVar.e(1937011827))).f28688b;
        y7.c.C0487c c0487cE4 = bVar.e(1937011571);
        a0 a0Var4 = c0487cE4 != null ? c0487cE4.f28688b : null;
        y7.c.C0487c c0487cE5 = bVar.e(1668576371);
        a0 a0Var5 = c0487cE5 != null ? c0487cE5.f28688b : null;
        C0391b c0391b = new C0391b(a0Var2, a0Var, z10);
        a0Var3.W(12);
        int iL4 = a0Var3.L() - 1;
        int iL5 = a0Var3.L();
        int iL6 = a0Var3.L();
        if (a0Var5 != null) {
            a0Var5.W(12);
            iL = a0Var5.L();
        } else {
            iL = 0;
        }
        if (a0Var4 != null) {
            a0Var4.W(12);
            iL3 = a0Var4.L();
            if (iL3 > 0) {
                iL2 = a0Var4.L() - 1;
            } else {
                iL2 = -1;
                a0Var4 = null;
            }
        } else {
            iL2 = -1;
            iL3 = 0;
        }
        int iB = jVar.b();
        String str2 = tVarA2.f23674g.f26252o;
        if (iB != -1 && ("audio/raw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/g711-alaw".equals(str2)) && iL4 == 0 && iL == 0 && iL3 == 0) {
            int i19 = c0391b.f23528a;
            long[] jArr3 = new long[i19];
            int[] iArr4 = new int[i19];
            while (c0391b.a()) {
                int i20 = c0391b.f23529b;
                jArr3[i20] = c0391b.f23531d;
                iArr4[i20] = c0391b.f23530c;
            }
            p9.d.b bVarA = p9.d.a(iB, jArr3, iArr4, iL6);
            jArr = bVarA.f23569a;
            int[] iArr5 = bVarA.f23570b;
            int i21 = bVarA.f23571c;
            long[] jArr4 = bVarA.f23572d;
            iArrCopyOf = bVarA.f23573e;
            long j13 = bVarA.f23574f;
            j11 = bVarA.f23575g;
            tVarA = tVarA2;
            iArr2 = iArr5;
            i10 = i21;
            jArr2 = jArr4;
            j10 = j13;
        } else {
            long[] jArr5 = new long[iC];
            int[] iArr6 = new int[iC];
            long[] jArr6 = new long[iC];
            int[] iArr7 = new int[iC];
            int i22 = iL4;
            int iL7 = iL2;
            int i23 = iL;
            i10 = 0;
            int i24 = 0;
            int iQ2 = 0;
            int iL8 = 0;
            long j14 = 0;
            long j15 = 0;
            long j16 = 0;
            t tVar2 = tVarA2;
            int i25 = 0;
            while (true) {
                str = ZHgPsTG.zrkrLiZMkx;
                if (i25 >= iC) {
                    i11 = iL3;
                    jArr = jArr5;
                    iArr = iArr6;
                    jArrCopyOf = jArr6;
                    iArrCopyOf = iArr7;
                    i12 = i24;
                    break;
                }
                long j17 = j16;
                int i26 = i24;
                boolean zA = true;
                while (i26 == 0) {
                    zA = c0391b.a();
                    if (!zA) {
                        break;
                    }
                    int i27 = iL6;
                    long j18 = c0391b.f23531d;
                    i26 = c0391b.f23530c;
                    j17 = j18;
                    iL6 = i27;
                    iL3 = iL3;
                    iC = iC;
                }
                int i28 = iC;
                int i29 = iL6;
                i11 = iL3;
                if (!zA) {
                    x7.r.h(str, "Unexpected end of chunk data");
                    long[] jArrCopyOf2 = Arrays.copyOf(jArr5, i25);
                    int[] iArrCopyOf2 = Arrays.copyOf(iArr6, i25);
                    jArrCopyOf = Arrays.copyOf(jArr6, i25);
                    iArrCopyOf = Arrays.copyOf(iArr7, i25);
                    jArr = jArrCopyOf2;
                    iArr = iArrCopyOf2;
                    iC = i25;
                    i12 = i26;
                    break;
                }
                if (a0Var5 != null) {
                    while (iL8 == 0 && i23 > 0) {
                        iL8 = a0Var5.L();
                        iQ2 = a0Var5.q();
                        i23--;
                    }
                    iL8--;
                }
                int i30 = iQ2;
                jArr5[i25] = j17;
                int iA = jVar.a();
                iArr6[i25] = iA;
                C0391b c0391b2 = c0391b;
                f fVar = jVar;
                j15 += (long) iA;
                if (iA > i10) {
                    i10 = iA;
                }
                jArr6[i25] = j14 + ((long) i30);
                iArr7[i25] = a0Var4 == null ? 1 : 0;
                if (i25 == iL7) {
                    iArr7[i25] = 1;
                    i15 = i11 - 1;
                    if (i15 > 0) {
                        iL7 = ((a0) x7.a.e(a0Var4)).L() - 1;
                    }
                    i14 = iL7;
                } else {
                    i14 = iL7;
                    i15 = i11;
                }
                j14 += (long) i29;
                iL5--;
                if (iL5 != 0 || i22 <= 0) {
                    iQ = i29;
                    i16 = i22;
                } else {
                    int iL9 = a0Var3.L();
                    iQ = a0Var3.q();
                    i16 = i22 - 1;
                    iL5 = iL9;
                }
                int i31 = iQ;
                long j19 = j17 + ((long) iArr6[i25]);
                i24 = i26 - 1;
                i25++;
                j16 = j19;
                iQ2 = i30;
                iL7 = i14;
                iC = i28;
                c0391b = c0391b2;
                int i32 = i16;
                iL6 = i31;
                i22 = i32;
                iL3 = i15;
                jVar = fVar;
            }
            long j20 = j14 + ((long) iQ2);
            if (a0Var5 == null) {
                z11 = true;
                break;
            }
            while (true) {
                if (i23 <= 0) {
                    z11 = true;
                    break;
                }
                if (a0Var5.L() != 0) {
                    z11 = false;
                    break;
                }
                a0Var5.q();
                i23--;
            }
            if (i11 == 0 && iL5 == 0 && i12 == 0 && i22 == 0) {
                i13 = iL8;
                if (i13 == 0 && z11) {
                    tVarA = tVar2;
                }
                iArr2 = iArr;
                jArr2 = jArrCopyOf;
                j10 = j20;
                j11 = j15;
            } else {
                i13 = iL8;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Inconsistent stbl box for track ");
            tVarA = tVar2;
            sb2.append(tVarA.f23668a);
            sb2.append(": remainingSynchronizationSamples ");
            sb2.append(i11);
            sb2.append(", remainingSamplesAtTimestampDelta ");
            sb2.append(iL5);
            sb2.append(", remainingSamplesInChunk ");
            sb2.append(i12);
            sb2.append(", remainingTimestampDeltaChanges ");
            sb2.append(i22);
            sb2.append(", remainingSamplesAtTimestampOffset ");
            sb2.append(i13);
            sb2.append(!z11 ? ", ctts invalid" : "");
            x7.r.h(str, sb2.toString());
            iArr2 = iArr;
            jArr2 = jArrCopyOf;
            j10 = j20;
            j11 = j15;
        }
        int[] iArr8 = iArrCopyOf;
        long j21 = tVarA.f23673f;
        if (j21 > 0) {
            long jH1 = l0.h1(j11 * 8, 1000000L, j21, RoundingMode.HALF_DOWN);
            if (jH1 > 0 && jH1 < 2147483647L) {
                tVarA = tVarA.a(tVarA.f23674g.b().Q((int) jH1).N());
            }
        }
        int[] iArr9 = iArr8;
        long jF1 = l0.f1(j10, 1000000L, tVarA.f23670c);
        long[] jArr7 = tVarA.f23676i;
        if (jArr7 == null) {
            l0.g1(jArr2, 1000000L, tVarA.f23670c);
            return new w(tVarA, jArr, iArr2, i10, jArr2, iArr9, jF1);
        }
        if (jArr7.length == 1 && tVarA.f23669b == 1 && jArr2.length >= 2) {
            long j22 = ((long[]) x7.a.e(tVarA.f23677j))[0];
            long jF2 = l0.f1(tVarA.f23676i[0], tVarA.f23670c, tVarA.f23671d) + j22;
            if (b(jArr2, j10, j22, jF2)) {
                long j23 = j10 - jF2;
                long jF3 = l0.f1(j22 - jArr2[0], tVarA.f23674g.F, tVarA.f23670c);
                long jF4 = l0.f1(j23, tVarA.f23674g.F, tVarA.f23670c);
                if ((jF3 != 0 || jF4 != 0) && jF3 <= 2147483647L && jF4 <= 2147483647L) {
                    b0Var.f27242a = (int) jF3;
                    b0Var.f27243b = (int) jF4;
                    l0.g1(jArr2, 1000000L, tVarA.f23670c);
                    return new w(tVarA, jArr, iArr2, i10, jArr2, iArr9, l0.f1(tVarA.f23676i[0], 1000000L, tVarA.f23671d));
                }
            }
        }
        long[] jArr8 = tVarA.f23676i;
        if (jArr8.length == 1 && jArr8[0] == 0) {
            long j24 = ((long[]) x7.a.e(tVarA.f23677j))[0];
            for (int i33 = 0; i33 < jArr2.length; i33++) {
                jArr2[i33] = l0.f1(jArr2[i33] - j24, 1000000L, tVarA.f23670c);
            }
            return new w(tVarA, jArr, iArr2, i10, jArr2, iArr9, l0.f1(j10 - j24, 1000000L, tVarA.f23670c));
        }
        boolean z13 = tVarA.f23669b == 1;
        int[] iArr10 = new int[jArr8.length];
        int[] iArr11 = new int[jArr8.length];
        long[] jArr9 = (long[]) x7.a.e(tVarA.f23677j);
        int i34 = 0;
        boolean z14 = false;
        int i35 = 0;
        int i36 = 0;
        while (true) {
            long[] jArr10 = tVarA.f23676i;
            if (i34 >= jArr10.length) {
                break;
            }
            int i37 = i10;
            long j25 = jArr9[i34];
            if (j25 != -1) {
                boolean z15 = z14;
                int i38 = i35;
                long jF5 = l0.f1(jArr10[i34], tVarA.f23670c, tVarA.f23671d);
                iArr10[i34] = l0.h(jArr2, j25, true, true);
                long j26 = j25 + jF5;
                iArr11[i34] = l0.d(jArr2, j26, z13, false);
                int i39 = iArr10[i34];
                while (true) {
                    i18 = iArr10[i34];
                    iArr3 = iArr9;
                    if (i18 < 0 || (iArr3[i18] & 1) != 0) {
                        break;
                    }
                    iArr10[i34] = i18 - 1;
                    iArr9 = iArr3;
                }
                if (i18 < 0) {
                    iArr10[i34] = i39;
                    while (true) {
                        int i40 = iArr10[i34];
                        if (i40 >= iArr11[i34] || (iArr3[i40] & 1) != 0) {
                            break;
                        }
                        iArr10[i34] = i40 + 1;
                    }
                }
                if (tVarA.f23669b == 2 && iArr10[i34] != iArr11[i34]) {
                    while (true) {
                        int i41 = iArr11[i34];
                        if (i41 >= jArr2.length - 1 || jArr2[i41 + 1] > j26) {
                            break;
                        }
                        iArr11[i34] = i41 + 1;
                    }
                }
                int i42 = iArr11[i34];
                int i43 = iArr10[i34];
                i17 = i38 + (i42 - i43);
                z12 = z15 | (i36 != i43);
                i36 = i42;
            } else {
                int i44 = i35;
                iArr3 = iArr9;
                z12 = z14;
                i17 = i44;
            }
            i34++;
            iArr9 = iArr3;
            z14 = z12;
            iArr2 = iArr2;
            i35 = i17;
            i10 = i37;
            iC = iC;
        }
        int[] iArr12 = iArr2;
        int i45 = i35;
        int i46 = i10;
        int[] iArr13 = iArr9;
        boolean z16 = z14 | (i45 != iC);
        long[] jArr11 = z16 ? new long[i45] : jArr;
        int[] iArr14 = z16 ? new int[i45] : iArr12;
        int i47 = z16 ? 0 : i46;
        int[] iArr15 = z16 ? new int[i45] : iArr13;
        long[] jArr12 = new long[i45];
        int i48 = i47;
        int i49 = 0;
        int i50 = 0;
        long j27 = 0;
        boolean z17 = false;
        while (i49 < tVarA.f23676i.length) {
            long j28 = tVarA.f23677j[i49];
            int i51 = iArr10[i49];
            int[] iArr16 = iArr10;
            int i52 = iArr11[i49];
            int[] iArr17 = iArr11;
            if (z16) {
                int i53 = i52 - i51;
                System.arraycopy(jArr, i51, jArr11, i50, i53);
                System.arraycopy(iArr12, i51, iArr14, i50, i53);
                System.arraycopy(iArr13, i51, iArr15, i50, i53);
            }
            int i54 = i48;
            while (i51 < i52) {
                int i55 = i52;
                int[] iArr18 = iArr13;
                long jF6 = l0.f1(j27, 1000000L, tVarA.f23671d);
                long[] jArr13 = jArr11;
                long[] jArr14 = jArr;
                long jF7 = l0.f1(jArr2[i51] - j28, 1000000L, tVarA.f23670c);
                if (jF7 < 0) {
                    z17 = true;
                }
                jArr12[i50] = jF6 + jF7;
                if (z16 && iArr14[i50] > i54) {
                    i54 = iArr12[i51];
                }
                i50++;
                i51++;
                iArr13 = iArr18;
                i52 = i55;
                jArr = jArr14;
                jArr11 = jArr13;
            }
            j27 += tVarA.f23676i[i49];
            i49++;
            iArr13 = iArr13;
            i48 = i54;
            iArr10 = iArr16;
            iArr11 = iArr17;
            jArr11 = jArr11;
        }
        long[] jArr15 = jArr11;
        long jF8 = l0.f1(j27, 1000000L, tVarA.f23671d);
        if (z17) {
            tVarA = tVarA.a(tVarA.f23674g.b().c0(true).N());
        }
        return new w(tVarA, jArr15, iArr14, i48, jArr12, iArr15, jF8);
    }
}
