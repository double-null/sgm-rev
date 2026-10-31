package ca;

import com.vungle.ads.internal.protos.Sdk;
import io.bidmachine.media3.common.ParserException;
import java.util.Collections;
import v8.o0;

/* JADX INFO: compiled from: LatmReader.java */
/* JADX INFO: loaded from: classes4.dex */
public final class s implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f5364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f5365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f5366c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final x7.a0 f5367d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final x7.z f5368e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private o0 f5369f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f5370g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private u7.q f5371h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f5372i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f5373j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f5374k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f5375l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f5376m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f5377n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f5378o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f5379p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f5380q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f5381r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f5382s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f5383t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f5384u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f5385v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f5386w;

    public s(String str, int i10, String str2) {
        this.f5364a = str;
        this.f5365b = i10;
        this.f5366c = str2;
        x7.a0 a0Var = new x7.a0(1024);
        this.f5367d = a0Var;
        this.f5368e = new x7.z(a0Var.e());
        this.f5376m = -9223372036854775807L;
    }

    private static long a(x7.z zVar) {
        return zVar.h((zVar.h(2) + 1) * 8);
    }

    private void g(x7.z zVar) throws ParserException {
        if (!zVar.g()) {
            this.f5377n = true;
            l(zVar);
        } else if (!this.f5377n) {
            return;
        }
        if (this.f5378o != 0) {
            throw ParserException.b(null, null);
        }
        if (this.f5379p != 0) {
            throw ParserException.b(null, null);
        }
        k(zVar, j(zVar));
        if (this.f5381r) {
            zVar.r((int) this.f5382s);
        }
    }

    private int h(x7.z zVar) throws ParserException {
        int iB = zVar.b();
        v8.a.b bVarD = v8.a.d(zVar, true);
        this.f5386w = bVarD.f27226c;
        this.f5383t = bVarD.f27224a;
        this.f5385v = bVarD.f27225b;
        return iB - zVar.b();
    }

    private void i(x7.z zVar) {
        int iH = zVar.h(3);
        this.f5380q = iH;
        if (iH == 0) {
            zVar.r(8);
            return;
        }
        if (iH == 1) {
            zVar.r(9);
            return;
        }
        if (iH == 3 || iH == 4 || iH == 5) {
            zVar.r(6);
        } else {
            if (iH != 6 && iH != 7) {
                throw new IllegalStateException();
            }
            zVar.r(1);
        }
    }

    private int j(x7.z zVar) throws ParserException {
        int iH;
        if (this.f5380q != 0) {
            throw ParserException.b(null, null);
        }
        int i10 = 0;
        do {
            iH = zVar.h(8);
            i10 += iH;
        } while (iH == 255);
        return i10;
    }

    private void k(x7.z zVar, int i10) {
        int iE = zVar.e();
        if ((iE & 7) == 0) {
            this.f5367d.W(iE >> 3);
        } else {
            zVar.i(this.f5367d.e(), 0, i10 * 8);
            this.f5367d.W(0);
        }
        this.f5369f.b(this.f5367d, i10);
        x7.a.g(this.f5376m != -9223372036854775807L);
        this.f5369f.f(this.f5376m, 1, i10, 0, null);
        this.f5376m += this.f5384u;
    }

    private void l(x7.z zVar) throws ParserException {
        boolean zG;
        int iH = zVar.h(1);
        int iH2 = iH == 1 ? zVar.h(1) : 0;
        this.f5378o = iH2;
        if (iH2 != 0) {
            throw ParserException.b(null, null);
        }
        if (iH == 1) {
            a(zVar);
        }
        if (!zVar.g()) {
            throw ParserException.b(null, null);
        }
        this.f5379p = zVar.h(6);
        int iH3 = zVar.h(4);
        int iH4 = zVar.h(3);
        if (iH3 != 0 || iH4 != 0) {
            throw ParserException.b(null, null);
        }
        if (iH == 0) {
            int iE = zVar.e();
            int iH5 = h(zVar);
            zVar.p(iE);
            byte[] bArr = new byte[(iH5 + 7) / 8];
            zVar.i(bArr, 0, iH5);
            u7.q qVarN = new u7.q.b().f0(this.f5370g).U(this.f5366c).u0("audio/mp4a-latm").S(this.f5386w).R(this.f5385v).v0(this.f5383t).g0(Collections.singletonList(bArr)).j0(this.f5364a).s0(this.f5365b).N();
            if (!qVarN.equals(this.f5371h)) {
                this.f5371h = qVarN;
                this.f5384u = 1024000000 / ((long) qVarN.F);
                this.f5369f.a(qVarN);
            }
        } else {
            zVar.r(((int) a(zVar)) - h(zVar));
        }
        i(zVar);
        boolean zG2 = zVar.g();
        this.f5381r = zG2;
        this.f5382s = 0L;
        if (zG2) {
            if (iH == 1) {
                this.f5382s = a(zVar);
            } else {
                do {
                    zG = zVar.g();
                    this.f5382s = (this.f5382s << 8) + ((long) zVar.h(8));
                } while (zG);
            }
        }
        if (zVar.g()) {
            zVar.r(8);
        }
    }

    private void m(int i10) {
        this.f5367d.S(i10);
        this.f5368e.n(this.f5367d.e());
    }

    @Override // ca.m
    public void b() {
        this.f5372i = 0;
        this.f5376m = -9223372036854775807L;
        this.f5377n = false;
    }

    @Override // ca.m
    public void c(x7.a0 a0Var) throws ParserException {
        x7.a.i(this.f5369f);
        while (a0Var.a() > 0) {
            int i10 = this.f5372i;
            if (i10 != 0) {
                if (i10 == 1) {
                    int iH = a0Var.H();
                    if ((iH & Sdk.SDKError.Reason.AD_LOAD_FAIL_EMPTY_BID_PAYLOAD_VALUE) == 224) {
                        this.f5375l = iH;
                        this.f5372i = 2;
                    } else if (iH != 86) {
                        this.f5372i = 0;
                    }
                } else if (i10 == 2) {
                    int iH2 = ((this.f5375l & (-225)) << 8) | a0Var.H();
                    this.f5374k = iH2;
                    if (iH2 > this.f5367d.e().length) {
                        m(this.f5374k);
                    }
                    this.f5373j = 0;
                    this.f5372i = 3;
                } else {
                    if (i10 != 3) {
                        throw new IllegalStateException();
                    }
                    int iMin = Math.min(a0Var.a(), this.f5374k - this.f5373j);
                    a0Var.l(this.f5368e.f28202a, this.f5373j, iMin);
                    int i11 = this.f5373j + iMin;
                    this.f5373j = i11;
                    if (i11 == this.f5374k) {
                        this.f5368e.p(0);
                        g(this.f5368e);
                        this.f5372i = 0;
                    }
                }
            } else if (a0Var.H() == 86) {
                this.f5372i = 1;
            }
        }
    }

    @Override // ca.m
    public void d(v8.r rVar, l0.d dVar) {
        dVar.a();
        this.f5369f = rVar.e(dVar.c(), 1);
        this.f5370g = dVar.b();
    }

    @Override // ca.m
    public void f(long j10, int i10) {
        this.f5376m = j10;
    }

    @Override // ca.m
    public void e(boolean z10) {
    }
}
