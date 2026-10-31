package ca;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import io.bidmachine.media3.common.ParserException;
import java.util.Arrays;
import java.util.Collections;
import v8.o0;

/* JADX INFO: compiled from: AdtsReader.java */
/* JADX INFO: loaded from: classes4.dex */
public final class i implements m {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final byte[] f5124x = {73, 68, 51};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f5125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x7.z f5126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x7.a0 f5127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f5128d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f5129e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f5130f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f5131g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private o0 f5132h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private o0 f5133i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f5134j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f5135k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f5136l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f5137m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f5138n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f5139o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f5140p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f5141q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f5142r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f5143s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f5144t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f5145u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private o0 f5146v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f5147w;

    public i(boolean z10, String str) {
        this(z10, null, 0, str);
    }

    private void a() {
        x7.a.e(this.f5132h);
        x7.l0.i(this.f5146v);
        x7.l0.i(this.f5133i);
    }

    private void g(x7.a0 a0Var) {
        if (a0Var.a() == 0) {
            return;
        }
        this.f5126b.f28202a[0] = a0Var.e()[a0Var.f()];
        this.f5126b.p(2);
        int iH = this.f5126b.h(4);
        int i10 = this.f5140p;
        if (i10 != -1 && iH != i10) {
            q();
            return;
        }
        if (!this.f5138n) {
            this.f5138n = true;
            this.f5139o = this.f5141q;
            this.f5140p = iH;
        }
        t();
    }

    private boolean h(x7.a0 a0Var, int i10) {
        a0Var.W(i10 + 1);
        if (!w(a0Var, this.f5126b.f28202a, 1)) {
            return false;
        }
        this.f5126b.p(4);
        int iH = this.f5126b.h(1);
        int i11 = this.f5139o;
        if (i11 != -1 && iH != i11) {
            return false;
        }
        if (this.f5140p != -1) {
            if (!w(a0Var, this.f5126b.f28202a, 1)) {
                return true;
            }
            this.f5126b.p(2);
            if (this.f5126b.h(4) != this.f5140p) {
                return false;
            }
            a0Var.W(i10 + 2);
        }
        if (!w(a0Var, this.f5126b.f28202a, 4)) {
            return true;
        }
        this.f5126b.p(14);
        int iH2 = this.f5126b.h(13);
        if (iH2 < 7) {
            return false;
        }
        byte[] bArrE = a0Var.e();
        int iG = a0Var.g();
        int i12 = i10 + iH2;
        if (i12 >= iG) {
            return true;
        }
        byte b10 = bArrE[i12];
        if (b10 == -1) {
            int i13 = i12 + 1;
            if (i13 == iG) {
                return true;
            }
            return l((byte) -1, bArrE[i13]) && ((bArrE[i13] & 8) >> 3) == iH;
        }
        if (b10 != 73) {
            return false;
        }
        int i14 = i12 + 1;
        if (i14 == iG) {
            return true;
        }
        if (bArrE[i14] != 68) {
            return false;
        }
        int i15 = i12 + 2;
        return i15 == iG || bArrE[i15] == 51;
    }

    private boolean i(x7.a0 a0Var, byte[] bArr, int i10) {
        int iMin = Math.min(a0Var.a(), i10 - this.f5135k);
        a0Var.l(bArr, this.f5135k, iMin);
        int i11 = this.f5135k + iMin;
        this.f5135k = i11;
        return i11 == i10;
    }

    private void j(x7.a0 a0Var) {
        byte[] bArrE = a0Var.e();
        int iF = a0Var.f();
        int iG = a0Var.g();
        while (iF < iG) {
            int i10 = iF + 1;
            int i11 = bArrE[iF] & 255;
            if (this.f5136l == 512 && l((byte) -1, (byte) i11) && (this.f5138n || h(a0Var, i10 - 2))) {
                this.f5141q = (i11 & 8) >> 3;
                this.f5137m = (i11 & 1) == 0;
                if (this.f5138n) {
                    t();
                } else {
                    r();
                }
                a0Var.W(i10);
                return;
            }
            int i12 = this.f5136l;
            int i13 = i11 | i12;
            if (i13 == 329) {
                this.f5136l = 768;
            } else if (i13 == 511) {
                this.f5136l = 512;
            } else if (i13 == 836) {
                this.f5136l = 1024;
            } else if (i13 == 1075) {
                u();
                a0Var.W(i10);
                return;
            } else if (i12 != 256) {
                this.f5136l = UserVerificationMethods.USER_VERIFY_HANDPRINT;
                i10--;
            }
            iF = i10;
        }
        a0Var.W(iF);
    }

    private boolean l(byte b10, byte b11) {
        return m(((b10 & 255) << 8) | (b11 & 255));
    }

    public static boolean m(int i10) {
        return (i10 & 65526) == 65520;
    }

    private void n() throws ParserException {
        this.f5126b.p(0);
        if (this.f5142r) {
            this.f5126b.r(10);
        } else {
            int iH = this.f5126b.h(2) + 1;
            if (iH != 2) {
                x7.r.h("AdtsReader", "Detected audio object type: " + iH + ", but assuming AAC LC.");
                iH = 2;
            }
            this.f5126b.r(5);
            byte[] bArrA = v8.a.a(iH, this.f5140p, this.f5126b.h(3));
            v8.a.b bVarE = v8.a.e(bArrA);
            u7.q qVarN = new u7.q.b().f0(this.f5131g).U(this.f5130f).u0("audio/mp4a-latm").S(bVarE.f27226c).R(bVarE.f27225b).v0(bVarE.f27224a).g0(Collections.singletonList(bArrA)).j0(this.f5128d).s0(this.f5129e).N();
            this.f5143s = 1024000000 / ((long) qVarN.F);
            this.f5132h.a(qVarN);
            this.f5142r = true;
        }
        this.f5126b.r(4);
        int iH2 = (this.f5126b.h(13) - 2) - 5;
        if (this.f5137m) {
            iH2 -= 2;
        }
        v(this.f5132h, this.f5143s, 0, iH2);
    }

    private void o() {
        this.f5133i.b(this.f5127c, 10);
        this.f5127c.W(6);
        v(this.f5133i, 0L, 10, this.f5127c.G() + 10);
    }

    private void p(x7.a0 a0Var) {
        int iMin = Math.min(a0Var.a(), this.f5144t - this.f5135k);
        this.f5146v.b(a0Var, iMin);
        int i10 = this.f5135k + iMin;
        this.f5135k = i10;
        if (i10 == this.f5144t) {
            x7.a.g(this.f5145u != -9223372036854775807L);
            this.f5146v.f(this.f5145u, 1, this.f5144t, 0, null);
            this.f5145u += this.f5147w;
            s();
        }
    }

    private void q() {
        this.f5138n = false;
        s();
    }

    private void r() {
        this.f5134j = 1;
        this.f5135k = 0;
    }

    private void s() {
        this.f5134j = 0;
        this.f5135k = 0;
        this.f5136l = UserVerificationMethods.USER_VERIFY_HANDPRINT;
    }

    private void t() {
        this.f5134j = 3;
        this.f5135k = 0;
    }

    private void u() {
        this.f5134j = 2;
        this.f5135k = f5124x.length;
        this.f5144t = 0;
        this.f5127c.W(0);
    }

    private void v(o0 o0Var, long j10, int i10, int i11) {
        this.f5134j = 4;
        this.f5135k = i10;
        this.f5146v = o0Var;
        this.f5147w = j10;
        this.f5144t = i11;
    }

    private boolean w(x7.a0 a0Var, byte[] bArr, int i10) {
        if (a0Var.a() < i10) {
            return false;
        }
        a0Var.l(bArr, 0, i10);
        return true;
    }

    @Override // ca.m
    public void b() {
        this.f5145u = -9223372036854775807L;
        q();
    }

    @Override // ca.m
    public void c(x7.a0 a0Var) throws ParserException {
        a();
        while (a0Var.a() > 0) {
            int i10 = this.f5134j;
            if (i10 == 0) {
                j(a0Var);
            } else if (i10 == 1) {
                g(a0Var);
            } else if (i10 != 2) {
                if (i10 == 3) {
                    if (i(a0Var, this.f5126b.f28202a, this.f5137m ? 7 : 5)) {
                        n();
                    }
                } else {
                    if (i10 != 4) {
                        throw new IllegalStateException();
                    }
                    p(a0Var);
                }
            } else if (i(a0Var, this.f5127c.e(), 10)) {
                o();
            }
        }
    }

    @Override // ca.m
    public void d(v8.r rVar, l0.d dVar) {
        dVar.a();
        this.f5131g = dVar.b();
        o0 o0VarE = rVar.e(dVar.c(), 1);
        this.f5132h = o0VarE;
        this.f5146v = o0VarE;
        if (!this.f5125a) {
            this.f5133i = new v8.m();
            return;
        }
        dVar.a();
        o0 o0VarE2 = rVar.e(dVar.c(), 5);
        this.f5133i = o0VarE2;
        o0VarE2.a(new u7.q.b().f0(dVar.b()).U(this.f5130f).u0("application/id3").N());
    }

    @Override // ca.m
    public void f(long j10, int i10) {
        this.f5145u = j10;
    }

    public long k() {
        return this.f5143s;
    }

    public i(boolean z10, String str, int i10, String str2) {
        this.f5126b = new x7.z(new byte[7]);
        this.f5127c = new x7.a0(Arrays.copyOf(f5124x, 10));
        this.f5139o = -1;
        this.f5140p = -1;
        this.f5143s = -9223372036854775807L;
        this.f5145u = -9223372036854775807L;
        this.f5125a = z10;
        this.f5128d = str;
        this.f5129e = i10;
        this.f5130f = str2;
        s();
    }

    @Override // ca.m
    public void e(boolean z10) {
    }
}
