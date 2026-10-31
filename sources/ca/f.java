package ca;

import d5.LXP.wcAlQCOdREZdI;
import v8.o0;

/* JADX INFO: compiled from: Ac4Reader.java */
/* JADX INFO: loaded from: classes4.dex */
public final class f implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x7.z f5087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x7.a0 f5088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f5089c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f5090d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f5091e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f5092f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private o0 f5093g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f5094h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f5095i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f5096j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f5097k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f5098l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private u7.q f5099m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f5100n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f5101o;

    public f(String str) {
        this(null, 0, str);
    }

    private boolean a(x7.a0 a0Var, byte[] bArr, int i10) {
        int iMin = Math.min(a0Var.a(), i10 - this.f5095i);
        a0Var.l(bArr, this.f5095i, iMin);
        int i11 = this.f5095i + iMin;
        this.f5095i = i11;
        return i11 == i10;
    }

    private boolean h(x7.a0 a0Var) {
        while (true) {
            if (a0Var.a() <= 0) {
                return false;
            }
            if (this.f5096j) {
                int iH = a0Var.H();
                this.f5096j = iH == 172;
                if (iH == 64 || iH == 65) {
                    this.f5097k = iH == 65;
                    return true;
                }
            } else {
                this.f5096j = a0Var.H() == 172;
            }
        }
    }

    @Override // ca.m
    public void b() {
        this.f5094h = 0;
        this.f5095i = 0;
        this.f5096j = false;
        this.f5097k = false;
        this.f5101o = -9223372036854775807L;
    }

    @Override // ca.m
    public void c(x7.a0 a0Var) {
        x7.a.i(this.f5093g);
        while (a0Var.a() > 0) {
            int i10 = this.f5094h;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int iMin = Math.min(a0Var.a(), this.f5100n - this.f5095i);
                        this.f5093g.b(a0Var, iMin);
                        int i11 = this.f5095i + iMin;
                        this.f5095i = i11;
                        if (i11 == this.f5100n) {
                            x7.a.g(this.f5101o != -9223372036854775807L);
                            this.f5093g.f(this.f5101o, 1, this.f5100n, 0, null);
                            this.f5101o += this.f5098l;
                            this.f5094h = 0;
                        }
                    }
                } else if (a(a0Var, this.f5088b.e(), 16)) {
                    g();
                    this.f5088b.W(0);
                    this.f5093g.b(this.f5088b, 16);
                    this.f5094h = 2;
                }
            } else if (h(a0Var)) {
                this.f5094h = 1;
                this.f5088b.e()[0] = -84;
                this.f5088b.e()[1] = (byte) (this.f5097k ? 65 : 64);
                this.f5095i = 2;
            }
        }
    }

    @Override // ca.m
    public void d(v8.r rVar, l0.d dVar) {
        dVar.a();
        this.f5092f = dVar.b();
        this.f5093g = rVar.e(dVar.c(), 1);
    }

    @Override // ca.m
    public void e(boolean z10) {
    }

    @Override // ca.m
    public void f(long j10, int i10) {
        this.f5101o = j10;
    }

    public f(String str, int i10, String str2) {
        x7.z zVar = new x7.z(new byte[16]);
        this.f5087a = zVar;
        this.f5088b = new x7.a0(zVar.f28202a);
        this.f5094h = 0;
        this.f5095i = 0;
        this.f5096j = false;
        this.f5097k = false;
        this.f5101o = -9223372036854775807L;
        this.f5089c = str;
        this.f5090d = i10;
        this.f5091e = str2;
    }

    private void g() {
        this.f5087a.p(0);
        v8.c.C0454c c0454cF = v8.c.f(this.f5087a);
        u7.q qVar = this.f5099m;
        String str = wcAlQCOdREZdI.EULHHEtQZhoWeqh;
        if (qVar == null || c0454cF.f27253c != qVar.E || c0454cF.f27252b != qVar.F || !str.equals(qVar.f26252o)) {
            u7.q qVarN = new u7.q.b().f0(this.f5092f).U(this.f5091e).u0(str).R(c0454cF.f27253c).v0(c0454cF.f27252b).j0(this.f5089c).s0(this.f5090d).N();
            this.f5099m = qVarN;
            this.f5093g.a(qVarN);
        }
        this.f5100n = c0454cF.f27254d;
        this.f5098l = (((long) c0454cF.f27255e) * 1000000) / ((long) this.f5099m.F);
    }
}
