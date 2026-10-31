package ca;

import io.bidmachine.media3.common.ParserException;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: compiled from: AdtsExtractor.java */
/* JADX INFO: loaded from: classes4.dex */
public final class h implements v8.p {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final v8.u f5107m = new v8.u() { // from class: ca.g
        @Override // v8.u
        public final v8.p[] g() {
            return h.j();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f5108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f5109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x7.a0 f5110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final x7.a0 f5111d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final x7.z f5112e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private v8.r f5113f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f5114g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f5115h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f5116i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f5117j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f5118k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f5119l;

    public h() {
        this(0);
    }

    private void d(v8.q qVar) throws IOException {
        if (this.f5117j) {
            return;
        }
        this.f5116i = -1;
        qVar.d();
        long j10 = 0;
        if (qVar.getPosition() == 0) {
            m(qVar);
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            try {
                if (qVar.b(this.f5111d.e(), 0, 2, true)) {
                    this.f5111d.W(0);
                    if (!i.m(this.f5111d.P())) {
                        break;
                    }
                    if (qVar.b(this.f5111d.e(), 0, 4, true)) {
                        this.f5112e.p(14);
                        int iH = this.f5112e.h(13);
                        if (iH <= 6) {
                            this.f5117j = true;
                            throw ParserException.b("Malformed ADTS stream", null);
                        }
                        j10 += (long) iH;
                        i11++;
                        if (i11 != 1000 && qVar.l(iH - 6, true)) {
                        }
                    }
                }
            } catch (EOFException unused) {
            }
            i10 = i11;
            break;
        }
        qVar.d();
        if (i10 > 0) {
            this.f5116i = (int) (j10 / ((long) i10));
        } else {
            this.f5116i = -1;
        }
        this.f5117j = true;
    }

    private static int g(int i10, long j10) {
        return (int) (((((long) i10) * 8) * 1000000) / j10);
    }

    private v8.j0 h(long j10, boolean z10) {
        return new v8.h(j10, this.f5115h, g(this.f5116i, this.f5109b.k()), this.f5116i, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ v8.p[] j() {
        return new v8.p[]{new h()};
    }

    private void k(long j10, boolean z10) {
        if (this.f5119l) {
            return;
        }
        boolean z11 = (this.f5108a & 1) != 0 && this.f5116i > 0;
        if (z11 && this.f5109b.k() == -9223372036854775807L && !z10) {
            return;
        }
        if (!z11 || this.f5109b.k() == -9223372036854775807L) {
            this.f5113f.h(new v8.j0.b(-9223372036854775807L));
        } else {
            this.f5113f.h(h(j10, (this.f5108a & 2) != 0));
        }
        this.f5119l = true;
    }

    private int m(v8.q qVar) throws IOException {
        int i10 = 0;
        while (true) {
            qVar.n(this.f5111d.e(), 0, 10);
            this.f5111d.W(0);
            if (this.f5111d.K() != 4801587) {
                break;
            }
            this.f5111d.X(3);
            int iG = this.f5111d.G();
            i10 += iG + 10;
            qVar.g(iG);
        }
        qVar.d();
        qVar.g(i10);
        if (this.f5115h == -1) {
            this.f5115h = i10;
        }
        return i10;
    }

    @Override // v8.p
    public void a(long j10, long j11) {
        this.f5118k = false;
        this.f5109b.b();
        this.f5114g = j11;
    }

    @Override // v8.p
    public void c(v8.r rVar) {
        this.f5113f = rVar;
        this.f5109b.d(rVar, new l0.d(0, 1));
        rVar.r();
    }

    @Override // v8.p
    public boolean e(v8.q qVar) throws IOException {
        int iM = m(qVar);
        int i10 = iM;
        int i11 = 0;
        int i12 = 0;
        do {
            qVar.n(this.f5111d.e(), 0, 2);
            this.f5111d.W(0);
            if (i.m(this.f5111d.P())) {
                i11++;
                if (i11 >= 4 && i12 > 188) {
                    return true;
                }
                qVar.n(this.f5111d.e(), 0, 4);
                this.f5112e.p(14);
                int iH = this.f5112e.h(13);
                if (iH <= 6) {
                    i10++;
                    qVar.d();
                    qVar.g(i10);
                } else {
                    qVar.g(iH - 6);
                    i12 += iH;
                }
            } else {
                i10++;
                qVar.d();
                qVar.g(i10);
            }
            i11 = 0;
            i12 = 0;
        } while (i10 - iM < 8192);
        return false;
    }

    @Override // v8.p
    public int l(v8.q qVar, v8.i0 i0Var) throws IOException {
        x7.a.i(this.f5113f);
        long length = qVar.getLength();
        int i10 = this.f5108a;
        if (((i10 & 2) == 0 && ((i10 & 1) == 0 || length == -1)) ? false : true) {
            d(qVar);
        }
        int i11 = qVar.read(this.f5110c.e(), 0, 2048);
        boolean z10 = i11 == -1;
        k(length, z10);
        if (z10) {
            return -1;
        }
        this.f5110c.W(0);
        this.f5110c.V(i11);
        if (!this.f5118k) {
            this.f5109b.f(this.f5114g, 4);
            this.f5118k = true;
        }
        this.f5109b.c(this.f5110c);
        return 0;
    }

    public h(int i10) {
        this.f5108a = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f5109b = new i(true, "audio/mp4a-latm");
        this.f5110c = new x7.a0(2048);
        this.f5116i = -1;
        this.f5115h = -1L;
        x7.a0 a0Var = new x7.a0(10);
        this.f5111d = a0Var;
        this.f5112e = new x7.z(a0Var.e());
    }

    @Override // v8.p
    public void release() {
    }
}
