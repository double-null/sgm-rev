package io.bidmachine.media3.exoplayer.source;

import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class ClippingMediaSource extends l0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final long f19373m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f19374n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f19375o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f19376p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final boolean f19377q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final boolean f19378r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final ArrayList<io.bidmachine.media3.exoplayer.source.b> f19379s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final u7.d0.c f19380t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private c f19381u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private IllegalClippingException f19382v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f19383w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f19384x;

    public static final class IllegalClippingException extends IOException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f19385a;

        public IllegalClippingException(int i10) {
            this(i10, -9223372036854775807L, -9223372036854775807L);
        }

        private static String b(int i10, long j10, long j11) {
            if (i10 == 0) {
                return "invalid period count";
            }
            if (i10 == 1) {
                return "not seekable to start";
            }
            if (i10 != 2) {
                return "unknown";
            }
            x7.a.g((j10 == -9223372036854775807L || j11 == -9223372036854775807L) ? false : true);
            return "start exceeds end. Start time: " + j10 + ", End time: " + j11;
        }

        public IllegalClippingException(int i10, long j10, long j11) {
            super("Illegal clipping: " + b(i10, j10, j11));
            this.f19385a = i10;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final r f19386a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f19387b;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f19390e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f19391f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f19392g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f19393h;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f19389d = true;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f19388c = Long.MIN_VALUE;

        public b(r rVar) {
            this.f19386a = (r) x7.a.e(rVar);
        }

        public ClippingMediaSource h() {
            this.f19393h = true;
            return new ClippingMediaSource(this);
        }

        public b i(boolean z10) {
            x7.a.g(!this.f19393h);
            this.f19390e = z10;
            return this;
        }

        public b j(boolean z10) {
            x7.a.g(!this.f19393h);
            this.f19389d = z10;
            return this;
        }

        public b k(long j10) {
            x7.a.g(!this.f19393h);
            this.f19388c = j10;
            return this;
        }

        public b l(boolean z10) {
            x7.a.g(!this.f19393h);
            this.f19391f = z10;
            return this;
        }

        public b m(long j10) {
            x7.a.a(j10 >= 0);
            x7.a.g(!this.f19393h);
            this.f19387b = j10;
            return this;
        }
    }

    private static final class c extends m {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final long f19394f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final long f19395g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final long f19396h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final boolean f19397i;

        public c(u7.d0 d0Var, long j10, long j11, boolean z10) throws IllegalClippingException {
            super(d0Var);
            if (j11 != Long.MIN_VALUE && j11 < j10) {
                throw new IllegalClippingException(2, j10, j11);
            }
            boolean z11 = false;
            if (d0Var.i() != 1) {
                throw new IllegalClippingException(0);
            }
            u7.d0.c cVarN = d0Var.n(0, new u7.d0.c());
            long jMax = Math.max(0L, j10);
            if (!z10 && !cVarN.f26045k && jMax != 0 && !cVarN.f26042h) {
                throw new IllegalClippingException(1);
            }
            long jMax2 = j11 == Long.MIN_VALUE ? cVarN.f26047m : Math.max(0L, j11);
            long j12 = cVarN.f26047m;
            if (j12 != -9223372036854775807L) {
                jMax2 = jMax2 > j12 ? j12 : jMax2;
                if (jMax > jMax2) {
                    jMax = jMax2;
                }
            }
            this.f19394f = jMax;
            this.f19395g = jMax2;
            this.f19396h = jMax2 == -9223372036854775807L ? -9223372036854775807L : jMax2 - jMax;
            if (cVarN.f26043i && (jMax2 == -9223372036854775807L || (j12 != -9223372036854775807L && jMax2 == j12))) {
                z11 = true;
            }
            this.f19397i = z11;
        }

        @Override // io.bidmachine.media3.exoplayer.source.m, u7.d0
        public u7.d0.b g(int i10, u7.d0.b bVar, boolean z10) {
            this.f19656e.g(0, bVar, z10);
            long jN = bVar.n() - this.f19394f;
            long j10 = this.f19396h;
            return bVar.s(bVar.f26018a, bVar.f26019b, 0, j10 == -9223372036854775807L ? -9223372036854775807L : j10 - jN, jN);
        }

        @Override // io.bidmachine.media3.exoplayer.source.m, u7.d0
        public u7.d0.c o(int i10, u7.d0.c cVar, long j10) {
            this.f19656e.o(0, cVar, 0L);
            long j11 = cVar.f26050p;
            long j12 = this.f19394f;
            cVar.f26050p = j11 + j12;
            cVar.f26047m = this.f19396h;
            cVar.f26043i = this.f19397i;
            long j13 = cVar.f26046l;
            if (j13 != -9223372036854775807L) {
                long jMax = Math.max(j13, j12);
                cVar.f26046l = jMax;
                long j14 = this.f19395g;
                if (j14 != -9223372036854775807L) {
                    jMax = Math.min(jMax, j14);
                }
                cVar.f26046l = jMax - this.f19394f;
            }
            long jT1 = x7.l0.t1(this.f19394f);
            long j15 = cVar.f26039e;
            if (j15 != -9223372036854775807L) {
                cVar.f26039e = j15 + jT1;
            }
            long j16 = cVar.f26040f;
            if (j16 != -9223372036854775807L) {
                cVar.f26040f = j16 + jT1;
            }
            return cVar;
        }
    }

    private void T(u7.d0 d0Var) {
        long j10;
        long j11;
        d0Var.n(0, this.f19380t);
        long jE = this.f19380t.e();
        if (this.f19381u == null || this.f19379s.isEmpty() || this.f19376p) {
            long j12 = this.f19373m;
            long j13 = this.f19374n;
            if (this.f19377q) {
                long jC = this.f19380t.c();
                j12 += jC;
                j13 += jC;
            }
            this.f19383w = jE + j12;
            this.f19384x = this.f19374n != Long.MIN_VALUE ? jE + j13 : Long.MIN_VALUE;
            int size = this.f19379s.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f19379s.get(i10).v(this.f19383w, this.f19384x);
            }
            j10 = j12;
            j11 = j13;
        } else {
            long j14 = this.f19383w - jE;
            j11 = this.f19374n != Long.MIN_VALUE ? this.f19384x - jE : Long.MIN_VALUE;
            j10 = j14;
        }
        try {
            c cVar = new c(d0Var, j10, j11, this.f19378r);
            this.f19381u = cVar;
            A(cVar);
        } catch (IllegalClippingException e10) {
            this.f19382v = e10;
            for (int i11 = 0; i11 < this.f19379s.size(); i11++) {
                this.f19379s.get(i11).r(this.f19382v);
            }
        }
    }

    @Override // io.bidmachine.media3.exoplayer.source.c, io.bidmachine.media3.exoplayer.source.a
    protected void B() {
        super.B();
        this.f19382v = null;
        this.f19381u = null;
    }

    @Override // io.bidmachine.media3.exoplayer.source.l0
    protected void Q(u7.d0 d0Var) {
        if (this.f19382v != null) {
            return;
        }
        T(d0Var);
    }

    @Override // io.bidmachine.media3.exoplayer.source.r
    public q a(r.b bVar, r8.b bVar2, long j10) {
        io.bidmachine.media3.exoplayer.source.b bVar3 = new io.bidmachine.media3.exoplayer.source.b(this.f19655k.a(bVar, bVar2, j10), this.f19375o, this.f19383w, this.f19384x);
        this.f19379s.add(bVar3);
        return bVar3;
    }

    @Override // io.bidmachine.media3.exoplayer.source.c, io.bidmachine.media3.exoplayer.source.r
    public void j() throws IOException {
        IllegalClippingException illegalClippingException = this.f19382v;
        if (illegalClippingException != null) {
            throw illegalClippingException;
        }
        super.j();
    }

    @Override // io.bidmachine.media3.exoplayer.source.r
    public void n(q qVar) {
        x7.a.g(this.f19379s.remove(qVar));
        this.f19655k.n(((io.bidmachine.media3.exoplayer.source.b) qVar).f19427a);
        if (!this.f19379s.isEmpty() || this.f19376p) {
            return;
        }
        T(((c) x7.a.e(this.f19381u)).f19656e);
    }

    private ClippingMediaSource(b bVar) {
        super(bVar.f19386a);
        this.f19373m = bVar.f19387b;
        this.f19374n = bVar.f19388c;
        this.f19375o = bVar.f19389d;
        this.f19376p = bVar.f19390e;
        this.f19377q = bVar.f19391f;
        this.f19378r = bVar.f19392g;
        this.f19379s = new ArrayList<>();
        this.f19380t = new u7.d0.c();
    }
}
