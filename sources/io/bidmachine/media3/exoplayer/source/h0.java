package io.bidmachine.media3.exoplayer.source;

import io.bidmachine.media3.decoder.DecoderInputBuffer;
import io.bidmachine.media3.exoplayer.k1;
import io.bidmachine.media3.exoplayer.upstream.Loader;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: SingleSampleMediaPeriod.java */
/* JADX INFO: loaded from: classes4.dex */
final class h0 implements q, Loader.b<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z7.g f19570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final z7.d.a f19571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final z7.o f19572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final io.bidmachine.media3.exoplayer.upstream.b f19573d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final s.a f19574e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final n8.x f19575f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ArrayList<b> f19576g = new ArrayList<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f19577h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final Loader f19578i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final u7.q f19579j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final boolean f19580k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    boolean f19581l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    byte[] f19582m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f19583n;

    /* JADX INFO: compiled from: SingleSampleMediaPeriod.java */
    private final class b implements n8.s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f19584a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f19585b;

        private b() {
        }

        private void b() {
            if (this.f19585b) {
                return;
            }
            h0.this.f19574e.j(u7.w.k(h0.this.f19579j.f26252o), h0.this.f19579j, 0, null, 0L);
            this.f19585b = true;
        }

        @Override // n8.s
        public void a() throws IOException {
            h0 h0Var = h0.this;
            if (h0Var.f19580k) {
                return;
            }
            h0Var.f19578i.a();
        }

        public void c() {
            if (this.f19584a == 2) {
                this.f19584a = 1;
            }
        }

        @Override // n8.s
        public int e(b8.u uVar, DecoderInputBuffer decoderInputBuffer, int i10) {
            b();
            h0 h0Var = h0.this;
            boolean z10 = h0Var.f19581l;
            if (z10 && h0Var.f19582m == null) {
                this.f19584a = 2;
            }
            int i11 = this.f19584a;
            if (i11 == 2) {
                decoderInputBuffer.e(4);
                return -4;
            }
            if ((i10 & 2) != 0 || i11 == 0) {
                uVar.f4168b = h0Var.f19579j;
                this.f19584a = 1;
                return -5;
            }
            if (!z10) {
                return -3;
            }
            x7.a.e(h0Var.f19582m);
            decoderInputBuffer.e(1);
            decoderInputBuffer.f18059f = 0L;
            if ((i10 & 4) == 0) {
                decoderInputBuffer.q(h0.this.f19583n);
                ByteBuffer byteBuffer = decoderInputBuffer.f18057d;
                h0 h0Var2 = h0.this;
                byteBuffer.put(h0Var2.f19582m, 0, h0Var2.f19583n);
            }
            if ((i10 & 1) == 0) {
                this.f19584a = 2;
            }
            return -4;
        }

        @Override // n8.s
        public boolean h() {
            return h0.this.f19581l;
        }

        @Override // n8.s
        public int r(long j10) {
            b();
            if (j10 <= 0 || this.f19584a == 2) {
                return 0;
            }
            this.f19584a = 2;
            return 1;
        }
    }

    public h0(z7.g gVar, z7.d.a aVar, z7.o oVar, u7.q qVar, long j10, io.bidmachine.media3.exoplayer.upstream.b bVar, s.a aVar2, boolean z10, s8.a aVar3) {
        this.f19570a = gVar;
        this.f19571b = aVar;
        this.f19572c = oVar;
        this.f19579j = qVar;
        this.f19577h = j10;
        this.f19573d = bVar;
        this.f19574e = aVar2;
        this.f19580k = z10;
        this.f19575f = new n8.x(new u7.e0(qVar));
        this.f19578i = aVar3 != null ? new Loader(aVar3) : new Loader("SingleSampleMediaPeriod");
    }

    @Override // io.bidmachine.media3.exoplayer.source.q, io.bidmachine.media3.exoplayer.source.g0
    public long b() {
        return (this.f19581l || this.f19578i.j()) ? Long.MIN_VALUE : 0L;
    }

    @Override // io.bidmachine.media3.exoplayer.source.q, io.bidmachine.media3.exoplayer.source.g0
    public boolean c(k1 k1Var) {
        if (this.f19581l || this.f19578i.j() || this.f19578i.i()) {
            return false;
        }
        z7.d dVarA = this.f19571b.a();
        z7.o oVar = this.f19572c;
        if (oVar != null) {
            dVarA.a(oVar);
        }
        this.f19578i.n(new c(this.f19570a, dVarA), this, this.f19573d.a(1));
        return true;
    }

    @Override // io.bidmachine.media3.exoplayer.upstream.Loader.b
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void o(c cVar, long j10, long j11, boolean z10) {
        z7.n nVar = cVar.f19589c;
        n8.i iVar = new n8.i(cVar.f19587a, cVar.f19588b, nVar.p(), nVar.q(), j10, j11, nVar.o());
        this.f19573d.d(cVar.f19587a);
        this.f19574e.t(iVar, 1, -1, null, 0, null, 0L, this.f19577h);
    }

    @Override // io.bidmachine.media3.exoplayer.source.q, io.bidmachine.media3.exoplayer.source.g0
    public long f() {
        return this.f19581l ? Long.MIN_VALUE : 0L;
    }

    @Override // io.bidmachine.media3.exoplayer.upstream.Loader.b
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void m(c cVar, long j10, long j11) {
        this.f19583n = (int) cVar.f19589c.o();
        this.f19582m = (byte[]) x7.a.e(cVar.f19590d);
        this.f19581l = true;
        z7.n nVar = cVar.f19589c;
        n8.i iVar = new n8.i(cVar.f19587a, cVar.f19588b, nVar.p(), nVar.q(), j10, j11, this.f19583n);
        this.f19573d.d(cVar.f19587a);
        this.f19574e.w(iVar, 1, -1, this.f19579j, 0, null, 0L, this.f19577h);
    }

    @Override // io.bidmachine.media3.exoplayer.source.q
    public long i(q8.q[] qVarArr, boolean[] zArr, n8.s[] sVarArr, boolean[] zArr2, long j10) {
        for (int i10 = 0; i10 < qVarArr.length; i10++) {
            n8.s sVar = sVarArr[i10];
            if (sVar != null && (qVarArr[i10] == null || !zArr[i10])) {
                this.f19576g.remove(sVar);
                sVarArr[i10] = null;
            }
            if (sVarArr[i10] == null && qVarArr[i10] != null) {
                b bVar = new b();
                this.f19576g.add(bVar);
                sVarArr[i10] = bVar;
                zArr2[i10] = true;
            }
        }
        return j10;
    }

    @Override // io.bidmachine.media3.exoplayer.source.q, io.bidmachine.media3.exoplayer.source.g0
    public boolean isLoading() {
        return this.f19578i.j();
    }

    @Override // io.bidmachine.media3.exoplayer.source.q
    public long j(long j10) {
        for (int i10 = 0; i10 < this.f19576g.size(); i10++) {
            this.f19576g.get(i10).c();
        }
        return j10;
    }

    @Override // io.bidmachine.media3.exoplayer.source.q
    public long k() {
        return -9223372036854775807L;
    }

    @Override // io.bidmachine.media3.exoplayer.source.q
    public void l(q.a aVar, long j10) {
        aVar.e(this);
    }

    @Override // io.bidmachine.media3.exoplayer.upstream.Loader.b
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public Loader.c s(c cVar, long j10, long j11, IOException iOException, int i10) {
        Loader.c cVarH;
        z7.n nVar = cVar.f19589c;
        n8.i iVar = new n8.i(cVar.f19587a, cVar.f19588b, nVar.p(), nVar.q(), j10, j11, nVar.o());
        long jC = this.f19573d.c(new io.bidmachine.media3.exoplayer.upstream.b.c(iVar, new n8.j(1, -1, this.f19579j, 0, null, 0L, x7.l0.t1(this.f19577h)), iOException, i10));
        boolean z10 = jC == -9223372036854775807L || i10 >= this.f19573d.a(1);
        if (this.f19580k && z10) {
            x7.r.i("SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.", iOException);
            this.f19581l = true;
            cVarH = Loader.f19788f;
        } else {
            cVarH = jC != -9223372036854775807L ? Loader.h(false, jC) : Loader.f19789g;
        }
        Loader.c cVar2 = cVarH;
        boolean z11 = !cVar2.c();
        this.f19574e.y(iVar, 1, -1, this.f19579j, 0, null, 0L, this.f19577h, iOException, z11);
        if (z11) {
            this.f19573d.d(cVar.f19587a);
        }
        return cVar2;
    }

    @Override // io.bidmachine.media3.exoplayer.upstream.Loader.b
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public void n(c cVar, long j10, long j11, int i10) {
        z7.n nVar = cVar.f19589c;
        this.f19574e.C(i10 == 0 ? new n8.i(cVar.f19587a, cVar.f19588b, j10) : new n8.i(cVar.f19587a, cVar.f19588b, nVar.p(), nVar.q(), j10, j11, nVar.o()), 1, -1, this.f19579j, 0, null, 0L, this.f19577h, i10);
    }

    @Override // io.bidmachine.media3.exoplayer.source.q
    public n8.x t() {
        return this.f19575f;
    }

    public void v() {
        this.f19578i.l();
    }

    /* JADX INFO: compiled from: SingleSampleMediaPeriod.java */
    static final class c implements Loader.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f19587a = n8.i.a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final z7.g f19588b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final z7.n f19589c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte[] f19590d;

        public c(z7.g gVar, z7.d dVar) {
            this.f19588b = gVar;
            this.f19589c = new z7.n(dVar);
        }

        @Override // io.bidmachine.media3.exoplayer.upstream.Loader.e
        public void load() throws IOException {
            this.f19589c.r();
            try {
                this.f19589c.i(this.f19588b);
                int i10 = 0;
                while (i10 != -1) {
                    int iO = (int) this.f19589c.o();
                    byte[] bArr = this.f19590d;
                    if (bArr == null) {
                        this.f19590d = new byte[1024];
                    } else if (iO == bArr.length) {
                        this.f19590d = Arrays.copyOf(bArr, bArr.length * 2);
                    }
                    z7.n nVar = this.f19589c;
                    byte[] bArr2 = this.f19590d;
                    i10 = nVar.read(bArr2, iO, bArr2.length - iO);
                }
            } finally {
                z7.f.a(this.f19589c);
            }
        }

        @Override // io.bidmachine.media3.exoplayer.upstream.Loader.e
        public void b() {
        }
    }

    @Override // io.bidmachine.media3.exoplayer.source.q
    public void q() {
    }

    @Override // io.bidmachine.media3.exoplayer.source.q, io.bidmachine.media3.exoplayer.source.g0
    public void g(long j10) {
    }

    @Override // io.bidmachine.media3.exoplayer.source.q
    public long d(long j10, b8.a0 a0Var) {
        return j10;
    }

    @Override // io.bidmachine.media3.exoplayer.source.q
    public void u(long j10, boolean z10) {
    }
}
