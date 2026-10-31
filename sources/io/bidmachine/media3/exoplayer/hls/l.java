package io.bidmachine.media3.exoplayer.hls;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import com.google.common.collect.u;
import com.google.common.collect.y;
import io.bidmachine.media3.common.ParserException;
import io.bidmachine.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import io.bidmachine.media3.decoder.DecoderInputBuffer;
import io.bidmachine.media3.exoplayer.k1;
import io.bidmachine.media3.exoplayer.source.f0;
import io.bidmachine.media3.exoplayer.source.g0;
import io.bidmachine.media3.exoplayer.source.s;
import io.bidmachine.media3.exoplayer.upstream.Loader;
import j9.m;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import n8.x;
import u7.e0;
import u7.q;
import u7.v;
import u7.w;
import v8.j0;
import v8.o0;
import v8.r;
import x7.a0;
import x7.l0;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: HlsSampleStreamWrapper.java */
/* JADX INFO: loaded from: classes4.dex */
public final class l implements Loader.b<o8.e>, Loader.f, g0, r, f0.d {
    private static final Set<Integer> Y = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
    private int A;
    private int B;
    private boolean C;
    private boolean D;
    private int E;
    private q F;
    private q G;
    private boolean H;
    private x I;
    private Set<e0> J;
    private int[] K;
    private int L;
    private boolean M;
    private boolean[] N;
    private boolean[] O;
    private long P;
    private long Q;
    private boolean R;
    private boolean S;
    private boolean T;
    private boolean U;
    private long V;
    private u7.l W;
    private e X;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f18804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f18805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f18806c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final io.bidmachine.media3.exoplayer.hls.c f18807d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final r8.b f18808e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final q f18809f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final io.bidmachine.media3.exoplayer.drm.i f18810g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final io.bidmachine.media3.exoplayer.drm.h.a f18811h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final io.bidmachine.media3.exoplayer.upstream.b f18812i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final s.a f18814k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f18815l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ArrayList<e> f18817n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final List<e> f18818o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Runnable f18819p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Runnable f18820q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Handler f18821r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final ArrayList<h> f18822s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Map<String, u7.l> f18823t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private o8.e f18824u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private d[] f18825v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Set<Integer> f18827x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private SparseIntArray f18828y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private o0 f18829z;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Loader f18813j = new Loader("Loader:HlsSampleStreamWrapper");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final io.bidmachine.media3.exoplayer.hls.c.b f18816m = new io.bidmachine.media3.exoplayer.hls.c.b();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int[] f18826w = new int[0];

    /* JADX INFO: compiled from: HlsSampleStreamWrapper.java */
    public interface b extends g0.a<l> {
        void m(Uri uri);

        void onPrepared();
    }

    /* JADX INFO: compiled from: HlsSampleStreamWrapper.java */
    private static class c implements o0 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final q f18830g = new q.b().u0("application/id3").N();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final q f18831h = new q.b().u0("application/x-emsg").N();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final g9.b f18832a = new g9.b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final o0 f18833b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final q f18834c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private q f18835d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private byte[] f18836e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f18837f;

        public c(o0 o0Var, int i10) {
            this.f18833b = o0Var;
            if (i10 == 1) {
                this.f18834c = f18830g;
            } else {
                if (i10 != 3) {
                    throw new IllegalArgumentException("Unknown metadataType: " + i10);
                }
                this.f18834c = f18831h;
            }
            this.f18836e = new byte[0];
            this.f18837f = 0;
        }

        private boolean h(g9.a aVar) {
            q qVarA = aVar.a();
            return qVarA != null && Objects.equals(this.f18834c.f26252o, qVarA.f26252o);
        }

        private void i(int i10) {
            byte[] bArr = this.f18836e;
            if (bArr.length < i10) {
                this.f18836e = Arrays.copyOf(bArr, i10 + (i10 / 2));
            }
        }

        private a0 j(int i10, int i11) {
            int i12 = this.f18837f - i11;
            a0 a0Var = new a0(Arrays.copyOfRange(this.f18836e, i12 - i10, i12));
            byte[] bArr = this.f18836e;
            System.arraycopy(bArr, i12, bArr, 0, i11);
            this.f18837f = i11;
            return a0Var;
        }

        @Override // v8.o0
        public void a(q qVar) {
            this.f18835d = qVar;
            this.f18833b.a(this.f18834c);
        }

        @Override // v8.o0
        public void d(a0 a0Var, int i10, int i11) {
            i(this.f18837f + i10);
            a0Var.l(this.f18836e, this.f18837f, i10);
            this.f18837f += i10;
        }

        @Override // v8.o0
        public int e(u7.h hVar, int i10, boolean z10, int i11) throws IOException {
            i(this.f18837f + i10);
            int i12 = hVar.read(this.f18836e, this.f18837f, i10);
            if (i12 != -1) {
                this.f18837f += i12;
                return i12;
            }
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }

        @Override // v8.o0
        public void f(long j10, int i10, int i11, int i12, o0.a aVar) {
            x7.a.e(this.f18835d);
            a0 a0VarJ = j(i11, i12);
            if (!Objects.equals(this.f18835d.f26252o, this.f18834c.f26252o)) {
                if (!"application/x-emsg".equals(this.f18835d.f26252o)) {
                    x7.r.h("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.f18835d.f26252o);
                    return;
                }
                g9.a aVarC = this.f18832a.c(a0VarJ);
                if (!h(aVarC)) {
                    x7.r.h("HlsSampleStreamWrapper", String.format("Ignoring EMSG. Expected it to contain wrapped %s but actual wrapped format: %s", this.f18834c.f26252o, aVarC.a()));
                    return;
                }
                a0VarJ = new a0((byte[]) x7.a.e(aVarC.c()));
            }
            int iA = a0VarJ.a();
            this.f18833b.b(a0VarJ, iA);
            this.f18833b.f(j10, i10, iA, 0, aVar);
        }
    }

    /* JADX INFO: compiled from: HlsSampleStreamWrapper.java */
    private static final class d extends f0 {
        private final Map<String, u7.l> H;
        private u7.l I;

        private v k0(v vVar) {
            if (vVar == null) {
                return null;
            }
            int iE = vVar.e();
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (i11 >= iE) {
                    i11 = -1;
                    break;
                }
                v.a aVarD = vVar.d(i11);
                if ((aVarD instanceof m) && "com.apple.streaming.transportStreamTimestamp".equals(((m) aVarD).f20734b)) {
                    break;
                }
                i11++;
            }
            if (i11 == -1) {
                return vVar;
            }
            if (iE == 1) {
                return null;
            }
            v.a[] aVarArr = new v.a[iE - 1];
            while (i10 < iE) {
                if (i10 != i11) {
                    aVarArr[i10 < i11 ? i10 : i10 - 1] = vVar.d(i10);
                }
                i10++;
            }
            return new v(aVarArr);
        }

        @Override // io.bidmachine.media3.exoplayer.source.f0, v8.o0
        public void f(long j10, int i10, int i11, int i12, o0.a aVar) {
            super.f(j10, i10, i11, i12, aVar);
        }

        public void l0(u7.l lVar) {
            this.I = lVar;
            L();
        }

        public void m0(e eVar) {
            i0(eVar.f18754k);
        }

        @Override // io.bidmachine.media3.exoplayer.source.f0
        public q z(q qVar) {
            u7.l lVar;
            u7.l lVar2 = this.I;
            if (lVar2 == null) {
                lVar2 = qVar.f26256s;
            }
            if (lVar2 != null && (lVar = this.H.get(lVar2.f26195c)) != null) {
                lVar2 = lVar;
            }
            v vVarK0 = k0(qVar.f26249l);
            if (lVar2 != qVar.f26256s || vVarK0 != qVar.f26249l) {
                qVar = qVar.b().Y(lVar2).n0(vVarK0).N();
            }
            return super.z(qVar);
        }

        private d(r8.b bVar, io.bidmachine.media3.exoplayer.drm.i iVar, io.bidmachine.media3.exoplayer.drm.h.a aVar, Map<String, u7.l> map) {
            super(bVar, iVar, aVar);
            this.H = map;
        }
    }

    public l(String str, int i10, b bVar, io.bidmachine.media3.exoplayer.hls.c cVar, Map<String, u7.l> map, r8.b bVar2, long j10, q qVar, io.bidmachine.media3.exoplayer.drm.i iVar, io.bidmachine.media3.exoplayer.drm.h.a aVar, io.bidmachine.media3.exoplayer.upstream.b bVar3, s.a aVar2, int i11) {
        this.f18804a = str;
        this.f18805b = i10;
        this.f18806c = bVar;
        this.f18807d = cVar;
        this.f18823t = map;
        this.f18808e = bVar2;
        this.f18809f = qVar;
        this.f18810g = iVar;
        this.f18811h = aVar;
        this.f18812i = bVar3;
        this.f18814k = aVar2;
        this.f18815l = i11;
        Set<Integer> set = Y;
        this.f18827x = new HashSet(set.size());
        this.f18828y = new SparseIntArray(set.size());
        this.f18825v = new d[0];
        this.O = new boolean[0];
        this.N = new boolean[0];
        ArrayList<e> arrayList = new ArrayList<>();
        this.f18817n = arrayList;
        this.f18818o = Collections.unmodifiableList(arrayList);
        this.f18822s = new ArrayList<>();
        this.f18819p = new Runnable() { // from class: io.bidmachine.media3.exoplayer.hls.i
            @Override // java.lang.Runnable
            public final void run() {
                this.f18800a.V();
            }
        };
        this.f18820q = new Runnable() { // from class: io.bidmachine.media3.exoplayer.hls.j
            @Override // java.lang.Runnable
            public final void run() {
                this.f18801a.f0();
            }
        };
        this.f18821r = l0.A();
        this.P = j10;
        this.Q = j10;
    }

    private void A() {
        q qVar;
        int length = this.f18825v.length;
        int i10 = -2;
        int i11 = -1;
        int i12 = 0;
        while (true) {
            int i13 = 2;
            if (i12 >= length) {
                break;
            }
            String str = ((q) x7.a.i(this.f18825v[i12].I())).f26252o;
            if (!w.t(str)) {
                i13 = w.o(str) ? 1 : w.s(str) ? 3 : -2;
            }
            if (N(i13) > N(i10)) {
                i11 = i12;
                i10 = i13;
            } else if (i13 == i10 && i11 != -1) {
                i11 = -1;
            }
            i12++;
        }
        e0 e0VarK = this.f18807d.k();
        int i14 = e0VarK.f26054a;
        this.L = -1;
        this.K = new int[length];
        for (int i15 = 0; i15 < length; i15++) {
            this.K[i15] = i15;
        }
        e0[] e0VarArr = new e0[length];
        int i16 = 0;
        while (i16 < length) {
            q qVar2 = (q) x7.a.i(this.f18825v[i16].I());
            if (i16 == i11) {
                q[] qVarArr = new q[i14];
                for (int i17 = 0; i17 < i14; i17++) {
                    q qVarA = e0VarK.a(i17);
                    if (i10 == 1 && (qVar = this.f18809f) != null) {
                        qVarA = qVarA.j(qVar);
                    }
                    qVarArr[i17] = i14 == 1 ? qVar2.j(qVarA) : G(qVarA, qVar2, true);
                }
                e0VarArr[i16] = new e0(this.f18804a, qVarArr);
                this.L = i16;
            } else {
                q qVar3 = (i10 == 2 && w.o(qVar2.f26252o)) ? this.f18809f : null;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f18804a);
                sb2.append(":muxed:");
                sb2.append(i16 < i11 ? i16 : i16 - 1);
                e0VarArr[i16] = new e0(sb2.toString(), G(qVar3, qVar2, false));
            }
            i16++;
        }
        this.I = F(e0VarArr);
        x7.a.g(this.J == null);
        this.J = Collections.emptySet();
    }

    private boolean B(int i10) {
        for (int i11 = i10; i11 < this.f18817n.size(); i11++) {
            if (this.f18817n.get(i11).f18757n) {
                return false;
            }
        }
        e eVar = this.f18817n.get(i10);
        for (int i12 = 0; i12 < this.f18825v.length; i12++) {
            if (this.f18825v[i12].F() > eVar.l(i12)) {
                return false;
            }
        }
        return true;
    }

    private static v8.m D(int i10, int i11) {
        x7.r.h("HlsSampleStreamWrapper", "Unmapped track with id " + i10 + " of type " + i11);
        return new v8.m();
    }

    private f0 E(int i10, int i11) {
        int length = this.f18825v.length;
        boolean z10 = true;
        if (i11 != 1 && i11 != 2) {
            z10 = false;
        }
        d dVar = new d(this.f18808e, this.f18810g, this.f18811h, this.f18823t);
        dVar.e0(this.P);
        if (z10) {
            dVar.l0(this.W);
        }
        dVar.d0(this.V);
        e eVar = this.X;
        if (eVar != null) {
            dVar.m0(eVar);
        }
        dVar.g0(this);
        int i12 = length + 1;
        int[] iArrCopyOf = Arrays.copyOf(this.f18826w, i12);
        this.f18826w = iArrCopyOf;
        iArrCopyOf[length] = i10;
        this.f18825v = (d[]) l0.W0(this.f18825v, dVar);
        boolean[] zArrCopyOf = Arrays.copyOf(this.O, i12);
        this.O = zArrCopyOf;
        zArrCopyOf[length] = z10;
        this.M |= z10;
        this.f18827x.add(Integer.valueOf(i11));
        this.f18828y.append(i11, length);
        if (N(i11) > N(this.A)) {
            this.B = length;
            this.A = i11;
        }
        this.N = Arrays.copyOf(this.N, i12);
        return dVar;
    }

    private x F(e0[] e0VarArr) {
        for (int i10 = 0; i10 < e0VarArr.length; i10++) {
            e0 e0Var = e0VarArr[i10];
            q[] qVarArr = new q[e0Var.f26054a];
            for (int i11 = 0; i11 < e0Var.f26054a; i11++) {
                q qVarA = e0Var.a(i11);
                qVarArr[i11] = qVarA.c(this.f18810g.n(qVarA));
            }
            e0VarArr[i10] = new e0(e0Var.f26055b, qVarArr);
        }
        return new x(e0VarArr);
    }

    private static q G(q qVar, q qVar2, boolean z10) {
        String strD;
        String strG;
        if (qVar == null) {
            return qVar2;
        }
        int iK = w.k(qVar2.f26252o);
        if (l0.R(qVar.f26248k, iK) == 1) {
            strD = l0.S(qVar.f26248k, iK);
            strG = w.g(strD);
        } else {
            strD = w.d(qVar.f26248k, qVar2.f26252o);
            strG = qVar2.f26252o;
        }
        q.b bVarS = qVar2.b().f0(qVar.f26238a).h0(qVar.f26239b).i0(qVar.f26240c).j0(qVar.f26241d).w0(qVar.f26242e).s0(qVar.f26243f).Q(z10 ? qVar.f26245h : -1).p0(z10 ? qVar.f26246i : -1).S(strD);
        if (iK == 2) {
            bVarS.B0(qVar.f26259v).d0(qVar.f26260w).b0(qVar.f26261x);
        }
        if (strG != null) {
            bVarS.u0(strG);
        }
        int i10 = qVar.E;
        if (i10 != -1 && iK == 1) {
            bVarS.R(i10);
        }
        v vVarB = qVar.f26249l;
        if (vVarB != null) {
            v vVar = qVar2.f26249l;
            if (vVar != null) {
                vVarB = vVar.b(vVarB);
            }
            bVarS.n0(vVarB);
        }
        return bVarS.N();
    }

    private void H(int i10) {
        x7.a.g(!this.f18813j.j());
        while (true) {
            if (i10 >= this.f18817n.size()) {
                i10 = -1;
                break;
            } else if (B(i10)) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == -1) {
            return;
        }
        long j10 = L().f23175h;
        e eVarI = I(i10);
        if (this.f18817n.isEmpty()) {
            this.Q = this.P;
        } else {
            ((e) y.d(this.f18817n)).n();
        }
        this.T = false;
        this.f18814k.F(this.A, eVarI.f23174g, j10);
    }

    private e I(int i10) {
        e eVar = this.f18817n.get(i10);
        ArrayList<e> arrayList = this.f18817n;
        l0.d1(arrayList, i10, arrayList.size());
        for (int i11 = 0; i11 < this.f18825v.length; i11++) {
            this.f18825v[i11].w(eVar.l(i11));
        }
        return eVar;
    }

    private boolean J(e eVar) {
        int i10 = eVar.f18754k;
        int length = this.f18825v.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (this.N[i11] && this.f18825v[i11].T() == i10) {
                return false;
            }
        }
        return true;
    }

    private static boolean K(q qVar, q qVar2) {
        String str = qVar.f26252o;
        String str2 = qVar2.f26252o;
        int iK = w.k(str);
        if (iK != 3) {
            return iK == w.k(str2);
        }
        if (Objects.equals(str, str2)) {
            return !("application/cea-608".equals(str) || "application/cea-708".equals(str)) || qVar.J == qVar2.J;
        }
        return false;
    }

    private e L() {
        ArrayList<e> arrayList = this.f18817n;
        return arrayList.get(arrayList.size() - 1);
    }

    private o0 M(int i10, int i11) {
        x7.a.a(Y.contains(Integer.valueOf(i11)));
        int i12 = this.f18828y.get(i11, -1);
        if (i12 == -1) {
            return null;
        }
        if (this.f18827x.add(Integer.valueOf(i11))) {
            this.f18826w[i12] = i10;
        }
        return this.f18826w[i12] == i10 ? this.f18825v[i12] : D(i10, i11);
    }

    private static int N(int i10) {
        if (i10 == 1) {
            return 2;
        }
        if (i10 != 2) {
            return i10 != 3 ? 0 : 1;
        }
        return 3;
    }

    private void O(e eVar) {
        this.X = eVar;
        this.F = eVar.f23171d;
        this.Q = -9223372036854775807L;
        this.f18817n.add(eVar);
        u.a aVarV = u.v();
        for (d dVar : this.f18825v) {
            aVarV.a(Integer.valueOf(dVar.J()));
        }
        eVar.m(this, aVarV.m());
        for (d dVar2 : this.f18825v) {
            dVar2.m0(eVar);
            if (eVar.f18757n) {
                dVar2.j0();
            }
        }
    }

    private static boolean P(o8.e eVar) {
        return eVar instanceof e;
    }

    private boolean Q() {
        return this.Q != -9223372036854775807L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void T(e eVar) {
        this.f18806c.m(eVar.f18756m);
    }

    private void U() {
        int i10 = this.I.f22837a;
        int[] iArr = new int[i10];
        this.K = iArr;
        Arrays.fill(iArr, -1);
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = 0;
            while (true) {
                d[] dVarArr = this.f18825v;
                if (i12 >= dVarArr.length) {
                    break;
                }
                if (K((q) x7.a.i(dVarArr[i12].I()), this.I.b(i11).a(0))) {
                    this.K[i11] = i12;
                    break;
                }
                i12++;
            }
        }
        Iterator<h> it = this.f18822s.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V() {
        if (!this.H && this.K == null && this.C) {
            for (d dVar : this.f18825v) {
                if (dVar.I() == null) {
                    return;
                }
            }
            if (this.I != null) {
                U();
                return;
            }
            A();
            o0();
            this.f18806c.onPrepared();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f0() {
        this.C = true;
        V();
    }

    private void j0() {
        for (d dVar : this.f18825v) {
            dVar.Z(this.R);
        }
        this.R = false;
    }

    private boolean k0(long j10, e eVar) {
        int length = this.f18825v.length;
        for (int i10 = 0; i10 < length; i10++) {
            d dVar = this.f18825v[i10];
            if (!(eVar != null ? dVar.b0(eVar.l(i10)) : dVar.c0(j10, false)) && (this.O[i10] || !this.M)) {
                return false;
            }
        }
        return true;
    }

    private void o0() {
        this.D = true;
    }

    private void t0(n8.s[] sVarArr) {
        this.f18822s.clear();
        for (n8.s sVar : sVarArr) {
            if (sVar != null) {
                this.f18822s.add((h) sVar);
            }
        }
    }

    private void y() {
        x7.a.g(this.D);
        x7.a.e(this.I);
        x7.a.e(this.J);
    }

    public void C() {
        if (this.D) {
            return;
        }
        c(new k1.b().f(this.P).d());
    }

    public boolean R(int i10) {
        return !Q() && this.f18825v[i10].N(this.T);
    }

    public boolean S() {
        return this.A == 2;
    }

    public void W() throws IOException {
        this.f18813j.a();
        this.f18807d.p();
    }

    public void X(int i10) throws IOException {
        W();
        this.f18825v[i10].Q();
    }

    @Override // io.bidmachine.media3.exoplayer.upstream.Loader.b
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public void o(o8.e eVar, long j10, long j11, boolean z10) {
        this.f18824u = null;
        n8.i iVar = new n8.i(eVar.f23168a, eVar.f23169b, eVar.e(), eVar.d(), j10, j11, eVar.a());
        this.f18812i.d(eVar.f23168a);
        this.f18814k.t(iVar, eVar.f23170c, this.f18805b, eVar.f23171d, eVar.f23172e, eVar.f23173f, eVar.f23174g, eVar.f23175h);
        if (z10) {
            return;
        }
        if (Q() || this.E == 0) {
            j0();
        }
        if (this.E > 0) {
            this.f18806c.h(this);
        }
    }

    @Override // io.bidmachine.media3.exoplayer.upstream.Loader.b
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public void m(o8.e eVar, long j10, long j11) {
        this.f18824u = null;
        this.f18807d.r(eVar);
        n8.i iVar = new n8.i(eVar.f23168a, eVar.f23169b, eVar.e(), eVar.d(), j10, j11, eVar.a());
        this.f18812i.d(eVar.f23168a);
        this.f18814k.w(iVar, eVar.f23170c, this.f18805b, eVar.f23171d, eVar.f23172e, eVar.f23173f, eVar.f23174g, eVar.f23175h);
        if (this.D) {
            this.f18806c.h(this);
        } else {
            c(new k1.b().f(this.P).d());
        }
    }

    @Override // io.bidmachine.media3.exoplayer.source.f0.d
    public void a(q qVar) {
        this.f18821r.post(this.f18819p);
    }

    @Override // io.bidmachine.media3.exoplayer.upstream.Loader.b
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public Loader.c s(o8.e eVar, long j10, long j11, IOException iOException, int i10) {
        Loader.c cVarH;
        int i11;
        boolean zP = P(eVar);
        if (zP && !((e) eVar).p() && (iOException instanceof HttpDataSource$InvalidResponseCodeException) && ((i11 = ((HttpDataSource$InvalidResponseCodeException) iOException).f18036d) == 410 || i11 == 404)) {
            return Loader.f19786d;
        }
        long jA = eVar.a();
        n8.i iVar = new n8.i(eVar.f23168a, eVar.f23169b, eVar.e(), eVar.d(), j10, j11, jA);
        io.bidmachine.media3.exoplayer.upstream.b.c cVar = new io.bidmachine.media3.exoplayer.upstream.b.c(iVar, new n8.j(eVar.f23170c, this.f18805b, eVar.f23171d, eVar.f23172e, eVar.f23173f, l0.t1(eVar.f23174g), l0.t1(eVar.f23175h)), iOException, i10);
        io.bidmachine.media3.exoplayer.upstream.b.C0329b c0329bB = this.f18812i.b(q8.u.c(this.f18807d.l()), cVar);
        boolean zO = (c0329bB == null || c0329bB.f19811a != 2) ? false : this.f18807d.o(eVar, c0329bB.f19812b);
        if (zO) {
            if (zP && jA == 0) {
                ArrayList<e> arrayList = this.f18817n;
                x7.a.g(arrayList.remove(arrayList.size() - 1) == eVar);
                if (this.f18817n.isEmpty()) {
                    this.Q = this.P;
                } else {
                    ((e) y.d(this.f18817n)).n();
                }
            }
            cVarH = Loader.f19788f;
        } else {
            long jC = this.f18812i.c(cVar);
            cVarH = jC != -9223372036854775807L ? Loader.h(false, jC) : Loader.f19789g;
        }
        Loader.c cVar2 = cVarH;
        boolean z10 = !cVar2.c();
        this.f18814k.y(iVar, eVar.f23170c, this.f18805b, eVar.f23171d, eVar.f23172e, eVar.f23173f, eVar.f23174g, eVar.f23175h, iOException, z10);
        if (z10) {
            this.f18824u = null;
            this.f18812i.d(eVar.f23168a);
        }
        if (zO) {
            if (this.D) {
                this.f18806c.h(this);
            } else {
                c(new k1.b().f(this.P).d());
            }
        }
        return cVar2;
    }

    @Override // io.bidmachine.media3.exoplayer.source.g0
    public long b() {
        if (Q()) {
            return this.Q;
        }
        if (this.T) {
            return Long.MIN_VALUE;
        }
        return L().f23175h;
    }

    @Override // io.bidmachine.media3.exoplayer.upstream.Loader.b
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public void n(o8.e eVar, long j10, long j11, int i10) {
        this.f18814k.C(i10 == 0 ? new n8.i(eVar.f23168a, eVar.f23169b, j10) : new n8.i(eVar.f23168a, eVar.f23169b, eVar.e(), eVar.d(), j10, j11, eVar.a()), eVar.f23170c, this.f18805b, eVar.f23171d, eVar.f23172e, eVar.f23173f, eVar.f23174g, eVar.f23175h, i10);
    }

    @Override // io.bidmachine.media3.exoplayer.source.g0
    public boolean c(k1 k1Var) {
        List<e> listEmptyList;
        long jMax;
        if (this.T || this.f18813j.j() || this.f18813j.i()) {
            return false;
        }
        if (Q()) {
            listEmptyList = Collections.emptyList();
            jMax = this.Q;
            for (d dVar : this.f18825v) {
                dVar.e0(this.Q);
            }
        } else {
            listEmptyList = this.f18818o;
            e eVarL = L();
            jMax = eVarL.g() ? eVarL.f23175h : Math.max(this.P, eVarL.f23174g);
        }
        List<e> list = listEmptyList;
        long j10 = jMax;
        this.f18816m.a();
        this.f18807d.f(k1Var, j10, list, this.D || !list.isEmpty(), this.f18816m);
        io.bidmachine.media3.exoplayer.hls.c.b bVar = this.f18816m;
        boolean z10 = bVar.f18742b;
        o8.e eVar = bVar.f18741a;
        Uri uri = bVar.f18743c;
        if (z10) {
            this.Q = -9223372036854775807L;
            this.T = true;
            return true;
        }
        if (eVar == null) {
            if (uri != null) {
                this.f18806c.m(uri);
            }
            return false;
        }
        if (P(eVar)) {
            O((e) eVar);
        }
        this.f18824u = eVar;
        this.f18813j.n(eVar, this, this.f18812i.a(eVar.f23170c));
        return true;
    }

    public void c0() {
        this.f18827x.clear();
    }

    public long d(long j10, b8.a0 a0Var) {
        return this.f18807d.c(j10, a0Var);
    }

    public boolean d0(Uri uri, io.bidmachine.media3.exoplayer.upstream.b.c cVar, boolean z10) {
        io.bidmachine.media3.exoplayer.upstream.b.C0329b c0329bB;
        if (!this.f18807d.q(uri)) {
            return true;
        }
        long j10 = (z10 || (c0329bB = this.f18812i.b(q8.u.c(this.f18807d.l()), cVar)) == null || c0329bB.f19811a != 2) ? -9223372036854775807L : c0329bB.f19812b;
        return this.f18807d.s(uri, j10) && j10 != -9223372036854775807L;
    }

    @Override // v8.r
    public o0 e(int i10, int i11) {
        o0 o0VarE;
        if (!Y.contains(Integer.valueOf(i11))) {
            int i12 = 0;
            while (true) {
                o0[] o0VarArr = this.f18825v;
                if (i12 >= o0VarArr.length) {
                    o0VarE = null;
                    break;
                }
                if (this.f18826w[i12] == i10) {
                    o0VarE = o0VarArr[i12];
                    break;
                }
                i12++;
            }
        } else {
            o0VarE = M(i10, i11);
        }
        if (o0VarE == null) {
            if (this.U) {
                return D(i10, i11);
            }
            o0VarE = E(i10, i11);
        }
        if (i11 != 5) {
            return o0VarE;
        }
        if (this.f18829z == null) {
            this.f18829z = new c(o0VarE, this.f18815l);
        }
        return this.f18829z;
    }

    public void e0() {
        if (this.f18817n.isEmpty()) {
            return;
        }
        final e eVar = (e) y.d(this.f18817n);
        int iD = this.f18807d.d(eVar);
        if (iD == 1) {
            eVar.u();
            return;
        }
        if (iD == 0) {
            this.f18821r.post(new Runnable() { // from class: io.bidmachine.media3.exoplayer.hls.k
                @Override // java.lang.Runnable
                public final void run() {
                    this.f18802a.T(eVar);
                }
            });
        } else if (iD == 2 && !this.T && this.f18813j.j()) {
            this.f18813j.f();
        }
    }

    @Override // io.bidmachine.media3.exoplayer.source.g0
    public long f() {
        if (this.T) {
            return Long.MIN_VALUE;
        }
        if (Q()) {
            return this.Q;
        }
        long jMax = this.P;
        e eVarL = L();
        if (!eVarL.g()) {
            if (this.f18817n.size() > 1) {
                ArrayList<e> arrayList = this.f18817n;
                eVarL = arrayList.get(arrayList.size() - 2);
            } else {
                eVarL = null;
            }
        }
        if (eVarL != null) {
            jMax = Math.max(jMax, eVarL.f23175h);
        }
        if (this.C) {
            for (d dVar : this.f18825v) {
                jMax = Math.max(jMax, dVar.C());
            }
        }
        return jMax;
    }

    @Override // io.bidmachine.media3.exoplayer.source.g0
    public void g(long j10) {
        if (this.f18813j.i() || Q()) {
            return;
        }
        if (this.f18813j.j()) {
            x7.a.e(this.f18824u);
            if (this.f18807d.x(j10, this.f18824u, this.f18818o)) {
                this.f18813j.f();
                return;
            }
            return;
        }
        int size = this.f18818o.size();
        while (size > 0 && this.f18807d.d(this.f18818o.get(size - 1)) == 2) {
            size--;
        }
        if (size < this.f18818o.size()) {
            H(size);
        }
        int i10 = this.f18807d.i(j10, this.f18818o);
        if (i10 < this.f18817n.size()) {
            H(i10);
        }
    }

    public void g0(e0[] e0VarArr, int i10, int... iArr) {
        this.I = F(e0VarArr);
        this.J = new HashSet();
        for (int i11 : iArr) {
            this.J.add(this.I.b(i11));
        }
        this.L = i10;
        Handler handler = this.f18821r;
        final b bVar = this.f18806c;
        Objects.requireNonNull(bVar);
        handler.post(new Runnable() { // from class: h8.g
            @Override // java.lang.Runnable
            public final void run() {
                bVar.onPrepared();
            }
        });
        o0();
    }

    public int h0(int i10, b8.u uVar, DecoderInputBuffer decoderInputBuffer, int i11) {
        if (Q()) {
            return -3;
        }
        int i12 = 0;
        if (!this.f18817n.isEmpty()) {
            int i13 = 0;
            while (i13 < this.f18817n.size() - 1 && J(this.f18817n.get(i13))) {
                i13++;
            }
            l0.d1(this.f18817n, 0, i13);
            e eVar = this.f18817n.get(0);
            q qVar = eVar.f23171d;
            if (!qVar.equals(this.G)) {
                this.f18814k.j(this.f18805b, qVar, eVar.f23172e, eVar.f23173f, eVar.f23174g);
            }
            this.G = qVar;
        }
        if (!this.f18817n.isEmpty() && !this.f18817n.get(0).p()) {
            return -3;
        }
        int iV = this.f18825v[i10].V(uVar, decoderInputBuffer, i11, this.T);
        if (iV == -5) {
            q qVarJ = (q) x7.a.e(uVar.f4168b);
            if (i10 == this.B) {
                int iD = com.google.common.primitives.f.d(this.f18825v[i10].T());
                while (i12 < this.f18817n.size() && this.f18817n.get(i12).f18754k != iD) {
                    i12++;
                }
                qVarJ = qVarJ.j(i12 < this.f18817n.size() ? this.f18817n.get(i12).f23171d : (q) x7.a.e(this.F));
            }
            uVar.f4168b = qVarJ;
        }
        return iV;
    }

    public void i0() {
        if (this.D) {
            for (d dVar : this.f18825v) {
                dVar.U();
            }
        }
        this.f18807d.t();
        this.f18813j.m(this);
        this.f18821r.removeCallbacksAndMessages(null);
        this.H = true;
        this.f18822s.clear();
    }

    @Override // io.bidmachine.media3.exoplayer.source.g0
    public boolean isLoading() {
        return this.f18813j.j();
    }

    public boolean l0(long j10, boolean z10) {
        e eVar;
        this.P = j10;
        if (Q()) {
            this.Q = j10;
            return true;
        }
        if (!this.f18807d.m()) {
            eVar = null;
            break;
        }
        int i10 = 0;
        while (true) {
            if (i10 >= this.f18817n.size()) {
                eVar = null;
                break;
            }
            eVar = this.f18817n.get(i10);
            if (eVar.f23174g == j10) {
                break;
            }
            i10++;
        }
        if (this.C && !z10 && k0(j10, eVar)) {
            return false;
        }
        this.Q = j10;
        this.T = false;
        this.f18817n.clear();
        if (this.f18813j.j()) {
            if (this.C) {
                for (d dVar : this.f18825v) {
                    dVar.s();
                }
            }
            this.f18813j.f();
        } else {
            this.f18813j.g();
            j0();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0120  */
    /* JADX WARN: Code duplicated, block: B:73:0x0129  */
    public boolean m0(q8.q[] qVarArr, boolean[] zArr, n8.s[] sVarArr, boolean[] zArr2, long j10, boolean z10) {
        boolean z11;
        boolean z12;
        y();
        int i10 = this.E;
        int i11 = 0;
        for (int i12 = 0; i12 < qVarArr.length; i12++) {
            h hVar = (h) sVarArr[i12];
            if (hVar != null && (qVarArr[i12] == null || !zArr[i12])) {
                this.E--;
                hVar.d();
                sVarArr[i12] = null;
            }
        }
        boolean z13 = z10 || (!this.S ? j10 == this.P : i10 != 0);
        q8.q qVarL = this.f18807d.l();
        boolean z14 = z13;
        q8.q qVar = qVarL;
        for (int i13 = 0; i13 < qVarArr.length; i13++) {
            q8.q qVar2 = qVarArr[i13];
            if (qVar2 != null) {
                int iD = this.I.d(qVar2.m());
                if (iD == this.L) {
                    this.f18807d.w(qVar2);
                    qVar = qVar2;
                }
                if (sVarArr[i13] == null) {
                    this.E++;
                    h hVar2 = new h(this, iD);
                    sVarArr[i13] = hVar2;
                    zArr2[i13] = true;
                    if (this.K != null) {
                        hVar2.b();
                        if (!z14) {
                            d dVar = this.f18825v[this.K[iD]];
                            z14 = (dVar.F() == 0 || dVar.c0(j10, true)) ? false : true;
                        }
                    }
                }
            }
        }
        if (this.E == 0) {
            this.f18807d.t();
            this.G = null;
            this.R = true;
            this.f18817n.clear();
            if (this.f18813j.j()) {
                if (this.C) {
                    d[] dVarArr = this.f18825v;
                    int length = dVarArr.length;
                    while (i11 < length) {
                        dVarArr[i11].s();
                        i11++;
                    }
                }
                this.f18813j.f();
            } else {
                j0();
            }
        } else {
            if (this.f18817n.isEmpty() || Objects.equals(qVar, qVarL)) {
                z11 = z10;
            } else {
                if (this.S) {
                    z12 = true;
                } else {
                    long j11 = j10 < 0 ? -j10 : 0L;
                    e eVarL = L();
                    qVar.l(j10, j11, -9223372036854775807L, this.f18818o, this.f18807d.a(eVarL, j10));
                    if (qVar.q() != this.f18807d.k().b(eVarL.f23171d)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                }
                if (z12) {
                    this.R = true;
                    z11 = true;
                    z14 = true;
                } else {
                    z11 = z10;
                }
            }
            if (z14) {
                l0(j10, z11);
                while (i11 < sVarArr.length) {
                    if (sVarArr[i11] != null) {
                        zArr2[i11] = true;
                    }
                    i11++;
                }
            }
        }
        t0(sVarArr);
        this.S = true;
        return z14;
    }

    public void n0(u7.l lVar) {
        if (Objects.equals(this.W, lVar)) {
            return;
        }
        this.W = lVar;
        int i10 = 0;
        while (true) {
            d[] dVarArr = this.f18825v;
            if (i10 >= dVarArr.length) {
                return;
            }
            if (this.O[i10]) {
                dVarArr[i10].l0(lVar);
            }
            i10++;
        }
    }

    @Override // io.bidmachine.media3.exoplayer.upstream.Loader.f
    public void p() {
        for (d dVar : this.f18825v) {
            dVar.W();
        }
    }

    public void p0(boolean z10) {
        this.f18807d.v(z10);
    }

    public void q() throws IOException {
        W();
        if (this.T && !this.D) {
            throw ParserException.b("Loading finished before preparation is complete.", null);
        }
    }

    public void q0(long j10) {
        if (this.V != j10) {
            this.V = j10;
            for (d dVar : this.f18825v) {
                dVar.d0(j10);
            }
        }
    }

    @Override // v8.r
    public void r() {
        this.U = true;
        this.f18821r.post(this.f18820q);
    }

    public int r0(int i10, long j10) {
        if (Q()) {
            return 0;
        }
        d dVar = this.f18825v[i10];
        int iH = dVar.H(j10, this.T);
        e eVar = (e) y.e(this.f18817n, null);
        if (eVar != null && !eVar.p()) {
            iH = Math.min(iH, eVar.l(i10) - dVar.F());
        }
        dVar.h0(iH);
        return iH;
    }

    public void s0(int i10) {
        y();
        x7.a.e(this.K);
        int i11 = this.K[i10];
        x7.a.g(this.N[i11]);
        this.N[i11] = false;
    }

    public x t() {
        y();
        return this.I;
    }

    public void u(long j10, boolean z10) {
        if (!this.C || Q()) {
            return;
        }
        int length = this.f18825v.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f18825v[i10].r(j10, z10, this.N[i10]);
        }
    }

    public int z(int i10) {
        y();
        x7.a.e(this.K);
        int i11 = this.K[i10];
        if (i11 == -1) {
            return this.J.contains(this.I.b(i10)) ? -3 : -2;
        }
        boolean[] zArr = this.N;
        if (zArr[i11]) {
            return -2;
        }
        zArr[i11] = true;
        return i11;
    }

    @Override // v8.r
    public void h(j0 j0Var) {
    }
}
