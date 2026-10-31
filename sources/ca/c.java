package ca;

import java.util.Objects;
import v8.o0;

/* JADX INFO: compiled from: Ac3Reader.java */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x7.z f5043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x7.a0 f5044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f5045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f5046d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f5047e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f5048f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private o0 f5049g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f5050h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f5051i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f5052j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f5053k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private u7.q f5054l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f5055m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f5056n;

    public c(String str) {
        this(null, 0, str);
    }

    private boolean a(x7.a0 a0Var, byte[] bArr, int i10) {
        int iMin = Math.min(a0Var.a(), i10 - this.f5051i);
        a0Var.l(bArr, this.f5051i, iMin);
        int i11 = this.f5051i + iMin;
        this.f5051i = i11;
        return i11 == i10;
    }

    private void g() {
        this.f5043a.p(0);
        v8.b.C0453b c0453bF = v8.b.f(this.f5043a);
        u7.q qVar = this.f5054l;
        if (qVar == null || c0453bF.f27237d != qVar.E || c0453bF.f27236c != qVar.F || !Objects.equals(c0453bF.f27234a, qVar.f26252o)) {
            u7.q.b bVarP0 = new u7.q.b().f0(this.f5048f).U(this.f5047e).u0(c0453bF.f27234a).R(c0453bF.f27237d).v0(c0453bF.f27236c).j0(this.f5045c).s0(this.f5046d).p0(c0453bF.f27240g);
            if ("audio/ac3".equals(c0453bF.f27234a)) {
                bVarP0.Q(c0453bF.f27240g);
            }
            u7.q qVarN = bVarP0.N();
            this.f5054l = qVarN;
            this.f5049g.a(qVarN);
        }
        this.f5055m = c0453bF.f27238e;
        this.f5053k = (((long) c0453bF.f27239f) * 1000000) / ((long) this.f5054l.F);
    }

    private boolean h(x7.a0 a0Var) {
        while (true) {
            if (a0Var.a() <= 0) {
                return false;
            }
            if (this.f5052j) {
                int iH = a0Var.H();
                if (iH == 119) {
                    this.f5052j = false;
                    return true;
                }
                this.f5052j = iH == 11;
            } else {
                this.f5052j = a0Var.H() == 11;
            }
        }
    }

    @Override // ca.m
    public void b() {
        this.f5050h = 0;
        this.f5051i = 0;
        this.f5052j = false;
        this.f5056n = -9223372036854775807L;
    }

    @Override // ca.m
    public void c(x7.a0 a0Var) {
        x7.a.i(this.f5049g);
        while (a0Var.a() > 0) {
            int i10 = this.f5050h;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int iMin = Math.min(a0Var.a(), this.f5055m - this.f5051i);
                        this.f5049g.b(a0Var, iMin);
                        int i11 = this.f5051i + iMin;
                        this.f5051i = i11;
                        if (i11 == this.f5055m) {
                            x7.a.g(this.f5056n != -9223372036854775807L);
                            this.f5049g.f(this.f5056n, 1, this.f5055m, 0, null);
                            this.f5056n += this.f5053k;
                            this.f5050h = 0;
                        }
                    }
                } else if (a(a0Var, this.f5044b.e(), 128)) {
                    g();
                    this.f5044b.W(0);
                    this.f5049g.b(this.f5044b, 128);
                    this.f5050h = 2;
                }
            } else if (h(a0Var)) {
                this.f5050h = 1;
                this.f5044b.e()[0] = 11;
                this.f5044b.e()[1] = 119;
                this.f5051i = 2;
            }
        }
    }

    @Override // ca.m
    public void d(v8.r rVar, l0.d dVar) {
        dVar.a();
        this.f5048f = dVar.b();
        this.f5049g = rVar.e(dVar.c(), 1);
    }

    @Override // ca.m
    public void f(long j10, int i10) {
        this.f5056n = j10;
    }

    public c(String str, int i10, String str2) {
        x7.z zVar = new x7.z(new byte[128]);
        this.f5043a = zVar;
        this.f5044b = new x7.a0(zVar.f28202a);
        this.f5050h = 0;
        this.f5056n = -9223372036854775807L;
        this.f5045c = str;
        this.f5046d = i10;
        this.f5047e = str2;
    }

    @Override // ca.m
    public void e(boolean z10) {
    }
}
