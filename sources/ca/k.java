package ca;

import io.bidmachine.media3.common.ParserException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import v8.o0;

/* JADX INFO: compiled from: DtsReader.java */
/* JADX INFO: loaded from: classes4.dex */
public final class k implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x7.a0 f5159a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f5161c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f5162d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f5163e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f5164f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private o0 f5165g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f5167i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f5168j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f5169k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private u7.q f5170l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f5171m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f5172n;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f5166h = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f5175q = -9223372036854775807L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicInteger f5160b = new AtomicInteger();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f5173o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f5174p = -1;

    public k(String str, int i10, int i11, String str2) {
        this.f5159a = new x7.a0(new byte[i11]);
        this.f5161c = str;
        this.f5162d = i10;
        this.f5163e = str2;
    }

    private boolean a(x7.a0 a0Var, byte[] bArr, int i10) {
        int iMin = Math.min(a0Var.a(), i10 - this.f5167i);
        a0Var.l(bArr, this.f5167i, iMin);
        int i11 = this.f5167i + iMin;
        this.f5167i = i11;
        return i11 == i10;
    }

    private void g() {
        byte[] bArrE = this.f5159a.e();
        if (this.f5170l == null) {
            u7.q qVarH = v8.o.h(bArrE, this.f5164f, this.f5161c, this.f5162d, this.f5163e, null);
            this.f5170l = qVarH;
            this.f5165g.a(qVarH);
        }
        this.f5171m = v8.o.b(bArrE);
        this.f5169k = com.google.common.primitives.f.d(x7.l0.e1(v8.o.g(bArrE), this.f5170l.F));
    }

    private void h() throws ParserException {
        v8.o.b bVarI = v8.o.i(this.f5159a.e());
        k(bVarI);
        this.f5171m = bVarI.f27400d;
        long j10 = bVarI.f27401e;
        if (j10 == -9223372036854775807L) {
            j10 = 0;
        }
        this.f5169k = j10;
    }

    private void i() throws ParserException {
        v8.o.b bVarK = v8.o.k(this.f5159a.e(), this.f5160b);
        if (this.f5172n == 3) {
            k(bVarK);
        }
        this.f5171m = bVarK.f27400d;
        long j10 = bVarK.f27401e;
        if (j10 == -9223372036854775807L) {
            j10 = 0;
        }
        this.f5169k = j10;
    }

    private boolean j(x7.a0 a0Var) {
        while (a0Var.a() > 0) {
            int i10 = this.f5168j << 8;
            this.f5168j = i10;
            int iH = i10 | a0Var.H();
            this.f5168j = iH;
            int iC = v8.o.c(iH);
            this.f5172n = iC;
            if (iC != 0) {
                byte[] bArrE = this.f5159a.e();
                int i11 = this.f5168j;
                bArrE[0] = (byte) ((i11 >> 24) & 255);
                bArrE[1] = (byte) ((i11 >> 16) & 255);
                bArrE[2] = (byte) ((i11 >> 8) & 255);
                bArrE[3] = (byte) (i11 & 255);
                this.f5167i = 4;
                this.f5168j = 0;
                return true;
            }
        }
        return false;
    }

    private void k(v8.o.b bVar) {
        int i10;
        int i11 = bVar.f27398b;
        if (i11 == -2147483647 || (i10 = bVar.f27399c) == -1) {
            return;
        }
        u7.q qVar = this.f5170l;
        if (qVar != null && i10 == qVar.E && i11 == qVar.F && Objects.equals(bVar.f27397a, qVar.f26252o)) {
            return;
        }
        u7.q qVar2 = this.f5170l;
        u7.q qVarN = (qVar2 == null ? new u7.q.b() : qVar2.b()).f0(this.f5164f).U(this.f5163e).u0(bVar.f27397a).R(bVar.f27399c).v0(bVar.f27398b).j0(this.f5161c).s0(this.f5162d).N();
        this.f5170l = qVarN;
        this.f5165g.a(qVarN);
    }

    @Override // ca.m
    public void b() {
        this.f5166h = 0;
        this.f5167i = 0;
        this.f5168j = 0;
        this.f5175q = -9223372036854775807L;
        this.f5160b.set(0);
    }

    @Override // ca.m
    public void c(x7.a0 a0Var) throws ParserException {
        x7.a.i(this.f5165g);
        while (a0Var.a() > 0) {
            switch (this.f5166h) {
                case 0:
                    if (j(a0Var)) {
                        int i10 = this.f5172n;
                        if (i10 == 3 || i10 == 4) {
                            this.f5166h = 4;
                        } else if (i10 != 1) {
                            this.f5166h = 2;
                        } else {
                            this.f5166h = 1;
                        }
                    }
                    break;
                case 1:
                    if (a(a0Var, this.f5159a.e(), 18)) {
                        g();
                        this.f5159a.W(0);
                        this.f5165g.b(this.f5159a, 18);
                        this.f5166h = 6;
                    }
                    break;
                case 2:
                    if (a(a0Var, this.f5159a.e(), 7)) {
                        this.f5173o = v8.o.j(this.f5159a.e());
                        this.f5166h = 3;
                    }
                    break;
                case 3:
                    if (a(a0Var, this.f5159a.e(), this.f5173o)) {
                        h();
                        this.f5159a.W(0);
                        this.f5165g.b(this.f5159a, this.f5173o);
                        this.f5166h = 6;
                    }
                    break;
                case 4:
                    if (a(a0Var, this.f5159a.e(), 6)) {
                        int iL = v8.o.l(this.f5159a.e());
                        this.f5174p = iL;
                        int i11 = this.f5167i;
                        if (i11 > iL) {
                            int i12 = i11 - iL;
                            this.f5167i = i11 - i12;
                            a0Var.W(a0Var.f() - i12);
                        }
                        this.f5166h = 5;
                    }
                    break;
                case 5:
                    if (a(a0Var, this.f5159a.e(), this.f5174p)) {
                        i();
                        this.f5159a.W(0);
                        this.f5165g.b(this.f5159a, this.f5174p);
                        this.f5166h = 6;
                    }
                    break;
                case 6:
                    int iMin = Math.min(a0Var.a(), this.f5171m - this.f5167i);
                    this.f5165g.b(a0Var, iMin);
                    int i13 = this.f5167i + iMin;
                    this.f5167i = i13;
                    if (i13 == this.f5171m) {
                        x7.a.g(this.f5175q != -9223372036854775807L);
                        this.f5165g.f(this.f5175q, this.f5172n == 4 ? 0 : 1, this.f5171m, 0, null);
                        this.f5175q += this.f5169k;
                        this.f5166h = 0;
                    }
                    break;
                default:
                    throw new IllegalStateException();
            }
        }
    }

    @Override // ca.m
    public void d(v8.r rVar, l0.d dVar) {
        dVar.a();
        this.f5164f = dVar.b();
        this.f5165g = rVar.e(dVar.c(), 1);
    }

    @Override // ca.m
    public void f(long j10, int i10) {
        this.f5175q = j10;
    }

    @Override // ca.m
    public void e(boolean z10) {
    }
}
