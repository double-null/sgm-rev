package ca;

import v8.o0;

/* JADX INFO: compiled from: MpegAudioReader.java */
/* JADX INFO: loaded from: classes4.dex */
public final class t implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x7.a0 f5387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v8.f0.a f5388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f5389c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f5390d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f5391e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private o0 f5392f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f5393g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f5394h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f5395i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f5396j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f5397k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f5398l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f5399m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f5400n;

    public t(String str) {
        this(null, 0, str);
    }

    private void a(x7.a0 a0Var) {
        byte[] bArrE = a0Var.e();
        int iG = a0Var.g();
        for (int iF = a0Var.f(); iF < iG; iF++) {
            byte b10 = bArrE[iF];
            boolean z10 = (b10 & 255) == 255;
            boolean z11 = this.f5397k && (b10 & 224) == 224;
            this.f5397k = z10;
            if (z11) {
                a0Var.W(iF + 1);
                this.f5397k = false;
                this.f5387a.e()[1] = bArrE[iF];
                this.f5395i = 2;
                this.f5394h = 1;
                return;
            }
        }
        a0Var.W(iG);
    }

    private void g(x7.a0 a0Var) {
        int iMin = Math.min(a0Var.a(), this.f5399m - this.f5395i);
        this.f5392f.b(a0Var, iMin);
        int i10 = this.f5395i + iMin;
        this.f5395i = i10;
        if (i10 < this.f5399m) {
            return;
        }
        x7.a.g(this.f5400n != -9223372036854775807L);
        this.f5392f.f(this.f5400n, 1, this.f5399m, 0, null);
        this.f5400n += this.f5398l;
        this.f5395i = 0;
        this.f5394h = 0;
    }

    private void h(x7.a0 a0Var) {
        int iMin = Math.min(a0Var.a(), 4 - this.f5395i);
        a0Var.l(this.f5387a.e(), this.f5395i, iMin);
        int i10 = this.f5395i + iMin;
        this.f5395i = i10;
        if (i10 < 4) {
            return;
        }
        this.f5387a.W(0);
        if (!this.f5388b.a(this.f5387a.q())) {
            this.f5395i = 0;
            this.f5394h = 1;
            return;
        }
        v8.f0.a aVar = this.f5388b;
        this.f5399m = aVar.f27319c;
        if (!this.f5396j) {
            this.f5398l = (((long) aVar.f27323g) * 1000000) / ((long) aVar.f27320d);
            this.f5392f.a(new u7.q.b().f0(this.f5393g).U(this.f5391e).u0(this.f5388b.f27318b).k0(4096).R(this.f5388b.f27321e).v0(this.f5388b.f27320d).j0(this.f5389c).s0(this.f5390d).N());
            this.f5396j = true;
        }
        this.f5387a.W(0);
        this.f5392f.b(this.f5387a, 4);
        this.f5394h = 2;
    }

    @Override // ca.m
    public void b() {
        this.f5394h = 0;
        this.f5395i = 0;
        this.f5397k = false;
        this.f5400n = -9223372036854775807L;
    }

    @Override // ca.m
    public void c(x7.a0 a0Var) {
        x7.a.i(this.f5392f);
        while (a0Var.a() > 0) {
            int i10 = this.f5394h;
            if (i10 == 0) {
                a(a0Var);
            } else if (i10 == 1) {
                h(a0Var);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException();
                }
                g(a0Var);
            }
        }
    }

    @Override // ca.m
    public void d(v8.r rVar, l0.d dVar) {
        dVar.a();
        this.f5393g = dVar.b();
        this.f5392f = rVar.e(dVar.c(), 1);
    }

    @Override // ca.m
    public void f(long j10, int i10) {
        this.f5400n = j10;
    }

    public t(String str, int i10, String str2) {
        this.f5394h = 0;
        x7.a0 a0Var = new x7.a0(4);
        this.f5387a = a0Var;
        a0Var.e()[0] = -1;
        this.f5388b = new v8.f0.a();
        this.f5400n = -9223372036854775807L;
        this.f5389c = str;
        this.f5390d = i10;
        this.f5391e = str2;
    }

    @Override // ca.m
    public void e(boolean z10) {
    }
}
