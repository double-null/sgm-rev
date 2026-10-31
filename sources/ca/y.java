package ca;

import io.bidmachine.media3.common.ParserException;

/* JADX INFO: compiled from: PesReader.java */
/* JADX INFO: loaded from: classes4.dex */
public final class y implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m f5438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x7.z f5439b = new x7.z(new byte[10]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f5440c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f5441d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private x7.g0 f5442e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f5443f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f5444g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f5445h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f5446i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f5447j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f5448k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f5449l;

    public y(m mVar) {
        this.f5438a = mVar;
    }

    private boolean e(x7.a0 a0Var, byte[] bArr, int i10) {
        int iMin = Math.min(a0Var.a(), i10 - this.f5441d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            a0Var.X(iMin);
        } else {
            a0Var.l(bArr, this.f5441d, iMin);
        }
        int i11 = this.f5441d + iMin;
        this.f5441d = i11;
        return i11 == i10;
    }

    private boolean f() {
        this.f5439b.p(0);
        int iH = this.f5439b.h(24);
        if (iH != 1) {
            x7.r.h("PesReader", "Unexpected start code prefix: " + iH);
            this.f5447j = -1;
            return false;
        }
        this.f5439b.r(8);
        int iH2 = this.f5439b.h(16);
        this.f5439b.r(5);
        this.f5448k = this.f5439b.g();
        this.f5439b.r(2);
        this.f5443f = this.f5439b.g();
        this.f5444g = this.f5439b.g();
        this.f5439b.r(6);
        int iH3 = this.f5439b.h(8);
        this.f5446i = iH3;
        if (iH2 == 0) {
            this.f5447j = -1;
        } else {
            int i10 = ((iH2 + 6) - 9) - iH3;
            this.f5447j = i10;
            if (i10 < 0) {
                x7.r.h("PesReader", "Found negative packet payload size: " + this.f5447j);
                this.f5447j = -1;
            }
        }
        return true;
    }

    private void g() {
        this.f5439b.p(0);
        this.f5449l = -9223372036854775807L;
        if (this.f5443f) {
            this.f5439b.r(4);
            long jH = ((long) this.f5439b.h(3)) << 30;
            this.f5439b.r(1);
            long jH2 = jH | ((long) (this.f5439b.h(15) << 15));
            this.f5439b.r(1);
            long jH3 = jH2 | ((long) this.f5439b.h(15));
            this.f5439b.r(1);
            if (!this.f5445h && this.f5444g) {
                this.f5439b.r(4);
                long jH4 = ((long) this.f5439b.h(3)) << 30;
                this.f5439b.r(1);
                long jH5 = jH4 | ((long) (this.f5439b.h(15) << 15));
                this.f5439b.r(1);
                long jH6 = jH5 | ((long) this.f5439b.h(15));
                this.f5439b.r(1);
                this.f5442e.b(jH6);
                this.f5445h = true;
            }
            this.f5449l = this.f5442e.b(jH3);
        }
    }

    private void h(int i10) {
        this.f5440c = i10;
        this.f5441d = 0;
    }

    @Override // ca.l0
    public void a(x7.g0 g0Var, v8.r rVar, l0.d dVar) {
        this.f5442e = g0Var;
        this.f5438a.d(rVar, dVar);
    }

    @Override // ca.l0
    public void b() {
        this.f5440c = 0;
        this.f5441d = 0;
        this.f5445h = false;
        this.f5438a.b();
    }

    @Override // ca.l0
    public void c(x7.a0 a0Var, int i10) throws ParserException {
        x7.a.i(this.f5442e);
        if ((i10 & 1) != 0) {
            int i11 = this.f5440c;
            if (i11 != 0 && i11 != 1) {
                if (i11 == 2) {
                    x7.r.h("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i11 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.f5447j != -1) {
                        x7.r.h("PesReader", "Unexpected start indicator: expected " + this.f5447j + " more bytes");
                    }
                    this.f5438a.e(a0Var.g() == 0);
                }
            }
            h(1);
        }
        while (a0Var.a() > 0) {
            int i12 = this.f5440c;
            if (i12 == 0) {
                a0Var.X(a0Var.a());
            } else if (i12 != 1) {
                if (i12 == 2) {
                    if (e(a0Var, this.f5439b.f28202a, Math.min(10, this.f5446i)) && e(a0Var, null, this.f5446i)) {
                        g();
                        i10 |= this.f5448k ? 4 : 0;
                        this.f5438a.f(this.f5449l, i10);
                        h(3);
                    }
                } else {
                    if (i12 != 3) {
                        throw new IllegalStateException();
                    }
                    int iA = a0Var.a();
                    int i13 = this.f5447j;
                    int i14 = i13 == -1 ? 0 : iA - i13;
                    if (i14 > 0) {
                        iA -= i14;
                        a0Var.V(a0Var.f() + iA);
                    }
                    this.f5438a.c(a0Var);
                    int i15 = this.f5447j;
                    if (i15 != -1) {
                        int i16 = i15 - iA;
                        this.f5447j = i16;
                        if (i16 == 0) {
                            this.f5438a.e(false);
                            h(1);
                        }
                    }
                }
            } else if (e(a0Var, this.f5439b.f28202a, 9)) {
                h(f() ? 2 : 0);
            }
        }
    }

    public boolean d(boolean z10) {
        boolean z11 = !z10 || f();
        if (this.f5440c == 3 && this.f5447j == -1) {
            return !(z10 && (this.f5438a instanceof n)) && z11;
        }
        return false;
    }
}
