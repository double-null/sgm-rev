package ca;

import io.bidmachine.media3.common.ParserException;
import v8.o0;

/* JADX INFO: compiled from: MpeghReader.java */
/* JADX INFO: loaded from: classes4.dex */
public final class u implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f5401a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f5406f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private o0 f5407g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f5410j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f5412l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f5413m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f5415o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f5416p;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f5420t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f5422v;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f5405e = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x7.a0 f5402b = new x7.a0(new byte[15], 2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x7.z f5403c = new x7.z();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final x7.a0 f5404d = new x7.a0();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private v.b f5417q = new v.b();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f5418r = -2147483647;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f5419s = -1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f5421u = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f5411k = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f5414n = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private double f5408h = -9.223372036854776E18d;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private double f5409i = -9.223372036854776E18d;

    public u(String str) {
        this.f5401a = str;
    }

    private void a(x7.a0 a0Var, x7.a0 a0Var2, boolean z10) {
        int iF = a0Var.f();
        int iMin = Math.min(a0Var.a(), a0Var2.a());
        a0Var.l(a0Var2.e(), a0Var2.f(), iMin);
        a0Var2.X(iMin);
        if (z10) {
            a0Var.W(iF);
        }
    }

    private void g() {
        int i10;
        if (this.f5422v) {
            this.f5411k = false;
            i10 = 1;
        } else {
            i10 = 0;
        }
        double d10 = (((double) (this.f5419s - this.f5420t)) * 1000000.0d) / ((double) this.f5418r);
        long jRound = Math.round(this.f5408h);
        if (this.f5410j) {
            this.f5410j = false;
            this.f5408h = this.f5409i;
        } else {
            this.f5408h += d10;
        }
        this.f5407g.f(jRound, i10, this.f5416p, 0, null);
        this.f5422v = false;
        this.f5420t = 0;
        this.f5416p = 0;
    }

    private void h(x7.z zVar) throws ParserException {
        v.c cVarH = v.h(zVar);
        this.f5418r = cVarH.f5427b;
        this.f5419s = cVarH.f5428c;
        long j10 = this.f5421u;
        long j11 = this.f5417q.f5424b;
        if (j10 != j11) {
            this.f5421u = j11;
            String str = "mhm1";
            if (cVarH.f5426a != -1) {
                str = "mhm1" + String.format(".%02X", Integer.valueOf(cVarH.f5426a));
            }
            byte[] bArr = cVarH.f5429d;
            this.f5407g.a(new u7.q.b().f0(this.f5406f).U(this.f5401a).u0("audio/mhm1").v0(this.f5418r).S(str).g0((bArr == null || bArr.length <= 0) ? null : com.google.common.collect.u.K(x7.l0.f28141f, bArr)).N());
        }
        this.f5422v = true;
    }

    private boolean i() throws ParserException {
        int iG = this.f5402b.g();
        this.f5403c.o(this.f5402b.e(), iG);
        boolean zG = v.g(this.f5403c, this.f5417q);
        if (zG) {
            this.f5415o = 0;
            this.f5416p += this.f5417q.f5425c + iG;
        }
        return zG;
    }

    private boolean j(int i10) {
        return i10 == 1 || i10 == 17;
    }

    private boolean k(x7.a0 a0Var) {
        int i10 = this.f5412l;
        if ((i10 & 2) == 0) {
            a0Var.W(a0Var.g());
            return false;
        }
        if ((i10 & 4) != 0) {
            return true;
        }
        while (a0Var.a() > 0) {
            int i11 = this.f5413m << 8;
            this.f5413m = i11;
            int iH = i11 | a0Var.H();
            this.f5413m = iH;
            if (v.e(iH)) {
                a0Var.W(a0Var.f() - 3);
                this.f5413m = 0;
                return true;
            }
        }
        return false;
    }

    private void l(x7.a0 a0Var) {
        int iMin = Math.min(a0Var.a(), this.f5417q.f5425c - this.f5415o);
        this.f5407g.b(a0Var, iMin);
        this.f5415o += iMin;
    }

    @Override // ca.m
    public void b() {
        this.f5405e = 0;
        this.f5413m = 0;
        this.f5402b.S(2);
        this.f5415o = 0;
        this.f5416p = 0;
        this.f5418r = -2147483647;
        this.f5419s = -1;
        this.f5420t = 0;
        this.f5421u = -1L;
        this.f5422v = false;
        this.f5410j = false;
        this.f5414n = true;
        this.f5411k = true;
        this.f5408h = -9.223372036854776E18d;
        this.f5409i = -9.223372036854776E18d;
    }

    @Override // ca.m
    public void c(x7.a0 a0Var) throws ParserException {
        x7.a.i(this.f5407g);
        while (a0Var.a() > 0) {
            int i10 = this.f5405e;
            if (i10 != 0) {
                if (i10 == 1) {
                    a(a0Var, this.f5402b, false);
                    if (this.f5402b.a() != 0) {
                        this.f5414n = false;
                    } else if (i()) {
                        this.f5402b.W(0);
                        o0 o0Var = this.f5407g;
                        x7.a0 a0Var2 = this.f5402b;
                        o0Var.b(a0Var2, a0Var2.g());
                        this.f5402b.S(2);
                        this.f5404d.S(this.f5417q.f5425c);
                        this.f5414n = true;
                        this.f5405e = 2;
                    } else if (this.f5402b.g() < 15) {
                        x7.a0 a0Var3 = this.f5402b;
                        a0Var3.V(a0Var3.g() + 1);
                        this.f5414n = false;
                    }
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException();
                    }
                    if (j(this.f5417q.f5423a)) {
                        a(a0Var, this.f5404d, true);
                    }
                    l(a0Var);
                    int i11 = this.f5415o;
                    v.b bVar = this.f5417q;
                    if (i11 == bVar.f5425c) {
                        int i12 = bVar.f5423a;
                        if (i12 == 1) {
                            h(new x7.z(this.f5404d.e()));
                        } else if (i12 == 17) {
                            this.f5420t = v.f(new x7.z(this.f5404d.e()));
                        } else if (i12 == 2) {
                            g();
                        }
                        this.f5405e = 1;
                    }
                }
            } else if (k(a0Var)) {
                this.f5405e = 1;
            }
        }
    }

    @Override // ca.m
    public void d(v8.r rVar, l0.d dVar) {
        dVar.a();
        this.f5406f = dVar.b();
        this.f5407g = rVar.e(dVar.c(), 1);
    }

    @Override // ca.m
    public void f(long j10, int i10) {
        this.f5412l = i10;
        if (!this.f5411k && (this.f5416p != 0 || !this.f5414n)) {
            this.f5410j = true;
        }
        if (j10 != -9223372036854775807L) {
            if (this.f5410j) {
                this.f5409i = j10;
            } else {
                this.f5408h = j10;
            }
        }
    }

    @Override // ca.m
    public void e(boolean z10) {
    }
}
