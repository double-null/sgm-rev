package io.bidmachine.media3.exoplayer.source;

import io.bidmachine.media3.decoder.DecoderInputBuffer;
import io.bidmachine.media3.exoplayer.k1;
import java.io.IOException;

/* JADX INFO: compiled from: ClippingMediaPeriod.java */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements q, q.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f19427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private q.a f19428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a[] f19429c = new a[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f19430d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    long f19431e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    long f19432f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ClippingMediaSource.IllegalClippingException f19433g;

    /* JADX INFO: compiled from: ClippingMediaPeriod.java */
    private final class a implements n8.s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n8.s f19434a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f19435b;

        public a(n8.s sVar) {
            this.f19434a = sVar;
        }

        @Override // n8.s
        public void a() throws IOException {
            this.f19434a.a();
        }

        public void b() {
            this.f19435b = false;
        }

        @Override // n8.s
        public int e(b8.u uVar, DecoderInputBuffer decoderInputBuffer, int i10) {
            if (b.this.o()) {
                return -3;
            }
            if (this.f19435b) {
                decoderInputBuffer.o(4);
                return -4;
            }
            long jF = b.this.f();
            int iE = this.f19434a.e(uVar, decoderInputBuffer, i10);
            if (iE == -5) {
                u7.q qVar = (u7.q) x7.a.e(uVar.f4168b);
                int i11 = qVar.H;
                if (i11 != 0 || qVar.I != 0) {
                    b bVar = b.this;
                    if (bVar.f19431e != 0) {
                        i11 = 0;
                    }
                    uVar.f4168b = qVar.b().Z(i11).a0(bVar.f19432f == Long.MIN_VALUE ? qVar.I : 0).N();
                }
                return -5;
            }
            long j10 = b.this.f19432f;
            if (j10 == Long.MIN_VALUE || ((iE != -4 || decoderInputBuffer.f18059f < j10) && !(iE == -3 && jF == Long.MIN_VALUE && !decoderInputBuffer.f18058e))) {
                return iE;
            }
            decoderInputBuffer.g();
            decoderInputBuffer.o(4);
            this.f19435b = true;
            return -4;
        }

        @Override // n8.s
        public boolean h() {
            return !b.this.o() && this.f19434a.h();
        }

        @Override // n8.s
        public int r(long j10) {
            if (b.this.o()) {
                return -3;
            }
            return this.f19434a.r(j10);
        }
    }

    public b(q qVar, boolean z10, long j10, long j11) {
        this.f19427a = qVar;
        this.f19430d = z10 ? j10 : -9223372036854775807L;
        this.f19431e = j10;
        this.f19432f = j11;
    }

    private b8.a0 a(long j10, b8.a0 a0Var) {
        long jQ = x7.l0.q(a0Var.f4126a, 0L, j10 - this.f19431e);
        long j11 = a0Var.f4127b;
        long j12 = this.f19432f;
        long jQ2 = x7.l0.q(j11, 0L, j12 == Long.MIN_VALUE ? Long.MAX_VALUE : j12 - j10);
        return (jQ == a0Var.f4126a && jQ2 == a0Var.f4127b) ? a0Var : new b8.a0(jQ, jQ2);
    }

    private static long n(long j10, long j11, long j12) {
        long jMax = Math.max(j10, j11);
        return j12 != Long.MIN_VALUE ? Math.min(jMax, j12) : jMax;
    }

    private static boolean s(long j10, long j11, q8.q[] qVarArr) {
        if (j10 < j11) {
            return true;
        }
        if (j10 != 0) {
            for (q8.q qVar : qVarArr) {
                if (qVar != null) {
                    u7.q qVarS = qVar.s();
                    if (!u7.w.a(qVarS.f26252o, qVarS.f26248k)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // io.bidmachine.media3.exoplayer.source.q, io.bidmachine.media3.exoplayer.source.g0
    public long b() {
        long jB = this.f19427a.b();
        if (jB != Long.MIN_VALUE) {
            long j10 = this.f19432f;
            if (j10 == Long.MIN_VALUE || jB < j10) {
                return jB;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // io.bidmachine.media3.exoplayer.source.q, io.bidmachine.media3.exoplayer.source.g0
    public boolean c(k1 k1Var) {
        return this.f19427a.c(k1Var);
    }

    @Override // io.bidmachine.media3.exoplayer.source.q
    public long d(long j10, b8.a0 a0Var) {
        long j11 = this.f19431e;
        if (j10 == j11) {
            return j11;
        }
        return this.f19427a.d(j10, a(j10, a0Var));
    }

    @Override // io.bidmachine.media3.exoplayer.source.q.a
    public void e(q qVar) {
        if (this.f19433g != null) {
            return;
        }
        ((q.a) x7.a.e(this.f19428b)).e(this);
    }

    @Override // io.bidmachine.media3.exoplayer.source.q, io.bidmachine.media3.exoplayer.source.g0
    public long f() {
        long jF = this.f19427a.f();
        if (jF != Long.MIN_VALUE) {
            long j10 = this.f19432f;
            if (j10 == Long.MIN_VALUE || jF < j10) {
                return jF;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // io.bidmachine.media3.exoplayer.source.q, io.bidmachine.media3.exoplayer.source.g0
    public void g(long j10) {
        this.f19427a.g(j10);
    }

    @Override // io.bidmachine.media3.exoplayer.source.q
    public long i(q8.q[] qVarArr, boolean[] zArr, n8.s[] sVarArr, boolean[] zArr2, long j10) {
        this.f19429c = new a[sVarArr.length];
        n8.s[] sVarArr2 = new n8.s[sVarArr.length];
        int i10 = 0;
        while (true) {
            n8.s sVar = null;
            if (i10 >= sVarArr.length) {
                break;
            }
            a[] aVarArr = this.f19429c;
            a aVar = (a) sVarArr[i10];
            aVarArr[i10] = aVar;
            if (aVar != null) {
                sVar = aVar.f19434a;
            }
            sVarArr2[i10] = sVar;
            i10++;
        }
        long jI = this.f19427a.i(qVarArr, zArr, sVarArr2, zArr2, j10);
        long jN = n(jI, j10, this.f19432f);
        this.f19430d = (o() && s(jI, j10, qVarArr)) ? jN : -9223372036854775807L;
        for (int i11 = 0; i11 < sVarArr.length; i11++) {
            n8.s sVar2 = sVarArr2[i11];
            if (sVar2 == null) {
                this.f19429c[i11] = null;
            } else {
                a[] aVarArr2 = this.f19429c;
                a aVar2 = aVarArr2[i11];
                if (aVar2 == null || aVar2.f19434a != sVar2) {
                    aVarArr2[i11] = new a(sVar2);
                }
            }
            sVarArr[i11] = this.f19429c[i11];
        }
        return jN;
    }

    @Override // io.bidmachine.media3.exoplayer.source.q, io.bidmachine.media3.exoplayer.source.g0
    public boolean isLoading() {
        return this.f19427a.isLoading();
    }

    @Override // io.bidmachine.media3.exoplayer.source.q
    public long j(long j10) {
        this.f19430d = -9223372036854775807L;
        for (a aVar : this.f19429c) {
            if (aVar != null) {
                aVar.b();
            }
        }
        return n(this.f19427a.j(j10), this.f19431e, this.f19432f);
    }

    @Override // io.bidmachine.media3.exoplayer.source.q
    public long k() {
        if (o()) {
            long j10 = this.f19430d;
            this.f19430d = -9223372036854775807L;
            long jK = k();
            return jK != -9223372036854775807L ? jK : j10;
        }
        long jK2 = this.f19427a.k();
        if (jK2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return n(jK2, this.f19431e, this.f19432f);
    }

    @Override // io.bidmachine.media3.exoplayer.source.q
    public void l(q.a aVar, long j10) {
        this.f19428b = aVar;
        this.f19427a.l(this, j10);
    }

    boolean o() {
        return this.f19430d != -9223372036854775807L;
    }

    @Override // io.bidmachine.media3.exoplayer.source.g0.a
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void h(q qVar) {
        ((q.a) x7.a.e(this.f19428b)).h(this);
    }

    @Override // io.bidmachine.media3.exoplayer.source.q
    public void q() throws IOException {
        ClippingMediaSource.IllegalClippingException illegalClippingException = this.f19433g;
        if (illegalClippingException != null) {
            throw illegalClippingException;
        }
        this.f19427a.q();
    }

    public void r(ClippingMediaSource.IllegalClippingException illegalClippingException) {
        this.f19433g = illegalClippingException;
    }

    @Override // io.bidmachine.media3.exoplayer.source.q
    public n8.x t() {
        return this.f19427a.t();
    }

    @Override // io.bidmachine.media3.exoplayer.source.q
    public void u(long j10, boolean z10) {
        this.f19427a.u(j10, z10);
    }

    public void v(long j10, long j11) {
        this.f19431e = j10;
        this.f19432f = j11;
    }
}
