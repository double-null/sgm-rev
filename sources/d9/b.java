package d9;

import java.io.IOException;
import p9.n;
import u7.v;
import v8.i0;
import v8.j0;
import v8.p;
import v8.q;
import v8.r;
import x7.a0;

/* JADX INFO: compiled from: JpegMotionPhotoExtractor.java */
/* JADX INFO: loaded from: classes4.dex */
final class b implements p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private r f13418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f13419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f13420d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f13421e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private k9.a f13423g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private q f13424h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private d f13425i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private n f13426j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a0 f13417a = new a0(6);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f13422f = -1;

    private void b(q qVar) throws IOException {
        this.f13417a.S(2);
        qVar.n(this.f13417a.e(), 0, 2);
        qVar.g(this.f13417a.P() - 2);
    }

    private void d() {
        ((r) x7.a.e(this.f13418b)).r();
        this.f13418b.h(new j0.b(-9223372036854775807L));
        this.f13419c = 6;
    }

    private static k9.a g(String str, long j10) throws IOException {
        c cVarA;
        if (j10 == -1 || (cVarA = f.a(str)) == null) {
            return null;
        }
        return cVarA.a(j10);
    }

    private void h(k9.a aVar) {
        ((r) x7.a.e(this.f13418b)).e(1024, 4).a(new u7.q.b().U("image/jpeg").n0(new v(aVar)).N());
    }

    private int j(q qVar) throws IOException {
        this.f13417a.S(2);
        qVar.n(this.f13417a.e(), 0, 2);
        return this.f13417a.P();
    }

    private void k(q qVar) throws IOException {
        this.f13417a.S(2);
        qVar.readFully(this.f13417a.e(), 0, 2);
        int iP = this.f13417a.P();
        this.f13420d = iP;
        if (iP == 65498) {
            if (this.f13422f != -1) {
                this.f13419c = 4;
                return;
            } else {
                d();
                return;
            }
        }
        if ((iP < 65488 || iP > 65497) && iP != 65281) {
            this.f13419c = 1;
        }
    }

    private void m(q qVar) throws IOException {
        String strB;
        if (this.f13420d == 65505) {
            a0 a0Var = new a0(this.f13421e);
            qVar.readFully(a0Var.e(), 0, this.f13421e);
            if (this.f13423g == null && "http://ns.adobe.com/xap/1.0/".equals(a0Var.B()) && (strB = a0Var.B()) != null) {
                k9.a aVarG = g(strB, qVar.getLength());
                this.f13423g = aVarG;
                if (aVarG != null) {
                    this.f13422f = aVarG.f21269d;
                }
            }
        } else {
            qVar.k(this.f13421e);
        }
        this.f13419c = 0;
    }

    private void n(q qVar) throws IOException {
        this.f13417a.S(2);
        qVar.readFully(this.f13417a.e(), 0, 2);
        this.f13421e = this.f13417a.P() - 2;
        this.f13419c = 2;
    }

    private void o(q qVar) throws IOException {
        if (!qVar.b(this.f13417a.e(), 0, 1, true)) {
            d();
            return;
        }
        qVar.d();
        if (this.f13426j == null) {
            this.f13426j = new n(s9.r.a.f25343a, 8);
        }
        d dVar = new d(qVar, this.f13422f);
        this.f13425i = dVar;
        if (!this.f13426j.e(dVar)) {
            d();
        } else {
            this.f13426j.c(new e(this.f13422f, (r) x7.a.e(this.f13418b)));
            p();
        }
    }

    private void p() {
        h((k9.a) x7.a.e(this.f13423g));
        this.f13419c = 5;
    }

    @Override // v8.p
    public void a(long j10, long j11) {
        if (j10 == 0) {
            this.f13419c = 0;
            this.f13426j = null;
        } else if (this.f13419c == 5) {
            ((n) x7.a.e(this.f13426j)).a(j10, j11);
        }
    }

    @Override // v8.p
    public void c(r rVar) {
        this.f13418b = rVar;
    }

    @Override // v8.p
    public boolean e(q qVar) throws IOException {
        if (j(qVar) != 65496) {
            return false;
        }
        int iJ = j(qVar);
        this.f13420d = iJ;
        if (iJ == 65504) {
            b(qVar);
            this.f13420d = j(qVar);
        }
        if (this.f13420d != 65505) {
            return false;
        }
        qVar.g(2);
        this.f13417a.S(6);
        qVar.n(this.f13417a.e(), 0, 6);
        return this.f13417a.J() == 1165519206 && this.f13417a.P() == 0;
    }

    @Override // v8.p
    public int l(q qVar, i0 i0Var) throws IOException {
        int i10 = this.f13419c;
        if (i10 == 0) {
            k(qVar);
            return 0;
        }
        if (i10 == 1) {
            n(qVar);
            return 0;
        }
        if (i10 == 2) {
            m(qVar);
            return 0;
        }
        if (i10 == 4) {
            long position = qVar.getPosition();
            long j10 = this.f13422f;
            if (position != j10) {
                i0Var.f27344a = j10;
                return 1;
            }
            o(qVar);
            return 0;
        }
        if (i10 != 5) {
            if (i10 == 6) {
                return -1;
            }
            throw new IllegalStateException();
        }
        if (this.f13425i == null || qVar != this.f13424h) {
            this.f13424h = qVar;
            this.f13425i = new d(qVar, this.f13422f);
        }
        int iL = ((n) x7.a.e(this.f13426j)).l(this.f13425i, i0Var);
        if (iL == 1) {
            i0Var.f27344a += this.f13422f;
        }
        return iL;
    }

    @Override // v8.p
    public void release() {
        n nVar = this.f13426j;
        if (nVar != null) {
            nVar.release();
        }
    }
}
