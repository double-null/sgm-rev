package io.bidmachine.media3.exoplayer;

import java.io.IOException;

/* JADX INFO: compiled from: MediaPeriodHolder.java */
/* JADX INFO: loaded from: classes4.dex */
final class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io.bidmachine.media3.exoplayer.source.q f19144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f19145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n8.s[] f19146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f19147d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f19148e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f19149f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f19150g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public m1 f19151h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f19152i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean[] f19153j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final i2[] f19154k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final q8.v f19155l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final d2 f19156m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private l1 f19157n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private n8.x f19158o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private q8.w f19159p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f19160q;

    /* JADX INFO: compiled from: MediaPeriodHolder.java */
    interface a {
        l1 a(m1 m1Var, long j10);
    }

    public l1(i2[] i2VarArr, long j10, q8.v vVar, r8.b bVar, d2 d2Var, m1 m1Var, q8.w wVar, long j11) {
        this.f19154k = i2VarArr;
        this.f19160q = j10;
        this.f19155l = vVar;
        this.f19156m = d2Var;
        io.bidmachine.media3.exoplayer.source.r.b bVar2 = m1Var.f19165a;
        this.f19145b = bVar2.f19684a;
        this.f19151h = m1Var;
        this.f19147d = j11;
        this.f19158o = n8.x.f22835d;
        this.f19159p = wVar;
        this.f19146c = new n8.s[i2VarArr.length];
        this.f19153j = new boolean[i2VarArr.length];
        this.f19144a = f(bVar2, d2Var, bVar, m1Var.f19166b, m1Var.f19168d, m1Var.f19170f);
    }

    private void c(n8.s[] sVarArr) {
        int i10 = 0;
        while (true) {
            i2[] i2VarArr = this.f19154k;
            if (i10 >= i2VarArr.length) {
                return;
            }
            if (i2VarArr[i10].g() == -2 && this.f19159p.c(i10)) {
                sVarArr[i10] = new n8.h();
            }
            i10++;
        }
    }

    private static io.bidmachine.media3.exoplayer.source.q f(io.bidmachine.media3.exoplayer.source.r.b bVar, d2 d2Var, r8.b bVar2, long j10, long j11, boolean z10) {
        io.bidmachine.media3.exoplayer.source.q qVarH = d2Var.h(bVar, bVar2, j10);
        return j11 != -9223372036854775807L ? new io.bidmachine.media3.exoplayer.source.b(qVarH, !z10, 0L, j11) : qVarH;
    }

    private void g() {
        if (!u()) {
            return;
        }
        int i10 = 0;
        while (true) {
            q8.w wVar = this.f19159p;
            if (i10 >= wVar.f24611a) {
                return;
            }
            boolean zC = wVar.c(i10);
            q8.q qVar = this.f19159p.f24613c[i10];
            if (zC && qVar != null) {
                qVar.d();
            }
            i10++;
        }
    }

    private void h(n8.s[] sVarArr) {
        int i10 = 0;
        while (true) {
            i2[] i2VarArr = this.f19154k;
            if (i10 >= i2VarArr.length) {
                return;
            }
            if (i2VarArr[i10].g() == -2) {
                sVarArr[i10] = null;
            }
            i10++;
        }
    }

    private void i() {
        if (!u()) {
            return;
        }
        int i10 = 0;
        while (true) {
            q8.w wVar = this.f19159p;
            if (i10 >= wVar.f24611a) {
                return;
            }
            boolean zC = wVar.c(i10);
            q8.q qVar = this.f19159p.f24613c[i10];
            if (zC && qVar != null) {
                qVar.o();
            }
            i10++;
        }
    }

    private boolean u() {
        return this.f19157n == null;
    }

    private static void y(d2 d2Var, io.bidmachine.media3.exoplayer.source.q qVar) {
        try {
            if (qVar instanceof io.bidmachine.media3.exoplayer.source.b) {
                d2Var.A(((io.bidmachine.media3.exoplayer.source.b) qVar).f19427a);
            } else {
                d2Var.A(qVar);
            }
        } catch (RuntimeException e10) {
            x7.r.d("MediaPeriodHolder", "Period release failed.", e10);
        }
    }

    public void A(l1 l1Var) {
        if (l1Var == this.f19157n) {
            return;
        }
        g();
        this.f19157n = l1Var;
        i();
    }

    public void B(long j10) {
        this.f19160q = j10;
    }

    public long C(long j10) {
        return j10 - m();
    }

    public long D(long j10) {
        return j10 + m();
    }

    public void E() {
        io.bidmachine.media3.exoplayer.source.q qVar = this.f19144a;
        if (qVar instanceof io.bidmachine.media3.exoplayer.source.b) {
            long j10 = this.f19151h.f19168d;
            if (j10 == -9223372036854775807L) {
                j10 = Long.MIN_VALUE;
            }
            ((io.bidmachine.media3.exoplayer.source.b) qVar).v(0L, j10);
        }
    }

    public long a(q8.w wVar, long j10, boolean z10) {
        return b(wVar, j10, z10, new boolean[this.f19154k.length]);
    }

    public long b(q8.w wVar, long j10, boolean z10, boolean[] zArr) {
        int i10 = 0;
        while (true) {
            boolean z11 = true;
            if (i10 >= wVar.f24611a) {
                break;
            }
            boolean[] zArr2 = this.f19153j;
            if (z10 || !wVar.b(this.f19159p, i10)) {
                z11 = false;
            }
            zArr2[i10] = z11;
            i10++;
        }
        h(this.f19146c);
        g();
        this.f19159p = wVar;
        i();
        long jI = this.f19144a.i(wVar.f24613c, this.f19153j, this.f19146c, zArr, j10);
        c(this.f19146c);
        this.f19150g = false;
        int i11 = 0;
        while (true) {
            n8.s[] sVarArr = this.f19146c;
            if (i11 >= sVarArr.length) {
                return jI;
            }
            if (sVarArr[i11] != null) {
                x7.a.g(wVar.c(i11));
                if (this.f19154k[i11].g() != -2) {
                    this.f19150g = true;
                }
            } else {
                x7.a.g(wVar.f24613c[i11] == null);
            }
            i11++;
        }
    }

    public boolean d(m1 m1Var) {
        if (o1.e(this.f19151h.f19169e, m1Var.f19169e)) {
            m1 m1Var2 = this.f19151h;
            if (m1Var2.f19166b == m1Var.f19166b && m1Var2.f19165a.equals(m1Var.f19165a)) {
                return true;
            }
        }
        return false;
    }

    public void e(k1 k1Var) {
        x7.a.g(u());
        this.f19144a.c(k1Var);
    }

    public long j() {
        if (!this.f19149f) {
            return this.f19151h.f19166b;
        }
        long jF = this.f19150g ? this.f19144a.f() : Long.MIN_VALUE;
        return jF == Long.MIN_VALUE ? this.f19151h.f19169e : jF;
    }

    public l1 k() {
        return this.f19157n;
    }

    public long l() {
        if (this.f19149f) {
            return this.f19144a.b();
        }
        return 0L;
    }

    public long m() {
        return this.f19160q;
    }

    public long n() {
        return this.f19151h.f19166b + this.f19160q;
    }

    public n8.x o() {
        return this.f19158o;
    }

    public q8.w p() {
        return this.f19159p;
    }

    public void q(float f10, u7.d0 d0Var, boolean z10) throws ExoPlaybackException {
        this.f19149f = true;
        this.f19158o = this.f19144a.t();
        q8.w wVarZ = z(f10, d0Var, z10);
        m1 m1Var = this.f19151h;
        long jMax = m1Var.f19166b;
        long j10 = m1Var.f19169e;
        if (j10 != -9223372036854775807L && jMax >= j10) {
            jMax = Math.max(0L, j10 - 1);
        }
        long jA = a(wVarZ, jMax, false);
        long j11 = this.f19160q;
        m1 m1Var2 = this.f19151h;
        this.f19160q = j11 + (m1Var2.f19166b - jA);
        this.f19151h = m1Var2.b(jA);
    }

    public boolean r() {
        try {
            if (this.f19149f) {
                for (n8.s sVar : this.f19146c) {
                    if (sVar != null) {
                        sVar.a();
                    }
                }
            } else {
                this.f19144a.q();
            }
            return false;
        } catch (IOException unused) {
            return true;
        }
    }

    public boolean s() {
        return this.f19149f && (!this.f19150g || this.f19144a.f() == Long.MIN_VALUE);
    }

    public boolean t() {
        return this.f19149f && (s() || j() - this.f19151h.f19166b >= this.f19147d);
    }

    public void v(io.bidmachine.media3.exoplayer.source.q.a aVar, long j10) {
        this.f19148e = true;
        this.f19144a.l(aVar, j10);
    }

    public void w(long j10) {
        x7.a.g(u());
        if (this.f19149f) {
            this.f19144a.g(C(j10));
        }
    }

    public void x() {
        g();
        y(this.f19156m, this.f19144a);
    }

    public q8.w z(float f10, u7.d0 d0Var, boolean z10) throws ExoPlaybackException {
        q8.w wVarK = this.f19155l.k(this.f19154k, o(), this.f19151h.f19165a, d0Var);
        for (int i10 = 0; i10 < wVarK.f24611a; i10++) {
            boolean z11 = true;
            if (wVarK.c(i10)) {
                if (wVarK.f24613c[i10] == null && this.f19154k[i10].g() != -2) {
                    z11 = false;
                }
                x7.a.g(z11);
            } else {
                x7.a.g(wVarK.f24613c[i10] == null);
            }
        }
        for (q8.q qVar : wVarK.f24613c) {
            if (qVar != null) {
                qVar.h(f10);
                qVar.n(z10);
            }
        }
        return wVarK;
    }
}
