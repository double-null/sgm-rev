package a9;

import java.io.IOException;
import v8.i0;
import v8.j0;
import v8.o0;
import v8.p;
import v8.q;
import v8.r;
import v8.u;
import v8.v;
import v8.w;
import v8.x;
import v8.y;
import x7.a0;
import x7.l0;

/* JADX INFO: compiled from: FlacExtractor.java */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements p {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final u f175o = new u() { // from class: a9.c
        @Override // v8.u
        public final p[] g() {
            return d.k();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a0 f177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final v.a f179d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private r f180e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private o0 f181f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f182g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private u7.v f183h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private y f184i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f185j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f186k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private b f187l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f188m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f189n;

    public d() {
        this(0);
    }

    private long d(a0 a0Var, boolean z10) {
        boolean zD;
        x7.a.e(this.f184i);
        int iF = a0Var.f();
        while (iF <= a0Var.g() - 16) {
            a0Var.W(iF);
            if (v.d(a0Var, this.f184i, this.f186k, this.f179d)) {
                a0Var.W(iF);
                return this.f179d.f27436a;
            }
            iF++;
        }
        if (!z10) {
            a0Var.W(iF);
            return -1L;
        }
        while (iF <= a0Var.g() - this.f185j) {
            a0Var.W(iF);
            try {
                zD = v.d(a0Var, this.f184i, this.f186k, this.f179d);
            } catch (IndexOutOfBoundsException unused) {
                zD = false;
            }
            if (a0Var.f() <= a0Var.g() ? zD : false) {
                a0Var.W(iF);
                return this.f179d.f27436a;
            }
            iF++;
        }
        a0Var.W(a0Var.g());
        return -1L;
    }

    private void g(q qVar) throws IOException {
        this.f186k = w.b(qVar);
        ((r) l0.i(this.f180e)).h(h(qVar.getPosition(), qVar.getLength()));
        this.f182g = 5;
    }

    private j0 h(long j10, long j11) {
        x7.a.e(this.f184i);
        y yVar = this.f184i;
        if (yVar.f27450k != null) {
            return new x(yVar, j10);
        }
        if (j11 == -1 || yVar.f27449j <= 0) {
            return new j0.b(yVar.f());
        }
        b bVar = new b(yVar, this.f186k, j10, j11);
        this.f187l = bVar;
        return bVar.b();
    }

    private void j(q qVar) throws IOException {
        byte[] bArr = this.f176a;
        qVar.n(bArr, 0, bArr.length);
        qVar.d();
        this.f182g = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ p[] k() {
        return new p[]{new d()};
    }

    private void m() {
        ((o0) l0.i(this.f181f)).f((this.f189n * 1000000) / ((long) ((y) l0.i(this.f184i)).f27444e), 1, this.f188m, 0, null);
    }

    private int n(q qVar, i0 i0Var) throws IOException {
        boolean z10;
        x7.a.e(this.f181f);
        x7.a.e(this.f184i);
        b bVar = this.f187l;
        if (bVar != null && bVar.d()) {
            return this.f187l.c(qVar, i0Var);
        }
        if (this.f189n == -1) {
            this.f189n = v.i(qVar, this.f184i);
            return 0;
        }
        int iG = this.f177b.g();
        if (iG < 32768) {
            int i10 = qVar.read(this.f177b.e(), iG, 32768 - iG);
            z10 = i10 == -1;
            if (!z10) {
                this.f177b.V(iG + i10);
            } else if (this.f177b.a() == 0) {
                m();
                return -1;
            }
        } else {
            z10 = false;
        }
        int iF = this.f177b.f();
        int i11 = this.f188m;
        int i12 = this.f185j;
        if (i11 < i12) {
            a0 a0Var = this.f177b;
            a0Var.X(Math.min(i12 - i11, a0Var.a()));
        }
        long jD = d(this.f177b, z10);
        int iF2 = this.f177b.f() - iF;
        this.f177b.W(iF);
        this.f181f.b(this.f177b, iF2);
        this.f188m += iF2;
        if (jD != -1) {
            m();
            this.f188m = 0;
            this.f189n = jD;
        }
        int length = this.f177b.e().length - this.f177b.g();
        if (this.f177b.a() < 16 && length < 16) {
            int iA = this.f177b.a();
            System.arraycopy(this.f177b.e(), this.f177b.f(), this.f177b.e(), 0, iA);
            this.f177b.W(0);
            this.f177b.V(iA);
        }
        return 0;
    }

    private void o(q qVar) throws IOException {
        this.f183h = w.d(qVar, !this.f178c);
        this.f182g = 1;
    }

    private void p(q qVar) throws IOException {
        w.a aVar = new w.a(this.f184i);
        boolean zE = false;
        while (!zE) {
            zE = w.e(qVar, aVar);
            this.f184i = (y) l0.i(aVar.f27437a);
        }
        x7.a.e(this.f184i);
        this.f185j = Math.max(this.f184i.f27442c, 6);
        ((o0) l0.i(this.f181f)).a(this.f184i.g(this.f176a, this.f183h).b().U("audio/flac").N());
        ((o0) l0.i(this.f181f)).g(this.f184i.f());
        this.f182g = 4;
    }

    private void q(q qVar) throws IOException {
        w.i(qVar);
        this.f182g = 3;
    }

    @Override // v8.p
    public void a(long j10, long j11) {
        if (j10 == 0) {
            this.f182g = 0;
        } else {
            b bVar = this.f187l;
            if (bVar != null) {
                bVar.h(j11);
            }
        }
        this.f189n = j11 != 0 ? -1L : 0L;
        this.f188m = 0;
        this.f177b.S(0);
    }

    @Override // v8.p
    public void c(r rVar) {
        this.f180e = rVar;
        this.f181f = rVar.e(0, 1);
        rVar.r();
    }

    @Override // v8.p
    public boolean e(q qVar) throws IOException {
        w.c(qVar, false);
        return w.a(qVar);
    }

    @Override // v8.p
    public int l(q qVar, i0 i0Var) throws IOException {
        int i10 = this.f182g;
        if (i10 == 0) {
            o(qVar);
            return 0;
        }
        if (i10 == 1) {
            j(qVar);
            return 0;
        }
        if (i10 == 2) {
            q(qVar);
            return 0;
        }
        if (i10 == 3) {
            p(qVar);
            return 0;
        }
        if (i10 == 4) {
            g(qVar);
            return 0;
        }
        if (i10 == 5) {
            return n(qVar, i0Var);
        }
        throw new IllegalStateException();
    }

    public d(int i10) {
        this.f176a = new byte[42];
        this.f177b = new a0(new byte[32768], 0);
        this.f178c = (i10 & 1) != 0;
        this.f179d = new v.a();
        this.f182g = 0;
    }

    @Override // v8.p
    public void release() {
    }
}
