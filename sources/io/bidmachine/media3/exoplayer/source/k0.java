package io.bidmachine.media3.exoplayer.source;

import io.bidmachine.media3.decoder.DecoderInputBuffer;
import io.bidmachine.media3.exoplayer.k1;
import java.io.IOException;

/* JADX INFO: compiled from: TimeOffsetMediaPeriod.java */
/* JADX INFO: loaded from: classes4.dex */
final class k0 implements q, q.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q f19644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f19645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private q.a f19646c;

    /* JADX INFO: compiled from: TimeOffsetMediaPeriod.java */
    private static final class a implements n8.s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final n8.s f19647a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f19648b;

        public a(n8.s sVar, long j10) {
            this.f19647a = sVar;
            this.f19648b = j10;
        }

        @Override // n8.s
        public void a() throws IOException {
            this.f19647a.a();
        }

        public n8.s b() {
            return this.f19647a;
        }

        @Override // n8.s
        public int e(b8.u uVar, DecoderInputBuffer decoderInputBuffer, int i10) {
            int iE = this.f19647a.e(uVar, decoderInputBuffer, i10);
            if (iE == -4) {
                decoderInputBuffer.f18059f += this.f19648b;
            }
            return iE;
        }

        @Override // n8.s
        public boolean h() {
            return this.f19647a.h();
        }

        @Override // n8.s
        public int r(long j10) {
            return this.f19647a.r(j10 - this.f19648b);
        }
    }

    public k0(q qVar, long j10) {
        this.f19644a = qVar;
        this.f19645b = j10;
    }

    public q a() {
        return this.f19644a;
    }

    @Override // io.bidmachine.media3.exoplayer.source.q, io.bidmachine.media3.exoplayer.source.g0
    public long b() {
        long jB = this.f19644a.b();
        if (jB == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return this.f19645b + jB;
    }

    @Override // io.bidmachine.media3.exoplayer.source.q, io.bidmachine.media3.exoplayer.source.g0
    public boolean c(k1 k1Var) {
        return this.f19644a.c(k1Var.a().f(k1Var.f19124a - this.f19645b).d());
    }

    @Override // io.bidmachine.media3.exoplayer.source.q
    public long d(long j10, b8.a0 a0Var) {
        return this.f19644a.d(j10 - this.f19645b, a0Var) + this.f19645b;
    }

    @Override // io.bidmachine.media3.exoplayer.source.q.a
    public void e(q qVar) {
        ((q.a) x7.a.e(this.f19646c)).e(this);
    }

    @Override // io.bidmachine.media3.exoplayer.source.q, io.bidmachine.media3.exoplayer.source.g0
    public long f() {
        long jF = this.f19644a.f();
        if (jF == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return this.f19645b + jF;
    }

    @Override // io.bidmachine.media3.exoplayer.source.q, io.bidmachine.media3.exoplayer.source.g0
    public void g(long j10) {
        this.f19644a.g(j10 - this.f19645b);
    }

    @Override // io.bidmachine.media3.exoplayer.source.q
    public long i(q8.q[] qVarArr, boolean[] zArr, n8.s[] sVarArr, boolean[] zArr2, long j10) {
        n8.s[] sVarArr2 = new n8.s[sVarArr.length];
        int i10 = 0;
        while (true) {
            n8.s sVarB = null;
            if (i10 >= sVarArr.length) {
                break;
            }
            a aVar = (a) sVarArr[i10];
            if (aVar != null) {
                sVarB = aVar.b();
            }
            sVarArr2[i10] = sVarB;
            i10++;
        }
        long jI = this.f19644a.i(qVarArr, zArr, sVarArr2, zArr2, j10 - this.f19645b);
        for (int i11 = 0; i11 < sVarArr.length; i11++) {
            n8.s sVar = sVarArr2[i11];
            if (sVar == null) {
                sVarArr[i11] = null;
            } else {
                n8.s sVar2 = sVarArr[i11];
                if (sVar2 == null || ((a) sVar2).b() != sVar) {
                    sVarArr[i11] = new a(sVar, this.f19645b);
                }
            }
        }
        return jI + this.f19645b;
    }

    @Override // io.bidmachine.media3.exoplayer.source.q, io.bidmachine.media3.exoplayer.source.g0
    public boolean isLoading() {
        return this.f19644a.isLoading();
    }

    @Override // io.bidmachine.media3.exoplayer.source.q
    public long j(long j10) {
        return this.f19644a.j(j10 - this.f19645b) + this.f19645b;
    }

    @Override // io.bidmachine.media3.exoplayer.source.q
    public long k() {
        long jK = this.f19644a.k();
        if (jK == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.f19645b + jK;
    }

    @Override // io.bidmachine.media3.exoplayer.source.q
    public void l(q.a aVar, long j10) {
        this.f19646c = aVar;
        this.f19644a.l(this, j10 - this.f19645b);
    }

    @Override // io.bidmachine.media3.exoplayer.source.g0.a
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void h(q qVar) {
        ((q.a) x7.a.e(this.f19646c)).h(this);
    }

    @Override // io.bidmachine.media3.exoplayer.source.q
    public void q() throws IOException {
        this.f19644a.q();
    }

    @Override // io.bidmachine.media3.exoplayer.source.q
    public n8.x t() {
        return this.f19644a.t();
    }

    @Override // io.bidmachine.media3.exoplayer.source.q
    public void u(long j10, boolean z10) {
        this.f19644a.u(j10 - this.f19645b, z10);
    }
}
