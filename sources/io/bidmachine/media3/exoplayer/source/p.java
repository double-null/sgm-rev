package io.bidmachine.media3.exoplayer.source;

import android.util.Pair;
import java.util.Objects;

/* JADX INFO: compiled from: MaskingMediaSource.java */
/* JADX INFO: loaded from: classes4.dex */
public final class p extends l0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f19671m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final u7.d0.c f19672n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final u7.d0.b f19673o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private a f19674p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private o f19675q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f19676r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f19677s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f19678t;

    /* JADX INFO: compiled from: MaskingMediaSource.java */
    private static final class a extends m {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final Object f19679h = new Object();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Object f19680f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Object f19681g;

        private a(u7.d0 d0Var, Object obj, Object obj2) {
            super(d0Var);
            this.f19680f = obj;
            this.f19681g = obj2;
        }

        public static a u(u7.s sVar) {
            return new a(new b(sVar), u7.d0.c.f26025q, f19679h);
        }

        public static a v(u7.d0 d0Var, Object obj, Object obj2) {
            return new a(d0Var, obj, obj2);
        }

        @Override // io.bidmachine.media3.exoplayer.source.m, u7.d0
        public int b(Object obj) {
            Object obj2;
            u7.d0 d0Var = this.f19656e;
            if (f19679h.equals(obj) && (obj2 = this.f19681g) != null) {
                obj = obj2;
            }
            return d0Var.b(obj);
        }

        @Override // io.bidmachine.media3.exoplayer.source.m, u7.d0
        public u7.d0.b g(int i10, u7.d0.b bVar, boolean z10) {
            this.f19656e.g(i10, bVar, z10);
            if (Objects.equals(bVar.f26019b, this.f19681g) && z10) {
                bVar.f26019b = f19679h;
            }
            return bVar;
        }

        @Override // io.bidmachine.media3.exoplayer.source.m, u7.d0
        public Object m(int i10) {
            Object objM = this.f19656e.m(i10);
            return Objects.equals(objM, this.f19681g) ? f19679h : objM;
        }

        @Override // io.bidmachine.media3.exoplayer.source.m, u7.d0
        public u7.d0.c o(int i10, u7.d0.c cVar, long j10) {
            this.f19656e.o(i10, cVar, j10);
            if (Objects.equals(cVar.f26035a, this.f19680f)) {
                cVar.f26035a = u7.d0.c.f26025q;
            }
            return cVar;
        }

        public a t(u7.d0 d0Var) {
            return new a(d0Var, this.f19680f, this.f19681g);
        }
    }

    /* JADX INFO: compiled from: MaskingMediaSource.java */
    public static final class b extends u7.d0 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final u7.s f19682e;

        public b(u7.s sVar) {
            this.f19682e = sVar;
        }

        @Override // u7.d0
        public int b(Object obj) {
            return obj == a.f19679h ? 0 : -1;
        }

        @Override // u7.d0
        public u7.d0.b g(int i10, u7.d0.b bVar, boolean z10) {
            bVar.t(z10 ? 0 : null, z10 ? a.f19679h : null, 0, -9223372036854775807L, 0L, u7.b.f25944g, true);
            return bVar;
        }

        @Override // u7.d0
        public int i() {
            return 1;
        }

        @Override // u7.d0
        public Object m(int i10) {
            return a.f19679h;
        }

        @Override // u7.d0
        public u7.d0.c o(int i10, u7.d0.c cVar, long j10) {
            cVar.g(u7.d0.c.f26025q, this.f19682e, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
            cVar.f26045k = true;
            return cVar;
        }

        @Override // u7.d0
        public int p() {
            return 1;
        }
    }

    public p(r rVar, boolean z10) {
        super(rVar);
        this.f19671m = z10 && rVar.k();
        this.f19672n = new u7.d0.c();
        this.f19673o = new u7.d0.b();
        u7.d0 d0VarL = rVar.l();
        if (d0VarL == null) {
            this.f19674p = a.u(rVar.e());
        } else {
            this.f19674p = a.v(d0VarL, null, null);
            this.f19678t = true;
        }
    }

    private Object U(Object obj) {
        return (this.f19674p.f19681g == null || !this.f19674p.f19681g.equals(obj)) ? obj : a.f19679h;
    }

    private Object V(Object obj) {
        return (this.f19674p.f19681g == null || !obj.equals(a.f19679h)) ? obj : this.f19674p.f19681g;
    }

    private boolean X(long j10) {
        o oVar = this.f19675q;
        int iB = this.f19674p.b(oVar.f19662a.f19684a);
        if (iB == -1) {
            return false;
        }
        long j11 = this.f19674p.f(iB, this.f19673o).f26021d;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        oVar.s(j10);
        return true;
    }

    @Override // io.bidmachine.media3.exoplayer.source.c, io.bidmachine.media3.exoplayer.source.a
    public void B() {
        this.f19677s = false;
        this.f19676r = false;
        super.B();
    }

    @Override // io.bidmachine.media3.exoplayer.source.l0
    protected r.b J(r.b bVar) {
        return bVar.a(U(bVar.f19684a));
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0074  */
    /* JADX WARN: Code duplicated, block: B:32:0x00be  */
    /* JADX WARN: Code duplicated, block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // io.bidmachine.media3.exoplayer.source.l0
    protected void Q(u7.d0 d0Var) {
        long j10;
        r.b bVarA;
        if (this.f19677s) {
            this.f19674p = this.f19674p.t(d0Var);
            o oVar = this.f19675q;
            if (oVar != null) {
                X(oVar.n());
            }
        } else {
            if (!d0Var.q()) {
                d0Var.n(0, this.f19672n);
                long jC = this.f19672n.c();
                Object obj = this.f19672n.f26035a;
                o oVar2 = this.f19675q;
                if (oVar2 != null) {
                    long jO = oVar2.o();
                    this.f19674p.h(this.f19675q.f19662a.f19684a, this.f19673o);
                    long jN = this.f19673o.n() + jO;
                    if (jN != this.f19674p.n(0, this.f19672n).c()) {
                        j10 = jN;
                    } else {
                        j10 = jC;
                    }
                } else {
                    j10 = jC;
                }
                Pair<Object, Long> pairJ = d0Var.j(this.f19672n, this.f19673o, 0, j10);
                Object obj2 = pairJ.first;
                long jLongValue = ((Long) pairJ.second).longValue();
                this.f19674p = this.f19678t ? this.f19674p.t(d0Var) : a.v(d0Var, obj, obj2);
                o oVar3 = this.f19675q;
                if (oVar3 != null && X(jLongValue)) {
                    r.b bVar = oVar3.f19662a;
                    bVarA = bVar.a(V(bVar.f19684a));
                }
                this.f19678t = true;
                this.f19677s = true;
                A(this.f19674p);
                if (bVarA != null) {
                    ((o) x7.a.e(this.f19675q)).a(bVarA);
                }
            }
            this.f19674p = this.f19678t ? this.f19674p.t(d0Var) : a.v(d0Var, u7.d0.c.f26025q, a.f19679h);
        }
        bVarA = null;
        this.f19678t = true;
        this.f19677s = true;
        A(this.f19674p);
        if (bVarA != null) {
            ((o) x7.a.e(this.f19675q)).a(bVarA);
        }
    }

    @Override // io.bidmachine.media3.exoplayer.source.l0
    public void S() {
        if (this.f19671m) {
            return;
        }
        this.f19676r = true;
        R();
    }

    @Override // io.bidmachine.media3.exoplayer.source.r
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public o a(r.b bVar, r8.b bVar2, long j10) {
        o oVar = new o(bVar, bVar2, j10);
        oVar.w(this.f19655k);
        if (this.f19677s) {
            oVar.a(bVar.a(V(bVar.f19684a)));
        } else {
            this.f19675q = oVar;
            if (!this.f19676r) {
                this.f19676r = true;
                R();
            }
        }
        return oVar;
    }

    public u7.d0 W() {
        return this.f19674p;
    }

    @Override // io.bidmachine.media3.exoplayer.source.l0, io.bidmachine.media3.exoplayer.source.r
    public void m(u7.s sVar) {
        if (this.f19678t) {
            this.f19674p = this.f19674p.t(new n8.v(this.f19674p.f19656e, sVar));
        } else {
            this.f19674p = a.u(sVar);
        }
        this.f19655k.m(sVar);
    }

    @Override // io.bidmachine.media3.exoplayer.source.r
    public void n(q qVar) {
        ((o) qVar).v();
        if (qVar == this.f19675q) {
            this.f19675q = null;
        }
    }

    @Override // io.bidmachine.media3.exoplayer.source.c, io.bidmachine.media3.exoplayer.source.r
    public void j() {
    }
}
