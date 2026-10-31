package io.bidmachine.media3.exoplayer;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import io.bidmachine.media3.common.ParserException;
import io.bidmachine.media3.datasource.DataSourceException;
import io.bidmachine.media3.exoplayer.drm.DrmSession;
import io.bidmachine.media3.exoplayer.source.BehindLiveWindowException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: ExoPlayerImplInternal.java */
/* JADX INFO: loaded from: classes4.dex */
final class i1 implements Handler.Callback, io.bidmachine.media3.exoplayer.source.q.a, q8.v.a, d2.d, k.a, f2.a, io.bidmachine.media3.exoplayer.g.a {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static final long f19027e0 = x7.l0.t1(10000);
    private final boolean A;
    private final io.bidmachine.media3.exoplayer.g B;
    private b8.a0 C;
    private e2 D;
    private e E;
    private boolean F;
    private boolean G;
    private boolean H;
    private boolean I;
    private boolean K;
    private int L;
    private boolean M;
    private boolean N;
    private boolean O;
    private boolean P;
    private int Q;
    private h R;
    private long S;
    private long T;
    private int U;
    private boolean V;
    private ExoPlaybackException W;
    private long X;
    private ExoPlayer.c Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j2[] f19028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i2[] f19030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean[] f19032c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private boolean f19033c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final q8.v f19034d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final q8.w f19036e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final j1 f19037f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final r8.d f19038g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final x7.n f19039h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final b8.x f19040i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Looper f19041j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final u7.d0.c f19042k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final u7.d0.b f19043l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final long f19044m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f19045n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final k f19046o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final ArrayList<d> f19047p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final x7.h f19048q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final f f19049r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final o1 f19050s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final d2 f19051t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final b8.v f19052u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final long f19053v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final c8.b2 f19054w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final boolean f19055x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final c8.a f19056y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final x7.n f19057z;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private long f19031b0 = -9223372036854775807L;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private float f19035d0 = 1.0f;
    private long Y = -9223372036854775807L;
    private long J = -9223372036854775807L;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private u7.d0 f19029a0 = u7.d0.f26009a;

    /* JADX INFO: compiled from: ExoPlayerImplInternal.java */
    class a implements h2.a {
        a() {
        }

        @Override // io.bidmachine.media3.exoplayer.h2.a
        public void a() {
            i1.this.O = true;
        }

        @Override // io.bidmachine.media3.exoplayer.h2.a
        public void b() {
            if (i1.this.f19055x || i1.this.P) {
                i1.this.f19039h.j(2);
            }
        }
    }

    /* JADX INFO: compiled from: ExoPlayerImplInternal.java */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<d2.c> f19059a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final n8.t f19060b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f19061c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f19062d;

        /* synthetic */ b(List list, n8.t tVar, int i10, long j10, a aVar) {
            this(list, tVar, i10, j10);
        }

        private b(List<d2.c> list, n8.t tVar, int i10, long j10) {
            this.f19059a = list;
            this.f19060b = tVar;
            this.f19061c = i10;
            this.f19062d = j10;
        }
    }

    /* JADX INFO: compiled from: ExoPlayerImplInternal.java */
    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f19063a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f19064b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f19065c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final n8.t f19066d;
    }

    /* JADX INFO: compiled from: ExoPlayerImplInternal.java */
    private static final class d implements Comparable<d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f2 f19067a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f19068b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f19069c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f19070d;

        public d(f2 f2Var) {
            this.f19067a = f2Var;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            Object obj = this.f19070d;
            if ((obj == null) != (dVar.f19070d == null)) {
                return obj != null ? -1 : 1;
            }
            if (obj == null) {
                return 0;
            }
            int i10 = this.f19068b - dVar.f19068b;
            return i10 != 0 ? i10 : x7.l0.n(this.f19069c, dVar.f19069c);
        }

        public void b(int i10, long j10, Object obj) {
            this.f19068b = i10;
            this.f19069c = j10;
            this.f19070d = obj;
        }
    }

    /* JADX INFO: compiled from: ExoPlayerImplInternal.java */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f19071a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public e2 f19072b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f19073c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f19074d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f19075e;

        public e(e2 e2Var) {
            this.f19072b = e2Var;
        }

        public void b(int i10) {
            this.f19071a |= i10 > 0;
            this.f19073c += i10;
        }

        public void c(e2 e2Var) {
            this.f19071a |= this.f19072b != e2Var;
            this.f19072b = e2Var;
        }

        public void d(int i10) {
            if (this.f19074d && this.f19075e != 5) {
                x7.a.a(i10 == 5);
                return;
            }
            this.f19071a = true;
            this.f19074d = true;
            this.f19075e = i10;
        }
    }

    /* JADX INFO: compiled from: ExoPlayerImplInternal.java */
    public interface f {
        void a(e eVar);
    }

    /* JADX INFO: compiled from: ExoPlayerImplInternal.java */
    private static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final io.bidmachine.media3.exoplayer.source.r.b f19076a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f19077b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f19078c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f19079d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f19080e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f19081f;

        public g(io.bidmachine.media3.exoplayer.source.r.b bVar, long j10, long j11, boolean z10, boolean z11, boolean z12) {
            this.f19076a = bVar;
            this.f19077b = j10;
            this.f19078c = j11;
            this.f19079d = z10;
            this.f19080e = z11;
            this.f19081f = z12;
        }
    }

    /* JADX INFO: compiled from: ExoPlayerImplInternal.java */
    private static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final u7.d0 f19082a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f19083b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f19084c;

        public h(u7.d0 d0Var, int i10, long j10) {
            this.f19082a = d0Var;
            this.f19083b = i10;
            this.f19084c = j10;
        }
    }

    public i1(Context context, h2[] h2VarArr, h2[] h2VarArr2, q8.v vVar, q8.w wVar, j1 j1Var, r8.d dVar, int i10, boolean z10, c8.a aVar, b8.a0 a0Var, b8.v vVar2, long j10, boolean z11, boolean z12, Looper looper, x7.h hVar, f fVar, c8.b2 b2Var, b8.x xVar, ExoPlayer.c cVar) {
        this.f19049r = fVar;
        this.f19034d = vVar;
        this.f19036e = wVar;
        this.f19037f = j1Var;
        this.f19038g = dVar;
        this.L = i10;
        this.M = z10;
        this.C = a0Var;
        this.f19052u = vVar2;
        this.f19053v = j10;
        this.X = j10;
        this.G = z11;
        this.f19055x = z12;
        this.f19048q = hVar;
        this.f19054w = b2Var;
        this.Z = cVar;
        this.f19056y = aVar;
        this.f19044m = j1Var.k(b2Var);
        this.f19045n = j1Var.e(b2Var);
        e2 e2VarK = e2.k(wVar);
        this.D = e2VarK;
        this.E = new e(e2VarK);
        this.f19030b = new i2[h2VarArr.length];
        this.f19032c = new boolean[h2VarArr.length];
        i2.a aVarD = vVar.d();
        this.f19028a = new j2[h2VarArr.length];
        boolean z13 = false;
        for (int i11 = 0; i11 < h2VarArr.length; i11++) {
            h2VarArr[i11].x(i11, b2Var, hVar);
            this.f19030b[i11] = h2VarArr[i11].J();
            if (aVarD != null) {
                this.f19030b[i11].l(aVarD);
            }
            h2 h2Var = h2VarArr2[i11];
            if (h2Var != null) {
                h2Var.x(h2VarArr.length + i11, b2Var, hVar);
                z13 = true;
            }
            this.f19028a[i11] = new j2(h2VarArr[i11], h2VarArr2[i11], i11);
        }
        this.A = z13;
        this.f19046o = new k(this, hVar);
        this.f19047p = new ArrayList<>();
        this.f19042k = new u7.d0.c();
        this.f19043l = new u7.d0.b();
        vVar.e(this, dVar);
        this.V = true;
        x7.n nVarB = hVar.b(looper, null);
        this.f19057z = nVarB;
        this.f19050s = new o1(aVar, nVarB, new l1.a() { // from class: io.bidmachine.media3.exoplayer.g1
            @Override // io.bidmachine.media3.exoplayer.l1.a
            public final l1 a(m1 m1Var, long j11) {
                return this.f18651a.v(m1Var, j11);
            }
        }, cVar);
        this.f19051t = new d2(this, aVar, nVarB, b2Var);
        b8.x xVar2 = xVar == null ? new b8.x() : xVar;
        this.f19040i = xVar2;
        Looper looperA = xVar2.a();
        this.f19041j = looperA;
        this.f19039h = hVar.b(looperA, this);
        this.B = new io.bidmachine.media3.exoplayer.g(context, looperA, this);
    }

    private void A() throws ExoPlaybackException {
        for (int i10 = 0; i10 < this.f19028a.length; i10++) {
            z(i10);
        }
        this.f19031b0 = -9223372036854775807L;
    }

    private void A0() {
        for (l1 l1VarU = this.f19050s.u(); l1VarU != null; l1VarU = l1VarU.k()) {
            for (q8.q qVar : l1VarU.p().f24613c) {
                if (qVar != null) {
                    qVar.u();
                }
            }
        }
    }

    private void A1(float f10) throws ExoPlaybackException {
        this.f19035d0 = f10;
        float f11 = f10 * this.B.f();
        for (j2 j2Var : this.f19028a) {
            j2Var.T(f11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:90:0x015e  */
    private void B() throws ExoPlaybackException, IOException {
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        long jA = this.f19048q.a();
        this.f19039h.l(2);
        N1();
        int i11 = this.D.f18606e;
        if (i11 == 1 || i11 == 4) {
            return;
        }
        l1 l1VarU = this.f19050s.u();
        if (l1VarU == null) {
            T0(jA);
            return;
        }
        x7.h0.a("doSomeWork");
        S1();
        if (l1VarU.f19149f) {
            this.T = x7.l0.S0(this.f19048q.elapsedRealtime());
            l1VarU.f19144a.u(this.D.f18620s - this.f19044m, this.f19045n);
            z10 = true;
            z11 = true;
            int i12 = 0;
            while (true) {
                j2[] j2VarArr = this.f19028a;
                if (i12 >= j2VarArr.length) {
                    break;
                }
                j2 j2Var = j2VarArr[i12];
                if (j2Var.h() == 0) {
                    n0(i12, false);
                } else {
                    j2Var.I(this.S, this.T);
                    z10 = z10 && j2Var.t();
                    boolean zA = j2Var.a(l1VarU);
                    n0(i12, zA);
                    z11 = z11 && zA;
                    if (!zA) {
                        m0(i12);
                    }
                }
                i12++;
            }
        } else {
            l1VarU.f19144a.q();
            z10 = true;
            z11 = true;
        }
        long j10 = l1VarU.f19151h.f19169e;
        boolean z13 = z10 && l1VarU.f19149f && (j10 == -9223372036854775807L || j10 <= this.D.f18620s);
        if (z13 && this.H) {
            this.H = false;
            m1(false, this.D.f18615n, false, 5);
        }
        if (z13 && l1VarU.f19151h.f19174j) {
            w1(4);
            J1();
        } else if (this.D.f18606e == 2 && E1(z11)) {
            w1(3);
            this.W = null;
            if (D1()) {
                V1(false, false);
                this.f19046o.g();
                G1();
            }
        } else if (this.D.f18606e == 3 && (this.Q != 0 ? !z11 : !c0())) {
            V1(D1(), false);
            w1(2);
            if (this.I) {
                A0();
                this.f19052u.c();
            }
            J1();
        }
        if (this.D.f18606e == 2) {
            int i13 = 0;
            while (true) {
                j2[] j2VarArr2 = this.f19028a;
                if (i13 >= j2VarArr2.length) {
                    break;
                }
                if (j2VarArr2[i13].w(l1VarU)) {
                    m0(i13);
                }
                i13++;
            }
            e2 e2Var = this.D;
            if (e2Var.f18608g || e2Var.f18619r >= 500000 || !b0(this.f19050s.n()) || !D1()) {
                z12 = false;
            } else {
                z12 = true;
            }
        } else {
            z12 = false;
        }
        if (!z12) {
            this.Y = -9223372036854775807L;
        } else if (this.Y == -9223372036854775807L) {
            this.Y = this.f19048q.elapsedRealtime();
        } else if (this.f19048q.elapsedRealtime() - this.Y >= 4000) {
            throw new IllegalStateException("Playback stuck buffering and not loading");
        }
        boolean z14 = D1() && this.D.f18606e == 3;
        boolean z15 = this.P && this.O && z14;
        e2 e2Var2 = this.D;
        if (e2Var2.f18617p != z15) {
            this.D = e2Var2.i(z15);
        }
        this.O = false;
        if (!z15 && (i10 = this.D.f18606e) != 4 && (z14 || i10 == 2 || (i10 == 3 && this.Q != 0))) {
            T0(jA);
        }
        x7.h0.b();
    }

    private boolean B1() {
        l1 l1VarU;
        l1 l1VarK;
        return D1() && !this.H && (l1VarU = this.f19050s.u()) != null && (l1VarK = l1VarU.k()) != null && this.S >= l1VarK.n() && l1VarK.f19152i;
    }

    private void C(l1 l1Var, int i10, boolean z10, long j10) throws ExoPlaybackException {
        j2 j2Var = this.f19028a[i10];
        if (j2Var.x()) {
            return;
        }
        boolean z11 = l1Var == this.f19050s.u();
        q8.w wVarP = l1Var.p();
        b8.y yVar = wVarP.f24612b[i10];
        q8.q qVar = wVarP.f24613c[i10];
        boolean z12 = D1() && this.D.f18606e == 3;
        boolean z13 = !z10 && z12;
        this.Q++;
        j2Var.e(yVar, qVar, l1Var.f19146c[i10], this.S, z13, z11, j10, l1Var.m(), l1Var.f19151h.f19165a, this.f19046o);
        j2Var.n(11, new a(), l1Var);
        if (z12 && z11) {
            j2Var.U();
        }
    }

    private boolean C1() {
        if (!b0(this.f19050s.n())) {
            return false;
        }
        l1 l1VarN = this.f19050s.n();
        long jN = N(l1VarN.l());
        j1.a aVar = new j1.a(this.f19054w, this.D.f18602a, l1VarN.f19151h.f19165a, l1VarN == this.f19050s.u() ? l1VarN.C(this.S) : l1VarN.C(this.S) - l1VarN.f19151h.f19166b, jN, this.f19046o.e().f26518a, this.D.f18613l, this.I, F1(this.D.f18602a, l1VarN.f19151h.f19165a) ? this.f19052u.b() : -9223372036854775807L, this.J);
        boolean zJ = this.f19037f.j(aVar);
        l1 l1VarU = this.f19050s.u();
        if (zJ || !l1VarU.f19149f || jN >= 500000) {
            return zJ;
        }
        if (this.f19044m <= 0 && !this.f19045n) {
            return zJ;
        }
        l1VarU.f19144a.u(this.D.f18620s, false);
        return this.f19037f.j(aVar);
    }

    private void D() throws ExoPlaybackException {
        E(new boolean[this.f19028a.length], this.f19050s.y().n());
    }

    private void D0() throws ExoPlaybackException {
        this.E.b(1);
        K0(false, false, false, true);
        this.f19037f.q(this.f19054w);
        w1(this.D.f18602a.q() ? 4 : 2);
        P1();
        this.f19051t.x(this.f19038g.c());
        this.f19039h.j(2);
    }

    private boolean D1() {
        e2 e2Var = this.D;
        return e2Var.f18613l && e2Var.f18615n == 0;
    }

    private void E(boolean[] zArr, long j10) throws ExoPlaybackException {
        l1 l1VarY = this.f19050s.y();
        q8.w wVarP = l1VarY.p();
        for (int i10 = 0; i10 < this.f19028a.length; i10++) {
            if (!wVarP.c(i10)) {
                this.f19028a[i10].L();
            }
        }
        for (int i11 = 0; i11 < this.f19028a.length; i11++) {
            if (wVarP.c(i11) && !this.f19028a[i11].w(l1VarY)) {
                C(l1VarY, i11, zArr[i11], j10);
            }
        }
    }

    private boolean E1(boolean z10) {
        if (this.Q == 0) {
            return c0();
        }
        boolean z11 = false;
        if (!z10) {
            return false;
        }
        if (!this.D.f18608g) {
            return true;
        }
        l1 l1VarU = this.f19050s.u();
        long jB = F1(this.D.f18602a, l1VarU.f19151h.f19165a) ? this.f19052u.b() : -9223372036854775807L;
        l1 l1VarN = this.f19050s.n();
        boolean z12 = l1VarN.s() && l1VarN.f19151h.f19174j;
        if (l1VarN.f19151h.f19165a.b() && !l1VarN.f19149f) {
            z11 = true;
        }
        if (z12 || z11) {
            return true;
        }
        return this.f19037f.g(new j1.a(this.f19054w, this.D.f18602a, l1VarU.f19151h.f19165a, l1VarU.C(this.S), N(l1VarN.j()), this.f19046o.e().f26518a, this.D.f18613l, this.I, jB, this.J));
    }

    private void F0() {
        try {
            K0(true, false, true, false);
            G0();
            this.f19037f.o(this.f19054w);
            this.B.i();
            this.f19034d.j();
            w1(1);
            this.f19040i.b();
            synchronized (this) {
                this.F = true;
                notifyAll();
            }
        } catch (Throwable th) {
            this.f19040i.b();
            synchronized (this) {
                this.F = true;
                notifyAll();
                throw th;
            }
        }
    }

    private boolean F1(u7.d0 d0Var, io.bidmachine.media3.exoplayer.source.r.b bVar) {
        if (bVar.b() || d0Var.q()) {
            return false;
        }
        d0Var.n(d0Var.h(bVar.f19684a, this.f19043l).f26020c, this.f19042k);
        if (!this.f19042k.f()) {
            return false;
        }
        u7.d0.c cVar = this.f19042k;
        return cVar.f26043i && cVar.f26040f != -9223372036854775807L;
    }

    private com.google.common.collect.u<u7.v> G(q8.q[] qVarArr) {
        com.google.common.collect.u.a aVar = new com.google.common.collect.u.a();
        boolean z10 = false;
        for (q8.q qVar : qVarArr) {
            if (qVar != null) {
                u7.v vVar = qVar.e(0).f26249l;
                if (vVar == null) {
                    aVar.a(new u7.v(new u7.v.a[0]));
                } else {
                    aVar.a(vVar);
                    z10 = true;
                }
            }
        }
        return z10 ? aVar.m() : com.google.common.collect.u.H();
    }

    private void G0() {
        for (int i10 = 0; i10 < this.f19028a.length; i10++) {
            this.f19030b[i10].m();
            this.f19028a[i10].H();
        }
    }

    private void G1() throws ExoPlaybackException {
        l1 l1VarU = this.f19050s.u();
        if (l1VarU == null) {
            return;
        }
        q8.w wVarP = l1VarU.p();
        for (int i10 = 0; i10 < this.f19028a.length; i10++) {
            if (wVarP.c(i10)) {
                this.f19028a[i10].U();
            }
        }
    }

    private long H() {
        e2 e2Var = this.D;
        return I(e2Var.f18602a, e2Var.f18603b.f19684a, e2Var.f18620s);
    }

    private void H0(int i10, int i11, n8.t tVar) throws Throwable {
        this.E.b(1);
        U(this.f19051t.B(i10, i11, tVar), false);
    }

    private long I(u7.d0 d0Var, Object obj, long j10) {
        d0Var.n(d0Var.h(obj, this.f19043l).f26020c, this.f19042k);
        u7.d0.c cVar = this.f19042k;
        if (cVar.f26040f != -9223372036854775807L && cVar.f()) {
            u7.d0.c cVar2 = this.f19042k;
            if (cVar2.f26043i) {
                return x7.l0.S0(cVar2.a() - this.f19042k.f26040f) - (j10 + this.f19043l.n());
            }
        }
        return -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void I0() throws ExoPlaybackException {
        boolean z10;
        float f10 = this.f19046o.e().f26518a;
        l1 l1VarU = this.f19050s.u();
        l1 l1VarY = this.f19050s.y();
        int i10 = 1;
        q8.w wVar = null;
        boolean z11 = true;
        while (l1VarU != null && l1VarU.f19149f) {
            e2 e2Var = this.D;
            q8.w wVarZ = l1VarU.z(f10, e2Var.f18602a, e2Var.f18613l);
            if (l1VarU == this.f19050s.u()) {
                wVar = wVarZ;
            }
            if (!wVarZ.a(l1VarU.p())) {
                if (z11) {
                    l1 l1VarU2 = this.f19050s.u();
                    boolean z12 = (this.f19050s.O(l1VarU2) & i10) != 0 ? i10 : false;
                    boolean[] zArr = new boolean[this.f19028a.length];
                    long jB = l1VarU2.b((q8.w) x7.a.e(wVar), this.D.f18620s, z12, zArr);
                    e2 e2Var2 = this.D;
                    int i11 = (e2Var2.f18606e == 4 || jB == e2Var2.f18620s) ? 0 : i10;
                    e2 e2Var3 = this.D;
                    this.D = Y(e2Var3.f18603b, jB, e2Var3.f18604c, e2Var3.f18605d, i11, 5);
                    if (i11 != 0) {
                        M0(jB);
                    }
                    y();
                    boolean[] zArr2 = new boolean[this.f19028a.length];
                    int i12 = 0;
                    while (true) {
                        j2[] j2VarArr = this.f19028a;
                        if (i12 >= j2VarArr.length) {
                            break;
                        }
                        int iH = j2VarArr[i12].h();
                        zArr2[i12] = this.f19028a[i12].x();
                        this.f19028a[i12].B(l1VarU2.f19146c[i12], this.f19046o, this.S, zArr[i12]);
                        if (iH - this.f19028a[i12].h() > 0) {
                            n0(i12, false);
                        }
                        this.Q -= iH - this.f19028a[i12].h();
                        i12++;
                    }
                    E(zArr2, this.S);
                    l1VarU2.f19152i = true;
                    z10 = true;
                } else {
                    this.f19050s.O(l1VarU);
                    if (l1VarU.f19149f) {
                        long jMax = Math.max(l1VarU.f19151h.f19166b, l1VarU.C(this.S));
                        if (this.A && t() && this.f19050s.x() == l1VarU) {
                            y();
                        }
                        l1VarU.a(wVarZ, jMax, false);
                    }
                    z10 = true;
                }
                S(z10);
                if (this.D.f18606e != 4) {
                    h0();
                    S1();
                    this.f19039h.j(2);
                    return;
                }
                return;
            }
            int i13 = i10;
            if (l1VarU == l1VarY) {
                z11 = false;
            }
            l1VarU = l1VarU.k();
            i10 = i13;
        }
    }

    private void I1(boolean z10, boolean z11) {
        K0(z10 || !this.N, false, true, false);
        this.E.b(z11 ? 1 : 0);
        this.f19037f.d(this.f19054w);
        this.B.o(this.D.f18613l, 1);
        w1(1);
    }

    private long J(l1 l1Var) {
        if (l1Var == null) {
            return 0L;
        }
        long jM = l1Var.m();
        if (!l1Var.f19149f) {
            return jM;
        }
        int i10 = 0;
        while (true) {
            j2[] j2VarArr = this.f19028a;
            if (i10 >= j2VarArr.length) {
                return jM;
            }
            if (j2VarArr[i10].w(l1Var)) {
                long jK = this.f19028a[i10].k(l1Var);
                if (jK == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                jM = Math.max(jK, jM);
            }
            i10++;
        }
    }

    private void J0() throws ExoPlaybackException {
        I0();
        V0(true);
    }

    private void J1() throws ExoPlaybackException {
        this.f19046o.h();
        for (j2 j2Var : this.f19028a) {
            j2Var.W();
        }
    }

    private Pair<io.bidmachine.media3.exoplayer.source.r.b, Long> K(u7.d0 d0Var) {
        if (d0Var.q()) {
            return Pair.create(e2.l(), 0L);
        }
        Pair<Object, Long> pairJ = d0Var.j(this.f19042k, this.f19043l, d0Var.a(this.M), -9223372036854775807L);
        io.bidmachine.media3.exoplayer.source.r.b bVarR = this.f19050s.R(d0Var, pairJ.first, 0L);
        long jLongValue = ((Long) pairJ.second).longValue();
        if (bVarR.b()) {
            d0Var.h(bVarR.f19684a, this.f19043l);
            jLongValue = bVarR.f19686c == this.f19043l.k(bVarR.f19685b) ? this.f19043l.g() : 0L;
        }
        return Pair.create(bVarR, Long.valueOf(jLongValue));
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0090 A[PHI: r2 r6 r8
      0x0090: PHI (r2v2 io.bidmachine.media3.exoplayer.source.r$b) = (r2v1 io.bidmachine.media3.exoplayer.source.r$b), (r2v11 io.bidmachine.media3.exoplayer.source.r$b) binds: [B:25:0x0068, B:27:0x008d] A[DONT_GENERATE, DONT_INLINE]
      0x0090: PHI (r6v3 long) = (r6v2 long), (r6v10 long) binds: [B:25:0x0068, B:27:0x008d] A[DONT_GENERATE, DONT_INLINE]
      0x0090: PHI (r8v2 long) = (r8v1 long), (r8v5 long) binds: [B:25:0x0068, B:27:0x008d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x00da A[PHI: r0
      0x00da: PHI (r0v11 u7.d0) = (r0v10 u7.d0), (r0v10 u7.d0), (r0v16 u7.d0), (r0v16 u7.d0) binds: [B:31:0x009f, B:33:0x00a3, B:35:0x00b4, B:37:0x00cb] A[DONT_GENERATE, DONT_INLINE]] */
    private void K0(boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14;
        u7.d0 d0Var;
        io.bidmachine.media3.exoplayer.source.r.b bVar;
        this.f19039h.l(2);
        this.W = null;
        V1(false, true);
        this.f19046o.h();
        this.S = 1000000000000L;
        try {
            A();
        } catch (ExoPlaybackException | RuntimeException e10) {
            x7.r.d("ExoPlayerImplInternal", "Disable failed.", e10);
        }
        if (z10) {
            for (j2 j2Var : this.f19028a) {
                try {
                    j2Var.L();
                } catch (RuntimeException e11) {
                    x7.r.d("ExoPlayerImplInternal", "Reset failed.", e11);
                }
            }
        }
        this.Q = 0;
        e2 e2Var = this.D;
        io.bidmachine.media3.exoplayer.source.r.b bVar2 = e2Var.f18603b;
        long jLongValue = e2Var.f18620s;
        long j10 = (this.D.f18603b.b() || d0(this.D, this.f19043l)) ? this.D.f18604c : this.D.f18620s;
        if (z11) {
            this.R = null;
            Pair<io.bidmachine.media3.exoplayer.source.r.b, Long> pairK = K(this.D.f18602a);
            bVar2 = (io.bidmachine.media3.exoplayer.source.r.b) pairK.first;
            jLongValue = ((Long) pairK.second).longValue();
            j10 = -9223372036854775807L;
            z14 = bVar2.equals(this.D.f18603b) ? false : true;
        }
        long j11 = jLongValue;
        long j12 = j10;
        this.f19050s.g();
        this.K = false;
        u7.d0 d0VarE = this.D.f18602a;
        if (z12 && (d0VarE instanceof g2)) {
            d0VarE = ((g2) d0VarE).E(this.f19051t.q());
            if (bVar2.f19685b != -1) {
                d0VarE.h(bVar2.f19684a, this.f19043l);
                if (d0VarE.n(this.f19043l.f26020c, this.f19042k).f()) {
                    d0Var = d0VarE;
                    bVar = new io.bidmachine.media3.exoplayer.source.r.b(bVar2.f19684a, bVar2.f19687d);
                } else {
                    d0Var = d0VarE;
                    bVar = bVar2;
                }
            } else {
                d0Var = d0VarE;
                bVar = bVar2;
            }
        } else {
            d0Var = d0VarE;
            bVar = bVar2;
        }
        e2 e2Var2 = this.D;
        int i10 = e2Var2.f18606e;
        ExoPlaybackException exoPlaybackException = z13 ? null : e2Var2.f18607f;
        n8.x xVar = z14 ? n8.x.f22835d : e2Var2.f18609h;
        q8.w wVar = z14 ? this.f19036e : e2Var2.f18610i;
        List listH = z14 ? com.google.common.collect.u.H() : e2Var2.f18611j;
        e2 e2Var3 = this.D;
        this.D = new e2(d0Var, bVar, j12, j11, i10, exoPlaybackException, false, xVar, wVar, listH, bVar, e2Var3.f18613l, e2Var3.f18614m, e2Var3.f18615n, e2Var3.f18616o, j11, 0L, j11, 0L, false);
        if (z12) {
            this.f19050s.N();
            this.f19051t.z();
        }
    }

    private void K1() {
        l1 l1VarN = this.f19050s.n();
        boolean z10 = this.K || (l1VarN != null && l1VarN.f19144a.isLoading());
        e2 e2Var = this.D;
        if (z10 != e2Var.f18608g) {
            this.D = e2Var.b(z10);
        }
    }

    private void L0() {
        l1 l1VarU = this.f19050s.u();
        this.H = l1VarU != null && l1VarU.f19151h.f19173i && this.G;
    }

    private void L1(io.bidmachine.media3.exoplayer.source.r.b bVar, n8.x xVar, q8.w wVar) {
        l1 l1Var = (l1) x7.a.e(this.f19050s.n());
        this.f19037f.l(new j1.a(this.f19054w, this.D.f18602a, bVar, l1Var == this.f19050s.u() ? l1Var.C(this.S) : l1Var.C(this.S) - l1Var.f19151h.f19166b, N(l1Var.j()), this.f19046o.e().f26518a, this.D.f18613l, this.I, F1(this.D.f18602a, l1Var.f19151h.f19165a) ? this.f19052u.b() : -9223372036854775807L, this.J), xVar, wVar.f24613c);
    }

    private long M() {
        return N(this.D.f18618q);
    }

    private void M0(long j10) throws ExoPlaybackException {
        l1 l1VarU = this.f19050s.u();
        long jD = l1VarU == null ? j10 + 1000000000000L : l1VarU.D(j10);
        this.S = jD;
        this.f19046o.d(jD);
        for (j2 j2Var : this.f19028a) {
            j2Var.M(l1VarU, this.S);
        }
        y0();
    }

    private void M1(int i10, int i11, List<u7.s> list) throws Throwable {
        this.E.b(1);
        U(this.f19051t.F(i10, i11, list), false);
    }

    private long N(long j10) {
        l1 l1VarN = this.f19050s.n();
        if (l1VarN == null) {
            return 0L;
        }
        return Math.max(0L, j10 - l1VarN.C(this.S));
    }

    private static void N0(u7.d0 d0Var, d dVar, u7.d0.c cVar, u7.d0.b bVar) {
        int i10 = d0Var.n(d0Var.h(dVar.f19070d, bVar).f26020c, cVar).f26049o;
        Object obj = d0Var.g(i10, bVar, true).f26019b;
        long j10 = bVar.f26021d;
        dVar.b(i10, j10 != -9223372036854775807L ? j10 - 1 : Long.MAX_VALUE, obj);
    }

    private void N1() throws ExoPlaybackException {
        if (this.D.f18602a.q() || !this.f19051t.t()) {
            return;
        }
        boolean zP0 = p0();
        t0();
        u0();
        v0();
        r0();
        s0(zP0);
    }

    private void O(int i10) throws ExoPlaybackException {
        e2 e2Var = this.D;
        R1(e2Var.f18613l, i10, e2Var.f18615n, e2Var.f18614m);
    }

    private static boolean O0(d dVar, u7.d0 d0Var, u7.d0 d0Var2, int i10, boolean z10, u7.d0.c cVar, u7.d0.b bVar) {
        Object obj = dVar.f19070d;
        if (obj == null) {
            Pair<Object, Long> pairR0 = R0(d0Var, new h(dVar.f19067a.g(), dVar.f19067a.c(), dVar.f19067a.e() == Long.MIN_VALUE ? -9223372036854775807L : x7.l0.S0(dVar.f19067a.e())), false, i10, z10, cVar, bVar);
            if (pairR0 == null) {
                return false;
            }
            dVar.b(d0Var.b(pairR0.first), ((Long) pairR0.second).longValue(), pairR0.first);
            if (dVar.f19067a.e() == Long.MIN_VALUE) {
                N0(d0Var, dVar, cVar, bVar);
            }
            return true;
        }
        int iB = d0Var.b(obj);
        if (iB == -1) {
            return false;
        }
        if (dVar.f19067a.e() == Long.MIN_VALUE) {
            N0(d0Var, dVar, cVar, bVar);
            return true;
        }
        dVar.f19068b = iB;
        d0Var2.h(dVar.f19070d, bVar);
        if (bVar.f26023f && d0Var2.n(bVar.f26020c, cVar).f26048n == d0Var2.b(dVar.f19070d)) {
            Pair<Object, Long> pairJ = d0Var.j(cVar, bVar, d0Var.h(dVar.f19070d, bVar).f26020c, dVar.f19069c + bVar.n());
            dVar.b(d0Var.b(pairJ.first), ((Long) pairJ.second).longValue(), pairJ.first);
        }
        return true;
    }

    private static int O1(int i10, int i11) {
        if (i10 == -1) {
            return 2;
        }
        if (i11 == 2) {
            return 1;
        }
        return i11;
    }

    private void P() throws ExoPlaybackException {
        A1(this.f19035d0);
    }

    private void P0(u7.d0 d0Var, u7.d0 d0Var2) {
        if (d0Var.q() && d0Var2.q()) {
            return;
        }
        for (int size = this.f19047p.size() - 1; size >= 0; size--) {
            if (!O0(this.f19047p.get(size), d0Var, d0Var2, this.L, this.M, this.f19042k, this.f19043l)) {
                this.f19047p.get(size).f19067a.j(false);
                this.f19047p.remove(size);
            }
        }
        Collections.sort(this.f19047p);
    }

    private void P1() throws ExoPlaybackException {
        e2 e2Var = this.D;
        Q1(e2Var.f18613l, e2Var.f18615n, e2Var.f18614m);
    }

    private void Q(io.bidmachine.media3.exoplayer.source.q qVar) {
        if (this.f19050s.F(qVar)) {
            this.f19050s.L(this.S);
            h0();
        } else if (this.f19050s.G(qVar)) {
            i0();
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0151  */
    /* JADX WARN: Code duplicated, block: B:51:0x016f  */
    /* JADX WARN: Code duplicated, block: B:59:0x0185  */
    /* JADX WARN: Code duplicated, block: B:68:0x019e  */
    /* JADX WARN: Code duplicated, block: B:72:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:75:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:77:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:78:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:80:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:81:0x01d8  */
    private static g Q0(u7.d0 d0Var, e2 e2Var, h hVar, o1 o1Var, int i10, boolean z10, u7.d0.c cVar, u7.d0.b bVar) {
        io.bidmachine.media3.exoplayer.source.r.b bVar2;
        int i11;
        io.bidmachine.media3.exoplayer.source.r.b bVar3;
        int i12;
        long jLongValue;
        boolean z11;
        boolean z12;
        boolean z13;
        int iA;
        boolean z14;
        long j10;
        io.bidmachine.media3.exoplayer.source.r.b bVarR;
        int i13;
        boolean z15;
        boolean z16;
        io.bidmachine.media3.exoplayer.source.r.b bVar4;
        int i14;
        int iA2;
        boolean z17;
        boolean z18;
        boolean z19;
        if (d0Var.q()) {
            return new g(e2.l(), 0L, -9223372036854775807L, false, true, false);
        }
        io.bidmachine.media3.exoplayer.source.r.b bVar5 = e2Var.f18603b;
        Object obj = bVar5.f19684a;
        boolean zD0 = d0(e2Var, bVar);
        long j11 = (e2Var.f18603b.b() || zD0) ? e2Var.f18604c : e2Var.f18620s;
        if (hVar != null) {
            bVar2 = bVar5;
            i11 = -1;
            Pair<Object, Long> pairR0 = R0(d0Var, hVar, true, i10, z10, cVar, bVar);
            if (pairR0 == null) {
                iA2 = d0Var.a(z10);
                jLongValue = j11;
                z17 = false;
                z18 = false;
                z19 = true;
            } else {
                if (hVar.f19084c == -9223372036854775807L) {
                    iA2 = d0Var.h(pairR0.first, bVar).f26020c;
                    jLongValue = j11;
                    z17 = false;
                } else {
                    obj = pairR0.first;
                    jLongValue = ((Long) pairR0.second).longValue();
                    iA2 = -1;
                    z17 = true;
                }
                z18 = e2Var.f18606e == 4;
                z19 = false;
            }
            z13 = z17;
            z11 = z18;
            z12 = z19;
            i12 = iA2;
        } else {
            bVar2 = bVar5;
            i11 = -1;
            if (!e2Var.f18602a.q()) {
                if (d0Var.b(obj) == -1) {
                    int iS0 = S0(cVar, bVar, i10, z10, obj, e2Var.f18602a, d0Var);
                    if (iS0 == -1) {
                        iS0 = d0Var.a(z10);
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    i12 = iS0;
                    z12 = z14;
                    jLongValue = j11;
                    z11 = false;
                    z13 = false;
                } else if (j11 == -9223372036854775807L) {
                    iA = d0Var.h(obj, bVar).f26020c;
                } else if (zD0) {
                    bVar3 = bVar2;
                    e2Var.f18602a.h(bVar3.f19684a, bVar);
                    if (e2Var.f18602a.n(bVar.f26020c, cVar).f26048n == e2Var.f18602a.b(bVar3.f19684a)) {
                        Pair<Object, Long> pairJ = d0Var.j(cVar, bVar, d0Var.h(obj, bVar).f26020c, j11 + bVar.n());
                        obj = pairJ.first;
                        jLongValue = ((Long) pairJ.second).longValue();
                    } else {
                        jLongValue = j11;
                    }
                    i12 = -1;
                    z11 = false;
                    z12 = false;
                    z13 = true;
                } else {
                    bVar3 = bVar2;
                    i12 = -1;
                    jLongValue = j11;
                    z11 = false;
                    z12 = false;
                    z13 = false;
                }
                if (i12 != i11) {
                    Pair<Object, Long> pairJ2 = d0Var.j(cVar, bVar, i12, -9223372036854775807L);
                    obj = pairJ2.first;
                    jLongValue = ((Long) pairJ2.second).longValue();
                    j10 = -9223372036854775807L;
                } else {
                    j10 = jLongValue;
                }
                bVarR = o1Var.R(d0Var, obj, jLongValue);
                i13 = bVarR.f19688e;
                if (i13 != i11 || ((i14 = bVar3.f19688e) != i11 && i13 >= i14)) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = (bVar3.f19684a.equals(obj) || bVar3.b() || bVarR.b() || !z15) ? false : true;
                bVar4 = bVar3;
                boolean zA0 = a0(zD0, bVar3, j11, bVarR, d0Var.h(obj, bVar), j10);
                if (z16 || zA0) {
                    bVarR = bVar4;
                }
                if (bVarR.b()) {
                    if (bVarR.equals(bVar4)) {
                        jLongValue = e2Var.f18620s;
                    } else {
                        d0Var.h(bVarR.f19684a, bVar);
                        if (bVarR.f19686c == bVar.k(bVarR.f19685b)) {
                            jLongValue = bVar.g();
                        } else {
                            jLongValue = 0;
                        }
                    }
                }
                return new g(bVarR, jLongValue, j10, z11, z12, z13);
            }
            iA = d0Var.a(z10);
            i12 = iA;
            jLongValue = j11;
            z11 = false;
            z12 = false;
            z13 = false;
        }
        bVar3 = bVar2;
        if (i12 != i11) {
            Pair<Object, Long> pairJ3 = d0Var.j(cVar, bVar, i12, -9223372036854775807L);
            obj = pairJ3.first;
            jLongValue = ((Long) pairJ3.second).longValue();
            j10 = -9223372036854775807L;
        } else {
            j10 = jLongValue;
        }
        bVarR = o1Var.R(d0Var, obj, jLongValue);
        i13 = bVarR.f19688e;
        if (i13 != i11) {
            z15 = true;
        } else {
            z15 = true;
        }
        if (bVar3.f19684a.equals(obj)) {
        }
        bVar4 = bVar3;
        boolean zA1 = a0(zD0, bVar3, j11, bVarR, d0Var.h(obj, bVar), j10);
        if (z16) {
            bVarR = bVar4;
        } else {
            bVarR = bVar4;
        }
        if (bVarR.b()) {
            if (bVarR.equals(bVar4)) {
                jLongValue = e2Var.f18620s;
            } else {
                d0Var.h(bVarR.f19684a, bVar);
                if (bVarR.f19686c == bVar.k(bVarR.f19685b)) {
                    jLongValue = bVar.g();
                } else {
                    jLongValue = 0;
                }
            }
        }
        return new g(bVarR, jLongValue, j10, z11, z12, z13);
    }

    private void Q1(boolean z10, int i10, int i11) throws ExoPlaybackException {
        R1(z10, this.B.o(z10, this.D.f18606e), i10, i11);
    }

    private void R(IOException iOException, int i10) {
        ExoPlaybackException exoPlaybackExceptionE = ExoPlaybackException.e(iOException, i10);
        l1 l1VarU = this.f19050s.u();
        if (l1VarU != null) {
            exoPlaybackExceptionE = exoPlaybackExceptionE.b(l1VarU.f19151h.f19165a);
        }
        x7.r.d("ExoPlayerImplInternal", "Playback error", exoPlaybackExceptionE);
        I1(false, false);
        this.D = this.D.f(exoPlaybackExceptionE);
    }

    private static Pair<Object, Long> R0(u7.d0 d0Var, h hVar, boolean z10, int i10, boolean z11, u7.d0.c cVar, u7.d0.b bVar) {
        int iS0;
        u7.d0 d0Var2 = hVar.f19082a;
        if (d0Var.q()) {
            return null;
        }
        u7.d0 d0Var3 = d0Var2.q() ? d0Var : d0Var2;
        try {
            Pair<Object, Long> pairJ = d0Var3.j(cVar, bVar, hVar.f19083b, hVar.f19084c);
            if (d0Var.equals(d0Var3)) {
                return pairJ;
            }
            if (d0Var.b(pairJ.first) != -1) {
                return (d0Var3.h(pairJ.first, bVar).f26023f && d0Var3.n(bVar.f26020c, cVar).f26048n == d0Var3.b(pairJ.first)) ? d0Var.j(cVar, bVar, d0Var.h(pairJ.first, bVar).f26020c, hVar.f19084c) : pairJ;
            }
            if (z10 && (iS0 = S0(cVar, bVar, i10, z11, pairJ.first, d0Var3, d0Var)) != -1) {
                return d0Var.j(cVar, bVar, iS0, -9223372036854775807L);
            }
            return null;
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    private void R1(boolean z10, int i10, int i11, int i12) throws ExoPlaybackException {
        boolean z11 = z10 && i10 != -1;
        int iO1 = O1(i10, i12);
        int iU1 = U1(i10, i11);
        e2 e2Var = this.D;
        if (e2Var.f18613l == z11 && e2Var.f18615n == iU1 && e2Var.f18614m == iO1) {
            return;
        }
        this.D = e2Var.e(z11, iO1, iU1);
        V1(false, false);
        z0(z11);
        if (!D1()) {
            J1();
            S1();
            this.f19050s.L(this.S);
            return;
        }
        int i13 = this.D.f18606e;
        if (i13 == 3) {
            this.f19046o.g();
            G1();
            this.f19039h.j(2);
        } else if (i13 == 2) {
            this.f19039h.j(2);
        }
    }

    private void S(boolean z10) {
        l1 l1VarN = this.f19050s.n();
        io.bidmachine.media3.exoplayer.source.r.b bVar = l1VarN == null ? this.D.f18603b : l1VarN.f19151h.f19165a;
        boolean z11 = !this.D.f18612k.equals(bVar);
        if (z11) {
            this.D = this.D.c(bVar);
        }
        e2 e2Var = this.D;
        e2Var.f18618q = l1VarN == null ? e2Var.f18620s : l1VarN.j();
        this.D.f18619r = M();
        if ((z11 || z10) && l1VarN != null && l1VarN.f19149f) {
            L1(l1VarN.f19151h.f19165a, l1VarN.o(), l1VarN.p());
        }
    }

    static int S0(u7.d0.c cVar, u7.d0.b bVar, int i10, boolean z10, Object obj, u7.d0 d0Var, u7.d0 d0Var2) {
        Object obj2 = d0Var.n(d0Var.h(obj, bVar).f26020c, cVar).f26035a;
        for (int i11 = 0; i11 < d0Var2.p(); i11++) {
            if (d0Var2.n(i11, cVar).f26035a.equals(obj2)) {
                return i11;
            }
        }
        int iB = d0Var.b(obj);
        int i12 = d0Var.i();
        int iD = iB;
        int iB2 = -1;
        for (int i13 = 0; i13 < i12 && iB2 == -1; i13++) {
            iD = d0Var.d(iD, bVar, cVar, i10, z10);
            if (iD == -1) {
                break;
            }
            iB2 = d0Var2.b(d0Var.m(iD));
        }
        if (iB2 == -1) {
            return -1;
        }
        return d0Var2.f(iB2, bVar).f26020c;
    }

    private void S1() throws ExoPlaybackException {
        l1 l1VarU = this.f19050s.u();
        if (l1VarU == null) {
            return;
        }
        long jK = l1VarU.f19149f ? l1VarU.f19144a.k() : -9223372036854775807L;
        if (jK != -9223372036854775807L) {
            if (!l1VarU.s()) {
                this.f19050s.O(l1VarU);
                S(false);
                h0();
            }
            M0(jK);
            if (jK != this.D.f18620s) {
                e2 e2Var = this.D;
                this.D = Y(e2Var.f18603b, jK, e2Var.f18604c, jK, true, 5);
            }
        } else {
            long jI = this.f19046o.i(l1VarU != this.f19050s.y());
            this.S = jI;
            long jC = l1VarU.C(jI);
            o0(this.D.f18620s, jC);
            if (this.f19046o.w()) {
                boolean z10 = !this.E.f19074d;
                e2 e2Var2 = this.D;
                this.D = Y(e2Var2.f18603b, jC, e2Var2.f18604c, jC, z10, 6);
            } else {
                this.D.o(jC);
            }
        }
        this.D.f18618q = this.f19050s.n().j();
        this.D.f18619r = M();
        e2 e2Var3 = this.D;
        if (e2Var3.f18613l && e2Var3.f18606e == 3 && F1(e2Var3.f18602a, e2Var3.f18603b) && this.D.f18616o.f26518a == 1.0f) {
            float fA = this.f19052u.a(H(), this.D.f18619r);
            if (this.f19046o.e().f26518a != fA) {
                g1(this.D.f18616o.b(fA));
                W(this.D.f18616o, this.f19046o.e().f26518a, false, false);
            }
        }
    }

    private void T(l1 l1Var) throws ExoPlaybackException {
        if (!l1Var.f19149f) {
            float f10 = this.f19046o.e().f26518a;
            e2 e2Var = this.D;
            l1Var.q(f10, e2Var.f18602a, e2Var.f18613l);
        }
        L1(l1Var.f19151h.f19165a, l1Var.o(), l1Var.p());
        if (l1Var == this.f19050s.u()) {
            M0(l1Var.f19151h.f19166b);
            D();
            l1Var.f19152i = true;
            e2 e2Var2 = this.D;
            io.bidmachine.media3.exoplayer.source.r.b bVar = e2Var2.f18603b;
            long j10 = l1Var.f19151h.f19166b;
            this.D = Y(bVar, j10, e2Var2.f18604c, j10, false, 5);
        }
        h0();
    }

    private void T0(long j10) {
        long jMin = (this.D.f18606e != 3 || (!this.f19055x && D1())) ? f19027e0 : 1000L;
        if (this.f19055x && D1()) {
            for (j2 j2Var : this.f19028a) {
                jMin = Math.min(jMin, x7.l0.t1(j2Var.j(this.S, this.T)));
            }
            l1 l1VarK = this.f19050s.u() != null ? this.f19050s.u().k() : null;
            if (l1VarK != null && this.S + (x7.l0.S0(jMin) * this.D.f18616o.f26518a) >= l1VarK.n()) {
                jMin = Math.min(jMin, f19027e0);
            }
        }
        this.f19039h.k(2, j10 + jMin);
    }

    private void T1(u7.d0 d0Var, io.bidmachine.media3.exoplayer.source.r.b bVar, u7.d0 d0Var2, io.bidmachine.media3.exoplayer.source.r.b bVar2, long j10, boolean z10) throws ExoPlaybackException {
        if (!F1(d0Var, bVar)) {
            u7.x xVar = bVar.b() ? u7.x.f26515d : this.D.f18616o;
            if (this.f19046o.e().equals(xVar)) {
                return;
            }
            g1(xVar);
            W(this.D.f18616o, xVar.f26518a, false, false);
            return;
        }
        d0Var.n(d0Var.h(bVar.f19684a, this.f19043l).f26020c, this.f19042k);
        this.f19052u.d((u7.s.g) x7.l0.i(this.f19042k.f26044j));
        if (j10 != -9223372036854775807L) {
            this.f19052u.e(I(d0Var, bVar.f19684a, j10));
            return;
        }
        if (!Objects.equals(!d0Var2.q() ? d0Var2.n(d0Var2.h(bVar2.f19684a, this.f19043l).f26020c, this.f19042k).f26035a : null, this.f19042k.f26035a) || z10) {
            this.f19052u.e(-9223372036854775807L);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:106:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:85:0x0190  */
    /* JADX WARN: Code duplicated, block: B:86:0x0192  */
    /* JADX WARN: Code duplicated, block: B:91:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:93:0x01b3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:99:0x01c7  */
    private void U(u7.d0 d0Var, boolean z10) throws Throwable {
        int i10;
        h hVar;
        long j10;
        h hVar2;
        boolean z11;
        boolean z12;
        long j11;
        int i11;
        long jX0;
        g gVarQ0 = Q0(d0Var, this.D, this.R, this.f19050s, this.L, this.M, this.f19042k, this.f19043l);
        io.bidmachine.media3.exoplayer.source.r.b bVar = gVarQ0.f19076a;
        long j12 = gVarQ0.f19078c;
        boolean z13 = gVarQ0.f19079d;
        long j13 = gVarQ0.f19077b;
        boolean z14 = (this.D.f18603b.equals(bVar) && j13 == this.D.f18620s) ? false : true;
        try {
            if (gVarQ0.f19080e) {
                if (this.D.f18606e != 1) {
                    w1(4);
                }
                K0(false, false, false, true);
            }
            try {
                for (j2 j2Var : this.f19028a) {
                    j2Var.R(d0Var);
                }
                try {
                    if (z14) {
                        z12 = false;
                        j11 = j12;
                        i11 = 4;
                        jX0 = j13;
                        if (!d0Var.q()) {
                            for (l1 l1VarU = this.f19050s.u(); l1VarU != null; l1VarU = l1VarU.k()) {
                                if (l1VarU.f19151h.f19165a.equals(bVar)) {
                                    l1VarU.f19151h = this.f19050s.z(d0Var, l1VarU.f19151h);
                                    l1VarU.E();
                                }
                            }
                            jX0 = X0(bVar, jX0, z13);
                        }
                    } else {
                        i11 = 4;
                        z12 = false;
                        j11 = j12;
                        jX0 = j13;
                        int iX = this.f19050s.X(d0Var, this.S, this.f19050s.y() == null ? 0L : J(this.f19050s.y()), (!t() || this.f19050s.x() == null) ? 0L : J(this.f19050s.x()));
                        if ((iX & 1) != 0) {
                            V0(false);
                        } else if ((iX & 2) != 0) {
                            y();
                        }
                    }
                    e2 e2Var = this.D;
                    T1(d0Var, bVar, e2Var.f18602a, e2Var.f18603b, gVarQ0.f19081f ? jX0 : -9223372036854775807L, false);
                    if (z14 || j11 != this.D.f18604c) {
                        e2 e2Var2 = this.D;
                        Object obj = e2Var2.f18603b.f19684a;
                        u7.d0 d0Var2 = e2Var2.f18602a;
                        this.D = Y(bVar, jX0, j11, this.D.f18605d, (!z14 || !z10 || d0Var2.q() || d0Var2.h(obj, this.f19043l).f26023f) ? z12 : true, d0Var.b(obj) == -1 ? i11 : 3);
                    }
                    L0();
                    P0(d0Var, this.D.f18602a);
                    this.D = this.D.j(d0Var);
                    if (!d0Var.q()) {
                        this.R = null;
                    }
                    S(z12);
                    this.f19039h.j(2);
                } catch (Throwable th) {
                    th = th;
                    hVar = null;
                    e2 e2Var3 = this.D;
                    u7.d0 d0Var3 = e2Var3.f18602a;
                    io.bidmachine.media3.exoplayer.source.r.b bVar2 = e2Var3.f18603b;
                    if (gVarQ0.f19081f) {
                        j10 = j12;
                    } else {
                        j10 = -9223372036854775807L;
                    }
                    hVar2 = hVar;
                    T1(d0Var, bVar, d0Var3, bVar2, j10, false);
                    if (z14 || j12 != this.D.f18604c) {
                        e2 e2Var4 = this.D;
                        Object obj2 = e2Var4.f18603b.f19684a;
                        u7.d0 d0Var4 = e2Var4.f18602a;
                        if (z14 || !z10 || d0Var4.q() || d0Var4.h(obj2, this.f19043l).f26023f) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        this.D = Y(bVar, j12, j12, this.D.f18605d, z11, d0Var.b(obj2) == -1 ? i10 : 3);
                    }
                    L0();
                    P0(d0Var, this.D.f18602a);
                    this.D = this.D.j(d0Var);
                    if (!d0Var.q()) {
                        this.R = hVar2;
                    }
                    S(false);
                    this.f19039h.j(2);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                i10 = 4;
                j12 = j13;
                hVar = null;
                e2 e2Var5 = this.D;
                u7.d0 d0Var5 = e2Var5.f18602a;
                io.bidmachine.media3.exoplayer.source.r.b bVar3 = e2Var5.f18603b;
                if (gVarQ0.f19081f) {
                    j10 = j12;
                } else {
                    j10 = -9223372036854775807L;
                }
                hVar2 = hVar;
                T1(d0Var, bVar, d0Var5, bVar3, j10, false);
                if (z14) {
                    e2 e2Var6 = this.D;
                    Object obj3 = e2Var6.f18603b.f19684a;
                    u7.d0 d0Var6 = e2Var6.f18602a;
                    if (z14) {
                        z11 = false;
                    } else {
                        z11 = false;
                    }
                    this.D = Y(bVar, j12, j12, this.D.f18605d, z11, d0Var.b(obj3) == -1 ? i10 : 3);
                } else {
                    e2 e2Var7 = this.D;
                    Object obj4 = e2Var7.f18603b.f19684a;
                    u7.d0 d0Var7 = e2Var7.f18602a;
                    if (z14) {
                        z11 = false;
                    } else {
                        z11 = false;
                    }
                    this.D = Y(bVar, j12, j12, this.D.f18605d, z11, d0Var.b(obj4) == -1 ? i10 : 3);
                }
                L0();
                P0(d0Var, this.D.f18602a);
                this.D = this.D.j(d0Var);
                if (!d0Var.q()) {
                    this.R = hVar2;
                }
                S(false);
                this.f19039h.j(2);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            i10 = 4;
        }
    }

    private static int U1(int i10, int i11) {
        if (i10 == 0) {
            return 1;
        }
        if (i11 == 1) {
            return 0;
        }
        return i11;
    }

    private void V(io.bidmachine.media3.exoplayer.source.q qVar) throws ExoPlaybackException {
        if (this.f19050s.F(qVar)) {
            T((l1) x7.a.e(this.f19050s.n()));
            return;
        }
        l1 l1VarV = this.f19050s.v(qVar);
        if (l1VarV != null) {
            x7.a.g(!l1VarV.f19149f);
            float f10 = this.f19046o.e().f26518a;
            e2 e2Var = this.D;
            l1VarV.q(f10, e2Var.f18602a, e2Var.f18613l);
            if (this.f19050s.G(qVar)) {
                i0();
            }
        }
    }

    private void V0(boolean z10) throws ExoPlaybackException {
        io.bidmachine.media3.exoplayer.source.r.b bVar = this.f19050s.u().f19151h.f19165a;
        long jY0 = Y0(bVar, this.D.f18620s, true, false);
        if (jY0 != this.D.f18620s) {
            e2 e2Var = this.D;
            this.D = Y(bVar, jY0, e2Var.f18604c, e2Var.f18605d, z10, 5);
        }
    }

    private void V1(boolean z10, boolean z11) {
        this.I = z10;
        this.J = (!z10 || z11) ? -9223372036854775807L : this.f19048q.elapsedRealtime();
    }

    private void W(u7.x xVar, float f10, boolean z10, boolean z11) throws ExoPlaybackException {
        if (z10) {
            if (z11) {
                this.E.b(1);
            }
            this.D = this.D.g(xVar);
        }
        X1(xVar.f26518a);
        for (j2 j2Var : this.f19028a) {
            j2Var.Q(f10, xVar.f26518a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00ac A[Catch: all -> 0x0147, TryCatch #1 {all -> 0x0147, blocks: (B:22:0x00a2, B:24:0x00ac, B:27:0x00b2, B:29:0x00b8, B:30:0x00bb, B:32:0x00c1, B:34:0x00cb, B:36:0x00d3, B:40:0x00db, B:42:0x00e5, B:44:0x00f5, B:48:0x00ff, B:52:0x0111, B:56:0x011a), top: B:74:0x00a2 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x00af  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b2 A[Catch: all -> 0x0147, TryCatch #1 {all -> 0x0147, blocks: (B:22:0x00a2, B:24:0x00ac, B:27:0x00b2, B:29:0x00b8, B:30:0x00bb, B:32:0x00c1, B:34:0x00cb, B:36:0x00d3, B:40:0x00db, B:42:0x00e5, B:44:0x00f5, B:48:0x00ff, B:52:0x0111, B:56:0x011a), top: B:74:0x00a2 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x00b8 A[Catch: all -> 0x0147, TryCatch #1 {all -> 0x0147, blocks: (B:22:0x00a2, B:24:0x00ac, B:27:0x00b2, B:29:0x00b8, B:30:0x00bb, B:32:0x00c1, B:34:0x00cb, B:36:0x00d3, B:40:0x00db, B:42:0x00e5, B:44:0x00f5, B:48:0x00ff, B:52:0x0111, B:56:0x011a), top: B:74:0x00a2 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00c1 A[Catch: all -> 0x0147, TryCatch #1 {all -> 0x0147, blocks: (B:22:0x00a2, B:24:0x00ac, B:27:0x00b2, B:29:0x00b8, B:30:0x00bb, B:32:0x00c1, B:34:0x00cb, B:36:0x00d3, B:40:0x00db, B:42:0x00e5, B:44:0x00f5, B:48:0x00ff, B:52:0x0111, B:56:0x011a), top: B:74:0x00a2 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00cb A[Catch: all -> 0x0147, TryCatch #1 {all -> 0x0147, blocks: (B:22:0x00a2, B:24:0x00ac, B:27:0x00b2, B:29:0x00b8, B:30:0x00bb, B:32:0x00c1, B:34:0x00cb, B:36:0x00d3, B:40:0x00db, B:42:0x00e5, B:44:0x00f5, B:48:0x00ff, B:52:0x0111, B:56:0x011a), top: B:74:0x00a2 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:51:0x0110  */
    /* JADX WARN: Code duplicated, block: B:54:0x0117  */
    /* JADX WARN: Code duplicated, block: B:55:0x0119  */
    /* JADX WARN: Code duplicated, block: B:60:0x0123  */
    private void W0(h hVar) throws Throwable {
        long jLongValue;
        long j10;
        boolean z10;
        io.bidmachine.media3.exoplayer.source.r.b bVar;
        long jG;
        long j11;
        long j12;
        long jD;
        boolean z11;
        long jX0;
        long j13;
        l1 l1VarU;
        e2 e2Var;
        int i10;
        this.E.b(1);
        Pair<Object, Long> pairR0 = R0(this.D.f18602a, hVar, true, this.L, this.M, this.f19042k, this.f19043l);
        try {
            if (pairR0 != null) {
                Object obj = pairR0.first;
                jLongValue = ((Long) pairR0.second).longValue();
                long j14 = hVar.f19084c == -9223372036854775807L ? -9223372036854775807L : jLongValue;
                io.bidmachine.media3.exoplayer.source.r.b bVarR = this.f19050s.R(this.D.f18602a, obj, jLongValue);
                if (bVarR.b()) {
                    this.D.f18602a.h(bVarR.f19684a, this.f19043l);
                    jG = this.f19043l.k(bVarR.f19685b) == bVarR.f19686c ? this.f19043l.g() : 0L;
                    j11 = j14;
                    bVar = bVarR;
                    z10 = true;
                } else {
                    j10 = j14;
                    z10 = hVar.f19084c == -9223372036854775807L;
                    bVar = bVarR;
                }
                if (this.D.f18602a.q()) {
                    if (pairR0 == null) {
                        if (this.D.f18606e != 1) {
                            w1(4);
                        }
                        K0(false, true, false, true);
                    } else {
                        if (bVar.equals(this.D.f18603b)) {
                            l1VarU = this.f19050s.u();
                            if (l1VarU == null && l1VarU.f19149f && jG != 0) {
                                jD = l1VarU.f19144a.d(jG, this.C);
                            } else {
                                jD = jG;
                            }
                            if (x7.l0.t1(jD) == x7.l0.t1(this.D.f18620s) && ((i10 = (e2Var = this.D).f18606e) == 2 || i10 == 3)) {
                                long j15 = e2Var.f18620s;
                                this.D = Y(bVar, j15, j11, j15, z10, 2);
                                return;
                            }
                        } else {
                            jD = jG;
                        }
                        if (this.D.f18606e == 4) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        jX0 = X0(bVar, jD, z11);
                        z10 |= jG != jX0;
                        try {
                            e2 e2Var2 = this.D;
                            u7.d0 d0Var = e2Var2.f18602a;
                            T1(d0Var, bVar, d0Var, e2Var2.f18603b, j11, true);
                            j13 = jX0;
                        } catch (Throwable th) {
                            th = th;
                            j12 = jX0;
                            this.D = Y(bVar, j12, j11, j12, z10, 2);
                            throw th;
                        }
                    }
                    this.D = Y(bVar, j13, j11, j13, z10, 2);
                    return;
                }
                this.R = hVar;
                j13 = jG;
                this.D = Y(bVar, j13, j11, j13, z10, 2);
                return;
            }
            Pair<io.bidmachine.media3.exoplayer.source.r.b, Long> pairK = K(this.D.f18602a);
            bVar = (io.bidmachine.media3.exoplayer.source.r.b) pairK.first;
            jLongValue = ((Long) pairK.second).longValue();
            z10 = !this.D.f18602a.q();
            j10 = -9223372036854775807L;
            if (this.D.f18602a.q()) {
                if (pairR0 == null) {
                    if (this.D.f18606e != 1) {
                        w1(4);
                    }
                    K0(false, true, false, true);
                } else {
                    if (bVar.equals(this.D.f18603b)) {
                        l1VarU = this.f19050s.u();
                        if (l1VarU == null) {
                            jD = jG;
                        } else {
                            jD = jG;
                        }
                        if (x7.l0.t1(jD) == x7.l0.t1(this.D.f18620s)) {
                            long j16 = e2Var.f18620s;
                            this.D = Y(bVar, j16, j11, j16, z10, 2);
                            return;
                        }
                    } else {
                        jD = jG;
                    }
                    if (this.D.f18606e == 4) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    jX0 = X0(bVar, jD, z11);
                    z10 |= jG != jX0;
                    e2 e2Var3 = this.D;
                    u7.d0 d0Var2 = e2Var3.f18602a;
                    T1(d0Var2, bVar, d0Var2, e2Var3.f18603b, j11, true);
                    j13 = jX0;
                }
                this.D = Y(bVar, j13, j11, j13, z10, 2);
                return;
            }
            this.R = hVar;
            j13 = jG;
            this.D = Y(bVar, j13, j11, j13, z10, 2);
            return;
        } catch (Throwable th2) {
            th = th2;
            j12 = jG;
        }
        jG = jLongValue;
        j11 = j10;
    }

    private boolean W1() throws ExoPlaybackException {
        l1 l1VarY = this.f19050s.y();
        q8.w wVarP = l1VarY.p();
        boolean z10 = true;
        int i10 = 0;
        while (true) {
            j2[] j2VarArr = this.f19028a;
            if (i10 >= j2VarArr.length) {
                break;
            }
            int iH = j2VarArr[i10].h();
            int iJ = this.f19028a[i10].J(l1VarY, wVarP, this.f19046o);
            if ((iJ & 2) != 0 && this.P) {
                j1(false);
            }
            this.Q -= iH - this.f19028a[i10].h();
            z10 &= (iJ & 1) != 0;
            i10++;
        }
        if (z10) {
            for (int i11 = 0; i11 < this.f19028a.length; i11++) {
                if (wVarP.c(i11) && !this.f19028a[i11].w(l1VarY)) {
                    C(l1VarY, i11, false, l1VarY.n());
                }
            }
        }
        return z10;
    }

    private void X(u7.x xVar, boolean z10) throws ExoPlaybackException {
        W(xVar, xVar.f26518a, true, z10);
    }

    private long X0(io.bidmachine.media3.exoplayer.source.r.b bVar, long j10, boolean z10) throws ExoPlaybackException {
        return Y0(bVar, j10, this.f19050s.u() != this.f19050s.y(), z10);
    }

    private void X1(float f10) {
        for (l1 l1VarU = this.f19050s.u(); l1VarU != null; l1VarU = l1VarU.k()) {
            for (q8.q qVar : l1VarU.p().f24613c) {
                if (qVar != null) {
                    qVar.h(f10);
                }
            }
        }
    }

    private e2 Y(io.bidmachine.media3.exoplayer.source.r.b bVar, long j10, long j11, long j12, boolean z10, int i10) {
        List<u7.v> listH;
        n8.x xVar;
        q8.w wVar;
        this.V = (!this.V && j10 == this.D.f18620s && bVar.equals(this.D.f18603b)) ? false : true;
        L0();
        e2 e2Var = this.D;
        n8.x xVar2 = e2Var.f18609h;
        q8.w wVar2 = e2Var.f18610i;
        List<u7.v> list = e2Var.f18611j;
        if (this.f19051t.t()) {
            l1 l1VarU = this.f19050s.u();
            n8.x xVarO = l1VarU == null ? n8.x.f22835d : l1VarU.o();
            q8.w wVarP = l1VarU == null ? this.f19036e : l1VarU.p();
            com.google.common.collect.u<u7.v> uVarG = G(wVarP.f24613c);
            if (l1VarU != null) {
                m1 m1Var = l1VarU.f19151h;
                if (m1Var.f19167c != j11) {
                    l1VarU.f19151h = m1Var.a(j11);
                }
            }
            q0();
            xVar = xVarO;
            wVar = wVarP;
            listH = uVarG;
        } else if (bVar.equals(this.D.f18603b)) {
            listH = list;
            xVar = xVar2;
            wVar = wVar2;
        } else {
            xVar = n8.x.f22835d;
            wVar = this.f19036e;
            listH = com.google.common.collect.u.H();
        }
        if (z10) {
            this.E.d(i10);
        }
        return this.D.d(bVar, j10, j11, j12, M(), xVar, wVar, listH);
    }

    private long Y0(io.bidmachine.media3.exoplayer.source.r.b bVar, long j10, boolean z10, boolean z11) throws ExoPlaybackException {
        J1();
        V1(false, true);
        if (z11 || this.D.f18606e == 3) {
            w1(2);
        }
        l1 l1VarU = this.f19050s.u();
        l1 l1VarK = l1VarU;
        while (l1VarK != null && !bVar.equals(l1VarK.f19151h.f19165a)) {
            l1VarK = l1VarK.k();
        }
        if (z10 || l1VarU != l1VarK || (l1VarK != null && l1VarK.D(j10) < 0)) {
            A();
            if (l1VarK != null) {
                while (this.f19050s.u() != l1VarK) {
                    this.f19050s.b();
                }
                this.f19050s.O(l1VarK);
                l1VarK.B(1000000000000L);
                D();
                l1VarK.f19152i = true;
            }
        }
        y();
        if (l1VarK != null) {
            this.f19050s.O(l1VarK);
            if (!l1VarK.f19149f) {
                l1VarK.f19151h = l1VarK.f19151h.b(j10);
            } else if (l1VarK.f19150g) {
                long j11 = l1VarK.f19144a.j(j10);
                l1VarK.f19144a.u(j11 - this.f19044m, this.f19045n);
                j10 = j11;
            }
            M0(j10);
            h0();
        } else {
            this.f19050s.g();
            M0(j10);
        }
        S(false);
        this.f19039h.j(2);
        return j10;
    }

    private synchronized void Y1(com.google.common.base.w<Boolean> wVar, long j10) {
        long jElapsedRealtime = this.f19048q.elapsedRealtime() + j10;
        boolean z10 = false;
        while (!wVar.get().booleanValue() && j10 > 0) {
            try {
                this.f19048q.c();
                wait(j10);
            } catch (InterruptedException unused) {
                z10 = true;
            }
            j10 = jElapsedRealtime - this.f19048q.elapsedRealtime();
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    private boolean Z() {
        l1 l1VarY = this.f19050s.y();
        if (!l1VarY.f19149f) {
            return false;
        }
        int i10 = 0;
        while (true) {
            j2[] j2VarArr = this.f19028a;
            if (i10 >= j2VarArr.length) {
                return true;
            }
            if (!j2VarArr[i10].o(l1VarY)) {
                return false;
            }
            i10++;
        }
    }

    private void Z0(f2 f2Var) throws ExoPlaybackException {
        if (f2Var.e() == -9223372036854775807L) {
            a1(f2Var);
            return;
        }
        if (this.D.f18602a.q()) {
            this.f19047p.add(new d(f2Var));
            return;
        }
        d dVar = new d(f2Var);
        u7.d0 d0Var = this.D.f18602a;
        if (!O0(dVar, d0Var, d0Var, this.L, this.M, this.f19042k, this.f19043l)) {
            f2Var.j(false);
        } else {
            this.f19047p.add(dVar);
            Collections.sort(this.f19047p);
        }
    }

    private static boolean a0(boolean z10, io.bidmachine.media3.exoplayer.source.r.b bVar, long j10, io.bidmachine.media3.exoplayer.source.r.b bVar2, u7.d0.b bVar3, long j11) {
        if (z10 || j10 != j11 || !bVar.f19684a.equals(bVar2.f19684a)) {
            return false;
        }
        if (bVar.b() && bVar3.r(bVar.f19685b)) {
            return (bVar3.h(bVar.f19685b, bVar.f19686c) == 4 || bVar3.h(bVar.f19685b, bVar.f19686c) == 2) ? false : true;
        }
        return bVar2.b() && bVar3.r(bVar2.f19685b);
    }

    private void a1(f2 f2Var) throws ExoPlaybackException {
        if (f2Var.b() != this.f19041j) {
            this.f19039h.e(15, f2Var).a();
            return;
        }
        w(f2Var);
        int i10 = this.D.f18606e;
        if (i10 == 3 || i10 == 2) {
            this.f19039h.j(2);
        }
    }

    private boolean b0(l1 l1Var) {
        return (l1Var == null || l1Var.r() || l1Var.l() == Long.MIN_VALUE) ? false : true;
    }

    private void b1(final f2 f2Var) {
        Looper looperB = f2Var.b();
        if (looperB.getThread().isAlive()) {
            this.f19048q.b(looperB, null).i(new Runnable() { // from class: io.bidmachine.media3.exoplayer.e1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f18599a.g0(f2Var);
                }
            });
        } else {
            x7.r.h("TAG", "Trying to send message on a dead thread.");
            f2Var.j(false);
        }
    }

    private boolean c0() {
        l1 l1VarU = this.f19050s.u();
        long j10 = l1VarU.f19151h.f19169e;
        return l1VarU.f19149f && (j10 == -9223372036854775807L || this.D.f18620s < j10 || !D1());
    }

    private void c1(long j10) {
        for (j2 j2Var : this.f19028a) {
            j2Var.N(j10);
        }
    }

    private static boolean d0(e2 e2Var, u7.d0.b bVar) {
        io.bidmachine.media3.exoplayer.source.r.b bVar2 = e2Var.f18603b;
        u7.d0 d0Var = e2Var.f18602a;
        return d0Var.q() || d0Var.h(bVar2.f19684a, bVar).f26023f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e0(int i10, boolean z10) {
        this.f19056y.g0(i10, this.f19028a[i10].m(), z10);
    }

    private void e1(u7.c cVar, boolean z10) throws ExoPlaybackException {
        this.f19034d.l(cVar);
        io.bidmachine.media3.exoplayer.g gVar = this.B;
        if (!z10) {
            cVar = null;
        }
        gVar.l(cVar);
        P1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean f0() {
        return Boolean.valueOf(this.F);
    }

    private void f1(boolean z10, AtomicBoolean atomicBoolean) {
        if (this.N != z10) {
            this.N = z10;
            if (!z10) {
                for (j2 j2Var : this.f19028a) {
                    j2Var.L();
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g0(f2 f2Var) {
        try {
            w(f2Var);
        } catch (ExoPlaybackException e10) {
            x7.r.d("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e10);
            throw new RuntimeException(e10);
        }
    }

    private void g1(u7.x xVar) {
        this.f19039h.l(16);
        this.f19046o.c(xVar);
    }

    private void h0() {
        boolean zC1 = C1();
        this.K = zC1;
        if (zC1) {
            l1 l1Var = (l1) x7.a.e(this.f19050s.n());
            l1Var.e(new k1.b().f(l1Var.C(this.S)).g(this.f19046o.e().f26518a).e(this.J).d());
        }
        K1();
    }

    private void h1(b bVar) throws Throwable {
        this.E.b(1);
        if (bVar.f19061c != -1) {
            this.R = new h(new g2(bVar.f19059a, bVar.f19060b), bVar.f19061c, bVar.f19062d);
        }
        U(this.f19051t.D(bVar.f19059a, bVar.f19060b), false);
    }

    private void i0() {
        this.f19050s.J();
        l1 l1VarW = this.f19050s.w();
        if (l1VarW != null) {
            if ((!l1VarW.f19148e || l1VarW.f19149f) && !l1VarW.f19144a.isLoading()) {
                if (this.f19037f.m(this.D.f18602a, l1VarW.f19151h.f19165a, l1VarW.f19149f ? l1VarW.f19144a.f() : 0L)) {
                    if (l1VarW.f19148e) {
                        l1VarW.e(new k1.b().f(l1VarW.C(this.S)).g(this.f19046o.e().f26518a).e(this.J).d());
                    } else {
                        l1VarW.v(this, l1VarW.f19151h.f19166b);
                    }
                }
            }
        }
    }

    private void j0() throws ExoPlaybackException {
        for (j2 j2Var : this.f19028a) {
            j2Var.D();
        }
    }

    private void j1(boolean z10) {
        if (z10 == this.P) {
            return;
        }
        this.P = z10;
        if (z10 || !this.D.f18617p) {
            return;
        }
        this.f19039h.j(2);
    }

    private void k0() {
        this.E.c(this.D);
        if (this.E.f19071a) {
            this.f19049r.a(this.E);
            this.E = new e(this.D);
        }
    }

    private void k1(boolean z10) throws ExoPlaybackException {
        this.G = z10;
        L0();
        if (!this.H || this.f19050s.y() == this.f19050s.u()) {
            return;
        }
        V0(true);
        S(false);
    }

    private void l0() throws ExoPlaybackException {
        l1 l1VarX = this.f19050s.x();
        if (l1VarX == null) {
            return;
        }
        q8.w wVarP = l1VarX.p();
        for (int i10 = 0; i10 < this.f19028a.length; i10++) {
            if (wVarP.c(i10) && this.f19028a[i10].s() && !this.f19028a[i10].u()) {
                this.f19028a[i10].V();
                C(l1VarX, i10, false, l1VarX.n());
            }
        }
        if (t()) {
            this.f19031b0 = l1VarX.f19144a.k();
            if (l1VarX.s()) {
                return;
            }
            this.f19050s.O(l1VarX);
            S(false);
            h0();
        }
    }

    private void m0(int i10) throws ExoPlaybackException, IOException {
        j2 j2Var = this.f19028a[i10];
        try {
            j2Var.G((l1) x7.a.e(this.f19050s.u()));
        } catch (IOException | RuntimeException e10) {
            int iM = j2Var.m();
            if (iM != 3 && iM != 5) {
                throw e10;
            }
            q8.w wVarP = this.f19050s.u().p();
            x7.r.d("ExoPlayerImplInternal", "Disabling track due to error: " + u7.q.i(wVarP.f24613c[i10].s()), e10);
            q8.w wVar = new q8.w((b8.y[]) wVarP.f24612b.clone(), (q8.q[]) wVarP.f24613c.clone(), wVarP.f24614d, wVarP.f24615e);
            wVar.f24612b[i10] = null;
            wVar.f24613c[i10] = null;
            z(i10);
            this.f19050s.u().a(wVar, this.D.f18620s, false);
        }
    }

    private void m1(boolean z10, int i10, boolean z11, int i11) throws ExoPlaybackException {
        this.E.b(z11 ? 1 : 0);
        Q1(z10, i10, i11);
    }

    private void n0(final int i10, final boolean z10) {
        boolean[] zArr = this.f19032c;
        if (zArr[i10] != z10) {
            zArr[i10] = z10;
            this.f19057z.i(new Runnable() { // from class: io.bidmachine.media3.exoplayer.f1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f18624a.e0(i10, z10);
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0045, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0074, code lost:
    
        r3 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void o0(long r8, long r10) throws io.bidmachine.media3.exoplayer.ExoPlaybackException {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.media3.exoplayer.i1.o0(long, long):void");
    }

    private void o1(u7.x xVar) throws ExoPlaybackException {
        g1(xVar);
        X(this.f19046o.e(), true);
    }

    private boolean p0() throws ExoPlaybackException {
        m1 m1VarT;
        this.f19050s.L(this.S);
        boolean z10 = false;
        if (this.f19050s.U() && (m1VarT = this.f19050s.t(this.S, this.D)) != null) {
            l1 l1VarH = this.f19050s.h(m1VarT);
            if (!l1VarH.f19148e) {
                l1VarH.v(this, m1VarT.f19166b);
            } else if (l1VarH.f19149f) {
                this.f19039h.e(8, l1VarH.f19144a).a();
            }
            if (this.f19050s.u() == l1VarH) {
                M0(m1VarT.f19166b);
            }
            S(false);
            z10 = true;
        }
        if (this.K) {
            this.K = b0(this.f19050s.n());
            K1();
        } else {
            h0();
        }
        return z10;
    }

    private void p1(ExoPlayer.c cVar) {
        this.Z = cVar;
        this.f19050s.W(this.D.f18602a, cVar);
    }

    private void q0() {
        l1 l1VarU;
        boolean z10;
        if (this.f19050s.u() == this.f19050s.y() && (l1VarU = this.f19050s.u()) != null) {
            q8.w wVarP = l1VarU.p();
            boolean z11 = false;
            int i10 = 0;
            boolean z12 = false;
            while (true) {
                if (i10 >= this.f19028a.length) {
                    z10 = true;
                    break;
                }
                if (wVarP.c(i10)) {
                    if (this.f19028a[i10].m() != 1) {
                        z10 = false;
                        break;
                    } else if (wVarP.f24612b[i10].f4174a != 0) {
                        z12 = true;
                    }
                }
                i10++;
            }
            if (z12 && z10) {
                z11 = true;
            }
            j1(z11);
        }
    }

    private void r(b bVar, int i10) throws Throwable {
        this.E.b(1);
        d2 d2Var = this.f19051t;
        if (i10 == -1) {
            i10 = d2Var.r();
        }
        U(d2Var.f(i10, bVar.f19059a, bVar.f19060b), false);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0047  */
    private void r0() throws ExoPlaybackException {
        boolean z10;
        boolean z11 = false;
        while (B1()) {
            if (z11) {
                k0();
            }
            this.f19033c0 = false;
            l1 l1Var = (l1) x7.a.e(this.f19050s.b());
            if (this.D.f18603b.f19684a.equals(l1Var.f19151h.f19165a.f19684a)) {
                io.bidmachine.media3.exoplayer.source.r.b bVar = this.D.f18603b;
                if (bVar.f19685b == -1) {
                    io.bidmachine.media3.exoplayer.source.r.b bVar2 = l1Var.f19151h.f19165a;
                    if (bVar2.f19685b != -1 || bVar.f19688e == bVar2.f19688e) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            m1 m1Var = l1Var.f19151h;
            io.bidmachine.media3.exoplayer.source.r.b bVar3 = m1Var.f19165a;
            long j10 = m1Var.f19166b;
            this.D = Y(bVar3, j10, m1Var.f19167c, j10, !z10, 0);
            L0();
            S1();
            if (t() && l1Var == this.f19050s.x()) {
                j0();
            }
            if (this.D.f18606e == 3) {
                G1();
            }
            s();
            z11 = true;
        }
    }

    private void r1(int i10) throws ExoPlaybackException {
        this.L = i10;
        int iY = this.f19050s.Y(this.D.f18602a, i10);
        if ((iY & 1) != 0) {
            V0(true);
        } else if ((iY & 2) != 0) {
            y();
        }
        S(false);
    }

    private void s() {
        q8.w wVarP = this.f19050s.u().p();
        for (int i10 = 0; i10 < this.f19028a.length; i10++) {
            if (wVarP.c(i10)) {
                this.f19028a[i10].f();
            }
        }
    }

    private void s0(boolean z10) {
        if (this.Z.f18099a == -9223372036854775807L) {
            return;
        }
        if (z10 || !this.D.f18602a.equals(this.f19029a0)) {
            u7.d0 d0Var = this.D.f18602a;
            this.f19029a0 = d0Var;
            this.f19050s.B(d0Var);
        }
        i0();
    }

    private void s1(b8.a0 a0Var) {
        this.C = a0Var;
    }

    private boolean t() {
        if (!this.A) {
            return false;
        }
        for (j2 j2Var : this.f19028a) {
            if (j2Var.u()) {
                return true;
            }
        }
        return false;
    }

    private void t0() throws ExoPlaybackException {
        l1 l1VarX;
        if (this.H || !this.A || this.f19033c0 || t() || (l1VarX = this.f19050s.x()) == null || l1VarX != this.f19050s.y() || l1VarX.k() == null || !l1VarX.k().f19149f) {
            return;
        }
        this.f19050s.c();
        l0();
    }

    private void u() throws ExoPlaybackException {
        J0();
    }

    private void u0() throws ExoPlaybackException {
        l1 l1VarY = this.f19050s.y();
        if (l1VarY == null) {
            return;
        }
        int i10 = 0;
        if (l1VarY.k() == null || this.H) {
            if (l1VarY.f19151h.f19174j || this.H) {
                j2[] j2VarArr = this.f19028a;
                int length = j2VarArr.length;
                while (i10 < length) {
                    j2 j2Var = j2VarArr[i10];
                    if (j2Var.w(l1VarY) && j2Var.r(l1VarY)) {
                        long j10 = l1VarY.f19151h.f19169e;
                        j2Var.O(l1VarY, (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? -9223372036854775807L : l1VarY.m() + l1VarY.f19151h.f19169e);
                    }
                    i10++;
                }
                return;
            }
            return;
        }
        if (Z()) {
            if (t() && this.f19050s.x() == this.f19050s.y()) {
                return;
            }
            if (l1VarY.k().f19149f || this.S >= l1VarY.k().n()) {
                q8.w wVarP = l1VarY.p();
                l1 l1VarD = this.f19050s.d();
                q8.w wVarP2 = l1VarD.p();
                u7.d0 d0Var = this.D.f18602a;
                T1(d0Var, l1VarD.f19151h.f19165a, d0Var, l1VarY.f19151h.f19165a, -9223372036854775807L, false);
                if (l1VarD.f19149f && ((this.A && this.f19031b0 != -9223372036854775807L) || l1VarD.f19144a.k() != -9223372036854775807L)) {
                    this.f19031b0 = -9223372036854775807L;
                    boolean z10 = this.A && !this.f19033c0;
                    if (z10) {
                        for (int i11 = 0; i11 < this.f19028a.length; i11++) {
                            if (wVarP2.c(i11) && !u7.w.a(wVarP2.f24613c[i11].s().f26252o, wVarP2.f24613c[i11].s().f26248k) && !this.f19028a[i11].u()) {
                                z10 = false;
                                break;
                            }
                        }
                    }
                    if (!z10) {
                        c1(l1VarD.n());
                        if (l1VarD.s()) {
                            return;
                        }
                        this.f19050s.O(l1VarD);
                        S(false);
                        h0();
                        return;
                    }
                }
                j2[] j2VarArr2 = this.f19028a;
                int length2 = j2VarArr2.length;
                while (i10 < length2) {
                    j2VarArr2[i10].F(wVarP, wVarP2, l1VarD.n());
                    i10++;
                }
            }
        }
    }

    private void u1(boolean z10) throws ExoPlaybackException {
        this.M = z10;
        int iZ = this.f19050s.Z(this.D.f18602a, z10);
        if ((iZ & 1) != 0) {
            V0(true);
        } else if ((iZ & 2) != 0) {
            y();
        }
        S(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public l1 v(m1 m1Var, long j10) {
        return new l1(this.f19030b, j10, this.f19034d, this.f19037f.h(), this.f19051t, m1Var, this.f19036e, this.Z.f18099a);
    }

    private void v0() throws ExoPlaybackException {
        l1 l1VarY = this.f19050s.y();
        if (l1VarY == null || this.f19050s.u() == l1VarY || l1VarY.f19152i || !W1()) {
            return;
        }
        this.f19050s.y().f19152i = true;
    }

    private void v1(n8.t tVar) throws Throwable {
        this.E.b(1);
        U(this.f19051t.E(tVar), false);
    }

    private void w(f2 f2Var) throws ExoPlaybackException {
        if (f2Var.i()) {
            return;
        }
        try {
            f2Var.f().z(f2Var.h(), f2Var.d());
        } finally {
            f2Var.j(true);
        }
    }

    private void w0() throws Throwable {
        U(this.f19051t.i(), true);
    }

    private void w1(int i10) {
        e2 e2Var = this.D;
        if (e2Var.f18606e != i10) {
            if (i10 != 2) {
                this.Y = -9223372036854775807L;
            }
            this.D = e2Var.h(i10);
        }
    }

    private void x0(c cVar) throws Throwable {
        this.E.b(1);
        U(this.f19051t.w(cVar.f19063a, cVar.f19064b, cVar.f19065c, cVar.f19066d), false);
    }

    private void y() {
        if (this.A && t()) {
            for (j2 j2Var : this.f19028a) {
                int iH = j2Var.h();
                j2Var.c(this.f19046o);
                this.Q -= iH - j2Var.h();
            }
            this.f19031b0 = -9223372036854775807L;
        }
    }

    private void y0() {
        for (l1 l1VarU = this.f19050s.u(); l1VarU != null; l1VarU = l1VarU.k()) {
            for (q8.q qVar : l1VarU.p().f24613c) {
                if (qVar != null) {
                    qVar.j();
                }
            }
        }
    }

    private void y1(Object obj, AtomicBoolean atomicBoolean) throws ExoPlaybackException {
        for (j2 j2Var : this.f19028a) {
            j2Var.S(obj);
        }
        int i10 = this.D.f18606e;
        if (i10 == 3 || i10 == 2) {
            this.f19039h.j(2);
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    private void z(int i10) throws ExoPlaybackException {
        int iH = this.f19028a[i10].h();
        this.f19028a[i10].b(this.f19046o);
        n0(i10, false);
        this.Q -= iH;
    }

    private void z0(boolean z10) {
        for (l1 l1VarU = this.f19050s.u(); l1VarU != null; l1VarU = l1VarU.k()) {
            for (q8.q qVar : l1VarU.p().f24613c) {
                if (qVar != null) {
                    qVar.n(z10);
                }
            }
        }
    }

    @Override // io.bidmachine.media3.exoplayer.source.g0.a
    /* JADX INFO: renamed from: B0, reason: merged with bridge method [inline-methods] */
    public void h(io.bidmachine.media3.exoplayer.source.q qVar) {
        this.f19039h.e(9, qVar).a();
    }

    public void C0() {
        this.f19039h.a(29).a();
    }

    public synchronized boolean E0() {
        if (!this.F && this.f19041j.getThread().isAlive()) {
            this.f19039h.j(7);
            Y1(new com.google.common.base.w() { // from class: io.bidmachine.media3.exoplayer.h1
                @Override // com.google.common.base.w
                public final Object get() {
                    return this.f18680a.f0();
                }
            }, this.f19053v);
            return this.F;
        }
        return true;
    }

    public void F(long j10) {
        this.X = j10;
    }

    public void H1() {
        this.f19039h.a(6).a();
    }

    public Looper L() {
        return this.f19041j;
    }

    public void U0(u7.d0 d0Var, int i10, long j10) {
        this.f19039h.e(3, new h(d0Var, i10, j10)).a();
    }

    @Override // q8.v.a
    public void a(h2 h2Var) {
        this.f19039h.j(26);
    }

    @Override // io.bidmachine.media3.exoplayer.f2.a
    public synchronized void b(f2 f2Var) {
        if (!this.F && this.f19041j.getThread().isAlive()) {
            this.f19039h.e(14, f2Var).a();
            return;
        }
        x7.r.h("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        f2Var.j(false);
    }

    @Override // q8.v.a
    public void c() {
        this.f19039h.j(10);
    }

    @Override // io.bidmachine.media3.exoplayer.d2.d
    public void d() {
        this.f19039h.l(2);
        this.f19039h.j(22);
    }

    public void d1(u7.c cVar, boolean z10) {
        this.f19039h.d(31, z10 ? 1 : 0, 0, cVar).a();
    }

    @Override // io.bidmachine.media3.exoplayer.source.q.a
    public void e(io.bidmachine.media3.exoplayer.source.q qVar) {
        this.f19039h.e(8, qVar).a();
    }

    @Override // io.bidmachine.media3.exoplayer.g.a
    public void f(float f10) {
        this.f19039h.j(34);
    }

    @Override // io.bidmachine.media3.exoplayer.g.a
    public void g(int i10) {
        this.f19039h.h(33, i10, 0).a();
    }

    /* JADX WARN: Code duplicated, block: B:114:0x022b  */
    /* JADX WARN: Code duplicated, block: B:116:0x022f  */
    /* JADX WARN: Code duplicated, block: B:125:0x0282  */
    /* JADX WARN: Code duplicated, block: B:138:0x02ac  */
    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) throws Throwable {
        ExoPlaybackException exoPlaybackException;
        ExoPlaybackException exoPlaybackException2;
        int i10;
        l1 l1VarY;
        int i11 = 1000;
        try {
            switch (message.what) {
                case 1:
                    boolean z10 = message.arg1 != 0;
                    int i12 = message.arg2;
                    m1(z10, i12 >> 4, true, i12 & 15);
                    break;
                case 2:
                    B();
                    break;
                case 3:
                    W0((h) message.obj);
                    break;
                case 4:
                    o1((u7.x) message.obj);
                    break;
                case 5:
                    s1((b8.a0) message.obj);
                    break;
                case 6:
                    I1(false, true);
                    break;
                case 7:
                    F0();
                    return true;
                case 8:
                    V((io.bidmachine.media3.exoplayer.source.q) message.obj);
                    break;
                case 9:
                    Q((io.bidmachine.media3.exoplayer.source.q) message.obj);
                    break;
                case 10:
                    I0();
                    break;
                case 11:
                    r1(message.arg1);
                    break;
                case 12:
                    u1(message.arg1 != 0);
                    break;
                case 13:
                    f1(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    Z0((f2) message.obj);
                    break;
                case 15:
                    b1((f2) message.obj);
                    break;
                case 16:
                    X((u7.x) message.obj, false);
                    break;
                case 17:
                    h1((b) message.obj);
                    break;
                case 18:
                    r((b) message.obj, message.arg1);
                    break;
                case 19:
                    x0((c) message.obj);
                    break;
                case 20:
                    H0(message.arg1, message.arg2, (n8.t) message.obj);
                    break;
                case 21:
                    v1((n8.t) message.obj);
                    break;
                case 22:
                    w0();
                    break;
                case 23:
                    k1(message.arg1 != 0);
                    break;
                case 24:
                default:
                    return false;
                case 25:
                    u();
                    break;
                case 26:
                    J0();
                    break;
                case 27:
                    M1(message.arg1, message.arg2, (List) message.obj);
                    break;
                case 28:
                    p1((ExoPlayer.c) message.obj);
                    break;
                case 29:
                    D0();
                    break;
                case 30:
                    Pair pair = (Pair) message.obj;
                    y1(pair.first, (AtomicBoolean) pair.second);
                    break;
                case 31:
                    e1((u7.c) message.obj, message.arg1 != 0);
                    break;
                case 32:
                    A1(((Float) message.obj).floatValue());
                    break;
                case 33:
                    O(message.arg1);
                    break;
                case 34:
                    P();
                    break;
            }
        } catch (ParserException e10) {
            int i13 = e10.f17919b;
            if (i13 == 1) {
                i11 = e10.f17918a ? 3001 : 3003;
            } else if (i13 == 4) {
                i11 = e10.f17918a ? 3002 : 3004;
            }
            R(e10, i11);
        } catch (DataSourceException e11) {
            R(e11, e11.f18028a);
        } catch (ExoPlaybackException e12) {
            ExoPlaybackException exoPlaybackExceptionB = e12;
            if (exoPlaybackExceptionB.f18065j == 1 && (l1VarY = this.f19050s.y()) != null) {
                j2[] j2VarArr = this.f19028a;
                int i14 = exoPlaybackExceptionB.f18067l;
                exoPlaybackExceptionB = exoPlaybackExceptionB.b((!j2VarArr[i14 % j2VarArr.length].z(i14) || l1VarY.k() == null) ? l1VarY.f19151h.f19165a : l1VarY.k().f19151h.f19165a);
            }
            if (exoPlaybackExceptionB.f18065j == 1) {
                j2[] j2VarArr2 = this.f19028a;
                int i15 = exoPlaybackExceptionB.f18067l;
                if (j2VarArr2[i15 % j2VarArr2.length].z(i15)) {
                    this.f19033c0 = true;
                    y();
                    l1 l1VarX = this.f19050s.x();
                    l1 l1VarU = this.f19050s.u();
                    if (this.f19050s.u() != l1VarX) {
                        while (l1VarU != null && l1VarU.k() != l1VarX) {
                            l1VarU = l1VarU.k();
                        }
                    }
                    this.f19050s.O(l1VarU);
                    if (this.D.f18606e != 4) {
                        h0();
                        this.f19039h.j(2);
                    }
                } else {
                    exoPlaybackException = this.W;
                    if (exoPlaybackException != null) {
                        exoPlaybackException.addSuppressed(exoPlaybackExceptionB);
                        exoPlaybackExceptionB = this.W;
                    }
                    exoPlaybackException2 = exoPlaybackExceptionB;
                    if (exoPlaybackException2.f18065j != 1 && this.f19050s.u() != this.f19050s.y()) {
                        while (this.f19050s.u() != this.f19050s.y()) {
                            this.f19050s.b();
                        }
                        l1 l1Var = (l1) x7.a.e(this.f19050s.u());
                        k0();
                        m1 m1Var = l1Var.f19151h;
                        io.bidmachine.media3.exoplayer.source.r.b bVar = m1Var.f19165a;
                        long j10 = m1Var.f19166b;
                        this.D = Y(bVar, j10, m1Var.f19167c, j10, true, 0);
                    }
                    if (exoPlaybackException2.f18071p || !(this.W == null || (i10 = exoPlaybackException2.f17926a) == 5004 || i10 == 5003)) {
                        x7.r.d("ExoPlayerImplInternal", "Playback error", exoPlaybackException2);
                        I1(true, false);
                        this.D = this.D.f(exoPlaybackException2);
                    } else {
                        x7.r.i("ExoPlayerImplInternal", "Recoverable renderer error", exoPlaybackException2);
                        if (this.W == null) {
                            this.W = exoPlaybackException2;
                        }
                        x7.n nVar = this.f19039h;
                        nVar.b(nVar.e(25, exoPlaybackException2));
                    }
                }
            } else {
                exoPlaybackException = this.W;
                if (exoPlaybackException != null) {
                    exoPlaybackException.addSuppressed(exoPlaybackExceptionB);
                    exoPlaybackExceptionB = this.W;
                }
                exoPlaybackException2 = exoPlaybackExceptionB;
                if (exoPlaybackException2.f18065j != 1) {
                }
                if (exoPlaybackException2.f18071p) {
                    x7.r.d("ExoPlayerImplInternal", "Playback error", exoPlaybackException2);
                    I1(true, false);
                    this.D = this.D.f(exoPlaybackException2);
                } else {
                    x7.r.d("ExoPlayerImplInternal", "Playback error", exoPlaybackException2);
                    I1(true, false);
                    this.D = this.D.f(exoPlaybackException2);
                }
            }
        } catch (DrmSession.DrmSessionException e13) {
            R(e13, e13.f18558a);
        } catch (BehindLiveWindowException e14) {
            R(e14, 1002);
        } catch (IOException e15) {
            R(e15, 2000);
        } catch (RuntimeException e16) {
            ExoPlaybackException exoPlaybackExceptionF = ExoPlaybackException.f(e16, ((e16 instanceof IllegalStateException) || (e16 instanceof IllegalArgumentException)) ? 1004 : 1000);
            x7.r.d("ExoPlayerImplInternal", "Playback error", exoPlaybackExceptionF);
            I1(true, false);
            this.D = this.D.f(exoPlaybackExceptionF);
        }
        k0();
        return true;
    }

    public void i1(List<d2.c> list, int i10, long j10, n8.t tVar) {
        this.f19039h.e(17, new b(list, tVar, i10, j10, null)).a();
    }

    public void l1(boolean z10, int i10, int i11) {
        this.f19039h.h(1, z10 ? 1 : 0, i10 | (i11 << 4)).a();
    }

    public void n1(u7.x xVar) {
        this.f19039h.e(4, xVar).a();
    }

    public void q1(int i10) {
        this.f19039h.h(11, i10, 0).a();
    }

    public void t1(boolean z10) {
        this.f19039h.h(12, z10 ? 1 : 0, 0).a();
    }

    @Override // io.bidmachine.media3.exoplayer.k.a
    public void x(u7.x xVar) {
        this.f19039h.e(16, xVar).a();
    }

    public synchronized boolean x1(Object obj, long j10) {
        if (!this.F && this.f19041j.getThread().isAlive()) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean();
            this.f19039h.e(30, new Pair(obj, atomicBoolean)).a();
            if (j10 == -9223372036854775807L) {
                return true;
            }
            Y1(new com.google.common.base.w() { // from class: b8.t
                @Override // com.google.common.base.w
                public final Object get() {
                    return Boolean.valueOf(atomicBoolean.get());
                }
            }, j10);
            return atomicBoolean.get();
        }
        return true;
    }

    public void z1(float f10) {
        this.f19039h.e(32, Float.valueOf(f10)).a();
    }
}
