package ca;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.vungle.ads.internal.protos.Sdk;
import io.bidmachine.media3.common.ParserException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: TsExtractor.java */
/* JADX INFO: loaded from: classes4.dex */
public final class k0 implements v8.p {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Deprecated
    public static final v8.u f5176v = new v8.u() { // from class: ca.j0
        @Override // v8.u
        public final v8.p[] g() {
            return k0.y();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f5177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f5178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f5179c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<x7.g0> f5180d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final x7.a0 f5181e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final SparseIntArray f5182f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final l0.c f5183g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final s9.r.a f5184h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final SparseArray<l0> f5185i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final SparseBooleanArray f5186j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final SparseBooleanArray f5187k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final i0 f5188l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private h0 f5189m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private v8.r f5190n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f5191o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f5192p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f5193q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f5194r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private l0 f5195s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f5196t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f5197u;

    public k0(int i10, s9.r.a aVar) {
        this(1, i10, aVar, new x7.g0(0L), new j(0), 112800);
    }

    private void A() {
        this.f5186j.clear();
        this.f5185i.clear();
        SparseArray<l0> sparseArrayA = this.f5183g.a();
        int size = sparseArrayA.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f5185i.put(sparseArrayA.keyAt(i10), sparseArrayA.valueAt(i10));
        }
        this.f5185i.put(0, new e0(new a()));
        this.f5195s = null;
    }

    private boolean B(int i10) {
        return this.f5177a == 2 || this.f5192p || !this.f5187k.get(i10, false);
    }

    static /* synthetic */ int m(k0 k0Var) {
        int i10 = k0Var.f5191o;
        k0Var.f5191o = i10 + 1;
        return i10;
    }

    private boolean w(v8.q qVar) throws IOException {
        byte[] bArrE = this.f5181e.e();
        if (9400 - this.f5181e.f() < 188) {
            int iA = this.f5181e.a();
            if (iA > 0) {
                System.arraycopy(bArrE, this.f5181e.f(), bArrE, 0, iA);
            }
            this.f5181e.U(bArrE, iA);
        }
        while (this.f5181e.a() < 188) {
            int iG = this.f5181e.g();
            int i10 = qVar.read(bArrE, iG, 9400 - iG);
            if (i10 == -1) {
                return false;
            }
            this.f5181e.V(iG + i10);
        }
        return true;
    }

    private int x() throws ParserException {
        int iF = this.f5181e.f();
        int iG = this.f5181e.g();
        int iA = m0.a(this.f5181e.e(), iF, iG);
        this.f5181e.W(iA);
        int i10 = iA + 188;
        if (i10 > iG) {
            int i11 = this.f5196t + (iA - iF);
            this.f5196t = i11;
            if (this.f5177a == 2 && i11 > 376) {
                throw ParserException.b("Cannot find sync byte. Most likely not a Transport Stream.", null);
            }
        } else {
            this.f5196t = 0;
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ v8.p[] y() {
        return new v8.p[]{new k0(1, s9.r.a.f25343a)};
    }

    private void z(long j10) {
        if (this.f5193q) {
            return;
        }
        this.f5193q = true;
        if (this.f5188l.b() == -9223372036854775807L) {
            this.f5190n.h(new v8.j0.b(this.f5188l.b()));
            return;
        }
        h0 h0Var = new h0(this.f5188l.c(), this.f5188l.b(), j10, this.f5197u, this.f5179c);
        this.f5189m = h0Var;
        this.f5190n.h(h0Var.b());
    }

    @Override // v8.p
    public void a(long j10, long j11) {
        h0 h0Var;
        x7.a.g(this.f5177a != 2);
        int size = this.f5180d.size();
        for (int i10 = 0; i10 < size; i10++) {
            x7.g0 g0Var = this.f5180d.get(i10);
            boolean z10 = g0Var.f() == -9223372036854775807L;
            if (!z10) {
                long jD = g0Var.d();
                z10 = (jD == -9223372036854775807L || jD == 0 || jD == j11) ? false : true;
            }
            if (z10) {
                g0Var.i(j11);
            }
        }
        if (j11 != 0 && (h0Var = this.f5189m) != null) {
            h0Var.h(j11);
        }
        this.f5181e.S(0);
        this.f5182f.clear();
        for (int i11 = 0; i11 < this.f5185i.size(); i11++) {
            this.f5185i.valueAt(i11).b();
        }
        this.f5196t = 0;
    }

    @Override // v8.p
    public void c(v8.r rVar) {
        if ((this.f5178b & 1) == 0) {
            rVar = new s9.s(rVar, this.f5184h);
        }
        this.f5190n = rVar;
    }

    @Override // v8.p
    public boolean e(v8.q qVar) throws IOException {
        boolean z10;
        byte[] bArrE = this.f5181e.e();
        qVar.n(bArrE, 0, 940);
        for (int i10 = 0; i10 < 188; i10++) {
            int i11 = 0;
            while (true) {
                if (i11 >= 5) {
                    z10 = true;
                    break;
                }
                if (bArrE[(i11 * 188) + i10] != 71) {
                    z10 = false;
                    break;
                }
                i11++;
            }
            if (z10) {
                qVar.k(i10);
                return true;
            }
        }
        return false;
    }

    @Override // v8.p
    public int l(v8.q qVar, v8.i0 i0Var) throws IOException {
        long length = qVar.getLength();
        boolean z10 = this.f5177a == 2;
        if (this.f5192p) {
            if (((length == -1 || z10) ? false : true) && !this.f5188l.d()) {
                return this.f5188l.e(qVar, i0Var, this.f5197u);
            }
            z(length);
            if (this.f5194r) {
                this.f5194r = false;
                a(0L, 0L);
                if (qVar.getPosition() != 0) {
                    i0Var.f27344a = 0L;
                    return 1;
                }
            }
            h0 h0Var = this.f5189m;
            if (h0Var != null && h0Var.d()) {
                return this.f5189m.c(qVar, i0Var);
            }
        }
        if (!w(qVar)) {
            for (int i10 = 0; i10 < this.f5185i.size(); i10++) {
                l0 l0VarValueAt = this.f5185i.valueAt(i10);
                if (l0VarValueAt instanceof y) {
                    y yVar = (y) l0VarValueAt;
                    if (yVar.d(z10)) {
                        yVar.c(new x7.a0(), 1);
                    }
                }
            }
            return -1;
        }
        int iX = x();
        int iG = this.f5181e.g();
        if (iX > iG) {
            return 0;
        }
        int iQ = this.f5181e.q();
        if ((8388608 & iQ) != 0) {
            this.f5181e.W(iX);
            return 0;
        }
        int i11 = ((4194304 & iQ) != 0 ? 1 : 0) | 0;
        int i12 = (2096896 & iQ) >> 8;
        boolean z11 = (iQ & 32) != 0;
        l0 l0Var = (iQ & 16) != 0 ? this.f5185i.get(i12) : null;
        if (l0Var == null) {
            this.f5181e.W(iX);
            return 0;
        }
        if (this.f5177a != 2) {
            int i13 = iQ & 15;
            int i14 = this.f5182f.get(i12, i13 - 1);
            this.f5182f.put(i12, i13);
            if (i14 == i13) {
                this.f5181e.W(iX);
                return 0;
            }
            if (i13 != ((i14 + 1) & 15)) {
                l0Var.b();
            }
        }
        if (z11) {
            int iH = this.f5181e.H();
            i11 |= (this.f5181e.H() & 64) != 0 ? 2 : 0;
            this.f5181e.X(iH - 1);
        }
        boolean z12 = this.f5192p;
        if (B(i12)) {
            this.f5181e.V(iX);
            l0Var.c(this.f5181e, i11);
            this.f5181e.V(iG);
        }
        if (this.f5177a != 2 && !z12 && this.f5192p && length != -1) {
            this.f5194r = true;
        }
        this.f5181e.W(iX);
        return 0;
    }

    public k0(int i10, int i11, s9.r.a aVar, x7.g0 g0Var, l0.c cVar, int i12) {
        this.f5183g = (l0.c) x7.a.e(cVar);
        this.f5179c = i12;
        this.f5177a = i10;
        this.f5178b = i11;
        this.f5184h = aVar;
        if (i10 == 1 || i10 == 2) {
            this.f5180d = Collections.singletonList(g0Var);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f5180d = arrayList;
            arrayList.add(g0Var);
        }
        this.f5181e = new x7.a0(new byte[9400], 0);
        this.f5186j = new SparseBooleanArray();
        this.f5187k = new SparseBooleanArray();
        this.f5185i = new SparseArray<>();
        this.f5182f = new SparseIntArray();
        this.f5188l = new i0(i12);
        this.f5190n = v8.r.Y8;
        this.f5197u = -1;
        A();
    }

    @Override // v8.p
    public void release() {
    }

    /* JADX INFO: compiled from: TsExtractor.java */
    private class a implements d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final x7.z f5198a = new x7.z(new byte[4]);

        public a() {
        }

        @Override // ca.d0
        public void c(x7.a0 a0Var) {
            if (a0Var.H() == 0 && (a0Var.H() & 128) != 0) {
                a0Var.X(6);
                int iA = a0Var.a() / 4;
                for (int i10 = 0; i10 < iA; i10++) {
                    a0Var.k(this.f5198a, 4);
                    int iH = this.f5198a.h(16);
                    this.f5198a.r(3);
                    if (iH == 0) {
                        this.f5198a.r(13);
                    } else {
                        int iH2 = this.f5198a.h(13);
                        if (k0.this.f5185i.get(iH2) == null) {
                            k0.this.f5185i.put(iH2, new e0(k0.this.new b(iH2)));
                            k0.m(k0.this);
                        }
                    }
                }
                if (k0.this.f5177a != 2) {
                    k0.this.f5185i.remove(0);
                }
            }
        }

        @Override // ca.d0
        public void a(x7.g0 g0Var, v8.r rVar, l0.d dVar) {
        }
    }

    /* JADX INFO: compiled from: TsExtractor.java */
    private class b implements d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final x7.z f5200a = new x7.z(new byte[5]);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final SparseArray<l0> f5201b = new SparseArray<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final SparseIntArray f5202c = new SparseIntArray();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f5203d;

        public b(int i10) {
            this.f5203d = i10;
        }

        /* JADX WARN: Code duplicated, block: B:18:0x004a  */
        /* JADX WARN: Code duplicated, block: B:24:0x005c  */
        /* JADX WARN: Code duplicated, block: B:27:0x0063  */
        private l0.b b(x7.a0 a0Var, int i10) {
            int i11;
            int iF = a0Var.f();
            int i12 = iF + i10;
            int i13 = -1;
            String str = null;
            ArrayList arrayList = null;
            int iH = 0;
            while (a0Var.f() < i12) {
                int iH2 = a0Var.H();
                int iF2 = a0Var.f() + a0Var.H();
                if (iF2 > i12) {
                    break;
                }
                if (iH2 == 5) {
                    long J = a0Var.J();
                    if (J == 1094921523) {
                        i13 = 129;
                    } else if (J == 1161904947) {
                        i13 = 135;
                    } else if (J == 1094921524) {
                        i13 = 172;
                    } else if (J == 1212503619) {
                        i13 = 36;
                    }
                } else if (iH2 == 106) {
                    i13 = 129;
                } else if (iH2 == 122) {
                    i13 = 135;
                } else if (iH2 == 127) {
                    int iH3 = a0Var.H();
                    if (iH3 == 21) {
                        i13 = 172;
                    } else if (iH3 == 14) {
                        i13 = Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE;
                    } else if (iH3 == 33) {
                        i13 = 139;
                    }
                } else {
                    if (iH2 == 123) {
                        i11 = Sdk.SDKError.Reason.CONFIG_REFRESH_FAILED_VALUE;
                    } else if (iH2 == 10) {
                        String strTrim = a0Var.E(3).trim();
                        iH = a0Var.H();
                        str = strTrim;
                    } else if (iH2 == 89) {
                        ArrayList arrayList2 = new ArrayList();
                        while (a0Var.f() < iF2) {
                            String strTrim2 = a0Var.E(3).trim();
                            int iH4 = a0Var.H();
                            byte[] bArr = new byte[4];
                            a0Var.l(bArr, 0, 4);
                            arrayList2.add(new l0.a(strTrim2, iH4, bArr));
                        }
                        arrayList = arrayList2;
                        i13 = 89;
                    } else if (iH2 == 111) {
                        i11 = 257;
                    }
                    i13 = i11;
                }
                a0Var.X(iF2 - a0Var.f());
            }
            a0Var.W(i12);
            return new l0.b(i13, str, iH, arrayList, Arrays.copyOfRange(a0Var.e(), iF, i12));
        }

        @Override // ca.d0
        public void c(x7.a0 a0Var) {
            x7.g0 g0Var;
            if (a0Var.H() != 2) {
                return;
            }
            if (k0.this.f5177a == 1 || k0.this.f5177a == 2 || k0.this.f5191o == 1) {
                g0Var = (x7.g0) k0.this.f5180d.get(0);
            } else {
                g0Var = new x7.g0(((x7.g0) k0.this.f5180d.get(0)).d());
                k0.this.f5180d.add(g0Var);
            }
            if ((a0Var.H() & 128) == 0) {
                return;
            }
            a0Var.X(1);
            int iP = a0Var.P();
            int i10 = 3;
            a0Var.X(3);
            a0Var.k(this.f5200a, 2);
            this.f5200a.r(3);
            int i11 = 13;
            k0.this.f5197u = this.f5200a.h(13);
            a0Var.k(this.f5200a, 2);
            int i12 = 4;
            this.f5200a.r(4);
            a0Var.X(this.f5200a.h(12));
            if (k0.this.f5177a == 2 && k0.this.f5195s == null) {
                l0.b bVar = new l0.b(21, null, 0, null, x7.l0.f28141f);
                k0 k0Var = k0.this;
                k0Var.f5195s = k0Var.f5183g.b(21, bVar);
                if (k0.this.f5195s != null) {
                    k0.this.f5195s.a(g0Var, k0.this.f5190n, new l0.d(iP, 21, 8192));
                }
            }
            this.f5201b.clear();
            this.f5202c.clear();
            int iA = a0Var.a();
            while (iA > 0) {
                a0Var.k(this.f5200a, 5);
                int iH = this.f5200a.h(8);
                this.f5200a.r(i10);
                int iH2 = this.f5200a.h(i11);
                this.f5200a.r(i12);
                int iH3 = this.f5200a.h(12);
                l0.b bVarB = b(a0Var, iH3);
                if (iH == 6 || iH == 5) {
                    iH = bVarB.f5215a;
                }
                iA -= iH3 + 5;
                int i13 = k0.this.f5177a == 2 ? iH : iH2;
                if (!k0.this.f5186j.get(i13)) {
                    l0 l0VarB = (k0.this.f5177a == 2 && iH == 21) ? k0.this.f5195s : k0.this.f5183g.b(iH, bVarB);
                    if (k0.this.f5177a != 2 || iH2 < this.f5202c.get(i13, 8192)) {
                        this.f5202c.put(i13, iH2);
                        this.f5201b.put(i13, l0VarB);
                    }
                }
                i10 = 3;
                i12 = 4;
                i11 = 13;
            }
            int size = this.f5202c.size();
            for (int i14 = 0; i14 < size; i14++) {
                int iKeyAt = this.f5202c.keyAt(i14);
                int iValueAt = this.f5202c.valueAt(i14);
                k0.this.f5186j.put(iKeyAt, true);
                k0.this.f5187k.put(iValueAt, true);
                l0 l0VarValueAt = this.f5201b.valueAt(i14);
                if (l0VarValueAt != null) {
                    if (l0VarValueAt != k0.this.f5195s) {
                        l0VarValueAt.a(g0Var, k0.this.f5190n, new l0.d(iP, iKeyAt, 8192));
                    }
                    k0.this.f5185i.put(iValueAt, l0VarValueAt);
                }
            }
            if (k0.this.f5177a == 2) {
                if (k0.this.f5192p) {
                    return;
                }
                k0.this.f5190n.r();
                k0.this.f5191o = 0;
                k0.this.f5192p = true;
                return;
            }
            k0.this.f5185i.remove(this.f5203d);
            k0 k0Var2 = k0.this;
            k0Var2.f5191o = k0Var2.f5177a == 1 ? 0 : k0.this.f5191o - 1;
            if (k0.this.f5191o == 0) {
                k0.this.f5190n.r();
                k0.this.f5192p = true;
            }
        }

        @Override // ca.d0
        public void a(x7.g0 g0Var, v8.r rVar, l0.d dVar) {
        }
    }
}
