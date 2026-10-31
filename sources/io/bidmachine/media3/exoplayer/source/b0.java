package io.bidmachine.media3.exoplayer.source;

import android.net.Uri;
import android.os.Handler;
import com.facebook.appevents.AppEventsConstants;
import io.bidmachine.media3.common.ParserException;
import io.bidmachine.media3.decoder.DecoderInputBuffer;
import io.bidmachine.media3.exoplayer.k1;
import io.bidmachine.media3.exoplayer.upstream.Loader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import v8.o0;

/* JADX INFO: compiled from: ProgressiveMediaPeriod.java */
/* JADX INFO: loaded from: classes4.dex */
final class b0 implements q, v8.r, Loader.b<b>, Loader.f, f0.d {
    private static final Map<String, String> R = M();
    private static final u7.q S = new u7.q.b().f0("icy").u0("application/x-icy").N();
    private boolean A;
    private f B;
    private v8.j0 C;
    private long D;
    private boolean E;
    private int F;
    private boolean G;
    private boolean H;
    private boolean I;
    private int J;
    private boolean K;
    private long L;
    private long M;
    private boolean N;
    private int O;
    private boolean P;
    private boolean Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Uri f19437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final z7.d f19438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final io.bidmachine.media3.exoplayer.drm.i f19439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final io.bidmachine.media3.exoplayer.upstream.b f19440d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final s.a f19441e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final io.bidmachine.media3.exoplayer.drm.h.a f19442f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final c f19443g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final r8.b f19444h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f19445i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f19446j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f19447k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final u7.q f19448l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final long f19449m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Loader f19450n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final w f19451o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final x7.k f19452p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Runnable f19453q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Runnable f19454r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Handler f19455s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private q.a f19456t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private i9.b f19457u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private f0[] f19458v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private e[] f19459w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f19460x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f19461y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f19462z;

    /* JADX INFO: compiled from: ProgressiveMediaPeriod.java */
    class a extends v8.a0 {
        a(v8.j0 j0Var) {
            super(j0Var);
        }

        @Override // v8.a0, v8.j0
        public long k() {
            return b0.this.D;
        }
    }

    /* JADX INFO: compiled from: ProgressiveMediaPeriod.java */
    final class b implements Loader.e, n.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Uri f19465b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final z7.n f19466c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final w f19467d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final v8.r f19468e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final x7.k f19469f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private volatile boolean f19471h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f19473j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private o0 f19475l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f19476m;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final v8.i0 f19470g = new v8.i0();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f19472i = true;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f19464a = n8.i.a();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private z7.g f19474k = h(0);

        public b(Uri uri, z7.d dVar, w wVar, v8.r rVar, x7.k kVar) {
            this.f19465b = uri;
            this.f19466c = new z7.n(dVar);
            this.f19467d = wVar;
            this.f19468e = rVar;
            this.f19469f = kVar;
        }

        private z7.g h(long j10) {
            return new z7.g.b().i(this.f19465b).h(j10).f(b0.this.f19445i).b(6).e(b0.R).a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void i(long j10, long j11) {
            this.f19470g.f27344a = j10;
            this.f19473j = j11;
            this.f19472i = true;
            this.f19476m = false;
        }

        @Override // io.bidmachine.media3.exoplayer.source.n.a
        public void a(x7.a0 a0Var) {
            long jMax = !this.f19476m ? this.f19473j : Math.max(b0.this.O(true), this.f19473j);
            int iA = a0Var.a();
            o0 o0Var = (o0) x7.a.e(this.f19475l);
            o0Var.b(a0Var, iA);
            o0Var.f(jMax, 1, iA, 0, null);
            this.f19476m = true;
        }

        @Override // io.bidmachine.media3.exoplayer.upstream.Loader.e
        public void b() {
            this.f19471h = true;
        }

        /* JADX WARN: Bottom block not found for handler: all -> 0x011b */
        @Override // io.bidmachine.media3.exoplayer.upstream.Loader.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void load() throws java.io.IOException {
            /*
                Method dump skipped, instruction units count: 315
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.media3.exoplayer.source.b0.b.load():void");
        }
    }

    /* JADX INFO: compiled from: ProgressiveMediaPeriod.java */
    interface c {
        void c(long j10, v8.j0 j0Var, boolean z10);
    }

    /* JADX INFO: compiled from: ProgressiveMediaPeriod.java */
    private final class d implements n8.s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f19478a;

        public d(int i10) {
            this.f19478a = i10;
        }

        @Override // n8.s
        public void a() throws IOException {
            b0.this.Z(this.f19478a);
        }

        @Override // n8.s
        public int e(b8.u uVar, DecoderInputBuffer decoderInputBuffer, int i10) {
            return b0.this.g0(this.f19478a, uVar, decoderInputBuffer, i10);
        }

        @Override // n8.s
        public boolean h() {
            return b0.this.R(this.f19478a);
        }

        @Override // n8.s
        public int r(long j10) {
            return b0.this.k0(this.f19478a, j10);
        }
    }

    /* JADX INFO: compiled from: ProgressiveMediaPeriod.java */
    private static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f19480a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f19481b;

        public e(int i10, boolean z10) {
            this.f19480a = i10;
            this.f19481b = z10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || e.class != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            return this.f19480a == eVar.f19480a && this.f19481b == eVar.f19481b;
        }

        public int hashCode() {
            return (this.f19480a * 31) + (this.f19481b ? 1 : 0);
        }
    }

    /* JADX INFO: compiled from: ProgressiveMediaPeriod.java */
    private static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n8.x f19482a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean[] f19483b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean[] f19484c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean[] f19485d;

        public f(n8.x xVar, boolean[] zArr) {
            this.f19482a = xVar;
            this.f19483b = zArr;
            int i10 = xVar.f22837a;
            this.f19484c = new boolean[i10];
            this.f19485d = new boolean[i10];
        }
    }

    public b0(Uri uri, z7.d dVar, w wVar, io.bidmachine.media3.exoplayer.drm.i iVar, io.bidmachine.media3.exoplayer.drm.h.a aVar, io.bidmachine.media3.exoplayer.upstream.b bVar, s.a aVar2, c cVar, r8.b bVar2, String str, int i10, int i11, u7.q qVar, long j10, s8.a aVar3) {
        this.f19437a = uri;
        this.f19438b = dVar;
        this.f19439c = iVar;
        this.f19442f = aVar;
        this.f19440d = bVar;
        this.f19441e = aVar2;
        this.f19443g = cVar;
        this.f19444h = bVar2;
        this.f19445i = str;
        this.f19446j = i10;
        this.f19447k = i11;
        this.f19448l = qVar;
        this.f19450n = aVar3 != null ? new Loader(aVar3) : new Loader("ProgressiveMediaPeriod");
        this.f19451o = wVar;
        this.f19449m = j10;
        this.f19452p = new x7.k();
        this.f19453q = new Runnable() { // from class: io.bidmachine.media3.exoplayer.source.y
            @Override // java.lang.Runnable
            public final void run() {
                this.f19708a.V();
            }
        };
        this.f19454r = new Runnable() { // from class: io.bidmachine.media3.exoplayer.source.z
            @Override // java.lang.Runnable
            public final void run() {
                this.f19709a.S();
            }
        };
        this.f19455s = x7.l0.A();
        this.f19459w = new e[0];
        this.f19458v = new f0[0];
        this.M = -9223372036854775807L;
        this.F = 1;
    }

    private void K() {
        x7.a.g(this.f19461y);
        x7.a.e(this.B);
        x7.a.e(this.C);
    }

    private boolean L(b bVar, int i10) {
        v8.j0 j0Var;
        if (this.K || !((j0Var = this.C) == null || j0Var.k() == -9223372036854775807L)) {
            this.O = i10;
            return true;
        }
        if (this.f19461y && !m0()) {
            this.N = true;
            return false;
        }
        this.H = this.f19461y;
        this.L = 0L;
        this.O = 0;
        for (f0 f0Var : this.f19458v) {
            f0Var.Y();
        }
        bVar.i(0L, 0L);
        return true;
    }

    private static Map<String, String> M() {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", AppEventsConstants.EVENT_PARAM_VALUE_YES);
        return Collections.unmodifiableMap(map);
    }

    private int N() {
        int iJ = 0;
        for (f0 f0Var : this.f19458v) {
            iJ += f0Var.J();
        }
        return iJ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long O(boolean z10) {
        long jMax = Long.MIN_VALUE;
        for (int i10 = 0; i10 < this.f19458v.length; i10++) {
            if (z10 || ((f) x7.a.e(this.B)).f19484c[i10]) {
                jMax = Math.max(jMax, this.f19458v[i10].C());
            }
        }
        return jMax;
    }

    private boolean Q() {
        return this.M != -9223372036854775807L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void S() {
        if (this.Q) {
            return;
        }
        ((q.a) x7.a.e(this.f19456t)).h(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void T() {
        this.K = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V() {
        if (this.Q || this.f19461y || !this.f19460x || this.C == null) {
            return;
        }
        for (f0 f0Var : this.f19458v) {
            if (f0Var.I() == null) {
                return;
            }
        }
        this.f19452p.c();
        int length = this.f19458v.length;
        u7.e0[] e0VarArr = new u7.e0[length];
        boolean[] zArr = new boolean[length];
        for (int i10 = 0; i10 < length; i10++) {
            u7.q qVarN = (u7.q) x7.a.e(this.f19458v[i10].I());
            String str = qVarN.f26252o;
            boolean zO = u7.w.o(str);
            boolean z10 = zO || u7.w.t(str);
            zArr[i10] = z10;
            this.f19462z = z10 | this.f19462z;
            this.A = this.f19449m != -9223372036854775807L && length == 1 && u7.w.q(str);
            i9.b bVar = this.f19457u;
            if (bVar != null) {
                if (zO || this.f19459w[i10].f19481b) {
                    u7.v vVar = qVarN.f26249l;
                    qVarN = qVarN.b().n0(vVar == null ? new u7.v(bVar) : vVar.a(bVar)).N();
                }
                if (zO && qVarN.f26245h == -1 && qVarN.f26246i == -1 && bVar.f16108a != -1) {
                    qVarN = qVarN.b().Q(bVar.f16108a).N();
                }
            }
            u7.q qVarC = qVarN.c(this.f19439c.n(qVarN));
            e0VarArr[i10] = new u7.e0(Integer.toString(i10), qVarC);
            this.I = qVarC.f26258u | this.I;
        }
        this.B = new f(new n8.x(e0VarArr), zArr);
        if (this.A && this.D == -9223372036854775807L) {
            this.D = this.f19449m;
            this.C = new a(this.C);
        }
        this.f19443g.c(this.D, this.C, this.E);
        this.f19461y = true;
        ((q.a) x7.a.e(this.f19456t)).e(this);
    }

    private void W(int i10) {
        K();
        f fVar = this.B;
        boolean[] zArr = fVar.f19485d;
        if (zArr[i10]) {
            return;
        }
        u7.q qVarA = fVar.f19482a.b(i10).a(0);
        this.f19441e.j(u7.w.k(qVarA.f26252o), qVarA, 0, null, this.L);
        zArr[i10] = true;
    }

    private void X(int i10) {
        K();
        if (this.N) {
            if (!this.f19462z || this.B.f19483b[i10]) {
                if (this.f19458v[i10].N(false)) {
                    return;
                }
                this.M = 0L;
                this.N = false;
                this.H = true;
                this.L = 0L;
                this.O = 0;
                for (f0 f0Var : this.f19458v) {
                    f0Var.Y();
                }
                ((q.a) x7.a.e(this.f19456t)).h(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a0() {
        this.f19455s.post(new Runnable() { // from class: io.bidmachine.media3.exoplayer.source.x
            @Override // java.lang.Runnable
            public final void run() {
                this.f19707a.T();
            }
        });
    }

    private o0 f0(e eVar) {
        int length = this.f19458v.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (eVar.equals(this.f19459w[i10])) {
                return this.f19458v[i10];
            }
        }
        if (this.f19460x) {
            x7.r.h("ProgressiveMediaPeriod", "Extractor added new track (id=" + eVar.f19480a + ") after finishing tracks.");
            return new v8.m();
        }
        f0 f0VarL = f0.l(this.f19444h, this.f19439c, this.f19442f);
        f0VarL.g0(this);
        int i11 = length + 1;
        e[] eVarArr = (e[]) Arrays.copyOf(this.f19459w, i11);
        eVarArr[length] = eVar;
        this.f19459w = (e[]) x7.l0.j(eVarArr);
        f0[] f0VarArr = (f0[]) Arrays.copyOf(this.f19458v, i11);
        f0VarArr[length] = f0VarL;
        this.f19458v = (f0[]) x7.l0.j(f0VarArr);
        return f0VarL;
    }

    private boolean i0(boolean[] zArr, long j10, boolean z10) {
        int length = this.f19458v.length;
        for (int i10 = 0; i10 < length; i10++) {
            f0 f0Var = this.f19458v[i10];
            if (f0Var.F() != 0 || !z10) {
                if (!(this.A ? f0Var.b0(f0Var.A()) : f0Var.c0(j10, false)) && (zArr[i10] || !this.f19462z)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public void U(v8.j0 j0Var) {
        this.C = this.f19457u == null ? j0Var : new v8.j0.b(-9223372036854775807L);
        this.D = j0Var.k();
        boolean z10 = !this.K && j0Var.k() == -9223372036854775807L;
        this.E = z10;
        this.F = z10 ? 7 : 1;
        if (this.f19461y) {
            this.f19443g.c(this.D, j0Var, z10);
        } else {
            V();
        }
    }

    private void l0() {
        b bVar = new b(this.f19437a, this.f19438b, this.f19451o, this, this.f19452p);
        if (this.f19461y) {
            x7.a.g(Q());
            long j10 = this.D;
            if (j10 != -9223372036854775807L && this.M > j10) {
                this.P = true;
                this.M = -9223372036854775807L;
                return;
            }
            bVar.i(((v8.j0) x7.a.e(this.C)).d(this.M).f27345a.f27351b, this.M);
            for (f0 f0Var : this.f19458v) {
                f0Var.e0(this.M);
            }
            this.M = -9223372036854775807L;
        }
        this.O = N();
        this.f19450n.n(bVar, this, this.f19440d.a(this.F));
    }

    private boolean m0() {
        return this.H || Q();
    }

    o0 P() {
        return f0(new e(0, true));
    }

    boolean R(int i10) {
        return !m0() && this.f19458v[i10].N(this.P);
    }

    void Y() throws IOException {
        this.f19450n.k(this.f19440d.a(this.F));
    }

    void Z(int i10) throws IOException {
        this.f19458v[i10].Q();
        Y();
    }

    @Override // io.bidmachine.media3.exoplayer.source.f0.d
    public void a(u7.q qVar) {
        this.f19455s.post(this.f19453q);
    }

    @Override // io.bidmachine.media3.exoplayer.source.q, io.bidmachine.media3.exoplayer.source.g0
    public long b() {
        return f();
    }

    @Override // io.bidmachine.media3.exoplayer.upstream.Loader.b
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public void o(b bVar, long j10, long j11, boolean z10) {
        z7.n nVar = bVar.f19466c;
        n8.i iVar = new n8.i(bVar.f19464a, bVar.f19474k, nVar.p(), nVar.q(), j10, j11, nVar.o());
        this.f19440d.d(bVar.f19464a);
        this.f19441e.t(iVar, 1, -1, null, 0, null, bVar.f19473j, this.D);
        if (z10) {
            return;
        }
        for (f0 f0Var : this.f19458v) {
            f0Var.Y();
        }
        if (this.J > 0) {
            ((q.a) x7.a.e(this.f19456t)).h(this);
        }
    }

    @Override // io.bidmachine.media3.exoplayer.source.q, io.bidmachine.media3.exoplayer.source.g0
    public boolean c(k1 k1Var) {
        if (this.P || this.f19450n.i() || this.N) {
            return false;
        }
        if ((this.f19461y || this.f19448l != null) && this.J == 0) {
            return false;
        }
        boolean zE = this.f19452p.e();
        if (this.f19450n.j()) {
            return zE;
        }
        l0();
        return true;
    }

    @Override // io.bidmachine.media3.exoplayer.upstream.Loader.b
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public void m(b bVar, long j10, long j11) {
        if (this.D == -9223372036854775807L && this.C != null) {
            long jO = O(true);
            long j12 = jO == Long.MIN_VALUE ? 0L : jO + 10000;
            this.D = j12;
            this.f19443g.c(j12, this.C, this.E);
        }
        z7.n nVar = bVar.f19466c;
        n8.i iVar = new n8.i(bVar.f19464a, bVar.f19474k, nVar.p(), nVar.q(), j10, j11, nVar.o());
        this.f19440d.d(bVar.f19464a);
        this.f19441e.w(iVar, 1, -1, null, 0, null, bVar.f19473j, this.D);
        this.P = true;
        ((q.a) x7.a.e(this.f19456t)).h(this);
    }

    @Override // io.bidmachine.media3.exoplayer.source.q
    public long d(long j10, b8.a0 a0Var) {
        K();
        if (!this.C.h()) {
            return 0L;
        }
        v8.j0.a aVarD = this.C.d(j10);
        return a0Var.a(j10, aVarD.f27345a.f27350a, aVarD.f27346b.f27350a);
    }

    @Override // io.bidmachine.media3.exoplayer.upstream.Loader.b
    /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
    public Loader.c s(b bVar, long j10, long j11, IOException iOException, int i10) {
        Loader.c cVarH;
        z7.n nVar = bVar.f19466c;
        n8.i iVar = new n8.i(bVar.f19464a, bVar.f19474k, nVar.p(), nVar.q(), j10, j11, nVar.o());
        long jC = this.f19440d.c(new io.bidmachine.media3.exoplayer.upstream.b.c(iVar, new n8.j(1, -1, null, 0, null, x7.l0.t1(bVar.f19473j), x7.l0.t1(this.D)), iOException, i10));
        if (jC == -9223372036854775807L) {
            cVarH = Loader.f19789g;
        } else {
            int iN = N();
            cVarH = L(bVar, iN) ? Loader.h(iN > this.O, jC) : Loader.f19788f;
        }
        boolean z10 = !cVarH.c();
        this.f19441e.y(iVar, 1, -1, null, 0, null, bVar.f19473j, this.D, iOException, z10);
        if (z10) {
            this.f19440d.d(bVar.f19464a);
        }
        return cVarH;
    }

    @Override // v8.r
    public o0 e(int i10, int i11) {
        return f0(new e(i10, false));
    }

    @Override // io.bidmachine.media3.exoplayer.upstream.Loader.b
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public void n(b bVar, long j10, long j11, int i10) {
        z7.n nVar = bVar.f19466c;
        this.f19441e.C(i10 == 0 ? new n8.i(bVar.f19464a, bVar.f19474k, j10) : new n8.i(bVar.f19464a, bVar.f19474k, nVar.p(), nVar.q(), j10, j11, nVar.o()), 1, -1, null, 0, null, bVar.f19473j, this.D, i10);
    }

    @Override // io.bidmachine.media3.exoplayer.source.q, io.bidmachine.media3.exoplayer.source.g0
    public long f() {
        long jO;
        K();
        if (this.P || this.J == 0) {
            return Long.MIN_VALUE;
        }
        if (Q()) {
            return this.M;
        }
        if (this.f19462z) {
            int length = this.f19458v.length;
            jO = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                f fVar = this.B;
                if (fVar.f19483b[i10] && fVar.f19484c[i10] && !this.f19458v[i10].M()) {
                    jO = Math.min(jO, this.f19458v[i10].C());
                }
            }
        } else {
            jO = Long.MAX_VALUE;
        }
        if (jO == Long.MAX_VALUE) {
            jO = O(false);
        }
        return jO == Long.MIN_VALUE ? this.L : jO;
    }

    int g0(int i10, b8.u uVar, DecoderInputBuffer decoderInputBuffer, int i11) {
        if (m0()) {
            return -3;
        }
        W(i10);
        int iV = this.f19458v[i10].V(uVar, decoderInputBuffer, i11, this.P);
        if (iV == -3) {
            X(i10);
        }
        return iV;
    }

    @Override // v8.r
    public void h(final v8.j0 j0Var) {
        this.f19455s.post(new Runnable() { // from class: io.bidmachine.media3.exoplayer.source.a0
            @Override // java.lang.Runnable
            public final void run() {
                this.f19425a.U(j0Var);
            }
        });
    }

    public void h0() {
        if (this.f19461y) {
            for (f0 f0Var : this.f19458v) {
                f0Var.U();
            }
        }
        this.f19450n.m(this);
        this.f19455s.removeCallbacksAndMessages(null);
        this.f19456t = null;
        this.Q = true;
    }

    @Override // io.bidmachine.media3.exoplayer.source.q
    public long i(q8.q[] qVarArr, boolean[] zArr, n8.s[] sVarArr, boolean[] zArr2, long j10) {
        q8.q qVar;
        K();
        f fVar = this.B;
        n8.x xVar = fVar.f19482a;
        boolean[] zArr3 = fVar.f19484c;
        int i10 = this.J;
        int i11 = 0;
        for (int i12 = 0; i12 < qVarArr.length; i12++) {
            n8.s sVar = sVarArr[i12];
            if (sVar != null && (qVarArr[i12] == null || !zArr[i12])) {
                int i13 = ((d) sVar).f19478a;
                x7.a.g(zArr3[i13]);
                this.J--;
                zArr3[i13] = false;
                sVarArr[i12] = null;
            }
        }
        boolean z10 = !this.G ? j10 == 0 || this.A : i10 != 0;
        for (int i14 = 0; i14 < qVarArr.length; i14++) {
            if (sVarArr[i14] == null && (qVar = qVarArr[i14]) != null) {
                x7.a.g(qVar.length() == 1);
                x7.a.g(qVar.f(0) == 0);
                int iD = xVar.d(qVar.m());
                x7.a.g(!zArr3[iD]);
                this.J++;
                zArr3[iD] = true;
                this.I = qVar.s().f26258u | this.I;
                sVarArr[i14] = new d(iD);
                zArr2[i14] = true;
                if (!z10) {
                    f0 f0Var = this.f19458v[iD];
                    z10 = (f0Var.F() == 0 || f0Var.c0(j10, true)) ? false : true;
                }
            }
        }
        if (this.J == 0) {
            this.N = false;
            this.H = false;
            this.I = false;
            if (this.f19450n.j()) {
                f0[] f0VarArr = this.f19458v;
                int length = f0VarArr.length;
                while (i11 < length) {
                    f0VarArr[i11].s();
                    i11++;
                }
                this.f19450n.f();
            } else {
                this.P = false;
                f0[] f0VarArr2 = this.f19458v;
                int length2 = f0VarArr2.length;
                while (i11 < length2) {
                    f0VarArr2[i11].Y();
                    i11++;
                }
            }
        } else if (z10) {
            j10 = j(j10);
            while (i11 < sVarArr.length) {
                if (sVarArr[i11] != null) {
                    zArr2[i11] = true;
                }
                i11++;
            }
        }
        this.G = true;
        return j10;
    }

    @Override // io.bidmachine.media3.exoplayer.source.q, io.bidmachine.media3.exoplayer.source.g0
    public boolean isLoading() {
        return this.f19450n.j() && this.f19452p.d();
    }

    @Override // io.bidmachine.media3.exoplayer.source.q
    public long j(long j10) {
        K();
        boolean[] zArr = this.B.f19483b;
        if (!this.C.h()) {
            j10 = 0;
        }
        int i10 = 0;
        this.H = false;
        boolean z10 = this.L == j10;
        this.L = j10;
        if (Q()) {
            this.M = j10;
            return j10;
        }
        if (this.F != 7 && ((this.P || this.f19450n.j()) && i0(zArr, j10, z10))) {
            return j10;
        }
        this.N = false;
        this.M = j10;
        this.P = false;
        this.I = false;
        if (this.f19450n.j()) {
            f0[] f0VarArr = this.f19458v;
            int length = f0VarArr.length;
            while (i10 < length) {
                f0VarArr[i10].s();
                i10++;
            }
            this.f19450n.f();
        } else {
            this.f19450n.g();
            f0[] f0VarArr2 = this.f19458v;
            int length2 = f0VarArr2.length;
            while (i10 < length2) {
                f0VarArr2[i10].Y();
                i10++;
            }
        }
        return j10;
    }

    @Override // io.bidmachine.media3.exoplayer.source.q
    public long k() {
        if (this.I) {
            this.I = false;
            return this.L;
        }
        if (!this.H) {
            return -9223372036854775807L;
        }
        if (!this.P && N() <= this.O) {
            return -9223372036854775807L;
        }
        this.H = false;
        return this.L;
    }

    int k0(int i10, long j10) {
        if (m0()) {
            return 0;
        }
        W(i10);
        f0 f0Var = this.f19458v[i10];
        int iH = f0Var.H(j10, this.P);
        f0Var.h0(iH);
        if (iH == 0) {
            X(i10);
        }
        return iH;
    }

    @Override // io.bidmachine.media3.exoplayer.source.q
    public void l(q.a aVar, long j10) {
        this.f19456t = aVar;
        if (this.f19448l == null) {
            this.f19452p.e();
            l0();
        } else {
            e(this.f19447k, 3).a(this.f19448l);
            U(new v8.e0(new long[]{0}, new long[]{0}, -9223372036854775807L));
            r();
            this.M = j10;
        }
    }

    @Override // io.bidmachine.media3.exoplayer.upstream.Loader.f
    public void p() {
        for (f0 f0Var : this.f19458v) {
            f0Var.W();
        }
        this.f19451o.release();
    }

    @Override // io.bidmachine.media3.exoplayer.source.q
    public void q() throws IOException {
        Y();
        if (this.P && !this.f19461y) {
            throw ParserException.b("Loading finished before preparation is complete.", null);
        }
    }

    @Override // v8.r
    public void r() {
        this.f19460x = true;
        this.f19455s.post(this.f19453q);
    }

    @Override // io.bidmachine.media3.exoplayer.source.q
    public n8.x t() {
        K();
        return this.B.f19482a;
    }

    @Override // io.bidmachine.media3.exoplayer.source.q
    public void u(long j10, boolean z10) {
        if (this.A) {
            return;
        }
        K();
        if (Q()) {
            return;
        }
        boolean[] zArr = this.B.f19484c;
        int length = this.f19458v.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f19458v[i10].r(j10, z10, zArr[i10]);
        }
    }

    @Override // io.bidmachine.media3.exoplayer.source.q, io.bidmachine.media3.exoplayer.source.g0
    public void g(long j10) {
    }
}
