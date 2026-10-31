package io.bidmachine.media3.extractor.flv;

import io.bidmachine.media3.extractor.flv.b;
import java.io.IOException;
import v8.e0;
import v8.i0;
import v8.j0;
import v8.p;
import v8.q;
import v8.r;
import v8.u;
import x7.a0;

/* JADX INFO: compiled from: FlvExtractor.java */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements p {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final u f20020q = new u() { // from class: b9.a
        @Override // v8.u
        public final p[] g() {
            return b.h();
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private r f20026f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f20028h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f20029i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f20030j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f20031k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f20032l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f20033m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f20034n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private a f20035o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private d f20036p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a0 f20021a = new a0(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a0 f20022b = new a0(9);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a0 f20023c = new a0(11);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a0 f20024d = new a0();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c f20025e = new c();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f20027g = 1;

    private void d() {
        if (this.f20034n) {
            return;
        }
        this.f20026f.h(new j0.b(-9223372036854775807L));
        this.f20034n = true;
    }

    private long g() {
        if (this.f20028h) {
            return this.f20029i + this.f20033m;
        }
        if (this.f20025e.d() == -9223372036854775807L) {
            return 0L;
        }
        return this.f20033m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ p[] h() {
        return new p[]{new b()};
    }

    private a0 j(q qVar) throws IOException {
        if (this.f20032l > this.f20024d.b()) {
            a0 a0Var = this.f20024d;
            a0Var.U(new byte[Math.max(a0Var.b() * 2, this.f20032l)], 0);
        } else {
            this.f20024d.W(0);
        }
        this.f20024d.V(this.f20032l);
        qVar.readFully(this.f20024d.e(), 0, this.f20032l);
        return this.f20024d;
    }

    private boolean k(q qVar) throws IOException {
        if (!qVar.e(this.f20022b.e(), 0, 9, true)) {
            return false;
        }
        this.f20022b.W(0);
        this.f20022b.X(4);
        int iH = this.f20022b.H();
        boolean z10 = (iH & 4) != 0;
        boolean z11 = (iH & 1) != 0;
        if (z10 && this.f20035o == null) {
            this.f20035o = new a(this.f20026f.e(8, 1));
        }
        if (z11 && this.f20036p == null) {
            this.f20036p = new d(this.f20026f.e(9, 2));
        }
        this.f20026f.r();
        this.f20030j = (this.f20022b.q() - 9) + 4;
        this.f20027g = 2;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0087  */
    /* JADX WARN: Code duplicated, block: B:27:0x008b  */
    private boolean m(q qVar) throws IOException {
        boolean zA;
        boolean z10;
        long j10;
        long jG = g();
        int i10 = this.f20031k;
        if (i10 == 8 && this.f20035o != null) {
            d();
            zA = this.f20035o.a(j(qVar), jG);
        } else {
            if (i10 != 9 || this.f20036p == null) {
                if (i10 != 18 || this.f20034n) {
                    qVar.k(this.f20032l);
                    zA = false;
                    z10 = false;
                } else {
                    zA = this.f20025e.a(j(qVar), jG);
                    long jD = this.f20025e.d();
                    if (jD != -9223372036854775807L) {
                        this.f20026f.h(new e0(this.f20025e.e(), this.f20025e.f(), jD));
                        this.f20034n = true;
                    }
                }
                if (!this.f20028h && zA) {
                    this.f20028h = true;
                    if (this.f20025e.d() == -9223372036854775807L) {
                        j10 = -this.f20033m;
                    } else {
                        j10 = 0;
                    }
                    this.f20029i = j10;
                }
                this.f20030j = 4;
                this.f20027g = 2;
                return z10;
            }
            d();
            zA = this.f20036p.a(j(qVar), jG);
        }
        z10 = true;
        if (!this.f20028h) {
            this.f20028h = true;
            if (this.f20025e.d() == -9223372036854775807L) {
                j10 = -this.f20033m;
            } else {
                j10 = 0;
            }
            this.f20029i = j10;
        }
        this.f20030j = 4;
        this.f20027g = 2;
        return z10;
    }

    private boolean n(q qVar) throws IOException {
        if (!qVar.e(this.f20023c.e(), 0, 11, true)) {
            return false;
        }
        this.f20023c.W(0);
        this.f20031k = this.f20023c.H();
        this.f20032l = this.f20023c.K();
        this.f20033m = this.f20023c.K();
        this.f20033m = (((long) (this.f20023c.H() << 24)) | this.f20033m) * 1000;
        this.f20023c.X(3);
        this.f20027g = 4;
        return true;
    }

    private void o(q qVar) throws IOException {
        qVar.k(this.f20030j);
        this.f20030j = 0;
        this.f20027g = 3;
    }

    @Override // v8.p
    public void a(long j10, long j11) {
        if (j10 == 0) {
            this.f20027g = 1;
            this.f20028h = false;
        } else {
            this.f20027g = 3;
        }
        this.f20030j = 0;
    }

    @Override // v8.p
    public void c(r rVar) {
        this.f20026f = rVar;
    }

    @Override // v8.p
    public boolean e(q qVar) throws IOException {
        qVar.n(this.f20021a.e(), 0, 3);
        this.f20021a.W(0);
        if (this.f20021a.K() != 4607062) {
            return false;
        }
        qVar.n(this.f20021a.e(), 0, 2);
        this.f20021a.W(0);
        if ((this.f20021a.P() & 250) != 0) {
            return false;
        }
        qVar.n(this.f20021a.e(), 0, 4);
        this.f20021a.W(0);
        int iQ = this.f20021a.q();
        qVar.d();
        qVar.g(iQ);
        qVar.n(this.f20021a.e(), 0, 4);
        this.f20021a.W(0);
        return this.f20021a.q() == 0;
    }

    @Override // v8.p
    public int l(q qVar, i0 i0Var) throws IOException {
        x7.a.i(this.f20026f);
        while (true) {
            int i10 = this.f20027g;
            if (i10 != 1) {
                if (i10 == 2) {
                    o(qVar);
                } else if (i10 != 3) {
                    if (i10 != 4) {
                        throw new IllegalStateException();
                    }
                    if (m(qVar)) {
                        return 0;
                    }
                } else if (!n(qVar)) {
                    return -1;
                }
            } else if (!k(qVar)) {
                return -1;
            }
        }
    }

    @Override // v8.p
    public void release() {
    }
}
